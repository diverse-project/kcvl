package fr.inria.diverse.kcvl.interpreter

import com.thales.movida.derivation.service.SemanticDeleteOfObject
import fr.inria.diverse.kcvl.fd2assets.BinCondition
import fr.inria.diverse.kcvl.fd2assets.BinExpression
import fr.inria.diverse.kcvl.fd2assets.CompareOperator
import fr.inria.diverse.kcvl.fd2assets.ConditionExpression
import fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage
import fr.inria.diverse.kcvl.fd2assets.HasChoice
import fr.inria.diverse.kcvl.fd2assets.Operator
import fr.inria.diverse.kcvl.fd2assets.RestrictionRule
import fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset
import fr.inria.diverse.kcvl.fd2assets.UnaryExpression
import fr.inria.diverse.kcvl.fd2assets.UnaryOperator
import groovy.lang.Binding
import groovy.lang.GroovyShell
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage$Registry
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.Property
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.omg.CVLMetamodelMaster.cvl.Choice
import org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion
import org.omg.CVLMetamodelMaster.cvl.ChoiceVariationPoint
import org.omg.CVLMetamodelMaster.cvl.CompositeVariationPoint
import org.omg.CVLMetamodelMaster.cvl.ConfigurableUnit
import org.omg.CVLMetamodelMaster.cvl.FragmentSubstitution
import org.omg.CVLMetamodelMaster.cvl.LinkAssignment
import org.omg.CVLMetamodelMaster.cvl.LinkExistence
import org.omg.CVLMetamodelMaster.cvl.ObjectExistence
import org.omg.CVLMetamodelMaster.cvl.ObjectSubstitution
import org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint
import org.omg.CVLMetamodelMaster.cvl.ParametricSlotAssignmet
import org.omg.CVLMetamodelMaster.cvl.ParametricVariationPoint
import org.omg.CVLMetamodelMaster.cvl.PatternFusion
import org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification
import org.omg.CVLMetamodelMaster.cvl.StructuralOrganisationalPattern
import org.omg.CVLMetamodelMaster.cvl.VClassifier
import org.omg.CVLMetamodelMaster.cvl.VConfiguration
import org.omg.CVLMetamodelMaster.cvl.VInstance
import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment
import org.omg.CVLMetamodelMaster.cvl.VariationPoint
import org.varymde.CvlmappingvaribilitychoiceStandaloneSetup

import static extension org.eclipse.xtext.xbase.lib.BooleanExtensions.*
import org.omg.CVLMetamodelMaster.cvl.PatternIntegration
import org.omg.CVLMetamodelMaster.cvl.PatternIntegration
import org.omg.CVLMetamodelMaster.cvl.SlotAssignment
import org.omg.CVLMetamodelMaster.cvl.SlotValueExistence

/**
 * Derive a target product starting from a root VPackage
 * Uses @Context as context provider during derivation
 * Requires a @PatternIntegration implementation for patterns
 */
class Derivator
{
	@Property
	SemanticDeleteOfObject semanticDelete
	@Property
	fr.inria.diverse.kcvl.interpreter.PatternIntegration patternIntegration
	@Property
	ResourceSet resourceSet
	@Property
	Context ctx = new Context
	@Property
	List<Context> ctxs = newArrayList
	@Property
	List<EObject> toRemove = newArrayList
	@Property
	List<EObject> notSelected = newArrayList
	@Property
	List<Resource> domainResources = newArrayList
	@Property
	List<EObject> roots = newArrayList

	def void start(VPackage o) {
		ctxs.add(ctx)
		populateChoiceResolution(o)

		if (!checkChoiceResolution) {
			println("No choice resolution in the CVL model")
			return
		}

		println("Number of choices resolved to true: " + ctx.selectedChoices.size)
		println("Number of choices resolved to false: " + ctx.unselectedChoices.size)

		ctxs.forEach[ctx |
			findBinding(o)

			println("Number of realizations resolved to true: " + ctx.selectedVPs.size)
			println("Number of realizations resolved to false: " + ctx.unselectedVPs.size)

			ctx.unselectedVPs
				.filter[it instanceof ObjectExistence || it instanceof LinkExistence]
				.forEach[it.executeDerivation]
			ctx.selectedVPs
				.filter[!(it instanceof ObjectExistence || it instanceof LinkExistence)]
				.forEach[it.executeDerivation]
		]

		notSelected.forEach[
			val r = it.findRoot
			
			if (!roots.contains(r))
				roots.add(r)
		]

		roots.forEach[domainResources.add(eResource)]
		roots.forEach[it.substituteObject]
		roots.forEach[it.removeObject]

		if (semanticDelete == null) {
			roots.forEach[it.fixReference]
			toRemove.forEach[EcoreUtil::delete(it)]
			ctx.objectSubstitutions.keySet.forEach[EcoreUtil::delete(it)]
		}
		else
			toRemove.forEach[semanticDelete.delete(it)]
	}

	def private dispatch void populateChoiceResolution(VPackage o) {
		o.packageElement.forEach[it.populateChoiceResolution]
	}

	def private dispatch void populateChoiceResolution(VInstance o) {
		val oldCtx = ctx
		ctx = new Context
		ctxs.add(ctx)
		o.child.forEach[it.populateChoiceResolution]
		ctx = oldCtx
	}

	def private dispatch void populateChoiceResolution(ChoiceResolutuion o) {
		if (o.decision) {
			ctx.selectedChoices.add(o.resolvedChoice)
			ctx.currentChoice = o.resolvedChoice
		} else {
			ctx.unselectedChoices.add(o.resolvedChoice)
		}
	}

	def private dispatch void populateChoiceResolution(VConfiguration o) {
		o.member.forEach[it.populateChoiceResolution]
	}

	def private dispatch void populateChoiceResolution(VariableValueAssignment o) {
		val variableContainer = o.resolvedVariable.eContainer as Choice
		ctx.choiceParameter.put(o.resolvedVariable, o)

		if (variableContainer != null)
			if (ctx.choiceParameterC.containsKey(variableContainer))
				ctx.choiceParameterC.get(variableContainer).add(o.resolvedVariable)
			else
				ctx.choiceParameterC.put(variableContainer, Collections::singletonList(o.resolvedVariable))
	}

	def private void findBinding(EObject o) {
		switch o {
			VPackage: {
				o.packageElement.forEach[it.findBinding]
			}
			VClassifier: {
				o.child.forEach[it.findBinding]
			}
			ConfigurableUnit: {
				o.ownedVariationPoint.forEach[it.findBinding]
			}
			ChoiceVariationPoint: {
				val bind = o.bindingChoice
				val exp = o.mappingExpression
				
				if (
					   bind != null && !bind.empty && ctx.selectedChoices.containsAll(bind)
					&& (exp == null || exp == "")
				)
					ctx.selectedVPs.add(o)
				else if (
					   ctx.unselectedChoices.containsAll(bind)
					&& (exp == null || exp == "")
				)
					ctx.unselectedVPs.add(o)
				else if (exp != null && exp != "") {
					val temp = File::createTempFile(o.name, ".cvlmappingvaribilitychoice")
					val stream = new FileOutputStream(temp)
					val pr = new PrintWriter(stream)
					
					pr.write('''
						«o.name» {
							«o.name» : «exp»
						}
					''')
					
					pr.flush
					pr.close
					stream.close
					
					if (resourceSet == null) {
						val injector = new CvlmappingvaribilitychoiceStandaloneSetup().createInjectorAndDoEMFRegistration
						
						if (!EPackage$Registry::INSTANCE.containsKey(Fd2assetsPackage::eINSTANCE.nsURI))
							EPackage$Registry::INSTANCE.put(Fd2assetsPackage::eINSTANCE.nsURI, Fd2assetsPackage::eINSTANCE)
						
						val factory = injector.getInstance(typeof(IResourceFactory))
						val provider = injector.getInstance(typeof(IResourceServiceProvider))
						
						Resource$Factory$Registry::INSTANCE.extensionToFactoryMap.put("cvlmappingvaribilitychoice", factory)
						IResourceServiceProvider$Registry::INSTANCE.extensionToFactoryMap.put("CM", provider)
						
						resourceSet = injector.getInstance(typeof(XtextResourceSet))
					}
					
					val uri = URI::createFileURI(temp.absolutePath)
					val res = resourceSet.getResource(uri, true)
					
					EcoreUtil::resolveAll(res)
					
					if (evaluateHasChoiceExpression(res.contents.head, true))
						ctx.selectedVPs.add(o)
					else
						ctx.unselectedVPs.add(o)
				}
			}
			ParametricVariationPoint: {
				if (
					   o.bindingVariable.eContainer instanceof Choice
					&& ctx.selectedChoices.contains(o.bindingVariable.eContainer as Choice)
				)
					ctx.selectedVPs.add(o)
			}
		}
	}

	def private boolean evaluateHasChoiceExpression(EObject o, boolean result) {
		return switch o {
			RestrictionRuleset: {
				o.rule.forall[evaluateHasChoiceExpression(it, result)]
			}
			RestrictionRule: {
				evaluateHasChoiceExpression(o.expression, result)
			}
			BinExpression: {
				switch o.op.value {
					case Operator::OR.value:
						evaluateHasChoiceExpression(o.left, result) || evaluateHasChoiceExpression(o.right, result)
					case Operator::XOR.value:
						xor(evaluateHasChoiceExpression(o.left, result), evaluateHasChoiceExpression(o.right, result))
					case Operator::AND.value:
						evaluateHasChoiceExpression(o.left, result) && evaluateHasChoiceExpression(o.right, result)
					default: false
				}
			}
			UnaryExpression: {
				if (o.op.value == UnaryOperator::NOT.value)
					!evaluateHasChoiceExpression(o.left, result)
				else
					evaluateHasChoiceExpression(o.left, result)
			}
			HasChoice: {
				if (o.condition != null) evaluateHasChoiceExpression(o.condition, true) else true
				&& ctxs.exists[selectedChoices.exists[name == o.choiceName]]
			}
			BinCondition: {
				switch o.op.value {
					case Operator::OR.value:
						evaluateHasChoiceExpression(o.left, result) || evaluateHasChoiceExpression(o.right, result)
					case Operator::XOR.value:
						xor(evaluateHasChoiceExpression(o.left, result), evaluateHasChoiceExpression(o.right, result))
					case Operator::AND.value:
						evaluateHasChoiceExpression(o.left, result) && evaluateHasChoiceExpression(o.right, result)
					default: false
				}
			}
			ConditionExpression: {
				var vlist = ctx.choiceParameter.keySet.filter[name == o.featureAttibuteName]
	
				if (!vlist.empty) {
					val valuespec = ctx.choiceParameter.get(vlist.take(0)).value as PrimitiveValueSpecification
					val typename = valuespec.type.name

					if ("int".equalsIgnoreCase(typename) || "integer".equalsIgnoreCase(typename)) {
						val value = Integer::parseInt(valuespec.value)
						val value1 = Integer::parseInt(o.value)
						
						switch o.op.value {
							case CompareOperator::EQ.value:
								value == value1
							case CompareOperator::INF.value:
								value1 < value
							case CompareOperator::INFEQ.value:
								value1 <= value
							case CompareOperator::SUP.value:
								value1 > value
							case CompareOperator::SUPEQ.value:
								value1 >= value
						}
					} else {
						var value = valuespec.value
						var value1 = o.value
						
						switch o.op.value {
							case CompareOperator::EQ.value:
								value1.equals(value)
							case CompareOperator::INF.value:
								value1.compareTo(value) < 0
							case CompareOperator::INFEQ.value:
								value1.compareTo(value) <= 0
							case CompareOperator::SUP.value:
								value1.compareTo(value) > 0
							case CompareOperator::SUPEQ.value:
								value1.compareTo(value) >= 0
						}
					}
				}
			}
			default: result
		}
	}

	def private void executeDerivation(VariationPoint o) {
		switch o {
			ObjectExistence: {
				o.optionalObject.forEach[notSelected.add(reference)]
			}
			SlotAssignment: {
				if (o.value instanceof PrimitiveValueSpecification) {
					val obj = o.slotOwner.reference
					val valueSpec = o.value as PrimitiveValueSpecification
					val feature = obj.eClass.EAllStructuralFeatures.findFirst[name.toLowerCase == o.slotIdentifier.toLowerCase]
					val valueToSet =
						switch valueSpec.type.name {
							case "Integer": Integer::parseInt(valueSpec.value.trim)
							case "Boolean": Boolean::parseBoolean(valueSpec.value.trim)
							case "Real": Double::parseDouble(valueSpec.value.trim)
							case "String": valueSpec.value
							default: valueSpec.value
						}
					
					if (feature != null)
						obj.eSet(feature, valueToSet)
				}
			}
			SlotValueExistence: {
				val obj = o.slotOwner.reference
				val feature = obj.eClass.EAllStructuralFeatures.findFirst[name.toLowerCase == o.slotIdentifier.toLowerCase]
				
				if (feature != null)
					if (feature.unsettable)
						obj.eUnset(feature)
					else
						obj.eSet(feature, null)
			}
			ParametricSlotAssignmet: {
				val obj = o.slotOwner.reference

				if (
					   !obj.eClass.EAllStructuralFeatures.empty
					&& ctx.choiceParameter.get(o.bindingVariable).value instanceof PrimitiveValueSpecification
				) {
					val valueSpec = ctx.choiceParameter.get(o.bindingVariable) as PrimitiveValueSpecification
					val feature = obj.eClass.EAllStructuralFeatures.findFirst[name.toLowerCase == o.slotIdentifier.toLowerCase]
					val valueToSet =
						switch valueSpec.type.name {
							case "Integer": Integer::parseInt(valueSpec.value.trim)
							case "Boolean": Boolean::parseBoolean(valueSpec.value.trim)
							case "Real": Double::parseDouble(valueSpec.value.trim)
							case "String": valueSpec.value
							default: valueSpec.value
						}
					
					if (feature != null)
						obj.eSet(feature, valueToSet)
				}
			}
			ObjectSubstitution: {
				ctx.objectSubstitutions.put(o.placementObject.reference, o.replacementObject.reference)
			}
			org.omg.CVLMetamodelMaster.cvl.PatternIntegration: {
				val map = new ArrayList<Pair<EObject, EObject>>
				
				o.substitutes.forEach[
					map.add(new Pair(placementObject.reference, replacementObject.reference))
					domainResources.add(replacementObject.reference.findRoot.eResource)
				]
				
				if (patternIntegration != null) {
					patternIntegration.includePattern(map)
					map.clear
				}
			}
			PatternFusion: {
				val map = new ArrayList<Pair<EObject, EObject>>
				
				o.substitutes.forEach[
					map.add(new Pair(placementObject.reference, replacementObject.reference))
					domainResources.add(replacementObject.reference.findRoot.eResource)
				]
				
				if (patternIntegration != null) {
					patternIntegration.fusionPattern(map)
					map.clear
				}
			}
			StructuralOrganisationalPattern: {
				val map = new ArrayList<Pair<EObject, EObject>>
				
				o.substitutes.forEach[
					map.add(new Pair(placementObject.reference, replacementObject.reference))
					domainResources.add(replacementObject.reference.findRoot.eResource)
				]
				
				if (patternIntegration != null) {
					patternIntegration.applyStructuralOrganisationalPattern(map)
					map.clear
				}
			}
			FragmentSubstitution: {
				// TODO: FragmentSubstitution
			}
			LinkExistence: {
				notSelected.add(o.optionalLink.reference)
			}
			LinkAssignment: {
				val obj = o.link.reference
				val name =
					if (o.link.MOFRef.contains(":")) o.link.MOFRef.split(":").head
					else o.link.MOFRef
				
				val struct = obj.eClass.EAllStructuralFeatures.findFirst[f | f.name == name]
				
				if (struct != null)
					obj.eSet(struct, o.newEnd.reference)
			}
			CompositeVariationPoint: {
				o.children.forEach[it.executeDerivation]
			}
			OpaqueVariationPoint: {
				val binding = new Binding
				val ctx_ = new ArrayList<EObject>
				val args = new HashMap<String, Object>
				
				o.sourceObject.forEach[ctx_.add(reference)]
				
				if (!o.bindingChoice.empty) {
					val choice = o.bindingChoice.head
					val vars = ctx.choiceParameterC.get(choice)
					
					vars.forEach[v |
						val varAssignment = if (v != null) ctx.choiceParameter.get(v) else null
						
						if (varAssignment != null && varAssignment.value instanceof PrimitiveValueSpecification) {
							val valueSpec = varAssignment.value as PrimitiveValueSpecification
							val valueToSet =
								switch valueSpec.type.name {
									case "Integer": Integer::parseInt(valueSpec.value.trim)
									case "Boolean": Boolean::parseBoolean(valueSpec.value.trim)
									case "Real": Double::parseDouble(valueSpec.value.trim)
									case "String": valueSpec.value
									default: valueSpec.value
								}
							
							args.put(v.name, valueToSet)
						}
					]
				}
				
				binding.setVariable("ctx", ctx_)
				binding.setVariable("args", args)
				binding.setVariable("notSelected", notSelected)
				
				val shell = new GroovyShell(binding)
				shell.evaluate(o.expression)
				// TODO: We do nothing with the result?!
			}
		}
	}
	
	// TODO: Implement me?
	def private Object evalExpression(EObject o, VPackage root, ChoiceResolutuion parent) {
		return null
	}

	def void substituteObject(EObject obj) {
	    if (obj != null) {
	      val List<EStructuralFeature> props  = new ArrayList<EStructuralFeature>()
	     
	      
	      
	      props.addAll(
	        obj.eClass().getEAllReferences().filter[prop |  prop.isContainment() ])
	      props.forEach[prop | 
	        var o = obj.eGet(prop as EStructuralFeature, true)
	        if ((prop as EStructuralFeature).isMany) {
	          var List<? extends  EObject> col = o as List<? extends  EObject>
	          var it1 = 0
	          while (it1 < col.size())
	          {
	            
	            this.substituteObject(col.get(it1) as EObject)
	            it1=it1+1
	          }
	        } else {
	        	if (o instanceof EObject)
		          substituteObject(o as EObject)
	        }
	        
	      ]
	      
	      props.clear
	      
	      props.addAll(obj.eClass().getEAllStructuralFeatures().filter[prop | !prop.isDerived() && !prop.isTransient()])
	     props.forEach[prop | 
	        val o = obj.eGet(prop as EStructuralFeature, true)
	        if ((prop as EStructuralFeature).isMany) {
	          val  List<EObject> col =  new ArrayList< EObject>()
	          col.addAll(o as List<? extends  EObject>)
	          if (col != null) {
	            val colleToRemove = new ArrayList< EObject>()
	            col.forEach[o1 | 
	              if (ctx.objectSubstitutions.keySet().exists[objtoremove | objtoremove.equals(o1)]) {
	                colleToRemove.add(o1) 
	              }
	            ]
	            
	            colleToRemove.forEach[EObject element |  col.remove(element); col.add(ctx.objectSubstitutions.get(element)) ]
	
	            //else
	            //	stdio.writeln("col est nulle " + o.toString)
	          
	        } else {
	          if (ctx.objectSubstitutions.keySet().exists[objtoremove |  objtoremove.equals(o) ]) {
	            obj.eSet(prop as EStructuralFeature, ctx.objectSubstitutions.get(o))
	          }
	        }
	      
	      }
	      ]
	      
	      }
	}       
  

  def void fixReference(EObject obj)  {
    if (obj != null) {
      val  List<EStructuralFeature> props1 = new ArrayList<EStructuralFeature>
      props1.addAll(
        obj.eClass().getEAllReferences().filter(prop | { prop.isContainment().booleanValue() }))
        
      val  it_1 = props1.iterator()
      while (it_1.hasNext()){
      val prop = it_1.next()
        var o = obj.eGet(prop as EStructuralFeature, true)
        if ((prop as EStructuralFeature).isMany) {
          val col = o as List<EObject>
          //val  it1 = col.iterator()
         var it1 = 0
          while (it1 < col.size()){
        	 
        	 val o1 = col.get(it1)
        	 this.fixReference(o1 as EObject)
        	 it1=it1+1
          }
        } else {
          //if (domainResource.getContents.contains(o))
          fixReference(o as EObject)
        }
      }
      val props2 = obj.eClass().getEAllStructuralFeatures().filter(prop | !prop.isDerived() && !prop.isTransient())
      props2.forEach(prop | {
        val o = obj.eGet(prop as EStructuralFeature, true)
        if ((prop as EStructuralFeature).isMany) {
          val col =  o as List<EObject>
          if (col != null) {
            val colleToRemove = new ArrayList<EObject>
            col.forEach(o1 | {
              if (toRemove.exists(objtoremove | objtoremove.equals(o1))) {
                colleToRemove.add(o1 as EObject)
              }
            })
                    colleToRemove.forEach(EObject element | col.remove(element))
            //else
            //	stdio.writeln("col est nulle " + o.toString)
          }
        } else {
          if (toRemove.exists(objtoremove | { objtoremove.equals(o) })) {
            obj.eSet(prop as EStructuralFeature, null)
          }
        }
      })
    }
  }

  def boolean isNotSelected(EObject obj ) {

    return notSelected.contains(obj)

  }

  def void removeObject(EObject obj) {
       // stdio.writeln("removeObject begin : " + obj.toString())
    if (this.isNotSelected(obj)) {
      if (this.semanticDelete == null)
        this.removeObjectandAllContaining(obj as EObject)
      else{
      	//println("class to reomve 1  " + obj)
        toRemove.add(obj)       
      }
    } else {
      var  props = obj.eClass.getEAllReferences().filter[prop | prop.isContainment()]
      props.forEach[prop | 
        var Object o = obj.eGet(prop, true)
        if (prop.isMany) {
          var col = o as List<EObject>
          if (col != null) {
            col.forEach(o1 |{
              //if (domainResource.getContents.contains(o1)){ 
              //println("toto " + prop.getName() + " "+   o.toString() + " " +o1.asInstanceOf[EObject].toString())
              this.removeObject(o1 as EObject)} //}
              )
          }
        } else {
          //				if (  domainResource.getContents.contains(o)){
          if (o instanceof EObject)
            this.removeObject(o as EObject)
          //else
          // println("bizarre for "+ prop.getName() + " " + o)
          //				}
        }
      ]

    }

  }

  def void removeObjectandAllContaining(EObject obj)  {
    //println("remove  " + obj )
    var  Iterable<EReference> props = null
    if (obj != null) {
      props = obj.eClass().getEAllReferences().filter[prop |  prop.isContainment() ]
      props.forEach(prop | {
        var Object o = obj.eGet(prop, true)
        if (prop.isMany()) {
          var col = o as List<EObject>
          if (col != null) {
            col.forEach(o1 |
              this.removeObjectandAllContaining(o1))
          }
        } else {
          this.removeObjectandAllContaining(o as EObject)
        }

      })
      if (domainResources.contains(obj.eResource())) {
        //stdio.writeln("remove from resource" + obj.toString)
        //println("class to reomve 2  " + obj)
        
        toRemove.add(obj)
      } else {
        println("removeObjectandAllContaining : Object " + obj.toString() + " not contained")
      }
    }
  }

	def void foo(){
		var Object v = "p"
		var l = v as String
	}

	def private EObject findRoot(EObject e) {
		return
			if (e.eContainer == null || e.eContainer instanceof Resource)
				e
			else
				findRoot(e.eContainer)
	}
	
	def private boolean checkChoiceResolution() {
		return !ctx.selectedChoices.empty || !ctx.unselectedChoices.empty
	}
}

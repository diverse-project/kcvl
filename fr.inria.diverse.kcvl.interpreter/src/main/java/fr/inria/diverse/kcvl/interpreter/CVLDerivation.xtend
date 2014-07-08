package fr.inria.diverse.kcvl.interpreter

import com.thales.movida.derivation.service.SemanticDeleteOfObject
import fd2assets.BinCondition
import fd2assets.BinExpression
import fd2assets.CompareOperator
import fd2assets.ConditionExpression
import fd2assets.Fd2assetsPackage
import fd2assets.HasChoice
import fd2assets.Operator
import fd2assets.RestrictionRule
import fd2assets.RestrictionRuleset
import fd2assets.UnaryExpression
import fd2assets.UnaryOperator
import groovy.lang.Binding
import groovy.lang.GroovyShell
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
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
import org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification
import org.omg.CVLMetamodelMaster.cvl.VClassifier
import org.omg.CVLMetamodelMaster.cvl.VConfiguration
import org.omg.CVLMetamodelMaster.cvl.VInstance
import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.omg.CVLMetamodelMaster.cvl.Variable
import org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment
import org.omg.CVLMetamodelMaster.cvl.VariationPoint
import org.varymde.CvlmappingvaribilitychoiceStandaloneSetup

import static org.eclipse.xtext.xbase.lib.BooleanExtensions.*
import org.omg.CVLMetamodelMaster.cvl.PatternIntegration
import org.omg.CVLMetamodelMaster.cvl.PatternFusion
import org.omg.CVLMetamodelMaster.cvl.StructuralOrganisationalPattern

/**
 * class used to pass the context during the derivation. 
 * Can be put in a Stack for the VClassifier
 */
public class Derivator {

	


	@Property
	var SemanticDeleteOfObject semanticDelete = null
	
	
	@Property
	var fr.inria.diverse.kcvl.interpreter.PatternIntegration patternintegration = null
	@Property
	var XtextResourceSet resourceSet = null

	@Property
	var Context ctx = new Context

	@Property
	var ctxs = new ArrayList<Context>


	@Property
	var toRemove = new ArrayList<EObject>()
	
	@Property
	var notSelected = new ArrayList<EObject>()

	@Property
	var domainResources = new ArrayList<Resource>()
	
	

	val roots = new ArrayList<EObject>()

	// var stdio = new k2.io.StdIOClass()
	def EObject findRoot(EObject e) {
		if (e.eContainer() == null || e.eContainer() instanceof  Resource) {
			//println("find root " + e)
			return e

		} else
			return findRoot(e.eContainer())
	}

	def start(VPackage o) {
		ctxs.add(ctx)
		populateChoiceResolution(o)
		if (!checkChoiceResolution()) {
			println("no choice resolution in the cvl file")
			return
		}

		println("number of choice resolve to true : " + ctx.selectedChoice.size())
		println("number of choice resolve to false : " + ctx.unSelectedChoice.size())

		ctxs.forEach [ e |
			ctx = e
			findBinding(o)
			println("number of realisation resolve to true : " + ctx.selectedVP.size())
			println("number of realisation resolve to false : " + ctx.unSelectedVP.size())
			ctx.unSelectedVP.filter[e1|
				{
					(e1 instanceof ObjectExistence || e1 instanceof LinkExistence)
				}].forEach[e2|executeDerivation(e2)]
			ctx.selectedVP.filter[e1|
				{
					!(e1 instanceof  ObjectExistence || e1 instanceof LinkExistence)
				}].forEach[e2|executeDerivation(e2)]
		]

		//println(notSelected.first)
		

		notSelected.forEach[e1|
			{
				var r = findRoot(e1);
				if(!roots.contains(r)) roots.add(r)
			}]

		//notSelected.forEach(rem|println("toremove from object substitution " + rem))
		

		roots.forEach(root| { //println(root + "\n" + root.eResource())
			domainResources.add(root.eResource())}
		)
		
		
		//println("roots "+ roots.size)
		//println("domainR "+ domainResources.size)
		roots.forEach[root|this.substituteObject(root)]
		roots.forEach[root|this.removeObject(root)]

		if (semanticDelete == null) {

			//stdio.writeln("call fix references")
			val it = roots.iterator()
			while (it.hasNext()) {
				val root = it.next()
				fixReference(root)
			}
		}

		//toRemove.forEach(rem | println("toremove in follwoing the link " + rem))
		//ctx.objectSubstitution.keySet().forEach(rem | println("toremove from object subtitution " + rem))
		//call to remove
		//stdio.writeln("Remove object from resources")
		if (semanticDelete == null) {
			toRemove.forEach[o1| EcoreUtil.delete(o1) ]
			ctx.objectSubstitution.keySet().forEach[o1|EcoreUtil.delete(o1)]
		} else
			toRemove.forEach[o1|semanticDelete.delete(o1)]

	}

	def Boolean checkChoiceResolution() {
		return (ctx.selectedChoice.size > 0 || ctx.unSelectedChoice.size > 0)
	}

	def void populateChoiceResolution(EObject o) {
		if (o instanceof VPackage) {
			val e = o as VPackage;
			e.getPackageElement().forEach(e1|populateChoiceResolution(e1))
		} else if (o instanceof VInstance) {
			val e = o as VInstance;
			var old = ctx
			ctx = new Context
			ctxs.add(ctx)
			e.getChild().forEach(e1|populateChoiceResolution(e1))
			ctx = old
		} else if (o instanceof ChoiceResolutuion) {
			val e = o as  ChoiceResolutuion;

			if (e.isDecision()) {
				ctx.selectedChoice.add(e.getResolvedChoice())
				ctx.currentChoice = e.getResolvedChoice()
			} else {
				ctx.unSelectedChoice.add(e.getResolvedChoice())
			}
			e.getChild().forEach(e1|populateChoiceResolution(e1))
		} else if (o instanceof VConfiguration) {
			val e = o as VConfiguration;

			e.getMember().forEach[e1|populateChoiceResolution(e1)]
		} else if (o instanceof VariableValueAssignment) {
			val e = o as VariableValueAssignment;
			ctx.choiceParameter.put(e.getResolvedVariable(), e)
			if (e.getResolvedVariable().eContainer() != null && e.getResolvedVariable().eContainer() instanceof Choice) {
				if (ctx.choiceParameterC.containsKey(e.getResolvedVariable().eContainer() as Choice)) {
					ctx.choiceParameterC.get(e.getResolvedVariable().eContainer() as Choice).add(e.getResolvedVariable())
				} else {
					var v = new ArrayList<Variable>()
					v.add(e.getResolvedVariable())
					ctx.choiceParameterC.put(e.getResolvedVariable().eContainer() as Choice, v)
				}

			} else
				println("Problem")

		}
	}

	def void findBinding(EObject o) {
		if (o instanceof VPackage) {
			val e = o as VPackage
			e.getPackageElement().forEach[e1|findBinding(e1)]
		} else if (o instanceof VClassifier) {
			val e = o as VClassifier
			e.getChild().forEach[e1|findBinding(e1)]
		} //case e : VInterface |{
		//  e.getMember().forEach(e1 | findBinding(e1))
		// }
		else if (o instanceof  ConfigurableUnit) {
			val e = o as ConfigurableUnit
			e.getOwnedVariationPoint().forEach[e1|findBinding(e1)]
		} else if (o instanceof  ChoiceVariationPoint) {
			val e = o as ChoiceVariationPoint
			if (e.getBindingChoice() != null  && e.getBindingChoice().size >0 && ctx.selectedChoice.containsAll(e.getBindingChoice()) &&
				(e.getMappingExpression() == null || "".equals(e.getMappingExpression())))
				ctx.selectedVP.add(e)
			else if (ctx.unSelectedChoice.containsAll(e.getBindingChoice()) &&
				(e.getMappingExpression() == null || "".equals(e.getMappingExpression())))
				ctx.unSelectedVP.add(e)
			else if (e.getMappingExpression() != null && !"".equals(e.getMappingExpression())) {

				var temp = File.createTempFile(e.getName(), ".cvlmappingvaribilitychoice")
				var tempo = new FileOutputStream(temp)
				var tempopr = new PrintWriter(tempo)

				tempopr.write(e.getName() + " {\n" + e.getName() + " : " + e.getMappingExpression() + "\n}\n")
				tempopr.flush();
				tempopr.close();

				tempo.close();

				if (resourceSet == null) {
					var injector = new CvlmappingvaribilitychoiceStandaloneSetup().createInjectorAndDoEMFRegistration();

					if (!EPackage.Registry.INSTANCE.containsKey(Fd2assetsPackage.eINSTANCE.getNsURI())) {
						EPackage.Registry.INSTANCE.put(Fd2assetsPackage.eINSTANCE.getNsURI(),
							Fd2assetsPackage.eINSTANCE);
					}

					var resourceFactory = injector.getInstance(typeof(IResourceFactory));
					var serviceProvider = injector.getInstance(
						typeof(IResourceServiceProvider));
					Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("cvlmappingvaribilitychoice",
						resourceFactory);
					IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().
						put("CM", serviceProvider);
					resourceSet = injector.getInstance(typeof(XtextResourceSet));
				}
				var uri = URI.createFileURI(temp.getAbsolutePath());

				//Resource xtextResource = resourceSet.createResource(uri);
				var xtextResource = resourceSet.getResource(uri, true);
				EcoreUtil.resolveAll(xtextResource);

				//println("evel "+ evaluateHasChoiceExpression(xtextResource.getContents().get(0), true))
				if (evaluateHasChoiceExpression(xtextResource.getContents().get(0), true)) {
					ctx.selectedVP.add(e)

				} else {
					ctx.unSelectedVP.add(e)

				}

			}
		} else if (o instanceof ParametricVariationPoint) {
			val e = o as ParametricVariationPoint
			if (e.getBindingVariable().eContainer() instanceof Choice) {
				if (ctx.selectedChoice.contains(e.getBindingVariable().eContainer() as Choice))
					ctx.selectedVP.add(e)
			}
		}
	}

	def boolean evaluateHasChoiceExpression(EObject o, boolean result) {
		var res = result
		if (o instanceof  RestrictionRuleset) {

			val e = o as RestrictionRuleset
			val res1 = res
			res = e.getRule().forall[e1|evaluateHasChoiceExpression(e1, res1)]

			//println("result RestrictionRuleset " + res)
			return res;
		} else if (o instanceof  RestrictionRule) {
			val e = o as RestrictionRule
			res = evaluateHasChoiceExpression(e.getExpression(), res)

			//println("result BinExpression " + res)
			return res;
		} else if (o instanceof   BinExpression) {
			val e = o as BinExpression
			if (e.getOp().getValue() == Operator.OR.getValue()) {
				res = evaluateHasChoiceExpression(e.getLeft(), res) || evaluateHasChoiceExpression(e.getRight(), res)
			} else if (e.getOp().getValue() == Operator.XOR.getValue()) {
				res = xor(evaluateHasChoiceExpression(e.getLeft(), res),evaluateHasChoiceExpression(e.getRight(), res))

			} else {
				res = evaluateHasChoiceExpression(e.getLeft(), res) && evaluateHasChoiceExpression(e.getRight(), res)
			}

			//println("result BinExpression " + res)
			return res;
		} else if (o instanceof   UnaryExpression) {
			val e = o as UnaryExpression
			if (e.getOp().getValue() == UnaryOperator.NOT.getValue()) {
				res = !evaluateHasChoiceExpression(e.getLeft(), res)
			} else {
				res = evaluateHasChoiceExpression(e.getLeft(), res)
			}

			//println("result UnaryExpression " + res)
			return res;
		} else if (o instanceof HasChoice) {
			val e = o as HasChoice
			var res1 = true
			if (e.getCondition() != null)
				res1 = evaluateHasChoiceExpression(e.getCondition(), res1) //println(res1)
			var res2 = false
			res2 = ctxs.exists[ct|ct.selectedChoice.exists[e2|e2.getName().equals(e.getChoiceName())]]
			res = res1 && res2

			//println("result hasChoice " + res)
			return res;
		} else if (o instanceof BinCondition) {
			val e = o as BinCondition
			if (e.getOp().getValue() == Operator.OR.getValue()) {
				res = evaluateHasChoiceExpression(e.getLeft(), res) || evaluateHasChoiceExpression(e.getRight(), res)
			} else if (e.getOp().getValue() == Operator.XOR.getValue()) {
				res = xor(evaluateHasChoiceExpression(e.getLeft(), res), evaluateHasChoiceExpression(e.getRight(), res))

			} else {
				res = evaluateHasChoiceExpression(e.getLeft(), res) && evaluateHasChoiceExpression(e.getRight(), res)
			}
			return res;
		} else if (o instanceof ConditionExpression) {
			val e = o as ConditionExpression
			var res2 = false

			//ctx.choiceParameter.keySet().forEach(f| println(f + " " + f.getName()))
			var vlist = ctx.choiceParameter.keySet().filter(v|v.getName().equals(e.getFeatureAttibuteName()))

			//println(vlist.size())
			if (vlist.size() > 0) {

				//println(ctx.choiceParameter.get(vlist.get(0)))
				var PrimitiveValueSpecification valuespec = ctx.choiceParameter.get(vlist.take(0)).getValue() as PrimitiveValueSpecification
				var typename = valuespec.getType().getName()
				if ("int".equalsIgnoreCase(typename) || "integer".equalsIgnoreCase(typename)) {
					var value = Integer.parseInt(valuespec.getValue())
					var value1 = Integer.parseInt(e.getValue())
					if (e.getOp().getValue() == CompareOperator.EQ.getValue()) {
						res2 = (value == value1)
					} else if (e.getOp().getValue() == CompareOperator.INF.getValue()) {
						res2 = (value1 < value)
					} else if (e.getOp().getValue() == CompareOperator.INFEQ.getValue()) {
						res2 = (value1 <= value)
					} else if (e.getOp().getValue() == CompareOperator.SUP.getValue()) {
						res2 = (value1 > value)
					} else if (e.getOp().getValue() == CompareOperator.SUPEQ.getValue()) {
						res2 = (value1 >= value)
					}
				} else {
					var value = valuespec.getValue()
					var value1 = e.getValue()

					//println(value +  " "+ value1)
					if (e.getOp().getValue() == CompareOperator.EQ.getValue()) {
						res2 = (value1.equals(value))
					} else if (e.getOp().getValue() == CompareOperator.INF.getValue()) {
						res2 = (value1.compareTo(value) < 0)
					} else if (e.getOp().getValue() == CompareOperator.INFEQ.getValue()) {
						res2 = (value1.compareTo(value) <= 0)
					} else if (e.getOp().getValue() == CompareOperator.SUP.getValue()) {
						res2 = value1.compareTo(value) > 0
					} else if (e.getOp().getValue() == CompareOperator.SUPEQ.getValue()) {
						res2 = (value1.compareTo(value) >= 0)
					}
				}

			}
			res = res2
			return res;
		}

		return res;

	}

	def void executeDerivation(VariationPoint o) {
    //var v: OpaqueVariationPoint = null
    //v.getType().getSpec().getTransfromationLanguage()
    //println("execute " + o.getName() + "  " + o.getClass())

   if (o instanceof ObjectExistence) {
        val e = o as ObjectExistence
        e.getOptionalObject().forEach(e1 | notSelected.add(e1.getReference()))
      }
      else if (o instanceof ParametricSlotAssignmet ) {
          val e = o as ParametricSlotAssignmet
          // Object to modify
        
        var obj = e.getSlotOwner().getReference();
        // name of the property
        if (obj.eClass().getEAllStructuralFeatures().size()>0){
        var struct = obj.eClass().getEAllStructuralFeatures().filter(st | { st.getName().toLowerCase().equals(e.getSlotIdentifier().toLowerCase()) }).get(0)
        //    	  e.getBindingVariable()
        //Value to Set
        if (ctx.choiceParameter.get(e.getBindingVariable()).getValue() instanceof PrimitiveValueSpecification) {
          var Object value = null

          if ((ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification).getType().getName().equals("Integer")) {
            value = Integer.parseInt((ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification).getValue().trim())
          } else if ((ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification) .getType().getName().equals("Boolean")) { 
          	value = Boolean.parseBoolean((ctx.choiceParameter.get(e.getBindingVariable()).getValue()as PrimitiveValueSpecification).getValue())
          }

          else if ((ctx.choiceParameter.get(e.getBindingVariable()).getValue() as  PrimitiveValueSpecification).getType().getName().equals("Real")) {
            value = Double.parseDouble(( ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification).getValue())

          } else if ((ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification).getType().getName().equals("String")) {
            value = (ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification).getValue()
          } else {
            value = (ctx.choiceParameter.get(e.getBindingVariable()).getValue() as PrimitiveValueSpecification).getValue()
          }
          obj.eSet(struct, value)
        }
        }

      }

      else if (o instanceof  ObjectSubstitution ) { //element to remove
      val e = o as ObjectSubstitution
	//e.getPlacementObject().getReference();
	//element to add
	// e.getReplacementObject().getReference();
		ctx.objectSubstitution.put(e.getPlacementObject().getReference(), e.getReplacementObject().getReference())
      }
      
      else if (o instanceof  PatternIntegration ) {
		val e = o as PatternIntegration
		val map = new ArrayList<Pair<EObject,EObject>>()
		e.substitutes.forEach[e1 | map.add(new Pair(e1.placementObject.getReference(), e1.replacementObject.getReference()))
				var r = findRoot(e1.replacementObject.getReference());
				val myroots = new ArrayList<EObject>()
				if(!myroots.contains(r)) myroots.add(r)
				myroots.forEach(root|domainResources.add(root.eResource()))
				myroots.clear
			
		]
		if (patternintegration != null){
				patternintegration.includePattern(map)
				map.clear
		}
      }
      
           else if (o instanceof  PatternFusion ) {
		val e = o as PatternFusion 
		val map = new ArrayList<Pair<EObject,EObject>>()
		e.substitutes.forEach[e1 | map.add(new Pair(e1.placementObject.getReference(), e1.replacementObject.getReference()))
				var r = findRoot(e1.replacementObject.getReference());
				val myroots = new ArrayList<EObject>()
				if(!myroots.contains(r)) myroots.add(r)
				myroots.forEach(root|domainResources.add(root.eResource()))
				myroots.clear
			
		]
		if (patternintegration != null){
				patternintegration.fusionPattern(map)
				map.clear
				
				}
      }
      else if (o instanceof  StructuralOrganisationalPattern){
      		val e = o as StructuralOrganisationalPattern
		val map = new ArrayList<Pair<EObject,EObject>>()
		e.substitutes.forEach[e1 | map.add(new Pair(e1.placementObject.getReference(), e1.replacementObject.getReference()))
				var r = findRoot(e1.replacementObject.getReference());
				val myroots = new ArrayList<EObject>()
				if(!myroots.contains(r)) myroots.add(r)
				myroots.forEach(root|domainResources.add(root.eResource()))
				myroots.clear
			
		]
		if (patternintegration != null){
				patternintegration.applyStructuralOrganisationalPattern(map)
				map.clear				
				}
      }
      
      else if (o instanceof  FragmentSubstitution ) {

      }
      else if (o instanceof  LinkExistence ) {
      	 val e = o as LinkExistence
        //To improve
        notSelected.add(e.getOptionalLink().getReference())
      }
       else if (o instanceof  LinkAssignment ) {
       	 val e = o as LinkAssignment
        // Object to modify
        var obj = e.getLink().getReference()
        // name of the property

        var nametmp = e.getLink().getMOFRef()

        //        println("name " + name)
        if (nametmp.contains(":")) nametmp = nametmp.split(":").get(0)
        val name = nametmp
        //        println("name " + name)
        //        println(obj + " "  + obj.eClass())
        //        obj.eClass().getEAllStructuralFeatures().forEach(st | println(st.getName()))
        var structs = obj.eClass().getEAllStructuralFeatures().filter[st | st.getName().equals(name)]
        if (structs.size() > 0) {

          var struct = structs.get(0)
          //element to Set
          obj.eSet(struct, e.getNewEnd().getReference())
        } else {
          println("cannot execute this element")
        }
      }
       else if (o instanceof  CompositeVariationPoint){
       	 val e = o as CompositeVariationPoint
        e.getChildren().forEach(e1 | executeDerivation(e1))
      }
       else if (o instanceof OpaqueVariationPoint ) {
       	 val e = o as OpaqueVariationPoint
        var binding = new Binding();
        val _ctx = new ArrayList<EObject>()
        val args = new HashMap<String, Object>()
        e.getSourceObject().forEach(obj | { _ctx.add(obj.getReference()) })

        if (e.getBindingChoice().size() > 0) {

          var choice = e.getBindingChoice().get(0)
          var List<Variable> variables  = this.ctx.choiceParameterC.get(e.getBindingChoice().get(0))

          variables.forEach[ variable |{ 
          var VariableValueAssignment variableAssignement = null
          if (variable != null) {
            variableAssignement = this.ctx.choiceParameter.get(variable)
          }

          if (variableAssignement != null && variableAssignement.getValue() instanceof PrimitiveValueSpecification) {
            var Object value = null

            if ((variableAssignement.getValue() as PrimitiveValueSpecification).getType().getName().equals("Integer")) {
              value = Integer.parseInt((variableAssignement.getValue() as PrimitiveValueSpecification).getValue().trim())
            } else if ((variableAssignement.getValue() as PrimitiveValueSpecification).getType().getName().equals("Boolean")) { value = Boolean.parseBoolean((variableAssignement.getValue() as PrimitiveValueSpecification).getValue()) }

            else if ((variableAssignement.getValue() as PrimitiveValueSpecification).getType().getName().equals("Real")) {
              value = Double.parseDouble((variableAssignement.getValue() as PrimitiveValueSpecification).getValue())

            } else if ((variableAssignement.getValue() as PrimitiveValueSpecification).getType().getName().equals("String")) {
              value = (variableAssignement.getValue() as PrimitiveValueSpecification).getValue()
            } else {
              value = (variableAssignement.getValue() as PrimitiveValueSpecification).getValue()
            }
            args.put(variable.getName(), value)
          }}]
        }
        binding.setVariable("ctx", _ctx);
        binding.setVariable("args", args);

        binding.setVariable("notSelected", notSelected);
        var shell = new GroovyShell(binding);
        shell.evaluate(e.getExpression());

        //binding.getVariable("x").equals(new Integer(123));

      }


  }

  def Object evalExpression(EObject o , VPackage root, ChoiceResolutuion parent) {

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
              if (ctx.objectSubstitution.keySet().exists[objtoremove | objtoremove.equals(o1)]) {
                colleToRemove.add(o1) 
              }
            ]
            
            colleToRemove.forEach[element |  col.remove(element); col.add(ctx.objectSubstitution.get(element)) ]

            //else
            //	stdio.writeln("col est nulle " + o.toString)
          
        } else {
          if (ctx.objectSubstitution.keySet().exists[objtoremove |  objtoremove.equals(o) ]) {
            obj.eSet(prop as EStructuralFeature, ctx.objectSubstitution.get(o))
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
                    colleToRemove.forEach(element | col.remove(element))
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

}

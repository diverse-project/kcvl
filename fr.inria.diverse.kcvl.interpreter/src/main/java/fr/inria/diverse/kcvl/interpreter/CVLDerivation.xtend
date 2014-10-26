package fr.inria.diverse.kcvl.interpreter

import fr.inria.diverse.kcvl.extensions.SemanticDeleteOfObject

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

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet

import org.eclipse.emf.ecore.util.EcoreUtil

import org.eclipse.xtend.lib.Property

import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet

import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle
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
import org.omg.CVLMetamodelMaster.cvl.SlotAssignment
import org.omg.CVLMetamodelMaster.cvl.SlotValueExistence
import org.omg.CVLMetamodelMaster.cvl.StructuralOrganisationalPattern
import org.omg.CVLMetamodelMaster.cvl.VClassifier
import org.omg.CVLMetamodelMaster.cvl.VConfiguration
import org.omg.CVLMetamodelMaster.cvl.VInstance
import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.omg.CVLMetamodelMaster.cvl.VPackageable
import org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment
import org.omg.CVLMetamodelMaster.cvl.VariationPoint

import org.varymde.CvlmappingvaribilitychoiceStandaloneSetup

import static extension org.eclipse.xtext.xbase.lib.BooleanExtensions.*

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

		println("Number of choices resolved to true: " + ctx.selectedChoices.size.toString)
		println("Number of choices resolved to false: " + ctx.unselectedChoices.size.toString)

		ctxs.forEach[ctx |
			findBinding(o)

			println("Number of realizations resolved to true: " + ctx.selectedVPs.size.toString)
			println("Number of realizations resolved to false: " + ctx.unselectedVPs.size.toString)

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

		o.eResource.allContents.filter(typeof(BaseModelHandle)).forEach[h |
			if (!domainResources.contains(h.reference.eResource))
				domainResources.add(h.reference.eResource)
		]

		//roots.forEach[domainResources.add(eResource)]
		roots.forEach[it.substituteObject]
		roots.forEach[it.removeObject]

		if (semanticDelete == null) {
			roots.forEach[it.fixReferences]
			toRemove.forEach[EcoreUtil::delete(it)]
			ctx.objectSubstitutions.keySet.forEach[EcoreUtil::delete(it)]
		}
		else
			toRemove.forEach[semanticDelete.delete(it)]
	}

	/* -------------------------------------- */
	/*    PopulateChoiceResolution visitors   */
	/* -------------------------------------- */
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

	def private dispatch void populateChoiceResolution(VPackageable o) {
		println("Uncatched populateChoiceResolution(" + o + ")")
	}

	/* -------------------------------------- */
	/*            FindBinding visitors        */
	/* -------------------------------------- */
	def private dispatch void findBinding(VPackage o) {
		o.packageElement.forEach[it.findBinding]
	}

	def private dispatch void findBinding(VClassifier o) {
		o.child.forEach[it.findBinding]
	}

	def private dispatch void findBinding(ConfigurableUnit o) {
		o.ownedVariationPoint.forEach[it.findBinding]
	}

	def private dispatch void findBinding(ChoiceVariationPoint o) {
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

	def private dispatch void findBinding(ParametricVariationPoint o) {
		if (
			   o.bindingVariable.eContainer instanceof Choice
			&& ctx.selectedChoices.contains(o.bindingVariable.eContainer as Choice)
		)
			ctx.selectedVPs.add(o)
	}

	def private dispatch void findBinding(VPackageable o) {
		println("Uncatched findBinding(" + o + ")")
	}

	/* -------------------------------------- */
	/*  EvaluateHasChoiceExpression visitors  */
	/* -------------------------------------- */
	def private dispatch boolean evaluateHasChoiceExpression(RestrictionRuleset o, boolean result) {
		return o.rule.forall[evaluateHasChoiceExpression(it, result)]
	}

	def private dispatch boolean evaluateHasChoiceExpression(RestrictionRule o, boolean result) {
		return evaluateHasChoiceExpression(o.expression, result)
	}

	def private dispatch boolean evaluateHasChoiceExpression(BinExpression o, boolean result) {
		return switch o.op.value {
					case Operator::OR.value:
						evaluateHasChoiceExpression(o.left, result) || evaluateHasChoiceExpression(o.right, result)
					case Operator::XOR.value:
						xor(evaluateHasChoiceExpression(o.left, result), evaluateHasChoiceExpression(o.right, result))
					case Operator::AND.value:
						evaluateHasChoiceExpression(o.left, result) && evaluateHasChoiceExpression(o.right, result)
					default: false
				}
	}

	def private dispatch boolean evaluateHasChoiceExpression(UnaryExpression o, boolean result) {
		return if (o.op.value == UnaryOperator::NOT.value)
					!evaluateHasChoiceExpression(o.left, result)
				else
					evaluateHasChoiceExpression(o.left, result)
	}

	def private dispatch boolean evaluateHasChoiceExpression(HasChoice o, boolean result) {
		return if (o.condition != null) evaluateHasChoiceExpression(o.condition, true) else true
				&& ctxs.exists[selectedChoices.exists[name == o.choiceName]]
	}

	def private dispatch boolean evaluateHasChoiceExpression(BinCondition o, boolean result) {
		return switch o.op.value {
					case Operator::OR.value:
						evaluateHasChoiceExpression(o.left, result) || evaluateHasChoiceExpression(o.right, result)
					case Operator::XOR.value:
						xor(evaluateHasChoiceExpression(o.left, result), evaluateHasChoiceExpression(o.right, result))
					case Operator::AND.value:
						evaluateHasChoiceExpression(o.left, result) && evaluateHasChoiceExpression(o.right, result)
					default: false
				}
	}

	def private dispatch boolean evaluateHasChoiceExpression(ConditionExpression o, boolean result) {
		var vlist = ctx.choiceParameter.keySet.filter[name == o.featureAttibuteName]

		return
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

	def private dispatch boolean evaluateHasChoiceExpression(EObject o, boolean result) {
		return result
	}

	/* -------------------------------------- */
	/*        ExecuteDerivation visitors      */
	/* -------------------------------------- */
	def private dispatch void executeDerivation(ObjectExistence o) {
		o.optionalObject.forEach[notSelected.add(reference)]
	}

	def private dispatch void executeDerivation(SlotAssignment o) {
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

	def private dispatch void executeDerivation(SlotValueExistence o) {
		val obj = o.slotOwner.reference
		val feature = obj.eClass.EAllStructuralFeatures.findFirst[name.toLowerCase == o.slotIdentifier.toLowerCase]

		if (feature != null)
			if (feature.unsettable)
				obj.eUnset(feature)
			else
				obj.eSet(feature, null)
	}

	def private dispatch void executeDerivation(ParametricSlotAssignmet o) {
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

	def private dispatch void executeDerivation(ObjectSubstitution o) {
		ctx.objectSubstitutions.put(o.placementObject.reference, o.replacementObject.reference)
	}

	def private dispatch void executeDerivation(org.omg.CVLMetamodelMaster.cvl.PatternIntegration o) {
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

	def private dispatch void executeDerivation(PatternFusion o) {
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

	def private dispatch void executeDerivation(StructuralOrganisationalPattern o) {
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

	def private dispatch void executeDerivation(FragmentSubstitution o) {
		// TODO
	}

	def private dispatch void executeDerivation(LinkExistence o) {
		notSelected.add(o.optionalLink.reference)
	}

	def private dispatch void executeDerivation(LinkAssignment o) {
		val obj = o.link.reference
		val name =
			if (o.link.MOFRef.contains(":")) o.link.MOFRef.split(":").head
			else o.link.MOFRef

		val struct = obj.eClass.EAllStructuralFeatures.findFirst[f | f.name == name]

		if (struct != null)
			obj.eSet(struct, o.newEnd.reference)
	}

	def private dispatch void executeDerivation(CompositeVariationPoint o) {
		o.children.forEach[it.executeDerivation]
	}

	def private dispatch void executeDerivation(OpaqueVariationPoint o) {
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

	def private dispatch void executeDerivation(VariationPoint o) {
		println("Uncatched executeDerivation(" + o + ")")
	}

	/* -------------------------------------- */
	/*               Utilities                */
	/* -------------------------------------- */
	def private void substituteObject(EObject obj) {
		if (obj == null)
			return;

		obj.eClass.EAllReferences
		.filter[containment]
		.forEach[ref |
			val o = obj.eGet(ref, true)

			if (o != null)
				if (ref.many) {
					val values = o as List<? extends EObject>
					values.forEach[substituteObject(it)]
				} else if (o instanceof EObject)
					substituteObject(o as EObject)
		]

		obj.eClass.EAllStructuralFeatures
		.filter[!derived && !transient]
		.forEach[ref |
			val o = obj.eGet(ref, true)

			if (o != null)
				if (ref.many) {
					val values = new ArrayList<EObject>
					values.addAll(o as List<? extends EObject>)
					val toBeRemoved = new ArrayList<EObject>

					values.forEach[v |
						if (ctx.objectSubstitutions.keySet.exists[it.equals(v)])
							toBeRemoved.add(v)
					]

					toBeRemoved.forEach[EObject r |
						values.remove(r)
						values.add(ctx.objectSubstitutions.get(r))
					]
				} else if (ctx.objectSubstitutions.keySet.exists[it.equals(o)])
					obj.eSet(ref, ctx.objectSubstitutions.get(o))
		]
	}

	def private void fixReferences(EObject obj) {
		if (obj == null)
			return;

		obj.eClass.EAllReferences
		.filter[containment]
		.forEach[ref |
			val o = obj.eGet(ref, true)

			if (o != null)
				if (ref.many) {
					val values = o as List<? extends EObject>
					values.forEach[fixReferences(it)]
				} else if (o instanceof EObject)
					fixReferences(o as EObject)
		]

		obj.eClass.EAllStructuralFeatures
		.filter[!derived && !transient]
		.forEach[ref |
			val o = obj.eGet(ref, true)

			if (o != null)
				if (ref.many) {
					val values = o as List<? extends EObject>
					val toBeRemoved = new ArrayList<EObject>

					values.forEach[v |
						if (toRemove.exists[it.equals(v)])
							toBeRemoved.add(v)
					]

					toBeRemoved.forEach[EObject r |
						values.remove(r)
					]
				} else if (ctx.objectSubstitutions.keySet.exists[it.equals(o)])
					obj.eSet(ref, ctx.objectSubstitutions.get(o))
		]
	}

	def private boolean isNotSelected(EObject obj) {
		return notSelected.contains(obj)
	}

	def private void removeObject(EObject obj) {
		if (obj.isNotSelected) {
			if (semanticDelete == null)
				obj.removeObjectAndAllContaining
			else
				toRemove.add(obj)
		} else {
			obj.eClass.EAllReferences
			.filter[containment]
			.forEach[ref |
				val o = obj.eGet(ref, true)

				if (o != null)
					if (ref.many) {
						val values = o as List<? extends EObject>
						values.forEach[removeObject(it)]
					} else if (o instanceof EObject)
						removeObject(o as EObject)
			]
		}
	}

	def private void removeObjectAndAllContaining(EObject obj) {
		if (obj == null)
			return;

		obj.eClass.EAllReferences
		.filter[containment]
		.forEach[ref |
			val o = obj.eGet(ref, true)

			if (o != null)
				if (ref.many) {
					val values = o as List<? extends EObject>
					values.forEach[removeObjectAndAllContaining(it)]
				} else if (o instanceof EObject)
					removeObjectAndAllContaining(o as EObject)
		]

		if (domainResources.contains(obj.eResource))
			toRemove.add(obj)
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

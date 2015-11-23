package fr.inria.diverse.kcvl.derivationengine.utils

import fr.familiar.test.FMLTest
import fr.familiar.variable.SetVariable
import fr.varymde.cvl.vary.CVL2Familiar
import java.util.List
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.omg.CVLMetamodelMaster.cvl.Choice
import org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion
import org.omg.CVLMetamodelMaster.cvl.CvlFactory
import org.omg.CVLMetamodelMaster.cvl.OCLConstraint
import org.omg.CVLMetamodelMaster.cvl.Operation
import org.omg.CVLMetamodelMaster.cvl.OperationCallExp
import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.omg.CVLMetamodelMaster.cvl.VSpecRef

class Test extends FMLTest
{
	def List<URI> test(URI uri) {
		super.setUp

		val rs = new ResourceSetImpl
		val res = rs.getResource(uri, true)
		val root = res.contents.head as VPackage

		if (root == null)
			return newArrayList

		val orig = EcoreUtil::copy(root)

		val vam = root.packageElement.get(0) as VPackage
		val config = root.packageElement.get(2) as VPackage
		
		config.packageElement
		.filter(typeof(ChoiceResolutuion))
		.forEach[resolution |
			if (resolution.decision == true) {
				val choice = resolution.resolvedVSpec as Choice
				choice.isImpliedByParent = true
				choice.defaultResolution = true
			} else {
				EcoreUtil::delete(resolution.resolvedVSpec)
			}
		]

		val fml = CVL2Familiar::toFamiliar(root)

		val constraintsBuilder = new StringBuilder
		vam.packageElement
		.filter[e |
			e instanceof OCLConstraint &&
			(e as OCLConstraint).expression.head instanceof OperationCallExp 
			&& ((e as OCLConstraint).expression.head as OperationCallExp).operation == Operation::LOG_IMPLIES
		].forEach[e |
			val imply = (e as OCLConstraint).expression.head as OperationCallExp
			val lhs = imply.argument.get(0) as VSpecRef
			val rhs = imply.argument.get(1) as VSpecRef
			if (lhs.VSpec != null && rhs.VSpec != null) {
				constraintsBuilder.append('''«lhs.VSpec.name» -> «rhs.VSpec.name» ;''')
				constraintsBuilder.append("\n")
			}
		]

		val fmlString = '''
		«fml.substring(0, fml.length - 1)»
		«constraintsBuilder»)
		'''.toString

		val uris = <URI>newArrayList
		val fm1 = FM("fm1", fmlString)
		fm1.configs.forEach[c, i |
			if (c instanceof SetVariable) {
				val names = (c as SetVariable).names.toList
				val copy = EcoreUtil::copy(orig) as VPackage
				val vamCopy = copy.packageElement.get(0) as VPackage
				val confCopy = copy.packageElement.get(2) as VPackage

				confCopy.packageElement.clear

				val iterator = vamCopy.eAllContents
				while (iterator.hasNext) {
					val p = iterator.next
					if (p instanceof Choice) {
						val choice = p as Choice
						confCopy.packageElement += CvlFactory::eINSTANCE.createChoiceResolutuion => [
							resolvedChoice = choice
							resolvedVSpec = choice
							decision = names.contains(choice.name)
						]
					}
				}

				val configName = confCopy.normalizedFilename
				copy.name = configName

				val copyUri = URI::createURI(uri.trimSegments(1) + "/output/"+configName+".cvl")
				val resCopy = rs.createResource(copyUri)
				resCopy.contents += copy
				resCopy.save(null)
				
				uris += copyUri
			}
		]

		super.tearDown
		return uris
	}

	def String normalizedFilename(VPackage config) {
		val features =
			config.packageElement
			.filter(typeof(ChoiceResolutuion))
			.filter[decision == true]
			.map[
				resolvedVSpec.name
			]
			.toList

		Collections::sort(features)
		val sb = new StringBuilder

		features.forEach[f |
			f.toCharArray.filter[Character::isUpperCase(it)].forEach[c |
				sb.append(c)
			]
			sb.append("1")
		]

		return sb.toString
	}
}

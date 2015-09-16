package fr.inria.diverse.kcvl.derivationengine.utils

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.omg.CVLMetamodelMaster.cvl.CvlPackage
import fr.varymde.cvl.vary.CVL2Familiar
import fr.familiar.test.FMLTest
import org.omg.CVLMetamodelMaster.cvl.Choice
import org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion
import org.omg.CVLMetamodelMaster.cvl.OCLConstraint
import org.omg.CVLMetamodelMaster.cvl.OperationCallExp
import org.omg.CVLMetamodelMaster.cvl.Operation
import org.omg.CVLMetamodelMaster.cvl.VSpecRef

class Test extends FMLTest
{
	def static void main(String[] args) {
		EPackage$Registry::INSTANCE.put(CvlPackage::eNS_URI, CvlPackage::eINSTANCE)
		Resource$Factory$Registry::INSTANCE.extensionToFactoryMap.put("cvl", new XMIResourceFactoryImpl)
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI("Test.cvl"), true)
		val root = res.contents.head as VPackage

		new Test().test(root)
	}

	def void test(VPackage root) {
		val vam = root.packageElement.get(0) as VPackage
		val vrm = root.packageElement.get(1) as VPackage
		val config = root.packageElement.get(2) as VPackage

		config.packageElement
		.filter(typeof(ChoiceResolutuion))
		.forEach[resolution |
			if (resolution.decision == true) {
//				println("Setting " + resolution.resolvedVSpec.name)
				(resolution.resolvedVSpec as Choice).isImpliedByParent = true
				(resolution.resolvedVSpec as Choice).defaultResolution = true
			}
		]

		val fml = CVL2Familiar::toFamiliar(root)

		val constraintsStr = new StringBuilder
		val ii = vam.eAllContents
		while (ii.hasNext) {
			val o = ii.next
			if (o instanceof OCLConstraint) {
				val constraint = o as OCLConstraint
				val exp = constraint.expression.head as OperationCallExp
				if (exp.operation == Operation::LOG_IMPLIES) {
					val a = exp.argument.get(0) as VSpecRef
					val b = exp.argument.get(1) as VSpecRef
					println(a.VSpec.name + " => " + b.VSpec.name)
					constraintsStr.append(a.VSpec.name + " -> " + b.VSpec.name + ";")
				}
			}
		}

		val x = '''
		«fml.substring(0, fml.length - 1)»
		«constraintsStr»)
		'''
		println(x)

		super.setUp
		val zblah = FM("fm1", x.toString)
		println("nb="+zblah.configs.size)
//		zblah.configs.forEach[c |
//			if (c instanceof SetVariable)
//				println("found " + (c as SetVariable).names)
//		]
	}
}

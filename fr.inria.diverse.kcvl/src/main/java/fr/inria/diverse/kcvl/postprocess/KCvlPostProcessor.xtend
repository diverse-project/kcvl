package fr.inria.diverse.kcvl.postprocess

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion
import org.omg.CVLMetamodelMaster.cvl.CvlFactory
import org.omg.CVLMetamodelMaster.cvl.LinkHandle
import org.omg.CVLMetamodelMaster.cvl.OCLConstraint
import org.omg.CVLMetamodelMaster.cvl.ObjectHandle
import org.omg.CVLMetamodelMaster.cvl.PrimitiveTypeEnum
import org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification
import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.omg.CVLMetamodelMaster.cvl.VSpec
import org.omg.CVLMetamodelMaster.cvl.Variable
import org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment

import static extension fr.inria.diverse.kcvl.KCvlUtils.*
import org.omg.CVLMetamodelMaster.cvl.VSpecResolution

class KCvlPostProcessor implements IDerivedStateComputer
{
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		val root = resource.contents.head as VPackage

		if (root != null)
			root.eAllContents.forEach[completeAST]
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		val root = resource.contents.head as VPackage

		if (root != null)
			root.eAllContents.forEach[discardAST]
	}

	def dispatch void completeAST(ObjectHandle it) {
		try {
			MOFRef = MOFRef ?: ""
			if (reference == null) {
				reference = resolve
				println("reference="+reference)
			}
		} catch (Exception e) {
			// Don't cry
			e.printStackTrace
		}
	}

	def dispatch void completeAST(LinkHandle it) {
		try {
			MOFRef = MOFRef ?: ""
			reference = reference ?: resolve
		} catch (Exception e) {
			// Don't cry
		}
	}

	def dispatch void completeAST(VSpec it) {
		resolutionTime = resolutionTime ?: ""
	}

	def dispatch void completeAST(ChoiceResolutuion it) {
		if (name == null) { // SimpleChoiceResolution
			name = "unnamed"
		}

		resolvedVSpec = resolvedChoice
	}
	
	def dispatch void completeAST(Variable it) {
		resolutionTime = resolutionTime ?: ""
	}
	
	def dispatch void completeAST(VariableValueAssignment it) {
		if (resolvedVariable != null) {
			resolvedVSpec = resolvedVariable
		}
		else if (eContainer instanceof ChoiceResolutuion) {
			resolvedVSpec = (eContainer as ChoiceResolutuion).resolvedVSpec
		}
	}
	
	def dispatch void completeAST(PrimitiveValueSpecification it) {
		if (type == null) // Simple declaration
		{
			if (eContainer instanceof VariableValueAssignment) {
				type = (eContainer as VariableValueAssignment).resolvedVariable.type
			}
			else {
				val stringType = CvlFactory::eINSTANCE.createPrimitveType => [type = PrimitiveTypeEnum::STRING]
				it.enclosingVPackage.packageElement += stringType
				
				type = stringType
			}
		}
	}
	
	def dispatch void completeAST(OCLConstraint it) {
		if (name == null) // SimpleOCLConstraint
			name = "unnamed"
	}
	
	def dispatch void completeAST(EObject o) {
		// ...
	}

	def dispatch void discardAST(ObjectHandle it) {
		reference = null
		MOFRef = null
		referenceString = null
	}

	def dispatch void discardAST(LinkHandle it) {
		reference = null
		MOFRef = null
		referenceString = null
	}

	def dispatch void discardAST(VSpecResolution it) {
		resolvedVSpec = null
	}

	def dispatch void discardAST(ChoiceResolutuion it) {
		resolvedVSpec = null
	}

	def dispatch void discardAST(EObject o) {
		// ...
	}
	
	def private VPackage enclosingVPackage(EObject o) {
		if (o == null)
			return null
		else if (o instanceof VPackage)
			return o as VPackage
		else
			return o.eContainer.enclosingVPackage
	}
}

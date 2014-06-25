package fr.inria.diverse.kcvl.validation

import org.eclipse.xtext.validation.Check

import org.omg.CVLMetamodelMaster.cvl.ObjectHandle
import org.omg.CVLMetamodelMaster.cvl.CvlPackage
import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle

import static extension fr.inria.diverse.kcvl.KCvlUtils.*
import org.omg.CVLMetamodelMaster.cvl.LinkHandle

class KCVLValidator extends AbstractKCVLValidator {
	/**
	 * Check that the EObject reference is valid
	 *   - true: load it in "reference"
	 *   - false: raise an error
	 */
	@Check
	def checkReferencedEObjectExists(BaseModelHandle obj) {
		try {
			val resolved = obj.resolve

			if (resolved !== null)
				obj.reference = resolved
			else
				error("Cannot resolve reference to EObject", CvlPackage.Literals.BASE_MODEL_HANDLE__REFERENCE_STRING)
		} catch (Exception e) {
			error("Cannot resolve reference to EObject: " + e.message, CvlPackage.Literals.BASE_MODEL_HANDLE__REFERENCE_STRING)
		}
	}

	@Check
	def checkMofRefIsValid(ObjectHandle obj) {
		// ...
	}
}

package fr.inria.diverse.kcvl

import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

class KCvlUtils
{
	def static resolve(BaseModelHandle obj) {
		val rs = new ResourceSetImpl
		return rs.getEObject(URI::createURI(obj.referenceString), true)
	}
}

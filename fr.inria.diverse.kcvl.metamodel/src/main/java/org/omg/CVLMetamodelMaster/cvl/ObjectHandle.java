/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     An object handle identifies an object of the base model. This Class abstracts over the cross-domain referencing
 *     mechanism needed to refer from CVL elements to base model objects.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ObjectHandle#getMOFRef <em>MOF Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getObjectHandle()
 * @model
 * @generated
 */
public interface ObjectHandle extends BaseModelHandle {
	/**
	 * Returns the value of the '<em><b>MOF Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOF Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOF Ref</em>' attribute.
	 * @see #setMOFRef(String)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getObjectHandle_MOFRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMOFRef();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ObjectHandle#getMOFRef <em>MOF Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOF Ref</em>' attribute.
	 * @see #getMOFRef()
	 * @generated
	 */
	void setMOFRef(String value);

} // ObjectHandle

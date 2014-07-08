/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A CVspec (Composite VSpec) is a kind of VSpec indicating that a base model element has inner variability as indicated by the extension of the CVSpec, which is a set of VSpecs.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.CVSpec#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getCVSpec()
 * @model
 * @generated
 */
public interface CVSpec extends VSpec {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The VInterface  whose members need to be resolved in order to resolve the CVSpec.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(VInterface)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getCVSpec_Extension()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VInterface getExtension();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.CVSpec#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(VInterface value);

} // CVSpec

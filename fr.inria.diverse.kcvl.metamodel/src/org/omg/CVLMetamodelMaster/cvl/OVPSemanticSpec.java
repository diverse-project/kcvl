/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OVP Semantic Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec#getModelTransformation <em>Model Transformation</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec#getTransfromationLanguage <em>Transfromation Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOVPSemanticSpec()
 * @model
 * @generated
 */
public interface OVPSemanticSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Transformation</em>' attribute.
	 * @see #setModelTransformation(String)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOVPSemanticSpec_ModelTransformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getModelTransformation();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec#getModelTransformation <em>Model Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Transformation</em>' attribute.
	 * @see #getModelTransformation()
	 * @generated
	 */
	void setModelTransformation(String value);

	/**
	 * Returns the value of the '<em><b>Transfromation Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfromation Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfromation Language</em>' attribute.
	 * @see #setTransfromationLanguage(String)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOVPSemanticSpec_TransfromationLanguage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTransfromationLanguage();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec#getTransfromationLanguage <em>Transfromation Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfromation Language</em>' attribute.
	 * @see #getTransfromationLanguage()
	 * @generated
	 */
	void setTransfromationLanguage(String value);

} // OVPSemanticSpec

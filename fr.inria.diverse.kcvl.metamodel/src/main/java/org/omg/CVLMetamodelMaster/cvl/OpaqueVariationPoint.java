/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An OpaqueVariationPoint is an executable, domain-specific variation point whose semantics is not defined by CVL. It is the responsibility of the specfic domain to execute this kind of variation point.<br><br>If bound to a choice then an OpaqueVariation point will be executed upon a positive decision. If bound to a VClassifier then it will be executed once for each instance created from it. If bound to a variable then it will be executed when a value is assigned to it, also providing the value as parameter for the execution.<br></p><p>####CVLSemanticStart####</p><p></p><p>Dynamic semantics</p><p>The OpaqueVariationPoint allows user to make use of variations that are not directly defined by CVL. So, its semantics is not detailed here, and we do not have pre and post conditions</p><p>Pre and post condition</p><p>Pre-condition : </p><p>None</p><p>Post-condition: </p><p>None</p><p>OCL :</p><p>-- OpaqueVariationPoint</p><p>context OpaqueVariationPoint::eval(ctx : CVLExecutionContext)</p><p>pre : true</p><p>post : true</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint#getPlaceHolder <em>Place Holder</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOpaqueVariationPoint()
 * @model
 * @generated
 */
public interface OpaqueVariationPoint extends ChoiceVariationPoint {
	/**
	 * Returns the value of the '<em><b>Place Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Holder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Holder</em>' containment reference.
	 * @see #setPlaceHolder(BaseModelHandle)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOpaqueVariationPoint_PlaceHolder()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BaseModelHandle getPlaceHolder();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint#getPlaceHolder <em>Place Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Holder</em>' containment reference.
	 * @see #getPlaceHolder()
	 * @generated
	 */
	void setPlaceHolder(BaseModelHandle value);

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.ObjectHandle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' containment reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOpaqueVariationPoint_SourceObject()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ObjectHandle> getSourceObject();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(OVPType)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getOpaqueVariationPoint_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OVPType getType();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OVPType value);

} // OpaqueVariationPoint

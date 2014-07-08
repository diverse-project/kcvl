/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A&nbsp;VSpecReference&nbsp;points&nbsp;to&nbsp;a&nbsp;VSpec&nbsp;element&nbsp;(choice,&nbsp;variable,&nbsp;classifier).&nbsp;In&nbsp;set&nbsp;semantics,&nbsp;VSpecReference&nbsp;is&nbsp;always&nbsp;treated&nbsp;as&nbsp;a&nbsp;set&nbsp;expression;&nbsp;choices&nbsp;and&nbsp;variables&nbsp;are&nbsp;modeled&nbsp;as&nbsp;singletons&nbsp;or&nbsp;empty&nbsp;sets.&nbsp;In&nbsp;the&nbsp;small&nbsp;language&nbsp;there&nbsp;is&nbsp;no&nbsp;set&nbsp;semantics;&nbsp;VSpecReference&nbsp;to&nbsp;a&nbsp;choice&nbsp;is&nbsp;then&nbsp;treated&nbsp;as&nbsp;a&nbsp;Boolean&nbsp;(evaluates&nbsp;to&nbsp;true&nbsp;or&nbsp;false),&nbsp;and&nbsp;a&nbsp;variable&nbsp;reference&nbsp;resolves&nbsp;to&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VSpecRef#getVSpec <em>VSpec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpecRef()
 * @model
 * @generated
 */
public interface VSpecRef extends OCLExpression {
	/**
	 * Returns the value of the '<em><b>VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSpec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSpec</em>' reference.
	 * @see #setVSpec(VSpec)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpecRef_VSpec()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VSpec getVSpec();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VSpecRef#getVSpec <em>VSpec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSpec</em>' reference.
	 * @see #getVSpec()
	 * @generated
	 */
	void setVSpec(VSpec value);

} // VSpecRef

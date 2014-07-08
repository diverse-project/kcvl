/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A parametric variation point is a variation point which inserts a value into the base model. The value to be inserted is a parameter of the variation point. A parametric variation point must be bound to a VSpec of kind variable, which represents the variation point's parameter.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ParametricVariationPoint#getBindingVariable <em>Binding Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getParametricVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface ParametricVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Variable</em>' reference.
	 * @see #setBindingVariable(Variable)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getParametricVariationPoint_BindingVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variable getBindingVariable();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ParametricVariationPoint#getBindingVariable <em>Binding Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Variable</em>' reference.
	 * @see #getBindingVariable()
	 * @generated
	 */
	void setBindingVariable(Variable value);

} // ParametricVariationPoint

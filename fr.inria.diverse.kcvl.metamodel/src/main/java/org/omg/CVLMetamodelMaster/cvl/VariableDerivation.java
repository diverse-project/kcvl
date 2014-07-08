/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VariableDerivation#getDerivingExpression <em>Deriving Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariableDerivation()
 * @model
 * @generated
 */
public interface VariableDerivation extends VSpecDerivation {
	/**
	 * Returns the value of the '<em><b>Deriving Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deriving Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deriving Expression</em>' containment reference.
	 * @see #setDerivingExpression(OCLExpression)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariableDerivation_DerivingExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OCLExpression getDerivingExpression();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VariableDerivation#getDerivingExpression <em>Deriving Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deriving Expression</em>' containment reference.
	 * @see #getDerivingExpression()
	 * @generated
	 */
	void setDerivingExpression(OCLExpression value);

} // VariableDerivation

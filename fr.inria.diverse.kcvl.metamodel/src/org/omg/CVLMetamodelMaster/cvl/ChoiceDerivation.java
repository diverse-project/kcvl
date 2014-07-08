/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ChoiceDerivation#getDerivingConstraint <em>Deriving Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getChoiceDerivation()
 * @model
 * @generated
 */
public interface ChoiceDerivation extends VSpecDerivation {
	/**
	 * Returns the value of the '<em><b>Deriving Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deriving Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deriving Constraint</em>' containment reference.
	 * @see #setDerivingConstraint(Constraint)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getChoiceDerivation_DerivingConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Constraint getDerivingConstraint();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ChoiceDerivation#getDerivingConstraint <em>Deriving Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deriving Constraint</em>' containment reference.
	 * @see #getDerivingConstraint()
	 * @generated
	 */
	void setDerivingConstraint(Constraint value);

} // ChoiceDerivation

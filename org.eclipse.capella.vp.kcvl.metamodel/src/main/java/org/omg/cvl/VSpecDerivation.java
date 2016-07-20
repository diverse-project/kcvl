/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VSpec derivation is a specification how to derive the value a particular VSpec from other VSpecs during materialization.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.VSpecDerivation#getDerivedVSpec <em>Derived VSpec</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getVSpecDerivation()
 * @model
 * @generated
 */
public interface VSpecDerivation extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Derived VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The VSpec whose value is derived by this derivation.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived VSpec</em>' reference.
	 * @see #setDerivedVSpec(VSpec)
	 * @see org.omg.cvl.CvlPackage#getVSpecDerivation_DerivedVSpec()
	 * @model required="true"
	 * @generated
	 */
	VSpec getDerivedVSpec();

	/**
	 * Sets the value of the '{@link org.omg.cvl.VSpecDerivation#getDerivedVSpec <em>Derived VSpec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived VSpec</em>' reference.
	 * @see #getDerivedVSpec()
	 * @generated
	 */
	void setDerivedVSpec(VSpec value);

} // VSpecDerivation

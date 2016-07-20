/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * A VClassifier (variability classifier) is a kind of VSpec indicating the existence of variability whose resolution
 * involves instantiating it zero or more times and then resolving the variability of each instance separately. A
 * classifier may be bound to an executable variation point, in which case each resolution instance will execute the
 * variation point once. Each variability classifier has an instance multiplicity which specifies lower and upper limits
 * for the number of instances created from it.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.VClassifier#getInstanceMultiplicity <em>Instance Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getVClassifier()
 * @model
 * @generated
 */
public interface VClassifier extends VSpec {
	/**
	 * Returns the value of the '<em><b>Instance Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a cardinality constraint on the number of instances created from this VClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Multiplicity</em>' containment reference.
	 * @see #setInstanceMultiplicity(MultiplicityInterval)
	 * @see org.omg.cvl.CvlPackage#getVClassifier_InstanceMultiplicity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiplicityInterval getInstanceMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.cvl.VClassifier#getInstanceMultiplicity <em>Instance Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Multiplicity</em>' containment reference.
	 * @see #getInstanceMultiplicity()
	 * @generated
	 */
	void setInstanceMultiplicity(MultiplicityInterval value);

} // VClassifier

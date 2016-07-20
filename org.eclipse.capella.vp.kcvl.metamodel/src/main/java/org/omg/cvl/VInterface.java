/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VInterface is a collection of VSpecs. Each CVSpec has a VInterface which lists the VSPecs that need be resolved in order to resolve the CVspec. When a configurable unit is bout to a CVspec, its extension is the interface exposed by the unit. </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.VInterface#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.cvl.VInterface#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.cvl.VInterface#getSuper <em>Super</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getVInterface()
 * @model
 * @generated
 */
public interface VInterface extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The members of the interface.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getVInterface_Member()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpec> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraints&nbsp;over&nbsp;the&nbsp;VSPecs&nbsp;over&nbsp;this&nbsp;VInterface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getVInterface_OwnedConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An inherited interface. </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(VInterface)
	 * @see org.omg.cvl.CvlPackage#getVInterface_Super()
	 * @model
	 * @generated
	 */
	VInterface getSuper();

	/**
	 * Sets the value of the '{@link org.omg.cvl.VInterface#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(VInterface value);

} // VInterface

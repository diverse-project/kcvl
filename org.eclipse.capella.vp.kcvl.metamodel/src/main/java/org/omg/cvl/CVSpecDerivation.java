/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV Spec Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.CVSpecDerivation#getMemberDerivation <em>Member Derivation</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getCVSpecDerivation()
 * @model
 * @generated
 */
public interface CVSpecDerivation extends VSpecDerivation {
	/**
	 * Returns the value of the '<em><b>Member Derivation</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VSpecDerivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Derivation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Derivation</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getCVSpecDerivation_MemberDerivation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecDerivation> getMemberDerivation();

} // CVSpecDerivation

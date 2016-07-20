/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.OCLConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getOCLConstraint()
 * @model
 * @generated
 */
public interface OCLConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.OCLExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getOCLConstraint_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<OCLExpression> getExpression();

} // OCLConstraint

/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.OperationCallExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.omg.cvl.OperationCallExp#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getOperationCallExp()
 * @model
 * @generated
 */
public interface OperationCallExp extends OCLExpression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.OCLExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getOperationCallExp_Argument()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLExpression> getArgument();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.cvl.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.omg.cvl.Operation
	 * @see #setOperation(Operation)
	 * @see org.omg.cvl.CvlPackage#getOperationCallExp_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.omg.cvl.OperationCallExp#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.omg.cvl.Operation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // OperationCallExp

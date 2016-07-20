/**
 */
package org.omg.cvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Model Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.BaseModelHandle#getReference <em>Reference</em>}</li>
 *   <li>{@link org.omg.cvl.BaseModelHandle#getReferenceString <em>Reference String</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getBaseModelHandle()
 * @model
 * @generated
 */
public interface BaseModelHandle extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(EObject)
	 * @see org.omg.cvl.CvlPackage#getBaseModelHandle_Reference()
	 * @model
	 * @generated
	 */
	EObject getReference();

	/**
	 * Sets the value of the '{@link org.omg.cvl.BaseModelHandle#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(EObject value);

	/**
	 * Returns the value of the '<em><b>Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference String</em>' attribute.
	 * @see #setReferenceString(String)
	 * @see org.omg.cvl.CvlPackage#getBaseModelHandle_ReferenceString()
	 * @model
	 * @generated
	 */
	String getReferenceString();

	/**
	 * Sets the value of the '{@link org.omg.cvl.BaseModelHandle#getReferenceString <em>Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference String</em>' attribute.
	 * @see #getReferenceString()
	 * @generated
	 */
	void setReferenceString(String value);

} // BaseModelHandle

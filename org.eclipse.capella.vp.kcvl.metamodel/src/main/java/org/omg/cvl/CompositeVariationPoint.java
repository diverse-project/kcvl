/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.CompositeVariationPoint#getBindingCVSpec <em>Binding CV Spec</em>}</li>
 *   <li>{@link org.omg.cvl.CompositeVariationPoint#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getCompositeVariationPoint()
 * @model
 * @generated
 */
public interface CompositeVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding CV Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding CV Spec</em>' reference.
	 * @see #setBindingCVSpec(CVSpec)
	 * @see org.omg.cvl.CvlPackage#getCompositeVariationPoint_BindingCVSpec()
	 * @model required="true"
	 * @generated
	 */
	CVSpec getBindingCVSpec();

	/**
	 * Sets the value of the '{@link org.omg.cvl.CompositeVariationPoint#getBindingCVSpec <em>Binding CV Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding CV Spec</em>' reference.
	 * @see #getBindingCVSpec()
	 * @generated
	 */
	void setBindingCVSpec(CVSpec value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VariationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getCompositeVariationPoint_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariationPoint> getChildren();

} // CompositeVariationPoint

/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A choice variation point is a variation point which can be applied/executed or not. It must be bound to a choice VSpec deciding whether or not it will be applied/executed.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.ChoiceVariationPoint#getBindingChoice <em>Binding Choice</em>}</li>
 *   <li>{@link org.omg.cvl.ChoiceVariationPoint#getMappingExpression <em>Mapping Expression</em>}</li>
 *   <li>{@link org.omg.cvl.ChoiceVariationPoint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getChoiceVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface ChoiceVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding Choice</b></em>' reference list.
	 * The list contents are of type {@link org.omg.cvl.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Choice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Choice</em>' reference list.
	 * @see org.omg.cvl.CvlPackage#getChoiceVariationPoint_BindingChoice()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Choice> getBindingChoice();

	/**
	 * Returns the value of the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Expression</em>' attribute.
	 * @see #setMappingExpression(String)
	 * @see org.omg.cvl.CvlPackage#getChoiceVariationPoint_MappingExpression()
	 * @model
	 * @generated
	 */
	String getMappingExpression();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ChoiceVariationPoint#getMappingExpression <em>Mapping Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Expression</em>' attribute.
	 * @see #getMappingExpression()
	 * @generated
	 */
	void setMappingExpression(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.omg.cvl.CvlPackage#getChoiceVariationPoint_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ChoiceVariationPoint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // ChoiceVariationPoint

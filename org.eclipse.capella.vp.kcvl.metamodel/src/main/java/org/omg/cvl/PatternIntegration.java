/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.PatternIntegration#isMulti <em>Multi</em>}</li>
 *   <li>{@link org.omg.cvl.PatternIntegration#getSubstitutes <em>Substitutes</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getPatternIntegration()
 * @model
 * @generated
 */
public interface PatternIntegration extends ChoiceVariationPoint, RepeatableVariationPoint {
	/**
	 * Returns the value of the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' attribute.
	 * @see #setMulti(boolean)
	 * @see org.omg.cvl.CvlPackage#getPatternIntegration_Multi()
	 * @model required="true"
	 * @generated
	 */
	boolean isMulti();

	/**
	 * Sets the value of the '{@link org.omg.cvl.PatternIntegration#isMulti <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi</em>' attribute.
	 * @see #isMulti()
	 * @generated
	 */
	void setMulti(boolean value);

	/**
	 * Returns the value of the '<em><b>Substitutes</b></em>' reference list.
	 * The list contents are of type {@link org.omg.cvl.ObjectSubstitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutes</em>' reference list.
	 * @see org.omg.cvl.CvlPackage#getPatternIntegration_Substitutes()
	 * @model
	 * @generated
	 */
	EList<ObjectSubstitution> getSubstitutes();

} // PatternIntegration

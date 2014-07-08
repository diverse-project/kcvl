/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.PatternIntegration#isMulti <em>Multi</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.PatternIntegration#getSubstitutes <em>Substitutes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getPatternIntegration()
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
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getPatternIntegration_Multi()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isMulti();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.PatternIntegration#isMulti <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi</em>' attribute.
	 * @see #isMulti()
	 * @generated
	 */
	void setMulti(boolean value);

	/**
	 * Returns the value of the '<em><b>Substitutes</b></em>' reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.ObjectSubstitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutes</em>' reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getPatternIntegration_Substitutes()
	 * @model
	 * @generated
	 */
	EList<ObjectSubstitution> getSubstitutes();

} // PatternIntegration

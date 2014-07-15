/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeatable Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An instantiable variation point is a variation point which can be instantiated, i.e. applied zero or more times. It must be bound to a classifier VSpec </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.RepeatableVariationPoint#getBindingClassifier <em>Binding Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getRepeatableVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface RepeatableVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Classifier</em>' reference.
	 * @see #setBindingClassifier(VClassifier)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getRepeatableVariationPoint_BindingClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	VClassifier getBindingClassifier();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.RepeatableVariationPoint#getBindingClassifier <em>Binding Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Classifier</em>' reference.
	 * @see #getBindingClassifier()
	 * @generated
	 */
	void setBindingClassifier(VClassifier value);

} // RepeatableVariationPoint

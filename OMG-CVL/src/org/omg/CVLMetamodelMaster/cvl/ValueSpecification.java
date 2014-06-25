/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     A ValueSpecification specifies a value which is either primitive, or an object of the base mode,&nbsp;or a fragment of
 *     the base model.&nbsp;
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ValueSpecification#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Variabletype)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getValueSpecification_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variabletype getType();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ValueSpecification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Variabletype value);

} // ValueSpecification

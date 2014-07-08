/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     A variable is a kind of VSpec indicating value variability, that is the fact that some externally-obtained value is to
 *     be inserted into the base model. Resolving the variable means providing such value. Variables may be bound to variation
 *     points which require values, for example slot value assignment.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.Variable#getReplacementFragmentTypesubsetstype <em>Replacement Fragment Typesubsetstype</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.Variable#getDefaulValue <em>Defaul Value</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.Variable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends VSpec {
	/**
	 * Returns the value of the '<em><b>Replacement Fragment Typesubsetstype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Fragment Typesubsetstype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Fragment Typesubsetstype</em>' reference.
	 * @see #setReplacementFragmentTypesubsetstype(ReplacementFragmentType)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariable_ReplacementFragmentTypesubsetstype()
	 * @model ordered="false"
	 * @generated
	 */
	ReplacementFragmentType getReplacementFragmentTypesubsetstype();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.Variable#getReplacementFragmentTypesubsetstype <em>Replacement Fragment Typesubsetstype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Fragment Typesubsetstype</em>' reference.
	 * @see #getReplacementFragmentTypesubsetstype()
	 * @generated
	 */
	void setReplacementFragmentTypesubsetstype(ReplacementFragmentType value);

	/**
	 * Returns the value of the '<em><b>Defaul Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaul Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaul Value</em>' containment reference.
	 * @see #setDefaulValue(ValueSpecification)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariable_DefaulValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaulValue();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.Variable#getDefaulValue <em>Defaul Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaul Value</em>' containment reference.
	 * @see #getDefaulValue()
	 * @generated
	 */
	void setDefaulValue(ValueSpecification value);

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
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariable_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variabletype getType();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Variabletype value);

} // Variable

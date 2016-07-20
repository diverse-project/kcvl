/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of a variable which is either String, Integer, Float, or Boolean.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.PrimitveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getPrimitveType()
 * @model
 * @generated
 */
public interface PrimitveType extends Variabletype {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.cvl.PrimitiveTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.omg.cvl.PrimitiveTypeEnum
	 * @see #setType(PrimitiveTypeEnum)
	 * @see org.omg.cvl.CvlPackage#getPrimitveType_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypeEnum getType();

	/**
	 * Sets the value of the '{@link org.omg.cvl.PrimitveType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.omg.cvl.PrimitiveTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypeEnum value);

} // PrimitveType

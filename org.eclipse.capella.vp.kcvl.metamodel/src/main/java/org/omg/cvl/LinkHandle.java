/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * A link handle identifies a link of the base model. This Class abstracts over the cross-domain referencing mecahnism
 * needed to refer from CVL elements to base model links.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.LinkHandle#getMOFRef <em>MOF Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getLinkHandle()
 * @model
 * @generated
 */
public interface LinkHandle extends BaseModelHandle {
	/**
	 * Returns the value of the '<em><b>MOF Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOF Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOF Ref</em>' attribute.
	 * @see #setMOFRef(String)
	 * @see org.omg.cvl.CvlPackage#getLinkHandle_MOFRef()
	 * @model required="true"
	 * @generated
	 */
	String getMOFRef();

	/**
	 * Sets the value of the '{@link org.omg.cvl.LinkHandle#getMOFRef <em>MOF Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOF Ref</em>' attribute.
	 * @see #getMOFRef()
	 * @generated
	 */
	void setMOFRef(String value);

} // LinkHandle

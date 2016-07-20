/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A LinkAssignmet is a choice variation point which specifies that an object in the base model, called the replacement, may be substituted for another as the end of a particular link in the base model.<br><br>The link-end is identified via a link handle pointing to the base model plus a string representing a MOF property owned by the association of which the link is an instance. The placement is specified via an object handle.<br>The variation point must be bound to a choice deciding whether or not it will be executed to be acted on. It may not be bound to a variable or classifier.</p><p>####CVLSemanticStart####</p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition : </p><p>None</p><p>Post-condition: </p><p>After a Link Assignment has been executed, the newEnd object handle must be an end of the LinkHandle link.</p><p></p><p>Note : To express more easily this OCL pre condition, we add an operation getEnd() on the LinkHandle metaclass. This operation computes the respective end of this linkHandle.</p><p>OCL :</p><p>-- LinkAssignment </p><p>context LinkAssignment::eval(ctx : CVLExecutionContext)</p><p>pre :</p><p>post : self.link.getEnd()-&gt;includes(self.newEnd)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.LinkAssignment#getLink <em>Link</em>}</li>
 *   <li>{@link org.omg.cvl.LinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}</li>
 *   <li>{@link org.omg.cvl.LinkAssignment#getNewEnd <em>New End</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getLinkAssignment()
 * @model
 * @generated
 */
public interface LinkAssignment extends ChoiceVariationPoint {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkHandle)
	 * @see org.omg.cvl.CvlPackage#getLinkAssignment_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LinkHandle getLink();

	/**
	 * Sets the value of the '{@link org.omg.cvl.LinkAssignment#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkHandle value);

	/**
	 * Returns the value of the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the MOF Property&nbsp;in the object's metaclass identifying the link-end where this substitution occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link End Identifier</em>' attribute.
	 * @see #setLinkEndIdentifier(String)
	 * @see org.omg.cvl.CvlPackage#getLinkAssignment_LinkEndIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getLinkEndIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.cvl.LinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link End Identifier</em>' attribute.
	 * @see #getLinkEndIdentifier()
	 * @generated
	 */
	void setLinkEndIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>New End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The&nbsp;object handle identifying the base model object&nbsp;replacing&nbsp;the link-end in this substitution. If no
	 * replacement is specified then the object is expected to arrive in a variable, that is the variation point must be bound to
	 * a variable to be acted on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New End</em>' containment reference.
	 * @see #setNewEnd(ObjectHandle)
	 * @see org.omg.cvl.CvlPackage#getLinkAssignment_NewEnd()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectHandle getNewEnd();

	/**
	 * Sets the value of the '{@link org.omg.cvl.LinkAssignment#getNewEnd <em>New End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New End</em>' containment reference.
	 * @see #getNewEnd()
	 * @generated
	 */
	void setNewEnd(ObjectHandle value);

} // LinkAssignment

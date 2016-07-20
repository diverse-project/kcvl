/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Link Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ParametricLinkAssignmet is a parametric variation point which specifies that an object arriving as parameter, called the replacement, will be substituted for an object of the base model as the end of a particular link in the base model.<br><br>The link-end is identified via a link handle pointing to the base model plus a string representing a MOF property owned by the association of which the link is an instance.<br>The variation point must be bound to a variable which provides the replacement. It may not be bound to a choice or classifier.</p><p>####CVLSemanticStart####</p><p></p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition :</p><p>Before the execution of a ParametricLinkAssignment, the link link must exist in the base model and a end corresponding to the given linkEndIdentifier exists in the ObjectHandle.</p><p>Post-condition:</p><p>After a ParametricLinkAssignment has been executed, the object which arrives in the variable is at the end of the link link.</p><p>OCL :</p><p>-- ParametricLinkAssignment</p><p>-- A end corresponding to the given linkEndIdentifier exists in the ObjectHandle</p><p>context ParametricLinkAssignment::eval(ctx : CVLExecutionContext)</p><p>pre : ctx.baseLinks-&gt;includes(self.link)</p><p>and if self.getPropertyValue(self.linkEndIdentifier) &lt;&gt; null</p><p>then</p><p>self.getPropertyValue(self.linkEndIdentifier)-&gt;forAll( val | ctx.resolvedModelElements-&gt;includes(val.oclAsType(ObjectHandle)))</p><p>else</p><p>false</p><p>endif</p><p>post: self.link.getEnd()-&gt;includes(</p><p>VariableValueAssignment.allInstances()-&gt;select (varValueAssign | (self.bindingVspec</p><p>-&gt;includes(varValueAssign.resolvedVariable)))-&gt;asOrderedSet()-&gt;first().value )</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.ParametricLinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}</li>
 *   <li>{@link org.omg.cvl.ParametricLinkAssignment#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getParametricLinkAssignment()
 * @model
 * @generated
 */
public interface ParametricLinkAssignment extends ParametricVariationPoint {
	/**
	 * Returns the value of the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link End Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link End Identifier</em>' attribute.
	 * @see #setLinkEndIdentifier(String)
	 * @see org.omg.cvl.CvlPackage#getParametricLinkAssignment_LinkEndIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getLinkEndIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ParametricLinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link End Identifier</em>' attribute.
	 * @see #getLinkEndIdentifier()
	 * @generated
	 */
	void setLinkEndIdentifier(String value);

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
	 * @see org.omg.cvl.CvlPackage#getParametricLinkAssignment_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LinkHandle getLink();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ParametricLinkAssignment#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkHandle value);

} // ParametricLinkAssignment

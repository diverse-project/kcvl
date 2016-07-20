/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Slot Assignmet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A parametric slot assignment is a parametric variation point which specifies that a value arriving as parameter will be assigned to a particular slot in a particular object in the base model. The object is identified via an object handle pointing to the base model, and the slot is identified via a string representing a MOF property owned by the class of which the object is an instance. The variation point must be bound to a variable providing the value to be assigned.<br><br>A parametric slot assignment may not be bound to a VClassifer or choice.</p><p></p><p>####CVLSemanticStart####</p><p>Invariant</p><p>Invariant : The slotIdentifier must correspond to a property name of the associated ObjectHandle</p><p>OCL :</p><p>-- ParametricSlotAssignment</p><p>-- The slotIdentifier must correspond to a property name of the associated ObjectHandle</p><p>context ParametricSlotAssignmet :</p><p>inv slotIdentifierExists :</p><p>self.slotOwner.getPropertyByName(self.slotIdentifier) &lt;&gt; null</p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition :</p><p>Before the execution of a ParametricSlotAssignment, the ObjectHandle slotOwner must exist in the base model.</p><p>Post-condition:</p><p>After a ParametricSlotAssignment has been executed, the slot identified by the slotIdentifier and contained in the ObjectHandle slotOwner is assigned with a given value.</p><p>OCL :</p><p>-- ParametricSlotAssignment</p><p>context ParametricSlotAssignmet::eval(ctx : CVLExecutionContext)</p><p>pre : ctx.resolvedModelElements-&gt;includes(self.slotOwner)</p><p>post: self.slotOwner.getPropertyValue(self.slotIdentifier)-&gt;asOrderedSet()-&gt;first() == (VariableValueAssignment.allInstances()-&gt;select (varValueAssign | (self.bindingVspec</p><p>-&gt;includes(varValueAssign.resolvedVariable)))-&gt;asOrderedSet()-&gt;first().value)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.ParametricSlotAssignmet#getSlotIdentifier <em>Slot Identifier</em>}</li>
 *   <li>{@link org.omg.cvl.ParametricSlotAssignmet#getSlotOwner <em>Slot Owner</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getParametricSlotAssignmet()
 * @model
 * @generated
 */
public interface ParametricSlotAssignmet extends ParametricVariationPoint {
	/**
	 * Returns the value of the '<em><b>Slot Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Identifier</em>' attribute.
	 * @see #setSlotIdentifier(String)
	 * @see org.omg.cvl.CvlPackage#getParametricSlotAssignmet_SlotIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getSlotIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ParametricSlotAssignmet#getSlotIdentifier <em>Slot Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Identifier</em>' attribute.
	 * @see #getSlotIdentifier()
	 * @generated
	 */
	void setSlotIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Slot Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Owner</em>' containment reference.
	 * @see #setSlotOwner(ObjectHandle)
	 * @see org.omg.cvl.CvlPackage#getParametricSlotAssignmet_SlotOwner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectHandle getSlotOwner();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ParametricSlotAssignmet#getSlotOwner <em>Slot Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Owner</em>' containment reference.
	 * @see #getSlotOwner()
	 * @generated
	 */
	void setSlotOwner(ObjectHandle value);

} // ParametricSlotAssignmet

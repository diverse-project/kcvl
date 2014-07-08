/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A slot assignment is a choice variation point which specifies that a value may be assigned to a particular slot in a particular object in the base model. The object is identified via an object handle pointing to the base model, and the slot is identified via a string representing a MOF property owned by the class of which the object is an instance. The value to be assigned is specified explicitly. The variation point must be bound to a choice deciding whether or not to assign the value, in order to be acted on.<br><br>A slot assignment may not be bound to a VClassifer or variable.</p><p></p><p>####CVLSemanticStart####</p><p>Invariant</p><p><b></b>Invariant :<b></b> The property named as self.slotIdentifier must exist in the slotOwner object</p><p><b></b>OCL :<b></b></p><p>-- SlotAssigmnent</p><p>-- The property named as self.slotIdentifier must exist in the slotOwner object</p><p>context SlotAssignment :</p><p>inv propertyIn_slotOwner :</p><p>if self.SlotOwner &lt;&gt; null</p><p>then</p><p>self.SlotOwner.getPropertyByName(self.slotIdentifier) &lt;&gt; null</p><p>else</p><p>-- if SlotOwner does not exists neither the property</p><p>false</p><p>endif</p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition : </p><p>Before the execution of a SlotAssignment, the SlotOwner object must exist in the base model and it must have a MOF property called as in the slotIdentifier.</p><p>Post-condition: </p><p>After a SlotAssignment has been executed, the MOF property called as in the slotIdentifier in the SlotOwner has been assigned with the value value.</p><p>Note : To express more easily this OCL pre condition, we add the operations getPropertyByName(String propertyName) and getPropertyValue(String propertyName) on the ObjectHandle metaclass to obtain respectively the property with the given name and the value associated with this property.</p><p>OCL :</p><p>context SlotAssignment::eval(ctx : CVLExecutionContext) </p><p>pre : self.SlotOwner &lt;&gt; null and ctx.resolvedModelElements-&gt;includes(self.SlotOwner) and self.SlotOwner-&gt;asOrderedSet()-&gt;first().getPropertyByName(self.slotIdentifier) &lt;&gt; null</p><p>post : self.SlotOwner-&gt;asOrderedSet()-&gt;first().getPropertyValue(self.slotIdentifier)-&gt;asOrderedSet()-&gt;first() == (self.value)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment#getSlotIdentifier <em>Slot Identifier</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment#getSlotOwner <em>Slot Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotAssignment()
 * @model
 * @generated
 */
public interface SlotAssignment extends ChoiceVariationPoint {
	/**
	 * Returns the value of the '<em><b>Slot Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the MOF Property&nbsp;in the object's metaclass identifying the slot to which the value is to be assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot Identifier</em>' attribute.
	 * @see #setSlotIdentifier(String)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotAssignment_SlotIdentifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSlotIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment#getSlotIdentifier <em>Slot Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Identifier</em>' attribute.
	 * @see #getSlotIdentifier()
	 * @generated
	 */
	void setSlotIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value to be assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotAssignment_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Slot Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object handle identifying the base model object to whose slot the value is to be assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot Owner</em>' containment reference.
	 * @see #setSlotOwner(ObjectHandle)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotAssignment_SlotOwner()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getSlotOwner();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment#getSlotOwner <em>Slot Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Owner</em>' containment reference.
	 * @see #getSlotOwner()
	 * @generated
	 */
	void setSlotOwner(ObjectHandle value);

} // SlotAssignment

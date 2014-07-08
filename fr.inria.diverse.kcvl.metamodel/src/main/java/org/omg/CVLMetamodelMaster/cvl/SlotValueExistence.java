/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Value Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>SlotValueExistence is a kind of choice variation point which indicates that a value in a slot of some object of the base model may or may not exist in the materialized model. The object is identified via an object handle.<br><br>To be acted on, an SlotValueExistence variation point must be bound to a choice deciding whether or not the object will be present in the materialized model. It may not be bound to a variable or to a classifier.</p><p>####CVLSemanticStart####</p><p></p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition : </p><p>Before the execution of a SlotValueExistence, the slotOwner element must exist in the base model.</p><p>Post-condition: </p><blockquote><p>After a SlotValueExsitence has been executed, the MoF property with the name such as in the slotIdentifier is in the ObjectHandle otherwise it cannot be found in the ObjectHandle.</p></blockquote><p>OCL :</p><p>-- SlotValueExistence </p><p>context SlotValueExistence::eval(ctx : CVLExecutionContext)</p><p>pre : ctx.resolvedModelElements-&gt;includes(self.slotOwner)</p><p>post : </p><p>ctx.selectedVSpecs-&gt;includes(self.bindingVspec-&gt;asOrderedSet()-&gt;first()) implies self.slotOwner-&gt;asOrderedSet()-&gt;first().getPropertyByName(self.slotIdentifier) &lt;&gt; null</p><p>and</p><p>ctx.unselectedVSpecs-&gt;includes(self.bindingVspec-&gt;asOrderedSet()-&gt;first()) implies (self.slotOwner-&gt;asOrderedSet()-&gt;first().getPropertyByName(self.slotIdentifier)) == (null)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.SlotValueExistence#getSlotIdentifier <em>Slot Identifier</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.SlotValueExistence#getSlotOwner <em>Slot Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotValueExistence()
 * @model
 * @generated
 */
public interface SlotValueExistence extends Existence {
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
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotValueExistence_SlotIdentifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSlotIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.SlotValueExistence#getSlotIdentifier <em>Slot Identifier</em>}' attribute.
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
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getSlotValueExistence_SlotOwner()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getSlotOwner();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.SlotValueExistence#getSlotOwner <em>Slot Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Owner</em>' containment reference.
	 * @see #getSlotOwner()
	 * @generated
	 */
	void setSlotOwner(ObjectHandle value);

} // SlotValueExistence

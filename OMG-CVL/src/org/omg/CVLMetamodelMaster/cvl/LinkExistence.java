/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>LinkExistence is a kind of variation point which indicates that a link of the base model may or may not exist in the materialized model. The link is identified via a link handle.<br><br>To be acted on, a LinkExistence variation point must be bound to a choice deciding whether or not the link will be present in the materialized model. It may not be bound to a variable or to a classifier.</p><p>####CVLSemanticStart####</p><p>Invariant : A LinkExistence must be bound to a Choice, not to a variable or to a classifier</p><p>OCL :</p><p>-- LinkExistence</p><p>-- A LinkExistence must be bound to a Choice, not to a variable or to a classifier</p><p>context LinkExistence :</p><p>inv linkExistence_must_bound_to_choice :</p><p>(self.bindingVspec-&gt;exists( vspec | vspec.oclIsTypeOf(Choice)))</p><p>and (not (self.bindingVspec-&gt;exists( vspec | vspec.oclIsTypeOf(Variable))))</p><p>and (not (self.bindingVspec-&gt;exists( vspec | vspec.oclIsTypeOf(VClassifier))))</p><p></p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition : </p><p>None</p><p>Post-condition: </p><p>After a LinkExistence has been executed, the optionalLink must be in the resolved model otherwise it cannot be in the resolved model.</p><p>OCL :</p><p>-- LinkExistence</p><p>context LinkExistence::eval(ctx : CVLExecutionContext)</p><p>pre : </p><p>post: </p><p>ctx.selectedVSpecs-&gt;includes((self.bindingVspec-&gt;asOrderedSet()-&gt;first())) implies ctx.baseLinks-&gt;includes(self.optionalLink) and</p><p>ctx.unselectedVSpecs-&gt;includes(self.bindingVspec-&gt;asOrderedSet()-&gt;first()) implies not ctx.baseLinks-&gt;includes(self.optionalLink)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.LinkExistence#getOptionalLink <em>Optional Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getLinkExistence()
 * @model
 * @generated
 */
public interface LinkExistence extends Existence {
	/**
	 * Returns the value of the '<em><b>Optional Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link handle identifying the base model link whose existence is in question
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional Link</em>' containment reference.
	 * @see #setOptionalLink(LinkHandle)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getLinkExistence_OptionalLink()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	LinkHandle getOptionalLink();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.LinkExistence#getOptionalLink <em>Optional Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Link</em>' containment reference.
	 * @see #getOptionalLink()
	 * @generated
	 */
	void setOptionalLink(LinkHandle value);

} // LinkExistence

/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>ObjectExistence is a kind of choice variation point which indicates that an object of the base model may or may not exist in the materialized model. The object is identified via an object handle.<br><br>To be acted on, an ObjectExistence variation point must be bound to a choice deciding whether or not the object will be present in the materialized model. It may not be bound to a variable or to a classifier.</p><p></p><p>####CVLSemanticStart####</p><p>Invariant</p><p>Invariant : An ObjectExistence must be bound to a Choice, not to a variable or to a classifier</p><p>OCL : </p><p>-- ObjectExistence</p><p>-- An ObjectExistence must be bound to a Choice, not to a variable or to a classifier</p><p>context ObjectExistence :</p><p>inv must_bound_to_choice :</p><p>(self.bindingVspec-&gt;exists( vspec | vspec.oclIsTypeOf(Choice)))</p><p>and not ( (self.bindingVspec-&gt;exists( vspec | vspec.oclIsTypeOf(Variable))))</p><p>and not ( (self.bindingVspec-&gt;exists( vspec | vspec.oclIsTypeOf(VClassifier))))</p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition : </p><p>None</p><p>Post-condition: </p><p>After an ObjectExistence has been executed, the optionalObject must be in the resolved model otherwise it cannot be in the resolved model.</p><p>OCL :</p><p>-- ObjectExistence</p><p>context ObjectExistence::eval(ctx : CVLExecutionContext)</p><p>pre :</p><p>post: </p><p>ctx.selectedVSpecs-&gt;includes(self.bindingVspec-&gt;asOrderedSet()-&gt;first()) implies ctx.resolvedModelElements-&gt;includes(self.optionalObject) and</p><p>ctx.unselectedVSpecs-&gt;includes((self.bindingVspec-&gt;asOrderedSet()-&gt;first())) implies not ctx.resolvedModelElements-&gt;includes(self.optionalObject)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.ObjectExistence#getOptionalObject <em>Optional Object</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getObjectExistence()
 * @model
 * @generated
 */
public interface ObjectExistence extends Existence {
	/**
	 * Returns the value of the '<em><b>Optional Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.ObjectHandle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The&nbsp;object&nbsp;handle&nbsp;identifying&nbsp;the&nbsp;base&nbsp;model&nbsp;object&nbsp;whose&nbsp;existence&nbsp;is&nbsp;in&nbsp;question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional Object</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getObjectExistence_OptionalObject()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ObjectHandle> getOptionalObject();

} // ObjectExistence

/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Object Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ParametricObjectSubstitution is a parametric variation point which specifies that an object arriving as parameter, called the replacement, will be substituted for an object of the base model, called the placement.<br><br>The placement object is identified via an object handle identifying a base model object. The variation point must be bound to a variable which provides the replacement.<br><br><br>An ObjectSubstitution may not be bound to a choice or VClassifier.</p><p>####CVLSemanticStart####</p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition :</p><p>Before the execution of a ParametricObjectSubstitution, the placement object must exist in the base model and the replacement object is in the variable.</p><p>Post-condition:</p><p>After a ParametricObjectSubstution has been executed, the replacement object must exist in the resolved model whereas the placement object cannot be found in the resolved model.</p><p>OCL :</p><p>-- ParametricObjectSubstitution</p><p>context ParametricObjectSubstitution::eval(ctx : CVLExecutionContext) </p><p>        pre: </p><p>        ctx.resolvedModelElements-&gt;includes( self.placementObject) </p><p>        and (VariableValueAssignment.allInstances()-&gt;select (varValueAssign |  (self.bindingVspec</p><p>-&gt;includes(varValueAssign.resolvedVariable)))-&gt;asOrderedSet()-&gt;first().value) &lt;&gt; null</p><p> post: </p><p>        ctx.resolvedModelElements-&gt;includes( (VariableValueAssignment.allInstances()-&gt;select (varValueAssign |  (self.bindingVspec</p><p>-&gt;includes(varValueAssign.resolvedVariable)))-&gt;asOrderedSet()-&gt;first().value).oclAsType(ObjectSpecification).object) </p><p>        and not ctx.resolvedModelElements-&gt;includes( self.placementObject)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.ParametricObjectSubstitution#getPlacementObject <em>Placement Object</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getParametricObjectSubstitution()
 * @model
 * @generated
 */
public interface ParametricObjectSubstitution extends ParametricVariationPoint {
	/**
	 * Returns the value of the '<em><b>Placement Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Object</em>' containment reference.
	 * @see #setPlacementObject(ObjectHandle)
	 * @see org.omg.cvl.CvlPackage#getParametricObjectSubstitution_PlacementObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectHandle getPlacementObject();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ParametricObjectSubstitution#getPlacementObject <em>Placement Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Object</em>' containment reference.
	 * @see #getPlacementObject()
	 * @generated
	 */
	void setPlacementObject(ObjectHandle value);

} // ParametricObjectSubstitution

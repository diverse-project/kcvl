/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VInstance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VInstance is a VSpecResolution which resolves a VClassifer by instantiating it. The childResolutions of a VInstance resolve the variability for this specific instance of the VClassifier.</p><p>####CVLSemanticStart####</p><p>Invariant : </p><p>The number of childResolutions must be between the lowerMultiplicity and the upperMultiplicity of the instanceMultiplicity if it exists.</p><p>If the instance multiplicity does not exists, we have only one child.</p><p>OCL :</p><p>-- VInstance</p><p>-- nbChildResolution_with_instanceMultiplicity :</p><p>-- The number of childResolutions must be between the lowerMultiplicity and the upperMultiplicity of the instanceMultiplicity if it exists</p><p>-- If the instance multiplicity does not exists, we have only one child.</p><p>context VInstance :</p><p>inv nbChildResolution_with_instanceMultiplicity :</p><p>if not self.type.instanceMultiplicity-&gt;isEmpty()</p><p>then (self.childResolution-&gt;size() &gt;= self.type.instanceMultiplicity.lower and self.type.instanceMultiplicity.lower &lt;&gt; -1</p><p>and self.childResolution-&gt;size() &lt;= self.type.instanceMultiplicity.upper and self.type.instanceMultiplicity.upper &lt;&gt; -1)</p><p>-- Infinite upper</p><p>or (self.type.instanceMultiplicity.lower &lt;&gt; -1 and self.type.instanceMultiplicity.upper == (-1) and self.childResolution-&gt;size() &gt;= self.type.instanceMultiplicity.lower )</p><p>-- infinite lower no sense for practical purposes</p><p>else</p><p>self.childResolution-&gt;size() == (1)</p><p>endif</p><p></p><p>Dynamic semantics</p><p>Pre and post condition</p><p>Pre-condition : </p><p>None </p><p>Post-condition: </p><p>After a VInstance has been executed, the associated VClassifier is contained in the selected VSpecs set.</p><p>OCL :</p><p>context VInstance::eval(ctx : CVLExecutionContext)</p><p>pre :</p><p>post : ctx.selectedVSpecs-&gt;includes(self.type)</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVInstance()
 * @model
 * @generated
 */
public interface VInstance extends VSpecResolution {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(VClassifier)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVInstance_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VClassifier getType();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VClassifier value);

} // VInstance

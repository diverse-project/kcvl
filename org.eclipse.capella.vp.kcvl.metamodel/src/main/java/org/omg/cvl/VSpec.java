/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VSpec (Variability specification) indicates the existence of abstract variability, i.e. it indicate variability without defining the concrete consequences on the base model. Such consequences are specified via variation points and are related to variability specifications via bindings.<br><br>VSpecs are organized as trees, representing logical constraints and guiding the materialization process. Each VSpec has a group multiplicity specifying upper and lower multiplicities against its children. The meaning of this is that each positive resolution against a VSpec must have a number of positive child resolutions conforming to the multiplicity interval. A VSpec resolution is positive if it is a choice decided positively, or any classifier instantiation, or any value assignment to a variable.</p><p>####CVLSemanticStart####</p><p><b></b>Invariant :<b></b> If the VSpec has a multiplicity interval, it must have a number of children included between the lowerMultiplicity and the upperMultiplicity</p><p><b></b>OCL :<b></b></p><p>-- VSpec</p><p>-- nbChild_with_MultiplicityInterval :</p><p>--If the VSpec has a multiplicity interval, it must have a number of children included between the lowerMultiplicity and the upperMultiplicity</p><p>context VSpec :</p><p>inv nbChild_with_MultiplicityInterval :</p><p>if not self.groupMultiplicity-&gt;isEmpty()</p><p>then (self.childVSpec-&gt;size() &gt;= self.groupMultiplicity.lower and self.groupMultiplicity.lower &lt;&gt; -1</p><p>and self.childVSpec-&gt;size() &lt;= self.groupMultiplicity.upper and self.groupMultiplicity.upper &lt;&gt; -1)</p><p>-- Infinite upper</p><p>or (self.groupMultiplicity.lower &lt;&gt; -1 and self.groupMultiplicity.upper == (-1) and self.childVSpec-&gt;size() &gt;= self.groupMultiplicity.lower )</p><p>-- Infinite lower : no sense for practical purposes</p><p>else true</p><p>endif</p><p></p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.VSpec#getGroupMultiplicity <em>Group Multiplicity</em>}</li>
 *   <li>{@link org.omg.cvl.VSpec#getResolutionTime <em>Resolution Time</em>}</li>
 *   <li>{@link org.omg.cvl.VSpec#getOwnedVSpecDerivation <em>Owned VSpec Derivation</em>}</li>
 *   <li>{@link org.omg.cvl.VSpec#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getVSpec()
 * @model abstract="true"
 * @generated
 */
public interface VSpec extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * The group multiplicity of the VSpec. If the VSpec is resolved positively and has a group multiplicity then the number
	 * of<br />
	 * its children resolved positively must conform to the specified multiplicity interval.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Multiplicity</em>' containment reference.
	 * @see #setGroupMultiplicity(MultiplicityInterval)
	 * @see org.omg.cvl.CvlPackage#getVSpec_GroupMultiplicity()
	 * @model containment="true"
	 * @generated
	 */
	MultiplicityInterval getGroupMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.cvl.VSpec#getGroupMultiplicity <em>Group Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Multiplicity</em>' containment reference.
	 * @see #getGroupMultiplicity()
	 * @generated
	 */
	void setGroupMultiplicity(MultiplicityInterval value);

	/**
	 * Returns the value of the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The latest life-cycle stage at which this VSpec is expected to be resolved, e.g. "Design", "Link", "Build", "PostBuild", etc.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Time</em>' attribute.
	 * @see #setResolutionTime(String)
	 * @see org.omg.cvl.CvlPackage#getVSpec_ResolutionTime()
	 * @model
	 * @generated
	 */
	String getResolutionTime();

	/**
	 * Sets the value of the '{@link org.omg.cvl.VSpec#getResolutionTime <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Time</em>' attribute.
	 * @see #getResolutionTime()
	 * @generated
	 */
	void setResolutionTime(String value);

	/**
	 * Returns the value of the '<em><b>Owned VSpec Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned VSpec Derivation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned VSpec Derivation</em>' containment reference.
	 * @see #setOwnedVSpecDerivation(VSpecDerivation)
	 * @see org.omg.cvl.CvlPackage#getVSpec_OwnedVSpecDerivation()
	 * @model containment="true"
	 * @generated
	 */
	VSpecDerivation getOwnedVSpecDerivation();

	/**
	 * Sets the value of the '{@link org.omg.cvl.VSpec#getOwnedVSpecDerivation <em>Owned VSpec Derivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned VSpec Derivation</em>' containment reference.
	 * @see #getOwnedVSpecDerivation()
	 * @generated
	 */
	void setOwnedVSpecDerivation(VSpecDerivation value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getVSpec_Child()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpec> getChild();

} // VSpec

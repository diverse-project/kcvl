/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VConfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Vconfiguration is a collection of variability resolutions made against a given configurable, i.e. a configurable unit or a configurable unit usage. The resolutions resolve VSpecs of the configurable's variability type (in case of a CU usage they resolve VSpecs of the variability type of the CU typing the usage).</p><p><br>A configuration C1 may have a preceding configuration C2. This indicates that C1 is meant to be applied after C2 has been applied, as part of a staged<br>A configuration meant to be applied before this one as part of a staged materialization process.</p><p></p><p>####CVLSemanticStart####</p><p>Invariant : The resolutions in a configuration resolve only VSpecs of its VInterface</p><p>OCL :</p><p>-- VConfiguration</p><p>-- The resolutions in a configuration resolve only VSpecs of its VInterface</p><p>def : isContained ( in vps : VSpec ) : Boolean = </p><p>                        self.resolvedVIRef.vInterface.vSpec-&gt;exists(v | v = vps </p><p>                        or </p><p>                        (  if   not (v.childVSpec-&gt;isEmpty())</p><p>                                        then</p><p>                                                v.childVSpec-&gt;exists (child | isContained (child) = true)</p><p>                                        endif</p><p>                                 )</p><p>                        )</p><p>context VConfiguration</p><p>inv resolve_only_vspec_in_VInterface :</p><p>        self.vSpecResolution-&gt;forAll(vspecRes | isContained(vspecRes.resolvedVSpec))</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#getSuper <em>Super</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#getResolvedVIRef <em>Resolved VI Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVConfiguration()
 * @model
 * @generated
 */
public interface VConfiguration extends VSpecResolution, VPackageable {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.VSpecResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVConfiguration_Member()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecResolution> getMember();

	/**
	 * Returns the value of the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Partial</em>' attribute.
	 * @see #setIsPartial(boolean)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVConfiguration_IsPartial()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPartial();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#isIsPartial <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Partial</em>' attribute.
	 * @see #isIsPartial()
	 * @generated
	 */
	void setIsPartial(boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(VConfiguration)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVConfiguration_Super()
	 * @model ordered="false"
	 * @generated
	 */
	VConfiguration getSuper();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(VConfiguration value);

	/**
	 * Returns the value of the '<em><b>Resolved VI Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved VI Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved VI Ref</em>' reference.
	 * @see #setResolvedVIRef(CVSpec)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVConfiguration_ResolvedVIRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CVSpec getResolvedVIRef();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration#getResolvedVIRef <em>Resolved VI Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved VI Ref</em>' reference.
	 * @see #getResolvedVIRef()
	 * @generated
	 */
	void setResolvedVIRef(CVSpec value);

} // VConfiguration

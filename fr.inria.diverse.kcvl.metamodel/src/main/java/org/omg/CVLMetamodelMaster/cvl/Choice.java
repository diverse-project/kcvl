/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A choice is a kind of VSpec indicating variability whose resolution requires a binary, yes/no decision. The details of such variability, which could for instance be the fact that some object in the base model is optional or that some substitution may be performed or not, may be specified by binding the choice to a variation point.</p><p>####CVLSemanticStart####</p><p><b></b>Invariant :<b></b> If a choice is implied by parent, it must have a parent.</p><p><b></b>OCL :<b></b></p><p>-- Choice</p><p>-- If a choice is implied by parent, it must have a parent.</p><p>context Choice :</p><p>inv isImpliedByParentsImpliesAParent :</p><p>self.isImpliedByParent implies VSpec.allInstances()-&gt;exists(vSpec | vSpec.childVSpec-&gt;includes(self))</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.Choice#isDefaultResolution <em>Default Resolution</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.Choice#isIsImpliedByParent <em>Is Implied By Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends VSpec {
	/**
	 * Returns the value of the '<em><b>Default Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Resolution</em>' attribute.
	 * @see #setDefaultResolution(boolean)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getChoice_DefaultResolution()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isDefaultResolution();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.Choice#isDefaultResolution <em>Default Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Resolution</em>' attribute.
	 * @see #isDefaultResolution()
	 * @generated
	 */
	void setDefaultResolution(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Implied By Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     When True then resolving the parent VSpec positively implies resolving this VSpec positively. A VSpec resolution is
	 *     positive if it is a choice decided positively, or any classifier instantiation, or any value assignment to a
	 *     variable.<br />
	 *     <br />
	 *     For a root VSpec, True implies it must be resolved positively.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Implied By Parent</em>' attribute.
	 * @see #setIsImpliedByParent(boolean)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getChoice_IsImpliedByParent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsImpliedByParent();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.Choice#isIsImpliedByParent <em>Is Implied By Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implied By Parent</em>' attribute.
	 * @see #isIsImpliedByParent()
	 * @generated
	 */
	void setIsImpliedByParent(boolean value);

} // Choice

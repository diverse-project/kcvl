/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><span style="font-size:10pt;">A configurable unit (CU) represents <span style="color:#000000;">a base model object which is a cohesive unit of variability, configurable as a whole</span>. The base model object is a container of other base model elements – objects and links – and the CVL configurable unit is a container of variation points defined against those elements, variability specifications, and bindings between them. For example, a configurable unit may have associated with it a UML package and contain variation points defined over elements in that package.</span></p><p><span style="font-size:10pt;">A CU may be encapsulated or not. An encapsulated CU is black-box with respect to its internal variability. It exposes to the external world a variability interface, which is a VSpec tree or trees. The configurable unit may then be configured by providing resolutions to those VSpecs, not its internal ones. Resolutions for the internal VSpecs are derived through a variability mapping between the internal VSpecs and the VSpecs on the interface. Mappings are logical implications between VSpecs and should not be confused with bindings, which tie VSpecs to variation points. A non-encapsulated CU does not expose a variability interface and is configured via configurations which directly resolve its internal VSpecs. In any case, each CU has a derived variability type. For encapsulated CUs the variability type is the set of VSpecs in the explicitly exposed interface. For a non-encapsulated CU the variability type is the set of internal VSpecs.<br><br>Conceptually, a configurable unit and the base model object associated with it are one unified entity representing a base model container with variability on its internal content. So the UML package above may be thought of as being configurable though technically it is an external CVL element referencing the object through a handle.<br><br>CVL configurable units may contain other units, re-iterating the modular structure of the base model. For example, a UML package and a contained class may both be configurable, which means there will be two CVL configurable units, one for the package and one for the class, where the unit for the package contains that for the class. It may further be specified that materialization of the class is triggered by materialization of the package, using a configuration connector.</span></p><p><span style="font-size:10pt;">####CVLSemanticStart####</span></p><p>Invariant : </p><p >Elements contained in the Configurable Unit associated with a given CVSpec must only point on elements in Interface associated with this given CVSpec</p><p></p><p>OCL :</p><p></p><p>-- ConfigurableUnit </p><p>-- Elements contained in the Configurable Unit associated with a given CVSpec must only point on elements</p><p>-- in Interface associated with this given CVSpec</p><p>context ConfigurableUnit :</p><p>def : isContained ( in vps : VSpec ) : Boolean = </p><p>                        self.bindingCVSpec.vInterface.vSpec-&gt;exists(v | v = vps </p><p>                        or </p><p>                        (  if   not (v.childVSpec-&gt;isEmpty())</p><p>                                        then</p><p>                                                v.childVSpec-&gt;exists (child | isContained (child) = true)</p><p>                                        endif</p><p>                                 )</p><p>                        )</p><p>inv consistencyInInterfacePointedByCVSpec : </p><p>        not (self.ownedVariationPoint-&gt;exists (vp | </p><p>                        -- search in the VSpec</p><p>                        ( vp.bindingVspec-&gt;exists ( vsp | not isContained(vsp) ) )</p><p>                ))</p><p>####CVLSemanticEnd####</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.ConfigurableUnit#getOwnedVSpec <em>Owned VSpec</em>}</li>
 *   <li>{@link org.omg.cvl.ConfigurableUnit#getOwnedVariationPoint <em>Owned Variation Point</em>}</li>
 *   <li>{@link org.omg.cvl.ConfigurableUnit#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.cvl.ConfigurableUnit#getConfigurableContainerObject <em>Configurable Container Object</em>}</li>
 *   <li>{@link org.omg.cvl.ConfigurableUnit#getOwnedVSpecResolution <em>Owned VSpec Resolution</em>}</li>
 *   <li>{@link org.omg.cvl.ConfigurableUnit#getUnitInterface <em>Unit Interface</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getConfigurableUnit()
 * @model
 * @generated
 */
public interface ConfigurableUnit extends CompositeVariationPoint {
	/**
	 * Returns the value of the '<em><b>Owned VSpec</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Internal VSpecs of the CU</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned VSpec</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getConfigurableUnit_OwnedVSpec()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpec> getOwnedVSpec();

	/**
	 * Returns the value of the '<em><b>Owned Variation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VariationPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal variation points against the content of the base model object referenced by the unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Variation Point</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getConfigurableUnit_OwnedVariationPoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariationPoint> getOwnedVariationPoint();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraints wrt the internal VSPecs of the unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getConfigurableUnit_OwnedConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Configurable Container Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The container object in the base model which is configurable.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configurable Container Object</em>' containment reference.
	 * @see #setConfigurableContainerObject(ObjectHandle)
	 * @see org.omg.cvl.CvlPackage#getConfigurableUnit_ConfigurableContainerObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectHandle getConfigurableContainerObject();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ConfigurableUnit#getConfigurableContainerObject <em>Configurable Container Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable Container Object</em>' containment reference.
	 * @see #getConfigurableContainerObject()
	 * @generated
	 */
	void setConfigurableContainerObject(ObjectHandle value);

	/**
	 * Returns the value of the '<em><b>Owned VSpec Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VSpecResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned VSpec Resolution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned VSpec Resolution</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getConfigurableUnit_OwnedVSpecResolution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecResolution> getOwnedVSpecResolution();

	/**
	 * Returns the value of the '<em><b>Unit Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The interface of the unit. Derived as the extension of the binding CVSpec.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Interface</em>' reference.
	 * @see #setUnitInterface(VInterface)
	 * @see org.omg.cvl.CvlPackage#getConfigurableUnit_UnitInterface()
	 * @model required="true"
	 * @generated
	 */
	VInterface getUnitInterface();

	/**
	 * Sets the value of the '{@link org.omg.cvl.ConfigurableUnit#getUnitInterface <em>Unit Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Interface</em>' reference.
	 * @see #getUnitInterface()
	 * @generated
	 */
	void setUnitInterface(VInterface value);

} // ConfigurableUnit

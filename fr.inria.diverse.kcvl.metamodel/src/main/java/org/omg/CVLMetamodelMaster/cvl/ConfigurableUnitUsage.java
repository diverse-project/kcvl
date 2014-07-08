/**
 */
package org.omg.CVLMetamodelMaster.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurable Unit Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage#getUsedUnit <em>Used Unit</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage#getUsageReference <em>Usage Reference</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage#getLinkEndIdentifier <em>Link End Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getConfigurableUnitUsage()
 * @model
 * @generated
 */
public interface ConfigurableUnitUsage extends CompositeVariationPoint {
	/**
	 * Returns the value of the '<em><b>Used Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Unit</em>' reference.
	 * @see #setUsedUnit(ConfigurableUnit)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getConfigurableUnitUsage_UsedUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConfigurableUnit getUsedUnit();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage#getUsedUnit <em>Used Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Unit</em>' reference.
	 * @see #getUsedUnit()
	 * @generated
	 */
	void setUsedUnit(ConfigurableUnit value);

	/**
	 * Returns the value of the '<em><b>Usage Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Reference</em>' containment reference.
	 * @see #setUsageReference(LinkHandle)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getConfigurableUnitUsage_UsageReference()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	LinkHandle getUsageReference();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage#getUsageReference <em>Usage Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Reference</em>' containment reference.
	 * @see #getUsageReference()
	 * @generated
	 */
	void setUsageReference(LinkHandle value);

	/**
	 * Returns the value of the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link End Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link End Identifier</em>' attribute.
	 * @see #setLinkEndIdentifier(String)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getConfigurableUnitUsage_LinkEndIdentifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLinkEndIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage#getLinkEndIdentifier <em>Link End Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link End Identifier</em>' attribute.
	 * @see #getLinkEndIdentifier()
	 * @generated
	 */
	void setLinkEndIdentifier(String value);

} // ConfigurableUnitUsage

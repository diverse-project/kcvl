/**
 */
package org.omg.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A VPacakge (Variability Package) is the packaging mechanism of CVL.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.VPackage#getPackageElement <em>Package Element</em>}</li>
 *   <li>{@link org.omg.cvl.VPackage#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getVPackage()
 * @model
 * @generated
 */
public interface VPackage extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Package Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.VPackageable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Element</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getVPackage_PackageElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VPackageable> getPackageElement();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.cvl.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.omg.cvl.CvlPackage#getVPackage_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // VPackage

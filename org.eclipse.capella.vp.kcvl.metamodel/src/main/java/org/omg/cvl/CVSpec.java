/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A CVspec (Composite VSpec) is a kind of VSpec indicating that a base model element has inner variability as indicated by the extension of the CVSpec, which is a set of VSpecs.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.CVSpec#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getCVSpec()
 * @model
 * @generated
 */
public interface CVSpec extends VSpec {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The VInterface  whose members need to be resolved in order to resolve the CVSpec.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(VInterface)
	 * @see org.omg.cvl.CvlPackage#getCVSpec_Extension()
	 * @model required="true"
	 * @generated
	 */
	VInterface getExtension();

	/**
	 * Sets the value of the '{@link org.omg.cvl.CVSpec#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(VInterface value);

} // CVSpec

/**
 */
package org.omg.cvl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.cvl.CvlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface CvlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cvl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///omg.org/cvl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cvl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CvlPackage eINSTANCE = org.omg.cvl.impl.CvlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VPackageableImpl <em>VPackageable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VPackageableImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVPackageable()
	 * @generated
	 */
	int VPACKAGEABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>VPackageable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGEABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VPackageable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VSpecImpl <em>VSpec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VSpecImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpec()
	 * @generated
	 */
	int VSPEC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC__GROUP_MULTIPLICITY = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC__RESOLUTION_TIME = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned VSpec Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC__OWNED_VSPEC_DERIVATION = VPACKAGEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC__CHILD = VPACKAGEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSpec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSpec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ChoiceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = VSPEC__NAME;

	/**
	 * The feature id for the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__GROUP_MULTIPLICITY = VSPEC__GROUP_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__RESOLUTION_TIME = VSPEC__RESOLUTION_TIME;

	/**
	 * The feature id for the '<em><b>Owned VSpec Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__OWNED_VSPEC_DERIVATION = VSPEC__OWNED_VSPEC_DERIVATION;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CHILD = VSPEC__CHILD;

	/**
	 * The feature id for the '<em><b>Default Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DEFAULT_RESOLUTION = VSPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Implied By Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IS_IMPLIED_BY_PARENT = VSPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = VSPEC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = VSPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.MultiplicityIntervalImpl <em>Multiplicity Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.MultiplicityIntervalImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getMultiplicityInterval()
	 * @generated
	 */
	int MULTIPLICITY_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_INTERVAL__UPPER = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_INTERVAL__LOWER = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_INTERVAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multiplicity Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VSpecDerivationImpl <em>VSpec Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VSpecDerivationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecDerivation()
	 * @generated
	 */
	int VSPEC_DERIVATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_DERIVATION__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Derived VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_DERIVATION__DERIVED_VSPEC = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSpec Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_DERIVATION_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSpec Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_DERIVATION_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VClassifierImpl <em>VClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VClassifierImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVClassifier()
	 * @generated
	 */
	int VCLASSIFIER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER__NAME = VSPEC__NAME;

	/**
	 * The feature id for the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER__GROUP_MULTIPLICITY = VSPEC__GROUP_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER__RESOLUTION_TIME = VSPEC__RESOLUTION_TIME;

	/**
	 * The feature id for the '<em><b>Owned VSpec Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER__OWNED_VSPEC_DERIVATION = VSPEC__OWNED_VSPEC_DERIVATION;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER__CHILD = VSPEC__CHILD;

	/**
	 * The feature id for the '<em><b>Instance Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER__INSTANCE_MULTIPLICITY = VSPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER_FEATURE_COUNT = VSPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCLASSIFIER_OPERATION_COUNT = VSPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VSpecResolutionImpl <em>VSpec Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VSpecResolutionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecResolution()
	 * @generated
	 */
	int VSPEC_RESOLUTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_RESOLUTION__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_RESOLUTION__RESOLVED_VSPEC = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_RESOLUTION__CHILD = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSpec Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_RESOLUTION_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSpec Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_RESOLUTION_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ChoiceResolutuionImpl <em>Choice Resolutuion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ChoiceResolutuionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getChoiceResolutuion()
	 * @generated
	 */
	int CHOICE_RESOLUTUION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION__NAME = VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION__RESOLVED_VSPEC = VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION__CHILD = VSPEC_RESOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Resolved Choice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION__RESOLVED_CHOICE = VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION__DECISION = VSPEC_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice Resolutuion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION_FEATURE_COUNT = VSPEC_RESOLUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choice Resolutuion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTUION_OPERATION_COUNT = VSPEC_RESOLUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VInstanceImpl <em>VInstance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VInstanceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVInstance()
	 * @generated
	 */
	int VINSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__NAME = VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__RESOLVED_VSPEC = VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__CHILD = VSPEC_RESOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__TYPE = VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VInstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE_FEATURE_COUNT = VSPEC_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VInstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE_OPERATION_COUNT = VSPEC_RESOLUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VariationPointImpl <em>Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VariationPointImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVariationPoint()
	 * @generated
	 */
	int VARIATION_POINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__BINDING_VSPEC = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__PRECEDENCE_CONSTRAINT = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ChoiceVariationPointImpl <em>Choice Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ChoiceVariationPointImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getChoiceVariationPoint()
	 * @generated
	 */
	int CHOICE_VARIATION_POINT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT__NAME = VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT__BINDING_VSPEC = VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT = VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT__BINDING_CHOICE = VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT__MAPPING_EXPRESSION = VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT__EXPRESSION = VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Choice Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT_FEATURE_COUNT = VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Choice Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_VARIATION_POINT_OPERATION_COUNT = VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.FragmentSubstitutionImpl <em>Fragment Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.FragmentSubstitutionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getFragmentSubstitution()
	 * @generated
	 */
	int FRAGMENT_SUBSTITUTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__BINDING_CLASSIFIER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Element Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__BOUNDARY_ELEMENT_BINDING = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__PLACEMENT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__MULTI = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Replacement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION__REPLACEMENT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fragment Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Fragment Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_SUBSTITUTION_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.RepeatableVariationPointImpl <em>Repeatable Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.RepeatableVariationPointImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getRepeatableVariationPoint()
	 * @generated
	 */
	int REPEATABLE_VARIATION_POINT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATABLE_VARIATION_POINT__NAME = VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATABLE_VARIATION_POINT__BINDING_VSPEC = VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATABLE_VARIATION_POINT__PRECEDENCE_CONSTRAINT = VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATABLE_VARIATION_POINT__BINDING_CLASSIFIER = VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeatable Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATABLE_VARIATION_POINT_FEATURE_COUNT = VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeatable Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATABLE_VARIATION_POINT_OPERATION_COUNT = VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.BoundaryElementBindingImpl <em>Boundary Element Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.BoundaryElementBindingImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getBoundaryElementBinding()
	 * @generated
	 */
	int BOUNDARY_ELEMENT_BINDING = 13;

	/**
	 * The number of structural features of the '<em>Boundary Element Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boundary Element Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_ELEMENT_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.PlacementFragmentImpl <em>Placement Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.PlacementFragmentImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPlacementFragment()
	 * @generated
	 */
	int PLACEMENT_FRAGMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FRAGMENT__NAME = VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FRAGMENT__BINDING_VSPEC = VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FRAGMENT__PRECEDENCE_CONSTRAINT = VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Placement Boundary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FRAGMENT__PLACEMENT_BOUNDARY_ELEMENT = VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Placement Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FRAGMENT_FEATURE_COUNT = VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Placement Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FRAGMENT_OPERATION_COUNT = VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.PlacementBoundaryElementImpl <em>Placement Boundary Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.PlacementBoundaryElementImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPlacementBoundaryElement()
	 * @generated
	 */
	int PLACEMENT_BOUNDARY_ELEMENT = 15;

	/**
	 * The number of structural features of the '<em>Placement Boundary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Placement Boundary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_BOUNDARY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VariabletypeImpl <em>Variabletype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VariabletypeImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVariabletype()
	 * @generated
	 */
	int VARIABLETYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLETYPE__NAME = VPACKAGEABLE__NAME;

	/**
	 * The number of structural features of the '<em>Variabletype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLETYPE_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variabletype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLETYPE_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ReplacementFragmentTypeImpl <em>Replacement Fragment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ReplacementFragmentTypeImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getReplacementFragmentType()
	 * @generated
	 */
	int REPLACEMENT_FRAGMENT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_TYPE__NAME = VARIABLETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Replacement Boundary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_TYPE__REPLACEMENT_BOUNDARY_ELEMENT = VARIABLETYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placement Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_TYPE__PLACEMENT_FRAGMENT = VARIABLETYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replacement Fragment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_TYPE_FEATURE_COUNT = VARIABLETYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Replacement Fragment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_TYPE_OPERATION_COUNT = VARIABLETYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ReplacementBoundaryElementImpl <em>Replacement Boundary Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ReplacementBoundaryElementImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getReplacementBoundaryElement()
	 * @generated
	 */
	int REPLACEMENT_BOUNDARY_ELEMENT = 18;

	/**
	 * The number of structural features of the '<em>Replacement Boundary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Replacement Boundary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_BOUNDARY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ObjectSubstitutionImpl <em>Object Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ObjectSubstitutionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectSubstitution()
	 * @generated
	 */
	int OBJECT_SUBSTITUTION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Placement Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__PLACEMENT_OBJECT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replacement Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION__REPLACEMENT_OBJECT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SUBSTITUTION_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.BaseModelHandleImpl <em>Base Model Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.BaseModelHandleImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getBaseModelHandle()
	 * @generated
	 */
	int BASE_MODEL_HANDLE = 21;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_HANDLE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_HANDLE__REFERENCE_STRING = 1;

	/**
	 * The number of structural features of the '<em>Base Model Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_HANDLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Model Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_HANDLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ObjectHandleImpl <em>Object Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ObjectHandleImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectHandle()
	 * @generated
	 */
	int OBJECT_HANDLE = 20;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HANDLE__REFERENCE = BASE_MODEL_HANDLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HANDLE__REFERENCE_STRING = BASE_MODEL_HANDLE__REFERENCE_STRING;

	/**
	 * The feature id for the '<em><b>MOF Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HANDLE__MOF_REF = BASE_MODEL_HANDLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HANDLE_FEATURE_COUNT = BASE_MODEL_HANDLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HANDLE_OPERATION_COUNT = BASE_MODEL_HANDLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ExistenceImpl <em>Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ExistenceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getExistence()
	 * @generated
	 */
	int EXISTENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VariableImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VSPEC__NAME;

	/**
	 * The feature id for the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GROUP_MULTIPLICITY = VSPEC__GROUP_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RESOLUTION_TIME = VSPEC__RESOLUTION_TIME;

	/**
	 * The feature id for the '<em><b>Owned VSpec Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNED_VSPEC_DERIVATION = VSPEC__OWNED_VSPEC_DERIVATION;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CHILD = VSPEC__CHILD;

	/**
	 * The feature id for the '<em><b>Replacement Fragment Typesubsetstype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REPLACEMENT_FRAGMENT_TYPESUBSETSTYPE = VSPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defaul Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAUL_VALUE = VSPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = VSPEC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VSPEC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VSPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ValueSpecificationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VariableValueAssignmentImpl <em>Variable Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VariableValueAssignmentImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVariableValueAssignment()
	 * @generated
	 */
	int VARIABLE_VALUE_ASSIGNMENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__NAME = VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VSPEC = VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__CHILD = VSPEC_RESOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Resolved Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VARIABLE = VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__VALUE = VSPEC_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT_FEATURE_COUNT = VSPEC_RESOLUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT_OPERATION_COUNT = VSPEC_RESOLUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.PrimitveTypeImpl <em>Primitve Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.PrimitveTypeImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPrimitveType()
	 * @generated
	 */
	int PRIMITVE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITVE_TYPE__NAME = VARIABLETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITVE_TYPE__TYPE = VARIABLETYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITVE_TYPE_FEATURE_COUNT = VARIABLETYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitve Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITVE_TYPE_OPERATION_COUNT = VARIABLETYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ObjectTypeImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__NAME = VARIABLETYPE__NAME;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__META_CLASS = VARIABLETYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = VARIABLETYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_OPERATION_COUNT = VARIABLETYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VInterfaceImpl <em>VInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VInterfaceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVInterface()
	 * @generated
	 */
	int VINTERFACE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINTERFACE__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINTERFACE__MEMBER = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINTERFACE__OWNED_CONSTRAINT = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINTERFACE__SUPER = VPACKAGEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINTERFACE_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINTERFACE_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ConstraintImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTEXT = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.SlotAssignmentImpl <em>Slot Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.SlotAssignmentImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getSlotAssignment()
	 * @generated
	 */
	int SLOT_ASSIGNMENT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Slot Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__SLOT_IDENTIFIER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__VALUE = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slot Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT__SLOT_OWNER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slot Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slot Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_ASSIGNMENT_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.FixedSlotValueAssignmentImpl <em>Fixed Slot Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.FixedSlotValueAssignmentImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getFixedSlotValueAssignment()
	 * @generated
	 */
	int FIXED_SLOT_VALUE_ASSIGNMENT = 31;

	/**
	 * The number of structural features of the '<em>Fixed Slot Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_SLOT_VALUE_ASSIGNMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fixed Slot Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_SLOT_VALUE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.FixedObjectSubstitutionImpl <em>Fixed Object Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.FixedObjectSubstitutionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getFixedObjectSubstitution()
	 * @generated
	 */
	int FIXED_OBJECT_SUBSTITUTION = 32;

	/**
	 * The number of structural features of the '<em>Fixed Object Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OBJECT_SUBSTITUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fixed Object Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OBJECT_SUBSTITUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ObjectExistenceImpl <em>Object Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ObjectExistenceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectExistence()
	 * @generated
	 */
	int OBJECT_EXISTENCE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__NAME = EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__BINDING_VSPEC = EXISTENCE__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__PRECEDENCE_CONSTRAINT = EXISTENCE__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__BINDING_CHOICE = EXISTENCE__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__MAPPING_EXPRESSION = EXISTENCE__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__EXPRESSION = EXISTENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Optional Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE__OPTIONAL_OBJECT = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXISTENCE_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.LinkAssignmentImpl <em>Link Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.LinkAssignmentImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getLinkAssignment()
	 * @generated
	 */
	int LINK_ASSIGNMENT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__LINK = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__LINK_END_IDENTIFIER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT__NEW_END = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASSIGNMENT_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.LinkHandleImpl <em>Link Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.LinkHandleImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getLinkHandle()
	 * @generated
	 */
	int LINK_HANDLE = 35;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HANDLE__REFERENCE = BASE_MODEL_HANDLE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HANDLE__REFERENCE_STRING = BASE_MODEL_HANDLE__REFERENCE_STRING;

	/**
	 * The feature id for the '<em><b>MOF Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HANDLE__MOF_REF = BASE_MODEL_HANDLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HANDLE_FEATURE_COUNT = BASE_MODEL_HANDLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HANDLE_OPERATION_COUNT = BASE_MODEL_HANDLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.CompositeVariationPointImpl <em>Composite Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.CompositeVariationPointImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getCompositeVariationPoint()
	 * @generated
	 */
	int COMPOSITE_VARIATION_POINT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT__NAME = VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT__BINDING_VSPEC = VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT__PRECEDENCE_CONSTRAINT = VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding CV Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC = VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT__CHILDREN = VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT_FEATURE_COUNT = VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VARIATION_POINT_OPERATION_COUNT = VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ConfigurableUnitImpl <em>Configurable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ConfigurableUnitImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getConfigurableUnit()
	 * @generated
	 */
	int CONFIGURABLE_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__NAME = COMPOSITE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__BINDING_VSPEC = COMPOSITE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__PRECEDENCE_CONSTRAINT = COMPOSITE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding CV Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__BINDING_CV_SPEC = COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__CHILDREN = COMPOSITE_VARIATION_POINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Owned VSpec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__OWNED_VSPEC = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Variation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__OWNED_VARIATION_POINT = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__OWNED_CONSTRAINT = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configurable Container Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned VSpec Resolution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unit Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT__UNIT_INTERFACE = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configurable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_FEATURE_COUNT = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Configurable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_OPERATION_COUNT = COMPOSITE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.CVSpecImpl <em>CV Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.CVSpecImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getCVSpec()
	 * @generated
	 */
	int CV_SPEC = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC__NAME = VSPEC__NAME;

	/**
	 * The feature id for the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC__GROUP_MULTIPLICITY = VSPEC__GROUP_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC__RESOLUTION_TIME = VSPEC__RESOLUTION_TIME;

	/**
	 * The feature id for the '<em><b>Owned VSpec Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC__OWNED_VSPEC_DERIVATION = VSPEC__OWNED_VSPEC_DERIVATION;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC__CHILD = VSPEC__CHILD;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC__EXTENSION = VSPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CV Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_FEATURE_COUNT = VSPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CV Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_OPERATION_COUNT = VSPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VConfigurationImpl <em>VConfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VConfigurationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVConfiguration()
	 * @generated
	 */
	int VCONFIGURATION = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__NAME = VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__RESOLVED_VSPEC = VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__CHILD = VSPEC_RESOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__MEMBER = VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__IS_PARTIAL = VSPEC_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__SUPER = VSPEC_RESOLUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved VI Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION__RESOLVED_VI_REF = VSPEC_RESOLUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VConfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION_FEATURE_COUNT = VSPEC_RESOLUTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VConfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONFIGURATION_OPERATION_COUNT = VSPEC_RESOLUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VSpec2VSpecMappingImpl <em>VSpec2 VSpec Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VSpec2VSpecMappingImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpec2VSpecMapping()
	 * @generated
	 */
	int VSPEC2_VSPEC_MAPPING = 40;

	/**
	 * The feature id for the '<em><b>Deriving Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>VSpec2 VSpec Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC2_VSPEC_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSpec2 VSpec Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC2_VSPEC_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OpaqueConstraintImpl <em>Opaque Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OpaqueConstraintImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOpaqueConstraint()
	 * @generated
	 */
	int OPAQUE_CONSTRAINT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CONSTRAINT__CONTEXT = CONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CONSTRAINT__CONSTRAINT_LANGUAGE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Opaque Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.LinkExistenceImpl <em>Link Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.LinkExistenceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getLinkExistence()
	 * @generated
	 */
	int LINK_EXISTENCE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__NAME = EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__BINDING_VSPEC = EXISTENCE__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__PRECEDENCE_CONSTRAINT = EXISTENCE__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__BINDING_CHOICE = EXISTENCE__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__MAPPING_EXPRESSION = EXISTENCE__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__EXPRESSION = EXISTENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Optional Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE__OPTIONAL_LINK = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EXISTENCE_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OpaqueVariationPointImpl <em>Opaque Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OpaqueVariationPointImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOpaqueVariationPoint()
	 * @generated
	 */
	int OPAQUE_VARIATION_POINT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__PLACE_HOLDER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__SOURCE_OBJECT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT__TYPE = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Opaque Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Opaque Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_VARIATION_POINT_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OVPTypeImpl <em>OVP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OVPTypeImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOVPType()
	 * @generated
	 */
	int OVP_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_TYPE__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_TYPE__SPEC = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OVP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_TYPE_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OVP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_TYPE_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OVPSemanticSpecImpl <em>OVP Semantic Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OVPSemanticSpecImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOVPSemanticSpec()
	 * @generated
	 */
	int OVP_SEMANTIC_SPEC = 45;

	/**
	 * The feature id for the '<em><b>Model Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_SEMANTIC_SPEC__MODEL_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Transfromation Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_SEMANTIC_SPEC__TRANSFROMATION_LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>OVP Semantic Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_SEMANTIC_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OVP Semantic Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVP_SEMANTIC_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ObjectSpecificationImpl <em>Object Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ObjectSpecificationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectSpecification()
	 * @generated
	 */
	int OBJECT_SPECIFICATION = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SPECIFICATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SPECIFICATION__OBJECT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ReplacementFragmentSpecificationImpl <em>Replacement Fragment Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ReplacementFragmentSpecificationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getReplacementFragmentSpecification()
	 * @generated
	 */
	int REPLACEMENT_FRAGMENT_SPECIFICATION = 47;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_SPECIFICATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Replacement Fragment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Replacement Fragment Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_FRAGMENT_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VPackageImpl <em>VPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VPackageImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVPackage()
	 * @generated
	 */
	int VPACKAGE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__NAME = VPACKAGEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Package Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__PACKAGE_ELEMENT = VPACKAGEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE__IMPORTS = VPACKAGEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_FEATURE_COUNT = VPACKAGEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_OPERATION_COUNT = VPACKAGEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ToBindingImpl <em>To Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ToBindingImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getToBinding()
	 * @generated
	 */
	int TO_BINDING = 49;

	/**
	 * The feature id for the '<em><b>To Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_BINDING__TO_PLACEMENT = BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Replacement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_BINDING__TO_REPLACEMENT = BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_BINDING_FEATURE_COUNT = BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_BINDING_OPERATION_COUNT = BOUNDARY_ELEMENT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ToPlacementImpl <em>To Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ToPlacementImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getToPlacement()
	 * @generated
	 */
	int TO_PLACEMENT = 50;

	/**
	 * The feature id for the '<em><b>To Replacement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PLACEMENT__TO_REPLACEMENT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PLACEMENT__PROPERTY_NAME = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inside Boundary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outside Boundary Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>To Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PLACEMENT_FEATURE_COUNT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>To Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PLACEMENT_OPERATION_COUNT = PLACEMENT_BOUNDARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ToReplacementImpl <em>To Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ToReplacementImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getToReplacement()
	 * @generated
	 */
	int TO_REPLACEMENT = 51;

	/**
	 * The feature id for the '<em><b>Inside Boundary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_REPLACEMENT__TO_PLACEMENT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_REPLACEMENT_FEATURE_COUNT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>To Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_REPLACEMENT_OPERATION_COUNT = REPLACEMENT_BOUNDARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.FromBindingImpl <em>From Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.FromBindingImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getFromBinding()
	 * @generated
	 */
	int FROM_BINDING = 52;

	/**
	 * The feature id for the '<em><b>From Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_BINDING__FROM_PLACEMENT = BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Replacement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_BINDING__FROM_REPLACEMENT = BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>From Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_BINDING_FEATURE_COUNT = BOUNDARY_ELEMENT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>From Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_BINDING_OPERATION_COUNT = BOUNDARY_ELEMENT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.FromPlacementImpl <em>From Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.FromPlacementImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getFromPlacement()
	 * @generated
	 */
	int FROM_PLACEMENT = 53;

	/**
	 * The feature id for the '<em><b>From Replacement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PLACEMENT__FROM_REPLACEMENT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outside Boundary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>From Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PLACEMENT_FEATURE_COUNT = PLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>From Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PLACEMENT_OPERATION_COUNT = PLACEMENT_BOUNDARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.FromReplacementImpl <em>From Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.FromReplacementImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getFromReplacement()
	 * @generated
	 */
	int FROM_REPLACEMENT = 54;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_REPLACEMENT__PROPERTY_NAME = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inside Boundary Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outside Boundary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_REPLACEMENT__FROM_PLACEMENT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>From Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_REPLACEMENT_FEATURE_COUNT = REPLACEMENT_BOUNDARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>From Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_REPLACEMENT_OPERATION_COUNT = REPLACEMENT_BOUNDARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OCLExpressionImpl <em>OCL Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OCLExpressionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOCLExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 56;

	/**
	 * The number of structural features of the '<em>OCL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>OCL Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VSpecRefImpl <em>VSpec Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VSpecRefImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecRef()
	 * @generated
	 */
	int VSPEC_REF = 55;

	/**
	 * The feature id for the '<em><b>VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_REF__VSPEC = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSpec Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_REF_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSpec Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_REF_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VSpecToConfigMappingImpl <em>VSpec To Config Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VSpecToConfigMappingImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecToConfigMapping()
	 * @generated
	 */
	int VSPEC_TO_CONFIG_MAPPING = 57;

	/**
	 * The feature id for the '<em><b>Then Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>If Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>VSpec To Config Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_TO_CONFIG_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSpec To Config Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSPEC_TO_CONFIG_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ParametricVariationPointImpl <em>Parametric Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ParametricVariationPointImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricVariationPoint()
	 * @generated
	 */
	int PARAMETRIC_VARIATION_POINT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_VARIATION_POINT__NAME = VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_VARIATION_POINT__BINDING_VSPEC = VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_VARIATION_POINT__PRECEDENCE_CONSTRAINT = VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_VARIATION_POINT__BINDING_VARIABLE = VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametric Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_VARIATION_POINT_FEATURE_COUNT = VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametric Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_VARIATION_POINT_OPERATION_COUNT = VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.SlotValueExistenceImpl <em>Slot Value Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.SlotValueExistenceImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getSlotValueExistence()
	 * @generated
	 */
	int SLOT_VALUE_EXISTENCE = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__NAME = EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__BINDING_VSPEC = EXISTENCE__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__PRECEDENCE_CONSTRAINT = EXISTENCE__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__BINDING_CHOICE = EXISTENCE__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__MAPPING_EXPRESSION = EXISTENCE__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__EXPRESSION = EXISTENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Slot Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__SLOT_IDENTIFIER = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE__SLOT_OWNER = EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slot Value Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slot Value Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_VALUE_EXISTENCE_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ParametricLinkAssignmentImpl <em>Parametric Link Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ParametricLinkAssignmentImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricLinkAssignment()
	 * @generated
	 */
	int PARAMETRIC_LINK_ASSIGNMENT = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT__NAME = PARAMETRIC_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT__BINDING_VSPEC = PARAMETRIC_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT__PRECEDENCE_CONSTRAINT = PARAMETRIC_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT__BINDING_VARIABLE = PARAMETRIC_VARIATION_POINT__BINDING_VARIABLE;

	/**
	 * The feature id for the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT__LINK_END_IDENTIFIER = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT__LINK = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parametric Link Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT_FEATURE_COUNT = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parametric Link Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_LINK_ASSIGNMENT_OPERATION_COUNT = PARAMETRIC_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ParametricObjectSubstitutionImpl <em>Parametric Object Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ParametricObjectSubstitutionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricObjectSubstitution()
	 * @generated
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION__NAME = PARAMETRIC_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION__BINDING_VSPEC = PARAMETRIC_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION__PRECEDENCE_CONSTRAINT = PARAMETRIC_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION__BINDING_VARIABLE = PARAMETRIC_VARIATION_POINT__BINDING_VARIABLE;

	/**
	 * The feature id for the '<em><b>Placement Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION__PLACEMENT_OBJECT = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametric Object Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION_FEATURE_COUNT = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametric Object Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_OBJECT_SUBSTITUTION_OPERATION_COUNT = PARAMETRIC_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ParametricSlotAssignmetImpl <em>Parametric Slot Assignmet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ParametricSlotAssignmetImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricSlotAssignmet()
	 * @generated
	 */
	int PARAMETRIC_SLOT_ASSIGNMET = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET__NAME = PARAMETRIC_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET__BINDING_VSPEC = PARAMETRIC_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET__PRECEDENCE_CONSTRAINT = PARAMETRIC_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET__BINDING_VARIABLE = PARAMETRIC_VARIATION_POINT__BINDING_VARIABLE;

	/**
	 * The feature id for the '<em><b>Slot Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET__SLOT_IDENTIFIER = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET__SLOT_OWNER = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parametric Slot Assignmet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET_FEATURE_COUNT = PARAMETRIC_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parametric Slot Assignmet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_SLOT_ASSIGNMET_OPERATION_COUNT = PARAMETRIC_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ChoiceDerivationImpl <em>Choice Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ChoiceDerivationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getChoiceDerivation()
	 * @generated
	 */
	int CHOICE_DERIVATION = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_DERIVATION__NAME = VSPEC_DERIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Derived VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_DERIVATION__DERIVED_VSPEC = VSPEC_DERIVATION__DERIVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Deriving Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_DERIVATION__DERIVING_CONSTRAINT = VSPEC_DERIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_DERIVATION_FEATURE_COUNT = VSPEC_DERIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_DERIVATION_OPERATION_COUNT = VSPEC_DERIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.VariableDerivationImpl <em>Variable Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.VariableDerivationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getVariableDerivation()
	 * @generated
	 */
	int VARIABLE_DERIVATION = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DERIVATION__NAME = VSPEC_DERIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Derived VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DERIVATION__DERIVED_VSPEC = VSPEC_DERIVATION__DERIVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Deriving Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DERIVATION__DERIVING_EXPRESSION = VSPEC_DERIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DERIVATION_FEATURE_COUNT = VSPEC_DERIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DERIVATION_OPERATION_COUNT = VSPEC_DERIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.CVSpecDerivationImpl <em>CV Spec Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.CVSpecDerivationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getCVSpecDerivation()
	 * @generated
	 */
	int CV_SPEC_DERIVATION = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_DERIVATION__NAME = VSPEC_DERIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Derived VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_DERIVATION__DERIVED_VSPEC = VSPEC_DERIVATION__DERIVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Member Derivation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_DERIVATION__MEMBER_DERIVATION = VSPEC_DERIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CV Spec Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_DERIVATION_FEATURE_COUNT = VSPEC_DERIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CV Spec Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_SPEC_DERIVATION_OPERATION_COUNT = VSPEC_DERIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ConfigurableUnitUsageImpl <em>Configurable Unit Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ConfigurableUnitUsageImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getConfigurableUnitUsage()
	 * @generated
	 */
	int CONFIGURABLE_UNIT_USAGE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__NAME = COMPOSITE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__BINDING_VSPEC = COMPOSITE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__PRECEDENCE_CONSTRAINT = COMPOSITE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding CV Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__BINDING_CV_SPEC = COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__CHILDREN = COMPOSITE_VARIATION_POINT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Used Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__USED_UNIT = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__USAGE_REFERENCE = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE__LINK_END_IDENTIFIER = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configurable Unit Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE_FEATURE_COUNT = COMPOSITE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Configurable Unit Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_UNIT_USAGE_OPERATION_COUNT = COMPOSITE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.PrimitiveValueSpecificationImpl <em>Primitive Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.PrimitiveValueSpecificationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPrimitiveValueSpecification()
	 * @generated
	 */
	int PRIMITIVE_VALUE_SPECIFICATION = 67;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_SPECIFICATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_SPECIFICATION__VALUE = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OCLConstraintImpl <em>OCL Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OCLConstraintImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOCLConstraint()
	 * @generated
	 */
	int OCL_CONSTRAINT = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__CONTEXT = CONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OCL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.OperationCallExpImpl <em>Operation Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.OperationCallExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOperationCallExp()
	 * @generated
	 */
	int OPERATION_CALL_EXP = 69;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__ARGUMENT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__OPERATION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.BooleanLiteralExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getBooleanLiteralExp()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXP = 70;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__BOOL = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.StringLiteralExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getStringLiteralExp()
	 * @generated
	 */
	int STRING_LITERAL_EXP = 71;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__STRING = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.NumericLiteralExpImpl <em>Numeric Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.NumericLiteralExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getNumericLiteralExp()
	 * @generated
	 */
	int NUMERIC_LITERAL_EXP = 72;

	/**
	 * The number of structural features of the '<em>Numeric Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.IntegerLiteralExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getIntegerLiteralExp()
	 * @generated
	 */
	int INTEGER_LITERAL_EXP = 73;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__INTEGER = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.UnlimitedLiteralExpImpl <em>Unlimited Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.UnlimitedLiteralExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getUnlimitedLiteralExp()
	 * @generated
	 */
	int UNLIMITED_LITERAL_EXP = 74;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_LITERAL_EXP__UNLIMITED = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unlimited Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unlimited Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_LITERAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.RealLiteralExpImpl <em>Real Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.RealLiteralExpImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getRealLiteralExp()
	 * @generated
	 */
	int REAL_LITERAL_EXP = 75;

	/**
	 * The feature id for the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP__REAL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.PatternIntegrationImpl <em>Pattern Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.PatternIntegrationImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPatternIntegration()
	 * @generated
	 */
	int PATTERN_INTEGRATION = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__BINDING_CLASSIFIER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__MULTI = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substitutes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION__SUBSTITUTES = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INTEGRATION_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.PatternFusionImpl <em>Pattern Fusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.PatternFusionImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPatternFusion()
	 * @generated
	 */
	int PATTERN_FUSION = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__BINDING_CLASSIFIER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__MULTI = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substitutes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION__SUBSTITUTES = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUSION_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.StructuralOrganisationalPatternImpl <em>Structural Organisational Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.StructuralOrganisationalPatternImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getStructuralOrganisationalPattern()
	 * @generated
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__NAME = CHOICE_VARIATION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Vspec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__BINDING_VSPEC = CHOICE_VARIATION_POINT__BINDING_VSPEC;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__PRECEDENCE_CONSTRAINT = CHOICE_VARIATION_POINT__PRECEDENCE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Binding Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__BINDING_CHOICE = CHOICE_VARIATION_POINT__BINDING_CHOICE;

	/**
	 * The feature id for the '<em><b>Mapping Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__MAPPING_EXPRESSION = CHOICE_VARIATION_POINT__MAPPING_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__EXPRESSION = CHOICE_VARIATION_POINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__BINDING_CLASSIFIER = CHOICE_VARIATION_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__MULTI = CHOICE_VARIATION_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substitutes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN__SUBSTITUTES = CHOICE_VARIATION_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structural Organisational Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN_FEATURE_COUNT = CHOICE_VARIATION_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Structural Organisational Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ORGANISATIONAL_PATTERN_OPERATION_COUNT = CHOICE_VARIATION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.impl.ImportImpl
	 * @see org.omg.cvl.impl.CvlPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 79;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.cvl.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.PrimitiveTypeEnum
	 * @see org.omg.cvl.impl.CvlPackageImpl#getPrimitiveTypeEnum()
	 * @generated
	 */
	int PRIMITIVE_TYPE_ENUM = 80;

	/**
	 * The meta object id for the '{@link org.omg.cvl.Operation <em>Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.cvl.Operation
	 * @see org.omg.cvl.impl.CvlPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 81;


	/**
	 * Returns the meta object for class '{@link org.omg.cvl.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see org.omg.cvl.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.Choice#isDefaultResolution <em>Default Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Resolution</em>'.
	 * @see org.omg.cvl.Choice#isDefaultResolution()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_DefaultResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.Choice#isIsImpliedByParent <em>Is Implied By Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Implied By Parent</em>'.
	 * @see org.omg.cvl.Choice#isIsImpliedByParent()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_IsImpliedByParent();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VSpec <em>VSpec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSpec</em>'.
	 * @see org.omg.cvl.VSpec
	 * @generated
	 */
	EClass getVSpec();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.VSpec#getGroupMultiplicity <em>Group Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Multiplicity</em>'.
	 * @see org.omg.cvl.VSpec#getGroupMultiplicity()
	 * @see #getVSpec()
	 * @generated
	 */
	EReference getVSpec_GroupMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.VSpec#getResolutionTime <em>Resolution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Time</em>'.
	 * @see org.omg.cvl.VSpec#getResolutionTime()
	 * @see #getVSpec()
	 * @generated
	 */
	EAttribute getVSpec_ResolutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.VSpec#getOwnedVSpecDerivation <em>Owned VSpec Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned VSpec Derivation</em>'.
	 * @see org.omg.cvl.VSpec#getOwnedVSpecDerivation()
	 * @see #getVSpec()
	 * @generated
	 */
	EReference getVSpec_OwnedVSpecDerivation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VSpec#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see org.omg.cvl.VSpec#getChild()
	 * @see #getVSpec()
	 * @generated
	 */
	EReference getVSpec_Child();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VPackageable <em>VPackageable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPackageable</em>'.
	 * @see org.omg.cvl.VPackageable
	 * @generated
	 */
	EClass getVPackageable();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.VPackageable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.cvl.VPackageable#getName()
	 * @see #getVPackageable()
	 * @generated
	 */
	EAttribute getVPackageable_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.MultiplicityInterval <em>Multiplicity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Interval</em>'.
	 * @see org.omg.cvl.MultiplicityInterval
	 * @generated
	 */
	EClass getMultiplicityInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.MultiplicityInterval#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.omg.cvl.MultiplicityInterval#getUpper()
	 * @see #getMultiplicityInterval()
	 * @generated
	 */
	EAttribute getMultiplicityInterval_Upper();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.MultiplicityInterval#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.omg.cvl.MultiplicityInterval#getLower()
	 * @see #getMultiplicityInterval()
	 * @generated
	 */
	EAttribute getMultiplicityInterval_Lower();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VSpecDerivation <em>VSpec Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSpec Derivation</em>'.
	 * @see org.omg.cvl.VSpecDerivation
	 * @generated
	 */
	EClass getVSpecDerivation();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VSpecDerivation#getDerivedVSpec <em>Derived VSpec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived VSpec</em>'.
	 * @see org.omg.cvl.VSpecDerivation#getDerivedVSpec()
	 * @see #getVSpecDerivation()
	 * @generated
	 */
	EReference getVSpecDerivation_DerivedVSpec();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VClassifier <em>VClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VClassifier</em>'.
	 * @see org.omg.cvl.VClassifier
	 * @generated
	 */
	EClass getVClassifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.VClassifier#getInstanceMultiplicity <em>Instance Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance Multiplicity</em>'.
	 * @see org.omg.cvl.VClassifier#getInstanceMultiplicity()
	 * @see #getVClassifier()
	 * @generated
	 */
	EReference getVClassifier_InstanceMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VSpecResolution <em>VSpec Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSpec Resolution</em>'.
	 * @see org.omg.cvl.VSpecResolution
	 * @generated
	 */
	EClass getVSpecResolution();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VSpecResolution#getResolvedVSpec <em>Resolved VSpec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved VSpec</em>'.
	 * @see org.omg.cvl.VSpecResolution#getResolvedVSpec()
	 * @see #getVSpecResolution()
	 * @generated
	 */
	EReference getVSpecResolution_ResolvedVSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VSpecResolution#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see org.omg.cvl.VSpecResolution#getChild()
	 * @see #getVSpecResolution()
	 * @generated
	 */
	EReference getVSpecResolution_Child();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ChoiceResolutuion <em>Choice Resolutuion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Resolutuion</em>'.
	 * @see org.omg.cvl.ChoiceResolutuion
	 * @generated
	 */
	EClass getChoiceResolutuion();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ChoiceResolutuion#getResolvedChoice <em>Resolved Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Choice</em>'.
	 * @see org.omg.cvl.ChoiceResolutuion#getResolvedChoice()
	 * @see #getChoiceResolutuion()
	 * @generated
	 */
	EReference getChoiceResolutuion_ResolvedChoice();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ChoiceResolutuion#isDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision</em>'.
	 * @see org.omg.cvl.ChoiceResolutuion#isDecision()
	 * @see #getChoiceResolutuion()
	 * @generated
	 */
	EAttribute getChoiceResolutuion_Decision();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VInstance <em>VInstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VInstance</em>'.
	 * @see org.omg.cvl.VInstance
	 * @generated
	 */
	EClass getVInstance();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.omg.cvl.VInstance#getType()
	 * @see #getVInstance()
	 * @generated
	 */
	EReference getVInstance_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation Point</em>'.
	 * @see org.omg.cvl.VariationPoint
	 * @generated
	 */
	EClass getVariationPoint();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.cvl.VariationPoint#getBindingVspec <em>Binding Vspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding Vspec</em>'.
	 * @see org.omg.cvl.VariationPoint#getBindingVspec()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EReference getVariationPoint_BindingVspec();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.cvl.VariationPoint#getPrecedenceConstraint <em>Precedence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedence Constraint</em>'.
	 * @see org.omg.cvl.VariationPoint#getPrecedenceConstraint()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EReference getVariationPoint_PrecedenceConstraint();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.FragmentSubstitution <em>Fragment Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Substitution</em>'.
	 * @see org.omg.cvl.FragmentSubstitution
	 * @generated
	 */
	EClass getFragmentSubstitution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.FragmentSubstitution#getBoundaryElementBinding <em>Boundary Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boundary Element Binding</em>'.
	 * @see org.omg.cvl.FragmentSubstitution#getBoundaryElementBinding()
	 * @see #getFragmentSubstitution()
	 * @generated
	 */
	EReference getFragmentSubstitution_BoundaryElementBinding();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.FragmentSubstitution#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placement</em>'.
	 * @see org.omg.cvl.FragmentSubstitution#getPlacement()
	 * @see #getFragmentSubstitution()
	 * @generated
	 */
	EReference getFragmentSubstitution_Placement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.FragmentSubstitution#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.omg.cvl.FragmentSubstitution#isMulti()
	 * @see #getFragmentSubstitution()
	 * @generated
	 */
	EAttribute getFragmentSubstitution_Multi();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.FragmentSubstitution#getReplacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replacement</em>'.
	 * @see org.omg.cvl.FragmentSubstitution#getReplacement()
	 * @see #getFragmentSubstitution()
	 * @generated
	 */
	EReference getFragmentSubstitution_Replacement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ChoiceVariationPoint <em>Choice Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Variation Point</em>'.
	 * @see org.omg.cvl.ChoiceVariationPoint
	 * @generated
	 */
	EClass getChoiceVariationPoint();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.cvl.ChoiceVariationPoint#getBindingChoice <em>Binding Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding Choice</em>'.
	 * @see org.omg.cvl.ChoiceVariationPoint#getBindingChoice()
	 * @see #getChoiceVariationPoint()
	 * @generated
	 */
	EReference getChoiceVariationPoint_BindingChoice();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ChoiceVariationPoint#getMappingExpression <em>Mapping Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Expression</em>'.
	 * @see org.omg.cvl.ChoiceVariationPoint#getMappingExpression()
	 * @see #getChoiceVariationPoint()
	 * @generated
	 */
	EAttribute getChoiceVariationPoint_MappingExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ChoiceVariationPoint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.omg.cvl.ChoiceVariationPoint#getExpression()
	 * @see #getChoiceVariationPoint()
	 * @generated
	 */
	EAttribute getChoiceVariationPoint_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.RepeatableVariationPoint <em>Repeatable Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeatable Variation Point</em>'.
	 * @see org.omg.cvl.RepeatableVariationPoint
	 * @generated
	 */
	EClass getRepeatableVariationPoint();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.RepeatableVariationPoint#getBindingClassifier <em>Binding Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Classifier</em>'.
	 * @see org.omg.cvl.RepeatableVariationPoint#getBindingClassifier()
	 * @see #getRepeatableVariationPoint()
	 * @generated
	 */
	EReference getRepeatableVariationPoint_BindingClassifier();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.BoundaryElementBinding <em>Boundary Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Element Binding</em>'.
	 * @see org.omg.cvl.BoundaryElementBinding
	 * @generated
	 */
	EClass getBoundaryElementBinding();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.PlacementFragment <em>Placement Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement Fragment</em>'.
	 * @see org.omg.cvl.PlacementFragment
	 * @generated
	 */
	EClass getPlacementFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.PlacementFragment#getPlacementBoundaryElement <em>Placement Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placement Boundary Element</em>'.
	 * @see org.omg.cvl.PlacementFragment#getPlacementBoundaryElement()
	 * @see #getPlacementFragment()
	 * @generated
	 */
	EReference getPlacementFragment_PlacementBoundaryElement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.PlacementBoundaryElement <em>Placement Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement Boundary Element</em>'.
	 * @see org.omg.cvl.PlacementBoundaryElement
	 * @generated
	 */
	EClass getPlacementBoundaryElement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ReplacementFragmentType <em>Replacement Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement Fragment Type</em>'.
	 * @see org.omg.cvl.ReplacementFragmentType
	 * @generated
	 */
	EClass getReplacementFragmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ReplacementFragmentType#getReplacementBoundaryElement <em>Replacement Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replacement Boundary Element</em>'.
	 * @see org.omg.cvl.ReplacementFragmentType#getReplacementBoundaryElement()
	 * @see #getReplacementFragmentType()
	 * @generated
	 */
	EReference getReplacementFragmentType_ReplacementBoundaryElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ReplacementFragmentType#getPlacementFragment <em>Placement Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placement Fragment</em>'.
	 * @see org.omg.cvl.ReplacementFragmentType#getPlacementFragment()
	 * @see #getReplacementFragmentType()
	 * @generated
	 */
	EReference getReplacementFragmentType_PlacementFragment();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.Variabletype <em>Variabletype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variabletype</em>'.
	 * @see org.omg.cvl.Variabletype
	 * @generated
	 */
	EClass getVariabletype();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ReplacementBoundaryElement <em>Replacement Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement Boundary Element</em>'.
	 * @see org.omg.cvl.ReplacementBoundaryElement
	 * @generated
	 */
	EClass getReplacementBoundaryElement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ObjectSubstitution <em>Object Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Substitution</em>'.
	 * @see org.omg.cvl.ObjectSubstitution
	 * @generated
	 */
	EClass getObjectSubstitution();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ObjectSubstitution#getPlacementObject <em>Placement Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placement Object</em>'.
	 * @see org.omg.cvl.ObjectSubstitution#getPlacementObject()
	 * @see #getObjectSubstitution()
	 * @generated
	 */
	EReference getObjectSubstitution_PlacementObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ObjectSubstitution#getReplacementObject <em>Replacement Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replacement Object</em>'.
	 * @see org.omg.cvl.ObjectSubstitution#getReplacementObject()
	 * @see #getObjectSubstitution()
	 * @generated
	 */
	EReference getObjectSubstitution_ReplacementObject();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ObjectHandle <em>Object Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Handle</em>'.
	 * @see org.omg.cvl.ObjectHandle
	 * @generated
	 */
	EClass getObjectHandle();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ObjectHandle#getMOFRef <em>MOF Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MOF Ref</em>'.
	 * @see org.omg.cvl.ObjectHandle#getMOFRef()
	 * @see #getObjectHandle()
	 * @generated
	 */
	EAttribute getObjectHandle_MOFRef();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.BaseModelHandle <em>Base Model Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Model Handle</em>'.
	 * @see org.omg.cvl.BaseModelHandle
	 * @generated
	 */
	EClass getBaseModelHandle();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.BaseModelHandle#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.omg.cvl.BaseModelHandle#getReference()
	 * @see #getBaseModelHandle()
	 * @generated
	 */
	EReference getBaseModelHandle_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.BaseModelHandle#getReferenceString <em>Reference String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference String</em>'.
	 * @see org.omg.cvl.BaseModelHandle#getReferenceString()
	 * @see #getBaseModelHandle()
	 * @generated
	 */
	EAttribute getBaseModelHandle_ReferenceString();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence</em>'.
	 * @see org.omg.cvl.Existence
	 * @generated
	 */
	EClass getExistence();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.omg.cvl.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.Variable#getReplacementFragmentTypesubsetstype <em>Replacement Fragment Typesubsetstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replacement Fragment Typesubsetstype</em>'.
	 * @see org.omg.cvl.Variable#getReplacementFragmentTypesubsetstype()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ReplacementFragmentTypesubsetstype();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.Variable#getDefaulValue <em>Defaul Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaul Value</em>'.
	 * @see org.omg.cvl.Variable#getDefaulValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_DefaulValue();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.omg.cvl.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see org.omg.cvl.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ValueSpecification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.omg.cvl.ValueSpecification#getType()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EReference getValueSpecification_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VariableValueAssignment <em>Variable Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Value Assignment</em>'.
	 * @see org.omg.cvl.VariableValueAssignment
	 * @generated
	 */
	EClass getVariableValueAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VariableValueAssignment#getResolvedVariable <em>Resolved Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Variable</em>'.
	 * @see org.omg.cvl.VariableValueAssignment#getResolvedVariable()
	 * @see #getVariableValueAssignment()
	 * @generated
	 */
	EReference getVariableValueAssignment_ResolvedVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.VariableValueAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.omg.cvl.VariableValueAssignment#getValue()
	 * @see #getVariableValueAssignment()
	 * @generated
	 */
	EReference getVariableValueAssignment_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.PrimitveType <em>Primitve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitve Type</em>'.
	 * @see org.omg.cvl.PrimitveType
	 * @generated
	 */
	EClass getPrimitveType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.PrimitveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.cvl.PrimitveType#getType()
	 * @see #getPrimitveType()
	 * @generated
	 */
	EAttribute getPrimitveType_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.omg.cvl.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ObjectType#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Class</em>'.
	 * @see org.omg.cvl.ObjectType#getMetaClass()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_MetaClass();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VInterface <em>VInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VInterface</em>'.
	 * @see org.omg.cvl.VInterface
	 * @generated
	 */
	EClass getVInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VInterface#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.omg.cvl.VInterface#getMember()
	 * @see #getVInterface()
	 * @generated
	 */
	EReference getVInterface_Member();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VInterface#getOwnedConstraint <em>Owned Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Constraint</em>'.
	 * @see org.omg.cvl.VInterface#getOwnedConstraint()
	 * @see #getVInterface()
	 * @generated
	 */
	EReference getVInterface_OwnedConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VInterface#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see org.omg.cvl.VInterface#getSuper()
	 * @see #getVInterface()
	 * @generated
	 */
	EReference getVInterface_Super();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.omg.cvl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.omg.cvl.Constraint#getContext()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Context();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.SlotAssignment <em>Slot Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Assignment</em>'.
	 * @see org.omg.cvl.SlotAssignment
	 * @generated
	 */
	EClass getSlotAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.SlotAssignment#getSlotIdentifier <em>Slot Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Identifier</em>'.
	 * @see org.omg.cvl.SlotAssignment#getSlotIdentifier()
	 * @see #getSlotAssignment()
	 * @generated
	 */
	EAttribute getSlotAssignment_SlotIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.SlotAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.omg.cvl.SlotAssignment#getValue()
	 * @see #getSlotAssignment()
	 * @generated
	 */
	EReference getSlotAssignment_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.SlotAssignment#getSlotOwner <em>Slot Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Owner</em>'.
	 * @see org.omg.cvl.SlotAssignment#getSlotOwner()
	 * @see #getSlotAssignment()
	 * @generated
	 */
	EReference getSlotAssignment_SlotOwner();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.FixedSlotValueAssignment <em>Fixed Slot Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Slot Value Assignment</em>'.
	 * @see org.omg.cvl.FixedSlotValueAssignment
	 * @generated
	 */
	EClass getFixedSlotValueAssignment();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.FixedObjectSubstitution <em>Fixed Object Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Object Substitution</em>'.
	 * @see org.omg.cvl.FixedObjectSubstitution
	 * @generated
	 */
	EClass getFixedObjectSubstitution();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ObjectExistence <em>Object Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Existence</em>'.
	 * @see org.omg.cvl.ObjectExistence
	 * @generated
	 */
	EClass getObjectExistence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ObjectExistence#getOptionalObject <em>Optional Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Object</em>'.
	 * @see org.omg.cvl.ObjectExistence#getOptionalObject()
	 * @see #getObjectExistence()
	 * @generated
	 */
	EReference getObjectExistence_OptionalObject();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.LinkAssignment <em>Link Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Assignment</em>'.
	 * @see org.omg.cvl.LinkAssignment
	 * @generated
	 */
	EClass getLinkAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.LinkAssignment#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.omg.cvl.LinkAssignment#getLink()
	 * @see #getLinkAssignment()
	 * @generated
	 */
	EReference getLinkAssignment_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.LinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link End Identifier</em>'.
	 * @see org.omg.cvl.LinkAssignment#getLinkEndIdentifier()
	 * @see #getLinkAssignment()
	 * @generated
	 */
	EAttribute getLinkAssignment_LinkEndIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.LinkAssignment#getNewEnd <em>New End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New End</em>'.
	 * @see org.omg.cvl.LinkAssignment#getNewEnd()
	 * @see #getLinkAssignment()
	 * @generated
	 */
	EReference getLinkAssignment_NewEnd();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.LinkHandle <em>Link Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Handle</em>'.
	 * @see org.omg.cvl.LinkHandle
	 * @generated
	 */
	EClass getLinkHandle();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.LinkHandle#getMOFRef <em>MOF Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MOF Ref</em>'.
	 * @see org.omg.cvl.LinkHandle#getMOFRef()
	 * @see #getLinkHandle()
	 * @generated
	 */
	EAttribute getLinkHandle_MOFRef();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ConfigurableUnit <em>Configurable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurable Unit</em>'.
	 * @see org.omg.cvl.ConfigurableUnit
	 * @generated
	 */
	EClass getConfigurableUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ConfigurableUnit#getOwnedVSpec <em>Owned VSpec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned VSpec</em>'.
	 * @see org.omg.cvl.ConfigurableUnit#getOwnedVSpec()
	 * @see #getConfigurableUnit()
	 * @generated
	 */
	EReference getConfigurableUnit_OwnedVSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ConfigurableUnit#getOwnedVariationPoint <em>Owned Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variation Point</em>'.
	 * @see org.omg.cvl.ConfigurableUnit#getOwnedVariationPoint()
	 * @see #getConfigurableUnit()
	 * @generated
	 */
	EReference getConfigurableUnit_OwnedVariationPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ConfigurableUnit#getOwnedConstraint <em>Owned Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Constraint</em>'.
	 * @see org.omg.cvl.ConfigurableUnit#getOwnedConstraint()
	 * @see #getConfigurableUnit()
	 * @generated
	 */
	EReference getConfigurableUnit_OwnedConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ConfigurableUnit#getConfigurableContainerObject <em>Configurable Container Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurable Container Object</em>'.
	 * @see org.omg.cvl.ConfigurableUnit#getConfigurableContainerObject()
	 * @see #getConfigurableUnit()
	 * @generated
	 */
	EReference getConfigurableUnit_ConfigurableContainerObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ConfigurableUnit#getOwnedVSpecResolution <em>Owned VSpec Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned VSpec Resolution</em>'.
	 * @see org.omg.cvl.ConfigurableUnit#getOwnedVSpecResolution()
	 * @see #getConfigurableUnit()
	 * @generated
	 */
	EReference getConfigurableUnit_OwnedVSpecResolution();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ConfigurableUnit#getUnitInterface <em>Unit Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit Interface</em>'.
	 * @see org.omg.cvl.ConfigurableUnit#getUnitInterface()
	 * @see #getConfigurableUnit()
	 * @generated
	 */
	EReference getConfigurableUnit_UnitInterface();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.CompositeVariationPoint <em>Composite Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Variation Point</em>'.
	 * @see org.omg.cvl.CompositeVariationPoint
	 * @generated
	 */
	EClass getCompositeVariationPoint();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.CompositeVariationPoint#getBindingCVSpec <em>Binding CV Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding CV Spec</em>'.
	 * @see org.omg.cvl.CompositeVariationPoint#getBindingCVSpec()
	 * @see #getCompositeVariationPoint()
	 * @generated
	 */
	EReference getCompositeVariationPoint_BindingCVSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.CompositeVariationPoint#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.omg.cvl.CompositeVariationPoint#getChildren()
	 * @see #getCompositeVariationPoint()
	 * @generated
	 */
	EReference getCompositeVariationPoint_Children();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.CVSpec <em>CV Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV Spec</em>'.
	 * @see org.omg.cvl.CVSpec
	 * @generated
	 */
	EClass getCVSpec();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.CVSpec#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension</em>'.
	 * @see org.omg.cvl.CVSpec#getExtension()
	 * @see #getCVSpec()
	 * @generated
	 */
	EReference getCVSpec_Extension();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VConfiguration <em>VConfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VConfiguration</em>'.
	 * @see org.omg.cvl.VConfiguration
	 * @generated
	 */
	EClass getVConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VConfiguration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.omg.cvl.VConfiguration#getMember()
	 * @see #getVConfiguration()
	 * @generated
	 */
	EReference getVConfiguration_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.VConfiguration#isIsPartial <em>Is Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Partial</em>'.
	 * @see org.omg.cvl.VConfiguration#isIsPartial()
	 * @see #getVConfiguration()
	 * @generated
	 */
	EAttribute getVConfiguration_IsPartial();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VConfiguration#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see org.omg.cvl.VConfiguration#getSuper()
	 * @see #getVConfiguration()
	 * @generated
	 */
	EReference getVConfiguration_Super();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VConfiguration#getResolvedVIRef <em>Resolved VI Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved VI Ref</em>'.
	 * @see org.omg.cvl.VConfiguration#getResolvedVIRef()
	 * @see #getVConfiguration()
	 * @generated
	 */
	EReference getVConfiguration_ResolvedVIRef();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VSpec2VSpecMapping <em>VSpec2 VSpec Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSpec2 VSpec Mapping</em>'.
	 * @see org.omg.cvl.VSpec2VSpecMapping
	 * @generated
	 */
	EClass getVSpec2VSpecMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VSpec2VSpecMapping#getDerivingConstraint <em>Deriving Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deriving Constraint</em>'.
	 * @see org.omg.cvl.VSpec2VSpecMapping#getDerivingConstraint()
	 * @see #getVSpec2VSpecMapping()
	 * @generated
	 */
	EReference getVSpec2VSpecMapping_DerivingConstraint();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OpaqueConstraint <em>Opaque Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Constraint</em>'.
	 * @see org.omg.cvl.OpaqueConstraint
	 * @generated
	 */
	EClass getOpaqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.OpaqueConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.omg.cvl.OpaqueConstraint#getConstraint()
	 * @see #getOpaqueConstraint()
	 * @generated
	 */
	EAttribute getOpaqueConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.OpaqueConstraint#getConstraintLanguage <em>Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Language</em>'.
	 * @see org.omg.cvl.OpaqueConstraint#getConstraintLanguage()
	 * @see #getOpaqueConstraint()
	 * @generated
	 */
	EAttribute getOpaqueConstraint_ConstraintLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.LinkExistence <em>Link Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Existence</em>'.
	 * @see org.omg.cvl.LinkExistence
	 * @generated
	 */
	EClass getLinkExistence();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.LinkExistence#getOptionalLink <em>Optional Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional Link</em>'.
	 * @see org.omg.cvl.LinkExistence#getOptionalLink()
	 * @see #getLinkExistence()
	 * @generated
	 */
	EReference getLinkExistence_OptionalLink();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OpaqueVariationPoint <em>Opaque Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Variation Point</em>'.
	 * @see org.omg.cvl.OpaqueVariationPoint
	 * @generated
	 */
	EClass getOpaqueVariationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.OpaqueVariationPoint#getPlaceHolder <em>Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place Holder</em>'.
	 * @see org.omg.cvl.OpaqueVariationPoint#getPlaceHolder()
	 * @see #getOpaqueVariationPoint()
	 * @generated
	 */
	EReference getOpaqueVariationPoint_PlaceHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.OpaqueVariationPoint#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Object</em>'.
	 * @see org.omg.cvl.OpaqueVariationPoint#getSourceObject()
	 * @see #getOpaqueVariationPoint()
	 * @generated
	 */
	EReference getOpaqueVariationPoint_SourceObject();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.OpaqueVariationPoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.omg.cvl.OpaqueVariationPoint#getType()
	 * @see #getOpaqueVariationPoint()
	 * @generated
	 */
	EReference getOpaqueVariationPoint_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OVPType <em>OVP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OVP Type</em>'.
	 * @see org.omg.cvl.OVPType
	 * @generated
	 */
	EClass getOVPType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.OVPType#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see org.omg.cvl.OVPType#getSpec()
	 * @see #getOVPType()
	 * @generated
	 */
	EReference getOVPType_Spec();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OVPSemanticSpec <em>OVP Semantic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OVP Semantic Spec</em>'.
	 * @see org.omg.cvl.OVPSemanticSpec
	 * @generated
	 */
	EClass getOVPSemanticSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.OVPSemanticSpec#getModelTransformation <em>Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Transformation</em>'.
	 * @see org.omg.cvl.OVPSemanticSpec#getModelTransformation()
	 * @see #getOVPSemanticSpec()
	 * @generated
	 */
	EAttribute getOVPSemanticSpec_ModelTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.OVPSemanticSpec#getTransfromationLanguage <em>Transfromation Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfromation Language</em>'.
	 * @see org.omg.cvl.OVPSemanticSpec#getTransfromationLanguage()
	 * @see #getOVPSemanticSpec()
	 * @generated
	 */
	EAttribute getOVPSemanticSpec_TransfromationLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ObjectSpecification <em>Object Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Specification</em>'.
	 * @see org.omg.cvl.ObjectSpecification
	 * @generated
	 */
	EClass getObjectSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ObjectSpecification#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.omg.cvl.ObjectSpecification#getObject()
	 * @see #getObjectSpecification()
	 * @generated
	 */
	EReference getObjectSpecification_Object();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ReplacementFragmentSpecification <em>Replacement Fragment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement Fragment Specification</em>'.
	 * @see org.omg.cvl.ReplacementFragmentSpecification
	 * @generated
	 */
	EClass getReplacementFragmentSpecification();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VPackage <em>VPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPackage</em>'.
	 * @see org.omg.cvl.VPackage
	 * @generated
	 */
	EClass getVPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VPackage#getPackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Element</em>'.
	 * @see org.omg.cvl.VPackage#getPackageElement()
	 * @see #getVPackage()
	 * @generated
	 */
	EReference getVPackage_PackageElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.VPackage#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.omg.cvl.VPackage#getImports()
	 * @see #getVPackage()
	 * @generated
	 */
	EReference getVPackage_Imports();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ToBinding <em>To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Binding</em>'.
	 * @see org.omg.cvl.ToBinding
	 * @generated
	 */
	EClass getToBinding();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ToBinding#getToPlacement <em>To Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Placement</em>'.
	 * @see org.omg.cvl.ToBinding#getToPlacement()
	 * @see #getToBinding()
	 * @generated
	 */
	EReference getToBinding_ToPlacement();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ToBinding#getToReplacement <em>To Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Replacement</em>'.
	 * @see org.omg.cvl.ToBinding#getToReplacement()
	 * @see #getToBinding()
	 * @generated
	 */
	EReference getToBinding_ToReplacement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ToPlacement <em>To Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Placement</em>'.
	 * @see org.omg.cvl.ToPlacement
	 * @generated
	 */
	EClass getToPlacement();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.cvl.ToPlacement#getToReplacement <em>To Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To Replacement</em>'.
	 * @see org.omg.cvl.ToPlacement#getToReplacement()
	 * @see #getToPlacement()
	 * @generated
	 */
	EReference getToPlacement_ToReplacement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ToPlacement#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.omg.cvl.ToPlacement#getPropertyName()
	 * @see #getToPlacement()
	 * @generated
	 */
	EAttribute getToPlacement_PropertyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ToPlacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inside Boundary Element</em>'.
	 * @see org.omg.cvl.ToPlacement#getInsideBoundaryElement()
	 * @see #getToPlacement()
	 * @generated
	 */
	EReference getToPlacement_InsideBoundaryElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ToPlacement#getOutsideBoundaryElement <em>Outside Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outside Boundary Element</em>'.
	 * @see org.omg.cvl.ToPlacement#getOutsideBoundaryElement()
	 * @see #getToPlacement()
	 * @generated
	 */
	EReference getToPlacement_OutsideBoundaryElement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ToReplacement <em>To Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Replacement</em>'.
	 * @see org.omg.cvl.ToReplacement
	 * @generated
	 */
	EClass getToReplacement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.ToReplacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inside Boundary Element</em>'.
	 * @see org.omg.cvl.ToReplacement#getInsideBoundaryElement()
	 * @see #getToReplacement()
	 * @generated
	 */
	EReference getToReplacement_InsideBoundaryElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ToReplacement#getToPlacement <em>To Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Placement</em>'.
	 * @see org.omg.cvl.ToReplacement#getToPlacement()
	 * @see #getToReplacement()
	 * @generated
	 */
	EReference getToReplacement_ToPlacement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.FromBinding <em>From Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Binding</em>'.
	 * @see org.omg.cvl.FromBinding
	 * @generated
	 */
	EClass getFromBinding();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.FromBinding#getFromPlacement <em>From Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Placement</em>'.
	 * @see org.omg.cvl.FromBinding#getFromPlacement()
	 * @see #getFromBinding()
	 * @generated
	 */
	EReference getFromBinding_FromPlacement();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.FromBinding#getFromReplacement <em>From Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Replacement</em>'.
	 * @see org.omg.cvl.FromBinding#getFromReplacement()
	 * @see #getFromBinding()
	 * @generated
	 */
	EReference getFromBinding_FromReplacement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.FromPlacement <em>From Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Placement</em>'.
	 * @see org.omg.cvl.FromPlacement
	 * @generated
	 */
	EClass getFromPlacement();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.FromPlacement#getFromReplacement <em>From Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Replacement</em>'.
	 * @see org.omg.cvl.FromPlacement#getFromReplacement()
	 * @see #getFromPlacement()
	 * @generated
	 */
	EReference getFromPlacement_FromReplacement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.FromPlacement#getOutsideBoundaryElement <em>Outside Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outside Boundary Element</em>'.
	 * @see org.omg.cvl.FromPlacement#getOutsideBoundaryElement()
	 * @see #getFromPlacement()
	 * @generated
	 */
	EReference getFromPlacement_OutsideBoundaryElement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.FromReplacement <em>From Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Replacement</em>'.
	 * @see org.omg.cvl.FromReplacement
	 * @generated
	 */
	EClass getFromReplacement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.FromReplacement#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.omg.cvl.FromReplacement#getPropertyName()
	 * @see #getFromReplacement()
	 * @generated
	 */
	EAttribute getFromReplacement_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.FromReplacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inside Boundary Element</em>'.
	 * @see org.omg.cvl.FromReplacement#getInsideBoundaryElement()
	 * @see #getFromReplacement()
	 * @generated
	 */
	EReference getFromReplacement_InsideBoundaryElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.FromReplacement#getOutsideBoundaryElement <em>Outside Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outside Boundary Element</em>'.
	 * @see org.omg.cvl.FromReplacement#getOutsideBoundaryElement()
	 * @see #getFromReplacement()
	 * @generated
	 */
	EReference getFromReplacement_OutsideBoundaryElement();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.FromReplacement#getFromPlacement <em>From Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Placement</em>'.
	 * @see org.omg.cvl.FromReplacement#getFromPlacement()
	 * @see #getFromReplacement()
	 * @generated
	 */
	EReference getFromReplacement_FromPlacement();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VSpecRef <em>VSpec Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSpec Ref</em>'.
	 * @see org.omg.cvl.VSpecRef
	 * @generated
	 */
	EClass getVSpecRef();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VSpecRef#getVSpec <em>VSpec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VSpec</em>'.
	 * @see org.omg.cvl.VSpecRef#getVSpec()
	 * @see #getVSpecRef()
	 * @generated
	 */
	EReference getVSpecRef_VSpec();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OCLExpression <em>OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Expression</em>'.
	 * @see org.omg.cvl.OCLExpression
	 * @generated
	 */
	EClass getOCLExpression();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VSpecToConfigMapping <em>VSpec To Config Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSpec To Config Mapping</em>'.
	 * @see org.omg.cvl.VSpecToConfigMapping
	 * @generated
	 */
	EClass getVSpecToConfigMapping();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.VSpecToConfigMapping#getThenConfiguration <em>Then Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Configuration</em>'.
	 * @see org.omg.cvl.VSpecToConfigMapping#getThenConfiguration()
	 * @see #getVSpecToConfigMapping()
	 * @generated
	 */
	EReference getVSpecToConfigMapping_ThenConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.VSpecToConfigMapping#getIfConstraint <em>If Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Constraint</em>'.
	 * @see org.omg.cvl.VSpecToConfigMapping#getIfConstraint()
	 * @see #getVSpecToConfigMapping()
	 * @generated
	 */
	EReference getVSpecToConfigMapping_IfConstraint();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ParametricVariationPoint <em>Parametric Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Variation Point</em>'.
	 * @see org.omg.cvl.ParametricVariationPoint
	 * @generated
	 */
	EClass getParametricVariationPoint();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ParametricVariationPoint#getBindingVariable <em>Binding Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Variable</em>'.
	 * @see org.omg.cvl.ParametricVariationPoint#getBindingVariable()
	 * @see #getParametricVariationPoint()
	 * @generated
	 */
	EReference getParametricVariationPoint_BindingVariable();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.SlotValueExistence <em>Slot Value Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Value Existence</em>'.
	 * @see org.omg.cvl.SlotValueExistence
	 * @generated
	 */
	EClass getSlotValueExistence();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.SlotValueExistence#getSlotIdentifier <em>Slot Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Identifier</em>'.
	 * @see org.omg.cvl.SlotValueExistence#getSlotIdentifier()
	 * @see #getSlotValueExistence()
	 * @generated
	 */
	EAttribute getSlotValueExistence_SlotIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.SlotValueExistence#getSlotOwner <em>Slot Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Owner</em>'.
	 * @see org.omg.cvl.SlotValueExistence#getSlotOwner()
	 * @see #getSlotValueExistence()
	 * @generated
	 */
	EReference getSlotValueExistence_SlotOwner();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ParametricLinkAssignment <em>Parametric Link Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Link Assignment</em>'.
	 * @see org.omg.cvl.ParametricLinkAssignment
	 * @generated
	 */
	EClass getParametricLinkAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ParametricLinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link End Identifier</em>'.
	 * @see org.omg.cvl.ParametricLinkAssignment#getLinkEndIdentifier()
	 * @see #getParametricLinkAssignment()
	 * @generated
	 */
	EAttribute getParametricLinkAssignment_LinkEndIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ParametricLinkAssignment#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.omg.cvl.ParametricLinkAssignment#getLink()
	 * @see #getParametricLinkAssignment()
	 * @generated
	 */
	EReference getParametricLinkAssignment_Link();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ParametricObjectSubstitution <em>Parametric Object Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Object Substitution</em>'.
	 * @see org.omg.cvl.ParametricObjectSubstitution
	 * @generated
	 */
	EClass getParametricObjectSubstitution();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ParametricObjectSubstitution#getPlacementObject <em>Placement Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placement Object</em>'.
	 * @see org.omg.cvl.ParametricObjectSubstitution#getPlacementObject()
	 * @see #getParametricObjectSubstitution()
	 * @generated
	 */
	EReference getParametricObjectSubstitution_PlacementObject();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ParametricSlotAssignmet <em>Parametric Slot Assignmet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Slot Assignmet</em>'.
	 * @see org.omg.cvl.ParametricSlotAssignmet
	 * @generated
	 */
	EClass getParametricSlotAssignmet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ParametricSlotAssignmet#getSlotIdentifier <em>Slot Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot Identifier</em>'.
	 * @see org.omg.cvl.ParametricSlotAssignmet#getSlotIdentifier()
	 * @see #getParametricSlotAssignmet()
	 * @generated
	 */
	EAttribute getParametricSlotAssignmet_SlotIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ParametricSlotAssignmet#getSlotOwner <em>Slot Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Owner</em>'.
	 * @see org.omg.cvl.ParametricSlotAssignmet#getSlotOwner()
	 * @see #getParametricSlotAssignmet()
	 * @generated
	 */
	EReference getParametricSlotAssignmet_SlotOwner();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ChoiceDerivation <em>Choice Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Derivation</em>'.
	 * @see org.omg.cvl.ChoiceDerivation
	 * @generated
	 */
	EClass getChoiceDerivation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ChoiceDerivation#getDerivingConstraint <em>Deriving Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deriving Constraint</em>'.
	 * @see org.omg.cvl.ChoiceDerivation#getDerivingConstraint()
	 * @see #getChoiceDerivation()
	 * @generated
	 */
	EReference getChoiceDerivation_DerivingConstraint();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.VariableDerivation <em>Variable Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Derivation</em>'.
	 * @see org.omg.cvl.VariableDerivation
	 * @generated
	 */
	EClass getVariableDerivation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.VariableDerivation#getDerivingExpression <em>Deriving Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deriving Expression</em>'.
	 * @see org.omg.cvl.VariableDerivation#getDerivingExpression()
	 * @see #getVariableDerivation()
	 * @generated
	 */
	EReference getVariableDerivation_DerivingExpression();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.CVSpecDerivation <em>CV Spec Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV Spec Derivation</em>'.
	 * @see org.omg.cvl.CVSpecDerivation
	 * @generated
	 */
	EClass getCVSpecDerivation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.CVSpecDerivation#getMemberDerivation <em>Member Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Derivation</em>'.
	 * @see org.omg.cvl.CVSpecDerivation#getMemberDerivation()
	 * @see #getCVSpecDerivation()
	 * @generated
	 */
	EReference getCVSpecDerivation_MemberDerivation();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.ConfigurableUnitUsage <em>Configurable Unit Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurable Unit Usage</em>'.
	 * @see org.omg.cvl.ConfigurableUnitUsage
	 * @generated
	 */
	EClass getConfigurableUnitUsage();

	/**
	 * Returns the meta object for the reference '{@link org.omg.cvl.ConfigurableUnitUsage#getUsedUnit <em>Used Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Unit</em>'.
	 * @see org.omg.cvl.ConfigurableUnitUsage#getUsedUnit()
	 * @see #getConfigurableUnitUsage()
	 * @generated
	 */
	EReference getConfigurableUnitUsage_UsedUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.ConfigurableUnitUsage#getUsageReference <em>Usage Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Reference</em>'.
	 * @see org.omg.cvl.ConfigurableUnitUsage#getUsageReference()
	 * @see #getConfigurableUnitUsage()
	 * @generated
	 */
	EReference getConfigurableUnitUsage_UsageReference();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.ConfigurableUnitUsage#getLinkEndIdentifier <em>Link End Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link End Identifier</em>'.
	 * @see org.omg.cvl.ConfigurableUnitUsage#getLinkEndIdentifier()
	 * @see #getConfigurableUnitUsage()
	 * @generated
	 */
	EAttribute getConfigurableUnitUsage_LinkEndIdentifier();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.PrimitiveValueSpecification <em>Primitive Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value Specification</em>'.
	 * @see org.omg.cvl.PrimitiveValueSpecification
	 * @generated
	 */
	EClass getPrimitiveValueSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.cvl.PrimitiveValueSpecification#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.cvl.PrimitiveValueSpecification#getExpression()
	 * @see #getPrimitiveValueSpecification()
	 * @generated
	 */
	EReference getPrimitiveValueSpecification_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.PrimitiveValueSpecification#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.cvl.PrimitiveValueSpecification#getValue()
	 * @see #getPrimitiveValueSpecification()
	 * @generated
	 */
	EAttribute getPrimitiveValueSpecification_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OCLConstraint <em>OCL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Constraint</em>'.
	 * @see org.omg.cvl.OCLConstraint
	 * @generated
	 */
	EClass getOCLConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.OCLConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see org.omg.cvl.OCLConstraint#getExpression()
	 * @see #getOCLConstraint()
	 * @generated
	 */
	EReference getOCLConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Exp</em>'.
	 * @see org.omg.cvl.OperationCallExp
	 * @generated
	 */
	EClass getOperationCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.cvl.OperationCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.omg.cvl.OperationCallExp#getArgument()
	 * @see #getOperationCallExp()
	 * @generated
	 */
	EReference getOperationCallExp_Argument();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.OperationCallExp#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.omg.cvl.OperationCallExp#getOperation()
	 * @see #getOperationCallExp()
	 * @generated
	 */
	EAttribute getOperationCallExp_Operation();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Exp</em>'.
	 * @see org.omg.cvl.BooleanLiteralExp
	 * @generated
	 */
	EClass getBooleanLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.BooleanLiteralExp#isBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see org.omg.cvl.BooleanLiteralExp#isBool()
	 * @see #getBooleanLiteralExp()
	 * @generated
	 */
	EAttribute getBooleanLiteralExp_Bool();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Exp</em>'.
	 * @see org.omg.cvl.StringLiteralExp
	 * @generated
	 */
	EClass getStringLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.StringLiteralExp#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.omg.cvl.StringLiteralExp#getString()
	 * @see #getStringLiteralExp()
	 * @generated
	 */
	EAttribute getStringLiteralExp_String();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal Exp</em>'.
	 * @see org.omg.cvl.NumericLiteralExp
	 * @generated
	 */
	EClass getNumericLiteralExp();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal Exp</em>'.
	 * @see org.omg.cvl.IntegerLiteralExp
	 * @generated
	 */
	EClass getIntegerLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.IntegerLiteralExp#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.omg.cvl.IntegerLiteralExp#getInteger()
	 * @see #getIntegerLiteralExp()
	 * @generated
	 */
	EAttribute getIntegerLiteralExp_Integer();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.UnlimitedLiteralExp <em>Unlimited Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlimited Literal Exp</em>'.
	 * @see org.omg.cvl.UnlimitedLiteralExp
	 * @generated
	 */
	EClass getUnlimitedLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.UnlimitedLiteralExp#getUnlimited <em>Unlimited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unlimited</em>'.
	 * @see org.omg.cvl.UnlimitedLiteralExp#getUnlimited()
	 * @see #getUnlimitedLiteralExp()
	 * @generated
	 */
	EAttribute getUnlimitedLiteralExp_Unlimited();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.RealLiteralExp <em>Real Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal Exp</em>'.
	 * @see org.omg.cvl.RealLiteralExp
	 * @generated
	 */
	EClass getRealLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.RealLiteralExp#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real</em>'.
	 * @see org.omg.cvl.RealLiteralExp#getReal()
	 * @see #getRealLiteralExp()
	 * @generated
	 */
	EAttribute getRealLiteralExp_Real();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.PatternIntegration <em>Pattern Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Integration</em>'.
	 * @see org.omg.cvl.PatternIntegration
	 * @generated
	 */
	EClass getPatternIntegration();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.PatternIntegration#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.omg.cvl.PatternIntegration#isMulti()
	 * @see #getPatternIntegration()
	 * @generated
	 */
	EAttribute getPatternIntegration_Multi();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.cvl.PatternIntegration#getSubstitutes <em>Substitutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitutes</em>'.
	 * @see org.omg.cvl.PatternIntegration#getSubstitutes()
	 * @see #getPatternIntegration()
	 * @generated
	 */
	EReference getPatternIntegration_Substitutes();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.PatternFusion <em>Pattern Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Fusion</em>'.
	 * @see org.omg.cvl.PatternFusion
	 * @generated
	 */
	EClass getPatternFusion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.PatternFusion#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.omg.cvl.PatternFusion#isMulti()
	 * @see #getPatternFusion()
	 * @generated
	 */
	EAttribute getPatternFusion_Multi();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.cvl.PatternFusion#getSubstitutes <em>Substitutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitutes</em>'.
	 * @see org.omg.cvl.PatternFusion#getSubstitutes()
	 * @see #getPatternFusion()
	 * @generated
	 */
	EReference getPatternFusion_Substitutes();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.StructuralOrganisationalPattern <em>Structural Organisational Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Organisational Pattern</em>'.
	 * @see org.omg.cvl.StructuralOrganisationalPattern
	 * @generated
	 */
	EClass getStructuralOrganisationalPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.StructuralOrganisationalPattern#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.omg.cvl.StructuralOrganisationalPattern#isMulti()
	 * @see #getStructuralOrganisationalPattern()
	 * @generated
	 */
	EAttribute getStructuralOrganisationalPattern_Multi();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.cvl.StructuralOrganisationalPattern#getSubstitutes <em>Substitutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitutes</em>'.
	 * @see org.omg.cvl.StructuralOrganisationalPattern#getSubstitutes()
	 * @see #getStructuralOrganisationalPattern()
	 * @generated
	 */
	EReference getStructuralOrganisationalPattern_Substitutes();

	/**
	 * Returns the meta object for class '{@link org.omg.cvl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.omg.cvl.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.cvl.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.omg.cvl.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for enum '{@link org.omg.cvl.PrimitiveTypeEnum <em>Primitive Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type Enum</em>'.
	 * @see org.omg.cvl.PrimitiveTypeEnum
	 * @generated
	 */
	EEnum getPrimitiveTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.omg.cvl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation</em>'.
	 * @see org.omg.cvl.Operation
	 * @generated
	 */
	EEnum getOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CvlFactory getCvlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ChoiceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Default Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DEFAULT_RESOLUTION = eINSTANCE.getChoice_DefaultResolution();

		/**
		 * The meta object literal for the '<em><b>Is Implied By Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__IS_IMPLIED_BY_PARENT = eINSTANCE.getChoice_IsImpliedByParent();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VSpecImpl <em>VSpec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VSpecImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpec()
		 * @generated
		 */
		EClass VSPEC = eINSTANCE.getVSpec();

		/**
		 * The meta object literal for the '<em><b>Group Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC__GROUP_MULTIPLICITY = eINSTANCE.getVSpec_GroupMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Resolution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSPEC__RESOLUTION_TIME = eINSTANCE.getVSpec_ResolutionTime();

		/**
		 * The meta object literal for the '<em><b>Owned VSpec Derivation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC__OWNED_VSPEC_DERIVATION = eINSTANCE.getVSpec_OwnedVSpecDerivation();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC__CHILD = eINSTANCE.getVSpec_Child();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VPackageableImpl <em>VPackageable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VPackageableImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVPackageable()
		 * @generated
		 */
		EClass VPACKAGEABLE = eINSTANCE.getVPackageable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPACKAGEABLE__NAME = eINSTANCE.getVPackageable_Name();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.MultiplicityIntervalImpl <em>Multiplicity Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.MultiplicityIntervalImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getMultiplicityInterval()
		 * @generated
		 */
		EClass MULTIPLICITY_INTERVAL = eINSTANCE.getMultiplicityInterval();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_INTERVAL__UPPER = eINSTANCE.getMultiplicityInterval_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_INTERVAL__LOWER = eINSTANCE.getMultiplicityInterval_Lower();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VSpecDerivationImpl <em>VSpec Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VSpecDerivationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecDerivation()
		 * @generated
		 */
		EClass VSPEC_DERIVATION = eINSTANCE.getVSpecDerivation();

		/**
		 * The meta object literal for the '<em><b>Derived VSpec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC_DERIVATION__DERIVED_VSPEC = eINSTANCE.getVSpecDerivation_DerivedVSpec();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VClassifierImpl <em>VClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VClassifierImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVClassifier()
		 * @generated
		 */
		EClass VCLASSIFIER = eINSTANCE.getVClassifier();

		/**
		 * The meta object literal for the '<em><b>Instance Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCLASSIFIER__INSTANCE_MULTIPLICITY = eINSTANCE.getVClassifier_InstanceMultiplicity();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VSpecResolutionImpl <em>VSpec Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VSpecResolutionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecResolution()
		 * @generated
		 */
		EClass VSPEC_RESOLUTION = eINSTANCE.getVSpecResolution();

		/**
		 * The meta object literal for the '<em><b>Resolved VSpec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC_RESOLUTION__RESOLVED_VSPEC = eINSTANCE.getVSpecResolution_ResolvedVSpec();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC_RESOLUTION__CHILD = eINSTANCE.getVSpecResolution_Child();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ChoiceResolutuionImpl <em>Choice Resolutuion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ChoiceResolutuionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getChoiceResolutuion()
		 * @generated
		 */
		EClass CHOICE_RESOLUTUION = eINSTANCE.getChoiceResolutuion();

		/**
		 * The meta object literal for the '<em><b>Resolved Choice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_RESOLUTUION__RESOLVED_CHOICE = eINSTANCE.getChoiceResolutuion_ResolvedChoice();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_RESOLUTUION__DECISION = eINSTANCE.getChoiceResolutuion_Decision();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VInstanceImpl <em>VInstance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VInstanceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVInstance()
		 * @generated
		 */
		EClass VINSTANCE = eINSTANCE.getVInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINSTANCE__TYPE = eINSTANCE.getVInstance_Type();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VariationPointImpl <em>Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VariationPointImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVariationPoint()
		 * @generated
		 */
		EClass VARIATION_POINT = eINSTANCE.getVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Binding Vspec</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_POINT__BINDING_VSPEC = eINSTANCE.getVariationPoint_BindingVspec();

		/**
		 * The meta object literal for the '<em><b>Precedence Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_POINT__PRECEDENCE_CONSTRAINT = eINSTANCE.getVariationPoint_PrecedenceConstraint();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.FragmentSubstitutionImpl <em>Fragment Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.FragmentSubstitutionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getFragmentSubstitution()
		 * @generated
		 */
		EClass FRAGMENT_SUBSTITUTION = eINSTANCE.getFragmentSubstitution();

		/**
		 * The meta object literal for the '<em><b>Boundary Element Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_SUBSTITUTION__BOUNDARY_ELEMENT_BINDING = eINSTANCE.getFragmentSubstitution_BoundaryElementBinding();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_SUBSTITUTION__PLACEMENT = eINSTANCE.getFragmentSubstitution_Placement();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_SUBSTITUTION__MULTI = eINSTANCE.getFragmentSubstitution_Multi();

		/**
		 * The meta object literal for the '<em><b>Replacement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_SUBSTITUTION__REPLACEMENT = eINSTANCE.getFragmentSubstitution_Replacement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ChoiceVariationPointImpl <em>Choice Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ChoiceVariationPointImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getChoiceVariationPoint()
		 * @generated
		 */
		EClass CHOICE_VARIATION_POINT = eINSTANCE.getChoiceVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Binding Choice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_VARIATION_POINT__BINDING_CHOICE = eINSTANCE.getChoiceVariationPoint_BindingChoice();

		/**
		 * The meta object literal for the '<em><b>Mapping Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_VARIATION_POINT__MAPPING_EXPRESSION = eINSTANCE.getChoiceVariationPoint_MappingExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_VARIATION_POINT__EXPRESSION = eINSTANCE.getChoiceVariationPoint_Expression();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.RepeatableVariationPointImpl <em>Repeatable Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.RepeatableVariationPointImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getRepeatableVariationPoint()
		 * @generated
		 */
		EClass REPEATABLE_VARIATION_POINT = eINSTANCE.getRepeatableVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Binding Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATABLE_VARIATION_POINT__BINDING_CLASSIFIER = eINSTANCE.getRepeatableVariationPoint_BindingClassifier();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.BoundaryElementBindingImpl <em>Boundary Element Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.BoundaryElementBindingImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getBoundaryElementBinding()
		 * @generated
		 */
		EClass BOUNDARY_ELEMENT_BINDING = eINSTANCE.getBoundaryElementBinding();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.PlacementFragmentImpl <em>Placement Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.PlacementFragmentImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPlacementFragment()
		 * @generated
		 */
		EClass PLACEMENT_FRAGMENT = eINSTANCE.getPlacementFragment();

		/**
		 * The meta object literal for the '<em><b>Placement Boundary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEMENT_FRAGMENT__PLACEMENT_BOUNDARY_ELEMENT = eINSTANCE.getPlacementFragment_PlacementBoundaryElement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.PlacementBoundaryElementImpl <em>Placement Boundary Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.PlacementBoundaryElementImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPlacementBoundaryElement()
		 * @generated
		 */
		EClass PLACEMENT_BOUNDARY_ELEMENT = eINSTANCE.getPlacementBoundaryElement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ReplacementFragmentTypeImpl <em>Replacement Fragment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ReplacementFragmentTypeImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getReplacementFragmentType()
		 * @generated
		 */
		EClass REPLACEMENT_FRAGMENT_TYPE = eINSTANCE.getReplacementFragmentType();

		/**
		 * The meta object literal for the '<em><b>Replacement Boundary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACEMENT_FRAGMENT_TYPE__REPLACEMENT_BOUNDARY_ELEMENT = eINSTANCE.getReplacementFragmentType_ReplacementBoundaryElement();

		/**
		 * The meta object literal for the '<em><b>Placement Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACEMENT_FRAGMENT_TYPE__PLACEMENT_FRAGMENT = eINSTANCE.getReplacementFragmentType_PlacementFragment();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VariabletypeImpl <em>Variabletype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VariabletypeImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVariabletype()
		 * @generated
		 */
		EClass VARIABLETYPE = eINSTANCE.getVariabletype();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ReplacementBoundaryElementImpl <em>Replacement Boundary Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ReplacementBoundaryElementImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getReplacementBoundaryElement()
		 * @generated
		 */
		EClass REPLACEMENT_BOUNDARY_ELEMENT = eINSTANCE.getReplacementBoundaryElement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ObjectSubstitutionImpl <em>Object Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ObjectSubstitutionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectSubstitution()
		 * @generated
		 */
		EClass OBJECT_SUBSTITUTION = eINSTANCE.getObjectSubstitution();

		/**
		 * The meta object literal for the '<em><b>Placement Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SUBSTITUTION__PLACEMENT_OBJECT = eINSTANCE.getObjectSubstitution_PlacementObject();

		/**
		 * The meta object literal for the '<em><b>Replacement Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SUBSTITUTION__REPLACEMENT_OBJECT = eINSTANCE.getObjectSubstitution_ReplacementObject();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ObjectHandleImpl <em>Object Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ObjectHandleImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectHandle()
		 * @generated
		 */
		EClass OBJECT_HANDLE = eINSTANCE.getObjectHandle();

		/**
		 * The meta object literal for the '<em><b>MOF Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_HANDLE__MOF_REF = eINSTANCE.getObjectHandle_MOFRef();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.BaseModelHandleImpl <em>Base Model Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.BaseModelHandleImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getBaseModelHandle()
		 * @generated
		 */
		EClass BASE_MODEL_HANDLE = eINSTANCE.getBaseModelHandle();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MODEL_HANDLE__REFERENCE = eINSTANCE.getBaseModelHandle_Reference();

		/**
		 * The meta object literal for the '<em><b>Reference String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_MODEL_HANDLE__REFERENCE_STRING = eINSTANCE.getBaseModelHandle_ReferenceString();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ExistenceImpl <em>Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ExistenceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getExistence()
		 * @generated
		 */
		EClass EXISTENCE = eINSTANCE.getExistence();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VariableImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Replacement Fragment Typesubsetstype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__REPLACEMENT_FRAGMENT_TYPESUBSETSTYPE = eINSTANCE.getVariable_ReplacementFragmentTypesubsetstype();

		/**
		 * The meta object literal for the '<em><b>Defaul Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DEFAUL_VALUE = eINSTANCE.getVariable_DefaulValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ValueSpecificationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION__TYPE = eINSTANCE.getValueSpecification_Type();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VariableValueAssignmentImpl <em>Variable Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VariableValueAssignmentImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVariableValueAssignment()
		 * @generated
		 */
		EClass VARIABLE_VALUE_ASSIGNMENT = eINSTANCE.getVariableValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Resolved Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VARIABLE = eINSTANCE.getVariableValueAssignment_ResolvedVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_ASSIGNMENT__VALUE = eINSTANCE.getVariableValueAssignment_Value();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.PrimitveTypeImpl <em>Primitve Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.PrimitveTypeImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPrimitveType()
		 * @generated
		 */
		EClass PRIMITVE_TYPE = eINSTANCE.getPrimitveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITVE_TYPE__TYPE = eINSTANCE.getPrimitveType_Type();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ObjectTypeImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Meta Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__META_CLASS = eINSTANCE.getObjectType_MetaClass();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VInterfaceImpl <em>VInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VInterfaceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVInterface()
		 * @generated
		 */
		EClass VINTERFACE = eINSTANCE.getVInterface();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINTERFACE__MEMBER = eINSTANCE.getVInterface_Member();

		/**
		 * The meta object literal for the '<em><b>Owned Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINTERFACE__OWNED_CONSTRAINT = eINSTANCE.getVInterface_OwnedConstraint();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINTERFACE__SUPER = eINSTANCE.getVInterface_Super();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ConstraintImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONTEXT = eINSTANCE.getConstraint_Context();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.SlotAssignmentImpl <em>Slot Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.SlotAssignmentImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getSlotAssignment()
		 * @generated
		 */
		EClass SLOT_ASSIGNMENT = eINSTANCE.getSlotAssignment();

		/**
		 * The meta object literal for the '<em><b>Slot Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_ASSIGNMENT__SLOT_IDENTIFIER = eINSTANCE.getSlotAssignment_SlotIdentifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_ASSIGNMENT__VALUE = eINSTANCE.getSlotAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Slot Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_ASSIGNMENT__SLOT_OWNER = eINSTANCE.getSlotAssignment_SlotOwner();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.FixedSlotValueAssignmentImpl <em>Fixed Slot Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.FixedSlotValueAssignmentImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getFixedSlotValueAssignment()
		 * @generated
		 */
		EClass FIXED_SLOT_VALUE_ASSIGNMENT = eINSTANCE.getFixedSlotValueAssignment();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.FixedObjectSubstitutionImpl <em>Fixed Object Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.FixedObjectSubstitutionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getFixedObjectSubstitution()
		 * @generated
		 */
		EClass FIXED_OBJECT_SUBSTITUTION = eINSTANCE.getFixedObjectSubstitution();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ObjectExistenceImpl <em>Object Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ObjectExistenceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectExistence()
		 * @generated
		 */
		EClass OBJECT_EXISTENCE = eINSTANCE.getObjectExistence();

		/**
		 * The meta object literal for the '<em><b>Optional Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXISTENCE__OPTIONAL_OBJECT = eINSTANCE.getObjectExistence_OptionalObject();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.LinkAssignmentImpl <em>Link Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.LinkAssignmentImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getLinkAssignment()
		 * @generated
		 */
		EClass LINK_ASSIGNMENT = eINSTANCE.getLinkAssignment();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ASSIGNMENT__LINK = eINSTANCE.getLinkAssignment_Link();

		/**
		 * The meta object literal for the '<em><b>Link End Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ASSIGNMENT__LINK_END_IDENTIFIER = eINSTANCE.getLinkAssignment_LinkEndIdentifier();

		/**
		 * The meta object literal for the '<em><b>New End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ASSIGNMENT__NEW_END = eINSTANCE.getLinkAssignment_NewEnd();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.LinkHandleImpl <em>Link Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.LinkHandleImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getLinkHandle()
		 * @generated
		 */
		EClass LINK_HANDLE = eINSTANCE.getLinkHandle();

		/**
		 * The meta object literal for the '<em><b>MOF Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_HANDLE__MOF_REF = eINSTANCE.getLinkHandle_MOFRef();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ConfigurableUnitImpl <em>Configurable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ConfigurableUnitImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getConfigurableUnit()
		 * @generated
		 */
		EClass CONFIGURABLE_UNIT = eINSTANCE.getConfigurableUnit();

		/**
		 * The meta object literal for the '<em><b>Owned VSpec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT__OWNED_VSPEC = eINSTANCE.getConfigurableUnit_OwnedVSpec();

		/**
		 * The meta object literal for the '<em><b>Owned Variation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT__OWNED_VARIATION_POINT = eINSTANCE.getConfigurableUnit_OwnedVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Owned Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT__OWNED_CONSTRAINT = eINSTANCE.getConfigurableUnit_OwnedConstraint();

		/**
		 * The meta object literal for the '<em><b>Configurable Container Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT = eINSTANCE.getConfigurableUnit_ConfigurableContainerObject();

		/**
		 * The meta object literal for the '<em><b>Owned VSpec Resolution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION = eINSTANCE.getConfigurableUnit_OwnedVSpecResolution();

		/**
		 * The meta object literal for the '<em><b>Unit Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT__UNIT_INTERFACE = eINSTANCE.getConfigurableUnit_UnitInterface();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.CompositeVariationPointImpl <em>Composite Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.CompositeVariationPointImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getCompositeVariationPoint()
		 * @generated
		 */
		EClass COMPOSITE_VARIATION_POINT = eINSTANCE.getCompositeVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Binding CV Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC = eINSTANCE.getCompositeVariationPoint_BindingCVSpec();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VARIATION_POINT__CHILDREN = eINSTANCE.getCompositeVariationPoint_Children();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.CVSpecImpl <em>CV Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.CVSpecImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getCVSpec()
		 * @generated
		 */
		EClass CV_SPEC = eINSTANCE.getCVSpec();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV_SPEC__EXTENSION = eINSTANCE.getCVSpec_Extension();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VConfigurationImpl <em>VConfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VConfigurationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVConfiguration()
		 * @generated
		 */
		EClass VCONFIGURATION = eINSTANCE.getVConfiguration();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONFIGURATION__MEMBER = eINSTANCE.getVConfiguration_Member();

		/**
		 * The meta object literal for the '<em><b>Is Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONFIGURATION__IS_PARTIAL = eINSTANCE.getVConfiguration_IsPartial();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONFIGURATION__SUPER = eINSTANCE.getVConfiguration_Super();

		/**
		 * The meta object literal for the '<em><b>Resolved VI Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONFIGURATION__RESOLVED_VI_REF = eINSTANCE.getVConfiguration_ResolvedVIRef();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VSpec2VSpecMappingImpl <em>VSpec2 VSpec Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VSpec2VSpecMappingImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpec2VSpecMapping()
		 * @generated
		 */
		EClass VSPEC2_VSPEC_MAPPING = eINSTANCE.getVSpec2VSpecMapping();

		/**
		 * The meta object literal for the '<em><b>Deriving Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT = eINSTANCE.getVSpec2VSpecMapping_DerivingConstraint();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OpaqueConstraintImpl <em>Opaque Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OpaqueConstraintImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOpaqueConstraint()
		 * @generated
		 */
		EClass OPAQUE_CONSTRAINT = eINSTANCE.getOpaqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_CONSTRAINT__CONSTRAINT = eINSTANCE.getOpaqueConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_CONSTRAINT__CONSTRAINT_LANGUAGE = eINSTANCE.getOpaqueConstraint_ConstraintLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.LinkExistenceImpl <em>Link Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.LinkExistenceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getLinkExistence()
		 * @generated
		 */
		EClass LINK_EXISTENCE = eINSTANCE.getLinkExistence();

		/**
		 * The meta object literal for the '<em><b>Optional Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_EXISTENCE__OPTIONAL_LINK = eINSTANCE.getLinkExistence_OptionalLink();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OpaqueVariationPointImpl <em>Opaque Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OpaqueVariationPointImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOpaqueVariationPoint()
		 * @generated
		 */
		EClass OPAQUE_VARIATION_POINT = eINSTANCE.getOpaqueVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Place Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_VARIATION_POINT__PLACE_HOLDER = eINSTANCE.getOpaqueVariationPoint_PlaceHolder();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_VARIATION_POINT__SOURCE_OBJECT = eINSTANCE.getOpaqueVariationPoint_SourceObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_VARIATION_POINT__TYPE = eINSTANCE.getOpaqueVariationPoint_Type();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OVPTypeImpl <em>OVP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OVPTypeImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOVPType()
		 * @generated
		 */
		EClass OVP_TYPE = eINSTANCE.getOVPType();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVP_TYPE__SPEC = eINSTANCE.getOVPType_Spec();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OVPSemanticSpecImpl <em>OVP Semantic Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OVPSemanticSpecImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOVPSemanticSpec()
		 * @generated
		 */
		EClass OVP_SEMANTIC_SPEC = eINSTANCE.getOVPSemanticSpec();

		/**
		 * The meta object literal for the '<em><b>Model Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVP_SEMANTIC_SPEC__MODEL_TRANSFORMATION = eINSTANCE.getOVPSemanticSpec_ModelTransformation();

		/**
		 * The meta object literal for the '<em><b>Transfromation Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVP_SEMANTIC_SPEC__TRANSFROMATION_LANGUAGE = eINSTANCE.getOVPSemanticSpec_TransfromationLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ObjectSpecificationImpl <em>Object Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ObjectSpecificationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getObjectSpecification()
		 * @generated
		 */
		EClass OBJECT_SPECIFICATION = eINSTANCE.getObjectSpecification();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SPECIFICATION__OBJECT = eINSTANCE.getObjectSpecification_Object();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ReplacementFragmentSpecificationImpl <em>Replacement Fragment Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ReplacementFragmentSpecificationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getReplacementFragmentSpecification()
		 * @generated
		 */
		EClass REPLACEMENT_FRAGMENT_SPECIFICATION = eINSTANCE.getReplacementFragmentSpecification();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VPackageImpl <em>VPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VPackageImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVPackage()
		 * @generated
		 */
		EClass VPACKAGE = eINSTANCE.getVPackage();

		/**
		 * The meta object literal for the '<em><b>Package Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPACKAGE__PACKAGE_ELEMENT = eINSTANCE.getVPackage_PackageElement();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPACKAGE__IMPORTS = eINSTANCE.getVPackage_Imports();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ToBindingImpl <em>To Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ToBindingImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getToBinding()
		 * @generated
		 */
		EClass TO_BINDING = eINSTANCE.getToBinding();

		/**
		 * The meta object literal for the '<em><b>To Placement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_BINDING__TO_PLACEMENT = eINSTANCE.getToBinding_ToPlacement();

		/**
		 * The meta object literal for the '<em><b>To Replacement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_BINDING__TO_REPLACEMENT = eINSTANCE.getToBinding_ToReplacement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ToPlacementImpl <em>To Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ToPlacementImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getToPlacement()
		 * @generated
		 */
		EClass TO_PLACEMENT = eINSTANCE.getToPlacement();

		/**
		 * The meta object literal for the '<em><b>To Replacement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_PLACEMENT__TO_REPLACEMENT = eINSTANCE.getToPlacement_ToReplacement();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_PLACEMENT__PROPERTY_NAME = eINSTANCE.getToPlacement_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Inside Boundary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT = eINSTANCE.getToPlacement_InsideBoundaryElement();

		/**
		 * The meta object literal for the '<em><b>Outside Boundary Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT = eINSTANCE.getToPlacement_OutsideBoundaryElement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ToReplacementImpl <em>To Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ToReplacementImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getToReplacement()
		 * @generated
		 */
		EClass TO_REPLACEMENT = eINSTANCE.getToReplacement();

		/**
		 * The meta object literal for the '<em><b>Inside Boundary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT = eINSTANCE.getToReplacement_InsideBoundaryElement();

		/**
		 * The meta object literal for the '<em><b>To Placement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_REPLACEMENT__TO_PLACEMENT = eINSTANCE.getToReplacement_ToPlacement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.FromBindingImpl <em>From Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.FromBindingImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getFromBinding()
		 * @generated
		 */
		EClass FROM_BINDING = eINSTANCE.getFromBinding();

		/**
		 * The meta object literal for the '<em><b>From Placement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_BINDING__FROM_PLACEMENT = eINSTANCE.getFromBinding_FromPlacement();

		/**
		 * The meta object literal for the '<em><b>From Replacement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_BINDING__FROM_REPLACEMENT = eINSTANCE.getFromBinding_FromReplacement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.FromPlacementImpl <em>From Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.FromPlacementImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getFromPlacement()
		 * @generated
		 */
		EClass FROM_PLACEMENT = eINSTANCE.getFromPlacement();

		/**
		 * The meta object literal for the '<em><b>From Replacement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_PLACEMENT__FROM_REPLACEMENT = eINSTANCE.getFromPlacement_FromReplacement();

		/**
		 * The meta object literal for the '<em><b>Outside Boundary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT = eINSTANCE.getFromPlacement_OutsideBoundaryElement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.FromReplacementImpl <em>From Replacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.FromReplacementImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getFromReplacement()
		 * @generated
		 */
		EClass FROM_REPLACEMENT = eINSTANCE.getFromReplacement();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_REPLACEMENT__PROPERTY_NAME = eINSTANCE.getFromReplacement_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Inside Boundary Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT = eINSTANCE.getFromReplacement_InsideBoundaryElement();

		/**
		 * The meta object literal for the '<em><b>Outside Boundary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT = eINSTANCE.getFromReplacement_OutsideBoundaryElement();

		/**
		 * The meta object literal for the '<em><b>From Placement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_REPLACEMENT__FROM_PLACEMENT = eINSTANCE.getFromReplacement_FromPlacement();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VSpecRefImpl <em>VSpec Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VSpecRefImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecRef()
		 * @generated
		 */
		EClass VSPEC_REF = eINSTANCE.getVSpecRef();

		/**
		 * The meta object literal for the '<em><b>VSpec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC_REF__VSPEC = eINSTANCE.getVSpecRef_VSpec();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OCLExpressionImpl <em>OCL Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OCLExpressionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOCLExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOCLExpression();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VSpecToConfigMappingImpl <em>VSpec To Config Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VSpecToConfigMappingImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVSpecToConfigMapping()
		 * @generated
		 */
		EClass VSPEC_TO_CONFIG_MAPPING = eINSTANCE.getVSpecToConfigMapping();

		/**
		 * The meta object literal for the '<em><b>Then Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION = eINSTANCE.getVSpecToConfigMapping_ThenConfiguration();

		/**
		 * The meta object literal for the '<em><b>If Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT = eINSTANCE.getVSpecToConfigMapping_IfConstraint();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ParametricVariationPointImpl <em>Parametric Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ParametricVariationPointImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricVariationPoint()
		 * @generated
		 */
		EClass PARAMETRIC_VARIATION_POINT = eINSTANCE.getParametricVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Binding Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_VARIATION_POINT__BINDING_VARIABLE = eINSTANCE.getParametricVariationPoint_BindingVariable();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.SlotValueExistenceImpl <em>Slot Value Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.SlotValueExistenceImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getSlotValueExistence()
		 * @generated
		 */
		EClass SLOT_VALUE_EXISTENCE = eINSTANCE.getSlotValueExistence();

		/**
		 * The meta object literal for the '<em><b>Slot Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_VALUE_EXISTENCE__SLOT_IDENTIFIER = eINSTANCE.getSlotValueExistence_SlotIdentifier();

		/**
		 * The meta object literal for the '<em><b>Slot Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_VALUE_EXISTENCE__SLOT_OWNER = eINSTANCE.getSlotValueExistence_SlotOwner();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ParametricLinkAssignmentImpl <em>Parametric Link Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ParametricLinkAssignmentImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricLinkAssignment()
		 * @generated
		 */
		EClass PARAMETRIC_LINK_ASSIGNMENT = eINSTANCE.getParametricLinkAssignment();

		/**
		 * The meta object literal for the '<em><b>Link End Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRIC_LINK_ASSIGNMENT__LINK_END_IDENTIFIER = eINSTANCE.getParametricLinkAssignment_LinkEndIdentifier();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_LINK_ASSIGNMENT__LINK = eINSTANCE.getParametricLinkAssignment_Link();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ParametricObjectSubstitutionImpl <em>Parametric Object Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ParametricObjectSubstitutionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricObjectSubstitution()
		 * @generated
		 */
		EClass PARAMETRIC_OBJECT_SUBSTITUTION = eINSTANCE.getParametricObjectSubstitution();

		/**
		 * The meta object literal for the '<em><b>Placement Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_OBJECT_SUBSTITUTION__PLACEMENT_OBJECT = eINSTANCE.getParametricObjectSubstitution_PlacementObject();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ParametricSlotAssignmetImpl <em>Parametric Slot Assignmet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ParametricSlotAssignmetImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getParametricSlotAssignmet()
		 * @generated
		 */
		EClass PARAMETRIC_SLOT_ASSIGNMET = eINSTANCE.getParametricSlotAssignmet();

		/**
		 * The meta object literal for the '<em><b>Slot Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRIC_SLOT_ASSIGNMET__SLOT_IDENTIFIER = eINSTANCE.getParametricSlotAssignmet_SlotIdentifier();

		/**
		 * The meta object literal for the '<em><b>Slot Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_SLOT_ASSIGNMET__SLOT_OWNER = eINSTANCE.getParametricSlotAssignmet_SlotOwner();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ChoiceDerivationImpl <em>Choice Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ChoiceDerivationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getChoiceDerivation()
		 * @generated
		 */
		EClass CHOICE_DERIVATION = eINSTANCE.getChoiceDerivation();

		/**
		 * The meta object literal for the '<em><b>Deriving Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_DERIVATION__DERIVING_CONSTRAINT = eINSTANCE.getChoiceDerivation_DerivingConstraint();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.VariableDerivationImpl <em>Variable Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.VariableDerivationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getVariableDerivation()
		 * @generated
		 */
		EClass VARIABLE_DERIVATION = eINSTANCE.getVariableDerivation();

		/**
		 * The meta object literal for the '<em><b>Deriving Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DERIVATION__DERIVING_EXPRESSION = eINSTANCE.getVariableDerivation_DerivingExpression();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.CVSpecDerivationImpl <em>CV Spec Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.CVSpecDerivationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getCVSpecDerivation()
		 * @generated
		 */
		EClass CV_SPEC_DERIVATION = eINSTANCE.getCVSpecDerivation();

		/**
		 * The meta object literal for the '<em><b>Member Derivation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV_SPEC_DERIVATION__MEMBER_DERIVATION = eINSTANCE.getCVSpecDerivation_MemberDerivation();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ConfigurableUnitUsageImpl <em>Configurable Unit Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ConfigurableUnitUsageImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getConfigurableUnitUsage()
		 * @generated
		 */
		EClass CONFIGURABLE_UNIT_USAGE = eINSTANCE.getConfigurableUnitUsage();

		/**
		 * The meta object literal for the '<em><b>Used Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT_USAGE__USED_UNIT = eINSTANCE.getConfigurableUnitUsage_UsedUnit();

		/**
		 * The meta object literal for the '<em><b>Usage Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_UNIT_USAGE__USAGE_REFERENCE = eINSTANCE.getConfigurableUnitUsage_UsageReference();

		/**
		 * The meta object literal for the '<em><b>Link End Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_UNIT_USAGE__LINK_END_IDENTIFIER = eINSTANCE.getConfigurableUnitUsage_LinkEndIdentifier();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.PrimitiveValueSpecificationImpl <em>Primitive Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.PrimitiveValueSpecificationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPrimitiveValueSpecification()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE_SPECIFICATION = eINSTANCE.getPrimitiveValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION = eINSTANCE.getPrimitiveValueSpecification_Expression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE_SPECIFICATION__VALUE = eINSTANCE.getPrimitiveValueSpecification_Value();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OCLConstraintImpl <em>OCL Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OCLConstraintImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOCLConstraint()
		 * @generated
		 */
		EClass OCL_CONSTRAINT = eINSTANCE.getOCLConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONSTRAINT__EXPRESSION = eINSTANCE.getOCLConstraint_Expression();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.OperationCallExpImpl <em>Operation Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.OperationCallExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOperationCallExp()
		 * @generated
		 */
		EClass OPERATION_CALL_EXP = eINSTANCE.getOperationCallExp();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXP__ARGUMENT = eINSTANCE.getOperationCallExp_Argument();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_EXP__OPERATION = eINSTANCE.getOperationCallExp_Operation();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.BooleanLiteralExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getBooleanLiteralExp()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXP = eINSTANCE.getBooleanLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL_EXP__BOOL = eINSTANCE.getBooleanLiteralExp_Bool();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.StringLiteralExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getStringLiteralExp()
		 * @generated
		 */
		EClass STRING_LITERAL_EXP = eINSTANCE.getStringLiteralExp();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL_EXP__STRING = eINSTANCE.getStringLiteralExp_String();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.NumericLiteralExpImpl <em>Numeric Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.NumericLiteralExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getNumericLiteralExp()
		 * @generated
		 */
		EClass NUMERIC_LITERAL_EXP = eINSTANCE.getNumericLiteralExp();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.IntegerLiteralExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getIntegerLiteralExp()
		 * @generated
		 */
		EClass INTEGER_LITERAL_EXP = eINSTANCE.getIntegerLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL_EXP__INTEGER = eINSTANCE.getIntegerLiteralExp_Integer();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.UnlimitedLiteralExpImpl <em>Unlimited Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.UnlimitedLiteralExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getUnlimitedLiteralExp()
		 * @generated
		 */
		EClass UNLIMITED_LITERAL_EXP = eINSTANCE.getUnlimitedLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Unlimited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLIMITED_LITERAL_EXP__UNLIMITED = eINSTANCE.getUnlimitedLiteralExp_Unlimited();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.RealLiteralExpImpl <em>Real Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.RealLiteralExpImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getRealLiteralExp()
		 * @generated
		 */
		EClass REAL_LITERAL_EXP = eINSTANCE.getRealLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL_EXP__REAL = eINSTANCE.getRealLiteralExp_Real();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.PatternIntegrationImpl <em>Pattern Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.PatternIntegrationImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPatternIntegration()
		 * @generated
		 */
		EClass PATTERN_INTEGRATION = eINSTANCE.getPatternIntegration();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INTEGRATION__MULTI = eINSTANCE.getPatternIntegration_Multi();

		/**
		 * The meta object literal for the '<em><b>Substitutes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INTEGRATION__SUBSTITUTES = eINSTANCE.getPatternIntegration_Substitutes();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.PatternFusionImpl <em>Pattern Fusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.PatternFusionImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPatternFusion()
		 * @generated
		 */
		EClass PATTERN_FUSION = eINSTANCE.getPatternFusion();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FUSION__MULTI = eINSTANCE.getPatternFusion_Multi();

		/**
		 * The meta object literal for the '<em><b>Substitutes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_FUSION__SUBSTITUTES = eINSTANCE.getPatternFusion_Substitutes();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.StructuralOrganisationalPatternImpl <em>Structural Organisational Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.StructuralOrganisationalPatternImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getStructuralOrganisationalPattern()
		 * @generated
		 */
		EClass STRUCTURAL_ORGANISATIONAL_PATTERN = eINSTANCE.getStructuralOrganisationalPattern();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_ORGANISATIONAL_PATTERN__MULTI = eINSTANCE.getStructuralOrganisationalPattern_Multi();

		/**
		 * The meta object literal for the '<em><b>Substitutes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_ORGANISATIONAL_PATTERN__SUBSTITUTES = eINSTANCE.getStructuralOrganisationalPattern_Substitutes();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.impl.ImportImpl
		 * @see org.omg.cvl.impl.CvlPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.PrimitiveTypeEnum
		 * @see org.omg.cvl.impl.CvlPackageImpl#getPrimitiveTypeEnum()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE_ENUM = eINSTANCE.getPrimitiveTypeEnum();

		/**
		 * The meta object literal for the '{@link org.omg.cvl.Operation <em>Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.cvl.Operation
		 * @see org.omg.cvl.impl.CvlPackageImpl#getOperation()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOperation();

	}

} //CvlPackage

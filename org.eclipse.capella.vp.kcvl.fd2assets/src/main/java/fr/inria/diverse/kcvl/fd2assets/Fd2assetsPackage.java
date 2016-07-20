/**
 */
package fr.inria.diverse.kcvl.fd2assets;

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
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsFactory
 * @model kind="package"
 * @generated
 */
public interface Fd2assetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fd2assets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/fd2assets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fd2assets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fd2assetsPackage eINSTANCE = fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRulesetImpl <em>Restriction Ruleset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRulesetImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getRestrictionRuleset()
	 * @generated
	 */
	int RESTRICTION_RULESET = 0;

	/**
	 * The feature id for the '<em><b>Cvlmodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULESET__CVLMODEL = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULESET__RULE = 1;

	/**
	 * The number of structural features of the '<em>Restriction Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULESET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Restriction Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULESET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRuleImpl <em>Restriction Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRuleImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getRestrictionRule()
	 * @generated
	 */
	int RESTRICTION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Restriction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Restriction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.ExpressionImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.HasChoiceImpl <em>Has Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.HasChoiceImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getHasChoice()
	 * @generated
	 */
	int HAS_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Choice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHOICE__CHOICE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHOICE__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHOICE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Has Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_CHOICE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.BinExpressionImpl <em>Bin Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.BinExpressionImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getBinExpression()
	 * @generated
	 */
	int BIN_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bin Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bin Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.UnaryExpressionImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.ConditionImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getConditionExpression()
	 * @generated
	 */
	int CONDITION_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Feature Attibute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION__OP = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION__VALUE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.BinConditionImpl <em>Bin Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.BinConditionImpl
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getBinCondition()
	 * @generated
	 */
	int BIN_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_CONDITION__OP = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bin Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bin Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.Operator
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 9;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.CompareOperator <em>Compare Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.CompareOperator
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getCompareOperator()
	 * @generated
	 */
	int COMPARE_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.kcvl.fd2assets.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryOperator
	 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 11;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset <em>Restriction Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Ruleset</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset
	 * @generated
	 */
	EClass getRestrictionRuleset();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getCvlmodel <em>Cvlmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvlmodel</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getCvlmodel()
	 * @see #getRestrictionRuleset()
	 * @generated
	 */
	EAttribute getRestrictionRuleset_Cvlmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getRule()
	 * @see #getRestrictionRuleset()
	 * @generated
	 */
	EReference getRestrictionRuleset_Rule();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRule <em>Restriction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Rule</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.RestrictionRule
	 * @generated
	 */
	EClass getRestrictionRule();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.RestrictionRule#getName()
	 * @see #getRestrictionRule()
	 * @generated
	 */
	EAttribute getRestrictionRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.RestrictionRule#getExpression()
	 * @see #getRestrictionRule()
	 * @generated
	 */
	EReference getRestrictionRule_Expression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.HasChoice <em>Has Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Choice</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.HasChoice
	 * @generated
	 */
	EClass getHasChoice();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.HasChoice#getChoiceName <em>Choice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choice Name</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.HasChoice#getChoiceName()
	 * @see #getHasChoice()
	 * @generated
	 */
	EAttribute getHasChoice_ChoiceName();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.HasChoice#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.HasChoice#getCondition()
	 * @see #getHasChoice()
	 * @generated
	 */
	EReference getHasChoice_Condition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression <em>Bin Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Expression</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinExpression
	 * @generated
	 */
	EClass getBinExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinExpression#getLeft()
	 * @see #getBinExpression()
	 * @generated
	 */
	EReference getBinExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinExpression#getRight()
	 * @see #getBinExpression()
	 * @generated
	 */
	EReference getBinExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinExpression#getOp()
	 * @see #getBinExpression()
	 * @generated
	 */
	EAttribute getBinExpression_Op();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getLeft()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Op();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expression</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.ConditionExpression
	 * @generated
	 */
	EClass getConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getFeatureAttibuteName <em>Feature Attibute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Attibute Name</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getFeatureAttibuteName()
	 * @see #getConditionExpression()
	 * @generated
	 */
	EAttribute getConditionExpression_FeatureAttibuteName();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getOp()
	 * @see #getConditionExpression()
	 * @generated
	 */
	EAttribute getConditionExpression_Op();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getValue()
	 * @see #getConditionExpression()
	 * @generated
	 */
	EAttribute getConditionExpression_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.kcvl.fd2assets.BinCondition <em>Bin Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Condition</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinCondition
	 * @generated
	 */
	EClass getBinCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.BinCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinCondition#getLeft()
	 * @see #getBinCondition()
	 * @generated
	 */
	EReference getBinCondition_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.kcvl.fd2assets.BinCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinCondition#getRight()
	 * @see #getBinCondition()
	 * @generated
	 */
	EReference getBinCondition_Right();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.kcvl.fd2assets.BinCondition#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.BinCondition#getOp()
	 * @see #getBinCondition()
	 * @generated
	 */
	EAttribute getBinCondition_Op();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.kcvl.fd2assets.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.kcvl.fd2assets.CompareOperator <em>Compare Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compare Operator</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.CompareOperator
	 * @generated
	 */
	EEnum getCompareOperator();

	/**
	 * Returns the meta object for enum '{@link fr.inria.diverse.kcvl.fd2assets.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fd2assetsFactory getFd2assetsFactory();

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
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRulesetImpl <em>Restriction Ruleset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRulesetImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getRestrictionRuleset()
		 * @generated
		 */
		EClass RESTRICTION_RULESET = eINSTANCE.getRestrictionRuleset();

		/**
		 * The meta object literal for the '<em><b>Cvlmodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_RULESET__CVLMODEL = eINSTANCE.getRestrictionRuleset_Cvlmodel();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_RULESET__RULE = eINSTANCE.getRestrictionRuleset_Rule();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRuleImpl <em>Restriction Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRuleImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getRestrictionRule()
		 * @generated
		 */
		EClass RESTRICTION_RULE = eINSTANCE.getRestrictionRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_RULE__NAME = eINSTANCE.getRestrictionRule_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_RULE__EXPRESSION = eINSTANCE.getRestrictionRule_Expression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.ExpressionImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.HasChoiceImpl <em>Has Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.HasChoiceImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getHasChoice()
		 * @generated
		 */
		EClass HAS_CHOICE = eINSTANCE.getHasChoice();

		/**
		 * The meta object literal for the '<em><b>Choice Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_CHOICE__CHOICE_NAME = eINSTANCE.getHasChoice_ChoiceName();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_CHOICE__CONDITION = eINSTANCE.getHasChoice_Condition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.BinExpressionImpl <em>Bin Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.BinExpressionImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getBinExpression()
		 * @generated
		 */
		EClass BIN_EXPRESSION = eINSTANCE.getBinExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_EXPRESSION__LEFT = eINSTANCE.getBinExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_EXPRESSION__RIGHT = eINSTANCE.getBinExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIN_EXPRESSION__OP = eINSTANCE.getBinExpression_Op();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.UnaryExpressionImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__LEFT = eINSTANCE.getUnaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.ConditionImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getConditionExpression()
		 * @generated
		 */
		EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Feature Attibute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME = eINSTANCE.getConditionExpression_FeatureAttibuteName();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_EXPRESSION__OP = eINSTANCE.getConditionExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_EXPRESSION__VALUE = eINSTANCE.getConditionExpression_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.impl.BinConditionImpl <em>Bin Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.BinConditionImpl
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getBinCondition()
		 * @generated
		 */
		EClass BIN_CONDITION = eINSTANCE.getBinCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_CONDITION__LEFT = eINSTANCE.getBinCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_CONDITION__RIGHT = eINSTANCE.getBinCondition_Right();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIN_CONDITION__OP = eINSTANCE.getBinCondition_Op();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.Operator
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.CompareOperator <em>Compare Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.CompareOperator
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getCompareOperator()
		 * @generated
		 */
		EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.kcvl.fd2assets.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.kcvl.fd2assets.UnaryOperator
		 * @see fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

	}

} //Fd2assetsPackage

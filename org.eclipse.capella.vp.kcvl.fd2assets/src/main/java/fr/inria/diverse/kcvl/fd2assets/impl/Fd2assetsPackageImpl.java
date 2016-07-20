/**
 */
package fr.inria.diverse.kcvl.fd2assets.impl;

import fr.inria.diverse.kcvl.fd2assets.BinCondition;
import fr.inria.diverse.kcvl.fd2assets.BinExpression;
import fr.inria.diverse.kcvl.fd2assets.CompareOperator;
import fr.inria.diverse.kcvl.fd2assets.Condition;
import fr.inria.diverse.kcvl.fd2assets.ConditionExpression;
import fr.inria.diverse.kcvl.fd2assets.Expression;
import fr.inria.diverse.kcvl.fd2assets.Fd2assetsFactory;
import fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage;
import fr.inria.diverse.kcvl.fd2assets.HasChoice;
import fr.inria.diverse.kcvl.fd2assets.Operator;
import fr.inria.diverse.kcvl.fd2assets.RestrictionRule;
import fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset;
import fr.inria.diverse.kcvl.fd2assets.UnaryExpression;
import fr.inria.diverse.kcvl.fd2assets.UnaryOperator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fd2assetsPackageImpl extends EPackageImpl implements Fd2assetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionRulesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compareOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fd2assetsPackageImpl() {
		super(eNS_URI, Fd2assetsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Fd2assetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fd2assetsPackage init() {
		if (isInited) return (Fd2assetsPackage)EPackage.Registry.INSTANCE.getEPackage(Fd2assetsPackage.eNS_URI);

		// Obtain or create and register package
		Fd2assetsPackageImpl theFd2assetsPackage = (Fd2assetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Fd2assetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Fd2assetsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFd2assetsPackage.createPackageContents();

		// Initialize created meta-data
		theFd2assetsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFd2assetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fd2assetsPackage.eNS_URI, theFd2assetsPackage);
		return theFd2assetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionRuleset() {
		return restrictionRulesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictionRuleset_Cvlmodel() {
		return (EAttribute)restrictionRulesetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionRuleset_Rule() {
		return (EReference)restrictionRulesetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionRule() {
		return restrictionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictionRule_Name() {
		return (EAttribute)restrictionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionRule_Expression() {
		return (EReference)restrictionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasChoice() {
		return hasChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasChoice_ChoiceName() {
		return (EAttribute)hasChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasChoice_Condition() {
		return (EReference)hasChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinExpression() {
		return binExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinExpression_Left() {
		return (EReference)binExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinExpression_Right() {
		return (EReference)binExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinExpression_Op() {
		return (EAttribute)binExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Left() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Op() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionExpression() {
		return conditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionExpression_FeatureAttibuteName() {
		return (EAttribute)conditionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionExpression_Op() {
		return (EAttribute)conditionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionExpression_Value() {
		return (EAttribute)conditionExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinCondition() {
		return binConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinCondition_Left() {
		return (EReference)binConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinCondition_Right() {
		return (EReference)binConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinCondition_Op() {
		return (EAttribute)binConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompareOperator() {
		return compareOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fd2assetsFactory getFd2assetsFactory() {
		return (Fd2assetsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		restrictionRulesetEClass = createEClass(RESTRICTION_RULESET);
		createEAttribute(restrictionRulesetEClass, RESTRICTION_RULESET__CVLMODEL);
		createEReference(restrictionRulesetEClass, RESTRICTION_RULESET__RULE);

		restrictionRuleEClass = createEClass(RESTRICTION_RULE);
		createEAttribute(restrictionRuleEClass, RESTRICTION_RULE__NAME);
		createEReference(restrictionRuleEClass, RESTRICTION_RULE__EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);

		hasChoiceEClass = createEClass(HAS_CHOICE);
		createEAttribute(hasChoiceEClass, HAS_CHOICE__CHOICE_NAME);
		createEReference(hasChoiceEClass, HAS_CHOICE__CONDITION);

		binExpressionEClass = createEClass(BIN_EXPRESSION);
		createEReference(binExpressionEClass, BIN_EXPRESSION__LEFT);
		createEReference(binExpressionEClass, BIN_EXPRESSION__RIGHT);
		createEAttribute(binExpressionEClass, BIN_EXPRESSION__OP);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__LEFT);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OP);

		conditionEClass = createEClass(CONDITION);

		conditionExpressionEClass = createEClass(CONDITION_EXPRESSION);
		createEAttribute(conditionExpressionEClass, CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME);
		createEAttribute(conditionExpressionEClass, CONDITION_EXPRESSION__OP);
		createEAttribute(conditionExpressionEClass, CONDITION_EXPRESSION__VALUE);

		binConditionEClass = createEClass(BIN_CONDITION);
		createEReference(binConditionEClass, BIN_CONDITION__LEFT);
		createEReference(binConditionEClass, BIN_CONDITION__RIGHT);
		createEAttribute(binConditionEClass, BIN_CONDITION__OP);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
		compareOperatorEEnum = createEEnum(COMPARE_OPERATOR);
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hasChoiceEClass.getESuperTypes().add(this.getExpression());
		binExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		conditionExpressionEClass.getESuperTypes().add(this.getCondition());
		binConditionEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(restrictionRulesetEClass, RestrictionRuleset.class, "RestrictionRuleset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictionRuleset_Cvlmodel(), ecorePackage.getEString(), "cvlmodel", null, 1, 1, RestrictionRuleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionRuleset_Rule(), this.getRestrictionRule(), null, "rule", null, 0, -1, RestrictionRuleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionRuleEClass, RestrictionRule.class, "RestrictionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictionRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, RestrictionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionRule_Expression(), this.getExpression(), null, "expression", null, 1, 1, RestrictionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasChoiceEClass, HasChoice.class, "HasChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasChoice_ChoiceName(), ecorePackage.getEString(), "choiceName", null, 1, 1, HasChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasChoice_Condition(), this.getCondition(), null, "condition", null, 0, 1, HasChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binExpressionEClass, BinExpression.class, "BinExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinExpression_Right(), this.getExpression(), null, "right", null, 1, 1, BinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinExpression_Op(), this.getOperator(), "op", null, 1, 1, BinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Op(), this.getUnaryOperator(), "op", "op", 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionExpressionEClass, ConditionExpression.class, "ConditionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionExpression_FeatureAttibuteName(), ecorePackage.getEString(), "featureAttibuteName", null, 1, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionExpression_Op(), this.getCompareOperator(), "op", null, 1, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1, ConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binConditionEClass, BinCondition.class, "BinCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinCondition_Left(), this.getCondition(), null, "left", null, 1, 1, BinCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinCondition_Right(), this.getCondition(), null, "right", null, 1, 1, BinCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinCondition_Op(), this.getOperator(), "op", null, 1, 1, BinCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.OR);
		addEEnumLiteral(operatorEEnum, Operator.AND);
		addEEnumLiteral(operatorEEnum, Operator.XOR);

		initEEnum(compareOperatorEEnum, CompareOperator.class, "CompareOperator");
		addEEnumLiteral(compareOperatorEEnum, CompareOperator.SUP);
		addEEnumLiteral(compareOperatorEEnum, CompareOperator.SUPEQ);
		addEEnumLiteral(compareOperatorEEnum, CompareOperator.INF);
		addEEnumLiteral(compareOperatorEEnum, CompareOperator.INFEQ);
		addEEnumLiteral(compareOperatorEEnum, CompareOperator.EQ);

		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.OP);

		// Create resource
		createResource(eNS_URI);
	}

} //Fd2assetsPackageImpl

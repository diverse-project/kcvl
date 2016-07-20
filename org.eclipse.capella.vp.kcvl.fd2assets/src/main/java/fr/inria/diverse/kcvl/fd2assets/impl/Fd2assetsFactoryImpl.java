/**
 */
package fr.inria.diverse.kcvl.fd2assets.impl;

import fr.inria.diverse.kcvl.fd2assets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fd2assetsFactoryImpl extends EFactoryImpl implements Fd2assetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fd2assetsFactory init() {
		try {
			Fd2assetsFactory theFd2assetsFactory = (Fd2assetsFactory)EPackage.Registry.INSTANCE.getEFactory(Fd2assetsPackage.eNS_URI);
			if (theFd2assetsFactory != null) {
				return theFd2assetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fd2assetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fd2assetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Fd2assetsPackage.RESTRICTION_RULESET: return createRestrictionRuleset();
			case Fd2assetsPackage.RESTRICTION_RULE: return createRestrictionRule();
			case Fd2assetsPackage.HAS_CHOICE: return createHasChoice();
			case Fd2assetsPackage.BIN_EXPRESSION: return createBinExpression();
			case Fd2assetsPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case Fd2assetsPackage.CONDITION_EXPRESSION: return createConditionExpression();
			case Fd2assetsPackage.BIN_CONDITION: return createBinCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Fd2assetsPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case Fd2assetsPackage.COMPARE_OPERATOR:
				return createCompareOperatorFromString(eDataType, initialValue);
			case Fd2assetsPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Fd2assetsPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case Fd2assetsPackage.COMPARE_OPERATOR:
				return convertCompareOperatorToString(eDataType, instanceValue);
			case Fd2assetsPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionRuleset createRestrictionRuleset() {
		RestrictionRulesetImpl restrictionRuleset = new RestrictionRulesetImpl();
		return restrictionRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionRule createRestrictionRule() {
		RestrictionRuleImpl restrictionRule = new RestrictionRuleImpl();
		return restrictionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasChoice createHasChoice() {
		HasChoiceImpl hasChoice = new HasChoiceImpl();
		return hasChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinExpression createBinExpression() {
		BinExpressionImpl binExpression = new BinExpressionImpl();
		return binExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpression createConditionExpression() {
		ConditionExpressionImpl conditionExpression = new ConditionExpressionImpl();
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinCondition createBinCondition() {
		BinConditionImpl binCondition = new BinConditionImpl();
		return binCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareOperator createCompareOperatorFromString(EDataType eDataType, String initialValue) {
		CompareOperator result = CompareOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompareOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fd2assetsPackage getFd2assetsPackage() {
		return (Fd2assetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fd2assetsPackage getPackage() {
		return Fd2assetsPackage.eINSTANCE;
	}

} //Fd2assetsFactoryImpl

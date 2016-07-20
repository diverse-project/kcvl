/**
 */
package fr.inria.diverse.kcvl.fd2assets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage
 * @generated
 */
public interface Fd2assetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fd2assetsFactory eINSTANCE = fr.inria.diverse.kcvl.fd2assets.impl.Fd2assetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Restriction Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Ruleset</em>'.
	 * @generated
	 */
	RestrictionRuleset createRestrictionRuleset();

	/**
	 * Returns a new object of class '<em>Restriction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Rule</em>'.
	 * @generated
	 */
	RestrictionRule createRestrictionRule();

	/**
	 * Returns a new object of class '<em>Has Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Choice</em>'.
	 * @generated
	 */
	HasChoice createHasChoice();

	/**
	 * Returns a new object of class '<em>Bin Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bin Expression</em>'.
	 * @generated
	 */
	BinExpression createBinExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Expression</em>'.
	 * @generated
	 */
	ConditionExpression createConditionExpression();

	/**
	 * Returns a new object of class '<em>Bin Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bin Condition</em>'.
	 * @generated
	 */
	BinCondition createBinCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fd2assetsPackage getFd2assetsPackage();

} //Fd2assetsFactory

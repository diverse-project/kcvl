/**
 */
package org.omg.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.cvl.Choice;
import org.omg.cvl.ChoiceVariationPoint;
import org.omg.cvl.CvlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Variation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.ChoiceVariationPointImpl#getBindingChoice <em>Binding Choice</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ChoiceVariationPointImpl#getMappingExpression <em>Mapping Expression</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ChoiceVariationPointImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChoiceVariationPointImpl extends VariationPointImpl implements ChoiceVariationPoint {
	/**
	 * The cached value of the '{@link #getBindingChoice() <em>Binding Choice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> bindingChoice;

	/**
	 * The default value of the '{@link #getMappingExpression() <em>Mapping Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingExpression() <em>Mapping Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingExpression()
	 * @generated
	 * @ordered
	 */
	protected String mappingExpression = MAPPING_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceVariationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.CHOICE_VARIATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getBindingChoice() {
		if (bindingChoice == null) {
			bindingChoice = new EObjectResolvingEList<Choice>(Choice.class, this, CvlPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE);
		}
		return bindingChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappingExpression() {
		return mappingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingExpression(String newMappingExpression) {
		String oldMappingExpression = mappingExpression;
		mappingExpression = newMappingExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.CHOICE_VARIATION_POINT__MAPPING_EXPRESSION, oldMappingExpression, mappingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.CHOICE_VARIATION_POINT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvlPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				return getBindingChoice();
			case CvlPackage.CHOICE_VARIATION_POINT__MAPPING_EXPRESSION:
				return getMappingExpression();
			case CvlPackage.CHOICE_VARIATION_POINT__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CvlPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				getBindingChoice().clear();
				getBindingChoice().addAll((Collection<? extends Choice>)newValue);
				return;
			case CvlPackage.CHOICE_VARIATION_POINT__MAPPING_EXPRESSION:
				setMappingExpression((String)newValue);
				return;
			case CvlPackage.CHOICE_VARIATION_POINT__EXPRESSION:
				setExpression((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CvlPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				getBindingChoice().clear();
				return;
			case CvlPackage.CHOICE_VARIATION_POINT__MAPPING_EXPRESSION:
				setMappingExpression(MAPPING_EXPRESSION_EDEFAULT);
				return;
			case CvlPackage.CHOICE_VARIATION_POINT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CvlPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				return bindingChoice != null && !bindingChoice.isEmpty();
			case CvlPackage.CHOICE_VARIATION_POINT__MAPPING_EXPRESSION:
				return MAPPING_EXPRESSION_EDEFAULT == null ? mappingExpression != null : !MAPPING_EXPRESSION_EDEFAULT.equals(mappingExpression);
			case CvlPackage.CHOICE_VARIATION_POINT__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mappingExpression: ");
		result.append(mappingExpression);
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //ChoiceVariationPointImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.expressions.impl.ExpressionImpl;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.reconfiguration.ReconfigurationRule;
import org.muml.reconfiguration.expression.ExpressionPackage;
import org.muml.reconfiguration.expression.ReconfigurationRuleCallExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Rule Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.expression.impl.ReconfigurationRuleCallExpressionImpl#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link org.muml.reconfiguration.expression.impl.ReconfigurationRuleCallExpressionImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationRuleCallExpressionImpl extends ExpressionImpl implements ReconfigurationRuleCallExpression {
	/**
	 * The cached value of the '{@link #getReconfigurationRule() <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationRule()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationRule reconfigurationRule;

	/**
	 * The cached value of the '{@link #getParameterBindings() <em>Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationRuleCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.RECONFIGURATION_RULE_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule getReconfigurationRule() {
		if (reconfigurationRule != null && reconfigurationRule.eIsProxy()) {
			InternalEObject oldReconfigurationRule = (InternalEObject)reconfigurationRule;
			reconfigurationRule = (ReconfigurationRule)eResolveProxy(oldReconfigurationRule);
			if (reconfigurationRule != oldReconfigurationRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE, oldReconfigurationRule, reconfigurationRule));
			}
		}
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule basicGetReconfigurationRule() {
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationRule(ReconfigurationRule newReconfigurationRule) {
		ReconfigurationRule oldReconfigurationRule = reconfigurationRule;
		reconfigurationRule = newReconfigurationRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE, oldReconfigurationRule, reconfigurationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS);
		}
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return ((InternalEList<?>)getParameterBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE:
				if (resolve) return getReconfigurationRule();
				return basicGetReconfigurationRule();
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return getParameterBindings();
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
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)newValue);
				return;
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				getParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)null);
				return;
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
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
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE:
				return reconfigurationRule != null;
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationRuleCallExpressionImpl

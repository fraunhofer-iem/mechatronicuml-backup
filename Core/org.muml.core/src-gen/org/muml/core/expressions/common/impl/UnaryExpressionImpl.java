/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.expressions.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.common.CommonPackage;
import org.muml.core.expressions.common.UnaryExpression;
import org.muml.core.expressions.common.UnaryOperator;
import org.muml.core.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.expressions.common.impl.UnaryExpressionImpl#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 *   <li>{@link org.muml.core.expressions.common.impl.UnaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExpressionImpl extends ExpressionImpl implements
		UnaryExpression {
	/**
	 * The cached value of the '{@link #getEnclosedExpression() <em>Enclosed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression enclosedExpression;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryOperator OPERATOR_EDEFAULT = UnaryOperator.NOT;
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEnclosedExpression() {
		return enclosedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosedExpression(
			Expression newEnclosedExpression, NotificationChain msgs) {
		Expression oldEnclosedExpression = enclosedExpression;
		enclosedExpression = newEnclosedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, oldEnclosedExpression, newEnclosedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosedExpression(Expression newEnclosedExpression) {
		if (newEnclosedExpression != enclosedExpression) {
			NotificationChain msgs = null;
			if (enclosedExpression != null)
				msgs = ((InternalEObject)enclosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			if (newEnclosedExpression != null)
				msgs = ((InternalEObject)newEnclosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			msgs = basicSetEnclosedExpression(newEnclosedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, newEnclosedExpression, newEnclosedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(UnaryOperator newOperator) {
		UnaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.UNARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				return basicSetEnclosedExpression(null, msgs);
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
			case CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				return getEnclosedExpression();
			case CommonPackage.UNARY_EXPRESSION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				setEnclosedExpression((Expression)newValue);
				return;
			case CommonPackage.UNARY_EXPRESSION__OPERATOR:
				setOperator((UnaryOperator)newValue);
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
			case CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				setEnclosedExpression((Expression)null);
				return;
			case CommonPackage.UNARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case CommonPackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				return enclosedExpression != null;
			case CommonPackage.UNARY_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UnaryExpressionImpl

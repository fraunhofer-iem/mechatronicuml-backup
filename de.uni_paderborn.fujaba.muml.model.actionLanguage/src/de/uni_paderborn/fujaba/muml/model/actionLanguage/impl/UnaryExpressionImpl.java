/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.UnaryOperator;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.UnaryExpressionImpl#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.UnaryExpressionImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryExpressionImpl extends ExpressionImpl implements UnaryExpression {
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
	 * The default value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperator()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryOperator UNARY_OPERATOR_EDEFAULT = UnaryOperator.NOT;

	/**
	 * The cached value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator unaryOperator = UNARY_OPERATOR_EDEFAULT;

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
		return ActionLanguagePackage.Literals.UNARY_EXPRESSION;
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
	public NotificationChain basicSetEnclosedExpression(Expression newEnclosedExpression, NotificationChain msgs) {
		Expression oldEnclosedExpression = enclosedExpression;
		enclosedExpression = newEnclosedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, oldEnclosedExpression, newEnclosedExpression);
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
				msgs = ((InternalEObject)enclosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			if (newEnclosedExpression != null)
				msgs = ((InternalEObject)newEnclosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			msgs = basicSetEnclosedExpression(newEnclosedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION, newEnclosedExpression, newEnclosedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator getUnaryOperator() {
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperator(UnaryOperator newUnaryOperator) {
		UnaryOperator oldUnaryOperator = unaryOperator;
		unaryOperator = newUnaryOperator == null ? UNARY_OPERATOR_EDEFAULT : newUnaryOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.UNARY_EXPRESSION__UNARY_OPERATOR, oldUnaryOperator, unaryOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
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
			case ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				return getEnclosedExpression();
			case ActionLanguagePackage.UNARY_EXPRESSION__UNARY_OPERATOR:
				return getUnaryOperator();
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
			case ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				setEnclosedExpression((Expression)newValue);
				return;
			case ActionLanguagePackage.UNARY_EXPRESSION__UNARY_OPERATOR:
				setUnaryOperator((UnaryOperator)newValue);
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
			case ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				setEnclosedExpression((Expression)null);
				return;
			case ActionLanguagePackage.UNARY_EXPRESSION__UNARY_OPERATOR:
				setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
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
			case ActionLanguagePackage.UNARY_EXPRESSION__ENCLOSED_EXPRESSION:
				return enclosedExpression != null;
			case ActionLanguagePackage.UNARY_EXPRESSION__UNARY_OPERATOR:
				return unaryOperator != UNARY_OPERATOR_EDEFAULT;
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
		result.append(" (unaryOperator: ");
		result.append(unaryOperator);
		result.append(')');
		return result.toString();
	}

} //UnaryExpressionImpl

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
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.AttributeExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.VariableExpression;
import de.uni_paderborn.fujaba.muml.model.core.Variable;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getRhs_assignExpression <em>Rhs assign Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getLhs_attributeExpression <em>Lhs attribute Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * The default value of the '{@link #getAssignOperator() <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AssignOperator ASSIGN_OPERATOR_EDEFAULT = AssignOperator.UNSET;

	/**
	 * The cached value of the '{@link #getAssignOperator() <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOperator()
	 * @generated
	 * @ordered
	 */
	protected AssignOperator assignOperator = ASSIGN_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRhs_assignExpression() <em>Rhs assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs_assignExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression rhs_assignExpression;

	/**
	 * The default value of the '{@link #getIncrementDecrementOperator() <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IncrementDecrementOperator INCREMENT_DECREMENT_OPERATOR_EDEFAULT = IncrementDecrementOperator.UNSET;

	/**
	 * The cached value of the '{@link #getIncrementDecrementOperator() <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 * @ordered
	 */
	protected IncrementDecrementOperator incrementDecrementOperator = INCREMENT_DECREMENT_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhs_attributeExpression() <em>Lhs attribute Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs_attributeExpression()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression lhs_attributeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionLanguagePackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignOperator getAssignOperator() {
		return assignOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignOperator(AssignOperator newAssignOperator) {
		AssignOperator oldAssignOperator = assignOperator;
		assignOperator = newAssignOperator == null ? ASSIGN_OPERATOR_EDEFAULT : newAssignOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR, oldAssignOperator, assignOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRhs_assignExpression() {
		return rhs_assignExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs_assignExpression(Expression newRhs_assignExpression, NotificationChain msgs) {
		Expression oldRhs_assignExpression = rhs_assignExpression;
		rhs_assignExpression = newRhs_assignExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, oldRhs_assignExpression, newRhs_assignExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs_assignExpression(Expression newRhs_assignExpression) {
		if (newRhs_assignExpression != rhs_assignExpression) {
			NotificationChain msgs = null;
			if (rhs_assignExpression != null)
				msgs = ((InternalEObject)rhs_assignExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, null, msgs);
			if (newRhs_assignExpression != null)
				msgs = ((InternalEObject)newRhs_assignExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, null, msgs);
			msgs = basicSetRhs_assignExpression(newRhs_assignExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, newRhs_assignExpression, newRhs_assignExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementDecrementOperator getIncrementDecrementOperator() {
		return incrementDecrementOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementDecrementOperator(IncrementDecrementOperator newIncrementDecrementOperator) {
		IncrementDecrementOperator oldIncrementDecrementOperator = incrementDecrementOperator;
		incrementDecrementOperator = newIncrementDecrementOperator == null ? INCREMENT_DECREMENT_OPERATOR_EDEFAULT : newIncrementDecrementOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR, oldIncrementDecrementOperator, incrementDecrementOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpression getLhs_attributeExpression() {
		return lhs_attributeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs_attributeExpression(VariableExpression newLhs_attributeExpression, NotificationChain msgs) {
		VariableExpression oldLhs_attributeExpression = lhs_attributeExpression;
		lhs_attributeExpression = newLhs_attributeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION, oldLhs_attributeExpression, newLhs_attributeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs_attributeExpression(VariableExpression newLhs_attributeExpression) {
		if (newLhs_attributeExpression != lhs_attributeExpression) {
			NotificationChain msgs = null;
			if (lhs_attributeExpression != null)
				msgs = ((InternalEObject)lhs_attributeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION, null, msgs);
			if (newLhs_attributeExpression != null)
				msgs = ((InternalEObject)newLhs_attributeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION, null, msgs);
			msgs = basicSetLhs_attributeExpression(newLhs_attributeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION, newLhs_attributeExpression, newLhs_attributeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				return basicSetRhs_assignExpression(null, msgs);
			case ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION:
				return basicSetLhs_attributeExpression(null, msgs);
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
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				return getAssignOperator();
			case ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				return getRhs_assignExpression();
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				return getIncrementDecrementOperator();
			case ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION:
				return getLhs_attributeExpression();
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
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				setAssignOperator((AssignOperator)newValue);
				return;
			case ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				setRhs_assignExpression((Expression)newValue);
				return;
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator((IncrementDecrementOperator)newValue);
				return;
			case ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION:
				setLhs_attributeExpression((VariableExpression)newValue);
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
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				setAssignOperator(ASSIGN_OPERATOR_EDEFAULT);
				return;
			case ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				setRhs_assignExpression((Expression)null);
				return;
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator(INCREMENT_DECREMENT_OPERATOR_EDEFAULT);
				return;
			case ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION:
				setLhs_attributeExpression((VariableExpression)null);
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
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				return assignOperator != ASSIGN_OPERATOR_EDEFAULT;
			case ActionLanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				return rhs_assignExpression != null;
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				return incrementDecrementOperator != INCREMENT_DECREMENT_OPERATOR_EDEFAULT;
			case ActionLanguagePackage.ASSIGNMENT__LHS_ATTRIBUTE_EXPRESSION:
				return lhs_attributeExpression != null;
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
		result.append(" (assignOperator: ");
		result.append(assignOperator);
		result.append(", incrementDecrementOperator: ");
		result.append(incrementDecrementOperator);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl

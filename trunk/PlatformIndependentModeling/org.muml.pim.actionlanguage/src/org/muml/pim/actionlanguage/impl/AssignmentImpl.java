/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.impl.ExpressionImpl;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.AssignOperator;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.IncrementDecrementOperator;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.impl.AssignmentImpl#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.AssignmentImpl#getRhs_assignExpression <em>Rhs assign Expression</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.AssignmentImpl#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.AssignmentImpl#getLhs_typedNamedElementExpression <em>Lhs typed Named Element Expression</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getLhs_typedNamedElementExpression() <em>Lhs typed Named Element Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs_typedNamedElementExpression()
	 * @generated
	 * @ordered
	 */
	protected TypedNamedElementExpression lhs_typedNamedElementExpression;

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
		return ActionlanguagePackage.Literals.ASSIGNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR, oldAssignOperator, assignOperator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, oldRhs_assignExpression, newRhs_assignExpression);
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
				msgs = ((InternalEObject)rhs_assignExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, null, msgs);
			if (newRhs_assignExpression != null)
				msgs = ((InternalEObject)newRhs_assignExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, null, msgs);
			msgs = basicSetRhs_assignExpression(newRhs_assignExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION, newRhs_assignExpression, newRhs_assignExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR, oldIncrementDecrementOperator, incrementDecrementOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElementExpression getLhs_typedNamedElementExpression() {
		return lhs_typedNamedElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs_typedNamedElementExpression(TypedNamedElementExpression newLhs_typedNamedElementExpression, NotificationChain msgs) {
		TypedNamedElementExpression oldLhs_typedNamedElementExpression = lhs_typedNamedElementExpression;
		lhs_typedNamedElementExpression = newLhs_typedNamedElementExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, oldLhs_typedNamedElementExpression, newLhs_typedNamedElementExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs_typedNamedElementExpression(TypedNamedElementExpression newLhs_typedNamedElementExpression) {
		if (newLhs_typedNamedElementExpression != lhs_typedNamedElementExpression) {
			NotificationChain msgs = null;
			if (lhs_typedNamedElementExpression != null)
				msgs = ((InternalEObject)lhs_typedNamedElementExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, null, msgs);
			if (newLhs_typedNamedElementExpression != null)
				msgs = ((InternalEObject)newLhs_typedNamedElementExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, null, msgs);
			msgs = basicSetLhs_typedNamedElementExpression(newLhs_typedNamedElementExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION, newLhs_typedNamedElementExpression, newLhs_typedNamedElementExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				return basicSetRhs_assignExpression(null, msgs);
			case ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				return basicSetLhs_typedNamedElementExpression(null, msgs);
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
			case ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				return getAssignOperator();
			case ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				return getRhs_assignExpression();
			case ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				return getIncrementDecrementOperator();
			case ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				return getLhs_typedNamedElementExpression();
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
			case ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				setAssignOperator((AssignOperator)newValue);
				return;
			case ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				setRhs_assignExpression((Expression)newValue);
				return;
			case ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator((IncrementDecrementOperator)newValue);
				return;
			case ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				setLhs_typedNamedElementExpression((TypedNamedElementExpression)newValue);
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
			case ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				setAssignOperator(ASSIGN_OPERATOR_EDEFAULT);
				return;
			case ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				setRhs_assignExpression((Expression)null);
				return;
			case ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator(INCREMENT_DECREMENT_OPERATOR_EDEFAULT);
				return;
			case ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				setLhs_typedNamedElementExpression((TypedNamedElementExpression)null);
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
			case ActionlanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				return assignOperator != ASSIGN_OPERATOR_EDEFAULT;
			case ActionlanguagePackage.ASSIGNMENT__RHS_ASSIGN_EXPRESSION:
				return rhs_assignExpression != null;
			case ActionlanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				return incrementDecrementOperator != INCREMENT_DECREMENT_OPERATOR_EDEFAULT;
			case ActionlanguagePackage.ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION:
				return lhs_typedNamedElementExpression != null;
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

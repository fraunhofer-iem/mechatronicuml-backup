/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.expressions.Expression;

import org.storydriven.modeling.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getAssignExpression <em>Assign Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.AssignmentImpl#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignOperator() <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AssignOperator ASSIGN_OPERATOR_EDEFAULT = AssignOperator.EQUAL;

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
	 * The cached value of the '{@link #getAssignExpression() <em>Assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression assignExpression;

	/**
	 * The default value of the '{@link #getIncrementDecrementOperator() <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IncrementDecrementOperator INCREMENT_DECREMENT_OPERATOR_EDEFAULT = IncrementDecrementOperator.INCREMENT;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__NAME, oldName, name));
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
	public Expression getAssignExpression() {
		return assignExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignExpression(Expression newAssignExpression, NotificationChain msgs) {
		Expression oldAssignExpression = assignExpression;
		assignExpression = newAssignExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION, oldAssignExpression, newAssignExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignExpression(Expression newAssignExpression) {
		if (newAssignExpression != assignExpression) {
			NotificationChain msgs = null;
			if (assignExpression != null)
				msgs = ((InternalEObject)assignExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION, null, msgs);
			if (newAssignExpression != null)
				msgs = ((InternalEObject)newAssignExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION, null, msgs);
			msgs = basicSetAssignExpression(newAssignExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION, newAssignExpression, newAssignExpression));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION:
				return basicSetAssignExpression(null, msgs);
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
			case ActionLanguagePackage.ASSIGNMENT__NAME:
				return getName();
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				return getAssignOperator();
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION:
				return getAssignExpression();
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				return getIncrementDecrementOperator();
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
			case ActionLanguagePackage.ASSIGNMENT__NAME:
				setName((String)newValue);
				return;
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				setAssignOperator((AssignOperator)newValue);
				return;
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION:
				setAssignExpression((Expression)newValue);
				return;
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator((IncrementDecrementOperator)newValue);
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
			case ActionLanguagePackage.ASSIGNMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				setAssignOperator(ASSIGN_OPERATOR_EDEFAULT);
				return;
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION:
				setAssignExpression((Expression)null);
				return;
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				setIncrementDecrementOperator(INCREMENT_DECREMENT_OPERATOR_EDEFAULT);
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
			case ActionLanguagePackage.ASSIGNMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_OPERATOR:
				return assignOperator != ASSIGN_OPERATOR_EDEFAULT;
			case ActionLanguagePackage.ASSIGNMENT__ASSIGN_EXPRESSION:
				return assignExpression != null;
			case ActionLanguagePackage.ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR:
				return incrementDecrementOperator != INCREMENT_DECREMENT_OPERATOR_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", assignOperator: ");
		result.append(assignOperator);
		result.append(", incrementDecrementOperator: ");
		result.append(incrementDecrementOperator);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl

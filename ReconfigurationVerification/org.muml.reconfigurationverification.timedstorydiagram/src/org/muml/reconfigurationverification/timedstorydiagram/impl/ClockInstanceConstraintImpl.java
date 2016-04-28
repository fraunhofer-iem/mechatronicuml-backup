/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Instance Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.ClockInstanceConstraintImpl#getClockInstanceVariable <em>Clock Instance Variable</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.ClockInstanceConstraintImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.ClockInstanceConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockInstanceConstraintImpl extends EObjectImpl implements ClockInstanceConstraint {
	/**
	 * The cached value of the '{@link #getClockInstanceVariable() <em>Clock Instance Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstanceVariable()
	 * @generated
	 * @ordered
	 */
	protected ClockInstanceVariable clockInstanceVariable;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparingOperator OPERATOR_EDEFAULT = ComparingOperator.LESS_OR_EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparingOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockInstanceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.CLOCK_INSTANCE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceVariable getClockInstanceVariable() {
		if (clockInstanceVariable != null && clockInstanceVariable.eIsProxy()) {
			InternalEObject oldClockInstanceVariable = (InternalEObject)clockInstanceVariable;
			clockInstanceVariable = (ClockInstanceVariable)eResolveProxy(oldClockInstanceVariable);
			if (clockInstanceVariable != oldClockInstanceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE, oldClockInstanceVariable, clockInstanceVariable));
			}
		}
		return clockInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockInstanceVariable basicGetClockInstanceVariable() {
		return clockInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockInstanceVariable(ClockInstanceVariable newClockInstanceVariable, NotificationChain msgs) {
		ClockInstanceVariable oldClockInstanceVariable = clockInstanceVariable;
		clockInstanceVariable = newClockInstanceVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE, oldClockInstanceVariable, newClockInstanceVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockInstanceVariable(ClockInstanceVariable newClockInstanceVariable) {
		if (newClockInstanceVariable != clockInstanceVariable) {
			NotificationChain msgs = null;
			if (clockInstanceVariable != null)
				msgs = ((InternalEObject)clockInstanceVariable).eInverseRemove(this, TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS, ClockInstanceVariable.class, msgs);
			if (newClockInstanceVariable != null)
				msgs = ((InternalEObject)newClockInstanceVariable).eInverseAdd(this, TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS, ClockInstanceVariable.class, msgs);
			msgs = basicSetClockInstanceVariable(newClockInstanceVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE, newClockInstanceVariable, newClockInstanceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparingOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparingOperator newOperator) {
		ComparingOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE:
				if (clockInstanceVariable != null)
					msgs = ((InternalEObject)clockInstanceVariable).eInverseRemove(this, TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS, ClockInstanceVariable.class, msgs);
				return basicSetClockInstanceVariable((ClockInstanceVariable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE:
				return basicSetClockInstanceVariable(null, msgs);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE:
				if (resolve) return getClockInstanceVariable();
				return basicGetClockInstanceVariable();
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__OPERATOR:
				return getOperator();
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__VALUE:
				return getValue();
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE:
				setClockInstanceVariable((ClockInstanceVariable)newValue);
				return;
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__OPERATOR:
				setOperator((ComparingOperator)newValue);
				return;
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__VALUE:
				setValue((Integer)newValue);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE:
				setClockInstanceVariable((ClockInstanceVariable)null);
				return;
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE:
				return clockInstanceVariable != null;
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ClockInstanceConstraintImpl

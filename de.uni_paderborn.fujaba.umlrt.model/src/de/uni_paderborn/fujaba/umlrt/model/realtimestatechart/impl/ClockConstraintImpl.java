/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.storydriven.modeling.expressions.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl#getClockConstraintExpr <em>Clock Constraint Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClockConstraintImpl extends EObjectImpl implements ClockConstraint {
	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber bound;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected Clock clock;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparingOperator OPERATOR_EDEFAULT = ComparingOperator.LESS;

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
	 * The default value of the '{@link #getClockConstraintExpr() <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraintExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_CONSTRAINT_EXPR_EDEFAULT = "clockConstraintExpr";

	/**
	 * The cached value of the '{@link #getClockConstraintExpr() <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraintExpr()
	 * @generated
	 * @ordered
	 */
	protected String clockConstraintExpr = CLOCK_CONSTRAINT_EXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBound(NaturalNumber newBound, NotificationChain msgs) {
		NaturalNumber oldBound = bound;
		bound = newBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND, oldBound, newBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(NaturalNumber newBound) {
		if (newBound != bound) {
			NotificationChain msgs = null;
			if (bound != null)
				msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND, null, msgs);
			if (newBound != null)
				msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND, null, msgs);
			msgs = basicSetBound(newBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND, newBound, newBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (Clock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClock(Clock newClock, NotificationChain msgs) {
		Clock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK, oldClock, newClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(Clock newClock) {
		if (newClock != clock) {
			NotificationChain msgs = null;
			if (clock != null)
				msgs = ((InternalEObject)clock).eInverseRemove(this, RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS, Clock.class, msgs);
			if (newClock != null)
				msgs = ((InternalEObject)newClock).eInverseAdd(this, RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS, Clock.class, msgs);
			msgs = basicSetClock(newClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK, newClock, newClock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockConstraintExpr() {
		return clockConstraintExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockConstraintExpr(String newClockConstraintExpr) {
		String oldClockConstraintExpr = clockConstraintExpr;
		clockConstraintExpr = newClockConstraintExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR, oldClockConstraintExpr, clockConstraintExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK:
				if (clock != null)
					msgs = ((InternalEObject)clock).eInverseRemove(this, RealtimestatechartPackage.CLOCK__CLOCK_CONSTRAINTS, Clock.class, msgs);
				return basicSetClock((Clock)otherEnd, msgs);
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
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND:
				return basicSetBound(null, msgs);
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK:
				return basicSetClock(null, msgs);
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
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND:
				return getBound();
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR:
				return getOperator();
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR:
				return getClockConstraintExpr();
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
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND:
				setBound((NaturalNumber)newValue);
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK:
				setClock((Clock)newValue);
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR:
				setOperator((ComparingOperator)newValue);
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR:
				setClockConstraintExpr((String)newValue);
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
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND:
				setBound((NaturalNumber)null);
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK:
				setClock((Clock)null);
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR:
				setClockConstraintExpr(CLOCK_CONSTRAINT_EXPR_EDEFAULT);
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
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND:
				return bound != null;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK:
				return clock != null;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR:
				return CLOCK_CONSTRAINT_EXPR_EDEFAULT == null ? clockConstraintExpr != null : !CLOCK_CONSTRAINT_EXPR_EDEFAULT.equals(clockConstraintExpr);
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
		result.append(", clockConstraintExpr: ");
		result.append(clockConstraintExpr);
		result.append(')');
		return result.toString();
	}

} //ClockConstraintImpl

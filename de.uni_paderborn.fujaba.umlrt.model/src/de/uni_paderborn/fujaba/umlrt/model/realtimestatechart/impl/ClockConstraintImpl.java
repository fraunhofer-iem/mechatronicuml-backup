/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	 * The cached setting delegate for the '{@link #getClockConstraintExpr() <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraintExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ClockConstraintImpl() {
		super();
		
		// Install a notification adapter that informs the
		// clockConstraintExpr-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter clockConstraintExprAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__CLOCK_CONSTRAINT_EXPR, Notification.SET);
		clockConstraintExprAdapter.addLocalDependency(RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND);

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
		return (String)CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockConstraintExpr(String newClockConstraintExpr) {
		CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newClockConstraintExpr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClockConstraintExpr() {
		CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockConstraintExpr() {
		return CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toMyString() {
				if(clock!=null && operator!=null && bound!=null) {
					return clock.getName()+clock.getId() +" "+ operator.toString() +" " + bound.getValue();
				}else{
					return "";
				}
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
				unsetClockConstraintExpr();
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
				return isSetClockConstraintExpr();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.CLOCK_CONSTRAINT___TO_MY_STRING:
				return toMyString();
		}
		return super.eInvoke(operationID, arguments);
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

} //ClockConstraintImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getDoActionRev <em>Do Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getPeriodLower <em>Period Lower</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getPeriodUpper <em>Period Upper</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getActionExpr <em>Action Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoEventImpl extends EObjectImpl implements DoEvent {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #getPeriodLower() <em>Period Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodLower()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriodLower() <em>Period Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodLower()
	 * @generated
	 * @ordered
	 */
	protected int periodLower = PERIOD_LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodUpper() <em>Period Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriodUpper() <em>Period Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUpper()
	 * @generated
	 * @ordered
	 */
	protected int periodUpper = PERIOD_UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionExpr() <em>Action Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EXPR_EDEFAULT = "test";

	/**
	 * The cached value of the '{@link #getActionExpr() <em>Action Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionExpr()
	 * @generated
	 * @ordered
	 */
	protected String actionExpr = ACTION_EXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.DO_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.DO_EVENT__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDoActionRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActionRev(State newDoActionRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoActionRev, RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActionRev(State newDoActionRev) {
		if (newDoActionRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV && newDoActionRev != null)) {
			if (EcoreUtil.isAncestor(this, newDoActionRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoActionRev != null)
				msgs = ((InternalEObject)newDoActionRev).eInverseAdd(this, RealtimestatechartPackage.STATE__DO_ACTION, State.class, msgs);
			msgs = basicSetDoActionRev(newDoActionRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV, newDoActionRev, newDoActionRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodLower() {
		return periodLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodLower(int newPeriodLower) {
		int oldPeriodLower = periodLower;
		periodLower = newPeriodLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER, oldPeriodLower, periodLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodUpper() {
		return periodUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodUpper(int newPeriodUpper) {
		int oldPeriodUpper = periodUpper;
		periodUpper = newPeriodUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER, oldPeriodUpper, periodUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionExpr() {
		return actionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionExpr(String newActionExpr) {
		String oldActionExpr = actionExpr;
		actionExpr = newActionExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__ACTION_EXPR, oldActionExpr, actionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoActionRev((State)otherEnd, msgs);
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
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				return basicSetDoActionRev(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__DO_ACTION, State.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				return getDoActionRev();
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				return getPeriodLower();
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				return getPeriodUpper();
			case RealtimestatechartPackage.DO_EVENT__ACTION_EXPR:
				return getActionExpr();
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
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				setAction((Action)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				setDoActionRev((State)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				setPeriodLower((Integer)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				setPeriodUpper((Integer)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__ACTION_EXPR:
				setActionExpr((String)newValue);
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
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				setAction((Action)null);
				return;
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				setDoActionRev((State)null);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				setPeriodLower(PERIOD_LOWER_EDEFAULT);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				setPeriodUpper(PERIOD_UPPER_EDEFAULT);
				return;
			case RealtimestatechartPackage.DO_EVENT__ACTION_EXPR:
				setActionExpr(ACTION_EXPR_EDEFAULT);
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
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				return action != null;
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				return getDoActionRev() != null;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				return periodLower != PERIOD_LOWER_EDEFAULT;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				return periodUpper != PERIOD_UPPER_EDEFAULT;
			case RealtimestatechartPackage.DO_EVENT__ACTION_EXPR:
				return ACTION_EXPR_EDEFAULT == null ? actionExpr != null : !ACTION_EXPR_EDEFAULT.equals(actionExpr);
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
		result.append(" (periodLower: ");
		result.append(periodLower);
		result.append(", periodUpper: ");
		result.append(periodUpper);
		result.append(", actionExpr: ");
		result.append(actionExpr);
		result.append(')');
		return result.toString();
	}

} //DoEventImpl

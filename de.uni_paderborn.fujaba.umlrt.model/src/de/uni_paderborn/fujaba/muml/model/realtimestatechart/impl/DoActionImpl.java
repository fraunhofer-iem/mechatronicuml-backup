/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl#getDoActionRev <em>Do Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl#getPeriodLower <em>Period Lower</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl#getPeriodUpper <em>Period Upper</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl#getActionExpr <em>Action Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoActionImpl extends EObjectImpl implements DoAction {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
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
	protected static final String ACTION_EXPR_EDEFAULT = "doEventExpr";

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
	protected DoActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.DO_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_ACTION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_ACTION__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_ACTION__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_ACTION__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDoActionRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActionRev(State newDoActionRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoActionRev, RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActionRev(State newDoActionRev) {
		if (newDoActionRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV && newDoActionRev != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV, newDoActionRev, newDoActionRev));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_ACTION__PERIOD_LOWER, oldPeriodLower, periodLower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_ACTION__PERIOD_UPPER, oldPeriodUpper, periodUpper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_ACTION__ACTION_EXPR, oldActionExpr, actionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
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
			case RealtimestatechartPackage.DO_ACTION__ACTION:
				return basicSetAction(null, msgs);
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
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
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
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
			case RealtimestatechartPackage.DO_ACTION__ACTION:
				return getAction();
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
				return getDoActionRev();
			case RealtimestatechartPackage.DO_ACTION__PERIOD_LOWER:
				return getPeriodLower();
			case RealtimestatechartPackage.DO_ACTION__PERIOD_UPPER:
				return getPeriodUpper();
			case RealtimestatechartPackage.DO_ACTION__ACTION_EXPR:
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
			case RealtimestatechartPackage.DO_ACTION__ACTION:
				setAction((Action)newValue);
				return;
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
				setDoActionRev((State)newValue);
				return;
			case RealtimestatechartPackage.DO_ACTION__PERIOD_LOWER:
				setPeriodLower((Integer)newValue);
				return;
			case RealtimestatechartPackage.DO_ACTION__PERIOD_UPPER:
				setPeriodUpper((Integer)newValue);
				return;
			case RealtimestatechartPackage.DO_ACTION__ACTION_EXPR:
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
			case RealtimestatechartPackage.DO_ACTION__ACTION:
				setAction((Action)null);
				return;
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
				setDoActionRev((State)null);
				return;
			case RealtimestatechartPackage.DO_ACTION__PERIOD_LOWER:
				setPeriodLower(PERIOD_LOWER_EDEFAULT);
				return;
			case RealtimestatechartPackage.DO_ACTION__PERIOD_UPPER:
				setPeriodUpper(PERIOD_UPPER_EDEFAULT);
				return;
			case RealtimestatechartPackage.DO_ACTION__ACTION_EXPR:
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
			case RealtimestatechartPackage.DO_ACTION__ACTION:
				return action != null;
			case RealtimestatechartPackage.DO_ACTION__DO_ACTION_REV:
				return getDoActionRev() != null;
			case RealtimestatechartPackage.DO_ACTION__PERIOD_LOWER:
				return periodLower != PERIOD_LOWER_EDEFAULT;
			case RealtimestatechartPackage.DO_ACTION__PERIOD_UPPER:
				return periodUpper != PERIOD_UPPER_EDEFAULT;
			case RealtimestatechartPackage.DO_ACTION__ACTION_EXPR:
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

} //DoActionImpl

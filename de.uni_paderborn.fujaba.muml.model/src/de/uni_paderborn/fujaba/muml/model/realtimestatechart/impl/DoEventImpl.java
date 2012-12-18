/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.core.TimeValue;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoEventImpl#getPeriodLower <em>Period Lower</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoEventImpl#getPeriodUpper <em>Period Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoEventImpl extends StateEventImpl implements DoEvent {
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
	 * The cached value of the '{@link #getPeriodLower() <em>Period Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodLower()
	 * @generated
	 * @ordered
	 */
	protected TimeValue periodLower;

	/**
	 * The cached value of the '{@link #getPeriodUpper() <em>Period Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUpper()
	 * @generated
	 * @ordered
	 */
	protected TimeValue periodUpper;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__ACTION, oldAction, newAction);
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
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_EVENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_EVENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getPeriodLower() {
		return periodLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodLower(TimeValue newPeriodLower, NotificationChain msgs) {
		TimeValue oldPeriodLower = periodLower;
		periodLower = newPeriodLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER, oldPeriodLower, newPeriodLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodLower(TimeValue newPeriodLower) {
		if (newPeriodLower != periodLower) {
			NotificationChain msgs = null;
			if (periodLower != null)
				msgs = ((InternalEObject)periodLower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER, null, msgs);
			if (newPeriodLower != null)
				msgs = ((InternalEObject)newPeriodLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER, null, msgs);
			msgs = basicSetPeriodLower(newPeriodLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER, newPeriodLower, newPeriodLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getPeriodUpper() {
		return periodUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodUpper(TimeValue newPeriodUpper, NotificationChain msgs) {
		TimeValue oldPeriodUpper = periodUpper;
		periodUpper = newPeriodUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER, oldPeriodUpper, newPeriodUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodUpper(TimeValue newPeriodUpper) {
		if (newPeriodUpper != periodUpper) {
			NotificationChain msgs = null;
			if (periodUpper != null)
				msgs = ((InternalEObject)periodUpper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER, null, msgs);
			if (newPeriodUpper != null)
				msgs = ((InternalEObject)newPeriodUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER, null, msgs);
			msgs = basicSetPeriodUpper(newPeriodUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER, newPeriodUpper, newPeriodUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				return basicSetAction(null, msgs);
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				return basicSetPeriodLower(null, msgs);
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				return basicSetPeriodUpper(null, msgs);
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
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				return getAction();
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				return getPeriodLower();
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				return getPeriodUpper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				setAction((Action)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				setPeriodLower((TimeValue)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				setPeriodUpper((TimeValue)newValue);
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
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				setPeriodLower((TimeValue)null);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				setPeriodUpper((TimeValue)null);
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
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				return periodLower != null;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				return periodUpper != null;
		}
		return super.eIsSet(featureID);
	}

} //DoEventImpl

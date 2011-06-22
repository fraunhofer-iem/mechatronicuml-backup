/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

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
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, RealtimestatechartPackage.DO_EVENT__ACTION);
		}
		return action;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				setPeriodLower((Integer)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				setPeriodUpper((Integer)newValue);
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
				getAction().clear();
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				setPeriodLower(PERIOD_LOWER_EDEFAULT);
				return;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				setPeriodUpper(PERIOD_UPPER_EDEFAULT);
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
				return action != null && !action.isEmpty();
			case RealtimestatechartPackage.DO_EVENT__PERIOD_LOWER:
				return periodLower != PERIOD_LOWER_EDEFAULT;
			case RealtimestatechartPackage.DO_EVENT__PERIOD_UPPER:
				return periodUpper != PERIOD_UPPER_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //DoEventImpl

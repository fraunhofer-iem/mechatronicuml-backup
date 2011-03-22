/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeCompositeState;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getUMLRealtimeAction <em>UML Realtime Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getDoActionRev <em>Do Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getPeriodLower <em>Period Lower</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl#getPeriodUpper <em>Period Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoEventImpl extends EObjectImpl implements DoEvent {
	/**
	 * The cached value of the '{@link #getUMLRealtimeAction() <em>UML Realtime Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeAction()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeAction uMLRealtimeAction;

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
	public UMLRealtimeAction getUMLRealtimeAction() {
		if (uMLRealtimeAction != null && uMLRealtimeAction.eIsProxy()) {
			InternalEObject oldUMLRealtimeAction = (InternalEObject)uMLRealtimeAction;
			uMLRealtimeAction = (UMLRealtimeAction)eResolveProxy(oldUMLRealtimeAction);
			if (uMLRealtimeAction != oldUMLRealtimeAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.DO_EVENT__UML_REALTIME_ACTION, oldUMLRealtimeAction, uMLRealtimeAction));
			}
		}
		return uMLRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeAction basicGetUMLRealtimeAction() {
		return uMLRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeAction(UMLRealtimeAction newUMLRealtimeAction) {
		UMLRealtimeAction oldUMLRealtimeAction = uMLRealtimeAction;
		uMLRealtimeAction = newUMLRealtimeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.DO_EVENT__UML_REALTIME_ACTION, oldUMLRealtimeAction, uMLRealtimeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeCompositeState getDoActionRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV) return null;
		return (UMLRealtimeCompositeState)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActionRev(UMLRealtimeCompositeState newDoActionRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoActionRev, RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActionRev(UMLRealtimeCompositeState newDoActionRev) {
		if (newDoActionRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV && newDoActionRev != null)) {
			if (EcoreUtil.isAncestor(this, newDoActionRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoActionRev != null)
				msgs = ((InternalEObject)newDoActionRev).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_COMPOSITE_STATE__DO_ACTION, UMLRealtimeCompositeState.class, msgs);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoActionRev((UMLRealtimeCompositeState)otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_COMPOSITE_STATE__DO_ACTION, UMLRealtimeCompositeState.class, msgs);
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
			case RealtimestatechartPackage.DO_EVENT__UML_REALTIME_ACTION:
				if (resolve) return getUMLRealtimeAction();
				return basicGetUMLRealtimeAction();
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				return getDoActionRev();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimestatechartPackage.DO_EVENT__UML_REALTIME_ACTION:
				setUMLRealtimeAction((UMLRealtimeAction)newValue);
				return;
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				setDoActionRev((UMLRealtimeCompositeState)newValue);
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
			case RealtimestatechartPackage.DO_EVENT__UML_REALTIME_ACTION:
				setUMLRealtimeAction((UMLRealtimeAction)null);
				return;
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				setDoActionRev((UMLRealtimeCompositeState)null);
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
			case RealtimestatechartPackage.DO_EVENT__UML_REALTIME_ACTION:
				return uMLRealtimeAction != null;
			case RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV:
				return getDoActionRev() != null;
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

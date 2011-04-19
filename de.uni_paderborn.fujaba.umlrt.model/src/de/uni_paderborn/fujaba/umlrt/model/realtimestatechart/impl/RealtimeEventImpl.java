/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealtimeEventImpl extends MethodCallExpressionImpl implements RealtimeEvent {
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
	 * The default value of the '{@link #getFullEventName() <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullEventName() <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullEventName()
	 * @generated
	 * @ordered
	 */
	protected String fullEventName = FULL_EVENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.REALTIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTriggeredUMLRealtimeTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggeredUMLRealtimeTransition(Transition newTriggeredUMLRealtimeTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTriggeredUMLRealtimeTransition, RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredUMLRealtimeTransition(Transition newTriggeredUMLRealtimeTransition) {
		if (newTriggeredUMLRealtimeTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION && newTriggeredUMLRealtimeTransition != null)) {
			if (EcoreUtil.isAncestor(this, newTriggeredUMLRealtimeTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTriggeredUMLRealtimeTransition != null)
				msgs = ((InternalEObject)newTriggeredUMLRealtimeTransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, Transition.class, msgs);
			msgs = basicSetTriggeredUMLRealtimeTransition(newTriggeredUMLRealtimeTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION, newTriggeredUMLRealtimeTransition, newTriggeredUMLRealtimeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRaisedUMLRealtimeTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaisedUMLRealtimeTransition(Transition newRaisedUMLRealtimeTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRaisedUMLRealtimeTransition, RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedUMLRealtimeTransition(Transition newRaisedUMLRealtimeTransition) {
		if (newRaisedUMLRealtimeTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION && newRaisedUMLRealtimeTransition != null)) {
			if (EcoreUtil.isAncestor(this, newRaisedUMLRealtimeTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRaisedUMLRealtimeTransition != null)
				msgs = ((InternalEObject)newRaisedUMLRealtimeTransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, Transition.class, msgs);
			msgs = basicSetRaisedUMLRealtimeTransition(newRaisedUMLRealtimeTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION, newRaisedUMLRealtimeTransition, newRaisedUMLRealtimeTransition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullEventName() {
		return fullEventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullEventName(String newFullEventName) {
		String oldFullEventName = fullEventName;
		fullEventName = newFullEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_EVENT__FULL_EVENT_NAME, oldFullEventName, fullEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTriggeredUMLRealtimeTransition((Transition)otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRaisedUMLRealtimeTransition((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				return basicSetTriggeredUMLRealtimeTransition(null, msgs);
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				return basicSetRaisedUMLRealtimeTransition(null, msgs);
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
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, Transition.class, msgs);
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, Transition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
		result.append(", fullEventName: ");
		result.append(fullEventName);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				return getTriggeredUMLRealtimeTransition();
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				return getRaisedUMLRealtimeTransition();
			case RealtimestatechartPackage.REALTIME_EVENT__NAME:
				return getName();
			case RealtimestatechartPackage.REALTIME_EVENT__FULL_EVENT_NAME:
				return getFullEventName();
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
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				setTriggeredUMLRealtimeTransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				setRaisedUMLRealtimeTransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_EVENT__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_EVENT__FULL_EVENT_NAME:
				setFullEventName((String)newValue);
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
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				setTriggeredUMLRealtimeTransition((Transition)null);
				return;
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				setRaisedUMLRealtimeTransition((Transition)null);
				return;
			case RealtimestatechartPackage.REALTIME_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartPackage.REALTIME_EVENT__FULL_EVENT_NAME:
				setFullEventName(FULL_EVENT_NAME_EDEFAULT);
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
			case RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				return getTriggeredUMLRealtimeTransition() != null;
			case RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				return getRaisedUMLRealtimeTransition() != null;
			case RealtimestatechartPackage.REALTIME_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartPackage.REALTIME_EVENT__FULL_EVENT_NAME:
				return FULL_EVENT_NAME_EDEFAULT == null ? fullEventName != null : !FULL_EVENT_NAME_EDEFAULT.equals(fullEventName);
		}
		return super.eIsSet(featureID);
	}

} //RealtimeEventImpl

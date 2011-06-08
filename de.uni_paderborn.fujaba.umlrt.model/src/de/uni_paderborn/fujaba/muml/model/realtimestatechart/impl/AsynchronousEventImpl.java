/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl#getTriggeredTransition <em>Triggered Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl#getRaisedTransition <em>Raised Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsynchronousEventImpl extends MethodCallExpressionImpl implements AsynchronousEvent {
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
	protected AsynchronousEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ASYNCHRONOUS_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTriggeredTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggeredTransition(Transition newTriggeredTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTriggeredTransition, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredTransition(Transition newTriggeredTransition) {
		if (newTriggeredTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION && newTriggeredTransition != null)) {
			if (EcoreUtil.isAncestor(this, newTriggeredTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTriggeredTransition != null)
				msgs = ((InternalEObject)newTriggeredTransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, Transition.class, msgs);
			msgs = basicSetTriggeredTransition(newTriggeredTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION, newTriggeredTransition, newTriggeredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRaisedTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaisedTransition(Transition newRaisedTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRaisedTransition, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedTransition(Transition newRaisedTransition) {
		if (newRaisedTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION && newRaisedTransition != null)) {
			if (EcoreUtil.isAncestor(this, newRaisedTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRaisedTransition != null)
				msgs = ((InternalEObject)newRaisedTransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, Transition.class, msgs);
			msgs = basicSetRaisedTransition(newRaisedTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION, newRaisedTransition, newRaisedTransition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME, oldFullEventName, fullEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTriggeredTransition((Transition)otherEnd, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRaisedTransition((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				return basicSetTriggeredTransition(null, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
				return basicSetRaisedTransition(null, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, Transition.class, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				return getName();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				return getTriggeredTransition();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
				return getRaisedTransition();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				setTriggeredTransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
				setRaisedTransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				setTriggeredTransition((Transition)null);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
				setRaisedTransition((Transition)null);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION:
				return getTriggeredTransition() != null;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION:
				return getRaisedTransition() != null;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
				return FULL_EVENT_NAME_EDEFAULT == null ? fullEventName != null : !FULL_EVENT_NAME_EDEFAULT.equals(fullEventName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME: return SDMPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.NAMED_ELEMENT__NAME: return RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //AsynchronousEventImpl

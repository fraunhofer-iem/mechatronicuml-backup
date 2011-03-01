/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Deadline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AbsoluteDeadlineImpl#getUMLRealtimeTransition <em>UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AbsoluteDeadlineImpl#getUMLClock <em>UML Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbsoluteDeadlineImpl extends DeadlineImpl implements AbsoluteDeadline {
	/**
	 * The cached value of the '{@link #getUMLClock() <em>UML Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLClock()
	 * @generated
	 * @ordered
	 */
	protected UMLClock uMLClock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteDeadlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ABSOLUTE_DEADLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition getUMLRealtimeTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION) return null;
		return (UMLRealtimeTransition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeTransition(UMLRealtimeTransition newUMLRealtimeTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUMLRealtimeTransition, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeTransition(UMLRealtimeTransition newUMLRealtimeTransition) {
		if (newUMLRealtimeTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION && newUMLRealtimeTransition != null)) {
			if (EcoreUtil.isAncestor(this, newUMLRealtimeTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUMLRealtimeTransition != null)
				msgs = ((InternalEObject)newUMLRealtimeTransition).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES, UMLRealtimeTransition.class, msgs);
			msgs = basicSetUMLRealtimeTransition(newUMLRealtimeTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION, newUMLRealtimeTransition, newUMLRealtimeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClock getUMLClock() {
		if (uMLClock != null && uMLClock.eIsProxy()) {
			InternalEObject oldUMLClock = (InternalEObject)uMLClock;
			uMLClock = (UMLClock)eResolveProxy(oldUMLClock);
			if (uMLClock != oldUMLClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK, oldUMLClock, uMLClock));
			}
		}
		return uMLClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClock basicGetUMLClock() {
		return uMLClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLClock(UMLClock newUMLClock, NotificationChain msgs) {
		UMLClock oldUMLClock = uMLClock;
		uMLClock = newUMLClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK, oldUMLClock, newUMLClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLClock(UMLClock newUMLClock) {
		if (newUMLClock != uMLClock) {
			NotificationChain msgs = null;
			if (uMLClock != null)
				msgs = ((InternalEObject)uMLClock).eInverseRemove(this, RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES, UMLClock.class, msgs);
			if (newUMLClock != null)
				msgs = ((InternalEObject)newUMLClock).eInverseAdd(this, RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES, UMLClock.class, msgs);
			msgs = basicSetUMLClock(newUMLClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK, newUMLClock, newUMLClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUMLRealtimeTransition((UMLRealtimeTransition)otherEnd, msgs);
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK:
				if (uMLClock != null)
					msgs = ((InternalEObject)uMLClock).eInverseRemove(this, RealtimestatechartPackage.UML_CLOCK__ABSOLUTE_DEADLINES, UMLClock.class, msgs);
				return basicSetUMLClock((UMLClock)otherEnd, msgs);
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
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				return basicSetUMLRealtimeTransition(null, msgs);
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK:
				return basicSetUMLClock(null, msgs);
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
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES, UMLRealtimeTransition.class, msgs);
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
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				return getUMLRealtimeTransition();
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK:
				if (resolve) return getUMLClock();
				return basicGetUMLClock();
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
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				setUMLRealtimeTransition((UMLRealtimeTransition)newValue);
				return;
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK:
				setUMLClock((UMLClock)newValue);
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
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				setUMLRealtimeTransition((UMLRealtimeTransition)null);
				return;
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK:
				setUMLClock((UMLClock)null);
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
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION:
				return getUMLRealtimeTransition() != null;
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_CLOCK:
				return uMLClock != null;
		}
		return super.eIsSet(featureID);
	}

} //AbsoluteDeadlineImpl

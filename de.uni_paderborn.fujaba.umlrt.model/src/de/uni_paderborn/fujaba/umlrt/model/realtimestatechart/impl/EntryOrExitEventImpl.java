/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
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
 * An implementation of the model object '<em><b>Entry Or Exit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getEntryActionRev <em>Entry Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getExitActionRev <em>Exit Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getUMLRealtimeAction <em>UML Realtime Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryOrExitEventImpl extends EObjectImpl implements EntryOrExitEvent {
	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected Clock resets;

	/**
	 * The cached value of the '{@link #getUMLRealtimeAction() <em>UML Realtime Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeAction()
	 * @generated
	 * @ordered
	 */
	protected Action uMLRealtimeAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryOrExitEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ENTRY_OR_EXIT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getResets() {
		if (resets != null && resets.eIsProxy()) {
			InternalEObject oldResets = (InternalEObject)resets;
			resets = (Clock)eResolveProxy(oldResets);
			if (resets != oldResets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS, oldResets, resets));
			}
		}
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetResets() {
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResets(Clock newResets) {
		Clock oldResets = resets;
		resets = newResets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS, oldResets, resets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEntryActionRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryActionRev(State newEntryActionRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntryActionRev, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryActionRev(State newEntryActionRev) {
		if (newEntryActionRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV && newEntryActionRev != null)) {
			if (EcoreUtil.isAncestor(this, newEntryActionRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntryActionRev != null)
				msgs = ((InternalEObject)newEntryActionRev).eInverseAdd(this, RealtimestatechartPackage.STATE__ENTRY_ACTION, State.class, msgs);
			msgs = basicSetEntryActionRev(newEntryActionRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV, newEntryActionRev, newEntryActionRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getExitActionRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitActionRev(State newExitActionRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExitActionRev, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitActionRev(State newExitActionRev) {
		if (newExitActionRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV && newExitActionRev != null)) {
			if (EcoreUtil.isAncestor(this, newExitActionRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExitActionRev != null)
				msgs = ((InternalEObject)newExitActionRev).eInverseAdd(this, RealtimestatechartPackage.STATE__EXIT_ACTION, State.class, msgs);
			msgs = basicSetExitActionRev(newExitActionRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV, newExitActionRev, newExitActionRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getUMLRealtimeAction() {
		if (uMLRealtimeAction != null && uMLRealtimeAction.eIsProxy()) {
			InternalEObject oldUMLRealtimeAction = (InternalEObject)uMLRealtimeAction;
			uMLRealtimeAction = (Action)eResolveProxy(oldUMLRealtimeAction);
			if (uMLRealtimeAction != oldUMLRealtimeAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION, oldUMLRealtimeAction, uMLRealtimeAction));
			}
		}
		return uMLRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetUMLRealtimeAction() {
		return uMLRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeAction(Action newUMLRealtimeAction) {
		Action oldUMLRealtimeAction = uMLRealtimeAction;
		uMLRealtimeAction = newUMLRealtimeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION, oldUMLRealtimeAction, uMLRealtimeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntryActionRev((State)otherEnd, msgs);
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExitActionRev((State)otherEnd, msgs);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				return basicSetEntryActionRev(null, msgs);
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				return basicSetExitActionRev(null, msgs);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__ENTRY_ACTION, State.class, msgs);
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__EXIT_ACTION, State.class, msgs);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				if (resolve) return getResets();
				return basicGetResets();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				return getEntryActionRev();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				return getExitActionRev();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				if (resolve) return getUMLRealtimeAction();
				return basicGetUMLRealtimeAction();
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				setResets((Clock)newValue);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				setEntryActionRev((State)newValue);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				setExitActionRev((State)newValue);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				setUMLRealtimeAction((Action)newValue);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				setResets((Clock)null);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				setEntryActionRev((State)null);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				setExitActionRev((State)null);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				setUMLRealtimeAction((Action)null);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				return resets != null;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV:
				return getEntryActionRev() != null;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV:
				return getExitActionRev() != null;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				return uMLRealtimeAction != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryOrExitEventImpl

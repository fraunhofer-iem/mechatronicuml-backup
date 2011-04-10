/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.modeling.calls.impl.InvocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationImpl#getSendSyncRev <em>Send Sync Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationImpl#getReceiveSyncRev <em>Receive Sync Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationImpl extends InvocationImpl implements Synchronization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.SYNCHRONIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSendSyncRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendSyncRev(Transition newSendSyncRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSendSyncRev, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendSyncRev(Transition newSendSyncRev) {
		if (newSendSyncRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV && newSendSyncRev != null)) {
			if (EcoreUtil.isAncestor(this, newSendSyncRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSendSyncRev != null)
				msgs = ((InternalEObject)newSendSyncRev).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION, Transition.class, msgs);
			msgs = basicSetSendSyncRev(newSendSyncRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, newSendSyncRev, newSendSyncRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getReceiveSyncRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveSyncRev(Transition newReceiveSyncRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReceiveSyncRev, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveSyncRev(Transition newReceiveSyncRev) {
		if (newReceiveSyncRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV && newReceiveSyncRev != null)) {
			if (EcoreUtil.isAncestor(this, newReceiveSyncRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReceiveSyncRev != null)
				msgs = ((InternalEObject)newReceiveSyncRev).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION, Transition.class, msgs);
			msgs = basicSetReceiveSyncRev(newReceiveSyncRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, newReceiveSyncRev, newReceiveSyncRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSendSyncRev((Transition)otherEnd, msgs);
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReceiveSyncRev((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				return basicSetSendSyncRev(null, msgs);
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				return basicSetReceiveSyncRev(null, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION, Transition.class, msgs);
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION, Transition.class, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				return getSendSyncRev();
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				return getReceiveSyncRev();
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				setSendSyncRev((Transition)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				setReceiveSyncRev((Transition)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				setSendSyncRev((Transition)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				setReceiveSyncRev((Transition)null);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				return getSendSyncRev() != null;
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				return getReceiveSyncRev() != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizationImpl

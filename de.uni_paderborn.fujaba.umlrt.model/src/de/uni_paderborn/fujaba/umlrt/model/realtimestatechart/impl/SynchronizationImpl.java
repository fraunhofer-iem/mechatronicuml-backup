/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getSendSyncRev() <em>Send Sync Rev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendSyncRev()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeTransition sendSyncRev;

	/**
	 * The cached value of the '{@link #getReceiveSyncRev() <em>Receive Sync Rev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveSyncRev()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeTransition receiveSyncRev;

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
	public UMLRealtimeTransition getSendSyncRev() {
		if (sendSyncRev != null && sendSyncRev.eIsProxy()) {
			InternalEObject oldSendSyncRev = (InternalEObject)sendSyncRev;
			sendSyncRev = (UMLRealtimeTransition)eResolveProxy(oldSendSyncRev);
			if (sendSyncRev != oldSendSyncRev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, oldSendSyncRev, sendSyncRev));
			}
		}
		return sendSyncRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition basicGetSendSyncRev() {
		return sendSyncRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendSyncRev(UMLRealtimeTransition newSendSyncRev, NotificationChain msgs) {
		UMLRealtimeTransition oldSendSyncRev = sendSyncRev;
		sendSyncRev = newSendSyncRev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, oldSendSyncRev, newSendSyncRev);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendSyncRev(UMLRealtimeTransition newSendSyncRev) {
		if (newSendSyncRev != sendSyncRev) {
			NotificationChain msgs = null;
			if (sendSyncRev != null)
				msgs = ((InternalEObject)sendSyncRev).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION, UMLRealtimeTransition.class, msgs);
			if (newSendSyncRev != null)
				msgs = ((InternalEObject)newSendSyncRev).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION, UMLRealtimeTransition.class, msgs);
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
	public UMLRealtimeTransition getReceiveSyncRev() {
		if (receiveSyncRev != null && receiveSyncRev.eIsProxy()) {
			InternalEObject oldReceiveSyncRev = (InternalEObject)receiveSyncRev;
			receiveSyncRev = (UMLRealtimeTransition)eResolveProxy(oldReceiveSyncRev);
			if (receiveSyncRev != oldReceiveSyncRev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, oldReceiveSyncRev, receiveSyncRev));
			}
		}
		return receiveSyncRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition basicGetReceiveSyncRev() {
		return receiveSyncRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveSyncRev(UMLRealtimeTransition newReceiveSyncRev, NotificationChain msgs) {
		UMLRealtimeTransition oldReceiveSyncRev = receiveSyncRev;
		receiveSyncRev = newReceiveSyncRev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, oldReceiveSyncRev, newReceiveSyncRev);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveSyncRev(UMLRealtimeTransition newReceiveSyncRev) {
		if (newReceiveSyncRev != receiveSyncRev) {
			NotificationChain msgs = null;
			if (receiveSyncRev != null)
				msgs = ((InternalEObject)receiveSyncRev).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION, UMLRealtimeTransition.class, msgs);
			if (newReceiveSyncRev != null)
				msgs = ((InternalEObject)newReceiveSyncRev).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION, UMLRealtimeTransition.class, msgs);
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
				if (sendSyncRev != null)
					msgs = ((InternalEObject)sendSyncRev).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION, UMLRealtimeTransition.class, msgs);
				return basicSetSendSyncRev((UMLRealtimeTransition)otherEnd, msgs);
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				if (receiveSyncRev != null)
					msgs = ((InternalEObject)receiveSyncRev).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION, UMLRealtimeTransition.class, msgs);
				return basicSetReceiveSyncRev((UMLRealtimeTransition)otherEnd, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV:
				if (resolve) return getSendSyncRev();
				return basicGetSendSyncRev();
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				if (resolve) return getReceiveSyncRev();
				return basicGetReceiveSyncRev();
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
				setSendSyncRev((UMLRealtimeTransition)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				setReceiveSyncRev((UMLRealtimeTransition)newValue);
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
				setSendSyncRev((UMLRealtimeTransition)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				setReceiveSyncRev((UMLRealtimeTransition)null);
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
				return sendSyncRev != null;
			case RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV:
				return receiveSyncRev != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizationImpl

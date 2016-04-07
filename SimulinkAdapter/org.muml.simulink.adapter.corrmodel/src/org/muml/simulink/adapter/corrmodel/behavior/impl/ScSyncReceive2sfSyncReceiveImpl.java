/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Sync Receive2sf Sync Receive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl#getScSyncReceive <em>Sc Sync Receive</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl#getSfEntryAction <em>Sf Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl#getSfExitAction <em>Sf Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl#getSfTransEvent <em>Sf Trans Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScSyncReceive2sfSyncReceiveImpl extends AbstractContainerCorrespondenceNodeImpl implements ScSyncReceive2sfSyncReceive {
	/**
	 * The cached value of the '{@link #getScSyncReceive() <em>Sc Sync Receive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScSyncReceive()
	 * @generated
	 * @ordered
	 */
	protected Synchronization scSyncReceive;

	/**
	 * The cached value of the '{@link #getSfEntryAction() <em>Sf Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfEntryAction()
	 * @generated
	 * @ordered
	 */
	protected Action sfEntryAction;

	/**
	 * The cached value of the '{@link #getSfExitAction() <em>Sf Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfExitAction()
	 * @generated
	 * @ordered
	 */
	protected Action sfExitAction;

	/**
	 * The cached value of the '{@link #getSfTransEvent() <em>Sf Trans Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfTransEvent()
	 * @generated
	 * @ordered
	 */
	protected Event sfTransEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScSyncReceive2sfSyncReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization getScSyncReceive() {
		if (scSyncReceive != null && scSyncReceive.eIsProxy()) {
			InternalEObject oldScSyncReceive = (InternalEObject)scSyncReceive;
			scSyncReceive = (Synchronization)eResolveProxy(oldScSyncReceive);
			if (scSyncReceive != oldScSyncReceive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE, oldScSyncReceive, scSyncReceive));
			}
		}
		return scSyncReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization basicGetScSyncReceive() {
		return scSyncReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScSyncReceive(Synchronization newScSyncReceive) {
		Synchronization oldScSyncReceive = scSyncReceive;
		scSyncReceive = newScSyncReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE, oldScSyncReceive, scSyncReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfEntryAction() {
		if (sfEntryAction != null && ((EObject)sfEntryAction).eIsProxy()) {
			InternalEObject oldSfEntryAction = (InternalEObject)sfEntryAction;
			sfEntryAction = (Action)eResolveProxy(oldSfEntryAction);
			if (sfEntryAction != oldSfEntryAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION, oldSfEntryAction, sfEntryAction));
			}
		}
		return sfEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfEntryAction() {
		return sfEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfEntryAction(Action newSfEntryAction) {
		Action oldSfEntryAction = sfEntryAction;
		sfEntryAction = newSfEntryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION, oldSfEntryAction, sfEntryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfExitAction() {
		if (sfExitAction != null && ((EObject)sfExitAction).eIsProxy()) {
			InternalEObject oldSfExitAction = (InternalEObject)sfExitAction;
			sfExitAction = (Action)eResolveProxy(oldSfExitAction);
			if (sfExitAction != oldSfExitAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION, oldSfExitAction, sfExitAction));
			}
		}
		return sfExitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfExitAction() {
		return sfExitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfExitAction(Action newSfExitAction) {
		Action oldSfExitAction = sfExitAction;
		sfExitAction = newSfExitAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION, oldSfExitAction, sfExitAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getSfTransEvent() {
		if (sfTransEvent != null && ((EObject)sfTransEvent).eIsProxy()) {
			InternalEObject oldSfTransEvent = (InternalEObject)sfTransEvent;
			sfTransEvent = (Event)eResolveProxy(oldSfTransEvent);
			if (sfTransEvent != oldSfTransEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT, oldSfTransEvent, sfTransEvent));
			}
		}
		return sfTransEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetSfTransEvent() {
		return sfTransEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfTransEvent(Event newSfTransEvent) {
		Event oldSfTransEvent = sfTransEvent;
		sfTransEvent = newSfTransEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT, oldSfTransEvent, sfTransEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE:
				if (resolve) return getScSyncReceive();
				return basicGetScSyncReceive();
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION:
				if (resolve) return getSfEntryAction();
				return basicGetSfEntryAction();
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION:
				if (resolve) return getSfExitAction();
				return basicGetSfExitAction();
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT:
				if (resolve) return getSfTransEvent();
				return basicGetSfTransEvent();
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
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE:
				setScSyncReceive((Synchronization)newValue);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION:
				setSfEntryAction((Action)newValue);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION:
				setSfExitAction((Action)newValue);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT:
				setSfTransEvent((Event)newValue);
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
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE:
				setScSyncReceive((Synchronization)null);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION:
				setSfEntryAction((Action)null);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION:
				setSfExitAction((Action)null);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT:
				setSfTransEvent((Event)null);
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
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE:
				return scSyncReceive != null;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION:
				return sfEntryAction != null;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION:
				return sfExitAction != null;
			case BehaviorPackage.SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT:
				return sfTransEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ScSyncReceive2sfSyncReceiveImpl

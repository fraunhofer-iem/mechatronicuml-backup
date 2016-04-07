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
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Sync Channel2sf Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncChannel2sfSignalImpl#getScSyncChannel <em>Sc Sync Channel</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncChannel2sfSignalImpl#getSfSyncEvent <em>Sf Sync Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScSyncChannel2sfSignalImpl extends AbstractContainerCorrespondenceNodeImpl implements ScSyncChannel2sfSignal {
	/**
	 * The cached value of the '{@link #getScSyncChannel() <em>Sc Sync Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScSyncChannel()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationChannel scSyncChannel;

	/**
	 * The cached value of the '{@link #getSfSyncEvent() <em>Sf Sync Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfSyncEvent()
	 * @generated
	 * @ordered
	 */
	protected Event sfSyncEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScSyncChannel2sfSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_SYNC_CHANNEL2SF_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationChannel getScSyncChannel() {
		if (scSyncChannel != null && scSyncChannel.eIsProxy()) {
			InternalEObject oldScSyncChannel = (InternalEObject)scSyncChannel;
			scSyncChannel = (SynchronizationChannel)eResolveProxy(oldScSyncChannel);
			if (scSyncChannel != oldScSyncChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL, oldScSyncChannel, scSyncChannel));
			}
		}
		return scSyncChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationChannel basicGetScSyncChannel() {
		return scSyncChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScSyncChannel(SynchronizationChannel newScSyncChannel) {
		SynchronizationChannel oldScSyncChannel = scSyncChannel;
		scSyncChannel = newScSyncChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL, oldScSyncChannel, scSyncChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getSfSyncEvent() {
		if (sfSyncEvent != null && ((EObject)sfSyncEvent).eIsProxy()) {
			InternalEObject oldSfSyncEvent = (InternalEObject)sfSyncEvent;
			sfSyncEvent = (Event)eResolveProxy(oldSfSyncEvent);
			if (sfSyncEvent != oldSfSyncEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT, oldSfSyncEvent, sfSyncEvent));
			}
		}
		return sfSyncEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetSfSyncEvent() {
		return sfSyncEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfSyncEvent(Event newSfSyncEvent) {
		Event oldSfSyncEvent = sfSyncEvent;
		sfSyncEvent = newSfSyncEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT, oldSfSyncEvent, sfSyncEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				if (resolve) return getScSyncChannel();
				return basicGetScSyncChannel();
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
				if (resolve) return getSfSyncEvent();
				return basicGetSfSyncEvent();
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
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				setScSyncChannel((SynchronizationChannel)newValue);
				return;
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
				setSfSyncEvent((Event)newValue);
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
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				setScSyncChannel((SynchronizationChannel)null);
				return;
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
				setSfSyncEvent((Event)null);
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
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				return scSyncChannel != null;
			case BehaviorPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
				return sfSyncEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ScSyncChannel2sfSignalImpl

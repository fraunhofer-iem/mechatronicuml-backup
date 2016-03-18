/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Event;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.ScSyncChannel2sfSignal;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Sync Channel2sf Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScSyncChannel2sfSignalImpl#getScSyncChannel <em>Sc Sync Channel</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScSyncChannel2sfSignalImpl#getSfSyncEvent <em>Sf Sync Event</em>}</li>
 * </ul>
 * </p>
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
		return Behavior_modelPackage.Literals.SC_SYNC_CHANNEL2SF_SIGNAL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL, oldScSyncChannel, scSyncChannel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL, oldScSyncChannel, scSyncChannel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT, oldSfSyncEvent, sfSyncEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT, oldSfSyncEvent, sfSyncEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				if (resolve) return getScSyncChannel();
				return basicGetScSyncChannel();
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
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
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				setScSyncChannel((SynchronizationChannel)newValue);
				return;
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
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
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				setScSyncChannel((SynchronizationChannel)null);
				return;
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
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
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL:
				return scSyncChannel != null;
			case Behavior_modelPackage.SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT:
				return sfSyncEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ScSyncChannel2sfSignalImpl

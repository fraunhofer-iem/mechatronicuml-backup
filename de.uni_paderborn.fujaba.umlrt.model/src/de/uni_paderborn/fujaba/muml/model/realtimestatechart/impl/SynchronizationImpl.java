/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl#getSyncChannel <em>Sync Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl#getSynchronizationKind <em>Synchronization Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationImpl extends InvocationImpl implements Synchronization {
	/**
	 * The cached value of the '{@link #getSyncChannel() <em>Sync Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncChannel()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationChannel syncChannel;

	/**
	 * The default value of the '{@link #getSynchronizationKind() <em>Synchronization Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationKind()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationKind SYNCHRONIZATION_KIND_EDEFAULT = SynchronizationKind.SEND;
	/**
	 * The cached value of the '{@link #getSynchronizationKind() <em>Synchronization Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationKind()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationKind synchronizationKind = SYNCHRONIZATION_KIND_EDEFAULT;

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
	public SynchronizationChannel getSyncChannel() {
		if (syncChannel != null && syncChannel.eIsProxy()) {
			InternalEObject oldSyncChannel = (InternalEObject)syncChannel;
			syncChannel = (SynchronizationChannel)eResolveProxy(oldSyncChannel);
			if (syncChannel != oldSyncChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL, oldSyncChannel, syncChannel));
			}
		}
		return syncChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationChannel basicGetSyncChannel() {
		return syncChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncChannel(SynchronizationChannel newSyncChannel) {
		SynchronizationChannel oldSyncChannel = syncChannel;
		syncChannel = newSyncChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL, oldSyncChannel, syncChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind getSynchronizationKind() {
		return synchronizationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizationKind(SynchronizationKind newSynchronizationKind) {
		SynchronizationKind oldSynchronizationKind = synchronizationKind;
		synchronizationKind = newSynchronizationKind == null ? SYNCHRONIZATION_KIND_EDEFAULT : newSynchronizationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SYNCHRONIZATION_KIND, oldSynchronizationKind, synchronizationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				if (resolve) return getSyncChannel();
				return basicGetSyncChannel();
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNCHRONIZATION_KIND:
				return getSynchronizationKind();
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				setSyncChannel((SynchronizationChannel)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNCHRONIZATION_KIND:
				setSynchronizationKind((SynchronizationKind)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				setSyncChannel((SynchronizationChannel)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNCHRONIZATION_KIND:
				setSynchronizationKind(SYNCHRONIZATION_KIND_EDEFAULT);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				return syncChannel != null;
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNCHRONIZATION_KIND:
				return synchronizationKind != SYNCHRONIZATION_KIND_EDEFAULT;
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
		result.append(" (synchronizationKind: ");
		result.append(synchronizationKind);
		result.append(')');
		return result.toString();
	}

} //SynchronizationImpl

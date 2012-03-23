/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.ExtendableElementImpl;
import org.storydriven.modeling.calls.impl.InvocationImpl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl#getSyncChannel <em>Sync Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationImpl extends ExtendableElementImpl implements Synchronization {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationKind KIND_EDEFAULT = SynchronizationKind.SEND;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterBinding() <em>Parameter Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBinding;

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
	public SynchronizationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(SynchronizationKind newKind) {
		SynchronizationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBinding() {
		if (parameterBinding == null) {
			parameterBinding = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, RealtimestatechartPackage.SYNCHRONIZATION__PARAMETER_BINDING);
		}
		return parameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION__PARAMETER_BINDING:
				return ((InternalEList<?>)getParameterBinding()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				if (resolve) return getSyncChannel();
				return basicGetSyncChannel();
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				return getKind();
			case RealtimestatechartPackage.SYNCHRONIZATION__PARAMETER_BINDING:
				return getParameterBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				setSyncChannel((SynchronizationChannel)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				setKind((SynchronizationKind)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__PARAMETER_BINDING:
				getParameterBinding().clear();
				getParameterBinding().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__PARAMETER_BINDING:
				getParameterBinding().clear();
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
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				return kind != KIND_EDEFAULT;
			case RealtimestatechartPackage.SYNCHRONIZATION__PARAMETER_BINDING:
				return parameterBinding != null && !parameterBinding.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SynchronizationImpl

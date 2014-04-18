/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformInstanceImpl extends NamedElementImpl implements HWPlatformInstance {
	/**
	 * The cached value of the '{@link #getHwplatformType() <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformType()
	 * @generated
	 * @ordered
	 */
	protected HWPlatform hwplatformType;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInstance> resources;

	/**
	 * The cached value of the '{@link #getNetworkingHardwareInstances() <em>Networking Hardware Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingHardwareInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkingHardwareInstance> networkingHardwareInstances;

	/**
	 * The cached value of the '{@link #getHwplatformInstances() <em>Hwplatform Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPlatformInstance> hwplatformInstances;

	/**
	 * The cached value of the '{@link #getDelegationPorts() <em>Delegation Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationHWPortInstance> delegationPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getHwplatformType() {
		if (hwplatformType != null && hwplatformType.eIsProxy()) {
			InternalEObject oldHwplatformType = (InternalEObject)hwplatformType;
			hwplatformType = (HWPlatform)eResolveProxy(oldHwplatformType);
			if (hwplatformType != oldHwplatformType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
			}
		}
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform basicGetHwplatformType() {
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwplatformType(HWPlatform newHwplatformType) {
		HWPlatform oldHwplatformType = hwplatformType;
		hwplatformType = newHwplatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkingHardwareInstance> getNetworkingHardwareInstances() {
		if (networkingHardwareInstances == null) {
			networkingHardwareInstances = new EObjectContainmentEList<NetworkingHardwareInstance>(NetworkingHardwareInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES);
		}
		return networkingHardwareInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatformInstance> getHwplatformInstances() {
		if (hwplatformInstances == null) {
			hwplatformInstances = new EObjectContainmentEList<HWPlatformInstance>(HWPlatformInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES);
		}
		return hwplatformInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationHWPortInstance> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentWithInverseEList<DelegationHWPortInstance>(DelegationHWPortInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS, HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationPorts()).basicAdd(otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES:
				return ((InternalEList<?>)getNetworkingHardwareInstances()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				return ((InternalEList<?>)getHwplatformInstances()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return ((InternalEList<?>)getDelegationPorts()).basicRemove(otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				if (resolve) return getHwplatformType();
				return basicGetHwplatformType();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCES:
				return getResources();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES:
				return getNetworkingHardwareInstances();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				return getHwplatformInstances();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return getDelegationPorts();
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES:
				getNetworkingHardwareInstances().clear();
				getNetworkingHardwareInstances().addAll((Collection<? extends NetworkingHardwareInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				getHwplatformInstances().addAll((Collection<? extends HWPlatformInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends DelegationHWPortInstance>)newValue);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)null);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCES:
				getResources().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES:
				getNetworkingHardwareInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				getDelegationPorts().clear();
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				return hwplatformType != null;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES:
				return networkingHardwareInstances != null && !networkingHardwareInstances.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				return hwplatformInstances != null && !hwplatformInstances.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformInstanceImpl

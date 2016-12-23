/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl#getNetworkConnectorInstances <em>Network Connector Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWPlatformInstanceConfigurationImpl extends CommentableElementImpl implements HWPlatformInstanceConfiguration {
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
	 * The cached value of the '{@link #getNetworkingHardwareInstances() <em>Networking Hardware Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingHardwareInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkingHardwareInstance> networkingHardwareInstances;

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
	 * The cached value of the '{@link #getNetworkConnectorInstances() <em>Network Connector Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkConnectorInstance> networkConnectorInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatformInstance> getHwplatformInstances() {
		if (hwplatformInstances == null) {
			hwplatformInstances = new EObjectContainmentWithInverseEList<HWPlatformInstance>(HWPlatformInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC);
		}
		return hwplatformInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkingHardwareInstance> getNetworkingHardwareInstances() {
		if (networkingHardwareInstances == null) {
			networkingHardwareInstances = new EObjectContainmentEList<NetworkingHardwareInstance>(NetworkingHardwareInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES);
		}
		return networkingHardwareInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstance getParentHWPlatformInstance() {
		if (eContainerFeatureID() != HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE) return null;
		return (HWPlatformInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHWPlatformInstance(HWPlatformInstance newParentHWPlatformInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentHWPlatformInstance, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHWPlatformInstance(HWPlatformInstance newParentHWPlatformInstance) {
		if (newParentHWPlatformInstance != eInternalContainer() || (eContainerFeatureID() != HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE && newParentHWPlatformInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentHWPlatformInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentHWPlatformInstance != null)
				msgs = ((InternalEObject)newParentHWPlatformInstance).eInverseAdd(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC, HWPlatformInstance.class, msgs);
			msgs = basicSetParentHWPlatformInstance(newParentHWPlatformInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE, newParentHWPlatformInstance, newParentHWPlatformInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkConnectorInstance> getNetworkConnectorInstances() {
		if (networkConnectorInstances == null) {
			networkConnectorInstances = new EObjectContainmentEList<NetworkConnectorInstance>(NetworkConnectorInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES);
		}
		return networkConnectorInstances;
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHwplatformInstances()).basicAdd(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentHWPlatformInstance((HWPlatformInstance)otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return ((InternalEList<?>)getHwplatformInstances()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES:
				return ((InternalEList<?>)getNetworkingHardwareInstances()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				return basicSetParentHWPlatformInstance(null, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getNetworkConnectorInstances()).basicRemove(otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				return eInternalContainer().eInverseRemove(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC, HWPlatformInstance.class, msgs);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return getHwplatformInstances();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES:
				return getNetworkingHardwareInstances();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES:
				return getResources();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				return getParentHWPlatformInstance();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES:
				return getNetworkConnectorInstances();
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				getHwplatformInstances().addAll((Collection<? extends HWPlatformInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES:
				getNetworkingHardwareInstances().clear();
				getNetworkingHardwareInstances().addAll((Collection<? extends NetworkingHardwareInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				setParentHWPlatformInstance((HWPlatformInstance)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES:
				getNetworkConnectorInstances().clear();
				getNetworkConnectorInstances().addAll((Collection<? extends NetworkConnectorInstance>)newValue);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES:
				getNetworkingHardwareInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES:
				getResources().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				setParentHWPlatformInstance((HWPlatformInstance)null);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES:
				getNetworkConnectorInstances().clear();
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES:
				return hwplatformInstances != null && !hwplatformInstances.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES:
				return networkingHardwareInstances != null && !networkingHardwareInstances.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE:
				return getParentHWPlatformInstance() != null;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES:
				return networkConnectorInstances != null && !networkConnectorInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformInstanceConfigurationImpl

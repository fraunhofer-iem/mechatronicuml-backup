/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointInstanceImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getHwPortType <em>Hw Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#isIsNetworkInterface <em>Is Network Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPortInstanceImpl extends ConnectorEndpointInstanceImpl implements HWPortInstance {
	/**
	 * The cached setting delegate for the '{@link #getHwPortType() <em>Hw Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HW_PORT_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__HW_PORT_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectedNetworkConnectorInstances() <em>Connected Network Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedNetworkConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_NETWORK_CONNECTOR_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__PORT_KIND).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsNetworkInterface() <em>Is Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_NETWORK_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__IS_NETWORK_INTERFACE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.HW_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getParentResourceInstance() {
		if (eContainerFeatureID() != HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE) return null;
		return (ResourceInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResourceInstance(ResourceInstance newParentResourceInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResourceInstance, HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResourceInstance(ResourceInstance newParentResourceInstance) {
		if (newParentResourceInstance != eInternalContainer() || (eContainerFeatureID() != HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE && newParentResourceInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentResourceInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResourceInstance != null)
				msgs = ((InternalEObject)newParentResourceInstance).eInverseAdd(this, HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS, ResourceInstance.class, msgs);
			msgs = basicSetParentResourceInstance(newParentResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE, newParentResourceInstance, newParentResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public CommunicationResource getHwPortType() {
		return (CommunicationResource)HW_PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource basicGetHwPortType() {
		return (CommunicationResource)HW_PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwPortType(CommunicationResource newHwPortType) {
		HW_PORT_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newHwPortType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NetworkConnectorInstance> getConnectedNetworkConnectorInstances() {
		return (EList<NetworkConnectorInstance>)CONNECTED_NETWORK_CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol getProtocol() {
		return (CommunicationProtocol)PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol basicGetProtocol() {
		return (CommunicationProtocol)PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationKind getPortKind() {
		return (CommunicationKind)PORT_KIND__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(CommunicationKind newPortKind) {
		PORT_KIND__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPortKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNetworkInterface() {
		return (Boolean)IS_NETWORK_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNetworkInterface(boolean newIsNetworkInterface) {
		IS_NETWORK_INTERFACE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsNetworkInterface);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResourceInstance((ResourceInstance)otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return basicSetParentResourceInstance(null, msgs);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS, ResourceInstance.class, msgs);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				if (resolve) return getHwPortType();
				return basicGetHwPortType();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				return getConnectedNetworkConnectorInstances();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				return getPortKind();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__IS_NETWORK_INTERFACE:
				return isIsNetworkInterface();
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				setHwPortType((CommunicationResource)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				getConnectedNetworkConnectorInstances().clear();
				getConnectedNetworkConnectorInstances().addAll((Collection<? extends NetworkConnectorInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				setPortKind((CommunicationKind)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__IS_NETWORK_INTERFACE:
				setIsNetworkInterface((Boolean)newValue);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)null);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				setHwPortType((CommunicationResource)null);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				getConnectedNetworkConnectorInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				PORT_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__IS_NETWORK_INTERFACE:
				IS_NETWORK_INTERFACE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance() != null;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				return HW_PORT_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				return CONNECTED_NETWORK_CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				return PORT_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__IS_NETWORK_INTERFACE:
				return IS_NETWORK_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HWPort.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE: return HwresourceinstancePackage.HW_PORT__PARENT_RESOURCE_INSTANCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HWPort.class) {
			switch (baseFeatureID) {
				case HwresourceinstancePackage.HW_PORT__PARENT_RESOURCE_INSTANCE: return HwplatforminstancePackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HWPortInstanceImpl

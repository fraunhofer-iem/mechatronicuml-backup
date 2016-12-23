/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getCommunicationResource <em>Communication Resource</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#isMultiHWPort <em>Multi HW Port</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl#isIsNetworkInterface <em>Is Network Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWPortInstanceImpl extends ConnectorEndpointInstanceImpl implements HWPortInstance {
	/**
	 * The cached value of the '{@link #getCommunicationResource() <em>Communication Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationResource()
	 * @generated
	 * @ordered
	 */
	protected CommunicationResource communicationResource;

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourceinstancePackage.Literals.HW_PORT__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CARDINALITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourceinstancePackage.Literals.HW_PORT__CARDINALITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isMultiHWPort() <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHWPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_HW_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourceinstancePackage.Literals.HW_PORT__MULTI_HW_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourceinstancePackage.Literals.HW_PORT__PORT_KIND).getSettingDelegate();

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
	public CommunicationResource getCommunicationResource() {
		if (communicationResource != null && communicationResource.eIsProxy()) {
			InternalEObject oldCommunicationResource = (InternalEObject)communicationResource;
			communicationResource = (CommunicationResource)eResolveProxy(oldCommunicationResource);
			if (communicationResource != oldCommunicationResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE, oldCommunicationResource, communicationResource));
			}
		}
		return communicationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource basicGetCommunicationResource() {
		return communicationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationResource(CommunicationResource newCommunicationResource) {
		CommunicationResource oldCommunicationResource = communicationResource;
		communicationResource = newCommunicationResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE, oldCommunicationResource, communicationResource));
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
	public Cardinality getCardinality() {
		return (Cardinality)CARDINALITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Cardinality' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		CARDINALITY__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiHWPort() {
		return (Boolean)MULTI_HW_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiHWPort(boolean newMultiHWPort) {
		MULTI_HW_PORT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMultiHWPort);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE:
				if (resolve) return getCommunicationResource();
				return basicGetCommunicationResource();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY:
				return getCardinality();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__MULTI_HW_PORT:
				return isMultiHWPort();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				return getPortKind();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				return getConnectedNetworkConnectorInstances();
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE:
				setCommunicationResource((CommunicationResource)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__MULTI_HW_PORT:
				setMultiHWPort((Boolean)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				setPortKind((CommunicationKind)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				getConnectedNetworkConnectorInstances().clear();
				getConnectedNetworkConnectorInstances().addAll((Collection<? extends NetworkConnectorInstance>)newValue);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE:
				setCommunicationResource((CommunicationResource)null);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__MULTI_HW_PORT:
				MULTI_HW_PORT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				PORT_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				getConnectedNetworkConnectorInstances().clear();
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE:
				return communicationResource != null;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY:
				return CARDINALITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__MULTI_HW_PORT:
				return MULTI_HW_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				return PORT_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES:
				return CONNECTED_NETWORK_CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE: return HwresourceinstancePackage.HW_PORT__COMMUNICATION_RESOURCE;
				case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL: return HwresourceinstancePackage.HW_PORT__PROTOCOL;
				case HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY: return HwresourceinstancePackage.HW_PORT__CARDINALITY;
				case HwplatforminstancePackage.HW_PORT_INSTANCE__MULTI_HW_PORT: return HwresourceinstancePackage.HW_PORT__MULTI_HW_PORT;
				case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND: return HwresourceinstancePackage.HW_PORT__PORT_KIND;
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
				case HwresourceinstancePackage.HW_PORT__COMMUNICATION_RESOURCE: return HwplatforminstancePackage.HW_PORT_INSTANCE__COMMUNICATION_RESOURCE;
				case HwresourceinstancePackage.HW_PORT__PROTOCOL: return HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL;
				case HwresourceinstancePackage.HW_PORT__CARDINALITY: return HwplatforminstancePackage.HW_PORT_INSTANCE__CARDINALITY;
				case HwresourceinstancePackage.HW_PORT__MULTI_HW_PORT: return HwplatforminstancePackage.HW_PORT_INSTANCE__MULTI_HW_PORT;
				case HwresourceinstancePackage.HW_PORT__PORT_KIND: return HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HWPortInstanceImpl

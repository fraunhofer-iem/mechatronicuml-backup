/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.CorePackage;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation HW Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#isMultiHWPort <em>Multi HW Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationHWPortImpl extends ConnectorEndpointImpl implements DelegationHWPort {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached setting delegate for the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PORT_KIND).getSettingDelegate();
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationProtocol protocol;
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;
	/**
	 * The cached setting delegate for the '{@link #isMultiHWPort() <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHWPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_HW_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourcePackage.Literals.COMMUNICATION_RESOURCE__MULTI_HW_PORT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.DELEGATION_HW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParentResource() {
		if (eContainerFeatureID() != HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResource(Resource newParentResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResource, HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResource(Resource newParentResource) {
		if (newParentResource != eInternalContainer() || (eContainerFeatureID() != HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE && newParentResource != null)) {
			if (EcoreUtil.isAncestor(this, newParentResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResource != null)
				msgs = ((InternalEObject)newParentResource).eInverseAdd(this, HwresourcePackage.RESOURCE__HWPORTS, Resource.class, msgs);
			msgs = basicSetParentResource(newParentResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE, newParentResource, newParentResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getParentResourceInstance() {
		if (eContainerFeatureID() != HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE) return null;
		return (ResourceInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResourceInstance(ResourceInstance newParentResourceInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResourceInstance, HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResourceInstance(ResourceInstance newParentResourceInstance) {
		if (newParentResourceInstance != eInternalContainer() || (eContainerFeatureID() != HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE && newParentResourceInstance != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE, newParentResourceInstance, newParentResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortKind getPortKind() {
		return (HWPortKind)PORT_KIND__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(HWPortKind newPortKind) {
		PORT_KIND__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPortKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (CommunicationProtocol)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(CommunicationProtocol newProtocol) {
		CommunicationProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY, newCardinality, newCardinality));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResource((Resource)otherEnd, msgs);
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				return basicSetParentResource(null, msgs);
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
				return basicSetParentResourceInstance(null, msgs);
			case HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY:
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				return eInternalContainer().eInverseRemove(this, HwresourcePackage.RESOURCE__HWPORTS, Resource.class, msgs);
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
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
			case HwplatformPackage.DELEGATION_HW_PORT__NAME:
				return getName();
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				return getParentResource();
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance();
			case HwplatformPackage.DELEGATION_HW_PORT__PORT_KIND:
				return getPortKind();
			case HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY:
				return getCardinality();
			case HwplatformPackage.DELEGATION_HW_PORT__MULTI_HW_PORT:
				return isMultiHWPort();
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
			case HwplatformPackage.DELEGATION_HW_PORT__NAME:
				setName((String)newValue);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				setParentResource((Resource)newValue);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)newValue);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PORT_KIND:
				setPortKind((HWPortKind)newValue);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__MULTI_HW_PORT:
				setMultiHWPort((Boolean)newValue);
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
			case HwplatformPackage.DELEGATION_HW_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				setParentResource((Resource)null);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)null);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PORT_KIND:
				PORT_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case HwplatformPackage.DELEGATION_HW_PORT__MULTI_HW_PORT:
				MULTI_HW_PORT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case HwplatformPackage.DELEGATION_HW_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE:
				return getParentResource() != null;
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance() != null;
			case HwplatformPackage.DELEGATION_HW_PORT__PORT_KIND:
				return PORT_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL:
				return protocol != null;
			case HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY:
				return cardinality != null;
			case HwplatformPackage.DELEGATION_HW_PORT__MULTI_HW_PORT:
				return MULTI_HW_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case HwplatformPackage.DELEGATION_HW_PORT__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == HWPort.class) {
			switch (derivedFeatureID) {
				case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE: return HwresourcePackage.HW_PORT__PARENT_RESOURCE;
				case HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE: return HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE;
				default: return -1;
			}
		}
		if (baseClass == CommunicationResource.class) {
			switch (derivedFeatureID) {
				case HwplatformPackage.DELEGATION_HW_PORT__PORT_KIND: return HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND;
				case HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL: return HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL;
				case HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY: return HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY;
				case HwplatformPackage.DELEGATION_HW_PORT__MULTI_HW_PORT: return HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return HwplatformPackage.DELEGATION_HW_PORT__NAME;
				default: return -1;
			}
		}
		if (baseClass == HWPort.class) {
			switch (baseFeatureID) {
				case HwresourcePackage.HW_PORT__PARENT_RESOURCE: return HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE;
				case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE: return HwplatformPackage.DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE;
				default: return -1;
			}
		}
		if (baseClass == CommunicationResource.class) {
			switch (baseFeatureID) {
				case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND: return HwplatformPackage.DELEGATION_HW_PORT__PORT_KIND;
				case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL: return HwplatformPackage.DELEGATION_HW_PORT__PROTOCOL;
				case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY: return HwplatformPackage.DELEGATION_HW_PORT__CARDINALITY;
				case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT: return HwplatformPackage.DELEGATION_HW_PORT__MULTI_HW_PORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DelegationHWPortImpl

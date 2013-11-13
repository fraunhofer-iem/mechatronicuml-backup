/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getHwportType <em>Hwport Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getQueuingTime <em>Queuing Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getConnectedMedia <em>Connected Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getPayloadDataSize <em>Payload Data Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#isIsDelegationPort <em>Is Delegation Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HWPortInstanceImpl extends NamedElementImpl implements HWPortInstance {
	/**
	 * The cached value of the '{@link #getHwportType() <em>Hwport Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwportType()
	 * @generated
	 * @ordered
	 */
	protected HWPort hwportType;

	/**
	 * The cached value of the '{@link #getQueuingTime() <em>Queuing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuingTime()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval queuingTime;

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PlatformPackage.Literals.HW_PORT_INSTANCE__PROTOCOL).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getConnectedMedia() <em>Connected Media</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMedia> connectedMedia;

	/**
	 * The cached value of the '{@link #getPayloadDataSize() <em>Payload Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadDataSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize payloadDataSize;

	/**
	 * The cached setting delegate for the '{@link #isIsDelegationPort() <em>Is Delegation Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelegationPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_DELEGATION_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PlatformPackage.Literals.HW_PORT_INSTANCE__IS_DELEGATION_PORT).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDelegation() <em>Delegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegation;

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
		return PlatformPackage.Literals.HW_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPort getHwportType() {
		if (hwportType != null && hwportType.eIsProxy()) {
			InternalEObject oldHwportType = (InternalEObject)hwportType;
			hwportType = (HWPort)eResolveProxy(oldHwportType);
			if (hwportType != oldHwportType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.HW_PORT_INSTANCE__HWPORT_TYPE, oldHwportType, hwportType));
			}
		}
		return hwportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPort basicGetHwportType() {
		return hwportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwportType(HWPort newHwportType) {
		HWPort oldHwportType = hwportType;
		hwportType = newHwportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_INSTANCE__HWPORT_TYPE, oldHwportType, hwportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getParentResourceInstance() {
		if (eContainerFeatureID() != PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE) return null;
		return (ResourceInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResourceInstance(ResourceInstance newParentResourceInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResourceInstance, PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResourceInstance(ResourceInstance newParentResourceInstance) {
		if (newParentResourceInstance != eInternalContainer() || (eContainerFeatureID() != PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE && newParentResourceInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentResourceInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResourceInstance != null)
				msgs = ((InternalEObject)newParentResourceInstance).eInverseAdd(this, PlatformPackage.RESOURCE_INSTANCE__HWPORT_INSTANCES, ResourceInstance.class, msgs);
			msgs = basicSetParentResourceInstance(newParentResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE, newParentResourceInstance, newParentResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getQueuingTime() {
		return queuingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueuingTime(TimeInterval newQueuingTime, NotificationChain msgs) {
		TimeInterval oldQueuingTime = queuingTime;
		queuingTime = newQueuingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME, oldQueuingTime, newQueuingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueuingTime(TimeInterval newQueuingTime) {
		if (newQueuingTime != queuingTime) {
			NotificationChain msgs = null;
			if (queuingTime != null)
				msgs = ((InternalEObject)queuingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME, null, msgs);
			if (newQueuingTime != null)
				msgs = ((InternalEObject)newQueuingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME, null, msgs);
			msgs = basicSetQueuingTime(newQueuingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME, newQueuingTime, newQueuingTime));
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
	public EList<CommunicationMedia> getConnectedMedia() {
		if (connectedMedia == null) {
			connectedMedia = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationMedia>(CommunicationMedia.class, this, PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA, PlatformPackage.COMMUNICATION_MEDIA__CONNECTED_HW_PORT_INSTANCES);
		}
		return connectedMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getPayloadDataSize() {
		return payloadDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayloadDataSize(DataSize newPayloadDataSize, NotificationChain msgs) {
		DataSize oldPayloadDataSize = payloadDataSize;
		payloadDataSize = newPayloadDataSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE, oldPayloadDataSize, newPayloadDataSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadDataSize(DataSize newPayloadDataSize) {
		if (newPayloadDataSize != payloadDataSize) {
			NotificationChain msgs = null;
			if (payloadDataSize != null)
				msgs = ((InternalEObject)payloadDataSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE, null, msgs);
			if (newPayloadDataSize != null)
				msgs = ((InternalEObject)newPayloadDataSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE, null, msgs);
			msgs = basicSetPayloadDataSize(newPayloadDataSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE, newPayloadDataSize, newPayloadDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDelegationPort() {
		return (Boolean)IS_DELEGATION_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectWithInverseResolvingEList<Delegation>(Delegation.class, this, PlatformPackage.HW_PORT_INSTANCE__DELEGATION, PlatformPackage.DELEGATION__HW_PORT_INSTANCE);
		}
		return delegation;
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
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResourceInstance((ResourceInstance)otherEnd, msgs);
			case PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedMedia()).basicAdd(otherEnd, msgs);
			case PlatformPackage.HW_PORT_INSTANCE__DELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegation()).basicAdd(otherEnd, msgs);
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
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return basicSetParentResourceInstance(null, msgs);
			case PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME:
				return basicSetQueuingTime(null, msgs);
			case PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA:
				return ((InternalEList<?>)getConnectedMedia()).basicRemove(otherEnd, msgs);
			case PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE:
				return basicSetPayloadDataSize(null, msgs);
			case PlatformPackage.HW_PORT_INSTANCE__DELEGATION:
				return ((InternalEList<?>)getDelegation()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, PlatformPackage.RESOURCE_INSTANCE__HWPORT_INSTANCES, ResourceInstance.class, msgs);
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
			case PlatformPackage.HW_PORT_INSTANCE__HWPORT_TYPE:
				if (resolve) return getHwportType();
				return basicGetHwportType();
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance();
			case PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME:
				return getQueuingTime();
			case PlatformPackage.HW_PORT_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA:
				return getConnectedMedia();
			case PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE:
				return getPayloadDataSize();
			case PlatformPackage.HW_PORT_INSTANCE__IS_DELEGATION_PORT:
				return isIsDelegationPort();
			case PlatformPackage.HW_PORT_INSTANCE__DELEGATION:
				return getDelegation();
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
			case PlatformPackage.HW_PORT_INSTANCE__HWPORT_TYPE:
				setHwportType((HWPort)newValue);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)newValue);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME:
				setQueuingTime((TimeInterval)newValue);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA:
				getConnectedMedia().clear();
				getConnectedMedia().addAll((Collection<? extends CommunicationMedia>)newValue);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE:
				setPayloadDataSize((DataSize)newValue);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__DELEGATION:
				getDelegation().clear();
				getDelegation().addAll((Collection<? extends Delegation>)newValue);
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
			case PlatformPackage.HW_PORT_INSTANCE__HWPORT_TYPE:
				setHwportType((HWPort)null);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)null);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME:
				setQueuingTime((TimeInterval)null);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA:
				getConnectedMedia().clear();
				return;
			case PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE:
				setPayloadDataSize((DataSize)null);
				return;
			case PlatformPackage.HW_PORT_INSTANCE__DELEGATION:
				getDelegation().clear();
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
			case PlatformPackage.HW_PORT_INSTANCE__HWPORT_TYPE:
				return hwportType != null;
			case PlatformPackage.HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance() != null;
			case PlatformPackage.HW_PORT_INSTANCE__QUEUING_TIME:
				return queuingTime != null;
			case PlatformPackage.HW_PORT_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PlatformPackage.HW_PORT_INSTANCE__CONNECTED_MEDIA:
				return connectedMedia != null && !connectedMedia.isEmpty();
			case PlatformPackage.HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE:
				return payloadDataSize != null;
			case PlatformPackage.HW_PORT_INSTANCE__IS_DELEGATION_PORT:
				return IS_DELEGATION_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PlatformPackage.HW_PORT_INSTANCE__DELEGATION:
				return delegation != null && !delegation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPortInstanceImpl

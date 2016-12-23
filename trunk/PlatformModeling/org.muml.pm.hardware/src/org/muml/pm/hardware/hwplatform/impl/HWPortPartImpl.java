/**
 */
package org.muml.pm.hardware.hwplatform.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.pim.connector.impl.ConnectorEndpointImpl;
import org.muml.pm.hardware.hwplatform.HWPortPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwvaluetype.DataSize;
import org.muml.pm.hardware.hwvaluetype.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Port Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl#getConnectedNetworkConnector <em>Connected Network Connector</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl#getQueuingTime <em>Queuing Time</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl#getPayloadDataSize <em>Payload Data Size</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl#getParentPlatformPart <em>Parent Platform Part</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl#getHwport <em>Hwport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWPortPartImpl extends ConnectorEndpointImpl implements HWPortPart {
	/**
	 * The cached setting delegate for the '{@link #getConnectedNetworkConnector() <em>Connected Network Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedNetworkConnector()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_NETWORK_CONNECTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR).getSettingDelegate();

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
	 * The cached value of the '{@link #getPayloadDataSize() <em>Payload Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadDataSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize payloadDataSize;

	/**
	 * The cached value of the '{@link #getHwport() <em>Hwport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwport()
	 * @generated
	 * @ordered
	 */
	protected HWPort hwport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPortPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.HW_PORT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NetworkConnector> getConnectedNetworkConnector() {
		return (EList<NetworkConnector>)CONNECTED_NETWORK_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__QUEUING_TIME, oldQueuingTime, newQueuingTime);
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
				msgs = ((InternalEObject)queuingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.HW_PORT_PART__QUEUING_TIME, null, msgs);
			if (newQueuingTime != null)
				msgs = ((InternalEObject)newQueuingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.HW_PORT_PART__QUEUING_TIME, null, msgs);
			msgs = basicSetQueuingTime(newQueuingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__QUEUING_TIME, newQueuingTime, newQueuingTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE, oldPayloadDataSize, newPayloadDataSize);
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
				msgs = ((InternalEObject)payloadDataSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE, null, msgs);
			if (newPayloadDataSize != null)
				msgs = ((InternalEObject)newPayloadDataSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE, null, msgs);
			msgs = basicSetPayloadDataSize(newPayloadDataSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE, newPayloadDataSize, newPayloadDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPart getParentPlatformPart() {
		if (eContainerFeatureID() != HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART) return null;
		return (PlatformPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPlatformPart(PlatformPart newParentPlatformPart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPlatformPart, HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPlatformPart(PlatformPart newParentPlatformPart) {
		if (newParentPlatformPart != eInternalContainer() || (eContainerFeatureID() != HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART && newParentPlatformPart != null)) {
			if (EcoreUtil.isAncestor(this, newParentPlatformPart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPlatformPart != null)
				msgs = ((InternalEObject)newParentPlatformPart).eInverseAdd(this, HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS, PlatformPart.class, msgs);
			msgs = basicSetParentPlatformPart(newParentPlatformPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART, newParentPlatformPart, newParentPlatformPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPort getHwport() {
		if (hwport != null && hwport.eIsProxy()) {
			InternalEObject oldHwport = (InternalEObject)hwport;
			hwport = (HWPort)eResolveProxy(oldHwport);
			if (hwport != oldHwport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatformPackage.HW_PORT_PART__HWPORT, oldHwport, hwport));
			}
		}
		return hwport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPort basicGetHwport() {
		return hwport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwport(HWPort newHwport) {
		HWPort oldHwport = hwport;
		hwport = newHwport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__HWPORT, oldHwport, hwport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPlatformPart((PlatformPart)otherEnd, msgs);
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
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				return basicSetQueuingTime(null, msgs);
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				return basicSetPayloadDataSize(null, msgs);
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				return basicSetParentPlatformPart(null, msgs);
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
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				return eInternalContainer().eInverseRemove(this, HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS, PlatformPart.class, msgs);
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
			case HwplatformPackage.HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR:
				return getConnectedNetworkConnector();
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				return getQueuingTime();
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				return getPayloadDataSize();
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				return getParentPlatformPart();
			case HwplatformPackage.HW_PORT_PART__HWPORT:
				if (resolve) return getHwport();
				return basicGetHwport();
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
			case HwplatformPackage.HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR:
				getConnectedNetworkConnector().clear();
				getConnectedNetworkConnector().addAll((Collection<? extends NetworkConnector>)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				setQueuingTime((TimeInterval)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				setPayloadDataSize((DataSize)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				setParentPlatformPart((PlatformPart)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__HWPORT:
				setHwport((HWPort)newValue);
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
			case HwplatformPackage.HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR:
				getConnectedNetworkConnector().clear();
				return;
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				setQueuingTime((TimeInterval)null);
				return;
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				setPayloadDataSize((DataSize)null);
				return;
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				setParentPlatformPart((PlatformPart)null);
				return;
			case HwplatformPackage.HW_PORT_PART__HWPORT:
				setHwport((HWPort)null);
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
			case HwplatformPackage.HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR:
				return CONNECTED_NETWORK_CONNECTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				return queuingTime != null;
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				return payloadDataSize != null;
			case HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART:
				return getParentPlatformPart() != null;
			case HwplatformPackage.HW_PORT_PART__HWPORT:
				return hwport != null;
		}
		return super.eIsSet(featureID);
	}

} //HWPortPartImpl

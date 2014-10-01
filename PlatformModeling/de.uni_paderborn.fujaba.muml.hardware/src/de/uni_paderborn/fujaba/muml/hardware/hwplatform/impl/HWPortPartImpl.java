/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
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
 * An implementation of the model object '<em><b>HW Port Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getCommunicationResource <em>Communication Resource</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getConnectedMediaPart <em>Connected Media Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#isMultiHWPort <em>Multi HW Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getQueuingTime <em>Queuing Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getPayloadDataSize <em>Payload Data Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl#getParentResourcePart <em>Parent Resource Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPortPartImpl extends ConnectorEndpointImpl implements HWPortPart {
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
	 * The cached setting delegate for the '{@link #getConnectedMediaPart() <em>Connected Media Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedMediaPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_MEDIA_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PORT_PART__CONNECTED_MEDIA_PART).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PORT_PART__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CARDINALITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PORT_PART__CARDINALITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isMultiHWPort() <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHWPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_HW_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PORT_PART__MULTI_HW_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PORT_PART__PORT_KIND).getSettingDelegate();

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
	public CommunicationResource getCommunicationResource() {
		if (communicationResource != null && communicationResource.eIsProxy()) {
			InternalEObject oldCommunicationResource = (InternalEObject)communicationResource;
			communicationResource = (CommunicationResource)eResolveProxy(oldCommunicationResource);
			if (communicationResource != oldCommunicationResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatformPackage.HW_PORT_PART__COMMUNICATION_RESOURCE, oldCommunicationResource, communicationResource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__COMMUNICATION_RESOURCE, oldCommunicationResource, communicationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationMediaPart> getConnectedMediaPart() {
		return (EList<CommunicationMediaPart>)CONNECTED_MEDIA_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public PlatformPart getParentResourcePart() {
		if (eContainerFeatureID() != HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART) return null;
		return (PlatformPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResourcePart(PlatformPart newParentResourcePart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResourcePart, HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResourcePart(PlatformPart newParentResourcePart) {
		if (newParentResourcePart != eInternalContainer() || (eContainerFeatureID() != HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART && newParentResourcePart != null)) {
			if (EcoreUtil.isAncestor(this, newParentResourcePart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResourcePart != null)
				msgs = ((InternalEObject)newParentResourcePart).eInverseAdd(this, HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS, PlatformPart.class, msgs);
			msgs = basicSetParentResourcePart(newParentResourcePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART, newParentResourcePart, newParentResourcePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResourcePart((PlatformPart)otherEnd, msgs);
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
			case HwplatformPackage.HW_PORT_PART__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				return basicSetQueuingTime(null, msgs);
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				return basicSetPayloadDataSize(null, msgs);
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
				return basicSetParentResourcePart(null, msgs);
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
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
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
			case HwplatformPackage.HW_PORT_PART__COMMUNICATION_RESOURCE:
				if (resolve) return getCommunicationResource();
				return basicGetCommunicationResource();
			case HwplatformPackage.HW_PORT_PART__CONNECTED_MEDIA_PART:
				return getConnectedMediaPart();
			case HwplatformPackage.HW_PORT_PART__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatformPackage.HW_PORT_PART__CARDINALITY:
				return getCardinality();
			case HwplatformPackage.HW_PORT_PART__MULTI_HW_PORT:
				return isMultiHWPort();
			case HwplatformPackage.HW_PORT_PART__PORT_KIND:
				return getPortKind();
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				return getQueuingTime();
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				return getPayloadDataSize();
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
				return getParentResourcePart();
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
			case HwplatformPackage.HW_PORT_PART__COMMUNICATION_RESOURCE:
				setCommunicationResource((CommunicationResource)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__CONNECTED_MEDIA_PART:
				getConnectedMediaPart().clear();
				getConnectedMediaPart().addAll((Collection<? extends CommunicationMediaPart>)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__MULTI_HW_PORT:
				setMultiHWPort((Boolean)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__PORT_KIND:
				setPortKind((HWPortKind)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				setQueuingTime((TimeInterval)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				setPayloadDataSize((DataSize)newValue);
				return;
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
				setParentResourcePart((PlatformPart)newValue);
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
			case HwplatformPackage.HW_PORT_PART__COMMUNICATION_RESOURCE:
				setCommunicationResource((CommunicationResource)null);
				return;
			case HwplatformPackage.HW_PORT_PART__CONNECTED_MEDIA_PART:
				getConnectedMediaPart().clear();
				return;
			case HwplatformPackage.HW_PORT_PART__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case HwplatformPackage.HW_PORT_PART__MULTI_HW_PORT:
				MULTI_HW_PORT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatformPackage.HW_PORT_PART__PORT_KIND:
				PORT_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				setQueuingTime((TimeInterval)null);
				return;
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				setPayloadDataSize((DataSize)null);
				return;
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
				setParentResourcePart((PlatformPart)null);
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
			case HwplatformPackage.HW_PORT_PART__COMMUNICATION_RESOURCE:
				return communicationResource != null;
			case HwplatformPackage.HW_PORT_PART__CONNECTED_MEDIA_PART:
				return CONNECTED_MEDIA_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.HW_PORT_PART__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.HW_PORT_PART__CARDINALITY:
				return CARDINALITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.HW_PORT_PART__MULTI_HW_PORT:
				return MULTI_HW_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.HW_PORT_PART__PORT_KIND:
				return PORT_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.HW_PORT_PART__QUEUING_TIME:
				return queuingTime != null;
			case HwplatformPackage.HW_PORT_PART__PAYLOAD_DATA_SIZE:
				return payloadDataSize != null;
			case HwplatformPackage.HW_PORT_PART__PARENT_RESOURCE_PART:
				return getParentResourcePart() != null;
		}
		return super.eIsSet(featureID);
	}

} //HWPortPartImpl

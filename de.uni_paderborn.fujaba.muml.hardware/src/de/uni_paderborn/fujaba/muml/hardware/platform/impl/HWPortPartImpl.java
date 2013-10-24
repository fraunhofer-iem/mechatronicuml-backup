/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Port Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl#getHwPortInstanceType <em>Hw Port Instance Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl#getConnectedMedia <em>Connected Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPortPartImpl extends NamedElementImpl implements HWPortPart {
	/**
	 * The cached value of the '{@link #getHwPortInstanceType() <em>Hw Port Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortInstanceType()
	 * @generated
	 * @ordered
	 */
	protected HWPortInstance hwPortInstanceType;

	/**
	 * The cached value of the '{@link #getConnectedMedia() <em>Connected Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedMedia()
	 * @generated
	 * @ordered
	 */
	protected CommunicationMedia connectedMedia;

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PlatformPackage.Literals.HW_PORT_PART__PROTOCOL).getSettingDelegate();

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
		return PlatformPackage.Literals.HW_PORT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance getHwPortInstanceType() {
		if (hwPortInstanceType != null && hwPortInstanceType.eIsProxy()) {
			InternalEObject oldHwPortInstanceType = (InternalEObject)hwPortInstanceType;
			hwPortInstanceType = (HWPortInstance)eResolveProxy(oldHwPortInstanceType);
			if (hwPortInstanceType != oldHwPortInstanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.HW_PORT_PART__HW_PORT_INSTANCE_TYPE, oldHwPortInstanceType, hwPortInstanceType));
			}
		}
		return hwPortInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance basicGetHwPortInstanceType() {
		return hwPortInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwPortInstanceType(HWPortInstance newHwPortInstanceType) {
		HWPortInstance oldHwPortInstanceType = hwPortInstanceType;
		hwPortInstanceType = newHwPortInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_PART__HW_PORT_INSTANCE_TYPE, oldHwPortInstanceType, hwPortInstanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia getConnectedMedia() {
		if (connectedMedia != null && connectedMedia.eIsProxy()) {
			InternalEObject oldConnectedMedia = (InternalEObject)connectedMedia;
			connectedMedia = (CommunicationMedia)eResolveProxy(oldConnectedMedia);
			if (connectedMedia != oldConnectedMedia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA, oldConnectedMedia, connectedMedia));
			}
		}
		return connectedMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia basicGetConnectedMedia() {
		return connectedMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedMedia(CommunicationMedia newConnectedMedia, NotificationChain msgs) {
		CommunicationMedia oldConnectedMedia = connectedMedia;
		connectedMedia = newConnectedMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA, oldConnectedMedia, newConnectedMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedMedia(CommunicationMedia newConnectedMedia) {
		if (newConnectedMedia != connectedMedia) {
			NotificationChain msgs = null;
			if (connectedMedia != null)
				msgs = ((InternalEObject)connectedMedia).eInverseRemove(this, PlatformPackage.COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS, CommunicationMedia.class, msgs);
			if (newConnectedMedia != null)
				msgs = ((InternalEObject)newConnectedMedia).eInverseAdd(this, PlatformPackage.COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS, CommunicationMedia.class, msgs);
			msgs = basicSetConnectedMedia(newConnectedMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA, newConnectedMedia, newConnectedMedia));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA:
				if (connectedMedia != null)
					msgs = ((InternalEObject)connectedMedia).eInverseRemove(this, PlatformPackage.COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS, CommunicationMedia.class, msgs);
				return basicSetConnectedMedia((CommunicationMedia)otherEnd, msgs);
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
			case PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA:
				return basicSetConnectedMedia(null, msgs);
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
			case PlatformPackage.HW_PORT_PART__HW_PORT_INSTANCE_TYPE:
				if (resolve) return getHwPortInstanceType();
				return basicGetHwPortInstanceType();
			case PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA:
				if (resolve) return getConnectedMedia();
				return basicGetConnectedMedia();
			case PlatformPackage.HW_PORT_PART__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
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
			case PlatformPackage.HW_PORT_PART__HW_PORT_INSTANCE_TYPE:
				setHwPortInstanceType((HWPortInstance)newValue);
				return;
			case PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA:
				setConnectedMedia((CommunicationMedia)newValue);
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
			case PlatformPackage.HW_PORT_PART__HW_PORT_INSTANCE_TYPE:
				setHwPortInstanceType((HWPortInstance)null);
				return;
			case PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA:
				setConnectedMedia((CommunicationMedia)null);
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
			case PlatformPackage.HW_PORT_PART__HW_PORT_INSTANCE_TYPE:
				return hwPortInstanceType != null;
			case PlatformPackage.HW_PORT_PART__CONNECTED_MEDIA:
				return connectedMedia != null;
			case PlatformPackage.HW_PORT_PART__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //HWPortPartImpl

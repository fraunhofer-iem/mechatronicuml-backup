/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Media Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl#getCommunicationMedia <em>Communication Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl#getCommunicationMediaPart <em>Communication Media Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicationMediaInstanceImpl extends NetworkingHardwareInstanceImpl implements CommunicationMediaInstance {
	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.COMMUNICATION_MEDIA_INSTANCE__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCommunicationMedia() <em>Communication Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedia()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COMMUNICATION_MEDIA__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getCommunicationMediaPart() <em>Communication Media Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMediaPart()
	 * @generated
	 * @ordered
	 */
	protected CommunicationMediaPart communicationMediaPart;

	/**
	 * The cached setting delegate for the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BANDWIDTH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMediaInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.COMMUNICATION_MEDIA_INSTANCE;
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
	public void setProtocol(CommunicationProtocol newProtocol) {
		PROTOCOL__ESETTING_DELEGATE.dynamicSet(this, null, 0, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia getCommunicationMedia() {
		return (CommunicationMedia)COMMUNICATION_MEDIA__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia basicGetCommunicationMedia() {
		return (CommunicationMedia)COMMUNICATION_MEDIA__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationMedia(CommunicationMedia newCommunicationMedia) {
		COMMUNICATION_MEDIA__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCommunicationMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMediaPart getCommunicationMediaPart() {
		if (communicationMediaPart != null && communicationMediaPart.eIsProxy()) {
			InternalEObject oldCommunicationMediaPart = (InternalEObject)communicationMediaPart;
			communicationMediaPart = (CommunicationMediaPart)eResolveProxy(oldCommunicationMediaPart);
			if (communicationMediaPart != oldCommunicationMediaPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART, oldCommunicationMediaPart, communicationMediaPart));
			}
		}
		return communicationMediaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMediaPart basicGetCommunicationMediaPart() {
		return communicationMediaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationMediaPart(CommunicationMediaPart newCommunicationMediaPart) {
		CommunicationMediaPart oldCommunicationMediaPart = communicationMediaPart;
		communicationMediaPart = newCommunicationMediaPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART, oldCommunicationMediaPart, communicationMediaPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getBandwidth() {
		return (DataRate)BANDWIDTH__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBandwidth(DataRate newBandwidth, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Bandwidth' containment reference
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
	public void setBandwidth(DataRate newBandwidth) {
		BANDWIDTH__ESETTING_DELEGATE.dynamicSet(this, null, 0, newBandwidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH:
				return basicSetBandwidth(null, msgs);
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
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA:
				if (resolve) return getCommunicationMedia();
				return basicGetCommunicationMedia();
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART:
				if (resolve) return getCommunicationMediaPart();
				return basicGetCommunicationMediaPart();
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH:
				return getBandwidth();
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
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA:
				setCommunicationMedia((CommunicationMedia)newValue);
				return;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART:
				setCommunicationMediaPart((CommunicationMediaPart)newValue);
				return;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH:
				setBandwidth((DataRate)newValue);
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
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA:
				setCommunicationMedia((CommunicationMedia)null);
				return;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART:
				setCommunicationMediaPart((CommunicationMediaPart)null);
				return;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH:
				setBandwidth((DataRate)null);
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
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA:
				return COMMUNICATION_MEDIA__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART:
				return communicationMediaPart != null;
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH:
				return BANDWIDTH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //CommunicationMediaInstanceImpl

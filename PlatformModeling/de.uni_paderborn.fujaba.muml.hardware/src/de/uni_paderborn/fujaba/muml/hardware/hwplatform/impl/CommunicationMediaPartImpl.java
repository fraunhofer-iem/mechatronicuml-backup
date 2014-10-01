/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

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
 * An implementation of the model object '<em><b>Communication Media Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl#getCommunicationMedia <em>Communication Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicationMediaPartImpl extends NetworkingHardwarePartImpl implements CommunicationMediaPart {
	/**
	 * The cached value of the '{@link #getCommunicationMedia() <em>Communication Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedia()
	 * @generated
	 * @ordered
	 */
	protected CommunicationMedia communicationMedia;

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.COMMUNICATION_MEDIA_PART__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BANDWIDTH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.COMMUNICATION_MEDIA_PART__BANDWIDTH).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMediaPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.COMMUNICATION_MEDIA_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia getCommunicationMedia() {
		if (communicationMedia != null && communicationMedia.eIsProxy()) {
			InternalEObject oldCommunicationMedia = (InternalEObject)communicationMedia;
			communicationMedia = (CommunicationMedia)eResolveProxy(oldCommunicationMedia);
			if (communicationMedia != oldCommunicationMedia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatformPackage.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA, oldCommunicationMedia, communicationMedia));
			}
		}
		return communicationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedia basicGetCommunicationMedia() {
		return communicationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationMedia(CommunicationMedia newCommunicationMedia) {
		CommunicationMedia oldCommunicationMedia = communicationMedia;
		communicationMedia = newCommunicationMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA, oldCommunicationMedia, communicationMedia));
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
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__BANDWIDTH:
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
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA:
				if (resolve) return getCommunicationMedia();
				return basicGetCommunicationMedia();
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__BANDWIDTH:
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
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA:
				setCommunicationMedia((CommunicationMedia)newValue);
				return;
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__BANDWIDTH:
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
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA:
				setCommunicationMedia((CommunicationMedia)null);
				return;
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__BANDWIDTH:
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
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA:
				return communicationMedia != null;
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.COMMUNICATION_MEDIA_PART__BANDWIDTH:
				return BANDWIDTH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //CommunicationMediaPartImpl

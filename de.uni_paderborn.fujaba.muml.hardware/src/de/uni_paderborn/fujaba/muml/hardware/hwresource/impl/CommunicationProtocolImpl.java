/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationProtocolImpl#isIsTimeTriggered <em>Is Time Triggered</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationProtocolImpl#isIsEventTriggered <em>Is Event Triggered</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationProtocolImpl#getFurtherInformation <em>Further Information</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationProtocolImpl#isIsNetworkingProtocol <em>Is Networking Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicationProtocolImpl extends NamedElementImpl implements CommunicationProtocol {
	/**
	 * The default value of the '{@link #isIsTimeTriggered() <em>Is Time Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTimeTriggered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TIME_TRIGGERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTimeTriggered() <em>Is Time Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTimeTriggered()
	 * @generated
	 * @ordered
	 */
	protected boolean isTimeTriggered = IS_TIME_TRIGGERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEventTriggered() <em>Is Event Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEventTriggered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EVENT_TRIGGERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEventTriggered() <em>Is Event Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEventTriggered()
	 * @generated
	 * @ordered
	 */
	protected boolean isEventTriggered = IS_EVENT_TRIGGERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFurtherInformation() <em>Further Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String FURTHER_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFurtherInformation() <em>Further Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherInformation()
	 * @generated
	 * @ordered
	 */
	protected String furtherInformation = FURTHER_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNetworkingProtocol() <em>Is Networking Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetworkingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NETWORKING_PROTOCOL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsNetworkingProtocol() <em>Is Networking Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetworkingProtocol()
	 * @generated
	 * @ordered
	 */
	protected boolean isNetworkingProtocol = IS_NETWORKING_PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.COMMUNICATION_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTimeTriggered() {
		return isTimeTriggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTimeTriggered(boolean newIsTimeTriggered) {
		boolean oldIsTimeTriggered = isTimeTriggered;
		isTimeTriggered = newIsTimeTriggered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED, oldIsTimeTriggered, isTimeTriggered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEventTriggered() {
		return isEventTriggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEventTriggered(boolean newIsEventTriggered) {
		boolean oldIsEventTriggered = isEventTriggered;
		isEventTriggered = newIsEventTriggered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED, oldIsEventTriggered, isEventTriggered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFurtherInformation() {
		return furtherInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFurtherInformation(String newFurtherInformation) {
		String oldFurtherInformation = furtherInformation;
		furtherInformation = newFurtherInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION, oldFurtherInformation, furtherInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNetworkingProtocol() {
		return isNetworkingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNetworkingProtocol(boolean newIsNetworkingProtocol) {
		boolean oldIsNetworkingProtocol = isNetworkingProtocol;
		isNetworkingProtocol = newIsNetworkingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL, oldIsNetworkingProtocol, isNetworkingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED:
				return isIsTimeTriggered();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED:
				return isIsEventTriggered();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION:
				return getFurtherInformation();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL:
				return isIsNetworkingProtocol();
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED:
				setIsTimeTriggered((Boolean)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED:
				setIsEventTriggered((Boolean)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION:
				setFurtherInformation((String)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL:
				setIsNetworkingProtocol((Boolean)newValue);
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED:
				setIsTimeTriggered(IS_TIME_TRIGGERED_EDEFAULT);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED:
				setIsEventTriggered(IS_EVENT_TRIGGERED_EDEFAULT);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION:
				setFurtherInformation(FURTHER_INFORMATION_EDEFAULT);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL:
				setIsNetworkingProtocol(IS_NETWORKING_PROTOCOL_EDEFAULT);
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED:
				return isTimeTriggered != IS_TIME_TRIGGERED_EDEFAULT;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED:
				return isEventTriggered != IS_EVENT_TRIGGERED_EDEFAULT;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION:
				return FURTHER_INFORMATION_EDEFAULT == null ? furtherInformation != null : !FURTHER_INFORMATION_EDEFAULT.equals(furtherInformation);
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL:
				return isNetworkingProtocol != IS_NETWORKING_PROTOCOL_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isTimeTriggered: ");
		result.append(isTimeTriggered);
		result.append(", isEventTriggered: ");
		result.append(isEventTriggered);
		result.append(", furtherInformation: ");
		result.append(furtherInformation);
		result.append(", isNetworkingProtocol: ");
		result.append(isNetworkingProtocol);
		result.append(')');
		return result.toString();
	}

} //CommunicationProtocolImpl

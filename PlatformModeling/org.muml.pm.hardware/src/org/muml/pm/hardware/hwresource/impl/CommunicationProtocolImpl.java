/**
 */
package org.muml.pm.hardware.hwresource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwvaluetype.DataRate;
import org.muml.pm.hardware.hwvaluetype.DataSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#isIsTimeTriggered <em>Is Time Triggered</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#isIsEventTriggered <em>Is Event Triggered</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#getFurtherInformation <em>Further Information</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#isIsNetworkingProtocol <em>Is Networking Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#getDataFrameSize <em>Data Frame Size</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl#isIsSerial <em>Is Serial</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getDataFrameSize() <em>Data Frame Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFrameSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize dataFrameSize;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected DataRate bandwidth;

	/**
	 * The default value of the '{@link #isIsSerial() <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSerial() <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerial()
	 * @generated
	 * @ordered
	 */
	protected boolean isSerial = IS_SERIAL_EDEFAULT;

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
	public DataSize getDataFrameSize() {
		return dataFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFrameSize(DataSize newDataFrameSize, NotificationChain msgs) {
		DataSize oldDataFrameSize = dataFrameSize;
		dataFrameSize = newDataFrameSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE, oldDataFrameSize, newDataFrameSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFrameSize(DataSize newDataFrameSize) {
		if (newDataFrameSize != dataFrameSize) {
			NotificationChain msgs = null;
			if (dataFrameSize != null)
				msgs = ((InternalEObject)dataFrameSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE, null, msgs);
			if (newDataFrameSize != null)
				msgs = ((InternalEObject)newDataFrameSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE, null, msgs);
			msgs = basicSetDataFrameSize(newDataFrameSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE, newDataFrameSize, newDataFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBandwidth(DataRate newBandwidth, NotificationChain msgs) {
		DataRate oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH, oldBandwidth, newBandwidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth(DataRate newBandwidth) {
		if (newBandwidth != bandwidth) {
			NotificationChain msgs = null;
			if (bandwidth != null)
				msgs = ((InternalEObject)bandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH, null, msgs);
			if (newBandwidth != null)
				msgs = ((InternalEObject)newBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH, null, msgs);
			msgs = basicSetBandwidth(newBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH, newBandwidth, newBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSerial() {
		return isSerial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSerial(boolean newIsSerial) {
		boolean oldIsSerial = isSerial;
		isSerial = newIsSerial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_PROTOCOL__IS_SERIAL, oldIsSerial, isSerial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE:
				return basicSetDataFrameSize(null, msgs);
			case HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH:
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED:
				return isIsTimeTriggered();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED:
				return isIsEventTriggered();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__FURTHER_INFORMATION:
				return getFurtherInformation();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL:
				return isIsNetworkingProtocol();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE:
				return getDataFrameSize();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH:
				return getBandwidth();
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_SERIAL:
				return isIsSerial();
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE:
				setDataFrameSize((DataSize)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH:
				setBandwidth((DataRate)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_SERIAL:
				setIsSerial((Boolean)newValue);
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE:
				setDataFrameSize((DataSize)null);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH:
				setBandwidth((DataRate)null);
				return;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_SERIAL:
				setIsSerial(IS_SERIAL_EDEFAULT);
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE:
				return dataFrameSize != null;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__BANDWIDTH:
				return bandwidth != null;
			case HwresourcePackage.COMMUNICATION_PROTOCOL__IS_SERIAL:
				return isSerial != IS_SERIAL_EDEFAULT;
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
		result.append(", isSerial: ");
		result.append(isSerial);
		result.append(')');
		return result.toString();
	}

} //CommunicationProtocolImpl

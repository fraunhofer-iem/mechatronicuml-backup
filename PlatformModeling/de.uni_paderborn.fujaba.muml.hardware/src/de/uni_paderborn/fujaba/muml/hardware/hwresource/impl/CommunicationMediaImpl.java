/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationMediaImpl#getDataFrameSize <em>Data Frame Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationMediaImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationMediaImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationMediaImpl#isIsSerial <em>Is Serial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicationMediaImpl extends CommentableElementImpl implements CommunicationMedia {
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
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationProtocol protocol;

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
	protected CommunicationMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.COMMUNICATION_MEDIA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE, oldDataFrameSize, newDataFrameSize);
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
				msgs = ((InternalEObject)dataFrameSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE, null, msgs);
			if (newDataFrameSize != null)
				msgs = ((InternalEObject)newDataFrameSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE, null, msgs);
			msgs = basicSetDataFrameSize(newDataFrameSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE, newDataFrameSize, newDataFrameSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH, oldBandwidth, newBandwidth);
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
				msgs = ((InternalEObject)bandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH, null, msgs);
			if (newBandwidth != null)
				msgs = ((InternalEObject)newBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH, null, msgs);
			msgs = basicSetBandwidth(newBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH, newBandwidth, newBandwidth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwresourcePackage.COMMUNICATION_MEDIA__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_MEDIA__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_MEDIA__IS_SERIAL, oldIsSerial, isSerial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE:
				return basicSetDataFrameSize(null, msgs);
			case HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH:
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
			case HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE:
				return getDataFrameSize();
			case HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH:
				return getBandwidth();
			case HwresourcePackage.COMMUNICATION_MEDIA__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwresourcePackage.COMMUNICATION_MEDIA__IS_SERIAL:
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
			case HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE:
				setDataFrameSize((DataSize)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH:
				setBandwidth((DataRate)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_MEDIA__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_MEDIA__IS_SERIAL:
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
			case HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE:
				setDataFrameSize((DataSize)null);
				return;
			case HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH:
				setBandwidth((DataRate)null);
				return;
			case HwresourcePackage.COMMUNICATION_MEDIA__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwresourcePackage.COMMUNICATION_MEDIA__IS_SERIAL:
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
			case HwresourcePackage.COMMUNICATION_MEDIA__DATA_FRAME_SIZE:
				return dataFrameSize != null;
			case HwresourcePackage.COMMUNICATION_MEDIA__BANDWIDTH:
				return bandwidth != null;
			case HwresourcePackage.COMMUNICATION_MEDIA__PROTOCOL:
				return protocol != null;
			case HwresourcePackage.COMMUNICATION_MEDIA__IS_SERIAL:
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
		result.append(" (isSerial: ");
		result.append(isSerial);
		result.append(')');
		return result.toString();
	}

} //CommunicationMediaImpl

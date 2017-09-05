/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString;
import org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Udp Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.UdpTransportImpl#getLocal_address_str <em>Local address str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UdpTransportImpl extends TransportInstImpl implements UdpTransport {
	/**
	 * The cached value of the '{@link #getLocal_address_str() <em>Local address str</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_address_str()
	 * @generated
	 * @ordered
	 */
	protected LocalAddressString local_address_str;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UdpTransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.UDP_TRANSPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAddressString getLocal_address_str() {
		return local_address_str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal_address_str(LocalAddressString newLocal_address_str,
			NotificationChain msgs) {
		LocalAddressString oldLocal_address_str = local_address_str;
		local_address_str = newLocal_address_str;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR, oldLocal_address_str, newLocal_address_str);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal_address_str(LocalAddressString newLocal_address_str) {
		if (newLocal_address_str != local_address_str) {
			NotificationChain msgs = null;
			if (local_address_str != null)
				msgs = ((InternalEObject) local_address_str).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR, null, msgs);
			if (newLocal_address_str != null)
				msgs = ((InternalEObject) newLocal_address_str).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR, null, msgs);
			msgs = basicSetLocal_address_str(newLocal_address_str, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR,
					newLocal_address_str, newLocal_address_str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR:
			return basicSetLocal_address_str(null, msgs);
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
		case GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR:
			return getLocal_address_str();
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
		case GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR:
			setLocal_address_str((LocalAddressString) newValue);
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
		case GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR:
			setLocal_address_str((LocalAddressString) null);
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
		case GeneratorPackage.UDP_TRANSPORT__LOCAL_ADDRESS_STR:
			return local_address_str != null;
		}
		return super.eIsSet(featureID);
	}

} //UdpTransportImpl

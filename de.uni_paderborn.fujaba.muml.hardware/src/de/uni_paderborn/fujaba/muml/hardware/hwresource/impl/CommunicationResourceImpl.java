/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationResourceImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationResourceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationResourceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.CommunicationResourceImpl#isMultiHWPort <em>Multi HW Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationResourceImpl extends HWPortImpl implements CommunicationResource {
	/**
	 * The default value of the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected static final HWPortKind PORT_KIND_EDEFAULT = HWPortKind.BUS;

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
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The default value of the '{@link #isMultiHWPort() <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHWPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_HW_PORT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.COMMUNICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortKind getPortKind() {
		// TODO: implement this method to return the 'Port Kind' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(HWPortKind newPortKind) {
		// TODO: implement this method to set the 'Port Kind' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiHWPort() {
		// TODO: implement this method to return the 'Multi HW Port' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiHWPort(boolean newMultiHWPort) {
		// TODO: implement this method to set the 'Multi HW Port' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				return getPortKind();
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				return getCardinality();
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				return isMultiHWPort();
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				setPortKind((HWPortKind)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				setMultiHWPort((Boolean)newValue);
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				setPortKind(PORT_KIND_EDEFAULT);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				setMultiHWPort(MULTI_HW_PORT_EDEFAULT);
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				return getPortKind() != PORT_KIND_EDEFAULT;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				return protocol != null;
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				return cardinality != null;
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				return isMultiHWPort() != MULTI_HW_PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationResourceImpl

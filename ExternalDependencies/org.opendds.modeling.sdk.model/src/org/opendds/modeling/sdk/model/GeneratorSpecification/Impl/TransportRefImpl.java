/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportRefImpl#getTransport <em>Transport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportRefImpl extends EObjectImpl implements TransportRef {
	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected TransportInst transport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TRANSPORT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportInst getTransport() {
		if (transport != null && transport.eIsProxy()) {
			InternalEObject oldTransport = (InternalEObject) transport;
			transport = (TransportInst) eResolveProxy(oldTransport);
			if (transport != oldTransport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.TRANSPORT_REF__TRANSPORT,
							oldTransport, transport));
			}
		}
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportInst basicGetTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(TransportInst newTransport) {
		TransportInst oldTransport = transport;
		transport = newTransport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_REF__TRANSPORT,
					oldTransport, transport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.TRANSPORT_REF__TRANSPORT:
			if (resolve)
				return getTransport();
			return basicGetTransport();
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
		case GeneratorPackage.TRANSPORT_REF__TRANSPORT:
			setTransport((TransportInst) newValue);
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
		case GeneratorPackage.TRANSPORT_REF__TRANSPORT:
			setTransport((TransportInst) null);
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
		case GeneratorPackage.TRANSPORT_REF__TRANSPORT:
			return transport != null;
		}
		return super.eIsSet(featureID);
	}

} //TransportRefImpl

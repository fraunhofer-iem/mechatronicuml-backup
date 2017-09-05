/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Transports;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportsImpl#getTransport <em>Transport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportsImpl extends EObjectImpl implements Transports {
	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportInst> transport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TRANSPORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportInst> getTransport() {
		if (transport == null) {
			transport = new EObjectContainmentEList<TransportInst>(TransportInst.class, this,
					GeneratorPackage.TRANSPORTS__TRANSPORT);
		}
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.TRANSPORTS__TRANSPORT:
			return ((InternalEList<?>) getTransport()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.TRANSPORTS__TRANSPORT:
			return getTransport();
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
		case GeneratorPackage.TRANSPORTS__TRANSPORT:
			getTransport().clear();
			getTransport().addAll((Collection<? extends TransportInst>) newValue);
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
		case GeneratorPackage.TRANSPORTS__TRANSPORT:
			getTransport().clear();
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
		case GeneratorPackage.TRANSPORTS__TRANSPORT:
			return transport != null && !transport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransportsImpl

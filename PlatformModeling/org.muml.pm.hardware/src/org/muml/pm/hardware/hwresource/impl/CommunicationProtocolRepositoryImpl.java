/**
 */
package org.muml.pm.hardware.hwresource.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.CommunicationProtocolRepository;
import org.muml.pm.hardware.hwresource.HwresourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Protocol Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolRepositoryImpl#getCommunicationProtocols <em>Communication Protocols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationProtocolRepositoryImpl extends NamedElementImpl implements CommunicationProtocolRepository {
	/**
	 * The cached value of the '{@link #getCommunicationProtocols() <em>Communication Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationProtocol> communicationProtocols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationProtocolRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.COMMUNICATION_PROTOCOL_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationProtocol> getCommunicationProtocols() {
		if (communicationProtocols == null) {
			communicationProtocols = new EObjectContainmentEList<CommunicationProtocol>(CommunicationProtocol.class, this, HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS);
		}
		return communicationProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS:
				return ((InternalEList<?>)getCommunicationProtocols()).basicRemove(otherEnd, msgs);
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS:
				return getCommunicationProtocols();
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS:
				getCommunicationProtocols().clear();
				getCommunicationProtocols().addAll((Collection<? extends CommunicationProtocol>)newValue);
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS:
				getCommunicationProtocols().clear();
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
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS:
				return communicationProtocols != null && !communicationProtocols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationProtocolRepositoryImpl

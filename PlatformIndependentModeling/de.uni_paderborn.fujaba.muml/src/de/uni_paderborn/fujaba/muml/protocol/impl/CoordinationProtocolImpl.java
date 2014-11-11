/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.impl;

import de.uni_paderborn.fujaba.muml.connector.MessageBuffer;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.CoordinationProtocolImpl#getGmfCoordinationProtocol <em>Gmf Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.CoordinationProtocolImpl#getGmfMessageBuffers <em>Gmf Message Buffers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationProtocolImpl extends AbstractCoordinationSpecificationImpl implements CoordinationProtocol {
	/**
	 * The cached setting delegate for the '{@link #getGmfCoordinationProtocol() <em>Gmf Coordination Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfCoordinationProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_COORDINATION_PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.COORDINATION_PROTOCOL__GMF_COORDINATION_PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGmfMessageBuffers() <em>Gmf Message Buffers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfMessageBuffers()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_MESSAGE_BUFFERS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.COORDINATION_PROTOCOL__GMF_MESSAGE_BUFFERS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.COORDINATION_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol getGmfCoordinationProtocol() {
		return (CoordinationProtocol)GMF_COORDINATION_PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmfCoordinationProtocol(CoordinationProtocol newGmfCoordinationProtocol, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Gmf Coordination Protocol' containment reference
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
	@SuppressWarnings("unchecked")
	public EList<MessageBuffer> getGmfMessageBuffers() {
		return (EList<MessageBuffer>)GMF_MESSAGE_BUFFERS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.COORDINATION_PROTOCOL__GMF_COORDINATION_PROTOCOL:
				return basicSetGmfCoordinationProtocol(null, msgs);
			case ProtocolPackage.COORDINATION_PROTOCOL__GMF_MESSAGE_BUFFERS:
				return ((InternalEList<?>)getGmfMessageBuffers()).basicRemove(otherEnd, msgs);
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
			case ProtocolPackage.COORDINATION_PROTOCOL__GMF_COORDINATION_PROTOCOL:
				return getGmfCoordinationProtocol();
			case ProtocolPackage.COORDINATION_PROTOCOL__GMF_MESSAGE_BUFFERS:
				return getGmfMessageBuffers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProtocolPackage.COORDINATION_PROTOCOL__GMF_COORDINATION_PROTOCOL:
				return GMF_COORDINATION_PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolPackage.COORDINATION_PROTOCOL__GMF_MESSAGE_BUFFERS:
				return GMF_MESSAGE_BUFFERS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //CoordinationProtocolImpl

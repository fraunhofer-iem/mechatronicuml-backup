/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointImpl;
import de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.MessageBuffer;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.RoleImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.RoleImpl#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.RoleImpl#isMultiRole <em>Multi Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.RoleImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends DiscreteInteractionEndpointImpl implements Role {
	/**
	 * The cached setting delegate for the '{@link #getRoleConnector() <em>Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleConnector()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROLE_CONNECTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.ROLE__ROLE_CONNECTOR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isMultiRole() <em>Multi Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiRole()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_ROLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.ROLE__MULTI_ROLE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getReceiverMessageBuffer() <em>Receiver Message Buffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBuffer> receiverMessageBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinationSpecification getCoordinationProtocol() {
		if (eContainerFeatureID() != ProtocolPackage.ROLE__COORDINATION_PROTOCOL) return null;
		return (AbstractCoordinationSpecification)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationProtocol(AbstractCoordinationSpecification newCoordinationProtocol, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoordinationProtocol, ProtocolPackage.ROLE__COORDINATION_PROTOCOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocol(AbstractCoordinationSpecification newCoordinationProtocol) {
		if (newCoordinationProtocol != eInternalContainer() || (eContainerFeatureID() != ProtocolPackage.ROLE__COORDINATION_PROTOCOL && newCoordinationProtocol != null)) {
			if (EcoreUtil.isAncestor(this, newCoordinationProtocol))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoordinationProtocol != null)
				msgs = ((InternalEObject)newCoordinationProtocol).eInverseAdd(this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES, AbstractCoordinationSpecification.class, msgs);
			msgs = basicSetCoordinationProtocol(newCoordinationProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE__COORDINATION_PROTOCOL, newCoordinationProtocol, newCoordinationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getRoleConnector() {
		return (RoleConnector)ROLE_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetRoleConnector() {
		return (RoleConnector)ROLE_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiRole() {
		return (Boolean)MULTI_ROLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		if (receiverMessageBuffer == null) {
			receiverMessageBuffer = new EObjectContainmentWithInverseEList<MessageBuffer>(MessageBuffer.class, this, ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER, ProtocolPackage.MESSAGE_BUFFER__ROLE);
		}
		return receiverMessageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationProtocol((AbstractCoordinationSpecification)otherEnd, msgs);
			case ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiverMessageBuffer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				return basicSetCoordinationProtocol(null, msgs);
			case ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<?>)getReceiverMessageBuffer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				return eInternalContainer().eInverseRemove(this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES, AbstractCoordinationSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				return getCoordinationProtocol();
			case ProtocolPackage.ROLE__ROLE_CONNECTOR:
				if (resolve) return getRoleConnector();
				return basicGetRoleConnector();
			case ProtocolPackage.ROLE__MULTI_ROLE:
				return isMultiRole();
			case ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
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
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				setCoordinationProtocol((AbstractCoordinationSpecification)newValue);
				return;
			case ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				getReceiverMessageBuffer().addAll((Collection<? extends MessageBuffer>)newValue);
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
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				setCoordinationProtocol((AbstractCoordinationSpecification)null);
				return;
			case ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
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
			case ProtocolPackage.ROLE__COORDINATION_PROTOCOL:
				return getCoordinationProtocol() != null;
			case ProtocolPackage.ROLE__ROLE_CONNECTOR:
				return ROLE_CONNECTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolPackage.ROLE__MULTI_ROLE:
				return MULTI_ROLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return receiverMessageBuffer != null && !receiverMessageBuffer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl

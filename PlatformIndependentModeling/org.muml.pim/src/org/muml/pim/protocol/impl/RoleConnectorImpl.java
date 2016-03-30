/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.pim.connector.impl.ConnectorImpl;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.protocol.impl.RoleConnectorImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.RoleConnectorImpl#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.RoleConnectorImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleConnectorImpl extends ConnectorImpl implements RoleConnector {
	/**
	 * The cached value of the '{@link #getConnectorQualityOfServiceAssumptions() <em>Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 * @ordered
	 */
	protected ConnectorQualityOfServiceAssumptions connectorQualityOfServiceAssumptions;

	/**
	 * The cached setting delegate for the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.ROLE_CONNECTOR__ROLES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.ROLE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinationSpecification getCoordinationProtocol() {
		if (eContainerFeatureID() != ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL) return null;
		return (AbstractCoordinationSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationProtocol(AbstractCoordinationSpecification newCoordinationProtocol, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoordinationProtocol, ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocol(AbstractCoordinationSpecification newCoordinationProtocol) {
		if (newCoordinationProtocol != eInternalContainer() || (eContainerFeatureID() != ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL && newCoordinationProtocol != null)) {
			if (EcoreUtil.isAncestor(this, newCoordinationProtocol))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoordinationProtocol != null)
				msgs = ((InternalEObject)newCoordinationProtocol).eInverseAdd(this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR, AbstractCoordinationSpecification.class, msgs);
			msgs = basicSetCoordinationProtocol(newCoordinationProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL, newCoordinationProtocol, newCoordinationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptions getConnectorQualityOfServiceAssumptions() {
		return connectorQualityOfServiceAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions newConnectorQualityOfServiceAssumptions, NotificationChain msgs) {
		ConnectorQualityOfServiceAssumptions oldConnectorQualityOfServiceAssumptions = connectorQualityOfServiceAssumptions;
		connectorQualityOfServiceAssumptions = newConnectorQualityOfServiceAssumptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, oldConnectorQualityOfServiceAssumptions, newConnectorQualityOfServiceAssumptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions newConnectorQualityOfServiceAssumptions) {
		if (newConnectorQualityOfServiceAssumptions != connectorQualityOfServiceAssumptions) {
			NotificationChain msgs = null;
			if (connectorQualityOfServiceAssumptions != null)
				msgs = ((InternalEObject)connectorQualityOfServiceAssumptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, null, msgs);
			if (newConnectorQualityOfServiceAssumptions != null)
				msgs = ((InternalEObject)newConnectorQualityOfServiceAssumptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, null, msgs);
			msgs = basicSetConnectorQualityOfServiceAssumptions(newConnectorQualityOfServiceAssumptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, newConnectorQualityOfServiceAssumptions, newConnectorQualityOfServiceAssumptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)ROLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationProtocol((AbstractCoordinationSpecification)otherEnd, msgs);
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
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				return basicSetCoordinationProtocol(null, msgs);
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return basicSetConnectorQualityOfServiceAssumptions(null, msgs);
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
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				return eInternalContainer().eInverseRemove(this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR, AbstractCoordinationSpecification.class, msgs);
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
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				return getCoordinationProtocol();
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return getConnectorQualityOfServiceAssumptions();
			case ProtocolPackage.ROLE_CONNECTOR__ROLES:
				return getRoles();
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
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				setCoordinationProtocol((AbstractCoordinationSpecification)newValue);
				return;
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				setConnectorQualityOfServiceAssumptions((ConnectorQualityOfServiceAssumptions)newValue);
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
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				setCoordinationProtocol((AbstractCoordinationSpecification)null);
				return;
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				setConnectorQualityOfServiceAssumptions((ConnectorQualityOfServiceAssumptions)null);
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
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				return getCoordinationProtocol() != null;
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return connectorQualityOfServiceAssumptions != null;
			case ProtocolPackage.ROLE_CONNECTOR__ROLES:
				return ROLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //RoleConnectorImpl

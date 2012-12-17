/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.protocol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl;
import de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.model.protocol.Role;
import de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleConnectorImpl extends BehavioralElementImpl implements RoleConnector {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Role source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Role target;

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
	public Role getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Role)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.ROLE_CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Role newSource, NotificationChain msgs) {
		Role oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Role newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ProtocolPackage.ROLE__OUTGOING_ROLE_CONNECTOR, Role.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ProtocolPackage.ROLE__OUTGOING_ROLE_CONNECTOR, Role.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Role)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.ROLE_CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Role newTarget, NotificationChain msgs) {
		Role oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Role newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ProtocolPackage.ROLE__INCOMING_ROLE_CONNECTOR, Role.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ProtocolPackage.ROLE__INCOMING_ROLE_CONNECTOR, Role.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ROLE_CONNECTOR__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol getCoordinationProtocol() {
		if (eContainerFeatureID() != ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL) return null;
		return (CoordinationProtocol)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationProtocol(CoordinationProtocol newCoordinationProtocol, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoordinationProtocol, ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocol(CoordinationProtocol newCoordinationProtocol) {
		if (newCoordinationProtocol != eInternalContainer() || (eContainerFeatureID() != ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL && newCoordinationProtocol != null)) {
			if (EcoreUtil.isAncestor(this, newCoordinationProtocol))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoordinationProtocol != null)
				msgs = ((InternalEObject)newCoordinationProtocol).eInverseAdd(this, ProtocolPackage.COORDINATION_PROTOCOL__ROLE_CONNECTOR, CoordinationProtocol.class, msgs);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.ROLE_CONNECTOR__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ProtocolPackage.ROLE__OUTGOING_ROLE_CONNECTOR, Role.class, msgs);
				return basicSetSource((Role)otherEnd, msgs);
			case ProtocolPackage.ROLE_CONNECTOR__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ProtocolPackage.ROLE__INCOMING_ROLE_CONNECTOR, Role.class, msgs);
				return basicSetTarget((Role)otherEnd, msgs);
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationProtocol((CoordinationProtocol)otherEnd, msgs);
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
			case ProtocolPackage.ROLE_CONNECTOR__SOURCE:
				return basicSetSource(null, msgs);
			case ProtocolPackage.ROLE_CONNECTOR__TARGET:
				return basicSetTarget(null, msgs);
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
				return eInternalContainer().eInverseRemove(this, ProtocolPackage.COORDINATION_PROTOCOL__ROLE_CONNECTOR, CoordinationProtocol.class, msgs);
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
			case ProtocolPackage.ROLE_CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ProtocolPackage.ROLE_CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				return getCoordinationProtocol();
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return getConnectorQualityOfServiceAssumptions();
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
			case ProtocolPackage.ROLE_CONNECTOR__SOURCE:
				setSource((Role)newValue);
				return;
			case ProtocolPackage.ROLE_CONNECTOR__TARGET:
				setTarget((Role)newValue);
				return;
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				setCoordinationProtocol((CoordinationProtocol)newValue);
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
			case ProtocolPackage.ROLE_CONNECTOR__SOURCE:
				setSource((Role)null);
				return;
			case ProtocolPackage.ROLE_CONNECTOR__TARGET:
				setTarget((Role)null);
				return;
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				setCoordinationProtocol((CoordinationProtocol)null);
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
			case ProtocolPackage.ROLE_CONNECTOR__SOURCE:
				return source != null;
			case ProtocolPackage.ROLE_CONNECTOR__TARGET:
				return target != null;
			case ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL:
				return getCoordinationProtocol() != null;
			case ProtocolPackage.ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return connectorQualityOfServiceAssumptions != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleConnectorImpl

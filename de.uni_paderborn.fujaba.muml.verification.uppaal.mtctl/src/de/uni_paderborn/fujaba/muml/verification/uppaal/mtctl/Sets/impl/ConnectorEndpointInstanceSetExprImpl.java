/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Endpoint Instance Set Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.ConnectorEndpointInstanceSetExprImpl#getConnectorEndpoint <em>Connector Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorEndpointInstanceSetExprImpl extends SetExprImpl implements ConnectorEndpointInstanceSetExpr {
	/**
	 * The cached value of the '{@link #getConnectorEndpoint() <em>Connector Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEndpoint()
	 * @generated
	 * @ordered
	 */
	protected MapExpr connectorEndpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndpointInstanceSetExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetsPackage.Literals.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExpr getConnectorEndpoint() {
		return connectorEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorEndpoint(MapExpr newConnectorEndpoint, NotificationChain msgs) {
		MapExpr oldConnectorEndpoint = connectorEndpoint;
		connectorEndpoint = newConnectorEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT, oldConnectorEndpoint, newConnectorEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorEndpoint(MapExpr newConnectorEndpoint) {
		if (newConnectorEndpoint != connectorEndpoint) {
			NotificationChain msgs = null;
			if (connectorEndpoint != null)
				msgs = ((InternalEObject)connectorEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT, null, msgs);
			if (newConnectorEndpoint != null)
				msgs = ((InternalEObject)newConnectorEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT, null, msgs);
			msgs = basicSetConnectorEndpoint(newConnectorEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT, newConnectorEndpoint, newConnectorEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT:
				return basicSetConnectorEndpoint(null, msgs);
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
			case SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT:
				return getConnectorEndpoint();
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
			case SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT:
				setConnectorEndpoint((MapExpr)newValue);
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
			case SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT:
				setConnectorEndpoint((MapExpr)null);
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
			case SetsPackage.CONNECTOR_ENDPOINT_INSTANCE_SET_EXPR__CONNECTOR_ENDPOINT:
				return connectorEndpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorEndpointInstanceSetExprImpl

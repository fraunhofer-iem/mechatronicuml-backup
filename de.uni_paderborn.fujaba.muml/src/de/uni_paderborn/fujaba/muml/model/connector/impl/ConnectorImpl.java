/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.connector.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.model.connector.Connector;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.connector.impl.ConnectorImpl#getConnectorEndpoints <em>Connector Endpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectorImpl extends CommentableElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getConnectorEndpoints() <em>Connector Endpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEndpoint> connectorEndpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectorPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEndpoint> getConnectorEndpoints() {
		if (connectorEndpoints == null) {
			connectorEndpoints = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorEndpoint>(ConnectorEndpoint.class, this, ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS, ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS);
		}
		return connectorEndpoints;
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
			case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorEndpoints()).basicAdd(otherEnd, msgs);
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
			case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS:
				return ((InternalEList<?>)getConnectorEndpoints()).basicRemove(otherEnd, msgs);
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
			case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS:
				return getConnectorEndpoints();
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
			case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS:
				getConnectorEndpoints().clear();
				getConnectorEndpoints().addAll((Collection<? extends ConnectorEndpoint>)newValue);
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
			case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS:
				getConnectorEndpoints().clear();
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
			case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS:
				return connectorEndpoints != null && !connectorEndpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl

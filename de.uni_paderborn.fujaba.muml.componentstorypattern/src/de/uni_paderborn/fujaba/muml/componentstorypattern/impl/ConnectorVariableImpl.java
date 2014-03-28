/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable;
import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl#getConnectorEndpoints <em>Connector Endpoints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl#isSelfConnector <em>Self Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ConnectorVariableImpl#getPortVariables <em>Port Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectorVariableImpl extends ComponentStoryPatternVariableImpl implements ConnectorVariable {
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
	 * The cached setting delegate for the '{@link #isSelfConnector() <em>Self Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfConnector()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SELF_CONNECTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ConnectorPackage.Literals.CONNECTOR__SELF_CONNECTOR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPortVariables() <em>Port Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortVariables()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_VARIABLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentstorypatternPackage.Literals.CONNECTOR_VARIABLE__PORT_VARIABLES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.CONNECTOR_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEndpoint> getConnectorEndpoints() {
		if (connectorEndpoints == null) {
			connectorEndpoints = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorEndpoint>(ConnectorEndpoint.class, this, ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS, ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS);
		}
		return connectorEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfConnector() {
		return (Boolean)SELF_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortVariable> getPortVariables() {
		return (EList<PortVariable>)PORT_VARIABLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS:
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
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS:
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
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS:
				return getConnectorEndpoints();
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__SELF_CONNECTOR:
				return isSelfConnector();
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__PORT_VARIABLES:
				return getPortVariables();
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
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS:
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
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS:
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
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS:
				return connectorEndpoints != null && !connectorEndpoints.isEmpty();
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__SELF_CONNECTOR:
				return SELF_CONNECTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentstorypatternPackage.CONNECTOR_VARIABLE__PORT_VARIABLES:
				return PORT_VARIABLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				case ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS: return ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;
				case ComponentstorypatternPackage.CONNECTOR_VARIABLE__SELF_CONNECTOR: return ConnectorPackage.CONNECTOR__SELF_CONNECTOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS: return ComponentstorypatternPackage.CONNECTOR_VARIABLE__CONNECTOR_ENDPOINTS;
				case ConnectorPackage.CONNECTOR__SELF_CONNECTOR: return ComponentstorypatternPackage.CONNECTOR_VARIABLE__SELF_CONNECTOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorVariableImpl

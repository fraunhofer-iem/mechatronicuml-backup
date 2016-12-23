/**
 */
package org.muml.reconfiguration.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.Port;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.types.DataType;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.ConnectorVariable;
import org.muml.reconfiguration.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PortVariableImpl#getConnectorVariables <em>Connector Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortVariableImpl extends ComponentStoryPatternVariableImpl implements PortVariable {
	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The cached setting delegate for the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentstorypatternPackage.Literals.PORT_VARIABLE__PORT_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectorVariables() <em>Connector Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorVariables()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTOR_VARIABLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentstorypatternPackage.Literals.PORT_VARIABLE__CONNECTOR_VARIABLES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.PORT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this, ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS, ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortType() {
		return (Port)PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortType() {
		return (Port)PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectorVariable> getConnectorVariables() {
		return (EList<ConnectorVariable>)CONNECTOR_VARIABLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS:
				return getConnectors();
			case ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ComponentstorypatternPackage.PORT_VARIABLE__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTOR_VARIABLES:
				return getConnectorVariables();
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
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE:
				setDataType((DataType)newValue);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS:
				getConnectors().clear();
				return;
			case ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE:
				setDataType((DataType)null);
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
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE:
				return dataType != null;
			case ComponentstorypatternPackage.PORT_VARIABLE__PORT_TYPE:
				return PORT_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTOR_VARIABLES:
				return CONNECTOR_VARIABLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == ConnectorEndpoint.class) {
			switch (derivedFeatureID) {
				case ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS: return ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == TypedNamedElement.class) {
			switch (derivedFeatureID) {
				case ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE: return BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE;
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
		if (baseClass == ConnectorEndpoint.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS: return ComponentstorypatternPackage.PORT_VARIABLE__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == TypedNamedElement.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE: return ComponentstorypatternPackage.PORT_VARIABLE__DATA_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PortVariableImpl

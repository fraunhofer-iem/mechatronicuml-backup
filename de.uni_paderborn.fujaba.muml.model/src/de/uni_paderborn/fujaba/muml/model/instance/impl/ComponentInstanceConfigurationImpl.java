/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getParentPortInstancesDerived <em>Parent Port Instances Derived</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceConfigurationImpl extends ExtendableElementImpl implements ComponentInstanceConfiguration {
	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * The cached value of the '{@link #getConnectorInstances() <em>Connector Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> connectorInstances;

	/**
	 * The cached setting delegate for the '{@link #getParentPortInstancesDerived() <em>Parent Port Instances Derived</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPortInstancesDerived()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARENT_PORT_INSTANCES_DERIVED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES_DERIVED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getConnectorInstances() {
		if (connectorInstances == null) {
			connectorInstances = new EObjectContainmentEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES);
		}
		return connectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortInstance> getParentPortInstancesDerived() {
		return (EList<PortInstance>)PARENT_PORT_INSTANCES_DERIVED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentPortInstancesDerived() {
		return PARENT_PORT_INSTANCES_DERIVED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getParentPortInstances() {
		if(eContainer() instanceof ComponentInstance){
			return ((ComponentInstance)eContainer()).getPortInstances();
		}
		return new org.eclipse.emf.common.util.BasicEList<PortInstance>();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getConnectorInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return getComponentInstances();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				return getConnectorInstances();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES_DERIVED:
				return getParentPortInstancesDerived();
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				getConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				return connectorInstances != null && !connectorInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES_DERIVED:
				return isSetParentPortInstancesDerived();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstanceConfigurationImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CorePackage;
import org.storydriven.core.NamedElement;
import org.storydriven.core.impl.CommentableElementImpl;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getParentPortInstances <em>Parent Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceConfigurationImpl extends CommentableElementImpl implements ComponentInstanceConfiguration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #getParentPortInstances() <em>Parent Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARENT_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES).getSettingDelegate();

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME, oldName, name));
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
	public EList<PortInstance> getParentPortInstances() {
		return (EList<PortInstance>)PARENT_PORT_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentPortInstances() {
		return PARENT_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				return ((InternalEList<?>)getParentPortInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME:
				return getName();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return getComponentInstances();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				return getConnectorInstances();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				return getParentPortInstances();
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES:
				return connectorInstances != null && !connectorInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				return isSetParentPortInstances();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME: return CorePackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceConfigurationImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.umlrt.model.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.umlrt.model.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Component Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getComponentNameDerived <em>Component Name Derived</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getEmbeddedInstances <em>Embedded Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getComponentPart <em>Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends NamedElementImpl implements
		ComponentInstance {
	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected Component componentType;

	/**
	 * The cached setting delegate for the '{@link #getComponentNameDerived() <em>Component Name Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNameDerived()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COMPONENT_NAME_DERIVED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_NAME_DERIVED).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getEmbeddedInstances() <em>Embedded Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> embeddedInstances;

	/**
	 * @generated NOT
	 */
	private static final String COMPONENT_NAME_DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstances;

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
	 * The cached value of the '{@link #getComponentPart() <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPart()
	 * @generated
	 * @ordered
	 */
	protected ComponentPart componentPart;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ComponentInstanceImpl() {
		super();

		// Install a notification adapter that informs the
		// componentNameDerived-reference, whenever one of the dependent
		// features
		// was modified
		DerivedAttributeAdapter componentNameDerived = new DerivedAttributeAdapter(
				this,
				InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_NAME_DERIVED,
				Notification.SET);
		componentNameDerived.addNavigatedDependency(
				InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE,
				SDMPackage.Literals.NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (Component)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(Component newComponentType,
			NotificationChain msgs) {
		Component oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, newComponentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Component newComponentType) {
		if (newComponentType != componentType) {
			NotificationChain msgs = null;
			if (componentType != null)
				msgs = ((InternalEObject)componentType).eInverseRemove(this, ComponentPackage.COMPONENT__COMPONENT_INSTANCES, Component.class, msgs);
			if (newComponentType != null)
				msgs = ((InternalEObject)newComponentType).eInverseAdd(this, ComponentPackage.COMPONENT__COMPONENT_INSTANCES, Component.class, msgs);
			msgs = basicSetComponentType(newComponentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, newComponentType, newComponentType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentNameDerived() {
		return (String)COMPONENT_NAME_DERIVED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComponentNameDerived() {
		return COMPONENT_NAME_DERIVED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getEmbeddedInstances() {
		if (embeddedInstances == null) {
			embeddedInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES);
		}
		return embeddedInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getPortInstances() {
		if (portInstances == null) {
			portInstances = new EObjectContainmentWithInverseEList<PortInstance>(PortInstance.class, this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE);
		}
		return portInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getConnectorInstances() {
		if (connectorInstances == null) {
			connectorInstances = new EObjectContainmentWithInverseEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE);
		}
		return connectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart getComponentPart() {
		if (componentPart != null && componentPart.eIsProxy()) {
			InternalEObject oldComponentPart = (InternalEObject)componentPart;
			componentPart = (ComponentPart)eResolveProxy(oldComponentPart);
			if (componentPart != oldComponentPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART, oldComponentPart, componentPart));
			}
		}
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart basicGetComponentPart() {
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPart(ComponentPart newComponentPart) {
		ComponentPart oldComponentPart = componentPart;
		componentPart = newComponentPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART, oldComponentPart, componentPart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (componentType != null)
					msgs = ((InternalEObject)componentType).eInverseRemove(this, ComponentPackage.COMPONENT__COMPONENT_INSTANCES, Component.class, msgs);
				return basicSetComponentType((Component)otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortInstances()).basicAdd(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorInstances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				return ((InternalEList<?>)getEmbeddedInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return ((InternalEList<?>)getPortInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getConnectorInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_NAME_DERIVED:
				return getComponentNameDerived();
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				return getEmbeddedInstances();
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return getConnectorInstances();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				if (resolve) return getComponentPart();
				return basicGetComponentPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				getEmbeddedInstances().clear();
				getEmbeddedInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				getPortInstances().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				getConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				setComponentPart((ComponentPart)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				getEmbeddedInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				setComponentPart((ComponentPart)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return componentType != null;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_NAME_DERIVED:
				return isSetComponentNameDerived();
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				return embeddedInstances != null && !embeddedInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return connectorInstances != null && !connectorInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				return componentPart != null;
		}
		return super.eIsSet(featureID);
	}

} // ComponentInstanceImpl

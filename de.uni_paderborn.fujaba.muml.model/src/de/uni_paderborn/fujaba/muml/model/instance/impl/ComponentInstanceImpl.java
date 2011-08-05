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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl#getBehaviorInstance <em>Behavior Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl#getBehavioralElementType <em>Behavioral Element Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl#getEmbeddedInstances <em>Embedded Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends NamedElementImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getBehaviorInstance() <em>Behavior Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorInstance> behaviorInstance;

	/**
	 * The cached value of the '{@link #getBehavioralElementType() <em>Behavioral Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElementType()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElementType;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected Component componentType;

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
	 * The cached value of the '{@link #getConnectorInstances() <em>Connector Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> connectorInstances;

	/**
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorInstance> getBehaviorInstance() {
		if (behaviorInstance == null) {
			behaviorInstance = new EObjectContainmentWithInverseEList<BehaviorInstance>(BehaviorInstance.class, this, InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE);
		}
		return behaviorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehavioralElementType() {
		if (behavioralElementType != null && behavioralElementType.eIsProxy()) {
			InternalEObject oldBehavioralElementType = (InternalEObject)behavioralElementType;
			behavioralElementType = (BehavioralElement)eResolveProxy(oldBehavioralElementType);
			if (behavioralElementType != oldBehavioralElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
			}
		}
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement basicGetBehavioralElementType() {
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElementType(BehavioralElement newBehavioralElementType) {
		BehavioralElement oldBehavioralElementType = behavioralElementType;
		behavioralElementType = newBehavioralElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Component newComponentType) {
		Component oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviorInstance()).basicAdd(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorInstances()).basicAdd(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortInstances()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE:
				return ((InternalEList<?>)getBehaviorInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				return ((InternalEList<?>)getEmbeddedInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getConnectorInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return ((InternalEList<?>)getPortInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE:
				return getBehaviorInstance();
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				if (resolve) return getBehavioralElementType();
				return basicGetBehavioralElementType();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				return getEmbeddedInstances();
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return getConnectorInstances();
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
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
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE:
				getBehaviorInstance().clear();
				getBehaviorInstance().addAll((Collection<? extends BehaviorInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				getEmbeddedInstances().clear();
				getEmbeddedInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				getConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				getPortInstances().addAll((Collection<? extends PortInstance>)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE:
				getBehaviorInstance().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				getEmbeddedInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
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
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE:
				return behaviorInstance != null && !behaviorInstance.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				return behavioralElementType != null;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return componentType != null;
			case InstancePackage.COMPONENT_INSTANCE__EMBEDDED_INSTANCES:
				return embeddedInstances != null && !embeddedInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES:
				return connectorInstances != null && !connectorInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
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
		if (baseClass == BehavioralElementInstance.class) {
			switch (derivedFeatureID) {
				case InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE;
				case InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
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
		if (baseClass == BehavioralElementInstance.class) {
			switch (baseFeatureID) {
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE: return InstancePackage.COMPONENT_INSTANCE__BEHAVIOR_INSTANCE;
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.COMPONENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentInstanceImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.runnable.Label;
import org.muml.pim.runnable.RunnablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#getParentCIC <em>Parent CIC</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#isTopLevel <em>Top Level</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.ComponentInstanceImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentInstanceImpl extends NamedElementImpl implements ComponentInstance {
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
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstances;

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
	 * The cached setting delegate for the '{@link #isTopLevel() <em>Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTopLevel()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TOP_LEVEL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.COMPONENT_INSTANCE__TOP_LEVEL).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRunnables() <em>Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<org.muml.pim.runnable.Runnable> runnables;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentInstanceImpl() {
		super();
//		DerivedAttributeAdapter derivedAdapter = new DerivedAttributeAdapter(this, InstancePackage.Literals.COMPONENT_INSTANCE__DIRECT_PORT_INSTANCES);
//		derivedAdapter.addLocalDependency(InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getParentCIC() {
		if (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__PARENT_CIC) return null;
		return (ComponentInstanceConfiguration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCIC(ComponentInstanceConfiguration newParentCIC, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCIC, InstancePackage.COMPONENT_INSTANCE__PARENT_CIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCIC(ComponentInstanceConfiguration newParentCIC) {
		if (newParentCIC != eInternalContainer() || (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__PARENT_CIC && newParentCIC != null)) {
			if (EcoreUtil.isAncestor(this, newParentCIC))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCIC != null)
				msgs = ((InternalEObject)newParentCIC).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES, ComponentInstanceConfiguration.class, msgs);
			msgs = basicSetParentCIC(newParentCIC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__PARENT_CIC, newParentCIC, newParentCIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTopLevel() {
		return (Boolean)TOP_LEVEL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.muml.pim.runnable.Runnable> getRunnables() {
		if (runnables == null) {
			runnables = new EObjectWithInverseResolvingEList<org.muml.pim.runnable.Runnable>(org.muml.pim.runnable.Runnable.class, this, InstancePackage.COMPONENT_INSTANCE__RUNNABLES, RunnablePackage.RUNNABLE__COMPONENT_INSTANCE);
		}
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectWithInverseResolvingEList<Label>(Label.class, this, InstancePackage.COMPONENT_INSTANCE__LABELS, RunnablePackage.LABEL__COMPONENT_INSTANCE);
		}
		return labels;
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
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortInstances()).basicAdd(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCIC((ComponentInstanceConfiguration)otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__RUNNABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunnables()).basicAdd(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return ((InternalEList<?>)getPortInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				return basicSetParentCIC(null, msgs);
			case InstancePackage.COMPONENT_INSTANCE__RUNNABLES:
				return ((InternalEList<?>)getRunnables()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES, ComponentInstanceConfiguration.class, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				if (resolve) return getComponentPart();
				return basicGetComponentPart();
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				return getParentCIC();
			case InstancePackage.COMPONENT_INSTANCE__TOP_LEVEL:
				return isTopLevel();
			case InstancePackage.COMPONENT_INSTANCE__RUNNABLES:
				return getRunnables();
			case InstancePackage.COMPONENT_INSTANCE__LABELS:
				return getLabels();
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				getPortInstances().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				setComponentPart((ComponentPart)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				setParentCIC((ComponentInstanceConfiguration)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__RUNNABLES:
				getRunnables().clear();
				getRunnables().addAll((Collection<? extends org.muml.pim.runnable.Runnable>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				setComponentPart((ComponentPart)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				setParentCIC((ComponentInstanceConfiguration)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__RUNNABLES:
				getRunnables().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__LABELS:
				getLabels().clear();
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return componentType != null;
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_PART:
				return componentPart != null;
			case InstancePackage.COMPONENT_INSTANCE__PARENT_CIC:
				return getParentCIC() != null;
			case InstancePackage.COMPONENT_INSTANCE__TOP_LEVEL:
				return TOP_LEVEL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.COMPONENT_INSTANCE__RUNNABLES:
				return runnables != null && !runnables.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstanceImpl

/**
 */
package org.muml.psm.muml_container.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.core.impl.NamedElementImpl;

import org.muml.pim.component.Component;

import org.muml.pim.instance.ComponentInstance;

import org.muml.psm.muml_container.ComponentContainer;
import org.muml.psm.muml_container.ContainerComponentInstanceConfiguration;
import org.muml.psm.muml_container.ECUConfiguration;
import org.muml.psm.muml_container.Muml_containerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.ComponentContainerImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.ComponentContainerImpl#getComponentInstanceConfigurations <em>Component Instance Configurations</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.ComponentContainerImpl#getEcuConfiguration <em>Ecu Configuration</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.ComponentContainerImpl#getComponentInstances <em>Component Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentContainerImpl extends NamedElementImpl implements ComponentContainer {
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
	 * The cached value of the '{@link #getComponentInstanceConfigurations() <em>Component Instance Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerComponentInstanceConfiguration> componentInstanceConfigurations;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.COMPONENT_CONTAINER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_TYPE, oldComponentType, componentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerComponentInstanceConfiguration> getComponentInstanceConfigurations() {
		if (componentInstanceConfigurations == null) {
			componentInstanceConfigurations = new EObjectContainmentEList<ContainerComponentInstanceConfiguration>(ContainerComponentInstanceConfiguration.class, this, Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS);
		}
		return componentInstanceConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUConfiguration getEcuConfiguration() {
		if (eContainerFeatureID() != Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION) return null;
		return (ECUConfiguration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcuConfiguration(ECUConfiguration newEcuConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEcuConfiguration, Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcuConfiguration(ECUConfiguration newEcuConfiguration) {
		if (newEcuConfiguration != eInternalContainer() || (eContainerFeatureID() != Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION && newEcuConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newEcuConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEcuConfiguration != null)
				msgs = ((InternalEObject)newEcuConfiguration).eInverseAdd(this, Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS, ECUConfiguration.class, msgs);
			msgs = basicSetEcuConfiguration(newEcuConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION, newEcuConfiguration, newEcuConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEcuConfiguration((ECUConfiguration)otherEnd, msgs);
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
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS:
				return ((InternalEList<?>)getComponentInstanceConfigurations()).basicRemove(otherEnd, msgs);
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				return basicSetEcuConfiguration(null, msgs);
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
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				return eInternalContainer().eInverseRemove(this, Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS, ECUConfiguration.class, msgs);
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
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS:
				return getComponentInstanceConfigurations();
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				return getEcuConfiguration();
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCES:
				return getComponentInstances();
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
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS:
				getComponentInstanceConfigurations().clear();
				getComponentInstanceConfigurations().addAll((Collection<? extends ContainerComponentInstanceConfiguration>)newValue);
				return;
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				setEcuConfiguration((ECUConfiguration)newValue);
				return;
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
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
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS:
				getComponentInstanceConfigurations().clear();
				return;
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				setEcuConfiguration((ECUConfiguration)null);
				return;
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCES:
				getComponentInstances().clear();
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
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_TYPE:
				return componentType != null;
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS:
				return componentInstanceConfigurations != null && !componentInstanceConfigurations.isEmpty();
			case Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION:
				return getEcuConfiguration() != null;
			case Muml_containerPackage.COMPONENT_CONTAINER__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentContainerImpl

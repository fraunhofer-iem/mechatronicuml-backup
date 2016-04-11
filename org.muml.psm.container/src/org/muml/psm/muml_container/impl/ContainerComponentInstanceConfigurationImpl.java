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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.pim.instance.ComponentInstance;

import org.muml.psm.muml_container.ContainerComponentInstanceConfiguration;
import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Component Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.ContainerComponentInstanceConfigurationImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.ContainerComponentInstanceConfigurationImpl#getPortInstanceConfigurations <em>Port Instance Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerComponentInstanceConfigurationImpl extends MinimalEObjectImpl.Container implements ContainerComponentInstanceConfiguration {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

	/**
	 * The cached value of the '{@link #getPortInstanceConfigurations() <em>Port Instance Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstanceConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstanceConfiguration> portInstanceConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerComponentInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject)componentInstance;
			componentInstance = (ComponentInstance)eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstanceConfiguration> getPortInstanceConfigurations() {
		if (portInstanceConfigurations == null) {
			portInstanceConfigurations = new EObjectContainmentEList<PortInstanceConfiguration>(PortInstanceConfiguration.class, this, Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS);
		}
		return portInstanceConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				return ((InternalEList<?>)getPortInstanceConfigurations()).basicRemove(otherEnd, msgs);
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
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				return getPortInstanceConfigurations();
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
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				getPortInstanceConfigurations().clear();
				getPortInstanceConfigurations().addAll((Collection<? extends PortInstanceConfiguration>)newValue);
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
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				getPortInstanceConfigurations().clear();
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
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE:
				return componentInstance != null;
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				return portInstanceConfigurations != null && !portInstanceConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerComponentInstanceConfigurationImpl

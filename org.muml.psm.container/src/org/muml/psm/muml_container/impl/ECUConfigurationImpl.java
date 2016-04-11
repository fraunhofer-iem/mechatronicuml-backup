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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.core.impl.NamedElementImpl;

import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

import org.muml.psm.muml_container.ComponentContainer;
import org.muml.psm.muml_container.ECUConfiguration;
import org.muml.psm.muml_container.Muml_containerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECU Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.ECUConfigurationImpl#getStructuredResourceInstance <em>Structured Resource Instance</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.ECUConfigurationImpl#getComponentContainers <em>Component Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECUConfigurationImpl extends NamedElementImpl implements ECUConfiguration {
	/**
	 * The cached value of the '{@link #getStructuredResourceInstance() <em>Structured Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected StructuredResourceInstance structuredResourceInstance;

	/**
	 * The cached value of the '{@link #getComponentContainers() <em>Component Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentContainer> componentContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECUConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.ECU_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getStructuredResourceInstance() {
		if (structuredResourceInstance != null && structuredResourceInstance.eIsProxy()) {
			InternalEObject oldStructuredResourceInstance = (InternalEObject)structuredResourceInstance;
			structuredResourceInstance = (StructuredResourceInstance)eResolveProxy(oldStructuredResourceInstance);
			if (structuredResourceInstance != oldStructuredResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE, oldStructuredResourceInstance, structuredResourceInstance));
			}
		}
		return structuredResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance basicGetStructuredResourceInstance() {
		return structuredResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredResourceInstance(StructuredResourceInstance newStructuredResourceInstance) {
		StructuredResourceInstance oldStructuredResourceInstance = structuredResourceInstance;
		structuredResourceInstance = newStructuredResourceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE, oldStructuredResourceInstance, structuredResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentContainer> getComponentContainers() {
		if (componentContainers == null) {
			componentContainers = new EObjectContainmentWithInverseEList<ComponentContainer>(ComponentContainer.class, this, Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS, Muml_containerPackage.COMPONENT_CONTAINER__ECU_CONFIGURATION);
		}
		return componentContainers;
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
			case Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentContainers()).basicAdd(otherEnd, msgs);
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
			case Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS:
				return ((InternalEList<?>)getComponentContainers()).basicRemove(otherEnd, msgs);
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
			case Muml_containerPackage.ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE:
				if (resolve) return getStructuredResourceInstance();
				return basicGetStructuredResourceInstance();
			case Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS:
				return getComponentContainers();
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
			case Muml_containerPackage.ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE:
				setStructuredResourceInstance((StructuredResourceInstance)newValue);
				return;
			case Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS:
				getComponentContainers().clear();
				getComponentContainers().addAll((Collection<? extends ComponentContainer>)newValue);
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
			case Muml_containerPackage.ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE:
				setStructuredResourceInstance((StructuredResourceInstance)null);
				return;
			case Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS:
				getComponentContainers().clear();
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
			case Muml_containerPackage.ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE:
				return structuredResourceInstance != null;
			case Muml_containerPackage.ECU_CONFIGURATION__COMPONENT_CONTAINERS:
				return componentContainers != null && !componentContainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ECUConfigurationImpl

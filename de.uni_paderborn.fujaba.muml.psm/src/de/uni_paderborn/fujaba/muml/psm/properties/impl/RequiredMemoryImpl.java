/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;

import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.muml.psm.properties.RequiredMemory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.impl.ExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.RequiredMemoryImpl#getRequiredMemory <em>Required Memory</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.RequiredMemoryImpl#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredMemoryImpl extends ExtensionImpl implements RequiredMemory {
	/**
	 * The cached value of the '{@link #getRequiredMemory() <em>Required Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMemory()
	 * @generated
	 * @ordered
	 */
	protected DataSize requiredMemory;

	/**
	 * The cached value of the '{@link #getResourceInstance() <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected StructuredResourceInstance resourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.REQUIRED_MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getRequiredMemory() {
		if (requiredMemory != null && requiredMemory.eIsProxy()) {
			InternalEObject oldRequiredMemory = (InternalEObject)requiredMemory;
			requiredMemory = (DataSize)eResolveProxy(oldRequiredMemory);
			if (requiredMemory != oldRequiredMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.REQUIRED_MEMORY__REQUIRED_MEMORY, oldRequiredMemory, requiredMemory));
			}
		}
		return requiredMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize basicGetRequiredMemory() {
		return requiredMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMemory(DataSize newRequiredMemory) {
		DataSize oldRequiredMemory = requiredMemory;
		requiredMemory = newRequiredMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.REQUIRED_MEMORY__REQUIRED_MEMORY, oldRequiredMemory, requiredMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getResourceInstance() {
		if (resourceInstance != null && resourceInstance.eIsProxy()) {
			InternalEObject oldResourceInstance = (InternalEObject)resourceInstance;
			resourceInstance = (StructuredResourceInstance)eResolveProxy(oldResourceInstance);
			if (resourceInstance != oldResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.REQUIRED_MEMORY__RESOURCE_INSTANCE, oldResourceInstance, resourceInstance));
			}
		}
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance basicGetResourceInstance() {
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInstance(StructuredResourceInstance newResourceInstance) {
		StructuredResourceInstance oldResourceInstance = resourceInstance;
		resourceInstance = newResourceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.REQUIRED_MEMORY__RESOURCE_INSTANCE, oldResourceInstance, resourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.REQUIRED_MEMORY__REQUIRED_MEMORY:
				if (resolve) return getRequiredMemory();
				return basicGetRequiredMemory();
			case PropertiesPackage.REQUIRED_MEMORY__RESOURCE_INSTANCE:
				if (resolve) return getResourceInstance();
				return basicGetResourceInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PropertiesPackage.REQUIRED_MEMORY__REQUIRED_MEMORY:
				setRequiredMemory((DataSize)newValue);
				return;
			case PropertiesPackage.REQUIRED_MEMORY__RESOURCE_INSTANCE:
				setResourceInstance((StructuredResourceInstance)newValue);
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
			case PropertiesPackage.REQUIRED_MEMORY__REQUIRED_MEMORY:
				setRequiredMemory((DataSize)null);
				return;
			case PropertiesPackage.REQUIRED_MEMORY__RESOURCE_INSTANCE:
				setResourceInstance((StructuredResourceInstance)null);
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
			case PropertiesPackage.REQUIRED_MEMORY__REQUIRED_MEMORY:
				return requiredMemory != null;
			case PropertiesPackage.REQUIRED_MEMORY__RESOURCE_INSTANCE:
				return resourceInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredMemoryImpl

/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.instance.impl.AtomicComponentInstanceImpl;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refined Atomic Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinedAtomicComponentInstanceImpl extends AtomicComponentInstanceImpl implements RefinedAtomicComponentInstance {
	/**
	 * The cached value of the '{@link #getAllocatedResourceInstance() <em>Allocated Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected RefindedStructuredResourceInstance allocatedResourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedAtomicComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.REFINED_ATOMIC_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefindedStructuredResourceInstance getAllocatedResourceInstance() {
		if (allocatedResourceInstance != null && allocatedResourceInstance.eIsProxy()) {
			InternalEObject oldAllocatedResourceInstance = (InternalEObject)allocatedResourceInstance;
			allocatedResourceInstance = (RefindedStructuredResourceInstance)eResolveProxy(oldAllocatedResourceInstance);
			if (allocatedResourceInstance != oldAllocatedResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, oldAllocatedResourceInstance, allocatedResourceInstance));
			}
		}
		return allocatedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefindedStructuredResourceInstance basicGetAllocatedResourceInstance() {
		return allocatedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedResourceInstance(RefindedStructuredResourceInstance newAllocatedResourceInstance) {
		RefindedStructuredResourceInstance oldAllocatedResourceInstance = allocatedResourceInstance;
		allocatedResourceInstance = newAllocatedResourceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, oldAllocatedResourceInstance, allocatedResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				if (resolve) return getAllocatedResourceInstance();
				return basicGetAllocatedResourceInstance();
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				setAllocatedResourceInstance((RefindedStructuredResourceInstance)newValue);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				setAllocatedResourceInstance((RefindedStructuredResourceInstance)null);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				return allocatedResourceInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RefinedAtomicComponentInstanceImpl

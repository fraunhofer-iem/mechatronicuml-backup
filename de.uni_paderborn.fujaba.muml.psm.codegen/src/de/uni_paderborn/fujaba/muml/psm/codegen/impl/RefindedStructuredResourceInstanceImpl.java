/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinded Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl#getAllocatedStructuredResourceInstance <em>Allocated Structured Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefindedStructuredResourceInstanceImpl extends StructuredResourceInstanceImpl implements RefindedStructuredResourceInstance {
	/**
	 * The cached value of the '{@link #getAllocatedAtomicComponentInstances() <em>Allocated Atomic Component Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedAtomicComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinedAtomicComponentInstance> allocatedAtomicComponentInstances;

	/**
	 * The cached value of the '{@link #getAllocatedStructuredResourceInstance() <em>Allocated Structured Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedStructuredResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected StructuredResourceInstance allocatedStructuredResourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefindedStructuredResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.REFINDED_STRUCTURED_RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinedAtomicComponentInstance> getAllocatedAtomicComponentInstances() {
		if (allocatedAtomicComponentInstances == null) {
			allocatedAtomicComponentInstances = new EObjectWithInverseResolvingEList<RefinedAtomicComponentInstance>(RefinedAtomicComponentInstance.class, this, CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE);
		}
		return allocatedAtomicComponentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getAllocatedStructuredResourceInstance() {
		if (allocatedStructuredResourceInstance != null && allocatedStructuredResourceInstance.eIsProxy()) {
			InternalEObject oldAllocatedStructuredResourceInstance = (InternalEObject)allocatedStructuredResourceInstance;
			allocatedStructuredResourceInstance = (StructuredResourceInstance)eResolveProxy(oldAllocatedStructuredResourceInstance);
			if (allocatedStructuredResourceInstance != oldAllocatedStructuredResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE, oldAllocatedStructuredResourceInstance, allocatedStructuredResourceInstance));
			}
		}
		return allocatedStructuredResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance basicGetAllocatedStructuredResourceInstance() {
		return allocatedStructuredResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedStructuredResourceInstance(StructuredResourceInstance newAllocatedStructuredResourceInstance) {
		StructuredResourceInstance oldAllocatedStructuredResourceInstance = allocatedStructuredResourceInstance;
		allocatedStructuredResourceInstance = newAllocatedStructuredResourceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE, oldAllocatedStructuredResourceInstance, allocatedStructuredResourceInstance));
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
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocatedAtomicComponentInstances()).basicAdd(otherEnd, msgs);
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
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				return ((InternalEList<?>)getAllocatedAtomicComponentInstances()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				return getAllocatedAtomicComponentInstances();
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE:
				if (resolve) return getAllocatedStructuredResourceInstance();
				return basicGetAllocatedStructuredResourceInstance();
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
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				getAllocatedAtomicComponentInstances().clear();
				getAllocatedAtomicComponentInstances().addAll((Collection<? extends RefinedAtomicComponentInstance>)newValue);
				return;
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE:
				setAllocatedStructuredResourceInstance((StructuredResourceInstance)newValue);
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
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				getAllocatedAtomicComponentInstances().clear();
				return;
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE:
				setAllocatedStructuredResourceInstance((StructuredResourceInstance)null);
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
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				return allocatedAtomicComponentInstances != null && !allocatedAtomicComponentInstances.isEmpty();
			case CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE:
				return allocatedStructuredResourceInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RefindedStructuredResourceInstanceImpl

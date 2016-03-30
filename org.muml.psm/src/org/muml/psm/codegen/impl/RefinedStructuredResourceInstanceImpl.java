/**
 */
package org.muml.psm.codegen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pm.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.RefinedAtomicComponentInstance;
import org.muml.psm.codegen.RefinedStructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refined Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.RefinedStructuredResourceInstanceImpl#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinedStructuredResourceInstanceImpl extends StructuredResourceInstanceImpl implements RefinedStructuredResourceInstance {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedStructuredResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.REFINED_STRUCTURED_RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinedAtomicComponentInstance> getAllocatedAtomicComponentInstances() {
		if (allocatedAtomicComponentInstances == null) {
			allocatedAtomicComponentInstances = new EObjectWithInverseResolvingEList<RefinedAtomicComponentInstance>(RefinedAtomicComponentInstance.class, this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE);
		}
		return allocatedAtomicComponentInstances;
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
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
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
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
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
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				return getAllocatedAtomicComponentInstances();
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
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				getAllocatedAtomicComponentInstances().clear();
				getAllocatedAtomicComponentInstances().addAll((Collection<? extends RefinedAtomicComponentInstance>)newValue);
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
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				getAllocatedAtomicComponentInstances().clear();
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
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES:
				return allocatedAtomicComponentInstances != null && !allocatedAtomicComponentInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefinedStructuredResourceInstanceImpl

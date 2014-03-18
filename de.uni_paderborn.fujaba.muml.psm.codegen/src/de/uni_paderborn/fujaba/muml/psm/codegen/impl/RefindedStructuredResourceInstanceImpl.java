/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.hardware.platform.impl.StructuredResourceInstanceImpl;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinded Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}</li>
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
			allocatedAtomicComponentInstances = new EObjectResolvingEList<RefinedAtomicComponentInstance>(RefinedAtomicComponentInstance.class, this, CodegenPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES);
		}
		return allocatedAtomicComponentInstances;
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
		}
		return super.eIsSet(featureID);
	}

} //RefindedStructuredResourceInstanceImpl

/**
 */
package org.muml.pm.hardware.hwresourceinstance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredResourceInstanceImpl extends ResourceInstanceImpl implements StructuredResourceInstance {
	/**
	 * The cached value of the '{@link #getEmbeddedAtomicResourceInstances() <em>Embedded Atomic Resource Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedAtomicResourceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AtomicResourceInstance> embeddedAtomicResourceInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourceinstancePackage.Literals.STRUCTURED_RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicResourceInstance> getEmbeddedAtomicResourceInstances() {
		if (embeddedAtomicResourceInstances == null) {
			embeddedAtomicResourceInstances = new EObjectContainmentWithInverseEList<AtomicResourceInstance>(AtomicResourceInstance.class, this, HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES, HwresourceinstancePackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE);
		}
		return embeddedAtomicResourceInstances;
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
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedAtomicResourceInstances()).basicAdd(otherEnd, msgs);
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
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
				return ((InternalEList<?>)getEmbeddedAtomicResourceInstances()).basicRemove(otherEnd, msgs);
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
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
				return getEmbeddedAtomicResourceInstances();
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
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
				getEmbeddedAtomicResourceInstances().clear();
				getEmbeddedAtomicResourceInstances().addAll((Collection<? extends AtomicResourceInstance>)newValue);
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
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
				getEmbeddedAtomicResourceInstances().clear();
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
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
				return embeddedAtomicResourceInstances != null && !embeddedAtomicResourceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredResourceInstanceImpl

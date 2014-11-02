/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.instance.impl.AtomicComponentInstanceImpl;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	protected RefinedStructuredResourceInstance allocatedResourceInstance;

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
	public RefinedStructuredResourceInstance getAllocatedResourceInstance() {
		if (allocatedResourceInstance != null && allocatedResourceInstance.eIsProxy()) {
			InternalEObject oldAllocatedResourceInstance = (InternalEObject)allocatedResourceInstance;
			allocatedResourceInstance = (RefinedStructuredResourceInstance)eResolveProxy(oldAllocatedResourceInstance);
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
	public RefinedStructuredResourceInstance basicGetAllocatedResourceInstance() {
		return allocatedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedResourceInstance(RefinedStructuredResourceInstance newAllocatedResourceInstance, NotificationChain msgs) {
		RefinedStructuredResourceInstance oldAllocatedResourceInstance = allocatedResourceInstance;
		allocatedResourceInstance = newAllocatedResourceInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, oldAllocatedResourceInstance, newAllocatedResourceInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedResourceInstance(RefinedStructuredResourceInstance newAllocatedResourceInstance) {
		if (newAllocatedResourceInstance != allocatedResourceInstance) {
			NotificationChain msgs = null;
			if (allocatedResourceInstance != null)
				msgs = ((InternalEObject)allocatedResourceInstance).eInverseRemove(this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, RefinedStructuredResourceInstance.class, msgs);
			if (newAllocatedResourceInstance != null)
				msgs = ((InternalEObject)newAllocatedResourceInstance).eInverseAdd(this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, RefinedStructuredResourceInstance.class, msgs);
			msgs = basicSetAllocatedResourceInstance(newAllocatedResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, newAllocatedResourceInstance, newAllocatedResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				if (allocatedResourceInstance != null)
					msgs = ((InternalEObject)allocatedResourceInstance).eInverseRemove(this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, RefinedStructuredResourceInstance.class, msgs);
				return basicSetAllocatedResourceInstance((RefinedStructuredResourceInstance)otherEnd, msgs);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				return basicSetAllocatedResourceInstance(null, msgs);
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
				setAllocatedResourceInstance((RefinedStructuredResourceInstance)newValue);
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
				setAllocatedResourceInstance((RefinedStructuredResourceInstance)null);
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

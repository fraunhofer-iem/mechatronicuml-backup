/**
 */
package org.muml.pm.hardware.hwresourceinstance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.CommentableElementImpl;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl#getResourceInstances <em>Resource Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInstanceRepositoryImpl extends CommentableElementImpl implements ResourceInstanceRepository {
	/**
	 * The cached value of the '{@link #getResourceInstances() <em>Resource Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInstance> resourceInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourceinstancePackage.Literals.RESOURCE_INSTANCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResourceInstances() {
		if (resourceInstances == null) {
			resourceInstances = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES);
		}
		return resourceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return ((InternalEList<?>)getResourceInstances()).basicRemove(otherEnd, msgs);
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return getResourceInstances();
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				getResourceInstances().addAll((Collection<? extends ResourceInstance>)newValue);
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				getResourceInstances().clear();
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return resourceInstances != null && !resourceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceInstanceRepositoryImpl

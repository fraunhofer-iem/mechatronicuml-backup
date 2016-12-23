/**
 */
package org.muml.pm.hardware.hwresource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pm.hardware.hwresource.AtomicResource;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.StructuredResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.StructuredResourceImpl#getEmbeddedAtomicResources <em>Embedded Atomic Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredResourceImpl extends ResourceImpl implements StructuredResource {
	/**
	 * The cached value of the '{@link #getEmbeddedAtomicResources() <em>Embedded Atomic Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedAtomicResources()
	 * @generated
	 * @ordered
	 */
	protected EList<AtomicResource> embeddedAtomicResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.STRUCTURED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicResource> getEmbeddedAtomicResources() {
		if (embeddedAtomicResources == null) {
			embeddedAtomicResources = new EObjectContainmentWithInverseEList<AtomicResource>(AtomicResource.class, this, HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES, HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE);
		}
		return embeddedAtomicResources;
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
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedAtomicResources()).basicAdd(otherEnd, msgs);
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
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
				return ((InternalEList<?>)getEmbeddedAtomicResources()).basicRemove(otherEnd, msgs);
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
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
				return getEmbeddedAtomicResources();
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
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
				getEmbeddedAtomicResources().clear();
				getEmbeddedAtomicResources().addAll((Collection<? extends AtomicResource>)newValue);
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
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
				getEmbeddedAtomicResources().clear();
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
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
				return embeddedAtomicResources != null && !embeddedAtomicResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredResourceImpl

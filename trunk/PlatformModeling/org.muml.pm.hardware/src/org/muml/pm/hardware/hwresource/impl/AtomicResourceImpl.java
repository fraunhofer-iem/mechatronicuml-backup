/**
 */
package org.muml.pm.hardware.hwresource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.pm.hardware.hwresource.AtomicResource;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.StructuredResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.AtomicResourceImpl#getParentStructuredResource <em>Parent Structured Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AtomicResourceImpl extends ResourceImpl implements AtomicResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.ATOMIC_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResource getParentStructuredResource() {
		if (eContainerFeatureID() != HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE) return null;
		return (StructuredResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructuredResource(StructuredResource newParentStructuredResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructuredResource, HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructuredResource(StructuredResource newParentStructuredResource) {
		if (newParentStructuredResource != eInternalContainer() || (eContainerFeatureID() != HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE && newParentStructuredResource != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructuredResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructuredResource != null)
				msgs = ((InternalEObject)newParentStructuredResource).eInverseAdd(this, HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES, StructuredResource.class, msgs);
			msgs = basicSetParentStructuredResource(newParentStructuredResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE, newParentStructuredResource, newParentStructuredResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructuredResource((StructuredResource)otherEnd, msgs);
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
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				return basicSetParentStructuredResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				return eInternalContainer().eInverseRemove(this, HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES, StructuredResource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				return getParentStructuredResource();
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
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				setParentStructuredResource((StructuredResource)newValue);
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
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				setParentStructuredResource((StructuredResource)null);
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
			case HwresourcePackage.ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE:
				return getParentStructuredResource() != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicResourceImpl

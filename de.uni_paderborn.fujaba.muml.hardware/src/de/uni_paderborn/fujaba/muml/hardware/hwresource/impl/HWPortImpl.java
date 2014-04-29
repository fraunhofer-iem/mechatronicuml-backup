/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.HWPortImpl#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.HWPortImpl#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HWPortImpl extends NamedElementImpl implements HWPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.HW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParentResource() {
		if (eContainerFeatureID() != HwresourcePackage.HW_PORT__PARENT_RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResource(Resource newParentResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResource, HwresourcePackage.HW_PORT__PARENT_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResource(Resource newParentResource) {
		if (newParentResource != eInternalContainer() || (eContainerFeatureID() != HwresourcePackage.HW_PORT__PARENT_RESOURCE && newParentResource != null)) {
			if (EcoreUtil.isAncestor(this, newParentResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResource != null)
				msgs = ((InternalEObject)newParentResource).eInverseAdd(this, HwresourcePackage.RESOURCE__HWPORTS, Resource.class, msgs);
			msgs = basicSetParentResource(newParentResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.HW_PORT__PARENT_RESOURCE, newParentResource, newParentResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getParentResourceInstance() {
		if (eContainerFeatureID() != HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE) return null;
		return (ResourceInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResourceInstance(ResourceInstance newParentResourceInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResourceInstance, HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResourceInstance(ResourceInstance newParentResourceInstance) {
		if (newParentResourceInstance != eInternalContainer() || (eContainerFeatureID() != HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE && newParentResourceInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentResourceInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResourceInstance != null)
				msgs = ((InternalEObject)newParentResourceInstance).eInverseAdd(this, HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS, ResourceInstance.class, msgs);
			msgs = basicSetParentResourceInstance(newParentResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE, newParentResourceInstance, newParentResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResource((Resource)otherEnd, msgs);
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResourceInstance((ResourceInstance)otherEnd, msgs);
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
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				return basicSetParentResource(null, msgs);
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				return basicSetParentResourceInstance(null, msgs);
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
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				return eInternalContainer().eInverseRemove(this, HwresourcePackage.RESOURCE__HWPORTS, Resource.class, msgs);
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, HwresourceinstancePackage.RESOURCE_INSTANCE__HWPORTS, ResourceInstance.class, msgs);
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
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				return getParentResource();
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance();
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
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				setParentResource((Resource)newValue);
				return;
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)newValue);
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
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				setParentResource((Resource)null);
				return;
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				setParentResourceInstance((ResourceInstance)null);
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
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE:
				return getParentResource() != null;
			case HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE:
				return getParentResourceInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //HWPortImpl

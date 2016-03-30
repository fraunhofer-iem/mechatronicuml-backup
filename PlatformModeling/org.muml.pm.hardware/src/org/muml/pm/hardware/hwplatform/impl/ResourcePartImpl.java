/**
 */
package org.muml.pm.hardware.hwplatform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.ResourcePartImpl#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcePartImpl extends PlatformPartImpl implements ResourcePart {
	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceInstance resourceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.RESOURCE_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getResourceType() {
		if (resourceType != null && resourceType.eIsProxy()) {
			InternalEObject oldResourceType = (InternalEObject)resourceType;
			resourceType = (ResourceInstance)eResolveProxy(oldResourceType);
			if (resourceType != oldResourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatformPackage.RESOURCE_PART__RESOURCE_TYPE, oldResourceType, resourceType));
			}
		}
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance basicGetResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(ResourceInstance newResourceType) {
		ResourceInstance oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.RESOURCE_PART__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwplatformPackage.RESOURCE_PART__RESOURCE_TYPE:
				if (resolve) return getResourceType();
				return basicGetResourceType();
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
			case HwplatformPackage.RESOURCE_PART__RESOURCE_TYPE:
				setResourceType((ResourceInstance)newValue);
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
			case HwplatformPackage.RESOURCE_PART__RESOURCE_TYPE:
				setResourceType((ResourceInstance)null);
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
			case HwplatformPackage.RESOURCE_PART__RESOURCE_TYPE:
				return resourceType != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourcePartImpl

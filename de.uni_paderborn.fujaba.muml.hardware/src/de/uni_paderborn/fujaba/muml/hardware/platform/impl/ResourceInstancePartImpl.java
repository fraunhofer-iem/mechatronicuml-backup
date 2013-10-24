/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstancePartImpl#getResourceInstanceType <em>Resource Instance Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstancePartImpl#getHwportParts <em>Hwport Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceInstancePartImpl extends PlatformPartImpl implements ResourceInstancePart {
	/**
	 * The cached value of the '{@link #getResourceInstanceType() <em>Resource Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstanceType()
	 * @generated
	 * @ordered
	 */
	protected ResourceInstance resourceInstanceType;

	/**
	 * The cached value of the '{@link #getHwportParts() <em>Hwport Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwportParts()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPortPart> hwportParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstancePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.RESOURCE_INSTANCE_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getResourceInstanceType() {
		if (resourceInstanceType != null && resourceInstanceType.eIsProxy()) {
			InternalEObject oldResourceInstanceType = (InternalEObject)resourceInstanceType;
			resourceInstanceType = (ResourceInstance)eResolveProxy(oldResourceInstanceType);
			if (resourceInstanceType != oldResourceInstanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE, oldResourceInstanceType, resourceInstanceType));
			}
		}
		return resourceInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance basicGetResourceInstanceType() {
		return resourceInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInstanceType(ResourceInstance newResourceInstanceType) {
		ResourceInstance oldResourceInstanceType = resourceInstanceType;
		resourceInstanceType = newResourceInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE, oldResourceInstanceType, resourceInstanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPortPart> getHwportParts() {
		if (hwportParts == null) {
			hwportParts = new EObjectContainmentEList<HWPortPart>(HWPortPart.class, this, PlatformPackage.RESOURCE_INSTANCE_PART__HWPORT_PARTS);
		}
		return hwportParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.RESOURCE_INSTANCE_PART__HWPORT_PARTS:
				return ((InternalEList<?>)getHwportParts()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE:
				if (resolve) return getResourceInstanceType();
				return basicGetResourceInstanceType();
			case PlatformPackage.RESOURCE_INSTANCE_PART__HWPORT_PARTS:
				return getHwportParts();
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
			case PlatformPackage.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE:
				setResourceInstanceType((ResourceInstance)newValue);
				return;
			case PlatformPackage.RESOURCE_INSTANCE_PART__HWPORT_PARTS:
				getHwportParts().clear();
				getHwportParts().addAll((Collection<? extends HWPortPart>)newValue);
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
			case PlatformPackage.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE:
				setResourceInstanceType((ResourceInstance)null);
				return;
			case PlatformPackage.RESOURCE_INSTANCE_PART__HWPORT_PARTS:
				getHwportParts().clear();
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
			case PlatformPackage.RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE:
				return resourceInstanceType != null;
			case PlatformPackage.RESOURCE_INSTANCE_PART__HWPORT_PARTS:
				return hwportParts != null && !hwportParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceInstancePartImpl

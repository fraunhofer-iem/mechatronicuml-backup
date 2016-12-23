/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl;
import org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegationHWPortInstanceImpl extends ConnectorEndpointInstanceImpl implements DelegationHWPortInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.DELEGATION_HW_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstance getParentHWPlatformInstance() {
		if (eContainerFeatureID() != HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE) return null;
		return (HWPlatformInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHWPlatformInstance(HWPlatformInstance newParentHWPlatformInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentHWPlatformInstance, HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHWPlatformInstance(HWPlatformInstance newParentHWPlatformInstance) {
		if (newParentHWPlatformInstance != eInternalContainer() || (eContainerFeatureID() != HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE && newParentHWPlatformInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentHWPlatformInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentHWPlatformInstance != null)
				msgs = ((InternalEObject)newParentHWPlatformInstance).eInverseAdd(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS, HWPlatformInstance.class, msgs);
			msgs = basicSetParentHWPlatformInstance(newParentHWPlatformInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE, newParentHWPlatformInstance, newParentHWPlatformInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentHWPlatformInstance((HWPlatformInstance)otherEnd, msgs);
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
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				return basicSetParentHWPlatformInstance(null, msgs);
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
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				return eInternalContainer().eInverseRemove(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS, HWPlatformInstance.class, msgs);
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
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				return getParentHWPlatformInstance();
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
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				setParentHWPlatformInstance((HWPlatformInstance)newValue);
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
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				setParentHWPlatformInstance((HWPlatformInstance)null);
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
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE:
				return getParentHWPlatformInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationHWPortInstanceImpl

/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation HW Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl#getParentHWPlatform <em>Parent HW Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationHWPortImpl extends ConnectorEndpointImpl implements DelegationHWPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.DELEGATION_HW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getParentHWPlatform() {
		if (eContainerFeatureID() != HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM) return null;
		return (HWPlatform)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHWPlatform(HWPlatform newParentHWPlatform, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentHWPlatform, HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHWPlatform(HWPlatform newParentHWPlatform) {
		if (newParentHWPlatform != eInternalContainer() || (eContainerFeatureID() != HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM && newParentHWPlatform != null)) {
			if (EcoreUtil.isAncestor(this, newParentHWPlatform))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentHWPlatform != null)
				msgs = ((InternalEObject)newParentHWPlatform).eInverseAdd(this, HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS, HWPlatform.class, msgs);
			msgs = basicSetParentHWPlatform(newParentHWPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM, newParentHWPlatform, newParentHWPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentHWPlatform((HWPlatform)otherEnd, msgs);
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				return basicSetParentHWPlatform(null, msgs);
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				return eInternalContainer().eInverseRemove(this, HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS, HWPlatform.class, msgs);
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				return getParentHWPlatform();
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				setParentHWPlatform((HWPlatform)newValue);
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				setParentHWPlatform((HWPlatform)null);
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
			case HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM:
				return getParentHWPlatform() != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationHWPortImpl

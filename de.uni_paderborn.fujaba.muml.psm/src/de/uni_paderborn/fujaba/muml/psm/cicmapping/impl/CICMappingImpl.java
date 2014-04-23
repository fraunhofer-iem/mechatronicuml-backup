/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

import de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping;
import de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIC Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICMappingImpl#getCic <em>Cic</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICMappingImpl#getDeviceInstance <em>Device Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CICMappingImpl extends MinimalEObjectImpl.Container implements CICMapping {
	/**
	 * The cached value of the '{@link #getCic() <em>Cic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance cic;

	/**
	 * The cached value of the '{@link #getDeviceInstance() <em>Device Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInstance()
	 * @generated
	 * @ordered
	 */
	protected DeviceInstance deviceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CICMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CicmappingPackage.Literals.CIC_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getCic() {
		if (cic != null && cic.eIsProxy()) {
			InternalEObject oldCic = (InternalEObject)cic;
			cic = (ComponentInstance)eResolveProxy(oldCic);
			if (cic != oldCic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CicmappingPackage.CIC_MAPPING__CIC, oldCic, cic));
			}
		}
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetCic() {
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCic(ComponentInstance newCic) {
		ComponentInstance oldCic = cic;
		cic = newCic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CicmappingPackage.CIC_MAPPING__CIC, oldCic, cic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInstance getDeviceInstance() {
		if (deviceInstance != null && deviceInstance.eIsProxy()) {
			InternalEObject oldDeviceInstance = (InternalEObject)deviceInstance;
			deviceInstance = (DeviceInstance)eResolveProxy(oldDeviceInstance);
			if (deviceInstance != oldDeviceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CicmappingPackage.CIC_MAPPING__DEVICE_INSTANCE, oldDeviceInstance, deviceInstance));
			}
		}
		return deviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInstance basicGetDeviceInstance() {
		return deviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceInstance(DeviceInstance newDeviceInstance) {
		DeviceInstance oldDeviceInstance = deviceInstance;
		deviceInstance = newDeviceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CicmappingPackage.CIC_MAPPING__DEVICE_INSTANCE, oldDeviceInstance, deviceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CicmappingPackage.CIC_MAPPING__CIC:
				if (resolve) return getCic();
				return basicGetCic();
			case CicmappingPackage.CIC_MAPPING__DEVICE_INSTANCE:
				if (resolve) return getDeviceInstance();
				return basicGetDeviceInstance();
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
			case CicmappingPackage.CIC_MAPPING__CIC:
				setCic((ComponentInstance)newValue);
				return;
			case CicmappingPackage.CIC_MAPPING__DEVICE_INSTANCE:
				setDeviceInstance((DeviceInstance)newValue);
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
			case CicmappingPackage.CIC_MAPPING__CIC:
				setCic((ComponentInstance)null);
				return;
			case CicmappingPackage.CIC_MAPPING__DEVICE_INSTANCE:
				setDeviceInstance((DeviceInstance)null);
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
			case CicmappingPackage.CIC_MAPPING__CIC:
				return cic != null;
			case CicmappingPackage.CIC_MAPPING__DEVICE_INSTANCE:
				return deviceInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //CICMappingImpl

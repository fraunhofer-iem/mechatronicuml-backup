/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.pim.instance.PortInstance;

import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;

import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfigurationImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfigurationImpl#getHwportInstance <em>Hwport Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortInstanceConfigurationImpl extends MinimalEObjectImpl.Container implements PortInstanceConfiguration {
	/**
	 * The cached value of the '{@link #getPortInstance() <em>Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstance()
	 * @generated
	 * @ordered
	 */
	protected PortInstance portInstance;

	/**
	 * The cached value of the '{@link #getHwportInstance() <em>Hwport Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwportInstance()
	 * @generated
	 * @ordered
	 */
	protected HWPortInstance hwportInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getPortInstance() {
		if (portInstance != null && portInstance.eIsProxy()) {
			InternalEObject oldPortInstance = (InternalEObject)portInstance;
			portInstance = (PortInstance)eResolveProxy(oldPortInstance);
			if (portInstance != oldPortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE, oldPortInstance, portInstance));
			}
		}
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetPortInstance() {
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInstance(PortInstance newPortInstance) {
		PortInstance oldPortInstance = portInstance;
		portInstance = newPortInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE, oldPortInstance, portInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance getHwportInstance() {
		if (hwportInstance != null && hwportInstance.eIsProxy()) {
			InternalEObject oldHwportInstance = (InternalEObject)hwportInstance;
			hwportInstance = (HWPortInstance)eResolveProxy(oldHwportInstance);
			if (hwportInstance != oldHwportInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE, oldHwportInstance, hwportInstance));
			}
		}
		return hwportInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance basicGetHwportInstance() {
		return hwportInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwportInstance(HWPortInstance newHwportInstance) {
		HWPortInstance oldHwportInstance = hwportInstance;
		hwportInstance = newHwportInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE, oldHwportInstance, hwportInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE:
				if (resolve) return getPortInstance();
				return basicGetPortInstance();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE:
				if (resolve) return getHwportInstance();
				return basicGetHwportInstance();
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE:
				setPortInstance((PortInstance)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE:
				setHwportInstance((HWPortInstance)newValue);
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE:
				setPortInstance((PortInstance)null);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE:
				setHwportInstance((HWPortInstance)null);
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE:
				return portInstance != null;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE:
				return hwportInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //PortInstanceConfigurationImpl

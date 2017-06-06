/**
 */
package org.muml.psm.muml_container.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.psm.allocation.SystemAllocation;

import org.muml.psm.muml_container.DeploymentConfiguration;
import org.muml.psm.muml_container.ECUConfiguration;
import org.muml.psm.muml_container.Muml_containerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.DeploymentConfigurationImpl#getSystemAllocation <em>System Allocation</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.DeploymentConfigurationImpl#getEcuConfigurations <em>Ecu Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentConfigurationImpl extends MinimalEObjectImpl.Container implements DeploymentConfiguration {
	/**
	 * The cached value of the '{@link #getSystemAllocation() <em>System Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemAllocation()
	 * @generated
	 * @ordered
	 */
	protected SystemAllocation systemAllocation;

	/**
	 * The cached value of the '{@link #getEcuConfigurations() <em>Ecu Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ECUConfiguration> ecuConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.DEPLOYMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAllocation getSystemAllocation() {
		if (systemAllocation != null && systemAllocation.eIsProxy()) {
			InternalEObject oldSystemAllocation = (InternalEObject)systemAllocation;
			systemAllocation = (SystemAllocation)eResolveProxy(oldSystemAllocation);
			if (systemAllocation != oldSystemAllocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION, oldSystemAllocation, systemAllocation));
			}
		}
		return systemAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAllocation basicGetSystemAllocation() {
		return systemAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemAllocation(SystemAllocation newSystemAllocation) {
		SystemAllocation oldSystemAllocation = systemAllocation;
		systemAllocation = newSystemAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION, oldSystemAllocation, systemAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECUConfiguration> getEcuConfigurations() {
		if (ecuConfigurations == null) {
			ecuConfigurations = new EObjectContainmentEList<ECUConfiguration>(ECUConfiguration.class, this, Muml_containerPackage.DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS);
		}
		return ecuConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS:
				return ((InternalEList<?>)getEcuConfigurations()).basicRemove(otherEnd, msgs);
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
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION:
				if (resolve) return getSystemAllocation();
				return basicGetSystemAllocation();
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS:
				return getEcuConfigurations();
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
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION:
				setSystemAllocation((SystemAllocation)newValue);
				return;
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS:
				getEcuConfigurations().clear();
				getEcuConfigurations().addAll((Collection<? extends ECUConfiguration>)newValue);
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
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION:
				setSystemAllocation((SystemAllocation)null);
				return;
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS:
				getEcuConfigurations().clear();
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
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION:
				return systemAllocation != null;
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS:
				return ecuConfigurations != null && !ecuConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentConfigurationImpl

/**
 */
package org.muml.psm.muml_container.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.muml.psm.muml_container.MultiPortInstanceConfiguration;
import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Port Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.MultiPortInstanceConfigurationImpl#getPortInstanceConfigurations <em>Port Instance Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPortInstanceConfigurationImpl extends PortInstanceConfigurationImpl implements MultiPortInstanceConfiguration {
	/**
	 * The cached value of the '{@link #getPortInstanceConfigurations() <em>Port Instance Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstanceConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstanceConfiguration> portInstanceConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPortInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.MULTI_PORT_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstanceConfiguration> getPortInstanceConfigurations() {
		if (portInstanceConfigurations == null) {
			portInstanceConfigurations = new EObjectResolvingEList<PortInstanceConfiguration>(PortInstanceConfiguration.class, this, Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS);
		}
		return portInstanceConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				return getPortInstanceConfigurations();
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
			case Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				getPortInstanceConfigurations().clear();
				getPortInstanceConfigurations().addAll((Collection<? extends PortInstanceConfiguration>)newValue);
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
			case Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				getPortInstanceConfigurations().clear();
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
			case Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS:
				return portInstanceConfigurations != null && !portInstanceConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiPortInstanceConfigurationImpl

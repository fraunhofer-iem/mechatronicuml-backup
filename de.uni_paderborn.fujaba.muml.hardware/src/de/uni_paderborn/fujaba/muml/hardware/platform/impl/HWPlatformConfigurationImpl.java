/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformConfigurationImpl#getHwplatforms <em>Hwplatforms</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformConfigurationImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformConfigurationImpl extends ExtendableElementImpl implements HWPlatformConfiguration {
	/**
	 * The cached value of the '{@link #getHwplatforms() <em>Hwplatforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPlatform> hwplatforms;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInstanceRepository> repositories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.HW_PLATFORM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatform> getHwplatforms() {
		if (hwplatforms == null) {
			hwplatforms = new EObjectContainmentEList<HWPlatform>(HWPlatform.class, this, PlatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS);
		}
		return hwplatforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstanceRepository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<ResourceInstanceRepository>(ResourceInstanceRepository.class, this, PlatformPackage.HW_PLATFORM_CONFIGURATION__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				return ((InternalEList<?>)getHwplatforms()).basicRemove(otherEnd, msgs);
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				return getHwplatforms();
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__REPOSITORIES:
				return getRepositories();
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
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				getHwplatforms().clear();
				getHwplatforms().addAll((Collection<? extends HWPlatform>)newValue);
				return;
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends ResourceInstanceRepository>)newValue);
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
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				getHwplatforms().clear();
				return;
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__REPOSITORIES:
				getRepositories().clear();
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
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				return hwplatforms != null && !hwplatforms.isEmpty();
			case PlatformPackage.HW_PLATFORM_CONFIGURATION__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformConfigurationImpl

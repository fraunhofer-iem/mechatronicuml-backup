/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.impl.ExtendableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformConfigurationImpl#getHwplatforms <em>Hwplatforms</em>}</li>
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
		return HwplatformPackage.Literals.HW_PLATFORM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatform> getHwplatforms() {
		if (hwplatforms == null) {
			hwplatforms = new EObjectContainmentEList<HWPlatform>(HWPlatform.class, this, HwplatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS);
		}
		return hwplatforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				return ((InternalEList<?>)getHwplatforms()).basicRemove(otherEnd, msgs);
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
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				return getHwplatforms();
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
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				getHwplatforms().clear();
				getHwplatforms().addAll((Collection<? extends HWPlatform>)newValue);
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
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				getHwplatforms().clear();
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
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION__HWPLATFORMS:
				return hwplatforms != null && !hwplatforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformConfigurationImpl

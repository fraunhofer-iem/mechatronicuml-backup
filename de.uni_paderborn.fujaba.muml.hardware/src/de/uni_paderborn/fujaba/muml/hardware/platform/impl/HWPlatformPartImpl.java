/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl#getDerivedBridges <em>Derived Bridges</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformPartImpl extends PlatformPartImpl implements HWPlatformPart {
	/**
	 * The cached value of the '{@link #getHwplatformType() <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformType()
	 * @generated
	 * @ordered
	 */
	protected HWPlatform hwplatformType;

	/**
	 * The cached setting delegate for the '{@link #getDerivedBridges() <em>Derived Bridges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedBridges()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DERIVED_BRIDGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PlatformPackage.Literals.HW_PLATFORM_PART__DERIVED_BRIDGES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDelegationPorts() <em>Delegation Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPortPart> delegationPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.HW_PLATFORM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getHwplatformType() {
		if (hwplatformType != null && hwplatformType.eIsProxy()) {
			InternalEObject oldHwplatformType = (InternalEObject)hwplatformType;
			hwplatformType = (HWPlatform)eResolveProxy(oldHwplatformType);
			if (hwplatformType != oldHwplatformType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
			}
		}
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform basicGetHwplatformType() {
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwplatformType(HWPlatform newHwplatformType) {
		HWPlatform oldHwplatformType = hwplatformType;
		hwplatformType = newHwplatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Bridge> getDerivedBridges() {
		return (EList<Bridge>)DERIVED_BRIDGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPortPart> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentEList<HWPortPart>(HWPortPart.class, this, PlatformPackage.HW_PLATFORM_PART__DELEGATION_PORTS);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.HW_PLATFORM_PART__DERIVED_BRIDGES:
				return ((InternalEList<?>)getDerivedBridges()).basicRemove(otherEnd, msgs);
			case PlatformPackage.HW_PLATFORM_PART__DELEGATION_PORTS:
				return ((InternalEList<?>)getDelegationPorts()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				if (resolve) return getHwplatformType();
				return basicGetHwplatformType();
			case PlatformPackage.HW_PLATFORM_PART__DERIVED_BRIDGES:
				return getDerivedBridges();
			case PlatformPackage.HW_PLATFORM_PART__DELEGATION_PORTS:
				return getDelegationPorts();
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
			case PlatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)newValue);
				return;
			case PlatformPackage.HW_PLATFORM_PART__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends HWPortPart>)newValue);
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
			case PlatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)null);
				return;
			case PlatformPackage.HW_PLATFORM_PART__DELEGATION_PORTS:
				getDelegationPorts().clear();
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
			case PlatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				return hwplatformType != null;
			case PlatformPackage.HW_PLATFORM_PART__DERIVED_BRIDGES:
				return DERIVED_BRIDGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PlatformPackage.HW_PLATFORM_PART__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformPartImpl

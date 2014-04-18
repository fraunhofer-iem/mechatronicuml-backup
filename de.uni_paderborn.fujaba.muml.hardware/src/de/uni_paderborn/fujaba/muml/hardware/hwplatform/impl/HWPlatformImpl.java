/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl#getNetworkingHardwareParts <em>Networking Hardware Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformImpl extends NamedElementImpl implements HWPlatform {
	/**
	 * The cached value of the '{@link #getEmbeddedPlatformParts() <em>Embedded Platform Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedPlatformParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformPart> embeddedPlatformParts;

	/**
	 * The cached value of the '{@link #getNetworkingHardwareParts() <em>Networking Hardware Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingHardwareParts()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkingHardwarePart> networkingHardwareParts;

	/**
	 * The cached value of the '{@link #getDelegationPorts() <em>Delegation Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationHWPort> delegationPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.HW_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformPart> getEmbeddedPlatformParts() {
		if (embeddedPlatformParts == null) {
			embeddedPlatformParts = new EObjectContainmentWithInverseEList<PlatformPart>(PlatformPart.class, this, HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS, HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM);
		}
		return embeddedPlatformParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkingHardwarePart> getNetworkingHardwareParts() {
		if (networkingHardwareParts == null) {
			networkingHardwareParts = new EObjectContainmentEList<NetworkingHardwarePart>(NetworkingHardwarePart.class, this, HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS);
		}
		return networkingHardwareParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationHWPort> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentWithInverseEList<DelegationHWPort>(DelegationHWPort.class, this, HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS, HwplatformPackage.DELEGATION_HW_PORT__PARENT_HW_PLATFORM);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedPlatformParts()).basicAdd(otherEnd, msgs);
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationPorts()).basicAdd(otherEnd, msgs);
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
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return ((InternalEList<?>)getEmbeddedPlatformParts()).basicRemove(otherEnd, msgs);
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS:
				return ((InternalEList<?>)getNetworkingHardwareParts()).basicRemove(otherEnd, msgs);
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
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
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return getEmbeddedPlatformParts();
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS:
				return getNetworkingHardwareParts();
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
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
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				getEmbeddedPlatformParts().clear();
				getEmbeddedPlatformParts().addAll((Collection<? extends PlatformPart>)newValue);
				return;
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS:
				getNetworkingHardwareParts().clear();
				getNetworkingHardwareParts().addAll((Collection<? extends NetworkingHardwarePart>)newValue);
				return;
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends DelegationHWPort>)newValue);
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
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				getEmbeddedPlatformParts().clear();
				return;
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS:
				getNetworkingHardwareParts().clear();
				return;
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
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
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return embeddedPlatformParts != null && !embeddedPlatformParts.isEmpty();
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS:
				return networkingHardwareParts != null && !networkingHardwareParts.isEmpty();
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformImpl

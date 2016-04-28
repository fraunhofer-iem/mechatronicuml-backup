/**
 */
package org.muml.pm.hardware.hwplatform.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pm.hardware.hwplatform.DelegationHWPort;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwplatform.NetworkingHardware;
import org.muml.pm.hardware.hwplatform.PlatformPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl#getNetworkingHardware <em>Networking Hardware</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl#getNetworkConnectors <em>Network Connectors</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getNetworkingHardware() <em>Networking Hardware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingHardware()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkingHardware> networkingHardware;

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
	 * The cached value of the '{@link #getNetworkConnectors() <em>Network Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkConnector> networkConnectors;

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
	public EList<NetworkingHardware> getNetworkingHardware() {
		if (networkingHardware == null) {
			networkingHardware = new EObjectContainmentEList<NetworkingHardware>(NetworkingHardware.class, this, HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE);
		}
		return networkingHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationHWPort> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentEList<DelegationHWPort>(DelegationHWPort.class, this, HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkConnector> getNetworkConnectors() {
		if (networkConnectors == null) {
			networkConnectors = new EObjectContainmentEList<NetworkConnector>(NetworkConnector.class, this, HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS);
		}
		return networkConnectors;
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
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE:
				return ((InternalEList<?>)getNetworkingHardware()).basicRemove(otherEnd, msgs);
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return ((InternalEList<?>)getDelegationPorts()).basicRemove(otherEnd, msgs);
			case HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS:
				return ((InternalEList<?>)getNetworkConnectors()).basicRemove(otherEnd, msgs);
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
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE:
				return getNetworkingHardware();
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return getDelegationPorts();
			case HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS:
				return getNetworkConnectors();
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
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE:
				getNetworkingHardware().clear();
				getNetworkingHardware().addAll((Collection<? extends NetworkingHardware>)newValue);
				return;
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends DelegationHWPort>)newValue);
				return;
			case HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS:
				getNetworkConnectors().clear();
				getNetworkConnectors().addAll((Collection<? extends NetworkConnector>)newValue);
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
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE:
				getNetworkingHardware().clear();
				return;
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				getDelegationPorts().clear();
				return;
			case HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS:
				getNetworkConnectors().clear();
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
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE:
				return networkingHardware != null && !networkingHardware.isEmpty();
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
			case HwplatformPackage.HW_PLATFORM__NETWORK_CONNECTORS:
				return networkConnectors != null && !networkConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformImpl

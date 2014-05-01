/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.util;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage
 * @generated
 */
public class HwplatforminstanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HwplatforminstanceValidator INSTANCE = new HwplatforminstanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatforminstanceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HwplatforminstancePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE:
				return validateHWPlatformInstance((HWPlatformInstance)value, diagnostics, context);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION:
				return validateHWPlatformInstanceConfiguration((HWPlatformInstanceConfiguration)value, diagnostics, context);
			case HwplatforminstancePackage.HW_PORT_INSTANCE:
				return validateHWPortInstance((HWPortInstance)value, diagnostics, context);
			case HwplatforminstancePackage.DELEGATION_INSTANCE:
				return validateDelegationInstance((DelegationInstance)value, diagnostics, context);
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE:
				return validateBusConnectorInstance((BusConnectorInstance)value, diagnostics, context);
			case HwplatforminstancePackage.BUS_INSTANCE:
				return validateBusInstance((BusInstance)value, diagnostics, context);
			case HwplatforminstancePackage.LINK_INSTANCE:
				return validateLinkInstance((LinkInstance)value, diagnostics, context);
			case HwplatforminstancePackage.COMMUNICATION_MEDIA_INSTANCE:
				return validateCommunicationMediaInstance((CommunicationMediaInstance)value, diagnostics, context);
			case HwplatforminstancePackage.BRIDGE_INSTANCE:
				return validateBridgeInstance((BridgeInstance)value, diagnostics, context);
			case HwplatforminstancePackage.NETWORKING_HARDWARE_INSTANCE:
				return validateNetworkingHardwareInstance((NetworkingHardwareInstance)value, diagnostics, context);
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE:
				return validateDelegationHWPortInstance((DelegationHWPortInstance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformInstance(HWPlatformInstance hwPlatformInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPlatformInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformInstanceConfiguration(HWPlatformInstanceConfiguration hwPlatformInstanceConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPlatformInstanceConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortInstance(HWPortInstance hwPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPortInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationInstance(DelegationInstance delegationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegationInstance_HWPortInstanceToDelegationPortInstance(delegationInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HWPortInstanceToDelegationPortInstance constraint of '<em>Delegation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_INSTANCE__HW_PORT_INSTANCE_TO_DELEGATION_PORT_INSTANCE__EEXPRESSION = "( self.connectorEndpointInstances->exists(c|c.oclIsKindOf(hwplatforminstance::DelegationHWPortInstance)) or self.connectorEndpointInstances->exists(c|c.oclIsKindOf(hwplatforminstance::BusInstance)))\n" +
		"";

	/**
	 * Validates the HWPortInstanceToDelegationPortInstance constraint of '<em>Delegation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationInstance_HWPortInstanceToDelegationPortInstance(DelegationInstance delegationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatforminstancePackage.Literals.DELEGATION_INSTANCE,
				 delegationInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "HWPortInstanceToDelegationPortInstance",
				 DELEGATION_INSTANCE__HW_PORT_INSTANCE_TO_DELEGATION_PORT_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusConnectorInstance(BusConnectorInstance busConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busConnectorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusInstance(BusInstance busInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkInstance(LinkInstance linkInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkInstance_Only2Connections(linkInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Only2Connections constraint of '<em>Link Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_INSTANCE__ONLY2_CONNECTIONS__EEXPRESSION = "self.connectorEndpointInstances->size()<=2";

	/**
	 * Validates the Only2Connections constraint of '<em>Link Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkInstance_Only2Connections(LinkInstance linkInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatforminstancePackage.Literals.LINK_INSTANCE,
				 linkInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "Only2Connections",
				 LINK_INSTANCE__ONLY2_CONNECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMediaInstance(CommunicationMediaInstance communicationMediaInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationMediaInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridgeInstance(BridgeInstance bridgeInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bridgeInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkingHardwareInstance(NetworkingHardwareInstance networkingHardwareInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkingHardwareInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationHWPortInstance(DelegationHWPortInstance delegationHWPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationHWPortInstance, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HwplatforminstanceValidator

/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.util;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.*;

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
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage
 * @generated
 */
public class HwplatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HwplatformValidator INSTANCE = new HwplatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.hardware.hwplatform";

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
	public HwplatformValidator() {
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
	  return HwplatformPackage.eINSTANCE;
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
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION:
				return validateHWPlatformConfiguration((HWPlatformConfiguration)value, diagnostics, context);
			case HwplatformPackage.HW_PLATFORM:
				return validateHWPlatform((HWPlatform)value, diagnostics, context);
			case HwplatformPackage.PLATFORM_PART:
				return validatePlatformPart((PlatformPart)value, diagnostics, context);
			case HwplatformPackage.HW_PLATFORM_PART:
				return validateHWPlatformPart((HWPlatformPart)value, diagnostics, context);
			case HwplatformPackage.RESOURCE_PART:
				return validateResourcePart((ResourcePart)value, diagnostics, context);
			case HwplatformPackage.DELEGATION:
				return validateDelegation((Delegation)value, diagnostics, context);
			case HwplatformPackage.DELEGATION_HW_PORT:
				return validateDelegationHWPort((DelegationHWPort)value, diagnostics, context);
			case HwplatformPackage.HW_PORT_PART:
				return validateHWPortPart((HWPortPart)value, diagnostics, context);
			case HwplatformPackage.BUS_CONNECTOR:
				return validateBusConnector((BusConnector)value, diagnostics, context);
			case HwplatformPackage.BUS_PART:
				return validateBusPart((BusPart)value, diagnostics, context);
			case HwplatformPackage.LINK_PART:
				return validateLinkPart((LinkPart)value, diagnostics, context);
			case HwplatformPackage.COMMUNICATION_MEDIA_PART:
				return validateCommunicationMediaPart((CommunicationMediaPart)value, diagnostics, context);
			case HwplatformPackage.BRIDGE_PART:
				return validateBridgePart((BridgePart)value, diagnostics, context);
			case HwplatformPackage.NETWORKING_HARDWARE_PART:
				return validateNetworkingHardwarePart((NetworkingHardwarePart)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformConfiguration(HWPlatformConfiguration hwPlatformConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPlatformConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatform(HWPlatform hwPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPlatform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformPart(PlatformPart platformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(platformPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityLowerBoundSet(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityUpperBoundSet(platformPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CardinalityLowerBoundSet constraint of '<em>Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLATFORM_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION = "self.cardinality.lowerBound->notEmpty()";

	/**
	 * Validates the CardinalityLowerBoundSet constraint of '<em>Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformPart_CardinalityLowerBoundSet(PlatformPart platformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.PLATFORM_PART,
				 platformPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CardinalityLowerBoundSet",
				 PLATFORM_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CardinalityUpperBoundSet constraint of '<em>Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLATFORM_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION = "self.cardinality.upperBound->notEmpty()";

	/**
	 * Validates the CardinalityUpperBoundSet constraint of '<em>Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformPart_CardinalityUpperBoundSet(PlatformPart platformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.PLATFORM_PART,
				 platformPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CardinalityUpperBoundSet",
				 PLATFORM_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformPart(HWPlatformPart hwPlatformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPlatformPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityLowerBoundSet(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityUpperBoundSet(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPlatformPart_NoLoop(hwPlatformPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoLoop constraint of '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PLATFORM_PART__NO_LOOP__EEXPRESSION = "self.hwplatformType<>self.parentHWPlatform";

	/**
	 * Validates the NoLoop constraint of '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformPart_NoLoop(HWPlatformPart hwPlatformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.HW_PLATFORM_PART,
				 hwPlatformPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoLoop",
				 HW_PLATFORM_PART__NO_LOOP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePart(ResourcePart resourcePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourcePart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityLowerBoundSet(resourcePart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityUpperBoundSet(resourcePart, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_HWPortPartToDelegationHWPort(delegation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HWPortPartToDelegationHWPort constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__HW_PORT_PART_TO_DELEGATION_HW_PORT__EEXPRESSION = "self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::HWPortPart)) and ( self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::DelegationHWPort)) or self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::BusPart)))";

	/**
	 * Validates the HWPortPartToDelegationHWPort constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_HWPortPartToDelegationHWPort(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "HWPortPartToDelegationHWPort",
				 DELEGATION__HW_PORT_PART_TO_DELEGATION_HW_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationHWPort(DelegationHWPort delegationHWPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationHWPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPortPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortPart_SameProtocol(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortPart_LinkPort2Link(hwPortPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameProtocol constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT_PART__SAME_PROTOCOL__EEXPRESSION = "if (self.connectedMediaPart->size()>0 and (not self.connectedMediaPart->first().oclIsKindOf(hwplatform::Delegation))) then\n" +
		"\tself.connectedMediaPart->first().protocol=self.protocol\n" +
		"else true\n" +
		"endif";

	/**
	 * Validates the SameProtocol constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart_SameProtocol(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.HW_PORT_PART,
				 hwPortPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameProtocol",
				 HW_PORT_PART__SAME_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LinkPort2Link constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT_PART__LINK_PORT2_LINK__EEXPRESSION = "if (self.portKind.oclIsUndefined() and  self.connectedMediaPart->size()<1) then\n" +
		"\ttrue\n" +
		"else \n" +
		"\tif (self.portKind = hwresource::HWPortKind::BUS) then\n" +
		"\t\tself.connectedMediaPart->forAll(c|c.oclIsKindOf(hwplatform::BusPart)) or self.connectors->forAll(c|c.oclIsKindOf(hwplatform::BusConnector) or c.oclIsKindOf(hwplatform::Delegation))\n" +
		"\telse if (self.portKind = hwresource::HWPortKind::LINK) then\n" +
		"\t\tself.connectedMediaPart->forAll(c|c.oclIsKindOf(hwplatform::LinkPart)) or self.connectors->forAll(c|c.oclIsKindOf(hwplatform::Delegation))\n" +
		"\telse true\n" +
		"endif endif endif\n" +
		"";

	/**
	 * Validates the LinkPort2Link constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart_LinkPort2Link(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.HW_PORT_PART,
				 hwPortPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LinkPort2Link",
				 HW_PORT_PART__LINK_PORT2_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusConnector(BusConnector busConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusPart(BusPart busPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPart(LinkPart linkPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkPart_Only2Connections(linkPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Only2Connections constraint of '<em>Link Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_PART__ONLY2_CONNECTIONS__EEXPRESSION = "self.connectorEndpoints->size()<=2";

	/**
	 * Validates the Only2Connections constraint of '<em>Link Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPart_Only2Connections(LinkPart linkPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.LINK_PART,
				 linkPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "Only2Connections",
				 LINK_PART__ONLY2_CONNECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMediaPart(CommunicationMediaPart communicationMediaPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationMediaPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridgePart(BridgePart bridgePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bridgePart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkingHardwarePart(NetworkingHardwarePart networkingHardwarePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkingHardwarePart, diagnostics, context);
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

} //HwplatformValidator

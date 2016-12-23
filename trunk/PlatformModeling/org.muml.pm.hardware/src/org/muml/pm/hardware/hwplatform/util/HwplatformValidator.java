/**
 */
package org.muml.pm.hardware.hwplatform.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pm.hardware.hwplatform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage
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
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pm.hardware.hwplatform";

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
			case HwplatformPackage.HW_PLATFORM:
				return validateHWPlatform((HWPlatform)value, diagnostics, context);
			case HwplatformPackage.PLATFORM_PART:
				return validatePlatformPart((PlatformPart)value, diagnostics, context);
			case HwplatformPackage.HW_PLATFORM_PART:
				return validateHWPlatformPart((HWPlatformPart)value, diagnostics, context);
			case HwplatformPackage.RESOURCE_PART:
				return validateResourcePart((ResourcePart)value, diagnostics, context);
			case HwplatformPackage.DELEGATION_HW_PORT:
				return validateDelegationHWPort((DelegationHWPort)value, diagnostics, context);
			case HwplatformPackage.HW_PORT_PART:
				return validateHWPortPart((HWPortPart)value, diagnostics, context);
			case HwplatformPackage.BUS:
				return validateBus((Bus)value, diagnostics, context);
			case HwplatformPackage.NETWORK_BRIDGE:
				return validateNetworkBridge((NetworkBridge)value, diagnostics, context);
			case HwplatformPackage.NETWORKING_HARDWARE:
				return validateNetworkingHardware((NetworkingHardware)value, diagnostics, context);
			case HwplatformPackage.NETWORK_CONNECTOR:
				return validateNetworkConnector((NetworkConnector)value, diagnostics, context);
			default:
				return true;
		}
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
	protected static final String PLATFORM_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION = "-- Lower Bound of Cardinality must be set\n" +
		"if self.cardinality.lowerBound.oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"self.cardinality.lowerBound->notEmpty()\r\n" +
		"endif";

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
	protected static final String PLATFORM_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION = "-- Upper bound of cardinality must be set\r\n" +
		"if self.cardinality.upperBound.oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"self.cardinality.upperBound->notEmpty()\r\n" +
		"endif";

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
	protected static final String HW_PLATFORM_PART__NO_LOOP__EEXPRESSION = "-- HWPlatformPart must NOT have the same type as its parent HWPlatform\n" +
		"self.hwplatformType<>self.parentHWPlatform";

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
	public boolean validateDelegationHWPort(DelegationHWPort delegationHWPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationHWPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPortPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateBus_SameBusProtocol(bus, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameBusProtocol constraint of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUS__SAME_BUS_PROTOCOL__EEXPRESSION = "-- Connected Ports must use the same BusProtocol\r\n" +
		"self.connectedHWPortParts.hwport->forAll(p  | p.protocol =self.protocol )";

	/**
	 * Validates the SameBusProtocol constraint of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus_SameBusProtocol(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.BUS,
				 bus,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameBusProtocol",
				 BUS__SAME_BUS_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkBridge(NetworkBridge networkBridge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkBridge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkingHardware(NetworkingHardware networkingHardware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkingHardware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkConnector(NetworkConnector networkConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkConnector_SameProtocol(networkConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameProtocol constraint of '<em>Network Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NETWORK_CONNECTOR__SAME_PROTOCOL__EEXPRESSION = "-- Connected Ports must use the same Protocol\r\n" +
		"self.hwportParts.hwport->forAll(p1 , p2 | p1.protocol = p2.protocol)";

	/**
	 * Validates the SameProtocol constraint of '<em>Network Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkConnector_SameProtocol(NetworkConnector networkConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwplatformPackage.Literals.NETWORK_CONNECTOR,
				 networkConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameProtocol",
				 NETWORK_CONNECTOR__SAME_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

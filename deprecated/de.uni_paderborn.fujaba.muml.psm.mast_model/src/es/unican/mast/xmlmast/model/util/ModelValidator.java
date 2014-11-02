/**
 */
package es.unican.mast.xmlmast.model.util;

import es.unican.mast.xmlmast.model.*;

import java.math.BigInteger;

import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.unican.mast.xmlmast.model";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModelPackage.eINSTANCE;
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
			case ModelPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER:
				return validateAlarmClockSystemTimer((AlarmClockSystemTimer)value, diagnostics, context);
			case ModelPackage.BARRIER:
				return validateBarrier((Barrier)value, diagnostics, context);
			case ModelPackage.BURSTY_EXTERNAL_EVENT:
				return validateBurstyExternalEvent((BurstyExternalEvent)value, diagnostics, context);
			case ModelPackage.CHARACTER_PACKET_DRIVER:
				return validateCharacterPacketDriver((CharacterPacketDriver)value, diagnostics, context);
			case ModelPackage.COMPOSITE_OPERATION:
				return validateCompositeOperation((CompositeOperation)value, diagnostics, context);
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT:
				return validateCompositeTimingRequirement((CompositeTimingRequirement)value, diagnostics, context);
			case ModelPackage.CONCENTRATOR:
				return validateConcentrator((Concentrator)value, diagnostics, context);
			case ModelPackage.DELAY:
				return validateDelay((Delay)value, diagnostics, context);
			case ModelPackage.DELIVERY_SERVER:
				return validateDeliveryServer((DeliveryServer)value, diagnostics, context);
			case ModelPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ModelPackage.EDF_POLICY:
				return validateEDFPolicy((EDFPolicy)value, diagnostics, context);
			case ModelPackage.EDF_SCHEDULER:
				return validateEDFScheduler((EDFScheduler)value, diagnostics, context);
			case ModelPackage.ENCLOSING_OPERATION:
				return validateEnclosingOperation((EnclosingOperation)value, diagnostics, context);
			case ModelPackage.FIXED_PRIORITY_POLICY:
				return validateFixedPriorityPolicy((FixedPriorityPolicy)value, diagnostics, context);
			case ModelPackage.FIXED_PRIORITY_SCHEDULER:
				return validateFixedPriorityScheduler((FixedPriorityScheduler)value, diagnostics, context);
			case ModelPackage.FP_PACKET_BASED_SCHEDULER:
				return validateFPPacketBasedScheduler((FPPacketBasedScheduler)value, diagnostics, context);
			case ModelPackage.GLOBAL_MAX_MISS_RATIO:
				return validateGlobalMaxMissRatio((GlobalMaxMissRatio)value, diagnostics, context);
			case ModelPackage.HARD_GLOBAL_DEADLINE:
				return validateHardGlobalDeadline((HardGlobalDeadline)value, diagnostics, context);
			case ModelPackage.HARD_LOCAL_DEADLINE:
				return validateHardLocalDeadline((HardLocalDeadline)value, diagnostics, context);
			case ModelPackage.IMMEDIATE_CEILING_RESOURCE:
				return validateImmediateCeilingResource((ImmediateCeilingResource)value, diagnostics, context);
			case ModelPackage.INTERRUPT_FP_POLICY:
				return validateInterruptFPPolicy((InterruptFPPolicy)value, diagnostics, context);
			case ModelPackage.LIST_OF_DRIVERS:
				return validateListOfDrivers((ListOfDrivers)value, diagnostics, context);
			case ModelPackage.LOCAL_MAX_MISS_RATIO:
				return validateLocalMaxMissRatio((LocalMaxMissRatio)value, diagnostics, context);
			case ModelPackage.MASTMODEL_TYPE:
				return validateMASTMODELType((MASTMODELType)value, diagnostics, context);
			case ModelPackage.MAX_OUTPUT_JITTER_REQ:
				return validateMaxOutputJitterReq((MaxOutputJitterReq)value, diagnostics, context);
			case ModelPackage.MESSAGE_TRANSMISSION:
				return validateMessageTransmission((MessageTransmission)value, diagnostics, context);
			case ModelPackage.MULTICAST:
				return validateMulticast((Multicast)value, diagnostics, context);
			case ModelPackage.NON_PREEMPTIBLE_FP_POLICY:
				return validateNonPreemptibleFPPolicy((NonPreemptibleFPPolicy)value, diagnostics, context);
			case ModelPackage.OFFSET:
				return validateOffset((Offset)value, diagnostics, context);
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY:
				return validateOverriddenFixedPriority((OverriddenFixedPriority)value, diagnostics, context);
			case ModelPackage.OVERRIDDEN_PERMANENT_FP:
				return validateOverriddenPermanentFP((OverriddenPermanentFP)value, diagnostics, context);
			case ModelPackage.PACKET_BASED_NETWORK:
				return validatePacketBasedNetwork((PacketBasedNetwork)value, diagnostics, context);
			case ModelPackage.PACKET_DRIVER:
				return validatePacketDriver((PacketDriver)value, diagnostics, context);
			case ModelPackage.PERIODIC_EXTERNAL_EVENT:
				return validatePeriodicExternalEvent((PeriodicExternalEvent)value, diagnostics, context);
			case ModelPackage.POLLING_POLICY:
				return validatePollingPolicy((PollingPolicy)value, diagnostics, context);
			case ModelPackage.PRIMARY_SCHEDULER:
				return validatePrimaryScheduler((PrimaryScheduler)value, diagnostics, context);
			case ModelPackage.PRIORITY_INHERITANCE_RESOURCE:
				return validatePriorityInheritanceResource((PriorityInheritanceResource)value, diagnostics, context);
			case ModelPackage.QUERY_SERVER:
				return validateQueryServer((QueryServer)value, diagnostics, context);
			case ModelPackage.RATE_DIVISOR:
				return validateRateDivisor((RateDivisor)value, diagnostics, context);
			case ModelPackage.REGULAR_EVENT:
				return validateRegularEvent((RegularEvent)value, diagnostics, context);
			case ModelPackage.REGULAR_PROCESSOR:
				return validateRegularProcessor((RegularProcessor)value, diagnostics, context);
			case ModelPackage.REGULAR_SCHEDULING_SERVER:
				return validateRegularSchedulingServer((RegularSchedulingServer)value, diagnostics, context);
			case ModelPackage.REGULAR_TRANSACTION:
				return validateRegularTransaction((RegularTransaction)value, diagnostics, context);
			case ModelPackage.RTEP_PACKET_DRIVER:
				return validateRTEPPacketDriver((RTEPPacketDriver)value, diagnostics, context);
			case ModelPackage.SECONDARY_SCHEDULER:
				return validateSecondaryScheduler((SecondaryScheduler)value, diagnostics, context);
			case ModelPackage.SIMPLE_OPERATION:
				return validateSimpleOperation((SimpleOperation)value, diagnostics, context);
			case ModelPackage.SINGULAR_EXTERNAL_EVENT:
				return validateSingularExternalEvent((SingularExternalEvent)value, diagnostics, context);
			case ModelPackage.SOFT_GLOBAL_DEADLINE:
				return validateSoftGlobalDeadline((SoftGlobalDeadline)value, diagnostics, context);
			case ModelPackage.SOFT_LOCAL_DEADLINE:
				return validateSoftLocalDeadline((SoftLocalDeadline)value, diagnostics, context);
			case ModelPackage.SPORADIC_EXTERNAL_EVENT:
				return validateSporadicExternalEvent((SporadicExternalEvent)value, diagnostics, context);
			case ModelPackage.SPORADIC_SERVER_POLICY:
				return validateSporadicServerPolicy((SporadicServerPolicy)value, diagnostics, context);
			case ModelPackage.SRP_PARAMETERS:
				return validateSRPParameters((SRPParameters)value, diagnostics, context);
			case ModelPackage.SRP_RESOURCE:
				return validateSRPResource((SRPResource)value, diagnostics, context);
			case ModelPackage.SYSTEM_TIMED_ACTIVITY:
				return validateSystemTimedActivity((SystemTimedActivity)value, diagnostics, context);
			case ModelPackage.TICKER_SYSTEM_TIMER:
				return validateTickerSystemTimer((TickerSystemTimer)value, diagnostics, context);
			case ModelPackage.UNBOUNDED_EXTERNAL_EVENT:
				return validateUnboundedExternalEvent((UnboundedExternalEvent)value, diagnostics, context);
			case ModelPackage.AFFIRMATIVE_ASSERTION:
				return validateAffirmativeAssertion((AffirmativeAssertion)value, diagnostics, context);
			case ModelPackage.ASSERTION:
				return validateAssertion((Assertion)value, diagnostics, context);
			case ModelPackage.DELIVERY_POLICY:
				return validateDeliveryPolicy((DeliveryPolicy)value, diagnostics, context);
			case ModelPackage.DISTRIBUTION_TYPE:
				return validateDistributionType((DistributionType)value, diagnostics, context);
			case ModelPackage.NEGATIVE_ASSERTION:
				return validateNegativeAssertion((NegativeAssertion)value, diagnostics, context);
			case ModelPackage.OVERHEAD_TYPE:
				return validateOverheadType((OverheadType)value, diagnostics, context);
			case ModelPackage.PRIORITY_INHERITANCE_PROTOCOL:
				return validatePriorityInheritanceProtocol((PriorityInheritanceProtocol)value, diagnostics, context);
			case ModelPackage.REQUEST_POLICY:
				return validateRequestPolicy((RequestPolicy)value, diagnostics, context);
			case ModelPackage.TRANSMISSION_TYPE:
				return validateTransmissionType((TransmissionType)value, diagnostics, context);
			case ModelPackage.ABSOLUTE_TIME:
				return validateAbsoluteTime((Float)value, diagnostics, context);
			case ModelPackage.ABSOLUTE_TIME_OBJECT:
				return validateAbsoluteTimeObject((Float)value, diagnostics, context);
			case ModelPackage.AFFIRMATIVE_ASSERTION_OBJECT:
				return validateAffirmativeAssertionObject((AffirmativeAssertion)value, diagnostics, context);
			case ModelPackage.ANY_PRIORITY:
				return validateAnyPriority((BigInteger)value, diagnostics, context);
			case ModelPackage.ASSERTION_OBJECT:
				return validateAssertionObject((Assertion)value, diagnostics, context);
			case ModelPackage.BIT_COUNT:
				return validateBitCount((Float)value, diagnostics, context);
			case ModelPackage.BIT_COUNT_OBJECT:
				return validateBitCountObject((Float)value, diagnostics, context);
			case ModelPackage.DATE_TIME:
				return validateDateTime((XMLGregorianCalendar)value, diagnostics, context);
			case ModelPackage.DELIVERY_POLICY_OBJECT:
				return validateDeliveryPolicyObject((DeliveryPolicy)value, diagnostics, context);
			case ModelPackage.DISTRIBUTION_TYPE_OBJECT:
				return validateDistributionTypeObject((DistributionType)value, diagnostics, context);
			case ModelPackage.FLOAT:
				return validateFloat((Float)value, diagnostics, context);
			case ModelPackage.FLOAT_OBJECT:
				return validateFloatObject((Float)value, diagnostics, context);
			case ModelPackage.IDENTIFIER:
				return validateIdentifier((String)value, diagnostics, context);
			case ModelPackage.IDENTIFIER_REF:
				return validateIdentifierRef((String)value, diagnostics, context);
			case ModelPackage.IDENTIFIER_REF_LIST:
				return validateIdentifierRefList((List<?>)value, diagnostics, context);
			case ModelPackage.INTERRUPT_PRIORITY:
				return validateInterruptPriority((BigInteger)value, diagnostics, context);
			case ModelPackage.NATURAL:
				return validateNatural((BigInteger)value, diagnostics, context);
			case ModelPackage.NEGATIVE_ASSERTION_OBJECT:
				return validateNegativeAssertionObject((NegativeAssertion)value, diagnostics, context);
			case ModelPackage.NORMALIZED_EXECUTION_TIME:
				return validateNormalizedExecutionTime((Float)value, diagnostics, context);
			case ModelPackage.NORMALIZED_EXECUTION_TIME_OBJECT:
				return validateNormalizedExecutionTimeObject((Float)value, diagnostics, context);
			case ModelPackage.OVERHEAD_TYPE_OBJECT:
				return validateOverheadTypeObject((OverheadType)value, diagnostics, context);
			case ModelPackage.PATHNAME:
				return validatePathname((String)value, diagnostics, context);
			case ModelPackage.PERCENTAGE:
				return validatePercentage((Float)value, diagnostics, context);
			case ModelPackage.PERCENTAGE_OBJECT:
				return validatePercentageObject((Float)value, diagnostics, context);
			case ModelPackage.POSITIVE:
				return validatePositive((BigInteger)value, diagnostics, context);
			case ModelPackage.PREEMPTION_LEVEL:
				return validatePreemptionLevel((BigInteger)value, diagnostics, context);
			case ModelPackage.PRIORITY:
				return validatePriority((BigInteger)value, diagnostics, context);
			case ModelPackage.PRIORITY_INHERITANCE_PROTOCOL_OBJECT:
				return validatePriorityInheritanceProtocolObject((PriorityInheritanceProtocol)value, diagnostics, context);
			case ModelPackage.REQUEST_POLICY_OBJECT:
				return validateRequestPolicyObject((RequestPolicy)value, diagnostics, context);
			case ModelPackage.THROUGHPUT:
				return validateThroughput((Float)value, diagnostics, context);
			case ModelPackage.THROUGHPUT_OBJECT:
				return validateThroughputObject((Float)value, diagnostics, context);
			case ModelPackage.TIME:
				return validateTime((Float)value, diagnostics, context);
			case ModelPackage.TIME_OBJECT:
				return validateTimeObject((Float)value, diagnostics, context);
			case ModelPackage.TRANSMISSION_TYPE_OBJECT:
				return validateTransmissionTypeObject((TransmissionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlarmClockSystemTimer(AlarmClockSystemTimer alarmClockSystemTimer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alarmClockSystemTimer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBarrier(Barrier barrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(barrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBurstyExternalEvent(BurstyExternalEvent burstyExternalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(burstyExternalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterPacketDriver(CharacterPacketDriver characterPacketDriver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterPacketDriver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeOperation(CompositeOperation compositeOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeTimingRequirement(CompositeTimingRequirement compositeTimingRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeTimingRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcentrator(Concentrator concentrator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concentrator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delay, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryServer(DeliveryServer deliveryServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deliveryServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDFPolicy(EDFPolicy edfPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edfPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDFScheduler(EDFScheduler edfScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edfScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnclosingOperation(EnclosingOperation enclosingOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enclosingOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPriorityPolicy(FixedPriorityPolicy fixedPriorityPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPriorityPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPriorityScheduler(FixedPriorityScheduler fixedPriorityScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPriorityScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFPPacketBasedScheduler(FPPacketBasedScheduler fpPacketBasedScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fpPacketBasedScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalMaxMissRatio(GlobalMaxMissRatio globalMaxMissRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalMaxMissRatio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardGlobalDeadline(HardGlobalDeadline hardGlobalDeadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardGlobalDeadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardLocalDeadline(HardLocalDeadline hardLocalDeadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardLocalDeadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmediateCeilingResource(ImmediateCeilingResource immediateCeilingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immediateCeilingResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptFPPolicy(InterruptFPPolicy interruptFPPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interruptFPPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOfDrivers(ListOfDrivers listOfDrivers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listOfDrivers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalMaxMissRatio(LocalMaxMissRatio localMaxMissRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localMaxMissRatio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMASTMODELType(MASTMODELType mastmodelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mastmodelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxOutputJitterReq(MaxOutputJitterReq maxOutputJitterReq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maxOutputJitterReq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTransmission(MessageTransmission messageTransmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageTransmission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticast(Multicast multicast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multicast, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonPreemptibleFPPolicy(NonPreemptibleFPPolicy nonPreemptibleFPPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonPreemptibleFPPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffset(Offset offset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverriddenFixedPriority(OverriddenFixedPriority overriddenFixedPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overriddenFixedPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverriddenPermanentFP(OverriddenPermanentFP overriddenPermanentFP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overriddenPermanentFP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePacketBasedNetwork(PacketBasedNetwork packetBasedNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packetBasedNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePacketDriver(PacketDriver packetDriver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packetDriver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicExternalEvent(PeriodicExternalEvent periodicExternalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicExternalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePollingPolicy(PollingPolicy pollingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pollingPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryScheduler(PrimaryScheduler primaryScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaryScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityInheritanceResource(PriorityInheritanceResource priorityInheritanceResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorityInheritanceResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryServer(QueryServer queryServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateDivisor(RateDivisor rateDivisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateDivisor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularEvent(RegularEvent regularEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularProcessor(RegularProcessor regularProcessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularProcessor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularSchedulingServer(RegularSchedulingServer regularSchedulingServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularSchedulingServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularTransaction(RegularTransaction regularTransaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularTransaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTEPPacketDriver(RTEPPacketDriver rtepPacketDriver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtepPacketDriver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondaryScheduler(SecondaryScheduler secondaryScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondaryScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleOperation(SimpleOperation simpleOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingularExternalEvent(SingularExternalEvent singularExternalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singularExternalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftGlobalDeadline(SoftGlobalDeadline softGlobalDeadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softGlobalDeadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftLocalDeadline(SoftLocalDeadline softLocalDeadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softLocalDeadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSporadicExternalEvent(SporadicExternalEvent sporadicExternalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sporadicExternalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSporadicServerPolicy(SporadicServerPolicy sporadicServerPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sporadicServerPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSRPParameters(SRPParameters srpParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(srpParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSRPResource(SRPResource srpResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(srpResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemTimedActivity(SystemTimedActivity systemTimedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemTimedActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTickerSystemTimer(TickerSystemTimer tickerSystemTimer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tickerSystemTimer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnboundedExternalEvent(UnboundedExternalEvent unboundedExternalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unboundedExternalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffirmativeAssertion(AffirmativeAssertion affirmativeAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertion(Assertion assertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryPolicy(DeliveryPolicy deliveryPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionType(DistributionType distributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeAssertion(NegativeAssertion negativeAssertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverheadType(OverheadType overheadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityInheritanceProtocol(PriorityInheritanceProtocol priorityInheritanceProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestPolicy(RequestPolicy requestPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionType(TransmissionType transmissionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsoluteTime(float absoluteTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAbsoluteTime_Min(absoluteTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAbsoluteTime_Min
	 */
	public static final float ABSOLUTE_TIME__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Absolute Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsoluteTime_Min(float absoluteTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = absoluteTime >= ABSOLUTE_TIME__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.ABSOLUTE_TIME, absoluteTime, ABSOLUTE_TIME__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsoluteTimeObject(Float absoluteTimeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAbsoluteTime_Min(absoluteTimeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffirmativeAssertionObject(AffirmativeAssertion affirmativeAssertionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyPriority(BigInteger anyPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(anyPriority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionObject(Assertion assertionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitCount(float bitCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBitCount_Min(bitCount, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBitCount_Min
	 */
	public static final float BIT_COUNT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Bit Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitCount_Min(float bitCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = bitCount >= BIT_COUNT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.BIT_COUNT, bitCount, BIT_COUNT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitCountObject(Float bitCountObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBitCount_Min(bitCountObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(XMLGregorianCalendar dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryPolicyObject(DeliveryPolicy deliveryPolicyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionTypeObject(DistributionType distributionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatObject(Float floatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(String identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdentifier_Pattern(identifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdentifier_Pattern
	 */
	public static final  PatternMatcher [][] IDENTIFIER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier_Pattern(String identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ModelPackage.Literals.IDENTIFIER, identifier, IDENTIFIER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierRef(String identifierRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdentifier_Pattern(identifierRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierRefList(List<?> identifierRefList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKENS_MinLength(identifierRefList, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateNMTOKENSBase_ItemType(identifierRefList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptPriority(BigInteger interruptPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(interruptPriority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNatural(BigInteger natural, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(natural, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeAssertionObject(NegativeAssertion negativeAssertionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizedExecutionTime(float normalizedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNormalizedExecutionTime_Min(normalizedExecutionTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNormalizedExecutionTime_Min
	 */
	public static final float NORMALIZED_EXECUTION_TIME__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Normalized Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizedExecutionTime_Min(float normalizedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = normalizedExecutionTime >= NORMALIZED_EXECUTION_TIME__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.NORMALIZED_EXECUTION_TIME, normalizedExecutionTime, NORMALIZED_EXECUTION_TIME__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizedExecutionTimeObject(Float normalizedExecutionTimeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNormalizedExecutionTime_Min(normalizedExecutionTimeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverheadTypeObject(OverheadType overheadTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathname(String pathname, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentage(float percentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentage_Min(percentage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentage_Max(percentage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentage_Min
	 */
	public static final float PERCENTAGE__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentage_Min(float percentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentage >= PERCENTAGE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.PERCENTAGE, percentage, PERCENTAGE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentage_Max
	 */
	public static final float PERCENTAGE__MAX__VALUE = 100.0F;

	/**
	 * Validates the Max constraint of '<em>Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentage_Max(float percentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentage <= PERCENTAGE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(ModelPackage.Literals.PERCENTAGE, percentage, PERCENTAGE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageObject(Float percentageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentage_Min(percentageObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentage_Max(percentageObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositive(BigInteger positive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreemptionLevel(BigInteger preemptionLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(preemptionLevel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority(BigInteger priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(priority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityInheritanceProtocolObject(PriorityInheritanceProtocol priorityInheritanceProtocolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestPolicyObject(RequestPolicy requestPolicyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughput(float throughput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateThroughput_Min(throughput, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateThroughput_Min
	 */
	public static final float THROUGHPUT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Throughput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughput_Min(float throughput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = throughput >= THROUGHPUT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.THROUGHPUT, throughput, THROUGHPUT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughputObject(Float throughputObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateThroughput_Min(throughputObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(float time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTime_Min(time, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTime_Min
	 */
	public static final float TIME__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_Min(float time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = time >= TIME__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.TIME, time, TIME__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeObject(Float timeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTime_Min(timeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionTypeObject(TransmissionType transmissionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //ModelValidator

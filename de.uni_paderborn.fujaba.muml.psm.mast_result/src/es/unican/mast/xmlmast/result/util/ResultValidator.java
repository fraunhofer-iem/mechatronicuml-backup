/**
 */
package es.unican.mast.xmlmast.result.util;

import es.unican.mast.xmlmast.result.*;

import java.math.BigInteger;

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
 * @see es.unican.mast.xmlmast.result.ResultPackage
 * @generated
 */
public class ResultValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ResultValidator INSTANCE = new ResultValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.unican.mast.xmlmast.result";

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
	public ResultValidator() {
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
	  return ResultPackage.eINSTANCE;
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
			case ResultPackage.DETAILED_UTILIZATION:
				return validateDetailedUtilization((DetailedUtilization)value, diagnostics, context);
			case ResultPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ResultPackage.EDF_POLICY:
				return validateEDFPolicy((EDFPolicy)value, diagnostics, context);
			case ResultPackage.FIXED_PRIORITY_POLICY:
				return validateFixedPriorityPolicy((FixedPriorityPolicy)value, diagnostics, context);
			case ResultPackage.GLOBAL_MISS_RATIO:
				return validateGlobalMissRatio((GlobalMissRatio)value, diagnostics, context);
			case ResultPackage.GLOBAL_MISS_RATIO_LIST:
				return validateGlobalMissRatioList((GlobalMissRatioList)value, diagnostics, context);
			case ResultPackage.GLOBAL_RESPONSE_TIME:
				return validateGlobalResponseTime((GlobalResponseTime)value, diagnostics, context);
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST:
				return validateGlobalResponseTimeList((GlobalResponseTimeList)value, diagnostics, context);
			case ResultPackage.INTERRUPT_FP_POLICY:
				return validateInterruptFPPolicy((InterruptFPPolicy)value, diagnostics, context);
			case ResultPackage.MISS_RATIO:
				return validateMissRatio((MissRatio)value, diagnostics, context);
			case ResultPackage.MISS_RATIO_LIST:
				return validateMissRatioList((MissRatioList)value, diagnostics, context);
			case ResultPackage.NON_PREEMPTIBLE_FP_POLICY:
				return validateNonPreemptibleFPPolicy((NonPreemptibleFPPolicy)value, diagnostics, context);
			case ResultPackage.OPERATION_RESULTS:
				return validateOperationResults((OperationResults)value, diagnostics, context);
			case ResultPackage.POLLING_POLICY:
				return validatePollingPolicy((PollingPolicy)value, diagnostics, context);
			case ResultPackage.PREEMPTION_LEVEL:
				return validatePreemptionLevel((PreemptionLevel)value, diagnostics, context);
			case ResultPackage.PRIORITY_CEILING:
				return validatePriorityCeiling((PriorityCeiling)value, diagnostics, context);
			case ResultPackage.PROCESSING_RESOURCE_RESULTS:
				return validateProcessingResourceResults((ProcessingResourceResults)value, diagnostics, context);
			case ResultPackage.QUEUE_SIZE:
				return validateQueueSize((QueueSize)value, diagnostics, context);
			case ResultPackage.READY_QUEUE_SIZE:
				return validateReadyQueueSize((ReadyQueueSize)value, diagnostics, context);
			case ResultPackage.REALTIMESITUATION_TYPE:
				return validateREALTIMESITUATIONType((REALTIMESITUATIONType)value, diagnostics, context);
			case ResultPackage.SCHEDULING_SERVER_RESULTS:
				return validateSchedulingServerResults((SchedulingServerResults)value, diagnostics, context);
			case ResultPackage.SHARED_RESOURCE_RESULTS:
				return validateSharedResourceResults((SharedResourceResults)value, diagnostics, context);
			case ResultPackage.SIMULATION_TIMING_RESULT:
				return validateSimulationTimingResult((SimulationTimingResult)value, diagnostics, context);
			case ResultPackage.SLACK:
				return validateSlack((Slack)value, diagnostics, context);
			case ResultPackage.SPORADIC_SERVER_POLICY:
				return validateSporadicServerPolicy((SporadicServerPolicy)value, diagnostics, context);
			case ResultPackage.SRP_PARAMETERS:
				return validateSRPParameters((SRPParameters)value, diagnostics, context);
			case ResultPackage.TIMING_RESULT:
				return validateTimingResult((TimingResult)value, diagnostics, context);
			case ResultPackage.TRACE:
				return validateTrace((Trace)value, diagnostics, context);
			case ResultPackage.TRANSACTION_RESULTS:
				return validateTransactionResults((TransactionResults)value, diagnostics, context);
			case ResultPackage.UTILIZATION:
				return validateUtilization((Utilization)value, diagnostics, context);
			case ResultPackage.AFFIRMATIVE_ASSERTION:
				return validateAffirmativeAssertion((AffirmativeAssertion)value, diagnostics, context);
			case ResultPackage.ASSERTION:
				return validateAssertion((Assertion)value, diagnostics, context);
			case ResultPackage.AFFIRMATIVE_ASSERTION_OBJECT:
				return validateAffirmativeAssertionObject((AffirmativeAssertion)value, diagnostics, context);
			case ResultPackage.ASSERTION_OBJECT:
				return validateAssertionObject((Assertion)value, diagnostics, context);
			case ResultPackage.DATE_TIME:
				return validateDateTime((XMLGregorianCalendar)value, diagnostics, context);
			case ResultPackage.EXTERNAL_REFERENCE:
				return validateExternalReference((String)value, diagnostics, context);
			case ResultPackage.FACTOR:
				return validateFactor((Float)value, diagnostics, context);
			case ResultPackage.FACTOR_OBJECT:
				return validateFactorObject((Float)value, diagnostics, context);
			case ResultPackage.IDENTIFIER:
				return validateIdentifier((String)value, diagnostics, context);
			case ResultPackage.NATURAL:
				return validateNatural((BigInteger)value, diagnostics, context);
			case ResultPackage.NORMALIZED_EXECUTION_TIME:
				return validateNormalizedExecutionTime((Float)value, diagnostics, context);
			case ResultPackage.NORMALIZED_EXECUTION_TIME_OBJECT:
				return validateNormalizedExecutionTimeObject((Float)value, diagnostics, context);
			case ResultPackage.PERCENTAGE:
				return validatePercentage((Float)value, diagnostics, context);
			case ResultPackage.PERCENTAGE_OBJECT:
				return validatePercentageObject((Float)value, diagnostics, context);
			case ResultPackage.POSITIVE:
				return validatePositive((BigInteger)value, diagnostics, context);
			case ResultPackage.PREEMPTION_LEVEL_TYPE:
				return validatePreemptionLevelType((BigInteger)value, diagnostics, context);
			case ResultPackage.PRIORITY:
				return validatePriority((Integer)value, diagnostics, context);
			case ResultPackage.PRIORITY_OBJECT:
				return validatePriorityObject((Integer)value, diagnostics, context);
			case ResultPackage.SIGNED_PERCENTAGE:
				return validateSignedPercentage((Float)value, diagnostics, context);
			case ResultPackage.SIGNED_PERCENTAGE_OBJECT:
				return validateSignedPercentageObject((Float)value, diagnostics, context);
			case ResultPackage.TIME:
				return validateTime((Float)value, diagnostics, context);
			case ResultPackage.TIME_OBJECT:
				return validateTimeObject((Float)value, diagnostics, context);
			case ResultPackage.UNRESTRICTED_PERCENTAGE:
				return validateUnrestrictedPercentage((Float)value, diagnostics, context);
			case ResultPackage.UNRESTRICTED_PERCENTAGE_OBJECT:
				return validateUnrestrictedPercentageObject((Float)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailedUtilization(DetailedUtilization detailedUtilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detailedUtilization, diagnostics, context);
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
	public boolean validateFixedPriorityPolicy(FixedPriorityPolicy fixedPriorityPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPriorityPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalMissRatio(GlobalMissRatio globalMissRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalMissRatio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalMissRatioList(GlobalMissRatioList globalMissRatioList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalMissRatioList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalResponseTime(GlobalResponseTime globalResponseTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalResponseTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalResponseTimeList(GlobalResponseTimeList globalResponseTimeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalResponseTimeList, diagnostics, context);
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
	public boolean validateMissRatio(MissRatio missRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missRatio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissRatioList(MissRatioList missRatioList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missRatioList, diagnostics, context);
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
	public boolean validateOperationResults(OperationResults operationResults, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationResults, diagnostics, context);
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
	public boolean validatePreemptionLevel(PreemptionLevel preemptionLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preemptionLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityCeiling(PriorityCeiling priorityCeiling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorityCeiling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingResourceResults(ProcessingResourceResults processingResourceResults, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingResourceResults, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueueSize(QueueSize queueSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queueSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadyQueueSize(ReadyQueueSize readyQueueSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(readyQueueSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALTIMESITUATIONType(REALTIMESITUATIONType realtimesituationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realtimesituationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingServerResults(SchedulingServerResults schedulingServerResults, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulingServerResults, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedResourceResults(SharedResourceResults sharedResourceResults, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharedResourceResults, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulationTimingResult(SimulationTimingResult simulationTimingResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simulationTimingResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlack(Slack slack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slack, diagnostics, context);
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
	public boolean validateTimingResult(TimingResult timingResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionResults(TransactionResults transactionResults, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionResults, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUtilization(Utilization utilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(utilization, diagnostics, context);
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
	public boolean validateAffirmativeAssertionObject(AffirmativeAssertion affirmativeAssertionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateDateTime(XMLGregorianCalendar dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference(String externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExternalReference_Pattern(externalReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExternalReference_Pattern
	 */
	public static final  PatternMatcher [][] EXTERNAL_REFERENCE__PATTERN__VALUES =
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
	 * Validates the Pattern constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_Pattern(String externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ResultPackage.Literals.EXTERNAL_REFERENCE, externalReference, EXTERNAL_REFERENCE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactor(float factor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFactor_Min(factor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFactor_Min
	 */
	public static final float FACTOR__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactor_Min(float factor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = factor > FACTOR__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ResultPackage.Literals.FACTOR, factor, FACTOR__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactorObject(Float factorObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFactor_Min(factorObject, diagnostics, context);
		return result;
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
		return validatePattern(ResultPackage.Literals.IDENTIFIER, identifier, IDENTIFIER__PATTERN__VALUES, diagnostics, context);
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
			reportMinViolation(ResultPackage.Literals.NORMALIZED_EXECUTION_TIME, normalizedExecutionTime, NORMALIZED_EXECUTION_TIME__MIN__VALUE, true, diagnostics, context);
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
			reportMinViolation(ResultPackage.Literals.PERCENTAGE, percentage, PERCENTAGE__MIN__VALUE, true, diagnostics, context);
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
			reportMaxViolation(ResultPackage.Literals.PERCENTAGE, percentage, PERCENTAGE__MAX__VALUE, true, diagnostics, context);
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
	public boolean validatePreemptionLevelType(BigInteger preemptionLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(preemptionLevelType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority(int priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePriority_Min(priority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePriority_Min
	 */
	public static final int PRIORITY__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority_Min(int priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = priority >= PRIORITY__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ResultPackage.Literals.PRIORITY, priority, PRIORITY__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityObject(Integer priorityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePriority_Min(priorityObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignedPercentage(float signedPercentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignedPercentage_Min(signedPercentage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignedPercentage_Max(signedPercentage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignedPercentage_Min
	 */
	public static final float SIGNED_PERCENTAGE__MIN__VALUE = -100.0F;

	/**
	 * Validates the Min constraint of '<em>Signed Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignedPercentage_Min(float signedPercentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = signedPercentage >= SIGNED_PERCENTAGE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ResultPackage.Literals.SIGNED_PERCENTAGE, signedPercentage, SIGNED_PERCENTAGE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSignedPercentage_Max
	 */
	public static final float SIGNED_PERCENTAGE__MAX__VALUE = 100.0F;

	/**
	 * Validates the Max constraint of '<em>Signed Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignedPercentage_Max(float signedPercentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = signedPercentage <= SIGNED_PERCENTAGE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(ResultPackage.Literals.SIGNED_PERCENTAGE, signedPercentage, SIGNED_PERCENTAGE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignedPercentageObject(Float signedPercentageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSignedPercentage_Min(signedPercentageObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignedPercentage_Max(signedPercentageObject, diagnostics, context);
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
			reportMinViolation(ResultPackage.Literals.TIME, time, TIME__MIN__VALUE, true, diagnostics, context);
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
	public boolean validateUnrestrictedPercentage(float unrestrictedPercentage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnrestrictedPercentageObject(Float unrestrictedPercentageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ResultValidator

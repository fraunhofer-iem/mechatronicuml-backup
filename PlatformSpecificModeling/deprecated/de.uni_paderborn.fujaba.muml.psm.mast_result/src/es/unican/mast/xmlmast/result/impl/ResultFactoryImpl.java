/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.*;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultFactoryImpl extends EFactoryImpl implements ResultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultFactory init() {
		try {
			ResultFactory theResultFactory = (ResultFactory)EPackage.Registry.INSTANCE.getEFactory(ResultPackage.eNS_URI);
			if (theResultFactory != null) {
				return theResultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResultPackage.DETAILED_UTILIZATION: return createDetailedUtilization();
			case ResultPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ResultPackage.EDF_POLICY: return createEDFPolicy();
			case ResultPackage.FIXED_PRIORITY_POLICY: return createFixedPriorityPolicy();
			case ResultPackage.GLOBAL_MISS_RATIO: return createGlobalMissRatio();
			case ResultPackage.GLOBAL_MISS_RATIO_LIST: return createGlobalMissRatioList();
			case ResultPackage.GLOBAL_RESPONSE_TIME: return createGlobalResponseTime();
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST: return createGlobalResponseTimeList();
			case ResultPackage.INTERRUPT_FP_POLICY: return createInterruptFPPolicy();
			case ResultPackage.MISS_RATIO: return createMissRatio();
			case ResultPackage.MISS_RATIO_LIST: return createMissRatioList();
			case ResultPackage.NON_PREEMPTIBLE_FP_POLICY: return createNonPreemptibleFPPolicy();
			case ResultPackage.OPERATION_RESULTS: return createOperationResults();
			case ResultPackage.POLLING_POLICY: return createPollingPolicy();
			case ResultPackage.PREEMPTION_LEVEL: return createPreemptionLevel();
			case ResultPackage.PRIORITY_CEILING: return createPriorityCeiling();
			case ResultPackage.PROCESSING_RESOURCE_RESULTS: return createProcessingResourceResults();
			case ResultPackage.QUEUE_SIZE: return createQueueSize();
			case ResultPackage.READY_QUEUE_SIZE: return createReadyQueueSize();
			case ResultPackage.REALTIMESITUATION_TYPE: return createREALTIMESITUATIONType();
			case ResultPackage.SCHEDULING_SERVER_RESULTS: return createSchedulingServerResults();
			case ResultPackage.SHARED_RESOURCE_RESULTS: return createSharedResourceResults();
			case ResultPackage.SIMULATION_TIMING_RESULT: return createSimulationTimingResult();
			case ResultPackage.SLACK: return createSlack();
			case ResultPackage.SPORADIC_SERVER_POLICY: return createSporadicServerPolicy();
			case ResultPackage.SRP_PARAMETERS: return createSRPParameters();
			case ResultPackage.TIMING_RESULT: return createTimingResult();
			case ResultPackage.TRACE: return createTrace();
			case ResultPackage.TRANSACTION_RESULTS: return createTransactionResults();
			case ResultPackage.UTILIZATION: return createUtilization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ResultPackage.AFFIRMATIVE_ASSERTION:
				return createAffirmativeAssertionFromString(eDataType, initialValue);
			case ResultPackage.ASSERTION:
				return createAssertionFromString(eDataType, initialValue);
			case ResultPackage.AFFIRMATIVE_ASSERTION_OBJECT:
				return createAffirmativeAssertionObjectFromString(eDataType, initialValue);
			case ResultPackage.ASSERTION_OBJECT:
				return createAssertionObjectFromString(eDataType, initialValue);
			case ResultPackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case ResultPackage.EXTERNAL_REFERENCE:
				return createExternalReferenceFromString(eDataType, initialValue);
			case ResultPackage.FACTOR:
				return createFactorFromString(eDataType, initialValue);
			case ResultPackage.FACTOR_OBJECT:
				return createFactorObjectFromString(eDataType, initialValue);
			case ResultPackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case ResultPackage.NATURAL:
				return createNaturalFromString(eDataType, initialValue);
			case ResultPackage.NORMALIZED_EXECUTION_TIME:
				return createNormalizedExecutionTimeFromString(eDataType, initialValue);
			case ResultPackage.NORMALIZED_EXECUTION_TIME_OBJECT:
				return createNormalizedExecutionTimeObjectFromString(eDataType, initialValue);
			case ResultPackage.PERCENTAGE:
				return createPercentageFromString(eDataType, initialValue);
			case ResultPackage.PERCENTAGE_OBJECT:
				return createPercentageObjectFromString(eDataType, initialValue);
			case ResultPackage.POSITIVE:
				return createPositiveFromString(eDataType, initialValue);
			case ResultPackage.PREEMPTION_LEVEL_TYPE:
				return createPreemptionLevelTypeFromString(eDataType, initialValue);
			case ResultPackage.PRIORITY:
				return createPriorityFromString(eDataType, initialValue);
			case ResultPackage.PRIORITY_OBJECT:
				return createPriorityObjectFromString(eDataType, initialValue);
			case ResultPackage.SIGNED_PERCENTAGE:
				return createSignedPercentageFromString(eDataType, initialValue);
			case ResultPackage.SIGNED_PERCENTAGE_OBJECT:
				return createSignedPercentageObjectFromString(eDataType, initialValue);
			case ResultPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			case ResultPackage.TIME_OBJECT:
				return createTimeObjectFromString(eDataType, initialValue);
			case ResultPackage.UNRESTRICTED_PERCENTAGE:
				return createUnrestrictedPercentageFromString(eDataType, initialValue);
			case ResultPackage.UNRESTRICTED_PERCENTAGE_OBJECT:
				return createUnrestrictedPercentageObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ResultPackage.AFFIRMATIVE_ASSERTION:
				return convertAffirmativeAssertionToString(eDataType, instanceValue);
			case ResultPackage.ASSERTION:
				return convertAssertionToString(eDataType, instanceValue);
			case ResultPackage.AFFIRMATIVE_ASSERTION_OBJECT:
				return convertAffirmativeAssertionObjectToString(eDataType, instanceValue);
			case ResultPackage.ASSERTION_OBJECT:
				return convertAssertionObjectToString(eDataType, instanceValue);
			case ResultPackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case ResultPackage.EXTERNAL_REFERENCE:
				return convertExternalReferenceToString(eDataType, instanceValue);
			case ResultPackage.FACTOR:
				return convertFactorToString(eDataType, instanceValue);
			case ResultPackage.FACTOR_OBJECT:
				return convertFactorObjectToString(eDataType, instanceValue);
			case ResultPackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case ResultPackage.NATURAL:
				return convertNaturalToString(eDataType, instanceValue);
			case ResultPackage.NORMALIZED_EXECUTION_TIME:
				return convertNormalizedExecutionTimeToString(eDataType, instanceValue);
			case ResultPackage.NORMALIZED_EXECUTION_TIME_OBJECT:
				return convertNormalizedExecutionTimeObjectToString(eDataType, instanceValue);
			case ResultPackage.PERCENTAGE:
				return convertPercentageToString(eDataType, instanceValue);
			case ResultPackage.PERCENTAGE_OBJECT:
				return convertPercentageObjectToString(eDataType, instanceValue);
			case ResultPackage.POSITIVE:
				return convertPositiveToString(eDataType, instanceValue);
			case ResultPackage.PREEMPTION_LEVEL_TYPE:
				return convertPreemptionLevelTypeToString(eDataType, instanceValue);
			case ResultPackage.PRIORITY:
				return convertPriorityToString(eDataType, instanceValue);
			case ResultPackage.PRIORITY_OBJECT:
				return convertPriorityObjectToString(eDataType, instanceValue);
			case ResultPackage.SIGNED_PERCENTAGE:
				return convertSignedPercentageToString(eDataType, instanceValue);
			case ResultPackage.SIGNED_PERCENTAGE_OBJECT:
				return convertSignedPercentageObjectToString(eDataType, instanceValue);
			case ResultPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			case ResultPackage.TIME_OBJECT:
				return convertTimeObjectToString(eDataType, instanceValue);
			case ResultPackage.UNRESTRICTED_PERCENTAGE:
				return convertUnrestrictedPercentageToString(eDataType, instanceValue);
			case ResultPackage.UNRESTRICTED_PERCENTAGE_OBJECT:
				return convertUnrestrictedPercentageObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedUtilization createDetailedUtilization() {
		DetailedUtilizationImpl detailedUtilization = new DetailedUtilizationImpl();
		return detailedUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFPolicy createEDFPolicy() {
		EDFPolicyImpl edfPolicy = new EDFPolicyImpl();
		return edfPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityPolicy createFixedPriorityPolicy() {
		FixedPriorityPolicyImpl fixedPriorityPolicy = new FixedPriorityPolicyImpl();
		return fixedPriorityPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMissRatio createGlobalMissRatio() {
		GlobalMissRatioImpl globalMissRatio = new GlobalMissRatioImpl();
		return globalMissRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMissRatioList createGlobalMissRatioList() {
		GlobalMissRatioListImpl globalMissRatioList = new GlobalMissRatioListImpl();
		return globalMissRatioList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalResponseTime createGlobalResponseTime() {
		GlobalResponseTimeImpl globalResponseTime = new GlobalResponseTimeImpl();
		return globalResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalResponseTimeList createGlobalResponseTimeList() {
		GlobalResponseTimeListImpl globalResponseTimeList = new GlobalResponseTimeListImpl();
		return globalResponseTimeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptFPPolicy createInterruptFPPolicy() {
		InterruptFPPolicyImpl interruptFPPolicy = new InterruptFPPolicyImpl();
		return interruptFPPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissRatio createMissRatio() {
		MissRatioImpl missRatio = new MissRatioImpl();
		return missRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissRatioList createMissRatioList() {
		MissRatioListImpl missRatioList = new MissRatioListImpl();
		return missRatioList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPreemptibleFPPolicy createNonPreemptibleFPPolicy() {
		NonPreemptibleFPPolicyImpl nonPreemptibleFPPolicy = new NonPreemptibleFPPolicyImpl();
		return nonPreemptibleFPPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationResults createOperationResults() {
		OperationResultsImpl operationResults = new OperationResultsImpl();
		return operationResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollingPolicy createPollingPolicy() {
		PollingPolicyImpl pollingPolicy = new PollingPolicyImpl();
		return pollingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreemptionLevel createPreemptionLevel() {
		PreemptionLevelImpl preemptionLevel = new PreemptionLevelImpl();
		return preemptionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityCeiling createPriorityCeiling() {
		PriorityCeilingImpl priorityCeiling = new PriorityCeilingImpl();
		return priorityCeiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceResults createProcessingResourceResults() {
		ProcessingResourceResultsImpl processingResourceResults = new ProcessingResourceResultsImpl();
		return processingResourceResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueSize createQueueSize() {
		QueueSizeImpl queueSize = new QueueSizeImpl();
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadyQueueSize createReadyQueueSize() {
		ReadyQueueSizeImpl readyQueueSize = new ReadyQueueSizeImpl();
		return readyQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALTIMESITUATIONType createREALTIMESITUATIONType() {
		REALTIMESITUATIONTypeImpl realtimesituationType = new REALTIMESITUATIONTypeImpl();
		return realtimesituationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingServerResults createSchedulingServerResults() {
		SchedulingServerResultsImpl schedulingServerResults = new SchedulingServerResultsImpl();
		return schedulingServerResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedResourceResults createSharedResourceResults() {
		SharedResourceResultsImpl sharedResourceResults = new SharedResourceResultsImpl();
		return sharedResourceResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTimingResult createSimulationTimingResult() {
		SimulationTimingResultImpl simulationTimingResult = new SimulationTimingResultImpl();
		return simulationTimingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slack createSlack() {
		SlackImpl slack = new SlackImpl();
		return slack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicServerPolicy createSporadicServerPolicy() {
		SporadicServerPolicyImpl sporadicServerPolicy = new SporadicServerPolicyImpl();
		return sporadicServerPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRPParameters createSRPParameters() {
		SRPParametersImpl srpParameters = new SRPParametersImpl();
		return srpParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingResult createTimingResult() {
		TimingResultImpl timingResult = new TimingResultImpl();
		return timingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionResults createTransactionResults() {
		TransactionResultsImpl transactionResults = new TransactionResultsImpl();
		return transactionResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilization createUtilization() {
		UtilizationImpl utilization = new UtilizationImpl();
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffirmativeAssertion createAffirmativeAssertionFromString(EDataType eDataType, String initialValue) {
		AffirmativeAssertion result = AffirmativeAssertion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffirmativeAssertionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertionFromString(EDataType eDataType, String initialValue) {
		Assertion result = Assertion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffirmativeAssertion createAffirmativeAssertionObjectFromString(EDataType eDataType, String initialValue) {
		return createAffirmativeAssertionFromString(ResultPackage.Literals.AFFIRMATIVE_ASSERTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffirmativeAssertionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAffirmativeAssertionToString(ResultPackage.Literals.AFFIRMATIVE_ASSERTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertionObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionFromString(ResultPackage.Literals.ASSERTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionToString(ResultPackage.Literals.ASSERTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExternalReferenceFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalReferenceToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFactorFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFactorToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFactorObjectFromString(EDataType eDataType, String initialValue) {
		return createFactorFromString(ResultPackage.Literals.FACTOR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFactorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFactorToString(ResultPackage.Literals.FACTOR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNaturalFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNaturalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNormalizedExecutionTimeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalizedExecutionTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNormalizedExecutionTimeObjectFromString(EDataType eDataType, String initialValue) {
		return createNormalizedExecutionTimeFromString(ResultPackage.Literals.NORMALIZED_EXECUTION_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalizedExecutionTimeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNormalizedExecutionTimeToString(ResultPackage.Literals.NORMALIZED_EXECUTION_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPercentageFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPercentageObjectFromString(EDataType eDataType, String initialValue) {
		return createPercentageFromString(ResultPackage.Literals.PERCENTAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPercentageToString(ResultPackage.Literals.PERCENTAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPreemptionLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptionLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPriorityFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPriorityObjectFromString(EDataType eDataType, String initialValue) {
		return createPriorityFromString(ResultPackage.Literals.PRIORITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPriorityToString(ResultPackage.Literals.PRIORITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createSignedPercentageFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignedPercentageToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createSignedPercentageObjectFromString(EDataType eDataType, String initialValue) {
		return createSignedPercentageFromString(ResultPackage.Literals.SIGNED_PERCENTAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignedPercentageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignedPercentageToString(ResultPackage.Literals.SIGNED_PERCENTAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createTimeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createTimeObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeFromString(ResultPackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeToString(ResultPackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createUnrestrictedPercentageFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnrestrictedPercentageToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createUnrestrictedPercentageObjectFromString(EDataType eDataType, String initialValue) {
		return createUnrestrictedPercentageFromString(ResultPackage.Literals.UNRESTRICTED_PERCENTAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnrestrictedPercentageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnrestrictedPercentageToString(ResultPackage.Literals.UNRESTRICTED_PERCENTAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultPackage getResultPackage() {
		return (ResultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultPackage getPackage() {
		return ResultPackage.eINSTANCE;
	}

} //ResultFactoryImpl

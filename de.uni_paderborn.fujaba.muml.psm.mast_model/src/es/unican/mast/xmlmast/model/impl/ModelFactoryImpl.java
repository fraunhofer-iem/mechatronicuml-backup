/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.*;

import java.math.BigInteger;

import java.util.List;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.ACTIVITY: return createActivity();
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER: return createAlarmClockSystemTimer();
			case ModelPackage.BARRIER: return createBarrier();
			case ModelPackage.BURSTY_EXTERNAL_EVENT: return createBurstyExternalEvent();
			case ModelPackage.CHARACTER_PACKET_DRIVER: return createCharacterPacketDriver();
			case ModelPackage.COMPOSITE_OPERATION: return createCompositeOperation();
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT: return createCompositeTimingRequirement();
			case ModelPackage.CONCENTRATOR: return createConcentrator();
			case ModelPackage.DELAY: return createDelay();
			case ModelPackage.DELIVERY_SERVER: return createDeliveryServer();
			case ModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ModelPackage.EDF_POLICY: return createEDFPolicy();
			case ModelPackage.EDF_SCHEDULER: return createEDFScheduler();
			case ModelPackage.ENCLOSING_OPERATION: return createEnclosingOperation();
			case ModelPackage.FIXED_PRIORITY_POLICY: return createFixedPriorityPolicy();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER: return createFixedPriorityScheduler();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER: return createFPPacketBasedScheduler();
			case ModelPackage.GLOBAL_MAX_MISS_RATIO: return createGlobalMaxMissRatio();
			case ModelPackage.HARD_GLOBAL_DEADLINE: return createHardGlobalDeadline();
			case ModelPackage.HARD_LOCAL_DEADLINE: return createHardLocalDeadline();
			case ModelPackage.IMMEDIATE_CEILING_RESOURCE: return createImmediateCeilingResource();
			case ModelPackage.INTERRUPT_FP_POLICY: return createInterruptFPPolicy();
			case ModelPackage.LIST_OF_DRIVERS: return createListOfDrivers();
			case ModelPackage.LOCAL_MAX_MISS_RATIO: return createLocalMaxMissRatio();
			case ModelPackage.MASTMODEL_TYPE: return createMASTMODELType();
			case ModelPackage.MAX_OUTPUT_JITTER_REQ: return createMaxOutputJitterReq();
			case ModelPackage.MESSAGE_TRANSMISSION: return createMessageTransmission();
			case ModelPackage.MULTICAST: return createMulticast();
			case ModelPackage.NON_PREEMPTIBLE_FP_POLICY: return createNonPreemptibleFPPolicy();
			case ModelPackage.OFFSET: return createOffset();
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY: return createOverriddenFixedPriority();
			case ModelPackage.OVERRIDDEN_PERMANENT_FP: return createOverriddenPermanentFP();
			case ModelPackage.PACKET_BASED_NETWORK: return createPacketBasedNetwork();
			case ModelPackage.PACKET_DRIVER: return createPacketDriver();
			case ModelPackage.PERIODIC_EXTERNAL_EVENT: return createPeriodicExternalEvent();
			case ModelPackage.POLLING_POLICY: return createPollingPolicy();
			case ModelPackage.PRIMARY_SCHEDULER: return createPrimaryScheduler();
			case ModelPackage.PRIORITY_INHERITANCE_RESOURCE: return createPriorityInheritanceResource();
			case ModelPackage.QUERY_SERVER: return createQueryServer();
			case ModelPackage.RATE_DIVISOR: return createRateDivisor();
			case ModelPackage.REGULAR_EVENT: return createRegularEvent();
			case ModelPackage.REGULAR_PROCESSOR: return createRegularProcessor();
			case ModelPackage.REGULAR_SCHEDULING_SERVER: return createRegularSchedulingServer();
			case ModelPackage.REGULAR_TRANSACTION: return createRegularTransaction();
			case ModelPackage.RTEP_PACKET_DRIVER: return createRTEPPacketDriver();
			case ModelPackage.SECONDARY_SCHEDULER: return createSecondaryScheduler();
			case ModelPackage.SIMPLE_OPERATION: return createSimpleOperation();
			case ModelPackage.SINGULAR_EXTERNAL_EVENT: return createSingularExternalEvent();
			case ModelPackage.SOFT_GLOBAL_DEADLINE: return createSoftGlobalDeadline();
			case ModelPackage.SOFT_LOCAL_DEADLINE: return createSoftLocalDeadline();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT: return createSporadicExternalEvent();
			case ModelPackage.SPORADIC_SERVER_POLICY: return createSporadicServerPolicy();
			case ModelPackage.SRP_PARAMETERS: return createSRPParameters();
			case ModelPackage.SRP_RESOURCE: return createSRPResource();
			case ModelPackage.SYSTEM_TIMED_ACTIVITY: return createSystemTimedActivity();
			case ModelPackage.TICKER_SYSTEM_TIMER: return createTickerSystemTimer();
			case ModelPackage.UNBOUNDED_EXTERNAL_EVENT: return createUnboundedExternalEvent();
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
			case ModelPackage.AFFIRMATIVE_ASSERTION:
				return createAffirmativeAssertionFromString(eDataType, initialValue);
			case ModelPackage.ASSERTION:
				return createAssertionFromString(eDataType, initialValue);
			case ModelPackage.DELIVERY_POLICY:
				return createDeliveryPolicyFromString(eDataType, initialValue);
			case ModelPackage.DISTRIBUTION_TYPE:
				return createDistributionTypeFromString(eDataType, initialValue);
			case ModelPackage.NEGATIVE_ASSERTION:
				return createNegativeAssertionFromString(eDataType, initialValue);
			case ModelPackage.OVERHEAD_TYPE:
				return createOverheadTypeFromString(eDataType, initialValue);
			case ModelPackage.PRIORITY_INHERITANCE_PROTOCOL:
				return createPriorityInheritanceProtocolFromString(eDataType, initialValue);
			case ModelPackage.REQUEST_POLICY:
				return createRequestPolicyFromString(eDataType, initialValue);
			case ModelPackage.TRANSMISSION_TYPE:
				return createTransmissionTypeFromString(eDataType, initialValue);
			case ModelPackage.ABSOLUTE_TIME:
				return createAbsoluteTimeFromString(eDataType, initialValue);
			case ModelPackage.ABSOLUTE_TIME_OBJECT:
				return createAbsoluteTimeObjectFromString(eDataType, initialValue);
			case ModelPackage.AFFIRMATIVE_ASSERTION_OBJECT:
				return createAffirmativeAssertionObjectFromString(eDataType, initialValue);
			case ModelPackage.ANY_PRIORITY:
				return createAnyPriorityFromString(eDataType, initialValue);
			case ModelPackage.ASSERTION_OBJECT:
				return createAssertionObjectFromString(eDataType, initialValue);
			case ModelPackage.BIT_COUNT:
				return createBitCountFromString(eDataType, initialValue);
			case ModelPackage.BIT_COUNT_OBJECT:
				return createBitCountObjectFromString(eDataType, initialValue);
			case ModelPackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case ModelPackage.DELIVERY_POLICY_OBJECT:
				return createDeliveryPolicyObjectFromString(eDataType, initialValue);
			case ModelPackage.DISTRIBUTION_TYPE_OBJECT:
				return createDistributionTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case ModelPackage.FLOAT_OBJECT:
				return createFloatObjectFromString(eDataType, initialValue);
			case ModelPackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case ModelPackage.IDENTIFIER_REF:
				return createIdentifierRefFromString(eDataType, initialValue);
			case ModelPackage.IDENTIFIER_REF_LIST:
				return createIdentifierRefListFromString(eDataType, initialValue);
			case ModelPackage.INTERRUPT_PRIORITY:
				return createInterruptPriorityFromString(eDataType, initialValue);
			case ModelPackage.NATURAL:
				return createNaturalFromString(eDataType, initialValue);
			case ModelPackage.NEGATIVE_ASSERTION_OBJECT:
				return createNegativeAssertionObjectFromString(eDataType, initialValue);
			case ModelPackage.NORMALIZED_EXECUTION_TIME:
				return createNormalizedExecutionTimeFromString(eDataType, initialValue);
			case ModelPackage.NORMALIZED_EXECUTION_TIME_OBJECT:
				return createNormalizedExecutionTimeObjectFromString(eDataType, initialValue);
			case ModelPackage.OVERHEAD_TYPE_OBJECT:
				return createOverheadTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.PATHNAME:
				return createPathnameFromString(eDataType, initialValue);
			case ModelPackage.PERCENTAGE:
				return createPercentageFromString(eDataType, initialValue);
			case ModelPackage.PERCENTAGE_OBJECT:
				return createPercentageObjectFromString(eDataType, initialValue);
			case ModelPackage.POSITIVE:
				return createPositiveFromString(eDataType, initialValue);
			case ModelPackage.PREEMPTION_LEVEL:
				return createPreemptionLevelFromString(eDataType, initialValue);
			case ModelPackage.PRIORITY:
				return createPriorityFromString(eDataType, initialValue);
			case ModelPackage.PRIORITY_INHERITANCE_PROTOCOL_OBJECT:
				return createPriorityInheritanceProtocolObjectFromString(eDataType, initialValue);
			case ModelPackage.REQUEST_POLICY_OBJECT:
				return createRequestPolicyObjectFromString(eDataType, initialValue);
			case ModelPackage.THROUGHPUT:
				return createThroughputFromString(eDataType, initialValue);
			case ModelPackage.THROUGHPUT_OBJECT:
				return createThroughputObjectFromString(eDataType, initialValue);
			case ModelPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			case ModelPackage.TIME_OBJECT:
				return createTimeObjectFromString(eDataType, initialValue);
			case ModelPackage.TRANSMISSION_TYPE_OBJECT:
				return createTransmissionTypeObjectFromString(eDataType, initialValue);
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
			case ModelPackage.AFFIRMATIVE_ASSERTION:
				return convertAffirmativeAssertionToString(eDataType, instanceValue);
			case ModelPackage.ASSERTION:
				return convertAssertionToString(eDataType, instanceValue);
			case ModelPackage.DELIVERY_POLICY:
				return convertDeliveryPolicyToString(eDataType, instanceValue);
			case ModelPackage.DISTRIBUTION_TYPE:
				return convertDistributionTypeToString(eDataType, instanceValue);
			case ModelPackage.NEGATIVE_ASSERTION:
				return convertNegativeAssertionToString(eDataType, instanceValue);
			case ModelPackage.OVERHEAD_TYPE:
				return convertOverheadTypeToString(eDataType, instanceValue);
			case ModelPackage.PRIORITY_INHERITANCE_PROTOCOL:
				return convertPriorityInheritanceProtocolToString(eDataType, instanceValue);
			case ModelPackage.REQUEST_POLICY:
				return convertRequestPolicyToString(eDataType, instanceValue);
			case ModelPackage.TRANSMISSION_TYPE:
				return convertTransmissionTypeToString(eDataType, instanceValue);
			case ModelPackage.ABSOLUTE_TIME:
				return convertAbsoluteTimeToString(eDataType, instanceValue);
			case ModelPackage.ABSOLUTE_TIME_OBJECT:
				return convertAbsoluteTimeObjectToString(eDataType, instanceValue);
			case ModelPackage.AFFIRMATIVE_ASSERTION_OBJECT:
				return convertAffirmativeAssertionObjectToString(eDataType, instanceValue);
			case ModelPackage.ANY_PRIORITY:
				return convertAnyPriorityToString(eDataType, instanceValue);
			case ModelPackage.ASSERTION_OBJECT:
				return convertAssertionObjectToString(eDataType, instanceValue);
			case ModelPackage.BIT_COUNT:
				return convertBitCountToString(eDataType, instanceValue);
			case ModelPackage.BIT_COUNT_OBJECT:
				return convertBitCountObjectToString(eDataType, instanceValue);
			case ModelPackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case ModelPackage.DELIVERY_POLICY_OBJECT:
				return convertDeliveryPolicyObjectToString(eDataType, instanceValue);
			case ModelPackage.DISTRIBUTION_TYPE_OBJECT:
				return convertDistributionTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case ModelPackage.FLOAT_OBJECT:
				return convertFloatObjectToString(eDataType, instanceValue);
			case ModelPackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case ModelPackage.IDENTIFIER_REF:
				return convertIdentifierRefToString(eDataType, instanceValue);
			case ModelPackage.IDENTIFIER_REF_LIST:
				return convertIdentifierRefListToString(eDataType, instanceValue);
			case ModelPackage.INTERRUPT_PRIORITY:
				return convertInterruptPriorityToString(eDataType, instanceValue);
			case ModelPackage.NATURAL:
				return convertNaturalToString(eDataType, instanceValue);
			case ModelPackage.NEGATIVE_ASSERTION_OBJECT:
				return convertNegativeAssertionObjectToString(eDataType, instanceValue);
			case ModelPackage.NORMALIZED_EXECUTION_TIME:
				return convertNormalizedExecutionTimeToString(eDataType, instanceValue);
			case ModelPackage.NORMALIZED_EXECUTION_TIME_OBJECT:
				return convertNormalizedExecutionTimeObjectToString(eDataType, instanceValue);
			case ModelPackage.OVERHEAD_TYPE_OBJECT:
				return convertOverheadTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.PATHNAME:
				return convertPathnameToString(eDataType, instanceValue);
			case ModelPackage.PERCENTAGE:
				return convertPercentageToString(eDataType, instanceValue);
			case ModelPackage.PERCENTAGE_OBJECT:
				return convertPercentageObjectToString(eDataType, instanceValue);
			case ModelPackage.POSITIVE:
				return convertPositiveToString(eDataType, instanceValue);
			case ModelPackage.PREEMPTION_LEVEL:
				return convertPreemptionLevelToString(eDataType, instanceValue);
			case ModelPackage.PRIORITY:
				return convertPriorityToString(eDataType, instanceValue);
			case ModelPackage.PRIORITY_INHERITANCE_PROTOCOL_OBJECT:
				return convertPriorityInheritanceProtocolObjectToString(eDataType, instanceValue);
			case ModelPackage.REQUEST_POLICY_OBJECT:
				return convertRequestPolicyObjectToString(eDataType, instanceValue);
			case ModelPackage.THROUGHPUT:
				return convertThroughputToString(eDataType, instanceValue);
			case ModelPackage.THROUGHPUT_OBJECT:
				return convertThroughputObjectToString(eDataType, instanceValue);
			case ModelPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			case ModelPackage.TIME_OBJECT:
				return convertTimeObjectToString(eDataType, instanceValue);
			case ModelPackage.TRANSMISSION_TYPE_OBJECT:
				return convertTransmissionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmClockSystemTimer createAlarmClockSystemTimer() {
		AlarmClockSystemTimerImpl alarmClockSystemTimer = new AlarmClockSystemTimerImpl();
		return alarmClockSystemTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Barrier createBarrier() {
		BarrierImpl barrier = new BarrierImpl();
		return barrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstyExternalEvent createBurstyExternalEvent() {
		BurstyExternalEventImpl burstyExternalEvent = new BurstyExternalEventImpl();
		return burstyExternalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterPacketDriver createCharacterPacketDriver() {
		CharacterPacketDriverImpl characterPacketDriver = new CharacterPacketDriverImpl();
		return characterPacketDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeOperation createCompositeOperation() {
		CompositeOperationImpl compositeOperation = new CompositeOperationImpl();
		return compositeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTimingRequirement createCompositeTimingRequirement() {
		CompositeTimingRequirementImpl compositeTimingRequirement = new CompositeTimingRequirementImpl();
		return compositeTimingRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concentrator createConcentrator() {
		ConcentratorImpl concentrator = new ConcentratorImpl();
		return concentrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryServer createDeliveryServer() {
		DeliveryServerImpl deliveryServer = new DeliveryServerImpl();
		return deliveryServer;
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
	public EDFScheduler createEDFScheduler() {
		EDFSchedulerImpl edfScheduler = new EDFSchedulerImpl();
		return edfScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosingOperation createEnclosingOperation() {
		EnclosingOperationImpl enclosingOperation = new EnclosingOperationImpl();
		return enclosingOperation;
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
	public FixedPriorityScheduler createFixedPriorityScheduler() {
		FixedPrioritySchedulerImpl fixedPriorityScheduler = new FixedPrioritySchedulerImpl();
		return fixedPriorityScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPPacketBasedScheduler createFPPacketBasedScheduler() {
		FPPacketBasedSchedulerImpl fpPacketBasedScheduler = new FPPacketBasedSchedulerImpl();
		return fpPacketBasedScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMaxMissRatio createGlobalMaxMissRatio() {
		GlobalMaxMissRatioImpl globalMaxMissRatio = new GlobalMaxMissRatioImpl();
		return globalMaxMissRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardGlobalDeadline createHardGlobalDeadline() {
		HardGlobalDeadlineImpl hardGlobalDeadline = new HardGlobalDeadlineImpl();
		return hardGlobalDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardLocalDeadline createHardLocalDeadline() {
		HardLocalDeadlineImpl hardLocalDeadline = new HardLocalDeadlineImpl();
		return hardLocalDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateCeilingResource createImmediateCeilingResource() {
		ImmediateCeilingResourceImpl immediateCeilingResource = new ImmediateCeilingResourceImpl();
		return immediateCeilingResource;
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
	public ListOfDrivers createListOfDrivers() {
		ListOfDriversImpl listOfDrivers = new ListOfDriversImpl();
		return listOfDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalMaxMissRatio createLocalMaxMissRatio() {
		LocalMaxMissRatioImpl localMaxMissRatio = new LocalMaxMissRatioImpl();
		return localMaxMissRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MASTMODELType createMASTMODELType() {
		MASTMODELTypeImpl mastmodelType = new MASTMODELTypeImpl();
		return mastmodelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxOutputJitterReq createMaxOutputJitterReq() {
		MaxOutputJitterReqImpl maxOutputJitterReq = new MaxOutputJitterReqImpl();
		return maxOutputJitterReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransmission createMessageTransmission() {
		MessageTransmissionImpl messageTransmission = new MessageTransmissionImpl();
		return messageTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multicast createMulticast() {
		MulticastImpl multicast = new MulticastImpl();
		return multicast;
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
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenFixedPriority createOverriddenFixedPriority() {
		OverriddenFixedPriorityImpl overriddenFixedPriority = new OverriddenFixedPriorityImpl();
		return overriddenFixedPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenPermanentFP createOverriddenPermanentFP() {
		OverriddenPermanentFPImpl overriddenPermanentFP = new OverriddenPermanentFPImpl();
		return overriddenPermanentFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketBasedNetwork createPacketBasedNetwork() {
		PacketBasedNetworkImpl packetBasedNetwork = new PacketBasedNetworkImpl();
		return packetBasedNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketDriver createPacketDriver() {
		PacketDriverImpl packetDriver = new PacketDriverImpl();
		return packetDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicExternalEvent createPeriodicExternalEvent() {
		PeriodicExternalEventImpl periodicExternalEvent = new PeriodicExternalEventImpl();
		return periodicExternalEvent;
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
	public PrimaryScheduler createPrimaryScheduler() {
		PrimarySchedulerImpl primaryScheduler = new PrimarySchedulerImpl();
		return primaryScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityInheritanceResource createPriorityInheritanceResource() {
		PriorityInheritanceResourceImpl priorityInheritanceResource = new PriorityInheritanceResourceImpl();
		return priorityInheritanceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryServer createQueryServer() {
		QueryServerImpl queryServer = new QueryServerImpl();
		return queryServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateDivisor createRateDivisor() {
		RateDivisorImpl rateDivisor = new RateDivisorImpl();
		return rateDivisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularEvent createRegularEvent() {
		RegularEventImpl regularEvent = new RegularEventImpl();
		return regularEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularProcessor createRegularProcessor() {
		RegularProcessorImpl regularProcessor = new RegularProcessorImpl();
		return regularProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularSchedulingServer createRegularSchedulingServer() {
		RegularSchedulingServerImpl regularSchedulingServer = new RegularSchedulingServerImpl();
		return regularSchedulingServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularTransaction createRegularTransaction() {
		RegularTransactionImpl regularTransaction = new RegularTransactionImpl();
		return regularTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTEPPacketDriver createRTEPPacketDriver() {
		RTEPPacketDriverImpl rtepPacketDriver = new RTEPPacketDriverImpl();
		return rtepPacketDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryScheduler createSecondaryScheduler() {
		SecondarySchedulerImpl secondaryScheduler = new SecondarySchedulerImpl();
		return secondaryScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperation createSimpleOperation() {
		SimpleOperationImpl simpleOperation = new SimpleOperationImpl();
		return simpleOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingularExternalEvent createSingularExternalEvent() {
		SingularExternalEventImpl singularExternalEvent = new SingularExternalEventImpl();
		return singularExternalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftGlobalDeadline createSoftGlobalDeadline() {
		SoftGlobalDeadlineImpl softGlobalDeadline = new SoftGlobalDeadlineImpl();
		return softGlobalDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftLocalDeadline createSoftLocalDeadline() {
		SoftLocalDeadlineImpl softLocalDeadline = new SoftLocalDeadlineImpl();
		return softLocalDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicExternalEvent createSporadicExternalEvent() {
		SporadicExternalEventImpl sporadicExternalEvent = new SporadicExternalEventImpl();
		return sporadicExternalEvent;
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
	public SRPResource createSRPResource() {
		SRPResourceImpl srpResource = new SRPResourceImpl();
		return srpResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTimedActivity createSystemTimedActivity() {
		SystemTimedActivityImpl systemTimedActivity = new SystemTimedActivityImpl();
		return systemTimedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TickerSystemTimer createTickerSystemTimer() {
		TickerSystemTimerImpl tickerSystemTimer = new TickerSystemTimerImpl();
		return tickerSystemTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnboundedExternalEvent createUnboundedExternalEvent() {
		UnboundedExternalEventImpl unboundedExternalEvent = new UnboundedExternalEventImpl();
		return unboundedExternalEvent;
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
	public DeliveryPolicy createDeliveryPolicyFromString(EDataType eDataType, String initialValue) {
		DeliveryPolicy result = DeliveryPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeliveryPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType createDistributionTypeFromString(EDataType eDataType, String initialValue) {
		DistributionType result = DistributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAssertion createNegativeAssertionFromString(EDataType eDataType, String initialValue) {
		NegativeAssertion result = NegativeAssertion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNegativeAssertionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadType createOverheadTypeFromString(EDataType eDataType, String initialValue) {
		OverheadType result = OverheadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverheadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityInheritanceProtocol createPriorityInheritanceProtocolFromString(EDataType eDataType, String initialValue) {
		PriorityInheritanceProtocol result = PriorityInheritanceProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityInheritanceProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPolicy createRequestPolicyFromString(EDataType eDataType, String initialValue) {
		RequestPolicy result = RequestPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionType createTransmissionTypeFromString(EDataType eDataType, String initialValue) {
		TransmissionType result = TransmissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createAbsoluteTimeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbsoluteTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createAbsoluteTimeObjectFromString(EDataType eDataType, String initialValue) {
		return createAbsoluteTimeFromString(ModelPackage.Literals.ABSOLUTE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbsoluteTimeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAbsoluteTimeToString(ModelPackage.Literals.ABSOLUTE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffirmativeAssertion createAffirmativeAssertionObjectFromString(EDataType eDataType, String initialValue) {
		return createAffirmativeAssertionFromString(ModelPackage.Literals.AFFIRMATIVE_ASSERTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffirmativeAssertionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAffirmativeAssertionToString(ModelPackage.Literals.AFFIRMATIVE_ASSERTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAnyPriorityFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnyPriorityToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertionObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionFromString(ModelPackage.Literals.ASSERTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionToString(ModelPackage.Literals.ASSERTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createBitCountFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitCountToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createBitCountObjectFromString(EDataType eDataType, String initialValue) {
		return createBitCountFromString(ModelPackage.Literals.BIT_COUNT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitCountObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBitCountToString(ModelPackage.Literals.BIT_COUNT, instanceValue);
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
	public DeliveryPolicy createDeliveryPolicyObjectFromString(EDataType eDataType, String initialValue) {
		return createDeliveryPolicyFromString(ModelPackage.Literals.DELIVERY_POLICY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeliveryPolicyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeliveryPolicyToString(ModelPackage.Literals.DELIVERY_POLICY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType createDistributionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDistributionTypeFromString(ModelPackage.Literals.DISTRIBUTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDistributionTypeToString(ModelPackage.Literals.DISTRIBUTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createFloatFromString(ModelPackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFloatToString(ModelPackage.Literals.FLOAT, instanceValue);
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
	public String createIdentifierRefFromString(EDataType eDataType, String initialValue) {
		return createIdentifierFromString(ModelPackage.Literals.IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierRefToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierToString(ModelPackage.Literals.IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createIdentifierRefListFromString(EDataType eDataType, String initialValue) {
		return (List)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKENS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierRefListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKENS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createInterruptPriorityFromString(EDataType eDataType, String initialValue) {
		return createAnyPriorityFromString(ModelPackage.Literals.ANY_PRIORITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterruptPriorityToString(EDataType eDataType, Object instanceValue) {
		return convertAnyPriorityToString(ModelPackage.Literals.ANY_PRIORITY, instanceValue);
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
	public NegativeAssertion createNegativeAssertionObjectFromString(EDataType eDataType, String initialValue) {
		return createNegativeAssertionFromString(ModelPackage.Literals.NEGATIVE_ASSERTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNegativeAssertionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNegativeAssertionToString(ModelPackage.Literals.NEGATIVE_ASSERTION, instanceValue);
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
		return createNormalizedExecutionTimeFromString(ModelPackage.Literals.NORMALIZED_EXECUTION_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalizedExecutionTimeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNormalizedExecutionTimeToString(ModelPackage.Literals.NORMALIZED_EXECUTION_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadType createOverheadTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOverheadTypeFromString(ModelPackage.Literals.OVERHEAD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverheadTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOverheadTypeToString(ModelPackage.Literals.OVERHEAD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathnameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathnameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
		return createPercentageFromString(ModelPackage.Literals.PERCENTAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPercentageToString(ModelPackage.Literals.PERCENTAGE, instanceValue);
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
	public BigInteger createPreemptionLevelFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptionLevelToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPriorityFromString(EDataType eDataType, String initialValue) {
		return createAnyPriorityFromString(ModelPackage.Literals.ANY_PRIORITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityToString(EDataType eDataType, Object instanceValue) {
		return convertAnyPriorityToString(ModelPackage.Literals.ANY_PRIORITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityInheritanceProtocol createPriorityInheritanceProtocolObjectFromString(EDataType eDataType, String initialValue) {
		return createPriorityInheritanceProtocolFromString(ModelPackage.Literals.PRIORITY_INHERITANCE_PROTOCOL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityInheritanceProtocolObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPriorityInheritanceProtocolToString(ModelPackage.Literals.PRIORITY_INHERITANCE_PROTOCOL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPolicy createRequestPolicyObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestPolicyFromString(ModelPackage.Literals.REQUEST_POLICY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPolicyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestPolicyToString(ModelPackage.Literals.REQUEST_POLICY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createThroughputFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThroughputToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createThroughputObjectFromString(EDataType eDataType, String initialValue) {
		return createThroughputFromString(ModelPackage.Literals.THROUGHPUT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThroughputObjectToString(EDataType eDataType, Object instanceValue) {
		return convertThroughputToString(ModelPackage.Literals.THROUGHPUT, instanceValue);
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
		return createTimeFromString(ModelPackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeToString(ModelPackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionType createTransmissionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransmissionTypeFromString(ModelPackage.Literals.TRANSMISSION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransmissionTypeToString(ModelPackage.Literals.TRANSMISSION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl

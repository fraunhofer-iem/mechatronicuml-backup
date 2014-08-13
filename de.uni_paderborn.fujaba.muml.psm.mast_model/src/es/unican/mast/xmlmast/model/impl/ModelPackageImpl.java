/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.Activity;
import es.unican.mast.xmlmast.model.AffirmativeAssertion;
import es.unican.mast.xmlmast.model.AlarmClockSystemTimer;
import es.unican.mast.xmlmast.model.Assertion;
import es.unican.mast.xmlmast.model.Barrier;
import es.unican.mast.xmlmast.model.BurstyExternalEvent;
import es.unican.mast.xmlmast.model.CharacterPacketDriver;
import es.unican.mast.xmlmast.model.CompositeOperation;
import es.unican.mast.xmlmast.model.CompositeTimingRequirement;
import es.unican.mast.xmlmast.model.Concentrator;
import es.unican.mast.xmlmast.model.Delay;
import es.unican.mast.xmlmast.model.DeliveryPolicy;
import es.unican.mast.xmlmast.model.DeliveryServer;
import es.unican.mast.xmlmast.model.DistributionType;
import es.unican.mast.xmlmast.model.DocumentRoot;
import es.unican.mast.xmlmast.model.EDFPolicy;
import es.unican.mast.xmlmast.model.EDFScheduler;
import es.unican.mast.xmlmast.model.EnclosingOperation;
import es.unican.mast.xmlmast.model.FPPacketBasedScheduler;
import es.unican.mast.xmlmast.model.FixedPriorityPolicy;
import es.unican.mast.xmlmast.model.FixedPriorityScheduler;
import es.unican.mast.xmlmast.model.GlobalMaxMissRatio;
import es.unican.mast.xmlmast.model.HardGlobalDeadline;
import es.unican.mast.xmlmast.model.HardLocalDeadline;
import es.unican.mast.xmlmast.model.ImmediateCeilingResource;
import es.unican.mast.xmlmast.model.InterruptFPPolicy;
import es.unican.mast.xmlmast.model.ListOfDrivers;
import es.unican.mast.xmlmast.model.LocalMaxMissRatio;
import es.unican.mast.xmlmast.model.MASTMODELType;
import es.unican.mast.xmlmast.model.MaxOutputJitterReq;
import es.unican.mast.xmlmast.model.MessageTransmission;
import es.unican.mast.xmlmast.model.ModelFactory;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.Multicast;
import es.unican.mast.xmlmast.model.NegativeAssertion;
import es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy;
import es.unican.mast.xmlmast.model.Offset;
import es.unican.mast.xmlmast.model.OverheadType;
import es.unican.mast.xmlmast.model.OverriddenFixedPriority;
import es.unican.mast.xmlmast.model.OverriddenPermanentFP;
import es.unican.mast.xmlmast.model.PacketBasedNetwork;
import es.unican.mast.xmlmast.model.PacketDriver;
import es.unican.mast.xmlmast.model.PeriodicExternalEvent;
import es.unican.mast.xmlmast.model.PollingPolicy;
import es.unican.mast.xmlmast.model.PrimaryScheduler;
import es.unican.mast.xmlmast.model.PriorityInheritanceProtocol;
import es.unican.mast.xmlmast.model.PriorityInheritanceResource;
import es.unican.mast.xmlmast.model.QueryServer;
import es.unican.mast.xmlmast.model.RTEPPacketDriver;
import es.unican.mast.xmlmast.model.RateDivisor;
import es.unican.mast.xmlmast.model.RegularEvent;
import es.unican.mast.xmlmast.model.RegularProcessor;
import es.unican.mast.xmlmast.model.RegularSchedulingServer;
import es.unican.mast.xmlmast.model.RegularTransaction;
import es.unican.mast.xmlmast.model.RequestPolicy;
import es.unican.mast.xmlmast.model.SRPParameters;
import es.unican.mast.xmlmast.model.SRPResource;
import es.unican.mast.xmlmast.model.SecondaryScheduler;
import es.unican.mast.xmlmast.model.SimpleOperation;
import es.unican.mast.xmlmast.model.SingularExternalEvent;
import es.unican.mast.xmlmast.model.SoftGlobalDeadline;
import es.unican.mast.xmlmast.model.SoftLocalDeadline;
import es.unican.mast.xmlmast.model.SporadicExternalEvent;
import es.unican.mast.xmlmast.model.SporadicServerPolicy;
import es.unican.mast.xmlmast.model.SystemTimedActivity;
import es.unican.mast.xmlmast.model.TickerSystemTimer;
import es.unican.mast.xmlmast.model.TransmissionType;
import es.unican.mast.xmlmast.model.UnboundedExternalEvent;

import es.unican.mast.xmlmast.model.util.ModelValidator;

import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmClockSystemTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass burstyExternalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterPacketDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTimingRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concentratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edfPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edfSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enclosingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPrioritySchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpPacketBasedSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalMaxMissRatioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardGlobalDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardLocalDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateCeilingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptFPPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfDriversEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localMaxMissRatioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mastmodelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxOutputJitterReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTransmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multicastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonPreemptibleFPPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overriddenFixedPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overriddenPermanentFPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packetBasedNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packetDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicExternalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primarySchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityInheritanceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateDivisorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularSchedulingServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtepPacketDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondarySchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singularExternalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softGlobalDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softLocalDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicExternalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicServerPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srpParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srpResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTimedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tickerSystemTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unboundedExternalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affirmativeAssertionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deliveryPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distributionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum negativeAssertionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overheadTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityInheritanceProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmissionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteTimeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType affirmativeAssertionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyPriorityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType assertionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bitCountEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bitCountObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deliveryPolicyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType distributionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierRefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierRefListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interruptPriorityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType naturalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType negativeAssertionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType normalizedExecutionTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType normalizedExecutionTimeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType overheadTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathnameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preemptionLevelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType priorityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType priorityInheritanceProtocolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestPolicyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType throughputEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType throughputObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transmissionTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.unican.mast.xmlmast.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_ActivityOperation() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_ActivityServer() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_InputEvent() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_OutputEvent() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmClockSystemTimer() {
		return alarmClockSystemTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmClockSystemTimer_AvgOverhead() {
		return (EAttribute)alarmClockSystemTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmClockSystemTimer_BestOverhead() {
		return (EAttribute)alarmClockSystemTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmClockSystemTimer_WorstOverhead() {
		return (EAttribute)alarmClockSystemTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarrier() {
		return barrierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarrier_InputEventsList() {
		return (EAttribute)barrierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarrier_OutputEvent() {
		return (EAttribute)barrierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBurstyExternalEvent() {
		return burstyExternalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstyExternalEvent_AvgInterarrival() {
		return (EAttribute)burstyExternalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstyExternalEvent_BoundInterval() {
		return (EAttribute)burstyExternalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstyExternalEvent_Distribution() {
		return (EAttribute)burstyExternalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstyExternalEvent_MaxArrivals() {
		return (EAttribute)burstyExternalEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBurstyExternalEvent_Name() {
		return (EAttribute)burstyExternalEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterPacketDriver() {
		return characterPacketDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_CharacterReceiveOperation() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_CharacterSendOperation() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_CharacterServer() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_CharacterTransmissionTime() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_MessagePartitioning() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_PacketReceiveOperation() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_PacketSendOperation() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_PacketServer() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterPacketDriver_RTAOverheadModel() {
		return (EAttribute)characterPacketDriverEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeOperation() {
		return compositeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeOperation_OverriddenFixedPriority() {
		return (EReference)compositeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeOperation_OverriddenPermanentFP() {
		return (EReference)compositeOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeOperation_OperationList() {
		return (EAttribute)compositeOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeOperation_Name() {
		return (EAttribute)compositeOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTimingRequirement() {
		return compositeTimingRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeTimingRequirement_Group() {
		return (EAttribute)compositeTimingRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_MaxOutputJitterReq() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_HardGlobalDeadline() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_SoftGlobalDeadline() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_GlobalMaxMissRatio() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_HardLocalDeadline() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_SoftLocalDeadline() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTimingRequirement_LocalMaxMissRatio() {
		return (EReference)compositeTimingRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcentrator() {
		return concentratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcentrator_InputEventsList() {
		return (EAttribute)concentratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcentrator_OutputEvent() {
		return (EAttribute)concentratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_DelayMaxInterval() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_DelayMinInterval() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_InputEvent() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_OutputEvent() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliveryServer() {
		return deliveryServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryServer_DeliveryPolicy() {
		return (EAttribute)deliveryServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryServer_InputEvent() {
		return (EAttribute)deliveryServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryServer_OutputEventsList() {
		return (EAttribute)deliveryServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MASTMODEL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDFPolicy() {
		return edfPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDFPolicy_Deadline() {
		return (EAttribute)edfPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDFPolicy_Preassigned() {
		return (EAttribute)edfPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDFScheduler() {
		return edfSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDFScheduler_AvgContextSwitch() {
		return (EAttribute)edfSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDFScheduler_BestContextSwitch() {
		return (EAttribute)edfSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDFScheduler_WorstContextSwitch() {
		return (EAttribute)edfSchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnclosingOperation() {
		return enclosingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnclosingOperation_OverriddenFixedPriority() {
		return (EReference)enclosingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnclosingOperation_OverriddenPermanentFP() {
		return (EReference)enclosingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnclosingOperation_OperationList() {
		return (EAttribute)enclosingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnclosingOperation_AverageCaseExecutionTime() {
		return (EAttribute)enclosingOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnclosingOperation_BestCaseExecutionTime() {
		return (EAttribute)enclosingOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnclosingOperation_Name() {
		return (EAttribute)enclosingOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnclosingOperation_WorstCaseExecutionTime() {
		return (EAttribute)enclosingOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityPolicy() {
		return fixedPriorityPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityPolicy_Preassigned() {
		return (EAttribute)fixedPriorityPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityPolicy_ThePriority() {
		return (EAttribute)fixedPriorityPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityScheduler() {
		return fixedPrioritySchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityScheduler_AvgContextSwitch() {
		return (EAttribute)fixedPrioritySchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityScheduler_BestContextSwitch() {
		return (EAttribute)fixedPrioritySchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityScheduler_MaxPriority() {
		return (EAttribute)fixedPrioritySchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityScheduler_MinPriority() {
		return (EAttribute)fixedPrioritySchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPriorityScheduler_WorstContextSwitch() {
		return (EAttribute)fixedPrioritySchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFPPacketBasedScheduler() {
		return fpPacketBasedSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPPacketBasedScheduler_MaxPriority() {
		return (EAttribute)fpPacketBasedSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPPacketBasedScheduler_MinPriority() {
		return (EAttribute)fpPacketBasedSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPPacketBasedScheduler_PacketOverheadAvgSize() {
		return (EAttribute)fpPacketBasedSchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPPacketBasedScheduler_PacketOverheadMaxSize() {
		return (EAttribute)fpPacketBasedSchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFPPacketBasedScheduler_PacketOverheadMinSize() {
		return (EAttribute)fpPacketBasedSchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalMaxMissRatio() {
		return globalMaxMissRatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalMaxMissRatio_Deadline() {
		return (EAttribute)globalMaxMissRatioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalMaxMissRatio_Ratio() {
		return (EAttribute)globalMaxMissRatioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalMaxMissRatio_ReferencedEvent() {
		return (EAttribute)globalMaxMissRatioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardGlobalDeadline() {
		return hardGlobalDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardGlobalDeadline_Deadline() {
		return (EAttribute)hardGlobalDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardGlobalDeadline_ReferencedEvent() {
		return (EAttribute)hardGlobalDeadlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardLocalDeadline() {
		return hardLocalDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardLocalDeadline_Deadline() {
		return (EAttribute)hardLocalDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateCeilingResource() {
		return immediateCeilingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateCeilingResource_Ceiling() {
		return (EAttribute)immediateCeilingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateCeilingResource_Name() {
		return (EAttribute)immediateCeilingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateCeilingResource_Preassigned() {
		return (EAttribute)immediateCeilingResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptFPPolicy() {
		return interruptFPPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptFPPolicy_Preassigned() {
		return (EAttribute)interruptFPPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptFPPolicy_ThePriority() {
		return (EAttribute)interruptFPPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfDrivers() {
		return listOfDriversEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfDrivers_Group() {
		return (EAttribute)listOfDriversEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDrivers_PacketDriver() {
		return (EReference)listOfDriversEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDrivers_CharacterPacketDriver() {
		return (EReference)listOfDriversEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOfDrivers_RTEPPacketDriver() {
		return (EReference)listOfDriversEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalMaxMissRatio() {
		return localMaxMissRatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalMaxMissRatio_Deadline() {
		return (EAttribute)localMaxMissRatioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalMaxMissRatio_Ratio() {
		return (EAttribute)localMaxMissRatioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMASTMODELType() {
		return mastmodelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMASTMODELType_Group() {
		return (EAttribute)mastmodelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_RegularProcessor() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_PacketBasedNetwork() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_RegularSchedulingServer() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_ImmediateCeilingResource() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_PriorityInheritanceResource() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_SRPResource() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_SimpleOperation() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_MessageTransmission() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_CompositeOperation() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_EnclosingOperation() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_RegularTransaction() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_PrimaryScheduler() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMASTMODELType_SecondaryScheduler() {
		return (EReference)mastmodelTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMASTMODELType_ModelDate() {
		return (EAttribute)mastmodelTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMASTMODELType_ModelName() {
		return (EAttribute)mastmodelTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMASTMODELType_SystemPiPBehaviour() {
		return (EAttribute)mastmodelTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxOutputJitterReq() {
		return maxOutputJitterReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxOutputJitterReq_MaxOutputJitter() {
		return (EAttribute)maxOutputJitterReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxOutputJitterReq_ReferencedEvent() {
		return (EAttribute)maxOutputJitterReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageTransmission() {
		return messageTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransmission_OverriddenFixedPriority() {
		return (EReference)messageTransmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransmission_OverriddenPermanentFP() {
		return (EReference)messageTransmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransmission_AvgMessageSize() {
		return (EAttribute)messageTransmissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransmission_MaxMessageSize() {
		return (EAttribute)messageTransmissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransmission_MinMessageSize() {
		return (EAttribute)messageTransmissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransmission_Name() {
		return (EAttribute)messageTransmissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulticast() {
		return multicastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMulticast_InputEvent() {
		return (EAttribute)multicastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMulticast_OutputEventsList() {
		return (EAttribute)multicastEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonPreemptibleFPPolicy() {
		return nonPreemptibleFPPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPreemptibleFPPolicy_Preassigned() {
		return (EAttribute)nonPreemptibleFPPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPreemptibleFPPolicy_ThePriority() {
		return (EAttribute)nonPreemptibleFPPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_DelayMaxInterval() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_DelayMinInterval() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_InputEvent() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_OutputEvent() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_ReferencedEvent() {
		return (EAttribute)offsetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverriddenFixedPriority() {
		return overriddenFixedPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverriddenFixedPriority_ThePriority() {
		return (EAttribute)overriddenFixedPriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverriddenPermanentFP() {
		return overriddenPermanentFPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverriddenPermanentFP_ThePriority() {
		return (EAttribute)overriddenPermanentFPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacketBasedNetwork() {
		return packetBasedNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPacketBasedNetwork_ListOfDrivers() {
		return (EReference)packetBasedNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_MaxBlocking() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_MaxPacketSize() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_MinPacketSize() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_Name() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_SpeedFactor() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_Throughput() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketBasedNetwork_Transmission() {
		return (EAttribute)packetBasedNetworkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacketDriver() {
		return packetDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketDriver_MessagePartitioning() {
		return (EAttribute)packetDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketDriver_PacketReceiveOperation() {
		return (EAttribute)packetDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketDriver_PacketSendOperation() {
		return (EAttribute)packetDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketDriver_PacketServer() {
		return (EAttribute)packetDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketDriver_RTAOverheadModel() {
		return (EAttribute)packetDriverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicExternalEvent() {
		return periodicExternalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicExternalEvent_MaxJitter() {
		return (EAttribute)periodicExternalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicExternalEvent_Name() {
		return (EAttribute)periodicExternalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicExternalEvent_Period() {
		return (EAttribute)periodicExternalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicExternalEvent_Phase() {
		return (EAttribute)periodicExternalEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollingPolicy() {
		return pollingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingPolicy_PollingAvgOverhead() {
		return (EAttribute)pollingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingPolicy_PollingBestOverhead() {
		return (EAttribute)pollingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingPolicy_PollingPeriod() {
		return (EAttribute)pollingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingPolicy_PollingWorstOverhead() {
		return (EAttribute)pollingPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingPolicy_Preassigned() {
		return (EAttribute)pollingPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingPolicy_ThePriority() {
		return (EAttribute)pollingPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryScheduler() {
		return primarySchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryScheduler_FixedPriorityScheduler() {
		return (EReference)primarySchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryScheduler_EDFScheduler() {
		return (EReference)primarySchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryScheduler_FPPacketBasedScheduler() {
		return (EReference)primarySchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryScheduler_Host() {
		return (EAttribute)primarySchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryScheduler_Name() {
		return (EAttribute)primarySchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityInheritanceResource() {
		return priorityInheritanceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriorityInheritanceResource_Name() {
		return (EAttribute)priorityInheritanceResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryServer() {
		return queryServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryServer_InputEvent() {
		return (EAttribute)queryServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryServer_OutputEventsList() {
		return (EAttribute)queryServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryServer_RequestPolicy() {
		return (EAttribute)queryServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateDivisor() {
		return rateDivisorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateDivisor_InputEvent() {
		return (EAttribute)rateDivisorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateDivisor_OutputEvent() {
		return (EAttribute)rateDivisorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateDivisor_RateFactor() {
		return (EAttribute)rateDivisorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularEvent() {
		return regularEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularEvent_Group() {
		return (EAttribute)regularEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_MaxOutputJitterReq() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_HardGlobalDeadline() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_SoftGlobalDeadline() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_GlobalMaxMissRatio() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_HardLocalDeadline() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_SoftLocalDeadline() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_LocalMaxMissRatio() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularEvent_CompositeTimingRequirement() {
		return (EReference)regularEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularEvent_Event() {
		return (EAttribute)regularEventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularProcessor() {
		return regularProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularProcessor_TickerSystemTimer() {
		return (EReference)regularProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularProcessor_AlarmClockSystemTimer() {
		return (EReference)regularProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_AvgISRSwitch() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_BestISRSwitch() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_MaxInterruptPriority() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_MinInterruptPriority() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_Name() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_SpeedFactor() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularProcessor_WorstISRSwitch() {
		return (EAttribute)regularProcessorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularSchedulingServer() {
		return regularSchedulingServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_NonPreemptibleFPPolicy() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_FixedPriorityPolicy() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_InterruptFPPolicy() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_PollingPolicy() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_SporadicServerPolicy() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_EDFPolicy() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularSchedulingServer_SRPParameters() {
		return (EReference)regularSchedulingServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularSchedulingServer_Name() {
		return (EAttribute)regularSchedulingServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularSchedulingServer_Scheduler() {
		return (EAttribute)regularSchedulingServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularTransaction() {
		return regularTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularTransaction_Group() {
		return (EAttribute)regularTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_PeriodicExternalEvent() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_SporadicExternalEvent() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_UnboundedExternalEvent() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_BurstyExternalEvent() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_SingularExternalEvent() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_RegularEvent() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_Activity() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_SystemTimedActivity() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_Concentrator() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_Barrier() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_DeliveryServer() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_QueryServer() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_Multicast() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_RateDivisor() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_Delay() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTransaction_Offset() {
		return (EReference)regularTransactionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularTransaction_Name() {
		return (EAttribute)regularTransactionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTEPPacketDriver() {
		return rtepPacketDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_FailureTimeout() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_MessagePartitioning() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_NumberOfStations() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketDiscardOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketInterruptServer() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketISROperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketReceiveOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketRetransmissionOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketSendOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketServer() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_PacketTransmissionRetries() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_RTAOverheadModel() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_TokenCheckOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_TokenDelay() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_TokenManageOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_TokenRetransmissionOperation() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTEPPacketDriver_TokenTransmissionRetries() {
		return (EAttribute)rtepPacketDriverEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondaryScheduler() {
		return secondarySchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryScheduler_FixedPriorityScheduler() {
		return (EReference)secondarySchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryScheduler_EDFScheduler() {
		return (EReference)secondarySchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryScheduler_FPPacketBasedScheduler() {
		return (EReference)secondarySchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryScheduler_Host() {
		return (EAttribute)secondarySchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryScheduler_Name() {
		return (EAttribute)secondarySchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleOperation() {
		return simpleOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperation_OverriddenFixedPriority() {
		return (EReference)simpleOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperation_OverriddenPermanentFP() {
		return (EReference)simpleOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_SharedResourcesList() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_SharedResourcesToLock() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_SharedResourcesToUnlock() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_AverageCaseExecutionTime() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_BestCaseExecutionTime() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_Name() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperation_WorstCaseExecutionTime() {
		return (EAttribute)simpleOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingularExternalEvent() {
		return singularExternalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingularExternalEvent_Name() {
		return (EAttribute)singularExternalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingularExternalEvent_Phase() {
		return (EAttribute)singularExternalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftGlobalDeadline() {
		return softGlobalDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftGlobalDeadline_Deadline() {
		return (EAttribute)softGlobalDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftGlobalDeadline_ReferencedEvent() {
		return (EAttribute)softGlobalDeadlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftLocalDeadline() {
		return softLocalDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftLocalDeadline_Deadline() {
		return (EAttribute)softLocalDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicExternalEvent() {
		return sporadicExternalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicExternalEvent_AvgInterarrival() {
		return (EAttribute)sporadicExternalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicExternalEvent_Distribution() {
		return (EAttribute)sporadicExternalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicExternalEvent_MinInterarrival() {
		return (EAttribute)sporadicExternalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicExternalEvent_Name() {
		return (EAttribute)sporadicExternalEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicServerPolicy() {
		return sporadicServerPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicServerPolicy_BackgroundPriority() {
		return (EAttribute)sporadicServerPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicServerPolicy_InitialCapacity() {
		return (EAttribute)sporadicServerPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicServerPolicy_MaxPendingReplenishments() {
		return (EAttribute)sporadicServerPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicServerPolicy_NormalPriority() {
		return (EAttribute)sporadicServerPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicServerPolicy_Preassigned() {
		return (EAttribute)sporadicServerPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicServerPolicy_ReplenishmentPeriod() {
		return (EAttribute)sporadicServerPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRPParameters() {
		return srpParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRPParameters_Preassigned() {
		return (EAttribute)srpParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRPParameters_PreemptionLevel() {
		return (EAttribute)srpParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRPResource() {
		return srpResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRPResource_Name() {
		return (EAttribute)srpResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRPResource_Preassigned() {
		return (EAttribute)srpResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRPResource_PreemptionLevel() {
		return (EAttribute)srpResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTimedActivity() {
		return systemTimedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimedActivity_ActivityOperation() {
		return (EAttribute)systemTimedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimedActivity_ActivityServer() {
		return (EAttribute)systemTimedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimedActivity_InputEvent() {
		return (EAttribute)systemTimedActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimedActivity_OutputEvent() {
		return (EAttribute)systemTimedActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTickerSystemTimer() {
		return tickerSystemTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTickerSystemTimer_AvgOverhead() {
		return (EAttribute)tickerSystemTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTickerSystemTimer_BestOverhead() {
		return (EAttribute)tickerSystemTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTickerSystemTimer_Period() {
		return (EAttribute)tickerSystemTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTickerSystemTimer_WorstOverhead() {
		return (EAttribute)tickerSystemTimerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnboundedExternalEvent() {
		return unboundedExternalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnboundedExternalEvent_AvgInterarrival() {
		return (EAttribute)unboundedExternalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnboundedExternalEvent_Distribution() {
		return (EAttribute)unboundedExternalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnboundedExternalEvent_Name() {
		return (EAttribute)unboundedExternalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAffirmativeAssertion() {
		return affirmativeAssertionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertion() {
		return assertionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeliveryPolicy() {
		return deliveryPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDistributionType() {
		return distributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNegativeAssertion() {
		return negativeAssertionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverheadType() {
		return overheadTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityInheritanceProtocol() {
		return priorityInheritanceProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestPolicy() {
		return requestPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmissionType() {
		return transmissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbsoluteTime() {
		return absoluteTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbsoluteTimeObject() {
		return absoluteTimeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAffirmativeAssertionObject() {
		return affirmativeAssertionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnyPriority() {
		return anyPriorityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAssertionObject() {
		return assertionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBitCount() {
		return bitCountEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBitCountObject() {
		return bitCountObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeliveryPolicyObject() {
		return deliveryPolicyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDistributionTypeObject() {
		return distributionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloatObject() {
		return floatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifierRef() {
		return identifierRefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifierRefList() {
		return identifierRefListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterruptPriority() {
		return interruptPriorityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNatural() {
		return naturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNegativeAssertionObject() {
		return negativeAssertionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNormalizedExecutionTime() {
		return normalizedExecutionTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNormalizedExecutionTimeObject() {
		return normalizedExecutionTimeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOverheadTypeObject() {
		return overheadTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathname() {
		return pathnameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentage() {
		return percentageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentageObject() {
		return percentageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositive() {
		return positiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreemptionLevel() {
		return preemptionLevelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPriority() {
		return priorityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPriorityInheritanceProtocolObject() {
		return priorityInheritanceProtocolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequestPolicyObject() {
		return requestPolicyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThroughput() {
		return throughputEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThroughputObject() {
		return throughputObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTime() {
		return timeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeObject() {
		return timeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransmissionTypeObject() {
		return transmissionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_OPERATION);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_SERVER);
		createEAttribute(activityEClass, ACTIVITY__INPUT_EVENT);
		createEAttribute(activityEClass, ACTIVITY__OUTPUT_EVENT);

		alarmClockSystemTimerEClass = createEClass(ALARM_CLOCK_SYSTEM_TIMER);
		createEAttribute(alarmClockSystemTimerEClass, ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD);
		createEAttribute(alarmClockSystemTimerEClass, ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD);
		createEAttribute(alarmClockSystemTimerEClass, ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD);

		barrierEClass = createEClass(BARRIER);
		createEAttribute(barrierEClass, BARRIER__INPUT_EVENTS_LIST);
		createEAttribute(barrierEClass, BARRIER__OUTPUT_EVENT);

		burstyExternalEventEClass = createEClass(BURSTY_EXTERNAL_EVENT);
		createEAttribute(burstyExternalEventEClass, BURSTY_EXTERNAL_EVENT__AVG_INTERARRIVAL);
		createEAttribute(burstyExternalEventEClass, BURSTY_EXTERNAL_EVENT__BOUND_INTERVAL);
		createEAttribute(burstyExternalEventEClass, BURSTY_EXTERNAL_EVENT__DISTRIBUTION);
		createEAttribute(burstyExternalEventEClass, BURSTY_EXTERNAL_EVENT__MAX_ARRIVALS);
		createEAttribute(burstyExternalEventEClass, BURSTY_EXTERNAL_EVENT__NAME);

		characterPacketDriverEClass = createEClass(CHARACTER_PACKET_DRIVER);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__CHARACTER_RECEIVE_OPERATION);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__CHARACTER_SEND_OPERATION);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__CHARACTER_SERVER);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__CHARACTER_TRANSMISSION_TIME);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__MESSAGE_PARTITIONING);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__PACKET_RECEIVE_OPERATION);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__PACKET_SEND_OPERATION);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__PACKET_SERVER);
		createEAttribute(characterPacketDriverEClass, CHARACTER_PACKET_DRIVER__RTA_OVERHEAD_MODEL);

		compositeOperationEClass = createEClass(COMPOSITE_OPERATION);
		createEReference(compositeOperationEClass, COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY);
		createEReference(compositeOperationEClass, COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP);
		createEAttribute(compositeOperationEClass, COMPOSITE_OPERATION__OPERATION_LIST);
		createEAttribute(compositeOperationEClass, COMPOSITE_OPERATION__NAME);

		compositeTimingRequirementEClass = createEClass(COMPOSITE_TIMING_REQUIREMENT);
		createEAttribute(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__GROUP);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE);
		createEReference(compositeTimingRequirementEClass, COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO);

		concentratorEClass = createEClass(CONCENTRATOR);
		createEAttribute(concentratorEClass, CONCENTRATOR__INPUT_EVENTS_LIST);
		createEAttribute(concentratorEClass, CONCENTRATOR__OUTPUT_EVENT);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__DELAY_MAX_INTERVAL);
		createEAttribute(delayEClass, DELAY__DELAY_MIN_INTERVAL);
		createEAttribute(delayEClass, DELAY__INPUT_EVENT);
		createEAttribute(delayEClass, DELAY__OUTPUT_EVENT);

		deliveryServerEClass = createEClass(DELIVERY_SERVER);
		createEAttribute(deliveryServerEClass, DELIVERY_SERVER__DELIVERY_POLICY);
		createEAttribute(deliveryServerEClass, DELIVERY_SERVER__INPUT_EVENT);
		createEAttribute(deliveryServerEClass, DELIVERY_SERVER__OUTPUT_EVENTS_LIST);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MASTMODEL);

		edfPolicyEClass = createEClass(EDF_POLICY);
		createEAttribute(edfPolicyEClass, EDF_POLICY__DEADLINE);
		createEAttribute(edfPolicyEClass, EDF_POLICY__PREASSIGNED);

		edfSchedulerEClass = createEClass(EDF_SCHEDULER);
		createEAttribute(edfSchedulerEClass, EDF_SCHEDULER__AVG_CONTEXT_SWITCH);
		createEAttribute(edfSchedulerEClass, EDF_SCHEDULER__BEST_CONTEXT_SWITCH);
		createEAttribute(edfSchedulerEClass, EDF_SCHEDULER__WORST_CONTEXT_SWITCH);

		enclosingOperationEClass = createEClass(ENCLOSING_OPERATION);
		createEReference(enclosingOperationEClass, ENCLOSING_OPERATION__OVERRIDDEN_FIXED_PRIORITY);
		createEReference(enclosingOperationEClass, ENCLOSING_OPERATION__OVERRIDDEN_PERMANENT_FP);
		createEAttribute(enclosingOperationEClass, ENCLOSING_OPERATION__OPERATION_LIST);
		createEAttribute(enclosingOperationEClass, ENCLOSING_OPERATION__AVERAGE_CASE_EXECUTION_TIME);
		createEAttribute(enclosingOperationEClass, ENCLOSING_OPERATION__BEST_CASE_EXECUTION_TIME);
		createEAttribute(enclosingOperationEClass, ENCLOSING_OPERATION__NAME);
		createEAttribute(enclosingOperationEClass, ENCLOSING_OPERATION__WORST_CASE_EXECUTION_TIME);

		fixedPriorityPolicyEClass = createEClass(FIXED_PRIORITY_POLICY);
		createEAttribute(fixedPriorityPolicyEClass, FIXED_PRIORITY_POLICY__PREASSIGNED);
		createEAttribute(fixedPriorityPolicyEClass, FIXED_PRIORITY_POLICY__THE_PRIORITY);

		fixedPrioritySchedulerEClass = createEClass(FIXED_PRIORITY_SCHEDULER);
		createEAttribute(fixedPrioritySchedulerEClass, FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH);
		createEAttribute(fixedPrioritySchedulerEClass, FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH);
		createEAttribute(fixedPrioritySchedulerEClass, FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY);
		createEAttribute(fixedPrioritySchedulerEClass, FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY);
		createEAttribute(fixedPrioritySchedulerEClass, FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH);

		fpPacketBasedSchedulerEClass = createEClass(FP_PACKET_BASED_SCHEDULER);
		createEAttribute(fpPacketBasedSchedulerEClass, FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY);
		createEAttribute(fpPacketBasedSchedulerEClass, FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY);
		createEAttribute(fpPacketBasedSchedulerEClass, FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE);
		createEAttribute(fpPacketBasedSchedulerEClass, FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE);
		createEAttribute(fpPacketBasedSchedulerEClass, FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE);

		globalMaxMissRatioEClass = createEClass(GLOBAL_MAX_MISS_RATIO);
		createEAttribute(globalMaxMissRatioEClass, GLOBAL_MAX_MISS_RATIO__DEADLINE);
		createEAttribute(globalMaxMissRatioEClass, GLOBAL_MAX_MISS_RATIO__RATIO);
		createEAttribute(globalMaxMissRatioEClass, GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT);

		hardGlobalDeadlineEClass = createEClass(HARD_GLOBAL_DEADLINE);
		createEAttribute(hardGlobalDeadlineEClass, HARD_GLOBAL_DEADLINE__DEADLINE);
		createEAttribute(hardGlobalDeadlineEClass, HARD_GLOBAL_DEADLINE__REFERENCED_EVENT);

		hardLocalDeadlineEClass = createEClass(HARD_LOCAL_DEADLINE);
		createEAttribute(hardLocalDeadlineEClass, HARD_LOCAL_DEADLINE__DEADLINE);

		immediateCeilingResourceEClass = createEClass(IMMEDIATE_CEILING_RESOURCE);
		createEAttribute(immediateCeilingResourceEClass, IMMEDIATE_CEILING_RESOURCE__CEILING);
		createEAttribute(immediateCeilingResourceEClass, IMMEDIATE_CEILING_RESOURCE__NAME);
		createEAttribute(immediateCeilingResourceEClass, IMMEDIATE_CEILING_RESOURCE__PREASSIGNED);

		interruptFPPolicyEClass = createEClass(INTERRUPT_FP_POLICY);
		createEAttribute(interruptFPPolicyEClass, INTERRUPT_FP_POLICY__PREASSIGNED);
		createEAttribute(interruptFPPolicyEClass, INTERRUPT_FP_POLICY__THE_PRIORITY);

		listOfDriversEClass = createEClass(LIST_OF_DRIVERS);
		createEAttribute(listOfDriversEClass, LIST_OF_DRIVERS__GROUP);
		createEReference(listOfDriversEClass, LIST_OF_DRIVERS__PACKET_DRIVER);
		createEReference(listOfDriversEClass, LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER);
		createEReference(listOfDriversEClass, LIST_OF_DRIVERS__RTEP_PACKET_DRIVER);

		localMaxMissRatioEClass = createEClass(LOCAL_MAX_MISS_RATIO);
		createEAttribute(localMaxMissRatioEClass, LOCAL_MAX_MISS_RATIO__DEADLINE);
		createEAttribute(localMaxMissRatioEClass, LOCAL_MAX_MISS_RATIO__RATIO);

		mastmodelTypeEClass = createEClass(MASTMODEL_TYPE);
		createEAttribute(mastmodelTypeEClass, MASTMODEL_TYPE__GROUP);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__REGULAR_PROCESSOR);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__PACKET_BASED_NETWORK);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__SRP_RESOURCE);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__SIMPLE_OPERATION);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__MESSAGE_TRANSMISSION);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__COMPOSITE_OPERATION);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__ENCLOSING_OPERATION);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__REGULAR_TRANSACTION);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__PRIMARY_SCHEDULER);
		createEReference(mastmodelTypeEClass, MASTMODEL_TYPE__SECONDARY_SCHEDULER);
		createEAttribute(mastmodelTypeEClass, MASTMODEL_TYPE__MODEL_DATE);
		createEAttribute(mastmodelTypeEClass, MASTMODEL_TYPE__MODEL_NAME);
		createEAttribute(mastmodelTypeEClass, MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR);

		maxOutputJitterReqEClass = createEClass(MAX_OUTPUT_JITTER_REQ);
		createEAttribute(maxOutputJitterReqEClass, MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER);
		createEAttribute(maxOutputJitterReqEClass, MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT);

		messageTransmissionEClass = createEClass(MESSAGE_TRANSMISSION);
		createEReference(messageTransmissionEClass, MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY);
		createEReference(messageTransmissionEClass, MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP);
		createEAttribute(messageTransmissionEClass, MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE);
		createEAttribute(messageTransmissionEClass, MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE);
		createEAttribute(messageTransmissionEClass, MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE);
		createEAttribute(messageTransmissionEClass, MESSAGE_TRANSMISSION__NAME);

		multicastEClass = createEClass(MULTICAST);
		createEAttribute(multicastEClass, MULTICAST__INPUT_EVENT);
		createEAttribute(multicastEClass, MULTICAST__OUTPUT_EVENTS_LIST);

		nonPreemptibleFPPolicyEClass = createEClass(NON_PREEMPTIBLE_FP_POLICY);
		createEAttribute(nonPreemptibleFPPolicyEClass, NON_PREEMPTIBLE_FP_POLICY__PREASSIGNED);
		createEAttribute(nonPreemptibleFPPolicyEClass, NON_PREEMPTIBLE_FP_POLICY__THE_PRIORITY);

		offsetEClass = createEClass(OFFSET);
		createEAttribute(offsetEClass, OFFSET__DELAY_MAX_INTERVAL);
		createEAttribute(offsetEClass, OFFSET__DELAY_MIN_INTERVAL);
		createEAttribute(offsetEClass, OFFSET__INPUT_EVENT);
		createEAttribute(offsetEClass, OFFSET__OUTPUT_EVENT);
		createEAttribute(offsetEClass, OFFSET__REFERENCED_EVENT);

		overriddenFixedPriorityEClass = createEClass(OVERRIDDEN_FIXED_PRIORITY);
		createEAttribute(overriddenFixedPriorityEClass, OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY);

		overriddenPermanentFPEClass = createEClass(OVERRIDDEN_PERMANENT_FP);
		createEAttribute(overriddenPermanentFPEClass, OVERRIDDEN_PERMANENT_FP__THE_PRIORITY);

		packetBasedNetworkEClass = createEClass(PACKET_BASED_NETWORK);
		createEReference(packetBasedNetworkEClass, PACKET_BASED_NETWORK__LIST_OF_DRIVERS);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__MAX_BLOCKING);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__MAX_PACKET_SIZE);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__MIN_PACKET_SIZE);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__NAME);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__SPEED_FACTOR);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__THROUGHPUT);
		createEAttribute(packetBasedNetworkEClass, PACKET_BASED_NETWORK__TRANSMISSION);

		packetDriverEClass = createEClass(PACKET_DRIVER);
		createEAttribute(packetDriverEClass, PACKET_DRIVER__MESSAGE_PARTITIONING);
		createEAttribute(packetDriverEClass, PACKET_DRIVER__PACKET_RECEIVE_OPERATION);
		createEAttribute(packetDriverEClass, PACKET_DRIVER__PACKET_SEND_OPERATION);
		createEAttribute(packetDriverEClass, PACKET_DRIVER__PACKET_SERVER);
		createEAttribute(packetDriverEClass, PACKET_DRIVER__RTA_OVERHEAD_MODEL);

		periodicExternalEventEClass = createEClass(PERIODIC_EXTERNAL_EVENT);
		createEAttribute(periodicExternalEventEClass, PERIODIC_EXTERNAL_EVENT__MAX_JITTER);
		createEAttribute(periodicExternalEventEClass, PERIODIC_EXTERNAL_EVENT__NAME);
		createEAttribute(periodicExternalEventEClass, PERIODIC_EXTERNAL_EVENT__PERIOD);
		createEAttribute(periodicExternalEventEClass, PERIODIC_EXTERNAL_EVENT__PHASE);

		pollingPolicyEClass = createEClass(POLLING_POLICY);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_AVG_OVERHEAD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_BEST_OVERHEAD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_PERIOD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_WORST_OVERHEAD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__PREASSIGNED);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__THE_PRIORITY);

		primarySchedulerEClass = createEClass(PRIMARY_SCHEDULER);
		createEReference(primarySchedulerEClass, PRIMARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER);
		createEReference(primarySchedulerEClass, PRIMARY_SCHEDULER__EDF_SCHEDULER);
		createEReference(primarySchedulerEClass, PRIMARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER);
		createEAttribute(primarySchedulerEClass, PRIMARY_SCHEDULER__HOST);
		createEAttribute(primarySchedulerEClass, PRIMARY_SCHEDULER__NAME);

		priorityInheritanceResourceEClass = createEClass(PRIORITY_INHERITANCE_RESOURCE);
		createEAttribute(priorityInheritanceResourceEClass, PRIORITY_INHERITANCE_RESOURCE__NAME);

		queryServerEClass = createEClass(QUERY_SERVER);
		createEAttribute(queryServerEClass, QUERY_SERVER__INPUT_EVENT);
		createEAttribute(queryServerEClass, QUERY_SERVER__OUTPUT_EVENTS_LIST);
		createEAttribute(queryServerEClass, QUERY_SERVER__REQUEST_POLICY);

		rateDivisorEClass = createEClass(RATE_DIVISOR);
		createEAttribute(rateDivisorEClass, RATE_DIVISOR__INPUT_EVENT);
		createEAttribute(rateDivisorEClass, RATE_DIVISOR__OUTPUT_EVENT);
		createEAttribute(rateDivisorEClass, RATE_DIVISOR__RATE_FACTOR);

		regularEventEClass = createEClass(REGULAR_EVENT);
		createEAttribute(regularEventEClass, REGULAR_EVENT__GROUP);
		createEReference(regularEventEClass, REGULAR_EVENT__MAX_OUTPUT_JITTER_REQ);
		createEReference(regularEventEClass, REGULAR_EVENT__HARD_GLOBAL_DEADLINE);
		createEReference(regularEventEClass, REGULAR_EVENT__SOFT_GLOBAL_DEADLINE);
		createEReference(regularEventEClass, REGULAR_EVENT__GLOBAL_MAX_MISS_RATIO);
		createEReference(regularEventEClass, REGULAR_EVENT__HARD_LOCAL_DEADLINE);
		createEReference(regularEventEClass, REGULAR_EVENT__SOFT_LOCAL_DEADLINE);
		createEReference(regularEventEClass, REGULAR_EVENT__LOCAL_MAX_MISS_RATIO);
		createEReference(regularEventEClass, REGULAR_EVENT__COMPOSITE_TIMING_REQUIREMENT);
		createEAttribute(regularEventEClass, REGULAR_EVENT__EVENT);

		regularProcessorEClass = createEClass(REGULAR_PROCESSOR);
		createEReference(regularProcessorEClass, REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER);
		createEReference(regularProcessorEClass, REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__AVG_ISR_SWITCH);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__BEST_ISR_SWITCH);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__NAME);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__SPEED_FACTOR);
		createEAttribute(regularProcessorEClass, REGULAR_PROCESSOR__WORST_ISR_SWITCH);

		regularSchedulingServerEClass = createEClass(REGULAR_SCHEDULING_SERVER);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__POLLING_POLICY);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__EDF_POLICY);
		createEReference(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS);
		createEAttribute(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__NAME);
		createEAttribute(regularSchedulingServerEClass, REGULAR_SCHEDULING_SERVER__SCHEDULER);

		regularTransactionEClass = createEClass(REGULAR_TRANSACTION);
		createEAttribute(regularTransactionEClass, REGULAR_TRANSACTION__GROUP);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__REGULAR_EVENT);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__ACTIVITY);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__CONCENTRATOR);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__BARRIER);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__DELIVERY_SERVER);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__QUERY_SERVER);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__MULTICAST);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__RATE_DIVISOR);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__DELAY);
		createEReference(regularTransactionEClass, REGULAR_TRANSACTION__OFFSET);
		createEAttribute(regularTransactionEClass, REGULAR_TRANSACTION__NAME);

		rtepPacketDriverEClass = createEClass(RTEP_PACKET_DRIVER);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__FAILURE_TIMEOUT);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_SERVER);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__TOKEN_DELAY);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION);
		createEAttribute(rtepPacketDriverEClass, RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES);

		secondarySchedulerEClass = createEClass(SECONDARY_SCHEDULER);
		createEReference(secondarySchedulerEClass, SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER);
		createEReference(secondarySchedulerEClass, SECONDARY_SCHEDULER__EDF_SCHEDULER);
		createEReference(secondarySchedulerEClass, SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER);
		createEAttribute(secondarySchedulerEClass, SECONDARY_SCHEDULER__HOST);
		createEAttribute(secondarySchedulerEClass, SECONDARY_SCHEDULER__NAME);

		simpleOperationEClass = createEClass(SIMPLE_OPERATION);
		createEReference(simpleOperationEClass, SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY);
		createEReference(simpleOperationEClass, SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__SHARED_RESOURCES_LIST);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__NAME);
		createEAttribute(simpleOperationEClass, SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME);

		singularExternalEventEClass = createEClass(SINGULAR_EXTERNAL_EVENT);
		createEAttribute(singularExternalEventEClass, SINGULAR_EXTERNAL_EVENT__NAME);
		createEAttribute(singularExternalEventEClass, SINGULAR_EXTERNAL_EVENT__PHASE);

		softGlobalDeadlineEClass = createEClass(SOFT_GLOBAL_DEADLINE);
		createEAttribute(softGlobalDeadlineEClass, SOFT_GLOBAL_DEADLINE__DEADLINE);
		createEAttribute(softGlobalDeadlineEClass, SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT);

		softLocalDeadlineEClass = createEClass(SOFT_LOCAL_DEADLINE);
		createEAttribute(softLocalDeadlineEClass, SOFT_LOCAL_DEADLINE__DEADLINE);

		sporadicExternalEventEClass = createEClass(SPORADIC_EXTERNAL_EVENT);
		createEAttribute(sporadicExternalEventEClass, SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL);
		createEAttribute(sporadicExternalEventEClass, SPORADIC_EXTERNAL_EVENT__DISTRIBUTION);
		createEAttribute(sporadicExternalEventEClass, SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL);
		createEAttribute(sporadicExternalEventEClass, SPORADIC_EXTERNAL_EVENT__NAME);

		sporadicServerPolicyEClass = createEClass(SPORADIC_SERVER_POLICY);
		createEAttribute(sporadicServerPolicyEClass, SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY);
		createEAttribute(sporadicServerPolicyEClass, SPORADIC_SERVER_POLICY__INITIAL_CAPACITY);
		createEAttribute(sporadicServerPolicyEClass, SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS);
		createEAttribute(sporadicServerPolicyEClass, SPORADIC_SERVER_POLICY__NORMAL_PRIORITY);
		createEAttribute(sporadicServerPolicyEClass, SPORADIC_SERVER_POLICY__PREASSIGNED);
		createEAttribute(sporadicServerPolicyEClass, SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD);

		srpParametersEClass = createEClass(SRP_PARAMETERS);
		createEAttribute(srpParametersEClass, SRP_PARAMETERS__PREASSIGNED);
		createEAttribute(srpParametersEClass, SRP_PARAMETERS__PREEMPTION_LEVEL);

		srpResourceEClass = createEClass(SRP_RESOURCE);
		createEAttribute(srpResourceEClass, SRP_RESOURCE__NAME);
		createEAttribute(srpResourceEClass, SRP_RESOURCE__PREASSIGNED);
		createEAttribute(srpResourceEClass, SRP_RESOURCE__PREEMPTION_LEVEL);

		systemTimedActivityEClass = createEClass(SYSTEM_TIMED_ACTIVITY);
		createEAttribute(systemTimedActivityEClass, SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION);
		createEAttribute(systemTimedActivityEClass, SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER);
		createEAttribute(systemTimedActivityEClass, SYSTEM_TIMED_ACTIVITY__INPUT_EVENT);
		createEAttribute(systemTimedActivityEClass, SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT);

		tickerSystemTimerEClass = createEClass(TICKER_SYSTEM_TIMER);
		createEAttribute(tickerSystemTimerEClass, TICKER_SYSTEM_TIMER__AVG_OVERHEAD);
		createEAttribute(tickerSystemTimerEClass, TICKER_SYSTEM_TIMER__BEST_OVERHEAD);
		createEAttribute(tickerSystemTimerEClass, TICKER_SYSTEM_TIMER__PERIOD);
		createEAttribute(tickerSystemTimerEClass, TICKER_SYSTEM_TIMER__WORST_OVERHEAD);

		unboundedExternalEventEClass = createEClass(UNBOUNDED_EXTERNAL_EVENT);
		createEAttribute(unboundedExternalEventEClass, UNBOUNDED_EXTERNAL_EVENT__AVG_INTERARRIVAL);
		createEAttribute(unboundedExternalEventEClass, UNBOUNDED_EXTERNAL_EVENT__DISTRIBUTION);
		createEAttribute(unboundedExternalEventEClass, UNBOUNDED_EXTERNAL_EVENT__NAME);

		// Create enums
		affirmativeAssertionEEnum = createEEnum(AFFIRMATIVE_ASSERTION);
		assertionEEnum = createEEnum(ASSERTION);
		deliveryPolicyEEnum = createEEnum(DELIVERY_POLICY);
		distributionTypeEEnum = createEEnum(DISTRIBUTION_TYPE);
		negativeAssertionEEnum = createEEnum(NEGATIVE_ASSERTION);
		overheadTypeEEnum = createEEnum(OVERHEAD_TYPE);
		priorityInheritanceProtocolEEnum = createEEnum(PRIORITY_INHERITANCE_PROTOCOL);
		requestPolicyEEnum = createEEnum(REQUEST_POLICY);
		transmissionTypeEEnum = createEEnum(TRANSMISSION_TYPE);

		// Create data types
		absoluteTimeEDataType = createEDataType(ABSOLUTE_TIME);
		absoluteTimeObjectEDataType = createEDataType(ABSOLUTE_TIME_OBJECT);
		affirmativeAssertionObjectEDataType = createEDataType(AFFIRMATIVE_ASSERTION_OBJECT);
		anyPriorityEDataType = createEDataType(ANY_PRIORITY);
		assertionObjectEDataType = createEDataType(ASSERTION_OBJECT);
		bitCountEDataType = createEDataType(BIT_COUNT);
		bitCountObjectEDataType = createEDataType(BIT_COUNT_OBJECT);
		dateTimeEDataType = createEDataType(DATE_TIME);
		deliveryPolicyObjectEDataType = createEDataType(DELIVERY_POLICY_OBJECT);
		distributionTypeObjectEDataType = createEDataType(DISTRIBUTION_TYPE_OBJECT);
		floatEDataType = createEDataType(FLOAT);
		floatObjectEDataType = createEDataType(FLOAT_OBJECT);
		identifierEDataType = createEDataType(IDENTIFIER);
		identifierRefEDataType = createEDataType(IDENTIFIER_REF);
		identifierRefListEDataType = createEDataType(IDENTIFIER_REF_LIST);
		interruptPriorityEDataType = createEDataType(INTERRUPT_PRIORITY);
		naturalEDataType = createEDataType(NATURAL);
		negativeAssertionObjectEDataType = createEDataType(NEGATIVE_ASSERTION_OBJECT);
		normalizedExecutionTimeEDataType = createEDataType(NORMALIZED_EXECUTION_TIME);
		normalizedExecutionTimeObjectEDataType = createEDataType(NORMALIZED_EXECUTION_TIME_OBJECT);
		overheadTypeObjectEDataType = createEDataType(OVERHEAD_TYPE_OBJECT);
		pathnameEDataType = createEDataType(PATHNAME);
		percentageEDataType = createEDataType(PERCENTAGE);
		percentageObjectEDataType = createEDataType(PERCENTAGE_OBJECT);
		positiveEDataType = createEDataType(POSITIVE);
		preemptionLevelEDataType = createEDataType(PREEMPTION_LEVEL);
		priorityEDataType = createEDataType(PRIORITY);
		priorityInheritanceProtocolObjectEDataType = createEDataType(PRIORITY_INHERITANCE_PROTOCOL_OBJECT);
		requestPolicyObjectEDataType = createEDataType(REQUEST_POLICY_OBJECT);
		throughputEDataType = createEDataType(THROUGHPUT);
		throughputObjectEDataType = createEDataType(THROUGHPUT_OBJECT);
		timeEDataType = createEDataType(TIME);
		timeObjectEDataType = createEDataType(TIME_OBJECT);
		transmissionTypeObjectEDataType = createEDataType(TRANSMISSION_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_ActivityOperation(), this.getIdentifierRef(), "activityOperation", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_ActivityServer(), this.getIdentifierRef(), "activityServer", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alarmClockSystemTimerEClass, AlarmClockSystemTimer.class, "AlarmClockSystemTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlarmClockSystemTimer_AvgOverhead(), this.getNormalizedExecutionTime(), "avgOverhead", null, 0, 1, AlarmClockSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmClockSystemTimer_BestOverhead(), this.getNormalizedExecutionTime(), "bestOverhead", null, 0, 1, AlarmClockSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarmClockSystemTimer_WorstOverhead(), this.getNormalizedExecutionTime(), "worstOverhead", null, 0, 1, AlarmClockSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barrierEClass, Barrier.class, "Barrier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBarrier_InputEventsList(), this.getIdentifierRefList(), "inputEventsList", null, 1, 1, Barrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarrier_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, Barrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(burstyExternalEventEClass, BurstyExternalEvent.class, "BurstyExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBurstyExternalEvent_AvgInterarrival(), this.getTime(), "avgInterarrival", null, 0, 1, BurstyExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstyExternalEvent_BoundInterval(), this.getTime(), "boundInterval", null, 0, 1, BurstyExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstyExternalEvent_Distribution(), this.getDistributionType(), "distribution", null, 0, 1, BurstyExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstyExternalEvent_MaxArrivals(), theXMLTypePackage.getPositiveInteger(), "maxArrivals", null, 0, 1, BurstyExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBurstyExternalEvent_Name(), this.getIdentifier(), "name", null, 1, 1, BurstyExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterPacketDriverEClass, CharacterPacketDriver.class, "CharacterPacketDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterPacketDriver_CharacterReceiveOperation(), this.getIdentifierRef(), "characterReceiveOperation", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_CharacterSendOperation(), this.getIdentifierRef(), "characterSendOperation", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_CharacterServer(), this.getIdentifierRef(), "characterServer", null, 1, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_CharacterTransmissionTime(), this.getTime(), "characterTransmissionTime", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_MessagePartitioning(), this.getAssertion(), "messagePartitioning", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_PacketReceiveOperation(), this.getIdentifierRef(), "packetReceiveOperation", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_PacketSendOperation(), this.getIdentifierRef(), "packetSendOperation", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_PacketServer(), this.getIdentifierRef(), "packetServer", null, 1, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterPacketDriver_RTAOverheadModel(), this.getOverheadType(), "rTAOverheadModel", null, 0, 1, CharacterPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeOperationEClass, CompositeOperation.class, "CompositeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeOperation_OverriddenFixedPriority(), this.getOverriddenFixedPriority(), null, "overriddenFixedPriority", null, 0, 1, CompositeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeOperation_OverriddenPermanentFP(), this.getOverriddenPermanentFP(), null, "overriddenPermanentFP", null, 0, 1, CompositeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeOperation_OperationList(), this.getIdentifierRefList(), "operationList", null, 1, 1, CompositeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeOperation_Name(), this.getIdentifier(), "name", null, 1, 1, CompositeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeTimingRequirementEClass, CompositeTimingRequirement.class, "CompositeTimingRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeTimingRequirement_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CompositeTimingRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_MaxOutputJitterReq(), this.getMaxOutputJitterReq(), null, "maxOutputJitterReq", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_HardGlobalDeadline(), this.getHardGlobalDeadline(), null, "hardGlobalDeadline", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_SoftGlobalDeadline(), this.getSoftGlobalDeadline(), null, "softGlobalDeadline", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_GlobalMaxMissRatio(), this.getGlobalMaxMissRatio(), null, "globalMaxMissRatio", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_HardLocalDeadline(), this.getHardLocalDeadline(), null, "hardLocalDeadline", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_SoftLocalDeadline(), this.getSoftLocalDeadline(), null, "softLocalDeadline", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeTimingRequirement_LocalMaxMissRatio(), this.getLocalMaxMissRatio(), null, "localMaxMissRatio", null, 0, -1, CompositeTimingRequirement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(concentratorEClass, Concentrator.class, "Concentrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcentrator_InputEventsList(), this.getIdentifierRefList(), "inputEventsList", null, 1, 1, Concentrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcentrator_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, Concentrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_DelayMaxInterval(), this.getTime(), "delayMaxInterval", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_DelayMinInterval(), this.getTime(), "delayMinInterval", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryServerEClass, DeliveryServer.class, "DeliveryServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliveryServer_DeliveryPolicy(), this.getDeliveryPolicy(), "deliveryPolicy", null, 0, 1, DeliveryServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryServer_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, DeliveryServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryServer_OutputEventsList(), this.getIdentifierRefList(), "outputEventsList", null, 1, 1, DeliveryServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MASTMODEL(), this.getMASTMODELType(), null, "mASTMODEL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(edfPolicyEClass, EDFPolicy.class, "EDFPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDFPolicy_Deadline(), this.getTime(), "deadline", null, 0, 1, EDFPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDFPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, EDFPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edfSchedulerEClass, EDFScheduler.class, "EDFScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDFScheduler_AvgContextSwitch(), this.getNormalizedExecutionTime(), "avgContextSwitch", null, 0, 1, EDFScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDFScheduler_BestContextSwitch(), this.getNormalizedExecutionTime(), "bestContextSwitch", null, 0, 1, EDFScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDFScheduler_WorstContextSwitch(), this.getNormalizedExecutionTime(), "worstContextSwitch", null, 0, 1, EDFScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enclosingOperationEClass, EnclosingOperation.class, "EnclosingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnclosingOperation_OverriddenFixedPriority(), this.getOverriddenFixedPriority(), null, "overriddenFixedPriority", null, 0, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnclosingOperation_OverriddenPermanentFP(), this.getOverriddenPermanentFP(), null, "overriddenPermanentFP", null, 0, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnclosingOperation_OperationList(), this.getIdentifierRefList(), "operationList", null, 1, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnclosingOperation_AverageCaseExecutionTime(), this.getNormalizedExecutionTime(), "averageCaseExecutionTime", null, 0, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnclosingOperation_BestCaseExecutionTime(), this.getNormalizedExecutionTime(), "bestCaseExecutionTime", null, 0, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnclosingOperation_Name(), this.getIdentifier(), "name", null, 1, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnclosingOperation_WorstCaseExecutionTime(), this.getNormalizedExecutionTime(), "worstCaseExecutionTime", null, 0, 1, EnclosingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPriorityPolicyEClass, FixedPriorityPolicy.class, "FixedPriorityPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedPriorityPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, FixedPriorityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPriorityPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, FixedPriorityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPrioritySchedulerEClass, FixedPriorityScheduler.class, "FixedPriorityScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedPriorityScheduler_AvgContextSwitch(), this.getNormalizedExecutionTime(), "avgContextSwitch", null, 0, 1, FixedPriorityScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPriorityScheduler_BestContextSwitch(), this.getNormalizedExecutionTime(), "bestContextSwitch", null, 0, 1, FixedPriorityScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPriorityScheduler_MaxPriority(), this.getPriority(), "maxPriority", null, 0, 1, FixedPriorityScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPriorityScheduler_MinPriority(), this.getPriority(), "minPriority", null, 0, 1, FixedPriorityScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPriorityScheduler_WorstContextSwitch(), this.getNormalizedExecutionTime(), "worstContextSwitch", null, 0, 1, FixedPriorityScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpPacketBasedSchedulerEClass, FPPacketBasedScheduler.class, "FPPacketBasedScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFPPacketBasedScheduler_MaxPriority(), this.getPriority(), "maxPriority", null, 0, 1, FPPacketBasedScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPPacketBasedScheduler_MinPriority(), this.getPriority(), "minPriority", null, 0, 1, FPPacketBasedScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPPacketBasedScheduler_PacketOverheadAvgSize(), this.getBitCount(), "packetOverheadAvgSize", null, 0, 1, FPPacketBasedScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPPacketBasedScheduler_PacketOverheadMaxSize(), this.getBitCount(), "packetOverheadMaxSize", null, 0, 1, FPPacketBasedScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFPPacketBasedScheduler_PacketOverheadMinSize(), this.getBitCount(), "packetOverheadMinSize", null, 0, 1, FPPacketBasedScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalMaxMissRatioEClass, GlobalMaxMissRatio.class, "GlobalMaxMissRatio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalMaxMissRatio_Deadline(), this.getTime(), "deadline", null, 0, 1, GlobalMaxMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalMaxMissRatio_Ratio(), this.getPercentage(), "ratio", null, 0, 1, GlobalMaxMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalMaxMissRatio_ReferencedEvent(), this.getIdentifierRef(), "referencedEvent", null, 1, 1, GlobalMaxMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardGlobalDeadlineEClass, HardGlobalDeadline.class, "HardGlobalDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardGlobalDeadline_Deadline(), this.getTime(), "deadline", null, 0, 1, HardGlobalDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardGlobalDeadline_ReferencedEvent(), this.getIdentifierRef(), "referencedEvent", null, 1, 1, HardGlobalDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardLocalDeadlineEClass, HardLocalDeadline.class, "HardLocalDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardLocalDeadline_Deadline(), this.getTime(), "deadline", null, 0, 1, HardLocalDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(immediateCeilingResourceEClass, ImmediateCeilingResource.class, "ImmediateCeilingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImmediateCeilingResource_Ceiling(), this.getPriority(), "ceiling", null, 0, 1, ImmediateCeilingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateCeilingResource_Name(), this.getIdentifier(), "name", null, 1, 1, ImmediateCeilingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateCeilingResource_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, ImmediateCeilingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptFPPolicyEClass, InterruptFPPolicy.class, "InterruptFPPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterruptFPPolicy_Preassigned(), this.getAffirmativeAssertion(), "preassigned", null, 0, 1, InterruptFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptFPPolicy_ThePriority(), this.getInterruptPriority(), "thePriority", null, 0, 1, InterruptFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfDriversEClass, ListOfDrivers.class, "ListOfDrivers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListOfDrivers_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ListOfDrivers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListOfDrivers_PacketDriver(), this.getPacketDriver(), null, "packetDriver", null, 0, -1, ListOfDrivers.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOfDrivers_CharacterPacketDriver(), this.getCharacterPacketDriver(), null, "characterPacketDriver", null, 0, -1, ListOfDrivers.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getListOfDrivers_RTEPPacketDriver(), this.getRTEPPacketDriver(), null, "rTEPPacketDriver", null, 0, -1, ListOfDrivers.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(localMaxMissRatioEClass, LocalMaxMissRatio.class, "LocalMaxMissRatio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalMaxMissRatio_Deadline(), this.getTime(), "deadline", null, 0, 1, LocalMaxMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalMaxMissRatio_Ratio(), this.getPercentage(), "ratio", null, 0, 1, LocalMaxMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mastmodelTypeEClass, MASTMODELType.class, "MASTMODELType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMASTMODELType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MASTMODELType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_RegularProcessor(), this.getRegularProcessor(), null, "regularProcessor", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_PacketBasedNetwork(), this.getPacketBasedNetwork(), null, "packetBasedNetwork", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_RegularSchedulingServer(), this.getRegularSchedulingServer(), null, "regularSchedulingServer", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_ImmediateCeilingResource(), this.getImmediateCeilingResource(), null, "immediateCeilingResource", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_PriorityInheritanceResource(), this.getPriorityInheritanceResource(), null, "priorityInheritanceResource", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_SRPResource(), this.getSRPResource(), null, "sRPResource", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_SimpleOperation(), this.getSimpleOperation(), null, "simpleOperation", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_MessageTransmission(), this.getMessageTransmission(), null, "messageTransmission", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_CompositeOperation(), this.getCompositeOperation(), null, "compositeOperation", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_EnclosingOperation(), this.getEnclosingOperation(), null, "enclosingOperation", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_RegularTransaction(), this.getRegularTransaction(), null, "regularTransaction", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_PrimaryScheduler(), this.getPrimaryScheduler(), null, "primaryScheduler", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMASTMODELType_SecondaryScheduler(), this.getSecondaryScheduler(), null, "secondaryScheduler", null, 0, -1, MASTMODELType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMASTMODELType_ModelDate(), this.getDateTime(), "modelDate", null, 1, 1, MASTMODELType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMASTMODELType_ModelName(), this.getIdentifier(), "modelName", null, 1, 1, MASTMODELType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMASTMODELType_SystemPiPBehaviour(), this.getPriorityInheritanceProtocol(), "systemPiPBehaviour", null, 0, 1, MASTMODELType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxOutputJitterReqEClass, MaxOutputJitterReq.class, "MaxOutputJitterReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxOutputJitterReq_MaxOutputJitter(), this.getTime(), "maxOutputJitter", null, 0, 1, MaxOutputJitterReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxOutputJitterReq_ReferencedEvent(), this.getIdentifierRef(), "referencedEvent", null, 1, 1, MaxOutputJitterReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageTransmissionEClass, MessageTransmission.class, "MessageTransmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageTransmission_OverriddenFixedPriority(), this.getOverriddenFixedPriority(), null, "overriddenFixedPriority", null, 0, 1, MessageTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageTransmission_OverriddenPermanentFP(), this.getOverriddenPermanentFP(), null, "overriddenPermanentFP", null, 0, 1, MessageTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageTransmission_AvgMessageSize(), this.getBitCount(), "avgMessageSize", null, 0, 1, MessageTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageTransmission_MaxMessageSize(), this.getBitCount(), "maxMessageSize", null, 0, 1, MessageTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageTransmission_MinMessageSize(), this.getBitCount(), "minMessageSize", null, 0, 1, MessageTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageTransmission_Name(), this.getIdentifier(), "name", null, 1, 1, MessageTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multicastEClass, Multicast.class, "Multicast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMulticast_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, Multicast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMulticast_OutputEventsList(), this.getIdentifierRefList(), "outputEventsList", null, 1, 1, Multicast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPreemptibleFPPolicyEClass, NonPreemptibleFPPolicy.class, "NonPreemptibleFPPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonPreemptibleFPPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, NonPreemptibleFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPreemptibleFPPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, NonPreemptibleFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffset_DelayMaxInterval(), this.getTime(), "delayMaxInterval", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_DelayMinInterval(), this.getTime(), "delayMinInterval", null, 0, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_ReferencedEvent(), this.getIdentifierRef(), "referencedEvent", null, 1, 1, Offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overriddenFixedPriorityEClass, OverriddenFixedPriority.class, "OverriddenFixedPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverriddenFixedPriority_ThePriority(), this.getPriority(), "thePriority", null, 1, 1, OverriddenFixedPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overriddenPermanentFPEClass, OverriddenPermanentFP.class, "OverriddenPermanentFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverriddenPermanentFP_ThePriority(), this.getPriority(), "thePriority", null, 1, 1, OverriddenPermanentFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packetBasedNetworkEClass, PacketBasedNetwork.class, "PacketBasedNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPacketBasedNetwork_ListOfDrivers(), this.getListOfDrivers(), null, "listOfDrivers", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_MaxBlocking(), this.getNormalizedExecutionTime(), "maxBlocking", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_MaxPacketSize(), this.getBitCount(), "maxPacketSize", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_MinPacketSize(), this.getBitCount(), "minPacketSize", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_Name(), this.getIdentifier(), "name", null, 1, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_SpeedFactor(), this.getFloat(), "speedFactor", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_Throughput(), this.getThroughput(), "throughput", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketBasedNetwork_Transmission(), this.getTransmissionType(), "transmission", null, 0, 1, PacketBasedNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packetDriverEClass, PacketDriver.class, "PacketDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPacketDriver_MessagePartitioning(), this.getAssertion(), "messagePartitioning", null, 0, 1, PacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketDriver_PacketReceiveOperation(), this.getIdentifierRef(), "packetReceiveOperation", null, 0, 1, PacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketDriver_PacketSendOperation(), this.getIdentifierRef(), "packetSendOperation", null, 0, 1, PacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketDriver_PacketServer(), this.getIdentifierRef(), "packetServer", null, 1, 1, PacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketDriver_RTAOverheadModel(), this.getOverheadType(), "rTAOverheadModel", null, 0, 1, PacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicExternalEventEClass, PeriodicExternalEvent.class, "PeriodicExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicExternalEvent_MaxJitter(), this.getTime(), "maxJitter", null, 0, 1, PeriodicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicExternalEvent_Name(), this.getIdentifier(), "name", null, 1, 1, PeriodicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicExternalEvent_Period(), this.getTime(), "period", null, 0, 1, PeriodicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicExternalEvent_Phase(), this.getAbsoluteTime(), "phase", null, 0, 1, PeriodicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollingPolicyEClass, PollingPolicy.class, "PollingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollingPolicy_PollingAvgOverhead(), this.getNormalizedExecutionTime(), "pollingAvgOverhead", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_PollingBestOverhead(), this.getNormalizedExecutionTime(), "pollingBestOverhead", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_PollingPeriod(), this.getTime(), "pollingPeriod", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_PollingWorstOverhead(), this.getNormalizedExecutionTime(), "pollingWorstOverhead", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primarySchedulerEClass, PrimaryScheduler.class, "PrimaryScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryScheduler_FixedPriorityScheduler(), this.getFixedPriorityScheduler(), null, "fixedPriorityScheduler", null, 0, 1, PrimaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryScheduler_EDFScheduler(), this.getEDFScheduler(), null, "eDFScheduler", null, 0, 1, PrimaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryScheduler_FPPacketBasedScheduler(), this.getFPPacketBasedScheduler(), null, "fPPacketBasedScheduler", null, 0, 1, PrimaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryScheduler_Host(), this.getIdentifierRef(), "host", null, 1, 1, PrimaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryScheduler_Name(), this.getIdentifier(), "name", null, 1, 1, PrimaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityInheritanceResourceEClass, PriorityInheritanceResource.class, "PriorityInheritanceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriorityInheritanceResource_Name(), this.getIdentifier(), "name", null, 1, 1, PriorityInheritanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryServerEClass, QueryServer.class, "QueryServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryServer_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, QueryServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryServer_OutputEventsList(), this.getIdentifierRefList(), "outputEventsList", null, 1, 1, QueryServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryServer_RequestPolicy(), this.getRequestPolicy(), "requestPolicy", null, 0, 1, QueryServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rateDivisorEClass, RateDivisor.class, "RateDivisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRateDivisor_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, RateDivisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateDivisor_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, RateDivisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateDivisor_RateFactor(), this.getPositive(), "rateFactor", null, 1, 1, RateDivisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularEventEClass, RegularEvent.class, "RegularEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularEvent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RegularEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_MaxOutputJitterReq(), this.getMaxOutputJitterReq(), null, "maxOutputJitterReq", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_HardGlobalDeadline(), this.getHardGlobalDeadline(), null, "hardGlobalDeadline", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_SoftGlobalDeadline(), this.getSoftGlobalDeadline(), null, "softGlobalDeadline", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_GlobalMaxMissRatio(), this.getGlobalMaxMissRatio(), null, "globalMaxMissRatio", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_HardLocalDeadline(), this.getHardLocalDeadline(), null, "hardLocalDeadline", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_SoftLocalDeadline(), this.getSoftLocalDeadline(), null, "softLocalDeadline", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_LocalMaxMissRatio(), this.getLocalMaxMissRatio(), null, "localMaxMissRatio", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularEvent_CompositeTimingRequirement(), this.getCompositeTimingRequirement(), null, "compositeTimingRequirement", null, 0, -1, RegularEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularEvent_Event(), this.getIdentifier(), "event", null, 1, 1, RegularEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularProcessorEClass, RegularProcessor.class, "RegularProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegularProcessor_TickerSystemTimer(), this.getTickerSystemTimer(), null, "tickerSystemTimer", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularProcessor_AlarmClockSystemTimer(), this.getAlarmClockSystemTimer(), null, "alarmClockSystemTimer", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_AvgISRSwitch(), this.getNormalizedExecutionTime(), "avgISRSwitch", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_BestISRSwitch(), this.getNormalizedExecutionTime(), "bestISRSwitch", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_MaxInterruptPriority(), this.getInterruptPriority(), "maxInterruptPriority", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_MinInterruptPriority(), this.getInterruptPriority(), "minInterruptPriority", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_Name(), this.getIdentifier(), "name", null, 1, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_SpeedFactor(), this.getFloat(), "speedFactor", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularProcessor_WorstISRSwitch(), this.getNormalizedExecutionTime(), "worstISRSwitch", null, 0, 1, RegularProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularSchedulingServerEClass, RegularSchedulingServer.class, "RegularSchedulingServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegularSchedulingServer_NonPreemptibleFPPolicy(), this.getNonPreemptibleFPPolicy(), null, "nonPreemptibleFPPolicy", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularSchedulingServer_FixedPriorityPolicy(), this.getFixedPriorityPolicy(), null, "fixedPriorityPolicy", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularSchedulingServer_InterruptFPPolicy(), this.getInterruptFPPolicy(), null, "interruptFPPolicy", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularSchedulingServer_PollingPolicy(), this.getPollingPolicy(), null, "pollingPolicy", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularSchedulingServer_SporadicServerPolicy(), this.getSporadicServerPolicy(), null, "sporadicServerPolicy", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularSchedulingServer_EDFPolicy(), this.getEDFPolicy(), null, "eDFPolicy", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularSchedulingServer_SRPParameters(), this.getSRPParameters(), null, "sRPParameters", null, 0, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularSchedulingServer_Name(), this.getIdentifier(), "name", null, 1, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularSchedulingServer_Scheduler(), this.getIdentifierRef(), "scheduler", null, 1, 1, RegularSchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularTransactionEClass, RegularTransaction.class, "RegularTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularTransaction_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RegularTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_PeriodicExternalEvent(), this.getPeriodicExternalEvent(), null, "periodicExternalEvent", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_SporadicExternalEvent(), this.getSporadicExternalEvent(), null, "sporadicExternalEvent", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_UnboundedExternalEvent(), this.getUnboundedExternalEvent(), null, "unboundedExternalEvent", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_BurstyExternalEvent(), this.getBurstyExternalEvent(), null, "burstyExternalEvent", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_SingularExternalEvent(), this.getSingularExternalEvent(), null, "singularExternalEvent", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_RegularEvent(), this.getRegularEvent(), null, "regularEvent", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_Activity(), this.getActivity(), null, "activity", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_SystemTimedActivity(), this.getSystemTimedActivity(), null, "systemTimedActivity", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_Concentrator(), this.getConcentrator(), null, "concentrator", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_Barrier(), this.getBarrier(), null, "barrier", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_DeliveryServer(), this.getDeliveryServer(), null, "deliveryServer", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_QueryServer(), this.getQueryServer(), null, "queryServer", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_Multicast(), this.getMulticast(), null, "multicast", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_RateDivisor(), this.getRateDivisor(), null, "rateDivisor", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_Delay(), this.getDelay(), null, "delay", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTransaction_Offset(), this.getOffset(), null, "offset", null, 0, -1, RegularTransaction.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularTransaction_Name(), this.getIdentifier(), "name", null, 1, 1, RegularTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtepPacketDriverEClass, RTEPPacketDriver.class, "RTEPPacketDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRTEPPacketDriver_FailureTimeout(), this.getTime(), "failureTimeout", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_MessagePartitioning(), this.getAssertion(), "messagePartitioning", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_NumberOfStations(), this.getPositive(), "numberOfStations", null, 1, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketDiscardOperation(), this.getIdentifierRef(), "packetDiscardOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketInterruptServer(), this.getIdentifierRef(), "packetInterruptServer", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketISROperation(), this.getIdentifierRef(), "packetISROperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketReceiveOperation(), this.getIdentifierRef(), "packetReceiveOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketRetransmissionOperation(), this.getIdentifierRef(), "packetRetransmissionOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketSendOperation(), this.getIdentifierRef(), "packetSendOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketServer(), this.getIdentifierRef(), "packetServer", null, 1, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_PacketTransmissionRetries(), this.getNatural(), "packetTransmissionRetries", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_RTAOverheadModel(), this.getOverheadType(), "rTAOverheadModel", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_TokenCheckOperation(), this.getIdentifierRef(), "tokenCheckOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_TokenDelay(), this.getTime(), "tokenDelay", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_TokenManageOperation(), this.getIdentifierRef(), "tokenManageOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_TokenRetransmissionOperation(), this.getIdentifierRef(), "tokenRetransmissionOperation", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTEPPacketDriver_TokenTransmissionRetries(), this.getNatural(), "tokenTransmissionRetries", null, 0, 1, RTEPPacketDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondarySchedulerEClass, SecondaryScheduler.class, "SecondaryScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecondaryScheduler_FixedPriorityScheduler(), this.getFixedPriorityScheduler(), null, "fixedPriorityScheduler", null, 0, 1, SecondaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondaryScheduler_EDFScheduler(), this.getEDFScheduler(), null, "eDFScheduler", null, 0, 1, SecondaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondaryScheduler_FPPacketBasedScheduler(), this.getFPPacketBasedScheduler(), null, "fPPacketBasedScheduler", null, 0, 1, SecondaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryScheduler_Host(), this.getIdentifierRef(), "host", null, 1, 1, SecondaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryScheduler_Name(), this.getIdentifier(), "name", null, 1, 1, SecondaryScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleOperationEClass, SimpleOperation.class, "SimpleOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleOperation_OverriddenFixedPriority(), this.getOverriddenFixedPriority(), null, "overriddenFixedPriority", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleOperation_OverriddenPermanentFP(), this.getOverriddenPermanentFP(), null, "overriddenPermanentFP", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_SharedResourcesList(), this.getIdentifierRefList(), "sharedResourcesList", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_SharedResourcesToLock(), this.getIdentifierRefList(), "sharedResourcesToLock", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_SharedResourcesToUnlock(), this.getIdentifierRefList(), "sharedResourcesToUnlock", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_AverageCaseExecutionTime(), this.getNormalizedExecutionTime(), "averageCaseExecutionTime", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_BestCaseExecutionTime(), this.getNormalizedExecutionTime(), "bestCaseExecutionTime", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_Name(), this.getIdentifier(), "name", null, 1, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperation_WorstCaseExecutionTime(), this.getNormalizedExecutionTime(), "worstCaseExecutionTime", null, 0, 1, SimpleOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singularExternalEventEClass, SingularExternalEvent.class, "SingularExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingularExternalEvent_Name(), this.getIdentifier(), "name", null, 1, 1, SingularExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingularExternalEvent_Phase(), this.getAbsoluteTime(), "phase", null, 0, 1, SingularExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softGlobalDeadlineEClass, SoftGlobalDeadline.class, "SoftGlobalDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftGlobalDeadline_Deadline(), this.getTime(), "deadline", null, 0, 1, SoftGlobalDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftGlobalDeadline_ReferencedEvent(), this.getIdentifierRef(), "referencedEvent", null, 1, 1, SoftGlobalDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softLocalDeadlineEClass, SoftLocalDeadline.class, "SoftLocalDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftLocalDeadline_Deadline(), this.getTime(), "deadline", null, 0, 1, SoftLocalDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicExternalEventEClass, SporadicExternalEvent.class, "SporadicExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicExternalEvent_AvgInterarrival(), this.getTime(), "avgInterarrival", null, 0, 1, SporadicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicExternalEvent_Distribution(), this.getDistributionType(), "distribution", null, 0, 1, SporadicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicExternalEvent_MinInterarrival(), this.getTime(), "minInterarrival", null, 0, 1, SporadicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicExternalEvent_Name(), this.getIdentifier(), "name", null, 1, 1, SporadicExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicServerPolicyEClass, SporadicServerPolicy.class, "SporadicServerPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicServerPolicy_BackgroundPriority(), this.getPriority(), "backgroundPriority", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_InitialCapacity(), this.getTime(), "initialCapacity", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_MaxPendingReplenishments(), this.getPositive(), "maxPendingReplenishments", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_NormalPriority(), this.getPriority(), "normalPriority", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_ReplenishmentPeriod(), this.getTime(), "replenishmentPeriod", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srpParametersEClass, SRPParameters.class, "SRPParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRPParameters_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, SRPParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRPParameters_PreemptionLevel(), this.getPreemptionLevel(), "preemptionLevel", null, 1, 1, SRPParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srpResourceEClass, SRPResource.class, "SRPResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRPResource_Name(), this.getIdentifier(), "name", null, 1, 1, SRPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRPResource_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, SRPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRPResource_PreemptionLevel(), this.getPreemptionLevel(), "preemptionLevel", null, 0, 1, SRPResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTimedActivityEClass, SystemTimedActivity.class, "SystemTimedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemTimedActivity_ActivityOperation(), this.getIdentifierRef(), "activityOperation", null, 1, 1, SystemTimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemTimedActivity_ActivityServer(), this.getIdentifierRef(), "activityServer", null, 1, 1, SystemTimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemTimedActivity_InputEvent(), this.getIdentifierRef(), "inputEvent", null, 1, 1, SystemTimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemTimedActivity_OutputEvent(), this.getIdentifierRef(), "outputEvent", null, 1, 1, SystemTimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tickerSystemTimerEClass, TickerSystemTimer.class, "TickerSystemTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTickerSystemTimer_AvgOverhead(), this.getNormalizedExecutionTime(), "avgOverhead", null, 0, 1, TickerSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTickerSystemTimer_BestOverhead(), this.getNormalizedExecutionTime(), "bestOverhead", null, 0, 1, TickerSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTickerSystemTimer_Period(), this.getTime(), "period", null, 0, 1, TickerSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTickerSystemTimer_WorstOverhead(), this.getNormalizedExecutionTime(), "worstOverhead", null, 0, 1, TickerSystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unboundedExternalEventEClass, UnboundedExternalEvent.class, "UnboundedExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnboundedExternalEvent_AvgInterarrival(), this.getTime(), "avgInterarrival", null, 0, 1, UnboundedExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnboundedExternalEvent_Distribution(), this.getDistributionType(), "distribution", null, 0, 1, UnboundedExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnboundedExternalEvent_Name(), this.getIdentifier(), "name", null, 1, 1, UnboundedExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(affirmativeAssertionEEnum, AffirmativeAssertion.class, "AffirmativeAssertion");
		addEEnumLiteral(affirmativeAssertionEEnum, AffirmativeAssertion.YES);

		initEEnum(assertionEEnum, Assertion.class, "Assertion");
		addEEnumLiteral(assertionEEnum, Assertion.YES);
		addEEnumLiteral(assertionEEnum, Assertion.NO);

		initEEnum(deliveryPolicyEEnum, DeliveryPolicy.class, "DeliveryPolicy");
		addEEnumLiteral(deliveryPolicyEEnum, DeliveryPolicy.SCAN);
		addEEnumLiteral(deliveryPolicyEEnum, DeliveryPolicy.RANDOM);

		initEEnum(distributionTypeEEnum, DistributionType.class, "DistributionType");
		addEEnumLiteral(distributionTypeEEnum, DistributionType.UNIFORM);
		addEEnumLiteral(distributionTypeEEnum, DistributionType.POISSON);

		initEEnum(negativeAssertionEEnum, NegativeAssertion.class, "NegativeAssertion");
		addEEnumLiteral(negativeAssertionEEnum, NegativeAssertion.NO);

		initEEnum(overheadTypeEEnum, OverheadType.class, "OverheadType");
		addEEnumLiteral(overheadTypeEEnum, OverheadType.COUPLED);
		addEEnumLiteral(overheadTypeEEnum, OverheadType.DECOUPLED);

		initEEnum(priorityInheritanceProtocolEEnum, PriorityInheritanceProtocol.class, "PriorityInheritanceProtocol");
		addEEnumLiteral(priorityInheritanceProtocolEEnum, PriorityInheritanceProtocol.STRICT);
		addEEnumLiteral(priorityInheritanceProtocolEEnum, PriorityInheritanceProtocol.POSIX);

		initEEnum(requestPolicyEEnum, RequestPolicy.class, "RequestPolicy");
		addEEnumLiteral(requestPolicyEEnum, RequestPolicy.PRIORITY);
		addEEnumLiteral(requestPolicyEEnum, RequestPolicy.FIFO);
		addEEnumLiteral(requestPolicyEEnum, RequestPolicy.LIFO);
		addEEnumLiteral(requestPolicyEEnum, RequestPolicy.SCAN);

		initEEnum(transmissionTypeEEnum, TransmissionType.class, "TransmissionType");
		addEEnumLiteral(transmissionTypeEEnum, TransmissionType.SIMPLEX);
		addEEnumLiteral(transmissionTypeEEnum, TransmissionType.HALFDUPLEX);
		addEEnumLiteral(transmissionTypeEEnum, TransmissionType.FULLDUPLEX);

		// Initialize data types
		initEDataType(absoluteTimeEDataType, float.class, "AbsoluteTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(absoluteTimeObjectEDataType, Float.class, "AbsoluteTimeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(affirmativeAssertionObjectEDataType, AffirmativeAssertion.class, "AffirmativeAssertionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anyPriorityEDataType, BigInteger.class, "AnyPriority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(assertionObjectEDataType, Assertion.class, "AssertionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bitCountEDataType, float.class, "BitCount", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bitCountObjectEDataType, Float.class, "BitCountObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeEDataType, XMLGregorianCalendar.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deliveryPolicyObjectEDataType, DeliveryPolicy.class, "DeliveryPolicyObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(distributionTypeObjectEDataType, DistributionType.class, "DistributionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatObjectEDataType, Float.class, "FloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierRefEDataType, String.class, "IdentifierRef", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierRefListEDataType, List.class, "IdentifierRefList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interruptPriorityEDataType, BigInteger.class, "InterruptPriority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(naturalEDataType, BigInteger.class, "Natural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(negativeAssertionObjectEDataType, NegativeAssertion.class, "NegativeAssertionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalizedExecutionTimeEDataType, float.class, "NormalizedExecutionTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalizedExecutionTimeObjectEDataType, Float.class, "NormalizedExecutionTimeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(overheadTypeObjectEDataType, OverheadType.class, "OverheadTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pathnameEDataType, String.class, "Pathname", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageEDataType, float.class, "Percentage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageObjectEDataType, Float.class, "PercentageObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveEDataType, BigInteger.class, "Positive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preemptionLevelEDataType, BigInteger.class, "PreemptionLevel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(priorityEDataType, BigInteger.class, "Priority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(priorityInheritanceProtocolObjectEDataType, PriorityInheritanceProtocol.class, "PriorityInheritanceProtocolObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requestPolicyObjectEDataType, RequestPolicy.class, "RequestPolicyObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(throughputEDataType, float.class, "Throughput", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(throughputObjectEDataType, Float.class, "ThroughputObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeEDataType, float.class, "Time", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeObjectEDataType, Float.class, "TimeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transmissionTypeObjectEDataType, TransmissionType.class, "TransmissionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (absoluteTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Absolute_Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0"
		   });	
		addAnnotation
		  (absoluteTimeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Absolute_Time:Object",
			 "baseType", "Absolute_Time"
		   });	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "name", "Activity",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getActivity_ActivityOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Activity_Operation"
		   });	
		addAnnotation
		  (getActivity_ActivityServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Activity_Server"
		   });	
		addAnnotation
		  (getActivity_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getActivity_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (affirmativeAssertionEEnum, 
		   source, 
		   new String[] {
			 "name", "Affirmative_Assertion"
		   });	
		addAnnotation
		  (affirmativeAssertionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Affirmative_Assertion:Object",
			 "baseType", "Affirmative_Assertion"
		   });	
		addAnnotation
		  (alarmClockSystemTimerEClass, 
		   source, 
		   new String[] {
			 "name", "Alarm_Clock_System_Timer",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAlarmClockSystemTimer_AvgOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Overhead"
		   });	
		addAnnotation
		  (getAlarmClockSystemTimer_BestOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Overhead"
		   });	
		addAnnotation
		  (getAlarmClockSystemTimer_WorstOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Overhead"
		   });	
		addAnnotation
		  (anyPriorityEDataType, 
		   source, 
		   new String[] {
			 "name", "Any_Priority",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });	
		addAnnotation
		  (assertionEEnum, 
		   source, 
		   new String[] {
			 "name", "Assertion"
		   });	
		addAnnotation
		  (assertionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Assertion:Object",
			 "baseType", "Assertion"
		   });	
		addAnnotation
		  (barrierEClass, 
		   source, 
		   new String[] {
			 "name", "Barrier",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBarrier_InputEventsList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Events_List"
		   });	
		addAnnotation
		  (getBarrier_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (bitCountEDataType, 
		   source, 
		   new String[] {
			 "name", "Bit_Count",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0"
		   });	
		addAnnotation
		  (bitCountObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Bit_Count:Object",
			 "baseType", "Bit_Count"
		   });	
		addAnnotation
		  (burstyExternalEventEClass, 
		   source, 
		   new String[] {
			 "name", "Bursty_External_Event",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBurstyExternalEvent_AvgInterarrival(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Interarrival"
		   });	
		addAnnotation
		  (getBurstyExternalEvent_BoundInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Bound_Interval"
		   });	
		addAnnotation
		  (getBurstyExternalEvent_Distribution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Distribution"
		   });	
		addAnnotation
		  (getBurstyExternalEvent_MaxArrivals(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Arrivals"
		   });	
		addAnnotation
		  (getBurstyExternalEvent_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (characterPacketDriverEClass, 
		   source, 
		   new String[] {
			 "name", "Character_Packet_Driver",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_CharacterReceiveOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Character_Receive_Operation"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_CharacterSendOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Character_Send_Operation"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_CharacterServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Character_Server"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_CharacterTransmissionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Character_Transmission_Time"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_MessagePartitioning(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Message_Partitioning"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_PacketReceiveOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Receive_Operation"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_PacketSendOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Send_Operation"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_PacketServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Server"
		   });	
		addAnnotation
		  (getCharacterPacketDriver_RTAOverheadModel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RTA_Overhead_Model"
		   });	
		addAnnotation
		  (compositeOperationEClass, 
		   source, 
		   new String[] {
			 "name", "Composite_Operation",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCompositeOperation_OverriddenFixedPriority(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Fixed_Priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCompositeOperation_OverriddenPermanentFP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Permanent_FP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCompositeOperation_OperationList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Operation_List",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCompositeOperation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (compositeTimingRequirementEClass, 
		   source, 
		   new String[] {
			 "name", "Composite_Timing_Requirement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_MaxOutputJitterReq(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Max_Output_Jitter_Req",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_HardGlobalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hard_Global_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_SoftGlobalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Soft_Global_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_GlobalMaxMissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Global_Max_Miss_Ratio",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_HardLocalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hard_Local_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_SoftLocalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Soft_Local_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getCompositeTimingRequirement_LocalMaxMissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Local_Max_Miss_Ratio",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (concentratorEClass, 
		   source, 
		   new String[] {
			 "name", "Concentrator",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getConcentrator_InputEventsList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Events_List"
		   });	
		addAnnotation
		  (getConcentrator_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (dateTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Date_Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });	
		addAnnotation
		  (delayEClass, 
		   source, 
		   new String[] {
			 "name", "Delay",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDelay_DelayMaxInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Delay_Max_Interval"
		   });	
		addAnnotation
		  (getDelay_DelayMinInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Delay_Min_Interval"
		   });	
		addAnnotation
		  (getDelay_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getDelay_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (deliveryPolicyEEnum, 
		   source, 
		   new String[] {
			 "name", "Delivery_Policy"
		   });	
		addAnnotation
		  (deliveryPolicyObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Delivery_Policy:Object",
			 "baseType", "Delivery_Policy"
		   });	
		addAnnotation
		  (deliveryServerEClass, 
		   source, 
		   new String[] {
			 "name", "Delivery_Server",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDeliveryServer_DeliveryPolicy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Delivery_Policy"
		   });	
		addAnnotation
		  (getDeliveryServer_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getDeliveryServer_OutputEventsList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Events_List"
		   });	
		addAnnotation
		  (distributionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Distribution_Type"
		   });	
		addAnnotation
		  (distributionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Distribution_Type:Object",
			 "baseType", "Distribution_Type"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_MASTMODEL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MAST_MODEL",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (edfPolicyEClass, 
		   source, 
		   new String[] {
			 "name", "EDF_Policy",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEDFPolicy_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (getEDFPolicy_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (edfSchedulerEClass, 
		   source, 
		   new String[] {
			 "name", "EDF_Scheduler",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEDFScheduler_AvgContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Context_Switch"
		   });	
		addAnnotation
		  (getEDFScheduler_BestContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Context_Switch"
		   });	
		addAnnotation
		  (getEDFScheduler_WorstContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Context_Switch"
		   });	
		addAnnotation
		  (enclosingOperationEClass, 
		   source, 
		   new String[] {
			 "name", "Enclosing_Operation",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnclosingOperation_OverriddenFixedPriority(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Fixed_Priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnclosingOperation_OverriddenPermanentFP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Permanent_FP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnclosingOperation_OperationList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Operation_List",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEnclosingOperation_AverageCaseExecutionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Average_Case_Execution_Time"
		   });	
		addAnnotation
		  (getEnclosingOperation_BestCaseExecutionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Case_Execution_Time"
		   });	
		addAnnotation
		  (getEnclosingOperation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getEnclosingOperation_WorstCaseExecutionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Case_Execution_Time"
		   });	
		addAnnotation
		  (fixedPriorityPolicyEClass, 
		   source, 
		   new String[] {
			 "name", "Fixed_Priority_Policy",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFixedPriorityPolicy_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getFixedPriorityPolicy_ThePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "The_Priority"
		   });	
		addAnnotation
		  (fixedPrioritySchedulerEClass, 
		   source, 
		   new String[] {
			 "name", "Fixed_Priority_Scheduler",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFixedPriorityScheduler_AvgContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Context_Switch"
		   });	
		addAnnotation
		  (getFixedPriorityScheduler_BestContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Context_Switch"
		   });	
		addAnnotation
		  (getFixedPriorityScheduler_MaxPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Priority"
		   });	
		addAnnotation
		  (getFixedPriorityScheduler_MinPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min_Priority"
		   });	
		addAnnotation
		  (getFixedPriorityScheduler_WorstContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Context_Switch"
		   });	
		addAnnotation
		  (floatEDataType, 
		   source, 
		   new String[] {
			 "name", "Float",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float"
		   });	
		addAnnotation
		  (floatObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Float:Object",
			 "baseType", "Float"
		   });	
		addAnnotation
		  (fpPacketBasedSchedulerEClass, 
		   source, 
		   new String[] {
			 "name", "FP_Packet_Based_Scheduler",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFPPacketBasedScheduler_MaxPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Priority"
		   });	
		addAnnotation
		  (getFPPacketBasedScheduler_MinPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min_Priority"
		   });	
		addAnnotation
		  (getFPPacketBasedScheduler_PacketOverheadAvgSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Overhead_Avg_Size"
		   });	
		addAnnotation
		  (getFPPacketBasedScheduler_PacketOverheadMaxSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Overhead_Max_Size"
		   });	
		addAnnotation
		  (getFPPacketBasedScheduler_PacketOverheadMinSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Overhead_Min_Size"
		   });	
		addAnnotation
		  (globalMaxMissRatioEClass, 
		   source, 
		   new String[] {
			 "name", "Global_Max_Miss_Ratio",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getGlobalMaxMissRatio_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (getGlobalMaxMissRatio_Ratio(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ratio"
		   });	
		addAnnotation
		  (getGlobalMaxMissRatio_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (hardGlobalDeadlineEClass, 
		   source, 
		   new String[] {
			 "name", "Hard_Global_Deadline",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getHardGlobalDeadline_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (getHardGlobalDeadline_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (hardLocalDeadlineEClass, 
		   source, 
		   new String[] {
			 "name", "Hard_Local_Deadline",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getHardLocalDeadline_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (identifierEDataType, 
		   source, 
		   new String[] {
			 "name", "Identifier",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NCName",
			 "pattern", "([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*"
		   });	
		addAnnotation
		  (identifierRefEDataType, 
		   source, 
		   new String[] {
			 "name", "Identifier_Ref",
			 "baseType", "Identifier"
		   });	
		addAnnotation
		  (identifierRefListEDataType, 
		   source, 
		   new String[] {
			 "name", "Identifier_Ref_List",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKENS"
		   });	
		addAnnotation
		  (immediateCeilingResourceEClass, 
		   source, 
		   new String[] {
			 "name", "Immediate_Ceiling_Resource",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getImmediateCeilingResource_Ceiling(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ceiling"
		   });	
		addAnnotation
		  (getImmediateCeilingResource_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getImmediateCeilingResource_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (interruptFPPolicyEClass, 
		   source, 
		   new String[] {
			 "name", "Interrupt_FP_Policy",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getInterruptFPPolicy_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getInterruptFPPolicy_ThePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "The_Priority"
		   });	
		addAnnotation
		  (interruptPriorityEDataType, 
		   source, 
		   new String[] {
			 "name", "Interrupt_Priority",
			 "baseType", "Any_Priority"
		   });	
		addAnnotation
		  (listOfDriversEClass, 
		   source, 
		   new String[] {
			 "name", "List_of_Drivers",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getListOfDrivers_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getListOfDrivers_PacketDriver(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packet_Driver",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getListOfDrivers_CharacterPacketDriver(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Character_Packet_Driver",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getListOfDrivers_RTEPPacketDriver(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RTEP_Packet_Driver",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (localMaxMissRatioEClass, 
		   source, 
		   new String[] {
			 "name", "Local_Max_Miss_Ratio",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLocalMaxMissRatio_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (getLocalMaxMissRatio_Ratio(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ratio"
		   });	
		addAnnotation
		  (mastmodelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MAST_MODEL_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMASTMODELType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_RegularProcessor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Regular_Processor",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_PacketBasedNetwork(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packet_Based_Network",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_RegularSchedulingServer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Regular_Scheduling_Server",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_ImmediateCeilingResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Immediate_Ceiling_Resource",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_PriorityInheritanceResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Priority_Inheritance_Resource",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_SRPResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SRP_Resource",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_SimpleOperation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Simple_Operation",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_MessageTransmission(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Message_Transmission",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_CompositeOperation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Composite_Operation",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_EnclosingOperation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Enclosing_Operation",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_RegularTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Regular_Transaction",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_PrimaryScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Primary_Scheduler",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_SecondaryScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Secondary_Scheduler",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getMASTMODELType_ModelDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Model_Date"
		   });	
		addAnnotation
		  (getMASTMODELType_ModelName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Model_Name"
		   });	
		addAnnotation
		  (getMASTMODELType_SystemPiPBehaviour(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "System_PiP_Behaviour"
		   });	
		addAnnotation
		  (maxOutputJitterReqEClass, 
		   source, 
		   new String[] {
			 "name", "Max_Output_Jitter_Req",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMaxOutputJitterReq_MaxOutputJitter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Output_Jitter"
		   });	
		addAnnotation
		  (getMaxOutputJitterReq_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (messageTransmissionEClass, 
		   source, 
		   new String[] {
			 "name", "Message_Transmission",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMessageTransmission_OverriddenFixedPriority(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Fixed_Priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMessageTransmission_OverriddenPermanentFP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Permanent_FP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMessageTransmission_AvgMessageSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Message_Size"
		   });	
		addAnnotation
		  (getMessageTransmission_MaxMessageSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Message_Size"
		   });	
		addAnnotation
		  (getMessageTransmission_MinMessageSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min_Message_Size"
		   });	
		addAnnotation
		  (getMessageTransmission_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (multicastEClass, 
		   source, 
		   new String[] {
			 "name", "Multicast",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMulticast_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getMulticast_OutputEventsList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Events_List"
		   });	
		addAnnotation
		  (naturalEDataType, 
		   source, 
		   new String[] {
			 "name", "Natural",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });	
		addAnnotation
		  (negativeAssertionEEnum, 
		   source, 
		   new String[] {
			 "name", "Negative_Assertion"
		   });	
		addAnnotation
		  (negativeAssertionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Negative_Assertion:Object",
			 "baseType", "Negative_Assertion"
		   });	
		addAnnotation
		  (nonPreemptibleFPPolicyEClass, 
		   source, 
		   new String[] {
			 "name", "Non_Preemptible_FP_Policy",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getNonPreemptibleFPPolicy_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getNonPreemptibleFPPolicy_ThePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "The_Priority"
		   });	
		addAnnotation
		  (normalizedExecutionTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Normalized_Execution_Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0"
		   });	
		addAnnotation
		  (normalizedExecutionTimeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Normalized_Execution_Time:Object",
			 "baseType", "Normalized_Execution_Time"
		   });	
		addAnnotation
		  (offsetEClass, 
		   source, 
		   new String[] {
			 "name", "Offset",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOffset_DelayMaxInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Delay_Max_Interval"
		   });	
		addAnnotation
		  (getOffset_DelayMinInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Delay_Min_Interval"
		   });	
		addAnnotation
		  (getOffset_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getOffset_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (getOffset_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (overheadTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Overhead_Type"
		   });	
		addAnnotation
		  (overheadTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Overhead_Type:Object",
			 "baseType", "Overhead_Type"
		   });	
		addAnnotation
		  (overriddenFixedPriorityEClass, 
		   source, 
		   new String[] {
			 "name", "Overridden_Fixed_Priority",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOverriddenFixedPriority_ThePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "The_Priority"
		   });	
		addAnnotation
		  (overriddenPermanentFPEClass, 
		   source, 
		   new String[] {
			 "name", "Overridden_Permanent_FP",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOverriddenPermanentFP_ThePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "The_Priority"
		   });	
		addAnnotation
		  (packetBasedNetworkEClass, 
		   source, 
		   new String[] {
			 "name", "Packet_Based_Network",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_ListOfDrivers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "List_of_Drivers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_MaxBlocking(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Blocking"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_MaxPacketSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Packet_Size"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_MinPacketSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min_Packet_Size"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_SpeedFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Speed_Factor"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_Throughput(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Throughput"
		   });	
		addAnnotation
		  (getPacketBasedNetwork_Transmission(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Transmission"
		   });	
		addAnnotation
		  (packetDriverEClass, 
		   source, 
		   new String[] {
			 "name", "Packet_Driver",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPacketDriver_MessagePartitioning(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Message_Partitioning"
		   });	
		addAnnotation
		  (getPacketDriver_PacketReceiveOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Receive_Operation"
		   });	
		addAnnotation
		  (getPacketDriver_PacketSendOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Send_Operation"
		   });	
		addAnnotation
		  (getPacketDriver_PacketServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Server"
		   });	
		addAnnotation
		  (getPacketDriver_RTAOverheadModel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RTA_Overhead_Model"
		   });	
		addAnnotation
		  (pathnameEDataType, 
		   source, 
		   new String[] {
			 "name", "Pathname",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (percentageEDataType, 
		   source, 
		   new String[] {
			 "name", "Percentage",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0",
			 "maxInclusive", "100.0"
		   });	
		addAnnotation
		  (percentageObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Percentage:Object",
			 "baseType", "Percentage"
		   });	
		addAnnotation
		  (periodicExternalEventEClass, 
		   source, 
		   new String[] {
			 "name", "Periodic_External_Event",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPeriodicExternalEvent_MaxJitter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Jitter"
		   });	
		addAnnotation
		  (getPeriodicExternalEvent_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getPeriodicExternalEvent_Period(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Period"
		   });	
		addAnnotation
		  (getPeriodicExternalEvent_Phase(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Phase"
		   });	
		addAnnotation
		  (pollingPolicyEClass, 
		   source, 
		   new String[] {
			 "name", "Polling_Policy",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPollingPolicy_PollingAvgOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Polling_Avg_Overhead"
		   });	
		addAnnotation
		  (getPollingPolicy_PollingBestOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Polling_Best_Overhead"
		   });	
		addAnnotation
		  (getPollingPolicy_PollingPeriod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Polling_Period"
		   });	
		addAnnotation
		  (getPollingPolicy_PollingWorstOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Polling_Worst_Overhead"
		   });	
		addAnnotation
		  (getPollingPolicy_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getPollingPolicy_ThePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "The_Priority"
		   });	
		addAnnotation
		  (positiveEDataType, 
		   source, 
		   new String[] {
			 "name", "Positive",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger"
		   });	
		addAnnotation
		  (preemptionLevelEDataType, 
		   source, 
		   new String[] {
			 "name", "Preemption_Level",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });	
		addAnnotation
		  (primarySchedulerEClass, 
		   source, 
		   new String[] {
			 "name", "Primary_Scheduler",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPrimaryScheduler_FixedPriorityScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fixed_Priority_Scheduler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrimaryScheduler_EDFScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EDF_Scheduler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrimaryScheduler_FPPacketBasedScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FP_Packet_Based_Scheduler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPrimaryScheduler_Host(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Host"
		   });	
		addAnnotation
		  (getPrimaryScheduler_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (priorityEDataType, 
		   source, 
		   new String[] {
			 "name", "Priority",
			 "baseType", "Any_Priority"
		   });	
		addAnnotation
		  (priorityInheritanceProtocolEEnum, 
		   source, 
		   new String[] {
			 "name", "Priority_Inheritance_Protocol"
		   });	
		addAnnotation
		  (priorityInheritanceProtocolObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Priority_Inheritance_Protocol:Object",
			 "baseType", "Priority_Inheritance_Protocol"
		   });	
		addAnnotation
		  (priorityInheritanceResourceEClass, 
		   source, 
		   new String[] {
			 "name", "Priority_Inheritance_Resource",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPriorityInheritanceResource_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (queryServerEClass, 
		   source, 
		   new String[] {
			 "name", "Query_Server",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getQueryServer_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getQueryServer_OutputEventsList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Events_List"
		   });	
		addAnnotation
		  (getQueryServer_RequestPolicy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Request_Policy"
		   });	
		addAnnotation
		  (rateDivisorEClass, 
		   source, 
		   new String[] {
			 "name", "Rate_Divisor",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRateDivisor_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getRateDivisor_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (getRateDivisor_RateFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Rate_Factor"
		   });	
		addAnnotation
		  (regularEventEClass, 
		   source, 
		   new String[] {
			 "name", "Regular_Event",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRegularEvent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getRegularEvent_MaxOutputJitterReq(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Max_Output_Jitter_Req",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_HardGlobalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hard_Global_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_SoftGlobalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Soft_Global_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_GlobalMaxMissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Global_Max_Miss_Ratio",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_HardLocalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hard_Local_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_SoftLocalDeadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Soft_Local_Deadline",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_LocalMaxMissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Local_Max_Miss_Ratio",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_CompositeTimingRequirement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Composite_Timing_Requirement",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularEvent_Event(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Event"
		   });	
		addAnnotation
		  (regularProcessorEClass, 
		   source, 
		   new String[] {
			 "name", "Regular_Processor",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRegularProcessor_TickerSystemTimer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Ticker_System_Timer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularProcessor_AlarmClockSystemTimer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Alarm_Clock_System_Timer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularProcessor_AvgISRSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_ISR_Switch"
		   });	
		addAnnotation
		  (getRegularProcessor_BestISRSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_ISR_Switch"
		   });	
		addAnnotation
		  (getRegularProcessor_MaxInterruptPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Interrupt_Priority"
		   });	
		addAnnotation
		  (getRegularProcessor_MinInterruptPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min_Interrupt_Priority"
		   });	
		addAnnotation
		  (getRegularProcessor_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getRegularProcessor_SpeedFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Speed_Factor"
		   });	
		addAnnotation
		  (getRegularProcessor_WorstISRSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_ISR_Switch"
		   });	
		addAnnotation
		  (regularSchedulingServerEClass, 
		   source, 
		   new String[] {
			 "name", "Regular_Scheduling_Server",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_NonPreemptibleFPPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Non_Preemptible_FP_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_FixedPriorityPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fixed_Priority_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_InterruptFPPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Interrupt_FP_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_PollingPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Polling_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_SporadicServerPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sporadic_Server_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_EDFPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EDF_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_SRPParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SRP_Parameters",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getRegularSchedulingServer_Scheduler(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Scheduler"
		   });	
		addAnnotation
		  (regularTransactionEClass, 
		   source, 
		   new String[] {
			 "name", "Regular_Transaction",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRegularTransaction_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_PeriodicExternalEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Periodic_External_Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_SporadicExternalEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sporadic_External_Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_UnboundedExternalEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Unbounded_External_Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_BurstyExternalEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bursty_External_Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_SingularExternalEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Singular_External_Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_RegularEvent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Regular_Event",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Activity",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_SystemTimedActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "System_Timed_Activity",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Concentrator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Concentrator",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Barrier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Barrier",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_DeliveryServer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Delivery_Server",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_QueryServer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Query_Server",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Multicast(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Multicast",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_RateDivisor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Rate_Divisor",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Delay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Delay",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Offset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Offset",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getRegularTransaction_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (requestPolicyEEnum, 
		   source, 
		   new String[] {
			 "name", "Request_Policy"
		   });	
		addAnnotation
		  (requestPolicyObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Request_Policy:Object",
			 "baseType", "Request_Policy"
		   });	
		addAnnotation
		  (rtepPacketDriverEClass, 
		   source, 
		   new String[] {
			 "name", "RTEP_Packet_Driver",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_FailureTimeout(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Failure_Timeout"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_MessagePartitioning(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Message_Partitioning"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_NumberOfStations(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Number_Of_Stations"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketDiscardOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Discard_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketInterruptServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Interrupt_Server"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketISROperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_ISR_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketReceiveOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Receive_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketRetransmissionOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Retransmission_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketSendOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Send_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Server"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_PacketTransmissionRetries(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Packet_Transmission_Retries"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_RTAOverheadModel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RTA_Overhead_Model"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_TokenCheckOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Token_Check_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_TokenDelay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Token_Delay"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_TokenManageOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Token_Manage_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_TokenRetransmissionOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Token_Retransmission_Operation"
		   });	
		addAnnotation
		  (getRTEPPacketDriver_TokenTransmissionRetries(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Token_Transmission_Retries"
		   });	
		addAnnotation
		  (secondarySchedulerEClass, 
		   source, 
		   new String[] {
			 "name", "Secondary_Scheduler",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSecondaryScheduler_FixedPriorityScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fixed_Priority_Scheduler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSecondaryScheduler_EDFScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EDF_Scheduler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSecondaryScheduler_FPPacketBasedScheduler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FP_Packet_Based_Scheduler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSecondaryScheduler_Host(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Host"
		   });	
		addAnnotation
		  (getSecondaryScheduler_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (simpleOperationEClass, 
		   source, 
		   new String[] {
			 "name", "Simple_Operation",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSimpleOperation_OverriddenFixedPriority(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Fixed_Priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimpleOperation_OverriddenPermanentFP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Overridden_Permanent_FP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimpleOperation_SharedResourcesList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Shared_Resources_List",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimpleOperation_SharedResourcesToLock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Shared_Resources_To_Lock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimpleOperation_SharedResourcesToUnlock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Shared_Resources_To_Unlock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimpleOperation_AverageCaseExecutionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Average_Case_Execution_Time"
		   });	
		addAnnotation
		  (getSimpleOperation_BestCaseExecutionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Case_Execution_Time"
		   });	
		addAnnotation
		  (getSimpleOperation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getSimpleOperation_WorstCaseExecutionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Case_Execution_Time"
		   });	
		addAnnotation
		  (singularExternalEventEClass, 
		   source, 
		   new String[] {
			 "name", "Singular_External_Event",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSingularExternalEvent_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getSingularExternalEvent_Phase(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Phase"
		   });	
		addAnnotation
		  (softGlobalDeadlineEClass, 
		   source, 
		   new String[] {
			 "name", "Soft_Global_Deadline",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSoftGlobalDeadline_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (getSoftGlobalDeadline_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (softLocalDeadlineEClass, 
		   source, 
		   new String[] {
			 "name", "Soft_Local_Deadline",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSoftLocalDeadline_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (sporadicExternalEventEClass, 
		   source, 
		   new String[] {
			 "name", "Sporadic_External_Event",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSporadicExternalEvent_AvgInterarrival(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Interarrival"
		   });	
		addAnnotation
		  (getSporadicExternalEvent_Distribution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Distribution"
		   });	
		addAnnotation
		  (getSporadicExternalEvent_MinInterarrival(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min_Interarrival"
		   });	
		addAnnotation
		  (getSporadicExternalEvent_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (sporadicServerPolicyEClass, 
		   source, 
		   new String[] {
			 "name", "Sporadic_Server_Policy",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSporadicServerPolicy_BackgroundPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Background_Priority"
		   });	
		addAnnotation
		  (getSporadicServerPolicy_InitialCapacity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Initial_Capacity"
		   });	
		addAnnotation
		  (getSporadicServerPolicy_MaxPendingReplenishments(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Pending_Replenishments"
		   });	
		addAnnotation
		  (getSporadicServerPolicy_NormalPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Normal_Priority"
		   });	
		addAnnotation
		  (getSporadicServerPolicy_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getSporadicServerPolicy_ReplenishmentPeriod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Replenishment_Period"
		   });	
		addAnnotation
		  (srpParametersEClass, 
		   source, 
		   new String[] {
			 "name", "SRP_Parameters",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSRPParameters_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getSRPParameters_PreemptionLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preemption_Level"
		   });	
		addAnnotation
		  (srpResourceEClass, 
		   source, 
		   new String[] {
			 "name", "SRP_Resource",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSRPResource_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (getSRPResource_Preassigned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preassigned"
		   });	
		addAnnotation
		  (getSRPResource_PreemptionLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Preemption_Level"
		   });	
		addAnnotation
		  (systemTimedActivityEClass, 
		   source, 
		   new String[] {
			 "name", "System_Timed_Activity",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSystemTimedActivity_ActivityOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Activity_Operation"
		   });	
		addAnnotation
		  (getSystemTimedActivity_ActivityServer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Activity_Server"
		   });	
		addAnnotation
		  (getSystemTimedActivity_InputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Input_Event"
		   });	
		addAnnotation
		  (getSystemTimedActivity_OutputEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Output_Event"
		   });	
		addAnnotation
		  (throughputEDataType, 
		   source, 
		   new String[] {
			 "name", "Throughput",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0"
		   });	
		addAnnotation
		  (throughputObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Throughput:Object",
			 "baseType", "Throughput"
		   });	
		addAnnotation
		  (tickerSystemTimerEClass, 
		   source, 
		   new String[] {
			 "name", "Ticker_System_Timer",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTickerSystemTimer_AvgOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Overhead"
		   });	
		addAnnotation
		  (getTickerSystemTimer_BestOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Overhead"
		   });	
		addAnnotation
		  (getTickerSystemTimer_Period(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Period"
		   });	
		addAnnotation
		  (getTickerSystemTimer_WorstOverhead(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Overhead"
		   });	
		addAnnotation
		  (timeEDataType, 
		   source, 
		   new String[] {
			 "name", "Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0.0"
		   });	
		addAnnotation
		  (timeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Time:Object",
			 "baseType", "Time"
		   });	
		addAnnotation
		  (transmissionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "Transmission_Type"
		   });	
		addAnnotation
		  (transmissionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Transmission_Type:Object",
			 "baseType", "Transmission_Type"
		   });	
		addAnnotation
		  (unboundedExternalEventEClass, 
		   source, 
		   new String[] {
			 "name", "Unbounded_External_Event",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getUnboundedExternalEvent_AvgInterarrival(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Interarrival"
		   });	
		addAnnotation
		  (getUnboundedExternalEvent_Distribution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Distribution"
		   });	
		addAnnotation
		  (getUnboundedExternalEvent_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });
	}

} //ModelPackageImpl

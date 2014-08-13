/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.AffirmativeAssertion;
import es.unican.mast.xmlmast.result.Assertion;
import es.unican.mast.xmlmast.result.DetailedUtilization;
import es.unican.mast.xmlmast.result.DocumentRoot;
import es.unican.mast.xmlmast.result.EDFPolicy;
import es.unican.mast.xmlmast.result.FixedPriorityPolicy;
import es.unican.mast.xmlmast.result.GlobalMissRatio;
import es.unican.mast.xmlmast.result.GlobalMissRatioList;
import es.unican.mast.xmlmast.result.GlobalResponseTime;
import es.unican.mast.xmlmast.result.GlobalResponseTimeList;
import es.unican.mast.xmlmast.result.InterruptFPPolicy;
import es.unican.mast.xmlmast.result.MissRatio;
import es.unican.mast.xmlmast.result.MissRatioList;
import es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy;
import es.unican.mast.xmlmast.result.OperationResults;
import es.unican.mast.xmlmast.result.PollingPolicy;
import es.unican.mast.xmlmast.result.PreemptionLevel;
import es.unican.mast.xmlmast.result.PriorityCeiling;
import es.unican.mast.xmlmast.result.ProcessingResourceResults;
import es.unican.mast.xmlmast.result.QueueSize;
import es.unican.mast.xmlmast.result.REALTIMESITUATIONType;
import es.unican.mast.xmlmast.result.ReadyQueueSize;
import es.unican.mast.xmlmast.result.ResultFactory;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.SRPParameters;
import es.unican.mast.xmlmast.result.SchedulingServerResults;
import es.unican.mast.xmlmast.result.SharedResourceResults;
import es.unican.mast.xmlmast.result.SimulationTimingResult;
import es.unican.mast.xmlmast.result.Slack;
import es.unican.mast.xmlmast.result.SporadicServerPolicy;
import es.unican.mast.xmlmast.result.TimingResult;
import es.unican.mast.xmlmast.result.Trace;
import es.unican.mast.xmlmast.result.TransactionResults;
import es.unican.mast.xmlmast.result.Utilization;

import es.unican.mast.xmlmast.result.util.ResultValidator;

import java.math.BigInteger;

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
public class ResultPackageImpl extends EPackageImpl implements ResultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailedUtilizationEClass = null;

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
	private EClass fixedPriorityPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalMissRatioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalMissRatioListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalResponseTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalResponseTimeListEClass = null;

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
	private EClass missRatioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missRatioListEClass = null;

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
	private EClass operationResultsEClass = null;

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
	private EClass preemptionLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityCeilingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readyQueueSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimesituationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingServerResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedResourceResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationTimingResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slackEClass = null;

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
	private EClass timingResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilizationEClass = null;

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
	private EDataType affirmativeAssertionObjectEDataType = null;

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
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType externalReferenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType factorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType factorObjectEDataType = null;

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
	private EDataType naturalEDataType = null;

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
	private EDataType preemptionLevelTypeEDataType = null;

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
	private EDataType priorityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signedPercentageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signedPercentageObjectEDataType = null;

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
	private EDataType unrestrictedPercentageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unrestrictedPercentageObjectEDataType = null;

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultPackageImpl() {
		super(eNS_URI, ResultFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultPackage init() {
		if (isInited) return (ResultPackage)EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);

		// Obtain or create and register package
		ResultPackageImpl theResultPackage = (ResultPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResultPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResultPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResultPackage.createPackageContents();

		// Initialize created meta-data
		theResultPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theResultPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ResultValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theResultPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultPackage.eNS_URI, theResultPackage);
		return theResultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailedUtilization() {
		return detailedUtilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailedUtilization_Application() {
		return (EAttribute)detailedUtilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailedUtilization_ContextSwitch() {
		return (EAttribute)detailedUtilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailedUtilization_Driver() {
		return (EAttribute)detailedUtilizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailedUtilization_Timer() {
		return (EAttribute)detailedUtilizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailedUtilization_Total() {
		return (EAttribute)detailedUtilizationEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_REALTIMESITUATION() {
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
	public EClass getGlobalMissRatio() {
		return globalMissRatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalMissRatio_MissRatio() {
		return (EReference)globalMissRatioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalMissRatio_ReferencedEvent() {
		return (EAttribute)globalMissRatioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalMissRatioList() {
		return globalMissRatioListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalMissRatioList_GlobalMissRatio() {
		return (EReference)globalMissRatioListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalResponseTime() {
		return globalResponseTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalResponseTime_ReferencedEvent() {
		return (EAttribute)globalResponseTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalResponseTime_TimeValue() {
		return (EAttribute)globalResponseTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalResponseTimeList() {
		return globalResponseTimeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalResponseTimeList_GlobalResponseTime() {
		return (EReference)globalResponseTimeListEClass.getEStructuralFeatures().get(0);
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
	public EClass getMissRatio() {
		return missRatioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissRatio_Deadline() {
		return (EAttribute)missRatioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissRatio_Ratio() {
		return (EAttribute)missRatioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissRatioList() {
		return missRatioListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissRatioList_MissRatio() {
		return (EReference)missRatioListEClass.getEStructuralFeatures().get(0);
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
	public EClass getOperationResults() {
		return operationResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResults_Slack() {
		return (EReference)operationResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResults_Name() {
		return (EAttribute)operationResultsEClass.getEStructuralFeatures().get(1);
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
	public EClass getPreemptionLevel() {
		return preemptionLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreemptionLevel_Level() {
		return (EAttribute)preemptionLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityCeiling() {
		return priorityCeilingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriorityCeiling_Ceiling() {
		return (EAttribute)priorityCeilingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResourceResults() {
		return processingResourceResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourceResults_Slack() {
		return (EReference)processingResourceResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourceResults_DetailedUtilization() {
		return (EReference)processingResourceResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourceResults_ReadyQueueSize() {
		return (EReference)processingResourceResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceResults_Name() {
		return (EAttribute)processingResourceResultsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueSize() {
		return queueSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueSize_MaxNum() {
		return (EAttribute)queueSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadyQueueSize() {
		return readyQueueSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadyQueueSize_MaxNum() {
		return (EAttribute)readyQueueSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREALTIMESITUATIONType() {
		return realtimesituationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTIMESITUATIONType_Group() {
		return (EAttribute)realtimesituationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_Slack() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_Trace() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_Transaction() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_ProcessingResource() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_Operation() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_SchedulingServer() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREALTIMESITUATIONType_SharedResource() {
		return (EReference)realtimesituationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTIMESITUATIONType_GenerationDate() {
		return (EAttribute)realtimesituationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTIMESITUATIONType_GenerationProfile() {
		return (EAttribute)realtimesituationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTIMESITUATIONType_GenerationTool() {
		return (EAttribute)realtimesituationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTIMESITUATIONType_ModelDate() {
		return (EAttribute)realtimesituationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREALTIMESITUATIONType_ModelName() {
		return (EAttribute)realtimesituationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingServerResults() {
		return schedulingServerResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_NonPreemptibleFPPolicy() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_FixedPriorityPolicy() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_InterruptFPPolicy() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_PollingPolicy() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_SporadicServerPolicy() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_EDFPolicy() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingServerResults_SRPParameters() {
		return (EReference)schedulingServerResultsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingServerResults_Name() {
		return (EAttribute)schedulingServerResultsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedResourceResults() {
		return sharedResourceResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedResourceResults_PriorityCeiling() {
		return (EReference)sharedResourceResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedResourceResults_Utilization() {
		return (EReference)sharedResourceResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedResourceResults_QueueSize() {
		return (EReference)sharedResourceResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedResourceResults_PreemptionLevel() {
		return (EReference)sharedResourceResultsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedResourceResults_Name() {
		return (EAttribute)sharedResourceResultsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationTimingResult() {
		return simulationTimingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationTimingResult_WorstGlobalResponseTimes() {
		return (EReference)simulationTimingResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationTimingResult_AvgGlobalResponseTimes() {
		return (EReference)simulationTimingResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationTimingResult_BestGlobalResponseTimes() {
		return (EReference)simulationTimingResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationTimingResult_Jitters() {
		return (EReference)simulationTimingResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationTimingResult_LocalMissRatios() {
		return (EReference)simulationTimingResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationTimingResult_GlobalMissRatios() {
		return (EReference)simulationTimingResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_AvgBlockingTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_AvgLocalResponseTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_BestLocalResponseTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_EventName() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_MaxPreemptionTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_NumOfQueuedActivations() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_NumOfSuspensions() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_SuspensionTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_WorstBlockingTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationTimingResult_WorstLocalResponseTime() {
		return (EAttribute)simulationTimingResultEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlack() {
		return slackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlack_Value() {
		return (EAttribute)slackEClass.getEStructuralFeatures().get(0);
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
	public EClass getTimingResult() {
		return timingResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingResult_WorstGlobalResponseTimes() {
		return (EReference)timingResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingResult_BestGlobalResponseTimes() {
		return (EReference)timingResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingResult_Jitters() {
		return (EReference)timingResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingResult_BestLocalResponseTime() {
		return (EAttribute)timingResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingResult_EventName() {
		return (EAttribute)timingResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingResult_NumOfSuspensions() {
		return (EAttribute)timingResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingResult_WorstBlockingTime() {
		return (EAttribute)timingResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingResult_WorstLocalResponseTime() {
		return (EAttribute)timingResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_Pathname() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionResults() {
		return transactionResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionResults_Group() {
		return (EAttribute)transactionResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionResults_Slack() {
		return (EReference)transactionResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionResults_TimingResult() {
		return (EReference)transactionResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionResults_SimulationTimingResult() {
		return (EReference)transactionResultsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionResults_Name() {
		return (EAttribute)transactionResultsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilization() {
		return utilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilization_Total() {
		return (EAttribute)utilizationEClass.getEStructuralFeatures().get(0);
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
	public EDataType getAffirmativeAssertionObject() {
		return affirmativeAssertionObjectEDataType;
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
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExternalReference() {
		return externalReferenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFactor() {
		return factorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFactorObject() {
		return factorObjectEDataType;
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
	public EDataType getNatural() {
		return naturalEDataType;
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
	public EDataType getPreemptionLevelType() {
		return preemptionLevelTypeEDataType;
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
	public EDataType getPriorityObject() {
		return priorityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSignedPercentage() {
		return signedPercentageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSignedPercentageObject() {
		return signedPercentageObjectEDataType;
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
	public EDataType getUnrestrictedPercentage() {
		return unrestrictedPercentageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnrestrictedPercentageObject() {
		return unrestrictedPercentageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultFactory getResultFactory() {
		return (ResultFactory)getEFactoryInstance();
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
		detailedUtilizationEClass = createEClass(DETAILED_UTILIZATION);
		createEAttribute(detailedUtilizationEClass, DETAILED_UTILIZATION__APPLICATION);
		createEAttribute(detailedUtilizationEClass, DETAILED_UTILIZATION__CONTEXT_SWITCH);
		createEAttribute(detailedUtilizationEClass, DETAILED_UTILIZATION__DRIVER);
		createEAttribute(detailedUtilizationEClass, DETAILED_UTILIZATION__TIMER);
		createEAttribute(detailedUtilizationEClass, DETAILED_UTILIZATION__TOTAL);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REALTIMESITUATION);

		edfPolicyEClass = createEClass(EDF_POLICY);
		createEAttribute(edfPolicyEClass, EDF_POLICY__DEADLINE);
		createEAttribute(edfPolicyEClass, EDF_POLICY__PREASSIGNED);

		fixedPriorityPolicyEClass = createEClass(FIXED_PRIORITY_POLICY);
		createEAttribute(fixedPriorityPolicyEClass, FIXED_PRIORITY_POLICY__PREASSIGNED);
		createEAttribute(fixedPriorityPolicyEClass, FIXED_PRIORITY_POLICY__THE_PRIORITY);

		globalMissRatioEClass = createEClass(GLOBAL_MISS_RATIO);
		createEReference(globalMissRatioEClass, GLOBAL_MISS_RATIO__MISS_RATIO);
		createEAttribute(globalMissRatioEClass, GLOBAL_MISS_RATIO__REFERENCED_EVENT);

		globalMissRatioListEClass = createEClass(GLOBAL_MISS_RATIO_LIST);
		createEReference(globalMissRatioListEClass, GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO);

		globalResponseTimeEClass = createEClass(GLOBAL_RESPONSE_TIME);
		createEAttribute(globalResponseTimeEClass, GLOBAL_RESPONSE_TIME__REFERENCED_EVENT);
		createEAttribute(globalResponseTimeEClass, GLOBAL_RESPONSE_TIME__TIME_VALUE);

		globalResponseTimeListEClass = createEClass(GLOBAL_RESPONSE_TIME_LIST);
		createEReference(globalResponseTimeListEClass, GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME);

		interruptFPPolicyEClass = createEClass(INTERRUPT_FP_POLICY);
		createEAttribute(interruptFPPolicyEClass, INTERRUPT_FP_POLICY__PREASSIGNED);
		createEAttribute(interruptFPPolicyEClass, INTERRUPT_FP_POLICY__THE_PRIORITY);

		missRatioEClass = createEClass(MISS_RATIO);
		createEAttribute(missRatioEClass, MISS_RATIO__DEADLINE);
		createEAttribute(missRatioEClass, MISS_RATIO__RATIO);

		missRatioListEClass = createEClass(MISS_RATIO_LIST);
		createEReference(missRatioListEClass, MISS_RATIO_LIST__MISS_RATIO);

		nonPreemptibleFPPolicyEClass = createEClass(NON_PREEMPTIBLE_FP_POLICY);
		createEAttribute(nonPreemptibleFPPolicyEClass, NON_PREEMPTIBLE_FP_POLICY__PREASSIGNED);
		createEAttribute(nonPreemptibleFPPolicyEClass, NON_PREEMPTIBLE_FP_POLICY__THE_PRIORITY);

		operationResultsEClass = createEClass(OPERATION_RESULTS);
		createEReference(operationResultsEClass, OPERATION_RESULTS__SLACK);
		createEAttribute(operationResultsEClass, OPERATION_RESULTS__NAME);

		pollingPolicyEClass = createEClass(POLLING_POLICY);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_AVG_OVERHEAD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_BEST_OVERHEAD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_PERIOD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__POLLING_WORST_OVERHEAD);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__PREASSIGNED);
		createEAttribute(pollingPolicyEClass, POLLING_POLICY__THE_PRIORITY);

		preemptionLevelEClass = createEClass(PREEMPTION_LEVEL);
		createEAttribute(preemptionLevelEClass, PREEMPTION_LEVEL__LEVEL);

		priorityCeilingEClass = createEClass(PRIORITY_CEILING);
		createEAttribute(priorityCeilingEClass, PRIORITY_CEILING__CEILING);

		processingResourceResultsEClass = createEClass(PROCESSING_RESOURCE_RESULTS);
		createEReference(processingResourceResultsEClass, PROCESSING_RESOURCE_RESULTS__SLACK);
		createEReference(processingResourceResultsEClass, PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION);
		createEReference(processingResourceResultsEClass, PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE);
		createEAttribute(processingResourceResultsEClass, PROCESSING_RESOURCE_RESULTS__NAME);

		queueSizeEClass = createEClass(QUEUE_SIZE);
		createEAttribute(queueSizeEClass, QUEUE_SIZE__MAX_NUM);

		readyQueueSizeEClass = createEClass(READY_QUEUE_SIZE);
		createEAttribute(readyQueueSizeEClass, READY_QUEUE_SIZE__MAX_NUM);

		realtimesituationTypeEClass = createEClass(REALTIMESITUATION_TYPE);
		createEAttribute(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__GROUP);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__SLACK);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__TRACE);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__TRANSACTION);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__PROCESSING_RESOURCE);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__OPERATION);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__SCHEDULING_SERVER);
		createEReference(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__SHARED_RESOURCE);
		createEAttribute(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__GENERATION_DATE);
		createEAttribute(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__GENERATION_PROFILE);
		createEAttribute(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__GENERATION_TOOL);
		createEAttribute(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__MODEL_DATE);
		createEAttribute(realtimesituationTypeEClass, REALTIMESITUATION_TYPE__MODEL_NAME);

		schedulingServerResultsEClass = createEClass(SCHEDULING_SERVER_RESULTS);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__NON_PREEMPTIBLE_FP_POLICY);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__FIXED_PRIORITY_POLICY);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__INTERRUPT_FP_POLICY);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__POLLING_POLICY);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__SPORADIC_SERVER_POLICY);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__EDF_POLICY);
		createEReference(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__SRP_PARAMETERS);
		createEAttribute(schedulingServerResultsEClass, SCHEDULING_SERVER_RESULTS__NAME);

		sharedResourceResultsEClass = createEClass(SHARED_RESOURCE_RESULTS);
		createEReference(sharedResourceResultsEClass, SHARED_RESOURCE_RESULTS__PRIORITY_CEILING);
		createEReference(sharedResourceResultsEClass, SHARED_RESOURCE_RESULTS__UTILIZATION);
		createEReference(sharedResourceResultsEClass, SHARED_RESOURCE_RESULTS__QUEUE_SIZE);
		createEReference(sharedResourceResultsEClass, SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL);
		createEAttribute(sharedResourceResultsEClass, SHARED_RESOURCE_RESULTS__NAME);

		simulationTimingResultEClass = createEClass(SIMULATION_TIMING_RESULT);
		createEReference(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES);
		createEReference(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES);
		createEReference(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES);
		createEReference(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__JITTERS);
		createEReference(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS);
		createEReference(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__EVENT_NAME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__SUSPENSION_TIME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME);
		createEAttribute(simulationTimingResultEClass, SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME);

		slackEClass = createEClass(SLACK);
		createEAttribute(slackEClass, SLACK__VALUE);

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

		timingResultEClass = createEClass(TIMING_RESULT);
		createEReference(timingResultEClass, TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES);
		createEReference(timingResultEClass, TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES);
		createEReference(timingResultEClass, TIMING_RESULT__JITTERS);
		createEAttribute(timingResultEClass, TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME);
		createEAttribute(timingResultEClass, TIMING_RESULT__EVENT_NAME);
		createEAttribute(timingResultEClass, TIMING_RESULT__NUM_OF_SUSPENSIONS);
		createEAttribute(timingResultEClass, TIMING_RESULT__WORST_BLOCKING_TIME);
		createEAttribute(timingResultEClass, TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME);

		traceEClass = createEClass(TRACE);
		createEAttribute(traceEClass, TRACE__PATHNAME);

		transactionResultsEClass = createEClass(TRANSACTION_RESULTS);
		createEAttribute(transactionResultsEClass, TRANSACTION_RESULTS__GROUP);
		createEReference(transactionResultsEClass, TRANSACTION_RESULTS__SLACK);
		createEReference(transactionResultsEClass, TRANSACTION_RESULTS__TIMING_RESULT);
		createEReference(transactionResultsEClass, TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT);
		createEAttribute(transactionResultsEClass, TRANSACTION_RESULTS__NAME);

		utilizationEClass = createEClass(UTILIZATION);
		createEAttribute(utilizationEClass, UTILIZATION__TOTAL);

		// Create enums
		affirmativeAssertionEEnum = createEEnum(AFFIRMATIVE_ASSERTION);
		assertionEEnum = createEEnum(ASSERTION);

		// Create data types
		affirmativeAssertionObjectEDataType = createEDataType(AFFIRMATIVE_ASSERTION_OBJECT);
		assertionObjectEDataType = createEDataType(ASSERTION_OBJECT);
		dateTimeEDataType = createEDataType(DATE_TIME);
		externalReferenceEDataType = createEDataType(EXTERNAL_REFERENCE);
		factorEDataType = createEDataType(FACTOR);
		factorObjectEDataType = createEDataType(FACTOR_OBJECT);
		identifierEDataType = createEDataType(IDENTIFIER);
		naturalEDataType = createEDataType(NATURAL);
		normalizedExecutionTimeEDataType = createEDataType(NORMALIZED_EXECUTION_TIME);
		normalizedExecutionTimeObjectEDataType = createEDataType(NORMALIZED_EXECUTION_TIME_OBJECT);
		percentageEDataType = createEDataType(PERCENTAGE);
		percentageObjectEDataType = createEDataType(PERCENTAGE_OBJECT);
		positiveEDataType = createEDataType(POSITIVE);
		preemptionLevelTypeEDataType = createEDataType(PREEMPTION_LEVEL_TYPE);
		priorityEDataType = createEDataType(PRIORITY);
		priorityObjectEDataType = createEDataType(PRIORITY_OBJECT);
		signedPercentageEDataType = createEDataType(SIGNED_PERCENTAGE);
		signedPercentageObjectEDataType = createEDataType(SIGNED_PERCENTAGE_OBJECT);
		timeEDataType = createEDataType(TIME);
		timeObjectEDataType = createEDataType(TIME_OBJECT);
		unrestrictedPercentageEDataType = createEDataType(UNRESTRICTED_PERCENTAGE);
		unrestrictedPercentageObjectEDataType = createEDataType(UNRESTRICTED_PERCENTAGE_OBJECT);
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
		initEClass(detailedUtilizationEClass, DetailedUtilization.class, "DetailedUtilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailedUtilization_Application(), this.getPercentage(), "application", null, 0, 1, DetailedUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailedUtilization_ContextSwitch(), this.getPercentage(), "contextSwitch", null, 0, 1, DetailedUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailedUtilization_Driver(), this.getPercentage(), "driver", null, 0, 1, DetailedUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailedUtilization_Timer(), this.getPercentage(), "timer", null, 0, 1, DetailedUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailedUtilization_Total(), this.getPercentage(), "total", null, 0, 1, DetailedUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_REALTIMESITUATION(), this.getREALTIMESITUATIONType(), null, "rEALTIMESITUATION", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(edfPolicyEClass, EDFPolicy.class, "EDFPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDFPolicy_Deadline(), this.getTime(), "deadline", null, 0, 1, EDFPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDFPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, EDFPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPriorityPolicyEClass, FixedPriorityPolicy.class, "FixedPriorityPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedPriorityPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, FixedPriorityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPriorityPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, FixedPriorityPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalMissRatioEClass, GlobalMissRatio.class, "GlobalMissRatio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalMissRatio_MissRatio(), this.getMissRatio(), null, "missRatio", null, 1, -1, GlobalMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalMissRatio_ReferencedEvent(), this.getExternalReference(), "referencedEvent", null, 0, 1, GlobalMissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalMissRatioListEClass, GlobalMissRatioList.class, "GlobalMissRatioList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalMissRatioList_GlobalMissRatio(), this.getGlobalMissRatio(), null, "globalMissRatio", null, 1, -1, GlobalMissRatioList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalResponseTimeEClass, GlobalResponseTime.class, "GlobalResponseTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalResponseTime_ReferencedEvent(), this.getExternalReference(), "referencedEvent", null, 0, 1, GlobalResponseTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalResponseTime_TimeValue(), this.getTime(), "timeValue", null, 0, 1, GlobalResponseTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalResponseTimeListEClass, GlobalResponseTimeList.class, "GlobalResponseTimeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalResponseTimeList_GlobalResponseTime(), this.getGlobalResponseTime(), null, "globalResponseTime", null, 1, -1, GlobalResponseTimeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptFPPolicyEClass, InterruptFPPolicy.class, "InterruptFPPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterruptFPPolicy_Preassigned(), this.getAffirmativeAssertion(), "preassigned", null, 0, 1, InterruptFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptFPPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, InterruptFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missRatioEClass, MissRatio.class, "MissRatio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissRatio_Deadline(), this.getTime(), "deadline", null, 0, 1, MissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMissRatio_Ratio(), this.getPercentage(), "ratio", null, 0, 1, MissRatio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missRatioListEClass, MissRatioList.class, "MissRatioList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMissRatioList_MissRatio(), this.getMissRatio(), null, "missRatio", null, 1, -1, MissRatioList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPreemptibleFPPolicyEClass, NonPreemptibleFPPolicy.class, "NonPreemptibleFPPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonPreemptibleFPPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, NonPreemptibleFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPreemptibleFPPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, NonPreemptibleFPPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationResultsEClass, OperationResults.class, "OperationResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationResults_Slack(), this.getSlack(), null, "slack", null, 1, 1, OperationResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationResults_Name(), this.getIdentifier(), "name", null, 1, 1, OperationResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollingPolicyEClass, PollingPolicy.class, "PollingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollingPolicy_PollingAvgOverhead(), this.getNormalizedExecutionTime(), "pollingAvgOverhead", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_PollingBestOverhead(), this.getNormalizedExecutionTime(), "pollingBestOverhead", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_PollingPeriod(), this.getTime(), "pollingPeriod", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_PollingWorstOverhead(), this.getNormalizedExecutionTime(), "pollingWorstOverhead", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingPolicy_ThePriority(), this.getPriority(), "thePriority", null, 0, 1, PollingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preemptionLevelEClass, PreemptionLevel.class, "PreemptionLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreemptionLevel_Level(), this.getPreemptionLevelType(), "level", null, 0, 1, PreemptionLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityCeilingEClass, PriorityCeiling.class, "PriorityCeiling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriorityCeiling_Ceiling(), this.getPriority(), "ceiling", null, 0, 1, PriorityCeiling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceResultsEClass, ProcessingResourceResults.class, "ProcessingResourceResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourceResults_Slack(), this.getSlack(), null, "slack", null, 0, 1, ProcessingResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingResourceResults_DetailedUtilization(), this.getDetailedUtilization(), null, "detailedUtilization", null, 0, 1, ProcessingResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingResourceResults_ReadyQueueSize(), this.getReadyQueueSize(), null, "readyQueueSize", null, 0, 1, ProcessingResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingResourceResults_Name(), this.getIdentifier(), "name", null, 1, 1, ProcessingResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueSizeEClass, QueueSize.class, "QueueSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueueSize_MaxNum(), this.getNatural(), "maxNum", null, 0, 1, QueueSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readyQueueSizeEClass, ReadyQueueSize.class, "ReadyQueueSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadyQueueSize_MaxNum(), this.getNatural(), "maxNum", null, 0, 1, ReadyQueueSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimesituationTypeEClass, REALTIMESITUATIONType.class, "REALTIMESITUATIONType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getREALTIMESITUATIONType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, REALTIMESITUATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_Slack(), this.getSlack(), null, "slack", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_Trace(), this.getTrace(), null, "trace", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_Transaction(), this.getTransactionResults(), null, "transaction", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_ProcessingResource(), this.getProcessingResourceResults(), null, "processingResource", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_Operation(), this.getOperationResults(), null, "operation", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_SchedulingServer(), this.getSchedulingServerResults(), null, "schedulingServer", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREALTIMESITUATIONType_SharedResource(), this.getSharedResourceResults(), null, "sharedResource", null, 0, -1, REALTIMESITUATIONType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getREALTIMESITUATIONType_GenerationDate(), this.getDateTime(), "generationDate", null, 1, 1, REALTIMESITUATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREALTIMESITUATIONType_GenerationProfile(), theXMLTypePackage.getString(), "generationProfile", null, 0, 1, REALTIMESITUATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREALTIMESITUATIONType_GenerationTool(), theXMLTypePackage.getString(), "generationTool", null, 1, 1, REALTIMESITUATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREALTIMESITUATIONType_ModelDate(), this.getDateTime(), "modelDate", null, 1, 1, REALTIMESITUATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREALTIMESITUATIONType_ModelName(), this.getIdentifier(), "modelName", null, 1, 1, REALTIMESITUATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingServerResultsEClass, SchedulingServerResults.class, "SchedulingServerResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingServerResults_NonPreemptibleFPPolicy(), this.getNonPreemptibleFPPolicy(), null, "nonPreemptibleFPPolicy", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingServerResults_FixedPriorityPolicy(), this.getFixedPriorityPolicy(), null, "fixedPriorityPolicy", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingServerResults_InterruptFPPolicy(), this.getInterruptFPPolicy(), null, "interruptFPPolicy", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingServerResults_PollingPolicy(), this.getPollingPolicy(), null, "pollingPolicy", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingServerResults_SporadicServerPolicy(), this.getSporadicServerPolicy(), null, "sporadicServerPolicy", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingServerResults_EDFPolicy(), this.getEDFPolicy(), null, "eDFPolicy", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingServerResults_SRPParameters(), this.getSRPParameters(), null, "sRPParameters", null, 0, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingServerResults_Name(), this.getIdentifier(), "name", null, 1, 1, SchedulingServerResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedResourceResultsEClass, SharedResourceResults.class, "SharedResourceResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedResourceResults_PriorityCeiling(), this.getPriorityCeiling(), null, "priorityCeiling", null, 0, 1, SharedResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedResourceResults_Utilization(), this.getUtilization(), null, "utilization", null, 0, 1, SharedResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedResourceResults_QueueSize(), this.getQueueSize(), null, "queueSize", null, 0, 1, SharedResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedResourceResults_PreemptionLevel(), this.getPreemptionLevel(), null, "preemptionLevel", null, 0, 1, SharedResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedResourceResults_Name(), this.getIdentifier(), "name", null, 1, 1, SharedResourceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationTimingResultEClass, SimulationTimingResult.class, "SimulationTimingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationTimingResult_WorstGlobalResponseTimes(), this.getGlobalResponseTimeList(), null, "worstGlobalResponseTimes", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationTimingResult_AvgGlobalResponseTimes(), this.getGlobalResponseTimeList(), null, "avgGlobalResponseTimes", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationTimingResult_BestGlobalResponseTimes(), this.getGlobalResponseTimeList(), null, "bestGlobalResponseTimes", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationTimingResult_Jitters(), this.getGlobalResponseTimeList(), null, "jitters", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationTimingResult_LocalMissRatios(), this.getMissRatioList(), null, "localMissRatios", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationTimingResult_GlobalMissRatios(), this.getGlobalMissRatioList(), null, "globalMissRatios", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_AvgBlockingTime(), this.getTime(), "avgBlockingTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_AvgLocalResponseTime(), this.getTime(), "avgLocalResponseTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_BestLocalResponseTime(), this.getTime(), "bestLocalResponseTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_EventName(), this.getIdentifier(), "eventName", null, 1, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_MaxPreemptionTime(), this.getTime(), "maxPreemptionTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_NumOfQueuedActivations(), this.getNatural(), "numOfQueuedActivations", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_NumOfSuspensions(), this.getNatural(), "numOfSuspensions", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_SuspensionTime(), this.getTime(), "suspensionTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_WorstBlockingTime(), this.getTime(), "worstBlockingTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationTimingResult_WorstLocalResponseTime(), this.getTime(), "worstLocalResponseTime", null, 0, 1, SimulationTimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slackEClass, Slack.class, "Slack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlack_Value(), this.getUnrestrictedPercentage(), "value", null, 0, 1, Slack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicServerPolicyEClass, SporadicServerPolicy.class, "SporadicServerPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicServerPolicy_BackgroundPriority(), this.getPriority(), "backgroundPriority", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_InitialCapacity(), this.getTime(), "initialCapacity", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_MaxPendingReplenishments(), this.getPositive(), "maxPendingReplenishments", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_NormalPriority(), this.getPriority(), "normalPriority", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadicServerPolicy_ReplenishmentPeriod(), this.getTime(), "replenishmentPeriod", null, 0, 1, SporadicServerPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srpParametersEClass, SRPParameters.class, "SRPParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRPParameters_Preassigned(), this.getAssertion(), "preassigned", null, 0, 1, SRPParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRPParameters_PreemptionLevel(), this.getPreemptionLevelType(), "preemptionLevel", null, 1, 1, SRPParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingResultEClass, TimingResult.class, "TimingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingResult_WorstGlobalResponseTimes(), this.getGlobalResponseTimeList(), null, "worstGlobalResponseTimes", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingResult_BestGlobalResponseTimes(), this.getGlobalResponseTimeList(), null, "bestGlobalResponseTimes", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingResult_Jitters(), this.getGlobalResponseTimeList(), null, "jitters", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingResult_BestLocalResponseTime(), this.getTime(), "bestLocalResponseTime", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingResult_EventName(), this.getIdentifier(), "eventName", null, 1, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingResult_NumOfSuspensions(), this.getNatural(), "numOfSuspensions", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingResult_WorstBlockingTime(), this.getTime(), "worstBlockingTime", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingResult_WorstLocalResponseTime(), this.getTime(), "worstLocalResponseTime", null, 0, 1, TimingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrace_Pathname(), theXMLTypePackage.getString(), "pathname", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionResultsEClass, TransactionResults.class, "TransactionResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionResults_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransactionResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionResults_Slack(), this.getSlack(), null, "slack", null, 0, -1, TransactionResults.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionResults_TimingResult(), this.getTimingResult(), null, "timingResult", null, 0, -1, TransactionResults.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionResults_SimulationTimingResult(), this.getSimulationTimingResult(), null, "simulationTimingResult", null, 0, -1, TransactionResults.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionResults_Name(), this.getIdentifier(), "name", null, 1, 1, TransactionResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilizationEClass, Utilization.class, "Utilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilization_Total(), this.getPercentage(), "total", null, 0, 1, Utilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(affirmativeAssertionEEnum, AffirmativeAssertion.class, "AffirmativeAssertion");
		addEEnumLiteral(affirmativeAssertionEEnum, AffirmativeAssertion.YES);

		initEEnum(assertionEEnum, Assertion.class, "Assertion");
		addEEnumLiteral(assertionEEnum, Assertion.YES);
		addEEnumLiteral(assertionEEnum, Assertion.NO);

		// Initialize data types
		initEDataType(affirmativeAssertionObjectEDataType, AffirmativeAssertion.class, "AffirmativeAssertionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(assertionObjectEDataType, Assertion.class, "AssertionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeEDataType, XMLGregorianCalendar.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(externalReferenceEDataType, String.class, "ExternalReference", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(factorEDataType, float.class, "Factor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(factorObjectEDataType, Float.class, "FactorObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(naturalEDataType, BigInteger.class, "Natural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalizedExecutionTimeEDataType, float.class, "NormalizedExecutionTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalizedExecutionTimeObjectEDataType, Float.class, "NormalizedExecutionTimeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageEDataType, float.class, "Percentage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageObjectEDataType, Float.class, "PercentageObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveEDataType, BigInteger.class, "Positive", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preemptionLevelTypeEDataType, BigInteger.class, "PreemptionLevelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(priorityEDataType, int.class, "Priority", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(priorityObjectEDataType, Integer.class, "PriorityObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signedPercentageEDataType, float.class, "SignedPercentage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signedPercentageObjectEDataType, Float.class, "SignedPercentageObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeEDataType, float.class, "Time", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeObjectEDataType, Float.class, "TimeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unrestrictedPercentageEDataType, float.class, "UnrestrictedPercentage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unrestrictedPercentageObjectEDataType, Float.class, "UnrestrictedPercentageObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (dateTimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Date_Time",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });	
		addAnnotation
		  (detailedUtilizationEClass, 
		   source, 
		   new String[] {
			 "name", "Detailed_Utilization",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDetailedUtilization_Application(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Application"
		   });	
		addAnnotation
		  (getDetailedUtilization_ContextSwitch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Context_Switch"
		   });	
		addAnnotation
		  (getDetailedUtilization_Driver(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Driver"
		   });	
		addAnnotation
		  (getDetailedUtilization_Timer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Timer"
		   });	
		addAnnotation
		  (getDetailedUtilization_Total(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Total"
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
		  (getDocumentRoot_REALTIMESITUATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REAL_TIME_SITUATION",
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
		  (externalReferenceEDataType, 
		   source, 
		   new String[] {
			 "name", "External_Reference",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NCName",
			 "pattern", "([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*"
		   });	
		addAnnotation
		  (factorEDataType, 
		   source, 
		   new String[] {
			 "name", "Factor",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minExclusive", "0"
		   });	
		addAnnotation
		  (factorObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Factor:Object",
			 "baseType", "Factor"
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
		  (globalMissRatioEClass, 
		   source, 
		   new String[] {
			 "name", "Global_Miss_Ratio",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGlobalMissRatio_MissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Miss_Ratio",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getGlobalMissRatio_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (globalMissRatioListEClass, 
		   source, 
		   new String[] {
			 "name", "Global_Miss_Ratio_List",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGlobalMissRatioList_GlobalMissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Global_Miss_Ratio",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (globalResponseTimeEClass, 
		   source, 
		   new String[] {
			 "name", "Global_Response_Time",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getGlobalResponseTime_ReferencedEvent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Referenced_Event"
		   });	
		addAnnotation
		  (getGlobalResponseTime_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Time_Value"
		   });	
		addAnnotation
		  (globalResponseTimeListEClass, 
		   source, 
		   new String[] {
			 "name", "Global_Response_Time_List",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getGlobalResponseTimeList_GlobalResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Global_Response_Time",
			 "namespace", "##targetNamespace"
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
		  (missRatioEClass, 
		   source, 
		   new String[] {
			 "name", "Miss_Ratio",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMissRatio_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Deadline"
		   });	
		addAnnotation
		  (getMissRatio_Ratio(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ratio"
		   });	
		addAnnotation
		  (missRatioListEClass, 
		   source, 
		   new String[] {
			 "name", "Miss_Ratio_List",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMissRatioList_MissRatio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Miss_Ratio",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (naturalEDataType, 
		   source, 
		   new String[] {
			 "name", "Natural",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
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
		  (operationResultsEClass, 
		   source, 
		   new String[] {
			 "name", "Operation_Results",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOperationResults_Slack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slack",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOperationResults_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
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
		  (preemptionLevelEClass, 
		   source, 
		   new String[] {
			 "name", "Preemption_Level",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPreemptionLevel_Level(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Level"
		   });	
		addAnnotation
		  (preemptionLevelTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Preemption_Level_Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });	
		addAnnotation
		  (priorityEDataType, 
		   source, 
		   new String[] {
			 "name", "Priority",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "0"
		   });	
		addAnnotation
		  (priorityCeilingEClass, 
		   source, 
		   new String[] {
			 "name", "Priority_Ceiling",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPriorityCeiling_Ceiling(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ceiling"
		   });	
		addAnnotation
		  (priorityObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Priority:Object",
			 "baseType", "Priority"
		   });	
		addAnnotation
		  (processingResourceResultsEClass, 
		   source, 
		   new String[] {
			 "name", "Processing_Resource_Results",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProcessingResourceResults_Slack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slack",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessingResourceResults_DetailedUtilization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Detailed_Utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessingResourceResults_ReadyQueueSize(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Ready_Queue_Size",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProcessingResourceResults_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (queueSizeEClass, 
		   source, 
		   new String[] {
			 "name", "Queue_Size",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getQueueSize_MaxNum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Num"
		   });	
		addAnnotation
		  (readyQueueSizeEClass, 
		   source, 
		   new String[] {
			 "name", "Ready_Queue_Size",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getReadyQueueSize_MaxNum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Num"
		   });	
		addAnnotation
		  (realtimesituationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "REAL_TIME_SITUATION_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_Slack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slack",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_Trace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trace",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_Transaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transaction",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_ProcessingResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Processing_Resource",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_Operation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Operation",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_SchedulingServer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Scheduling_Server",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_SharedResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Shared_Resource",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_GenerationDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Generation_Date"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_GenerationProfile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Generation_Profile"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_GenerationTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Generation_Tool"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_ModelDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Model_Date"
		   });	
		addAnnotation
		  (getREALTIMESITUATIONType_ModelName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Model_Name"
		   });	
		addAnnotation
		  (schedulingServerResultsEClass, 
		   source, 
		   new String[] {
			 "name", "Scheduling_Server_Results",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSchedulingServerResults_NonPreemptibleFPPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Non_Preemptible_FP_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_FixedPriorityPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fixed_Priority_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_InterruptFPPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Interrupt_FP_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_PollingPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Polling_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_SporadicServerPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sporadic_Server_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_EDFPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EDF_Policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_SRPParameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SRP_Parameters",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingServerResults_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (sharedResourceResultsEClass, 
		   source, 
		   new String[] {
			 "name", "Shared_Resource_Results",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSharedResourceResults_PriorityCeiling(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Priority_Ceiling",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSharedResourceResults_Utilization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSharedResourceResults_QueueSize(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Queue_Size",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSharedResourceResults_PreemptionLevel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Preemption_Level",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSharedResourceResults_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (signedPercentageEDataType, 
		   source, 
		   new String[] {
			 "name", "Signed_Percentage",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "-100.0",
			 "maxInclusive", "100.0"
		   });	
		addAnnotation
		  (signedPercentageObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Signed_Percentage:Object",
			 "baseType", "Signed_Percentage"
		   });	
		addAnnotation
		  (simulationTimingResultEClass, 
		   source, 
		   new String[] {
			 "name", "Simulation_Timing_Result",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSimulationTimingResult_WorstGlobalResponseTimes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Worst_Global_Response_Times",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimulationTimingResult_AvgGlobalResponseTimes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Avg_Global_Response_Times",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimulationTimingResult_BestGlobalResponseTimes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Best_Global_Response_Times",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimulationTimingResult_Jitters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Jitters",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimulationTimingResult_LocalMissRatios(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Local_Miss_Ratios",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimulationTimingResult_GlobalMissRatios(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Global_Miss_Ratios",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSimulationTimingResult_AvgBlockingTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Blocking_Time"
		   });	
		addAnnotation
		  (getSimulationTimingResult_AvgLocalResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Avg_Local_Response_Time"
		   });	
		addAnnotation
		  (getSimulationTimingResult_BestLocalResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Local_Response_Time"
		   });	
		addAnnotation
		  (getSimulationTimingResult_EventName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Event_Name"
		   });	
		addAnnotation
		  (getSimulationTimingResult_MaxPreemptionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max_Preemption_Time"
		   });	
		addAnnotation
		  (getSimulationTimingResult_NumOfQueuedActivations(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Num_Of_Queued_Activations"
		   });	
		addAnnotation
		  (getSimulationTimingResult_NumOfSuspensions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Num_Of_Suspensions"
		   });	
		addAnnotation
		  (getSimulationTimingResult_SuspensionTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Suspension_Time"
		   });	
		addAnnotation
		  (getSimulationTimingResult_WorstBlockingTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Blocking_Time"
		   });	
		addAnnotation
		  (getSimulationTimingResult_WorstLocalResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Local_Response_Time"
		   });	
		addAnnotation
		  (slackEClass, 
		   source, 
		   new String[] {
			 "name", "Slack",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSlack_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value"
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
		  (timingResultEClass, 
		   source, 
		   new String[] {
			 "name", "Timing_Result",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimingResult_WorstGlobalResponseTimes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Worst_Global_Response_Times",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingResult_BestGlobalResponseTimes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Best_Global_Response_Times",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingResult_Jitters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Jitters",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingResult_BestLocalResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Best_Local_Response_Time"
		   });	
		addAnnotation
		  (getTimingResult_EventName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Event_Name"
		   });	
		addAnnotation
		  (getTimingResult_NumOfSuspensions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Num_Of_Suspensions"
		   });	
		addAnnotation
		  (getTimingResult_WorstBlockingTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Blocking_Time"
		   });	
		addAnnotation
		  (getTimingResult_WorstLocalResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Worst_Local_Response_Time"
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "name", "Trace",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTrace_Pathname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Pathname"
		   });	
		addAnnotation
		  (transactionResultsEClass, 
		   source, 
		   new String[] {
			 "name", "Transaction_Results",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTransactionResults_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getTransactionResults_Slack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Slack",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getTransactionResults_TimingResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Timing_Result",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getTransactionResults_SimulationTimingResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Simulation_Timing_Result",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getTransactionResults_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });	
		addAnnotation
		  (unrestrictedPercentageEDataType, 
		   source, 
		   new String[] {
			 "name", "Unrestricted_Percentage",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float"
		   });	
		addAnnotation
		  (unrestrictedPercentageObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Unrestricted_Percentage:Object",
			 "baseType", "Unrestricted_Percentage"
		   });	
		addAnnotation
		  (utilizationEClass, 
		   source, 
		   new String[] {
			 "name", "Utilization",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getUtilization_Total(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Total"
		   });
	}

} //ResultPackageImpl

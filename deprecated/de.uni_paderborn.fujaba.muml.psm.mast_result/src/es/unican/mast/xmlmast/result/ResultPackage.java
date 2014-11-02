/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.result.ResultFactory
 * @model kind="package"
 * @generated
 */
public interface ResultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "result";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mast.unican.es/xmlmast/result";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "result";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultPackage eINSTANCE = es.unican.mast.xmlmast.result.impl.ResultPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl <em>Detailed Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getDetailedUtilization()
	 * @generated
	 */
	int DETAILED_UTILIZATION = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION__CONTEXT_SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION__DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION__TIMER = 3;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION__TOTAL = 4;

	/**
	 * The number of structural features of the '<em>Detailed Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Detailed Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_UTILIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.DocumentRootImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>REALTIMESITUATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REALTIMESITUATION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.EDFPolicyImpl <em>EDF Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.EDFPolicyImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getEDFPolicy()
	 * @generated
	 */
	int EDF_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_POLICY__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_POLICY__PREASSIGNED = 1;

	/**
	 * The number of structural features of the '<em>EDF Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EDF Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.FixedPriorityPolicyImpl <em>Fixed Priority Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.FixedPriorityPolicyImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getFixedPriorityPolicy()
	 * @generated
	 */
	int FIXED_PRIORITY_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_POLICY__PREASSIGNED = 0;

	/**
	 * The feature id for the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_POLICY__THE_PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Fixed Priority Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fixed Priority Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioImpl <em>Global Miss Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.GlobalMissRatioImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalMissRatio()
	 * @generated
	 */
	int GLOBAL_MISS_RATIO = 4;

	/**
	 * The feature id for the '<em><b>Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO__MISS_RATIO = 0;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO__REFERENCED_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Global Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Global Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioListImpl <em>Global Miss Ratio List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.GlobalMissRatioListImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalMissRatioList()
	 * @generated
	 */
	int GLOBAL_MISS_RATIO_LIST = 5;

	/**
	 * The feature id for the '<em><b>Global Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO = 0;

	/**
	 * The number of structural features of the '<em>Global Miss Ratio List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Global Miss Ratio List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MISS_RATIO_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeImpl <em>Global Response Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.GlobalResponseTimeImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalResponseTime()
	 * @generated
	 */
	int GLOBAL_RESPONSE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME__REFERENCED_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME__TIME_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Global Response Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Global Response Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeListImpl <em>Global Response Time List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.GlobalResponseTimeListImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalResponseTimeList()
	 * @generated
	 */
	int GLOBAL_RESPONSE_TIME_LIST = 7;

	/**
	 * The feature id for the '<em><b>Global Response Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME = 0;

	/**
	 * The number of structural features of the '<em>Global Response Time List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Global Response Time List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_RESPONSE_TIME_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.InterruptFPPolicyImpl <em>Interrupt FP Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.InterruptFPPolicyImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getInterruptFPPolicy()
	 * @generated
	 */
	int INTERRUPT_FP_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_FP_POLICY__PREASSIGNED = 0;

	/**
	 * The feature id for the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_FP_POLICY__THE_PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Interrupt FP Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_FP_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interrupt FP Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_FP_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.MissRatioImpl <em>Miss Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.MissRatioImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getMissRatio()
	 * @generated
	 */
	int MISS_RATIO = 9;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO__RATIO = 1;

	/**
	 * The number of structural features of the '<em>Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.MissRatioListImpl <em>Miss Ratio List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.MissRatioListImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getMissRatioList()
	 * @generated
	 */
	int MISS_RATIO_LIST = 10;

	/**
	 * The feature id for the '<em><b>Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO_LIST__MISS_RATIO = 0;

	/**
	 * The number of structural features of the '<em>Miss Ratio List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Miss Ratio List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISS_RATIO_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.NonPreemptibleFPPolicyImpl <em>Non Preemptible FP Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.NonPreemptibleFPPolicyImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNonPreemptibleFPPolicy()
	 * @generated
	 */
	int NON_PREEMPTIBLE_FP_POLICY = 11;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PREEMPTIBLE_FP_POLICY__PREASSIGNED = 0;

	/**
	 * The feature id for the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PREEMPTIBLE_FP_POLICY__THE_PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Non Preemptible FP Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PREEMPTIBLE_FP_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Non Preemptible FP Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PREEMPTIBLE_FP_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.OperationResultsImpl <em>Operation Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.OperationResultsImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getOperationResults()
	 * @generated
	 */
	int OPERATION_RESULTS = 12;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULTS__SLACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULTS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Operation Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl <em>Polling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.PollingPolicyImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPollingPolicy()
	 * @generated
	 */
	int POLLING_POLICY = 13;

	/**
	 * The feature id for the '<em><b>Polling Avg Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY__POLLING_AVG_OVERHEAD = 0;

	/**
	 * The feature id for the '<em><b>Polling Best Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY__POLLING_BEST_OVERHEAD = 1;

	/**
	 * The feature id for the '<em><b>Polling Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY__POLLING_PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Polling Worst Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY__POLLING_WORST_OVERHEAD = 3;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY__PREASSIGNED = 4;

	/**
	 * The feature id for the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY__THE_PRIORITY = 5;

	/**
	 * The number of structural features of the '<em>Polling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Polling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.PreemptionLevelImpl <em>Preemption Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.PreemptionLevelImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPreemptionLevel()
	 * @generated
	 */
	int PREEMPTION_LEVEL = 14;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTION_LEVEL__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Preemption Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTION_LEVEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Preemption Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREEMPTION_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.PriorityCeilingImpl <em>Priority Ceiling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.PriorityCeilingImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPriorityCeiling()
	 * @generated
	 */
	int PRIORITY_CEILING = 15;

	/**
	 * The feature id for the '<em><b>Ceiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_CEILING__CEILING = 0;

	/**
	 * The number of structural features of the '<em>Priority Ceiling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_CEILING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Priority Ceiling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_CEILING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl <em>Processing Resource Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getProcessingResourceResults()
	 * @generated
	 */
	int PROCESSING_RESOURCE_RESULTS = 16;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RESULTS__SLACK = 0;

	/**
	 * The feature id for the '<em><b>Detailed Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION = 1;

	/**
	 * The feature id for the '<em><b>Ready Queue Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RESULTS__NAME = 3;

	/**
	 * The number of structural features of the '<em>Processing Resource Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RESULTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Processing Resource Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.QueueSizeImpl <em>Queue Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.QueueSizeImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getQueueSize()
	 * @generated
	 */
	int QUEUE_SIZE = 17;

	/**
	 * The feature id for the '<em><b>Max Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_SIZE__MAX_NUM = 0;

	/**
	 * The number of structural features of the '<em>Queue Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_SIZE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Queue Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.ReadyQueueSizeImpl <em>Ready Queue Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ReadyQueueSizeImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getReadyQueueSize()
	 * @generated
	 */
	int READY_QUEUE_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Max Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READY_QUEUE_SIZE__MAX_NUM = 0;

	/**
	 * The number of structural features of the '<em>Ready Queue Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READY_QUEUE_SIZE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ready Queue Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READY_QUEUE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl <em>REALTIMESITUATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getREALTIMESITUATIONType()
	 * @generated
	 */
	int REALTIMESITUATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__SLACK = 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__TRACE = 2;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__TRANSACTION = 3;

	/**
	 * The feature id for the '<em><b>Processing Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__PROCESSING_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Scheduling Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__SCHEDULING_SERVER = 6;

	/**
	 * The feature id for the '<em><b>Shared Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__SHARED_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__GENERATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Generation Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__GENERATION_PROFILE = 9;

	/**
	 * The feature id for the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__GENERATION_TOOL = 10;

	/**
	 * The feature id for the '<em><b>Model Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__MODEL_DATE = 11;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE__MODEL_NAME = 12;

	/**
	 * The number of structural features of the '<em>REALTIMESITUATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>REALTIMESITUATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIMESITUATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.SchedulingServerResultsImpl <em>Scheduling Server Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.SchedulingServerResultsImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSchedulingServerResults()
	 * @generated
	 */
	int SCHEDULING_SERVER_RESULTS = 20;

	/**
	 * The feature id for the '<em><b>Non Preemptible FP Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__NON_PREEMPTIBLE_FP_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Fixed Priority Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__FIXED_PRIORITY_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Interrupt FP Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__INTERRUPT_FP_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Polling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__POLLING_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Sporadic Server Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__SPORADIC_SERVER_POLICY = 4;

	/**
	 * The feature id for the '<em><b>EDF Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__EDF_POLICY = 5;

	/**
	 * The feature id for the '<em><b>SRP Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__SRP_PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS__NAME = 7;

	/**
	 * The number of structural features of the '<em>Scheduling Server Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Scheduling Server Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl <em>Shared Resource Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSharedResourceResults()
	 * @generated
	 */
	int SHARED_RESOURCE_RESULTS = 21;

	/**
	 * The feature id for the '<em><b>Priority Ceiling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS__PRIORITY_CEILING = 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS__UTILIZATION = 1;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS__QUEUE_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Preemption Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS__NAME = 4;

	/**
	 * The number of structural features of the '<em>Shared Resource Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Shared Resource Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl <em>Simulation Timing Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSimulationTimingResult()
	 * @generated
	 */
	int SIMULATION_TIMING_RESULT = 22;

	/**
	 * The feature id for the '<em><b>Worst Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES = 0;

	/**
	 * The feature id for the '<em><b>Avg Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES = 1;

	/**
	 * The feature id for the '<em><b>Best Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES = 2;

	/**
	 * The feature id for the '<em><b>Jitters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__JITTERS = 3;

	/**
	 * The feature id for the '<em><b>Local Miss Ratios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS = 4;

	/**
	 * The feature id for the '<em><b>Global Miss Ratios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS = 5;

	/**
	 * The feature id for the '<em><b>Avg Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME = 6;

	/**
	 * The feature id for the '<em><b>Avg Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Best Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME = 8;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__EVENT_NAME = 9;

	/**
	 * The feature id for the '<em><b>Max Preemption Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME = 10;

	/**
	 * The feature id for the '<em><b>Num Of Queued Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS = 11;

	/**
	 * The feature id for the '<em><b>Num Of Suspensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS = 12;

	/**
	 * The feature id for the '<em><b>Suspension Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__SUSPENSION_TIME = 13;

	/**
	 * The feature id for the '<em><b>Worst Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME = 14;

	/**
	 * The feature id for the '<em><b>Worst Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME = 15;

	/**
	 * The number of structural features of the '<em>Simulation Timing Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Simulation Timing Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIMING_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.SlackImpl <em>Slack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.SlackImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSlack()
	 * @generated
	 */
	int SLACK = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACK__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Slack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Slack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl <em>Sporadic Server Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSporadicServerPolicy()
	 * @generated
	 */
	int SPORADIC_SERVER_POLICY = 24;

	/**
	 * The feature id for the '<em><b>Background Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Initial Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY__INITIAL_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Max Pending Replenishments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS = 2;

	/**
	 * The feature id for the '<em><b>Normal Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY__NORMAL_PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY__PREASSIGNED = 4;

	/**
	 * The feature id for the '<em><b>Replenishment Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD = 5;

	/**
	 * The number of structural features of the '<em>Sporadic Server Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sporadic Server Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_SERVER_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.SRPParametersImpl <em>SRP Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.SRPParametersImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSRPParameters()
	 * @generated
	 */
	int SRP_PARAMETERS = 25;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_PARAMETERS__PREASSIGNED = 0;

	/**
	 * The feature id for the '<em><b>Preemption Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_PARAMETERS__PREEMPTION_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>SRP Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SRP Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl <em>Timing Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.TimingResultImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTimingResult()
	 * @generated
	 */
	int TIMING_RESULT = 26;

	/**
	 * The feature id for the '<em><b>Worst Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES = 0;

	/**
	 * The feature id for the '<em><b>Best Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES = 1;

	/**
	 * The feature id for the '<em><b>Jitters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__JITTERS = 2;

	/**
	 * The feature id for the '<em><b>Best Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__EVENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Num Of Suspensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__NUM_OF_SUSPENSIONS = 5;

	/**
	 * The feature id for the '<em><b>Worst Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__WORST_BLOCKING_TIME = 6;

	/**
	 * The feature id for the '<em><b>Worst Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME = 7;

	/**
	 * The number of structural features of the '<em>Timing Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Timing Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.TraceImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 27;

	/**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PATHNAME = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl <em>Transaction Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.TransactionResultsImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTransactionResults()
	 * @generated
	 */
	int TRANSACTION_RESULTS = 28;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Slack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS__SLACK = 1;

	/**
	 * The feature id for the '<em><b>Timing Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS__TIMING_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Simulation Timing Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS__NAME = 4;

	/**
	 * The number of structural features of the '<em>Transaction Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transaction Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.impl.UtilizationImpl <em>Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.UtilizationImpl
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getUtilization()
	 * @generated
	 */
	int UTILIZATION = 29;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION__TOTAL = 0;

	/**
	 * The number of structural features of the '<em>Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.AffirmativeAssertion <em>Affirmative Assertion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAffirmativeAssertion()
	 * @generated
	 */
	int AFFIRMATIVE_ASSERTION = 30;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.result.Assertion <em>Assertion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.Assertion
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 31;

	/**
	 * The meta object id for the '<em>Affirmative Assertion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAffirmativeAssertionObject()
	 * @generated
	 */
	int AFFIRMATIVE_ASSERTION_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Assertion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.Assertion
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAssertionObject()
	 * @generated
	 */
	int ASSERTION_OBJECT = 33;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 34;

	/**
	 * The meta object id for the '<em>External Reference</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 35;

	/**
	 * The meta object id for the '<em>Factor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 36;

	/**
	 * The meta object id for the '<em>Factor Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getFactorObject()
	 * @generated
	 */
	int FACTOR_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 38;

	/**
	 * The meta object id for the '<em>Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNatural()
	 * @generated
	 */
	int NATURAL = 39;

	/**
	 * The meta object id for the '<em>Normalized Execution Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNormalizedExecutionTime()
	 * @generated
	 */
	int NORMALIZED_EXECUTION_TIME = 40;

	/**
	 * The meta object id for the '<em>Normalized Execution Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNormalizedExecutionTimeObject()
	 * @generated
	 */
	int NORMALIZED_EXECUTION_TIME_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Percentage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPercentage()
	 * @generated
	 */
	int PERCENTAGE = 42;

	/**
	 * The meta object id for the '<em>Percentage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPercentageObject()
	 * @generated
	 */
	int PERCENTAGE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Positive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 44;

	/**
	 * The meta object id for the '<em>Preemption Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPreemptionLevelType()
	 * @generated
	 */
	int PREEMPTION_LEVEL_TYPE = 45;

	/**
	 * The meta object id for the '<em>Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 46;

	/**
	 * The meta object id for the '<em>Priority Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPriorityObject()
	 * @generated
	 */
	int PRIORITY_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Signed Percentage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSignedPercentage()
	 * @generated
	 */
	int SIGNED_PERCENTAGE = 48;

	/**
	 * The meta object id for the '<em>Signed Percentage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSignedPercentageObject()
	 * @generated
	 */
	int SIGNED_PERCENTAGE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 50;

	/**
	 * The meta object id for the '<em>Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTimeObject()
	 * @generated
	 */
	int TIME_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Unrestricted Percentage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getUnrestrictedPercentage()
	 * @generated
	 */
	int UNRESTRICTED_PERCENTAGE = 52;

	/**
	 * The meta object id for the '<em>Unrestricted Percentage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getUnrestrictedPercentageObject()
	 * @generated
	 */
	int UNRESTRICTED_PERCENTAGE_OBJECT = 53;


	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.DetailedUtilization <em>Detailed Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detailed Utilization</em>'.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization
	 * @generated
	 */
	EClass getDetailedUtilization();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization#getApplication()
	 * @see #getDetailedUtilization()
	 * @generated
	 */
	EAttribute getDetailedUtilization_Application();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getContextSwitch <em>Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization#getContextSwitch()
	 * @see #getDetailedUtilization()
	 * @generated
	 */
	EAttribute getDetailedUtilization_ContextSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization#getDriver()
	 * @see #getDetailedUtilization()
	 * @generated
	 */
	EAttribute getDetailedUtilization_Driver();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization#getTimer()
	 * @see #getDetailedUtilization()
	 * @generated
	 */
	EAttribute getDetailedUtilization_Timer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization#getTotal()
	 * @see #getDetailedUtilization()
	 * @generated
	 */
	EAttribute getDetailedUtilization_Total();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.unican.mast.xmlmast.result.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.result.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.unican.mast.xmlmast.result.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.unican.mast.xmlmast.result.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.unican.mast.xmlmast.result.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.unican.mast.xmlmast.result.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.unican.mast.xmlmast.result.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.DocumentRoot#getREALTIMESITUATION <em>REALTIMESITUATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REALTIMESITUATION</em>'.
	 * @see es.unican.mast.xmlmast.result.DocumentRoot#getREALTIMESITUATION()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_REALTIMESITUATION();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.EDFPolicy <em>EDF Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDF Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.EDFPolicy
	 * @generated
	 */
	EClass getEDFPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.EDFPolicy#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.result.EDFPolicy#getDeadline()
	 * @see #getEDFPolicy()
	 * @generated
	 */
	EAttribute getEDFPolicy_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.EDFPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.EDFPolicy#getPreassigned()
	 * @see #getEDFPolicy()
	 * @generated
	 */
	EAttribute getEDFPolicy_Preassigned();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.FixedPriorityPolicy <em>Fixed Priority Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Priority Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.FixedPriorityPolicy
	 * @generated
	 */
	EClass getFixedPriorityPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.FixedPriorityPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.FixedPriorityPolicy#getPreassigned()
	 * @see #getFixedPriorityPolicy()
	 * @generated
	 */
	EAttribute getFixedPriorityPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.FixedPriorityPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.result.FixedPriorityPolicy#getThePriority()
	 * @see #getFixedPriorityPolicy()
	 * @generated
	 */
	EAttribute getFixedPriorityPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.GlobalMissRatio <em>Global Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatio
	 * @generated
	 */
	EClass getGlobalMissRatio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.GlobalMissRatio#getMissRatio <em>Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatio#getMissRatio()
	 * @see #getGlobalMissRatio()
	 * @generated
	 */
	EReference getGlobalMissRatio_MissRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.GlobalMissRatio#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatio#getReferencedEvent()
	 * @see #getGlobalMissRatio()
	 * @generated
	 */
	EAttribute getGlobalMissRatio_ReferencedEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.GlobalMissRatioList <em>Global Miss Ratio List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Miss Ratio List</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatioList
	 * @generated
	 */
	EClass getGlobalMissRatioList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.GlobalMissRatioList#getGlobalMissRatio <em>Global Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatioList#getGlobalMissRatio()
	 * @see #getGlobalMissRatioList()
	 * @generated
	 */
	EReference getGlobalMissRatioList_GlobalMissRatio();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.GlobalResponseTime <em>Global Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTime
	 * @generated
	 */
	EClass getGlobalResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTime#getReferencedEvent()
	 * @see #getGlobalResponseTime()
	 * @generated
	 */
	EAttribute getGlobalResponseTime_ReferencedEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTime#getTimeValue()
	 * @see #getGlobalResponseTime()
	 * @generated
	 */
	EAttribute getGlobalResponseTime_TimeValue();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.GlobalResponseTimeList <em>Global Response Time List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Response Time List</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTimeList
	 * @generated
	 */
	EClass getGlobalResponseTimeList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.GlobalResponseTimeList#getGlobalResponseTime <em>Global Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTimeList#getGlobalResponseTime()
	 * @see #getGlobalResponseTimeList()
	 * @generated
	 */
	EReference getGlobalResponseTimeList_GlobalResponseTime();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy <em>Interrupt FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.InterruptFPPolicy
	 * @generated
	 */
	EClass getInterruptFPPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.InterruptFPPolicy#getPreassigned()
	 * @see #getInterruptFPPolicy()
	 * @generated
	 */
	EAttribute getInterruptFPPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.result.InterruptFPPolicy#getThePriority()
	 * @see #getInterruptFPPolicy()
	 * @generated
	 */
	EAttribute getInterruptFPPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.MissRatio <em>Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.result.MissRatio
	 * @generated
	 */
	EClass getMissRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.MissRatio#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.result.MissRatio#getDeadline()
	 * @see #getMissRatio()
	 * @generated
	 */
	EAttribute getMissRatio_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.MissRatio#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see es.unican.mast.xmlmast.result.MissRatio#getRatio()
	 * @see #getMissRatio()
	 * @generated
	 */
	EAttribute getMissRatio_Ratio();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.MissRatioList <em>Miss Ratio List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Miss Ratio List</em>'.
	 * @see es.unican.mast.xmlmast.result.MissRatioList
	 * @generated
	 */
	EClass getMissRatioList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.MissRatioList#getMissRatio <em>Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.result.MissRatioList#getMissRatio()
	 * @see #getMissRatioList()
	 * @generated
	 */
	EReference getMissRatioList_MissRatio();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Preemptible FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy
	 * @generated
	 */
	EClass getNonPreemptibleFPPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy#getPreassigned()
	 * @see #getNonPreemptibleFPPolicy()
	 * @generated
	 */
	EAttribute getNonPreemptibleFPPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy#getThePriority()
	 * @see #getNonPreemptibleFPPolicy()
	 * @generated
	 */
	EAttribute getNonPreemptibleFPPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.OperationResults <em>Operation Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Results</em>'.
	 * @see es.unican.mast.xmlmast.result.OperationResults
	 * @generated
	 */
	EClass getOperationResults();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.OperationResults#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slack</em>'.
	 * @see es.unican.mast.xmlmast.result.OperationResults#getSlack()
	 * @see #getOperationResults()
	 * @generated
	 */
	EReference getOperationResults_Slack();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.OperationResults#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.result.OperationResults#getName()
	 * @see #getOperationResults()
	 * @generated
	 */
	EAttribute getOperationResults_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.PollingPolicy <em>Polling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polling Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy
	 * @generated
	 */
	EClass getPollingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PollingPolicy#getPollingAvgOverhead <em>Polling Avg Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Avg Overhead</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy#getPollingAvgOverhead()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingAvgOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PollingPolicy#getPollingBestOverhead <em>Polling Best Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Best Overhead</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy#getPollingBestOverhead()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingBestOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PollingPolicy#getPollingPeriod <em>Polling Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Period</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy#getPollingPeriod()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingPeriod();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PollingPolicy#getPollingWorstOverhead <em>Polling Worst Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Worst Overhead</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy#getPollingWorstOverhead()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingWorstOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PollingPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy#getPreassigned()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PollingPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy#getThePriority()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.PreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preemption Level</em>'.
	 * @see es.unican.mast.xmlmast.result.PreemptionLevel
	 * @generated
	 */
	EClass getPreemptionLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PreemptionLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.unican.mast.xmlmast.result.PreemptionLevel#getLevel()
	 * @see #getPreemptionLevel()
	 * @generated
	 */
	EAttribute getPreemptionLevel_Level();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.PriorityCeiling <em>Priority Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Ceiling</em>'.
	 * @see es.unican.mast.xmlmast.result.PriorityCeiling
	 * @generated
	 */
	EClass getPriorityCeiling();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.PriorityCeiling#getCeiling <em>Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ceiling</em>'.
	 * @see es.unican.mast.xmlmast.result.PriorityCeiling#getCeiling()
	 * @see #getPriorityCeiling()
	 * @generated
	 */
	EAttribute getPriorityCeiling_Ceiling();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults <em>Processing Resource Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Results</em>'.
	 * @see es.unican.mast.xmlmast.result.ProcessingResourceResults
	 * @generated
	 */
	EClass getProcessingResourceResults();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slack</em>'.
	 * @see es.unican.mast.xmlmast.result.ProcessingResourceResults#getSlack()
	 * @see #getProcessingResourceResults()
	 * @generated
	 */
	EReference getProcessingResourceResults_Slack();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getDetailedUtilization <em>Detailed Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detailed Utilization</em>'.
	 * @see es.unican.mast.xmlmast.result.ProcessingResourceResults#getDetailedUtilization()
	 * @see #getProcessingResourceResults()
	 * @generated
	 */
	EReference getProcessingResourceResults_DetailedUtilization();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getReadyQueueSize <em>Ready Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ready Queue Size</em>'.
	 * @see es.unican.mast.xmlmast.result.ProcessingResourceResults#getReadyQueueSize()
	 * @see #getProcessingResourceResults()
	 * @generated
	 */
	EReference getProcessingResourceResults_ReadyQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.result.ProcessingResourceResults#getName()
	 * @see #getProcessingResourceResults()
	 * @generated
	 */
	EAttribute getProcessingResourceResults_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.QueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Size</em>'.
	 * @see es.unican.mast.xmlmast.result.QueueSize
	 * @generated
	 */
	EClass getQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.QueueSize#getMaxNum <em>Max Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Num</em>'.
	 * @see es.unican.mast.xmlmast.result.QueueSize#getMaxNum()
	 * @see #getQueueSize()
	 * @generated
	 */
	EAttribute getQueueSize_MaxNum();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.ReadyQueueSize <em>Ready Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ready Queue Size</em>'.
	 * @see es.unican.mast.xmlmast.result.ReadyQueueSize
	 * @generated
	 */
	EClass getReadyQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.ReadyQueueSize#getMaxNum <em>Max Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Num</em>'.
	 * @see es.unican.mast.xmlmast.result.ReadyQueueSize#getMaxNum()
	 * @see #getReadyQueueSize()
	 * @generated
	 */
	EAttribute getReadyQueueSize_MaxNum();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType <em>REALTIMESITUATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REALTIMESITUATION Type</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType
	 * @generated
	 */
	EClass getREALTIMESITUATIONType();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGroup()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EAttribute getREALTIMESITUATIONType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slack</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSlack()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_Slack();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getTrace()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_Trace();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getTransaction()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_Transaction();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Resource</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getProcessingResource()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_ProcessingResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getOperation()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSchedulingServer <em>Scheduling Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Server</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSchedulingServer()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_SchedulingServer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Resource</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSharedResource()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EReference getREALTIMESITUATIONType_SharedResource();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationDate <em>Generation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Date</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationDate()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EAttribute getREALTIMESITUATIONType_GenerationDate();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationProfile <em>Generation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Profile</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationProfile()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EAttribute getREALTIMESITUATIONType_GenerationProfile();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationTool <em>Generation Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Tool</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationTool()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EAttribute getREALTIMESITUATIONType_GenerationTool();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelDate <em>Model Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Date</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelDate()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EAttribute getREALTIMESITUATIONType_ModelDate();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelName()
	 * @see #getREALTIMESITUATIONType()
	 * @generated
	 */
	EAttribute getREALTIMESITUATIONType_ModelName();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.SchedulingServerResults <em>Scheduling Server Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Server Results</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults
	 * @generated
	 */
	EClass getSchedulingServerResults();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getNonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Preemptible FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getNonPreemptibleFPPolicy()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_NonPreemptibleFPPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getFixedPriorityPolicy <em>Fixed Priority Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Priority Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getFixedPriorityPolicy()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_FixedPriorityPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getInterruptFPPolicy <em>Interrupt FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interrupt FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getInterruptFPPolicy()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_InterruptFPPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getPollingPolicy <em>Polling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polling Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getPollingPolicy()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_PollingPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getSporadicServerPolicy <em>Sporadic Server Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sporadic Server Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getSporadicServerPolicy()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_SporadicServerPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getEDFPolicy <em>EDF Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDF Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getEDFPolicy()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_EDFPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getSRPParameters <em>SRP Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SRP Parameters</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getSRPParameters()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EReference getSchedulingServerResults_SRPParameters();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SchedulingServerResults#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults#getName()
	 * @see #getSchedulingServerResults()
	 * @generated
	 */
	EAttribute getSchedulingServerResults_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.SharedResourceResults <em>Shared Resource Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resource Results</em>'.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults
	 * @generated
	 */
	EClass getSharedResourceResults();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getPriorityCeiling <em>Priority Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority Ceiling</em>'.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults#getPriorityCeiling()
	 * @see #getSharedResourceResults()
	 * @generated
	 */
	EReference getSharedResourceResults_PriorityCeiling();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Utilization</em>'.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults#getUtilization()
	 * @see #getSharedResourceResults()
	 * @generated
	 */
	EReference getSharedResourceResults_Utilization();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue Size</em>'.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults#getQueueSize()
	 * @see #getSharedResourceResults()
	 * @generated
	 */
	EReference getSharedResourceResults_QueueSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getPreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preemption Level</em>'.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults#getPreemptionLevel()
	 * @see #getSharedResourceResults()
	 * @generated
	 */
	EReference getSharedResourceResults_PreemptionLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults#getName()
	 * @see #getSharedResourceResults()
	 * @generated
	 */
	EAttribute getSharedResourceResults_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.SimulationTimingResult <em>Simulation Timing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Timing Result</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult
	 * @generated
	 */
	EClass getSimulationTimingResult();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worst Global Response Times</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstGlobalResponseTimes()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EReference getSimulationTimingResult_WorstGlobalResponseTimes();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgGlobalResponseTimes <em>Avg Global Response Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Avg Global Response Times</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgGlobalResponseTimes()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EReference getSimulationTimingResult_AvgGlobalResponseTimes();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestGlobalResponseTimes <em>Best Global Response Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Best Global Response Times</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getBestGlobalResponseTimes()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EReference getSimulationTimingResult_BestGlobalResponseTimes();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getJitters <em>Jitters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitters</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getJitters()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EReference getSimulationTimingResult_Jitters();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getLocalMissRatios <em>Local Miss Ratios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Miss Ratios</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getLocalMissRatios()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EReference getSimulationTimingResult_LocalMissRatios();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getGlobalMissRatios <em>Global Miss Ratios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Miss Ratios</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getGlobalMissRatios()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EReference getSimulationTimingResult_GlobalMissRatios();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgBlockingTime <em>Avg Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Blocking Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgBlockingTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_AvgBlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgLocalResponseTime <em>Avg Local Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Local Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgLocalResponseTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_AvgLocalResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Local Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getBestLocalResponseTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_BestLocalResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getEventName()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_EventName();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getMaxPreemptionTime <em>Max Preemption Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Preemption Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getMaxPreemptionTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_MaxPreemptionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfQueuedActivations <em>Num Of Queued Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Queued Activations</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfQueuedActivations()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_NumOfQueuedActivations();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfSuspensions <em>Num Of Suspensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Suspensions</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfSuspensions()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_NumOfSuspensions();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getSuspensionTime <em>Suspension Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspension Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getSuspensionTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_SuspensionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Blocking Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstBlockingTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_WorstBlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Local Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstLocalResponseTime()
	 * @see #getSimulationTimingResult()
	 * @generated
	 */
	EAttribute getSimulationTimingResult_WorstLocalResponseTime();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.Slack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slack</em>'.
	 * @see es.unican.mast.xmlmast.result.Slack
	 * @generated
	 */
	EClass getSlack();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.Slack#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.unican.mast.xmlmast.result.Slack#getValue()
	 * @see #getSlack()
	 * @generated
	 */
	EAttribute getSlack_Value();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy <em>Sporadic Server Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Server Policy</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy
	 * @generated
	 */
	EClass getSporadicServerPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy#getBackgroundPriority <em>Background Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Priority</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy#getBackgroundPriority()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_BackgroundPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy#getInitialCapacity <em>Initial Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Capacity</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy#getInitialCapacity()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_InitialCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy#getMaxPendingReplenishments <em>Max Pending Replenishments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Pending Replenishments</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy#getMaxPendingReplenishments()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_MaxPendingReplenishments();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy#getNormalPriority <em>Normal Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Priority</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy#getNormalPriority()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_NormalPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy#getPreassigned()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy#getReplenishmentPeriod <em>Replenishment Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replenishment Period</em>'.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy#getReplenishmentPeriod()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_ReplenishmentPeriod();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.SRPParameters <em>SRP Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRP Parameters</em>'.
	 * @see es.unican.mast.xmlmast.result.SRPParameters
	 * @generated
	 */
	EClass getSRPParameters();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SRPParameters#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.result.SRPParameters#getPreassigned()
	 * @see #getSRPParameters()
	 * @generated
	 */
	EAttribute getSRPParameters_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.SRPParameters#getPreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Level</em>'.
	 * @see es.unican.mast.xmlmast.result.SRPParameters#getPreemptionLevel()
	 * @see #getSRPParameters()
	 * @generated
	 */
	EAttribute getSRPParameters_PreemptionLevel();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.TimingResult <em>Timing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Result</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult
	 * @generated
	 */
	EClass getTimingResult();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worst Global Response Times</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getWorstGlobalResponseTimes()
	 * @see #getTimingResult()
	 * @generated
	 */
	EReference getTimingResult_WorstGlobalResponseTimes();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.TimingResult#getBestGlobalResponseTimes <em>Best Global Response Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Best Global Response Times</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getBestGlobalResponseTimes()
	 * @see #getTimingResult()
	 * @generated
	 */
	EReference getTimingResult_BestGlobalResponseTimes();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.result.TimingResult#getJitters <em>Jitters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitters</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getJitters()
	 * @see #getTimingResult()
	 * @generated
	 */
	EReference getTimingResult_Jitters();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.TimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Local Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getBestLocalResponseTime()
	 * @see #getTimingResult()
	 * @generated
	 */
	EAttribute getTimingResult_BestLocalResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.TimingResult#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getEventName()
	 * @see #getTimingResult()
	 * @generated
	 */
	EAttribute getTimingResult_EventName();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.TimingResult#getNumOfSuspensions <em>Num Of Suspensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Suspensions</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getNumOfSuspensions()
	 * @see #getTimingResult()
	 * @generated
	 */
	EAttribute getTimingResult_NumOfSuspensions();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Blocking Time</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getWorstBlockingTime()
	 * @see #getTimingResult()
	 * @generated
	 */
	EAttribute getTimingResult_WorstBlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Local Response Time</em>'.
	 * @see es.unican.mast.xmlmast.result.TimingResult#getWorstLocalResponseTime()
	 * @see #getTimingResult()
	 * @generated
	 */
	EAttribute getTimingResult_WorstLocalResponseTime();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see es.unican.mast.xmlmast.result.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.Trace#getPathname <em>Pathname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pathname</em>'.
	 * @see es.unican.mast.xmlmast.result.Trace#getPathname()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Pathname();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.TransactionResults <em>Transaction Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Results</em>'.
	 * @see es.unican.mast.xmlmast.result.TransactionResults
	 * @generated
	 */
	EClass getTransactionResults();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.result.TransactionResults#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.result.TransactionResults#getGroup()
	 * @see #getTransactionResults()
	 * @generated
	 */
	EAttribute getTransactionResults_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.TransactionResults#getSlack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slack</em>'.
	 * @see es.unican.mast.xmlmast.result.TransactionResults#getSlack()
	 * @see #getTransactionResults()
	 * @generated
	 */
	EReference getTransactionResults_Slack();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.TransactionResults#getTimingResult <em>Timing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Result</em>'.
	 * @see es.unican.mast.xmlmast.result.TransactionResults#getTimingResult()
	 * @see #getTransactionResults()
	 * @generated
	 */
	EReference getTransactionResults_TimingResult();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.result.TransactionResults#getSimulationTimingResult <em>Simulation Timing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulation Timing Result</em>'.
	 * @see es.unican.mast.xmlmast.result.TransactionResults#getSimulationTimingResult()
	 * @see #getTransactionResults()
	 * @generated
	 */
	EReference getTransactionResults_SimulationTimingResult();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.TransactionResults#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.result.TransactionResults#getName()
	 * @see #getTransactionResults()
	 * @generated
	 */
	EAttribute getTransactionResults_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.result.Utilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilization</em>'.
	 * @see es.unican.mast.xmlmast.result.Utilization
	 * @generated
	 */
	EClass getUtilization();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.result.Utilization#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see es.unican.mast.xmlmast.result.Utilization#getTotal()
	 * @see #getUtilization()
	 * @generated
	 */
	EAttribute getUtilization_Total();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.result.AffirmativeAssertion <em>Affirmative Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Affirmative Assertion</em>'.
	 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
	 * @generated
	 */
	EEnum getAffirmativeAssertion();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.result.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion</em>'.
	 * @see es.unican.mast.xmlmast.result.Assertion
	 * @generated
	 */
	EEnum getAssertion();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.result.AffirmativeAssertion <em>Affirmative Assertion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Affirmative Assertion Object</em>'.
	 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
	 * @model instanceClass="es.unican.mast.xmlmast.result.AffirmativeAssertion"
	 *        extendedMetaData="name='Affirmative_Assertion:Object' baseType='Affirmative_Assertion'"
	 * @generated
	 */
	EDataType getAffirmativeAssertionObject();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.result.Assertion <em>Assertion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Assertion Object</em>'.
	 * @see es.unican.mast.xmlmast.result.Assertion
	 * @model instanceClass="es.unican.mast.xmlmast.result.Assertion"
	 *        extendedMetaData="name='Assertion:Object' baseType='Assertion'"
	 * @generated
	 */
	EDataType getAssertionObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='Date_Time' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>External Reference</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='External_Reference' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' pattern='([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*'"
	 * @generated
	 */
	EDataType getExternalReference();

	/**
	 * Returns the meta object for data type '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Factor</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Factor' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minExclusive='0'"
	 * @generated
	 */
	EDataType getFactor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Factor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Factor Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Factor:Object' baseType='Factor'"
	 * @generated
	 */
	EDataType getFactorObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Identifier' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' pattern='([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*'"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Natural</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Natural' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getNatural();

	/**
	 * Returns the meta object for data type '<em>Normalized Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Normalized Execution Time</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Normalized_Execution_Time' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getNormalizedExecutionTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Normalized Execution Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Normalized Execution Time Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Normalized_Execution_Time:Object' baseType='Normalized_Execution_Time'"
	 * @generated
	 */
	EDataType getNormalizedExecutionTimeObject();

	/**
	 * Returns the meta object for data type '<em>Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percentage</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Percentage' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0' maxInclusive='100.0'"
	 * @generated
	 */
	EDataType getPercentage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Percentage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percentage Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Percentage:Object' baseType='Percentage'"
	 * @generated
	 */
	EDataType getPercentageObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Positive' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger'"
	 * @generated
	 */
	EDataType getPositive();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Preemption Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Preemption Level Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Preemption_Level_Type' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getPreemptionLevelType();

	/**
	 * Returns the meta object for data type '<em>Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='Priority' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0'"
	 * @generated
	 */
	EDataType getPriority();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Priority Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='Priority:Object' baseType='Priority'"
	 * @generated
	 */
	EDataType getPriorityObject();

	/**
	 * Returns the meta object for data type '<em>Signed Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signed Percentage</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Signed_Percentage' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='-100.0' maxInclusive='100.0'"
	 * @generated
	 */
	EDataType getSignedPercentage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Signed Percentage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signed Percentage Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Signed_Percentage:Object' baseType='Signed_Percentage'"
	 * @generated
	 */
	EDataType getSignedPercentageObject();

	/**
	 * Returns the meta object for data type '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Time' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Time:Object' baseType='Time'"
	 * @generated
	 */
	EDataType getTimeObject();

	/**
	 * Returns the meta object for data type '<em>Unrestricted Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unrestricted Percentage</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Unrestricted_Percentage' baseType='http://www.eclipse.org/emf/2003/XMLType#float'"
	 * @generated
	 */
	EDataType getUnrestrictedPercentage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Unrestricted Percentage Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unrestricted Percentage Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Unrestricted_Percentage:Object' baseType='Unrestricted_Percentage'"
	 * @generated
	 */
	EDataType getUnrestrictedPercentageObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultFactory getResultFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl <em>Detailed Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getDetailedUtilization()
		 * @generated
		 */
		EClass DETAILED_UTILIZATION = eINSTANCE.getDetailedUtilization();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_UTILIZATION__APPLICATION = eINSTANCE.getDetailedUtilization_Application();

		/**
		 * The meta object literal for the '<em><b>Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_UTILIZATION__CONTEXT_SWITCH = eINSTANCE.getDetailedUtilization_ContextSwitch();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_UTILIZATION__DRIVER = eINSTANCE.getDetailedUtilization_Driver();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_UTILIZATION__TIMER = eINSTANCE.getDetailedUtilization_Timer();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_UTILIZATION__TOTAL = eINSTANCE.getDetailedUtilization_Total();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.DocumentRootImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>REALTIMESITUATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REALTIMESITUATION = eINSTANCE.getDocumentRoot_REALTIMESITUATION();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.EDFPolicyImpl <em>EDF Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.EDFPolicyImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getEDFPolicy()
		 * @generated
		 */
		EClass EDF_POLICY = eINSTANCE.getEDFPolicy();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDF_POLICY__DEADLINE = eINSTANCE.getEDFPolicy_Deadline();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDF_POLICY__PREASSIGNED = eINSTANCE.getEDFPolicy_Preassigned();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.FixedPriorityPolicyImpl <em>Fixed Priority Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.FixedPriorityPolicyImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getFixedPriorityPolicy()
		 * @generated
		 */
		EClass FIXED_PRIORITY_POLICY = eINSTANCE.getFixedPriorityPolicy();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_POLICY__PREASSIGNED = eINSTANCE.getFixedPriorityPolicy_Preassigned();

		/**
		 * The meta object literal for the '<em><b>The Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_POLICY__THE_PRIORITY = eINSTANCE.getFixedPriorityPolicy_ThePriority();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioImpl <em>Global Miss Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.GlobalMissRatioImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalMissRatio()
		 * @generated
		 */
		EClass GLOBAL_MISS_RATIO = eINSTANCE.getGlobalMissRatio();

		/**
		 * The meta object literal for the '<em><b>Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_MISS_RATIO__MISS_RATIO = eINSTANCE.getGlobalMissRatio_MissRatio();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_MISS_RATIO__REFERENCED_EVENT = eINSTANCE.getGlobalMissRatio_ReferencedEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioListImpl <em>Global Miss Ratio List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.GlobalMissRatioListImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalMissRatioList()
		 * @generated
		 */
		EClass GLOBAL_MISS_RATIO_LIST = eINSTANCE.getGlobalMissRatioList();

		/**
		 * The meta object literal for the '<em><b>Global Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO = eINSTANCE.getGlobalMissRatioList_GlobalMissRatio();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeImpl <em>Global Response Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.GlobalResponseTimeImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalResponseTime()
		 * @generated
		 */
		EClass GLOBAL_RESPONSE_TIME = eINSTANCE.getGlobalResponseTime();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_RESPONSE_TIME__REFERENCED_EVENT = eINSTANCE.getGlobalResponseTime_ReferencedEvent();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_RESPONSE_TIME__TIME_VALUE = eINSTANCE.getGlobalResponseTime_TimeValue();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeListImpl <em>Global Response Time List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.GlobalResponseTimeListImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getGlobalResponseTimeList()
		 * @generated
		 */
		EClass GLOBAL_RESPONSE_TIME_LIST = eINSTANCE.getGlobalResponseTimeList();

		/**
		 * The meta object literal for the '<em><b>Global Response Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME = eINSTANCE.getGlobalResponseTimeList_GlobalResponseTime();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.InterruptFPPolicyImpl <em>Interrupt FP Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.InterruptFPPolicyImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getInterruptFPPolicy()
		 * @generated
		 */
		EClass INTERRUPT_FP_POLICY = eINSTANCE.getInterruptFPPolicy();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_FP_POLICY__PREASSIGNED = eINSTANCE.getInterruptFPPolicy_Preassigned();

		/**
		 * The meta object literal for the '<em><b>The Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_FP_POLICY__THE_PRIORITY = eINSTANCE.getInterruptFPPolicy_ThePriority();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.MissRatioImpl <em>Miss Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.MissRatioImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getMissRatio()
		 * @generated
		 */
		EClass MISS_RATIO = eINSTANCE.getMissRatio();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISS_RATIO__DEADLINE = eINSTANCE.getMissRatio_Deadline();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISS_RATIO__RATIO = eINSTANCE.getMissRatio_Ratio();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.MissRatioListImpl <em>Miss Ratio List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.MissRatioListImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getMissRatioList()
		 * @generated
		 */
		EClass MISS_RATIO_LIST = eINSTANCE.getMissRatioList();

		/**
		 * The meta object literal for the '<em><b>Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISS_RATIO_LIST__MISS_RATIO = eINSTANCE.getMissRatioList_MissRatio();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.NonPreemptibleFPPolicyImpl <em>Non Preemptible FP Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.NonPreemptibleFPPolicyImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNonPreemptibleFPPolicy()
		 * @generated
		 */
		EClass NON_PREEMPTIBLE_FP_POLICY = eINSTANCE.getNonPreemptibleFPPolicy();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_PREEMPTIBLE_FP_POLICY__PREASSIGNED = eINSTANCE.getNonPreemptibleFPPolicy_Preassigned();

		/**
		 * The meta object literal for the '<em><b>The Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_PREEMPTIBLE_FP_POLICY__THE_PRIORITY = eINSTANCE.getNonPreemptibleFPPolicy_ThePriority();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.OperationResultsImpl <em>Operation Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.OperationResultsImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getOperationResults()
		 * @generated
		 */
		EClass OPERATION_RESULTS = eINSTANCE.getOperationResults();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULTS__SLACK = eINSTANCE.getOperationResults_Slack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULTS__NAME = eINSTANCE.getOperationResults_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl <em>Polling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.PollingPolicyImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPollingPolicy()
		 * @generated
		 */
		EClass POLLING_POLICY = eINSTANCE.getPollingPolicy();

		/**
		 * The meta object literal for the '<em><b>Polling Avg Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_POLICY__POLLING_AVG_OVERHEAD = eINSTANCE.getPollingPolicy_PollingAvgOverhead();

		/**
		 * The meta object literal for the '<em><b>Polling Best Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_POLICY__POLLING_BEST_OVERHEAD = eINSTANCE.getPollingPolicy_PollingBestOverhead();

		/**
		 * The meta object literal for the '<em><b>Polling Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_POLICY__POLLING_PERIOD = eINSTANCE.getPollingPolicy_PollingPeriod();

		/**
		 * The meta object literal for the '<em><b>Polling Worst Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_POLICY__POLLING_WORST_OVERHEAD = eINSTANCE.getPollingPolicy_PollingWorstOverhead();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_POLICY__PREASSIGNED = eINSTANCE.getPollingPolicy_Preassigned();

		/**
		 * The meta object literal for the '<em><b>The Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_POLICY__THE_PRIORITY = eINSTANCE.getPollingPolicy_ThePriority();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.PreemptionLevelImpl <em>Preemption Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.PreemptionLevelImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPreemptionLevel()
		 * @generated
		 */
		EClass PREEMPTION_LEVEL = eINSTANCE.getPreemptionLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREEMPTION_LEVEL__LEVEL = eINSTANCE.getPreemptionLevel_Level();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.PriorityCeilingImpl <em>Priority Ceiling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.PriorityCeilingImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPriorityCeiling()
		 * @generated
		 */
		EClass PRIORITY_CEILING = eINSTANCE.getPriorityCeiling();

		/**
		 * The meta object literal for the '<em><b>Ceiling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_CEILING__CEILING = eINSTANCE.getPriorityCeiling_Ceiling();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl <em>Processing Resource Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getProcessingResourceResults()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_RESULTS = eINSTANCE.getProcessingResourceResults();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_RESULTS__SLACK = eINSTANCE.getProcessingResourceResults_Slack();

		/**
		 * The meta object literal for the '<em><b>Detailed Utilization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION = eINSTANCE.getProcessingResourceResults_DetailedUtilization();

		/**
		 * The meta object literal for the '<em><b>Ready Queue Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE = eINSTANCE.getProcessingResourceResults_ReadyQueueSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_RESULTS__NAME = eINSTANCE.getProcessingResourceResults_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.QueueSizeImpl <em>Queue Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.QueueSizeImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getQueueSize()
		 * @generated
		 */
		EClass QUEUE_SIZE = eINSTANCE.getQueueSize();

		/**
		 * The meta object literal for the '<em><b>Max Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE_SIZE__MAX_NUM = eINSTANCE.getQueueSize_MaxNum();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.ReadyQueueSizeImpl <em>Ready Queue Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ReadyQueueSizeImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getReadyQueueSize()
		 * @generated
		 */
		EClass READY_QUEUE_SIZE = eINSTANCE.getReadyQueueSize();

		/**
		 * The meta object literal for the '<em><b>Max Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READY_QUEUE_SIZE__MAX_NUM = eINSTANCE.getReadyQueueSize_MaxNum();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl <em>REALTIMESITUATION Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getREALTIMESITUATIONType()
		 * @generated
		 */
		EClass REALTIMESITUATION_TYPE = eINSTANCE.getREALTIMESITUATIONType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESITUATION_TYPE__GROUP = eINSTANCE.getREALTIMESITUATIONType_Group();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__SLACK = eINSTANCE.getREALTIMESITUATIONType_Slack();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__TRACE = eINSTANCE.getREALTIMESITUATIONType_Trace();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__TRANSACTION = eINSTANCE.getREALTIMESITUATIONType_Transaction();

		/**
		 * The meta object literal for the '<em><b>Processing Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__PROCESSING_RESOURCE = eINSTANCE.getREALTIMESITUATIONType_ProcessingResource();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__OPERATION = eINSTANCE.getREALTIMESITUATIONType_Operation();

		/**
		 * The meta object literal for the '<em><b>Scheduling Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__SCHEDULING_SERVER = eINSTANCE.getREALTIMESITUATIONType_SchedulingServer();

		/**
		 * The meta object literal for the '<em><b>Shared Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIMESITUATION_TYPE__SHARED_RESOURCE = eINSTANCE.getREALTIMESITUATIONType_SharedResource();

		/**
		 * The meta object literal for the '<em><b>Generation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESITUATION_TYPE__GENERATION_DATE = eINSTANCE.getREALTIMESITUATIONType_GenerationDate();

		/**
		 * The meta object literal for the '<em><b>Generation Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESITUATION_TYPE__GENERATION_PROFILE = eINSTANCE.getREALTIMESITUATIONType_GenerationProfile();

		/**
		 * The meta object literal for the '<em><b>Generation Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESITUATION_TYPE__GENERATION_TOOL = eINSTANCE.getREALTIMESITUATIONType_GenerationTool();

		/**
		 * The meta object literal for the '<em><b>Model Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESITUATION_TYPE__MODEL_DATE = eINSTANCE.getREALTIMESITUATIONType_ModelDate();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIMESITUATION_TYPE__MODEL_NAME = eINSTANCE.getREALTIMESITUATIONType_ModelName();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.SchedulingServerResultsImpl <em>Scheduling Server Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.SchedulingServerResultsImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSchedulingServerResults()
		 * @generated
		 */
		EClass SCHEDULING_SERVER_RESULTS = eINSTANCE.getSchedulingServerResults();

		/**
		 * The meta object literal for the '<em><b>Non Preemptible FP Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__NON_PREEMPTIBLE_FP_POLICY = eINSTANCE.getSchedulingServerResults_NonPreemptibleFPPolicy();

		/**
		 * The meta object literal for the '<em><b>Fixed Priority Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__FIXED_PRIORITY_POLICY = eINSTANCE.getSchedulingServerResults_FixedPriorityPolicy();

		/**
		 * The meta object literal for the '<em><b>Interrupt FP Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__INTERRUPT_FP_POLICY = eINSTANCE.getSchedulingServerResults_InterruptFPPolicy();

		/**
		 * The meta object literal for the '<em><b>Polling Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__POLLING_POLICY = eINSTANCE.getSchedulingServerResults_PollingPolicy();

		/**
		 * The meta object literal for the '<em><b>Sporadic Server Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__SPORADIC_SERVER_POLICY = eINSTANCE.getSchedulingServerResults_SporadicServerPolicy();

		/**
		 * The meta object literal for the '<em><b>EDF Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__EDF_POLICY = eINSTANCE.getSchedulingServerResults_EDFPolicy();

		/**
		 * The meta object literal for the '<em><b>SRP Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER_RESULTS__SRP_PARAMETERS = eINSTANCE.getSchedulingServerResults_SRPParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_SERVER_RESULTS__NAME = eINSTANCE.getSchedulingServerResults_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl <em>Shared Resource Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSharedResourceResults()
		 * @generated
		 */
		EClass SHARED_RESOURCE_RESULTS = eINSTANCE.getSharedResourceResults();

		/**
		 * The meta object literal for the '<em><b>Priority Ceiling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_RESOURCE_RESULTS__PRIORITY_CEILING = eINSTANCE.getSharedResourceResults_PriorityCeiling();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_RESOURCE_RESULTS__UTILIZATION = eINSTANCE.getSharedResourceResults_Utilization();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_RESOURCE_RESULTS__QUEUE_SIZE = eINSTANCE.getSharedResourceResults_QueueSize();

		/**
		 * The meta object literal for the '<em><b>Preemption Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL = eINSTANCE.getSharedResourceResults_PreemptionLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_RESOURCE_RESULTS__NAME = eINSTANCE.getSharedResourceResults_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl <em>Simulation Timing Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSimulationTimingResult()
		 * @generated
		 */
		EClass SIMULATION_TIMING_RESULT = eINSTANCE.getSimulationTimingResult();

		/**
		 * The meta object literal for the '<em><b>Worst Global Response Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES = eINSTANCE.getSimulationTimingResult_WorstGlobalResponseTimes();

		/**
		 * The meta object literal for the '<em><b>Avg Global Response Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES = eINSTANCE.getSimulationTimingResult_AvgGlobalResponseTimes();

		/**
		 * The meta object literal for the '<em><b>Best Global Response Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES = eINSTANCE.getSimulationTimingResult_BestGlobalResponseTimes();

		/**
		 * The meta object literal for the '<em><b>Jitters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_TIMING_RESULT__JITTERS = eINSTANCE.getSimulationTimingResult_Jitters();

		/**
		 * The meta object literal for the '<em><b>Local Miss Ratios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS = eINSTANCE.getSimulationTimingResult_LocalMissRatios();

		/**
		 * The meta object literal for the '<em><b>Global Miss Ratios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS = eINSTANCE.getSimulationTimingResult_GlobalMissRatios();

		/**
		 * The meta object literal for the '<em><b>Avg Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME = eINSTANCE.getSimulationTimingResult_AvgBlockingTime();

		/**
		 * The meta object literal for the '<em><b>Avg Local Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME = eINSTANCE.getSimulationTimingResult_AvgLocalResponseTime();

		/**
		 * The meta object literal for the '<em><b>Best Local Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME = eINSTANCE.getSimulationTimingResult_BestLocalResponseTime();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__EVENT_NAME = eINSTANCE.getSimulationTimingResult_EventName();

		/**
		 * The meta object literal for the '<em><b>Max Preemption Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME = eINSTANCE.getSimulationTimingResult_MaxPreemptionTime();

		/**
		 * The meta object literal for the '<em><b>Num Of Queued Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS = eINSTANCE.getSimulationTimingResult_NumOfQueuedActivations();

		/**
		 * The meta object literal for the '<em><b>Num Of Suspensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS = eINSTANCE.getSimulationTimingResult_NumOfSuspensions();

		/**
		 * The meta object literal for the '<em><b>Suspension Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__SUSPENSION_TIME = eINSTANCE.getSimulationTimingResult_SuspensionTime();

		/**
		 * The meta object literal for the '<em><b>Worst Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME = eINSTANCE.getSimulationTimingResult_WorstBlockingTime();

		/**
		 * The meta object literal for the '<em><b>Worst Local Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME = eINSTANCE.getSimulationTimingResult_WorstLocalResponseTime();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.SlackImpl <em>Slack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.SlackImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSlack()
		 * @generated
		 */
		EClass SLACK = eINSTANCE.getSlack();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLACK__VALUE = eINSTANCE.getSlack_Value();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl <em>Sporadic Server Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSporadicServerPolicy()
		 * @generated
		 */
		EClass SPORADIC_SERVER_POLICY = eINSTANCE.getSporadicServerPolicy();

		/**
		 * The meta object literal for the '<em><b>Background Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY = eINSTANCE.getSporadicServerPolicy_BackgroundPriority();

		/**
		 * The meta object literal for the '<em><b>Initial Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_SERVER_POLICY__INITIAL_CAPACITY = eINSTANCE.getSporadicServerPolicy_InitialCapacity();

		/**
		 * The meta object literal for the '<em><b>Max Pending Replenishments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS = eINSTANCE.getSporadicServerPolicy_MaxPendingReplenishments();

		/**
		 * The meta object literal for the '<em><b>Normal Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_SERVER_POLICY__NORMAL_PRIORITY = eINSTANCE.getSporadicServerPolicy_NormalPriority();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_SERVER_POLICY__PREASSIGNED = eINSTANCE.getSporadicServerPolicy_Preassigned();

		/**
		 * The meta object literal for the '<em><b>Replenishment Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD = eINSTANCE.getSporadicServerPolicy_ReplenishmentPeriod();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.SRPParametersImpl <em>SRP Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.SRPParametersImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSRPParameters()
		 * @generated
		 */
		EClass SRP_PARAMETERS = eINSTANCE.getSRPParameters();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRP_PARAMETERS__PREASSIGNED = eINSTANCE.getSRPParameters_Preassigned();

		/**
		 * The meta object literal for the '<em><b>Preemption Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRP_PARAMETERS__PREEMPTION_LEVEL = eINSTANCE.getSRPParameters_PreemptionLevel();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl <em>Timing Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.TimingResultImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTimingResult()
		 * @generated
		 */
		EClass TIMING_RESULT = eINSTANCE.getTimingResult();

		/**
		 * The meta object literal for the '<em><b>Worst Global Response Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES = eINSTANCE.getTimingResult_WorstGlobalResponseTimes();

		/**
		 * The meta object literal for the '<em><b>Best Global Response Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES = eINSTANCE.getTimingResult_BestGlobalResponseTimes();

		/**
		 * The meta object literal for the '<em><b>Jitters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESULT__JITTERS = eINSTANCE.getTimingResult_Jitters();

		/**
		 * The meta object literal for the '<em><b>Best Local Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME = eINSTANCE.getTimingResult_BestLocalResponseTime();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_RESULT__EVENT_NAME = eINSTANCE.getTimingResult_EventName();

		/**
		 * The meta object literal for the '<em><b>Num Of Suspensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_RESULT__NUM_OF_SUSPENSIONS = eINSTANCE.getTimingResult_NumOfSuspensions();

		/**
		 * The meta object literal for the '<em><b>Worst Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_RESULT__WORST_BLOCKING_TIME = eINSTANCE.getTimingResult_WorstBlockingTime();

		/**
		 * The meta object literal for the '<em><b>Worst Local Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME = eINSTANCE.getTimingResult_WorstLocalResponseTime();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.TraceImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Pathname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__PATHNAME = eINSTANCE.getTrace_Pathname();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.TransactionResultsImpl <em>Transaction Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.TransactionResultsImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTransactionResults()
		 * @generated
		 */
		EClass TRANSACTION_RESULTS = eINSTANCE.getTransactionResults();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_RESULTS__GROUP = eINSTANCE.getTransactionResults_Group();

		/**
		 * The meta object literal for the '<em><b>Slack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESULTS__SLACK = eINSTANCE.getTransactionResults_Slack();

		/**
		 * The meta object literal for the '<em><b>Timing Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESULTS__TIMING_RESULT = eINSTANCE.getTransactionResults_TimingResult();

		/**
		 * The meta object literal for the '<em><b>Simulation Timing Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESULTS__SIMULATION_TIMING_RESULT = eINSTANCE.getTransactionResults_SimulationTimingResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_RESULTS__NAME = eINSTANCE.getTransactionResults_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.impl.UtilizationImpl <em>Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.UtilizationImpl
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getUtilization()
		 * @generated
		 */
		EClass UTILIZATION = eINSTANCE.getUtilization();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIZATION__TOTAL = eINSTANCE.getUtilization_Total();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.AffirmativeAssertion <em>Affirmative Assertion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAffirmativeAssertion()
		 * @generated
		 */
		EEnum AFFIRMATIVE_ASSERTION = eINSTANCE.getAffirmativeAssertion();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.result.Assertion <em>Assertion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.Assertion
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAssertion()
		 * @generated
		 */
		EEnum ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em>Affirmative Assertion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAffirmativeAssertionObject()
		 * @generated
		 */
		EDataType AFFIRMATIVE_ASSERTION_OBJECT = eINSTANCE.getAffirmativeAssertionObject();

		/**
		 * The meta object literal for the '<em>Assertion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.Assertion
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getAssertionObject()
		 * @generated
		 */
		EDataType ASSERTION_OBJECT = eINSTANCE.getAssertionObject();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>External Reference</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getExternalReference()
		 * @generated
		 */
		EDataType EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em>Factor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getFactor()
		 * @generated
		 */
		EDataType FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '<em>Factor Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getFactorObject()
		 * @generated
		 */
		EDataType FACTOR_OBJECT = eINSTANCE.getFactorObject();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNatural()
		 * @generated
		 */
		EDataType NATURAL = eINSTANCE.getNatural();

		/**
		 * The meta object literal for the '<em>Normalized Execution Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNormalizedExecutionTime()
		 * @generated
		 */
		EDataType NORMALIZED_EXECUTION_TIME = eINSTANCE.getNormalizedExecutionTime();

		/**
		 * The meta object literal for the '<em>Normalized Execution Time Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getNormalizedExecutionTimeObject()
		 * @generated
		 */
		EDataType NORMALIZED_EXECUTION_TIME_OBJECT = eINSTANCE.getNormalizedExecutionTimeObject();

		/**
		 * The meta object literal for the '<em>Percentage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPercentage()
		 * @generated
		 */
		EDataType PERCENTAGE = eINSTANCE.getPercentage();

		/**
		 * The meta object literal for the '<em>Percentage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPercentageObject()
		 * @generated
		 */
		EDataType PERCENTAGE_OBJECT = eINSTANCE.getPercentageObject();

		/**
		 * The meta object literal for the '<em>Positive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPositive()
		 * @generated
		 */
		EDataType POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '<em>Preemption Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPreemptionLevelType()
		 * @generated
		 */
		EDataType PREEMPTION_LEVEL_TYPE = eINSTANCE.getPreemptionLevelType();

		/**
		 * The meta object literal for the '<em>Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPriority()
		 * @generated
		 */
		EDataType PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '<em>Priority Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getPriorityObject()
		 * @generated
		 */
		EDataType PRIORITY_OBJECT = eINSTANCE.getPriorityObject();

		/**
		 * The meta object literal for the '<em>Signed Percentage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSignedPercentage()
		 * @generated
		 */
		EDataType SIGNED_PERCENTAGE = eINSTANCE.getSignedPercentage();

		/**
		 * The meta object literal for the '<em>Signed Percentage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getSignedPercentageObject()
		 * @generated
		 */
		EDataType SIGNED_PERCENTAGE_OBJECT = eINSTANCE.getSignedPercentageObject();

		/**
		 * The meta object literal for the '<em>Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTime()
		 * @generated
		 */
		EDataType TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em>Time Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getTimeObject()
		 * @generated
		 */
		EDataType TIME_OBJECT = eINSTANCE.getTimeObject();

		/**
		 * The meta object literal for the '<em>Unrestricted Percentage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getUnrestrictedPercentage()
		 * @generated
		 */
		EDataType UNRESTRICTED_PERCENTAGE = eINSTANCE.getUnrestrictedPercentage();

		/**
		 * The meta object literal for the '<em>Unrestricted Percentage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.result.impl.ResultPackageImpl#getUnrestrictedPercentageObject()
		 * @generated
		 */
		EDataType UNRESTRICTED_PERCENTAGE_OBJECT = eINSTANCE.getUnrestrictedPercentageObject();

	}

} //ResultPackage

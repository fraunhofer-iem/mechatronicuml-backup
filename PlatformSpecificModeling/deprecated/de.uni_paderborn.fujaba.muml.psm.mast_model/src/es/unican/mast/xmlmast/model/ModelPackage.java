/**
 */
package es.unican.mast.xmlmast.model;

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
 * @see es.unican.mast.xmlmast.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mast.unican.es/xmlmast/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = es.unican.mast.xmlmast.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ActivityImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Activity Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Activity Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUT_EVENT = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.AlarmClockSystemTimerImpl <em>Alarm Clock System Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.AlarmClockSystemTimerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAlarmClockSystemTimer()
	 * @generated
	 */
	int ALARM_CLOCK_SYSTEM_TIMER = 1;

	/**
	 * The feature id for the '<em><b>Avg Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD = 0;

	/**
	 * The feature id for the '<em><b>Best Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD = 1;

	/**
	 * The feature id for the '<em><b>Worst Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD = 2;

	/**
	 * The number of structural features of the '<em>Alarm Clock System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CLOCK_SYSTEM_TIMER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Alarm Clock System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CLOCK_SYSTEM_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.BarrierImpl <em>Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.BarrierImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBarrier()
	 * @generated
	 */
	int BARRIER = 2;

	/**
	 * The feature id for the '<em><b>Input Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__INPUT_EVENTS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__OUTPUT_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.BurstyExternalEventImpl <em>Bursty External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.BurstyExternalEventImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBurstyExternalEvent()
	 * @generated
	 */
	int BURSTY_EXTERNAL_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Avg Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT__AVG_INTERARRIVAL = 0;

	/**
	 * The feature id for the '<em><b>Bound Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT__BOUND_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT__DISTRIBUTION = 2;

	/**
	 * The feature id for the '<em><b>Max Arrivals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT__MAX_ARRIVALS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Bursty External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bursty External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURSTY_EXTERNAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.CharacterPacketDriverImpl <em>Character Packet Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.CharacterPacketDriverImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getCharacterPacketDriver()
	 * @generated
	 */
	int CHARACTER_PACKET_DRIVER = 4;

	/**
	 * The feature id for the '<em><b>Character Receive Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__CHARACTER_RECEIVE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Character Send Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__CHARACTER_SEND_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Character Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__CHARACTER_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Character Transmission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__CHARACTER_TRANSMISSION_TIME = 3;

	/**
	 * The feature id for the '<em><b>Message Partitioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__MESSAGE_PARTITIONING = 4;

	/**
	 * The feature id for the '<em><b>Packet Receive Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__PACKET_RECEIVE_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Packet Send Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__PACKET_SEND_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Packet Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__PACKET_SERVER = 7;

	/**
	 * The feature id for the '<em><b>RTA Overhead Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER__RTA_OVERHEAD_MODEL = 8;

	/**
	 * The number of structural features of the '<em>Character Packet Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Character Packet Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_PACKET_DRIVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.CompositeOperationImpl <em>Composite Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.CompositeOperationImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getCompositeOperation()
	 * @generated
	 */
	int COMPOSITE_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Overridden Fixed Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Overridden Permanent FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP = 1;

	/**
	 * The feature id for the '<em><b>Operation List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION__OPERATION_LIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Composite Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Composite Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl <em>Composite Timing Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getCompositeTimingRequirement()
	 * @generated
	 */
	int COMPOSITE_TIMING_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Max Output Jitter Req</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ = 1;

	/**
	 * The feature id for the '<em><b>Hard Global Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Soft Global Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE = 3;

	/**
	 * The feature id for the '<em><b>Global Max Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO = 4;

	/**
	 * The feature id for the '<em><b>Hard Local Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE = 5;

	/**
	 * The feature id for the '<em><b>Soft Local Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE = 6;

	/**
	 * The feature id for the '<em><b>Local Max Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO = 7;

	/**
	 * The number of structural features of the '<em>Composite Timing Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Composite Timing Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TIMING_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.ConcentratorImpl <em>Concentrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ConcentratorImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getConcentrator()
	 * @generated
	 */
	int CONCENTRATOR = 7;

	/**
	 * The feature id for the '<em><b>Input Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR__INPUT_EVENTS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR__OUTPUT_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Concentrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concentrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.DelayImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 8;

	/**
	 * The feature id for the '<em><b>Delay Max Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DELAY_MAX_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Delay Min Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DELAY_MIN_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__INPUT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__OUTPUT_EVENT = 3;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.DeliveryServerImpl <em>Delivery Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.DeliveryServerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDeliveryServer()
	 * @generated
	 */
	int DELIVERY_SERVER = 9;

	/**
	 * The feature id for the '<em><b>Delivery Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_SERVER__DELIVERY_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_SERVER__INPUT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Output Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_SERVER__OUTPUT_EVENTS_LIST = 2;

	/**
	 * The number of structural features of the '<em>Delivery Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_SERVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Delivery Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.DocumentRootImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

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
	 * The feature id for the '<em><b>MASTMODEL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTMODEL = 3;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.EDFPolicyImpl <em>EDF Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.EDFPolicyImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getEDFPolicy()
	 * @generated
	 */
	int EDF_POLICY = 11;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.EDFSchedulerImpl <em>EDF Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.EDFSchedulerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getEDFScheduler()
	 * @generated
	 */
	int EDF_SCHEDULER = 12;

	/**
	 * The feature id for the '<em><b>Avg Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_SCHEDULER__AVG_CONTEXT_SWITCH = 0;

	/**
	 * The feature id for the '<em><b>Best Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_SCHEDULER__BEST_CONTEXT_SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Worst Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_SCHEDULER__WORST_CONTEXT_SWITCH = 2;

	/**
	 * The number of structural features of the '<em>EDF Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_SCHEDULER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EDF Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.EnclosingOperationImpl <em>Enclosing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.EnclosingOperationImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getEnclosingOperation()
	 * @generated
	 */
	int ENCLOSING_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Overridden Fixed Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__OVERRIDDEN_FIXED_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Overridden Permanent FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__OVERRIDDEN_PERMANENT_FP = 1;

	/**
	 * The feature id for the '<em><b>Operation List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__OPERATION_LIST = 2;

	/**
	 * The feature id for the '<em><b>Average Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__AVERAGE_CASE_EXECUTION_TIME = 3;

	/**
	 * The feature id for the '<em><b>Best Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__BEST_CASE_EXECUTION_TIME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Worst Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION__WORST_CASE_EXECUTION_TIME = 6;

	/**
	 * The number of structural features of the '<em>Enclosing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Enclosing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.FixedPriorityPolicyImpl <em>Fixed Priority Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.FixedPriorityPolicyImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFixedPriorityPolicy()
	 * @generated
	 */
	int FIXED_PRIORITY_POLICY = 14;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl <em>Fixed Priority Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFixedPriorityScheduler()
	 * @generated
	 */
	int FIXED_PRIORITY_SCHEDULER = 15;

	/**
	 * The feature id for the '<em><b>Avg Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH = 0;

	/**
	 * The feature id for the '<em><b>Best Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Min Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Worst Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH = 4;

	/**
	 * The number of structural features of the '<em>Fixed Priority Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Fixed Priority Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl <em>FP Packet Based Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFPPacketBasedScheduler()
	 * @generated
	 */
	int FP_PACKET_BASED_SCHEDULER = 16;

	/**
	 * The feature id for the '<em><b>Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Min Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Packet Overhead Avg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Packet Overhead Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Packet Overhead Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE = 4;

	/**
	 * The number of structural features of the '<em>FP Packet Based Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FP Packet Based Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FP_PACKET_BASED_SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl <em>Global Max Miss Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getGlobalMaxMissRatio()
	 * @generated
	 */
	int GLOBAL_MAX_MISS_RATIO = 17;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAX_MISS_RATIO__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAX_MISS_RATIO__RATIO = 1;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT = 2;

	/**
	 * The number of structural features of the '<em>Global Max Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAX_MISS_RATIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Global Max Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAX_MISS_RATIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.HardGlobalDeadlineImpl <em>Hard Global Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.HardGlobalDeadlineImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getHardGlobalDeadline()
	 * @generated
	 */
	int HARD_GLOBAL_DEADLINE = 18;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GLOBAL_DEADLINE__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GLOBAL_DEADLINE__REFERENCED_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Hard Global Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GLOBAL_DEADLINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hard Global Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_GLOBAL_DEADLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.HardLocalDeadlineImpl <em>Hard Local Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.HardLocalDeadlineImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getHardLocalDeadline()
	 * @generated
	 */
	int HARD_LOCAL_DEADLINE = 19;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_LOCAL_DEADLINE__DEADLINE = 0;

	/**
	 * The number of structural features of the '<em>Hard Local Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_LOCAL_DEADLINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hard Local Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_LOCAL_DEADLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.ImmediateCeilingResourceImpl <em>Immediate Ceiling Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ImmediateCeilingResourceImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getImmediateCeilingResource()
	 * @generated
	 */
	int IMMEDIATE_CEILING_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Ceiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_CEILING_RESOURCE__CEILING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_CEILING_RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_CEILING_RESOURCE__PREASSIGNED = 2;

	/**
	 * The number of structural features of the '<em>Immediate Ceiling Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_CEILING_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Immediate Ceiling Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_CEILING_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.InterruptFPPolicyImpl <em>Interrupt FP Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.InterruptFPPolicyImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getInterruptFPPolicy()
	 * @generated
	 */
	int INTERRUPT_FP_POLICY = 21;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.ListOfDriversImpl <em>List Of Drivers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ListOfDriversImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getListOfDrivers()
	 * @generated
	 */
	int LIST_OF_DRIVERS = 22;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DRIVERS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Packet Driver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DRIVERS__PACKET_DRIVER = 1;

	/**
	 * The feature id for the '<em><b>Character Packet Driver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER = 2;

	/**
	 * The feature id for the '<em><b>RTEP Packet Driver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DRIVERS__RTEP_PACKET_DRIVER = 3;

	/**
	 * The number of structural features of the '<em>List Of Drivers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DRIVERS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>List Of Drivers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_DRIVERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.LocalMaxMissRatioImpl <em>Local Max Miss Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.LocalMaxMissRatioImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getLocalMaxMissRatio()
	 * @generated
	 */
	int LOCAL_MAX_MISS_RATIO = 23;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_MAX_MISS_RATIO__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_MAX_MISS_RATIO__RATIO = 1;

	/**
	 * The number of structural features of the '<em>Local Max Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_MAX_MISS_RATIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Local Max Miss Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_MAX_MISS_RATIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl <em>MASTMODEL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMASTMODELType()
	 * @generated
	 */
	int MASTMODEL_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Regular Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__REGULAR_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Packet Based Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__PACKET_BASED_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Regular Scheduling Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Immediate Ceiling Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Priority Inheritance Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>SRP Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__SRP_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Simple Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__SIMPLE_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Message Transmission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__MESSAGE_TRANSMISSION = 8;

	/**
	 * The feature id for the '<em><b>Composite Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__COMPOSITE_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Enclosing Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__ENCLOSING_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Regular Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__REGULAR_TRANSACTION = 11;

	/**
	 * The feature id for the '<em><b>Primary Scheduler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__PRIMARY_SCHEDULER = 12;

	/**
	 * The feature id for the '<em><b>Secondary Scheduler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__SECONDARY_SCHEDULER = 13;

	/**
	 * The feature id for the '<em><b>Model Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__MODEL_DATE = 14;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__MODEL_NAME = 15;

	/**
	 * The feature id for the '<em><b>System Pi PBehaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR = 16;

	/**
	 * The number of structural features of the '<em>MASTMODEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>MASTMODEL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTMODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.MaxOutputJitterReqImpl <em>Max Output Jitter Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.MaxOutputJitterReqImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMaxOutputJitterReq()
	 * @generated
	 */
	int MAX_OUTPUT_JITTER_REQ = 25;

	/**
	 * The feature id for the '<em><b>Max Output Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER = 0;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Max Output Jitter Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OUTPUT_JITTER_REQ_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Max Output Jitter Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OUTPUT_JITTER_REQ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl <em>Message Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMessageTransmission()
	 * @generated
	 */
	int MESSAGE_TRANSMISSION = 26;

	/**
	 * The feature id for the '<em><b>Overridden Fixed Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Overridden Permanent FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP = 1;

	/**
	 * The feature id for the '<em><b>Avg Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Min Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__NAME = 5;

	/**
	 * The number of structural features of the '<em>Message Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Message Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.MulticastImpl <em>Multicast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.MulticastImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMulticast()
	 * @generated
	 */
	int MULTICAST = 27;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST__INPUT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Output Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST__OUTPUT_EVENTS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Multicast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multicast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.NonPreemptibleFPPolicyImpl <em>Non Preemptible FP Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.NonPreemptibleFPPolicyImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNonPreemptibleFPPolicy()
	 * @generated
	 */
	int NON_PREEMPTIBLE_FP_POLICY = 28;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.OffsetImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Delay Max Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__DELAY_MAX_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Delay Min Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__DELAY_MIN_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__INPUT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__OUTPUT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__REFERENCED_EVENT = 4;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.OverriddenFixedPriorityImpl <em>Overridden Fixed Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.OverriddenFixedPriorityImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverriddenFixedPriority()
	 * @generated
	 */
	int OVERRIDDEN_FIXED_PRIORITY = 30;

	/**
	 * The feature id for the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Overridden Fixed Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_FIXED_PRIORITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Overridden Fixed Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_FIXED_PRIORITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.OverriddenPermanentFPImpl <em>Overridden Permanent FP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.OverriddenPermanentFPImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverriddenPermanentFP()
	 * @generated
	 */
	int OVERRIDDEN_PERMANENT_FP = 31;

	/**
	 * The feature id for the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_PERMANENT_FP__THE_PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Overridden Permanent FP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_PERMANENT_FP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Overridden Permanent FP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_PERMANENT_FP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl <em>Packet Based Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPacketBasedNetwork()
	 * @generated
	 */
	int PACKET_BASED_NETWORK = 32;

	/**
	 * The feature id for the '<em><b>List Of Drivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__LIST_OF_DRIVERS = 0;

	/**
	 * The feature id for the '<em><b>Max Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__MAX_BLOCKING = 1;

	/**
	 * The feature id for the '<em><b>Max Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__MAX_PACKET_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Min Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__MIN_PACKET_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__NAME = 4;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__SPEED_FACTOR = 5;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__THROUGHPUT = 6;

	/**
	 * The feature id for the '<em><b>Transmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK__TRANSMISSION = 7;

	/**
	 * The number of structural features of the '<em>Packet Based Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Packet Based Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_BASED_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl <em>Packet Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.PacketDriverImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPacketDriver()
	 * @generated
	 */
	int PACKET_DRIVER = 33;

	/**
	 * The feature id for the '<em><b>Message Partitioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER__MESSAGE_PARTITIONING = 0;

	/**
	 * The feature id for the '<em><b>Packet Receive Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER__PACKET_RECEIVE_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Packet Send Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER__PACKET_SEND_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Packet Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER__PACKET_SERVER = 3;

	/**
	 * The feature id for the '<em><b>RTA Overhead Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER__RTA_OVERHEAD_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Packet Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Packet Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_DRIVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl <em>Periodic External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPeriodicExternalEvent()
	 * @generated
	 */
	int PERIODIC_EXTERNAL_EVENT = 34;

	/**
	 * The feature id for the '<em><b>Max Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EXTERNAL_EVENT__MAX_JITTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EXTERNAL_EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EXTERNAL_EVENT__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EXTERNAL_EVENT__PHASE = 3;

	/**
	 * The number of structural features of the '<em>Periodic External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EXTERNAL_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Periodic External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EXTERNAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl <em>Polling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.PollingPolicyImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPollingPolicy()
	 * @generated
	 */
	int POLLING_POLICY = 35;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.PrimarySchedulerImpl <em>Primary Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.PrimarySchedulerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPrimaryScheduler()
	 * @generated
	 */
	int PRIMARY_SCHEDULER = 36;

	/**
	 * The feature id for the '<em><b>Fixed Priority Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER = 0;

	/**
	 * The feature id for the '<em><b>EDF Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER__EDF_SCHEDULER = 1;

	/**
	 * The feature id for the '<em><b>FP Packet Based Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER__HOST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER__NAME = 4;

	/**
	 * The number of structural features of the '<em>Primary Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Primary Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.PriorityInheritanceResourceImpl <em>Priority Inheritance Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.PriorityInheritanceResourceImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriorityInheritanceResource()
	 * @generated
	 */
	int PRIORITY_INHERITANCE_RESOURCE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_INHERITANCE_RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Priority Inheritance Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_INHERITANCE_RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Priority Inheritance Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_INHERITANCE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.QueryServerImpl <em>Query Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.QueryServerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getQueryServer()
	 * @generated
	 */
	int QUERY_SERVER = 38;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SERVER__INPUT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Output Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SERVER__OUTPUT_EVENTS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Request Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SERVER__REQUEST_POLICY = 2;

	/**
	 * The number of structural features of the '<em>Query Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SERVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.RateDivisorImpl <em>Rate Divisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.RateDivisorImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRateDivisor()
	 * @generated
	 */
	int RATE_DIVISOR = 39;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DIVISOR__INPUT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DIVISOR__OUTPUT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Rate Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DIVISOR__RATE_FACTOR = 2;

	/**
	 * The number of structural features of the '<em>Rate Divisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DIVISOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rate Divisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_DIVISOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.RegularEventImpl <em>Regular Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.RegularEventImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularEvent()
	 * @generated
	 */
	int REGULAR_EVENT = 40;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Max Output Jitter Req</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__MAX_OUTPUT_JITTER_REQ = 1;

	/**
	 * The feature id for the '<em><b>Hard Global Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__HARD_GLOBAL_DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Soft Global Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__SOFT_GLOBAL_DEADLINE = 3;

	/**
	 * The feature id for the '<em><b>Global Max Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__GLOBAL_MAX_MISS_RATIO = 4;

	/**
	 * The feature id for the '<em><b>Hard Local Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__HARD_LOCAL_DEADLINE = 5;

	/**
	 * The feature id for the '<em><b>Soft Local Deadline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__SOFT_LOCAL_DEADLINE = 6;

	/**
	 * The feature id for the '<em><b>Local Max Miss Ratio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__LOCAL_MAX_MISS_RATIO = 7;

	/**
	 * The feature id for the '<em><b>Composite Timing Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__COMPOSITE_TIMING_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT__EVENT = 9;

	/**
	 * The number of structural features of the '<em>Regular Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Regular Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl <em>Regular Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.RegularProcessorImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularProcessor()
	 * @generated
	 */
	int REGULAR_PROCESSOR = 41;

	/**
	 * The feature id for the '<em><b>Ticker System Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER = 0;

	/**
	 * The feature id for the '<em><b>Alarm Clock System Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER = 1;

	/**
	 * The feature id for the '<em><b>Avg ISR Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__AVG_ISR_SWITCH = 2;

	/**
	 * The feature id for the '<em><b>Best ISR Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__BEST_ISR_SWITCH = 3;

	/**
	 * The feature id for the '<em><b>Max Interrupt Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Min Interrupt Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__NAME = 6;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__SPEED_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Worst ISR Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR__WORST_ISR_SWITCH = 8;

	/**
	 * The number of structural features of the '<em>Regular Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Regular Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl <em>Regular Scheduling Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularSchedulingServer()
	 * @generated
	 */
	int REGULAR_SCHEDULING_SERVER = 42;

	/**
	 * The feature id for the '<em><b>Non Preemptible FP Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Fixed Priority Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Interrupt FP Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Polling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__POLLING_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Sporadic Server Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY = 4;

	/**
	 * The feature id for the '<em><b>EDF Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__EDF_POLICY = 5;

	/**
	 * The feature id for the '<em><b>SRP Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__NAME = 7;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER__SCHEDULER = 8;

	/**
	 * The number of structural features of the '<em>Regular Scheduling Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Regular Scheduling Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SCHEDULING_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl <em>Regular Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.RegularTransactionImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularTransaction()
	 * @generated
	 */
	int REGULAR_TRANSACTION = 43;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Periodic External Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Sporadic External Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Unbounded External Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Bursty External Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Singular External Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Regular Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__REGULAR_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>System Timed Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Concentrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__CONCENTRATOR = 9;

	/**
	 * The feature id for the '<em><b>Barrier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__BARRIER = 10;

	/**
	 * The feature id for the '<em><b>Delivery Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__DELIVERY_SERVER = 11;

	/**
	 * The feature id for the '<em><b>Query Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__QUERY_SERVER = 12;

	/**
	 * The feature id for the '<em><b>Multicast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__MULTICAST = 13;

	/**
	 * The feature id for the '<em><b>Rate Divisor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__RATE_DIVISOR = 14;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__DELAY = 15;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__OFFSET = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION__NAME = 17;

	/**
	 * The number of structural features of the '<em>Regular Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Regular Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl <em>RTEP Packet Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRTEPPacketDriver()
	 * @generated
	 */
	int RTEP_PACKET_DRIVER = 44;

	/**
	 * The feature id for the '<em><b>Failure Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__FAILURE_TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Message Partitioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING = 1;

	/**
	 * The feature id for the '<em><b>Number Of Stations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS = 2;

	/**
	 * The feature id for the '<em><b>Packet Discard Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Packet Interrupt Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER = 4;

	/**
	 * The feature id for the '<em><b>Packet ISR Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Packet Receive Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Packet Retransmission Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Packet Send Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Packet Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_SERVER = 9;

	/**
	 * The feature id for the '<em><b>Packet Transmission Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES = 10;

	/**
	 * The feature id for the '<em><b>RTA Overhead Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Token Check Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Token Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__TOKEN_DELAY = 13;

	/**
	 * The feature id for the '<em><b>Token Manage Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Token Retransmission Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Token Transmission Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES = 16;

	/**
	 * The number of structural features of the '<em>RTEP Packet Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>RTEP Packet Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEP_PACKET_DRIVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl <em>Secondary Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSecondaryScheduler()
	 * @generated
	 */
	int SECONDARY_SCHEDULER = 45;

	/**
	 * The feature id for the '<em><b>Fixed Priority Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER = 0;

	/**
	 * The feature id for the '<em><b>EDF Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__EDF_SCHEDULER = 1;

	/**
	 * The feature id for the '<em><b>FP Packet Based Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__HOST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER__NAME = 4;

	/**
	 * The number of structural features of the '<em>Secondary Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Secondary Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SimpleOperationImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSimpleOperation()
	 * @generated
	 */
	int SIMPLE_OPERATION = 46;

	/**
	 * The feature id for the '<em><b>Overridden Fixed Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Overridden Permanent FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP = 1;

	/**
	 * The feature id for the '<em><b>Shared Resources List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__SHARED_RESOURCES_LIST = 2;

	/**
	 * The feature id for the '<em><b>Shared Resources To Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK = 3;

	/**
	 * The feature id for the '<em><b>Shared Resources To Unlock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK = 4;

	/**
	 * The feature id for the '<em><b>Average Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME = 5;

	/**
	 * The feature id for the '<em><b>Best Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__NAME = 7;

	/**
	 * The feature id for the '<em><b>Worst Case Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME = 8;

	/**
	 * The number of structural features of the '<em>Simple Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Simple Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SingularExternalEventImpl <em>Singular External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SingularExternalEventImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSingularExternalEvent()
	 * @generated
	 */
	int SINGULAR_EXTERNAL_EVENT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGULAR_EXTERNAL_EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGULAR_EXTERNAL_EVENT__PHASE = 1;

	/**
	 * The number of structural features of the '<em>Singular External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGULAR_EXTERNAL_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Singular External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGULAR_EXTERNAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SoftGlobalDeadlineImpl <em>Soft Global Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SoftGlobalDeadlineImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSoftGlobalDeadline()
	 * @generated
	 */
	int SOFT_GLOBAL_DEADLINE = 48;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GLOBAL_DEADLINE__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Soft Global Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GLOBAL_DEADLINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Soft Global Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GLOBAL_DEADLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SoftLocalDeadlineImpl <em>Soft Local Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SoftLocalDeadlineImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSoftLocalDeadline()
	 * @generated
	 */
	int SOFT_LOCAL_DEADLINE = 49;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_LOCAL_DEADLINE__DEADLINE = 0;

	/**
	 * The number of structural features of the '<em>Soft Local Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_LOCAL_DEADLINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Soft Local Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_LOCAL_DEADLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl <em>Sporadic External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSporadicExternalEvent()
	 * @generated
	 */
	int SPORADIC_EXTERNAL_EVENT = 50;

	/**
	 * The feature id for the '<em><b>Avg Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL = 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EXTERNAL_EVENT__DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Min Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EXTERNAL_EVENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Sporadic External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EXTERNAL_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sporadic External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EXTERNAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl <em>Sporadic Server Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSporadicServerPolicy()
	 * @generated
	 */
	int SPORADIC_SERVER_POLICY = 51;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SRPParametersImpl <em>SRP Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SRPParametersImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSRPParameters()
	 * @generated
	 */
	int SRP_PARAMETERS = 52;

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
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SRPResourceImpl <em>SRP Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SRPResourceImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSRPResource()
	 * @generated
	 */
	int SRP_RESOURCE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Preassigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_RESOURCE__PREASSIGNED = 1;

	/**
	 * The feature id for the '<em><b>Preemption Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_RESOURCE__PREEMPTION_LEVEL = 2;

	/**
	 * The number of structural features of the '<em>SRP Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SRP Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl <em>System Timed Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSystemTimedActivity()
	 * @generated
	 */
	int SYSTEM_TIMED_ACTIVITY = 54;

	/**
	 * The feature id for the '<em><b>Activity Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Activity Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMED_ACTIVITY__INPUT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT = 3;

	/**
	 * The number of structural features of the '<em>System Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMED_ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMED_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl <em>Ticker System Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTickerSystemTimer()
	 * @generated
	 */
	int TICKER_SYSTEM_TIMER = 55;

	/**
	 * The feature id for the '<em><b>Avg Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKER_SYSTEM_TIMER__AVG_OVERHEAD = 0;

	/**
	 * The feature id for the '<em><b>Best Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKER_SYSTEM_TIMER__BEST_OVERHEAD = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKER_SYSTEM_TIMER__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Worst Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKER_SYSTEM_TIMER__WORST_OVERHEAD = 3;

	/**
	 * The number of structural features of the '<em>Ticker System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKER_SYSTEM_TIMER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ticker System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKER_SYSTEM_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.impl.UnboundedExternalEventImpl <em>Unbounded External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.UnboundedExternalEventImpl
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getUnboundedExternalEvent()
	 * @generated
	 */
	int UNBOUNDED_EXTERNAL_EVENT = 56;

	/**
	 * The feature id for the '<em><b>Avg Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_EXTERNAL_EVENT__AVG_INTERARRIVAL = 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_EXTERNAL_EVENT__DISTRIBUTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_EXTERNAL_EVENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Unbounded External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_EXTERNAL_EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unbounded External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_EXTERNAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.AffirmativeAssertion <em>Affirmative Assertion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.AffirmativeAssertion
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAffirmativeAssertion()
	 * @generated
	 */
	int AFFIRMATIVE_ASSERTION = 57;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.Assertion <em>Assertion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 58;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.DeliveryPolicy <em>Delivery Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDeliveryPolicy()
	 * @generated
	 */
	int DELIVERY_POLICY = 59;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.DistributionType <em>Distribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.DistributionType
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDistributionType()
	 * @generated
	 */
	int DISTRIBUTION_TYPE = 60;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.NegativeAssertion <em>Negative Assertion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.NegativeAssertion
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNegativeAssertion()
	 * @generated
	 */
	int NEGATIVE_ASSERTION = 61;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.OverheadType <em>Overhead Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.OverheadType
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverheadType()
	 * @generated
	 */
	int OVERHEAD_TYPE = 62;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.PriorityInheritanceProtocol <em>Priority Inheritance Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriorityInheritanceProtocol()
	 * @generated
	 */
	int PRIORITY_INHERITANCE_PROTOCOL = 63;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.RequestPolicy <em>Request Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.RequestPolicy
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRequestPolicy()
	 * @generated
	 */
	int REQUEST_POLICY = 64;

	/**
	 * The meta object id for the '{@link es.unican.mast.xmlmast.model.TransmissionType <em>Transmission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.TransmissionType
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTransmissionType()
	 * @generated
	 */
	int TRANSMISSION_TYPE = 65;

	/**
	 * The meta object id for the '<em>Absolute Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAbsoluteTime()
	 * @generated
	 */
	int ABSOLUTE_TIME = 66;

	/**
	 * The meta object id for the '<em>Absolute Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAbsoluteTimeObject()
	 * @generated
	 */
	int ABSOLUTE_TIME_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Affirmative Assertion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.AffirmativeAssertion
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAffirmativeAssertionObject()
	 * @generated
	 */
	int AFFIRMATIVE_ASSERTION_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Any Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAnyPriority()
	 * @generated
	 */
	int ANY_PRIORITY = 69;

	/**
	 * The meta object id for the '<em>Assertion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAssertionObject()
	 * @generated
	 */
	int ASSERTION_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Bit Count</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBitCount()
	 * @generated
	 */
	int BIT_COUNT = 71;

	/**
	 * The meta object id for the '<em>Bit Count Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBitCountObject()
	 * @generated
	 */
	int BIT_COUNT_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 73;

	/**
	 * The meta object id for the '<em>Delivery Policy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDeliveryPolicyObject()
	 * @generated
	 */
	int DELIVERY_POLICY_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Distribution Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.DistributionType
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDistributionTypeObject()
	 * @generated
	 */
	int DISTRIBUTION_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 76;

	/**
	 * The meta object id for the '<em>Float Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFloatObject()
	 * @generated
	 */
	int FLOAT_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 78;

	/**
	 * The meta object id for the '<em>Identifier Ref</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getIdentifierRef()
	 * @generated
	 */
	int IDENTIFIER_REF = 79;

	/**
	 * The meta object id for the '<em>Identifier Ref List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getIdentifierRefList()
	 * @generated
	 */
	int IDENTIFIER_REF_LIST = 80;

	/**
	 * The meta object id for the '<em>Interrupt Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getInterruptPriority()
	 * @generated
	 */
	int INTERRUPT_PRIORITY = 81;

	/**
	 * The meta object id for the '<em>Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNatural()
	 * @generated
	 */
	int NATURAL = 82;

	/**
	 * The meta object id for the '<em>Negative Assertion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.NegativeAssertion
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNegativeAssertionObject()
	 * @generated
	 */
	int NEGATIVE_ASSERTION_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Normalized Execution Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNormalizedExecutionTime()
	 * @generated
	 */
	int NORMALIZED_EXECUTION_TIME = 84;

	/**
	 * The meta object id for the '<em>Normalized Execution Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNormalizedExecutionTimeObject()
	 * @generated
	 */
	int NORMALIZED_EXECUTION_TIME_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Overhead Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.OverheadType
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverheadTypeObject()
	 * @generated
	 */
	int OVERHEAD_TYPE_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Pathname</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPathname()
	 * @generated
	 */
	int PATHNAME = 87;

	/**
	 * The meta object id for the '<em>Percentage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPercentage()
	 * @generated
	 */
	int PERCENTAGE = 88;

	/**
	 * The meta object id for the '<em>Percentage Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPercentageObject()
	 * @generated
	 */
	int PERCENTAGE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Positive</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 90;

	/**
	 * The meta object id for the '<em>Preemption Level</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPreemptionLevel()
	 * @generated
	 */
	int PREEMPTION_LEVEL = 91;

	/**
	 * The meta object id for the '<em>Priority</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 92;

	/**
	 * The meta object id for the '<em>Priority Inheritance Protocol Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriorityInheritanceProtocolObject()
	 * @generated
	 */
	int PRIORITY_INHERITANCE_PROTOCOL_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Request Policy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.RequestPolicy
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRequestPolicyObject()
	 * @generated
	 */
	int REQUEST_POLICY_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Throughput</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 95;

	/**
	 * The meta object id for the '<em>Throughput Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getThroughputObject()
	 * @generated
	 */
	int THROUGHPUT_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 97;

	/**
	 * The meta object id for the '<em>Time Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTimeObject()
	 * @generated
	 */
	int TIME_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Transmission Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.mast.xmlmast.model.TransmissionType
	 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTransmissionTypeObject()
	 * @generated
	 */
	int TRANSMISSION_TYPE_OBJECT = 99;


	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see es.unican.mast.xmlmast.model.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Activity#getActivityOperation <em>Activity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.Activity#getActivityOperation()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Activity#getActivityServer <em>Activity Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Server</em>'.
	 * @see es.unican.mast.xmlmast.model.Activity#getActivityServer()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Activity#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Activity#getInputEvent()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Activity#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Activity#getOutputEvent()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_OutputEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer <em>Alarm Clock System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Clock System Timer</em>'.
	 * @see es.unican.mast.xmlmast.model.AlarmClockSystemTimer
	 * @generated
	 */
	EClass getAlarmClockSystemTimer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getAvgOverhead <em>Avg Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getAvgOverhead()
	 * @see #getAlarmClockSystemTimer()
	 * @generated
	 */
	EAttribute getAlarmClockSystemTimer_AvgOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getBestOverhead <em>Best Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getBestOverhead()
	 * @see #getAlarmClockSystemTimer()
	 * @generated
	 */
	EAttribute getAlarmClockSystemTimer_BestOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getWorstOverhead <em>Worst Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getWorstOverhead()
	 * @see #getAlarmClockSystemTimer()
	 * @generated
	 */
	EAttribute getAlarmClockSystemTimer_WorstOverhead();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.Barrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barrier</em>'.
	 * @see es.unican.mast.xmlmast.model.Barrier
	 * @generated
	 */
	EClass getBarrier();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Barrier#getInputEventsList <em>Input Events List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Events List</em>'.
	 * @see es.unican.mast.xmlmast.model.Barrier#getInputEventsList()
	 * @see #getBarrier()
	 * @generated
	 */
	EAttribute getBarrier_InputEventsList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Barrier#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Barrier#getOutputEvent()
	 * @see #getBarrier()
	 * @generated
	 */
	EAttribute getBarrier_OutputEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent <em>Bursty External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bursty External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent
	 * @generated
	 */
	EClass getBurstyExternalEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Interarrival</em>'.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent#getAvgInterarrival()
	 * @see #getBurstyExternalEvent()
	 * @generated
	 */
	EAttribute getBurstyExternalEvent_AvgInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent#getBoundInterval <em>Bound Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Interval</em>'.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent#getBoundInterval()
	 * @see #getBurstyExternalEvent()
	 * @generated
	 */
	EAttribute getBurstyExternalEvent_BoundInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent#getDistribution()
	 * @see #getBurstyExternalEvent()
	 * @generated
	 */
	EAttribute getBurstyExternalEvent_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent#getMaxArrivals <em>Max Arrivals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Arrivals</em>'.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent#getMaxArrivals()
	 * @see #getBurstyExternalEvent()
	 * @generated
	 */
	EAttribute getBurstyExternalEvent_MaxArrivals();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent#getName()
	 * @see #getBurstyExternalEvent()
	 * @generated
	 */
	EAttribute getBurstyExternalEvent_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver <em>Character Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Packet Driver</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver
	 * @generated
	 */
	EClass getCharacterPacketDriver();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterReceiveOperation <em>Character Receive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Receive Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterReceiveOperation()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_CharacterReceiveOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterSendOperation <em>Character Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Send Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterSendOperation()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_CharacterSendOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterServer <em>Character Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Server</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterServer()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_CharacterServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterTransmissionTime <em>Character Transmission Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Transmission Time</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getCharacterTransmissionTime()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_CharacterTransmissionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getMessagePartitioning <em>Message Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Partitioning</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getMessagePartitioning()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_MessagePartitioning();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Receive Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getPacketReceiveOperation()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_PacketReceiveOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Send Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getPacketSendOperation()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_PacketSendOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getPacketServer <em>Packet Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Server</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getPacketServer()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_PacketServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RTA Overhead Model</em>'.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver#getRTAOverheadModel()
	 * @see #getCharacterPacketDriver()
	 * @generated
	 */
	EAttribute getCharacterPacketDriver_RTAOverheadModel();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.CompositeOperation <em>Composite Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeOperation
	 * @generated
	 */
	EClass getCompositeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Fixed Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenFixedPriority()
	 * @see #getCompositeOperation()
	 * @generated
	 */
	EReference getCompositeOperation_OverriddenFixedPriority();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Permanent FP</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeOperation#getOverriddenPermanentFP()
	 * @see #getCompositeOperation()
	 * @generated
	 */
	EReference getCompositeOperation_OverriddenPermanentFP();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CompositeOperation#getOperationList <em>Operation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation List</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeOperation#getOperationList()
	 * @see #getCompositeOperation()
	 * @generated
	 */
	EAttribute getCompositeOperation_OperationList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.CompositeOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeOperation#getName()
	 * @see #getCompositeOperation()
	 * @generated
	 */
	EAttribute getCompositeOperation_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement <em>Composite Timing Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Timing Requirement</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement
	 * @generated
	 */
	EClass getCompositeTimingRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getGroup()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EAttribute getCompositeTimingRequirement_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getMaxOutputJitterReq <em>Max Output Jitter Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Output Jitter Req</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getMaxOutputJitterReq()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_MaxOutputJitterReq();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getHardGlobalDeadline <em>Hard Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hard Global Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getHardGlobalDeadline()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_HardGlobalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getSoftGlobalDeadline <em>Soft Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Global Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getSoftGlobalDeadline()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_SoftGlobalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getGlobalMaxMissRatio <em>Global Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Max Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getGlobalMaxMissRatio()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_GlobalMaxMissRatio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getHardLocalDeadline <em>Hard Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hard Local Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getHardLocalDeadline()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_HardLocalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getSoftLocalDeadline <em>Soft Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Local Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getSoftLocalDeadline()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_SoftLocalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement#getLocalMaxMissRatio <em>Local Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Max Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement#getLocalMaxMissRatio()
	 * @see #getCompositeTimingRequirement()
	 * @generated
	 */
	EReference getCompositeTimingRequirement_LocalMaxMissRatio();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.Concentrator <em>Concentrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concentrator</em>'.
	 * @see es.unican.mast.xmlmast.model.Concentrator
	 * @generated
	 */
	EClass getConcentrator();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Concentrator#getInputEventsList <em>Input Events List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Events List</em>'.
	 * @see es.unican.mast.xmlmast.model.Concentrator#getInputEventsList()
	 * @see #getConcentrator()
	 * @generated
	 */
	EAttribute getConcentrator_InputEventsList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Concentrator#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Concentrator#getOutputEvent()
	 * @see #getConcentrator()
	 * @generated
	 */
	EAttribute getConcentrator_OutputEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see es.unican.mast.xmlmast.model.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Delay#getDelayMaxInterval <em>Delay Max Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Max Interval</em>'.
	 * @see es.unican.mast.xmlmast.model.Delay#getDelayMaxInterval()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_DelayMaxInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Delay#getDelayMinInterval <em>Delay Min Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Min Interval</em>'.
	 * @see es.unican.mast.xmlmast.model.Delay#getDelayMinInterval()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_DelayMinInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Delay#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Delay#getInputEvent()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Delay#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Delay#getOutputEvent()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_OutputEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.DeliveryServer <em>Delivery Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Server</em>'.
	 * @see es.unican.mast.xmlmast.model.DeliveryServer
	 * @generated
	 */
	EClass getDeliveryServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.DeliveryServer#getDeliveryPolicy <em>Delivery Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.DeliveryServer#getDeliveryPolicy()
	 * @see #getDeliveryServer()
	 * @generated
	 */
	EAttribute getDeliveryServer_DeliveryPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.DeliveryServer#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.DeliveryServer#getInputEvent()
	 * @see #getDeliveryServer()
	 * @generated
	 */
	EAttribute getDeliveryServer_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.DeliveryServer#getOutputEventsList <em>Output Events List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Events List</em>'.
	 * @see es.unican.mast.xmlmast.model.DeliveryServer#getOutputEventsList()
	 * @see #getDeliveryServer()
	 * @generated
	 */
	EAttribute getDeliveryServer_OutputEventsList();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.unican.mast.xmlmast.model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.unican.mast.xmlmast.model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.unican.mast.xmlmast.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.unican.mast.xmlmast.model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.unican.mast.xmlmast.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.unican.mast.xmlmast.model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.DocumentRoot#getMASTMODEL <em>MASTMODEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MASTMODEL</em>'.
	 * @see es.unican.mast.xmlmast.model.DocumentRoot#getMASTMODEL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MASTMODEL();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.EDFPolicy <em>EDF Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDF Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFPolicy
	 * @generated
	 */
	EClass getEDFPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EDFPolicy#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFPolicy#getDeadline()
	 * @see #getEDFPolicy()
	 * @generated
	 */
	EAttribute getEDFPolicy_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EDFPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFPolicy#getPreassigned()
	 * @see #getEDFPolicy()
	 * @generated
	 */
	EAttribute getEDFPolicy_Preassigned();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.EDFScheduler <em>EDF Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDF Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFScheduler
	 * @generated
	 */
	EClass getEDFScheduler();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EDFScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFScheduler#getAvgContextSwitch()
	 * @see #getEDFScheduler()
	 * @generated
	 */
	EAttribute getEDFScheduler_AvgContextSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EDFScheduler#getBestContextSwitch <em>Best Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFScheduler#getBestContextSwitch()
	 * @see #getEDFScheduler()
	 * @generated
	 */
	EAttribute getEDFScheduler_BestContextSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EDFScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.EDFScheduler#getWorstContextSwitch()
	 * @see #getEDFScheduler()
	 * @generated
	 */
	EAttribute getEDFScheduler_WorstContextSwitch();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.EnclosingOperation <em>Enclosing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enclosing Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation
	 * @generated
	 */
	EClass getEnclosingOperation();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Fixed Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenFixedPriority()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EReference getEnclosingOperation_OverriddenFixedPriority();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Permanent FP</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getOverriddenPermanentFP()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EReference getEnclosingOperation_OverriddenPermanentFP();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getOperationList <em>Operation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation List</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getOperationList()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EAttribute getEnclosingOperation_OperationList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Case Execution Time</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getAverageCaseExecutionTime()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EAttribute getEnclosingOperation_AverageCaseExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Case Execution Time</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getBestCaseExecutionTime()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EAttribute getEnclosingOperation_BestCaseExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getName()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EAttribute getEnclosingOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.EnclosingOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Case Execution Time</em>'.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation#getWorstCaseExecutionTime()
	 * @see #getEnclosingOperation()
	 * @generated
	 */
	EAttribute getEnclosingOperation_WorstCaseExecutionTime();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.FixedPriorityPolicy <em>Fixed Priority Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Priority Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityPolicy
	 * @generated
	 */
	EClass getFixedPriorityPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityPolicy#getPreassigned()
	 * @see #getFixedPriorityPolicy()
	 * @generated
	 */
	EAttribute getFixedPriorityPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityPolicy#getThePriority()
	 * @see #getFixedPriorityPolicy()
	 * @generated
	 */
	EAttribute getFixedPriorityPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler <em>Fixed Priority Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Priority Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler
	 * @generated
	 */
	EClass getFixedPriorityScheduler();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler#getAvgContextSwitch()
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 */
	EAttribute getFixedPriorityScheduler_AvgContextSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getBestContextSwitch <em>Best Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler#getBestContextSwitch()
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 */
	EAttribute getFixedPriorityScheduler_BestContextSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMaxPriority <em>Max Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMaxPriority()
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 */
	EAttribute getFixedPriorityScheduler_MaxPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMinPriority <em>Min Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMinPriority()
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 */
	EAttribute getFixedPriorityScheduler_MinPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Context Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler#getWorstContextSwitch()
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 */
	EAttribute getFixedPriorityScheduler_WorstContextSwitch();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FP Packet Based Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler
	 * @generated
	 */
	EClass getFPPacketBasedScheduler();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMaxPriority <em>Max Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMaxPriority()
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 */
	EAttribute getFPPacketBasedScheduler_MaxPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMinPriority <em>Min Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMinPriority()
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 */
	EAttribute getFPPacketBasedScheduler_MinPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadAvgSize <em>Packet Overhead Avg Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Overhead Avg Size</em>'.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadAvgSize()
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 */
	EAttribute getFPPacketBasedScheduler_PacketOverheadAvgSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMaxSize <em>Packet Overhead Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Overhead Max Size</em>'.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMaxSize()
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 */
	EAttribute getFPPacketBasedScheduler_PacketOverheadMaxSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMinSize <em>Packet Overhead Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Overhead Min Size</em>'.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMinSize()
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 */
	EAttribute getFPPacketBasedScheduler_PacketOverheadMinSize();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio <em>Global Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Max Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.GlobalMaxMissRatio
	 * @generated
	 */
	EClass getGlobalMaxMissRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getDeadline()
	 * @see #getGlobalMaxMissRatio()
	 * @generated
	 */
	EAttribute getGlobalMaxMissRatio_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getRatio()
	 * @see #getGlobalMaxMissRatio()
	 * @generated
	 */
	EAttribute getGlobalMaxMissRatio_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getReferencedEvent()
	 * @see #getGlobalMaxMissRatio()
	 * @generated
	 */
	EAttribute getGlobalMaxMissRatio_ReferencedEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline <em>Hard Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Global Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.HardGlobalDeadline
	 * @generated
	 */
	EClass getHardGlobalDeadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.HardGlobalDeadline#getDeadline()
	 * @see #getHardGlobalDeadline()
	 * @generated
	 */
	EAttribute getHardGlobalDeadline_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.model.HardGlobalDeadline#getReferencedEvent()
	 * @see #getHardGlobalDeadline()
	 * @generated
	 */
	EAttribute getHardGlobalDeadline_ReferencedEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.HardLocalDeadline <em>Hard Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Local Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.HardLocalDeadline
	 * @generated
	 */
	EClass getHardLocalDeadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.HardLocalDeadline#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.HardLocalDeadline#getDeadline()
	 * @see #getHardLocalDeadline()
	 * @generated
	 */
	EAttribute getHardLocalDeadline_Deadline();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource <em>Immediate Ceiling Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Ceiling Resource</em>'.
	 * @see es.unican.mast.xmlmast.model.ImmediateCeilingResource
	 * @generated
	 */
	EClass getImmediateCeilingResource();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getCeiling <em>Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ceiling</em>'.
	 * @see es.unican.mast.xmlmast.model.ImmediateCeilingResource#getCeiling()
	 * @see #getImmediateCeilingResource()
	 * @generated
	 */
	EAttribute getImmediateCeilingResource_Ceiling();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.ImmediateCeilingResource#getName()
	 * @see #getImmediateCeilingResource()
	 * @generated
	 */
	EAttribute getImmediateCeilingResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.ImmediateCeilingResource#getPreassigned()
	 * @see #getImmediateCeilingResource()
	 * @generated
	 */
	EAttribute getImmediateCeilingResource_Preassigned();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.InterruptFPPolicy <em>Interrupt FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.InterruptFPPolicy
	 * @generated
	 */
	EClass getInterruptFPPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.InterruptFPPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.InterruptFPPolicy#getPreassigned()
	 * @see #getInterruptFPPolicy()
	 * @generated
	 */
	EAttribute getInterruptFPPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.InterruptFPPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.InterruptFPPolicy#getThePriority()
	 * @see #getInterruptFPPolicy()
	 * @generated
	 */
	EAttribute getInterruptFPPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.ListOfDrivers <em>List Of Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Drivers</em>'.
	 * @see es.unican.mast.xmlmast.model.ListOfDrivers
	 * @generated
	 */
	EClass getListOfDrivers();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.model.ListOfDrivers#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.model.ListOfDrivers#getGroup()
	 * @see #getListOfDrivers()
	 * @generated
	 */
	EAttribute getListOfDrivers_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.ListOfDrivers#getPacketDriver <em>Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet Driver</em>'.
	 * @see es.unican.mast.xmlmast.model.ListOfDrivers#getPacketDriver()
	 * @see #getListOfDrivers()
	 * @generated
	 */
	EReference getListOfDrivers_PacketDriver();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.ListOfDrivers#getCharacterPacketDriver <em>Character Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Character Packet Driver</em>'.
	 * @see es.unican.mast.xmlmast.model.ListOfDrivers#getCharacterPacketDriver()
	 * @see #getListOfDrivers()
	 * @generated
	 */
	EReference getListOfDrivers_CharacterPacketDriver();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.ListOfDrivers#getRTEPPacketDriver <em>RTEP Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RTEP Packet Driver</em>'.
	 * @see es.unican.mast.xmlmast.model.ListOfDrivers#getRTEPPacketDriver()
	 * @see #getListOfDrivers()
	 * @generated
	 */
	EReference getListOfDrivers_RTEPPacketDriver();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.LocalMaxMissRatio <em>Local Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Max Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.LocalMaxMissRatio
	 * @generated
	 */
	EClass getLocalMaxMissRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.LocalMaxMissRatio#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.LocalMaxMissRatio#getDeadline()
	 * @see #getLocalMaxMissRatio()
	 * @generated
	 */
	EAttribute getLocalMaxMissRatio_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.LocalMaxMissRatio#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.LocalMaxMissRatio#getRatio()
	 * @see #getLocalMaxMissRatio()
	 * @generated
	 */
	EAttribute getLocalMaxMissRatio_Ratio();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.MASTMODELType <em>MASTMODEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MASTMODEL Type</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType
	 * @generated
	 */
	EClass getMASTMODELType();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getGroup()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EAttribute getMASTMODELType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getRegularProcessor <em>Regular Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Processor</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getRegularProcessor()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_RegularProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getPacketBasedNetwork <em>Packet Based Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet Based Network</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getPacketBasedNetwork()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_PacketBasedNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getRegularSchedulingServer <em>Regular Scheduling Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Scheduling Server</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getRegularSchedulingServer()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_RegularSchedulingServer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getImmediateCeilingResource <em>Immediate Ceiling Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Immediate Ceiling Resource</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getImmediateCeilingResource()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_ImmediateCeilingResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getPriorityInheritanceResource <em>Priority Inheritance Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Priority Inheritance Resource</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getPriorityInheritanceResource()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_PriorityInheritanceResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSRPResource <em>SRP Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SRP Resource</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getSRPResource()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_SRPResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getSimpleOperation()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_SimpleOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getMessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Transmission</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getMessageTransmission()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_MessageTransmission();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getCompositeOperation <em>Composite Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getCompositeOperation()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_CompositeOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getEnclosingOperation <em>Enclosing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enclosing Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getEnclosingOperation()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_EnclosingOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getRegularTransaction <em>Regular Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Transaction</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getRegularTransaction()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_RegularTransaction();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getPrimaryScheduler <em>Primary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getPrimaryScheduler()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_PrimaryScheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSecondaryScheduler <em>Secondary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getSecondaryScheduler()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EReference getMASTMODELType_SecondaryScheduler();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MASTMODELType#getModelDate <em>Model Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Date</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getModelDate()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EAttribute getMASTMODELType_ModelDate();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MASTMODELType#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getModelName()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EAttribute getMASTMODELType_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MASTMODELType#getSystemPiPBehaviour <em>System Pi PBehaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Pi PBehaviour</em>'.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType#getSystemPiPBehaviour()
	 * @see #getMASTMODELType()
	 * @generated
	 */
	EAttribute getMASTMODELType_SystemPiPBehaviour();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq <em>Max Output Jitter Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Output Jitter Req</em>'.
	 * @see es.unican.mast.xmlmast.model.MaxOutputJitterReq
	 * @generated
	 */
	EClass getMaxOutputJitterReq();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getMaxOutputJitter <em>Max Output Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Output Jitter</em>'.
	 * @see es.unican.mast.xmlmast.model.MaxOutputJitterReq#getMaxOutputJitter()
	 * @see #getMaxOutputJitterReq()
	 * @generated
	 */
	EAttribute getMaxOutputJitterReq_MaxOutputJitter();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.model.MaxOutputJitterReq#getReferencedEvent()
	 * @see #getMaxOutputJitterReq()
	 * @generated
	 */
	EAttribute getMaxOutputJitterReq_ReferencedEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.MessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Transmission</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission
	 * @generated
	 */
	EClass getMessageTransmission();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Fixed Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenFixedPriority()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EReference getMessageTransmission_OverriddenFixedPriority();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Permanent FP</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenPermanentFP()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EReference getMessageTransmission_OverriddenPermanentFP();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MessageTransmission#getAvgMessageSize <em>Avg Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Message Size</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission#getAvgMessageSize()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EAttribute getMessageTransmission_AvgMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMaxMessageSize <em>Max Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Message Size</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission#getMaxMessageSize()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EAttribute getMessageTransmission_MaxMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMinMessageSize <em>Min Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Message Size</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission#getMinMessageSize()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EAttribute getMessageTransmission_MinMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.MessageTransmission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission#getName()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EAttribute getMessageTransmission_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.Multicast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicast</em>'.
	 * @see es.unican.mast.xmlmast.model.Multicast
	 * @generated
	 */
	EClass getMulticast();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Multicast#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Multicast#getInputEvent()
	 * @see #getMulticast()
	 * @generated
	 */
	EAttribute getMulticast_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Multicast#getOutputEventsList <em>Output Events List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Events List</em>'.
	 * @see es.unican.mast.xmlmast.model.Multicast#getOutputEventsList()
	 * @see #getMulticast()
	 * @generated
	 */
	EAttribute getMulticast_OutputEventsList();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Preemptible FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy
	 * @generated
	 */
	EClass getNonPreemptibleFPPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy#getPreassigned()
	 * @see #getNonPreemptibleFPPolicy()
	 * @generated
	 */
	EAttribute getNonPreemptibleFPPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy#getThePriority()
	 * @see #getNonPreemptibleFPPolicy()
	 * @generated
	 */
	EAttribute getNonPreemptibleFPPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see es.unican.mast.xmlmast.model.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Offset#getDelayMaxInterval <em>Delay Max Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Max Interval</em>'.
	 * @see es.unican.mast.xmlmast.model.Offset#getDelayMaxInterval()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_DelayMaxInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Offset#getDelayMinInterval <em>Delay Min Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Min Interval</em>'.
	 * @see es.unican.mast.xmlmast.model.Offset#getDelayMinInterval()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_DelayMinInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Offset#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Offset#getInputEvent()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Offset#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Offset#getOutputEvent()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_OutputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.Offset#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.model.Offset#getReferencedEvent()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_ReferencedEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.OverriddenFixedPriority <em>Overridden Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overridden Fixed Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.OverriddenFixedPriority
	 * @generated
	 */
	EClass getOverriddenFixedPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.OverriddenFixedPriority#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.OverriddenFixedPriority#getThePriority()
	 * @see #getOverriddenFixedPriority()
	 * @generated
	 */
	EAttribute getOverriddenFixedPriority_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.OverriddenPermanentFP <em>Overridden Permanent FP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overridden Permanent FP</em>'.
	 * @see es.unican.mast.xmlmast.model.OverriddenPermanentFP
	 * @generated
	 */
	EClass getOverriddenPermanentFP();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.OverriddenPermanentFP#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.OverriddenPermanentFP#getThePriority()
	 * @see #getOverriddenPermanentFP()
	 * @generated
	 */
	EAttribute getOverriddenPermanentFP_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork <em>Packet Based Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Based Network</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork
	 * @generated
	 */
	EClass getPacketBasedNetwork();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getListOfDrivers <em>List Of Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Of Drivers</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getListOfDrivers()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EReference getPacketBasedNetwork_ListOfDrivers();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxBlocking <em>Max Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Blocking</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxBlocking()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_MaxBlocking();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxPacketSize <em>Max Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Packet Size</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxPacketSize()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_MaxPacketSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMinPacketSize <em>Min Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Packet Size</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getMinPacketSize()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_MinPacketSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getName()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getSpeedFactor()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_SpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getThroughput()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork#getTransmission()
	 * @see #getPacketBasedNetwork()
	 * @generated
	 */
	EAttribute getPacketBasedNetwork_Transmission();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.PacketDriver <em>Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Driver</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketDriver
	 * @generated
	 */
	EClass getPacketDriver();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketDriver#getMessagePartitioning <em>Message Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Partitioning</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketDriver#getMessagePartitioning()
	 * @see #getPacketDriver()
	 * @generated
	 */
	EAttribute getPacketDriver_MessagePartitioning();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Receive Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketDriver#getPacketReceiveOperation()
	 * @see #getPacketDriver()
	 * @generated
	 */
	EAttribute getPacketDriver_PacketReceiveOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Send Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketDriver#getPacketSendOperation()
	 * @see #getPacketDriver()
	 * @generated
	 */
	EAttribute getPacketDriver_PacketSendOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketServer <em>Packet Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Server</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketDriver#getPacketServer()
	 * @see #getPacketDriver()
	 * @generated
	 */
	EAttribute getPacketDriver_PacketServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RTA Overhead Model</em>'.
	 * @see es.unican.mast.xmlmast.model.PacketDriver#getRTAOverheadModel()
	 * @see #getPacketDriver()
	 * @generated
	 */
	EAttribute getPacketDriver_RTAOverheadModel();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent <em>Periodic External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.PeriodicExternalEvent
	 * @generated
	 */
	EClass getPeriodicExternalEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getMaxJitter <em>Max Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Jitter</em>'.
	 * @see es.unican.mast.xmlmast.model.PeriodicExternalEvent#getMaxJitter()
	 * @see #getPeriodicExternalEvent()
	 * @generated
	 */
	EAttribute getPeriodicExternalEvent_MaxJitter();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.PeriodicExternalEvent#getName()
	 * @see #getPeriodicExternalEvent()
	 * @generated
	 */
	EAttribute getPeriodicExternalEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPeriod()
	 * @see #getPeriodicExternalEvent()
	 * @generated
	 */
	EAttribute getPeriodicExternalEvent_Period();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see es.unican.mast.xmlmast.model.PeriodicExternalEvent#getPhase()
	 * @see #getPeriodicExternalEvent()
	 * @generated
	 */
	EAttribute getPeriodicExternalEvent_Phase();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.PollingPolicy <em>Polling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polling Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy
	 * @generated
	 */
	EClass getPollingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingAvgOverhead <em>Polling Avg Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Avg Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy#getPollingAvgOverhead()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingAvgOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingBestOverhead <em>Polling Best Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Best Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy#getPollingBestOverhead()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingBestOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingPeriod <em>Polling Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Period</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy#getPollingPeriod()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingPeriod();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPollingWorstOverhead <em>Polling Worst Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Worst Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy#getPollingWorstOverhead()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_PollingWorstOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PollingPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy#getPreassigned()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PollingPolicy#getThePriority <em>The Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy#getThePriority()
	 * @see #getPollingPolicy()
	 * @generated
	 */
	EAttribute getPollingPolicy_ThePriority();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.PrimaryScheduler <em>Primary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler
	 * @generated
	 */
	EClass getPrimaryScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getFixedPriorityScheduler <em>Fixed Priority Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Priority Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler#getFixedPriorityScheduler()
	 * @see #getPrimaryScheduler()
	 * @generated
	 */
	EReference getPrimaryScheduler_FixedPriorityScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getEDFScheduler <em>EDF Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDF Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler#getEDFScheduler()
	 * @see #getPrimaryScheduler()
	 * @generated
	 */
	EReference getPrimaryScheduler_EDFScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getFPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FP Packet Based Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler#getFPPacketBasedScheduler()
	 * @see #getPrimaryScheduler()
	 * @generated
	 */
	EReference getPrimaryScheduler_FPPacketBasedScheduler();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler#getHost()
	 * @see #getPrimaryScheduler()
	 * @generated
	 */
	EAttribute getPrimaryScheduler_Host();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PrimaryScheduler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler#getName()
	 * @see #getPrimaryScheduler()
	 * @generated
	 */
	EAttribute getPrimaryScheduler_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.PriorityInheritanceResource <em>Priority Inheritance Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Inheritance Resource</em>'.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceResource
	 * @generated
	 */
	EClass getPriorityInheritanceResource();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.PriorityInheritanceResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceResource#getName()
	 * @see #getPriorityInheritanceResource()
	 * @generated
	 */
	EAttribute getPriorityInheritanceResource_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.QueryServer <em>Query Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Server</em>'.
	 * @see es.unican.mast.xmlmast.model.QueryServer
	 * @generated
	 */
	EClass getQueryServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.QueryServer#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.QueryServer#getInputEvent()
	 * @see #getQueryServer()
	 * @generated
	 */
	EAttribute getQueryServer_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.QueryServer#getOutputEventsList <em>Output Events List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Events List</em>'.
	 * @see es.unican.mast.xmlmast.model.QueryServer#getOutputEventsList()
	 * @see #getQueryServer()
	 * @generated
	 */
	EAttribute getQueryServer_OutputEventsList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.QueryServer#getRequestPolicy <em>Request Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.QueryServer#getRequestPolicy()
	 * @see #getQueryServer()
	 * @generated
	 */
	EAttribute getQueryServer_RequestPolicy();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.RateDivisor <em>Rate Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Divisor</em>'.
	 * @see es.unican.mast.xmlmast.model.RateDivisor
	 * @generated
	 */
	EClass getRateDivisor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RateDivisor#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RateDivisor#getInputEvent()
	 * @see #getRateDivisor()
	 * @generated
	 */
	EAttribute getRateDivisor_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RateDivisor#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RateDivisor#getOutputEvent()
	 * @see #getRateDivisor()
	 * @generated
	 */
	EAttribute getRateDivisor_OutputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RateDivisor#getRateFactor <em>Rate Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Factor</em>'.
	 * @see es.unican.mast.xmlmast.model.RateDivisor#getRateFactor()
	 * @see #getRateDivisor()
	 * @generated
	 */
	EAttribute getRateDivisor_RateFactor();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.RegularEvent <em>Regular Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent
	 * @generated
	 */
	EClass getRegularEvent();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.model.RegularEvent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getGroup()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EAttribute getRegularEvent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getMaxOutputJitterReq <em>Max Output Jitter Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Output Jitter Req</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getMaxOutputJitterReq()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_MaxOutputJitterReq();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getHardGlobalDeadline <em>Hard Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hard Global Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getHardGlobalDeadline()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_HardGlobalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getSoftGlobalDeadline <em>Soft Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Global Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getSoftGlobalDeadline()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_SoftGlobalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getGlobalMaxMissRatio <em>Global Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Max Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getGlobalMaxMissRatio()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_GlobalMaxMissRatio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getHardLocalDeadline <em>Hard Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hard Local Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getHardLocalDeadline()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_HardLocalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getSoftLocalDeadline <em>Soft Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soft Local Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getSoftLocalDeadline()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_SoftLocalDeadline();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getLocalMaxMissRatio <em>Local Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Max Miss Ratio</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getLocalMaxMissRatio()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_LocalMaxMissRatio();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularEvent#getCompositeTimingRequirement <em>Composite Timing Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Timing Requirement</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getCompositeTimingRequirement()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EReference getRegularEvent_CompositeTimingRequirement();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularEvent#getEvent()
	 * @see #getRegularEvent()
	 * @generated
	 */
	EAttribute getRegularEvent_Event();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.RegularProcessor <em>Regular Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Processor</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor
	 * @generated
	 */
	EClass getRegularProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularProcessor#getTickerSystemTimer <em>Ticker System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ticker System Timer</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getTickerSystemTimer()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EReference getRegularProcessor_TickerSystemTimer();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularProcessor#getAlarmClockSystemTimer <em>Alarm Clock System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alarm Clock System Timer</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getAlarmClockSystemTimer()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EReference getRegularProcessor_AlarmClockSystemTimer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getAvgISRSwitch <em>Avg ISR Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg ISR Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getAvgISRSwitch()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_AvgISRSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getBestISRSwitch <em>Best ISR Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best ISR Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getBestISRSwitch()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_BestISRSwitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getMaxInterruptPriority <em>Max Interrupt Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interrupt Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getMaxInterruptPriority()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_MaxInterruptPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getMinInterruptPriority <em>Min Interrupt Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interrupt Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getMinInterruptPriority()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_MinInterruptPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getName()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getSpeedFactor()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_SpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularProcessor#getWorstISRSwitch <em>Worst ISR Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst ISR Switch</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor#getWorstISRSwitch()
	 * @see #getRegularProcessor()
	 * @generated
	 */
	EAttribute getRegularProcessor_WorstISRSwitch();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer <em>Regular Scheduling Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Scheduling Server</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer
	 * @generated
	 */
	EClass getRegularSchedulingServer();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getNonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Preemptible FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getNonPreemptibleFPPolicy()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_NonPreemptibleFPPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getFixedPriorityPolicy <em>Fixed Priority Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Priority Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getFixedPriorityPolicy()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_FixedPriorityPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getInterruptFPPolicy <em>Interrupt FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interrupt FP Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getInterruptFPPolicy()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_InterruptFPPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getPollingPolicy <em>Polling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polling Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getPollingPolicy()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_PollingPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getSporadicServerPolicy <em>Sporadic Server Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sporadic Server Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getSporadicServerPolicy()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_SporadicServerPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getEDFPolicy <em>EDF Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDF Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getEDFPolicy()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_EDFPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getSRPParameters <em>SRP Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SRP Parameters</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getSRPParameters()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EReference getRegularSchedulingServer_SRPParameters();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getName()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EAttribute getRegularSchedulingServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer#getScheduler()
	 * @see #getRegularSchedulingServer()
	 * @generated
	 */
	EAttribute getRegularSchedulingServer_Scheduler();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.RegularTransaction <em>Regular Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Transaction</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction
	 * @generated
	 */
	EClass getRegularTransaction();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getGroup()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EAttribute getRegularTransaction_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getPeriodicExternalEvent <em>Periodic External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getPeriodicExternalEvent()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_PeriodicExternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getSporadicExternalEvent <em>Sporadic External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sporadic External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getSporadicExternalEvent()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_SporadicExternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getUnboundedExternalEvent <em>Unbounded External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unbounded External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getUnboundedExternalEvent()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_UnboundedExternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getBurstyExternalEvent <em>Bursty External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bursty External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getBurstyExternalEvent()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_BurstyExternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getSingularExternalEvent <em>Singular External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Singular External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getSingularExternalEvent()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_SingularExternalEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getRegularEvent <em>Regular Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regular Event</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getRegularEvent()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_RegularEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getActivity()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getSystemTimedActivity <em>System Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Timed Activity</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getSystemTimedActivity()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_SystemTimedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getConcentrator <em>Concentrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concentrator</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getConcentrator()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_Concentrator();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getBarrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Barrier</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getBarrier()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_Barrier();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getDeliveryServer <em>Delivery Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Server</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getDeliveryServer()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_DeliveryServer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getQueryServer <em>Query Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Server</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getQueryServer()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_QueryServer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getMulticast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multicast</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getMulticast()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_Multicast();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getRateDivisor <em>Rate Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rate Divisor</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getRateDivisor()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_RateDivisor();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delay</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getDelay()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_Delay();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.mast.xmlmast.model.RegularTransaction#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offset</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getOffset()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EReference getRegularTransaction_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RegularTransaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction#getName()
	 * @see #getRegularTransaction()
	 * @generated
	 */
	EAttribute getRegularTransaction_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver <em>RTEP Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTEP Packet Driver</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver
	 * @generated
	 */
	EClass getRTEPPacketDriver();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getFailureTimeout <em>Failure Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Timeout</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getFailureTimeout()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_FailureTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getMessagePartitioning <em>Message Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Partitioning</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getMessagePartitioning()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_MessagePartitioning();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getNumberOfStations <em>Number Of Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Stations</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getNumberOfStations()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_NumberOfStations();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketDiscardOperation <em>Packet Discard Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Discard Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketDiscardOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketDiscardOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketInterruptServer <em>Packet Interrupt Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Interrupt Server</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketInterruptServer()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketInterruptServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketISROperation <em>Packet ISR Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet ISR Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketISROperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketISROperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Receive Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketReceiveOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketReceiveOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketRetransmissionOperation <em>Packet Retransmission Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Retransmission Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketRetransmissionOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketRetransmissionOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Send Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketSendOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketSendOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketServer <em>Packet Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Server</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketServer()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketTransmissionRetries <em>Packet Transmission Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Transmission Retries</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketTransmissionRetries()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_PacketTransmissionRetries();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RTA Overhead Model</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getRTAOverheadModel()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_RTAOverheadModel();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenCheckOperation <em>Token Check Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Check Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenCheckOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_TokenCheckOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenDelay <em>Token Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Delay</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenDelay()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_TokenDelay();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenManageOperation <em>Token Manage Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Manage Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenManageOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_TokenManageOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenRetransmissionOperation <em>Token Retransmission Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Retransmission Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenRetransmissionOperation()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_TokenRetransmissionOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenTransmissionRetries <em>Token Transmission Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Transmission Retries</em>'.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenTransmissionRetries()
	 * @see #getRTEPPacketDriver()
	 * @generated
	 */
	EAttribute getRTEPPacketDriver_TokenTransmissionRetries();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SecondaryScheduler <em>Secondary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler
	 * @generated
	 */
	EClass getSecondaryScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.SecondaryScheduler#getFixedPriorityScheduler <em>Fixed Priority Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Priority Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler#getFixedPriorityScheduler()
	 * @see #getSecondaryScheduler()
	 * @generated
	 */
	EReference getSecondaryScheduler_FixedPriorityScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.SecondaryScheduler#getEDFScheduler <em>EDF Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDF Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler#getEDFScheduler()
	 * @see #getSecondaryScheduler()
	 * @generated
	 */
	EReference getSecondaryScheduler_EDFScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.SecondaryScheduler#getFPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FP Packet Based Scheduler</em>'.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler#getFPPacketBasedScheduler()
	 * @see #getSecondaryScheduler()
	 * @generated
	 */
	EReference getSecondaryScheduler_FPPacketBasedScheduler();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SecondaryScheduler#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler#getHost()
	 * @see #getSecondaryScheduler()
	 * @generated
	 */
	EAttribute getSecondaryScheduler_Host();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SecondaryScheduler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler#getName()
	 * @see #getSecondaryScheduler()
	 * @generated
	 */
	EAttribute getSecondaryScheduler_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation
	 * @generated
	 */
	EClass getSimpleOperation();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Fixed Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenFixedPriority()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EReference getSimpleOperation_OverriddenFixedPriority();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overridden Permanent FP</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getOverriddenPermanentFP()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EReference getSimpleOperation_OverriddenPermanentFP();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesList <em>Shared Resources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Resources List</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesList()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_SharedResourcesList();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToLock <em>Shared Resources To Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Resources To Lock</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToLock()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_SharedResourcesToLock();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToUnlock <em>Shared Resources To Unlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Resources To Unlock</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getSharedResourcesToUnlock()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_SharedResourcesToUnlock();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Case Execution Time</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getAverageCaseExecutionTime()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_AverageCaseExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getBestCaseExecutionTime <em>Best Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Case Execution Time</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getBestCaseExecutionTime()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_BestCaseExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getName()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SimpleOperation#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Case Execution Time</em>'.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation#getWorstCaseExecutionTime()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EAttribute getSimpleOperation_WorstCaseExecutionTime();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SingularExternalEvent <em>Singular External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singular External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.SingularExternalEvent
	 * @generated
	 */
	EClass getSingularExternalEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SingularExternalEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.SingularExternalEvent#getName()
	 * @see #getSingularExternalEvent()
	 * @generated
	 */
	EAttribute getSingularExternalEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SingularExternalEvent#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see es.unican.mast.xmlmast.model.SingularExternalEvent#getPhase()
	 * @see #getSingularExternalEvent()
	 * @generated
	 */
	EAttribute getSingularExternalEvent_Phase();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SoftGlobalDeadline <em>Soft Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Global Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.SoftGlobalDeadline
	 * @generated
	 */
	EClass getSoftGlobalDeadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SoftGlobalDeadline#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.SoftGlobalDeadline#getDeadline()
	 * @see #getSoftGlobalDeadline()
	 * @generated
	 */
	EAttribute getSoftGlobalDeadline_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SoftGlobalDeadline#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Event</em>'.
	 * @see es.unican.mast.xmlmast.model.SoftGlobalDeadline#getReferencedEvent()
	 * @see #getSoftGlobalDeadline()
	 * @generated
	 */
	EAttribute getSoftGlobalDeadline_ReferencedEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SoftLocalDeadline <em>Soft Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Local Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.SoftLocalDeadline
	 * @generated
	 */
	EClass getSoftLocalDeadline();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SoftLocalDeadline#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see es.unican.mast.xmlmast.model.SoftLocalDeadline#getDeadline()
	 * @see #getSoftLocalDeadline()
	 * @generated
	 */
	EAttribute getSoftLocalDeadline_Deadline();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SporadicExternalEvent <em>Sporadic External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicExternalEvent
	 * @generated
	 */
	EClass getSporadicExternalEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Interarrival</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicExternalEvent#getAvgInterarrival()
	 * @see #getSporadicExternalEvent()
	 * @generated
	 */
	EAttribute getSporadicExternalEvent_AvgInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicExternalEvent#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicExternalEvent#getDistribution()
	 * @see #getSporadicExternalEvent()
	 * @generated
	 */
	EAttribute getSporadicExternalEvent_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicExternalEvent#getMinInterarrival <em>Min Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interarrival</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicExternalEvent#getMinInterarrival()
	 * @see #getSporadicExternalEvent()
	 * @generated
	 */
	EAttribute getSporadicExternalEvent_MinInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicExternalEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicExternalEvent#getName()
	 * @see #getSporadicExternalEvent()
	 * @generated
	 */
	EAttribute getSporadicExternalEvent_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy <em>Sporadic Server Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Server Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy
	 * @generated
	 */
	EClass getSporadicServerPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getBackgroundPriority <em>Background Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy#getBackgroundPriority()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_BackgroundPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getInitialCapacity <em>Initial Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Capacity</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy#getInitialCapacity()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_InitialCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getMaxPendingReplenishments <em>Max Pending Replenishments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Pending Replenishments</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy#getMaxPendingReplenishments()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_MaxPendingReplenishments();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getNormalPriority <em>Normal Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Priority</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy#getNormalPriority()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_NormalPriority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy#getPreassigned()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy#getReplenishmentPeriod <em>Replenishment Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replenishment Period</em>'.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy#getReplenishmentPeriod()
	 * @see #getSporadicServerPolicy()
	 * @generated
	 */
	EAttribute getSporadicServerPolicy_ReplenishmentPeriod();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SRPParameters <em>SRP Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRP Parameters</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPParameters
	 * @generated
	 */
	EClass getSRPParameters();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SRPParameters#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPParameters#getPreassigned()
	 * @see #getSRPParameters()
	 * @generated
	 */
	EAttribute getSRPParameters_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SRPParameters#getPreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Level</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPParameters#getPreemptionLevel()
	 * @see #getSRPParameters()
	 * @generated
	 */
	EAttribute getSRPParameters_PreemptionLevel();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SRPResource <em>SRP Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRP Resource</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPResource
	 * @generated
	 */
	EClass getSRPResource();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SRPResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPResource#getName()
	 * @see #getSRPResource()
	 * @generated
	 */
	EAttribute getSRPResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SRPResource#getPreassigned <em>Preassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preassigned</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPResource#getPreassigned()
	 * @see #getSRPResource()
	 * @generated
	 */
	EAttribute getSRPResource_Preassigned();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SRPResource#getPreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption Level</em>'.
	 * @see es.unican.mast.xmlmast.model.SRPResource#getPreemptionLevel()
	 * @see #getSRPResource()
	 * @generated
	 */
	EAttribute getSRPResource_PreemptionLevel();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.SystemTimedActivity <em>System Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Timed Activity</em>'.
	 * @see es.unican.mast.xmlmast.model.SystemTimedActivity
	 * @generated
	 */
	EClass getSystemTimedActivity();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityOperation <em>Activity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Operation</em>'.
	 * @see es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityOperation()
	 * @see #getSystemTimedActivity()
	 * @generated
	 */
	EAttribute getSystemTimedActivity_ActivityOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityServer <em>Activity Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Server</em>'.
	 * @see es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityServer()
	 * @see #getSystemTimedActivity()
	 * @generated
	 */
	EAttribute getSystemTimedActivity_ActivityServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Event</em>'.
	 * @see es.unican.mast.xmlmast.model.SystemTimedActivity#getInputEvent()
	 * @see #getSystemTimedActivity()
	 * @generated
	 */
	EAttribute getSystemTimedActivity_InputEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Event</em>'.
	 * @see es.unican.mast.xmlmast.model.SystemTimedActivity#getOutputEvent()
	 * @see #getSystemTimedActivity()
	 * @generated
	 */
	EAttribute getSystemTimedActivity_OutputEvent();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.TickerSystemTimer <em>Ticker System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ticker System Timer</em>'.
	 * @see es.unican.mast.xmlmast.model.TickerSystemTimer
	 * @generated
	 */
	EClass getTickerSystemTimer();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.TickerSystemTimer#getAvgOverhead <em>Avg Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.TickerSystemTimer#getAvgOverhead()
	 * @see #getTickerSystemTimer()
	 * @generated
	 */
	EAttribute getTickerSystemTimer_AvgOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.TickerSystemTimer#getBestOverhead <em>Best Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.TickerSystemTimer#getBestOverhead()
	 * @see #getTickerSystemTimer()
	 * @generated
	 */
	EAttribute getTickerSystemTimer_BestOverhead();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.TickerSystemTimer#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see es.unican.mast.xmlmast.model.TickerSystemTimer#getPeriod()
	 * @see #getTickerSystemTimer()
	 * @generated
	 */
	EAttribute getTickerSystemTimer_Period();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.TickerSystemTimer#getWorstOverhead <em>Worst Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst Overhead</em>'.
	 * @see es.unican.mast.xmlmast.model.TickerSystemTimer#getWorstOverhead()
	 * @see #getTickerSystemTimer()
	 * @generated
	 */
	EAttribute getTickerSystemTimer_WorstOverhead();

	/**
	 * Returns the meta object for class '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent <em>Unbounded External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unbounded External Event</em>'.
	 * @see es.unican.mast.xmlmast.model.UnboundedExternalEvent
	 * @generated
	 */
	EClass getUnboundedExternalEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Interarrival</em>'.
	 * @see es.unican.mast.xmlmast.model.UnboundedExternalEvent#getAvgInterarrival()
	 * @see #getUnboundedExternalEvent()
	 * @generated
	 */
	EAttribute getUnboundedExternalEvent_AvgInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see es.unican.mast.xmlmast.model.UnboundedExternalEvent#getDistribution()
	 * @see #getUnboundedExternalEvent()
	 * @generated
	 */
	EAttribute getUnboundedExternalEvent_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.mast.xmlmast.model.UnboundedExternalEvent#getName()
	 * @see #getUnboundedExternalEvent()
	 * @generated
	 */
	EAttribute getUnboundedExternalEvent_Name();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.AffirmativeAssertion <em>Affirmative Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Affirmative Assertion</em>'.
	 * @see es.unican.mast.xmlmast.model.AffirmativeAssertion
	 * @generated
	 */
	EEnum getAffirmativeAssertion();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion</em>'.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @generated
	 */
	EEnum getAssertion();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.DeliveryPolicy <em>Delivery Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delivery Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
	 * @generated
	 */
	EEnum getDeliveryPolicy();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.DistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distribution Type</em>'.
	 * @see es.unican.mast.xmlmast.model.DistributionType
	 * @generated
	 */
	EEnum getDistributionType();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.NegativeAssertion <em>Negative Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Negative Assertion</em>'.
	 * @see es.unican.mast.xmlmast.model.NegativeAssertion
	 * @generated
	 */
	EEnum getNegativeAssertion();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.OverheadType <em>Overhead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overhead Type</em>'.
	 * @see es.unican.mast.xmlmast.model.OverheadType
	 * @generated
	 */
	EEnum getOverheadType();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.PriorityInheritanceProtocol <em>Priority Inheritance Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Inheritance Protocol</em>'.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
	 * @generated
	 */
	EEnum getPriorityInheritanceProtocol();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.RequestPolicy <em>Request Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Policy</em>'.
	 * @see es.unican.mast.xmlmast.model.RequestPolicy
	 * @generated
	 */
	EEnum getRequestPolicy();

	/**
	 * Returns the meta object for enum '{@link es.unican.mast.xmlmast.model.TransmissionType <em>Transmission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transmission Type</em>'.
	 * @see es.unican.mast.xmlmast.model.TransmissionType
	 * @generated
	 */
	EEnum getTransmissionType();

	/**
	 * Returns the meta object for data type '<em>Absolute Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Time</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Absolute_Time' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getAbsoluteTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Absolute Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Time Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Absolute_Time:Object' baseType='Absolute_Time'"
	 * @generated
	 */
	EDataType getAbsoluteTimeObject();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.AffirmativeAssertion <em>Affirmative Assertion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Affirmative Assertion Object</em>'.
	 * @see es.unican.mast.xmlmast.model.AffirmativeAssertion
	 * @model instanceClass="es.unican.mast.xmlmast.model.AffirmativeAssertion"
	 *        extendedMetaData="name='Affirmative_Assertion:Object' baseType='Affirmative_Assertion'"
	 * @generated
	 */
	EDataType getAffirmativeAssertionObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Any Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Any Priority</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Any_Priority' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getAnyPriority();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.Assertion <em>Assertion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Assertion Object</em>'.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @model instanceClass="es.unican.mast.xmlmast.model.Assertion"
	 *        extendedMetaData="name='Assertion:Object' baseType='Assertion'"
	 * @generated
	 */
	EDataType getAssertionObject();

	/**
	 * Returns the meta object for data type '<em>Bit Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bit Count</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Bit_Count' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getBitCount();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Bit Count Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bit Count Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Bit_Count:Object' baseType='Bit_Count'"
	 * @generated
	 */
	EDataType getBitCountObject();

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
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.DeliveryPolicy <em>Delivery Policy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Delivery Policy Object</em>'.
	 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
	 * @model instanceClass="es.unican.mast.xmlmast.model.DeliveryPolicy"
	 *        extendedMetaData="name='Delivery_Policy:Object' baseType='Delivery_Policy'"
	 * @generated
	 */
	EDataType getDeliveryPolicyObject();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.DistributionType <em>Distribution Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Distribution Type Object</em>'.
	 * @see es.unican.mast.xmlmast.model.DistributionType
	 * @model instanceClass="es.unican.mast.xmlmast.model.DistributionType"
	 *        extendedMetaData="name='Distribution_Type:Object' baseType='Distribution_Type'"
	 * @generated
	 */
	EDataType getDistributionTypeObject();

	/**
	 * Returns the meta object for data type '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Float' baseType='http://www.eclipse.org/emf/2003/XMLType#float'"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Float:Object' baseType='Float'"
	 * @generated
	 */
	EDataType getFloatObject();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier Ref</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Identifier_Ref' baseType='Identifier'"
	 * @generated
	 */
	EDataType getIdentifierRef();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Identifier Ref List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier Ref List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Identifier_Ref_List' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKENS'"
	 * @generated
	 */
	EDataType getIdentifierRefList();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Interrupt Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interrupt Priority</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Interrupt_Priority' baseType='Any_Priority'"
	 * @generated
	 */
	EDataType getInterruptPriority();

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
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.NegativeAssertion <em>Negative Assertion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Negative Assertion Object</em>'.
	 * @see es.unican.mast.xmlmast.model.NegativeAssertion
	 * @model instanceClass="es.unican.mast.xmlmast.model.NegativeAssertion"
	 *        extendedMetaData="name='Negative_Assertion:Object' baseType='Negative_Assertion'"
	 * @generated
	 */
	EDataType getNegativeAssertionObject();

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
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.OverheadType <em>Overhead Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Overhead Type Object</em>'.
	 * @see es.unican.mast.xmlmast.model.OverheadType
	 * @model instanceClass="es.unican.mast.xmlmast.model.OverheadType"
	 *        extendedMetaData="name='Overhead_Type:Object' baseType='Overhead_Type'"
	 * @generated
	 */
	EDataType getOverheadTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Pathname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pathname</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Pathname' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPathname();

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
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Preemption Level</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Preemption_Level' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getPreemptionLevel();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Priority' baseType='Any_Priority'"
	 * @generated
	 */
	EDataType getPriority();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.PriorityInheritanceProtocol <em>Priority Inheritance Protocol Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Inheritance Protocol Object</em>'.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
	 * @model instanceClass="es.unican.mast.xmlmast.model.PriorityInheritanceProtocol"
	 *        extendedMetaData="name='Priority_Inheritance_Protocol:Object' baseType='Priority_Inheritance_Protocol'"
	 * @generated
	 */
	EDataType getPriorityInheritanceProtocolObject();

	/**
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.RequestPolicy <em>Request Policy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Request Policy Object</em>'.
	 * @see es.unican.mast.xmlmast.model.RequestPolicy
	 * @model instanceClass="es.unican.mast.xmlmast.model.RequestPolicy"
	 *        extendedMetaData="name='Request_Policy:Object' baseType='Request_Policy'"
	 * @generated
	 */
	EDataType getRequestPolicyObject();

	/**
	 * Returns the meta object for data type '<em>Throughput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throughput</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='Throughput' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getThroughput();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Throughput Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throughput Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Throughput:Object' baseType='Throughput'"
	 * @generated
	 */
	EDataType getThroughputObject();

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
	 * Returns the meta object for data type '{@link es.unican.mast.xmlmast.model.TransmissionType <em>Transmission Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transmission Type Object</em>'.
	 * @see es.unican.mast.xmlmast.model.TransmissionType
	 * @model instanceClass="es.unican.mast.xmlmast.model.TransmissionType"
	 *        extendedMetaData="name='Transmission_Type:Object' baseType='Transmission_Type'"
	 * @generated
	 */
	EDataType getTransmissionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ActivityImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Activity Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_OPERATION = eINSTANCE.getActivity_ActivityOperation();

		/**
		 * The meta object literal for the '<em><b>Activity Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_SERVER = eINSTANCE.getActivity_ActivityServer();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__INPUT_EVENT = eINSTANCE.getActivity_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__OUTPUT_EVENT = eINSTANCE.getActivity_OutputEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.AlarmClockSystemTimerImpl <em>Alarm Clock System Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.AlarmClockSystemTimerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAlarmClockSystemTimer()
		 * @generated
		 */
		EClass ALARM_CLOCK_SYSTEM_TIMER = eINSTANCE.getAlarmClockSystemTimer();

		/**
		 * The meta object literal for the '<em><b>Avg Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD = eINSTANCE.getAlarmClockSystemTimer_AvgOverhead();

		/**
		 * The meta object literal for the '<em><b>Best Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD = eINSTANCE.getAlarmClockSystemTimer_BestOverhead();

		/**
		 * The meta object literal for the '<em><b>Worst Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD = eINSTANCE.getAlarmClockSystemTimer_WorstOverhead();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.BarrierImpl <em>Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.BarrierImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBarrier()
		 * @generated
		 */
		EClass BARRIER = eINSTANCE.getBarrier();

		/**
		 * The meta object literal for the '<em><b>Input Events List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARRIER__INPUT_EVENTS_LIST = eINSTANCE.getBarrier_InputEventsList();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARRIER__OUTPUT_EVENT = eINSTANCE.getBarrier_OutputEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.BurstyExternalEventImpl <em>Bursty External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.BurstyExternalEventImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBurstyExternalEvent()
		 * @generated
		 */
		EClass BURSTY_EXTERNAL_EVENT = eINSTANCE.getBurstyExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Avg Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURSTY_EXTERNAL_EVENT__AVG_INTERARRIVAL = eINSTANCE.getBurstyExternalEvent_AvgInterarrival();

		/**
		 * The meta object literal for the '<em><b>Bound Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURSTY_EXTERNAL_EVENT__BOUND_INTERVAL = eINSTANCE.getBurstyExternalEvent_BoundInterval();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURSTY_EXTERNAL_EVENT__DISTRIBUTION = eINSTANCE.getBurstyExternalEvent_Distribution();

		/**
		 * The meta object literal for the '<em><b>Max Arrivals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURSTY_EXTERNAL_EVENT__MAX_ARRIVALS = eINSTANCE.getBurstyExternalEvent_MaxArrivals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURSTY_EXTERNAL_EVENT__NAME = eINSTANCE.getBurstyExternalEvent_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.CharacterPacketDriverImpl <em>Character Packet Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.CharacterPacketDriverImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getCharacterPacketDriver()
		 * @generated
		 */
		EClass CHARACTER_PACKET_DRIVER = eINSTANCE.getCharacterPacketDriver();

		/**
		 * The meta object literal for the '<em><b>Character Receive Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__CHARACTER_RECEIVE_OPERATION = eINSTANCE.getCharacterPacketDriver_CharacterReceiveOperation();

		/**
		 * The meta object literal for the '<em><b>Character Send Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__CHARACTER_SEND_OPERATION = eINSTANCE.getCharacterPacketDriver_CharacterSendOperation();

		/**
		 * The meta object literal for the '<em><b>Character Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__CHARACTER_SERVER = eINSTANCE.getCharacterPacketDriver_CharacterServer();

		/**
		 * The meta object literal for the '<em><b>Character Transmission Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__CHARACTER_TRANSMISSION_TIME = eINSTANCE.getCharacterPacketDriver_CharacterTransmissionTime();

		/**
		 * The meta object literal for the '<em><b>Message Partitioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__MESSAGE_PARTITIONING = eINSTANCE.getCharacterPacketDriver_MessagePartitioning();

		/**
		 * The meta object literal for the '<em><b>Packet Receive Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__PACKET_RECEIVE_OPERATION = eINSTANCE.getCharacterPacketDriver_PacketReceiveOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Send Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__PACKET_SEND_OPERATION = eINSTANCE.getCharacterPacketDriver_PacketSendOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__PACKET_SERVER = eINSTANCE.getCharacterPacketDriver_PacketServer();

		/**
		 * The meta object literal for the '<em><b>RTA Overhead Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_PACKET_DRIVER__RTA_OVERHEAD_MODEL = eINSTANCE.getCharacterPacketDriver_RTAOverheadModel();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.CompositeOperationImpl <em>Composite Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.CompositeOperationImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getCompositeOperation()
		 * @generated
		 */
		EClass COMPOSITE_OPERATION = eINSTANCE.getCompositeOperation();

		/**
		 * The meta object literal for the '<em><b>Overridden Fixed Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY = eINSTANCE.getCompositeOperation_OverriddenFixedPriority();

		/**
		 * The meta object literal for the '<em><b>Overridden Permanent FP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP = eINSTANCE.getCompositeOperation_OverriddenPermanentFP();

		/**
		 * The meta object literal for the '<em><b>Operation List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_OPERATION__OPERATION_LIST = eINSTANCE.getCompositeOperation_OperationList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_OPERATION__NAME = eINSTANCE.getCompositeOperation_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl <em>Composite Timing Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.CompositeTimingRequirementImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getCompositeTimingRequirement()
		 * @generated
		 */
		EClass COMPOSITE_TIMING_REQUIREMENT = eINSTANCE.getCompositeTimingRequirement();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TIMING_REQUIREMENT__GROUP = eINSTANCE.getCompositeTimingRequirement_Group();

		/**
		 * The meta object literal for the '<em><b>Max Output Jitter Req</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__MAX_OUTPUT_JITTER_REQ = eINSTANCE.getCompositeTimingRequirement_MaxOutputJitterReq();

		/**
		 * The meta object literal for the '<em><b>Hard Global Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__HARD_GLOBAL_DEADLINE = eINSTANCE.getCompositeTimingRequirement_HardGlobalDeadline();

		/**
		 * The meta object literal for the '<em><b>Soft Global Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__SOFT_GLOBAL_DEADLINE = eINSTANCE.getCompositeTimingRequirement_SoftGlobalDeadline();

		/**
		 * The meta object literal for the '<em><b>Global Max Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__GLOBAL_MAX_MISS_RATIO = eINSTANCE.getCompositeTimingRequirement_GlobalMaxMissRatio();

		/**
		 * The meta object literal for the '<em><b>Hard Local Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__HARD_LOCAL_DEADLINE = eINSTANCE.getCompositeTimingRequirement_HardLocalDeadline();

		/**
		 * The meta object literal for the '<em><b>Soft Local Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__SOFT_LOCAL_DEADLINE = eINSTANCE.getCompositeTimingRequirement_SoftLocalDeadline();

		/**
		 * The meta object literal for the '<em><b>Local Max Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TIMING_REQUIREMENT__LOCAL_MAX_MISS_RATIO = eINSTANCE.getCompositeTimingRequirement_LocalMaxMissRatio();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.ConcentratorImpl <em>Concentrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ConcentratorImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getConcentrator()
		 * @generated
		 */
		EClass CONCENTRATOR = eINSTANCE.getConcentrator();

		/**
		 * The meta object literal for the '<em><b>Input Events List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCENTRATOR__INPUT_EVENTS_LIST = eINSTANCE.getConcentrator_InputEventsList();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCENTRATOR__OUTPUT_EVENT = eINSTANCE.getConcentrator_OutputEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.DelayImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Delay Max Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__DELAY_MAX_INTERVAL = eINSTANCE.getDelay_DelayMaxInterval();

		/**
		 * The meta object literal for the '<em><b>Delay Min Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__DELAY_MIN_INTERVAL = eINSTANCE.getDelay_DelayMinInterval();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__INPUT_EVENT = eINSTANCE.getDelay_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__OUTPUT_EVENT = eINSTANCE.getDelay_OutputEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.DeliveryServerImpl <em>Delivery Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.DeliveryServerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDeliveryServer()
		 * @generated
		 */
		EClass DELIVERY_SERVER = eINSTANCE.getDeliveryServer();

		/**
		 * The meta object literal for the '<em><b>Delivery Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_SERVER__DELIVERY_POLICY = eINSTANCE.getDeliveryServer_DeliveryPolicy();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_SERVER__INPUT_EVENT = eINSTANCE.getDeliveryServer_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Events List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_SERVER__OUTPUT_EVENTS_LIST = eINSTANCE.getDeliveryServer_OutputEventsList();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.DocumentRootImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>MASTMODEL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MASTMODEL = eINSTANCE.getDocumentRoot_MASTMODEL();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.EDFPolicyImpl <em>EDF Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.EDFPolicyImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getEDFPolicy()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.EDFSchedulerImpl <em>EDF Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.EDFSchedulerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getEDFScheduler()
		 * @generated
		 */
		EClass EDF_SCHEDULER = eINSTANCE.getEDFScheduler();

		/**
		 * The meta object literal for the '<em><b>Avg Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDF_SCHEDULER__AVG_CONTEXT_SWITCH = eINSTANCE.getEDFScheduler_AvgContextSwitch();

		/**
		 * The meta object literal for the '<em><b>Best Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDF_SCHEDULER__BEST_CONTEXT_SWITCH = eINSTANCE.getEDFScheduler_BestContextSwitch();

		/**
		 * The meta object literal for the '<em><b>Worst Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDF_SCHEDULER__WORST_CONTEXT_SWITCH = eINSTANCE.getEDFScheduler_WorstContextSwitch();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.EnclosingOperationImpl <em>Enclosing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.EnclosingOperationImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getEnclosingOperation()
		 * @generated
		 */
		EClass ENCLOSING_OPERATION = eINSTANCE.getEnclosingOperation();

		/**
		 * The meta object literal for the '<em><b>Overridden Fixed Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_OPERATION__OVERRIDDEN_FIXED_PRIORITY = eINSTANCE.getEnclosingOperation_OverriddenFixedPriority();

		/**
		 * The meta object literal for the '<em><b>Overridden Permanent FP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_OPERATION__OVERRIDDEN_PERMANENT_FP = eINSTANCE.getEnclosingOperation_OverriddenPermanentFP();

		/**
		 * The meta object literal for the '<em><b>Operation List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCLOSING_OPERATION__OPERATION_LIST = eINSTANCE.getEnclosingOperation_OperationList();

		/**
		 * The meta object literal for the '<em><b>Average Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCLOSING_OPERATION__AVERAGE_CASE_EXECUTION_TIME = eINSTANCE.getEnclosingOperation_AverageCaseExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Best Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCLOSING_OPERATION__BEST_CASE_EXECUTION_TIME = eINSTANCE.getEnclosingOperation_BestCaseExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCLOSING_OPERATION__NAME = eINSTANCE.getEnclosingOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Worst Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCLOSING_OPERATION__WORST_CASE_EXECUTION_TIME = eINSTANCE.getEnclosingOperation_WorstCaseExecutionTime();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.FixedPriorityPolicyImpl <em>Fixed Priority Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.FixedPriorityPolicyImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFixedPriorityPolicy()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl <em>Fixed Priority Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFixedPriorityScheduler()
		 * @generated
		 */
		EClass FIXED_PRIORITY_SCHEDULER = eINSTANCE.getFixedPriorityScheduler();

		/**
		 * The meta object literal for the '<em><b>Avg Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH = eINSTANCE.getFixedPriorityScheduler_AvgContextSwitch();

		/**
		 * The meta object literal for the '<em><b>Best Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH = eINSTANCE.getFixedPriorityScheduler_BestContextSwitch();

		/**
		 * The meta object literal for the '<em><b>Max Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY = eINSTANCE.getFixedPriorityScheduler_MaxPriority();

		/**
		 * The meta object literal for the '<em><b>Min Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY = eINSTANCE.getFixedPriorityScheduler_MinPriority();

		/**
		 * The meta object literal for the '<em><b>Worst Context Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH = eINSTANCE.getFixedPriorityScheduler_WorstContextSwitch();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl <em>FP Packet Based Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFPPacketBasedScheduler()
		 * @generated
		 */
		EClass FP_PACKET_BASED_SCHEDULER = eINSTANCE.getFPPacketBasedScheduler();

		/**
		 * The meta object literal for the '<em><b>Max Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY = eINSTANCE.getFPPacketBasedScheduler_MaxPriority();

		/**
		 * The meta object literal for the '<em><b>Min Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY = eINSTANCE.getFPPacketBasedScheduler_MinPriority();

		/**
		 * The meta object literal for the '<em><b>Packet Overhead Avg Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE = eINSTANCE.getFPPacketBasedScheduler_PacketOverheadAvgSize();

		/**
		 * The meta object literal for the '<em><b>Packet Overhead Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE = eINSTANCE.getFPPacketBasedScheduler_PacketOverheadMaxSize();

		/**
		 * The meta object literal for the '<em><b>Packet Overhead Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE = eINSTANCE.getFPPacketBasedScheduler_PacketOverheadMinSize();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl <em>Global Max Miss Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getGlobalMaxMissRatio()
		 * @generated
		 */
		EClass GLOBAL_MAX_MISS_RATIO = eINSTANCE.getGlobalMaxMissRatio();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_MAX_MISS_RATIO__DEADLINE = eINSTANCE.getGlobalMaxMissRatio_Deadline();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_MAX_MISS_RATIO__RATIO = eINSTANCE.getGlobalMaxMissRatio_Ratio();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT = eINSTANCE.getGlobalMaxMissRatio_ReferencedEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.HardGlobalDeadlineImpl <em>Hard Global Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.HardGlobalDeadlineImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getHardGlobalDeadline()
		 * @generated
		 */
		EClass HARD_GLOBAL_DEADLINE = eINSTANCE.getHardGlobalDeadline();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_GLOBAL_DEADLINE__DEADLINE = eINSTANCE.getHardGlobalDeadline_Deadline();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_GLOBAL_DEADLINE__REFERENCED_EVENT = eINSTANCE.getHardGlobalDeadline_ReferencedEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.HardLocalDeadlineImpl <em>Hard Local Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.HardLocalDeadlineImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getHardLocalDeadline()
		 * @generated
		 */
		EClass HARD_LOCAL_DEADLINE = eINSTANCE.getHardLocalDeadline();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_LOCAL_DEADLINE__DEADLINE = eINSTANCE.getHardLocalDeadline_Deadline();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.ImmediateCeilingResourceImpl <em>Immediate Ceiling Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ImmediateCeilingResourceImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getImmediateCeilingResource()
		 * @generated
		 */
		EClass IMMEDIATE_CEILING_RESOURCE = eINSTANCE.getImmediateCeilingResource();

		/**
		 * The meta object literal for the '<em><b>Ceiling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMEDIATE_CEILING_RESOURCE__CEILING = eINSTANCE.getImmediateCeilingResource_Ceiling();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMEDIATE_CEILING_RESOURCE__NAME = eINSTANCE.getImmediateCeilingResource_Name();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMMEDIATE_CEILING_RESOURCE__PREASSIGNED = eINSTANCE.getImmediateCeilingResource_Preassigned();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.InterruptFPPolicyImpl <em>Interrupt FP Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.InterruptFPPolicyImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getInterruptFPPolicy()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.ListOfDriversImpl <em>List Of Drivers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ListOfDriversImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getListOfDrivers()
		 * @generated
		 */
		EClass LIST_OF_DRIVERS = eINSTANCE.getListOfDrivers();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_DRIVERS__GROUP = eINSTANCE.getListOfDrivers_Group();

		/**
		 * The meta object literal for the '<em><b>Packet Driver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_DRIVERS__PACKET_DRIVER = eINSTANCE.getListOfDrivers_PacketDriver();

		/**
		 * The meta object literal for the '<em><b>Character Packet Driver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER = eINSTANCE.getListOfDrivers_CharacterPacketDriver();

		/**
		 * The meta object literal for the '<em><b>RTEP Packet Driver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_DRIVERS__RTEP_PACKET_DRIVER = eINSTANCE.getListOfDrivers_RTEPPacketDriver();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.LocalMaxMissRatioImpl <em>Local Max Miss Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.LocalMaxMissRatioImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getLocalMaxMissRatio()
		 * @generated
		 */
		EClass LOCAL_MAX_MISS_RATIO = eINSTANCE.getLocalMaxMissRatio();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_MAX_MISS_RATIO__DEADLINE = eINSTANCE.getLocalMaxMissRatio_Deadline();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_MAX_MISS_RATIO__RATIO = eINSTANCE.getLocalMaxMissRatio_Ratio();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl <em>MASTMODEL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMASTMODELType()
		 * @generated
		 */
		EClass MASTMODEL_TYPE = eINSTANCE.getMASTMODELType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTMODEL_TYPE__GROUP = eINSTANCE.getMASTMODELType_Group();

		/**
		 * The meta object literal for the '<em><b>Regular Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__REGULAR_PROCESSOR = eINSTANCE.getMASTMODELType_RegularProcessor();

		/**
		 * The meta object literal for the '<em><b>Packet Based Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__PACKET_BASED_NETWORK = eINSTANCE.getMASTMODELType_PacketBasedNetwork();

		/**
		 * The meta object literal for the '<em><b>Regular Scheduling Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER = eINSTANCE.getMASTMODELType_RegularSchedulingServer();

		/**
		 * The meta object literal for the '<em><b>Immediate Ceiling Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE = eINSTANCE.getMASTMODELType_ImmediateCeilingResource();

		/**
		 * The meta object literal for the '<em><b>Priority Inheritance Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE = eINSTANCE.getMASTMODELType_PriorityInheritanceResource();

		/**
		 * The meta object literal for the '<em><b>SRP Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__SRP_RESOURCE = eINSTANCE.getMASTMODELType_SRPResource();

		/**
		 * The meta object literal for the '<em><b>Simple Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__SIMPLE_OPERATION = eINSTANCE.getMASTMODELType_SimpleOperation();

		/**
		 * The meta object literal for the '<em><b>Message Transmission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__MESSAGE_TRANSMISSION = eINSTANCE.getMASTMODELType_MessageTransmission();

		/**
		 * The meta object literal for the '<em><b>Composite Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__COMPOSITE_OPERATION = eINSTANCE.getMASTMODELType_CompositeOperation();

		/**
		 * The meta object literal for the '<em><b>Enclosing Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__ENCLOSING_OPERATION = eINSTANCE.getMASTMODELType_EnclosingOperation();

		/**
		 * The meta object literal for the '<em><b>Regular Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__REGULAR_TRANSACTION = eINSTANCE.getMASTMODELType_RegularTransaction();

		/**
		 * The meta object literal for the '<em><b>Primary Scheduler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__PRIMARY_SCHEDULER = eINSTANCE.getMASTMODELType_PrimaryScheduler();

		/**
		 * The meta object literal for the '<em><b>Secondary Scheduler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTMODEL_TYPE__SECONDARY_SCHEDULER = eINSTANCE.getMASTMODELType_SecondaryScheduler();

		/**
		 * The meta object literal for the '<em><b>Model Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTMODEL_TYPE__MODEL_DATE = eINSTANCE.getMASTMODELType_ModelDate();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTMODEL_TYPE__MODEL_NAME = eINSTANCE.getMASTMODELType_ModelName();

		/**
		 * The meta object literal for the '<em><b>System Pi PBehaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR = eINSTANCE.getMASTMODELType_SystemPiPBehaviour();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.MaxOutputJitterReqImpl <em>Max Output Jitter Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.MaxOutputJitterReqImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMaxOutputJitterReq()
		 * @generated
		 */
		EClass MAX_OUTPUT_JITTER_REQ = eINSTANCE.getMaxOutputJitterReq();

		/**
		 * The meta object literal for the '<em><b>Max Output Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER = eINSTANCE.getMaxOutputJitterReq_MaxOutputJitter();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT = eINSTANCE.getMaxOutputJitterReq_ReferencedEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl <em>Message Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMessageTransmission()
		 * @generated
		 */
		EClass MESSAGE_TRANSMISSION = eINSTANCE.getMessageTransmission();

		/**
		 * The meta object literal for the '<em><b>Overridden Fixed Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY = eINSTANCE.getMessageTransmission_OverriddenFixedPriority();

		/**
		 * The meta object literal for the '<em><b>Overridden Permanent FP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP = eINSTANCE.getMessageTransmission_OverriddenPermanentFP();

		/**
		 * The meta object literal for the '<em><b>Avg Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE = eINSTANCE.getMessageTransmission_AvgMessageSize();

		/**
		 * The meta object literal for the '<em><b>Max Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE = eINSTANCE.getMessageTransmission_MaxMessageSize();

		/**
		 * The meta object literal for the '<em><b>Min Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE = eINSTANCE.getMessageTransmission_MinMessageSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TRANSMISSION__NAME = eINSTANCE.getMessageTransmission_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.MulticastImpl <em>Multicast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.MulticastImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getMulticast()
		 * @generated
		 */
		EClass MULTICAST = eINSTANCE.getMulticast();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTICAST__INPUT_EVENT = eINSTANCE.getMulticast_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Events List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTICAST__OUTPUT_EVENTS_LIST = eINSTANCE.getMulticast_OutputEventsList();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.NonPreemptibleFPPolicyImpl <em>Non Preemptible FP Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.NonPreemptibleFPPolicyImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNonPreemptibleFPPolicy()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.OffsetImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Delay Max Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__DELAY_MAX_INTERVAL = eINSTANCE.getOffset_DelayMaxInterval();

		/**
		 * The meta object literal for the '<em><b>Delay Min Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__DELAY_MIN_INTERVAL = eINSTANCE.getOffset_DelayMinInterval();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__INPUT_EVENT = eINSTANCE.getOffset_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__OUTPUT_EVENT = eINSTANCE.getOffset_OutputEvent();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__REFERENCED_EVENT = eINSTANCE.getOffset_ReferencedEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.OverriddenFixedPriorityImpl <em>Overridden Fixed Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.OverriddenFixedPriorityImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverriddenFixedPriority()
		 * @generated
		 */
		EClass OVERRIDDEN_FIXED_PRIORITY = eINSTANCE.getOverriddenFixedPriority();

		/**
		 * The meta object literal for the '<em><b>The Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY = eINSTANCE.getOverriddenFixedPriority_ThePriority();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.OverriddenPermanentFPImpl <em>Overridden Permanent FP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.OverriddenPermanentFPImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverriddenPermanentFP()
		 * @generated
		 */
		EClass OVERRIDDEN_PERMANENT_FP = eINSTANCE.getOverriddenPermanentFP();

		/**
		 * The meta object literal for the '<em><b>The Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDDEN_PERMANENT_FP__THE_PRIORITY = eINSTANCE.getOverriddenPermanentFP_ThePriority();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl <em>Packet Based Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPacketBasedNetwork()
		 * @generated
		 */
		EClass PACKET_BASED_NETWORK = eINSTANCE.getPacketBasedNetwork();

		/**
		 * The meta object literal for the '<em><b>List Of Drivers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET_BASED_NETWORK__LIST_OF_DRIVERS = eINSTANCE.getPacketBasedNetwork_ListOfDrivers();

		/**
		 * The meta object literal for the '<em><b>Max Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__MAX_BLOCKING = eINSTANCE.getPacketBasedNetwork_MaxBlocking();

		/**
		 * The meta object literal for the '<em><b>Max Packet Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__MAX_PACKET_SIZE = eINSTANCE.getPacketBasedNetwork_MaxPacketSize();

		/**
		 * The meta object literal for the '<em><b>Min Packet Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__MIN_PACKET_SIZE = eINSTANCE.getPacketBasedNetwork_MinPacketSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__NAME = eINSTANCE.getPacketBasedNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__SPEED_FACTOR = eINSTANCE.getPacketBasedNetwork_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__THROUGHPUT = eINSTANCE.getPacketBasedNetwork_Throughput();

		/**
		 * The meta object literal for the '<em><b>Transmission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_BASED_NETWORK__TRANSMISSION = eINSTANCE.getPacketBasedNetwork_Transmission();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl <em>Packet Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.PacketDriverImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPacketDriver()
		 * @generated
		 */
		EClass PACKET_DRIVER = eINSTANCE.getPacketDriver();

		/**
		 * The meta object literal for the '<em><b>Message Partitioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_DRIVER__MESSAGE_PARTITIONING = eINSTANCE.getPacketDriver_MessagePartitioning();

		/**
		 * The meta object literal for the '<em><b>Packet Receive Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_DRIVER__PACKET_RECEIVE_OPERATION = eINSTANCE.getPacketDriver_PacketReceiveOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Send Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_DRIVER__PACKET_SEND_OPERATION = eINSTANCE.getPacketDriver_PacketSendOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_DRIVER__PACKET_SERVER = eINSTANCE.getPacketDriver_PacketServer();

		/**
		 * The meta object literal for the '<em><b>RTA Overhead Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET_DRIVER__RTA_OVERHEAD_MODEL = eINSTANCE.getPacketDriver_RTAOverheadModel();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl <em>Periodic External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPeriodicExternalEvent()
		 * @generated
		 */
		EClass PERIODIC_EXTERNAL_EVENT = eINSTANCE.getPeriodicExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Max Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EXTERNAL_EVENT__MAX_JITTER = eINSTANCE.getPeriodicExternalEvent_MaxJitter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EXTERNAL_EVENT__NAME = eINSTANCE.getPeriodicExternalEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EXTERNAL_EVENT__PERIOD = eINSTANCE.getPeriodicExternalEvent_Period();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_EXTERNAL_EVENT__PHASE = eINSTANCE.getPeriodicExternalEvent_Phase();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl <em>Polling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.PollingPolicyImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPollingPolicy()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.PrimarySchedulerImpl <em>Primary Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.PrimarySchedulerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPrimaryScheduler()
		 * @generated
		 */
		EClass PRIMARY_SCHEDULER = eINSTANCE.getPrimaryScheduler();

		/**
		 * The meta object literal for the '<em><b>Fixed Priority Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER = eINSTANCE.getPrimaryScheduler_FixedPriorityScheduler();

		/**
		 * The meta object literal for the '<em><b>EDF Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_SCHEDULER__EDF_SCHEDULER = eINSTANCE.getPrimaryScheduler_EDFScheduler();

		/**
		 * The meta object literal for the '<em><b>FP Packet Based Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER = eINSTANCE.getPrimaryScheduler_FPPacketBasedScheduler();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_SCHEDULER__HOST = eINSTANCE.getPrimaryScheduler_Host();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_SCHEDULER__NAME = eINSTANCE.getPrimaryScheduler_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.PriorityInheritanceResourceImpl <em>Priority Inheritance Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.PriorityInheritanceResourceImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriorityInheritanceResource()
		 * @generated
		 */
		EClass PRIORITY_INHERITANCE_RESOURCE = eINSTANCE.getPriorityInheritanceResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_INHERITANCE_RESOURCE__NAME = eINSTANCE.getPriorityInheritanceResource_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.QueryServerImpl <em>Query Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.QueryServerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getQueryServer()
		 * @generated
		 */
		EClass QUERY_SERVER = eINSTANCE.getQueryServer();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SERVER__INPUT_EVENT = eINSTANCE.getQueryServer_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Events List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SERVER__OUTPUT_EVENTS_LIST = eINSTANCE.getQueryServer_OutputEventsList();

		/**
		 * The meta object literal for the '<em><b>Request Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SERVER__REQUEST_POLICY = eINSTANCE.getQueryServer_RequestPolicy();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.RateDivisorImpl <em>Rate Divisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.RateDivisorImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRateDivisor()
		 * @generated
		 */
		EClass RATE_DIVISOR = eINSTANCE.getRateDivisor();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_DIVISOR__INPUT_EVENT = eINSTANCE.getRateDivisor_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_DIVISOR__OUTPUT_EVENT = eINSTANCE.getRateDivisor_OutputEvent();

		/**
		 * The meta object literal for the '<em><b>Rate Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_DIVISOR__RATE_FACTOR = eINSTANCE.getRateDivisor_RateFactor();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.RegularEventImpl <em>Regular Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.RegularEventImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularEvent()
		 * @generated
		 */
		EClass REGULAR_EVENT = eINSTANCE.getRegularEvent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_EVENT__GROUP = eINSTANCE.getRegularEvent_Group();

		/**
		 * The meta object literal for the '<em><b>Max Output Jitter Req</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__MAX_OUTPUT_JITTER_REQ = eINSTANCE.getRegularEvent_MaxOutputJitterReq();

		/**
		 * The meta object literal for the '<em><b>Hard Global Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__HARD_GLOBAL_DEADLINE = eINSTANCE.getRegularEvent_HardGlobalDeadline();

		/**
		 * The meta object literal for the '<em><b>Soft Global Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__SOFT_GLOBAL_DEADLINE = eINSTANCE.getRegularEvent_SoftGlobalDeadline();

		/**
		 * The meta object literal for the '<em><b>Global Max Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__GLOBAL_MAX_MISS_RATIO = eINSTANCE.getRegularEvent_GlobalMaxMissRatio();

		/**
		 * The meta object literal for the '<em><b>Hard Local Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__HARD_LOCAL_DEADLINE = eINSTANCE.getRegularEvent_HardLocalDeadline();

		/**
		 * The meta object literal for the '<em><b>Soft Local Deadline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__SOFT_LOCAL_DEADLINE = eINSTANCE.getRegularEvent_SoftLocalDeadline();

		/**
		 * The meta object literal for the '<em><b>Local Max Miss Ratio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__LOCAL_MAX_MISS_RATIO = eINSTANCE.getRegularEvent_LocalMaxMissRatio();

		/**
		 * The meta object literal for the '<em><b>Composite Timing Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_EVENT__COMPOSITE_TIMING_REQUIREMENT = eINSTANCE.getRegularEvent_CompositeTimingRequirement();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_EVENT__EVENT = eINSTANCE.getRegularEvent_Event();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl <em>Regular Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.RegularProcessorImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularProcessor()
		 * @generated
		 */
		EClass REGULAR_PROCESSOR = eINSTANCE.getRegularProcessor();

		/**
		 * The meta object literal for the '<em><b>Ticker System Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER = eINSTANCE.getRegularProcessor_TickerSystemTimer();

		/**
		 * The meta object literal for the '<em><b>Alarm Clock System Timer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER = eINSTANCE.getRegularProcessor_AlarmClockSystemTimer();

		/**
		 * The meta object literal for the '<em><b>Avg ISR Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__AVG_ISR_SWITCH = eINSTANCE.getRegularProcessor_AvgISRSwitch();

		/**
		 * The meta object literal for the '<em><b>Best ISR Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__BEST_ISR_SWITCH = eINSTANCE.getRegularProcessor_BestISRSwitch();

		/**
		 * The meta object literal for the '<em><b>Max Interrupt Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY = eINSTANCE.getRegularProcessor_MaxInterruptPriority();

		/**
		 * The meta object literal for the '<em><b>Min Interrupt Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY = eINSTANCE.getRegularProcessor_MinInterruptPriority();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__NAME = eINSTANCE.getRegularProcessor_Name();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__SPEED_FACTOR = eINSTANCE.getRegularProcessor_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Worst ISR Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_PROCESSOR__WORST_ISR_SWITCH = eINSTANCE.getRegularProcessor_WorstISRSwitch();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl <em>Regular Scheduling Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularSchedulingServer()
		 * @generated
		 */
		EClass REGULAR_SCHEDULING_SERVER = eINSTANCE.getRegularSchedulingServer();

		/**
		 * The meta object literal for the '<em><b>Non Preemptible FP Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY = eINSTANCE.getRegularSchedulingServer_NonPreemptibleFPPolicy();

		/**
		 * The meta object literal for the '<em><b>Fixed Priority Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY = eINSTANCE.getRegularSchedulingServer_FixedPriorityPolicy();

		/**
		 * The meta object literal for the '<em><b>Interrupt FP Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY = eINSTANCE.getRegularSchedulingServer_InterruptFPPolicy();

		/**
		 * The meta object literal for the '<em><b>Polling Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__POLLING_POLICY = eINSTANCE.getRegularSchedulingServer_PollingPolicy();

		/**
		 * The meta object literal for the '<em><b>Sporadic Server Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY = eINSTANCE.getRegularSchedulingServer_SporadicServerPolicy();

		/**
		 * The meta object literal for the '<em><b>EDF Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__EDF_POLICY = eINSTANCE.getRegularSchedulingServer_EDFPolicy();

		/**
		 * The meta object literal for the '<em><b>SRP Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS = eINSTANCE.getRegularSchedulingServer_SRPParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_SCHEDULING_SERVER__NAME = eINSTANCE.getRegularSchedulingServer_Name();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_SCHEDULING_SERVER__SCHEDULER = eINSTANCE.getRegularSchedulingServer_Scheduler();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl <em>Regular Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.RegularTransactionImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRegularTransaction()
		 * @generated
		 */
		EClass REGULAR_TRANSACTION = eINSTANCE.getRegularTransaction();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TRANSACTION__GROUP = eINSTANCE.getRegularTransaction_Group();

		/**
		 * The meta object literal for the '<em><b>Periodic External Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT = eINSTANCE.getRegularTransaction_PeriodicExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Sporadic External Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT = eINSTANCE.getRegularTransaction_SporadicExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Unbounded External Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT = eINSTANCE.getRegularTransaction_UnboundedExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Bursty External Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT = eINSTANCE.getRegularTransaction_BurstyExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Singular External Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT = eINSTANCE.getRegularTransaction_SingularExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Regular Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__REGULAR_EVENT = eINSTANCE.getRegularTransaction_RegularEvent();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__ACTIVITY = eINSTANCE.getRegularTransaction_Activity();

		/**
		 * The meta object literal for the '<em><b>System Timed Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY = eINSTANCE.getRegularTransaction_SystemTimedActivity();

		/**
		 * The meta object literal for the '<em><b>Concentrator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__CONCENTRATOR = eINSTANCE.getRegularTransaction_Concentrator();

		/**
		 * The meta object literal for the '<em><b>Barrier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__BARRIER = eINSTANCE.getRegularTransaction_Barrier();

		/**
		 * The meta object literal for the '<em><b>Delivery Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__DELIVERY_SERVER = eINSTANCE.getRegularTransaction_DeliveryServer();

		/**
		 * The meta object literal for the '<em><b>Query Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__QUERY_SERVER = eINSTANCE.getRegularTransaction_QueryServer();

		/**
		 * The meta object literal for the '<em><b>Multicast</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__MULTICAST = eINSTANCE.getRegularTransaction_Multicast();

		/**
		 * The meta object literal for the '<em><b>Rate Divisor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__RATE_DIVISOR = eINSTANCE.getRegularTransaction_RateDivisor();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__DELAY = eINSTANCE.getRegularTransaction_Delay();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TRANSACTION__OFFSET = eINSTANCE.getRegularTransaction_Offset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TRANSACTION__NAME = eINSTANCE.getRegularTransaction_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl <em>RTEP Packet Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRTEPPacketDriver()
		 * @generated
		 */
		EClass RTEP_PACKET_DRIVER = eINSTANCE.getRTEPPacketDriver();

		/**
		 * The meta object literal for the '<em><b>Failure Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__FAILURE_TIMEOUT = eINSTANCE.getRTEPPacketDriver_FailureTimeout();

		/**
		 * The meta object literal for the '<em><b>Message Partitioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING = eINSTANCE.getRTEPPacketDriver_MessagePartitioning();

		/**
		 * The meta object literal for the '<em><b>Number Of Stations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS = eINSTANCE.getRTEPPacketDriver_NumberOfStations();

		/**
		 * The meta object literal for the '<em><b>Packet Discard Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION = eINSTANCE.getRTEPPacketDriver_PacketDiscardOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Interrupt Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER = eINSTANCE.getRTEPPacketDriver_PacketInterruptServer();

		/**
		 * The meta object literal for the '<em><b>Packet ISR Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION = eINSTANCE.getRTEPPacketDriver_PacketISROperation();

		/**
		 * The meta object literal for the '<em><b>Packet Receive Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION = eINSTANCE.getRTEPPacketDriver_PacketReceiveOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Retransmission Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION = eINSTANCE.getRTEPPacketDriver_PacketRetransmissionOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Send Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION = eINSTANCE.getRTEPPacketDriver_PacketSendOperation();

		/**
		 * The meta object literal for the '<em><b>Packet Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_SERVER = eINSTANCE.getRTEPPacketDriver_PacketServer();

		/**
		 * The meta object literal for the '<em><b>Packet Transmission Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES = eINSTANCE.getRTEPPacketDriver_PacketTransmissionRetries();

		/**
		 * The meta object literal for the '<em><b>RTA Overhead Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL = eINSTANCE.getRTEPPacketDriver_RTAOverheadModel();

		/**
		 * The meta object literal for the '<em><b>Token Check Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION = eINSTANCE.getRTEPPacketDriver_TokenCheckOperation();

		/**
		 * The meta object literal for the '<em><b>Token Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__TOKEN_DELAY = eINSTANCE.getRTEPPacketDriver_TokenDelay();

		/**
		 * The meta object literal for the '<em><b>Token Manage Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION = eINSTANCE.getRTEPPacketDriver_TokenManageOperation();

		/**
		 * The meta object literal for the '<em><b>Token Retransmission Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION = eINSTANCE.getRTEPPacketDriver_TokenRetransmissionOperation();

		/**
		 * The meta object literal for the '<em><b>Token Transmission Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES = eINSTANCE.getRTEPPacketDriver_TokenTransmissionRetries();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl <em>Secondary Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSecondaryScheduler()
		 * @generated
		 */
		EClass SECONDARY_SCHEDULER = eINSTANCE.getSecondaryScheduler();

		/**
		 * The meta object literal for the '<em><b>Fixed Priority Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER = eINSTANCE.getSecondaryScheduler_FixedPriorityScheduler();

		/**
		 * The meta object literal for the '<em><b>EDF Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECONDARY_SCHEDULER__EDF_SCHEDULER = eINSTANCE.getSecondaryScheduler_EDFScheduler();

		/**
		 * The meta object literal for the '<em><b>FP Packet Based Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER = eINSTANCE.getSecondaryScheduler_FPPacketBasedScheduler();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_SCHEDULER__HOST = eINSTANCE.getSecondaryScheduler_Host();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_SCHEDULER__NAME = eINSTANCE.getSecondaryScheduler_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SimpleOperationImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSimpleOperation()
		 * @generated
		 */
		EClass SIMPLE_OPERATION = eINSTANCE.getSimpleOperation();

		/**
		 * The meta object literal for the '<em><b>Overridden Fixed Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY = eINSTANCE.getSimpleOperation_OverriddenFixedPriority();

		/**
		 * The meta object literal for the '<em><b>Overridden Permanent FP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP = eINSTANCE.getSimpleOperation_OverriddenPermanentFP();

		/**
		 * The meta object literal for the '<em><b>Shared Resources List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__SHARED_RESOURCES_LIST = eINSTANCE.getSimpleOperation_SharedResourcesList();

		/**
		 * The meta object literal for the '<em><b>Shared Resources To Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK = eINSTANCE.getSimpleOperation_SharedResourcesToLock();

		/**
		 * The meta object literal for the '<em><b>Shared Resources To Unlock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK = eINSTANCE.getSimpleOperation_SharedResourcesToUnlock();

		/**
		 * The meta object literal for the '<em><b>Average Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME = eINSTANCE.getSimpleOperation_AverageCaseExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Best Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME = eINSTANCE.getSimpleOperation_BestCaseExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__NAME = eINSTANCE.getSimpleOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Worst Case Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME = eINSTANCE.getSimpleOperation_WorstCaseExecutionTime();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SingularExternalEventImpl <em>Singular External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SingularExternalEventImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSingularExternalEvent()
		 * @generated
		 */
		EClass SINGULAR_EXTERNAL_EVENT = eINSTANCE.getSingularExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGULAR_EXTERNAL_EVENT__NAME = eINSTANCE.getSingularExternalEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGULAR_EXTERNAL_EVENT__PHASE = eINSTANCE.getSingularExternalEvent_Phase();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SoftGlobalDeadlineImpl <em>Soft Global Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SoftGlobalDeadlineImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSoftGlobalDeadline()
		 * @generated
		 */
		EClass SOFT_GLOBAL_DEADLINE = eINSTANCE.getSoftGlobalDeadline();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_GLOBAL_DEADLINE__DEADLINE = eINSTANCE.getSoftGlobalDeadline_Deadline();

		/**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT = eINSTANCE.getSoftGlobalDeadline_ReferencedEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SoftLocalDeadlineImpl <em>Soft Local Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SoftLocalDeadlineImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSoftLocalDeadline()
		 * @generated
		 */
		EClass SOFT_LOCAL_DEADLINE = eINSTANCE.getSoftLocalDeadline();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_LOCAL_DEADLINE__DEADLINE = eINSTANCE.getSoftLocalDeadline_Deadline();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl <em>Sporadic External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSporadicExternalEvent()
		 * @generated
		 */
		EClass SPORADIC_EXTERNAL_EVENT = eINSTANCE.getSporadicExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Avg Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL = eINSTANCE.getSporadicExternalEvent_AvgInterarrival();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EXTERNAL_EVENT__DISTRIBUTION = eINSTANCE.getSporadicExternalEvent_Distribution();

		/**
		 * The meta object literal for the '<em><b>Min Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL = eINSTANCE.getSporadicExternalEvent_MinInterarrival();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_EXTERNAL_EVENT__NAME = eINSTANCE.getSporadicExternalEvent_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl <em>Sporadic Server Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSporadicServerPolicy()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SRPParametersImpl <em>SRP Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SRPParametersImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSRPParameters()
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
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SRPResourceImpl <em>SRP Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SRPResourceImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSRPResource()
		 * @generated
		 */
		EClass SRP_RESOURCE = eINSTANCE.getSRPResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRP_RESOURCE__NAME = eINSTANCE.getSRPResource_Name();

		/**
		 * The meta object literal for the '<em><b>Preassigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRP_RESOURCE__PREASSIGNED = eINSTANCE.getSRPResource_Preassigned();

		/**
		 * The meta object literal for the '<em><b>Preemption Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRP_RESOURCE__PREEMPTION_LEVEL = eINSTANCE.getSRPResource_PreemptionLevel();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl <em>System Timed Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getSystemTimedActivity()
		 * @generated
		 */
		EClass SYSTEM_TIMED_ACTIVITY = eINSTANCE.getSystemTimedActivity();

		/**
		 * The meta object literal for the '<em><b>Activity Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION = eINSTANCE.getSystemTimedActivity_ActivityOperation();

		/**
		 * The meta object literal for the '<em><b>Activity Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER = eINSTANCE.getSystemTimedActivity_ActivityServer();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMED_ACTIVITY__INPUT_EVENT = eINSTANCE.getSystemTimedActivity_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT = eINSTANCE.getSystemTimedActivity_OutputEvent();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl <em>Ticker System Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTickerSystemTimer()
		 * @generated
		 */
		EClass TICKER_SYSTEM_TIMER = eINSTANCE.getTickerSystemTimer();

		/**
		 * The meta object literal for the '<em><b>Avg Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKER_SYSTEM_TIMER__AVG_OVERHEAD = eINSTANCE.getTickerSystemTimer_AvgOverhead();

		/**
		 * The meta object literal for the '<em><b>Best Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKER_SYSTEM_TIMER__BEST_OVERHEAD = eINSTANCE.getTickerSystemTimer_BestOverhead();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKER_SYSTEM_TIMER__PERIOD = eINSTANCE.getTickerSystemTimer_Period();

		/**
		 * The meta object literal for the '<em><b>Worst Overhead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKER_SYSTEM_TIMER__WORST_OVERHEAD = eINSTANCE.getTickerSystemTimer_WorstOverhead();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.impl.UnboundedExternalEventImpl <em>Unbounded External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.UnboundedExternalEventImpl
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getUnboundedExternalEvent()
		 * @generated
		 */
		EClass UNBOUNDED_EXTERNAL_EVENT = eINSTANCE.getUnboundedExternalEvent();

		/**
		 * The meta object literal for the '<em><b>Avg Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNBOUNDED_EXTERNAL_EVENT__AVG_INTERARRIVAL = eINSTANCE.getUnboundedExternalEvent_AvgInterarrival();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNBOUNDED_EXTERNAL_EVENT__DISTRIBUTION = eINSTANCE.getUnboundedExternalEvent_Distribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNBOUNDED_EXTERNAL_EVENT__NAME = eINSTANCE.getUnboundedExternalEvent_Name();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.AffirmativeAssertion <em>Affirmative Assertion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.AffirmativeAssertion
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAffirmativeAssertion()
		 * @generated
		 */
		EEnum AFFIRMATIVE_ASSERTION = eINSTANCE.getAffirmativeAssertion();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.Assertion <em>Assertion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.Assertion
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAssertion()
		 * @generated
		 */
		EEnum ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.DeliveryPolicy <em>Delivery Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDeliveryPolicy()
		 * @generated
		 */
		EEnum DELIVERY_POLICY = eINSTANCE.getDeliveryPolicy();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.DistributionType <em>Distribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.DistributionType
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDistributionType()
		 * @generated
		 */
		EEnum DISTRIBUTION_TYPE = eINSTANCE.getDistributionType();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.NegativeAssertion <em>Negative Assertion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.NegativeAssertion
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNegativeAssertion()
		 * @generated
		 */
		EEnum NEGATIVE_ASSERTION = eINSTANCE.getNegativeAssertion();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.OverheadType <em>Overhead Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.OverheadType
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverheadType()
		 * @generated
		 */
		EEnum OVERHEAD_TYPE = eINSTANCE.getOverheadType();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.PriorityInheritanceProtocol <em>Priority Inheritance Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriorityInheritanceProtocol()
		 * @generated
		 */
		EEnum PRIORITY_INHERITANCE_PROTOCOL = eINSTANCE.getPriorityInheritanceProtocol();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.RequestPolicy <em>Request Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.RequestPolicy
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRequestPolicy()
		 * @generated
		 */
		EEnum REQUEST_POLICY = eINSTANCE.getRequestPolicy();

		/**
		 * The meta object literal for the '{@link es.unican.mast.xmlmast.model.TransmissionType <em>Transmission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.TransmissionType
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTransmissionType()
		 * @generated
		 */
		EEnum TRANSMISSION_TYPE = eINSTANCE.getTransmissionType();

		/**
		 * The meta object literal for the '<em>Absolute Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAbsoluteTime()
		 * @generated
		 */
		EDataType ABSOLUTE_TIME = eINSTANCE.getAbsoluteTime();

		/**
		 * The meta object literal for the '<em>Absolute Time Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAbsoluteTimeObject()
		 * @generated
		 */
		EDataType ABSOLUTE_TIME_OBJECT = eINSTANCE.getAbsoluteTimeObject();

		/**
		 * The meta object literal for the '<em>Affirmative Assertion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.AffirmativeAssertion
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAffirmativeAssertionObject()
		 * @generated
		 */
		EDataType AFFIRMATIVE_ASSERTION_OBJECT = eINSTANCE.getAffirmativeAssertionObject();

		/**
		 * The meta object literal for the '<em>Any Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAnyPriority()
		 * @generated
		 */
		EDataType ANY_PRIORITY = eINSTANCE.getAnyPriority();

		/**
		 * The meta object literal for the '<em>Assertion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.Assertion
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getAssertionObject()
		 * @generated
		 */
		EDataType ASSERTION_OBJECT = eINSTANCE.getAssertionObject();

		/**
		 * The meta object literal for the '<em>Bit Count</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBitCount()
		 * @generated
		 */
		EDataType BIT_COUNT = eINSTANCE.getBitCount();

		/**
		 * The meta object literal for the '<em>Bit Count Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getBitCountObject()
		 * @generated
		 */
		EDataType BIT_COUNT_OBJECT = eINSTANCE.getBitCountObject();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>Delivery Policy Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDeliveryPolicyObject()
		 * @generated
		 */
		EDataType DELIVERY_POLICY_OBJECT = eINSTANCE.getDeliveryPolicyObject();

		/**
		 * The meta object literal for the '<em>Distribution Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.DistributionType
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getDistributionTypeObject()
		 * @generated
		 */
		EDataType DISTRIBUTION_TYPE_OBJECT = eINSTANCE.getDistributionTypeObject();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Float Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getFloatObject()
		 * @generated
		 */
		EDataType FLOAT_OBJECT = eINSTANCE.getFloatObject();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Identifier Ref</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getIdentifierRef()
		 * @generated
		 */
		EDataType IDENTIFIER_REF = eINSTANCE.getIdentifierRef();

		/**
		 * The meta object literal for the '<em>Identifier Ref List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getIdentifierRefList()
		 * @generated
		 */
		EDataType IDENTIFIER_REF_LIST = eINSTANCE.getIdentifierRefList();

		/**
		 * The meta object literal for the '<em>Interrupt Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getInterruptPriority()
		 * @generated
		 */
		EDataType INTERRUPT_PRIORITY = eINSTANCE.getInterruptPriority();

		/**
		 * The meta object literal for the '<em>Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNatural()
		 * @generated
		 */
		EDataType NATURAL = eINSTANCE.getNatural();

		/**
		 * The meta object literal for the '<em>Negative Assertion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.NegativeAssertion
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNegativeAssertionObject()
		 * @generated
		 */
		EDataType NEGATIVE_ASSERTION_OBJECT = eINSTANCE.getNegativeAssertionObject();

		/**
		 * The meta object literal for the '<em>Normalized Execution Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNormalizedExecutionTime()
		 * @generated
		 */
		EDataType NORMALIZED_EXECUTION_TIME = eINSTANCE.getNormalizedExecutionTime();

		/**
		 * The meta object literal for the '<em>Normalized Execution Time Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getNormalizedExecutionTimeObject()
		 * @generated
		 */
		EDataType NORMALIZED_EXECUTION_TIME_OBJECT = eINSTANCE.getNormalizedExecutionTimeObject();

		/**
		 * The meta object literal for the '<em>Overhead Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.OverheadType
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getOverheadTypeObject()
		 * @generated
		 */
		EDataType OVERHEAD_TYPE_OBJECT = eINSTANCE.getOverheadTypeObject();

		/**
		 * The meta object literal for the '<em>Pathname</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPathname()
		 * @generated
		 */
		EDataType PATHNAME = eINSTANCE.getPathname();

		/**
		 * The meta object literal for the '<em>Percentage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPercentage()
		 * @generated
		 */
		EDataType PERCENTAGE = eINSTANCE.getPercentage();

		/**
		 * The meta object literal for the '<em>Percentage Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPercentageObject()
		 * @generated
		 */
		EDataType PERCENTAGE_OBJECT = eINSTANCE.getPercentageObject();

		/**
		 * The meta object literal for the '<em>Positive</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPositive()
		 * @generated
		 */
		EDataType POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '<em>Preemption Level</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPreemptionLevel()
		 * @generated
		 */
		EDataType PREEMPTION_LEVEL = eINSTANCE.getPreemptionLevel();

		/**
		 * The meta object literal for the '<em>Priority</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriority()
		 * @generated
		 */
		EDataType PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '<em>Priority Inheritance Protocol Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.PriorityInheritanceProtocol
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getPriorityInheritanceProtocolObject()
		 * @generated
		 */
		EDataType PRIORITY_INHERITANCE_PROTOCOL_OBJECT = eINSTANCE.getPriorityInheritanceProtocolObject();

		/**
		 * The meta object literal for the '<em>Request Policy Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.RequestPolicy
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getRequestPolicyObject()
		 * @generated
		 */
		EDataType REQUEST_POLICY_OBJECT = eINSTANCE.getRequestPolicyObject();

		/**
		 * The meta object literal for the '<em>Throughput</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getThroughput()
		 * @generated
		 */
		EDataType THROUGHPUT = eINSTANCE.getThroughput();

		/**
		 * The meta object literal for the '<em>Throughput Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getThroughputObject()
		 * @generated
		 */
		EDataType THROUGHPUT_OBJECT = eINSTANCE.getThroughputObject();

		/**
		 * The meta object literal for the '<em>Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTime()
		 * @generated
		 */
		EDataType TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em>Time Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTimeObject()
		 * @generated
		 */
		EDataType TIME_OBJECT = eINSTANCE.getTimeObject();

		/**
		 * The meta object literal for the '<em>Transmission Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.mast.xmlmast.model.TransmissionType
		 * @see es.unican.mast.xmlmast.model.impl.ModelPackageImpl#getTransmissionTypeObject()
		 * @generated
		 */
		EDataType TRANSMISSION_TYPE_OBJECT = eINSTANCE.getTransmissionTypeObject();

	}

} //ModelPackage

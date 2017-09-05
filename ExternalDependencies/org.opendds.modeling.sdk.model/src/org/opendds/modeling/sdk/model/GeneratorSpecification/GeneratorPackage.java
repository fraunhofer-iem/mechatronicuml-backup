/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GeneratorSpecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opendds.org/modeling/schemas/Generator/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl <em>genspec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getgenspec()
	 * @generated
	 */
	int GENSPEC = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENSPEC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENSPEC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENSPEC__INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Search Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENSPEC__SEARCH_PATHS = 3;

	/**
	 * The feature id for the '<em><b>Transports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENSPEC__TRANSPORTS = 4;

	/**
	 * The number of structural features of the '<em>genspec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENSPEC_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.CodeGenImpl <em>Code Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.CodeGenImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getCodeGen()
	 * @generated
	 */
	int CODE_GEN = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN__SOURCE = GENSPEC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN__TARGET = GENSPEC__TARGET;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN__INSTANCES = GENSPEC__INSTANCES;

	/**
	 * The feature id for the '<em><b>Search Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN__SEARCH_PATHS = GENSPEC__SEARCH_PATHS;

	/**
	 * The feature id for the '<em><b>Transports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN__TRANSPORTS = GENSPEC__TRANSPORTS;

	/**
	 * The number of structural features of the '<em>Code Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_FEATURE_COUNT = GENSPEC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ModelFileImpl <em>Model File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ModelFileImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getModelFile()
	 * @generated
	 */
	int MODEL_FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FILE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TargetDirImpl <em>Target Dir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TargetDirImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTargetDir()
	 * @generated
	 */
	int TARGET_DIR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DIR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Target Dir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_DIR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchPathsImpl <em>Search Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchPathsImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSearchPaths()
	 * @generated
	 */
	int SEARCH_PATHS = 4;

	/**
	 * The feature id for the '<em><b>Search Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PATHS__SEARCH_LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Search Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PATHS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchLocationImpl <em>Search Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchLocationImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSearchLocation()
	 * @generated
	 */
	int SEARCH_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_LOCATION__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_LOCATION__PATH = 1;

	/**
	 * The number of structural features of the '<em>Search Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationVariableImpl <em>Location Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationVariableImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getLocationVariable()
	 * @generated
	 */
	int LOCATION_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_VARIABLE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Location Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationPathImpl <em>Location Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationPathImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getLocationPath()
	 * @generated
	 */
	int LOCATION_PATH = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PATH__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Location Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PATH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstancesImpl <em>Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstancesImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getInstances()
	 * @generated
	 */
	int INSTANCES = 8;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstanceImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SwapBytesImpl <em>Swap Bytes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SwapBytesImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSwapBytes()
	 * @generated
	 */
	int SWAP_BYTES = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAP_BYTES__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Swap Bytes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAP_BYTES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueMessagesPerPoolImpl <em>Queue Messages Per Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueMessagesPerPoolImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getQueueMessagesPerPool()
	 * @generated
	 */
	int QUEUE_MESSAGES_PER_POOL = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_MESSAGES_PER_POOL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Queue Messages Per Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_MESSAGES_PER_POOL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueInitialPoolImpl <em>Queue Initial Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueInitialPoolImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getQueueInitialPool()
	 * @generated
	 */
	int QUEUE_INITIAL_POOL = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_INITIAL_POOL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Queue Initial Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_INITIAL_POOL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxPacketSizeImpl <em>Max Packet Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxPacketSizeImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMaxPacketSize()
	 * @generated
	 */
	int MAX_PACKET_SIZE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_PACKET_SIZE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Max Packet Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_PACKET_SIZE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxSamplesPerPacketImpl <em>Max Samples Per Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxSamplesPerPacketImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMaxSamplesPerPacket()
	 * @generated
	 */
	int MAX_SAMPLES_PER_PACKET = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_SAMPLES_PER_PACKET__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Max Samples Per Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_SAMPLES_PER_PACKET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.OptimumPacketSizeImpl <em>Optimum Packet Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.OptimumPacketSizeImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getOptimumPacketSize()
	 * @generated
	 */
	int OPTIMUM_PACKET_SIZE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMUM_PACKET_SIZE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Optimum Packet Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMUM_PACKET_SIZE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ThreadPerConnectionImpl <em>Thread Per Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ThreadPerConnectionImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getThreadPerConnection()
	 * @generated
	 */
	int THREAD_PER_CONNECTION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_PER_CONNECTION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Thread Per Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_PER_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkReleaseDelayImpl <em>Datalink Release Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkReleaseDelayImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getDatalinkReleaseDelay()
	 * @generated
	 */
	int DATALINK_RELEASE_DELAY = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALINK_RELEASE_DELAY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Datalink Release Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALINK_RELEASE_DELAY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkControlChunksImpl <em>Datalink Control Chunks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkControlChunksImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getDatalinkControlChunks()
	 * @generated
	 */
	int DATALINK_CONTROL_CHUNKS = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALINK_CONTROL_CHUNKS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Datalink Control Chunks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATALINK_CONTROL_CHUNKS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocalAddressStringImpl <em>Local Address String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocalAddressStringImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getLocalAddressString()
	 * @generated
	 */
	int LOCAL_ADDRESS_STRING = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ADDRESS_STRING__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Local Address String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ADDRESS_STRING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.EnableNagleAlgorithmImpl <em>Enable Nagle Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.EnableNagleAlgorithmImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getEnableNagleAlgorithm()
	 * @generated
	 */
	int ENABLE_NAGLE_ALGORITHM = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_NAGLE_ALGORITHM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Enable Nagle Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_NAGLE_ALGORITHM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryInitialDelayImpl <em>Conn Retry Initial Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryInitialDelayImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getConnRetryInitialDelay()
	 * @generated
	 */
	int CONN_RETRY_INITIAL_DELAY = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONN_RETRY_INITIAL_DELAY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Conn Retry Initial Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONN_RETRY_INITIAL_DELAY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryBackoffMultiplierImpl <em>Conn Retry Backoff Multiplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryBackoffMultiplierImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getConnRetryBackoffMultiplier()
	 * @generated
	 */
	int CONN_RETRY_BACKOFF_MULTIPLIER = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONN_RETRY_BACKOFF_MULTIPLIER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Conn Retry Backoff Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONN_RETRY_BACKOFF_MULTIPLIER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryAttemptsImpl <em>Conn Retry Attempts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryAttemptsImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getConnRetryAttempts()
	 * @generated
	 */
	int CONN_RETRY_ATTEMPTS = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONN_RETRY_ATTEMPTS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Conn Retry Attempts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONN_RETRY_ATTEMPTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxOutputPausePeriodImpl <em>Max Output Pause Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxOutputPausePeriodImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMaxOutputPausePeriod()
	 * @generated
	 */
	int MAX_OUTPUT_PAUSE_PERIOD = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OUTPUT_PAUSE_PERIOD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Max Output Pause Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OUTPUT_PAUSE_PERIOD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveReconnectDurationImpl <em>Passive Reconnect Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveReconnectDurationImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getPassiveReconnectDuration()
	 * @generated
	 */
	int PASSIVE_RECONNECT_DURATION = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RECONNECT_DURATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Passive Reconnect Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RECONNECT_DURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveConnectDurationImpl <em>Passive Connect Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveConnectDurationImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getPassiveConnectDuration()
	 * @generated
	 */
	int PASSIVE_CONNECT_DURATION = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CONNECT_DURATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Passive Connect Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CONNECT_DURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DefaultToIPv6Impl <em>Default To IPv6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DefaultToIPv6Impl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getDefaultToIPv6()
	 * @generated
	 */
	int DEFAULT_TO_IPV6 = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TO_IPV6__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Default To IPv6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TO_IPV6_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PortOffsetImpl <em>Port Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PortOffsetImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getPortOffset()
	 * @generated
	 */
	int PORT_OFFSET = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OFFSET__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Port Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OFFSET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GroupAddressImpl <em>Group Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GroupAddressImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getGroupAddress()
	 * @generated
	 */
	int GROUP_ADDRESS = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ADDRESS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Group Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ADDRESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ReliableImpl <em>Reliable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ReliableImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getReliable()
	 * @generated
	 */
	int RELIABLE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Reliable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynBackoffImpl <em>Syn Backoff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynBackoffImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSynBackoff()
	 * @generated
	 */
	int SYN_BACKOFF = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_BACKOFF__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Syn Backoff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_BACKOFF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynIntervalImpl <em>Syn Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynIntervalImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSynInterval()
	 * @generated
	 */
	int SYN_INTERVAL = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_INTERVAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Syn Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynTimeoutImpl <em>Syn Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynTimeoutImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSynTimeout()
	 * @generated
	 */
	int SYN_TIMEOUT = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_TIMEOUT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Syn Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_TIMEOUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakDepthImpl <em>Nak Depth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakDepthImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakDepth()
	 * @generated
	 */
	int NAK_DEPTH = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_DEPTH__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nak Depth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_DEPTH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakIntervalImpl <em>Nak Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakIntervalImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakInterval()
	 * @generated
	 */
	int NAK_INTERVAL = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_INTERVAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nak Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakMaxImpl <em>Nak Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakMaxImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakMax()
	 * @generated
	 */
	int NAK_MAX = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_MAX__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nak Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_MAX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakTimeoutImpl <em>Nak Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakTimeoutImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakTimeout()
	 * @generated
	 */
	int NAK_TIMEOUT = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_TIMEOUT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nak Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAK_TIMEOUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TTLImpl <em>TTL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TTLImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTTL()
	 * @generated
	 */
	int TTL = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TTL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.RcvBufferSIzeImpl <em>Rcv Buffer SIze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.RcvBufferSIzeImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getRcvBufferSIze()
	 * @generated
	 */
	int RCV_BUFFER_SIZE = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCV_BUFFER_SIZE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Rcv Buffer SIze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCV_BUFFER_SIZE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl <em>Transport Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransportConfig()
	 * @generated
	 */
	int TRANSPORT_CONFIG = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transport Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONFIG__TRANSPORT_REF = 1;

	/**
	 * The feature id for the '<em><b>Passive connect duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Swap bytes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONFIG__SWAP_BYTES = 3;

	/**
	 * The number of structural features of the '<em>Transport Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl <em>Transport Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransportInst()
	 * @generated
	 */
	int TRANSPORT_INST = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Queue messages per pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL = 1;

	/**
	 * The feature id for the '<em><b>Queue initial pools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__QUEUE_INITIAL_POOLS = 2;

	/**
	 * The feature id for the '<em><b>Max packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__MAX_PACKET_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Max samples per packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__MAX_SAMPLES_PER_PACKET = 4;

	/**
	 * The feature id for the '<em><b>Optimum packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__OPTIMUM_PACKET_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Thread per connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__THREAD_PER_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Datalink release delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__DATALINK_RELEASE_DELAY = 7;

	/**
	 * The feature id for the '<em><b>Datalink control chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST__DATALINK_CONTROL_CHUNKS = 8;

	/**
	 * The number of structural features of the '<em>Transport Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INST_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.UdpTransportImpl <em>Udp Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.UdpTransportImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getUdpTransport()
	 * @generated
	 */
	int UDP_TRANSPORT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__NAME = TRANSPORT_INST__NAME;

	/**
	 * The feature id for the '<em><b>Queue messages per pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__QUEUE_MESSAGES_PER_POOL = TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL;

	/**
	 * The feature id for the '<em><b>Queue initial pools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__QUEUE_INITIAL_POOLS = TRANSPORT_INST__QUEUE_INITIAL_POOLS;

	/**
	 * The feature id for the '<em><b>Max packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__MAX_PACKET_SIZE = TRANSPORT_INST__MAX_PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Max samples per packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__MAX_SAMPLES_PER_PACKET = TRANSPORT_INST__MAX_SAMPLES_PER_PACKET;

	/**
	 * The feature id for the '<em><b>Optimum packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__OPTIMUM_PACKET_SIZE = TRANSPORT_INST__OPTIMUM_PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Thread per connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__THREAD_PER_CONNECTION = TRANSPORT_INST__THREAD_PER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Datalink release delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__DATALINK_RELEASE_DELAY = TRANSPORT_INST__DATALINK_RELEASE_DELAY;

	/**
	 * The feature id for the '<em><b>Datalink control chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__DATALINK_CONTROL_CHUNKS = TRANSPORT_INST__DATALINK_CONTROL_CHUNKS;

	/**
	 * The feature id for the '<em><b>Local address str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT__LOCAL_ADDRESS_STR = TRANSPORT_INST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Udp Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_TRANSPORT_FEATURE_COUNT = TRANSPORT_INST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl <em>Tcp Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTcpTransport()
	 * @generated
	 */
	int TCP_TRANSPORT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__NAME = TRANSPORT_INST__NAME;

	/**
	 * The feature id for the '<em><b>Queue messages per pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__QUEUE_MESSAGES_PER_POOL = TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL;

	/**
	 * The feature id for the '<em><b>Queue initial pools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__QUEUE_INITIAL_POOLS = TRANSPORT_INST__QUEUE_INITIAL_POOLS;

	/**
	 * The feature id for the '<em><b>Max packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__MAX_PACKET_SIZE = TRANSPORT_INST__MAX_PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Max samples per packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__MAX_SAMPLES_PER_PACKET = TRANSPORT_INST__MAX_SAMPLES_PER_PACKET;

	/**
	 * The feature id for the '<em><b>Optimum packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__OPTIMUM_PACKET_SIZE = TRANSPORT_INST__OPTIMUM_PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Thread per connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__THREAD_PER_CONNECTION = TRANSPORT_INST__THREAD_PER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Datalink release delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__DATALINK_RELEASE_DELAY = TRANSPORT_INST__DATALINK_RELEASE_DELAY;

	/**
	 * The feature id for the '<em><b>Datalink control chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__DATALINK_CONTROL_CHUNKS = TRANSPORT_INST__DATALINK_CONTROL_CHUNKS;

	/**
	 * The feature id for the '<em><b>Local address str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__LOCAL_ADDRESS_STR = TRANSPORT_INST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable nagle algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM = TRANSPORT_INST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conn retry initial delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY = TRANSPORT_INST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conn retry backoff multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER = TRANSPORT_INST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conn retry attempts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__CONN_RETRY_ATTEMPTS = TRANSPORT_INST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max output pause period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD = TRANSPORT_INST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Passive reconnect duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION = TRANSPORT_INST_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tcp Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_TRANSPORT_FEATURE_COUNT = TRANSPORT_INST_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl <em>Multicast Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMulticastTransport()
	 * @generated
	 */
	int MULTICAST_TRANSPORT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__NAME = TRANSPORT_INST__NAME;

	/**
	 * The feature id for the '<em><b>Queue messages per pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__QUEUE_MESSAGES_PER_POOL = TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL;

	/**
	 * The feature id for the '<em><b>Queue initial pools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__QUEUE_INITIAL_POOLS = TRANSPORT_INST__QUEUE_INITIAL_POOLS;

	/**
	 * The feature id for the '<em><b>Max packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__MAX_PACKET_SIZE = TRANSPORT_INST__MAX_PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Max samples per packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__MAX_SAMPLES_PER_PACKET = TRANSPORT_INST__MAX_SAMPLES_PER_PACKET;

	/**
	 * The feature id for the '<em><b>Optimum packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__OPTIMUM_PACKET_SIZE = TRANSPORT_INST__OPTIMUM_PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Thread per connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__THREAD_PER_CONNECTION = TRANSPORT_INST__THREAD_PER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Datalink release delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__DATALINK_RELEASE_DELAY = TRANSPORT_INST__DATALINK_RELEASE_DELAY;

	/**
	 * The feature id for the '<em><b>Datalink control chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__DATALINK_CONTROL_CHUNKS = TRANSPORT_INST__DATALINK_CONTROL_CHUNKS;

	/**
	 * The feature id for the '<em><b>Default to ipv6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__DEFAULT_TO_IPV6 = TRANSPORT_INST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__PORT_OFFSET = TRANSPORT_INST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__GROUP_ADDRESS = TRANSPORT_INST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reliable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__RELIABLE = TRANSPORT_INST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Syn backoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__SYN_BACKOFF = TRANSPORT_INST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Syn interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__SYN_INTERVAL = TRANSPORT_INST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Syn timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__SYN_TIMEOUT = TRANSPORT_INST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nak depth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__NAK_DEPTH = TRANSPORT_INST_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nak interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__NAK_INTERVAL = TRANSPORT_INST_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nak max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__NAK_MAX = TRANSPORT_INST_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Nak timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__NAK_TIMEOUT = TRANSPORT_INST_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__TTL = TRANSPORT_INST_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rcv buffer size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT__RCV_BUFFER_SIZE = TRANSPORT_INST_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Multicast Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_TRANSPORT_FEATURE_COUNT = TRANSPORT_INST_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportsImpl <em>Transports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportsImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransports()
	 * @generated
	 */
	int TRANSPORTS = 45;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTS__TRANSPORT = 0;

	/**
	 * The number of structural features of the '<em>Transports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportRefImpl <em>Transport Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportRefImpl
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransportRef()
	 * @generated
	 */
	int TRANSPORT_REF = 46;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_REF__TRANSPORT = 0;

	/**
	 * The number of structural features of the '<em>Transport Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_REF_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.CodeGen <em>Code Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Gen</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.CodeGen
	 * @generated
	 */
	EClass getCodeGen();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec <em>genspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>genspec</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec
	 * @generated
	 */
	EClass getgenspec();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSource()
	 * @see #getgenspec()
	 * @generated
	 */
	EReference getgenspec_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTarget()
	 * @see #getgenspec()
	 * @generated
	 */
	EReference getgenspec_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instances</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getInstances()
	 * @see #getgenspec()
	 * @generated
	 */
	EReference getgenspec_Instances();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSearchPaths <em>Search Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Paths</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getSearchPaths()
	 * @see #getgenspec()
	 * @generated
	 */
	EReference getgenspec_SearchPaths();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTransports <em>Transports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transports</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec#getTransports()
	 * @see #getgenspec()
	 * @generated
	 */
	EReference getgenspec_Transports();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile <em>Model File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model File</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile
	 * @generated
	 */
	EClass getModelFile();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile#getName()
	 * @see #getModelFile()
	 * @generated
	 */
	EAttribute getModelFile_Name();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir <em>Target Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Dir</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir
	 * @generated
	 */
	EClass getTargetDir();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir#getName()
	 * @see #getTargetDir()
	 * @generated
	 */
	EAttribute getTargetDir_Name();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths <em>Search Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Paths</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths
	 * @generated
	 */
	EClass getSearchPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths#getSearchLocation <em>Search Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Search Location</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths#getSearchLocation()
	 * @see #getSearchPaths()
	 * @generated
	 */
	EReference getSearchPaths_SearchLocation();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation <em>Search Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Location</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation
	 * @generated
	 */
	EClass getSearchLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation#getVariable()
	 * @see #getSearchLocation()
	 * @generated
	 */
	EReference getSearchLocation_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation#getPath()
	 * @see #getSearchLocation()
	 * @generated
	 */
	EReference getSearchLocation_Path();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable <em>Location Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Variable</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable
	 * @generated
	 */
	EClass getLocationVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable#getValue()
	 * @see #getLocationVariable()
	 * @generated
	 */
	EAttribute getLocationVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath <em>Location Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Path</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath
	 * @generated
	 */
	EClass getLocationPath();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath#getValue()
	 * @see #getLocationPath()
	 * @generated
	 */
	EAttribute getLocationPath_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instances</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instances
	 * @generated
	 */
	EClass getInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instances#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instances#getInstance()
	 * @see #getInstances()
	 * @generated
	 */
	EReference getInstances_Instance();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instance#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instance#getConfig()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Config();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes <em>Swap Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swap Bytes</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes
	 * @generated
	 */
	EClass getSwapBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes#isValue()
	 * @see #getSwapBytes()
	 * @generated
	 */
	EAttribute getSwapBytes_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool <em>Queue Messages Per Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Messages Per Pool</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool
	 * @generated
	 */
	EClass getQueueMessagesPerPool();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool#getValue()
	 * @see #getQueueMessagesPerPool()
	 * @generated
	 */
	EAttribute getQueueMessagesPerPool_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool <em>Queue Initial Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Initial Pool</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool
	 * @generated
	 */
	EClass getQueueInitialPool();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool#getValue()
	 * @see #getQueueInitialPool()
	 * @generated
	 */
	EAttribute getQueueInitialPool_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize <em>Max Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Packet Size</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize
	 * @generated
	 */
	EClass getMaxPacketSize();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize#getValue()
	 * @see #getMaxPacketSize()
	 * @generated
	 */
	EAttribute getMaxPacketSize_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket <em>Max Samples Per Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Samples Per Packet</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket
	 * @generated
	 */
	EClass getMaxSamplesPerPacket();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket#getValue()
	 * @see #getMaxSamplesPerPacket()
	 * @generated
	 */
	EAttribute getMaxSamplesPerPacket_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize <em>Optimum Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimum Packet Size</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize
	 * @generated
	 */
	EClass getOptimumPacketSize();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize#getValue()
	 * @see #getOptimumPacketSize()
	 * @generated
	 */
	EAttribute getOptimumPacketSize_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection <em>Thread Per Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Per Connection</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection
	 * @generated
	 */
	EClass getThreadPerConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection#isValue()
	 * @see #getThreadPerConnection()
	 * @generated
	 */
	EAttribute getThreadPerConnection_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay <em>Datalink Release Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datalink Release Delay</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay
	 * @generated
	 */
	EClass getDatalinkReleaseDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay#getValue()
	 * @see #getDatalinkReleaseDelay()
	 * @generated
	 */
	EAttribute getDatalinkReleaseDelay_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks <em>Datalink Control Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datalink Control Chunks</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks
	 * @generated
	 */
	EClass getDatalinkControlChunks();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks#getValue()
	 * @see #getDatalinkControlChunks()
	 * @generated
	 */
	EAttribute getDatalinkControlChunks_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString <em>Local Address String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Address String</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString
	 * @generated
	 */
	EClass getLocalAddressString();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString#getValue()
	 * @see #getLocalAddressString()
	 * @generated
	 */
	EAttribute getLocalAddressString_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm <em>Enable Nagle Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Nagle Algorithm</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm
	 * @generated
	 */
	EClass getEnableNagleAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm#isValue()
	 * @see #getEnableNagleAlgorithm()
	 * @generated
	 */
	EAttribute getEnableNagleAlgorithm_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay <em>Conn Retry Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conn Retry Initial Delay</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay
	 * @generated
	 */
	EClass getConnRetryInitialDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay#getValue()
	 * @see #getConnRetryInitialDelay()
	 * @generated
	 */
	EAttribute getConnRetryInitialDelay_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier <em>Conn Retry Backoff Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conn Retry Backoff Multiplier</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier
	 * @generated
	 */
	EClass getConnRetryBackoffMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier#getValue()
	 * @see #getConnRetryBackoffMultiplier()
	 * @generated
	 */
	EAttribute getConnRetryBackoffMultiplier_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts <em>Conn Retry Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conn Retry Attempts</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts
	 * @generated
	 */
	EClass getConnRetryAttempts();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts#getValue()
	 * @see #getConnRetryAttempts()
	 * @generated
	 */
	EAttribute getConnRetryAttempts_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod <em>Max Output Pause Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Output Pause Period</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod
	 * @generated
	 */
	EClass getMaxOutputPausePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod#getValue()
	 * @see #getMaxOutputPausePeriod()
	 * @generated
	 */
	EAttribute getMaxOutputPausePeriod_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration <em>Passive Reconnect Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Reconnect Duration</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration
	 * @generated
	 */
	EClass getPassiveReconnectDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration#getValue()
	 * @see #getPassiveReconnectDuration()
	 * @generated
	 */
	EAttribute getPassiveReconnectDuration_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration <em>Passive Connect Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Connect Duration</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration
	 * @generated
	 */
	EClass getPassiveConnectDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration#getValue()
	 * @see #getPassiveConnectDuration()
	 * @generated
	 */
	EAttribute getPassiveConnectDuration_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6 <em>Default To IPv6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default To IPv6</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6
	 * @generated
	 */
	EClass getDefaultToIPv6();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6#isValue()
	 * @see #getDefaultToIPv6()
	 * @generated
	 */
	EAttribute getDefaultToIPv6_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset <em>Port Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Offset</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset
	 * @generated
	 */
	EClass getPortOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset#getValue()
	 * @see #getPortOffset()
	 * @generated
	 */
	EAttribute getPortOffset_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress <em>Group Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Address</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress
	 * @generated
	 */
	EClass getGroupAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress#getValue()
	 * @see #getGroupAddress()
	 * @generated
	 */
	EAttribute getGroupAddress_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable <em>Reliable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliable</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable
	 * @generated
	 */
	EClass getReliable();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable#isValue()
	 * @see #getReliable()
	 * @generated
	 */
	EAttribute getReliable_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff <em>Syn Backoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syn Backoff</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff
	 * @generated
	 */
	EClass getSynBackoff();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff#getValue()
	 * @see #getSynBackoff()
	 * @generated
	 */
	EAttribute getSynBackoff_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval <em>Syn Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syn Interval</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval
	 * @generated
	 */
	EClass getSynInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval#getValue()
	 * @see #getSynInterval()
	 * @generated
	 */
	EAttribute getSynInterval_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout <em>Syn Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syn Timeout</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout
	 * @generated
	 */
	EClass getSynTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout#getValue()
	 * @see #getSynTimeout()
	 * @generated
	 */
	EAttribute getSynTimeout_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth <em>Nak Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nak Depth</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth
	 * @generated
	 */
	EClass getNakDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth#getValue()
	 * @see #getNakDepth()
	 * @generated
	 */
	EAttribute getNakDepth_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval <em>Nak Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nak Interval</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval
	 * @generated
	 */
	EClass getNakInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval#getValue()
	 * @see #getNakInterval()
	 * @generated
	 */
	EAttribute getNakInterval_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax <em>Nak Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nak Max</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax
	 * @generated
	 */
	EClass getNakMax();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax#getValue()
	 * @see #getNakMax()
	 * @generated
	 */
	EAttribute getNakMax_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout <em>Nak Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nak Timeout</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout
	 * @generated
	 */
	EClass getNakTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout#getValue()
	 * @see #getNakTimeout()
	 * @generated
	 */
	EAttribute getNakTimeout_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TTL <em>TTL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTL</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TTL
	 * @generated
	 */
	EClass getTTL();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TTL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TTL#getValue()
	 * @see #getTTL()
	 * @generated
	 */
	EAttribute getTTL_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze <em>Rcv Buffer SIze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rcv Buffer SIze</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze
	 * @generated
	 */
	EClass getRcvBufferSIze();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze#getValue()
	 * @see #getRcvBufferSIze()
	 * @generated
	 */
	EAttribute getRcvBufferSIze_Value();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig <em>Transport Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Config</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig
	 * @generated
	 */
	EClass getTransportConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getName()
	 * @see #getTransportConfig()
	 * @generated
	 */
	EAttribute getTransportConfig_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getTransportRef <em>Transport Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transport Ref</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getTransportRef()
	 * @see #getTransportConfig()
	 * @generated
	 */
	EReference getTransportConfig_TransportRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getPassive_connect_duration <em>Passive connect duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passive connect duration</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getPassive_connect_duration()
	 * @see #getTransportConfig()
	 * @generated
	 */
	EReference getTransportConfig_Passive_connect_duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getSwap_bytes <em>Swap bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swap bytes</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getSwap_bytes()
	 * @see #getTransportConfig()
	 * @generated
	 */
	EReference getTransportConfig_Swap_bytes();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst <em>Transport Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Inst</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst
	 * @generated
	 */
	EClass getTransportInst();

	/**
	 * Returns the meta object for the attribute '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getName()
	 * @see #getTransportInst()
	 * @generated
	 */
	EAttribute getTransportInst_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_messages_per_pool <em>Queue messages per pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue messages per pool</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_messages_per_pool()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Queue_messages_per_pool();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_initial_pools <em>Queue initial pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queue initial pools</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_initial_pools()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Queue_initial_pools();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_packet_size <em>Max packet size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max packet size</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_packet_size()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Max_packet_size();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_samples_per_packet <em>Max samples per packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max samples per packet</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_samples_per_packet()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Max_samples_per_packet();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getOptimum_packet_size <em>Optimum packet size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimum packet size</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getOptimum_packet_size()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Optimum_packet_size();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getThread_per_connection <em>Thread per connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thread per connection</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getThread_per_connection()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Thread_per_connection();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_release_delay <em>Datalink release delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datalink release delay</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_release_delay()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Datalink_release_delay();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_control_chunks <em>Datalink control chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datalink control chunks</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_control_chunks()
	 * @see #getTransportInst()
	 * @generated
	 */
	EReference getTransportInst_Datalink_control_chunks();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport <em>Udp Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Udp Transport</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport
	 * @generated
	 */
	EClass getUdpTransport();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport#getLocal_address_str <em>Local address str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local address str</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport#getLocal_address_str()
	 * @see #getUdpTransport()
	 * @generated
	 */
	EReference getUdpTransport_Local_address_str();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport <em>Tcp Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Transport</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport
	 * @generated
	 */
	EClass getTcpTransport();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getLocal_address_str <em>Local address str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local address str</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getLocal_address_str()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Local_address_str();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getEnable_nagle_algorithm <em>Enable nagle algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable nagle algorithm</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getEnable_nagle_algorithm()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Enable_nagle_algorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_initial_delay <em>Conn retry initial delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn retry initial delay</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_initial_delay()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Conn_retry_initial_delay();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_backoff_multiplier <em>Conn retry backoff multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn retry backoff multiplier</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_backoff_multiplier()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Conn_retry_backoff_multiplier();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_attempts <em>Conn retry attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn retry attempts</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_attempts()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Conn_retry_attempts();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getMax_output_pause_period <em>Max output pause period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max output pause period</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getMax_output_pause_period()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Max_output_pause_period();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getPassive_reconnect_duration <em>Passive reconnect duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passive reconnect duration</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getPassive_reconnect_duration()
	 * @see #getTcpTransport()
	 * @generated
	 */
	EReference getTcpTransport_Passive_reconnect_duration();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport <em>Multicast Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicast Transport</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport
	 * @generated
	 */
	EClass getMulticastTransport();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getDefault_to_ipv6 <em>Default to ipv6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default to ipv6</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getDefault_to_ipv6()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Default_to_ipv6();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getPort_offset <em>Port offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port offset</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getPort_offset()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Port_offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getGroup_address <em>Group address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group address</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getGroup_address()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Group_address();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getReliable <em>Reliable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliable</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getReliable()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Reliable();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_backoff <em>Syn backoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Syn backoff</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_backoff()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Syn_backoff();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_interval <em>Syn interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Syn interval</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_interval()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Syn_interval();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_timeout <em>Syn timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Syn timeout</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_timeout()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Syn_timeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_depth <em>Nak depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nak depth</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_depth()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Nak_depth();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_interval <em>Nak interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nak interval</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_interval()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Nak_interval();

	/**
	 * Returns the meta object for the reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_max <em>Nak max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nak max</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_max()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Nak_max();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_timeout <em>Nak timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nak timeout</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_timeout()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Nak_timeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getTtl <em>Ttl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ttl</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getTtl()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Ttl();

	/**
	 * Returns the meta object for the containment reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getRcv_buffer_size <em>Rcv buffer size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rcv buffer size</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getRcv_buffer_size()
	 * @see #getMulticastTransport()
	 * @generated
	 */
	EReference getMulticastTransport_Rcv_buffer_size();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Transports <em>Transports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transports</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Transports
	 * @generated
	 */
	EClass getTransports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Transports#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transport</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Transports#getTransport()
	 * @see #getTransports()
	 * @generated
	 */
	EReference getTransports_Transport();

	/**
	 * Returns the meta object for class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef <em>Transport Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Ref</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef
	 * @generated
	 */
	EClass getTransportRef();

	/**
	 * Returns the meta object for the reference '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transport</em>'.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef#getTransport()
	 * @see #getTransportRef()
	 * @generated
	 */
	EReference getTransportRef_Transport();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.CodeGenImpl <em>Code Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.CodeGenImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getCodeGen()
		 * @generated
		 */
		EClass CODE_GEN = eINSTANCE.getCodeGen();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl <em>genspec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getgenspec()
		 * @generated
		 */
		EClass GENSPEC = eINSTANCE.getgenspec();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENSPEC__SOURCE = eINSTANCE.getgenspec_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENSPEC__TARGET = eINSTANCE.getgenspec_Target();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENSPEC__INSTANCES = eINSTANCE.getgenspec_Instances();

		/**
		 * The meta object literal for the '<em><b>Search Paths</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENSPEC__SEARCH_PATHS = eINSTANCE.getgenspec_SearchPaths();

		/**
		 * The meta object literal for the '<em><b>Transports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENSPEC__TRANSPORTS = eINSTANCE.getgenspec_Transports();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ModelFileImpl <em>Model File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ModelFileImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getModelFile()
		 * @generated
		 */
		EClass MODEL_FILE = eINSTANCE.getModelFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FILE__NAME = eINSTANCE.getModelFile_Name();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TargetDirImpl <em>Target Dir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TargetDirImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTargetDir()
		 * @generated
		 */
		EClass TARGET_DIR = eINSTANCE.getTargetDir();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_DIR__NAME = eINSTANCE.getTargetDir_Name();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchPathsImpl <em>Search Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchPathsImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSearchPaths()
		 * @generated
		 */
		EClass SEARCH_PATHS = eINSTANCE.getSearchPaths();

		/**
		 * The meta object literal for the '<em><b>Search Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_PATHS__SEARCH_LOCATION = eINSTANCE.getSearchPaths_SearchLocation();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchLocationImpl <em>Search Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchLocationImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSearchLocation()
		 * @generated
		 */
		EClass SEARCH_LOCATION = eINSTANCE.getSearchLocation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_LOCATION__VARIABLE = eINSTANCE.getSearchLocation_Variable();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_LOCATION__PATH = eINSTANCE.getSearchLocation_Path();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationVariableImpl <em>Location Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationVariableImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getLocationVariable()
		 * @generated
		 */
		EClass LOCATION_VARIABLE = eINSTANCE.getLocationVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_VARIABLE__VALUE = eINSTANCE.getLocationVariable_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationPathImpl <em>Location Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocationPathImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getLocationPath()
		 * @generated
		 */
		EClass LOCATION_PATH = eINSTANCE.getLocationPath();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_PATH__VALUE = eINSTANCE.getLocationPath_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstancesImpl <em>Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstancesImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getInstances()
		 * @generated
		 */
		EClass INSTANCES = eINSTANCE.getInstances();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCES__INSTANCE = eINSTANCE.getInstances_Instance();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.InstanceImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CONFIG = eINSTANCE.getInstance_Config();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SwapBytesImpl <em>Swap Bytes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SwapBytesImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSwapBytes()
		 * @generated
		 */
		EClass SWAP_BYTES = eINSTANCE.getSwapBytes();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAP_BYTES__VALUE = eINSTANCE.getSwapBytes_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueMessagesPerPoolImpl <em>Queue Messages Per Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueMessagesPerPoolImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getQueueMessagesPerPool()
		 * @generated
		 */
		EClass QUEUE_MESSAGES_PER_POOL = eINSTANCE.getQueueMessagesPerPool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE_MESSAGES_PER_POOL__VALUE = eINSTANCE.getQueueMessagesPerPool_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueInitialPoolImpl <em>Queue Initial Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.QueueInitialPoolImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getQueueInitialPool()
		 * @generated
		 */
		EClass QUEUE_INITIAL_POOL = eINSTANCE.getQueueInitialPool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE_INITIAL_POOL__VALUE = eINSTANCE.getQueueInitialPool_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxPacketSizeImpl <em>Max Packet Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxPacketSizeImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMaxPacketSize()
		 * @generated
		 */
		EClass MAX_PACKET_SIZE = eINSTANCE.getMaxPacketSize();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_PACKET_SIZE__VALUE = eINSTANCE.getMaxPacketSize_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxSamplesPerPacketImpl <em>Max Samples Per Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxSamplesPerPacketImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMaxSamplesPerPacket()
		 * @generated
		 */
		EClass MAX_SAMPLES_PER_PACKET = eINSTANCE.getMaxSamplesPerPacket();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_SAMPLES_PER_PACKET__VALUE = eINSTANCE.getMaxSamplesPerPacket_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.OptimumPacketSizeImpl <em>Optimum Packet Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.OptimumPacketSizeImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getOptimumPacketSize()
		 * @generated
		 */
		EClass OPTIMUM_PACKET_SIZE = eINSTANCE.getOptimumPacketSize();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMUM_PACKET_SIZE__VALUE = eINSTANCE.getOptimumPacketSize_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ThreadPerConnectionImpl <em>Thread Per Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ThreadPerConnectionImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getThreadPerConnection()
		 * @generated
		 */
		EClass THREAD_PER_CONNECTION = eINSTANCE.getThreadPerConnection();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_PER_CONNECTION__VALUE = eINSTANCE.getThreadPerConnection_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkReleaseDelayImpl <em>Datalink Release Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkReleaseDelayImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getDatalinkReleaseDelay()
		 * @generated
		 */
		EClass DATALINK_RELEASE_DELAY = eINSTANCE.getDatalinkReleaseDelay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATALINK_RELEASE_DELAY__VALUE = eINSTANCE.getDatalinkReleaseDelay_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkControlChunksImpl <em>Datalink Control Chunks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DatalinkControlChunksImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getDatalinkControlChunks()
		 * @generated
		 */
		EClass DATALINK_CONTROL_CHUNKS = eINSTANCE.getDatalinkControlChunks();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATALINK_CONTROL_CHUNKS__VALUE = eINSTANCE.getDatalinkControlChunks_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocalAddressStringImpl <em>Local Address String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.LocalAddressStringImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getLocalAddressString()
		 * @generated
		 */
		EClass LOCAL_ADDRESS_STRING = eINSTANCE.getLocalAddressString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_ADDRESS_STRING__VALUE = eINSTANCE.getLocalAddressString_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.EnableNagleAlgorithmImpl <em>Enable Nagle Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.EnableNagleAlgorithmImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getEnableNagleAlgorithm()
		 * @generated
		 */
		EClass ENABLE_NAGLE_ALGORITHM = eINSTANCE.getEnableNagleAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_NAGLE_ALGORITHM__VALUE = eINSTANCE.getEnableNagleAlgorithm_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryInitialDelayImpl <em>Conn Retry Initial Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryInitialDelayImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getConnRetryInitialDelay()
		 * @generated
		 */
		EClass CONN_RETRY_INITIAL_DELAY = eINSTANCE.getConnRetryInitialDelay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONN_RETRY_INITIAL_DELAY__VALUE = eINSTANCE.getConnRetryInitialDelay_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryBackoffMultiplierImpl <em>Conn Retry Backoff Multiplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryBackoffMultiplierImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getConnRetryBackoffMultiplier()
		 * @generated
		 */
		EClass CONN_RETRY_BACKOFF_MULTIPLIER = eINSTANCE.getConnRetryBackoffMultiplier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONN_RETRY_BACKOFF_MULTIPLIER__VALUE = eINSTANCE.getConnRetryBackoffMultiplier_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryAttemptsImpl <em>Conn Retry Attempts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ConnRetryAttemptsImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getConnRetryAttempts()
		 * @generated
		 */
		EClass CONN_RETRY_ATTEMPTS = eINSTANCE.getConnRetryAttempts();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONN_RETRY_ATTEMPTS__VALUE = eINSTANCE.getConnRetryAttempts_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxOutputPausePeriodImpl <em>Max Output Pause Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MaxOutputPausePeriodImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMaxOutputPausePeriod()
		 * @generated
		 */
		EClass MAX_OUTPUT_PAUSE_PERIOD = eINSTANCE.getMaxOutputPausePeriod();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_OUTPUT_PAUSE_PERIOD__VALUE = eINSTANCE.getMaxOutputPausePeriod_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveReconnectDurationImpl <em>Passive Reconnect Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveReconnectDurationImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getPassiveReconnectDuration()
		 * @generated
		 */
		EClass PASSIVE_RECONNECT_DURATION = eINSTANCE.getPassiveReconnectDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSIVE_RECONNECT_DURATION__VALUE = eINSTANCE.getPassiveReconnectDuration_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveConnectDurationImpl <em>Passive Connect Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PassiveConnectDurationImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getPassiveConnectDuration()
		 * @generated
		 */
		EClass PASSIVE_CONNECT_DURATION = eINSTANCE.getPassiveConnectDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSIVE_CONNECT_DURATION__VALUE = eINSTANCE.getPassiveConnectDuration_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DefaultToIPv6Impl <em>Default To IPv6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.DefaultToIPv6Impl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getDefaultToIPv6()
		 * @generated
		 */
		EClass DEFAULT_TO_IPV6 = eINSTANCE.getDefaultToIPv6();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_TO_IPV6__VALUE = eINSTANCE.getDefaultToIPv6_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PortOffsetImpl <em>Port Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.PortOffsetImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getPortOffset()
		 * @generated
		 */
		EClass PORT_OFFSET = eINSTANCE.getPortOffset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_OFFSET__VALUE = eINSTANCE.getPortOffset_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GroupAddressImpl <em>Group Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GroupAddressImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getGroupAddress()
		 * @generated
		 */
		EClass GROUP_ADDRESS = eINSTANCE.getGroupAddress();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_ADDRESS__VALUE = eINSTANCE.getGroupAddress_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ReliableImpl <em>Reliable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.ReliableImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getReliable()
		 * @generated
		 */
		EClass RELIABLE = eINSTANCE.getReliable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE__VALUE = eINSTANCE.getReliable_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynBackoffImpl <em>Syn Backoff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynBackoffImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSynBackoff()
		 * @generated
		 */
		EClass SYN_BACKOFF = eINSTANCE.getSynBackoff();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYN_BACKOFF__VALUE = eINSTANCE.getSynBackoff_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynIntervalImpl <em>Syn Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynIntervalImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSynInterval()
		 * @generated
		 */
		EClass SYN_INTERVAL = eINSTANCE.getSynInterval();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYN_INTERVAL__VALUE = eINSTANCE.getSynInterval_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynTimeoutImpl <em>Syn Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SynTimeoutImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getSynTimeout()
		 * @generated
		 */
		EClass SYN_TIMEOUT = eINSTANCE.getSynTimeout();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYN_TIMEOUT__VALUE = eINSTANCE.getSynTimeout_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakDepthImpl <em>Nak Depth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakDepthImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakDepth()
		 * @generated
		 */
		EClass NAK_DEPTH = eINSTANCE.getNakDepth();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAK_DEPTH__VALUE = eINSTANCE.getNakDepth_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakIntervalImpl <em>Nak Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakIntervalImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakInterval()
		 * @generated
		 */
		EClass NAK_INTERVAL = eINSTANCE.getNakInterval();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAK_INTERVAL__VALUE = eINSTANCE.getNakInterval_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakMaxImpl <em>Nak Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakMaxImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakMax()
		 * @generated
		 */
		EClass NAK_MAX = eINSTANCE.getNakMax();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAK_MAX__VALUE = eINSTANCE.getNakMax_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakTimeoutImpl <em>Nak Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.NakTimeoutImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getNakTimeout()
		 * @generated
		 */
		EClass NAK_TIMEOUT = eINSTANCE.getNakTimeout();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAK_TIMEOUT__VALUE = eINSTANCE.getNakTimeout_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TTLImpl <em>TTL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TTLImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTTL()
		 * @generated
		 */
		EClass TTL = eINSTANCE.getTTL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTL__VALUE = eINSTANCE.getTTL_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.RcvBufferSIzeImpl <em>Rcv Buffer SIze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.RcvBufferSIzeImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getRcvBufferSIze()
		 * @generated
		 */
		EClass RCV_BUFFER_SIZE = eINSTANCE.getRcvBufferSIze();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCV_BUFFER_SIZE__VALUE = eINSTANCE.getRcvBufferSIze_Value();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl <em>Transport Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransportConfig()
		 * @generated
		 */
		EClass TRANSPORT_CONFIG = eINSTANCE.getTransportConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_CONFIG__NAME = eINSTANCE.getTransportConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Transport Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_CONFIG__TRANSPORT_REF = eINSTANCE.getTransportConfig_TransportRef();

		/**
		 * The meta object literal for the '<em><b>Passive connect duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION = eINSTANCE.getTransportConfig_Passive_connect_duration();

		/**
		 * The meta object literal for the '<em><b>Swap bytes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_CONFIG__SWAP_BYTES = eINSTANCE.getTransportConfig_Swap_bytes();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl <em>Transport Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransportInst()
		 * @generated
		 */
		EClass TRANSPORT_INST = eINSTANCE.getTransportInst();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_INST__NAME = eINSTANCE.getTransportInst_Name();

		/**
		 * The meta object literal for the '<em><b>Queue messages per pool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL = eINSTANCE.getTransportInst_Queue_messages_per_pool();

		/**
		 * The meta object literal for the '<em><b>Queue initial pools</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__QUEUE_INITIAL_POOLS = eINSTANCE.getTransportInst_Queue_initial_pools();

		/**
		 * The meta object literal for the '<em><b>Max packet size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__MAX_PACKET_SIZE = eINSTANCE.getTransportInst_Max_packet_size();

		/**
		 * The meta object literal for the '<em><b>Max samples per packet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__MAX_SAMPLES_PER_PACKET = eINSTANCE.getTransportInst_Max_samples_per_packet();

		/**
		 * The meta object literal for the '<em><b>Optimum packet size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__OPTIMUM_PACKET_SIZE = eINSTANCE.getTransportInst_Optimum_packet_size();

		/**
		 * The meta object literal for the '<em><b>Thread per connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__THREAD_PER_CONNECTION = eINSTANCE.getTransportInst_Thread_per_connection();

		/**
		 * The meta object literal for the '<em><b>Datalink release delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__DATALINK_RELEASE_DELAY = eINSTANCE.getTransportInst_Datalink_release_delay();

		/**
		 * The meta object literal for the '<em><b>Datalink control chunks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INST__DATALINK_CONTROL_CHUNKS = eINSTANCE.getTransportInst_Datalink_control_chunks();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.UdpTransportImpl <em>Udp Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.UdpTransportImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getUdpTransport()
		 * @generated
		 */
		EClass UDP_TRANSPORT = eINSTANCE.getUdpTransport();

		/**
		 * The meta object literal for the '<em><b>Local address str</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDP_TRANSPORT__LOCAL_ADDRESS_STR = eINSTANCE.getUdpTransport_Local_address_str();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl <em>Tcp Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTcpTransport()
		 * @generated
		 */
		EClass TCP_TRANSPORT = eINSTANCE.getTcpTransport();

		/**
		 * The meta object literal for the '<em><b>Local address str</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__LOCAL_ADDRESS_STR = eINSTANCE.getTcpTransport_Local_address_str();

		/**
		 * The meta object literal for the '<em><b>Enable nagle algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM = eINSTANCE.getTcpTransport_Enable_nagle_algorithm();

		/**
		 * The meta object literal for the '<em><b>Conn retry initial delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY = eINSTANCE.getTcpTransport_Conn_retry_initial_delay();

		/**
		 * The meta object literal for the '<em><b>Conn retry backoff multiplier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER = eINSTANCE
				.getTcpTransport_Conn_retry_backoff_multiplier();

		/**
		 * The meta object literal for the '<em><b>Conn retry attempts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__CONN_RETRY_ATTEMPTS = eINSTANCE.getTcpTransport_Conn_retry_attempts();

		/**
		 * The meta object literal for the '<em><b>Max output pause period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD = eINSTANCE.getTcpTransport_Max_output_pause_period();

		/**
		 * The meta object literal for the '<em><b>Passive reconnect duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION = eINSTANCE.getTcpTransport_Passive_reconnect_duration();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl <em>Multicast Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getMulticastTransport()
		 * @generated
		 */
		EClass MULTICAST_TRANSPORT = eINSTANCE.getMulticastTransport();

		/**
		 * The meta object literal for the '<em><b>Default to ipv6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__DEFAULT_TO_IPV6 = eINSTANCE.getMulticastTransport_Default_to_ipv6();

		/**
		 * The meta object literal for the '<em><b>Port offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__PORT_OFFSET = eINSTANCE.getMulticastTransport_Port_offset();

		/**
		 * The meta object literal for the '<em><b>Group address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__GROUP_ADDRESS = eINSTANCE.getMulticastTransport_Group_address();

		/**
		 * The meta object literal for the '<em><b>Reliable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__RELIABLE = eINSTANCE.getMulticastTransport_Reliable();

		/**
		 * The meta object literal for the '<em><b>Syn backoff</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__SYN_BACKOFF = eINSTANCE.getMulticastTransport_Syn_backoff();

		/**
		 * The meta object literal for the '<em><b>Syn interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__SYN_INTERVAL = eINSTANCE.getMulticastTransport_Syn_interval();

		/**
		 * The meta object literal for the '<em><b>Syn timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__SYN_TIMEOUT = eINSTANCE.getMulticastTransport_Syn_timeout();

		/**
		 * The meta object literal for the '<em><b>Nak depth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__NAK_DEPTH = eINSTANCE.getMulticastTransport_Nak_depth();

		/**
		 * The meta object literal for the '<em><b>Nak interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__NAK_INTERVAL = eINSTANCE.getMulticastTransport_Nak_interval();

		/**
		 * The meta object literal for the '<em><b>Nak max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__NAK_MAX = eINSTANCE.getMulticastTransport_Nak_max();

		/**
		 * The meta object literal for the '<em><b>Nak timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__NAK_TIMEOUT = eINSTANCE.getMulticastTransport_Nak_timeout();

		/**
		 * The meta object literal for the '<em><b>Ttl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__TTL = eINSTANCE.getMulticastTransport_Ttl();

		/**
		 * The meta object literal for the '<em><b>Rcv buffer size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTICAST_TRANSPORT__RCV_BUFFER_SIZE = eINSTANCE.getMulticastTransport_Rcv_buffer_size();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportsImpl <em>Transports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportsImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransports()
		 * @generated
		 */
		EClass TRANSPORTS = eINSTANCE.getTransports();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTS__TRANSPORT = eINSTANCE.getTransports_Transport();

		/**
		 * The meta object literal for the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportRefImpl <em>Transport Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportRefImpl
		 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorPackageImpl#getTransportRef()
		 * @generated
		 */
		EClass TRANSPORT_REF = eINSTANCE.getTransportRef();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_REF__TRANSPORT = eINSTANCE.getTransportRef_Transport();

	}

} //GeneratorPackage

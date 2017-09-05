/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.opendds.modeling.sdk.model.GeneratorSpecification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorFactoryImpl extends EFactoryImpl implements GeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorFactory init() {
		try {
			GeneratorFactory theGeneratorFactory = (GeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratorPackage.eNS_URI);
			if (theGeneratorFactory != null) {
				return theGeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactoryImpl() {
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
		case GeneratorPackage.CODE_GEN:
			return createCodeGen();
		case GeneratorPackage.GENSPEC:
			return creategenspec();
		case GeneratorPackage.MODEL_FILE:
			return createModelFile();
		case GeneratorPackage.TARGET_DIR:
			return createTargetDir();
		case GeneratorPackage.SEARCH_PATHS:
			return createSearchPaths();
		case GeneratorPackage.SEARCH_LOCATION:
			return createSearchLocation();
		case GeneratorPackage.LOCATION_VARIABLE:
			return createLocationVariable();
		case GeneratorPackage.LOCATION_PATH:
			return createLocationPath();
		case GeneratorPackage.INSTANCES:
			return createInstances();
		case GeneratorPackage.INSTANCE:
			return createInstance();
		case GeneratorPackage.SWAP_BYTES:
			return createSwapBytes();
		case GeneratorPackage.QUEUE_MESSAGES_PER_POOL:
			return createQueueMessagesPerPool();
		case GeneratorPackage.QUEUE_INITIAL_POOL:
			return createQueueInitialPool();
		case GeneratorPackage.MAX_PACKET_SIZE:
			return createMaxPacketSize();
		case GeneratorPackage.MAX_SAMPLES_PER_PACKET:
			return createMaxSamplesPerPacket();
		case GeneratorPackage.OPTIMUM_PACKET_SIZE:
			return createOptimumPacketSize();
		case GeneratorPackage.THREAD_PER_CONNECTION:
			return createThreadPerConnection();
		case GeneratorPackage.DATALINK_RELEASE_DELAY:
			return createDatalinkReleaseDelay();
		case GeneratorPackage.DATALINK_CONTROL_CHUNKS:
			return createDatalinkControlChunks();
		case GeneratorPackage.LOCAL_ADDRESS_STRING:
			return createLocalAddressString();
		case GeneratorPackage.ENABLE_NAGLE_ALGORITHM:
			return createEnableNagleAlgorithm();
		case GeneratorPackage.CONN_RETRY_INITIAL_DELAY:
			return createConnRetryInitialDelay();
		case GeneratorPackage.CONN_RETRY_BACKOFF_MULTIPLIER:
			return createConnRetryBackoffMultiplier();
		case GeneratorPackage.CONN_RETRY_ATTEMPTS:
			return createConnRetryAttempts();
		case GeneratorPackage.MAX_OUTPUT_PAUSE_PERIOD:
			return createMaxOutputPausePeriod();
		case GeneratorPackage.PASSIVE_RECONNECT_DURATION:
			return createPassiveReconnectDuration();
		case GeneratorPackage.PASSIVE_CONNECT_DURATION:
			return createPassiveConnectDuration();
		case GeneratorPackage.DEFAULT_TO_IPV6:
			return createDefaultToIPv6();
		case GeneratorPackage.PORT_OFFSET:
			return createPortOffset();
		case GeneratorPackage.GROUP_ADDRESS:
			return createGroupAddress();
		case GeneratorPackage.RELIABLE:
			return createReliable();
		case GeneratorPackage.SYN_BACKOFF:
			return createSynBackoff();
		case GeneratorPackage.SYN_INTERVAL:
			return createSynInterval();
		case GeneratorPackage.SYN_TIMEOUT:
			return createSynTimeout();
		case GeneratorPackage.NAK_DEPTH:
			return createNakDepth();
		case GeneratorPackage.NAK_INTERVAL:
			return createNakInterval();
		case GeneratorPackage.NAK_MAX:
			return createNakMax();
		case GeneratorPackage.NAK_TIMEOUT:
			return createNakTimeout();
		case GeneratorPackage.TTL:
			return createTTL();
		case GeneratorPackage.RCV_BUFFER_SIZE:
			return createRcvBufferSIze();
		case GeneratorPackage.TRANSPORT_CONFIG:
			return createTransportConfig();
		case GeneratorPackage.UDP_TRANSPORT:
			return createUdpTransport();
		case GeneratorPackage.TCP_TRANSPORT:
			return createTcpTransport();
		case GeneratorPackage.MULTICAST_TRANSPORT:
			return createMulticastTransport();
		case GeneratorPackage.TRANSPORTS:
			return createTransports();
		case GeneratorPackage.TRANSPORT_REF:
			return createTransportRef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGen createCodeGen() {
		CodeGenImpl codeGen = new CodeGenImpl();
		return codeGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public genspec creategenspec() {
		genspecImpl genspec = new genspecImpl();
		return genspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFile createModelFile() {
		ModelFileImpl modelFile = new ModelFileImpl();
		return modelFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetDir createTargetDir() {
		TargetDirImpl targetDir = new TargetDirImpl();
		return targetDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchPaths createSearchPaths() {
		SearchPathsImpl searchPaths = new SearchPathsImpl();
		return searchPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLocation createSearchLocation() {
		SearchLocationImpl searchLocation = new SearchLocationImpl();
		return searchLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVariable createLocationVariable() {
		LocationVariableImpl locationVariable = new LocationVariableImpl();
		return locationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPath createLocationPath() {
		LocationPathImpl locationPath = new LocationPathImpl();
		return locationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instances createInstances() {
		InstancesImpl instances = new InstancesImpl();
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwapBytes createSwapBytes() {
		SwapBytesImpl swapBytes = new SwapBytesImpl();
		return swapBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueMessagesPerPool createQueueMessagesPerPool() {
		QueueMessagesPerPoolImpl queueMessagesPerPool = new QueueMessagesPerPoolImpl();
		return queueMessagesPerPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueInitialPool createQueueInitialPool() {
		QueueInitialPoolImpl queueInitialPool = new QueueInitialPoolImpl();
		return queueInitialPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxPacketSize createMaxPacketSize() {
		MaxPacketSizeImpl maxPacketSize = new MaxPacketSizeImpl();
		return maxPacketSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxSamplesPerPacket createMaxSamplesPerPacket() {
		MaxSamplesPerPacketImpl maxSamplesPerPacket = new MaxSamplesPerPacketImpl();
		return maxSamplesPerPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimumPacketSize createOptimumPacketSize() {
		OptimumPacketSizeImpl optimumPacketSize = new OptimumPacketSizeImpl();
		return optimumPacketSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadPerConnection createThreadPerConnection() {
		ThreadPerConnectionImpl threadPerConnection = new ThreadPerConnectionImpl();
		return threadPerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatalinkReleaseDelay createDatalinkReleaseDelay() {
		DatalinkReleaseDelayImpl datalinkReleaseDelay = new DatalinkReleaseDelayImpl();
		return datalinkReleaseDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatalinkControlChunks createDatalinkControlChunks() {
		DatalinkControlChunksImpl datalinkControlChunks = new DatalinkControlChunksImpl();
		return datalinkControlChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAddressString createLocalAddressString() {
		LocalAddressStringImpl localAddressString = new LocalAddressStringImpl();
		return localAddressString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableNagleAlgorithm createEnableNagleAlgorithm() {
		EnableNagleAlgorithmImpl enableNagleAlgorithm = new EnableNagleAlgorithmImpl();
		return enableNagleAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnRetryInitialDelay createConnRetryInitialDelay() {
		ConnRetryInitialDelayImpl connRetryInitialDelay = new ConnRetryInitialDelayImpl();
		return connRetryInitialDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnRetryBackoffMultiplier createConnRetryBackoffMultiplier() {
		ConnRetryBackoffMultiplierImpl connRetryBackoffMultiplier = new ConnRetryBackoffMultiplierImpl();
		return connRetryBackoffMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnRetryAttempts createConnRetryAttempts() {
		ConnRetryAttemptsImpl connRetryAttempts = new ConnRetryAttemptsImpl();
		return connRetryAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxOutputPausePeriod createMaxOutputPausePeriod() {
		MaxOutputPausePeriodImpl maxOutputPausePeriod = new MaxOutputPausePeriodImpl();
		return maxOutputPausePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveReconnectDuration createPassiveReconnectDuration() {
		PassiveReconnectDurationImpl passiveReconnectDuration = new PassiveReconnectDurationImpl();
		return passiveReconnectDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveConnectDuration createPassiveConnectDuration() {
		PassiveConnectDurationImpl passiveConnectDuration = new PassiveConnectDurationImpl();
		return passiveConnectDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultToIPv6 createDefaultToIPv6() {
		DefaultToIPv6Impl defaultToIPv6 = new DefaultToIPv6Impl();
		return defaultToIPv6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortOffset createPortOffset() {
		PortOffsetImpl portOffset = new PortOffsetImpl();
		return portOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupAddress createGroupAddress() {
		GroupAddressImpl groupAddress = new GroupAddressImpl();
		return groupAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliable createReliable() {
		ReliableImpl reliable = new ReliableImpl();
		return reliable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynBackoff createSynBackoff() {
		SynBackoffImpl synBackoff = new SynBackoffImpl();
		return synBackoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynInterval createSynInterval() {
		SynIntervalImpl synInterval = new SynIntervalImpl();
		return synInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynTimeout createSynTimeout() {
		SynTimeoutImpl synTimeout = new SynTimeoutImpl();
		return synTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakDepth createNakDepth() {
		NakDepthImpl nakDepth = new NakDepthImpl();
		return nakDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakInterval createNakInterval() {
		NakIntervalImpl nakInterval = new NakIntervalImpl();
		return nakInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakMax createNakMax() {
		NakMaxImpl nakMax = new NakMaxImpl();
		return nakMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakTimeout createNakTimeout() {
		NakTimeoutImpl nakTimeout = new NakTimeoutImpl();
		return nakTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTL createTTL() {
		TTLImpl ttl = new TTLImpl();
		return ttl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcvBufferSIze createRcvBufferSIze() {
		RcvBufferSIzeImpl rcvBufferSIze = new RcvBufferSIzeImpl();
		return rcvBufferSIze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportConfig createTransportConfig() {
		TransportConfigImpl transportConfig = new TransportConfigImpl();
		return transportConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UdpTransport createUdpTransport() {
		UdpTransportImpl udpTransport = new UdpTransportImpl();
		return udpTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcpTransport createTcpTransport() {
		TcpTransportImpl tcpTransport = new TcpTransportImpl();
		return tcpTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticastTransport createMulticastTransport() {
		MulticastTransportImpl multicastTransport = new MulticastTransportImpl();
		return multicastTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transports createTransports() {
		TransportsImpl transports = new TransportsImpl();
		return transports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportRef createTransportRef() {
		TransportRefImpl transportRef = new TransportRefImpl();
		return transportRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorPackage getGeneratorPackage() {
		return (GeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratorPackage getPackage() {
		return GeneratorPackage.eINSTANCE;
	}

} //GeneratorFactoryImpl

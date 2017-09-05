/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.opendds.modeling.sdk.model.GeneratorSpecification.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage
 * @generated
 */
public class GeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorSwitch<Adapter> modelSwitch = new GeneratorSwitch<Adapter>() {
		@Override
		public Adapter caseCodeGen(CodeGen object) {
			return createCodeGenAdapter();
		}

		@Override
		public Adapter casegenspec(genspec object) {
			return creategenspecAdapter();
		}

		@Override
		public Adapter caseModelFile(ModelFile object) {
			return createModelFileAdapter();
		}

		@Override
		public Adapter caseTargetDir(TargetDir object) {
			return createTargetDirAdapter();
		}

		@Override
		public Adapter caseSearchPaths(SearchPaths object) {
			return createSearchPathsAdapter();
		}

		@Override
		public Adapter caseSearchLocation(SearchLocation object) {
			return createSearchLocationAdapter();
		}

		@Override
		public Adapter caseLocationVariable(LocationVariable object) {
			return createLocationVariableAdapter();
		}

		@Override
		public Adapter caseLocationPath(LocationPath object) {
			return createLocationPathAdapter();
		}

		@Override
		public Adapter caseInstances(Instances object) {
			return createInstancesAdapter();
		}

		@Override
		public Adapter caseInstance(Instance object) {
			return createInstanceAdapter();
		}

		@Override
		public Adapter caseSwapBytes(SwapBytes object) {
			return createSwapBytesAdapter();
		}

		@Override
		public Adapter caseQueueMessagesPerPool(QueueMessagesPerPool object) {
			return createQueueMessagesPerPoolAdapter();
		}

		@Override
		public Adapter caseQueueInitialPool(QueueInitialPool object) {
			return createQueueInitialPoolAdapter();
		}

		@Override
		public Adapter caseMaxPacketSize(MaxPacketSize object) {
			return createMaxPacketSizeAdapter();
		}

		@Override
		public Adapter caseMaxSamplesPerPacket(MaxSamplesPerPacket object) {
			return createMaxSamplesPerPacketAdapter();
		}

		@Override
		public Adapter caseOptimumPacketSize(OptimumPacketSize object) {
			return createOptimumPacketSizeAdapter();
		}

		@Override
		public Adapter caseThreadPerConnection(ThreadPerConnection object) {
			return createThreadPerConnectionAdapter();
		}

		@Override
		public Adapter caseDatalinkReleaseDelay(DatalinkReleaseDelay object) {
			return createDatalinkReleaseDelayAdapter();
		}

		@Override
		public Adapter caseDatalinkControlChunks(DatalinkControlChunks object) {
			return createDatalinkControlChunksAdapter();
		}

		@Override
		public Adapter caseLocalAddressString(LocalAddressString object) {
			return createLocalAddressStringAdapter();
		}

		@Override
		public Adapter caseEnableNagleAlgorithm(EnableNagleAlgorithm object) {
			return createEnableNagleAlgorithmAdapter();
		}

		@Override
		public Adapter caseConnRetryInitialDelay(ConnRetryInitialDelay object) {
			return createConnRetryInitialDelayAdapter();
		}

		@Override
		public Adapter caseConnRetryBackoffMultiplier(ConnRetryBackoffMultiplier object) {
			return createConnRetryBackoffMultiplierAdapter();
		}

		@Override
		public Adapter caseConnRetryAttempts(ConnRetryAttempts object) {
			return createConnRetryAttemptsAdapter();
		}

		@Override
		public Adapter caseMaxOutputPausePeriod(MaxOutputPausePeriod object) {
			return createMaxOutputPausePeriodAdapter();
		}

		@Override
		public Adapter casePassiveReconnectDuration(PassiveReconnectDuration object) {
			return createPassiveReconnectDurationAdapter();
		}

		@Override
		public Adapter casePassiveConnectDuration(PassiveConnectDuration object) {
			return createPassiveConnectDurationAdapter();
		}

		@Override
		public Adapter caseDefaultToIPv6(DefaultToIPv6 object) {
			return createDefaultToIPv6Adapter();
		}

		@Override
		public Adapter casePortOffset(PortOffset object) {
			return createPortOffsetAdapter();
		}

		@Override
		public Adapter caseGroupAddress(GroupAddress object) {
			return createGroupAddressAdapter();
		}

		@Override
		public Adapter caseReliable(Reliable object) {
			return createReliableAdapter();
		}

		@Override
		public Adapter caseSynBackoff(SynBackoff object) {
			return createSynBackoffAdapter();
		}

		@Override
		public Adapter caseSynInterval(SynInterval object) {
			return createSynIntervalAdapter();
		}

		@Override
		public Adapter caseSynTimeout(SynTimeout object) {
			return createSynTimeoutAdapter();
		}

		@Override
		public Adapter caseNakDepth(NakDepth object) {
			return createNakDepthAdapter();
		}

		@Override
		public Adapter caseNakInterval(NakInterval object) {
			return createNakIntervalAdapter();
		}

		@Override
		public Adapter caseNakMax(NakMax object) {
			return createNakMaxAdapter();
		}

		@Override
		public Adapter caseNakTimeout(NakTimeout object) {
			return createNakTimeoutAdapter();
		}

		@Override
		public Adapter caseTTL(TTL object) {
			return createTTLAdapter();
		}

		@Override
		public Adapter caseRcvBufferSIze(RcvBufferSIze object) {
			return createRcvBufferSIzeAdapter();
		}

		@Override
		public Adapter caseTransportConfig(TransportConfig object) {
			return createTransportConfigAdapter();
		}

		@Override
		public Adapter caseTransportInst(TransportInst object) {
			return createTransportInstAdapter();
		}

		@Override
		public Adapter caseUdpTransport(UdpTransport object) {
			return createUdpTransportAdapter();
		}

		@Override
		public Adapter caseTcpTransport(TcpTransport object) {
			return createTcpTransportAdapter();
		}

		@Override
		public Adapter caseMulticastTransport(MulticastTransport object) {
			return createMulticastTransportAdapter();
		}

		@Override
		public Adapter caseTransports(Transports object) {
			return createTransportsAdapter();
		}

		@Override
		public Adapter caseTransportRef(TransportRef object) {
			return createTransportRefAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.CodeGen <em>Code Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.CodeGen
	 * @generated
	 */
	public Adapter createCodeGenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.genspec <em>genspec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.genspec
	 * @generated
	 */
	public Adapter creategenspecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile <em>Model File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile
	 * @generated
	 */
	public Adapter createModelFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir <em>Target Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir
	 * @generated
	 */
	public Adapter createTargetDirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths <em>Search Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths
	 * @generated
	 */
	public Adapter createSearchPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation <em>Search Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation
	 * @generated
	 */
	public Adapter createSearchLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable <em>Location Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocationVariable
	 * @generated
	 */
	public Adapter createLocationVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath <em>Location Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocationPath
	 * @generated
	 */
	public Adapter createLocationPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instances
	 * @generated
	 */
	public Adapter createInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes <em>Swap Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes
	 * @generated
	 */
	public Adapter createSwapBytesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool <em>Queue Messages Per Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool
	 * @generated
	 */
	public Adapter createQueueMessagesPerPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool <em>Queue Initial Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool
	 * @generated
	 */
	public Adapter createQueueInitialPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize <em>Max Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize
	 * @generated
	 */
	public Adapter createMaxPacketSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket <em>Max Samples Per Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket
	 * @generated
	 */
	public Adapter createMaxSamplesPerPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize <em>Optimum Packet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize
	 * @generated
	 */
	public Adapter createOptimumPacketSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection <em>Thread Per Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection
	 * @generated
	 */
	public Adapter createThreadPerConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay <em>Datalink Release Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay
	 * @generated
	 */
	public Adapter createDatalinkReleaseDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks <em>Datalink Control Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks
	 * @generated
	 */
	public Adapter createDatalinkControlChunksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString <em>Local Address String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString
	 * @generated
	 */
	public Adapter createLocalAddressStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm <em>Enable Nagle Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm
	 * @generated
	 */
	public Adapter createEnableNagleAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay <em>Conn Retry Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay
	 * @generated
	 */
	public Adapter createConnRetryInitialDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier <em>Conn Retry Backoff Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier
	 * @generated
	 */
	public Adapter createConnRetryBackoffMultiplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts <em>Conn Retry Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts
	 * @generated
	 */
	public Adapter createConnRetryAttemptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod <em>Max Output Pause Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod
	 * @generated
	 */
	public Adapter createMaxOutputPausePeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration <em>Passive Reconnect Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration
	 * @generated
	 */
	public Adapter createPassiveReconnectDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration <em>Passive Connect Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration
	 * @generated
	 */
	public Adapter createPassiveConnectDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6 <em>Default To IPv6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6
	 * @generated
	 */
	public Adapter createDefaultToIPv6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset <em>Port Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset
	 * @generated
	 */
	public Adapter createPortOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress <em>Group Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress
	 * @generated
	 */
	public Adapter createGroupAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable <em>Reliable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable
	 * @generated
	 */
	public Adapter createReliableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff <em>Syn Backoff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff
	 * @generated
	 */
	public Adapter createSynBackoffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval <em>Syn Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval
	 * @generated
	 */
	public Adapter createSynIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout <em>Syn Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout
	 * @generated
	 */
	public Adapter createSynTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth <em>Nak Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth
	 * @generated
	 */
	public Adapter createNakDepthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval <em>Nak Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval
	 * @generated
	 */
	public Adapter createNakIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax <em>Nak Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax
	 * @generated
	 */
	public Adapter createNakMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout <em>Nak Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout
	 * @generated
	 */
	public Adapter createNakTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TTL <em>TTL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TTL
	 * @generated
	 */
	public Adapter createTTLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze <em>Rcv Buffer SIze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze
	 * @generated
	 */
	public Adapter createRcvBufferSIzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig <em>Transport Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig
	 * @generated
	 */
	public Adapter createTransportConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst <em>Transport Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst
	 * @generated
	 */
	public Adapter createTransportInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport <em>Udp Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport
	 * @generated
	 */
	public Adapter createUdpTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport <em>Tcp Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport
	 * @generated
	 */
	public Adapter createTcpTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport <em>Multicast Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport
	 * @generated
	 */
	public Adapter createMulticastTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Transports <em>Transports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.Transports
	 * @generated
	 */
	public Adapter createTransportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef <em>Transport Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef
	 * @generated
	 */
	public Adapter createTransportRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratorAdapterFactory

/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.opendds.modeling.sdk.model.GeneratorSpecification.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage
 * @generated
 */
public class GeneratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GeneratorPackage.CODE_GEN: {
			CodeGen codeGen = (CodeGen) theEObject;
			T result = caseCodeGen(codeGen);
			if (result == null)
				result = casegenspec(codeGen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GENSPEC: {
			genspec genspec = (genspec) theEObject;
			T result = casegenspec(genspec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MODEL_FILE: {
			ModelFile modelFile = (ModelFile) theEObject;
			T result = caseModelFile(modelFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TARGET_DIR: {
			TargetDir targetDir = (TargetDir) theEObject;
			T result = caseTargetDir(targetDir);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SEARCH_PATHS: {
			SearchPaths searchPaths = (SearchPaths) theEObject;
			T result = caseSearchPaths(searchPaths);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SEARCH_LOCATION: {
			SearchLocation searchLocation = (SearchLocation) theEObject;
			T result = caseSearchLocation(searchLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LOCATION_VARIABLE: {
			LocationVariable locationVariable = (LocationVariable) theEObject;
			T result = caseLocationVariable(locationVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LOCATION_PATH: {
			LocationPath locationPath = (LocationPath) theEObject;
			T result = caseLocationPath(locationPath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.INSTANCES: {
			Instances instances = (Instances) theEObject;
			T result = caseInstances(instances);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.INSTANCE: {
			Instance instance = (Instance) theEObject;
			T result = caseInstance(instance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SWAP_BYTES: {
			SwapBytes swapBytes = (SwapBytes) theEObject;
			T result = caseSwapBytes(swapBytes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUEUE_MESSAGES_PER_POOL: {
			QueueMessagesPerPool queueMessagesPerPool = (QueueMessagesPerPool) theEObject;
			T result = caseQueueMessagesPerPool(queueMessagesPerPool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.QUEUE_INITIAL_POOL: {
			QueueInitialPool queueInitialPool = (QueueInitialPool) theEObject;
			T result = caseQueueInitialPool(queueInitialPool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAX_PACKET_SIZE: {
			MaxPacketSize maxPacketSize = (MaxPacketSize) theEObject;
			T result = caseMaxPacketSize(maxPacketSize);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAX_SAMPLES_PER_PACKET: {
			MaxSamplesPerPacket maxSamplesPerPacket = (MaxSamplesPerPacket) theEObject;
			T result = caseMaxSamplesPerPacket(maxSamplesPerPacket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.OPTIMUM_PACKET_SIZE: {
			OptimumPacketSize optimumPacketSize = (OptimumPacketSize) theEObject;
			T result = caseOptimumPacketSize(optimumPacketSize);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.THREAD_PER_CONNECTION: {
			ThreadPerConnection threadPerConnection = (ThreadPerConnection) theEObject;
			T result = caseThreadPerConnection(threadPerConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.DATALINK_RELEASE_DELAY: {
			DatalinkReleaseDelay datalinkReleaseDelay = (DatalinkReleaseDelay) theEObject;
			T result = caseDatalinkReleaseDelay(datalinkReleaseDelay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.DATALINK_CONTROL_CHUNKS: {
			DatalinkControlChunks datalinkControlChunks = (DatalinkControlChunks) theEObject;
			T result = caseDatalinkControlChunks(datalinkControlChunks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.LOCAL_ADDRESS_STRING: {
			LocalAddressString localAddressString = (LocalAddressString) theEObject;
			T result = caseLocalAddressString(localAddressString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.ENABLE_NAGLE_ALGORITHM: {
			EnableNagleAlgorithm enableNagleAlgorithm = (EnableNagleAlgorithm) theEObject;
			T result = caseEnableNagleAlgorithm(enableNagleAlgorithm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CONN_RETRY_INITIAL_DELAY: {
			ConnRetryInitialDelay connRetryInitialDelay = (ConnRetryInitialDelay) theEObject;
			T result = caseConnRetryInitialDelay(connRetryInitialDelay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CONN_RETRY_BACKOFF_MULTIPLIER: {
			ConnRetryBackoffMultiplier connRetryBackoffMultiplier = (ConnRetryBackoffMultiplier) theEObject;
			T result = caseConnRetryBackoffMultiplier(connRetryBackoffMultiplier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.CONN_RETRY_ATTEMPTS: {
			ConnRetryAttempts connRetryAttempts = (ConnRetryAttempts) theEObject;
			T result = caseConnRetryAttempts(connRetryAttempts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MAX_OUTPUT_PAUSE_PERIOD: {
			MaxOutputPausePeriod maxOutputPausePeriod = (MaxOutputPausePeriod) theEObject;
			T result = caseMaxOutputPausePeriod(maxOutputPausePeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PASSIVE_RECONNECT_DURATION: {
			PassiveReconnectDuration passiveReconnectDuration = (PassiveReconnectDuration) theEObject;
			T result = casePassiveReconnectDuration(passiveReconnectDuration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PASSIVE_CONNECT_DURATION: {
			PassiveConnectDuration passiveConnectDuration = (PassiveConnectDuration) theEObject;
			T result = casePassiveConnectDuration(passiveConnectDuration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.DEFAULT_TO_IPV6: {
			DefaultToIPv6 defaultToIPv6 = (DefaultToIPv6) theEObject;
			T result = caseDefaultToIPv6(defaultToIPv6);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.PORT_OFFSET: {
			PortOffset portOffset = (PortOffset) theEObject;
			T result = casePortOffset(portOffset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.GROUP_ADDRESS: {
			GroupAddress groupAddress = (GroupAddress) theEObject;
			T result = caseGroupAddress(groupAddress);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RELIABLE: {
			Reliable reliable = (Reliable) theEObject;
			T result = caseReliable(reliable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SYN_BACKOFF: {
			SynBackoff synBackoff = (SynBackoff) theEObject;
			T result = caseSynBackoff(synBackoff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SYN_INTERVAL: {
			SynInterval synInterval = (SynInterval) theEObject;
			T result = caseSynInterval(synInterval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.SYN_TIMEOUT: {
			SynTimeout synTimeout = (SynTimeout) theEObject;
			T result = caseSynTimeout(synTimeout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.NAK_DEPTH: {
			NakDepth nakDepth = (NakDepth) theEObject;
			T result = caseNakDepth(nakDepth);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.NAK_INTERVAL: {
			NakInterval nakInterval = (NakInterval) theEObject;
			T result = caseNakInterval(nakInterval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.NAK_MAX: {
			NakMax nakMax = (NakMax) theEObject;
			T result = caseNakMax(nakMax);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.NAK_TIMEOUT: {
			NakTimeout nakTimeout = (NakTimeout) theEObject;
			T result = caseNakTimeout(nakTimeout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TTL: {
			TTL ttl = (TTL) theEObject;
			T result = caseTTL(ttl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.RCV_BUFFER_SIZE: {
			RcvBufferSIze rcvBufferSIze = (RcvBufferSIze) theEObject;
			T result = caseRcvBufferSIze(rcvBufferSIze);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TRANSPORT_CONFIG: {
			TransportConfig transportConfig = (TransportConfig) theEObject;
			T result = caseTransportConfig(transportConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TRANSPORT_INST: {
			TransportInst transportInst = (TransportInst) theEObject;
			T result = caseTransportInst(transportInst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.UDP_TRANSPORT: {
			UdpTransport udpTransport = (UdpTransport) theEObject;
			T result = caseUdpTransport(udpTransport);
			if (result == null)
				result = caseTransportInst(udpTransport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TCP_TRANSPORT: {
			TcpTransport tcpTransport = (TcpTransport) theEObject;
			T result = caseTcpTransport(tcpTransport);
			if (result == null)
				result = caseTransportInst(tcpTransport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.MULTICAST_TRANSPORT: {
			MulticastTransport multicastTransport = (MulticastTransport) theEObject;
			T result = caseMulticastTransport(multicastTransport);
			if (result == null)
				result = caseTransportInst(multicastTransport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TRANSPORTS: {
			Transports transports = (Transports) theEObject;
			T result = caseTransports(transports);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratorPackage.TRANSPORT_REF: {
			TransportRef transportRef = (TransportRef) theEObject;
			T result = caseTransportRef(transportRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Gen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Gen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeGen(CodeGen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>genspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>genspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegenspec(genspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFile(ModelFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Dir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Dir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetDir(TargetDir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Paths</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Paths</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchPaths(SearchPaths object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchLocation(SearchLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationVariable(LocationVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationPath(LocationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstances(Instances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swap Bytes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swap Bytes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwapBytes(SwapBytes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Messages Per Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Messages Per Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueMessagesPerPool(QueueMessagesPerPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Initial Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Initial Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueInitialPool(QueueInitialPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Packet Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Packet Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxPacketSize(MaxPacketSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Samples Per Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Samples Per Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxSamplesPerPacket(MaxSamplesPerPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimum Packet Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimum Packet Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimumPacketSize(OptimumPacketSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Per Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Per Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadPerConnection(ThreadPerConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datalink Release Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datalink Release Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatalinkReleaseDelay(DatalinkReleaseDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datalink Control Chunks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datalink Control Chunks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatalinkControlChunks(DatalinkControlChunks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Address String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Address String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalAddressString(LocalAddressString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Nagle Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Nagle Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableNagleAlgorithm(EnableNagleAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conn Retry Initial Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conn Retry Initial Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnRetryInitialDelay(ConnRetryInitialDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conn Retry Backoff Multiplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conn Retry Backoff Multiplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnRetryBackoffMultiplier(ConnRetryBackoffMultiplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conn Retry Attempts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conn Retry Attempts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnRetryAttempts(ConnRetryAttempts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Output Pause Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Output Pause Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxOutputPausePeriod(MaxOutputPausePeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Reconnect Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Reconnect Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveReconnectDuration(PassiveReconnectDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Connect Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Connect Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveConnectDuration(PassiveConnectDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default To IPv6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default To IPv6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultToIPv6(DefaultToIPv6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortOffset(PortOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupAddress(GroupAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliable(Reliable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syn Backoff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syn Backoff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynBackoff(SynBackoff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syn Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syn Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynInterval(SynInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syn Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syn Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynTimeout(SynTimeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nak Depth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nak Depth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNakDepth(NakDepth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nak Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nak Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNakInterval(NakInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nak Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nak Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNakMax(NakMax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nak Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nak Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNakTimeout(NakTimeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTL(TTL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rcv Buffer SIze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rcv Buffer SIze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRcvBufferSIze(RcvBufferSIze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportConfig(TransportConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportInst(TransportInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Udp Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Udp Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUdpTransport(UdpTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcp Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcp Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcpTransport(TcpTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicast Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicast Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticastTransport(MulticastTransport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransports(Transports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportRef(TransportRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GeneratorSwitch

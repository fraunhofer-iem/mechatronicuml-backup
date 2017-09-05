/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage
 * @generated
 */
public interface GeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorFactory eINSTANCE = org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.GeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Code Gen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Gen</em>'.
	 * @generated
	 */
	CodeGen createCodeGen();

	/**
	 * Returns a new object of class '<em>genspec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>genspec</em>'.
	 * @generated
	 */
	genspec creategenspec();

	/**
	 * Returns a new object of class '<em>Model File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model File</em>'.
	 * @generated
	 */
	ModelFile createModelFile();

	/**
	 * Returns a new object of class '<em>Target Dir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Dir</em>'.
	 * @generated
	 */
	TargetDir createTargetDir();

	/**
	 * Returns a new object of class '<em>Search Paths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Paths</em>'.
	 * @generated
	 */
	SearchPaths createSearchPaths();

	/**
	 * Returns a new object of class '<em>Search Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Location</em>'.
	 * @generated
	 */
	SearchLocation createSearchLocation();

	/**
	 * Returns a new object of class '<em>Location Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Variable</em>'.
	 * @generated
	 */
	LocationVariable createLocationVariable();

	/**
	 * Returns a new object of class '<em>Location Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Path</em>'.
	 * @generated
	 */
	LocationPath createLocationPath();

	/**
	 * Returns a new object of class '<em>Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instances</em>'.
	 * @generated
	 */
	Instances createInstances();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Swap Bytes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swap Bytes</em>'.
	 * @generated
	 */
	SwapBytes createSwapBytes();

	/**
	 * Returns a new object of class '<em>Queue Messages Per Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Messages Per Pool</em>'.
	 * @generated
	 */
	QueueMessagesPerPool createQueueMessagesPerPool();

	/**
	 * Returns a new object of class '<em>Queue Initial Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Initial Pool</em>'.
	 * @generated
	 */
	QueueInitialPool createQueueInitialPool();

	/**
	 * Returns a new object of class '<em>Max Packet Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Packet Size</em>'.
	 * @generated
	 */
	MaxPacketSize createMaxPacketSize();

	/**
	 * Returns a new object of class '<em>Max Samples Per Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Samples Per Packet</em>'.
	 * @generated
	 */
	MaxSamplesPerPacket createMaxSamplesPerPacket();

	/**
	 * Returns a new object of class '<em>Optimum Packet Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimum Packet Size</em>'.
	 * @generated
	 */
	OptimumPacketSize createOptimumPacketSize();

	/**
	 * Returns a new object of class '<em>Thread Per Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Per Connection</em>'.
	 * @generated
	 */
	ThreadPerConnection createThreadPerConnection();

	/**
	 * Returns a new object of class '<em>Datalink Release Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datalink Release Delay</em>'.
	 * @generated
	 */
	DatalinkReleaseDelay createDatalinkReleaseDelay();

	/**
	 * Returns a new object of class '<em>Datalink Control Chunks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datalink Control Chunks</em>'.
	 * @generated
	 */
	DatalinkControlChunks createDatalinkControlChunks();

	/**
	 * Returns a new object of class '<em>Local Address String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Address String</em>'.
	 * @generated
	 */
	LocalAddressString createLocalAddressString();

	/**
	 * Returns a new object of class '<em>Enable Nagle Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Nagle Algorithm</em>'.
	 * @generated
	 */
	EnableNagleAlgorithm createEnableNagleAlgorithm();

	/**
	 * Returns a new object of class '<em>Conn Retry Initial Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conn Retry Initial Delay</em>'.
	 * @generated
	 */
	ConnRetryInitialDelay createConnRetryInitialDelay();

	/**
	 * Returns a new object of class '<em>Conn Retry Backoff Multiplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conn Retry Backoff Multiplier</em>'.
	 * @generated
	 */
	ConnRetryBackoffMultiplier createConnRetryBackoffMultiplier();

	/**
	 * Returns a new object of class '<em>Conn Retry Attempts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conn Retry Attempts</em>'.
	 * @generated
	 */
	ConnRetryAttempts createConnRetryAttempts();

	/**
	 * Returns a new object of class '<em>Max Output Pause Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Output Pause Period</em>'.
	 * @generated
	 */
	MaxOutputPausePeriod createMaxOutputPausePeriod();

	/**
	 * Returns a new object of class '<em>Passive Reconnect Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Reconnect Duration</em>'.
	 * @generated
	 */
	PassiveReconnectDuration createPassiveReconnectDuration();

	/**
	 * Returns a new object of class '<em>Passive Connect Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Connect Duration</em>'.
	 * @generated
	 */
	PassiveConnectDuration createPassiveConnectDuration();

	/**
	 * Returns a new object of class '<em>Default To IPv6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default To IPv6</em>'.
	 * @generated
	 */
	DefaultToIPv6 createDefaultToIPv6();

	/**
	 * Returns a new object of class '<em>Port Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Offset</em>'.
	 * @generated
	 */
	PortOffset createPortOffset();

	/**
	 * Returns a new object of class '<em>Group Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Address</em>'.
	 * @generated
	 */
	GroupAddress createGroupAddress();

	/**
	 * Returns a new object of class '<em>Reliable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reliable</em>'.
	 * @generated
	 */
	Reliable createReliable();

	/**
	 * Returns a new object of class '<em>Syn Backoff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syn Backoff</em>'.
	 * @generated
	 */
	SynBackoff createSynBackoff();

	/**
	 * Returns a new object of class '<em>Syn Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syn Interval</em>'.
	 * @generated
	 */
	SynInterval createSynInterval();

	/**
	 * Returns a new object of class '<em>Syn Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syn Timeout</em>'.
	 * @generated
	 */
	SynTimeout createSynTimeout();

	/**
	 * Returns a new object of class '<em>Nak Depth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nak Depth</em>'.
	 * @generated
	 */
	NakDepth createNakDepth();

	/**
	 * Returns a new object of class '<em>Nak Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nak Interval</em>'.
	 * @generated
	 */
	NakInterval createNakInterval();

	/**
	 * Returns a new object of class '<em>Nak Max</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nak Max</em>'.
	 * @generated
	 */
	NakMax createNakMax();

	/**
	 * Returns a new object of class '<em>Nak Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nak Timeout</em>'.
	 * @generated
	 */
	NakTimeout createNakTimeout();

	/**
	 * Returns a new object of class '<em>TTL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTL</em>'.
	 * @generated
	 */
	TTL createTTL();

	/**
	 * Returns a new object of class '<em>Rcv Buffer SIze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rcv Buffer SIze</em>'.
	 * @generated
	 */
	RcvBufferSIze createRcvBufferSIze();

	/**
	 * Returns a new object of class '<em>Transport Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Config</em>'.
	 * @generated
	 */
	TransportConfig createTransportConfig();

	/**
	 * Returns a new object of class '<em>Udp Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Udp Transport</em>'.
	 * @generated
	 */
	UdpTransport createUdpTransport();

	/**
	 * Returns a new object of class '<em>Tcp Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcp Transport</em>'.
	 * @generated
	 */
	TcpTransport createTcpTransport();

	/**
	 * Returns a new object of class '<em>Multicast Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicast Transport</em>'.
	 * @generated
	 */
	MulticastTransport createMulticastTransport();

	/**
	 * Returns a new object of class '<em>Transports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transports</em>'.
	 * @generated
	 */
	Transports createTransports();

	/**
	 * Returns a new object of class '<em>Transport Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Ref</em>'.
	 * @generated
	 */
	TransportRef createTransportRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory

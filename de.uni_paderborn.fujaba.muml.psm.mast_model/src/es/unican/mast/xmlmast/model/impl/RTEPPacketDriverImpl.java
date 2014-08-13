/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.Assertion;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.OverheadType;
import es.unican.mast.xmlmast.model.RTEPPacketDriver;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTEP Packet Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getFailureTimeout <em>Failure Timeout</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getMessagePartitioning <em>Message Partitioning</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getNumberOfStations <em>Number Of Stations</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketDiscardOperation <em>Packet Discard Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketInterruptServer <em>Packet Interrupt Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketISROperation <em>Packet ISR Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketReceiveOperation <em>Packet Receive Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketRetransmissionOperation <em>Packet Retransmission Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketSendOperation <em>Packet Send Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketServer <em>Packet Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getPacketTransmissionRetries <em>Packet Transmission Retries</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getRTAOverheadModel <em>RTA Overhead Model</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getTokenCheckOperation <em>Token Check Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getTokenDelay <em>Token Delay</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getTokenManageOperation <em>Token Manage Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getTokenRetransmissionOperation <em>Token Retransmission Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RTEPPacketDriverImpl#getTokenTransmissionRetries <em>Token Transmission Retries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTEPPacketDriverImpl extends MinimalEObjectImpl.Container implements RTEPPacketDriver {
	/**
	 * The default value of the '{@link #getFailureTimeout() <em>Failure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final float FAILURE_TIMEOUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFailureTimeout() <em>Failure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureTimeout()
	 * @generated
	 * @ordered
	 */
	protected float failureTimeout = FAILURE_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Failure Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failureTimeoutESet;

	/**
	 * The default value of the '{@link #getMessagePartitioning() <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePartitioning()
	 * @generated
	 * @ordered
	 */
	protected static final Assertion MESSAGE_PARTITIONING_EDEFAULT = Assertion.YES;

	/**
	 * The cached value of the '{@link #getMessagePartitioning() <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePartitioning()
	 * @generated
	 * @ordered
	 */
	protected Assertion messagePartitioning = MESSAGE_PARTITIONING_EDEFAULT;

	/**
	 * This is true if the Message Partitioning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messagePartitioningESet;

	/**
	 * The default value of the '{@link #getNumberOfStations() <em>Number Of Stations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStations()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_STATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfStations() <em>Number Of Stations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStations()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfStations = NUMBER_OF_STATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketDiscardOperation() <em>Packet Discard Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketDiscardOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_DISCARD_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketDiscardOperation() <em>Packet Discard Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketDiscardOperation()
	 * @generated
	 * @ordered
	 */
	protected String packetDiscardOperation = PACKET_DISCARD_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketInterruptServer() <em>Packet Interrupt Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketInterruptServer()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_INTERRUPT_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketInterruptServer() <em>Packet Interrupt Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketInterruptServer()
	 * @generated
	 * @ordered
	 */
	protected String packetInterruptServer = PACKET_INTERRUPT_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketISROperation() <em>Packet ISR Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketISROperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_ISR_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketISROperation() <em>Packet ISR Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketISROperation()
	 * @generated
	 * @ordered
	 */
	protected String packetISROperation = PACKET_ISR_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketReceiveOperation() <em>Packet Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketReceiveOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_RECEIVE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketReceiveOperation() <em>Packet Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketReceiveOperation()
	 * @generated
	 * @ordered
	 */
	protected String packetReceiveOperation = PACKET_RECEIVE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketRetransmissionOperation() <em>Packet Retransmission Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketRetransmissionOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_RETRANSMISSION_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketRetransmissionOperation() <em>Packet Retransmission Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketRetransmissionOperation()
	 * @generated
	 * @ordered
	 */
	protected String packetRetransmissionOperation = PACKET_RETRANSMISSION_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketSendOperation() <em>Packet Send Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketSendOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_SEND_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketSendOperation() <em>Packet Send Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketSendOperation()
	 * @generated
	 * @ordered
	 */
	protected String packetSendOperation = PACKET_SEND_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketServer() <em>Packet Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketServer()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketServer() <em>Packet Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketServer()
	 * @generated
	 * @ordered
	 */
	protected String packetServer = PACKET_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketTransmissionRetries() <em>Packet Transmission Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketTransmissionRetries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PACKET_TRANSMISSION_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketTransmissionRetries() <em>Packet Transmission Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketTransmissionRetries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger packetTransmissionRetries = PACKET_TRANSMISSION_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRTAOverheadModel() <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTAOverheadModel()
	 * @generated
	 * @ordered
	 */
	protected static final OverheadType RTA_OVERHEAD_MODEL_EDEFAULT = OverheadType.COUPLED;

	/**
	 * The cached value of the '{@link #getRTAOverheadModel() <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTAOverheadModel()
	 * @generated
	 * @ordered
	 */
	protected OverheadType rTAOverheadModel = RTA_OVERHEAD_MODEL_EDEFAULT;

	/**
	 * This is true if the RTA Overhead Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rTAOverheadModelESet;

	/**
	 * The default value of the '{@link #getTokenCheckOperation() <em>Token Check Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenCheckOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_CHECK_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenCheckOperation() <em>Token Check Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenCheckOperation()
	 * @generated
	 * @ordered
	 */
	protected String tokenCheckOperation = TOKEN_CHECK_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenDelay() <em>Token Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float TOKEN_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTokenDelay() <em>Token Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenDelay()
	 * @generated
	 * @ordered
	 */
	protected float tokenDelay = TOKEN_DELAY_EDEFAULT;

	/**
	 * This is true if the Token Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tokenDelayESet;

	/**
	 * The default value of the '{@link #getTokenManageOperation() <em>Token Manage Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenManageOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_MANAGE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenManageOperation() <em>Token Manage Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenManageOperation()
	 * @generated
	 * @ordered
	 */
	protected String tokenManageOperation = TOKEN_MANAGE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenRetransmissionOperation() <em>Token Retransmission Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenRetransmissionOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_RETRANSMISSION_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenRetransmissionOperation() <em>Token Retransmission Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenRetransmissionOperation()
	 * @generated
	 * @ordered
	 */
	protected String tokenRetransmissionOperation = TOKEN_RETRANSMISSION_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenTransmissionRetries() <em>Token Transmission Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenTransmissionRetries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOKEN_TRANSMISSION_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenTransmissionRetries() <em>Token Transmission Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenTransmissionRetries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tokenTransmissionRetries = TOKEN_TRANSMISSION_RETRIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTEPPacketDriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RTEP_PACKET_DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFailureTimeout() {
		return failureTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureTimeout(float newFailureTimeout) {
		float oldFailureTimeout = failureTimeout;
		failureTimeout = newFailureTimeout;
		boolean oldFailureTimeoutESet = failureTimeoutESet;
		failureTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__FAILURE_TIMEOUT, oldFailureTimeout, failureTimeout, !oldFailureTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFailureTimeout() {
		float oldFailureTimeout = failureTimeout;
		boolean oldFailureTimeoutESet = failureTimeoutESet;
		failureTimeout = FAILURE_TIMEOUT_EDEFAULT;
		failureTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.RTEP_PACKET_DRIVER__FAILURE_TIMEOUT, oldFailureTimeout, FAILURE_TIMEOUT_EDEFAULT, oldFailureTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFailureTimeout() {
		return failureTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion getMessagePartitioning() {
		return messagePartitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePartitioning(Assertion newMessagePartitioning) {
		Assertion oldMessagePartitioning = messagePartitioning;
		messagePartitioning = newMessagePartitioning == null ? MESSAGE_PARTITIONING_EDEFAULT : newMessagePartitioning;
		boolean oldMessagePartitioningESet = messagePartitioningESet;
		messagePartitioningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING, oldMessagePartitioning, messagePartitioning, !oldMessagePartitioningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessagePartitioning() {
		Assertion oldMessagePartitioning = messagePartitioning;
		boolean oldMessagePartitioningESet = messagePartitioningESet;
		messagePartitioning = MESSAGE_PARTITIONING_EDEFAULT;
		messagePartitioningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING, oldMessagePartitioning, MESSAGE_PARTITIONING_EDEFAULT, oldMessagePartitioningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessagePartitioning() {
		return messagePartitioningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfStations() {
		return numberOfStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfStations(BigInteger newNumberOfStations) {
		BigInteger oldNumberOfStations = numberOfStations;
		numberOfStations = newNumberOfStations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS, oldNumberOfStations, numberOfStations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketDiscardOperation() {
		return packetDiscardOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketDiscardOperation(String newPacketDiscardOperation) {
		String oldPacketDiscardOperation = packetDiscardOperation;
		packetDiscardOperation = newPacketDiscardOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION, oldPacketDiscardOperation, packetDiscardOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketInterruptServer() {
		return packetInterruptServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketInterruptServer(String newPacketInterruptServer) {
		String oldPacketInterruptServer = packetInterruptServer;
		packetInterruptServer = newPacketInterruptServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER, oldPacketInterruptServer, packetInterruptServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketISROperation() {
		return packetISROperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketISROperation(String newPacketISROperation) {
		String oldPacketISROperation = packetISROperation;
		packetISROperation = newPacketISROperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION, oldPacketISROperation, packetISROperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketReceiveOperation() {
		return packetReceiveOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketReceiveOperation(String newPacketReceiveOperation) {
		String oldPacketReceiveOperation = packetReceiveOperation;
		packetReceiveOperation = newPacketReceiveOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION, oldPacketReceiveOperation, packetReceiveOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketRetransmissionOperation() {
		return packetRetransmissionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketRetransmissionOperation(String newPacketRetransmissionOperation) {
		String oldPacketRetransmissionOperation = packetRetransmissionOperation;
		packetRetransmissionOperation = newPacketRetransmissionOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION, oldPacketRetransmissionOperation, packetRetransmissionOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketSendOperation() {
		return packetSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketSendOperation(String newPacketSendOperation) {
		String oldPacketSendOperation = packetSendOperation;
		packetSendOperation = newPacketSendOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION, oldPacketSendOperation, packetSendOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketServer() {
		return packetServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketServer(String newPacketServer) {
		String oldPacketServer = packetServer;
		packetServer = newPacketServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_SERVER, oldPacketServer, packetServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPacketTransmissionRetries() {
		return packetTransmissionRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketTransmissionRetries(BigInteger newPacketTransmissionRetries) {
		BigInteger oldPacketTransmissionRetries = packetTransmissionRetries;
		packetTransmissionRetries = newPacketTransmissionRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES, oldPacketTransmissionRetries, packetTransmissionRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadType getRTAOverheadModel() {
		return rTAOverheadModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRTAOverheadModel(OverheadType newRTAOverheadModel) {
		OverheadType oldRTAOverheadModel = rTAOverheadModel;
		rTAOverheadModel = newRTAOverheadModel == null ? RTA_OVERHEAD_MODEL_EDEFAULT : newRTAOverheadModel;
		boolean oldRTAOverheadModelESet = rTAOverheadModelESet;
		rTAOverheadModelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL, oldRTAOverheadModel, rTAOverheadModel, !oldRTAOverheadModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRTAOverheadModel() {
		OverheadType oldRTAOverheadModel = rTAOverheadModel;
		boolean oldRTAOverheadModelESet = rTAOverheadModelESet;
		rTAOverheadModel = RTA_OVERHEAD_MODEL_EDEFAULT;
		rTAOverheadModelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL, oldRTAOverheadModel, RTA_OVERHEAD_MODEL_EDEFAULT, oldRTAOverheadModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRTAOverheadModel() {
		return rTAOverheadModelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenCheckOperation() {
		return tokenCheckOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenCheckOperation(String newTokenCheckOperation) {
		String oldTokenCheckOperation = tokenCheckOperation;
		tokenCheckOperation = newTokenCheckOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION, oldTokenCheckOperation, tokenCheckOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTokenDelay() {
		return tokenDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenDelay(float newTokenDelay) {
		float oldTokenDelay = tokenDelay;
		tokenDelay = newTokenDelay;
		boolean oldTokenDelayESet = tokenDelayESet;
		tokenDelayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__TOKEN_DELAY, oldTokenDelay, tokenDelay, !oldTokenDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTokenDelay() {
		float oldTokenDelay = tokenDelay;
		boolean oldTokenDelayESet = tokenDelayESet;
		tokenDelay = TOKEN_DELAY_EDEFAULT;
		tokenDelayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.RTEP_PACKET_DRIVER__TOKEN_DELAY, oldTokenDelay, TOKEN_DELAY_EDEFAULT, oldTokenDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTokenDelay() {
		return tokenDelayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenManageOperation() {
		return tokenManageOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenManageOperation(String newTokenManageOperation) {
		String oldTokenManageOperation = tokenManageOperation;
		tokenManageOperation = newTokenManageOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION, oldTokenManageOperation, tokenManageOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenRetransmissionOperation() {
		return tokenRetransmissionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenRetransmissionOperation(String newTokenRetransmissionOperation) {
		String oldTokenRetransmissionOperation = tokenRetransmissionOperation;
		tokenRetransmissionOperation = newTokenRetransmissionOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION, oldTokenRetransmissionOperation, tokenRetransmissionOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTokenTransmissionRetries() {
		return tokenTransmissionRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenTransmissionRetries(BigInteger newTokenTransmissionRetries) {
		BigInteger oldTokenTransmissionRetries = tokenTransmissionRetries;
		tokenTransmissionRetries = newTokenTransmissionRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES, oldTokenTransmissionRetries, tokenTransmissionRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RTEP_PACKET_DRIVER__FAILURE_TIMEOUT:
				return getFailureTimeout();
			case ModelPackage.RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING:
				return getMessagePartitioning();
			case ModelPackage.RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS:
				return getNumberOfStations();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION:
				return getPacketDiscardOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER:
				return getPacketInterruptServer();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION:
				return getPacketISROperation();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				return getPacketReceiveOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION:
				return getPacketRetransmissionOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION:
				return getPacketSendOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SERVER:
				return getPacketServer();
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES:
				return getPacketTransmissionRetries();
			case ModelPackage.RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				return getRTAOverheadModel();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION:
				return getTokenCheckOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_DELAY:
				return getTokenDelay();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION:
				return getTokenManageOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION:
				return getTokenRetransmissionOperation();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES:
				return getTokenTransmissionRetries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.RTEP_PACKET_DRIVER__FAILURE_TIMEOUT:
				setFailureTimeout((Float)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING:
				setMessagePartitioning((Assertion)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS:
				setNumberOfStations((BigInteger)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION:
				setPacketDiscardOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER:
				setPacketInterruptServer((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION:
				setPacketISROperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				setPacketReceiveOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION:
				setPacketRetransmissionOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION:
				setPacketSendOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SERVER:
				setPacketServer((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES:
				setPacketTransmissionRetries((BigInteger)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				setRTAOverheadModel((OverheadType)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION:
				setTokenCheckOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_DELAY:
				setTokenDelay((Float)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION:
				setTokenManageOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION:
				setTokenRetransmissionOperation((String)newValue);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES:
				setTokenTransmissionRetries((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.RTEP_PACKET_DRIVER__FAILURE_TIMEOUT:
				unsetFailureTimeout();
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING:
				unsetMessagePartitioning();
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS:
				setNumberOfStations(NUMBER_OF_STATIONS_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION:
				setPacketDiscardOperation(PACKET_DISCARD_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER:
				setPacketInterruptServer(PACKET_INTERRUPT_SERVER_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION:
				setPacketISROperation(PACKET_ISR_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				setPacketReceiveOperation(PACKET_RECEIVE_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION:
				setPacketRetransmissionOperation(PACKET_RETRANSMISSION_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION:
				setPacketSendOperation(PACKET_SEND_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SERVER:
				setPacketServer(PACKET_SERVER_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES:
				setPacketTransmissionRetries(PACKET_TRANSMISSION_RETRIES_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				unsetRTAOverheadModel();
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION:
				setTokenCheckOperation(TOKEN_CHECK_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_DELAY:
				unsetTokenDelay();
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION:
				setTokenManageOperation(TOKEN_MANAGE_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION:
				setTokenRetransmissionOperation(TOKEN_RETRANSMISSION_OPERATION_EDEFAULT);
				return;
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES:
				setTokenTransmissionRetries(TOKEN_TRANSMISSION_RETRIES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.RTEP_PACKET_DRIVER__FAILURE_TIMEOUT:
				return isSetFailureTimeout();
			case ModelPackage.RTEP_PACKET_DRIVER__MESSAGE_PARTITIONING:
				return isSetMessagePartitioning();
			case ModelPackage.RTEP_PACKET_DRIVER__NUMBER_OF_STATIONS:
				return NUMBER_OF_STATIONS_EDEFAULT == null ? numberOfStations != null : !NUMBER_OF_STATIONS_EDEFAULT.equals(numberOfStations);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_DISCARD_OPERATION:
				return PACKET_DISCARD_OPERATION_EDEFAULT == null ? packetDiscardOperation != null : !PACKET_DISCARD_OPERATION_EDEFAULT.equals(packetDiscardOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_INTERRUPT_SERVER:
				return PACKET_INTERRUPT_SERVER_EDEFAULT == null ? packetInterruptServer != null : !PACKET_INTERRUPT_SERVER_EDEFAULT.equals(packetInterruptServer);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_ISR_OPERATION:
				return PACKET_ISR_OPERATION_EDEFAULT == null ? packetISROperation != null : !PACKET_ISR_OPERATION_EDEFAULT.equals(packetISROperation);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				return PACKET_RECEIVE_OPERATION_EDEFAULT == null ? packetReceiveOperation != null : !PACKET_RECEIVE_OPERATION_EDEFAULT.equals(packetReceiveOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_RETRANSMISSION_OPERATION:
				return PACKET_RETRANSMISSION_OPERATION_EDEFAULT == null ? packetRetransmissionOperation != null : !PACKET_RETRANSMISSION_OPERATION_EDEFAULT.equals(packetRetransmissionOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SEND_OPERATION:
				return PACKET_SEND_OPERATION_EDEFAULT == null ? packetSendOperation != null : !PACKET_SEND_OPERATION_EDEFAULT.equals(packetSendOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_SERVER:
				return PACKET_SERVER_EDEFAULT == null ? packetServer != null : !PACKET_SERVER_EDEFAULT.equals(packetServer);
			case ModelPackage.RTEP_PACKET_DRIVER__PACKET_TRANSMISSION_RETRIES:
				return PACKET_TRANSMISSION_RETRIES_EDEFAULT == null ? packetTransmissionRetries != null : !PACKET_TRANSMISSION_RETRIES_EDEFAULT.equals(packetTransmissionRetries);
			case ModelPackage.RTEP_PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				return isSetRTAOverheadModel();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_CHECK_OPERATION:
				return TOKEN_CHECK_OPERATION_EDEFAULT == null ? tokenCheckOperation != null : !TOKEN_CHECK_OPERATION_EDEFAULT.equals(tokenCheckOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_DELAY:
				return isSetTokenDelay();
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_MANAGE_OPERATION:
				return TOKEN_MANAGE_OPERATION_EDEFAULT == null ? tokenManageOperation != null : !TOKEN_MANAGE_OPERATION_EDEFAULT.equals(tokenManageOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_RETRANSMISSION_OPERATION:
				return TOKEN_RETRANSMISSION_OPERATION_EDEFAULT == null ? tokenRetransmissionOperation != null : !TOKEN_RETRANSMISSION_OPERATION_EDEFAULT.equals(tokenRetransmissionOperation);
			case ModelPackage.RTEP_PACKET_DRIVER__TOKEN_TRANSMISSION_RETRIES:
				return TOKEN_TRANSMISSION_RETRIES_EDEFAULT == null ? tokenTransmissionRetries != null : !TOKEN_TRANSMISSION_RETRIES_EDEFAULT.equals(tokenTransmissionRetries);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (failureTimeout: ");
		if (failureTimeoutESet) result.append(failureTimeout); else result.append("<unset>");
		result.append(", messagePartitioning: ");
		if (messagePartitioningESet) result.append(messagePartitioning); else result.append("<unset>");
		result.append(", numberOfStations: ");
		result.append(numberOfStations);
		result.append(", packetDiscardOperation: ");
		result.append(packetDiscardOperation);
		result.append(", packetInterruptServer: ");
		result.append(packetInterruptServer);
		result.append(", packetISROperation: ");
		result.append(packetISROperation);
		result.append(", packetReceiveOperation: ");
		result.append(packetReceiveOperation);
		result.append(", packetRetransmissionOperation: ");
		result.append(packetRetransmissionOperation);
		result.append(", packetSendOperation: ");
		result.append(packetSendOperation);
		result.append(", packetServer: ");
		result.append(packetServer);
		result.append(", packetTransmissionRetries: ");
		result.append(packetTransmissionRetries);
		result.append(", rTAOverheadModel: ");
		if (rTAOverheadModelESet) result.append(rTAOverheadModel); else result.append("<unset>");
		result.append(", tokenCheckOperation: ");
		result.append(tokenCheckOperation);
		result.append(", tokenDelay: ");
		if (tokenDelayESet) result.append(tokenDelay); else result.append("<unset>");
		result.append(", tokenManageOperation: ");
		result.append(tokenManageOperation);
		result.append(", tokenRetransmissionOperation: ");
		result.append(tokenRetransmissionOperation);
		result.append(", tokenTransmissionRetries: ");
		result.append(tokenTransmissionRetries);
		result.append(')');
		return result.toString();
	}

} //RTEPPacketDriverImpl

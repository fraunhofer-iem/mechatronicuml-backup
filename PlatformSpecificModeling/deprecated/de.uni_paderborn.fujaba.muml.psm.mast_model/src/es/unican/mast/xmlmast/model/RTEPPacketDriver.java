/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTEP Packet Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getFailureTimeout <em>Failure Timeout</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getMessagePartitioning <em>Message Partitioning</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getNumberOfStations <em>Number Of Stations</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketDiscardOperation <em>Packet Discard Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketInterruptServer <em>Packet Interrupt Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketISROperation <em>Packet ISR Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketRetransmissionOperation <em>Packet Retransmission Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketServer <em>Packet Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketTransmissionRetries <em>Packet Transmission Retries</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenCheckOperation <em>Token Check Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenDelay <em>Token Delay</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenManageOperation <em>Token Manage Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenRetransmissionOperation <em>Token Retransmission Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenTransmissionRetries <em>Token Transmission Retries</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver()
 * @model extendedMetaData="name='RTEP_Packet_Driver' kind='empty'"
 * @generated
 */
public interface RTEPPacketDriver extends EObject {
	/**
	 * Returns the value of the '<em><b>Failure Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Timeout</em>' attribute.
	 * @see #isSetFailureTimeout()
	 * @see #unsetFailureTimeout()
	 * @see #setFailureTimeout(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_FailureTimeout()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Failure_Timeout'"
	 * @generated
	 */
	float getFailureTimeout();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getFailureTimeout <em>Failure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Timeout</em>' attribute.
	 * @see #isSetFailureTimeout()
	 * @see #unsetFailureTimeout()
	 * @see #getFailureTimeout()
	 * @generated
	 */
	void setFailureTimeout(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getFailureTimeout <em>Failure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailureTimeout()
	 * @see #getFailureTimeout()
	 * @see #setFailureTimeout(float)
	 * @generated
	 */
	void unsetFailureTimeout();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getFailureTimeout <em>Failure Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failure Timeout</em>' attribute is set.
	 * @see #unsetFailureTimeout()
	 * @see #getFailureTimeout()
	 * @see #setFailureTimeout(float)
	 * @generated
	 */
	boolean isSetFailureTimeout();

	/**
	 * Returns the value of the '<em><b>Message Partitioning</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Partitioning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Partitioning</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see #isSetMessagePartitioning()
	 * @see #unsetMessagePartitioning()
	 * @see #setMessagePartitioning(Assertion)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_MessagePartitioning()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Message_Partitioning'"
	 * @generated
	 */
	Assertion getMessagePartitioning();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getMessagePartitioning <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Partitioning</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.Assertion
	 * @see #isSetMessagePartitioning()
	 * @see #unsetMessagePartitioning()
	 * @see #getMessagePartitioning()
	 * @generated
	 */
	void setMessagePartitioning(Assertion value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getMessagePartitioning <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessagePartitioning()
	 * @see #getMessagePartitioning()
	 * @see #setMessagePartitioning(Assertion)
	 * @generated
	 */
	void unsetMessagePartitioning();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getMessagePartitioning <em>Message Partitioning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Partitioning</em>' attribute is set.
	 * @see #unsetMessagePartitioning()
	 * @see #getMessagePartitioning()
	 * @see #setMessagePartitioning(Assertion)
	 * @generated
	 */
	boolean isSetMessagePartitioning();

	/**
	 * Returns the value of the '<em><b>Number Of Stations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Stations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Stations</em>' attribute.
	 * @see #setNumberOfStations(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_NumberOfStations()
	 * @model dataType="es.unican.mast.xmlmast.model.Positive" required="true"
	 *        extendedMetaData="kind='attribute' name='Number_Of_Stations'"
	 * @generated
	 */
	BigInteger getNumberOfStations();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getNumberOfStations <em>Number Of Stations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Stations</em>' attribute.
	 * @see #getNumberOfStations()
	 * @generated
	 */
	void setNumberOfStations(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Packet Discard Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Discard Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Discard Operation</em>' attribute.
	 * @see #setPacketDiscardOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketDiscardOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Discard_Operation'"
	 * @generated
	 */
	String getPacketDiscardOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketDiscardOperation <em>Packet Discard Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Discard Operation</em>' attribute.
	 * @see #getPacketDiscardOperation()
	 * @generated
	 */
	void setPacketDiscardOperation(String value);

	/**
	 * Returns the value of the '<em><b>Packet Interrupt Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Interrupt Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Interrupt Server</em>' attribute.
	 * @see #setPacketInterruptServer(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketInterruptServer()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Interrupt_Server'"
	 * @generated
	 */
	String getPacketInterruptServer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketInterruptServer <em>Packet Interrupt Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Interrupt Server</em>' attribute.
	 * @see #getPacketInterruptServer()
	 * @generated
	 */
	void setPacketInterruptServer(String value);

	/**
	 * Returns the value of the '<em><b>Packet ISR Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet ISR Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet ISR Operation</em>' attribute.
	 * @see #setPacketISROperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketISROperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_ISR_Operation'"
	 * @generated
	 */
	String getPacketISROperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketISROperation <em>Packet ISR Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet ISR Operation</em>' attribute.
	 * @see #getPacketISROperation()
	 * @generated
	 */
	void setPacketISROperation(String value);

	/**
	 * Returns the value of the '<em><b>Packet Receive Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Receive Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Receive Operation</em>' attribute.
	 * @see #setPacketReceiveOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketReceiveOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Receive_Operation'"
	 * @generated
	 */
	String getPacketReceiveOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Receive Operation</em>' attribute.
	 * @see #getPacketReceiveOperation()
	 * @generated
	 */
	void setPacketReceiveOperation(String value);

	/**
	 * Returns the value of the '<em><b>Packet Retransmission Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Retransmission Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Retransmission Operation</em>' attribute.
	 * @see #setPacketRetransmissionOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketRetransmissionOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Retransmission_Operation'"
	 * @generated
	 */
	String getPacketRetransmissionOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketRetransmissionOperation <em>Packet Retransmission Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Retransmission Operation</em>' attribute.
	 * @see #getPacketRetransmissionOperation()
	 * @generated
	 */
	void setPacketRetransmissionOperation(String value);

	/**
	 * Returns the value of the '<em><b>Packet Send Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Send Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Send Operation</em>' attribute.
	 * @see #setPacketSendOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketSendOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Send_Operation'"
	 * @generated
	 */
	String getPacketSendOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Send Operation</em>' attribute.
	 * @see #getPacketSendOperation()
	 * @generated
	 */
	void setPacketSendOperation(String value);

	/**
	 * Returns the value of the '<em><b>Packet Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Server</em>' attribute.
	 * @see #setPacketServer(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketServer()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Packet_Server'"
	 * @generated
	 */
	String getPacketServer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketServer <em>Packet Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Server</em>' attribute.
	 * @see #getPacketServer()
	 * @generated
	 */
	void setPacketServer(String value);

	/**
	 * Returns the value of the '<em><b>Packet Transmission Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Transmission Retries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Transmission Retries</em>' attribute.
	 * @see #setPacketTransmissionRetries(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_PacketTransmissionRetries()
	 * @model dataType="es.unican.mast.xmlmast.model.Natural"
	 *        extendedMetaData="kind='attribute' name='Packet_Transmission_Retries'"
	 * @generated
	 */
	BigInteger getPacketTransmissionRetries();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getPacketTransmissionRetries <em>Packet Transmission Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Transmission Retries</em>' attribute.
	 * @see #getPacketTransmissionRetries()
	 * @generated
	 */
	void setPacketTransmissionRetries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>RTA Overhead Model</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.OverheadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTA Overhead Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTA Overhead Model</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.OverheadType
	 * @see #isSetRTAOverheadModel()
	 * @see #unsetRTAOverheadModel()
	 * @see #setRTAOverheadModel(OverheadType)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_RTAOverheadModel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='RTA_Overhead_Model'"
	 * @generated
	 */
	OverheadType getRTAOverheadModel();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTA Overhead Model</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.OverheadType
	 * @see #isSetRTAOverheadModel()
	 * @see #unsetRTAOverheadModel()
	 * @see #getRTAOverheadModel()
	 * @generated
	 */
	void setRTAOverheadModel(OverheadType value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRTAOverheadModel()
	 * @see #getRTAOverheadModel()
	 * @see #setRTAOverheadModel(OverheadType)
	 * @generated
	 */
	void unsetRTAOverheadModel();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RTA Overhead Model</em>' attribute is set.
	 * @see #unsetRTAOverheadModel()
	 * @see #getRTAOverheadModel()
	 * @see #setRTAOverheadModel(OverheadType)
	 * @generated
	 */
	boolean isSetRTAOverheadModel();

	/**
	 * Returns the value of the '<em><b>Token Check Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Check Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Check Operation</em>' attribute.
	 * @see #setTokenCheckOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_TokenCheckOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Token_Check_Operation'"
	 * @generated
	 */
	String getTokenCheckOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenCheckOperation <em>Token Check Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Check Operation</em>' attribute.
	 * @see #getTokenCheckOperation()
	 * @generated
	 */
	void setTokenCheckOperation(String value);

	/**
	 * Returns the value of the '<em><b>Token Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Delay</em>' attribute.
	 * @see #isSetTokenDelay()
	 * @see #unsetTokenDelay()
	 * @see #setTokenDelay(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_TokenDelay()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Token_Delay'"
	 * @generated
	 */
	float getTokenDelay();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenDelay <em>Token Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Delay</em>' attribute.
	 * @see #isSetTokenDelay()
	 * @see #unsetTokenDelay()
	 * @see #getTokenDelay()
	 * @generated
	 */
	void setTokenDelay(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenDelay <em>Token Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTokenDelay()
	 * @see #getTokenDelay()
	 * @see #setTokenDelay(float)
	 * @generated
	 */
	void unsetTokenDelay();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenDelay <em>Token Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Token Delay</em>' attribute is set.
	 * @see #unsetTokenDelay()
	 * @see #getTokenDelay()
	 * @see #setTokenDelay(float)
	 * @generated
	 */
	boolean isSetTokenDelay();

	/**
	 * Returns the value of the '<em><b>Token Manage Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Manage Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Manage Operation</em>' attribute.
	 * @see #setTokenManageOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_TokenManageOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Token_Manage_Operation'"
	 * @generated
	 */
	String getTokenManageOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenManageOperation <em>Token Manage Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Manage Operation</em>' attribute.
	 * @see #getTokenManageOperation()
	 * @generated
	 */
	void setTokenManageOperation(String value);

	/**
	 * Returns the value of the '<em><b>Token Retransmission Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Retransmission Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Retransmission Operation</em>' attribute.
	 * @see #setTokenRetransmissionOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_TokenRetransmissionOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Token_Retransmission_Operation'"
	 * @generated
	 */
	String getTokenRetransmissionOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenRetransmissionOperation <em>Token Retransmission Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Retransmission Operation</em>' attribute.
	 * @see #getTokenRetransmissionOperation()
	 * @generated
	 */
	void setTokenRetransmissionOperation(String value);

	/**
	 * Returns the value of the '<em><b>Token Transmission Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Transmission Retries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Transmission Retries</em>' attribute.
	 * @see #setTokenTransmissionRetries(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRTEPPacketDriver_TokenTransmissionRetries()
	 * @model dataType="es.unican.mast.xmlmast.model.Natural"
	 *        extendedMetaData="kind='attribute' name='Token_Transmission_Retries'"
	 * @generated
	 */
	BigInteger getTokenTransmissionRetries();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver#getTokenTransmissionRetries <em>Token Transmission Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Transmission Retries</em>' attribute.
	 * @see #getTokenTransmissionRetries()
	 * @generated
	 */
	void setTokenTransmissionRetries(BigInteger value);

} // RTEPPacketDriver

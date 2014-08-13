/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketDriver#getMessagePartitioning <em>Message Partitioning</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketServer <em>Packet Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketDriver()
 * @model extendedMetaData="name='Packet_Driver' kind='empty'"
 * @generated
 */
public interface PacketDriver extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketDriver_MessagePartitioning()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Message_Partitioning'"
	 * @generated
	 */
	Assertion getMessagePartitioning();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getMessagePartitioning <em>Message Partitioning</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getMessagePartitioning <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessagePartitioning()
	 * @see #getMessagePartitioning()
	 * @see #setMessagePartitioning(Assertion)
	 * @generated
	 */
	void unsetMessagePartitioning();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getMessagePartitioning <em>Message Partitioning</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Packet Receive Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Receive Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Receive Operation</em>' attribute.
	 * @see #setPacketReceiveOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketDriver_PacketReceiveOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Receive_Operation'"
	 * @generated
	 */
	String getPacketReceiveOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketReceiveOperation <em>Packet Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Receive Operation</em>' attribute.
	 * @see #getPacketReceiveOperation()
	 * @generated
	 */
	void setPacketReceiveOperation(String value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketDriver_PacketSendOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef"
	 *        extendedMetaData="kind='attribute' name='Packet_Send_Operation'"
	 * @generated
	 */
	String getPacketSendOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketSendOperation <em>Packet Send Operation</em>}' attribute.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketDriver_PacketServer()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Packet_Server'"
	 * @generated
	 */
	String getPacketServer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getPacketServer <em>Packet Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Server</em>' attribute.
	 * @see #getPacketServer()
	 * @generated
	 */
	void setPacketServer(String value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketDriver_RTAOverheadModel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='RTA_Overhead_Model'"
	 * @generated
	 */
	OverheadType getRTAOverheadModel();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRTAOverheadModel()
	 * @see #getRTAOverheadModel()
	 * @see #setRTAOverheadModel(OverheadType)
	 * @generated
	 */
	void unsetRTAOverheadModel();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketDriver#getRTAOverheadModel <em>RTA Overhead Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RTA Overhead Model</em>' attribute is set.
	 * @see #unsetRTAOverheadModel()
	 * @see #getRTAOverheadModel()
	 * @see #setRTAOverheadModel(OverheadType)
	 * @generated
	 */
	boolean isSetRTAOverheadModel();

} // PacketDriver

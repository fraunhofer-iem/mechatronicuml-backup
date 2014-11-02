/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet Based Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getListOfDrivers <em>List Of Drivers</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxBlocking <em>Max Blocking</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxPacketSize <em>Max Packet Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMinPacketSize <em>Min Packet Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getTransmission <em>Transmission</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork()
 * @model extendedMetaData="name='Packet_Based_Network' kind='elementOnly'"
 * @generated
 */
public interface PacketBasedNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>List Of Drivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Drivers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Drivers</em>' containment reference.
	 * @see #setListOfDrivers(ListOfDrivers)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_ListOfDrivers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='List_of_Drivers' namespace='##targetNamespace'"
	 * @generated
	 */
	ListOfDrivers getListOfDrivers();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getListOfDrivers <em>List Of Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Drivers</em>' containment reference.
	 * @see #getListOfDrivers()
	 * @generated
	 */
	void setListOfDrivers(ListOfDrivers value);

	/**
	 * Returns the value of the '<em><b>Max Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Blocking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Blocking</em>' attribute.
	 * @see #isSetMaxBlocking()
	 * @see #unsetMaxBlocking()
	 * @see #setMaxBlocking(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_MaxBlocking()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Max_Blocking'"
	 * @generated
	 */
	float getMaxBlocking();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxBlocking <em>Max Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Blocking</em>' attribute.
	 * @see #isSetMaxBlocking()
	 * @see #unsetMaxBlocking()
	 * @see #getMaxBlocking()
	 * @generated
	 */
	void setMaxBlocking(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxBlocking <em>Max Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxBlocking()
	 * @see #getMaxBlocking()
	 * @see #setMaxBlocking(float)
	 * @generated
	 */
	void unsetMaxBlocking();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxBlocking <em>Max Blocking</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Blocking</em>' attribute is set.
	 * @see #unsetMaxBlocking()
	 * @see #getMaxBlocking()
	 * @see #setMaxBlocking(float)
	 * @generated
	 */
	boolean isSetMaxBlocking();

	/**
	 * Returns the value of the '<em><b>Max Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Packet Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Packet Size</em>' attribute.
	 * @see #isSetMaxPacketSize()
	 * @see #unsetMaxPacketSize()
	 * @see #setMaxPacketSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_MaxPacketSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Max_Packet_Size'"
	 * @generated
	 */
	float getMaxPacketSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxPacketSize <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Packet Size</em>' attribute.
	 * @see #isSetMaxPacketSize()
	 * @see #unsetMaxPacketSize()
	 * @see #getMaxPacketSize()
	 * @generated
	 */
	void setMaxPacketSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxPacketSize <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxPacketSize()
	 * @see #getMaxPacketSize()
	 * @see #setMaxPacketSize(float)
	 * @generated
	 */
	void unsetMaxPacketSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMaxPacketSize <em>Max Packet Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Packet Size</em>' attribute is set.
	 * @see #unsetMaxPacketSize()
	 * @see #getMaxPacketSize()
	 * @see #setMaxPacketSize(float)
	 * @generated
	 */
	boolean isSetMaxPacketSize();

	/**
	 * Returns the value of the '<em><b>Min Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Packet Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Packet Size</em>' attribute.
	 * @see #isSetMinPacketSize()
	 * @see #unsetMinPacketSize()
	 * @see #setMinPacketSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_MinPacketSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Min_Packet_Size'"
	 * @generated
	 */
	float getMinPacketSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMinPacketSize <em>Min Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Packet Size</em>' attribute.
	 * @see #isSetMinPacketSize()
	 * @see #unsetMinPacketSize()
	 * @see #getMinPacketSize()
	 * @generated
	 */
	void setMinPacketSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMinPacketSize <em>Min Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinPacketSize()
	 * @see #getMinPacketSize()
	 * @see #setMinPacketSize(float)
	 * @generated
	 */
	void unsetMinPacketSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getMinPacketSize <em>Min Packet Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Packet Size</em>' attribute is set.
	 * @see #unsetMinPacketSize()
	 * @see #getMinPacketSize()
	 * @see #setMinPacketSize(float)
	 * @generated
	 */
	boolean isSetMinPacketSize();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #isSetSpeedFactor()
	 * @see #unsetSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_SpeedFactor()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Float"
	 *        extendedMetaData="kind='attribute' name='Speed_Factor'"
	 * @generated
	 */
	float getSpeedFactor();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #isSetSpeedFactor()
	 * @see #unsetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @generated
	 */
	void unsetSpeedFactor();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getSpeedFactor <em>Speed Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed Factor</em>' attribute is set.
	 * @see #unsetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @generated
	 */
	boolean isSetSpeedFactor();

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #isSetThroughput()
	 * @see #unsetThroughput()
	 * @see #setThroughput(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_Throughput()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Throughput"
	 *        extendedMetaData="kind='attribute' name='Throughput'"
	 * @generated
	 */
	float getThroughput();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #isSetThroughput()
	 * @see #unsetThroughput()
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThroughput()
	 * @see #getThroughput()
	 * @see #setThroughput(float)
	 * @generated
	 */
	void unsetThroughput();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getThroughput <em>Throughput</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Throughput</em>' attribute is set.
	 * @see #unsetThroughput()
	 * @see #getThroughput()
	 * @see #setThroughput(float)
	 * @generated
	 */
	boolean isSetThroughput();

	/**
	 * Returns the value of the '<em><b>Transmission</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.TransmissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.TransmissionType
	 * @see #isSetTransmission()
	 * @see #unsetTransmission()
	 * @see #setTransmission(TransmissionType)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getPacketBasedNetwork_Transmission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Transmission'"
	 * @generated
	 */
	TransmissionType getTransmission();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getTransmission <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.TransmissionType
	 * @see #isSetTransmission()
	 * @see #unsetTransmission()
	 * @see #getTransmission()
	 * @generated
	 */
	void setTransmission(TransmissionType value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getTransmission <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransmission()
	 * @see #getTransmission()
	 * @see #setTransmission(TransmissionType)
	 * @generated
	 */
	void unsetTransmission();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork#getTransmission <em>Transmission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transmission</em>' attribute is set.
	 * @see #unsetTransmission()
	 * @see #getTransmission()
	 * @see #setTransmission(TransmissionType)
	 * @generated
	 */
	boolean isSetTransmission();

} // PacketBasedNetwork

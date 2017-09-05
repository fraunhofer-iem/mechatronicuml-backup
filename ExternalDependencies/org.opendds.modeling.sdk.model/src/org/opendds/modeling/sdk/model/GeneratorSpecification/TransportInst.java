/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getName <em>Name</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_messages_per_pool <em>Queue messages per pool</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_initial_pools <em>Queue initial pools</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_packet_size <em>Max packet size</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_samples_per_packet <em>Max samples per packet</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getOptimum_packet_size <em>Optimum packet size</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getThread_per_connection <em>Thread per connection</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_release_delay <em>Datalink release delay</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_control_chunks <em>Datalink control chunks</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst()
 * @model abstract="true"
 * @generated
 */
public interface TransportInst extends EObject {
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
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Queue messages per pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue messages per pool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue messages per pool</em>' containment reference.
	 * @see #setQueue_messages_per_pool(QueueMessagesPerPool)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Queue_messages_per_pool()
	 * @model containment="true"
	 * @generated
	 */
	QueueMessagesPerPool getQueue_messages_per_pool();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_messages_per_pool <em>Queue messages per pool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue messages per pool</em>' containment reference.
	 * @see #getQueue_messages_per_pool()
	 * @generated
	 */
	void setQueue_messages_per_pool(QueueMessagesPerPool value);

	/**
	 * Returns the value of the '<em><b>Queue initial pools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue initial pools</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue initial pools</em>' containment reference.
	 * @see #setQueue_initial_pools(QueueInitialPool)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Queue_initial_pools()
	 * @model containment="true"
	 * @generated
	 */
	QueueInitialPool getQueue_initial_pools();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getQueue_initial_pools <em>Queue initial pools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue initial pools</em>' containment reference.
	 * @see #getQueue_initial_pools()
	 * @generated
	 */
	void setQueue_initial_pools(QueueInitialPool value);

	/**
	 * Returns the value of the '<em><b>Max packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max packet size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max packet size</em>' containment reference.
	 * @see #setMax_packet_size(MaxPacketSize)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Max_packet_size()
	 * @model containment="true"
	 * @generated
	 */
	MaxPacketSize getMax_packet_size();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_packet_size <em>Max packet size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max packet size</em>' containment reference.
	 * @see #getMax_packet_size()
	 * @generated
	 */
	void setMax_packet_size(MaxPacketSize value);

	/**
	 * Returns the value of the '<em><b>Max samples per packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max samples per packet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max samples per packet</em>' containment reference.
	 * @see #setMax_samples_per_packet(MaxSamplesPerPacket)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Max_samples_per_packet()
	 * @model containment="true"
	 * @generated
	 */
	MaxSamplesPerPacket getMax_samples_per_packet();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getMax_samples_per_packet <em>Max samples per packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max samples per packet</em>' containment reference.
	 * @see #getMax_samples_per_packet()
	 * @generated
	 */
	void setMax_samples_per_packet(MaxSamplesPerPacket value);

	/**
	 * Returns the value of the '<em><b>Optimum packet size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimum packet size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimum packet size</em>' containment reference.
	 * @see #setOptimum_packet_size(OptimumPacketSize)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Optimum_packet_size()
	 * @model containment="true"
	 * @generated
	 */
	OptimumPacketSize getOptimum_packet_size();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getOptimum_packet_size <em>Optimum packet size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimum packet size</em>' containment reference.
	 * @see #getOptimum_packet_size()
	 * @generated
	 */
	void setOptimum_packet_size(OptimumPacketSize value);

	/**
	 * Returns the value of the '<em><b>Thread per connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread per connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread per connection</em>' containment reference.
	 * @see #setThread_per_connection(ThreadPerConnection)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Thread_per_connection()
	 * @model containment="true"
	 * @generated
	 */
	ThreadPerConnection getThread_per_connection();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getThread_per_connection <em>Thread per connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread per connection</em>' containment reference.
	 * @see #getThread_per_connection()
	 * @generated
	 */
	void setThread_per_connection(ThreadPerConnection value);

	/**
	 * Returns the value of the '<em><b>Datalink release delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datalink release delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datalink release delay</em>' containment reference.
	 * @see #setDatalink_release_delay(DatalinkReleaseDelay)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Datalink_release_delay()
	 * @model containment="true"
	 * @generated
	 */
	DatalinkReleaseDelay getDatalink_release_delay();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_release_delay <em>Datalink release delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datalink release delay</em>' containment reference.
	 * @see #getDatalink_release_delay()
	 * @generated
	 */
	void setDatalink_release_delay(DatalinkReleaseDelay value);

	/**
	 * Returns the value of the '<em><b>Datalink control chunks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datalink control chunks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datalink control chunks</em>' containment reference.
	 * @see #setDatalink_control_chunks(DatalinkControlChunks)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportInst_Datalink_control_chunks()
	 * @model containment="true"
	 * @generated
	 */
	DatalinkControlChunks getDatalink_control_chunks();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst#getDatalink_control_chunks <em>Datalink control chunks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datalink control chunks</em>' containment reference.
	 * @see #getDatalink_control_chunks()
	 * @generated
	 */
	void setDatalink_control_chunks(DatalinkControlChunks value);

} // TransportInst

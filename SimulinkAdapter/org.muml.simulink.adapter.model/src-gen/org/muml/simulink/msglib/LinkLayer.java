/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib;

import org.muml.simulink.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LinkLayer needs to have the following ports:
 * InPortBlocks:
 * 1. port_in
 * 2. net_address
 * 3. receiver_net_address
 * 4. read_event_queue_in
 * 5. read_event_param_queue_in
 * 6. read_event_queue_out
 * 7. read_event_param_queue_out
 * 
 * OutPortBlocks:
 * 1. port_out
 * 2. write_event_queue_in
 * 3. write_event_param_queue_in
 * 4. write_event_queue_out
 * 5. write_event_param_queue_out
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#getDelayMin <em>Delay Min</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#getDelayMax <em>Delay Max</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#getMessageLossProbability <em>Message Loss Probability</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#isMessageRetransmission <em>Message Retransmission</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#isBufferOverflowPossible <em>Buffer Overflow Possible</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#getSourceBufferSize <em>Source Buffer Size</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.LinkLayer#getMessageMapping <em>Message Mapping</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer()
 * @model
 * @generated
 */
public interface LinkLayer extends Block {

	/**
	 * Returns the value of the '<em><b>Delay Min</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimal delay for every message. The attribute is a string,
	 * because it is defined as an expression in MechatronicUML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay Min</em>' attribute.
	 * @see #setDelayMin(String)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_DelayMin()
	 * @model default="2" required="true"
	 * @generated
	 */
	String getDelayMin();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#getDelayMin <em>Delay Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Min</em>' attribute.
	 * @see #getDelayMin()
	 * @generated
	 */
	void setDelayMin(String value);

	/**
	 * Returns the value of the '<em><b>Delay Max</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximal delay for every message. If a message needed more time than
	 * the maximal delay to be transmitted, it is dropped. The attribute is a string,
	 * because it is defined as an expression in MechatronicUML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay Max</em>' attribute.
	 * @see #setDelayMax(String)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_DelayMax()
	 * @model default="100" required="true"
	 * @generated
	 */
	String getDelayMax();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#getDelayMax <em>Delay Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Max</em>' attribute.
	 * @see #getDelayMax()
	 * @generated
	 */
	void setDelayMax(String value);

	/**
	 * Returns the value of the '<em><b>Message Loss Probability</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The probability for a message to be lost. [0, 100]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Loss Probability</em>' attribute.
	 * @see #setMessageLossProbability(int)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_MessageLossProbability()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMessageLossProbability();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#getMessageLossProbability <em>Message Loss Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Loss Probability</em>' attribute.
	 * @see #getMessageLossProbability()
	 * @generated
	 */
	void setMessageLossProbability(int value);

	/**
	 * Returns the value of the '<em><b>Message Retransmission</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a message loss is detected, whether it should be sent again or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Retransmission</em>' attribute.
	 * @see #setMessageRetransmission(boolean)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_MessageRetransmission()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMessageRetransmission();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#isMessageRetransmission <em>Message Retransmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Retransmission</em>' attribute.
	 * @see #isMessageRetransmission()
	 * @generated
	 */
	void setMessageRetransmission(boolean value);

	/**
	 * Returns the value of the '<em><b>Buffer Overflow Possible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether buffer overflows are desired/possible or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Overflow Possible</em>' attribute.
	 * @see #setBufferOverflowPossible(boolean)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_BufferOverflowPossible()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isBufferOverflowPossible();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#isBufferOverflowPossible <em>Buffer Overflow Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Overflow Possible</em>' attribute.
	 * @see #isBufferOverflowPossible()
	 * @generated
	 */
	void setBufferOverflowPossible(boolean value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_BufferSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Source Buffer Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Buffer Size</em>' attribute.
	 * @see #setSourceBufferSize(int)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_SourceBufferSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getSourceBufferSize();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#getSourceBufferSize <em>Source Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Buffer Size</em>' attribute.
	 * @see #getSourceBufferSize()
	 * @generated
	 */
	void setSourceBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Message Mapping</b></em>' attribute.
	 * The default value is <code>"[1 1; 2 1]"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Mapping</em>' attribute.
	 * @see #setMessageMapping(String)
	 * @see org.muml.simulink.msglib.MsglibPackage#getLinkLayer_MessageMapping()
	 * @model default="[1 1; 2 1]" required="true"
	 * @generated
	 */
	String getMessageMapping();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.LinkLayer#getMessageMapping <em>Message Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Mapping</em>' attribute.
	 * @see #getMessageMapping()
	 * @generated
	 */
	void setMessageMapping(String value);

} // LinkLayer

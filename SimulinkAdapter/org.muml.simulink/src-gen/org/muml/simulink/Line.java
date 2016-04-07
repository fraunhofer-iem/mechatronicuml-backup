/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.Line#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.muml.simulink.Line#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.muml.simulink.Line#getSourceBlock <em>Source Block</em>}</li>
 *   <li>{@link org.muml.simulink.Line#getTargetBlock <em>Target Block</em>}</li>
 *   <li>{@link org.muml.simulink.Line#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends Element {
	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(OutPortBlock)
	 * @see org.muml.simulink.SimulinkPackage#getLine_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	OutPortBlock getSourcePort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Line#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' reference.
	 * @see #setTargetPort(InPortBlock)
	 * @see org.muml.simulink.SimulinkPackage#getLine_TargetPort()
	 * @model required="true"
	 * @generated
	 */
	InPortBlock getTargetPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Line#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Source Block</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.Block#getOutgoingLines <em>Outgoing Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Block</em>' reference.
	 * @see #setSourceBlock(Block)
	 * @see org.muml.simulink.SimulinkPackage#getLine_SourceBlock()
	 * @see org.muml.simulink.Block#getOutgoingLines
	 * @model opposite="outgoingLines" required="true"
	 * @generated
	 */
	Block getSourceBlock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Line#getSourceBlock <em>Source Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Block</em>' reference.
	 * @see #getSourceBlock()
	 * @generated
	 */
	void setSourceBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Target Block</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.Block#getIncomingLines <em>Incoming Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Block</em>' reference.
	 * @see #setTargetBlock(Block)
	 * @see org.muml.simulink.SimulinkPackage#getLine_TargetBlock()
	 * @see org.muml.simulink.Block#getIncomingLines
	 * @model opposite="incomingLines" required="true"
	 * @generated
	 */
	Block getTargetBlock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Line#getTargetBlock <em>Target Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Block</em>' reference.
	 * @see #getTargetBlock()
	 * @generated
	 */
	void setTargetBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see org.muml.simulink.SimulinkPackage#getLine_Bus()
	 * @model
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Line#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

} // Line

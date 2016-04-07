/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.Block#getParent <em>Parent</em>}</li>
 *   <li>{@link org.muml.simulink.Block#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.Block#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link org.muml.simulink.Block#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link org.muml.simulink.Block#getIncomingLines <em>Incoming Lines</em>}</li>
 *   <li>{@link org.muml.simulink.Block#getOutgoingLines <em>Outgoing Lines</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends Element {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.SubSystem#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SubSystem)
	 * @see org.muml.simulink.SimulinkPackage#getBlock_Parent()
	 * @see org.muml.simulink.SubSystem#getBlocks
	 * @model opposite="blocks" transient="false"
	 * @generated
	 */
	SubSystem getParent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Block#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SubSystem value);

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
	 * @see org.muml.simulink.SimulinkPackage#getBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Block#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.OutPortBlock}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.OutPortBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ports</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getBlock_OutPorts()
	 * @see org.muml.simulink.OutPortBlock#getBlock
	 * @model opposite="block" containment="true" changeable="false"
	 * @generated
	 */
	EList<OutPortBlock> getOutPorts();

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.InPortBlock}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.InPortBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getBlock_InPorts()
	 * @see org.muml.simulink.InPortBlock#getBlock
	 * @model opposite="block" containment="true" changeable="false"
	 * @generated
	 */
	EList<InPortBlock> getInPorts();

	/**
	 * Returns the value of the '<em><b>Incoming Lines</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.Line}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.Line#getTargetBlock <em>Target Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Lines</em>' reference list.
	 * @see org.muml.simulink.SimulinkPackage#getBlock_IncomingLines()
	 * @see org.muml.simulink.Line#getTargetBlock
	 * @model opposite="targetBlock"
	 * @generated
	 */
	EList<Line> getIncomingLines();

	/**
	 * Returns the value of the '<em><b>Outgoing Lines</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.Line}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.Line#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Lines</em>' reference list.
	 * @see org.muml.simulink.SimulinkPackage#getBlock_OutgoingLines()
	 * @see org.muml.simulink.Line#getSourceBlock
	 * @model opposite="sourceBlock"
	 * @generated
	 */
	EList<Line> getOutgoingLines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\n\t\t\t\tif self.parent.oclIsUndefined() then\n\t\t\t\t\tself.name\n\t\t\t\telse\n\t\t\t\t\tself.parent.getFullyQualifiedName().concat(\'/\').concat(self.name)\n\t\t\t\tendif'"
	 * @generated
	 */
	String getFullyQualifiedName();

} // Block

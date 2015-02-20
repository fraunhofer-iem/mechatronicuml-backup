/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.Block#getParent <em>Parent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.Block#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.Block#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.Block#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.Block#getIncomingLines <em>Incoming Lines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.Block#getOutgoingLines <em>Outgoing Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends Element {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.SubSystem#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SubSystem)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock_Parent()
	 * @see de.uni_paderborn.fujaba.simulink.model.SubSystem#getBlocks
	 * @model opposite="blocks" transient="false"
	 * @generated
	 */
	SubSystem getParent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.Block#getParent <em>Parent</em>}' container reference.
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
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.Block#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.OutPortBlock}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.OutPortBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock_OutPorts()
	 * @see de.uni_paderborn.fujaba.simulink.model.OutPortBlock#getBlock
	 * @model opposite="block" containment="true" changeable="false"
	 * @generated
	 */
	EList<OutPortBlock> getOutPorts();

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.InPortBlock}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.InPortBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock_InPorts()
	 * @see de.uni_paderborn.fujaba.simulink.model.InPortBlock#getBlock
	 * @model opposite="block" containment="true" changeable="false"
	 * @generated
	 */
	EList<InPortBlock> getInPorts();

	/**
	 * Returns the value of the '<em><b>Incoming Lines</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.Line}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.Line#getTargetBlock <em>Target Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Lines</em>' reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock_IncomingLines()
	 * @see de.uni_paderborn.fujaba.simulink.model.Line#getTargetBlock
	 * @model opposite="targetBlock"
	 * @generated
	 */
	EList<Line> getIncomingLines();

	/**
	 * Returns the value of the '<em><b>Outgoing Lines</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.Line}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.Line#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Lines</em>' reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBlock_OutgoingLines()
	 * @see de.uni_paderborn.fujaba.simulink.model.Line#getSourceBlock
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

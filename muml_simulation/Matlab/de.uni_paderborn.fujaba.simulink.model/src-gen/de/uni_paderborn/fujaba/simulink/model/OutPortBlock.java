/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Port Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.OutPortBlock#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getOutPortBlock()
 * @model
 * @generated
 */
public interface OutPortBlock extends PortBlock {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.Block#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(Block)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getOutPortBlock_Block()
	 * @see de.uni_paderborn.fujaba.simulink.model.Block#getOutPorts
	 * @model opposite="outPorts" required="true" transient="false"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.OutPortBlock#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // OutPortBlock

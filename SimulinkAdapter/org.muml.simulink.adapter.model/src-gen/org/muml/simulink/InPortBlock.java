/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Port Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.InPortBlock#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getInPortBlock()
 * @model
 * @generated
 */
public interface InPortBlock extends PortBlock {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.Block#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(Block)
	 * @see org.muml.simulink.SimulinkPackage#getInPortBlock_Block()
	 * @see org.muml.simulink.Block#getInPorts
	 * @model opposite="inPorts" required="true" transient="false"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.InPortBlock#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // InPortBlock

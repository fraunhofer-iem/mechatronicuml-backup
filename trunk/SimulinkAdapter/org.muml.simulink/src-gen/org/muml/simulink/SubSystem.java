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
 * A representation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.SubSystem#getLines <em>Lines</em>}</li>
 *   <li>{@link org.muml.simulink.SubSystem#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.muml.simulink.SubSystem#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link org.muml.simulink.SubSystem#getAllBlocks <em>All Blocks</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getSubSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoPortsInBlocks InPortInSubSystemNeedsOutPort OutPortInSubSystemNeedsInPort onlySingleTriggerPort onlySingleEnablePort'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoPortsInBlocks='\n\t\t\tself.blocks->forAll(p| not p.oclIsTypeOf(InPortBlock) and not p.oclIsTypeOf(OutPortBlock))' InPortInSubSystemNeedsOutPort='self.inPorts->select(p| p.oclIsTypeOf(InPortBlock))->forAll(p| p.outPorts->size() = 1)' OutPortInSubSystemNeedsInPort='\n\t\t\tself.outPorts->forAll(p| p.inPorts->size() = 1)' onlySingleTriggerPort='self.inPorts->select(p|p.oclIsTypeOf(TriggerPort))->size() <= 1' onlySingleEnablePort='self.inPorts->select(p|p.oclIsTypeOf(EnablePort))->size() <= 1'"
 * @generated
 */
public interface SubSystem extends Block {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getSubSystem_Lines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.Block}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.Block#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getSubSystem_Blocks()
	 * @see org.muml.simulink.Block#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

	/**
	 * Returns the value of the '<em><b>Sub Systems</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Systems</em>' reference list.
	 * @see org.muml.simulink.SimulinkPackage#getSubSystem_SubSystems()
	 * @model changeable="false" derived="true"
	 *        extendedMetaData="namespace=''"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.blocks->select(b | b.oclIsTypeOf(SubSystem))->collect(b | b.oclAsType(SubSystem))->asOrderedSet()'"
	 * @generated
	 */
	EList<SubSystem> getSubSystems();

	/**
	 * Returns the value of the '<em><b>All Blocks</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * allBlacks = blocks  + inPorts + outPorts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Blocks</em>' reference list.
	 * @see org.muml.simulink.SimulinkPackage#getSubSystem_AllBlocks()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.blocks->union(self.inPorts)->union(self.outPorts)->asOrderedSet()'"
	 * @generated
	 */
	EList<Block> getAllBlocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(name.isEmpty())\n\treturn this;\nint firstSlash = name.indexOf(\"/\");\n\nif(firstSlash != -1)\n{\n\tfinal String rootName = name.substring(0, firstSlash);\n\tfinal String childName = name.substring(firstSlash+1);\n\tBlock root = this.getBlockByName(rootName);\n\tif(root instanceof SubSystem)\n\t\treturn ((SubSystem)root).getBlockByName(childName);\n}\nelse\n\tfor(Block block: this.getAllBlocks())\n\t\tif(name.equals(block.getName()))\n\t\t\treturn block;\nreturn null;'"
	 * @generated
	 */
	Block getBlockByName(String name);

} // SubSystem

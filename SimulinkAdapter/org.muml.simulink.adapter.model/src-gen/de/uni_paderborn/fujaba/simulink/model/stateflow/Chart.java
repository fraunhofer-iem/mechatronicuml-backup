/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.stateflow;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.simulink.model.ChartBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getMachine <em>Machine</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getOutput <em>Output</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getInput <em>Input</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getChart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='chartBlockPortSync'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL chartBlockPortSync='not self.block.oclIsUndefined() implies \n\tself.input->forAll(i| self.block.inPorts->exists(name= i.name)) and \n\tself.output->forAll(o| self.block.outPorts->exists(name= o.name)) and\n\tself.input->size() = self.block.inPorts->size() and\n\tself.output->size() = self.block.outPorts->size()'"
 * @generated
 */
public interface Chart extends State {
	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see #setMachine(StateflowMachine)
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getChart_Machine()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getCharts
	 * @model opposite="charts" required="true" transient="false"
	 * @generated
	 */
	StateflowMachine getMachine();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getMachine <em>Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' container reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(StateflowMachine value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getChart_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getOutput();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getChart_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getInput();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.ChartBlock#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(ChartBlock)
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getChart_Block()
	 * @see de.uni_paderborn.fujaba.simulink.model.ChartBlock#getChart
	 * @model opposite="chart"
	 * @generated
	 */
	ChartBlock getBlock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(ChartBlock value);

} // Chart

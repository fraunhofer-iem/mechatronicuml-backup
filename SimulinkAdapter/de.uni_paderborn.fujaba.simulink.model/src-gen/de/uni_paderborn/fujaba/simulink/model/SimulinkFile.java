/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.SimulinkFile#getBuses <em>Buses</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getSimulinkFile()
 * @model abstract="true"
 * @generated
 */
public interface SimulinkFile extends SubSystem {
	/**
	 * Returns the value of the '<em><b>Stateflow Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateflow Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateflow Machine</em>' containment reference.
	 * @see #setStateflowMachine(StateflowMachine)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getSimulinkFile_StateflowMachine()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	StateflowMachine getStateflowMachine();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateflow Machine</em>' containment reference.
	 * @see #getStateflowMachine()
	 * @generated
	 */
	void setStateflowMachine(StateflowMachine value);

	/**
	 * Returns the value of the '<em><b>Buses</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.Bus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buses</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getSimulinkFile_Buses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bus> getBuses();

} // SimulinkFile

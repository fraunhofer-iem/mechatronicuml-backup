/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.model;

import org.eclipse.emf.common.util.EList;
import org.muml.simulink.adapter.model.stateflow.StateflowMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.model.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.model.SimulinkFile#getBuses <em>Buses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.simulink.adapter.model.SimulinkPackage#getSimulinkFile()
 * @model abstract="true"
 * @generated
 */
public interface SimulinkFile extends SubSystem {
	/**
	 * Returns the value of the '<em><b>Stateflow Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.adapter.model.stateflow.StateflowMachine#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateflow Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateflow Machine</em>' containment reference.
	 * @see #setStateflowMachine(StateflowMachine)
	 * @see org.muml.simulink.adapter.model.SimulinkPackage#getSimulinkFile_StateflowMachine()
	 * @see org.muml.simulink.adapter.model.stateflow.StateflowMachine#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	StateflowMachine getStateflowMachine();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.model.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateflow Machine</em>' containment reference.
	 * @see #getStateflowMachine()
	 * @generated
	 */
	void setStateflowMachine(StateflowMachine value);

	/**
	 * Returns the value of the '<em><b>Buses</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.adapter.model.Bus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buses</em>' containment reference list.
	 * @see org.muml.simulink.adapter.model.SimulinkPackage#getSimulinkFile_Buses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bus> getBuses();

} // SimulinkFile

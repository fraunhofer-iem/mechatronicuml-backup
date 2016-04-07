/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow;

import org.eclipse.emf.common.util.EList;
import org.muml.simulink.SimulinkFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.StateflowMachine#getCharts <em>Charts</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.StateflowMachine#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.stateflow.StateflowPackage#getStateflowMachine()
 * @model
 * @generated
 */
public interface StateflowMachine extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Charts</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Chart}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.stateflow.Chart#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getStateflowMachine_Charts()
	 * @see org.muml.simulink.stateflow.Chart#getMachine
	 * @model opposite="machine" containment="true" required="true"
	 * @generated
	 */
	EList<Chart> getCharts();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(SimulinkFile)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getStateflowMachine_Model()
	 * @see org.muml.simulink.SimulinkFile#getStateflowMachine
	 * @model opposite="stateflowMachine" required="true" transient="false"
	 * @generated
	 */
	SimulinkFile getModel();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.StateflowMachine#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(SimulinkFile value);

} // StateflowMachine

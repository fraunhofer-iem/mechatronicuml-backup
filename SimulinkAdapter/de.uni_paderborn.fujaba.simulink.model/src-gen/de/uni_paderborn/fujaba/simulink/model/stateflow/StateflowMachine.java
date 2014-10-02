/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.stateflow;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.simulink.model.SimulinkFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getCharts <em>Charts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getStateflowMachine()
 * @model
 * @generated
 */
public interface StateflowMachine extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Charts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getStateflowMachine_Charts()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getMachine
	 * @model opposite="machine" containment="true" required="true"
	 * @generated
	 */
	EList<Chart> getCharts();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(SimulinkFile)
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getStateflowMachine_Model()
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkFile#getStateflowMachine
	 * @model opposite="stateflowMachine" required="true" transient="false"
	 * @generated
	 */
	SimulinkFile getModel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(SimulinkFile value);

} // StateflowMachine

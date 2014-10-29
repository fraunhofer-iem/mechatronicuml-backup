/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ReconfigurationExecutionPortInterfaceEntry defines one reconfiguration 
 * message that may be sent by the parent component to initiate a reconfiguration
 *  on the component. In addition to the message, it defines the duration for 
 * deciding whether the requested reconfiguration can be executed and the 
 * duration for executing the reconfiguration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision <em>Time For Decision</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecutionPhase <em>Time For Execution Phase</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReconfigurationExecutionPort <em>Reconfiguration Execution Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getMinimumCommitTime <em>Minimum Commit Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReturnValues <em>Return Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry()
 * @model
 * @generated
 */
public interface ReconfigurationExecutionPortInterfaceEntry extends ReconfigurationPortInterfaceEntry {
	/**
	 * Returns the value of the '<em><b>Time For Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Decision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that is needed by the component for deciding whether the reconfiguration
	 * that is offered by this interface entry can be executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time For Decision</em>' containment reference.
	 * @see #setTimeForDecision(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry_TimeForDecision()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeForDecision();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision <em>Time For Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Decision</em>' containment reference.
	 * @see #getTimeForDecision()
	 * @generated
	 */
	void setTimeForDecision(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Time For Execution Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Execution Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that is needed by the component for executing the reconfiguration
	 * that is offered by this interface entry. The time for execution is specified an
	 * ExecutionTimeSpecification because it depends on the particular execution
	 * procedure. Currently, we support single-phase and three-phase execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time For Execution Phase</em>' containment reference.
	 * @see #setTimeForExecutionPhase(ExecutionTimingSpecification)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionTimingSpecification getTimeForExecutionPhase();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecutionPhase <em>Time For Execution Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Execution Phase</em>' containment reference.
	 * @see #getTimeForExecutionPhase()
	 * @generated
	 */
	void setTimeForExecutionPhase(ExecutionTimingSpecification value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Execution Port</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort#getInterfaceEntries <em>Interface Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Execution Port</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reconfiguration execution port that contains this interface entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Execution Port</em>' container reference.
	 * @see #setReconfigurationExecutionPort(ReconfigurationExecutionPort)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort#getInterfaceEntries
	 * @model opposite="interfaceEntries" required="true" transient="false"
	 * @generated
	 */
	ReconfigurationExecutionPort getReconfigurationExecutionPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReconfigurationExecutionPort <em>Reconfiguration Execution Port</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Execution Port</em>' container reference.
	 * @see #getReconfigurationExecutionPort()
	 * @generated
	 */
	void setReconfigurationExecutionPort(ReconfigurationExecutionPort value);

	/**
	 * Returns the value of the '<em><b>Minimum Commit Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Commit Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the component confirmed to the parent that it can execute the requested
	 * reconfiguration, the commit time denotes how long the component may stick
	 * to that confirmation. The minimum commit time sets a lower bound to this value.
	 * It is required for analyzing the reconfiguration behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Commit Time</em>' containment reference.
	 * @see #setMinimumCommitTime(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getMinimumCommitTime();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getMinimumCommitTime <em>Minimum Commit Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Commit Time</em>' containment reference.
	 * @see #getMinimumCommitTime()
	 * @generated
	 */
	void setMinimumCommitTime(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Return Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Values</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry_ReturnValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getReturnValues();

} // ReconfigurationExecutionPortInterfaceEntry

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision <em>Time For Decision</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecution <em>Time For Execution</em>}</li>
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
	 * Returns the value of the '<em><b>Time For Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time For Execution</em>' containment reference.
	 * @see #setTimeForExecution(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPortInterfaceEntry_TimeForExecution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeForExecution();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecution <em>Time For Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Execution</em>' containment reference.
	 * @see #getTimeForExecution()
	 * @generated
	 */
	void setTimeForExecution(TimeValue value);

} // ReconfigurationExecutionPortInterfaceEntry

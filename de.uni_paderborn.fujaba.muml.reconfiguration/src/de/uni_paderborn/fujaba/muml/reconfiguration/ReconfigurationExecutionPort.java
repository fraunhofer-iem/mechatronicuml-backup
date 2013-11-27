/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A component uses its ReconfigurationExecutionPorts for offering 
 * reconfiguration operations to its parent. The parent may trigger a 
 * reconfiguration operation on a child by sending a reconfiguration 
 * message to the ReconfigurationExecutionPort of that child. Thus, 
 * ReconfigurationExecutionPorts  are primarily used for top-down 
 * reconfiguration initiation. They are implemented by the Executor 
 * if a RuleBasedReconfigurationController is used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort#getInterfaceEntries <em>Interface Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPort()
 * @model
 * @generated
 */
public interface ReconfigurationExecutionPort extends ReconfigurationPort {

	/**
	 * Returns the value of the '<em><b>Interface Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReconfigurationExecutionPort <em>Reconfiguration Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interface entries of this reconfiguration execution port. Each interface entry
	 * specifies one reconfiguration message that is offered to the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPort_InterfaceEntries()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReconfigurationExecutionPort
	 * @model opposite="reconfigurationExecutionPort" containment="true"
	 * @generated
	 */
	EList<ReconfigurationExecutionPortInterfaceEntry> getInterfaceEntries();

} // ReconfigurationExecutionPort

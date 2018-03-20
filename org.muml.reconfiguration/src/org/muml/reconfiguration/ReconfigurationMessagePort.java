/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A component uses its ReconfigurationMessagePorts for sending information on situations that may require a reconfiguration to its parent. Consequently, RM ports are used for bottom-up information provision.
 * The ReconfigurationMessagePorts are implemented in the Manager if a RuleBasedReconfigurationController is used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries <em>Interface Entries</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePort()
 * @model
 * @generated
 */
public interface ReconfigurationMessagePort extends ReconfigurationPort {

	/**
	 * Returns the value of the '<em><b>Interface Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry}.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessagePort <em>Reconfiguration Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interface entries of this reconfiguration message port. The interface entries
	 * define which messages the port may send and what kind of message is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Entries</em>' containment reference list.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePort_InterfaceEntries()
	 * @see org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessagePort
	 * @model opposite="reconfigurationMessagePort" containment="true"
	 * @generated
	 */
	EList<ReconfigurationMessagePortInterfaceEntry> getInterfaceEntries();
} // ReconfigurationMessagePort

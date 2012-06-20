/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries <em>Interface Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePort()
 * @model
 * @generated
 */
public interface ReconfigurationMessagePort extends ReconfigurationPort {

	/**
	 * Returns the value of the '<em><b>Interface Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePort_InterfaceEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationMessagePortEntry> getInterfaceEntries();
} // ReconfigurationMessagePort

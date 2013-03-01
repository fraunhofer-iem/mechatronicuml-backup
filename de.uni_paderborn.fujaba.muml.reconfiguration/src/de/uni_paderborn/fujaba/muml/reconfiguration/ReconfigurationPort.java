/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfiguration port defines the external interface for accessing the reconfiguration capabilities of a reconfigurable structured component. In case of a reconfigurable structured component, they are delegated to one of the controllers of the component. In case of a reconfigurable atomic component, the reconfiguration port is directly implemented.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort#getInterfaceEntries <em>Interface Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPort()
 * @model abstract="true"
 * @generated
 */
public interface ReconfigurationPort extends DiscretePort {

	/**
	 * Returns the value of the '<em><b>Interface Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPort_InterfaceEntries()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getPort
	 * @model opposite="port" containment="true"
	 * @generated
	 */
	EList<ReconfigurationPortInterfaceEntry> getInterfaceEntries();
} // ReconfigurationPort

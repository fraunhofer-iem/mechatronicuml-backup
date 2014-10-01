/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeConnectorInstance#getTransientMessages <em>Transient Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeConnectorInstance()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeConnectorInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Transient Messages</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector#getRuntimeConnectorInstance <em>Runtime Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Messages</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeConnectorInstance_TransientMessages()
	 * @see de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector#getRuntimeConnectorInstance
	 * @model opposite="runtimeConnectorInstance" containment="true"
	 * @generated
	 */
	EList<MessageOnConnector> getTransientMessages();

} // RuntimeConnectorInstance

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeConnectorInstance#getTransientMessages <em>Transient Messages</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeConnectorInstance()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeConnectorInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Transient Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.verification.core.runtime.MessageOnConnector}.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.MessageOnConnector#getRuntimeConnectorInstance <em>Runtime Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Messages</em>' containment reference list.
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeConnectorInstance_TransientMessages()
	 * @see org.muml.verification.core.runtime.MessageOnConnector#getRuntimeConnectorInstance
	 * @model opposite="runtimeConnectorInstance" containment="true"
	 * @generated
	 */
	EList<MessageOnConnector> getTransientMessages();

} // RuntimeConnectorInstance

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connector connects up to two connector endpoints. In case of a self-connector, there is only one endpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.Connector#isSelfConnector <em>Self Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnector()
 * @model abstract="true"
 * @generated
 */
public interface Connector extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Connector Endpoints</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Endpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The endpoints connected by this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Endpoints</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnector_ConnectorEndpoints()
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint#getConnectors
	 * @model opposite="connectors" required="true" upper="2"
	 * @generated
	 */
	EList<ConnectorEndpoint> getConnectorEndpoints();

	/**
	 * Returns the value of the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a self-connector, i.e., whether this connector connects one and the same endpoint to itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Connector</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnector_SelfConnector()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->size() = 1\r\n-- author: bingo, cgerking, see MUML #872'"
	 * @generated
	 */
	boolean isSelfConnector();

} // Connector

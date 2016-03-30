/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ports represent the interaction points between a component and the components environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.Port#getComponent <em>Component</em>}</li>
 *   <li>{@link org.muml.pim.component.Port#getPortConnectors <em>Port Connectors</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends ConnectorEndpoint, DataType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component, this port belongs to. Theoretically the bounds
	 * should be 1..1, but that would prevent the possibility for
	 * ComponentPart.portsDerived to be a containment reference
	 * (see ComponentPart.portsDerived)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see org.muml.pim.component.ComponentPackage#getPort_Component()
	 * @see org.muml.pim.component.Component#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.Port#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Port Connectors</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.component.PortConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived reference that returns all connectors that are attached to the Port that
	 * are of type PortConnector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Connectors</em>' reference list.
	 * @see org.muml.pim.component.ComponentPackage#getPort_PortConnectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c | c.oclIsKindOf(PortConnector)).oclAsType(PortConnector)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortConnector> getPortConnectors();

} // Port

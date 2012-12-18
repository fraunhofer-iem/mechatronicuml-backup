/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.types.DataType;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Port#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Port#getPortConnectors <em>Port Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends ConnectorEndpoint, ConstrainableElement, DataType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getPorts <em>Ports</em>}'.
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort_Component()
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Port Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.PortConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort_PortConnectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.incomingConnectors -> union(self.outgoingConnectors)'"
	 * @generated
	 */
	EList<PortConnector> getPortConnectors();

} // Port

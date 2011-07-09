/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Port#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Port#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Port#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Port#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement, CommentableElement, ConstrainableElement {
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
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Incoming Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors which lead into this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort_IncomingConnectors()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToPort
	 * @model opposite="toPort"
	 * @generated
	 */
	EList<ConnectorType> getIncomingConnectors();

	/**
	 * Returns the value of the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors which originate from this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPort_OutgoingConnectors()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromPort
	 * @model opposite="fromPort"
	 * @generated
	 */
	EList<ConnectorType> getOutgoingConnectors();

} // Port

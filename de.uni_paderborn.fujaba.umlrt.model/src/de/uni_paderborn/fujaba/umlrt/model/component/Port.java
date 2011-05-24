/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;

import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getInvisibleInterfaces <em>Invisible Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getRequiredMessageInterface <em>Required Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getProvidedMessageInterface <em>Provided Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getAdaptationRealtimeStatechart <em>Adaptation Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='body'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.cardinality.lowerBound->notEmpty()'"
 * @generated
 */
public interface Port extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Invisible Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Don't know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invisible Interfaces</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_InvisibleInterfaces()
	 * @model
	 * @generated
	 */
	EList<EClass> getInvisibleInterfaces();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component this port belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_Component()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Component#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.umlrt.model.component.PortKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of this port which can be either discrete, continuous, hybrid or hardware. This attribute can be derived by determining which port specifications the port possesses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.PortKind
	 * @see #setPortKind(PortKind)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_PortKind()
	 * @model derived="true"
	 * @generated
	 */
	PortKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.PortKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(PortKind value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.PortSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores all port specifications this port realizes. Possible port specifications provide continuous or discrete behavior as well as the functionlity a hardware port provides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_Specification()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortSpecification> getSpecification();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Required Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Message Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required message interface contains the signature definitions of all events
	 * that may be sent by this port. It is derived from the discrete port specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Message Interface</em>' reference.
	 * @see #setRequiredMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_RequiredMessageInterface()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if specification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclIsUndefined() then\n\tnull\nelse\n\tspecification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclAsType(DiscretePortSpecification).requiredMessageInterface\nendif'"
	 * @generated
	 */
	MessageInterface getRequiredMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getRequiredMessageInterface <em>Required Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Message Interface</em>' reference.
	 * @see #getRequiredMessageInterface()
	 * @generated
	 */
	void setRequiredMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Provided Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Message Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provided message interface contains the signature definitions of all events
	 * that may be received by this port. It is derived from the discrete port specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Message Interface</em>' reference.
	 * @see #setProvidedMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_ProvidedMessageInterface()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if specification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclIsUndefined() then\n\tnull\nelse\n\tspecification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclAsType(DiscretePortSpecification).providedMessageInterface\nendif'"
	 * @generated
	 */
	MessageInterface getProvidedMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getProvidedMessageInterface <em>Provided Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Message Interface</em>' reference.
	 * @see #getProvidedMessageInterface()
	 * @generated
	 */
	void setProvidedMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_PortInstances()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance#getPortType
	 * @model opposite="portType"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Incoming Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors which lead into this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_IncomingConnectors()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getToPort
	 * @model opposite="toPort"
	 * @generated
	 */
	EList<ConnectorType> getIncomingConnectors();

	/**
	 * Returns the value of the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors which originate from this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_OutgoingConnectors()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getFromPort
	 * @model opposite="fromPort"
	 * @generated
	 */
	EList<ConnectorType> getOutgoingConnectors();

	/**
	 * Returns the value of the '<em><b>Adaptation Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Realtime Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adaptation behavior of this port which is derived from the DiscretePortSpecification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adaptation Realtime Statechart</em>' reference.
	 * @see #setAdaptationRealtimeStatechart(AbstractRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_AdaptationRealtimeStatechart()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if specification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclIsUndefined() then\n\tnull\nelse\n\tspecification->select(s|s.oclIsKindOf(DiscretePortSpecification))->first().oclAsType(DiscretePortSpecification).adaptationRealtimeStatechart\nendif'"
	 * @generated
	 */
	AbstractRealtimeStatechart getAdaptationRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getAdaptationRealtimeStatechart <em>Adaptation Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Realtime Statechart</em>' reference.
	 * @see #getAdaptationRealtimeStatechart()
	 * @generated
	 */
	void setAdaptationRealtimeStatechart(AbstractRealtimeStatechart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	PortInstance createInstance();

} // Port

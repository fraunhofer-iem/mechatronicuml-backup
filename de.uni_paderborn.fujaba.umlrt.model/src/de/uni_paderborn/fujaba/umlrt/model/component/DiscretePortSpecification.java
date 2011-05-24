/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the discrete functionality of a port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getAdaptationRealtimeStatechart <em>Adaptation Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRequiredMessageInterface <em>Required Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getProvidedMessageInterface <em>Provided Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getEventQueueSize <em>Event Queue Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification()
 * @model
 * @generated
 */
public interface DiscretePortSpecification extends PortSpecification, BehavioralElement {

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a parameterized coordination pattern that this port refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Role)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_Refines()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Role getRefines();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Role value);

	/**
	 * Returns the value of the '<em><b>Adaptation Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Realtime Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adaptation statechart of this port. For a port with cardinality 0..1 or 0..*, it 
	 * specifies the creation and deletion of instances of this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adaptation Realtime Statechart</em>' reference.
	 * @see #setAdaptationRealtimeStatechart(AbstractRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_AdaptationRealtimeStatechart()
	 * @model
	 * @generated
	 */
	AbstractRealtimeStatechart getAdaptationRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getAdaptationRealtimeStatechart <em>Adaptation Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Realtime Statechart</em>' reference.
	 * @see #getAdaptationRealtimeStatechart()
	 * @generated
	 */
	void setAdaptationRealtimeStatechart(AbstractRealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Required Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the required message interface of this port. The required message interface defines which messages are allowed to be sent by this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Message Interface</em>' reference.
	 * @see #setRequiredMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_RequiredMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getRequiredMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRequiredMessageInterface <em>Required Message Interface</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the provided message interface of this port. The required message interface defines which messages are allowed to be received by this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Message Interface</em>' reference.
	 * @see #setProvidedMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_ProvidedMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getProvidedMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getProvidedMessageInterface <em>Provided Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Message Interface</em>' reference.
	 * @see #getProvidedMessageInterface()
	 * @generated
	 */
	void setProvidedMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the event queue of this port. It defines the maximum number of events
	 * that may be temporarily buffered by the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Queue Size</em>' attribute.
	 * @see #setEventQueueSize(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_EventQueueSize()
	 * @model
	 * @generated
	 */
	int getEventQueueSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getEventQueueSize <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Queue Size</em>' attribute.
	 * @see #getEventQueueSize()
	 * @generated
	 */
	void setEventQueueSize(int value);
} // DiscretePortSpecification

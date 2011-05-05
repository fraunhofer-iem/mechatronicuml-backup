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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRequired <em>Required</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getProvided <em>Provided</em>}</li>
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
	 * The port role this port is a realization of.
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
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the required message interface of this port. The required message interface defines which messages are allowed to be sent by this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_Required()
	 * @model
	 * @generated
	 */
	MessageInterface getRequired();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the provided message interface of this port. The required message interface defines which messages are allowed to be received by this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference.
	 * @see #setProvided(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_Provided()
	 * @model
	 * @generated
	 */
	MessageInterface getProvided();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getProvided <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' reference.
	 * @see #getProvided()
	 * @generated
	 */
	void setProvided(MessageInterface value);
} // DiscretePortSpecification

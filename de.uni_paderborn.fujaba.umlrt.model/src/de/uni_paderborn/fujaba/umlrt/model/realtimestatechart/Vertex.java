/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a basic state of a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getStatechart <em>Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing transitions of this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getVertex_OutgoingTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming transitions of this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getVertex_IncomingTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this state belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' reference.
	 * @see #setStatechart(AbstractStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getVertex_Statechart()
	 * @model
	 * @generated
	 */
	AbstractStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getStatechart <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(AbstractStatechart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yields the name of this state prefixed with the names of all realtime statecharts reachable upwards in the hierarchy seperated by '_'.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLongName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns realtime statechart which represents the root of the hierarchy tree.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AbstractStatechart getRootRealtimeStatechart();

} // Vertex

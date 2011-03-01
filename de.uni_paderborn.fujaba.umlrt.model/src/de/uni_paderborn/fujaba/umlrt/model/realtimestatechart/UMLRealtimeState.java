/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Realtime State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a basic state of a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getOutgoingUMLRealtimeTransitions <em>Outgoing UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getIncomingUMLRealtimeTransitions <em>Incoming UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeState()
 * @model abstract="true"
 * @generated
 */
public interface UMLRealtimeState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing transitions of this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing UML Realtime Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeState_OutgoingUMLRealtimeTransitions()
	 * @model
	 * @generated
	 */
	EList<UMLRealtimeTransition> getOutgoingUMLRealtimeTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming transitions of this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming UML Realtime Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeState_IncomingUMLRealtimeTransitions()
	 * @model
	 * @generated
	 */
	EList<UMLRealtimeTransition> getIncomingUMLRealtimeTransitions();

	/**
	 * Returns the value of the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this state belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #setUMLRealtimeStatechart(UMLRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeState_UMLRealtimeStatechart()
	 * @model
	 * @generated
	 */
	UMLRealtimeStatechart getUMLRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	void setUMLRealtimeStatechart(UMLRealtimeStatechart value);

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
	UMLRealtimeStatechart getRootRealtimeStatechart();

} // UMLRealtimeState

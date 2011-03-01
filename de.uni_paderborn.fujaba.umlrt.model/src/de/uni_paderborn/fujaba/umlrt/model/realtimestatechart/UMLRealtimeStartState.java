/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Realtime Start State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the start state of a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getUMLRealtimeStartStateRev <em>UML Realtime Start State Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStartState()
 * @model
 * @generated
 */
public interface UMLRealtimeStartState extends UMLRealtimeState {
	/**
	 * Returns the value of the '<em><b>UML Realtime Start State Rev</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStartState <em>UML Realtime Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this start state belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Start State Rev</em>' container reference.
	 * @see #setUMLRealtimeStartStateRev(UMLRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStartState_UMLRealtimeStartStateRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStartState
	 * @model opposite="uMLRealtimeStartState" transient="false"
	 * @generated
	 */
	UMLRealtimeStatechart getUMLRealtimeStartStateRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getUMLRealtimeStartStateRev <em>UML Realtime Start State Rev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Start State Rev</em>' container reference.
	 * @see #getUMLRealtimeStartStateRev()
	 * @generated
	 */
	void setUMLRealtimeStartStateRev(UMLRealtimeStatechart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yields the state to which the first outgoing transition of all outgoing transitions of this start state leads.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	UMLRealtimeState getNextState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeStartState newStartState);

} // UMLRealtimeStartState

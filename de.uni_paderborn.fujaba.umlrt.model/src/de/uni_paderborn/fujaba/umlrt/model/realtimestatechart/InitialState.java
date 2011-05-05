/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the start state of a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#getStartStateRev <em>Start State Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getInitialState()
 * @model
 * @generated
 */
public interface InitialState extends Vertex {
	/**
	 * Returns the value of the '<em><b>Start State Rev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this start state belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start State Rev</em>' reference.
	 * @see #setStartStateRev(AbstractRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getInitialState_StartStateRev()
	 * @model
	 * @generated
	 */
	AbstractRealtimeStatechart getStartStateRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#getStartStateRev <em>Start State Rev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State Rev</em>' reference.
	 * @see #getStartStateRev()
	 * @generated
	 */
	void setStartStateRev(AbstractRealtimeStatechart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yields the state to which the first outgoing transition of all outgoing transitions of this start state leads.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Vertex getNextState();

} // InitialState

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.muml.pim.valuetype.TimeValue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The action of a state that is executed periodically as long as this state is active. The first period starts after the execution of the entry-action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.DoEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.DoEvent#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getDoEvent()
 * @model
 * @generated
 */
public interface DoEvent extends StateEvent {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry or exit action has one or more actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getDoEvent_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.DoEvent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the lower bound of the period
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimeValue)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getDoEvent_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getPeriod();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.DoEvent#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeValue value);

} // DoEvent

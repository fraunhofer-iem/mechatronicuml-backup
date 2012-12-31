/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import de.uni_paderborn.fujaba.muml.model.valuetype.TimeValue;


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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent#getPeriodLower <em>Period Lower</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent#getPeriodUpper <em>Period Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getDoEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidLowerUpperPeriod='self.periodLower >= 1 and self.periodLower <= self.periodUpper'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Period Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the lower bound of the period
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Lower</em>' containment reference.
	 * @see #setPeriodLower(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_PeriodLower()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getPeriodLower();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent#getPeriodLower <em>Period Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Lower</em>' containment reference.
	 * @see #getPeriodLower()
	 * @generated
	 */
	void setPeriodLower(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Period Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the upper bound of the period
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Upper</em>' containment reference.
	 * @see #setPeriodUpper(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getDoEvent_PeriodUpper()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getPeriodUpper();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent#getPeriodUpper <em>Period Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Upper</em>' containment reference.
	 * @see #getPeriodUpper()
	 * @generated
	 */
	void setPeriodUpper(TimeValue value);

} // DoEvent

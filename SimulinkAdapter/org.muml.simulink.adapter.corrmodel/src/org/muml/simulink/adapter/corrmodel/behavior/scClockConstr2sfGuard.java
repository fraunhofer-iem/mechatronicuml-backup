/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.valuetype.TimeValue;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Clock Constr2sf Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClockConstr <em>Sc Clock Constr</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScBound <em>Sc Bound</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getSfClockGuard <em>Sf Clock Guard</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClockConstr2sfGuard()
 * @model
 * @generated
 */
public interface scClockConstr2sfGuard extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Clock Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Clock Constr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Clock Constr</em>' reference.
	 * @see #setScClockConstr(ClockConstraint)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClockConstr2sfGuard_ScClockConstr()
	 * @model
	 * @generated
	 */
	ClockConstraint getScClockConstr();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClockConstr <em>Sc Clock Constr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock Constr</em>' reference.
	 * @see #getScClockConstr()
	 * @generated
	 */
	void setScClockConstr(ClockConstraint value);

	/**
	 * Returns the value of the '<em><b>Sc Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Bound</em>' reference.
	 * @see #setScBound(TimeValue)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClockConstr2sfGuard_ScBound()
	 * @model
	 * @generated
	 */
	TimeValue getScBound();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScBound <em>Sc Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Bound</em>' reference.
	 * @see #getScBound()
	 * @generated
	 */
	void setScBound(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Clock</em>' reference.
	 * @see #setScClock(Clock)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClockConstr2sfGuard_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Sf Clock Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Clock Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Clock Guard</em>' reference.
	 * @see #setSfClockGuard(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClockConstr2sfGuard_SfClockGuard()
	 * @model
	 * @generated
	 */
	Action getSfClockGuard();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getSfClockGuard <em>Sf Clock Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Clock Guard</em>' reference.
	 * @see #getSfClockGuard()
	 * @generated
	 */
	void setSfClockGuard(Action value);

} // scClockConstr2sfGuard

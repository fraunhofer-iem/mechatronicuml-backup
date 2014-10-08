/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Clock Constr2sf Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getScClockConstr <em>Sc Clock Constr</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getScBound <em>Sc Bound</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getSfClockGuard <em>Sf Clock Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClockConstr2sfGuard()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClockConstr2sfGuard_ScClockConstr()
	 * @model
	 * @generated
	 */
	ClockConstraint getScClockConstr();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getScClockConstr <em>Sc Clock Constr</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClockConstr2sfGuard_ScBound()
	 * @model
	 * @generated
	 */
	TimeValue getScBound();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getScBound <em>Sc Bound</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClockConstr2sfGuard_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getScClock <em>Sc Clock</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClockConstr2sfGuard_SfClockGuard()
	 * @model
	 * @generated
	 */
	Action getSfClockGuard();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scClockConstr2sfGuard#getSfClockGuard <em>Sf Clock Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Clock Guard</em>' reference.
	 * @see #getSfClockGuard()
	 * @generated
	 */
	void setSfClockGuard(Action value);

} // scClockConstr2sfGuard

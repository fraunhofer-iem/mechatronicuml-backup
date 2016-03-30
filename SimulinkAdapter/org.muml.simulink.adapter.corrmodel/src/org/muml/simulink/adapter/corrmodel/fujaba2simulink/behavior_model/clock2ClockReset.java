/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model;

import org.muml.pim.realtimestatechart.Clock;
import org.muml.simulink.adapter.corrmodel.fujaba2simulink.AbstractContainerCorrespondenceNode;
import org.muml.simulink.adapter.model.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>clock2 Clock Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.clock2ClockReset#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.clock2ClockReset#getSfClockReset <em>Sf Clock Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.Behavior_modelPackage#getclock2ClockReset()
 * @model
 * @generated
 */
public interface clock2ClockReset extends AbstractContainerCorrespondenceNode {
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
	 * @see org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.Behavior_modelPackage#getclock2ClockReset_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.clock2ClockReset#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Sf Clock Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Clock Reset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Clock Reset</em>' reference.
	 * @see #setSfClockReset(Action)
	 * @see org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.Behavior_modelPackage#getclock2ClockReset_SfClockReset()
	 * @model
	 * @generated
	 */
	Action getSfClockReset();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.clock2ClockReset#getSfClockReset <em>Sf Clock Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Clock Reset</em>' reference.
	 * @see #getSfClockReset()
	 * @generated
	 */
	void setSfClockReset(Action value);

} // clock2ClockReset

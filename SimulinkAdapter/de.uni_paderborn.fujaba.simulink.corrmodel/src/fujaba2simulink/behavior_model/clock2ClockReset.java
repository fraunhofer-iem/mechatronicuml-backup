/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>clock2 Clock Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.clock2ClockReset#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.clock2ClockReset#getSfClockReset <em>Sf Clock Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getclock2ClockReset()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getclock2ClockReset_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.clock2ClockReset#getScClock <em>Sc Clock</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getclock2ClockReset_SfClockReset()
	 * @model
	 * @generated
	 */
	Action getSfClockReset();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.clock2ClockReset#getSfClockReset <em>Sf Clock Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Clock Reset</em>' reference.
	 * @see #getSfClockReset()
	 * @generated
	 */
	void setSfClockReset(Action value);

} // clock2ClockReset

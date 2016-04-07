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
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Invariant2sf Inv Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScInvariant <em>Sc Invariant</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScBound <em>Sc Bound</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvTrans <em>Sf Inv Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvGuard <em>Sf Inv Guard</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvNode <em>Sf Inv Node</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError()
 * @model
 * @generated
 */
public interface scInvariant2sfInvError extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Invariant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Invariant</em>' reference.
	 * @see #setScInvariant(ClockConstraint)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError_ScInvariant()
	 * @model
	 * @generated
	 */
	ClockConstraint getScInvariant();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScInvariant <em>Sc Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Invariant</em>' reference.
	 * @see #getScInvariant()
	 * @generated
	 */
	void setScInvariant(ClockConstraint value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError_ScBound()
	 * @model
	 * @generated
	 */
	TimeValue getScBound();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScBound <em>Sc Bound</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Sf Inv Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Inv Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Inv Trans</em>' reference.
	 * @see #setSfInvTrans(Transition)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError_SfInvTrans()
	 * @model
	 * @generated
	 */
	Transition getSfInvTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvTrans <em>Sf Inv Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Inv Trans</em>' reference.
	 * @see #getSfInvTrans()
	 * @generated
	 */
	void setSfInvTrans(Transition value);

	/**
	 * Returns the value of the '<em><b>Sf Inv Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Inv Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Inv Guard</em>' reference.
	 * @see #setSfInvGuard(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError_SfInvGuard()
	 * @model
	 * @generated
	 */
	Action getSfInvGuard();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvGuard <em>Sf Inv Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Inv Guard</em>' reference.
	 * @see #getSfInvGuard()
	 * @generated
	 */
	void setSfInvGuard(Action value);

	/**
	 * Returns the value of the '<em><b>Sf Inv Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Inv Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Inv Node</em>' reference.
	 * @see #setSfInvNode(State)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscInvariant2sfInvError_SfInvNode()
	 * @model
	 * @generated
	 */
	State getSfInvNode();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvNode <em>Sf Inv Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Inv Node</em>' reference.
	 * @see #getSfInvNode()
	 * @generated
	 */
	void setSfInvNode(State value);

} // scInvariant2sfInvError

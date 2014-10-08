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
import de.uni_paderborn.fujaba.simulink.model.stateflow.State;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Transition;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Invariant2sf Inv Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getScInvariant <em>Sc Invariant</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getScBound <em>Sc Bound</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getSfInvTrans <em>Sf Inv Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getSfInvGuard <em>Sf Inv Guard</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getSfInvNode <em>Sf Inv Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError_ScInvariant()
	 * @model
	 * @generated
	 */
	ClockConstraint getScInvariant();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getScInvariant <em>Sc Invariant</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError_ScBound()
	 * @model
	 * @generated
	 */
	TimeValue getScBound();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getScBound <em>Sc Bound</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getScClock <em>Sc Clock</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError_SfInvTrans()
	 * @model
	 * @generated
	 */
	Transition getSfInvTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getSfInvTrans <em>Sf Inv Trans</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError_SfInvGuard()
	 * @model
	 * @generated
	 */
	Action getSfInvGuard();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getSfInvGuard <em>Sf Inv Guard</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscInvariant2sfInvError_SfInvNode()
	 * @model
	 * @generated
	 */
	State getSfInvNode();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scInvariant2sfInvError#getSfInvNode <em>Sf Inv Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Inv Node</em>' reference.
	 * @see #getSfInvNode()
	 * @generated
	 */
	void setSfInvNode(State value);

} // scInvariant2sfInvError

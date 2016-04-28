/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Entry2sf Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryEvent <em>Sc Entry Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getSfEntryAction <em>Sf Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryAction <em>Sc Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScExpr <em>Sc Expr</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScEntry2sfEntry()
 * @model
 * @generated
 */
public interface ScEntry2sfEntry extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Entry Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Entry Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Entry Event</em>' reference.
	 * @see #setScEntryEvent(EntryEvent)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScEntry2sfEntry_ScEntryEvent()
	 * @model
	 * @generated
	 */
	EntryEvent getScEntryEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryEvent <em>Sc Entry Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Entry Event</em>' reference.
	 * @see #getScEntryEvent()
	 * @generated
	 */
	void setScEntryEvent(EntryEvent value);

	/**
	 * Returns the value of the '<em><b>Sf Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Entry Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Entry Action</em>' reference.
	 * @see #setSfEntryAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScEntry2sfEntry_SfEntryAction()
	 * @model
	 * @generated
	 */
	Action getSfEntryAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getSfEntryAction <em>Sf Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Entry Action</em>' reference.
	 * @see #getSfEntryAction()
	 * @generated
	 */
	void setSfEntryAction(Action value);

	/**
	 * Returns the value of the '<em><b>Sc Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Entry Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Entry Action</em>' reference.
	 * @see #setScEntryAction(org.muml.pim.realtimestatechart.Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScEntry2sfEntry_ScEntryAction()
	 * @model
	 * @generated
	 */
	org.muml.pim.realtimestatechart.Action getScEntryAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryAction <em>Sc Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Entry Action</em>' reference.
	 * @see #getScEntryAction()
	 * @generated
	 */
	void setScEntryAction(org.muml.pim.realtimestatechart.Action value);

	/**
	 * Returns the value of the '<em><b>Sc Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Expr</em>' reference.
	 * @see #setScExpr(Expression)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScEntry2sfEntry_ScExpr()
	 * @model
	 * @generated
	 */
	Expression getScExpr();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScExpr <em>Sc Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Expr</em>' reference.
	 * @see #getScExpr()
	 * @generated
	 */
	void setScExpr(Expression value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScEntry2sfEntry_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

} // ScEntry2sfEntry

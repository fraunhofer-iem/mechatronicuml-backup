/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Entry2sf Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScEntryEvent <em>Sc Entry Event</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getSfEntryAction <em>Sf Entry Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScEntryAction <em>Sc Entry Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScExpr <em>Sc Expr</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScEntry2sfEntry()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScEntry2sfEntry_ScEntryEvent()
	 * @model
	 * @generated
	 */
	EntryEvent getScEntryEvent();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScEntryEvent <em>Sc Entry Event</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScEntry2sfEntry_SfEntryAction()
	 * @model
	 * @generated
	 */
	Action getSfEntryAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getSfEntryAction <em>Sf Entry Action</em>}' reference.
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
	 * @see #setScEntryAction(de.uni_paderborn.fujaba.muml.realtimestatechart.Action)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScEntry2sfEntry_ScEntryAction()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.muml.realtimestatechart.Action getScEntryAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScEntryAction <em>Sc Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Entry Action</em>' reference.
	 * @see #getScEntryAction()
	 * @generated
	 */
	void setScEntryAction(de.uni_paderborn.fujaba.muml.realtimestatechart.Action value);

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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScEntry2sfEntry_ScExpr()
	 * @model
	 * @generated
	 */
	Expression getScExpr();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScExpr <em>Sc Expr</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScEntry2sfEntry_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScEntry2sfEntry#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

} // ScEntry2sfEntry

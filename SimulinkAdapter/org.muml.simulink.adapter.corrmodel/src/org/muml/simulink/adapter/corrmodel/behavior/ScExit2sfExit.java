/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.core.expressions.Expression;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Exit2sf Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitEvent <em>Sc Exit Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitAction <em>Sc Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitExpr <em>Sc Exit Expr</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getSfExitAction <em>Sf Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScExit2sfExit()
 * @model
 * @generated
 */
public interface ScExit2sfExit extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Exit Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Exit Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Exit Event</em>' reference.
	 * @see #setScExitEvent(ExitEvent)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScExit2sfExit_ScExitEvent()
	 * @model
	 * @generated
	 */
	ExitEvent getScExitEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitEvent <em>Sc Exit Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Exit Event</em>' reference.
	 * @see #getScExitEvent()
	 * @generated
	 */
	void setScExitEvent(ExitEvent value);

	/**
	 * Returns the value of the '<em><b>Sc Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Exit Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Exit Action</em>' reference.
	 * @see #setScExitAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScExit2sfExit_ScExitAction()
	 * @model
	 * @generated
	 */
	Action getScExitAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitAction <em>Sc Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Exit Action</em>' reference.
	 * @see #getScExitAction()
	 * @generated
	 */
	void setScExitAction(Action value);

	/**
	 * Returns the value of the '<em><b>Sc Exit Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Exit Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Exit Expr</em>' reference.
	 * @see #setScExitExpr(Expression)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScExit2sfExit_ScExitExpr()
	 * @model
	 * @generated
	 */
	Expression getScExitExpr();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitExpr <em>Sc Exit Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Exit Expr</em>' reference.
	 * @see #getScExitExpr()
	 * @generated
	 */
	void setScExitExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Sf Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Exit Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Exit Action</em>' reference.
	 * @see #setSfExitAction(org.muml.simulink.stateflow.Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScExit2sfExit_SfExitAction()
	 * @model
	 * @generated
	 */
	org.muml.simulink.stateflow.Action getSfExitAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getSfExitAction <em>Sf Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Exit Action</em>' reference.
	 * @see #getSfExitAction()
	 * @generated
	 */
	void setSfExitAction(org.muml.simulink.stateflow.Action value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScExit2sfExit_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

} // ScExit2sfExit

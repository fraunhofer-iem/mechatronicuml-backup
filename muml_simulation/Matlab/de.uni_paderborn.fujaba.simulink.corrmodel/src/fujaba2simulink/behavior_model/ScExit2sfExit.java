/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitEvent;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Exit2sf Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScExitEvent <em>Sc Exit Event</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScExitAction <em>Sc Exit Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScExitExpr <em>Sc Exit Expr</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScExit2sfExit#getSfExitAction <em>Sf Exit Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScExit2sfExit()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScExit2sfExit_ScExitEvent()
	 * @model
	 * @generated
	 */
	ExitEvent getScExitEvent();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScExitEvent <em>Sc Exit Event</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScExit2sfExit_ScExitAction()
	 * @model
	 * @generated
	 */
	Action getScExitAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScExitAction <em>Sc Exit Action</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScExit2sfExit_ScExitExpr()
	 * @model
	 * @generated
	 */
	Expression getScExitExpr();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScExitExpr <em>Sc Exit Expr</em>}' reference.
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
	 * @see #setSfExitAction(de.uni_paderborn.fujaba.simulink.model.stateflow.Action)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScExit2sfExit_SfExitAction()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.stateflow.Action getSfExitAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScExit2sfExit#getSfExitAction <em>Sf Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Exit Action</em>' reference.
	 * @see #getSfExitAction()
	 * @generated
	 */
	void setSfExitAction(de.uni_paderborn.fujaba.simulink.model.stateflow.Action value);

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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScExit2sfExit_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScExit2sfExit#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

} // ScExit2sfExit

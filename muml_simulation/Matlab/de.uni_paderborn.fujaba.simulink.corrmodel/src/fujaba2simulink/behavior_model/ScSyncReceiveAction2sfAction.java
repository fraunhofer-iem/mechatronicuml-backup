/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import org.storydriven.core.expressions.TextualExpression;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Action;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Sync Receive Action2sf Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScSyncReceiveAction2sfAction#getScAction <em>Sc Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScSyncReceiveAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScSyncReceiveAction2sfAction#getSfAction <em>Sf Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncReceiveAction2sfAction()
 * @model
 * @generated
 */
public interface ScSyncReceiveAction2sfAction extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Action</em>' reference.
	 * @see #setScAction(Action)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncReceiveAction2sfAction_ScAction()
	 * @model
	 * @generated
	 */
	Action getScAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScSyncReceiveAction2sfAction#getScAction <em>Sc Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action</em>' reference.
	 * @see #getScAction()
	 * @generated
	 */
	void setScAction(Action value);

	/**
	 * Returns the value of the '<em><b>Sc Action Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Action Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Action Expr</em>' reference.
	 * @see #setScActionExpr(TextualExpression)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncReceiveAction2sfAction_ScActionExpr()
	 * @model
	 * @generated
	 */
	TextualExpression getScActionExpr();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScSyncReceiveAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action Expr</em>' reference.
	 * @see #getScActionExpr()
	 * @generated
	 */
	void setScActionExpr(TextualExpression value);

	/**
	 * Returns the value of the '<em><b>Sf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Action</em>' reference.
	 * @see #setSfAction(de.uni_paderborn.fujaba.simulink.model.stateflow.Action)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncReceiveAction2sfAction_SfAction()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.stateflow.Action getSfAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScSyncReceiveAction2sfAction#getSfAction <em>Sf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Action</em>' reference.
	 * @see #getSfAction()
	 * @generated
	 */
	void setSfAction(de.uni_paderborn.fujaba.simulink.model.stateflow.Action value);

} // ScSyncReceiveAction2sfAction

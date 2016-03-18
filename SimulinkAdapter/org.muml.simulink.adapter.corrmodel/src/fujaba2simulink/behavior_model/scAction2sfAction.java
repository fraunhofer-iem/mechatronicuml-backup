/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Action;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Action2sf Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scAction2sfAction#getScAction <em>Sc Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAction2sfAction#getSfAction <em>Sf Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAction2sfAction()
 * @model
 * @generated
 */
public interface scAction2sfAction extends AbstractContainerCorrespondenceNode {
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAction2sfAction_ScAction()
	 * @model
	 * @generated
	 */
	Action getScAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAction2sfAction#getScAction <em>Sc Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action</em>' reference.
	 * @see #getScAction()
	 * @generated
	 */
	void setScAction(Action value);

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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAction2sfAction_SfAction()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.stateflow.Action getSfAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAction2sfAction#getSfAction <em>Sf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Action</em>' reference.
	 * @see #getSfAction()
	 * @generated
	 */
	void setSfAction(de.uni_paderborn.fujaba.simulink.model.stateflow.Action value);

	/**
	 * Returns the value of the '<em><b>Sc Action Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Action Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Action Expr</em>' reference.
	 * @see #setScActionExpr(Expression)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAction2sfAction_ScActionExpr()
	 * @model
	 * @generated
	 */
	Expression getScActionExpr();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action Expr</em>' reference.
	 * @see #getScActionExpr()
	 * @generated
	 */
	void setScActionExpr(Expression value);

} // scAction2sfAction

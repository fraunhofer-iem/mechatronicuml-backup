/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.realtimestatechart.Action;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Action2sf Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScAction <em>Sc Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getSfAction <em>Sf Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAction2sfAction()
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAction2sfAction_ScAction()
	 * @model
	 * @generated
	 */
	Action getScAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScAction <em>Sc Action</em>}' reference.
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
	 * @see #setSfAction(org.muml.simulink.stateflow.Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAction2sfAction_SfAction()
	 * @model
	 * @generated
	 */
	org.muml.simulink.stateflow.Action getSfAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getSfAction <em>Sf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Action</em>' reference.
	 * @see #getSfAction()
	 * @generated
	 */
	void setSfAction(org.muml.simulink.stateflow.Action value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAction2sfAction_ScActionExpr()
	 * @model
	 * @generated
	 */
	Expression getScActionExpr();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action Expr</em>' reference.
	 * @see #getScActionExpr()
	 * @generated
	 */
	void setScActionExpr(Expression value);

} // scAction2sfAction

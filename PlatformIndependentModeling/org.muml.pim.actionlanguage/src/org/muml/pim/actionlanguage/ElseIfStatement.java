/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.actionlanguage;

import org.muml.core.CommentableElement;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An elseif statement is used if the referenced block should be executed only when the condition expression evaluates to true.
 * An elseif statement always have one elseif-condition and one corresponding elseif-block.
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.ElseIfStatement#getElseIfCondition <em>Else If Condition</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.ElseIfStatement#getElseIfBlock <em>Else If Block</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getElseIfStatement()
 * @model
 * @generated
 */
public interface ElseIfStatement extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Else If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ElseIf condition of the if statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else If Condition</em>' containment reference.
	 * @see #setElseIfCondition(Expression)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getElseIfStatement_ElseIfCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getElseIfCondition();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.ElseIfStatement#getElseIfCondition <em>Else If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else If Condition</em>' containment reference.
	 * @see #getElseIfCondition()
	 * @generated
	 */
	void setElseIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Else If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Block which is executed if the corresponding elseif condition evaluates to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else If Block</em>' containment reference.
	 * @see #setElseIfBlock(Block)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getElseIfStatement_ElseIfBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getElseIfBlock();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.ElseIfStatement#getElseIfBlock <em>Else If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else If Block</em>' containment reference.
	 * @see #getElseIfBlock()
	 * @generated
	 */
	void setElseIfBlock(Block value);

} // ElseIfStatement

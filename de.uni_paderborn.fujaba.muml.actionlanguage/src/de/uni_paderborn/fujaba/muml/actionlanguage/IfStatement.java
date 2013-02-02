/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An if statement is used if the referenced block should be executed only when the condition expression evaluates to true.
 * An if statement always have one if-condition and one corresponding if-block, any number of else-if-conditions and corresponding else-if-blocks and at most one else-block. 
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getElseIfBlocks <em>Else If Blocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Expression {
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If condition of the if statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Expression)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getIfStatement_IfCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIfCondition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Block which is executed if the if condition evaluates to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference.
	 * @see #setIfBlock(Block)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getIfStatement_IfBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getIfBlock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getIfBlock <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Block</em>' containment reference.
	 * @see #getIfBlock()
	 * @generated
	 */
	void setIfBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Else If Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else If Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ElseIf condition of the if statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else If Conditions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getIfStatement_ElseIfConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getElseIfConditions();

	/**
	 * Returns the value of the '<em><b>Else If Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.actionlanguage.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else If Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Block which is executed if the corresponding elseif condition evaluates to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else If Blocks</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getIfStatement_ElseIfBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getElseIfBlocks();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Block which is executed if no if or elseif condition evaluates to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getIfStatement_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

} // IfStatement

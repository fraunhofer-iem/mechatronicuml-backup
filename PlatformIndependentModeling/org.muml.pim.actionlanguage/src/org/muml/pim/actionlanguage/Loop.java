/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A loop statement executed a block until the Boolean value of loop test expression is false.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.Loop#getBlock <em>Block</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.Loop#getLoopTest <em>Loop Test</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getLoop()
 * @model abstract="true"
 * @generated
 */
public interface Loop extends Expression {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body block of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getLoop_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.Loop#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Loop Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the loop test expression evaluates to true the block is executed. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Test</em>' containment reference.
	 * @see #setLoopTest(Expression)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getLoop_LoopTest()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLoopTest();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.Loop#getLoopTest <em>Loop Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Test</em>' containment reference.
	 * @see #getLoopTest()
	 * @generated
	 */
	void setLoopTest(Expression value);

} // Loop

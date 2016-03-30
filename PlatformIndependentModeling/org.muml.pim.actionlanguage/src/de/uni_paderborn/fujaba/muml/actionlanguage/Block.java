/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A block is used to group expressions. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.Block#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of expressions may be attached as a body of a loop or represent a path of a conditional statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getBlock_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Block

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initialize Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to initialize a typed named element of type ArrayDataType (or a subtype).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.ArrayInitializeExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getArrayInitializeExpression()
 * @model
 * @generated
 */
public interface ArrayInitializeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.mumlcore.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of expressions where each Expression is used to initialize a particular
	 * array element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getArrayInitializeExpression_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ArrayInitializeExpression

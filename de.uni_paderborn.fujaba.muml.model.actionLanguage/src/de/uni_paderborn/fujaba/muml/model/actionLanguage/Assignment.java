/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import org.eclipse.emf.ecore.EAttribute;
import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignExpression <em>Assign Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneOperatorisSet='self.deacreaseIncreaseOperator.oclIsUndefined() xor self.assignOperator.oclIsUndefined()'"
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Assign Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @see #setAssignOperator(AssignOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_AssignOperator()
	 * @model
	 * @generated
	 */
	AssignOperator getAssignOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignOperator <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @see #getAssignOperator()
	 * @generated
	 */
	void setAssignOperator(AssignOperator value);

	/**
	 * Returns the value of the '<em><b>Assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Expression</em>' containment reference.
	 * @see #setAssignExpression(Expression)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_AssignExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAssignExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignExpression <em>Assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Expression</em>' containment reference.
	 * @see #getAssignExpression()
	 * @generated
	 */
	void setAssignExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Increment Decrement Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Decrement Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Decrement Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @see #setIncrementDecrementOperator(IncrementDecrementOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_IncrementDecrementOperator()
	 * @model
	 * @generated
	 */
	IncrementDecrementOperator getIncrementDecrementOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Decrement Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 */
	void setIncrementDecrementOperator(IncrementDecrementOperator value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // Assignment

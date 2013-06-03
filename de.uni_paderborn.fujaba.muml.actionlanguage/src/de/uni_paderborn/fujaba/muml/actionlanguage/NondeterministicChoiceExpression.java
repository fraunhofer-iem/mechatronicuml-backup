/**
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;

import de.uni_paderborn.fujaba.muml.valuetype.Range;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nondeterministic Choice Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The nondeterministic choice expression selects a value from an internal of integers
 * nondeterministically. It may be used to abstract from computations or interactions
 * that will modify a value of a variable, but are not yet implementable, e.g., within
 * a real-time coordination protocol. Nondeterministic choice expressions may only
 * be used as right-hand side of an assignment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.NondeterministicChoiceExpression#getRange <em>Range</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.NondeterministicChoiceExpression#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getNondeterministicChoiceExpression()
 * @model
 * @generated
 */
public interface NondeterministicChoiceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range defines the lower bound and the upper bound of the interval from which
	 * values will be chosen nondeterministically. Every value in this interval will be
	 * chosen with the same probability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getNondeterministicChoiceExpression_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.NondeterministicChoiceExpression#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base type for the interval defined by the range. We only allow for integer types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(PrimitiveDataType)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getNondeterministicChoiceExpression_DataType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDataType getDataType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.NondeterministicChoiceExpression#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(PrimitiveDataType value);

} // NondeterministicChoiceExpression

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.storydriven.modeling.NamedElement;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ActionExpression#getWcet <em>Wcet</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getActionExpression()
 * @model
 * @generated
 */
public interface ActionExpression extends Expression, NamedElement, StateEvent {
	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worst case execution time of this action.
	 * \todosd{Why is the type an ELongObject?}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wcet</em>' attribute.
	 * @see #setWcet(long)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getActionExpression_Wcet()
	 * @model
	 * @generated
	 */
	long getWcet();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ActionExpression#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' attribute.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(long value);

} // ActionExpression

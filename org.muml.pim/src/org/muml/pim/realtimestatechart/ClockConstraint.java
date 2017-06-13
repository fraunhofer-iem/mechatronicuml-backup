/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.muml.core.ExtendableElement;
import org.muml.core.expressions.common.ComparingOperator;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an arbitrary time constraint that can either be used as an invariant constraint of a state or as a transition guard.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getClockConstraint()
 * @model
 * @generated
 */
public interface ClockConstraint extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bound of a deadline (upper or lower) is a natural number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(TimeValue)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getClockConstraint_Bound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clock references in this clock constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getClockConstraint_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"LESS_OR_EQUAL"</code>.
	 * The literals are from the enumeration {@link org.muml.core.expressions.common.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operator that is used in this clock constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.core.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getClockConstraint_Operator()
	 * @model default="LESS_OR_EQUAL" required="true"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.core.expressions.common.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

} // ClockConstraint

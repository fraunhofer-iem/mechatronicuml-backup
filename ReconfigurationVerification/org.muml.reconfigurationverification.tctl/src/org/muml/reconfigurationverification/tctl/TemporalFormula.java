/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;

import org.muml.mumlcore.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getTemporalOperator <em>Temporal Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTemporalFormula()
 * @model abstract="true"
 * @generated
 */
public interface TemporalFormula extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The default value is <code>"LESS_OR_EQUAL"</code>.
	 * The literals are from the enumeration {@link org.muml.reconfigurationverification.tctl.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see org.muml.reconfigurationverification.tctl.ComparisonOperator
	 * @see #setComparisonOperator(ComparisonOperator)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTemporalFormula_ComparisonOperator()
	 * @model default="LESS_OR_EQUAL" required="true"
	 * @generated
	 */
	ComparisonOperator getComparisonOperator();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see org.muml.reconfigurationverification.tctl.ComparisonOperator
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Temporal Operator</b></em>' attribute.
	 * The default value is <code>"AF"</code>.
	 * The literals are from the enumeration {@link org.muml.reconfigurationverification.tctl.TemporalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Operator</em>' attribute.
	 * @see org.muml.reconfigurationverification.tctl.TemporalOperator
	 * @see #setTemporalOperator(TemporalOperator)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTemporalFormula_TemporalOperator()
	 * @model default="AF" required="true"
	 * @generated
	 */
	TemporalOperator getTemporalOperator();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getTemporalOperator <em>Temporal Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Operator</em>' attribute.
	 * @see org.muml.reconfigurationverification.tctl.TemporalOperator
	 * @see #getTemporalOperator()
	 * @generated
	 */
	void setTemporalOperator(TemporalOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTemporalFormula_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // TemporalFormula

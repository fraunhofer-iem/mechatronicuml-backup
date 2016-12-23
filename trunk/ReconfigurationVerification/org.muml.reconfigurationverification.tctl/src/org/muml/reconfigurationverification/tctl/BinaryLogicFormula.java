/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logic Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.BinaryLogicFormula#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getBinaryLogicFormula()
 * @model
 * @generated
 */
public interface BinaryLogicFormula extends BinaryFormula {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link org.muml.reconfigurationverification.tctl.BinaryLogicOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicOperator
	 * @see #setOperator(BinaryLogicOperator)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getBinaryLogicFormula_Operator()
	 * @model default="AND" required="true"
	 * @generated
	 */
	BinaryLogicOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.BinaryLogicFormula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryLogicOperator value);

} // BinaryLogicFormula

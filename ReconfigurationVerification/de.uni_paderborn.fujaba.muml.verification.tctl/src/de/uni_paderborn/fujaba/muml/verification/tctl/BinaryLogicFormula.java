/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.tctl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logic Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicFormula#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.tctl.TctlPackage#getBinaryLogicFormula()
 * @model
 * @generated
 */
public interface BinaryLogicFormula extends BinaryFormula {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicOperator
	 * @see #setOperator(BinaryLogicOperator)
	 * @see de.uni_paderborn.fujaba.muml.verification.tctl.TctlPackage#getBinaryLogicFormula_Operator()
	 * @model default="AND" required="true"
	 * @generated
	 */
	BinaryLogicOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicFormula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.verification.tctl.BinaryLogicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryLogicOperator value);

} // BinaryLogicFormula

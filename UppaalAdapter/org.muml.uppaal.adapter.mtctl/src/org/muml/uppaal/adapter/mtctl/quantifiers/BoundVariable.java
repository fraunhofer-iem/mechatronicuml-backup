/**
 */
package org.muml.uppaal.adapter.mtctl.quantifiers;

import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.sets.SetExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable#getSet <em>Set</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage#getBoundVariable()
 * @model
 * @generated
 */
public interface BoundVariable extends Expression {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(SetExpr)
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage#getBoundVariable_Set()
	 * @model containment="true"
	 * @generated
	 */
	SetExpr getSet();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(SetExpr value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage#getBoundVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BoundVariable

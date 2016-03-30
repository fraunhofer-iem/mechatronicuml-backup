/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl;

import org.muml.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends CommentableElement {

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage#getProperty_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);
} // Property

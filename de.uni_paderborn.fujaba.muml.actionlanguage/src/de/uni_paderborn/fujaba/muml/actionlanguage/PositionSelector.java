/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelector#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelector#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getPositionSelector()
 * @model
 * @generated
 */
public interface PositionSelector extends Expression {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelectorKind
	 * @see #setKind(PositionSelectorKind)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getPositionSelector_Kind()
	 * @model
	 * @generated
	 */
	PositionSelectorKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelectorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PositionSelectorKind value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' containment reference.
	 * @see #setSuccessor(PositionSelector)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getPositionSelector_Successor()
	 * @model containment="true"
	 * @generated
	 */
	PositionSelector getSuccessor();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelector#getSuccessor <em>Successor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' containment reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(PositionSelector value);

} // PositionSelector

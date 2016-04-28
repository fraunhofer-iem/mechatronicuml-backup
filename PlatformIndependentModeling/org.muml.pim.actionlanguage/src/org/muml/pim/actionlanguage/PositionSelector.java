/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a relative position of a sub-role instance or sub-port instance.
 * The kind defines the particular reference using an enum literal where
 * self refers to a sub-role instance (sub-port instance) itself, first or last refer to the
 * first or last sub-role instance (sub-port instance) or a multi-role instance (multi-port
 * instance), and next or prev refer to the next or previous sub-role instance (sub-port
 * instance). PositionSelectors can be concatenated using the successor reference.
 * That enables to specify, e.g., self.next, first.next, or self.prev.prev.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.PositionSelector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.PositionSelector#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getPositionSelector()
 * @model
 * @generated
 */
public interface PositionSelector extends Expression {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pim.actionlanguage.PositionSelectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enum literal defining the position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.pim.actionlanguage.PositionSelectorKind
	 * @see #setKind(PositionSelectorKind)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getPositionSelector_Kind()
	 * @model
	 * @generated
	 */
	PositionSelectorKind getKind();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.PositionSelector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.pim.actionlanguage.PositionSelectorKind
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
	 * <!-- begin-model-doc -->
	 * Successors of a PositionSelector enable to concatenate PositionSelectors for
	 * specifying more complex expression like self.next or self.prev.prev.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successor</em>' containment reference.
	 * @see #setSuccessor(PositionSelector)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getPositionSelector_Successor()
	 * @model containment="true"
	 * @generated
	 */
	PositionSelector getSuccessor();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.PositionSelector#getSuccessor <em>Successor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' containment reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(PositionSelector value);

} // PositionSelector

/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Position Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint#getPositionConstraintType <em>Position Constraint Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortPositionConstraint()
 * @model
 * @generated
 */
public interface MultiPortPositionConstraint extends MultiPortConstraint {
	/**
	 * Returns the value of the '<em><b>Position Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Constraint Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType
	 * @see #setPositionConstraintType(MultiPortPositionConstraintType)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortPositionConstraint_PositionConstraintType()
	 * @model
	 * @generated
	 */
	MultiPortPositionConstraintType getPositionConstraintType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint#getPositionConstraintType <em>Position Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Constraint Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType
	 * @see #getPositionConstraintType()
	 * @generated
	 */
	void setPositionConstraintType(MultiPortPositionConstraintType value);

} // MultiPortPositionConstraint

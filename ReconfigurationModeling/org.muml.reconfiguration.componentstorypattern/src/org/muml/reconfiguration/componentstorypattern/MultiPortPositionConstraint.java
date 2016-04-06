/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Position Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getPositionConstraintType <em>Position Constraint Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable <em>Sub Port Variable</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortPositionConstraint()
 * @model
 * @generated
 */
public interface MultiPortPositionConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Constraint Type</em>' attribute.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType
	 * @see #setPositionConstraintType(MultiPortPositionConstraintType)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortPositionConstraint_PositionConstraintType()
	 * @model
	 * @generated
	 */
	MultiPortPositionConstraintType getPositionConstraintType();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getPositionConstraintType <em>Position Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Constraint Type</em>' attribute.
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraintType
	 * @see #getPositionConstraintType()
	 * @generated
	 */
	void setPositionConstraintType(MultiPortPositionConstraintType value);

	/**
	 * Returns the value of the '<em><b>Sub Port Variable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getPositionConstraints <em>Position Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Port Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Port Variable</em>' container reference.
	 * @see #setSubPortVariable(SinglePortVariable)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortPositionConstraint_SubPortVariable()
	 * @see org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getPositionConstraints
	 * @model opposite="positionConstraints" required="true" transient="false"
	 * @generated
	 */
	SinglePortVariable getSubPortVariable();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable <em>Sub Port Variable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Port Variable</em>' container reference.
	 * @see #getSubPortVariable()
	 * @generated
	 */
	void setSubPortVariable(SinglePortVariable value);

} // MultiPortPositionConstraint

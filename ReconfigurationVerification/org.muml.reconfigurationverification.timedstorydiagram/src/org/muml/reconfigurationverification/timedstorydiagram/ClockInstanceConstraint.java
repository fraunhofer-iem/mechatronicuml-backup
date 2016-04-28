/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.expressions.common.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Instance Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable <em>Clock Instance Variable</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint()
 * @model
 * @generated
 */
public interface ClockInstanceConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Instance Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints <em>Clock Instance Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instance Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instance Variable</em>' reference.
	 * @see #setClockInstanceVariable(ClockInstanceVariable)
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint_ClockInstanceVariable()
	 * @see org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints
	 * @model opposite="clockInstanceConstraints"
	 * @generated
	 */
	ClockInstanceVariable getClockInstanceVariable();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable <em>Clock Instance Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Instance Variable</em>' reference.
	 * @see #getClockInstanceVariable()
	 * @generated
	 */
	void setClockInstanceVariable(ClockInstanceVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"LESS_OR_EQUAL"</code>.
	 * The literals are from the enumeration {@link org.muml.mumlcore.expressions.common.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint_Operator()
	 * @model default="LESS_OR_EQUAL"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint_Value()
	 * @model default="1"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ClockInstanceConstraint

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.timedstorydiagram;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.common.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Instance Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable <em>Clock Instance Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint()
 * @model
 * @generated
 */
public interface ClockInstanceConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Instance Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints <em>Clock Instance Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instance Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instance Variable</em>' reference.
	 * @see #setClockInstanceVariable(ClockInstanceVariable)
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint_ClockInstanceVariable()
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints
	 * @model opposite="clockInstanceConstraints"
	 * @generated
	 */
	ClockInstanceVariable getClockInstanceVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable <em>Clock Instance Variable</em>}' reference.
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
	 * The literals are from the enumeration {@link org.storydriven.core.expressions.common.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint_Operator()
	 * @model default="LESS_OR_EQUAL"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.ComparingOperator
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
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceConstraint_Value()
	 * @model default="1"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstanceConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ClockInstanceConstraint

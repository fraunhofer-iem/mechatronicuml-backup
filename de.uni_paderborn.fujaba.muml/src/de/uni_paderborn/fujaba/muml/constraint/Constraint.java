/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.constraint;

import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a constraint. A constraint defines certain properties a system has to fullfill. In terms of model checking a constraint represents the specification of the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#isBackground <em>Background</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#isCorrect <em>Correct</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Correctness</b></em>' attribute.
	 * The default value is <code>"Correctness.UNKNOWN"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.constraint.Correctness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The correctness of this constraint encoded as a literal of the enum type "Correctness".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correctness</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.constraint.Correctness
	 * @see #setCorrectness(Correctness)
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getConstraint_Correctness()
	 * @model default="Correctness.UNKNOWN"
	 * @generated
	 */
	Correctness getCorrectness();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#getCorrectness <em>Correctness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctness</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.constraint.Correctness
	 * @see #getCorrectness()
	 * @generated
	 */
	void setCorrectness(Correctness value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute decides whether background checking is activated for this constraint. If it is activated the correctness of the constraint is checked whenever the model changes. These checks are performed in the background such that user interaction is not interrupted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(boolean)
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getConstraint_Background()
	 * @model
	 * @generated
	 */
	boolean isBackground();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#isBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #isBackground()
	 * @generated
	 */
	void setBackground(boolean value);

	/**
	 * Returns the value of the '<em><b>Constrainable Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.constraint.ConstrainableElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element this constraint applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrainable Element</em>' container reference.
	 * @see #setConstrainableElement(ConstrainableElement)
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getConstraint_ConstrainableElement()
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstrainableElement#getConstraint
	 * @model opposite="constraint" required="true" transient="false"
	 * @generated
	 */
	ConstrainableElement getConstrainableElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrainable Element</em>' container reference.
	 * @see #getConstrainableElement()
	 * @generated
	 */
	void setConstrainableElement(ConstrainableElement value);

	/**
	 * Returns the value of the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute is "true" if and only if this.correctness == Correctness.CORRECT holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correct</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getConstraint_Correct()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.correctness = constraint::Correctness::CORRECT'"
	 * @generated
	 */
	boolean isCorrect();

} // Constraint

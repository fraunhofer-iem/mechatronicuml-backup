/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint;

import de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isBackground <em>Background</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isInternalConstraint <em>Internal Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isExtendAutomatically <em>Extend Automatically</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Correctness</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The correctness of this constraint encoded as a literal of the enum type "Correctness".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correctness</em>' attribute.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
	 * @see #setCorrectness(Correctness)
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getConstraint_Correctness()
	 * @model
	 * @generated
	 */
	Correctness getCorrectness();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getCorrectness <em>Correctness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctness</em>' attribute.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getConstraint_Background()
	 * @model
	 * @generated
	 */
	boolean isBackground();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #isBackground()
	 * @generated
	 */
	void setBackground(boolean value);

	/**
	 * Returns the value of the '<em><b>Internal Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Constraint</em>' attribute.
	 * @see #setInternalConstraint(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getConstraint_InternalConstraint()
	 * @model
	 * @generated
	 */
	boolean isInternalConstraint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isInternalConstraint <em>Internal Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Constraint</em>' attribute.
	 * @see #isInternalConstraint()
	 * @generated
	 */
	void setInternalConstraint(boolean value);

	/**
	 * Returns the value of the '<em><b>Extend Automatically</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend Automatically</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend Automatically</em>' attribute.
	 * @see #setExtendAutomatically(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getConstraint_ExtendAutomatically()
	 * @model
	 * @generated
	 */
	boolean isExtendAutomatically();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#isExtendAutomatically <em>Extend Automatically</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend Automatically</em>' attribute.
	 * @see #isExtendAutomatically()
	 * @generated
	 */
	void setExtendAutomatically(boolean value);

	/**
	 * Returns the value of the '<em><b>Constrainable Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrainable Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrainable Element</em>' reference.
	 * @see #setConstrainableElement(ConstrainableElement)
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage#getConstraint_ConstrainableElement()
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint
	 * @model opposite="constraint"
	 * @generated
	 */
	ConstrainableElement getConstrainableElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrainable Element</em>' reference.
	 * @see #getConstrainableElement()
	 * @generated
	 */
	void setConstrainableElement(ConstrainableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation yields the text of this constraint as a C comment e.g.
	 * <constraint text>
	 * TODO: Find out for what this is required.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTextAsComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation yields "true" if and only if this.correctness == Correctness.CORRECT holds.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCorrect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation returns a string representation of the current correctness of the constraint.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCorrectnessAsString();

} // Constraint

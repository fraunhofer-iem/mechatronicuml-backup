/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.expressions.ComparingOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an arbitrary time constraint that can either be used as an invariant constraint of a state or as a transition guard.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint#getBound <em>Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint#getUmlClock <em>Uml Clock</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLTimeConstraint()
 * @model
 * @generated
 */
public interface UMLTimeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLTimeConstraint_Bound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Uml Clock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getTimeConstraints <em>Time Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Clock</em>' reference.
	 * @see #setUmlClock(UMLClock)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLTimeConstraint_UmlClock()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getTimeConstraints
	 * @model opposite="timeConstraints"
	 * @generated
	 */
	UMLClock getUmlClock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint#getUmlClock <em>Uml Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Clock</em>' reference.
	 * @see #getUmlClock()
	 * @generated
	 */
	void setUmlClock(UMLClock value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"ComparingOperator.LESS_OR_EQUAL"</code>.
	 * The literals are from the enumeration {@link org.storydriven.modeling.expressions.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.modeling.expressions.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLTimeConstraint_Operator()
	 * @model default="ComparingOperator.LESS_OR_EQUAL" required="true"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.modeling.expressions.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, UMLTimeConstraint newAtom);

} // UMLTimeConstraint

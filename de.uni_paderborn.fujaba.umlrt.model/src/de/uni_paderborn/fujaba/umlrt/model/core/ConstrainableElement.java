/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrainable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all model elements that may carry a constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getConstrainableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConstrainableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getConstrainableElement_Constraint()
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint#getConstrainableElement
	 * @model opposite="constrainableElement"
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // ConstrainableElement

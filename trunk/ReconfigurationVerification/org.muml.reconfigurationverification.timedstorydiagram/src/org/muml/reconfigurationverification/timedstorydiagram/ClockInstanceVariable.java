/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.eclipse.emf.common.util.EList;
import org.muml.storydiagram.patterns.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Instance Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable#getClockInstanceConstraints <em>Clock Instance Constraints</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ClockInstanceVariableOnlyRefersToClockInstances='self.classifier = timedstorydiagram::ClockInstance' SetNameUponCreationOfClockInstance='if self.bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then (self.attributeAssignment -> size() >= 1 and self.attributeAssignment -> select(attribute.name = \'name\') -> size() >= 1) else true endif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ClockInstanceVariableOnlyRefersToClockInstances SetNameUponCreationOfClockInstance'"
 * @generated
 */
public interface ClockInstanceVariable extends ObjectVariable {
	/**
	 * Returns the value of the '<em><b>Clock Instance Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable <em>Clock Instance Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instance Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instance Constraints</em>' reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceVariable_ClockInstanceConstraints()
	 * @see org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint#getClockInstanceVariable
	 * @model opposite="clockInstanceVariable"
	 * @generated
	 */
	EList<ClockInstanceConstraint> getClockInstanceConstraints();

} // ClockInstanceVariable

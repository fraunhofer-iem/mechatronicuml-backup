/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.common.util.EList;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gt Automaton Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition#getTimeGuards <em>Time Guards</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition#getClockResets <em>Clock Resets</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonTransition()
 * @model
 * @generated
 */
public interface GtAutomatonTransition extends SDMTransition {
	/**
	 * Returns the value of the '<em><b>Time Guards</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Guards</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonTransition_TimeGuards()
	 * @model containment="true"
	 * @generated
	 */
	EList<GtAutomatonClockConstraint> getTimeGuards();

	/**
	 * Returns the value of the '<em><b>Clock Resets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Resets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Resets</em>' attribute list.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomatonTransition_ClockResets()
	 * @model
	 * @generated
	 */
	EList<String> getClockResets();

} // GtAutomatonTransition

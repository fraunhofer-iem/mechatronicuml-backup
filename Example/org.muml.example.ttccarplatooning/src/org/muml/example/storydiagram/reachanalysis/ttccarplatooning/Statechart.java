/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Statechart#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getStatechart()
 * @model
 * @generated
 */
public interface Statechart extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.State}.
	 * It is bidirectional and its opposite is '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.State#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getStatechart_States()
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.State#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // Statechart

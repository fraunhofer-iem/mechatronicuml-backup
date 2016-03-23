/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState#getActive <em>Active</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getActiveState()
 * @model
 * @generated
 */
public interface ActiveState extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' reference.
	 * @see #setActive(State)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getActiveState_Active()
	 * @model required="true"
	 * @generated
	 */
	State getActive();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState#getActive <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(State value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Statechart)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getActiveState_In()
	 * @model
	 * @generated
	 */
	Statechart getIn();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Statechart value);

} // ActiveState

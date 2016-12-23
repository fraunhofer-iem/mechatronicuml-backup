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
 * A representation of the model object '<em><b>Message Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue#getCarprocess <em>Carprocess</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getMessageQueue()
 * @model
 * @generated
 */
public interface MessageQueue extends EObject {
	/**
	 * Returns the value of the '<em><b>Carprocess</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carprocess</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carprocess</em>' container reference.
	 * @see #setCarprocess(Carprocess)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getMessageQueue_Carprocess()
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getQueue
	 * @model opposite="queue" transient="false"
	 * @generated
	 */
	Carprocess getCarprocess();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue#getCarprocess <em>Carprocess</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carprocess</em>' container reference.
	 * @see #getCarprocess()
	 * @generated
	 */
	void setCarprocess(Carprocess value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getMessageQueue_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // MessageQueue

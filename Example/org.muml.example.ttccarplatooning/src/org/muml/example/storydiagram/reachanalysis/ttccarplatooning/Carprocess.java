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
 * A representation of the model object '<em><b>Carprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getCurState <em>Cur State</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getFollower <em>Follower</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getAux <em>Aux</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getBldr <em>Bldr</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getCarParameter <em>Car Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess()
 * @model
 * @generated
 */
public interface Carprocess extends EObject {
	/**
	 * Returns the value of the '<em><b>Cur State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cur State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cur State</em>' containment reference.
	 * @see #setCurState(ActiveState)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_CurState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActiveState getCurState();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getCurState <em>Cur State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cur State</em>' containment reference.
	 * @see #getCurState()
	 * @generated
	 */
	void setCurState(ActiveState value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue#getCarprocess <em>Carprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' containment reference.
	 * @see #setQueue(MessageQueue)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_Queue()
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue#getCarprocess
	 * @model opposite="carprocess" containment="true" required="true"
	 * @generated
	 */
	MessageQueue getQueue();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getQueue <em>Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' containment reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(MessageQueue value);

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' reference.
	 * @see #setStatechart(Statechart)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_Statechart()
	 * @model
	 * @generated
	 */
	Statechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getStatechart <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(Statechart value);

	/**
	 * Returns the value of the '<em><b>Follower</b></em>' reference list.
	 * The list contents are of type {@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follower</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follower</em>' reference list.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_Follower()
	 * @model
	 * @generated
	 */
	EList<Carprocess> getFollower();

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' reference.
	 * @see #setLeader(Carprocess)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_Leader()
	 * @model
	 * @generated
	 */
	Carprocess getLeader();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getLeader <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(Carprocess value);

	/**
	 * Returns the value of the '<em><b>Aux</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' reference.
	 * @see #setAux(Carprocess)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_Aux()
	 * @model
	 * @generated
	 */
	Carprocess getAux();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getAux <em>Aux</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' reference.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(Carprocess value);

	/**
	 * Returns the value of the '<em><b>Bldr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bldr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bldr</em>' reference.
	 * @see #setBldr(Carprocess)
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_Bldr()
	 * @model
	 * @generated
	 */
	Carprocess getBldr();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess#getBldr <em>Bldr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bldr</em>' reference.
	 * @see #getBldr()
	 * @generated
	 */
	void setBldr(Carprocess value);

	/**
	 * Returns the value of the '<em><b>Car Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter}.
	 * It is bidirectional and its opposite is '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Parameter</em>' reference list.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getCarprocess_CarParameter()
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter#getCar
	 * @model opposite="car"
	 * @generated
	 */
	EList<CarParameter> getCarParameter();

} // Carprocess

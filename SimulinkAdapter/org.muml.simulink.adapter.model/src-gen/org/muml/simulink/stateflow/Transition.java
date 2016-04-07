/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.Transition#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.Transition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.stateflow.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition_Source()
	 * @see org.muml.simulink.stateflow.Node#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.stateflow.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition_Target()
	 * @see org.muml.simulink.stateflow.Node#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition_Priority()
	 * @model default="0"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.Transition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getGuard();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.Transition#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Transition

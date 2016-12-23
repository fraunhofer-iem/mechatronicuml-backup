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
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.State#getSubStateType <em>Sub State Type</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getEvents <em>Events</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getEmbeddedFunctions <em>Embedded Functions</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getDuringAction <em>During Action</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getLocal <em>Local</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.State#getInitial_guard <em>Initial guard</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.stateflow.StateflowPackage#getState()
 * @model
 * @generated
 */
public interface State extends Node {
	/**
	 * Returns the value of the '<em><b>Sub State Type</b></em>' attribute.
	 * The default value is <code>"EXCLUSIVE"</code>.
	 * The literals are from the enumeration {@link org.muml.simulink.stateflow.SubStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub State Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub State Type</em>' attribute.
	 * @see org.muml.simulink.stateflow.SubStateType
	 * @see #setSubStateType(SubStateType)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_SubStateType()
	 * @model default="EXCLUSIVE"
	 * @generated
	 */
	SubStateType getSubStateType();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.State#getSubStateType <em>Sub State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub State Type</em>' attribute.
	 * @see org.muml.simulink.stateflow.SubStateType
	 * @see #getSubStateType()
	 * @generated
	 */
	void setSubStateType(SubStateType value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Node}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.stateflow.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Nodes()
	 * @see org.muml.simulink.stateflow.Node#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Action</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_EntryAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getEntryAction();

	/**
	 * Returns the value of the '<em><b>Exit Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Action</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_ExitAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getExitAction();

	/**
	 * Returns the value of the '<em><b>During Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>During Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>During Action</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_DuringAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getDuringAction();

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Local()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getLocal();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Constant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getConstant();

	/**
	 * Returns the value of the '<em><b>Initial guard</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial guard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial guard</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Initial_guard()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getInitial_guard();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.State#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_Initial()
	 * @model
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Embedded Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.EmbeddedFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Functions</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getState_EmbeddedFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmbeddedFunction> getEmbeddedFunctions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.nodes->select(n| n.oclIsTypeOf(State) and n.oclAsType(State).name = name)->append(null)->first().oclAsType(State)'"
	 * @generated
	 */
	State getSubState(String name);

} // State

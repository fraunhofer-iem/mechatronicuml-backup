/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Async Send2sf Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getSfEnqAction <em>Sf Enq Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEAnnotation <em>EAnnotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEStringToStringMapEntry <em>EString To String Map Entry</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncSend2sfAction()
 * @model
 * @generated
 */
public interface scAsyncSend2sfAction extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sf Enq Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Enq Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Enq Action</em>' reference.
	 * @see #setSfEnqAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncSend2sfAction_SfEnqAction()
	 * @model
	 * @generated
	 */
	Action getSfEnqAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getSfEnqAction <em>Sf Enq Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Enq Action</em>' reference.
	 * @see #getSfEnqAction()
	 * @generated
	 */
	void setSfEnqAction(Action value);

	/**
	 * Returns the value of the '<em><b>Asynchronous Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynchronous Message Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchronous Message Event</em>' reference.
	 * @see #setAsynchronousMessageEvent(AsynchronousMessageEvent)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncSend2sfAction_AsynchronousMessageEvent()
	 * @model
	 * @generated
	 */
	AsynchronousMessageEvent getAsynchronousMessageEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asynchronous Message Event</em>' reference.
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	void setAsynchronousMessageEvent(AsynchronousMessageEvent value);

	/**
	 * Returns the value of the '<em><b>EAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAnnotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAnnotation</em>' reference.
	 * @see #setEAnnotation(EAnnotation)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncSend2sfAction_EAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getEAnnotation();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEAnnotation <em>EAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAnnotation</em>' reference.
	 * @see #getEAnnotation()
	 * @generated
	 */
	void setEAnnotation(EAnnotation value);

	/**
	 * Returns the value of the '<em><b>EString To String Map Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EString To String Map Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EString To String Map Entry</em>' reference.
	 * @see #setEStringToStringMapEntry(Map.Entry)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncSend2sfAction_EStringToStringMapEntry()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getEStringToStringMapEntry();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEStringToStringMapEntry <em>EString To String Map Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EString To String Map Entry</em>' reference.
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	void setEStringToStringMapEntry(Map.Entry<String, String> value);

} // scAsyncSend2sfAction

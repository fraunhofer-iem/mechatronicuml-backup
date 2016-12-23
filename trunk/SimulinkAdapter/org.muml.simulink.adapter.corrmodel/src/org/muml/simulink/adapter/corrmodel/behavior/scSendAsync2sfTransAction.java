/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.eclipse.emf.ecore.EParameter;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Message;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Send Async2sf Trans Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getSfSendAsync <em>Sf Send Async</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getMessage <em>Message</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getActionValue <em>Action Value</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getScPara <em>Sc Para</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getParBind <em>Par Bind</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction()
 * @model
 * @generated
 */
public interface scSendAsync2sfTransAction extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sf Send Async</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Send Async</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Send Async</em>' reference.
	 * @see #setSfSendAsync(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction_SfSendAsync()
	 * @model
	 * @generated
	 */
	Action getSfSendAsync();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getSfSendAsync <em>Sf Send Async</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Send Async</em>' reference.
	 * @see #getSfSendAsync()
	 * @generated
	 */
	void setSfSendAsync(Action value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction_AsynchronousMessageEvent()
	 * @model
	 * @generated
	 */
	AsynchronousMessageEvent getAsynchronousMessageEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asynchronous Message Event</em>' reference.
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	void setAsynchronousMessageEvent(AsynchronousMessageEvent value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction_Message()
	 * @model
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Action Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Value</em>' attribute.
	 * @see #setActionValue(String)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction_ActionValue()
	 * @model default=""
	 * @generated
	 */
	String getActionValue();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getActionValue <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Value</em>' attribute.
	 * @see #getActionValue()
	 * @generated
	 */
	void setActionValue(String value);

	/**
	 * Returns the value of the '<em><b>Sc Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Para</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Para</em>' reference.
	 * @see #setScPara(EParameter)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction_ScPara()
	 * @model
	 * @generated
	 */
	EParameter getScPara();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getScPara <em>Sc Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Para</em>' reference.
	 * @see #getScPara()
	 * @generated
	 */
	void setScPara(EParameter value);

	/**
	 * Returns the value of the '<em><b>Par Bind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par Bind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par Bind</em>' reference.
	 * @see #setParBind(ParameterBinding)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendAsync2sfTransAction_ParBind()
	 * @model
	 * @generated
	 */
	ParameterBinding getParBind();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getParBind <em>Par Bind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par Bind</em>' reference.
	 * @see #getParBind()
	 * @generated
	 */
	void setParBind(ParameterBinding value);

} // scSendAsync2sfTransAction

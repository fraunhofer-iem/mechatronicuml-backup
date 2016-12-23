/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.one_to_n_schemata;

import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The communication schema allows for assigning a task to one coordination partner that is currently not working on a task assigned using the same message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getMaxWorkingTime <em>Max Working Time</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getOnResponseAction <em>On Response Action</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet='-- LoadBalancing must define the responseMessage or the maxWorkingTime\r\nnot self.responseMessage.oclIsUndefined() or not self.maxWorkingTime.oclIsUndefined()' LoadbalancingEitherHasResponseMessageOrWcet='-- responseMessage and maxWorkingTime exclude each other\r\nif not self.responseMessage.oclIsUndefined() and not self.maxWorkingTime.oclIsUndefined() then\r\n\tfalse\r\nelse\r\n\ttrue\r\nendif' ResponseActionCanOnlyBeSetIfResponseMessageIsUsed='-- if onResponseAction is set, the responseMessage must be set, too.\r\n(not onResponseAction.oclIsUndefined()) implies (not responseMessage.oclIsUndefined())'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LoadbalancingEitherHasResponseMessageOrWcet ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet ResponseActionCanOnlyBeSetIfResponseMessageIsUsed'"
 * @generated
 */
public interface LoadBalancing extends SendingOneToManyCommunicationSchema {
	/**
	 * Returns the value of the '<em><b>Response Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The response message must be a trigger message. By receiving the message, a subrole is allowed to assign a new task to the corresponding coordination partner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Message</em>' reference.
	 * @see #setResponseMessage(MessageType)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing_ResponseMessage()
	 * @model
	 * @generated
	 */
	MessageType getResponseMessage();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getResponseMessage <em>Response Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Message</em>' reference.
	 * @see #getResponseMessage()
	 * @generated
	 */
	void setResponseMessage(MessageType value);

	/**
	 * Returns the value of the '<em><b>Max Working Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After this maximum working time, a coordination partner that got a task assigned is ready to accept a new task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Working Time</em>' containment reference.
	 * @see #setMaxWorkingTime(TimeValue)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing_MaxWorkingTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getMaxWorkingTime();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getMaxWorkingTime <em>Max Working Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Working Time</em>' containment reference.
	 * @see #getMaxWorkingTime()
	 * @generated
	 */
	void setMaxWorkingTime(TimeValue value);

	/**
	 * Returns the value of the '<em><b>On Response Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Response Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines which action should be executed on response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Response Action</em>' containment reference.
	 * @see #setOnResponseAction(Action)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing_OnResponseAction()
	 * @model containment="true"
	 * @generated
	 */
	Action getOnResponseAction();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getOnResponseAction <em>On Response Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Response Action</em>' containment reference.
	 * @see #getOnResponseAction()
	 * @generated
	 */
	void setOnResponseAction(Action value);

} // LoadBalancing

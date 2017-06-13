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

import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To Many Communication Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class all communication schemata inherit from (at least indirectly).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAction <em>Action</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getRetryAfter <em>Retry After</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema()
 * @model abstract="true"
 * @generated
 */
public interface OneToManyCommunicationSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subrole only sends or receives a message if it satisfies this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema <em>One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The asynchronous message event that contains the communication schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asynchronous Message Event</em>' container reference.
	 * @see #setAsynchronousMessageEvent(AsynchronousMessageEvent)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_AsynchronousMessageEvent()
	 * @see org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema
	 * @model opposite="oneToManyCommunicationSchema" required="true" transient="false"
	 * @generated
	 */
	AsynchronousMessageEvent getAsynchronousMessageEvent();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asynchronous Message Event</em>' container reference.
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	void setAsynchronousMessageEvent(AsynchronousMessageEvent value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action a subrole performs when sending or receiving a message with communication schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the transition uses a communication schemata with the condition attribute, then it may happen that no subrole may send or receive a message. Before the RTSC may retry to execute the communication schemata, it has to wait a specific time. This time is encoded within the attribute retryAfter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry After</em>' containment reference.
	 * @see #setRetryAfter(TimeValue)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_RetryAfter()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getRetryAfter();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getRetryAfter <em>Retry After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry After</em>' containment reference.
	 * @see #getRetryAfter()
	 * @generated
	 */
	void setRetryAfter(TimeValue value);

} // OneToManyCommunicationSchema

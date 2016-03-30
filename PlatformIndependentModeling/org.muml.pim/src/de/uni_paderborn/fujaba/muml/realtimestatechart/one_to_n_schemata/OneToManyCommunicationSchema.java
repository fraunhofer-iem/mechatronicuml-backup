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
package de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;

import org.eclipse.emf.ecore.EObject;
import org.muml.core.expressions.Expression;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema()
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
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema <em>One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The asynchronous message event that contains the communication schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asynchronous Message Event</em>' container reference.
	 * @see #setAsynchronousMessageEvent(AsynchronousMessageEvent)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_AsynchronousMessageEvent()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema
	 * @model opposite="oneToManyCommunicationSchema" required="true" transient="false"
	 * @generated
	 */
	AsynchronousMessageEvent getAsynchronousMessageEvent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}' container reference.
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
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getOneToManyCommunicationSchema_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // OneToManyCommunicationSchema

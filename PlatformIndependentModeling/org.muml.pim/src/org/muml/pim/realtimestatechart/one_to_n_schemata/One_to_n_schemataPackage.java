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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package provides communication schemata a message of a multi role Real-Time Statechart (or multi port RTSC) may contain. 
 * They allow for designing dependencies between multiple one-to-one coordinations.
 * <!-- end-model-doc -->
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface One_to_n_schemataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "one_to_n_schemata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pim/one_to_n_schemata/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "one_to_n_schemata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	One_to_n_schemataPackage eINSTANCE = org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl <em>One To Many Communication Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getOneToManyCommunicationSchema()
	 * @generated
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER = 3;

	/**
	 * The number of structural features of the '<em>One To Many Communication Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>One To Many Communication Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SendingOneToManyCommunicationSchemaImpl <em>Sending One To Many Communication Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SendingOneToManyCommunicationSchemaImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getSendingOneToManyCommunicationSchema()
	 * @generated
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION = ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT = ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION = ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER = ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The number of structural features of the '<em>Sending One To Many Communication Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT = ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sending One To Many Communication Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT = ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MulticastImpl <em>Multicast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MulticastImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getMulticast()
	 * @generated
	 */
	int MULTICAST = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST__CONDITION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST__ASYNCHRONOUS_MESSAGE_EVENT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST__ACTION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST__RETRY_AFTER = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The number of structural features of the '<em>Multicast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_FEATURE_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multicast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTICAST_OPERATION_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.UnicastImpl <em>Unicast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.UnicastImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getUnicast()
	 * @generated
	 */
	int UNICAST = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST__CONDITION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST__ASYNCHRONOUS_MESSAGE_EVENT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST__ACTION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST__RETRY_AFTER = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The number of structural features of the '<em>Unicast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_FEATURE_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unicast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICAST_OPERATION_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl <em>Iterate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getIterate()
	 * @generated
	 */
	int ITERATE = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__CONDITION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__ASYNCHRONOUS_MESSAGE_EVENT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__ACTION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__RETRY_AFTER = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The feature id for the '<em><b>Termination Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__TERMINATION_CONDITION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__DELAY = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start From First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__START_FROM_FIRST = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_FEATURE_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Iterate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_OPERATION_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl <em>Load Balancing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getLoadBalancing()
	 * @generated
	 */
	int LOAD_BALANCING = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__CONDITION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__ASYNCHRONOUS_MESSAGE_EVENT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__ACTION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__RETRY_AFTER = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The feature id for the '<em><b>Response Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__RESPONSE_MESSAGE = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Working Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__MAX_WORKING_TIME = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Response Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING__ON_RESPONSE_ACTION = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Load Balancing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING_FEATURE_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Load Balancing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCING_OPERATION_COUNT = SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.ReceivingOneToManyCommunicationSchemaImpl <em>Receiving One To Many Communication Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.ReceivingOneToManyCommunicationSchemaImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getReceivingOneToManyCommunicationSchema()
	 * @generated
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION = ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT = ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION = ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER = ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The number of structural features of the '<em>Receiving One To Many Communication Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT = ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receiving One To Many Communication Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT = ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SingleReceiveImpl <em>Single Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SingleReceiveImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getSingleReceive()
	 * @generated
	 */
	int SINGLE_RECEIVE = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RECEIVE__CONDITION = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RECEIVE__ASYNCHRONOUS_MESSAGE_EVENT = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RECEIVE__ACTION = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RECEIVE__RETRY_AFTER = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The number of structural features of the '<em>Single Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RECEIVE_FEATURE_COUNT = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RECEIVE_OPERATION_COUNT = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MultiReceiveImpl <em>Multi Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MultiReceiveImpl
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getMultiReceive()
	 * @generated
	 */
	int MULTI_RECEIVE = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE__CONDITION = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE__ASYNCHRONOUS_MESSAGE_EVENT = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE__ACTION = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION;

	/**
	 * The feature id for the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE__RETRY_AFTER = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER;

	/**
	 * The feature id for the '<em><b>Failure Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE__FAILURE_ACTION = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE_FEATURE_COUNT = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RECEIVE_OPERATION_COUNT = RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema <em>One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many Communication Schema</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema
	 * @generated
	 */
	EClass getOneToManyCommunicationSchema();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getCondition()
	 * @see #getOneToManyCommunicationSchema()
	 * @generated
	 */
	EReference getOneToManyCommunicationSchema_Condition();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Asynchronous Message Event</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent()
	 * @see #getOneToManyCommunicationSchema()
	 * @generated
	 */
	EReference getOneToManyCommunicationSchema_AsynchronousMessageEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAction()
	 * @see #getOneToManyCommunicationSchema()
	 * @generated
	 */
	EReference getOneToManyCommunicationSchema_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getRetryAfter <em>Retry After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry After</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getRetryAfter()
	 * @see #getOneToManyCommunicationSchema()
	 * @generated
	 */
	EReference getOneToManyCommunicationSchema_RetryAfter();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multicast</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast
	 * @generated
	 */
	EClass getMulticast();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast <em>Unicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unicast</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast
	 * @generated
	 */
	EClass getUnicast();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate
	 * @generated
	 */
	EClass getIterate();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getTerminationCondition <em>Termination Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Termination Condition</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getTerminationCondition()
	 * @see #getIterate()
	 * @generated
	 */
	EReference getIterate_TerminationCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getDelay()
	 * @see #getIterate()
	 * @generated
	 */
	EReference getIterate_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#isStartFromFirst <em>Start From First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start From First</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#isStartFromFirst()
	 * @see #getIterate()
	 * @generated
	 */
	EAttribute getIterate_StartFromFirst();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing <em>Load Balancing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancing</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing
	 * @generated
	 */
	EClass getLoadBalancing();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getResponseMessage <em>Response Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Message</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getResponseMessage()
	 * @see #getLoadBalancing()
	 * @generated
	 */
	EReference getLoadBalancing_ResponseMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getMaxWorkingTime <em>Max Working Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Working Time</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getMaxWorkingTime()
	 * @see #getLoadBalancing()
	 * @generated
	 */
	EReference getLoadBalancing_MaxWorkingTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getOnResponseAction <em>On Response Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Response Action</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing#getOnResponseAction()
	 * @see #getLoadBalancing()
	 * @generated
	 */
	EReference getLoadBalancing_OnResponseAction();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive <em>Single Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Receive</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive
	 * @generated
	 */
	EClass getSingleReceive();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive <em>Multi Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Receive</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive
	 * @generated
	 */
	EClass getMultiReceive();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive#getFailureAction <em>Failure Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure Action</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive#getFailureAction()
	 * @see #getMultiReceive()
	 * @generated
	 */
	EReference getMultiReceive_FailureAction();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema <em>Receiving One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiving One To Many Communication Schema</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema
	 * @generated
	 */
	EClass getReceivingOneToManyCommunicationSchema();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema <em>Sending One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sending One To Many Communication Schema</em>'.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema
	 * @generated
	 */
	EClass getSendingOneToManyCommunicationSchema();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	One_to_n_schemataFactory getOne_to_n_schemataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl <em>One To Many Communication Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getOneToManyCommunicationSchema()
		 * @generated
		 */
		EClass ONE_TO_MANY_COMMUNICATION_SCHEMA = eINSTANCE.getOneToManyCommunicationSchema();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION = eINSTANCE.getOneToManyCommunicationSchema_Condition();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Message Event</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT = eINSTANCE.getOneToManyCommunicationSchema_AsynchronousMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION = eINSTANCE.getOneToManyCommunicationSchema_Action();

		/**
		 * The meta object literal for the '<em><b>Retry After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER = eINSTANCE.getOneToManyCommunicationSchema_RetryAfter();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MulticastImpl <em>Multicast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MulticastImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getMulticast()
		 * @generated
		 */
		EClass MULTICAST = eINSTANCE.getMulticast();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.UnicastImpl <em>Unicast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.UnicastImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getUnicast()
		 * @generated
		 */
		EClass UNICAST = eINSTANCE.getUnicast();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl <em>Iterate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getIterate()
		 * @generated
		 */
		EClass ITERATE = eINSTANCE.getIterate();

		/**
		 * The meta object literal for the '<em><b>Termination Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE__TERMINATION_CONDITION = eINSTANCE.getIterate_TerminationCondition();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE__DELAY = eINSTANCE.getIterate_Delay();

		/**
		 * The meta object literal for the '<em><b>Start From First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATE__START_FROM_FIRST = eINSTANCE.getIterate_StartFromFirst();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl <em>Load Balancing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getLoadBalancing()
		 * @generated
		 */
		EClass LOAD_BALANCING = eINSTANCE.getLoadBalancing();

		/**
		 * The meta object literal for the '<em><b>Response Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCING__RESPONSE_MESSAGE = eINSTANCE.getLoadBalancing_ResponseMessage();

		/**
		 * The meta object literal for the '<em><b>Max Working Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCING__MAX_WORKING_TIME = eINSTANCE.getLoadBalancing_MaxWorkingTime();

		/**
		 * The meta object literal for the '<em><b>On Response Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCING__ON_RESPONSE_ACTION = eINSTANCE.getLoadBalancing_OnResponseAction();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SingleReceiveImpl <em>Single Receive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SingleReceiveImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getSingleReceive()
		 * @generated
		 */
		EClass SINGLE_RECEIVE = eINSTANCE.getSingleReceive();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MultiReceiveImpl <em>Multi Receive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MultiReceiveImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getMultiReceive()
		 * @generated
		 */
		EClass MULTI_RECEIVE = eINSTANCE.getMultiReceive();

		/**
		 * The meta object literal for the '<em><b>Failure Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_RECEIVE__FAILURE_ACTION = eINSTANCE.getMultiReceive_FailureAction();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.ReceivingOneToManyCommunicationSchemaImpl <em>Receiving One To Many Communication Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.ReceivingOneToManyCommunicationSchemaImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getReceivingOneToManyCommunicationSchema()
		 * @generated
		 */
		EClass RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA = eINSTANCE.getReceivingOneToManyCommunicationSchema();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SendingOneToManyCommunicationSchemaImpl <em>Sending One To Many Communication Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.SendingOneToManyCommunicationSchemaImpl
		 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl#getSendingOneToManyCommunicationSchema()
		 * @generated
		 */
		EClass SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA = eINSTANCE.getSendingOneToManyCommunicationSchema();

	}

} //One_to_n_schemataPackage

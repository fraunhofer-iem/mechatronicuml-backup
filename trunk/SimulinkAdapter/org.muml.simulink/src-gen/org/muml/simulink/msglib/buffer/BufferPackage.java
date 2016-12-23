/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.buffer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.muml.simulink.stateflow.StateflowPackage;

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
 * @see org.muml.simulink.msglib.buffer.BufferFactory
 * @model kind="package"
 * @generated
 */
public interface BufferPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "buffer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/simulink/msglib/buffer/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "buffer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BufferPackage eINSTANCE = org.muml.simulink.msglib.buffer.impl.BufferPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.BufferFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.BufferFunctionImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getBufferFunction()
	 * @generated
	 */
	int BUFFER_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__PARAMETERS = StateflowPackage.EMBEDDED_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__ID = StateflowPackage.EMBEDDED_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__NAME = StateflowPackage.EMBEDDED_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__CODE = StateflowPackage.EMBEDDED_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__INPUT = StateflowPackage.EMBEDDED_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__OUTPUT = StateflowPackage.EMBEDDED_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__LOCAL = StateflowPackage.EMBEDDED_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__CONSTANT = StateflowPackage.EMBEDDED_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION__BUFFER_SIZE = StateflowPackage.EMBEDDED_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION_FEATURE_COUNT = StateflowPackage.EMBEDDED_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION___GET_PARAMETER__STRING = StateflowPackage.EMBEDDED_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FUNCTION_OPERATION_COUNT = StateflowPackage.EMBEDDED_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.EnqueueImpl <em>Enqueue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.EnqueueImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getEnqueue()
	 * @generated
	 */
	int ENQUEUE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__PARAMETERS = BUFFER_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__ID = BUFFER_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__NAME = BUFFER_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__CODE = BUFFER_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__INPUT = BUFFER_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__OUTPUT = BUFFER_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__LOCAL = BUFFER_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__CONSTANT = BUFFER_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE__BUFFER_SIZE = BUFFER_FUNCTION__BUFFER_SIZE;

	/**
	 * The number of structural features of the '<em>Enqueue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_FEATURE_COUNT = BUFFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE___GET_PARAMETER__STRING = BUFFER_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Enqueue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OPERATION_COUNT = BUFFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.DequeueImpl <em>Dequeue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.DequeueImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getDequeue()
	 * @generated
	 */
	int DEQUEUE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__PARAMETERS = BUFFER_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__ID = BUFFER_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__NAME = BUFFER_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__CODE = BUFFER_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__INPUT = BUFFER_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__OUTPUT = BUFFER_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__LOCAL = BUFFER_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__CONSTANT = BUFFER_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE__BUFFER_SIZE = BUFFER_FUNCTION__BUFFER_SIZE;

	/**
	 * The number of structural features of the '<em>Dequeue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE_FEATURE_COUNT = BUFFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE___GET_PARAMETER__STRING = BUFFER_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Dequeue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEQUEUE_OPERATION_COUNT = BUFFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.CheckQueueImpl <em>Check Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.CheckQueueImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getCheckQueue()
	 * @generated
	 */
	int CHECK_QUEUE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__PARAMETERS = BUFFER_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__ID = BUFFER_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__NAME = BUFFER_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__CODE = BUFFER_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__INPUT = BUFFER_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__OUTPUT = BUFFER_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__LOCAL = BUFFER_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__CONSTANT = BUFFER_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE__BUFFER_SIZE = BUFFER_FUNCTION__BUFFER_SIZE;

	/**
	 * The number of structural features of the '<em>Check Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE_FEATURE_COUNT = BUFFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE___GET_PARAMETER__STRING = BUFFER_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Check Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUEUE_OPERATION_COUNT = BUFFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.SharedEnqueueImpl <em>Shared Enqueue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.SharedEnqueueImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getSharedEnqueue()
	 * @generated
	 */
	int SHARED_ENQUEUE = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__PARAMETERS = BUFFER_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__ID = BUFFER_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__NAME = BUFFER_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__CODE = BUFFER_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__INPUT = BUFFER_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__OUTPUT = BUFFER_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__LOCAL = BUFFER_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__CONSTANT = BUFFER_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE__BUFFER_SIZE = BUFFER_FUNCTION__BUFFER_SIZE;

	/**
	 * The number of structural features of the '<em>Shared Enqueue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE_FEATURE_COUNT = BUFFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE___GET_PARAMETER__STRING = BUFFER_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Shared Enqueue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_ENQUEUE_OPERATION_COUNT = BUFFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.SharedDequeueImpl <em>Shared Dequeue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.SharedDequeueImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getSharedDequeue()
	 * @generated
	 */
	int SHARED_DEQUEUE = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__PARAMETERS = BUFFER_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__ID = BUFFER_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__NAME = BUFFER_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__CODE = BUFFER_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__INPUT = BUFFER_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__OUTPUT = BUFFER_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__LOCAL = BUFFER_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__CONSTANT = BUFFER_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE__BUFFER_SIZE = BUFFER_FUNCTION__BUFFER_SIZE;

	/**
	 * The number of structural features of the '<em>Shared Dequeue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE_FEATURE_COUNT = BUFFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE___GET_PARAMETER__STRING = BUFFER_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Shared Dequeue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_DEQUEUE_OPERATION_COUNT = BUFFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.msglib.buffer.impl.SharedCheckQueueImpl <em>Shared Check Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.msglib.buffer.impl.SharedCheckQueueImpl
	 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getSharedCheckQueue()
	 * @generated
	 */
	int SHARED_CHECK_QUEUE = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__PARAMETERS = BUFFER_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__ID = BUFFER_FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__NAME = BUFFER_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__CODE = BUFFER_FUNCTION__CODE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__INPUT = BUFFER_FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__OUTPUT = BUFFER_FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__LOCAL = BUFFER_FUNCTION__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__CONSTANT = BUFFER_FUNCTION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE__BUFFER_SIZE = BUFFER_FUNCTION__BUFFER_SIZE;

	/**
	 * The number of structural features of the '<em>Shared Check Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE_FEATURE_COUNT = BUFFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE___GET_PARAMETER__STRING = BUFFER_FUNCTION___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Shared Check Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_CHECK_QUEUE_OPERATION_COUNT = BUFFER_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.Enqueue <em>Enqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enqueue</em>'.
	 * @see org.muml.simulink.msglib.buffer.Enqueue
	 * @generated
	 */
	EClass getEnqueue();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.Dequeue <em>Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dequeue</em>'.
	 * @see org.muml.simulink.msglib.buffer.Dequeue
	 * @generated
	 */
	EClass getDequeue();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.CheckQueue <em>Check Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Queue</em>'.
	 * @see org.muml.simulink.msglib.buffer.CheckQueue
	 * @generated
	 */
	EClass getCheckQueue();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.SharedEnqueue <em>Shared Enqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Enqueue</em>'.
	 * @see org.muml.simulink.msglib.buffer.SharedEnqueue
	 * @generated
	 */
	EClass getSharedEnqueue();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.SharedDequeue <em>Shared Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Dequeue</em>'.
	 * @see org.muml.simulink.msglib.buffer.SharedDequeue
	 * @generated
	 */
	EClass getSharedDequeue();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.SharedCheckQueue <em>Shared Check Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Check Queue</em>'.
	 * @see org.muml.simulink.msglib.buffer.SharedCheckQueue
	 * @generated
	 */
	EClass getSharedCheckQueue();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.msglib.buffer.BufferFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.muml.simulink.msglib.buffer.BufferFunction
	 * @generated
	 */
	EClass getBufferFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.msglib.buffer.BufferFunction#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.muml.simulink.msglib.buffer.BufferFunction#getBufferSize()
	 * @see #getBufferFunction()
	 * @generated
	 */
	EAttribute getBufferFunction_BufferSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BufferFactory getBufferFactory();

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
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.EnqueueImpl <em>Enqueue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.EnqueueImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getEnqueue()
		 * @generated
		 */
		EClass ENQUEUE = eINSTANCE.getEnqueue();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.DequeueImpl <em>Dequeue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.DequeueImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getDequeue()
		 * @generated
		 */
		EClass DEQUEUE = eINSTANCE.getDequeue();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.CheckQueueImpl <em>Check Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.CheckQueueImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getCheckQueue()
		 * @generated
		 */
		EClass CHECK_QUEUE = eINSTANCE.getCheckQueue();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.SharedEnqueueImpl <em>Shared Enqueue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.SharedEnqueueImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getSharedEnqueue()
		 * @generated
		 */
		EClass SHARED_ENQUEUE = eINSTANCE.getSharedEnqueue();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.SharedDequeueImpl <em>Shared Dequeue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.SharedDequeueImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getSharedDequeue()
		 * @generated
		 */
		EClass SHARED_DEQUEUE = eINSTANCE.getSharedDequeue();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.SharedCheckQueueImpl <em>Shared Check Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.SharedCheckQueueImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getSharedCheckQueue()
		 * @generated
		 */
		EClass SHARED_CHECK_QUEUE = eINSTANCE.getSharedCheckQueue();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.msglib.buffer.impl.BufferFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.msglib.buffer.impl.BufferFunctionImpl
		 * @see org.muml.simulink.msglib.buffer.impl.BufferPackageImpl#getBufferFunction()
		 * @generated
		 */
		EClass BUFFER_FUNCTION = eINSTANCE.getBufferFunction();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER_FUNCTION__BUFFER_SIZE = eINSTANCE.getBufferFunction_BufferSize();

	}

} //BufferPackage

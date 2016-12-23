/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

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
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontraceFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutiontracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "executiontrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/interpreter/core/executiontrace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "executiontrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutiontracePackage eINSTANCE = org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.MapEntryImpl <em>Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.MapEntryImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getMapEntry()
	 * @generated
	 */
	int MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl <em>Execution Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getExecutionTrace()
	 * @generated
	 */
	int EXECUTION_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TRACE__EXECUTIONS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TRACE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Total Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TRACE__TOTAL_EXECUTION_TIME = 2;

	/**
	 * The feature id for the '<em><b>Total Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC = 3;

	/**
	 * The number of structural features of the '<em>Execution Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TRACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Execution Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTION_STARTED_TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTION_FINISHED_TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTION_TIME = 2;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTION_TIME_MSEC = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CONTAINER = 5;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getActivityExecution()
	 * @generated
	 */
	int ACTIVITY_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__ACTIVITY = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Parameter Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__IN_PARAMETER_VALUES = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Parameter Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityNodeExecutionImpl <em>Activity Node Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityNodeExecutionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getActivityNodeExecution()
	 * @generated
	 */
	int ACTIVITY_NODE_EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Node Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Node Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityEdgeTraversalImpl <em>Activity Edge Traversal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityEdgeTraversalImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getActivityEdgeTraversal()
	 * @generated
	 */
	int ACTIVITY_EDGE_TRAVERSAL = 5;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Activity Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Traversal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Edge Traversal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_TRAVERSAL_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternExecutionImpl <em>Story Pattern Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternExecutionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternExecution()
	 * @generated
	 */
	int STORY_PATTERN_EXECUTION = 6;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION__STORY_PATTERN = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternInitializationImpl <em>Story Pattern Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternInitializationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternInitialization()
	 * @generated
	 */
	int STORY_PATTERN_INITIALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__EXECUTION_TIME = STORY_PATTERN_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__EXECUTION_TIME_MSEC = STORY_PATTERN_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__ELEMENTS = STORY_PATTERN_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__CONTAINER = STORY_PATTERN_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION__STORY_PATTERN = STORY_PATTERN_EXECUTION__STORY_PATTERN;

	/**
	 * The number of structural features of the '<em>Story Pattern Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION_FEATURE_COUNT = STORY_PATTERN_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_INITIALIZATION_OPERATION_COUNT = STORY_PATTERN_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternMatchingImpl <em>Story Pattern Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternMatchingImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternMatching()
	 * @generated
	 */
	int STORY_PATTERN_MATCHING = 8;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__EXECUTION_TIME = STORY_PATTERN_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__EXECUTION_TIME_MSEC = STORY_PATTERN_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__ELEMENTS = STORY_PATTERN_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__CONTAINER = STORY_PATTERN_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__STORY_PATTERN = STORY_PATTERN_EXECUTION__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING__SUCCESSFUL = STORY_PATTERN_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING_FEATURE_COUNT = STORY_PATTERN_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_MATCHING_OPERATION_COUNT = STORY_PATTERN_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternApplicationImpl <em>Story Pattern Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternApplicationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternApplication()
	 * @generated
	 */
	int STORY_PATTERN_APPLICATION = 9;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__EXECUTION_TIME = STORY_PATTERN_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__EXECUTION_TIME_MSEC = STORY_PATTERN_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__ELEMENTS = STORY_PATTERN_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__CONTAINER = STORY_PATTERN_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION__STORY_PATTERN = STORY_PATTERN_EXECUTION__STORY_PATTERN;

	/**
	 * The number of structural features of the '<em>Story Pattern Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION_FEATURE_COUNT = STORY_PATTERN_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_APPLICATION_OPERATION_COUNT = STORY_PATTERN_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectExecutionImpl <em>Story Pattern Object Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectExecutionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectExecution()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_EXECUTION = 10;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Object Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBoundImpl <em>Story Pattern Object Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBoundImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectBound()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_BOUND = 11;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__EXECUTION_TIME = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__EXECUTION_TIME_MSEC = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__ELEMENTS = STORY_PATTERN_OBJECT_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__CONTAINER = STORY_PATTERN_OBJECT_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__STORY_PATTERN_OBJECT = STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND__VALUE = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND_FEATURE_COUNT = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Object Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BOUND_OPERATION_COUNT = STORY_PATTERN_OBJECT_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectNotBoundImpl <em>Story Pattern Object Not Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectNotBoundImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectNotBound()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND = 12;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__EXECUTION_TIME = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__EXECUTION_TIME_MSEC = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__ELEMENTS = STORY_PATTERN_OBJECT_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__CONTAINER = STORY_PATTERN_OBJECT_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND__STORY_PATTERN_OBJECT = STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Not Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND_FEATURE_COUNT = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Object Not Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_NOT_BOUND_OPERATION_COUNT = STORY_PATTERN_OBJECT_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBindingRevokedImpl <em>Story Pattern Object Binding Revoked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBindingRevokedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectBindingRevoked()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED = 13;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__EXECUTION_TIME = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__EXECUTION_TIME_MSEC = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__ELEMENTS = STORY_PATTERN_OBJECT_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__CONTAINER = STORY_PATTERN_OBJECT_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__STORY_PATTERN_OBJECT = STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Previous Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Binding Revoked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED_FEATURE_COUNT = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Object Binding Revoked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_BINDING_REVOKED_OPERATION_COUNT = STORY_PATTERN_OBJECT_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl <em>Story Pattern Link Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternLinkExecution()
	 * @generated
	 */
	int STORY_PATTERN_LINK_EXECUTION = 14;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Story Pattern Link Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Story Pattern Link Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_LINK_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.TraversingLinkImpl <em>Traversing Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.TraversingLinkImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getTraversingLink()
	 * @generated
	 */
	int TRAVERSING_LINK = 15;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_LINK_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_LINK_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__EXECUTION_TIME = STORY_PATTERN_LINK_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__EXECUTION_TIME_MSEC = STORY_PATTERN_LINK_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__ELEMENTS = STORY_PATTERN_LINK_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__CONTAINER = STORY_PATTERN_LINK_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__STORY_PATTERN_LINK = STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__SOURCE_STORY_PATTERN_OBJECT = STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__TARGET_STORY_PATTERN_OBJECT = STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK__SOURCE_OBJECT = STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT;

	/**
	 * The number of structural features of the '<em>Traversing Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK_FEATURE_COUNT = STORY_PATTERN_LINK_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traversing Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSING_LINK_OPERATION_COUNT = STORY_PATTERN_LINK_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckImpl <em>Link Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getLinkCheck()
	 * @generated
	 */
	int LINK_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_LINK_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_LINK_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__EXECUTION_TIME = STORY_PATTERN_LINK_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__EXECUTION_TIME_MSEC = STORY_PATTERN_LINK_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__ELEMENTS = STORY_PATTERN_LINK_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__CONTAINER = STORY_PATTERN_LINK_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__STORY_PATTERN_LINK = STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__SOURCE_STORY_PATTERN_OBJECT = STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__TARGET_STORY_PATTERN_OBJECT = STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__SOURCE_OBJECT = STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK__TARGET_OBJECT = STORY_PATTERN_LINK_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FEATURE_COUNT = STORY_PATTERN_LINK_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_OPERATION_COUNT = STORY_PATTERN_LINK_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckSuccessfulImpl <em>Link Check Successful</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckSuccessfulImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getLinkCheckSuccessful()
	 * @generated
	 */
	int LINK_CHECK_SUCCESSFUL = 17;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__EXECUTION_STARTED_TIME_STAMP = LINK_CHECK__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__EXECUTION_FINISHED_TIME_STAMP = LINK_CHECK__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__EXECUTION_TIME = LINK_CHECK__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__EXECUTION_TIME_MSEC = LINK_CHECK__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__ELEMENTS = LINK_CHECK__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__CONTAINER = LINK_CHECK__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__STORY_PATTERN_LINK = LINK_CHECK__STORY_PATTERN_LINK;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__SOURCE_STORY_PATTERN_OBJECT = LINK_CHECK__SOURCE_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__TARGET_STORY_PATTERN_OBJECT = LINK_CHECK__TARGET_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__SOURCE_OBJECT = LINK_CHECK__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL__TARGET_OBJECT = LINK_CHECK__TARGET_OBJECT;

	/**
	 * The number of structural features of the '<em>Link Check Successful</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL_FEATURE_COUNT = LINK_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Check Successful</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_SUCCESSFUL_OPERATION_COUNT = LINK_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckFailedImpl <em>Link Check Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckFailedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getLinkCheckFailed()
	 * @generated
	 */
	int LINK_CHECK_FAILED = 18;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__EXECUTION_STARTED_TIME_STAMP = LINK_CHECK__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__EXECUTION_FINISHED_TIME_STAMP = LINK_CHECK__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__EXECUTION_TIME = LINK_CHECK__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__EXECUTION_TIME_MSEC = LINK_CHECK__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__ELEMENTS = LINK_CHECK__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__CONTAINER = LINK_CHECK__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__STORY_PATTERN_LINK = LINK_CHECK__STORY_PATTERN_LINK;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__SOURCE_STORY_PATTERN_OBJECT = LINK_CHECK__SOURCE_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__TARGET_STORY_PATTERN_OBJECT = LINK_CHECK__TARGET_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__SOURCE_OBJECT = LINK_CHECK__SOURCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED__TARGET_OBJECT = LINK_CHECK__TARGET_OBJECT;

	/**
	 * The number of structural features of the '<em>Link Check Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED_FEATURE_COUNT = LINK_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Check Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_CHECK_FAILED_OPERATION_COUNT = LINK_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExpressionEvaluationImpl <em>Expression Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExpressionEvaluationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getExpressionEvaluation()
	 * @generated
	 */
	int EXPRESSION_EVALUATION = 19;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__EXPRESSION = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION__RESULT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectModificationImpl <em>Instance Object Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectModificationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceObjectModification()
	 * @generated
	 */
	int INSTANCE_OBJECT_MODIFICATION = 20;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Object Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Object Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_MODIFICATION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectCreationImpl <em>Instance Object Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectCreationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceObjectCreation()
	 * @generated
	 */
	int INSTANCE_OBJECT_CREATION = 21;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__EXECUTION_STARTED_TIME_STAMP = INSTANCE_OBJECT_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__EXECUTION_FINISHED_TIME_STAMP = INSTANCE_OBJECT_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__EXECUTION_TIME = INSTANCE_OBJECT_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__EXECUTION_TIME_MSEC = INSTANCE_OBJECT_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__ELEMENTS = INSTANCE_OBJECT_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__CONTAINER = INSTANCE_OBJECT_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__STORY_PATTERN_OBJECT = INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION__INSTANCE_OBJECT = INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT;

	/**
	 * The number of structural features of the '<em>Instance Object Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION_FEATURE_COUNT = INSTANCE_OBJECT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Object Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_CREATION_OPERATION_COUNT = INSTANCE_OBJECT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectDeletionImpl <em>Instance Object Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectDeletionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceObjectDeletion()
	 * @generated
	 */
	int INSTANCE_OBJECT_DELETION = 22;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__EXECUTION_STARTED_TIME_STAMP = INSTANCE_OBJECT_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__EXECUTION_FINISHED_TIME_STAMP = INSTANCE_OBJECT_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__EXECUTION_TIME = INSTANCE_OBJECT_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__EXECUTION_TIME_MSEC = INSTANCE_OBJECT_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__ELEMENTS = INSTANCE_OBJECT_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__CONTAINER = INSTANCE_OBJECT_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__STORY_PATTERN_OBJECT = INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION__INSTANCE_OBJECT = INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT;

	/**
	 * The number of structural features of the '<em>Instance Object Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION_FEATURE_COUNT = INSTANCE_OBJECT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Object Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_DELETION_OPERATION_COUNT = INSTANCE_OBJECT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl <em>Instance Link Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceLinkModification()
	 * @generated
	 */
	int INSTANCE_LINK_MODIFICATION = 23;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT = EXECUTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Instance Link Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Instance Link Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_MODIFICATION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkCreationImpl <em>Instance Link Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkCreationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceLinkCreation()
	 * @generated
	 */
	int INSTANCE_LINK_CREATION = 24;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__EXECUTION_STARTED_TIME_STAMP = INSTANCE_LINK_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__EXECUTION_FINISHED_TIME_STAMP = INSTANCE_LINK_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__EXECUTION_TIME = INSTANCE_LINK_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__EXECUTION_TIME_MSEC = INSTANCE_LINK_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__ELEMENTS = INSTANCE_LINK_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__CONTAINER = INSTANCE_LINK_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__STORY_PATTERN_LINK = INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__SOURCE_STORY_PATTERN_OBJECT = INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__TARGET_STORY_PATTERN_OBJECT = INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__SOURCE_INSTANCE_OBJECT = INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION__TARGET_INSTANCE_OBJECT = INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT;

	/**
	 * The number of structural features of the '<em>Instance Link Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION_FEATURE_COUNT = INSTANCE_LINK_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Link Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_CREATION_OPERATION_COUNT = INSTANCE_LINK_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkDeletionImpl <em>Instance Link Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkDeletionImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceLinkDeletion()
	 * @generated
	 */
	int INSTANCE_LINK_DELETION = 25;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__EXECUTION_STARTED_TIME_STAMP = INSTANCE_LINK_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__EXECUTION_FINISHED_TIME_STAMP = INSTANCE_LINK_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__EXECUTION_TIME = INSTANCE_LINK_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__EXECUTION_TIME_MSEC = INSTANCE_LINK_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__ELEMENTS = INSTANCE_LINK_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__CONTAINER = INSTANCE_LINK_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__STORY_PATTERN_LINK = INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK;

	/**
	 * The feature id for the '<em><b>Source Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__SOURCE_STORY_PATTERN_OBJECT = INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__TARGET_STORY_PATTERN_OBJECT = INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__SOURCE_INSTANCE_OBJECT = INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION__TARGET_INSTANCE_OBJECT = INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT;

	/**
	 * The number of structural features of the '<em>Instance Link Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION_FEATURE_COUNT = INSTANCE_LINK_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Link Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_LINK_DELETION_OPERATION_COUNT = INSTANCE_LINK_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl <em>Attribute Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getAttributeValueSet()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_SET = 26;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__FEATURE = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET__NEW_VALUE = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SET_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl <em>Variable Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableModification()
	 * @generated
	 */
	int VARIABLE_MODIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__EXECUTION_STARTED_TIME_STAMP = EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP = EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__EXECUTION_TIME = EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__EXECUTION_TIME_MSEC = EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__ELEMENTS = EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__CONTAINER = EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__VARIABLE_NAME = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__CLASSIFIER = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION__VALUE = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODIFICATION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableCreatedImpl <em>Variable Created</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableCreatedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableCreated()
	 * @generated
	 */
	int VARIABLE_CREATED = 28;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__EXECUTION_STARTED_TIME_STAMP = VARIABLE_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__EXECUTION_FINISHED_TIME_STAMP = VARIABLE_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__EXECUTION_TIME = VARIABLE_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__EXECUTION_TIME_MSEC = VARIABLE_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__ELEMENTS = VARIABLE_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__CONTAINER = VARIABLE_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__VARIABLE_NAME = VARIABLE_MODIFICATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__CLASSIFIER = VARIABLE_MODIFICATION__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED__VALUE = VARIABLE_MODIFICATION__VALUE;

	/**
	 * The number of structural features of the '<em>Variable Created</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED_FEATURE_COUNT = VARIABLE_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Created</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CREATED_OPERATION_COUNT = VARIABLE_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableDeletedImpl <em>Variable Deleted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableDeletedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableDeleted()
	 * @generated
	 */
	int VARIABLE_DELETED = 29;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__EXECUTION_STARTED_TIME_STAMP = VARIABLE_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__EXECUTION_FINISHED_TIME_STAMP = VARIABLE_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__EXECUTION_TIME = VARIABLE_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__EXECUTION_TIME_MSEC = VARIABLE_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__ELEMENTS = VARIABLE_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__CONTAINER = VARIABLE_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__VARIABLE_NAME = VARIABLE_MODIFICATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__CLASSIFIER = VARIABLE_MODIFICATION__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED__VALUE = VARIABLE_MODIFICATION__VALUE;

	/**
	 * The number of structural features of the '<em>Variable Deleted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED_FEATURE_COUNT = VARIABLE_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Deleted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DELETED_OPERATION_COUNT = VARIABLE_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableChangedImpl <em>Variable Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableChangedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableChanged()
	 * @generated
	 */
	int VARIABLE_CHANGED = 30;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__EXECUTION_STARTED_TIME_STAMP = VARIABLE_MODIFICATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__EXECUTION_FINISHED_TIME_STAMP = VARIABLE_MODIFICATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__EXECUTION_TIME = VARIABLE_MODIFICATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__EXECUTION_TIME_MSEC = VARIABLE_MODIFICATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__ELEMENTS = VARIABLE_MODIFICATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__CONTAINER = VARIABLE_MODIFICATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__VARIABLE_NAME = VARIABLE_MODIFICATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__CLASSIFIER = VARIABLE_MODIFICATION__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__VALUE = VARIABLE_MODIFICATION__VALUE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED__OLD_VALUE = VARIABLE_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED_FEATURE_COUNT = VARIABLE_MODIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHANGED_OPERATION_COUNT = VARIABLE_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintEvaluationImpl <em>Story Pattern Object Constraint Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintEvaluationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectConstraintEvaluation()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION = 31;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_TIME = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_TIME_MSEC = STORY_PATTERN_OBJECT_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__ELEMENTS = STORY_PATTERN_OBJECT_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONTAINER = STORY_PATTERN_OBJECT_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__STORY_PATTERN_OBJECT = STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Constraint Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION_FEATURE_COUNT = STORY_PATTERN_OBJECT_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Object Constraint Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION_OPERATION_COUNT = STORY_PATTERN_OBJECT_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintHoldsImpl <em>Story Pattern Object Constraint Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintHoldsImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectConstraintHolds()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS = 32;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__EXECUTION_TIME = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__EXECUTION_TIME_MSEC = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__ELEMENTS = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__CONTAINER = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__STORY_PATTERN_OBJECT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS__CONSTRAINT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Constraint Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS_FEATURE_COUNT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Object Constraint Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS_OPERATION_COUNT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintViolatedImpl <em>Story Pattern Object Constraint Violated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintViolatedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectConstraintViolated()
	 * @generated
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED = 33;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__EXECUTION_TIME = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__EXECUTION_TIME_MSEC = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__ELEMENTS = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__CONTAINER = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__STORY_PATTERN_OBJECT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__STORY_PATTERN_OBJECT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED__CONSTRAINT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Story Pattern Object Constraint Violated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED_FEATURE_COUNT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Object Constraint Violated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED_OPERATION_COUNT = STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintEvaluationImpl <em>Story Pattern Constraint Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintEvaluationImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternConstraintEvaluation()
	 * @generated
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION = 34;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_EXECUTION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_TIME = STORY_PATTERN_EXECUTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_TIME_MSEC = STORY_PATTERN_EXECUTION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__ELEMENTS = STORY_PATTERN_EXECUTION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__CONTAINER = STORY_PATTERN_EXECUTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__STORY_PATTERN = STORY_PATTERN_EXECUTION__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION__CONSTRAINT = STORY_PATTERN_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Story Pattern Constraint Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION_FEATURE_COUNT = STORY_PATTERN_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Story Pattern Constraint Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_EVALUATION_OPERATION_COUNT = STORY_PATTERN_EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintHoldsImpl <em>Story Pattern Constraint Holds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintHoldsImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternConstraintHolds()
	 * @generated
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS = 35;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__EXECUTION_TIME = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__EXECUTION_TIME_MSEC = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__ELEMENTS = STORY_PATTERN_CONSTRAINT_EVALUATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__CONTAINER = STORY_PATTERN_CONSTRAINT_EVALUATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__STORY_PATTERN = STORY_PATTERN_CONSTRAINT_EVALUATION__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS__CONSTRAINT = STORY_PATTERN_CONSTRAINT_EVALUATION__CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Story Pattern Constraint Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS_FEATURE_COUNT = STORY_PATTERN_CONSTRAINT_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Constraint Holds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_HOLDS_OPERATION_COUNT = STORY_PATTERN_CONSTRAINT_EVALUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintViolatedImpl <em>Story Pattern Constraint Violated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintViolatedImpl
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternConstraintViolated()
	 * @generated
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED = 36;

	/**
	 * The feature id for the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__EXECUTION_STARTED_TIME_STAMP = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_STARTED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__EXECUTION_FINISHED_TIME_STAMP = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_FINISHED_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__EXECUTION_TIME = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Execution Time Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__EXECUTION_TIME_MSEC = STORY_PATTERN_CONSTRAINT_EVALUATION__EXECUTION_TIME_MSEC;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__ELEMENTS = STORY_PATTERN_CONSTRAINT_EVALUATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__CONTAINER = STORY_PATTERN_CONSTRAINT_EVALUATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__STORY_PATTERN = STORY_PATTERN_CONSTRAINT_EVALUATION__STORY_PATTERN;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED__CONSTRAINT = STORY_PATTERN_CONSTRAINT_EVALUATION__CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Story Pattern Constraint Violated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED_FEATURE_COUNT = STORY_PATTERN_CONSTRAINT_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Pattern Constraint Violated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_PATTERN_CONSTRAINT_VIOLATED_OPERATION_COUNT = STORY_PATTERN_CONSTRAINT_EVALUATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="KeyType" keyRequired="true"
	 *        valueDataType="ValueType"
	 * @generated
	 */
	EClass getMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace <em>Execution Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Trace</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace
	 * @generated
	 */
	EClass getExecutionTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getExecutions()
	 * @see #getExecutionTrace()
	 * @generated
	 */
	EReference getExecutionTrace_Executions();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getDescription()
	 * @see #getExecutionTrace()
	 * @generated
	 */
	EAttribute getExecutionTrace_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getTotalExecutionTime <em>Total Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Execution Time</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getTotalExecutionTime()
	 * @see #getExecutionTrace()
	 * @generated
	 */
	EAttribute getExecutionTrace_TotalExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getTotalExecutionTimeMsec <em>Total Execution Time Msec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Execution Time Msec</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getTotalExecutionTimeMsec()
	 * @see #getExecutionTrace()
	 * @generated
	 */
	EAttribute getExecutionTrace_TotalExecutionTimeMsec();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionStartedTimeStamp <em>Execution Started Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Started Time Stamp</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionStartedTimeStamp()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ExecutionStartedTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionFinishedTimeStamp <em>Execution Finished Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Finished Time Stamp</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionFinishedTimeStamp()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ExecutionFinishedTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionTime()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionTimeMsec <em>Execution Time Msec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time Msec</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionTimeMsec()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ExecutionTimeMsec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getElements()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Elements();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getContainer()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Container();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Execution</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution
	 * @generated
	 */
	EClass getActivityExecution();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getActivity()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_Activity();

	/**
	 * Returns the meta object for the map '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getInParameterValues <em>In Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>In Parameter Values</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getInParameterValues()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_InParameterValues();

	/**
	 * Returns the meta object for the map '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getOutParameterValues <em>Out Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Out Parameter Values</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getOutParameterValues()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_OutParameterValues();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution <em>Activity Node Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Execution</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution
	 * @generated
	 */
	EClass getActivityNodeExecution();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution#getActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Node</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution#getActivityNode()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EReference getActivityNodeExecution_ActivityNode();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal <em>Activity Edge Traversal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Traversal</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal
	 * @generated
	 */
	EClass getActivityEdgeTraversal();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal#getActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Edge</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal#getActivityEdge()
	 * @see #getActivityEdgeTraversal()
	 * @generated
	 */
	EReference getActivityEdgeTraversal_ActivityEdge();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution <em>Story Pattern Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Execution</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution
	 * @generated
	 */
	EClass getStoryPatternExecution();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution#getStoryPattern <em>Story Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution#getStoryPattern()
	 * @see #getStoryPatternExecution()
	 * @generated
	 */
	EReference getStoryPatternExecution_StoryPattern();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternInitialization <em>Story Pattern Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Initialization</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternInitialization
	 * @generated
	 */
	EClass getStoryPatternInitialization();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching <em>Story Pattern Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Matching</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching
	 * @generated
	 */
	EClass getStoryPatternMatching();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching#isSuccessful <em>Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successful</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching#isSuccessful()
	 * @see #getStoryPatternMatching()
	 * @generated
	 */
	EAttribute getStoryPatternMatching_Successful();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication <em>Story Pattern Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Application</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication
	 * @generated
	 */
	EClass getStoryPatternApplication();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution <em>Story Pattern Object Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Execution</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution
	 * @generated
	 */
	EClass getStoryPatternObjectExecution();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution#getStoryPatternObject <em>Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution#getStoryPatternObject()
	 * @see #getStoryPatternObjectExecution()
	 * @generated
	 */
	EReference getStoryPatternObjectExecution_StoryPatternObject();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound <em>Story Pattern Object Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Bound</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound
	 * @generated
	 */
	EClass getStoryPatternObjectBound();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound#getValue()
	 * @see #getStoryPatternObjectBound()
	 * @generated
	 */
	EAttribute getStoryPatternObjectBound_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound <em>Story Pattern Object Not Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Not Bound</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound
	 * @generated
	 */
	EClass getStoryPatternObjectNotBound();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked <em>Story Pattern Object Binding Revoked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Binding Revoked</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked
	 * @generated
	 */
	EClass getStoryPatternObjectBindingRevoked();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked#getPreviousValue <em>Previous Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Value</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked#getPreviousValue()
	 * @see #getStoryPatternObjectBindingRevoked()
	 * @generated
	 */
	EAttribute getStoryPatternObjectBindingRevoked_PreviousValue();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution <em>Story Pattern Link Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Link Execution</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution
	 * @generated
	 */
	EClass getStoryPatternLinkExecution();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getStoryPatternLink <em>Story Pattern Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern Link</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getStoryPatternLink()
	 * @see #getStoryPatternLinkExecution()
	 * @generated
	 */
	EReference getStoryPatternLinkExecution_StoryPatternLink();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getSourceStoryPatternObject <em>Source Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getSourceStoryPatternObject()
	 * @see #getStoryPatternLinkExecution()
	 * @generated
	 */
	EReference getStoryPatternLinkExecution_SourceStoryPatternObject();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getTargetStoryPatternObject <em>Target Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getTargetStoryPatternObject()
	 * @see #getStoryPatternLinkExecution()
	 * @generated
	 */
	EReference getStoryPatternLinkExecution_TargetStoryPatternObject();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution#getSourceObject()
	 * @see #getStoryPatternLinkExecution()
	 * @generated
	 */
	EAttribute getStoryPatternLinkExecution_SourceObject();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink <em>Traversing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversing Link</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink
	 * @generated
	 */
	EClass getTraversingLink();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck <em>Link Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Check</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck
	 * @generated
	 */
	EClass getLinkCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck#getTargetObject <em>Target Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck#getTargetObject()
	 * @see #getLinkCheck()
	 * @generated
	 */
	EAttribute getLinkCheck_TargetObject();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful <em>Link Check Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Check Successful</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful
	 * @generated
	 */
	EClass getLinkCheckSuccessful();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed <em>Link Check Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Check Failed</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed
	 * @generated
	 */
	EClass getLinkCheckFailed();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation <em>Expression Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Evaluation</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation
	 * @generated
	 */
	EClass getExpressionEvaluation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation#getExpression()
	 * @see #getExpressionEvaluation()
	 * @generated
	 */
	EReference getExpressionEvaluation_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation#getResult()
	 * @see #getExpressionEvaluation()
	 * @generated
	 */
	EAttribute getExpressionEvaluation_Result();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification <em>Instance Object Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Object Modification</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification
	 * @generated
	 */
	EClass getInstanceObjectModification();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getStoryPatternObject <em>Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getStoryPatternObject()
	 * @see #getInstanceObjectModification()
	 * @generated
	 */
	EReference getInstanceObjectModification_StoryPatternObject();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getInstanceObject <em>Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getInstanceObject()
	 * @see #getInstanceObjectModification()
	 * @generated
	 */
	EAttribute getInstanceObjectModification_InstanceObject();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation <em>Instance Object Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Object Creation</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation
	 * @generated
	 */
	EClass getInstanceObjectCreation();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion <em>Instance Object Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Object Deletion</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion
	 * @generated
	 */
	EClass getInstanceObjectDeletion();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification <em>Instance Link Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Link Modification</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification
	 * @generated
	 */
	EClass getInstanceLinkModification();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getStoryPatternLink <em>Story Pattern Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern Link</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getStoryPatternLink()
	 * @see #getInstanceLinkModification()
	 * @generated
	 */
	EReference getInstanceLinkModification_StoryPatternLink();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getSourceStoryPatternObject <em>Source Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getSourceStoryPatternObject()
	 * @see #getInstanceLinkModification()
	 * @generated
	 */
	EReference getInstanceLinkModification_SourceStoryPatternObject();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getTargetStoryPatternObject <em>Target Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getTargetStoryPatternObject()
	 * @see #getInstanceLinkModification()
	 * @generated
	 */
	EReference getInstanceLinkModification_TargetStoryPatternObject();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getSourceInstanceObject <em>Source Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Instance Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getSourceInstanceObject()
	 * @see #getInstanceLinkModification()
	 * @generated
	 */
	EAttribute getInstanceLinkModification_SourceInstanceObject();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getTargetInstanceObject <em>Target Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Instance Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification#getTargetInstanceObject()
	 * @see #getInstanceLinkModification()
	 * @generated
	 */
	EAttribute getInstanceLinkModification_TargetInstanceObject();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation <em>Instance Link Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Link Creation</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation
	 * @generated
	 */
	EClass getInstanceLinkCreation();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion <em>Instance Link Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Link Deletion</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion
	 * @generated
	 */
	EClass getInstanceLinkDeletion();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet <em>Attribute Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Set</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet
	 * @generated
	 */
	EClass getAttributeValueSet();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getStoryPatternObject <em>Story Pattern Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Story Pattern Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getStoryPatternObject()
	 * @see #getAttributeValueSet()
	 * @generated
	 */
	EReference getAttributeValueSet_StoryPatternObject();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getFeature()
	 * @see #getAttributeValueSet()
	 * @generated
	 */
	EReference getAttributeValueSet_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getInstanceObject <em>Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Object</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getInstanceObject()
	 * @see #getAttributeValueSet()
	 * @generated
	 */
	EAttribute getAttributeValueSet_InstanceObject();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet#getNewValue()
	 * @see #getAttributeValueSet()
	 * @generated
	 */
	EAttribute getAttributeValueSet_NewValue();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification <em>Variable Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Modification</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableModification
	 * @generated
	 */
	EClass getVariableModification();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getVariableName()
	 * @see #getVariableModification()
	 * @generated
	 */
	EAttribute getVariableModification_VariableName();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getClassifier()
	 * @see #getVariableModification()
	 * @generated
	 */
	EReference getVariableModification_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getValue()
	 * @see #getVariableModification()
	 * @generated
	 */
	EAttribute getVariableModification_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated <em>Variable Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Created</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated
	 * @generated
	 */
	EClass getVariableCreated();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted <em>Variable Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Deleted</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted
	 * @generated
	 */
	EClass getVariableDeleted();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged <em>Variable Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Changed</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged
	 * @generated
	 */
	EClass getVariableChanged();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged#getOldValue()
	 * @see #getVariableChanged()
	 * @generated
	 */
	EAttribute getVariableChanged_OldValue();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation <em>Story Pattern Object Constraint Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Constraint Evaluation</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation
	 * @generated
	 */
	EClass getStoryPatternObjectConstraintEvaluation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation#getConstraint()
	 * @see #getStoryPatternObjectConstraintEvaluation()
	 * @generated
	 */
	EReference getStoryPatternObjectConstraintEvaluation_Constraint();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds <em>Story Pattern Object Constraint Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Constraint Holds</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds
	 * @generated
	 */
	EClass getStoryPatternObjectConstraintHolds();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated <em>Story Pattern Object Constraint Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Object Constraint Violated</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated
	 * @generated
	 */
	EClass getStoryPatternObjectConstraintViolated();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation <em>Story Pattern Constraint Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Constraint Evaluation</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation
	 * @generated
	 */
	EClass getStoryPatternConstraintEvaluation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation#getConstraint()
	 * @see #getStoryPatternConstraintEvaluation()
	 * @generated
	 */
	EReference getStoryPatternConstraintEvaluation_Constraint();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds <em>Story Pattern Constraint Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Constraint Holds</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds
	 * @generated
	 */
	EClass getStoryPatternConstraintHolds();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated <em>Story Pattern Constraint Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Pattern Constraint Violated</em>'.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated
	 * @generated
	 */
	EClass getStoryPatternConstraintViolated();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutiontraceFactory getExecutiontraceFactory();

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
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.MapEntryImpl <em>Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.MapEntryImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getMapEntry()
		 * @generated
		 */
		EClass MAP_ENTRY = eINSTANCE.getMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_ENTRY__KEY = eINSTANCE.getMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_ENTRY__VALUE = eINSTANCE.getMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl <em>Execution Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getExecutionTrace()
		 * @generated
		 */
		EClass EXECUTION_TRACE = eINSTANCE.getExecutionTrace();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TRACE__EXECUTIONS = eINSTANCE.getExecutionTrace_Executions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_TRACE__DESCRIPTION = eINSTANCE.getExecutionTrace_Description();

		/**
		 * The meta object literal for the '<em><b>Total Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_TRACE__TOTAL_EXECUTION_TIME = eINSTANCE.getExecutionTrace_TotalExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Total Execution Time Msec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC = eINSTANCE.getExecutionTrace_TotalExecutionTimeMsec();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Execution Started Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTION_STARTED_TIME_STAMP = eINSTANCE.getExecution_ExecutionStartedTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Execution Finished Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTION_FINISHED_TIME_STAMP = eINSTANCE.getExecution_ExecutionFinishedTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTION_TIME = eINSTANCE.getExecution_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Execution Time Msec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTION_TIME_MSEC = eINSTANCE.getExecution_ExecutionTimeMsec();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__ELEMENTS = eINSTANCE.getExecution_Elements();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__CONTAINER = eINSTANCE.getExecution_Container();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getActivityExecution()
		 * @generated
		 */
		EClass ACTIVITY_EXECUTION = eINSTANCE.getActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__ACTIVITY = eINSTANCE.getActivityExecution_Activity();

		/**
		 * The meta object literal for the '<em><b>In Parameter Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__IN_PARAMETER_VALUES = eINSTANCE.getActivityExecution_InParameterValues();

		/**
		 * The meta object literal for the '<em><b>Out Parameter Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES = eINSTANCE.getActivityExecution_OutParameterValues();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityNodeExecutionImpl <em>Activity Node Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityNodeExecutionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getActivityNodeExecution()
		 * @generated
		 */
		EClass ACTIVITY_NODE_EXECUTION = eINSTANCE.getActivityNodeExecution();

		/**
		 * The meta object literal for the '<em><b>Activity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE = eINSTANCE.getActivityNodeExecution_ActivityNode();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityEdgeTraversalImpl <em>Activity Edge Traversal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityEdgeTraversalImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getActivityEdgeTraversal()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_TRAVERSAL = eINSTANCE.getActivityEdgeTraversal();

		/**
		 * The meta object literal for the '<em><b>Activity Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE = eINSTANCE.getActivityEdgeTraversal_ActivityEdge();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternExecutionImpl <em>Story Pattern Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternExecutionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternExecution()
		 * @generated
		 */
		EClass STORY_PATTERN_EXECUTION = eINSTANCE.getStoryPatternExecution();

		/**
		 * The meta object literal for the '<em><b>Story Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_EXECUTION__STORY_PATTERN = eINSTANCE.getStoryPatternExecution_StoryPattern();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternInitializationImpl <em>Story Pattern Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternInitializationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternInitialization()
		 * @generated
		 */
		EClass STORY_PATTERN_INITIALIZATION = eINSTANCE.getStoryPatternInitialization();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternMatchingImpl <em>Story Pattern Matching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternMatchingImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternMatching()
		 * @generated
		 */
		EClass STORY_PATTERN_MATCHING = eINSTANCE.getStoryPatternMatching();

		/**
		 * The meta object literal for the '<em><b>Successful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATTERN_MATCHING__SUCCESSFUL = eINSTANCE.getStoryPatternMatching_Successful();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternApplicationImpl <em>Story Pattern Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternApplicationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternApplication()
		 * @generated
		 */
		EClass STORY_PATTERN_APPLICATION = eINSTANCE.getStoryPatternApplication();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectExecutionImpl <em>Story Pattern Object Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectExecutionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectExecution()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_EXECUTION = eINSTANCE.getStoryPatternObjectExecution();

		/**
		 * The meta object literal for the '<em><b>Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT = eINSTANCE.getStoryPatternObjectExecution_StoryPatternObject();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBoundImpl <em>Story Pattern Object Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBoundImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectBound()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_BOUND = eINSTANCE.getStoryPatternObjectBound();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATTERN_OBJECT_BOUND__VALUE = eINSTANCE.getStoryPatternObjectBound_Value();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectNotBoundImpl <em>Story Pattern Object Not Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectNotBoundImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectNotBound()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_NOT_BOUND = eINSTANCE.getStoryPatternObjectNotBound();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBindingRevokedImpl <em>Story Pattern Object Binding Revoked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectBindingRevokedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectBindingRevoked()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_BINDING_REVOKED = eINSTANCE.getStoryPatternObjectBindingRevoked();

		/**
		 * The meta object literal for the '<em><b>Previous Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE = eINSTANCE.getStoryPatternObjectBindingRevoked_PreviousValue();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl <em>Story Pattern Link Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternLinkExecutionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternLinkExecution()
		 * @generated
		 */
		EClass STORY_PATTERN_LINK_EXECUTION = eINSTANCE.getStoryPatternLinkExecution();

		/**
		 * The meta object literal for the '<em><b>Story Pattern Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK = eINSTANCE.getStoryPatternLinkExecution_StoryPatternLink();

		/**
		 * The meta object literal for the '<em><b>Source Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT = eINSTANCE.getStoryPatternLinkExecution_SourceStoryPatternObject();

		/**
		 * The meta object literal for the '<em><b>Target Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT = eINSTANCE.getStoryPatternLinkExecution_TargetStoryPatternObject();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT = eINSTANCE.getStoryPatternLinkExecution_SourceObject();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.TraversingLinkImpl <em>Traversing Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.TraversingLinkImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getTraversingLink()
		 * @generated
		 */
		EClass TRAVERSING_LINK = eINSTANCE.getTraversingLink();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckImpl <em>Link Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getLinkCheck()
		 * @generated
		 */
		EClass LINK_CHECK = eINSTANCE.getLinkCheck();

		/**
		 * The meta object literal for the '<em><b>Target Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_CHECK__TARGET_OBJECT = eINSTANCE.getLinkCheck_TargetObject();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckSuccessfulImpl <em>Link Check Successful</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckSuccessfulImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getLinkCheckSuccessful()
		 * @generated
		 */
		EClass LINK_CHECK_SUCCESSFUL = eINSTANCE.getLinkCheckSuccessful();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckFailedImpl <em>Link Check Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.LinkCheckFailedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getLinkCheckFailed()
		 * @generated
		 */
		EClass LINK_CHECK_FAILED = eINSTANCE.getLinkCheckFailed();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExpressionEvaluationImpl <em>Expression Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExpressionEvaluationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getExpressionEvaluation()
		 * @generated
		 */
		EClass EXPRESSION_EVALUATION = eINSTANCE.getExpressionEvaluation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EVALUATION__EXPRESSION = eINSTANCE.getExpressionEvaluation_Expression();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_EVALUATION__RESULT = eINSTANCE.getExpressionEvaluation_Result();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectModificationImpl <em>Instance Object Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectModificationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceObjectModification()
		 * @generated
		 */
		EClass INSTANCE_OBJECT_MODIFICATION = eINSTANCE.getInstanceObjectModification();

		/**
		 * The meta object literal for the '<em><b>Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT = eINSTANCE.getInstanceObjectModification_StoryPatternObject();

		/**
		 * The meta object literal for the '<em><b>Instance Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT = eINSTANCE.getInstanceObjectModification_InstanceObject();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectCreationImpl <em>Instance Object Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectCreationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceObjectCreation()
		 * @generated
		 */
		EClass INSTANCE_OBJECT_CREATION = eINSTANCE.getInstanceObjectCreation();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectDeletionImpl <em>Instance Object Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceObjectDeletionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceObjectDeletion()
		 * @generated
		 */
		EClass INSTANCE_OBJECT_DELETION = eINSTANCE.getInstanceObjectDeletion();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl <em>Instance Link Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkModificationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceLinkModification()
		 * @generated
		 */
		EClass INSTANCE_LINK_MODIFICATION = eINSTANCE.getInstanceLinkModification();

		/**
		 * The meta object literal for the '<em><b>Story Pattern Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK = eINSTANCE.getInstanceLinkModification_StoryPatternLink();

		/**
		 * The meta object literal for the '<em><b>Source Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT = eINSTANCE.getInstanceLinkModification_SourceStoryPatternObject();

		/**
		 * The meta object literal for the '<em><b>Target Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT = eINSTANCE.getInstanceLinkModification_TargetStoryPatternObject();

		/**
		 * The meta object literal for the '<em><b>Source Instance Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT = eINSTANCE.getInstanceLinkModification_SourceInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Target Instance Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT = eINSTANCE.getInstanceLinkModification_TargetInstanceObject();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkCreationImpl <em>Instance Link Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkCreationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceLinkCreation()
		 * @generated
		 */
		EClass INSTANCE_LINK_CREATION = eINSTANCE.getInstanceLinkCreation();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkDeletionImpl <em>Instance Link Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.InstanceLinkDeletionImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getInstanceLinkDeletion()
		 * @generated
		 */
		EClass INSTANCE_LINK_DELETION = eINSTANCE.getInstanceLinkDeletion();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl <em>Attribute Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.AttributeValueSetImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getAttributeValueSet()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_SET = eINSTANCE.getAttributeValueSet();

		/**
		 * The meta object literal for the '<em><b>Story Pattern Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT = eINSTANCE.getAttributeValueSet_StoryPatternObject();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_SET__FEATURE = eINSTANCE.getAttributeValueSet_Feature();

		/**
		 * The meta object literal for the '<em><b>Instance Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT = eINSTANCE.getAttributeValueSet_InstanceObject();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SET__NEW_VALUE = eINSTANCE.getAttributeValueSet_NewValue();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl <em>Variable Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableModification()
		 * @generated
		 */
		EClass VARIABLE_MODIFICATION = eINSTANCE.getVariableModification();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MODIFICATION__VARIABLE_NAME = eINSTANCE.getVariableModification_VariableName();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MODIFICATION__CLASSIFIER = eINSTANCE.getVariableModification_Classifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MODIFICATION__VALUE = eINSTANCE.getVariableModification_Value();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableCreatedImpl <em>Variable Created</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableCreatedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableCreated()
		 * @generated
		 */
		EClass VARIABLE_CREATED = eINSTANCE.getVariableCreated();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableDeletedImpl <em>Variable Deleted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableDeletedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableDeleted()
		 * @generated
		 */
		EClass VARIABLE_DELETED = eINSTANCE.getVariableDeleted();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableChangedImpl <em>Variable Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableChangedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getVariableChanged()
		 * @generated
		 */
		EClass VARIABLE_CHANGED = eINSTANCE.getVariableChanged();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CHANGED__OLD_VALUE = eINSTANCE.getVariableChanged_OldValue();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintEvaluationImpl <em>Story Pattern Object Constraint Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintEvaluationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectConstraintEvaluation()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION = eINSTANCE.getStoryPatternObjectConstraintEvaluation();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT = eINSTANCE.getStoryPatternObjectConstraintEvaluation_Constraint();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintHoldsImpl <em>Story Pattern Object Constraint Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintHoldsImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectConstraintHolds()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS = eINSTANCE.getStoryPatternObjectConstraintHolds();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintViolatedImpl <em>Story Pattern Object Constraint Violated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectConstraintViolatedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternObjectConstraintViolated()
		 * @generated
		 */
		EClass STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED = eINSTANCE.getStoryPatternObjectConstraintViolated();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintEvaluationImpl <em>Story Pattern Constraint Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintEvaluationImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternConstraintEvaluation()
		 * @generated
		 */
		EClass STORY_PATTERN_CONSTRAINT_EVALUATION = eINSTANCE.getStoryPatternConstraintEvaluation();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY_PATTERN_CONSTRAINT_EVALUATION__CONSTRAINT = eINSTANCE.getStoryPatternConstraintEvaluation_Constraint();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintHoldsImpl <em>Story Pattern Constraint Holds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintHoldsImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternConstraintHolds()
		 * @generated
		 */
		EClass STORY_PATTERN_CONSTRAINT_HOLDS = eINSTANCE.getStoryPatternConstraintHolds();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintViolatedImpl <em>Story Pattern Constraint Violated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternConstraintViolatedImpl
		 * @see org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutiontracePackageImpl#getStoryPatternConstraintViolated()
		 * @generated
		 */
		EClass STORY_PATTERN_CONSTRAINT_VIOLATED = eINSTANCE.getStoryPatternConstraintViolated();

	}

} //ExecutiontracePackage

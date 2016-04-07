/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.simulink.SimulinkPackage;

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
 * @see org.muml.simulink.stateflow.StateflowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface StateflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/simulink/stateflow/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stateflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateflowPackage eINSTANCE = org.muml.simulink.stateflow.impl.StateflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.StateflowElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.StateflowElementImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getStateflowElement()
	 * @generated
	 */
	int STATEFLOW_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT__PARAMETERS = SimulinkPackage.ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT__ID = SimulinkPackage.ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT_FEATURE_COUNT = SimulinkPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT___GET_PARAMETER__STRING = SimulinkPackage.ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT_OPERATION_COUNT = SimulinkPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.StateflowMachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.StateflowMachineImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getStateflowMachine()
	 * @generated
	 */
	int STATEFLOW_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Charts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE__CHARTS = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE__MODEL = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_MACHINE_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.NodeImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.ChartImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 1;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.StateImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARAMETERS = NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Sub State Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUB_STATE_TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NODES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PRIORITY = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVENTS = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Embedded Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EMBEDDED_FUNCTIONS = NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Entry Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY_ACTION = NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT_ACTION = NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>During Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DURING_ACTION = NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LOCAL = NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONSTANT = NODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Initial guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL_GUARD = NODE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NODE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_PARAMETER__STRING = NODE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Sub State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_SUB_STATE__STRING = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PARAMETERS = STATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PARENT = STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Sub State Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SUB_STATE_TYPE = STATE__SUB_STATE_TYPE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NODES = STATE__NODES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TRANSITIONS = STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PRIORITY = STATE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__EVENTS = STATE__EVENTS;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__INITIAL = STATE__INITIAL;

	/**
	 * The feature id for the '<em><b>Embedded Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__EMBEDDED_FUNCTIONS = STATE__EMBEDDED_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Entry Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ENTRY_ACTION = STATE__ENTRY_ACTION;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__EXIT_ACTION = STATE__EXIT_ACTION;

	/**
	 * The feature id for the '<em><b>During Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DURING_ACTION = STATE__DURING_ACTION;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__LOCAL = STATE__LOCAL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CONSTANT = STATE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Initial guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__INITIAL_GUARD = STATE__INITIAL_GUARD;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__MACHINE = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__OUTPUT = STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__INPUT = STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__BLOCK = STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = STATE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART___GET_PARAMETER__STRING = STATE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Sub State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART___GET_SUB_STATE__STRING = STATE___GET_SUB_STATE__STRING;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.TransitionImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRIORITY = STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = STATEFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = STATEFLOW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.JunctionImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PARAMETERS = NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OUTGOING = NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION___GET_PARAMETER__STRING = NODE___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.EventImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.HistoryImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__PARAMETERS = NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OUTGOING = NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY___GET_PARAMETER__STRING = NODE___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl <em>Embedded Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getEmbeddedFunction()
	 * @generated
	 */
	int EMBEDDED_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__NAME = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__CODE = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__INPUT = STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__OUTPUT = STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__LOCAL = STATEFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION__CONSTANT = STATEFLOW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Embedded Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Embedded Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FUNCTION_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.ActionImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXPRESSION = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.impl.DataImpl
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getData()
	 * @generated
	 */
	int DATA = 11;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARAMETERS = STATEFLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SIZE = STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___GET_PARAMETER__STRING = STATEFLOW_ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.stateflow.SubStateType <em>Sub State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.stateflow.SubStateType
	 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getSubStateType()
	 * @generated
	 */
	int SUB_STATE_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.StateflowMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.muml.simulink.stateflow.StateflowMachine
	 * @generated
	 */
	EClass getStateflowMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.StateflowMachine#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charts</em>'.
	 * @see org.muml.simulink.stateflow.StateflowMachine#getCharts()
	 * @see #getStateflowMachine()
	 * @generated
	 */
	EReference getStateflowMachine_Charts();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.stateflow.StateflowMachine#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.muml.simulink.stateflow.StateflowMachine#getModel()
	 * @see #getStateflowMachine()
	 * @generated
	 */
	EReference getStateflowMachine_Model();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see org.muml.simulink.stateflow.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.stateflow.Chart#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Machine</em>'.
	 * @see org.muml.simulink.stateflow.Chart#getMachine()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Machine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.Chart#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.muml.simulink.stateflow.Chart#getOutput()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.Chart#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.muml.simulink.stateflow.Chart#getInput()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Input();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.stateflow.Chart#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see org.muml.simulink.stateflow.Chart#getBlock()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Block();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.StateflowElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.muml.simulink.stateflow.StateflowElement
	 * @generated
	 */
	EClass getStateflowElement();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.muml.simulink.stateflow.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.State#getSubStateType <em>Sub State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub State Type</em>'.
	 * @see org.muml.simulink.stateflow.State#getSubStateType()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_SubStateType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.muml.simulink.stateflow.State#getNodes()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.muml.simulink.stateflow.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.stateflow.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getEntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Action</em>'.
	 * @see org.muml.simulink.stateflow.State#getEntryAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Action</em>'.
	 * @see org.muml.simulink.stateflow.State#getExitAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getDuringAction <em>During Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>During Action</em>'.
	 * @see org.muml.simulink.stateflow.State#getDuringAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DuringAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local</em>'.
	 * @see org.muml.simulink.stateflow.State#getLocal()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Local();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant</em>'.
	 * @see org.muml.simulink.stateflow.State#getConstant()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getInitial_guard <em>Initial guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial guard</em>'.
	 * @see org.muml.simulink.stateflow.State#getInitial_guard()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Initial_guard();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.State#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.muml.simulink.stateflow.State#getPriority()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.muml.simulink.stateflow.State#getEvents()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Events();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.muml.simulink.stateflow.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.State#getEmbeddedFunctions <em>Embedded Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Functions</em>'.
	 * @see org.muml.simulink.stateflow.State#getEmbeddedFunctions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EmbeddedFunctions();

	/**
	 * Returns the meta object for the '{@link org.muml.simulink.stateflow.State#getSubState(java.lang.String) <em>Get Sub State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub State</em>' operation.
	 * @see org.muml.simulink.stateflow.State#getSubState(java.lang.String)
	 * @generated
	 */
	EOperation getState__GetSubState__String();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.muml.simulink.stateflow.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.stateflow.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.simulink.stateflow.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.stateflow.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.muml.simulink.stateflow.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Transition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.muml.simulink.stateflow.Transition#getPriority()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard</em>'.
	 * @see org.muml.simulink.stateflow.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.muml.simulink.stateflow.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.stateflow.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.muml.simulink.stateflow.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Event();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see org.muml.simulink.stateflow.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.muml.simulink.stateflow.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.stateflow.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.muml.simulink.stateflow.Node#getParent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.stateflow.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.muml.simulink.stateflow.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.stateflow.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.muml.simulink.stateflow.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.muml.simulink.stateflow.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.stateflow.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see org.muml.simulink.stateflow.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.EmbeddedFunction <em>Embedded Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Function</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction
	 * @generated
	 */
	EClass getEmbeddedFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.EmbeddedFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction#getName()
	 * @see #getEmbeddedFunction()
	 * @generated
	 */
	EAttribute getEmbeddedFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.EmbeddedFunction#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction#getCode()
	 * @see #getEmbeddedFunction()
	 * @generated
	 */
	EAttribute getEmbeddedFunction_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.EmbeddedFunction#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction#getInput()
	 * @see #getEmbeddedFunction()
	 * @generated
	 */
	EReference getEmbeddedFunction_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.EmbeddedFunction#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction#getOutput()
	 * @see #getEmbeddedFunction()
	 * @generated
	 */
	EReference getEmbeddedFunction_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.EmbeddedFunction#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction#getLocal()
	 * @see #getEmbeddedFunction()
	 * @generated
	 */
	EReference getEmbeddedFunction_Local();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.stateflow.EmbeddedFunction#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant</em>'.
	 * @see org.muml.simulink.stateflow.EmbeddedFunction#getConstant()
	 * @see #getEmbeddedFunction()
	 * @generated
	 */
	EReference getEmbeddedFunction_Constant();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.muml.simulink.stateflow.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Action#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.muml.simulink.stateflow.Action#getExpression()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.stateflow.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.muml.simulink.stateflow.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.stateflow.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.simulink.stateflow.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.simulink.stateflow.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.stateflow.Data#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.muml.simulink.stateflow.Data#getSize()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Size();

	/**
	 * Returns the meta object for enum '{@link org.muml.simulink.stateflow.SubStateType <em>Sub State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub State Type</em>'.
	 * @see org.muml.simulink.stateflow.SubStateType
	 * @generated
	 */
	EEnum getSubStateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateflowFactory getStateflowFactory();

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
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.StateflowMachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.StateflowMachineImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getStateflowMachine()
		 * @generated
		 */
		EClass STATEFLOW_MACHINE = eINSTANCE.getStateflowMachine();

		/**
		 * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW_MACHINE__CHARTS = eINSTANCE.getStateflowMachine_Charts();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW_MACHINE__MODEL = eINSTANCE.getStateflowMachine_Model();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.ChartImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__MACHINE = eINSTANCE.getChart_Machine();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__OUTPUT = eINSTANCE.getChart_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__INPUT = eINSTANCE.getChart_Input();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__BLOCK = eINSTANCE.getChart_Block();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.StateflowElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.StateflowElementImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getStateflowElement()
		 * @generated
		 */
		EClass STATEFLOW_ELEMENT = eINSTANCE.getStateflowElement();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.StateImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Sub State Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__SUB_STATE_TYPE = eINSTANCE.getState_SubStateType();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NODES = eINSTANCE.getState_Nodes();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Entry Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY_ACTION = eINSTANCE.getState_EntryAction();

		/**
		 * The meta object literal for the '<em><b>Exit Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT_ACTION = eINSTANCE.getState_ExitAction();

		/**
		 * The meta object literal for the '<em><b>During Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DURING_ACTION = eINSTANCE.getState_DuringAction();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LOCAL = eINSTANCE.getState_Local();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONSTANT = eINSTANCE.getState_Constant();

		/**
		 * The meta object literal for the '<em><b>Initial guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INITIAL_GUARD = eINSTANCE.getState_Initial_guard();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__PRIORITY = eINSTANCE.getState_Priority();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EVENTS = eINSTANCE.getState_Events();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '<em><b>Embedded Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EMBEDDED_FUNCTIONS = eINSTANCE.getState_EmbeddedFunctions();

		/**
		 * The meta object literal for the '<em><b>Get Sub State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_SUB_STATE__STRING = eINSTANCE.getState__GetSubState__String();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.TransitionImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PRIORITY = eINSTANCE.getTransition_Priority();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.JunctionImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.NodeImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT = eINSTANCE.getNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.EventImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.HistoryImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl <em>Embedded Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.EmbeddedFunctionImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getEmbeddedFunction()
		 * @generated
		 */
		EClass EMBEDDED_FUNCTION = eINSTANCE.getEmbeddedFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_FUNCTION__NAME = eINSTANCE.getEmbeddedFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_FUNCTION__CODE = eINSTANCE.getEmbeddedFunction_Code();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED_FUNCTION__INPUT = eINSTANCE.getEmbeddedFunction_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED_FUNCTION__OUTPUT = eINSTANCE.getEmbeddedFunction_Output();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED_FUNCTION__LOCAL = eINSTANCE.getEmbeddedFunction_Local();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED_FUNCTION__CONSTANT = eINSTANCE.getEmbeddedFunction_Constant();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.ActionImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__EXPRESSION = eINSTANCE.getAction_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.impl.DataImpl
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__SIZE = eINSTANCE.getData_Size();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.stateflow.SubStateType <em>Sub State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.stateflow.SubStateType
		 * @see org.muml.simulink.stateflow.impl.StateflowPackageImpl#getSubStateType()
		 * @generated
		 */
		EEnum SUB_STATE_TYPE = eINSTANCE.getSubStateType();

	}

} //StateflowPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.muml.simulink.SimulinkFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SimulinkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulink";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/simulink/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulinkPackage eINSTANCE = org.muml.simulink.impl.SimulinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.ElementImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_PARAMETER__STRING = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.BlockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PARAMETERS = ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PARENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OUT_PORTS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IN_PORTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INCOMING_LINES = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OUTGOING_LINES = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___GET_PARAMETER__STRING = ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___GET_FULLY_QUALIFIED_NAME = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.SubSystemImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__LINES = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__BLOCKS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__SUB_SYSTEMS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ALL_BLOCKS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Block By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___GET_BLOCK_BY_NAME__STRING = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.SimulinkFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.SimulinkFileImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkFile()
	 * @generated
	 */
	int SIMULINK_FILE = 12;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__PARAMETERS = SUB_SYSTEM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__ID = SUB_SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__PARENT = SUB_SYSTEM__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__NAME = SUB_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__OUT_PORTS = SUB_SYSTEM__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__IN_PORTS = SUB_SYSTEM__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__INCOMING_LINES = SUB_SYSTEM__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__OUTGOING_LINES = SUB_SYSTEM__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__LINES = SUB_SYSTEM__LINES;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__BLOCKS = SUB_SYSTEM__BLOCKS;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__SUB_SYSTEMS = SUB_SYSTEM__SUB_SYSTEMS;

	/**
	 * The feature id for the '<em><b>All Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__ALL_BLOCKS = SUB_SYSTEM__ALL_BLOCKS;

	/**
	 * The feature id for the '<em><b>Stateflow Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__STATEFLOW_MACHINE = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE__BUSES = SUB_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE___GET_PARAMETER__STRING = SUB_SYSTEM___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE___GET_FULLY_QUALIFIED_NAME = SUB_SYSTEM___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Block By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE___GET_BLOCK_BY_NAME__STRING = SUB_SYSTEM___GET_BLOCK_BY_NAME__STRING;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_FILE_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.SimulinkModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.SimulinkModelImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkModel()
	 * @generated
	 */
	int SIMULINK_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__PARAMETERS = SIMULINK_FILE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__ID = SIMULINK_FILE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__PARENT = SIMULINK_FILE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__NAME = SIMULINK_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__OUT_PORTS = SIMULINK_FILE__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__IN_PORTS = SIMULINK_FILE__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__INCOMING_LINES = SIMULINK_FILE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__OUTGOING_LINES = SIMULINK_FILE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__LINES = SIMULINK_FILE__LINES;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__BLOCKS = SIMULINK_FILE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__SUB_SYSTEMS = SIMULINK_FILE__SUB_SYSTEMS;

	/**
	 * The feature id for the '<em><b>All Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__ALL_BLOCKS = SIMULINK_FILE__ALL_BLOCKS;

	/**
	 * The feature id for the '<em><b>Stateflow Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__STATEFLOW_MACHINE = SIMULINK_FILE__STATEFLOW_MACHINE;

	/**
	 * The feature id for the '<em><b>Buses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__BUSES = SIMULINK_FILE__BUSES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__ROOT = SIMULINK_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL_FEATURE_COUNT = SIMULINK_FILE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL___GET_PARAMETER__STRING = SIMULINK_FILE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL___GET_FULLY_QUALIFIED_NAME = SIMULINK_FILE___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Block By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL___GET_BLOCK_BY_NAME__STRING = SIMULINK_FILE___GET_BLOCK_BY_NAME__STRING;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL_OPERATION_COUNT = SIMULINK_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.LineImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PARAMETERS = ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_PORT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_PORT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_BLOCK = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_BLOCK = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BUS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE___GET_PARAMETER__STRING = ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.ParameterImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.InPortBlockImpl <em>In Port Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.InPortBlockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getInPortBlock()
	 * @generated
	 */
	int IN_PORT_BLOCK = 6;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.EmbeddedMatlabFunctionImpl <em>Embedded Matlab Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.EmbeddedMatlabFunctionImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getEmbeddedMatlabFunction()
	 * @generated
	 */
	int EMBEDDED_MATLAB_FUNCTION = 7;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.MiscBlockImpl <em>Misc Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.MiscBlockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getMiscBlock()
	 * @generated
	 */
	int MISC_BLOCK = 8;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.SimulinkContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.SimulinkContainerImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkContainer()
	 * @generated
	 */
	int SIMULINK_CONTAINER = 9;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.SimulinkLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.SimulinkLibraryImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkLibrary()
	 * @generated
	 */
	int SIMULINK_LIBRARY = 10;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.LibraryReferenceImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getLibraryReference()
	 * @generated
	 */
	int LIBRARY_REFERENCE = 11;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.OutPortBlockImpl <em>Out Port Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.OutPortBlockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getOutPortBlock()
	 * @generated
	 */
	int OUT_PORT_BLOCK = 13;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.ChartBlockImpl <em>Chart Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.ChartBlockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getChartBlock()
	 * @generated
	 */
	int CHART_BLOCK = 14;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.BusImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 15;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.BusCreatorImpl <em>Bus Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.BusCreatorImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBusCreator()
	 * @generated
	 */
	int BUS_CREATOR = 16;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.BusSelectorImpl <em>Bus Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.BusSelectorImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBusSelector()
	 * @generated
	 */
	int BUS_SELECTOR = 17;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.PortBlockImpl <em>Port Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.PortBlockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getPortBlock()
	 * @generated
	 */
	int PORT_BLOCK = 18;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__DIMENSIONS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__INITIAL_CONDITION = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__PARAMETERS = PORT_BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__ID = PORT_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__PARENT = PORT_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__NAME = PORT_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__OUT_PORTS = PORT_BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__IN_PORTS = PORT_BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__INCOMING_LINES = PORT_BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__OUTGOING_LINES = PORT_BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__DIMENSIONS = PORT_BLOCK__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__TYPE = PORT_BLOCK__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__INITIAL_CONDITION = PORT_BLOCK__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__BLOCK = PORT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK_FEATURE_COUNT = PORT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK___GET_PARAMETER__STRING = PORT_BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK___GET_FULLY_QUALIFIED_NAME = PORT_BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>In Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK_OPERATION_COUNT = PORT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION__CODE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Embedded Matlab Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Embedded Matlab Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_MATLAB_FUNCTION_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK__TYPE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Misc Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Misc Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISC_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER__PARAMETERS = ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER__MODELS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER__LIBRARIES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER___GET_PARAMETER__STRING = ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_CONTAINER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__PARAMETERS = SIMULINK_FILE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__ID = SIMULINK_FILE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__PARENT = SIMULINK_FILE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__NAME = SIMULINK_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__OUT_PORTS = SIMULINK_FILE__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__IN_PORTS = SIMULINK_FILE__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__INCOMING_LINES = SIMULINK_FILE__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__OUTGOING_LINES = SIMULINK_FILE__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__LINES = SIMULINK_FILE__LINES;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__BLOCKS = SIMULINK_FILE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__SUB_SYSTEMS = SIMULINK_FILE__SUB_SYSTEMS;

	/**
	 * The feature id for the '<em><b>All Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__ALL_BLOCKS = SIMULINK_FILE__ALL_BLOCKS;

	/**
	 * The feature id for the '<em><b>Stateflow Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__STATEFLOW_MACHINE = SIMULINK_FILE__STATEFLOW_MACHINE;

	/**
	 * The feature id for the '<em><b>Buses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY__BUSES = SIMULINK_FILE__BUSES;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY_FEATURE_COUNT = SIMULINK_FILE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY___GET_PARAMETER__STRING = SIMULINK_FILE___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY___GET_FULLY_QUALIFIED_NAME = SIMULINK_FILE___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Block By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY___GET_BLOCK_BY_NAME__STRING = SIMULINK_FILE___GET_BLOCK_BY_NAME__STRING;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_LIBRARY_OPERATION_COUNT = SIMULINK_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__SOURCE_BLOCK = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Library Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__PARAMETERS = PORT_BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__ID = PORT_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__PARENT = PORT_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__NAME = PORT_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__OUT_PORTS = PORT_BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__IN_PORTS = PORT_BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__INCOMING_LINES = PORT_BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__OUTGOING_LINES = PORT_BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__DIMENSIONS = PORT_BLOCK__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__TYPE = PORT_BLOCK__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__INITIAL_CONDITION = PORT_BLOCK__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__BLOCK = PORT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK_FEATURE_COUNT = PORT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK___GET_PARAMETER__STRING = PORT_BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK___GET_FULLY_QUALIFIED_NAME = PORT_BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Out Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK_OPERATION_COUNT = PORT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK__CHART = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chart Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Chart Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARAMETERS = ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ELEMENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_PARAMETER__STRING = ELEMENT___GET_PARAMETER__STRING;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR__BUS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Bus Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CREATOR_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR__BUS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Bus Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SELECTOR_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.UnitDelayImpl <em>Unit Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.UnitDelayImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getUnitDelay()
	 * @generated
	 */
	int UNIT_DELAY = 19;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The number of structural features of the '<em>Unit Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Unit Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DELAY_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.DigitalClockImpl <em>Digital Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.DigitalClockImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getDigitalClock()
	 * @generated
	 */
	int DIGITAL_CLOCK = 20;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Sample Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK__SAMPLE_TIME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Digital Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.ConstantImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 21;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.TriggerPortImpl <em>Trigger Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.TriggerPortImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getTriggerPort()
	 * @generated
	 */
	int TRIGGER_PORT = 22;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__PARAMETERS = IN_PORT_BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__ID = IN_PORT_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__PARENT = IN_PORT_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__NAME = IN_PORT_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__OUT_PORTS = IN_PORT_BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__IN_PORTS = IN_PORT_BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__INCOMING_LINES = IN_PORT_BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__OUTGOING_LINES = IN_PORT_BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__DIMENSIONS = IN_PORT_BLOCK__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__TYPE = IN_PORT_BLOCK__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__INITIAL_CONDITION = IN_PORT_BLOCK__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__BLOCK = IN_PORT_BLOCK__BLOCK;

	/**
	 * The feature id for the '<em><b>Trigger Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__TRIGGER_INPUT = IN_PORT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT_FEATURE_COUNT = IN_PORT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT___GET_PARAMETER__STRING = IN_PORT_BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT___GET_FULLY_QUALIFIED_NAME = IN_PORT_BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Trigger Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT_OPERATION_COUNT = IN_PORT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.EnablePortImpl <em>Enable Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.EnablePortImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getEnablePort()
	 * @generated
	 */
	int ENABLE_PORT = 23;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__PARAMETERS = IN_PORT_BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__ID = IN_PORT_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__PARENT = IN_PORT_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__NAME = IN_PORT_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__OUT_PORTS = IN_PORT_BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__IN_PORTS = IN_PORT_BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__INCOMING_LINES = IN_PORT_BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__OUTGOING_LINES = IN_PORT_BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__DIMENSIONS = IN_PORT_BLOCK__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__TYPE = IN_PORT_BLOCK__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__INITIAL_CONDITION = IN_PORT_BLOCK__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT__BLOCK = IN_PORT_BLOCK__BLOCK;

	/**
	 * The number of structural features of the '<em>Enable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT_FEATURE_COUNT = IN_PORT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT___GET_PARAMETER__STRING = IN_PORT_BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT___GET_FULLY_QUALIFIED_NAME = IN_PORT_BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Enable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_PORT_OPERATION_COUNT = IN_PORT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.BusElementImpl <em>Bus Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.BusElementImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBusElement()
	 * @generated
	 */
	int BUS_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__DIMENSIONS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__BUS = 3;

	/**
	 * The number of structural features of the '<em>Bus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.impl.ZeroOrderHoldImpl <em>Zero Order Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.impl.ZeroOrderHoldImpl
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getZeroOrderHold()
	 * @generated
	 */
	int ZERO_ORDER_HOLD = 25;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__OUT_PORTS = BLOCK__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__IN_PORTS = BLOCK__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Incoming Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__INCOMING_LINES = BLOCK__INCOMING_LINES;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__OUTGOING_LINES = BLOCK__OUTGOING_LINES;

	/**
	 * The feature id for the '<em><b>Sample Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD__SAMPLE_TIME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zero Order Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD___GET_PARAMETER__STRING = BLOCK___GET_PARAMETER__STRING;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD___GET_FULLY_QUALIFIED_NAME = BLOCK___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Zero Order Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_ORDER_HOLD_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.DataType
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.muml.simulink.TriggerEvent <em>Trigger Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.TriggerEvent
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 27;

	/**
	 * The meta object id for the '<em>Parameter Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.muml.simulink.impl.SimulinkPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.muml.simulink.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.Block#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.muml.simulink.Block#getParent()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.Block#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Ports</em>'.
	 * @see org.muml.simulink.Block#getOutPorts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OutPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.Block#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Ports</em>'.
	 * @see org.muml.simulink.Block#getInPorts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_InPorts();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.Block#getIncomingLines <em>Incoming Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Lines</em>'.
	 * @see org.muml.simulink.Block#getIncomingLines()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_IncomingLines();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.Block#getOutgoingLines <em>Outgoing Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Lines</em>'.
	 * @see org.muml.simulink.Block#getOutgoingLines()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OutgoingLines();

	/**
	 * Returns the meta object for the '{@link org.muml.simulink.Block#getFullyQualifiedName() <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see org.muml.simulink.Block#getFullyQualifiedName()
	 * @generated
	 */
	EOperation getBlock__GetFullyQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.SimulinkModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.muml.simulink.SimulinkModel
	 * @generated
	 */
	EClass getSimulinkModel();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.SimulinkModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see org.muml.simulink.SimulinkModel#getRoot()
	 * @see #getSimulinkModel()
	 * @generated
	 */
	EReference getSimulinkModel_Root();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.muml.simulink.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.Element#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.muml.simulink.Element#getParameters()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.muml.simulink.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the '{@link org.muml.simulink.Element#getParameter(java.lang.String) <em>Get Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter</em>' operation.
	 * @see org.muml.simulink.Element#getParameter(java.lang.String)
	 * @generated
	 */
	EOperation getElement__GetParameter__String();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.muml.simulink.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.Line#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see org.muml.simulink.Line#getSourcePort()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.Line#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see org.muml.simulink.Line#getTargetPort()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_TargetPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.Line#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Block</em>'.
	 * @see org.muml.simulink.Line#getSourceBlock()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_SourceBlock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.Line#getTargetBlock <em>Target Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Block</em>'.
	 * @see org.muml.simulink.Line#getTargetBlock()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_TargetBlock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.Line#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see org.muml.simulink.Line#getBus()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Bus();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.muml.simulink.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.simulink.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.simulink.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see org.muml.simulink.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.SubSystem#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.muml.simulink.SubSystem#getLines()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Lines();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.SubSystem#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see org.muml.simulink.SubSystem#getBlocks()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Blocks();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.SubSystem#getSubSystems <em>Sub Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Systems</em>'.
	 * @see org.muml.simulink.SubSystem#getSubSystems()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_SubSystems();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.SubSystem#getAllBlocks <em>All Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Blocks</em>'.
	 * @see org.muml.simulink.SubSystem#getAllBlocks()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_AllBlocks();

	/**
	 * Returns the meta object for the '{@link org.muml.simulink.SubSystem#getBlockByName(java.lang.String) <em>Get Block By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Block By Name</em>' operation.
	 * @see org.muml.simulink.SubSystem#getBlockByName(java.lang.String)
	 * @generated
	 */
	EOperation getSubSystem__GetBlockByName__String();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.InPortBlock <em>In Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port Block</em>'.
	 * @see org.muml.simulink.InPortBlock
	 * @generated
	 */
	EClass getInPortBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.InPortBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see org.muml.simulink.InPortBlock#getBlock()
	 * @see #getInPortBlock()
	 * @generated
	 */
	EReference getInPortBlock_Block();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.EmbeddedMatlabFunction <em>Embedded Matlab Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Matlab Function</em>'.
	 * @see org.muml.simulink.EmbeddedMatlabFunction
	 * @generated
	 */
	EClass getEmbeddedMatlabFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.EmbeddedMatlabFunction#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.muml.simulink.EmbeddedMatlabFunction#getCode()
	 * @see #getEmbeddedMatlabFunction()
	 * @generated
	 */
	EAttribute getEmbeddedMatlabFunction_Code();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.MiscBlock <em>Misc Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Misc Block</em>'.
	 * @see org.muml.simulink.MiscBlock
	 * @generated
	 */
	EClass getMiscBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.MiscBlock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.simulink.MiscBlock#getType()
	 * @see #getMiscBlock()
	 * @generated
	 */
	EAttribute getMiscBlock_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.SimulinkContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.muml.simulink.SimulinkContainer
	 * @generated
	 */
	EClass getSimulinkContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.SimulinkContainer#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.muml.simulink.SimulinkContainer#getModels()
	 * @see #getSimulinkContainer()
	 * @generated
	 */
	EReference getSimulinkContainer_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.SimulinkContainer#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see org.muml.simulink.SimulinkContainer#getLibraries()
	 * @see #getSimulinkContainer()
	 * @generated
	 */
	EReference getSimulinkContainer_Libraries();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.SimulinkLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.muml.simulink.SimulinkLibrary
	 * @generated
	 */
	EClass getSimulinkLibrary();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Reference</em>'.
	 * @see org.muml.simulink.LibraryReference
	 * @generated
	 */
	EClass getLibraryReference();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.LibraryReference#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Block</em>'.
	 * @see org.muml.simulink.LibraryReference#getSourceBlock()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EReference getLibraryReference_SourceBlock();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.SimulinkFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.muml.simulink.SimulinkFile
	 * @generated
	 */
	EClass getSimulinkFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.simulink.SimulinkFile#getStateflowMachine <em>Stateflow Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stateflow Machine</em>'.
	 * @see org.muml.simulink.SimulinkFile#getStateflowMachine()
	 * @see #getSimulinkFile()
	 * @generated
	 */
	EReference getSimulinkFile_StateflowMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.SimulinkFile#getBuses <em>Buses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buses</em>'.
	 * @see org.muml.simulink.SimulinkFile#getBuses()
	 * @see #getSimulinkFile()
	 * @generated
	 */
	EReference getSimulinkFile_Buses();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.OutPortBlock <em>Out Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port Block</em>'.
	 * @see org.muml.simulink.OutPortBlock
	 * @generated
	 */
	EClass getOutPortBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.simulink.OutPortBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see org.muml.simulink.OutPortBlock#getBlock()
	 * @see #getOutPortBlock()
	 * @generated
	 */
	EReference getOutPortBlock_Block();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.ChartBlock <em>Chart Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Block</em>'.
	 * @see org.muml.simulink.ChartBlock
	 * @generated
	 */
	EClass getChartBlock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.ChartBlock#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart</em>'.
	 * @see org.muml.simulink.ChartBlock#getChart()
	 * @see #getChartBlock()
	 * @generated
	 */
	EReference getChartBlock_Chart();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.muml.simulink.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Bus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.Bus#getName()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.Bus#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.muml.simulink.Bus#getElements()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Elements();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.BusCreator <em>Bus Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Creator</em>'.
	 * @see org.muml.simulink.BusCreator
	 * @generated
	 */
	EClass getBusCreator();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.BusCreator#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see org.muml.simulink.BusCreator#getBus()
	 * @see #getBusCreator()
	 * @generated
	 */
	EReference getBusCreator_Bus();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.BusSelector <em>Bus Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Selector</em>'.
	 * @see org.muml.simulink.BusSelector
	 * @generated
	 */
	EClass getBusSelector();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.BusSelector#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see org.muml.simulink.BusSelector#getBus()
	 * @see #getBusSelector()
	 * @generated
	 */
	EReference getBusSelector_Bus();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.PortBlock <em>Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Block</em>'.
	 * @see org.muml.simulink.PortBlock
	 * @generated
	 */
	EClass getPortBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.PortBlock#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see org.muml.simulink.PortBlock#getDimensions()
	 * @see #getPortBlock()
	 * @generated
	 */
	EAttribute getPortBlock_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.PortBlock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.simulink.PortBlock#getType()
	 * @see #getPortBlock()
	 * @generated
	 */
	EAttribute getPortBlock_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.PortBlock#getInitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Condition</em>'.
	 * @see org.muml.simulink.PortBlock#getInitialCondition()
	 * @see #getPortBlock()
	 * @generated
	 */
	EAttribute getPortBlock_InitialCondition();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.UnitDelay <em>Unit Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Delay</em>'.
	 * @see org.muml.simulink.UnitDelay
	 * @generated
	 */
	EClass getUnitDelay();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.DigitalClock <em>Digital Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Clock</em>'.
	 * @see org.muml.simulink.DigitalClock
	 * @generated
	 */
	EClass getDigitalClock();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.DigitalClock#getSampleTime <em>Sample Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Time</em>'.
	 * @see org.muml.simulink.DigitalClock#getSampleTime()
	 * @see #getDigitalClock()
	 * @generated
	 */
	EAttribute getDigitalClock_SampleTime();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.muml.simulink.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.simulink.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.simulink.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.TriggerPort <em>Trigger Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Port</em>'.
	 * @see org.muml.simulink.TriggerPort
	 * @generated
	 */
	EClass getTriggerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.TriggerPort#getTriggerInput <em>Trigger Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Input</em>'.
	 * @see org.muml.simulink.TriggerPort#getTriggerInput()
	 * @see #getTriggerPort()
	 * @generated
	 */
	EAttribute getTriggerPort_TriggerInput();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.EnablePort <em>Enable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Port</em>'.
	 * @see org.muml.simulink.EnablePort
	 * @generated
	 */
	EClass getEnablePort();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.BusElement <em>Bus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Element</em>'.
	 * @see org.muml.simulink.BusElement
	 * @generated
	 */
	EClass getBusElement();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.BusElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.simulink.BusElement#getName()
	 * @see #getBusElement()
	 * @generated
	 */
	EAttribute getBusElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.BusElement#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see org.muml.simulink.BusElement#getDimensions()
	 * @see #getBusElement()
	 * @generated
	 */
	EAttribute getBusElement_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.BusElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.simulink.BusElement#getType()
	 * @see #getBusElement()
	 * @generated
	 */
	EAttribute getBusElement_Type();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.BusElement#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see org.muml.simulink.BusElement#getBus()
	 * @see #getBusElement()
	 * @generated
	 */
	EReference getBusElement_Bus();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.ZeroOrderHold <em>Zero Order Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zero Order Hold</em>'.
	 * @see org.muml.simulink.ZeroOrderHold
	 * @generated
	 */
	EClass getZeroOrderHold();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.ZeroOrderHold#getSampleTime <em>Sample Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Time</em>'.
	 * @see org.muml.simulink.ZeroOrderHold#getSampleTime()
	 * @see #getZeroOrderHold()
	 * @generated
	 */
	EAttribute getZeroOrderHold_SampleTime();

	/**
	 * Returns the meta object for enum '{@link org.muml.simulink.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.muml.simulink.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link org.muml.simulink.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Event</em>'.
	 * @see org.muml.simulink.TriggerEvent
	 * @generated
	 */
	EEnum getTriggerEvent();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getParameterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulinkFactory getSimulinkFactory();

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
		 * The meta object literal for the '{@link org.muml.simulink.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.BlockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PARENT = eINSTANCE.getBlock_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Out Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OUT_PORTS = eINSTANCE.getBlock_OutPorts();

		/**
		 * The meta object literal for the '<em><b>In Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__IN_PORTS = eINSTANCE.getBlock_InPorts();

		/**
		 * The meta object literal for the '<em><b>Incoming Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INCOMING_LINES = eINSTANCE.getBlock_IncomingLines();

		/**
		 * The meta object literal for the '<em><b>Outgoing Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OUTGOING_LINES = eINSTANCE.getBlock_OutgoingLines();

		/**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___GET_FULLY_QUALIFIED_NAME = eINSTANCE.getBlock__GetFullyQualifiedName();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.SimulinkModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.SimulinkModelImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkModel()
		 * @generated
		 */
		EClass SIMULINK_MODEL = eINSTANCE.getSimulinkModel();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULINK_MODEL__ROOT = eINSTANCE.getSimulinkModel_Root();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.ElementImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARAMETERS = eINSTANCE.getElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Get Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_PARAMETER__STRING = eINSTANCE.getElement__GetParameter__String();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.LineImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__SOURCE_PORT = eINSTANCE.getLine_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TARGET_PORT = eINSTANCE.getLine_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Source Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__SOURCE_BLOCK = eINSTANCE.getLine_SourceBlock();

		/**
		 * The meta object literal for the '<em><b>Target Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TARGET_BLOCK = eINSTANCE.getLine_TargetBlock();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__BUS = eINSTANCE.getLine_Bus();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.ParameterImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.SubSystemImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__LINES = eINSTANCE.getSubSystem_Lines();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__BLOCKS = eINSTANCE.getSubSystem_Blocks();

		/**
		 * The meta object literal for the '<em><b>Sub Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__SUB_SYSTEMS = eINSTANCE.getSubSystem_SubSystems();

		/**
		 * The meta object literal for the '<em><b>All Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ALL_BLOCKS = eINSTANCE.getSubSystem_AllBlocks();

		/**
		 * The meta object literal for the '<em><b>Get Block By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_SYSTEM___GET_BLOCK_BY_NAME__STRING = eINSTANCE.getSubSystem__GetBlockByName__String();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.InPortBlockImpl <em>In Port Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.InPortBlockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getInPortBlock()
		 * @generated
		 */
		EClass IN_PORT_BLOCK = eINSTANCE.getInPortBlock();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT_BLOCK__BLOCK = eINSTANCE.getInPortBlock_Block();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.EmbeddedMatlabFunctionImpl <em>Embedded Matlab Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.EmbeddedMatlabFunctionImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getEmbeddedMatlabFunction()
		 * @generated
		 */
		EClass EMBEDDED_MATLAB_FUNCTION = eINSTANCE.getEmbeddedMatlabFunction();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_MATLAB_FUNCTION__CODE = eINSTANCE.getEmbeddedMatlabFunction_Code();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.MiscBlockImpl <em>Misc Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.MiscBlockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getMiscBlock()
		 * @generated
		 */
		EClass MISC_BLOCK = eINSTANCE.getMiscBlock();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISC_BLOCK__TYPE = eINSTANCE.getMiscBlock_Type();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.SimulinkContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.SimulinkContainerImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkContainer()
		 * @generated
		 */
		EClass SIMULINK_CONTAINER = eINSTANCE.getSimulinkContainer();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULINK_CONTAINER__MODELS = eINSTANCE.getSimulinkContainer_Models();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULINK_CONTAINER__LIBRARIES = eINSTANCE.getSimulinkContainer_Libraries();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.SimulinkLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.SimulinkLibraryImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkLibrary()
		 * @generated
		 */
		EClass SIMULINK_LIBRARY = eINSTANCE.getSimulinkLibrary();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.LibraryReferenceImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getLibraryReference()
		 * @generated
		 */
		EClass LIBRARY_REFERENCE = eINSTANCE.getLibraryReference();

		/**
		 * The meta object literal for the '<em><b>Source Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_REFERENCE__SOURCE_BLOCK = eINSTANCE.getLibraryReference_SourceBlock();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.SimulinkFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.SimulinkFileImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getSimulinkFile()
		 * @generated
		 */
		EClass SIMULINK_FILE = eINSTANCE.getSimulinkFile();

		/**
		 * The meta object literal for the '<em><b>Stateflow Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULINK_FILE__STATEFLOW_MACHINE = eINSTANCE.getSimulinkFile_StateflowMachine();

		/**
		 * The meta object literal for the '<em><b>Buses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULINK_FILE__BUSES = eINSTANCE.getSimulinkFile_Buses();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.OutPortBlockImpl <em>Out Port Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.OutPortBlockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getOutPortBlock()
		 * @generated
		 */
		EClass OUT_PORT_BLOCK = eINSTANCE.getOutPortBlock();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT_BLOCK__BLOCK = eINSTANCE.getOutPortBlock_Block();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.ChartBlockImpl <em>Chart Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.ChartBlockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getChartBlock()
		 * @generated
		 */
		EClass CHART_BLOCK = eINSTANCE.getChartBlock();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_BLOCK__CHART = eINSTANCE.getChartBlock_Chart();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.BusImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__NAME = eINSTANCE.getBus_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__ELEMENTS = eINSTANCE.getBus_Elements();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.BusCreatorImpl <em>Bus Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.BusCreatorImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBusCreator()
		 * @generated
		 */
		EClass BUS_CREATOR = eINSTANCE.getBusCreator();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CREATOR__BUS = eINSTANCE.getBusCreator_Bus();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.BusSelectorImpl <em>Bus Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.BusSelectorImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBusSelector()
		 * @generated
		 */
		EClass BUS_SELECTOR = eINSTANCE.getBusSelector();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SELECTOR__BUS = eINSTANCE.getBusSelector_Bus();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.PortBlockImpl <em>Port Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.PortBlockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getPortBlock()
		 * @generated
		 */
		EClass PORT_BLOCK = eINSTANCE.getPortBlock();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BLOCK__DIMENSIONS = eINSTANCE.getPortBlock_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BLOCK__TYPE = eINSTANCE.getPortBlock_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BLOCK__INITIAL_CONDITION = eINSTANCE.getPortBlock_InitialCondition();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.UnitDelayImpl <em>Unit Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.UnitDelayImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getUnitDelay()
		 * @generated
		 */
		EClass UNIT_DELAY = eINSTANCE.getUnitDelay();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.DigitalClockImpl <em>Digital Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.DigitalClockImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getDigitalClock()
		 * @generated
		 */
		EClass DIGITAL_CLOCK = eINSTANCE.getDigitalClock();

		/**
		 * The meta object literal for the '<em><b>Sample Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_CLOCK__SAMPLE_TIME = eINSTANCE.getDigitalClock_SampleTime();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.ConstantImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.TriggerPortImpl <em>Trigger Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.TriggerPortImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getTriggerPort()
		 * @generated
		 */
		EClass TRIGGER_PORT = eINSTANCE.getTriggerPort();

		/**
		 * The meta object literal for the '<em><b>Trigger Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_PORT__TRIGGER_INPUT = eINSTANCE.getTriggerPort_TriggerInput();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.EnablePortImpl <em>Enable Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.EnablePortImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getEnablePort()
		 * @generated
		 */
		EClass ENABLE_PORT = eINSTANCE.getEnablePort();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.BusElementImpl <em>Bus Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.BusElementImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getBusElement()
		 * @generated
		 */
		EClass BUS_ELEMENT = eINSTANCE.getBusElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_ELEMENT__NAME = eINSTANCE.getBusElement_Name();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_ELEMENT__DIMENSIONS = eINSTANCE.getBusElement_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_ELEMENT__TYPE = eINSTANCE.getBusElement_Type();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_ELEMENT__BUS = eINSTANCE.getBusElement_Bus();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.impl.ZeroOrderHoldImpl <em>Zero Order Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.impl.ZeroOrderHoldImpl
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getZeroOrderHold()
		 * @generated
		 */
		EClass ZERO_ORDER_HOLD = eINSTANCE.getZeroOrderHold();

		/**
		 * The meta object literal for the '<em><b>Sample Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZERO_ORDER_HOLD__SAMPLE_TIME = eINSTANCE.getZeroOrderHold_SampleTime();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.DataType
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.TriggerEvent <em>Trigger Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.TriggerEvent
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getTriggerEvent()
		 * @generated
		 */
		EEnum TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

		/**
		 * The meta object literal for the '<em>Parameter Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.muml.simulink.impl.SimulinkPackageImpl#getParameterType()
		 * @generated
		 */
		EDataType PARAMETER_TYPE = eINSTANCE.getParameterType();

	}

} //SimulinkPackage

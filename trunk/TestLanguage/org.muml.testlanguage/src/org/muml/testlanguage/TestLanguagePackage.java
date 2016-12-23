/**
 */
package org.muml.testlanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.muml.testlanguage.TestLanguageFactory
 * @model kind="package" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TestLanguagePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "testlanguage";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/testlanguage/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "testlanguage";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	TestLanguagePackage eINSTANCE = org.muml.testlanguage.impl.TestLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.testlanguage.impl.NodeImpl
	 * <em>Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.impl.NodeImpl
	 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Specification Class Name</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__SPECIFICATION_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Input Cache</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__INPUT_CACHE = 5;

	/**
	 * The feature id for the '<em><b>Output Cache</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__OUTPUT_CACHE = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Setup From Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE___SETUP_FROM_SPECIFICATION = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE___EXECUTE = 1;

	/**
	 * The operation id for the '<em>Create Specification</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_SPECIFICATION = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.testlanguage.impl.PortImpl
	 * <em>Port</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.impl.PortImpl
	 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Out</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT__IN_OUT = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.testlanguage.impl.InputImpl
	 * <em>Input</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.impl.InputImpl
	 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>In Out</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT__IN_OUT = PORT__IN_OUT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT__SOURCE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT__NODE = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT__OPTIONAL = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT__DATA_TYPE = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Data</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_DATA = PORT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.testlanguage.impl.OutputImpl
	 * <em>Output</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.impl.OutputImpl
	 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>In Out</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IN_OUT = PORT__IN_OUT;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TARGETS = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NODE = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Data</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_DATA = PORT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = PORT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.impl.TestCaseImpl <em>Test Case</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.impl.TestCaseImpl
	 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NODES = 0;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Case</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.muml.testlanguage.Node
	 * <em>Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.muml.testlanguage.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.muml.testlanguage.Node#getInputs <em>Inputs</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Inputs</em>'.
	 * @see org.muml.testlanguage.Node#getInputs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Inputs();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.muml.testlanguage.Node#getOutputs <em>Outputs</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Outputs</em>'.
	 * @see org.muml.testlanguage.Node#getOutputs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outputs();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Node#getLabel <em>Label</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.muml.testlanguage.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.muml.testlanguage.Node#getSpecification <em>Specification</em>
	 * }'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Specification</em>'.
	 * @see org.muml.testlanguage.Node#getSpecification()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Specification();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Node#getSpecificationClassName
	 * <em>Specification Class Name</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '
	 *         <em>Specification Class Name</em>'.
	 * @see org.muml.testlanguage.Node#getSpecificationClassName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SpecificationClassName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Node#getInputCache <em>Input Cache</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Input Cache</em>'.
	 * @see org.muml.testlanguage.Node#getInputCache()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_InputCache();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Node#getOutputCache <em>Output Cache</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Output Cache</em>'.
	 * @see org.muml.testlanguage.Node#getOutputCache()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_OutputCache();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.Node#setupFromSpecification()
	 * <em>Setup From Specification</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Setup From Specification</em>'
	 *         operation.
	 * @see org.muml.testlanguage.Node#setupFromSpecification()
	 * @generated
	 */
	EOperation getNode__SetupFromSpecification();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.Node#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.Node#execute()
	 * @generated
	 */
	EOperation getNode__Execute();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.Node#createSpecification()
	 * <em>Create Specification</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Create Specification</em>'
	 *         operation.
	 * @see org.muml.testlanguage.Node#createSpecification()
	 * @generated
	 */
	EOperation getNode__CreateSpecification();

	/**
	 * Returns the meta object for class '{@link org.muml.testlanguage.Input
	 * <em>Input</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.muml.testlanguage.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.muml.testlanguage.Input#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.testlanguage.Input#getSource()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Source();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.muml.testlanguage.Input#getNode <em>Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see org.muml.testlanguage.Input#getNode()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Node();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Input#isOptional <em>Optional</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.muml.testlanguage.Input#isOptional()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Optional();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Input#getDataType <em>Data Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.muml.testlanguage.Input#getDataType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_DataType();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.Input#getData() <em>Get Data</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Data</em>' operation.
	 * @see org.muml.testlanguage.Input#getData()
	 * @generated
	 */
	EOperation getInput__GetData();

	/**
	 * Returns the meta object for class '{@link org.muml.testlanguage.Output
	 * <em>Output</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.muml.testlanguage.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.muml.testlanguage.Output#getTargets <em>Targets</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.muml.testlanguage.Output#getTargets()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Targets();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.muml.testlanguage.Output#getNode <em>Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see org.muml.testlanguage.Output#getNode()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Node();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.Output#getData() <em>Get Data</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Data</em>' operation.
	 * @see org.muml.testlanguage.Output#getData()
	 * @generated
	 */
	EOperation getOutput__GetData();

	/**
	 * Returns the meta object for class '{@link org.muml.testlanguage.Port
	 * <em>Port</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.muml.testlanguage.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Port#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.testlanguage.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.Port#isInOut <em>In Out</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>In Out</em>'.
	 * @see org.muml.testlanguage.Port#isInOut()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_InOut();

	/**
	 * Returns the meta object for class '{@link org.muml.testlanguage.TestCase
	 * <em>Test Case</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see org.muml.testlanguage.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.muml.testlanguage.TestCase#getNodes <em>Nodes</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Nodes</em>'.
	 * @see org.muml.testlanguage.TestCase#getNodes()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Nodes();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestLanguageFactory getTestLanguageFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.impl.NodeImpl
		 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NODE__INPUTS = eINSTANCE.getNode_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NODE__OUTPUTS = eINSTANCE.getNode_Outputs();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NODE__SPECIFICATION = eINSTANCE.getNode_Specification();

		/**
		 * The meta object literal for the '
		 * <em><b>Specification Class Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE__SPECIFICATION_CLASS_NAME = eINSTANCE.getNode_SpecificationClassName();

		/**
		 * The meta object literal for the '<em><b>Input Cache</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE__INPUT_CACHE = eINSTANCE.getNode_InputCache();

		/**
		 * The meta object literal for the '<em><b>Output Cache</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE__OUTPUT_CACHE = eINSTANCE.getNode_OutputCache();

		/**
		 * The meta object literal for the '
		 * <em><b>Setup From Specification</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE___SETUP_FROM_SPECIFICATION = eINSTANCE.getNode__SetupFromSpecification();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE___EXECUTE = eINSTANCE.getNode__Execute();

		/**
		 * The meta object literal for the '<em><b>Create Specification</b></em>
		 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE___CREATE_SPECIFICATION = eINSTANCE.getNode__CreateSpecification();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.impl.InputImpl
		 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INPUT__SOURCE = eINSTANCE.getInput_Source();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INPUT__NODE = eINSTANCE.getInput_Node();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INPUT__OPTIONAL = eINSTANCE.getInput_Optional();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INPUT__DATA_TYPE = eINSTANCE.getInput_DataType();

		/**
		 * The meta object literal for the '<em><b>Get Data</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation INPUT___GET_DATA = eINSTANCE.getInput__GetData();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.impl.OutputImpl
		 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OUTPUT__TARGETS = eINSTANCE.getOutput_Targets();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OUTPUT__NODE = eINSTANCE.getOutput_Node();

		/**
		 * The meta object literal for the '<em><b>Get Data</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation OUTPUT___GET_DATA = eINSTANCE.getOutput__GetData();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.impl.PortImpl
		 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>In Out</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT__IN_OUT = eINSTANCE.getPort_InOut();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.impl.TestCaseImpl <em>Test Case</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.impl.TestCaseImpl
		 * @see org.muml.testlanguage.impl.TestLanguagePackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEST_CASE__NODES = eINSTANCE.getTestCase_Nodes();

	}

} // TestLanguagePackage

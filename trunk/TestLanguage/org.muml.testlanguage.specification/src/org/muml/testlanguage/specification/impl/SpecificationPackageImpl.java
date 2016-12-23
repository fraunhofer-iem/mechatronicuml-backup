/**
 */
package org.muml.testlanguage.specification.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.testlanguage.specification.AssertBool;
import org.muml.testlanguage.specification.AssertDiagnosticTrace;
import org.muml.testlanguage.specification.AssertResult;
import org.muml.testlanguage.specification.CheckMTCTL;
import org.muml.testlanguage.specification.CompareModels;
import org.muml.testlanguage.specification.Default;
import org.muml.testlanguage.specification.ExecuteUPPAAL;
import org.muml.testlanguage.specification.LoadModel;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.PrimitiveString;
import org.muml.testlanguage.specification.SaveModel;
import org.muml.testlanguage.specification.SpecificationFactory;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.Transformation;
import org.muml.testlanguage.specification.ValidateModel;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SpecificationPackageImpl extends EPackageImpl implements SpecificationPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nodeSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass portSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass defaultEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass loadModelEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass compareModelsEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass validateModelEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass saveModelEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transformationEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass executeUPPAALEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass primitiveStringEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assertBoolEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assertDiagnosticTraceEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass assertResultEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass checkMTCTLEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum portTypeEEnum = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType executionExceptionEDataType = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType defaultExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.testlanguage.specification.SpecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpecificationPackageImpl() {
		super(eNS_URI, SpecificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link SpecificationPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpecificationPackage init() {
		if (isInited)
			return (SpecificationPackage) EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);

		// Obtain or create and register package
		SpecificationPackageImpl theSpecificationPackage = (SpecificationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SpecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SpecificationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpecificationPackage.createPackageContents();

		// Initialize created meta-data
		theSpecificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpecificationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpecificationPackage.eNS_URI, theSpecificationPackage);
		return theSpecificationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNodeSpecification() {
		return nodeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNodeSpecification_PortSpecifications() {
		return (EReference) nodeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNodeSpecification_Label() {
		return (EAttribute) nodeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNodeSpecification__Initialize() {
		return nodeSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNodeSpecification__Execute__Map_Map() {
		return nodeSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNodeSpecification__NotifyChanged__Object() {
		return nodeSpecificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNodeSpecification__AddPortSpecification__PortType_String_boolean() {
		return nodeSpecificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNodeSpecification__AddPortSpecification__PortType_String_boolean_Class() {
		return nodeSpecificationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPortSpecification() {
		return portSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPortSpecification_Name() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPortSpecification_Optional() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPortSpecification_Type() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPortSpecification_DataType() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDefault() {
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getDefault__Initialize() {
		return defaultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getDefault__Execute__Map_Map() {
		return defaultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLoadModel() {
		return loadModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLoadModel_Uri() {
		return (EAttribute) loadModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getLoadModel__Initialize() {
		return loadModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getLoadModel__Execute__Map_Map() {
		return loadModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCompareModels() {
		return compareModelsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getCompareModels__Initialize() {
		return compareModelsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getCompareModels__Execute__Map_Map() {
		return compareModelsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValidateModel() {
		return validateModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getValidateModel__Initialize() {
		return validateModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getValidateModel__Execute__Map_Map() {
		return validateModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSaveModel() {
		return saveModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSaveModel_Uri() {
		return (EAttribute) saveModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getSaveModel__Initialize() {
		return saveModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getSaveModel__Execute__Map_Map() {
		return saveModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_Uri() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTransformation_ParameterOrder() {
		return (EReference) transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_ConfigProperties() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__Initialize() {
		return transformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__Execute__Map_Map() {
		return transformationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__NotifyChanged__Object() {
		return transformationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExecuteUPPAAL() {
		return executeUPPAALEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getExecuteUPPAAL__Initialize() {
		return executeUPPAALEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getExecuteUPPAAL__Execute__Map_Map() {
		return executeUPPAALEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPrimitiveString() {
		return primitiveStringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPrimitiveString_Value() {
		return (EAttribute) primitiveStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getPrimitiveString__Initialize() {
		return primitiveStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getPrimitiveString__Execute__Map_Map() {
		return primitiveStringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssertBool() {
		return assertBoolEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssertBool_Assertion() {
		return (EAttribute) assertBoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAssertBool__Initialize() {
		return assertBoolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAssertBool__Execute__Map_Map() {
		return assertBoolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssertDiagnosticTrace() {
		return assertDiagnosticTraceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAssertDiagnosticTrace__Initialize() {
		return assertDiagnosticTraceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAssertDiagnosticTrace__Execute__Map_Map() {
		return assertDiagnosticTraceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssertResult() {
		return assertResultEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAssertResult__Initialize() {
		return assertResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAssertResult__Execute__Map_Map() {
		return assertResultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCheckMTCTL() {
		return checkMTCTLEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCheckMTCTL_Properties() {
		return (EAttribute) checkMTCTLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getCheckMTCTL__Initialize() {
		return checkMTCTLEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getCheckMTCTL__Execute__Map_Map() {
		return checkMTCTLEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getExecutionException() {
		return executionExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDefaultException() {
		return defaultExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificationFactory getSpecificationFactory() {
		return (SpecificationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		nodeSpecificationEClass = createEClass(NODE_SPECIFICATION);
		createEReference(nodeSpecificationEClass, NODE_SPECIFICATION__PORT_SPECIFICATIONS);
		createEAttribute(nodeSpecificationEClass, NODE_SPECIFICATION__LABEL);
		createEOperation(nodeSpecificationEClass, NODE_SPECIFICATION___INITIALIZE);
		createEOperation(nodeSpecificationEClass, NODE_SPECIFICATION___EXECUTE__MAP_MAP);
		createEOperation(nodeSpecificationEClass, NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT);
		createEOperation(nodeSpecificationEClass, NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN);
		createEOperation(nodeSpecificationEClass,
				NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS);

		portSpecificationEClass = createEClass(PORT_SPECIFICATION);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__NAME);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__OPTIONAL);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__TYPE);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__DATA_TYPE);

		defaultEClass = createEClass(DEFAULT);
		createEOperation(defaultEClass, DEFAULT___INITIALIZE);
		createEOperation(defaultEClass, DEFAULT___EXECUTE__MAP_MAP);

		loadModelEClass = createEClass(LOAD_MODEL);
		createEAttribute(loadModelEClass, LOAD_MODEL__URI);
		createEOperation(loadModelEClass, LOAD_MODEL___INITIALIZE);
		createEOperation(loadModelEClass, LOAD_MODEL___EXECUTE__MAP_MAP);

		compareModelsEClass = createEClass(COMPARE_MODELS);
		createEOperation(compareModelsEClass, COMPARE_MODELS___INITIALIZE);
		createEOperation(compareModelsEClass, COMPARE_MODELS___EXECUTE__MAP_MAP);

		validateModelEClass = createEClass(VALIDATE_MODEL);
		createEOperation(validateModelEClass, VALIDATE_MODEL___INITIALIZE);
		createEOperation(validateModelEClass, VALIDATE_MODEL___EXECUTE__MAP_MAP);

		saveModelEClass = createEClass(SAVE_MODEL);
		createEAttribute(saveModelEClass, SAVE_MODEL__URI);
		createEOperation(saveModelEClass, SAVE_MODEL___INITIALIZE);
		createEOperation(saveModelEClass, SAVE_MODEL___EXECUTE__MAP_MAP);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__URI);
		createEReference(transformationEClass, TRANSFORMATION__PARAMETER_ORDER);
		createEAttribute(transformationEClass, TRANSFORMATION__CONFIG_PROPERTIES);
		createEOperation(transformationEClass, TRANSFORMATION___INITIALIZE);
		createEOperation(transformationEClass, TRANSFORMATION___EXECUTE__MAP_MAP);
		createEOperation(transformationEClass, TRANSFORMATION___NOTIFY_CHANGED__OBJECT);

		executeUPPAALEClass = createEClass(EXECUTE_UPPAAL);
		createEOperation(executeUPPAALEClass, EXECUTE_UPPAAL___INITIALIZE);
		createEOperation(executeUPPAALEClass, EXECUTE_UPPAAL___EXECUTE__MAP_MAP);

		primitiveStringEClass = createEClass(PRIMITIVE_STRING);
		createEAttribute(primitiveStringEClass, PRIMITIVE_STRING__VALUE);
		createEOperation(primitiveStringEClass, PRIMITIVE_STRING___INITIALIZE);
		createEOperation(primitiveStringEClass, PRIMITIVE_STRING___EXECUTE__MAP_MAP);

		assertBoolEClass = createEClass(ASSERT_BOOL);
		createEAttribute(assertBoolEClass, ASSERT_BOOL__ASSERTION);
		createEOperation(assertBoolEClass, ASSERT_BOOL___INITIALIZE);
		createEOperation(assertBoolEClass, ASSERT_BOOL___EXECUTE__MAP_MAP);

		assertDiagnosticTraceEClass = createEClass(ASSERT_DIAGNOSTIC_TRACE);
		createEOperation(assertDiagnosticTraceEClass, ASSERT_DIAGNOSTIC_TRACE___INITIALIZE);
		createEOperation(assertDiagnosticTraceEClass, ASSERT_DIAGNOSTIC_TRACE___EXECUTE__MAP_MAP);

		assertResultEClass = createEClass(ASSERT_RESULT);
		createEOperation(assertResultEClass, ASSERT_RESULT___INITIALIZE);
		createEOperation(assertResultEClass, ASSERT_RESULT___EXECUTE__MAP_MAP);

		checkMTCTLEClass = createEClass(CHECK_MTCTL);
		createEAttribute(checkMTCTLEClass, CHECK_MTCTL__PROPERTIES);
		createEOperation(checkMTCTLEClass, CHECK_MTCTL___INITIALIZE);
		createEOperation(checkMTCTLEClass, CHECK_MTCTL___EXECUTE__MAP_MAP);

		// Create enums
		portTypeEEnum = createEEnum(PORT_TYPE);

		// Create data types
		executionExceptionEDataType = createEDataType(EXECUTION_EXCEPTION);
		defaultExceptionEDataType = createEDataType(DEFAULT_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultEClass.getESuperTypes().add(this.getNodeSpecification());
		loadModelEClass.getESuperTypes().add(this.getNodeSpecification());
		compareModelsEClass.getESuperTypes().add(this.getNodeSpecification());
		validateModelEClass.getESuperTypes().add(this.getNodeSpecification());
		saveModelEClass.getESuperTypes().add(this.getNodeSpecification());
		transformationEClass.getESuperTypes().add(this.getNodeSpecification());
		executeUPPAALEClass.getESuperTypes().add(this.getNodeSpecification());
		primitiveStringEClass.getESuperTypes().add(this.getNodeSpecification());
		assertBoolEClass.getESuperTypes().add(this.getNodeSpecification());
		assertDiagnosticTraceEClass.getESuperTypes().add(this.getAssertBool());
		assertResultEClass.getESuperTypes().add(this.getAssertBool());
		checkMTCTLEClass.getESuperTypes().add(this.getNodeSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeSpecificationEClass, NodeSpecification.class, "NodeSpecification", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeSpecification_PortSpecifications(), this.getPortSpecification(), null,
				"portSpecifications", null, 0, -1, NodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSpecification_Label(), ecorePackage.getEString(), "label", "Node", 1, 1,
				NodeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getNodeSpecification__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getNodeSpecification__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		op = initEOperation(getNodeSpecification__NotifyChanged__Object(), ecorePackage.getEBoolean(), "notifyChanged",
				1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "notification", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNodeSpecification__AddPortSpecification__PortType_String_boolean(),
				this.getPortSpecification(), "addPortSpecification", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "optional", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNodeSpecification__AddPortSpecification__PortType_String_boolean_Class(),
				this.getPortSpecification(), "addPortSpecification", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "optional", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portSpecificationEClass, PortSpecification.class, "PortSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				PortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortSpecification_Optional(), ecorePackage.getEBoolean(), "optional", null, 1, 1,
				PortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortSpecification_Type(), this.getPortType(), "type", "IN", 1, 1, PortSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getPortSpecification_DataType(), g1, "dataType", null, 0, 1, PortSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDefault__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDefault__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(loadModelEClass, LoadModel.class, "LoadModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadModel_Uri(), ecorePackage.getEString(), "uri", "", 1, 1, LoadModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLoadModel__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoadModel__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(compareModelsEClass, CompareModels.class, "CompareModels", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCompareModels__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompareModels__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(validateModelEClass, ValidateModel.class, "ValidateModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValidateModel__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValidateModel__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(saveModelEClass, SaveModel.class, "SaveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaveModel_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, SaveModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSaveModel__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSaveModel__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_ParameterOrder(), this.getPortSpecification(), null, "parameterOrder", null, 0,
				-1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_ConfigProperties(), ecorePackage.getEString(), "configProperties", null, 0, -1,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getTransformation__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransformation__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		op = initEOperation(getTransformation__NotifyChanged__Object(), ecorePackage.getEBoolean(), "notifyChanged", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "notification", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executeUPPAALEClass, ExecuteUPPAAL.class, "ExecuteUPPAAL", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExecuteUPPAAL__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecuteUPPAAL__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(primitiveStringEClass, PrimitiveString.class, "PrimitiveString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveString_Value(), ecorePackage.getEString(), "value", "", 1, 1, PrimitiveString.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrimitiveString__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitiveString__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(assertBoolEClass, AssertBool.class, "AssertBool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertBool_Assertion(), ecorePackage.getEBoolean(), "assertion", "true", 0, 1,
				AssertBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getAssertBool__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssertBool__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(assertDiagnosticTraceEClass, AssertDiagnosticTrace.class, "AssertDiagnosticTrace", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAssertDiagnosticTrace__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssertDiagnosticTrace__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(assertResultEClass, AssertResult.class, "AssertResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAssertResult__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssertResult__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		initEClass(checkMTCTLEClass, CheckMTCTL.class, "CheckMTCTL", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckMTCTL_Properties(), ecorePackage.getEString(), "properties", null, 0, 1,
				CheckMTCTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getCheckMTCTL__Initialize(), null, "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCheckMTCTL__Execute__Map_Map(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getExecutionException());
		addEException(op, this.getDefaultException());

		// Initialize enums and add enum literals
		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.IN);
		addEEnumLiteral(portTypeEEnum, PortType.OUT);
		addEEnumLiteral(portTypeEEnum, PortType.INOUT);

		// Initialize data types
		initEDataType(executionExceptionEDataType, ExecutionException.class, "ExecutionException", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(defaultExceptionEDataType, Exception.class, "DefaultException", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/GenModel</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(getNodeSpecification__Initialize(), source, new String[] { "body", "" });
		addAnnotation(getNodeSpecification__NotifyChanged__Object(), source, new String[] { "body", "return false;" });
		addAnnotation(getNodeSpecification__AddPortSpecification__PortType_String_boolean(), source,
				new String[] { "body", "return this.addPortSpecification(type, name, optional, null);" });
		addAnnotation(getNodeSpecification__AddPortSpecification__PortType_String_boolean_Class(), source,
				new String[] { "body",
						"PortSpecification spec = SpecificationFactory.eINSTANCE.createPortSpecification();\r\nspec.setType(type);\r\nspec.setName(name);\r\nspec.setOptional(optional);\r\nspec.setDataType(dataType);\r\nthis.getPortSpecifications().add(spec);\r\nreturn spec;" });
		addAnnotation(getDefault__Initialize(), source, new String[] { "body", "this.setLabel(\"Default\");" });
		addAnnotation(getDefault__Execute__Map_Map(), source,
				new String[] { "body", "throw new ExecutionException(\"Default node should not be executed.\");" });
		addAnnotation(getLoadModel__Initialize(), source, new String[] { "body",
				"this.setLabel(\"Load Model\"); \r\nthis.addPortSpecification(PortType.OUT, \"model\", true);" });
		addAnnotation(getLoadModel__Execute__Map_Map(), source, new String[] { "body",
				"// Cancel if no uri was set.\nif (this.getUri() == null || \"\".equals(this.getUri())) {\n\tthrow new ExecutionException(\"No model URI set!\");\n}\n\n// Setup the URI.\nURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\n\n// Load the model.\nResourceSet resSet = new ResourceSetImpl();\nResource resource = resSet.getResource(realURI.trimFragment(), true);\n\nEObject result = null;\n\nif (realURI.hasFragment()) {\n\tresult = resource.getEObject(realURI.fragment());\n} else {\n\tresult = resource.getContents().get(0);\n}\n\n// Put the loaded model onto the output.\noutputs.put(\"model\", result);\nSystem.out.println(outputs);\nreturn;" });
		addAnnotation(getCompareModels__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Compare Models\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"model_1\", false, org.eclipse.emf.common.notify.Notifier.class);\r\n\t\tthis.addPortSpecification(PortType.IN, \"model_2\", false, org.eclipse.emf.common.notify.Notifier.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"bool\", false);" });
		addAnnotation(getCompareModels__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// Local variable to carry the result.\r\n\t\tboolean result = false;\r\n\r\n\t\t// Check if the given models are actually the same model.\r\n\t\tif (inputs.get(\"model_1\") == inputs.get(\"model_2\")) {\r\n\t\t\tresult = true;\r\n\t\t} else {\r\n\r\n\t\t\t// Setup the matching engine.\r\n\t\t\tIMatchEngine.Factory factory = new MatchEngineFactoryImpl(\r\n\t\t\t\t\tUseIdentifiers.NEVER);\r\n\t\t\tIMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();\r\n\t\t\tmatchEngineRegistry.add(factory);\r\n\t\t\tIComparisonScope scope = new DefaultComparisonScope(\r\n\t\t\t\t\t(Notifier) inputs.get(\"model_1\"), (Notifier) inputs.get(\"model_2\"), null);\r\n\r\n\t\t\t// Avoid order checking for unordered containments.\r\n\t\t\tIDiffProcessor diffProcessor = new DiffBuilder();\r\n\t\t\tIDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {\r\n\t\t\t\t@Override\r\n\t\t\t\tprotected FeatureFilter createFeatureFilter() {\r\n\t\t\t\t\treturn new FeatureFilter() {\r\n\t\t\t\t\t\t@Override\r\n\t\t\t\t\t\tpublic boolean checkForOrderingChanges(\r\n\t\t\t\t\t\t\t\tEStructuralFeature feature) {\r\n\t\t\t\t\t\t\treturn feature.isMany() && feature.isOrdered();\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t};\r\n\t\t\t\t}\r\n\t\t\t};\r\n\r\n\t\t\tComparison comparison = EMFCompare.builder()\r\n\t\t\t\t\t.setMatchEngineFactoryRegistry(matchEngineRegistry)\r\n\t\t\t\t\t.setDiffEngine(diffEngine).build().compare(scope);\r\n\r\n\t\t\tOutputStream stream = new OutputStream() {\r\n\r\n\t\t\t\tprivate StringBuilder builder = new StringBuilder();\r\n\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic void write(int b) throws IOException {\r\n\t\t\t\t\tbuilder.append((char) b);\r\n\t\t\t\t}\r\n\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic String toString() {\r\n\t\t\t\t\treturn builder.toString();\r\n\t\t\t\t}\r\n\r\n\t\t\t};\r\n\r\n\t\t\tEMFComparePrettyPrinter.printDifferences(comparison,\r\n\t\t\t\t\tnew PrintStream(stream));\r\n\r\n\t\t\tif (comparison.getDifferences().isEmpty()) {\r\n\t\t\t\tresult = true;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Wrap the result up and put it on the output port.\r\n\t\toutputs.put(\"bool\", new Boolean(result));\r\n\r\n\t\treturn;" });
		addAnnotation(getValidateModel__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Validate Model\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"model\", false,\r\n\t\t\t\torg.eclipse.emf.ecore.EObject.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"bool\", false,\r\n\t\t\t\tjava.lang.Boolean.class);" });
		addAnnotation(getValidateModel__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// TODO Maybe also get a BatchValidator, see ValidateAction.\r\n\t\t// Validate using a Diagnostic instance.\r\n\t\tDiagnostic diagnostic = Diagnostician.INSTANCE\r\n\t\t\t\t.validate((EObject) inputs.get(\"model\"));\r\n\r\n\t\tboolean result = true;\r\n\t\tif (diagnostic.getSeverity() == Diagnostic.ERROR) {\r\n\t\t\tresult = false;\r\n\t\t}\r\n\r\n\t\t// Wrap the result up and put it on the output port.\r\n\t\toutputs.put(\"bool\", new Boolean(result));\r\n\r\n\t\treturn;" });
		addAnnotation(getSaveModel__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Save Model\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"model\", false, org.eclipse.emf.ecore.EObject.class);" });
		addAnnotation(getSaveModel__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// Create the URI.\r\n\t\tURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\r\n\r\n\t\t// Only write to resource links.\r\n\t\tif (!realURI.isPlatformResource()) {\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\t// Create a XMIResourceFactory for the extension.\r\n\t\tif (realURI.fileExtension() != null) {\r\n\t\t\tResource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;\r\n\t\t\tMap<String, Object> m = reg.getExtensionToFactoryMap();\r\n\t\t\tm.put(realURI.fileExtension(), new XMIResourceFactoryImpl());\r\n\t\t}\r\n\r\n\t\t// Create a resource set.\r\n\t\tResourceSet resSet = new ResourceSetImpl();\r\n\t\tResource resource = resSet.createResource(realURI.trimFragment());\r\n\t\tresource.getContents().add((EObject) inputs.get(\"model\"));\r\n\r\n\t\t// Save the model.\r\n\t\tresource.save(Collections.EMPTY_MAP);\r\n\r\n\t\treturn;" });
		addAnnotation(getTransformation__Initialize(), source,
				new String[] { "body", "this.setLabel(\"Transformation\");" });
		addAnnotation(getTransformation__Execute__Map_Map(), source, new String[] { "body",
				"\t\tURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\r\n\t\tTransformationExecutor executor = new TransformationExecutor(realURI);\r\n\r\n\t\tExecutionContextImpl context;\r\n\t\tIStatus status;\r\n\r\n\t\tstatus = BasicDiagnostic.toIStatus(executor.loadTransformation());\r\n\r\n\t\tif (!status.isOK()) {\r\n\t\t\tthrow new ExecutionException(status.getMessage());\r\n\t\t}\r\n\r\n\t\tcontext = new ExecutionContextImpl();\r\n\r\n\t\t// Set extents, i.e. the model parameters.\r\n\t\tBasicModelExtent[] extents = new BasicModelExtent[this\r\n\t\t\t\t.getParameterOrder().size()];\r\n\t\tint i = 0;\r\n\t\tfor (PortSpecification port : this.getParameterOrder()) {\r\n\t\t\tBasicModelExtent extent = new BasicModelExtent();\r\n\r\n\t\t\tif (port.getType() == PortType.IN) {\r\n\t\t\t\textent.add((EObject) inputs.get(port.getName()));\r\n\t\t\t} else if (port.getType() == PortType.INOUT) {\r\n\t\t\t\t// Copy the EObject to avoid side effects.\r\n\t\t\t\tCopier copier = new Copier();\r\n\t\t\t\tEObject result = copier.copy((EObject) inputs.get(port.getName()));\r\n\t\t\t\tcopier.copyReferences();\r\n\t\t\t\textent.add(result);\r\n\t\t\t}\r\n\r\n\t\t\textents[i] = extent;\r\n\r\n\t\t\ti++;\r\n\t\t}\r\n\r\n\t\t// Set configuration properties. They arrive in an EObject wrapper\r\n\t\t// as a string, they are parsed by QVTo.\r\n\t\tfor (String property : this.getConfigProperties()) {\r\n\t\t\tif (inputs.containsKey(property)) {\r\n\t\t\t\tcontext.setConfigProperty(property,\r\n\t\t\t\t\t\t(String) inputs.get(property));\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Execute the transformation.\r\n\t\tOutputStreamWriter outStream = new OutputStreamWriter(System.out);\r\n\t\tLog log = new WriterLog(outStream);\r\n\t\tcontext.setLog(log);\r\n\t\tExecutionDiagnostic diagnostic = executor.execute(context, extents);\r\n\r\n\t\t// Check if everything went fine.\r\n\t\tif (diagnostic.getSeverity() == Diagnostic.ERROR) {\r\n\t\t\tthrow new ExecutionException(\"Transformation failed: \"\r\n\t\t\t\t\t+ diagnostic.getMessage());\r\n\t\t}\r\n\r\n\t\t// Get the output.\r\n\t\ti = 0;\r\n\t\tfor (PortSpecification port : this.getParameterOrder()) {\r\n\t\t\t// System.out.println(i + \" \" + port.getName() + \" (\"\r\n\t\t\t// + port.getType() + \"): \"\r\n\t\t\t// + extents[i].getContents().get(0));\r\n\t\t\tif (port.getType() == PortType.OUT\r\n\t\t\t\t\t|| port.getType() == PortType.INOUT) {\r\n\t\t\t\toutputs.put(port.getName(), extents[i].getContents().get(0));\r\n\t\t\t}\r\n\r\n\t\t\ti++;\r\n\t\t}\r\n\r\n\t\treturn;" });
		addAnnotation(getTransformation__NotifyChanged__Object(), source, new String[] { "body",
				"\t\ttry {\r\n\t\t\tNotification n = (Notification) notification;\r\n\t\t\tEAttribute attr = (EAttribute) n.getFeature();\r\n\r\n\t\t\tif (n.getEventType() == Notification.SET && attr.getName() == \"uri\") {\r\n\t\t\t\tthis.getPortSpecifications().clear();\r\n\t\t\t\tthis.getParameterOrder().clear();\r\n\t\t\t\tthis.getConfigProperties().clear();\r\n\r\n\t\t\t\t// Load transformation Ecore in order to get the port count\r\n\t\t\t\t// required. (http://www.eclipse.org/forums/index.php/t/478345/)\r\n\t\t\t\tURI realURI = URI.createURI(this.uri);\r\n\t\t\t\tResourceSet resSet = new ResourceSetImpl();\r\n\t\t\t\tResource resource = resSet.getResource(realURI.trimFragment(),\r\n\t\t\t\t\t\ttrue);\r\n\t\t\t\tEObject result = null;\r\n\r\n\t\t\t\tif (realURI.hasFragment()) {\r\n\t\t\t\t\tresult = resource.getEObject(realURI.fragment());\r\n\t\t\t\t}\r\n\r\n\t\t\t\tOperationalTransformation trans = (OperationalTransformation) (result != null ? result\r\n\t\t\t\t\t\t: resource.getContents().get(0));\r\n\r\n\t\t\t\tEList<ModelParameter> params = trans.getModelParameter();\r\n\r\n\t\t\t\tfor (ModelParameter param : params) {\r\n\t\t\t\t\tPortType type = PortType.IN;\r\n\t\t\t\t\tif (param.getKind() == DirectionKind.OUT) {\r\n\t\t\t\t\t\ttype = PortType.OUT;\r\n\t\t\t\t\t} else if (param.getKind() == DirectionKind.INOUT) {\r\n\t\t\t\t\t\ttype = PortType.INOUT;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tPortSpecification spec = this.addPortSpecification(type,\r\n\t\t\t\t\t\t\tparam.getName(), false, org.eclipse.emf.ecore.EObject.class);\r\n\t\t\t\t\tthis.getParameterOrder().add(spec);\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// Add configuration properties.\r\n\t\t\t\tthis.getConfigProperties().clear();\r\n\t\t\t\tEList<EStructuralFeature> props = trans.getConfigProperty();\r\n\t\t\t\tfor (EStructuralFeature feature : props) {\r\n\t\t\t\t\tthis.addPortSpecification(PortType.IN, feature.getName(),\r\n\t\t\t\t\t\t\ttrue, java.lang.String.class);\r\n\t\t\t\t\tthis.getConfigProperties().add(feature.getName());\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// Return true to signal that the ports changed and need to\r\n\t\t\t\t// be rebuilt.\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t} catch (Exception e) {\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t\treturn false;" });
		addAnnotation(getExecuteUPPAAL__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Check UPPAAL\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"nta\", false,\r\n\t\t\t\torg.muml.uppaal.NTA.class);\r\n\t\tthis.addPortSpecification(PortType.IN, \"property_repository\", false,\r\n\t\t\t\torg.muml.uppaal.requirements.PropertyRepository.class);\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"options\",\r\n\t\t\t\ttrue,\r\n\t\t\t\torg.muml.uppaal.options.Options.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"trace_repository\", false);" });
		addAnnotation(getExecuteUPPAAL__Execute__Map_Map(), source, new String[] { "body",
				"// Check if we have custom options or use the default ones.\nCoordinationProtocolOptions options;\nif (inputs.containsKey(\"options\") && inputs.get(\"options\") != null) {\n\toptions = (CoordinationProtocolOptions) inputs.get(\"options\");\n} else {\n\toptions = OptionsFactory.eINSTANCE\n\t\t\t.createCoordinationProtocolOptions();\n\toptions.setTraceOptions(TraceOptions.NONE);\n}\n\n// Start the job that serialized and then verifies the NTA.\norg.muml.uppaal.job.VerifyTAOperation operation = new org.muml.uppaal.job.VerifyTAOperation((NTA) inputs.get(\"nta\"),\n\t\t(PropertyRepository) inputs.get(\"property_repository\"), options);\noperation.run(new NullProgressMonitor());\n\n// Put the traces on the output port and return.\noutputs.put(\"trace_repository\", operation.getTraceRepository());" });
		addAnnotation(getPrimitiveString__Initialize(), source, new String[] { "body",
				"this.setLabel(\"Primitive String\");\r\nthis.addPortSpecification(PortType.OUT, \"string\", false);" });
		addAnnotation(getPrimitiveString__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// Put the wrapped string onto the output.\r\n\t\toutputs.put(\"string\", this.getValue());\r\n\r\n\t\treturn;" });
		addAnnotation(getAssertBool__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Assert Bool\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"bool\", false,\r\n\t\t\t\tjava.lang.Boolean.class);" });
		addAnnotation(getAssertBool__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// Get the boolean value.\r\n\t\tboolean bool = ((Boolean) inputs.get(\"bool\")).booleanValue();\r\n\r\n\t\t// Throw an exception if it does not match the assertion.\r\n\t\tif (bool != this.assertion) {\r\n\t\t\tthrow new ExecutionException(\"Expected \"\r\n\t\t\t\t\t+ Boolean.toString(this.assertion) + \", but got \"\r\n\t\t\t\t\t+ Boolean.toString(bool));\r\n\t\t}" });
		addAnnotation(getAssertDiagnosticTrace__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Assert DiagnosticTrace\");\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"trace_repository\",\r\n\t\t\t\tfalse,\r\n\t\t\t\torg.muml.uppaal.trace.diagnostictrace.TraceRepository.class);" });
		addAnnotation(getAssertDiagnosticTrace__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// Get the repository.\r\n\t\tTraceRepository repo = (TraceRepository) inputs.get(\"trace_repository\");\r\n\r\n\t\t// Make sure we know if we want all the properties to verify or not.\r\n\t\tResult expected;\r\n\t\tString alpha, beta;\r\n\t\tif (this.assertion) {\r\n\t\t\texpected = Result.SUCCESS;\r\n\t\t\talpha = \"SUCCESS\";\r\n\t\t\tbeta = \"FAILURE\";\r\n\t\t} else {\r\n\t\t\texpected = Result.FAILURE;\r\n\t\t\talpha = \"FAILURE\";\r\n\t\t\tbeta = \"SUCCESS\";\r\n\t\t}\r\n\r\n\t\t// Check each property.\r\n\t\tString error = \"\";\r\n\t\tfor (Trace item : repo.getTraces()) {\r\n\t\t\tif (!item.getResult().equals(expected)) {\r\n\t\t\t\terror += \"[Property \" + item.getProperty() + \" at line \"\r\n\t\t\t\t\t\t+ item.getLine() + \"] \";\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Throw an exception if errors occurred.\r\n\t\tif (!error.equals(\"\")) {\r\n\t\t\tthrow new ExecutionException(\"Expected \" + alpha + \", but got \"\r\n\t\t\t\t\t+ beta + \" on \" + error);\r\n\t\t}" });
		addAnnotation(getAssertResult__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Assert Result\");\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"property_result_repository\",\r\n\t\t\t\tfalse,\r\n\t\t\t\torg.muml.uppaal.adapter.results.PropertyResultRepository.class);" });
		addAnnotation(getAssertResult__Execute__Map_Map(), source, new String[] { "body",
				"\t\t// Get the repository of the results.\r\n\t\tPropertyResultRepository repo = (PropertyResultRepository) inputs\r\n\t\t\t\t.get(\"property_result_repository\");\r\n\r\n\t\t// Make sure we know if we want all the properties to verify or not.\r\n\t\tString alpha, beta;\r\n\t\tif (this.assertion) {\r\n\t\t\talpha = \"FULFILLED\";\r\n\t\t\tbeta = \"NOT FULFILLED\";\r\n\t\t} else {\r\n\t\t\talpha = \"NOT FULFILLED\";\r\n\t\t\tbeta = \"FULFILLED\";\r\n\t\t}\r\n\r\n\t\t// Check each property.\r\n\t\tString error = \"\";\r\n\t\tfor (PropertyResult result : repo.getResults()) {\r\n\t\t\tif (result.isFulfilled() != this.assertion) {\r\n\t\t\t\terror += \"[Comment \" + result.getProperty().getComment() + \"] \";\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Throw an exception if errors occurred.\r\n\t\tif (!error.equals(\"\")) {\r\n\t\t\tthrow new ExecutionException(\"Expected \" + alpha + \", but got \"\r\n\t\t\t\t\t+ beta + \" on \" + error);\r\n\t\t}" });
		addAnnotation(getCheckMTCTL__Initialize(), source, new String[] { "body",
				"\t\tthis.setLabel(\"Check MTCTL\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"muml\", false,\r\n\t\t\t\torg.muml.core.modelinstance.RootNode.class);\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"options\",\r\n\t\t\t\ttrue,\r\n\t\t\t\torg.muml.uppaal.options.Options.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"results\", false);" });
		addAnnotation(getCheckMTCTL__Execute__Map_Map(), source, new String[] { "body",
				"// Do we even have properties to verify?\nif (\"\".equals(this.getProperties())) {\n\tthrow new ExecutionException(\"No properties to verify.\");\n}\n\n// Copy the MUML model so we do not destroy it.\n// Copier copier = new Copier();\n\norg.muml.core.modelinstance.RootNode muml = null;\norg.muml.pim.protocol.CoordinationProtocol protocol = null;\n\norg.muml.core.Extension extension = null;\n\norg.muml.core.modelinstance.RootNode rootNode = null;\n// EObject rootNode = null;\n\nif (inputs.get(\"muml\") instanceof org.muml.core.modelinstance.RootNode) {\n\trootNode = (org.muml.core.modelinstance.RootNode) inputs.get(\"muml\");\n} else if (inputs.get(\"muml\") instanceof org.muml.pim.protocol.CoordinationProtocol) {\n\n\tprotocol = (org.muml.pim.protocol.CoordinationProtocol) inputs.get(\"muml\");\n\n\t// rootNode = (RootNode)((CoordinationProtocol)\n\t// inputs.get(\"muml\")).eContainer().eContainer();\n\n\tif ((org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(protocol) instanceof org.muml.core.modelinstance.RootNode)) {\n\t\trootNode = (org.muml.core.modelinstance.RootNode) org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(protocol);\n\t} else {\n\t\tthrow new ExecutionException(\"The coordination protocol doesn\'t have correct RootContainer\");\n\t}\n\n\textension = protocol.getExtension(\n\t\t\torg.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE\n\t\t\t\t\t.getElementToVerifyExtension());\n\tif (extension == null) {\n\t\textension = org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionFactory.eINSTANCE\n\t\t\t\t.createElementToVerifyExtension();\n\t\tprotocol.getExtensions().add(extension);\n\t}\n} else {\n\tthrow new ExecutionException(\"Coordination protocol is not specified.\");\n}\n\n// Copy the MUML model so we do not destroy it.\norg.eclipse.emf.ecore.util.EcoreUtil.Copier copier = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();\nmuml = (org.muml.core.modelinstance.RootNode) copier.copy(rootNode);\ncopier.copyReferences();\n\n// Get the CoordinationProtocol category.\norg.muml.core.modelinstance.ModelElementCategory category = null;\nfor (org.muml.core.modelinstance.ModelElementCategory cur : muml.getCategories()) {\n\tif (cur.getKey().equals(\"org.muml.pim.protocol.category\")) {\n\t\tcategory = cur;\n\t\tbreak;\n\t}\n}\n\nif (category == null) {\n\tthrow new ExecutionException(\"Model does not contain a CoordinationProtocol category.\");\n}\n\n// Look for a CoordinationProtocol that asks for a verification,\n// otherwise just choose any.\n\nfor (org.muml.core.ExtendableElement cur : category.getModelElements()) {\n\tprotocol = (org.muml.pim.protocol.CoordinationProtocol) cur;\n\n\tif (protocol.getExtension(\n\t\t\torg.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE\n\t\t\t\t\t.getElementToVerifyExtension()) != null) {\n\t\tbreak;\n\t}\n\t// In case there is no protocol with extension,\n\t// the last coordination protocol is used\n}\nif (protocol == null) {\n\tthrow new ExecutionException(\"Model does not contain a CoordinationProtocol.\");\n}\n\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\nresourceSet.getLoadOptions().put(org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);\norg.muml.uppaal.adapter.mtctl.xtext.scoping.MtctlScopeProvider.getInstance().setScopeForEObject(protocol);\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(\"dummy:/dummy.mtctl\"));\nresource.load(new java.io.ByteArrayInputStream(properties.getBytes(java.nio.charset.StandardCharsets.UTF_8)),\n\t\tresourceSet.getLoadOptions());\n\n// Parse the PropertyRepository we have in the context of the protocol.\norg.muml.uppaal.requirements.PropertyRepository propertyRepository = (org.muml.uppaal.requirements.PropertyRepository) resource.getContents().get(0);\n\n// Replace all existing PropertyRepositories by the one we just created.\nprotocol.getVerificationConstraintRepositories().clear();\nprotocol.getVerificationConstraintRepositories().add((org.muml.pim.constraint.VerificationConstraintRepository) propertyRepository);\n\n// Verify for results (= apply the transformation by the MTCTL people).\norg.eclipse.emf.common.util.URI realURI = org.eclipse.emf.common.util.URI.createURI(\n\t\t\"platform:/plugin/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Results.qvto\");\norg.eclipse.m2m.qvt.oml.TransformationExecutor executor = new org.eclipse.m2m.qvt.oml.TransformationExecutor(realURI);\norg.eclipse.m2m.qvt.oml.ExecutionContextImpl context;\norg.eclipse.core.runtime.IStatus status;\nstatus = org.eclipse.emf.common.util.BasicDiagnostic.toIStatus(executor.loadTransformation());\nif (!status.isOK()) {\n\tthrow new ExecutionException(status.getMessage());\n}\ncontext = new org.eclipse.m2m.qvt.oml.ExecutionContextImpl();\n\n// Check if we have custom options or use the default ones.\norg.muml.uppaal.options.CoordinationProtocolOptions options;\nif (inputs.containsKey(\"options\") && inputs.get(\"options\") != null) {\n\toptions = (org.muml.uppaal.options.CoordinationProtocolOptions) inputs.get(\"options\");\n} else {\n\toptions = org.muml.uppaal.options.OptionsFactory.eINSTANCE.createCoordinationProtocolOptions();\n\toptions.setTraceOptions(org.muml.uppaal.options.TraceOptions.NONE);\n}\n\n// Create the extents.\norg.eclipse.m2m.qvt.oml.BasicModelExtent mumlExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();\nmumlExtent.add(muml);\norg.eclipse.m2m.qvt.oml.BasicModelExtent optionsExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();\noptionsExtent.add(options);\norg.eclipse.m2m.qvt.oml.BasicModelExtent resultExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();\n\n// Execute the transformation.\njava.io.OutputStreamWriter outStream = new java.io.OutputStreamWriter(System.out);\norg.eclipse.m2m.qvt.oml.util.Log log = new org.eclipse.m2m.qvt.oml.util.WriterLog(outStream);\ncontext.setLog(log);\norg.eclipse.m2m.qvt.oml.ExecutionDiagnostic dia = executor.execute(context, mumlExtent, optionsExtent,\n\t\tresultExtent);\n\nif (extension != null) {\n\textension = null; // Is this enoguh or I should remove the extension\n\t\t\t\t\t\t// from the list of protocol\'s extensions?\n}\n\n// Check if we succeeded.\nif (dia.getSeverity() != org.eclipse.m2m.qvt.oml.ExecutionDiagnostic.OK) {\n\tthrow new ExecutionException(dia.getMessage());\n}\n\n// Get the output.\noutputs.put(\"results\", resultExtent.getContents().get(0));\n" });
	}

} // SpecificationPackageImpl

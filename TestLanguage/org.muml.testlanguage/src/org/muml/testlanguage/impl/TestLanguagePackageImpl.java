/**
 */
package org.muml.testlanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.testlanguage.Input;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.Output;
import org.muml.testlanguage.Port;
import org.muml.testlanguage.TestCase;
import org.muml.testlanguage.TestLanguageFactory;
import org.muml.testlanguage.TestLanguagePackage;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.util.TestLanguageValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class TestLanguagePackageImpl extends EPackageImpl implements TestLanguagePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass testCaseEClass = null;

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
	 * @see org.muml.testlanguage.TestLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestLanguagePackageImpl() {
		super(eNS_URI, TestLanguageFactory.eINSTANCE);
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
	 * This method is used to initialize {@link TestLanguagePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestLanguagePackage init() {
		if (isInited)
			return (TestLanguagePackage) EPackage.Registry.INSTANCE.getEPackage(TestLanguagePackage.eNS_URI);

		// Obtain or create and register package
		TestLanguagePackageImpl theTestLanguagePackage = (TestLanguagePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TestLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new TestLanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpecificationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTestLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theTestLanguagePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTestLanguagePackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return TestLanguageValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTestLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestLanguagePackage.eNS_URI, theTestLanguagePackage);
		return theTestLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNode_Inputs() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNode_Outputs() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNode_Label() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNode_Specification() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNode_SpecificationClassName() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNode_InputCache() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNode_OutputCache() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNode__SetupFromSpecification() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNode__Execute() {
		return nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getNode__CreateSpecification() {
		return nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInput_Source() {
		return (EReference) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInput_Node() {
		return (EReference) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getInput_Optional() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getInput_DataType() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getInput__GetData() {
		return inputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOutput_Targets() {
		return (EReference) outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOutput_Node() {
		return (EReference) outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getOutput__GetData() {
		return outputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPort_InOut() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTestCase_Nodes() {
		return (EReference) testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestLanguageFactory getTestLanguageFactory() {
		return (TestLanguageFactory) getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__INPUTS);
		createEReference(nodeEClass, NODE__OUTPUTS);
		createEAttribute(nodeEClass, NODE__LABEL);
		createEReference(nodeEClass, NODE__SPECIFICATION);
		createEAttribute(nodeEClass, NODE__SPECIFICATION_CLASS_NAME);
		createEAttribute(nodeEClass, NODE__INPUT_CACHE);
		createEAttribute(nodeEClass, NODE__OUTPUT_CACHE);
		createEOperation(nodeEClass, NODE___SETUP_FROM_SPECIFICATION);
		createEOperation(nodeEClass, NODE___EXECUTE);
		createEOperation(nodeEClass, NODE___CREATE_SPECIFICATION);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__SOURCE);
		createEReference(inputEClass, INPUT__NODE);
		createEAttribute(inputEClass, INPUT__OPTIONAL);
		createEAttribute(inputEClass, INPUT__DATA_TYPE);
		createEOperation(inputEClass, INPUT___GET_DATA);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__TARGETS);
		createEReference(outputEClass, OUTPUT__NODE);
		createEOperation(outputEClass, OUTPUT___GET_DATA);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__IN_OUT);

		testCaseEClass = createEClass(TEST_CASE);
		createEReference(testCaseEClass, TEST_CASE__NODES);
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

		// Obtain other dependent packages
		SpecificationPackage theSpecificationPackage = (SpecificationPackage) EPackage.Registry.INSTANCE
				.getEPackage(SpecificationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputEClass.getESuperTypes().add(this.getPort());
		outputEClass.getESuperTypes().add(this.getPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Inputs(), this.getInput(), this.getInput_Node(), "inputs", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNode_Inputs().getEKeys().add(this.getPort_Name());
		initEReference(getNode_Outputs(), this.getOutput(), this.getOutput_Node(), "outputs", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNode_Outputs().getEKeys().add(this.getPort_Name());
		initEAttribute(getNode_Label(), ecorePackage.getEString(), "label", "node", 1, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Specification(), theSpecificationPackage.getNodeSpecification(), null, "specification",
				null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_SpecificationClassName(), ecorePackage.getEString(), "specificationClassName", "Default",
				1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNode_InputCache(), g1, "inputCache", null, 0, 1, Node.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNode_OutputCache(), g1, "outputCache", null, 0, 1, Node.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode__SetupFromSpecification(), null, "setupFromSpecification", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getNode__Execute(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theSpecificationPackage.getExecutionException());

		initEOperation(getNode__CreateSpecification(), null, "createSpecification", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Source(), this.getOutput(), this.getOutput_Targets(), "source", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Node(), this.getNode(), this.getNode_Inputs(), "node", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Optional(), ecorePackage.getEBoolean(), "optional", "false", 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getInput_DataType(), g1, "dataType", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInput__GetData(), ecorePackage.getEJavaObject(), "getData", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Targets(), this.getInput(), this.getInput_Source(), "targets", null, 0, -1,
				Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Node(), this.getNode(), this.getNode_Outputs(), "node", null, 1, 1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOutput__GetData(), ecorePackage.getEJavaObject(), "getData", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", "port", 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_InOut(), ecorePackage.getEBoolean(), "inOut", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCase_Nodes(), this.getNode(), null, "nodes", null, 0, -1, TestCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL" });
		addAnnotation(nodeEClass, source, new String[] { "constraints", "noCyclesAllowed" });
		addAnnotation(inputEClass, source, new String[] { "constraints", "mandatoryInputMustBeConnected",
				"documentation", "This class represents a specific type of port that is used as an input." });
		addAnnotation(outputEClass, source, new String[] { "documentation",
				"This class represents a specific type of port that is used as an output." });
		addAnnotation(portEClass, source, new String[] { "documentation", "Abstract class for ports." });
		addAnnotation(testCaseEClass, source,
				new String[] { "documentation", "Container class that represents a test case." });
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(nodeEClass, source, new String[] { "noCyclesAllowed",
				"-- Nodes may not be part of a cycle or be dependent on a node that is part of a cycle.\r\nself.outputs.targets.node->asSet()->closure(outputs.targets.node)->excludes(self)" });
		addAnnotation(inputEClass, source, new String[] { "mandatoryInputMustBeConnected",
				"-- Inputs that are mandatory (= not optional) must have a connection.\r\nself.source.oclIsUndefined() implies self.optional" });
		addAnnotation(outputEClass, source, new String[] { "ifInputTypeIsInOutThenItIsTheOnlyOne", null });
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
		addAnnotation(getNode__SetupFromSpecification(), source, new String[] { "body",
				"\t\t// Set the label according to the specification.\r\n\t\tthis.setLabel(this.specification.getLabel());\r\n\r\n\t\t// Remember old in- and outputs for later reuse.\r\n\t\tList<Input> oldInputs = new LinkedList<Input>();\r\n\t\tfor (Input input : this.getInputs()) {\r\n\t\t\toldInputs.add(input);\r\n\t\t}\r\n\t\tList<Output> oldOutputs = new LinkedList<Output>();\r\n\t\tfor (Output output : this.getOutputs()) {\r\n\t\t\toldOutputs.add(output);\r\n\t\t}\r\n\r\n\t\t// Clear old ports.\r\n\t\tthis.getInputs().clear();\r\n\t\tthis.getOutputs().clear();\r\n\r\n\t\t// Setup new ports and reuse old ones if possible.\r\n\t\tfor (EObject specObj : this.specification.getPortSpecifications()) {\r\n\t\t\tPortSpecification spec = (PortSpecification) specObj;\r\n\r\n\t\t\tboolean specificationIsInOut = spec.getType() == PortType.INOUT;\r\n\t\t\t\r\n\t\t\tif (spec.getType() == PortType.IN || spec.getType() == PortType.INOUT) {\r\n\r\n\t\t\t\t// Can we reuse an old input port?\r\n\t\t\t\tboolean reuse = false;\r\n\t\t\t\tIterator<Input> iter = oldInputs.iterator();\r\n\t\t\t\twhile (iter.hasNext()) {\r\n\t\t\t\t\tInput input = iter.next();\r\n\t\t\t\t\tif (input.getName().equals(spec.getName()) && input.isOptional() == spec.isOptional()\r\n\t\t\t\t\t\t\t&& input.getDataType() == spec.getDataType() && input.isInOut() == specificationIsInOut) {\r\n\t\t\t\t\t\tthis.getInputs().add(input);\r\n\t\t\t\t\t\titer.remove();\r\n\t\t\t\t\t\treuse = true;\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// If not, create a new input port.\r\n\t\t\t\tif (!reuse) {\r\n\t\t\t\t\tInput input = TestLanguageFactory.eINSTANCE.createInput();\r\n\t\t\t\t\tinput.setName(spec.getName());\r\n\t\t\t\t\tinput.setOptional(spec.isOptional());\r\n\t\t\t\t\tinput.setDataType(spec.getDataType());\r\n\t\t\t\t\tinput.setInOut(specificationIsInOut);\r\n\t\t\t\t\tthis.getInputs().add(input);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t\tif (spec.getType() == PortType.OUT || spec.getType() == PortType.INOUT) {\r\n\r\n\t\t\t\t// Can we reuse an old output port?\r\n\t\t\t\tboolean reuse = false;\r\n\t\t\t\tIterator<Output> iter = oldOutputs.iterator();\r\n\t\t\t\twhile (iter.hasNext()) {\r\n\t\t\t\t\tOutput output = iter.next();\r\n\t\t\t\t\tif (output.getName().equals(spec.getName()) && output.isInOut() == specificationIsInOut) {\r\n\t\t\t\t\t\tthis.getOutputs().add(output);\r\n\t\t\t\t\t\titer.remove();\r\n\t\t\t\t\t\treuse = true;\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// If not, create a new output port.\r\n\t\t\t\tif (!reuse) {\r\n\t\t\t\t\tOutput output = TestLanguageFactory.eINSTANCE.createOutput();\r\n\t\t\t\t\toutput.setName(spec.getName());\r\n\t\t\t\t\toutput.setInOut(specificationIsInOut);\r\n\t\t\t\t\tthis.getOutputs().add(output);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t}\r\n\r\n\t\t// Disconnect old ports that are not used anymore.\r\n\t\tfor (Input input : oldInputs) {\r\n\t\t\tinput.setSource(null);\r\n\t\t}\r\n\t\tfor (Output output : oldOutputs) {\r\n\t\t\tfor (Input input : output.getTargets()) {\r\n\t\t\t\tinput.setSource(null);\r\n\t\t\t}\r\n\t\t}",
				"documentation",
				"Performs a setup routine for the specific node, i.e. it sets the label and ports according to the NodeSpecification." });
		addAnnotation(getNode__Execute(), source, new String[] { "body",
				"\t\t// FIXME Hack to disable notifications so that the transactional editing\r\n\t\t// domain won\'t complain about me modifying the domain element.\r\n\t\tthis.eSetDeliver(false);\r\n\r\n\t\t// Initialize caches if needed.\r\n\t\tif (this.getInputCache() == null) {\r\n\t\t\tthis.setInputCache(new HashMap<String, Object>());\r\n\t\t}\r\n\t\tif (this.getOutputCache() == null) {\r\n\t\t\tthis.setOutputCache(new HashMap<String, Object>());\r\n\t\t}\r\n\r\n\t\t// Refresh the input cache.\r\n\t\tfor (Input input : this.getInputs()) {\r\n\t\t\tif (input.getSource() == null) {\r\n\t\t\t\tthis.getInputCache().remove(input.getName());\r\n\t\t\t} else {\r\n\t\t\t\tthis.getInputCache().put(input.getName(), input.getData());\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Clear the output cache.\r\n\t\tthis.getOutputCache().clear();\r\n\r\n\t\t// NOTE A check whether all non-optional ports actually get data is not\r\n\t\t// necessary, as previous constraints already took care of this.\r\n\r\n\t\ttry {\r\n\t\t\t// Execute the behavior that is written in the specification.\r\n\t\t\tthis.specification.execute(this.getInputCache(),\r\n\t\t\t\t\tthis.getOutputCache());\r\n\r\n\t\t\treturn;\r\n\t\t} catch (Exception e) {\r\n\r\n\t\t\t// Clear the output cache.\r\n\t\t\tthis.getOutputCache().clear();\r\n\r\n\t\t\tthrow new ExecutionException(e);\r\n\t\t} finally {\r\n\t\t\tthis.eSetDeliver(true);\r\n\t\t}",
				"documentation",
				"Executes the node. It basically just delegates to the execute()-method of the NodeSpecification, but also does some maintenance.\r\n\r\n@throws ExecutionException if an error occurs during execution, containing an error message." });
		addAnnotation(getNode__CreateSpecification(), source, new String[] { "body",
				"try {\r\n\tSpecificationFactory fac = de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationFactory.eINSTANCE;\r\n\tjava.lang.reflect.Method creator = fac.getClass().getMethod(\"create\"+this.specificationClassName);\r\n\t\r\n\tthis.setSpecification((NodeSpecification) creator.invoke(fac));\r\n\tthis.specification.initialize();\r\n} catch (NoSuchMethodException e) {\r\n\t// The desired NodeSpecification does not exist.\r\n\te.printStackTrace();\r\n} catch (InvocationTargetException e) {\r\n\te.printStackTrace();\r\n} catch (IllegalAccessException e) {\r\n\te.printStackTrace();\r\n} catch (Exception e) {\r\n\te.printStackTrace();\r\n}",
				"documentation",
				"Reflectively creates the underlying NodeSpecification by looking into the field specificationClassName and searching a class of that name." });
		addAnnotation(getInput__GetData(), source, new String[] { "body",
				"if (this.getSource() == null)\r\n{\r\n\treturn null;\r\n}\r\n\t\t\r\nreturn this.getSource().getData();",
				"documentation",
				"Returns the data that flows to this input port.\r\n\r\n@return An object that is delivered by a connected output port or null, if the input is not connected." });
		addAnnotation(getOutput__GetData(), source, new String[] { "body",
				"if (this.getNode().getOutputCache() == null)\r\n{\r\n\treturn null;\r\n}\r\n\t\t\r\nreturn this.getNode().getOutputCache().get(this.getName());",
				"documentation",
				"Returns the object that this port gets from its node.\r\n\r\n@return The object filed in the outputCache of the associated node with the name of this port, or null if there is no data." });
	}

} // TestLanguagePackageImpl

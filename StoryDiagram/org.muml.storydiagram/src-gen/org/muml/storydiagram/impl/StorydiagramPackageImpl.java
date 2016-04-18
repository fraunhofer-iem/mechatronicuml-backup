/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.storydiagram.SDMExtension;
import org.muml.storydiagram.StorydiagramFactory;
import org.muml.storydiagram.StorydiagramPackage;
import org.muml.storydiagram.Variable;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.expressions.ActivitiesExpressionsPackage;
import org.muml.storydiagram.activities.expressions.impl.ActivitiesExpressionsPackageImpl;
import org.muml.storydiagram.activities.impl.ActivitiesPackageImpl;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.expressions.CallsExpressionsPackage;
import org.muml.storydiagram.calls.expressions.impl.CallsExpressionsPackageImpl;
import org.muml.storydiagram.calls.impl.CallsPackageImpl;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.expressions.PatternsExpressionsPackage;
import org.muml.storydiagram.patterns.expressions.impl.PatternsExpressionsPackageImpl;
import org.muml.storydiagram.patterns.impl.PatternsPackageImpl;
import org.muml.storydiagram.templates.TemplatesPackage;
import org.muml.storydiagram.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorydiagramPackageImpl extends EPackageImpl implements
		StorydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdmExtensionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.storydiagram.StorydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StorydiagramPackageImpl() {
		super(eNS_URI, StorydiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StorydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StorydiagramPackage init() {
		if (isInited) return (StorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI);

		// Obtain or create and register package
		StorydiagramPackageImpl theStorydiagramPackage = (StorydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StorydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StorydiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) : ActivitiesExpressionsPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		CallsExpressionsPackageImpl theCallsExpressionsPackage = (CallsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) instanceof CallsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) : CallsExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		PatternsExpressionsPackageImpl thePatternsExpressionsPackage = (PatternsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) instanceof PatternsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) : PatternsExpressionsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		theStorydiagramPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theActivitiesExpressionsPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theStorydiagramPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theActivitiesExpressionsPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStorydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StorydiagramPackage.eNS_URI, theStorydiagramPackage);
		return theStorydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_VariableName() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDMExtension() {
		return sdmExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDMExtension__GetModelBase() {
		return sdmExtensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSDMExtension__SetModelBase__EModelElement() {
		return sdmExtensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorydiagramFactory getStorydiagramFactory() {
		return (StorydiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VARIABLE_NAME);

		sdmExtensionEClass = createEClass(SDM_EXTENSION);
		createEOperation(sdmExtensionEClass, SDM_EXTENSION___GET_MODEL_BASE);
		createEOperation(sdmExtensionEClass, SDM_EXTENSION___SET_MODEL_BASE__EMODELELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitiesPackage);
		getESubpackages().add(theCallsPackage);
		getESubpackages().add(thePatternsPackage);
		getESubpackages().add(theTemplatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(theCorePackage.getTypedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, Variable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(sdmExtensionEClass, SDMExtension.class, "SDMExtension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSDMExtension__GetModelBase(), theEcorePackage.getEModelElement(), "getModelBase", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getSDMExtension__SetModelBase__EModelElement(), null, "setModelBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEModelElement(), "modelBase", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getSDMExtension__GetModelBase(), 
		   source, 
		   new String[] {
			 "body", "if (getEContainer() instanceof EAnnotation && getEContainer().getEContainer() instanceof EModelElement) {\n\treturn (EModelElement) getEContainer().getEContainer();\n}\nreturn null;"
		   });	
		addAnnotation
		  (getSDMExtension__SetModelBase__EModelElement(), 
		   source, 
		   new String[] {
			 "body", "EAnnotation annotation = null;\nif (modelBase != null) {\n\t// Find annotation via source\n\tfor (EAnnotation currentAnnotation : modelBase.getAnnotations()) {\n\t\tif (\"uri\".equals(currentAnnotation.getSource()) {\n\t\t\tannotation = currentAnnotation;\n\t\t\tbreak;\n\t\t}\n\t}\n\n\t// Create annotation if not found\n\tif (annotation == null) {\n\t\tannotation = EcoreFactory.eINSTANCE.createEAnnotation();\n\t\tannotation.setSource(\"uri\");\n\t\tmodelBase.getAnnotations().add(annotation);\n\t}\n}\n\n// Add to references of annotation\nannotation.getReferences().add(this);"
		   });
	}

} //StorydiagramsPackageImpl

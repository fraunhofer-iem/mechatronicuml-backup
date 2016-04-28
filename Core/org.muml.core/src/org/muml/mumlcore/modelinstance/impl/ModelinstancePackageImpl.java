/**
 */
package org.muml.mumlcore.modelinstance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.ExpressionsPackage;
import org.muml.mumlcore.expressions.common.CommonExpressionsPackage;
import org.muml.mumlcore.expressions.common.impl.CommonExpressionsPackageImpl;
import org.muml.mumlcore.expressions.impl.ExpressionsPackageImpl;
import org.muml.mumlcore.impl.CorePackageImpl;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.mumlcore.modelinstance.ModelinstanceFactory;
import org.muml.mumlcore.modelinstance.ModelinstancePackage;
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.mumlcore.modelinstance.util.ModelinstanceValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelinstancePackageImpl extends EPackageImpl implements ModelinstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementCategoryEClass = null;

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
	 * @see org.muml.mumlcore.modelinstance.ModelinstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelinstancePackageImpl() {
		super(eNS_URI, ModelinstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelinstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelinstancePackage init() {
		if (isInited) return (ModelinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ModelinstancePackage.eNS_URI);

		// Obtain or create and register package
		ModelinstancePackageImpl theModelinstancePackage = (ModelinstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelinstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelinstancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		CommonExpressionsPackageImpl theCommonExpressionsPackage = (CommonExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI) instanceof CommonExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI) : CommonExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theModelinstancePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theCommonExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theModelinstancePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theCommonExpressionsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModelinstancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModelinstanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModelinstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelinstancePackage.eNS_URI, theModelinstancePackage);
		return theModelinstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootNode() {
		return rootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode_Categories() {
		return (EReference)rootNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementCategory() {
		return modelElementCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementCategory_ModelElements() {
		return (EReference)modelElementCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementCategory_Key() {
		return (EAttribute)modelElementCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementCategory_Name() {
		return (EAttribute)modelElementCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElementCategory__IsValidElement__ExtendableElement() {
		return modelElementCategoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElementCategory__IsValidEClass__EClass() {
		return modelElementCategoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelinstanceFactory getModelinstanceFactory() {
		return (ModelinstanceFactory)getEFactoryInstance();
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
		rootNodeEClass = createEClass(ROOT_NODE);
		createEReference(rootNodeEClass, ROOT_NODE__CATEGORIES);

		modelElementCategoryEClass = createEClass(MODEL_ELEMENT_CATEGORY);
		createEReference(modelElementCategoryEClass, MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS);
		createEAttribute(modelElementCategoryEClass, MODEL_ELEMENT_CATEGORY__KEY);
		createEAttribute(modelElementCategoryEClass, MODEL_ELEMENT_CATEGORY__NAME);
		createEOperation(modelElementCategoryEClass, MODEL_ELEMENT_CATEGORY___IS_VALID_ELEMENT__EXTENDABLEELEMENT);
		createEOperation(modelElementCategoryEClass, MODEL_ELEMENT_CATEGORY___IS_VALID_ECLASS__ECLASS);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootNodeEClass, RootNode.class, "RootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootNode_Categories(), this.getModelElementCategory(), null, "categories", null, 0, -1, RootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementCategoryEClass, ModelElementCategory.class, "ModelElementCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementCategory_ModelElements(), theCorePackage.getExtendableElement(), null, "modelElements", null, 0, -1, ModelElementCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementCategory_Key(), ecorePackage.getEString(), "key", null, 0, 1, ModelElementCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElementCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getModelElementCategory__IsValidElement__ExtendableElement(), ecorePackage.getEBoolean(), "isValidElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getExtendableElement(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelElementCategory__IsValidEClass__EClass(), ecorePackage.getEBoolean(), "isValidEClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (modelElementCategoryEClass, 
		   source, 
		   new String[] {
			 "constraints", "ExclusivelyContainsValidElements"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (modelElementCategoryEClass, 
		   source, 
		   new String[] {
			 "ExclusivelyContainsValidElements", "self.modelElements->select (e | not isValidElement(e))->isEmpty()"
		   });	
		addAnnotation
		  (getModelElementCategory__IsValidElement__ExtendableElement(), 
		   source, 
		   new String[] {
			 "body", "isValidEClass(object.oclAsType(ecore::EObject).eClass())"
		   });
	}

} //ModelinstancePackageImpl

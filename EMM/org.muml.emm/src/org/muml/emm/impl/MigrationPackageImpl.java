/**
 */
package org.muml.emm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.emm.Constraint;
import org.muml.emm.CreateClass;
import org.muml.emm.CreateInitializer;
import org.muml.emm.FeatureInitializer;
import org.muml.emm.IdentityFeatureInitializer;
import org.muml.emm.Mapping;
import org.muml.emm.MigrationFactory;
import org.muml.emm.MigrationPackage;
import org.muml.emm.Migrator;
import org.muml.emm.OclExpression;
import org.muml.emm.SetFeatureInitializer;
import org.muml.emm.release.ReleasePackage;
import org.muml.emm.util.MigrationValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigrationPackageImpl extends EPackageImpl implements MigrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityFeatureInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setFeatureInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

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
	 * @see org.muml.emm.MigrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MigrationPackageImpl() {
		super(eNS_URI, MigrationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MigrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MigrationPackage init() {
		if (isInited) return (MigrationPackage)EPackage.Registry.INSTANCE.getEPackage(MigrationPackage.eNS_URI);

		// Obtain or create and register package
		MigrationPackageImpl theMigrationPackage = (MigrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MigrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MigrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ReleasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMigrationPackage.createPackageContents();

		// Initialize created meta-data
		theMigrationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMigrationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MigrationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMigrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MigrationPackage.eNS_URI, theMigrationPackage);
		return theMigrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrator() {
		return migratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrator_SourcePackages() {
		return (EReference)migratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrator_TargetPackages() {
		return (EReference)migratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrator_Mappings() {
		return (EReference)migratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrator_Release() {
		return (EReference)migratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclExpression() {
		return oclExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOclExpression_Ocl() {
		return (EAttribute)oclExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOclExpression__GetContext() {
		return oclExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateClass() {
		return createClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateClass_TargetClass() {
		return (EReference)createClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateClass_FeatureInitializers() {
		return (EReference)createClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateClass_Constraints() {
		return (EReference)createClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateClass__GetSourceClass() {
		return createClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_SourceClass() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Migrator() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureInitializer() {
		return featureInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureInitializer_EmbeddingCreateClass() {
		return (EReference)featureInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureInitializer_TargetFeature() {
		return (EReference)featureInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureInitializer__GetMapping() {
		return featureInitializerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityFeatureInitializer() {
		return identityFeatureInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentityFeatureInitializer_SourceFeature() {
		return (EReference)identityFeatureInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetFeatureInitializer() {
		return setFeatureInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetFeatureInitializer__GetContext() {
		return setFeatureInitializerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateInitializer() {
		return createInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateInitializer__GetSourceClass() {
		return createInitializerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_EmbeddingCreateClass() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__GetContext() {
		return constraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationFactory getMigrationFactory() {
		return (MigrationFactory)getEFactoryInstance();
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
		migratorEClass = createEClass(MIGRATOR);
		createEReference(migratorEClass, MIGRATOR__SOURCE_PACKAGES);
		createEReference(migratorEClass, MIGRATOR__TARGET_PACKAGES);
		createEReference(migratorEClass, MIGRATOR__MAPPINGS);
		createEReference(migratorEClass, MIGRATOR__RELEASE);

		oclExpressionEClass = createEClass(OCL_EXPRESSION);
		createEAttribute(oclExpressionEClass, OCL_EXPRESSION__OCL);
		createEOperation(oclExpressionEClass, OCL_EXPRESSION___GET_CONTEXT);

		createClassEClass = createEClass(CREATE_CLASS);
		createEReference(createClassEClass, CREATE_CLASS__TARGET_CLASS);
		createEReference(createClassEClass, CREATE_CLASS__FEATURE_INITIALIZERS);
		createEReference(createClassEClass, CREATE_CLASS__CONSTRAINTS);
		createEOperation(createClassEClass, CREATE_CLASS___GET_SOURCE_CLASS);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__SOURCE_CLASS);
		createEReference(mappingEClass, MAPPING__MIGRATOR);

		featureInitializerEClass = createEClass(FEATURE_INITIALIZER);
		createEReference(featureInitializerEClass, FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS);
		createEReference(featureInitializerEClass, FEATURE_INITIALIZER__TARGET_FEATURE);
		createEOperation(featureInitializerEClass, FEATURE_INITIALIZER___GET_MAPPING);

		identityFeatureInitializerEClass = createEClass(IDENTITY_FEATURE_INITIALIZER);
		createEReference(identityFeatureInitializerEClass, IDENTITY_FEATURE_INITIALIZER__SOURCE_FEATURE);

		setFeatureInitializerEClass = createEClass(SET_FEATURE_INITIALIZER);
		createEOperation(setFeatureInitializerEClass, SET_FEATURE_INITIALIZER___GET_CONTEXT);

		createInitializerEClass = createEClass(CREATE_INITIALIZER);
		createEOperation(createInitializerEClass, CREATE_INITIALIZER___GET_SOURCE_CLASS);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__EMBEDDING_CREATE_CLASS);
		createEOperation(constraintEClass, CONSTRAINT___GET_CONTEXT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ReleasePackage theReleasePackage = (ReleasePackage)EPackage.Registry.INSTANCE.getEPackage(ReleasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mappingEClass.getESuperTypes().add(this.getCreateClass());
		identityFeatureInitializerEClass.getESuperTypes().add(this.getFeatureInitializer());
		setFeatureInitializerEClass.getESuperTypes().add(this.getFeatureInitializer());
		setFeatureInitializerEClass.getESuperTypes().add(this.getOclExpression());
		createInitializerEClass.getESuperTypes().add(this.getCreateClass());
		createInitializerEClass.getESuperTypes().add(this.getFeatureInitializer());
		constraintEClass.getESuperTypes().add(this.getOclExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(migratorEClass, Migrator.class, "Migrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMigrator_SourcePackages(), theEcorePackage.getEPackage(), null, "sourcePackages", null, 0, -1, Migrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrator_TargetPackages(), theEcorePackage.getEPackage(), null, "targetPackages", null, 0, -1, Migrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrator_Mappings(), this.getMapping(), this.getMapping_Migrator(), "mappings", null, 0, -1, Migrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrator_Release(), theReleasePackage.getRelease(), null, "release", null, 1, 1, Migrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclExpressionEClass, OclExpression.class, "OclExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOclExpression_Ocl(), theEcorePackage.getEString(), "ocl", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOclExpression__GetContext(), theEcorePackage.getEClass(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createClassEClass, CreateClass.class, "CreateClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateClass_TargetClass(), theEcorePackage.getEClass(), null, "targetClass", null, 0, 1, CreateClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateClass_FeatureInitializers(), this.getFeatureInitializer(), this.getFeatureInitializer_EmbeddingCreateClass(), "featureInitializers", null, 0, -1, CreateClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateClass_Constraints(), this.getConstraint(), this.getConstraint_EmbeddingCreateClass(), "constraints", null, 0, -1, CreateClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCreateClass__GetSourceClass(), theEcorePackage.getEClass(), "getSourceClass", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_SourceClass(), theEcorePackage.getEClass(), null, "sourceClass", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Migrator(), this.getMigrator(), this.getMigrator_Mappings(), "migrator", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureInitializerEClass, FeatureInitializer.class, "FeatureInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureInitializer_EmbeddingCreateClass(), this.getCreateClass(), this.getCreateClass_FeatureInitializers(), "embeddingCreateClass", null, 1, 1, FeatureInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureInitializer_TargetFeature(), theEcorePackage.getEStructuralFeature(), null, "targetFeature", null, 1, 1, FeatureInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeatureInitializer__GetMapping(), this.getMapping(), "getMapping", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identityFeatureInitializerEClass, IdentityFeatureInitializer.class, "IdentityFeatureInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentityFeatureInitializer_SourceFeature(), theEcorePackage.getEStructuralFeature(), null, "sourceFeature", null, 1, 1, IdentityFeatureInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setFeatureInitializerEClass, SetFeatureInitializer.class, "SetFeatureInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSetFeatureInitializer__GetContext(), theEcorePackage.getEClass(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createInitializerEClass, CreateInitializer.class, "CreateInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCreateInitializer__GetSourceClass(), theEcorePackage.getEClass(), "getSourceClass", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_EmbeddingCreateClass(), this.getCreateClass(), this.getCreateClass_Constraints(), "embeddingCreateClass", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConstraint__GetContext(), theEcorePackage.getEClass(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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
		  (createClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoAbstractTarget"
		   });	
		addAnnotation
		  (mappingEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoTargetForAbstractSourceAllowed"
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
		  (createClassEClass, 
		   source, 
		   new String[] {
			 "NoAbstractTarget", "not targetClass.oclIsUndefined() implies not targetClass.abstract"
		   });	
		addAnnotation
		  (mappingEClass, 
		   source, 
		   new String[] {
			 "NoTargetForAbstractSourceAllowed", "(not sourceClass.oclIsUndefined()) implies \n(sourceClass.abstract implies targetClass.oclIsUndefined())"
		   });
	}

} //MigrationPackageImpl

/**
 */
package org.muml.emm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.muml.emm.MigrationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface MigrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/emm/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MigrationPackage eINSTANCE = org.muml.emm.impl.MigrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.MigratorImpl <em>Migrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.MigratorImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getMigrator()
	 * @generated
	 */
	int MIGRATOR = 0;

	/**
	 * The feature id for the '<em><b>Source Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__SOURCE_PACKAGES = 0;

	/**
	 * The feature id for the '<em><b>Target Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__TARGET_PACKAGES = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR__RELEASE = 3;

	/**
	 * The number of structural features of the '<em>Migrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Migrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.OclExpressionImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getOclExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__OCL = 0;

	/**
	 * The number of structural features of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION___GET_CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.CreateClassImpl <em>Create Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.CreateClassImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getCreateClass()
	 * @generated
	 */
	int CREATE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS__TARGET_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Feature Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS__FEATURE_INITIALIZERS = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS__CONSTRAINTS = 2;

	/**
	 * The number of structural features of the '<em>Create Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Source Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS___GET_SOURCE_CLASS = 0;

	/**
	 * The number of operations of the '<em>Create Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CLASS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.MappingImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET_CLASS = CREATE_CLASS__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Feature Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FEATURE_INITIALIZERS = CREATE_CLASS__FEATURE_INITIALIZERS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONSTRAINTS = CREATE_CLASS__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCE_CLASS = CREATE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Migrator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MIGRATOR = CREATE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = CREATE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_SOURCE_CLASS = CREATE_CLASS___GET_SOURCE_CLASS;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = CREATE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.FeatureInitializerImpl <em>Feature Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.FeatureInitializerImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getFeatureInitializer()
	 * @generated
	 */
	int FEATURE_INITIALIZER = 4;

	/**
	 * The feature id for the '<em><b>Embedding Create Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER__TARGET_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER___GET_MAPPING = 0;

	/**
	 * The number of operations of the '<em>Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INITIALIZER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.IdentityFeatureInitializerImpl <em>Identity Feature Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.IdentityFeatureInitializerImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getIdentityFeatureInitializer()
	 * @generated
	 */
	int IDENTITY_FEATURE_INITIALIZER = 5;

	/**
	 * The feature id for the '<em><b>Embedding Create Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS = FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_INITIALIZER__TARGET_FEATURE = FEATURE_INITIALIZER__TARGET_FEATURE;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_INITIALIZER__SOURCE_FEATURE = FEATURE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identity Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_INITIALIZER_FEATURE_COUNT = FEATURE_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_INITIALIZER___GET_MAPPING = FEATURE_INITIALIZER___GET_MAPPING;

	/**
	 * The number of operations of the '<em>Identity Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_INITIALIZER_OPERATION_COUNT = FEATURE_INITIALIZER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.SetFeatureInitializerImpl <em>Set Feature Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.SetFeatureInitializerImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getSetFeatureInitializer()
	 * @generated
	 */
	int SET_FEATURE_INITIALIZER = 6;

	/**
	 * The feature id for the '<em><b>Embedding Create Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS = FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER__TARGET_FEATURE = FEATURE_INITIALIZER__TARGET_FEATURE;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER__OCL = FEATURE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER_FEATURE_COUNT = FEATURE_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER___GET_MAPPING = FEATURE_INITIALIZER___GET_MAPPING;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER___GET_CONTEXT = FEATURE_INITIALIZER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Feature Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_INITIALIZER_OPERATION_COUNT = FEATURE_INITIALIZER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.CreateInitializerImpl <em>Create Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.CreateInitializerImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getCreateInitializer()
	 * @generated
	 */
	int CREATE_INITIALIZER = 7;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER__TARGET_CLASS = CREATE_CLASS__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Feature Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER__FEATURE_INITIALIZERS = CREATE_CLASS__FEATURE_INITIALIZERS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER__CONSTRAINTS = CREATE_CLASS__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Embedding Create Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS = CREATE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER__TARGET_FEATURE = CREATE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER_FEATURE_COUNT = CREATE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER___GET_MAPPING = CREATE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER___GET_SOURCE_CLASS = CREATE_CLASS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INITIALIZER_OPERATION_COUNT = CREATE_CLASS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.emm.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.emm.impl.ConstraintImpl
	 * @see org.muml.emm.impl.MigrationPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OCL = OCL_EXPRESSION__OCL;

	/**
	 * The feature id for the '<em><b>Embedding Create Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EMBEDDING_CREATE_CLASS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_CONTEXT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.muml.emm.Migrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migrator</em>'.
	 * @see org.muml.emm.Migrator
	 * @generated
	 */
	EClass getMigrator();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.emm.Migrator#getSourcePackages <em>Source Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Packages</em>'.
	 * @see org.muml.emm.Migrator#getSourcePackages()
	 * @see #getMigrator()
	 * @generated
	 */
	EReference getMigrator_SourcePackages();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.emm.Migrator#getTargetPackages <em>Target Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Packages</em>'.
	 * @see org.muml.emm.Migrator#getTargetPackages()
	 * @see #getMigrator()
	 * @generated
	 */
	EReference getMigrator_TargetPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.emm.Migrator#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.muml.emm.Migrator#getMappings()
	 * @see #getMigrator()
	 * @generated
	 */
	EReference getMigrator_Mappings();

	/**
	 * Returns the meta object for the reference '{@link org.muml.emm.Migrator#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Release</em>'.
	 * @see org.muml.emm.Migrator#getRelease()
	 * @see #getMigrator()
	 * @generated
	 */
	EReference getMigrator_Release();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Expression</em>'.
	 * @see org.muml.emm.OclExpression
	 * @generated
	 */
	EClass getOclExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.emm.OclExpression#getOcl <em>Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl</em>'.
	 * @see org.muml.emm.OclExpression#getOcl()
	 * @see #getOclExpression()
	 * @generated
	 */
	EAttribute getOclExpression_Ocl();

	/**
	 * Returns the meta object for the '{@link org.muml.emm.OclExpression#getContext() <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context</em>' operation.
	 * @see org.muml.emm.OclExpression#getContext()
	 * @generated
	 */
	EOperation getOclExpression__GetContext();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.CreateClass <em>Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Class</em>'.
	 * @see org.muml.emm.CreateClass
	 * @generated
	 */
	EClass getCreateClass();

	/**
	 * Returns the meta object for the reference '{@link org.muml.emm.CreateClass#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see org.muml.emm.CreateClass#getTargetClass()
	 * @see #getCreateClass()
	 * @generated
	 */
	EReference getCreateClass_TargetClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.emm.CreateClass#getFeatureInitializers <em>Feature Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Initializers</em>'.
	 * @see org.muml.emm.CreateClass#getFeatureInitializers()
	 * @see #getCreateClass()
	 * @generated
	 */
	EReference getCreateClass_FeatureInitializers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.emm.CreateClass#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.emm.CreateClass#getConstraints()
	 * @see #getCreateClass()
	 * @generated
	 */
	EReference getCreateClass_Constraints();

	/**
	 * Returns the meta object for the '{@link org.muml.emm.CreateClass#getSourceClass() <em>Get Source Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Class</em>' operation.
	 * @see org.muml.emm.CreateClass#getSourceClass()
	 * @generated
	 */
	EOperation getCreateClass__GetSourceClass();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.muml.emm.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link org.muml.emm.Mapping#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see org.muml.emm.Mapping#getSourceClass()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_SourceClass();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.emm.Mapping#getMigrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Migrator</em>'.
	 * @see org.muml.emm.Mapping#getMigrator()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Migrator();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.FeatureInitializer <em>Feature Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Initializer</em>'.
	 * @see org.muml.emm.FeatureInitializer
	 * @generated
	 */
	EClass getFeatureInitializer();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.emm.FeatureInitializer#getEmbeddingCreateClass <em>Embedding Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Embedding Create Class</em>'.
	 * @see org.muml.emm.FeatureInitializer#getEmbeddingCreateClass()
	 * @see #getFeatureInitializer()
	 * @generated
	 */
	EReference getFeatureInitializer_EmbeddingCreateClass();

	/**
	 * Returns the meta object for the reference '{@link org.muml.emm.FeatureInitializer#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Feature</em>'.
	 * @see org.muml.emm.FeatureInitializer#getTargetFeature()
	 * @see #getFeatureInitializer()
	 * @generated
	 */
	EReference getFeatureInitializer_TargetFeature();

	/**
	 * Returns the meta object for the '{@link org.muml.emm.FeatureInitializer#getMapping() <em>Get Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapping</em>' operation.
	 * @see org.muml.emm.FeatureInitializer#getMapping()
	 * @generated
	 */
	EOperation getFeatureInitializer__GetMapping();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.IdentityFeatureInitializer <em>Identity Feature Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Feature Initializer</em>'.
	 * @see org.muml.emm.IdentityFeatureInitializer
	 * @generated
	 */
	EClass getIdentityFeatureInitializer();

	/**
	 * Returns the meta object for the reference '{@link org.muml.emm.IdentityFeatureInitializer#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Feature</em>'.
	 * @see org.muml.emm.IdentityFeatureInitializer#getSourceFeature()
	 * @see #getIdentityFeatureInitializer()
	 * @generated
	 */
	EReference getIdentityFeatureInitializer_SourceFeature();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.SetFeatureInitializer <em>Set Feature Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Feature Initializer</em>'.
	 * @see org.muml.emm.SetFeatureInitializer
	 * @generated
	 */
	EClass getSetFeatureInitializer();

	/**
	 * Returns the meta object for the '{@link org.muml.emm.SetFeatureInitializer#getContext() <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context</em>' operation.
	 * @see org.muml.emm.SetFeatureInitializer#getContext()
	 * @generated
	 */
	EOperation getSetFeatureInitializer__GetContext();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.CreateInitializer <em>Create Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Initializer</em>'.
	 * @see org.muml.emm.CreateInitializer
	 * @generated
	 */
	EClass getCreateInitializer();

	/**
	 * Returns the meta object for the '{@link org.muml.emm.CreateInitializer#getSourceClass() <em>Get Source Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Class</em>' operation.
	 * @see org.muml.emm.CreateInitializer#getSourceClass()
	 * @generated
	 */
	EOperation getCreateInitializer__GetSourceClass();

	/**
	 * Returns the meta object for class '{@link org.muml.emm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.muml.emm.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.emm.Constraint#getEmbeddingCreateClass <em>Embedding Create Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Embedding Create Class</em>'.
	 * @see org.muml.emm.Constraint#getEmbeddingCreateClass()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_EmbeddingCreateClass();

	/**
	 * Returns the meta object for the '{@link org.muml.emm.Constraint#getContext() <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context</em>' operation.
	 * @see org.muml.emm.Constraint#getContext()
	 * @generated
	 */
	EOperation getConstraint__GetContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MigrationFactory getMigrationFactory();

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
		 * The meta object literal for the '{@link org.muml.emm.impl.MigratorImpl <em>Migrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.MigratorImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getMigrator()
		 * @generated
		 */
		EClass MIGRATOR = eINSTANCE.getMigrator();

		/**
		 * The meta object literal for the '<em><b>Source Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATOR__SOURCE_PACKAGES = eINSTANCE.getMigrator_SourcePackages();

		/**
		 * The meta object literal for the '<em><b>Target Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATOR__TARGET_PACKAGES = eINSTANCE.getMigrator_TargetPackages();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATOR__MAPPINGS = eINSTANCE.getMigrator_Mappings();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATOR__RELEASE = eINSTANCE.getMigrator_Release();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.OclExpressionImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getOclExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

		/**
		 * The meta object literal for the '<em><b>Ocl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_EXPRESSION__OCL = eINSTANCE.getOclExpression_Ocl();

		/**
		 * The meta object literal for the '<em><b>Get Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OCL_EXPRESSION___GET_CONTEXT = eINSTANCE.getOclExpression__GetContext();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.CreateClassImpl <em>Create Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.CreateClassImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getCreateClass()
		 * @generated
		 */
		EClass CREATE_CLASS = eINSTANCE.getCreateClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_CLASS__TARGET_CLASS = eINSTANCE.getCreateClass_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Feature Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_CLASS__FEATURE_INITIALIZERS = eINSTANCE.getCreateClass_FeatureInitializers();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_CLASS__CONSTRAINTS = eINSTANCE.getCreateClass_Constraints();

		/**
		 * The meta object literal for the '<em><b>Get Source Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_CLASS___GET_SOURCE_CLASS = eINSTANCE.getCreateClass__GetSourceClass();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.MappingImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SOURCE_CLASS = eINSTANCE.getMapping_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Migrator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MIGRATOR = eINSTANCE.getMapping_Migrator();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.FeatureInitializerImpl <em>Feature Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.FeatureInitializerImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getFeatureInitializer()
		 * @generated
		 */
		EClass FEATURE_INITIALIZER = eINSTANCE.getFeatureInitializer();

		/**
		 * The meta object literal for the '<em><b>Embedding Create Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS = eINSTANCE.getFeatureInitializer_EmbeddingCreateClass();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INITIALIZER__TARGET_FEATURE = eINSTANCE.getFeatureInitializer_TargetFeature();

		/**
		 * The meta object literal for the '<em><b>Get Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_INITIALIZER___GET_MAPPING = eINSTANCE.getFeatureInitializer__GetMapping();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.IdentityFeatureInitializerImpl <em>Identity Feature Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.IdentityFeatureInitializerImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getIdentityFeatureInitializer()
		 * @generated
		 */
		EClass IDENTITY_FEATURE_INITIALIZER = eINSTANCE.getIdentityFeatureInitializer();

		/**
		 * The meta object literal for the '<em><b>Source Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY_FEATURE_INITIALIZER__SOURCE_FEATURE = eINSTANCE.getIdentityFeatureInitializer_SourceFeature();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.SetFeatureInitializerImpl <em>Set Feature Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.SetFeatureInitializerImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getSetFeatureInitializer()
		 * @generated
		 */
		EClass SET_FEATURE_INITIALIZER = eINSTANCE.getSetFeatureInitializer();

		/**
		 * The meta object literal for the '<em><b>Get Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_FEATURE_INITIALIZER___GET_CONTEXT = eINSTANCE.getSetFeatureInitializer__GetContext();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.CreateInitializerImpl <em>Create Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.CreateInitializerImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getCreateInitializer()
		 * @generated
		 */
		EClass CREATE_INITIALIZER = eINSTANCE.getCreateInitializer();

		/**
		 * The meta object literal for the '<em><b>Get Source Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_INITIALIZER___GET_SOURCE_CLASS = eINSTANCE.getCreateInitializer__GetSourceClass();

		/**
		 * The meta object literal for the '{@link org.muml.emm.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.emm.impl.ConstraintImpl
		 * @see org.muml.emm.impl.MigrationPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Embedding Create Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__EMBEDDING_CREATE_CLASS = eINSTANCE.getConstraint_EmbeddingCreateClass();

		/**
		 * The meta object literal for the '<em><b>Get Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINT___GET_CONTEXT = eINSTANCE.getConstraint__GetContext();

	}

} //MigrationPackage

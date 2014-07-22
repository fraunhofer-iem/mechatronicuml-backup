/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtctlPackageImpl extends EPackageImpl implements MtctlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MtctlPackageImpl() {
		super(eNS_URI, MtctlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MtctlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MtctlPackage init() {
		if (isInited) return (MtctlPackage)EPackage.Registry.INSTANCE.getEPackage(MtctlPackage.eNS_URI);

		// Obtain or create and register package
		MtctlPackageImpl theMtctlPackage = (MtctlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MtctlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MtctlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		QuantifiersPackageImpl theQuantifiersPackage = (QuantifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantifiersPackage.eNS_URI) instanceof QuantifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantifiersPackage.eNS_URI) : QuantifiersPackage.eINSTANCE);
		PredicatesPackageImpl thePredicatesPackage = (PredicatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI) instanceof PredicatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI) : PredicatesPackage.eINSTANCE);
		SetsPackageImpl theSetsPackage = (SetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) instanceof SetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) : SetsPackage.eINSTANCE);
		BooleanLogicPackageImpl theBooleanLogicPackage = (BooleanLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) instanceof BooleanLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) : BooleanLogicPackage.eINSTANCE);
		ComparablesPackageImpl theComparablesPackage = (ComparablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) instanceof ComparablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) : ComparablesPackage.eINSTANCE);

		// Create package meta-data objects
		theMtctlPackage.createPackageContents();
		theQuantifiersPackage.createPackageContents();
		thePredicatesPackage.createPackageContents();
		theSetsPackage.createPackageContents();
		theBooleanLogicPackage.createPackageContents();
		theComparablesPackage.createPackageContents();

		// Initialize created meta-data
		theMtctlPackage.initializePackageContents();
		theQuantifiersPackage.initializePackageContents();
		thePredicatesPackage.initializePackageContents();
		theSetsPackage.initializePackageContents();
		theBooleanLogicPackage.initializePackageContents();
		theComparablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMtctlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MtctlPackage.eNS_URI, theMtctlPackage);
		return theMtctlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyRepository() {
		return propertyRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRepository_Properties() {
		return (EReference)propertyRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Expression() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtctlFactory getMtctlFactory() {
		return (MtctlFactory)getEFactoryInstance();
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
		propertyRepositoryEClass = createEClass(PROPERTY_REPOSITORY);
		createEReference(propertyRepositoryEClass, PROPERTY_REPOSITORY__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);
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
		QuantifiersPackage theQuantifiersPackage = (QuantifiersPackage)EPackage.Registry.INSTANCE.getEPackage(QuantifiersPackage.eNS_URI);
		PredicatesPackage thePredicatesPackage = (PredicatesPackage)EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI);
		SetsPackage theSetsPackage = (SetsPackage)EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI);
		BooleanLogicPackage theBooleanLogicPackage = (BooleanLogicPackage)EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI);
		ComparablesPackage theComparablesPackage = (ComparablesPackage)EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theQuantifiersPackage);
		getESubpackages().add(thePredicatesPackage);
		getESubpackages().add(theSetsPackage);
		getESubpackages().add(theBooleanLogicPackage);
		getESubpackages().add(theComparablesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propertyRepositoryEClass.getESuperTypes().add(theConstraintPackage.getVerificationConstraintRepository());
		propertyEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		expressionEClass.getESuperTypes().add(ecorePackage.getEObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(propertyRepositoryEClass, PropertyRepository.class, "PropertyRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyRepository_Properties(), this.getProperty(), null, "properties", null, 0, -1, PropertyRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Expression(), this.getExpression(), null, "expression", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MtctlPackageImpl

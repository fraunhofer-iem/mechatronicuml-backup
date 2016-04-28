/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.AtomicProposition;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicOperator;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.ComparisonOperator;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.TCTLFormula;
import org.muml.reconfigurationverification.tctl.TctlFactory;
import org.muml.reconfigurationverification.tctl.TctlPackage;
import org.muml.reconfigurationverification.tctl.TemporalFormula;
import org.muml.reconfigurationverification.tctl.TemporalOperator;
import org.muml.reconfigurationverification.tctl.Term;
import org.muml.reconfigurationverification.tctl.UnaryFormula;
import org.muml.reconfigurationverification.tctl.UnaryTemporalFormula;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TctlPackageImpl extends EPackageImpl implements TctlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tctlFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryTemporalFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryLogicFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTemporalFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicPropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryLogicOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalOperatorEEnum = null;

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
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TctlPackageImpl() {
		super(eNS_URI, TctlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TctlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TctlPackage init() {
		if (isInited) return (TctlPackage)EPackage.Registry.INSTANCE.getEPackage(TctlPackage.eNS_URI);

		// Obtain or create and register package
		TctlPackageImpl theTctlPackage = (TctlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TctlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TctlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTctlPackage.createPackageContents();

		// Initialize created meta-data
		theTctlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTctlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TctlPackage.eNS_URI, theTctlPackage);
		return theTctlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaDefinition() {
		return formulaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCTLFormula() {
		return tctlFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCTLFormula_Formula() {
		return (EReference)tctlFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicFormula() {
		return atomicFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicFormula_Term() {
		return (EReference)atomicFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryFormula() {
		return unaryFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryFormula_Subformula() {
		return (EReference)unaryFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFormula() {
		return binaryFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryFormula_LeftSubformula() {
		return (EReference)binaryFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryFormula_RightSubformula() {
		return (EReference)binaryFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotFormula() {
		return notFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryTemporalFormula() {
		return unaryTemporalFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryLogicFormula() {
		return binaryLogicFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryLogicFormula_Operator() {
		return (EAttribute)binaryLogicFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryTemporalFormula() {
		return binaryTemporalFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalFormula() {
		return temporalFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalFormula_ComparisonOperator() {
		return (EAttribute)temporalFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalFormula_TemporalOperator() {
		return (EAttribute)temporalFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalFormula_Value() {
		return (EAttribute)temporalFormulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicProposition() {
		return atomicPropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryLogicOperator() {
		return binaryLogicOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTemporalOperator() {
		return temporalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TctlFactory getTctlFactory() {
		return (TctlFactory)getEFactoryInstance();
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
		formulaDefinitionEClass = createEClass(FORMULA_DEFINITION);

		atomicFormulaEClass = createEClass(ATOMIC_FORMULA);
		createEReference(atomicFormulaEClass, ATOMIC_FORMULA__TERM);

		unaryFormulaEClass = createEClass(UNARY_FORMULA);
		createEReference(unaryFormulaEClass, UNARY_FORMULA__SUBFORMULA);

		binaryFormulaEClass = createEClass(BINARY_FORMULA);
		createEReference(binaryFormulaEClass, BINARY_FORMULA__LEFT_SUBFORMULA);
		createEReference(binaryFormulaEClass, BINARY_FORMULA__RIGHT_SUBFORMULA);

		notFormulaEClass = createEClass(NOT_FORMULA);

		unaryTemporalFormulaEClass = createEClass(UNARY_TEMPORAL_FORMULA);

		binaryLogicFormulaEClass = createEClass(BINARY_LOGIC_FORMULA);
		createEAttribute(binaryLogicFormulaEClass, BINARY_LOGIC_FORMULA__OPERATOR);

		binaryTemporalFormulaEClass = createEClass(BINARY_TEMPORAL_FORMULA);

		temporalFormulaEClass = createEClass(TEMPORAL_FORMULA);
		createEAttribute(temporalFormulaEClass, TEMPORAL_FORMULA__COMPARISON_OPERATOR);
		createEAttribute(temporalFormulaEClass, TEMPORAL_FORMULA__TEMPORAL_OPERATOR);
		createEAttribute(temporalFormulaEClass, TEMPORAL_FORMULA__VALUE);

		termEClass = createEClass(TERM);

		atomicPropositionEClass = createEClass(ATOMIC_PROPOSITION);

		tctlFormulaEClass = createEClass(TCTL_FORMULA);
		createEReference(tctlFormulaEClass, TCTL_FORMULA__FORMULA);

		// Create enums
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
		binaryLogicOperatorEEnum = createEEnum(BINARY_LOGIC_OPERATOR);
		temporalOperatorEEnum = createEEnum(TEMPORAL_OPERATOR);
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
		formulaDefinitionEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		atomicFormulaEClass.getESuperTypes().add(this.getFormulaDefinition());
		unaryFormulaEClass.getESuperTypes().add(this.getFormulaDefinition());
		binaryFormulaEClass.getESuperTypes().add(this.getFormulaDefinition());
		notFormulaEClass.getESuperTypes().add(this.getUnaryFormula());
		unaryTemporalFormulaEClass.getESuperTypes().add(this.getUnaryFormula());
		unaryTemporalFormulaEClass.getESuperTypes().add(this.getTemporalFormula());
		binaryLogicFormulaEClass.getESuperTypes().add(this.getBinaryFormula());
		binaryTemporalFormulaEClass.getESuperTypes().add(this.getBinaryFormula());
		binaryTemporalFormulaEClass.getESuperTypes().add(this.getTemporalFormula());
		temporalFormulaEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		termEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		atomicPropositionEClass.getESuperTypes().add(this.getTerm());
		atomicPropositionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		tctlFormulaEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(formulaDefinitionEClass, FormulaDefinition.class, "FormulaDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicFormulaEClass, AtomicFormula.class, "AtomicFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicFormula_Term(), this.getTerm(), null, "term", null, 1, 1, AtomicFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryFormulaEClass, UnaryFormula.class, "UnaryFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryFormula_Subformula(), this.getFormulaDefinition(), null, "subformula", null, 1, 1, UnaryFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryFormulaEClass, BinaryFormula.class, "BinaryFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryFormula_LeftSubformula(), this.getFormulaDefinition(), null, "leftSubformula", null, 1, 1, BinaryFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryFormula_RightSubformula(), this.getFormulaDefinition(), null, "rightSubformula", null, 1, 1, BinaryFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notFormulaEClass, NotFormula.class, "NotFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryTemporalFormulaEClass, UnaryTemporalFormula.class, "UnaryTemporalFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryLogicFormulaEClass, BinaryLogicFormula.class, "BinaryLogicFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryLogicFormula_Operator(), this.getBinaryLogicOperator(), "operator", "AND", 1, 1, BinaryLogicFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryTemporalFormulaEClass, BinaryTemporalFormula.class, "BinaryTemporalFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalFormulaEClass, TemporalFormula.class, "TemporalFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalFormula_ComparisonOperator(), this.getComparisonOperator(), "comparisonOperator", "LESS_OR_EQUAL", 1, 1, TemporalFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalFormula_TemporalOperator(), this.getTemporalOperator(), "temporalOperator", "AF", 1, 1, TemporalFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalFormula_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, TemporalFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicPropositionEClass, AtomicProposition.class, "AtomicProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tctlFormulaEClass, TCTLFormula.class, "TCTLFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCTLFormula_Formula(), this.getFormulaDefinition(), null, "formula", null, 1, 1, TCTLFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_OR_EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);

		initEEnum(binaryLogicOperatorEEnum, BinaryLogicOperator.class, "BinaryLogicOperator");
		addEEnumLiteral(binaryLogicOperatorEEnum, BinaryLogicOperator.AND);
		addEEnumLiteral(binaryLogicOperatorEEnum, BinaryLogicOperator.OR);
		addEEnumLiteral(binaryLogicOperatorEEnum, BinaryLogicOperator.IMPLY);
		addEEnumLiteral(binaryLogicOperatorEEnum, BinaryLogicOperator.EQUIV);
		addEEnumLiteral(binaryLogicOperatorEEnum, BinaryLogicOperator.XOR);

		initEEnum(temporalOperatorEEnum, TemporalOperator.class, "TemporalOperator");
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.AF);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.AG);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.AU);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.EF);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.EG);
		addEEnumLiteral(temporalOperatorEEnum, TemporalOperator.EU);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //TctlPackageImpl

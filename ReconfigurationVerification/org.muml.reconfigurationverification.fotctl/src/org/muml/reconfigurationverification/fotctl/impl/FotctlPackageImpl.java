/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.mumlcore.CorePackage;
import org.muml.reconfigurationverification.fotctl.Constant;
import org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.FoTCTLSpec;
import org.muml.reconfigurationverification.fotctl.FotctlFactory;
import org.muml.reconfigurationverification.fotctl.FotctlPackage;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl;
import org.muml.reconfigurationverification.fotctl.QuantifiedFormula;
import org.muml.reconfigurationverification.fotctl.Quantifier;
import org.muml.reconfigurationverification.fotctl.Variable;
import org.muml.reconfigurationverification.tctl.TctlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FotctlPackageImpl extends EPackageImpl implements FotctlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foTCTLSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foTCTLFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeLabelPredicateDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeLabelPredicateDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantSymbolDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeLabelPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeLabelPredicateEClass = null;

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
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

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
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FotctlPackageImpl() {
		super(eNS_URI, FotctlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FotctlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FotctlPackage init() {
		if (isInited) return (FotctlPackage)EPackage.Registry.INSTANCE.getEPackage(FotctlPackage.eNS_URI);

		// Obtain or create and register package
		FotctlPackageImpl theFotctlPackage = (FotctlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FotctlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FotctlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TctlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFotctlPackage.createPackageContents();

		// Initialize created meta-data
		theFotctlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFotctlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FotctlPackage.eNS_URI, theFotctlPackage);
		return theFotctlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoTCTLSpec() {
		return foTCTLSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoTCTLSpec_Formulas() {
		return (EReference)foTCTLSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoTCTLSpec_NodeLabelPredicates() {
		return (EReference)foTCTLSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoTCTLSpec_EdgeLabelPredicates() {
		return (EReference)foTCTLSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoTCTLSpec_Constants() {
		return (EReference)foTCTLSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoTCTLFormula() {
		return foTCTLFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeLabelPredicateDecl() {
		return nodeLabelPredicateDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeLabelPredicateDecl() {
		return edgeLabelPredicateDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantSymbolDecl() {
		return constantSymbolDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedFormula() {
		return quantifiedFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedFormula_Variables() {
		return (EReference)quantifiedFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifiedFormula_Quantifier() {
		return (EAttribute)quantifiedFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeLabelPredicate() {
		return nodeLabelPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeLabelPredicate_Declaration() {
		return (EReference)nodeLabelPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeLabelPredicate() {
		return edgeLabelPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeLabelPredicate_Declaration() {
		return (EReference)edgeLabelPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeLabelPredicate_SecondTerm() {
		return (EReference)edgeLabelPredicateEClass.getEStructuralFeatures().get(1);
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
	public EReference getVariable_Declaration() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Declaration() {
		return (EReference)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Name() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FotctlFactory getFotctlFactory() {
		return (FotctlFactory)getEFactoryInstance();
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
		foTCTLSpecEClass = createEClass(FO_TCTL_SPEC);
		createEReference(foTCTLSpecEClass, FO_TCTL_SPEC__FORMULAS);
		createEReference(foTCTLSpecEClass, FO_TCTL_SPEC__NODE_LABEL_PREDICATES);
		createEReference(foTCTLSpecEClass, FO_TCTL_SPEC__EDGE_LABEL_PREDICATES);
		createEReference(foTCTLSpecEClass, FO_TCTL_SPEC__CONSTANTS);

		foTCTLFormulaEClass = createEClass(FO_TCTL_FORMULA);

		nodeLabelPredicateDeclEClass = createEClass(NODE_LABEL_PREDICATE_DECL);

		edgeLabelPredicateDeclEClass = createEClass(EDGE_LABEL_PREDICATE_DECL);

		constantSymbolDeclEClass = createEClass(CONSTANT_SYMBOL_DECL);

		quantifiedFormulaEClass = createEClass(QUANTIFIED_FORMULA);
		createEReference(quantifiedFormulaEClass, QUANTIFIED_FORMULA__VARIABLES);
		createEAttribute(quantifiedFormulaEClass, QUANTIFIED_FORMULA__QUANTIFIER);

		nodeLabelPredicateEClass = createEClass(NODE_LABEL_PREDICATE);
		createEReference(nodeLabelPredicateEClass, NODE_LABEL_PREDICATE__DECLARATION);

		edgeLabelPredicateEClass = createEClass(EDGE_LABEL_PREDICATE);
		createEReference(edgeLabelPredicateEClass, EDGE_LABEL_PREDICATE__DECLARATION);
		createEReference(edgeLabelPredicateEClass, EDGE_LABEL_PREDICATE__SECOND_TERM);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__DECLARATION);
		createEAttribute(variableEClass, VARIABLE__NAME);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__DECLARATION);
		createEAttribute(constantEClass, CONSTANT__NAME);

		// Create enums
		quantifierEEnum = createEEnum(QUANTIFIER);
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
		TctlPackage theTctlPackage = (TctlPackage)EPackage.Registry.INSTANCE.getEPackage(TctlPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		foTCTLSpecEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		foTCTLFormulaEClass.getESuperTypes().add(theTctlPackage.getTCTLFormula());
		nodeLabelPredicateDeclEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		edgeLabelPredicateDeclEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		constantSymbolDeclEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		quantifiedFormulaEClass.getESuperTypes().add(theTctlPackage.getUnaryFormula());
		quantifiedFormulaEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		nodeLabelPredicateEClass.getESuperTypes().add(theTctlPackage.getAtomicFormula());
		edgeLabelPredicateEClass.getESuperTypes().add(theTctlPackage.getAtomicFormula());
		variableEClass.getESuperTypes().add(theTctlPackage.getTerm());
		constantEClass.getESuperTypes().add(theTctlPackage.getTerm());

		// Initialize classes and features; add operations and parameters
		initEClass(foTCTLSpecEClass, FoTCTLSpec.class, "FoTCTLSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoTCTLSpec_Formulas(), this.getFoTCTLFormula(), null, "formulas", null, 0, -1, FoTCTLSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoTCTLSpec_NodeLabelPredicates(), this.getNodeLabelPredicateDecl(), null, "nodeLabelPredicates", null, 0, -1, FoTCTLSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoTCTLSpec_EdgeLabelPredicates(), this.getEdgeLabelPredicateDecl(), null, "edgeLabelPredicates", null, 0, -1, FoTCTLSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoTCTLSpec_Constants(), this.getConstantSymbolDecl(), null, "constants", null, 0, -1, FoTCTLSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foTCTLFormulaEClass, FoTCTLFormula.class, "FoTCTLFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeLabelPredicateDeclEClass, NodeLabelPredicateDecl.class, "NodeLabelPredicateDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeLabelPredicateDeclEClass, EdgeLabelPredicateDecl.class, "EdgeLabelPredicateDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantSymbolDeclEClass, ConstantSymbolDecl.class, "ConstantSymbolDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantifiedFormulaEClass, QuantifiedFormula.class, "QuantifiedFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedFormula_Variables(), this.getVariable(), this.getVariable_Declaration(), "variables", null, 1, -1, QuantifiedFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantifiedFormula_Quantifier(), this.getQuantifier(), "quantifier", "Quantifier.FORALL", 0, 1, QuantifiedFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeLabelPredicateEClass, NodeLabelPredicate.class, "NodeLabelPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeLabelPredicate_Declaration(), this.getNodeLabelPredicateDecl(), null, "declaration", null, 1, 1, NodeLabelPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeLabelPredicateEClass, EdgeLabelPredicate.class, "EdgeLabelPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeLabelPredicate_Declaration(), this.getEdgeLabelPredicateDecl(), null, "declaration", null, 1, 1, EdgeLabelPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeLabelPredicate_SecondTerm(), theTctlPackage.getTerm(), null, "secondTerm", null, 1, 1, EdgeLabelPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Declaration(), this.getQuantifiedFormula(), this.getQuantifiedFormula_Variables(), "declaration", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Variable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_Declaration(), this.getConstantSymbolDecl(), null, "declaration", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Constant.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.FORALL);
		addEEnumLiteral(quantifierEEnum, Quantifier.EXISTS);

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
		  (getVariable_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if declaration.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tdeclaration.name\r\nendif"
		   });	
		addAnnotation
		  (getConstant_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if declaration.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tdeclaration.name\r\nendif"
		   });
	}

} //FotctlPackageImpl

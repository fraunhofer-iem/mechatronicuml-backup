/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;
import org.muml.reconfigurationverification.tctl.TctlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.fotctl.FotctlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface FotctlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fotctl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfigurationverification/fotctl/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fotctl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FotctlPackage eINSTANCE = org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl <em>Fo TCTL Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getFoTCTLSpec()
	 * @generated
	 */
	int FO_TCTL_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_SPEC__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_SPEC__FORMULAS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Label Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_SPEC__NODE_LABEL_PREDICATES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edge Label Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_SPEC__EDGE_LABEL_PREDICATES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_SPEC__CONSTANTS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fo TCTL Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_SPEC_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLFormulaImpl <em>Fo TCTL Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.FoTCTLFormulaImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getFoTCTLFormula()
	 * @generated
	 */
	int FO_TCTL_FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_FORMULA__EXTENSIONS = TctlPackage.TCTL_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_FORMULA__COMMENT = TctlPackage.TCTL_FORMULA__COMMENT;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_FORMULA__FORMULA = TctlPackage.TCTL_FORMULA__FORMULA;

	/**
	 * The number of structural features of the '<em>Fo TCTL Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_TCTL_FORMULA_FEATURE_COUNT = TctlPackage.TCTL_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateDeclImpl <em>Node Label Predicate Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateDeclImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getNodeLabelPredicateDecl()
	 * @generated
	 */
	int NODE_LABEL_PREDICATE_DECL = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE_DECL__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE_DECL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Node Label Predicate Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE_DECL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateDeclImpl <em>Edge Label Predicate Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateDeclImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getEdgeLabelPredicateDecl()
	 * @generated
	 */
	int EDGE_LABEL_PREDICATE_DECL = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE_DECL__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE_DECL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Edge Label Predicate Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE_DECL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.ConstantSymbolDeclImpl <em>Constant Symbol Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.ConstantSymbolDeclImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getConstantSymbolDecl()
	 * @generated
	 */
	int CONSTANT_SYMBOL_DECL = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SYMBOL_DECL__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SYMBOL_DECL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Constant Symbol Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SYMBOL_DECL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.QuantifiedFormulaImpl <em>Quantified Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.QuantifiedFormulaImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getQuantifiedFormula()
	 * @generated
	 */
	int QUANTIFIED_FORMULA = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_FORMULA__EXTENSIONS = TctlPackage.UNARY_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_FORMULA__SUBFORMULA = TctlPackage.UNARY_FORMULA__SUBFORMULA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_FORMULA__NAME = TctlPackage.UNARY_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_FORMULA__VARIABLES = TctlPackage.UNARY_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_FORMULA__QUANTIFIER = TctlPackage.UNARY_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantified Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_FORMULA_FEATURE_COUNT = TctlPackage.UNARY_FORMULA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateImpl <em>Node Label Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getNodeLabelPredicate()
	 * @generated
	 */
	int NODE_LABEL_PREDICATE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE__EXTENSIONS = TctlPackage.ATOMIC_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE__TERM = TctlPackage.ATOMIC_FORMULA__TERM;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE__DECLARATION = TctlPackage.ATOMIC_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Label Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_PREDICATE_FEATURE_COUNT = TctlPackage.ATOMIC_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateImpl <em>Edge Label Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getEdgeLabelPredicate()
	 * @generated
	 */
	int EDGE_LABEL_PREDICATE = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE__EXTENSIONS = TctlPackage.ATOMIC_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE__TERM = TctlPackage.ATOMIC_FORMULA__TERM;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE__DECLARATION = TctlPackage.ATOMIC_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE__SECOND_TERM = TctlPackage.ATOMIC_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Label Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LABEL_PREDICATE_FEATURE_COUNT = TctlPackage.ATOMIC_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.VariableImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXTENSIONS = TctlPackage.TERM__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DECLARATION = TctlPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TctlPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TctlPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.impl.ConstantImpl
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__EXTENSIONS = TctlPackage.TERM__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DECLARATION = TctlPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = TctlPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = TctlPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.fotctl.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.fotctl.Quantifier
	 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 10;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec <em>Fo TCTL Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fo TCTL Spec</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLSpec
	 * @generated
	 */
	EClass getFoTCTLSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulas</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getFormulas()
	 * @see #getFoTCTLSpec()
	 * @generated
	 */
	EReference getFoTCTLSpec_Formulas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getNodeLabelPredicates <em>Node Label Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Label Predicates</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getNodeLabelPredicates()
	 * @see #getFoTCTLSpec()
	 * @generated
	 */
	EReference getFoTCTLSpec_NodeLabelPredicates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getEdgeLabelPredicates <em>Edge Label Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge Label Predicates</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getEdgeLabelPredicates()
	 * @see #getFoTCTLSpec()
	 * @generated
	 */
	EReference getFoTCTLSpec_EdgeLabelPredicates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getConstants()
	 * @see #getFoTCTLSpec()
	 * @generated
	 */
	EReference getFoTCTLSpec_Constants();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.FoTCTLFormula <em>Fo TCTL Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fo TCTL Formula</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.FoTCTLFormula
	 * @generated
	 */
	EClass getFoTCTLFormula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl <em>Node Label Predicate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Label Predicate Decl</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl
	 * @generated
	 */
	EClass getNodeLabelPredicateDecl();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl <em>Edge Label Predicate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Label Predicate Decl</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl
	 * @generated
	 */
	EClass getEdgeLabelPredicateDecl();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl <em>Constant Symbol Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Symbol Decl</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl
	 * @generated
	 */
	EClass getConstantSymbolDecl();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula <em>Quantified Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Formula</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.QuantifiedFormula
	 * @generated
	 */
	EClass getQuantifiedFormula();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getVariables()
	 * @see #getQuantifiedFormula()
	 * @generated
	 */
	EReference getQuantifiedFormula_Variables();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getQuantifier()
	 * @see #getQuantifiedFormula()
	 * @generated
	 */
	EAttribute getQuantifiedFormula_Quantifier();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicate <em>Node Label Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Label Predicate</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.NodeLabelPredicate
	 * @generated
	 */
	EClass getNodeLabelPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicate#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.NodeLabelPredicate#getDeclaration()
	 * @see #getNodeLabelPredicate()
	 * @generated
	 */
	EReference getNodeLabelPredicate_Declaration();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate <em>Edge Label Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Label Predicate</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate
	 * @generated
	 */
	EClass getEdgeLabelPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate#getDeclaration()
	 * @see #getEdgeLabelPredicate()
	 * @generated
	 */
	EReference getEdgeLabelPredicate_Declaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate#getSecondTerm <em>Second Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Term</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate#getSecondTerm()
	 * @see #getEdgeLabelPredicate()
	 * @generated
	 */
	EReference getEdgeLabelPredicate_SecondTerm();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.fotctl.Variable#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Variable#getDeclaration()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.fotctl.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.fotctl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.fotctl.Constant#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Constant#getDeclaration()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.fotctl.Constant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Constant#getName()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Name();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfigurationverification.fotctl.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see org.muml.reconfigurationverification.fotctl.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FotctlFactory getFotctlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl <em>Fo TCTL Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.FoTCTLSpecImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getFoTCTLSpec()
		 * @generated
		 */
		EClass FO_TCTL_SPEC = eINSTANCE.getFoTCTLSpec();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_TCTL_SPEC__FORMULAS = eINSTANCE.getFoTCTLSpec_Formulas();

		/**
		 * The meta object literal for the '<em><b>Node Label Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_TCTL_SPEC__NODE_LABEL_PREDICATES = eINSTANCE.getFoTCTLSpec_NodeLabelPredicates();

		/**
		 * The meta object literal for the '<em><b>Edge Label Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_TCTL_SPEC__EDGE_LABEL_PREDICATES = eINSTANCE.getFoTCTLSpec_EdgeLabelPredicates();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FO_TCTL_SPEC__CONSTANTS = eINSTANCE.getFoTCTLSpec_Constants();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.FoTCTLFormulaImpl <em>Fo TCTL Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.FoTCTLFormulaImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getFoTCTLFormula()
		 * @generated
		 */
		EClass FO_TCTL_FORMULA = eINSTANCE.getFoTCTLFormula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateDeclImpl <em>Node Label Predicate Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateDeclImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getNodeLabelPredicateDecl()
		 * @generated
		 */
		EClass NODE_LABEL_PREDICATE_DECL = eINSTANCE.getNodeLabelPredicateDecl();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateDeclImpl <em>Edge Label Predicate Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateDeclImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getEdgeLabelPredicateDecl()
		 * @generated
		 */
		EClass EDGE_LABEL_PREDICATE_DECL = eINSTANCE.getEdgeLabelPredicateDecl();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.ConstantSymbolDeclImpl <em>Constant Symbol Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.ConstantSymbolDeclImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getConstantSymbolDecl()
		 * @generated
		 */
		EClass CONSTANT_SYMBOL_DECL = eINSTANCE.getConstantSymbolDecl();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.QuantifiedFormulaImpl <em>Quantified Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.QuantifiedFormulaImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getQuantifiedFormula()
		 * @generated
		 */
		EClass QUANTIFIED_FORMULA = eINSTANCE.getQuantifiedFormula();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_FORMULA__VARIABLES = eINSTANCE.getQuantifiedFormula_Variables();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_FORMULA__QUANTIFIER = eINSTANCE.getQuantifiedFormula_Quantifier();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateImpl <em>Node Label Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.NodeLabelPredicateImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getNodeLabelPredicate()
		 * @generated
		 */
		EClass NODE_LABEL_PREDICATE = eINSTANCE.getNodeLabelPredicate();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LABEL_PREDICATE__DECLARATION = eINSTANCE.getNodeLabelPredicate_Declaration();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateImpl <em>Edge Label Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getEdgeLabelPredicate()
		 * @generated
		 */
		EClass EDGE_LABEL_PREDICATE = eINSTANCE.getEdgeLabelPredicate();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_LABEL_PREDICATE__DECLARATION = eINSTANCE.getEdgeLabelPredicate_Declaration();

		/**
		 * The meta object literal for the '<em><b>Second Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_LABEL_PREDICATE__SECOND_TERM = eINSTANCE.getEdgeLabelPredicate_SecondTerm();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.VariableImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DECLARATION = eINSTANCE.getVariable_Declaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.impl.ConstantImpl
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__DECLARATION = eINSTANCE.getConstant_Declaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.fotctl.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.fotctl.Quantifier
		 * @see org.muml.reconfigurationverification.fotctl.impl.FotctlPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

	}

} //FotctlPackage

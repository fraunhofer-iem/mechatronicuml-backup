/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

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
 * @see org.muml.reconfigurationverification.tctl.TctlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TctlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tctl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfigurationverification/tctl/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tctl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TctlPackage eINSTANCE = org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.FormulaDefinitionImpl <em>Formula Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.FormulaDefinitionImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getFormulaDefinition()
	 * @generated
	 */
	int FORMULA_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_DEFINITION__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Formula Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_DEFINITION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.TCTLFormulaImpl <em>TCTL Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.TCTLFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTCTLFormula()
	 * @generated
	 */
	int TCTL_FORMULA = 11;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.AtomicFormulaImpl <em>Atomic Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.AtomicFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getAtomicFormula()
	 * @generated
	 */
	int ATOMIC_FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULA__EXTENSIONS = FORMULA_DEFINITION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULA__TERM = FORMULA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULA_FEATURE_COUNT = FORMULA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.UnaryFormulaImpl <em>Unary Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.UnaryFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getUnaryFormula()
	 * @generated
	 */
	int UNARY_FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORMULA__EXTENSIONS = FORMULA_DEFINITION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORMULA__SUBFORMULA = FORMULA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORMULA_FEATURE_COUNT = FORMULA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.BinaryFormulaImpl <em>Binary Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.BinaryFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryFormula()
	 * @generated
	 */
	int BINARY_FORMULA = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORMULA__EXTENSIONS = FORMULA_DEFINITION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Left Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORMULA__LEFT_SUBFORMULA = FORMULA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORMULA__RIGHT_SUBFORMULA = FORMULA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FORMULA_FEATURE_COUNT = FORMULA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.NotFormulaImpl <em>Not Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.NotFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getNotFormula()
	 * @generated
	 */
	int NOT_FORMULA = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FORMULA__EXTENSIONS = UNARY_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FORMULA__SUBFORMULA = UNARY_FORMULA__SUBFORMULA;

	/**
	 * The number of structural features of the '<em>Not Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FORMULA_FEATURE_COUNT = UNARY_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.UnaryTemporalFormulaImpl <em>Unary Temporal Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.UnaryTemporalFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getUnaryTemporalFormula()
	 * @generated
	 */
	int UNARY_TEMPORAL_FORMULA = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEMPORAL_FORMULA__EXTENSIONS = UNARY_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEMPORAL_FORMULA__SUBFORMULA = UNARY_FORMULA__SUBFORMULA;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR = UNARY_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporal Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR = UNARY_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEMPORAL_FORMULA__VALUE = UNARY_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unary Temporal Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TEMPORAL_FORMULA_FEATURE_COUNT = UNARY_FORMULA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.BinaryLogicFormulaImpl <em>Binary Logic Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.BinaryLogicFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryLogicFormula()
	 * @generated
	 */
	int BINARY_LOGIC_FORMULA = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_FORMULA__EXTENSIONS = BINARY_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Left Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_FORMULA__LEFT_SUBFORMULA = BINARY_FORMULA__LEFT_SUBFORMULA;

	/**
	 * The feature id for the '<em><b>Right Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_FORMULA__RIGHT_SUBFORMULA = BINARY_FORMULA__RIGHT_SUBFORMULA;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_FORMULA__OPERATOR = BINARY_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Logic Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_FORMULA_FEATURE_COUNT = BINARY_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl <em>Binary Temporal Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryTemporalFormula()
	 * @generated
	 */
	int BINARY_TEMPORAL_FORMULA = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA__EXTENSIONS = BINARY_FORMULA__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Left Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA__LEFT_SUBFORMULA = BINARY_FORMULA__LEFT_SUBFORMULA;

	/**
	 * The feature id for the '<em><b>Right Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA__RIGHT_SUBFORMULA = BINARY_FORMULA__RIGHT_SUBFORMULA;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR = BINARY_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporal Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR = BINARY_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA__VALUE = BINARY_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Temporal Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TEMPORAL_FORMULA_FEATURE_COUNT = BINARY_FORMULA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.TemporalFormulaImpl <em>Temporal Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.TemporalFormulaImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTemporalFormula()
	 * @generated
	 */
	int TEMPORAL_FORMULA = 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORMULA__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORMULA__COMPARISON_OPERATOR = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporal Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORMULA__TEMPORAL_OPERATOR = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORMULA__VALUE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Temporal Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FORMULA_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.TermImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 9;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.impl.AtomicPropositionImpl <em>Atomic Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.impl.AtomicPropositionImpl
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getAtomicProposition()
	 * @generated
	 */
	int ATOMIC_PROPOSITION = 10;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION__EXTENSIONS = TERM__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTL_FORMULA__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTL_FORMULA__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTL_FORMULA__FORMULA = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCTL Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTL_FORMULA_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.ComparisonOperator
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 12;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.BinaryLogicOperator <em>Binary Logic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicOperator
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryLogicOperator()
	 * @generated
	 */
	int BINARY_LOGIC_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.tctl.TemporalOperator <em>Temporal Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.tctl.TemporalOperator
	 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTemporalOperator()
	 * @generated
	 */
	int TEMPORAL_OPERATOR = 14;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.FormulaDefinition <em>Formula Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula Definition</em>'.
	 * @see org.muml.reconfigurationverification.tctl.FormulaDefinition
	 * @generated
	 */
	EClass getFormulaDefinition();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.TCTLFormula <em>TCTL Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCTL Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TCTLFormula
	 * @generated
	 */
	EClass getTCTLFormula();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.tctl.TCTLFormula#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TCTLFormula#getFormula()
	 * @see #getTCTLFormula()
	 * @generated
	 */
	EReference getTCTLFormula_Formula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.AtomicFormula <em>Atomic Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.AtomicFormula
	 * @generated
	 */
	EClass getAtomicFormula();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.tctl.AtomicFormula#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.muml.reconfigurationverification.tctl.AtomicFormula#getTerm()
	 * @see #getAtomicFormula()
	 * @generated
	 */
	EReference getAtomicFormula_Term();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.UnaryFormula <em>Unary Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.UnaryFormula
	 * @generated
	 */
	EClass getUnaryFormula();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.tctl.UnaryFormula#getSubformula <em>Subformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subformula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.UnaryFormula#getSubformula()
	 * @see #getUnaryFormula()
	 * @generated
	 */
	EReference getUnaryFormula_Subformula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.BinaryFormula <em>Binary Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryFormula
	 * @generated
	 */
	EClass getBinaryFormula();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.tctl.BinaryFormula#getLeftSubformula <em>Left Subformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Subformula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryFormula#getLeftSubformula()
	 * @see #getBinaryFormula()
	 * @generated
	 */
	EReference getBinaryFormula_LeftSubformula();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.tctl.BinaryFormula#getRightSubformula <em>Right Subformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Subformula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryFormula#getRightSubformula()
	 * @see #getBinaryFormula()
	 * @generated
	 */
	EReference getBinaryFormula_RightSubformula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.NotFormula <em>Not Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.NotFormula
	 * @generated
	 */
	EClass getNotFormula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.UnaryTemporalFormula <em>Unary Temporal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Temporal Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.UnaryTemporalFormula
	 * @generated
	 */
	EClass getUnaryTemporalFormula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.BinaryLogicFormula <em>Binary Logic Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logic Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicFormula
	 * @generated
	 */
	EClass getBinaryLogicFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.tctl.BinaryLogicFormula#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicFormula#getOperator()
	 * @see #getBinaryLogicFormula()
	 * @generated
	 */
	EAttribute getBinaryLogicFormula_Operator();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.BinaryTemporalFormula <em>Binary Temporal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Temporal Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryTemporalFormula
	 * @generated
	 */
	EClass getBinaryTemporalFormula();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.TemporalFormula <em>Temporal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Formula</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TemporalFormula
	 * @generated
	 */
	EClass getTemporalFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TemporalFormula#getComparisonOperator()
	 * @see #getTemporalFormula()
	 * @generated
	 */
	EAttribute getTemporalFormula_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getTemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal Operator</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TemporalFormula#getTemporalOperator()
	 * @see #getTemporalFormula()
	 * @generated
	 */
	EAttribute getTemporalFormula_TemporalOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.tctl.TemporalFormula#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TemporalFormula#getValue()
	 * @see #getTemporalFormula()
	 * @generated
	 */
	EAttribute getTemporalFormula_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.muml.reconfigurationverification.tctl.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.tctl.AtomicProposition <em>Atomic Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Proposition</em>'.
	 * @see org.muml.reconfigurationverification.tctl.AtomicProposition
	 * @generated
	 */
	EClass getAtomicProposition();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfigurationverification.tctl.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see org.muml.reconfigurationverification.tctl.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfigurationverification.tctl.BinaryLogicOperator <em>Binary Logic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Logic Operator</em>'.
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicOperator
	 * @generated
	 */
	EEnum getBinaryLogicOperator();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfigurationverification.tctl.TemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Operator</em>'.
	 * @see org.muml.reconfigurationverification.tctl.TemporalOperator
	 * @generated
	 */
	EEnum getTemporalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TctlFactory getTctlFactory();

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
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.FormulaDefinitionImpl <em>Formula Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.FormulaDefinitionImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getFormulaDefinition()
		 * @generated
		 */
		EClass FORMULA_DEFINITION = eINSTANCE.getFormulaDefinition();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.TCTLFormulaImpl <em>TCTL Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.TCTLFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTCTLFormula()
		 * @generated
		 */
		EClass TCTL_FORMULA = eINSTANCE.getTCTLFormula();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCTL_FORMULA__FORMULA = eINSTANCE.getTCTLFormula_Formula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.AtomicFormulaImpl <em>Atomic Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.AtomicFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getAtomicFormula()
		 * @generated
		 */
		EClass ATOMIC_FORMULA = eINSTANCE.getAtomicFormula();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_FORMULA__TERM = eINSTANCE.getAtomicFormula_Term();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.UnaryFormulaImpl <em>Unary Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.UnaryFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getUnaryFormula()
		 * @generated
		 */
		EClass UNARY_FORMULA = eINSTANCE.getUnaryFormula();

		/**
		 * The meta object literal for the '<em><b>Subformula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_FORMULA__SUBFORMULA = eINSTANCE.getUnaryFormula_Subformula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.BinaryFormulaImpl <em>Binary Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.BinaryFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryFormula()
		 * @generated
		 */
		EClass BINARY_FORMULA = eINSTANCE.getBinaryFormula();

		/**
		 * The meta object literal for the '<em><b>Left Subformula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_FORMULA__LEFT_SUBFORMULA = eINSTANCE.getBinaryFormula_LeftSubformula();

		/**
		 * The meta object literal for the '<em><b>Right Subformula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_FORMULA__RIGHT_SUBFORMULA = eINSTANCE.getBinaryFormula_RightSubformula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.NotFormulaImpl <em>Not Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.NotFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getNotFormula()
		 * @generated
		 */
		EClass NOT_FORMULA = eINSTANCE.getNotFormula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.UnaryTemporalFormulaImpl <em>Unary Temporal Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.UnaryTemporalFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getUnaryTemporalFormula()
		 * @generated
		 */
		EClass UNARY_TEMPORAL_FORMULA = eINSTANCE.getUnaryTemporalFormula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.BinaryLogicFormulaImpl <em>Binary Logic Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.BinaryLogicFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryLogicFormula()
		 * @generated
		 */
		EClass BINARY_LOGIC_FORMULA = eINSTANCE.getBinaryLogicFormula();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGIC_FORMULA__OPERATOR = eINSTANCE.getBinaryLogicFormula_Operator();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl <em>Binary Temporal Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryTemporalFormula()
		 * @generated
		 */
		EClass BINARY_TEMPORAL_FORMULA = eINSTANCE.getBinaryTemporalFormula();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.TemporalFormulaImpl <em>Temporal Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.TemporalFormulaImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTemporalFormula()
		 * @generated
		 */
		EClass TEMPORAL_FORMULA = eINSTANCE.getTemporalFormula();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_FORMULA__COMPARISON_OPERATOR = eINSTANCE.getTemporalFormula_ComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Temporal Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_FORMULA__TEMPORAL_OPERATOR = eINSTANCE.getTemporalFormula_TemporalOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_FORMULA__VALUE = eINSTANCE.getTemporalFormula_Value();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.TermImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.impl.AtomicPropositionImpl <em>Atomic Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.impl.AtomicPropositionImpl
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getAtomicProposition()
		 * @generated
		 */
		EClass ATOMIC_PROPOSITION = eINSTANCE.getAtomicProposition();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.ComparisonOperator
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.BinaryLogicOperator <em>Binary Logic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.BinaryLogicOperator
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getBinaryLogicOperator()
		 * @generated
		 */
		EEnum BINARY_LOGIC_OPERATOR = eINSTANCE.getBinaryLogicOperator();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.tctl.TemporalOperator <em>Temporal Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.tctl.TemporalOperator
		 * @see org.muml.reconfigurationverification.tctl.impl.TctlPackageImpl#getTemporalOperator()
		 * @generated
		 */
		EEnum TEMPORAL_OPERATOR = eINSTANCE.getTemporalOperator();

	}

} //TctlPackage

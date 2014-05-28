/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory
 * @model kind="package"
 * @generated
 */
public interface QuantifiersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Quantifiers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Quantifiers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Quantifiers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantifiersPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TemporalQuantifierExprImpl <em>Temporal Quantifier Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TemporalQuantifierExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTemporalQuantifierExpr()
	 * @generated
	 */
	int TEMPORAL_QUANTIFIER_EXPR = 7;

	/**
	 * The number of structural features of the '<em>Temporal Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AFExprImpl <em>AF Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AFExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAFExpr()
	 * @generated
	 */
	int AF_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AF_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AGExprImpl <em>AG Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AGExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAGExpr()
	 * @generated
	 */
	int AG_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AG_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EFExprImpl <em>EF Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EFExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEFExpr()
	 * @generated
	 */
	int EF_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EF Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EF_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EGExprImpl <em>EG Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EGExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEGExpr()
	 * @generated
	 */
	int EG_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR__EXPR = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EG Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifierExprImpl <em>Quantifier Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifierExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getQuantifierExpr()
	 * @generated
	 */
	int QUANTIFIER_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__FORMULA = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR__VAR = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantifier Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.ExistenceQuantExprImpl <em>Existence Quant Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.ExistenceQuantExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getExistenceQuantExpr()
	 * @generated
	 */
	int EXISTENCE_QUANT_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__FORMULA = QUANTIFIER_EXPR__FORMULA;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR__VAR = QUANTIFIER_EXPR__VAR;

	/**
	 * The number of structural features of the '<em>Existence Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR_FEATURE_COUNT = QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existence Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_QUANT_EXPR_OPERATION_COUNT = QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.BoundVariableImpl <em>Bound Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.BoundVariableImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getBoundVariable()
	 * @generated
	 */
	int BOUND_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__SET = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE__NAME = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bound Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bound Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_VARIABLE_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.UniversalQuantExprImpl <em>Universal Quant Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.UniversalQuantExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getUniversalQuantExpr()
	 * @generated
	 */
	int UNIVERSAL_QUANT_EXPR = 8;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__FORMULA = QUANTIFIER_EXPR__FORMULA;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR__VAR = QUANTIFIER_EXPR__VAR;

	/**
	 * The number of structural features of the '<em>Universal Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR_FEATURE_COUNT = QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Universal Quant Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANT_EXPR_OPERATION_COUNT = QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.LeadsToExprImpl <em>Leads To Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.LeadsToExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getLeadsToExpr()
	 * @generated
	 */
	int LEADS_TO_EXPR = 9;

	/**
	 * The feature id for the '<em><b>Left Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__LEFT_OPD = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR__RIGHT_OPD = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leads To Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Leads To Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TimeIntervalExprImpl <em>Time Interval Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TimeIntervalExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTimeIntervalExpr()
	 * @generated
	 */
	int TIME_INTERVAL_EXPR = 10;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__LHS = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__LOWER = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__UPPER = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR__RHS = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Interval Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR_FEATURE_COUNT = TEMPORAL_QUANTIFIER_EXPR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Time Interval Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_EXPR_OPERATION_COUNT = TEMPORAL_QUANTIFIER_EXPR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr <em>AF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AF Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr
	 * @generated
	 */
	EClass getAFExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr#getExpr()
	 * @see #getAFExpr()
	 * @generated
	 */
	EReference getAFExpr_Expr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr <em>AG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AG Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr
	 * @generated
	 */
	EClass getAGExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr#getExpr()
	 * @see #getAGExpr()
	 * @generated
	 */
	EReference getAGExpr_Expr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr <em>EF Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EF Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr
	 * @generated
	 */
	EClass getEFExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr#getExpr()
	 * @see #getEFExpr()
	 * @generated
	 */
	EReference getEFExpr_Expr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr <em>EG Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr
	 * @generated
	 */
	EClass getEGExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr#getExpr()
	 * @see #getEGExpr()
	 * @generated
	 */
	EReference getEGExpr_Expr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.ExistenceQuantExpr <em>Existence Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Quant Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.ExistenceQuantExpr
	 * @generated
	 */
	EClass getExistenceQuantExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr <em>Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr
	 * @generated
	 */
	EClass getQuantifierExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr#getFormula()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EReference getQuantifierExpr_Formula();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr#getVar()
	 * @see #getQuantifierExpr()
	 * @generated
	 */
	EReference getQuantifierExpr_Var();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable <em>Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Variable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable
	 * @generated
	 */
	EClass getBoundVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable#getSet()
	 * @see #getBoundVariable()
	 * @generated
	 */
	EReference getBoundVariable_Set();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable#getName()
	 * @see #getBoundVariable()
	 * @generated
	 */
	EAttribute getBoundVariable_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr <em>Temporal Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Quantifier Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr
	 * @generated
	 */
	EClass getTemporalQuantifierExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.UniversalQuantExpr <em>Universal Quant Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Quant Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.UniversalQuantExpr
	 * @generated
	 */
	EClass getUniversalQuantExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr <em>Leads To Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leads To Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr
	 * @generated
	 */
	EClass getLeadsToExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr#getLeftOpd <em>Left Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr#getLeftOpd()
	 * @see #getLeadsToExpr()
	 * @generated
	 */
	EReference getLeadsToExpr_LeftOpd();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr#getRightOpd <em>Right Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr#getRightOpd()
	 * @see #getLeadsToExpr()
	 * @generated
	 */
	EReference getLeadsToExpr_RightOpd();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr <em>Time Interval Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr
	 * @generated
	 */
	EClass getTimeIntervalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getLhs()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EReference getTimeIntervalExpr_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getLower()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EAttribute getTimeIntervalExpr_Lower();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getUpper()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EAttribute getTimeIntervalExpr_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr#getRhs()
	 * @see #getTimeIntervalExpr()
	 * @generated
	 */
	EReference getTimeIntervalExpr_Rhs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuantifiersFactory getQuantifiersFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AFExprImpl <em>AF Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AFExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAFExpr()
		 * @generated
		 */
		EClass AF_EXPR = eINSTANCE.getAFExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AF_EXPR__EXPR = eINSTANCE.getAFExpr_Expr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AGExprImpl <em>AG Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.AGExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getAGExpr()
		 * @generated
		 */
		EClass AG_EXPR = eINSTANCE.getAGExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AG_EXPR__EXPR = eINSTANCE.getAGExpr_Expr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EFExprImpl <em>EF Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EFExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEFExpr()
		 * @generated
		 */
		EClass EF_EXPR = eINSTANCE.getEFExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EF_EXPR__EXPR = eINSTANCE.getEFExpr_Expr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EGExprImpl <em>EG Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.EGExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getEGExpr()
		 * @generated
		 */
		EClass EG_EXPR = eINSTANCE.getEGExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EG_EXPR__EXPR = eINSTANCE.getEGExpr_Expr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.ExistenceQuantExprImpl <em>Existence Quant Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.ExistenceQuantExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getExistenceQuantExpr()
		 * @generated
		 */
		EClass EXISTENCE_QUANT_EXPR = eINSTANCE.getExistenceQuantExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifierExprImpl <em>Quantifier Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifierExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getQuantifierExpr()
		 * @generated
		 */
		EClass QUANTIFIER_EXPR = eINSTANCE.getQuantifierExpr();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPR__FORMULA = eINSTANCE.getQuantifierExpr_Formula();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER_EXPR__VAR = eINSTANCE.getQuantifierExpr_Var();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.BoundVariableImpl <em>Bound Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.BoundVariableImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getBoundVariable()
		 * @generated
		 */
		EClass BOUND_VARIABLE = eINSTANCE.getBoundVariable();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_VARIABLE__SET = eINSTANCE.getBoundVariable_Set();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND_VARIABLE__NAME = eINSTANCE.getBoundVariable_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TemporalQuantifierExprImpl <em>Temporal Quantifier Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TemporalQuantifierExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTemporalQuantifierExpr()
		 * @generated
		 */
		EClass TEMPORAL_QUANTIFIER_EXPR = eINSTANCE.getTemporalQuantifierExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.UniversalQuantExprImpl <em>Universal Quant Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.UniversalQuantExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getUniversalQuantExpr()
		 * @generated
		 */
		EClass UNIVERSAL_QUANT_EXPR = eINSTANCE.getUniversalQuantExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.LeadsToExprImpl <em>Leads To Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.LeadsToExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getLeadsToExpr()
		 * @generated
		 */
		EClass LEADS_TO_EXPR = eINSTANCE.getLeadsToExpr();

		/**
		 * The meta object literal for the '<em><b>Left Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADS_TO_EXPR__LEFT_OPD = eINSTANCE.getLeadsToExpr_LeftOpd();

		/**
		 * The meta object literal for the '<em><b>Right Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADS_TO_EXPR__RIGHT_OPD = eINSTANCE.getLeadsToExpr_RightOpd();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TimeIntervalExprImpl <em>Time Interval Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.TimeIntervalExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl#getTimeIntervalExpr()
		 * @generated
		 */
		EClass TIME_INTERVAL_EXPR = eINSTANCE.getTimeIntervalExpr();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL_EXPR__LHS = eINSTANCE.getTimeIntervalExpr_Lhs();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL_EXPR__LOWER = eINSTANCE.getTimeIntervalExpr_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL_EXPR__UPPER = eINSTANCE.getTimeIntervalExpr_Upper();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL_EXPR__RHS = eINSTANCE.getTimeIntervalExpr_Rhs();

	}

} //QuantifiersPackage

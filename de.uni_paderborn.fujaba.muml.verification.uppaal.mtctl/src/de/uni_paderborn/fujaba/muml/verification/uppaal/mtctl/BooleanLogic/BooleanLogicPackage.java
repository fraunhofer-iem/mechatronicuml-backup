/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

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
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicFactory
 * @model kind="package"
 * @generated
 */
public interface BooleanLogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BooleanLogic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/BooleanLogic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BooleanLogic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleanLogicPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.AndExprImpl <em>And Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.AndExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getAndExpr()
	 * @generated
	 */
	int AND_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Left Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__LEFT_OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__RIGHT_OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.ImplyExprImpl <em>Imply Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.ImplyExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getImplyExpr()
	 * @generated
	 */
	int IMPLY_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Left Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPR__LEFT_OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPR__RIGHT_OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imply Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Imply Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLY_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.NotExprImpl <em>Not Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.NotExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getNotExpr()
	 * @generated
	 */
	int NOT_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPR__OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.OrExprImpl <em>Or Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.OrExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getOrExpr()
	 * @generated
	 */
	int OR_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Left Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR__LEFT_OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR__RIGHT_OPD = MtctlPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr <em>And Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr
	 * @generated
	 */
	EClass getAndExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr#getLeftOpd <em>Left Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr#getLeftOpd()
	 * @see #getAndExpr()
	 * @generated
	 */
	EReference getAndExpr_LeftOpd();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr#getRightOpd <em>Right Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr#getRightOpd()
	 * @see #getAndExpr()
	 * @generated
	 */
	EReference getAndExpr_RightOpd();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr <em>Imply Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imply Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr
	 * @generated
	 */
	EClass getImplyExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr#getLeftOpd <em>Left Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr#getLeftOpd()
	 * @see #getImplyExpr()
	 * @generated
	 */
	EReference getImplyExpr_LeftOpd();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr#getRightOpd <em>Right Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr#getRightOpd()
	 * @see #getImplyExpr()
	 * @generated
	 */
	EReference getImplyExpr_RightOpd();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr <em>Not Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr
	 * @generated
	 */
	EClass getNotExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr#getOpd()
	 * @see #getNotExpr()
	 * @generated
	 */
	EReference getNotExpr_Opd();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr <em>Or Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr
	 * @generated
	 */
	EClass getOrExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr#getLeftOpd <em>Left Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr#getLeftOpd()
	 * @see #getOrExpr()
	 * @generated
	 */
	EReference getOrExpr_LeftOpd();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr#getRightOpd <em>Right Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Opd</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr#getRightOpd()
	 * @see #getOrExpr()
	 * @generated
	 */
	EReference getOrExpr_RightOpd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BooleanLogicFactory getBooleanLogicFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.AndExprImpl <em>And Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.AndExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getAndExpr()
		 * @generated
		 */
		EClass AND_EXPR = eINSTANCE.getAndExpr();

		/**
		 * The meta object literal for the '<em><b>Left Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPR__LEFT_OPD = eINSTANCE.getAndExpr_LeftOpd();

		/**
		 * The meta object literal for the '<em><b>Right Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPR__RIGHT_OPD = eINSTANCE.getAndExpr_RightOpd();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.ImplyExprImpl <em>Imply Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.ImplyExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getImplyExpr()
		 * @generated
		 */
		EClass IMPLY_EXPR = eINSTANCE.getImplyExpr();

		/**
		 * The meta object literal for the '<em><b>Left Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLY_EXPR__LEFT_OPD = eINSTANCE.getImplyExpr_LeftOpd();

		/**
		 * The meta object literal for the '<em><b>Right Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLY_EXPR__RIGHT_OPD = eINSTANCE.getImplyExpr_RightOpd();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.NotExprImpl <em>Not Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.NotExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getNotExpr()
		 * @generated
		 */
		EClass NOT_EXPR = eINSTANCE.getNotExpr();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPR__OPD = eINSTANCE.getNotExpr_Opd();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.OrExprImpl <em>Or Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.OrExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl#getOrExpr()
		 * @generated
		 */
		EClass OR_EXPR = eINSTANCE.getOrExpr();

		/**
		 * The meta object literal for the '<em><b>Left Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPR__LEFT_OPD = eINSTANCE.getOrExpr_LeftOpd();

		/**
		 * The meta object literal for the '<em><b>Right Opd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPR__RIGHT_OPD = eINSTANCE.getOrExpr_RightOpd();

	}

} //BooleanLogicPackage

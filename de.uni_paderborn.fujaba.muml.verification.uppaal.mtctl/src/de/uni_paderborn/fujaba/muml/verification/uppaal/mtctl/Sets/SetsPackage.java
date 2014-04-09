/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsFactory
 * @model kind="package"
 * @generated
 */
public interface SetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Sets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Sets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Sets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetsPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetExprImpl <em>Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getSetExpr()
	 * @generated
	 */
	int SET_EXPR = 0;

	/**
	 * The number of structural features of the '<em>Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.ClockSetExprImpl <em>Clock Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.ClockSetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getClockSetExpr()
	 * @generated
	 */
	int CLOCK_SET_EXPR = 1;

	/**
	 * The number of structural features of the '<em>Clock Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SET_EXPR_FEATURE_COUNT = SET_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clock Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SET_EXPR_OPERATION_COUNT = SET_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.IntervalSetExprImpl <em>Interval Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.IntervalSetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getIntervalSetExpr()
	 * @generated
	 */
	int INTERVAL_SET_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Lower Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SET_EXPR__LOWER_VAL = SET_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SET_EXPR__UPPER_VAL = SET_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SET_EXPR_FEATURE_COUNT = SET_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interval Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SET_EXPR_OPERATION_COUNT = SET_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.MessageSetExprImpl <em>Message Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.MessageSetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getMessageSetExpr()
	 * @generated
	 */
	int MESSAGE_SET_EXPR = 3;

	/**
	 * The number of structural features of the '<em>Message Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_EXPR_FEATURE_COUNT = SET_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_EXPR_OPERATION_COUNT = SET_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.StateSetExprImpl <em>State Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.StateSetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getStateSetExpr()
	 * @generated
	 */
	int STATE_SET_EXPR = 4;

	/**
	 * The number of structural features of the '<em>State Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SET_EXPR_FEATURE_COUNT = SET_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SET_EXPR_OPERATION_COUNT = SET_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.TransitionSetExprImpl <em>Transition Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.TransitionSetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getTransitionSetExpr()
	 * @generated
	 */
	int TRANSITION_SET_EXPR = 5;

	/**
	 * The number of structural features of the '<em>Transition Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SET_EXPR_FEATURE_COUNT = SET_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SET_EXPR_OPERATION_COUNT = SET_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.BufferSetExprImpl <em>Buffer Set Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.BufferSetExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getBufferSetExpr()
	 * @generated
	 */
	int BUFFER_SET_EXPR = 6;

	/**
	 * The number of structural features of the '<em>Buffer Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SET_EXPR_FEATURE_COUNT = SET_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buffer Set Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SET_EXPR_OPERATION_COUNT = SET_EXPR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetExpr <em>Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetExpr
	 * @generated
	 */
	EClass getSetExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr <em>Clock Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr
	 * @generated
	 */
	EClass getClockSetExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr <em>Interval Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr
	 * @generated
	 */
	EClass getIntervalSetExpr();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr#getLowerVal <em>Lower Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Val</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr#getLowerVal()
	 * @see #getIntervalSetExpr()
	 * @generated
	 */
	EAttribute getIntervalSetExpr_LowerVal();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr#getUpperVal <em>Upper Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Val</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr#getUpperVal()
	 * @see #getIntervalSetExpr()
	 * @generated
	 */
	EAttribute getIntervalSetExpr_UpperVal();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr <em>Message Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr
	 * @generated
	 */
	EClass getMessageSetExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr <em>State Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr
	 * @generated
	 */
	EClass getStateSetExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr <em>Transition Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr
	 * @generated
	 */
	EClass getTransitionSetExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr <em>Buffer Set Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Set Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr
	 * @generated
	 */
	EClass getBufferSetExpr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SetsFactory getSetsFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetExprImpl <em>Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getSetExpr()
		 * @generated
		 */
		EClass SET_EXPR = eINSTANCE.getSetExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.ClockSetExprImpl <em>Clock Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.ClockSetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getClockSetExpr()
		 * @generated
		 */
		EClass CLOCK_SET_EXPR = eINSTANCE.getClockSetExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.IntervalSetExprImpl <em>Interval Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.IntervalSetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getIntervalSetExpr()
		 * @generated
		 */
		EClass INTERVAL_SET_EXPR = eINSTANCE.getIntervalSetExpr();

		/**
		 * The meta object literal for the '<em><b>Lower Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_SET_EXPR__LOWER_VAL = eINSTANCE.getIntervalSetExpr_LowerVal();

		/**
		 * The meta object literal for the '<em><b>Upper Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_SET_EXPR__UPPER_VAL = eINSTANCE.getIntervalSetExpr_UpperVal();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.MessageSetExprImpl <em>Message Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.MessageSetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getMessageSetExpr()
		 * @generated
		 */
		EClass MESSAGE_SET_EXPR = eINSTANCE.getMessageSetExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.StateSetExprImpl <em>State Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.StateSetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getStateSetExpr()
		 * @generated
		 */
		EClass STATE_SET_EXPR = eINSTANCE.getStateSetExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.TransitionSetExprImpl <em>Transition Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.TransitionSetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getTransitionSetExpr()
		 * @generated
		 */
		EClass TRANSITION_SET_EXPR = eINSTANCE.getTransitionSetExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.BufferSetExprImpl <em>Buffer Set Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.BufferSetExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl#getBufferSetExpr()
		 * @generated
		 */
		EClass BUFFER_SET_EXPR = eINSTANCE.getBufferSetExpr();

	}

} //SetsPackage

/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables;

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
 * <!-- begin-model-doc -->
 * Contains expressions that can be used in a ComparisonExpr
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory
 * @model kind="package"
 * @generated
 */
public interface ComparablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Comparables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_paderborn.de/fujaba/muml/verification/uppaal/Mtctl/Comparables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Comparables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparablesPackage eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl <em>Map Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMapExpr()
	 * @generated
	 */
	int MAP_EXPR = 2;

	/**
	 * The number of structural features of the '<em>Map Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_FEATURE_COUNT = MtctlPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_OPERATION_COUNT = MtctlPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl <em>Buffer Msg Count Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getBufferMsgCountExpr()
	 * @generated
	 */
	int BUFFER_MSG_COUNT_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR__BUFFER = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffer Msg Count Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Buffer Msg Count Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_MSG_COUNT_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl <em>Const Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getConstExpr()
	 * @generated
	 */
	int CONST_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__VAL = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__TIME_UNIT = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl <em>Muml Elem Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMumlElemExpr()
	 * @generated
	 */
	int MUML_ELEM_EXPR = 3;

	/**
	 * The feature id for the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__ELEM = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR__CONNECTOR_ENDPOINT_INSTANCE = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Muml Elem Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Muml Elem Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_ELEM_EXPR_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl <em>Transition Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTransitionMap()
	 * @generated
	 */
	int TRANSITION_MAP = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP__TRANSITION = MAP_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP_FEATURE_COUNT = MAP_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MAP_OPERATION_COUNT = MAP_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl <em>Source State Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getSourceStateExpr()
	 * @generated
	 */
	int SOURCE_STATE_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR__TRANSITION = TRANSITION_MAP__TRANSITION;

	/**
	 * The number of structural features of the '<em>Source State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR_FEATURE_COUNT = TRANSITION_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STATE_EXPR_OPERATION_COUNT = TRANSITION_MAP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl <em>Target State Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTargetStateExpr()
	 * @generated
	 */
	int TARGET_STATE_EXPR = 6;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR__TRANSITION = TRANSITION_MAP__TRANSITION;

	/**
	 * The number of structural features of the '<em>Target State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR_FEATURE_COUNT = TRANSITION_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target State Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_STATE_EXPR_OPERATION_COUNT = TRANSITION_MAP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr <em>Buffer Msg Count Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Msg Count Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr
	 * @generated
	 */
	EClass getBufferMsgCountExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr#getBuffer()
	 * @see #getBufferMsgCountExpr()
	 * @generated
	 */
	EReference getBufferMsgCountExpr_Buffer();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr <em>Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr
	 * @generated
	 */
	EClass getConstExpr();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr#getVal()
	 * @see #getConstExpr()
	 * @generated
	 */
	EAttribute getConstExpr_Val();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr#getTimeUnit()
	 * @see #getConstExpr()
	 * @generated
	 */
	EAttribute getConstExpr_TimeUnit();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr <em>Map Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr
	 * @generated
	 */
	EClass getMapExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr <em>Muml Elem Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muml Elem Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr
	 * @generated
	 */
	EClass getMumlElemExpr();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getElem <em>Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elem</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getElem()
	 * @see #getMumlElemExpr()
	 * @generated
	 */
	EReference getMumlElemExpr_Elem();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getConnectorEndpointInstance <em>Connector Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector Endpoint Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getConnectorEndpointInstance()
	 * @see #getMumlElemExpr()
	 * @generated
	 */
	EReference getMumlElemExpr_ConnectorEndpointInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap <em>Transition Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Map</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap
	 * @generated
	 */
	EClass getTransitionMap();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap#getTransition()
	 * @see #getTransitionMap()
	 * @generated
	 */
	EReference getTransitionMap_Transition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr <em>Source State Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source State Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr
	 * @generated
	 */
	EClass getSourceStateExpr();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr <em>Target State Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target State Expr</em>'.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr
	 * @generated
	 */
	EClass getTargetStateExpr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComparablesFactory getComparablesFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl <em>Buffer Msg Count Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getBufferMsgCountExpr()
		 * @generated
		 */
		EClass BUFFER_MSG_COUNT_EXPR = eINSTANCE.getBufferMsgCountExpr();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_MSG_COUNT_EXPR__BUFFER = eINSTANCE.getBufferMsgCountExpr_Buffer();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl <em>Const Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ConstExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getConstExpr()
		 * @generated
		 */
		EClass CONST_EXPR = eINSTANCE.getConstExpr();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_EXPR__VAL = eINSTANCE.getConstExpr_Val();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_EXPR__TIME_UNIT = eINSTANCE.getConstExpr_TimeUnit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl <em>Map Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MapExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMapExpr()
		 * @generated
		 */
		EClass MAP_EXPR = eINSTANCE.getMapExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl <em>Muml Elem Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getMumlElemExpr()
		 * @generated
		 */
		EClass MUML_ELEM_EXPR = eINSTANCE.getMumlElemExpr();

		/**
		 * The meta object literal for the '<em><b>Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUML_ELEM_EXPR__ELEM = eINSTANCE.getMumlElemExpr_Elem();

		/**
		 * The meta object literal for the '<em><b>Connector Endpoint Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUML_ELEM_EXPR__CONNECTOR_ENDPOINT_INSTANCE = eINSTANCE.getMumlElemExpr_ConnectorEndpointInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl <em>Transition Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TransitionMapImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTransitionMap()
		 * @generated
		 */
		EClass TRANSITION_MAP = eINSTANCE.getTransitionMap();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_MAP__TRANSITION = eINSTANCE.getTransitionMap_Transition();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl <em>Source State Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.SourceStateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getSourceStateExpr()
		 * @generated
		 */
		EClass SOURCE_STATE_EXPR = eINSTANCE.getSourceStateExpr();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl <em>Target State Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.TargetStateExprImpl
		 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl#getTargetStateExpr()
		 * @generated
		 */
		EClass TARGET_STATE_EXPR = eINSTANCE.getTargetStateExpr();

	}

} //ComparablesPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;

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
 * @see org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Behavior_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/simulink/adapter/corrmodel/behavior/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Behavior_modelPackage eINSTANCE = org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.RtScCat2SfMImpl <em>Rt Sc Cat2 Sf M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.RtScCat2SfMImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getRtScCat2SfM()
	 * @generated
	 */
	int RT_SC_CAT2_SF_M = 0;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_SC_CAT2_SF_M__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf M</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_SC_CAT2_SF_M__SF_M = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rt Sc Cat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_SC_CAT2_SF_M__RT_SC_CAT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rt Sc Cat2 Sf M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_SC_CAT2_SF_M_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl <em>FRt Sc2 Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getFRtSc2Chart()
	 * @generated
	 */
	int FRT_SC2_CHART = 1;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__CHART = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FRt Sc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__FRT_SC = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mt par</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__MT_PAR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sf Chart State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__SF_CHART_STATE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sf Chart Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__SF_CHART_REGION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sf Queue Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__SF_QUEUE_REGION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sf Self Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART__SF_SELF_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>FRt Sc2 Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRT_SC2_CHART_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScState2SfStateImpl <em>Sc State2 Sf State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScState2SfStateImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScState2SfState()
	 * @generated
	 */
	int SC_STATE2_SF_STATE = 2;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_STATE2_SF_STATE__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_STATE2_SF_STATE__SC_STATE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_STATE2_SF_STATE__SF_STATE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sc State2 Sf State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_STATE2_SF_STATE_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScTrans2SfTransImpl <em>Sc Trans2 Sf Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScTrans2SfTransImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScTrans2SfTrans()
	 * @generated
	 */
	int SC_TRANS2_SF_TRANS = 3;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_TRANS2_SF_TRANS__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_TRANS2_SF_TRANS__SC_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_TRANS2_SF_TRANS__SF_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_TRANS2_SF_TRANS__SC_REG = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sc Trans2 Sf Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_TRANS2_SF_TRANS_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScRegion2sfParallelImpl <em>Sc Region2sf Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScRegion2sfParallelImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScRegion2sfParallel()
	 * @generated
	 */
	int SC_REGION2SF_PARALLEL = 4;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_REGION2SF_PARALLEL__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_REGION2SF_PARALLEL__SC_REGION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Parallel State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Reg Rtsc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_REGION2SF_PARALLEL__SC_REG_RTSC = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sc Region2sf Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_REGION2SF_PARALLEL_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl <em>Sc Entry2sf Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScEntry2sfEntry()
	 * @generated
	 */
	int SC_ENTRY2SF_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Entry Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sc Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY__SC_EXPR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY__SC_CLOCK = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sc Entry2sf Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ENTRY2SF_ENTRY_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl <em>Sc Exit2sf Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScExit2sfExit()
	 * @generated
	 */
	int SC_EXIT2SF_EXIT = 6;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Exit Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT__SC_EXIT_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT__SC_EXIT_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Exit Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT__SC_EXIT_EXPR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sf Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT__SF_EXIT_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT__SC_CLOCK = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sc Exit2sf Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_EXIT2SF_EXIT_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl <em>Sc St En Point2sf Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScStEnPoint2sfTrans()
	 * @generated
	 */
	int SC_ST_EN_POINT2SF_TRANS = 7;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EN_POINT2SF_TRANS__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EN_POINT2SF_TRANS__SF_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc In Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Out Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sc State Entry P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sc St En Point2sf Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EN_POINT2SF_TRANS_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStExPoint2sfTransImpl <em>Sc St Ex Point2sf Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScStExPoint2sfTransImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScStExPoint2sfTrans()
	 * @generated
	 */
	int SC_ST_EX_POINT2SF_TRANS = 8;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EX_POINT2SF_TRANS__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EX_POINT2SF_TRANS__SF_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Out Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc In Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sc St Ex Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sc St Ex Point2sf Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ST_EX_POINT2SF_TRANS_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncChannel2sfSignalImpl <em>Sc Sync Channel2sf Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncChannel2sfSignalImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncChannel2sfSignal()
	 * @generated
	 */
	int SC_SYNC_CHANNEL2SF_SIGNAL = 9;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_CHANNEL2SF_SIGNAL__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Sync Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Sync Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sc Sync Channel2sf Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_CHANNEL2SF_SIGNAL_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl <em>Sc Sync Receive Action2sf Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncReceiveAction2sfAction()
	 * @generated
	 */
	int SC_SYNC_RECEIVE_ACTION2SF_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE_ACTION2SF_ACTION__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Action Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sc Sync Receive Action2sf Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE_ACTION2SF_ACTION_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl <em>Sc Sync Receive2sf Sync Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncReceive2sfSyncReceive()
	 * @generated
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE = 11;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Sync Receive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sf Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sf Trans Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sc Sync Receive2sf Sync Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_RECEIVE2SF_SYNC_RECEIVE_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl <em>sc Sync Send2sf Sync Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscSyncSend2sfSyncSend()
	 * @generated
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND = 12;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Trans Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sc Ann Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>sc Sync Send2sf Sync Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_SEND2SF_SYNC_SEND_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncPara2sfSyncParaDataImpl <em>Sc Sync Para2sf Sync Para Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncPara2sfSyncParaDataImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncPara2sfSyncParaData()
	 * @generated
	 */
	int SC_SYNC_PARA2SF_SYNC_PARA_DATA = 13;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_PARA2SF_SYNC_PARA_DATA__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The number of structural features of the '<em>Sc Sync Para2sf Sync Para Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SYNC_PARA2SF_SYNC_PARA_DATA_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.MT_Par2MTDImpl <em>MT Par2 MTD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.MT_Par2MTDImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getMT_Par2MTD()
	 * @generated
	 */
	int MT_PAR2_MTD = 14;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_PAR2_MTD__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Mt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_PAR2_MTD__MT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_PAR2_MTD__PAR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_PAR2_MTD__DATA = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MT Par2 MTD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_PAR2_MTD_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl <em>sc Attribute2sf Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAttribute2sfData()
	 * @generated
	 */
	int SC_ATTRIBUTE2SF_DATA = 15;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ATTRIBUTE2SF_DATA__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ATTRIBUTE2SF_DATA__SF_DATA = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ATTRIBUTE2SF_DATA__SC_TYPE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sc Attr Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>sc Attribute2sf Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ATTRIBUTE2SF_DATA_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendAsync2sfTransActionImpl <em>sc Send Async2sf Trans Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scSendAsync2sfTransActionImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscSendAsync2sfTransAction()
	 * @generated
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Send Async</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sc Para</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Par Bind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>sc Send Async2sf Trans Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_ASYNC2SF_TRANS_ACTION_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl <em>sc Send Para Bind2sf Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscSendParaBind2sfAction()
	 * @generated
	 */
	int SC_SEND_PARA_BIND2SF_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_PARA_BIND2SF_ACTION__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Para BAction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>sc Send Para Bind2sf Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_SEND_PARA_BIND2SF_ACTION_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncSend2sfActionImpl <em>sc Async Send2sf Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncSend2sfActionImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAsyncSend2sfAction()
	 * @generated
	 */
	int SC_ASYNC_SEND2SF_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_SEND2SF_ACTION__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Enq Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_SEND2SF_ACTION__EANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EString To String Map Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>sc Async Send2sf Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_SEND2SF_ACTION_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl <em>sc Async Rec2sf Async Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAsyncRec2sfAsyncGuard()
	 * @generated
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD = 19;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Guard Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asynchronous Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Async Rec Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>sc Async Rec2sf Async Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_ASYNC_GUARD_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scClock2sfDataImpl <em>sc Clock2sf Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scClock2sfDataImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscClock2sfData()
	 * @generated
	 */
	int SC_CLOCK2SF_DATA = 20;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK2SF_DATA__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK2SF_DATA__SC_CLOCK = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Clock Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>sc Clock2sf Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK2SF_DATA_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scClockConstr2sfGuardImpl <em>sc Clock Constr2sf Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scClockConstr2sfGuardImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscClockConstr2sfGuard()
	 * @generated
	 */
	int SC_CLOCK_CONSTR2SF_GUARD = 21;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK_CONSTR2SF_GUARD__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Clock Constr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sf Clock Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>sc Clock Constr2sf Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CLOCK_CONSTR2SF_GUARD_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.clock2ClockResetImpl <em>clock2 Clock Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.clock2ClockResetImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getclock2ClockReset()
	 * @generated
	 */
	int CLOCK2_CLOCK_RESET = 22;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK2_CLOCK_RESET__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK2_CLOCK_RESET__SC_CLOCK = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Clock Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK2_CLOCK_RESET__SF_CLOCK_RESET = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>clock2 Clock Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK2_CLOCK_RESET_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl <em>sc Invariant2sf Inv Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscInvariant2sfInvError()
	 * @generated
	 */
	int SC_INVARIANT2SF_INV_ERROR = 23;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Bound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__SC_BOUND = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__SC_CLOCK = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sf Inv Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sf Inv Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sf Inv Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>sc Invariant2sf Inv Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_INVARIANT2SF_INV_ERROR_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scGuard2sfGuardImpl <em>sc Guard2sf Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scGuard2sfGuardImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscGuard2sfGuard()
	 * @generated
	 */
	int SC_GUARD2SF_GUARD = 24;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GUARD2SF_GUARD__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sf Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GUARD2SF_GUARD__SF_GUARD = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GUARD2SF_GUARD__SC_ANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GUARD2SF_GUARD__SC_DETAILS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>sc Guard2sf Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GUARD2SF_GUARD_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAction2sfActionImpl <em>sc Action2sf Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAction2sfActionImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAction2sfAction()
	 * @generated
	 */
	int SC_ACTION2SF_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION2SF_ACTION__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION2SF_ACTION__SC_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION2SF_ACTION__SF_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Action Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION2SF_ACTION__SC_ACTION_EXPR = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>sc Action2sf Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION2SF_ACTION_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl <em>sc Op2sf Emb Func</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscOp2sfEmbFunc()
	 * @generated
	 */
	int SC_OP2SF_EMB_FUNC = 26;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP2SF_EMB_FUNC__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP2SF_EMB_FUNC__SC_OPERATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Emb Func</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP2SF_EMB_FUNC__SF_EMB_FUNC = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP2SF_EMB_FUNC__SC_ANNOTATION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sc Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP2SF_EMB_FUNC__SC_DETAILS = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>sc Op2sf Emb Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP2SF_EMB_FUNC_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOpData2sfEmbFuncDataImpl <em>sc Op Data2sf Emb Func Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scOpData2sfEmbFuncDataImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscOpData2sfEmbFuncData()
	 * @generated
	 */
	int SC_OP_DATA2SF_EMB_FUNC_DATA = 27;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP_DATA2SF_EMB_FUNC_DATA__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sc Para Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>sc Op Data2sf Emb Func Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_OP_DATA2SF_EMB_FUNC_DATA_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfDequeueImpl <em>sc Async Rec2sf Dequeue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfDequeueImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAsyncRec2sfDequeue()
	 * @generated
	 */
	int SC_ASYNC_REC2SF_DEQUEUE = 28;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_DEQUEUE__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Details Dequeue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sc Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>sc Async Rec2sf Dequeue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ASYNC_REC2SF_DEQUEUE_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scActionSelfTrans2sfActionImpl <em>sc Action Self Trans2sf Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scActionSelfTrans2sfActionImpl
	 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscActionSelfTrans2sfAction()
	 * @generated
	 */
	int SC_ACTION_SELF_TRANS2SF_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION_SELF_TRANS2SF_ACTION__CHILD_CORRESP = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Sc Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION_SELF_TRANS2SF_ACTION__SC_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION_SELF_TRANS2SF_ACTION__SF_ACTION = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>sc Action Self Trans2sf Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_ACTION_SELF_TRANS2SF_ACTION_FEATURE_COUNT = Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM <em>Rt Sc Cat2 Sf M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rt Sc Cat2 Sf M</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM
	 * @generated
	 */
	EClass getRtScCat2SfM();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM#getSfM <em>Sf M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf M</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM#getSfM()
	 * @see #getRtScCat2SfM()
	 * @generated
	 */
	EReference getRtScCat2SfM_SfM();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM#getRtScCat <em>Rt Sc Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rt Sc Cat</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM#getRtScCat()
	 * @see #getRtScCat2SfM()
	 * @generated
	 */
	EReference getRtScCat2SfM_RtScCat();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart <em>FRt Sc2 Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FRt Sc2 Chart</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart
	 * @generated
	 */
	EClass getFRtSc2Chart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getChart()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_Chart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getFRtSc <em>FRt Sc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FRt Sc</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getFRtSc()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_FRtSc();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getMt_par <em>Mt par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mt par</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getMt_par()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_Mt_par();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartState <em>Sf Chart State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Chart State</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartState()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_SfChartState();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartRegion <em>Sf Chart Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Chart Region</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartRegion()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_SfChartRegion();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfQueueRegion <em>Sf Queue Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Queue Region</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfQueueRegion()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_SfQueueRegion();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfSelfTrans <em>Sf Self Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Self Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfSelfTrans()
	 * @see #getFRtSc2Chart()
	 * @generated
	 */
	EReference getFRtSc2Chart_SfSelfTrans();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState <em>Sc State2 Sf State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc State2 Sf State</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState
	 * @generated
	 */
	EClass getScState2SfState();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState#getScState <em>Sc State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc State</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState#getScState()
	 * @see #getScState2SfState()
	 * @generated
	 */
	EReference getScState2SfState_ScState();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState#getSfState <em>Sf State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf State</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState#getSfState()
	 * @see #getScState2SfState()
	 * @generated
	 */
	EReference getScState2SfState_SfState();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans <em>Sc Trans2 Sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Trans2 Sf Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans
	 * @generated
	 */
	EClass getScTrans2SfTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScTrans <em>Sc Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScTrans()
	 * @see #getScTrans2SfTrans()
	 * @generated
	 */
	EReference getScTrans2SfTrans_ScTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getSfTrans <em>Sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getSfTrans()
	 * @see #getScTrans2SfTrans()
	 * @generated
	 */
	EReference getScTrans2SfTrans_SfTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScReg <em>Sc Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Reg</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScReg()
	 * @see #getScTrans2SfTrans()
	 * @generated
	 */
	EReference getScTrans2SfTrans_ScReg();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel <em>Sc Region2sf Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Region2sf Parallel</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel
	 * @generated
	 */
	EClass getScRegion2sfParallel();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel#getScRegion <em>Sc Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Region</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel#getScRegion()
	 * @see #getScRegion2sfParallel()
	 * @generated
	 */
	EReference getScRegion2sfParallel_ScRegion();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel#getSfParallelState <em>Sf Parallel State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Parallel State</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel#getSfParallelState()
	 * @see #getScRegion2sfParallel()
	 * @generated
	 */
	EReference getScRegion2sfParallel_SfParallelState();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel#getScRegRtsc <em>Sc Reg Rtsc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Reg Rtsc</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScRegion2sfParallel#getScRegRtsc()
	 * @see #getScRegion2sfParallel()
	 * @generated
	 */
	EReference getScRegion2sfParallel_ScRegRtsc();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry <em>Sc Entry2sf Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Entry2sf Entry</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry
	 * @generated
	 */
	EClass getScEntry2sfEntry();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryEvent <em>Sc Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Entry Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryEvent()
	 * @see #getScEntry2sfEntry()
	 * @generated
	 */
	EReference getScEntry2sfEntry_ScEntryEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getSfEntryAction <em>Sf Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Entry Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getSfEntryAction()
	 * @see #getScEntry2sfEntry()
	 * @generated
	 */
	EReference getScEntry2sfEntry_SfEntryAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryAction <em>Sc Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Entry Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScEntryAction()
	 * @see #getScEntry2sfEntry()
	 * @generated
	 */
	EReference getScEntry2sfEntry_ScEntryAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScExpr <em>Sc Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Expr</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScExpr()
	 * @see #getScEntry2sfEntry()
	 * @generated
	 */
	EReference getScEntry2sfEntry_ScExpr();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScClock <em>Sc Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry#getScClock()
	 * @see #getScEntry2sfEntry()
	 * @generated
	 */
	EReference getScEntry2sfEntry_ScClock();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit <em>Sc Exit2sf Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Exit2sf Exit</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit
	 * @generated
	 */
	EClass getScExit2sfExit();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitEvent <em>Sc Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Exit Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitEvent()
	 * @see #getScExit2sfExit()
	 * @generated
	 */
	EReference getScExit2sfExit_ScExitEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitAction <em>Sc Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Exit Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitAction()
	 * @see #getScExit2sfExit()
	 * @generated
	 */
	EReference getScExit2sfExit_ScExitAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitExpr <em>Sc Exit Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Exit Expr</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScExitExpr()
	 * @see #getScExit2sfExit()
	 * @generated
	 */
	EReference getScExit2sfExit_ScExitExpr();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getSfExitAction <em>Sf Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Exit Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getSfExitAction()
	 * @see #getScExit2sfExit()
	 * @generated
	 */
	EReference getScExit2sfExit_SfExitAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScClock <em>Sc Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit#getScClock()
	 * @see #getScExit2sfExit()
	 * @generated
	 */
	EReference getScExit2sfExit_ScClock();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans <em>Sc St En Point2sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc St En Point2sf Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans
	 * @generated
	 */
	EClass getScStEnPoint2sfTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getSfTrans <em>Sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getSfTrans()
	 * @see #getScStEnPoint2sfTrans()
	 * @generated
	 */
	EReference getScStEnPoint2sfTrans_SfTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getScInTrans <em>Sc In Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc In Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getScInTrans()
	 * @see #getScStEnPoint2sfTrans()
	 * @generated
	 */
	EReference getScStEnPoint2sfTrans_ScInTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getScOutTrans <em>Sc Out Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Out Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getScOutTrans()
	 * @see #getScStEnPoint2sfTrans()
	 * @generated
	 */
	EReference getScStEnPoint2sfTrans_ScOutTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getScStateEntryP <em>Sc State Entry P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc State Entry P</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans#getScStateEntryP()
	 * @see #getScStEnPoint2sfTrans()
	 * @generated
	 */
	EReference getScStEnPoint2sfTrans_ScStateEntryP();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans <em>Sc St Ex Point2sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc St Ex Point2sf Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans
	 * @generated
	 */
	EClass getScStExPoint2sfTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getSfTrans <em>Sf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getSfTrans()
	 * @see #getScStExPoint2sfTrans()
	 * @generated
	 */
	EReference getScStExPoint2sfTrans_SfTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScOutTrans <em>Sc Out Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Out Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScOutTrans()
	 * @see #getScStExPoint2sfTrans()
	 * @generated
	 */
	EReference getScStExPoint2sfTrans_ScOutTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScInTrans <em>Sc In Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc In Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScInTrans()
	 * @see #getScStExPoint2sfTrans()
	 * @generated
	 */
	EReference getScStExPoint2sfTrans_ScInTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScStExPoint <em>Sc St Ex Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc St Ex Point</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScStExPoint()
	 * @see #getScStExPoint2sfTrans()
	 * @generated
	 */
	EReference getScStExPoint2sfTrans_ScStExPoint();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal <em>Sc Sync Channel2sf Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Sync Channel2sf Signal</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal
	 * @generated
	 */
	EClass getScSyncChannel2sfSignal();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getScSyncChannel <em>Sc Sync Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Sync Channel</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getScSyncChannel()
	 * @see #getScSyncChannel2sfSignal()
	 * @generated
	 */
	EReference getScSyncChannel2sfSignal_ScSyncChannel();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getSfSyncEvent <em>Sf Sync Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Sync Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getSfSyncEvent()
	 * @see #getScSyncChannel2sfSignal()
	 * @generated
	 */
	EReference getScSyncChannel2sfSignal_SfSyncEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction <em>Sc Sync Receive Action2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Sync Receive Action2sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction
	 * @generated
	 */
	EClass getScSyncReceiveAction2sfAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction#getScAction <em>Sc Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction#getScAction()
	 * @see #getScSyncReceiveAction2sfAction()
	 * @generated
	 */
	EReference getScSyncReceiveAction2sfAction_ScAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Action Expr</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction#getScActionExpr()
	 * @see #getScSyncReceiveAction2sfAction()
	 * @generated
	 */
	EReference getScSyncReceiveAction2sfAction_ScActionExpr();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction#getSfAction <em>Sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction#getSfAction()
	 * @see #getScSyncReceiveAction2sfAction()
	 * @generated
	 */
	EReference getScSyncReceiveAction2sfAction_SfAction();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive <em>Sc Sync Receive2sf Sync Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Sync Receive2sf Sync Receive</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive
	 * @generated
	 */
	EClass getScSyncReceive2sfSyncReceive();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getScSyncReceive <em>Sc Sync Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Sync Receive</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getScSyncReceive()
	 * @see #getScSyncReceive2sfSyncReceive()
	 * @generated
	 */
	EReference getScSyncReceive2sfSyncReceive_ScSyncReceive();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfEntryAction <em>Sf Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Entry Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfEntryAction()
	 * @see #getScSyncReceive2sfSyncReceive()
	 * @generated
	 */
	EReference getScSyncReceive2sfSyncReceive_SfEntryAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfExitAction <em>Sf Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Exit Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfExitAction()
	 * @see #getScSyncReceive2sfSyncReceive()
	 * @generated
	 */
	EReference getScSyncReceive2sfSyncReceive_SfExitAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfTransEvent <em>Sf Trans Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Trans Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfTransEvent()
	 * @see #getScSyncReceive2sfSyncReceive()
	 * @generated
	 */
	EReference getScSyncReceive2sfSyncReceive_SfTransEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend <em>sc Sync Send2sf Sync Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Sync Send2sf Sync Send</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend
	 * @generated
	 */
	EClass getscSyncSend2sfSyncSend();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfGuard <em>Sf Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfGuard()
	 * @see #getscSyncSend2sfSyncSend()
	 * @generated
	 */
	EReference getscSyncSend2sfSyncSend_SfGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfAssignment <em>Sf Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Assignment</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfAssignment()
	 * @see #getscSyncSend2sfSyncSend()
	 * @generated
	 */
	EReference getscSyncSend2sfSyncSend_SfAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScTransAnnotation <em>Sc Trans Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Trans Annotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScTransAnnotation()
	 * @see #getscSyncSend2sfSyncSend()
	 * @generated
	 */
	EReference getscSyncSend2sfSyncSend_ScTransAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScAnnDetails <em>Sc Ann Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Ann Details</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScAnnDetails()
	 * @see #getscSyncSend2sfSyncSend()
	 * @generated
	 */
	EReference getscSyncSend2sfSyncSend_ScAnnDetails();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncPara2sfSyncParaData <em>Sc Sync Para2sf Sync Para Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sc Sync Para2sf Sync Para Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.ScSyncPara2sfSyncParaData
	 * @generated
	 */
	EClass getScSyncPara2sfSyncParaData();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD <em>MT Par2 MTD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Par2 MTD</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD
	 * @generated
	 */
	EClass getMT_Par2MTD();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getMt <em>Mt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mt</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getMt()
	 * @see #getMT_Par2MTD()
	 * @generated
	 */
	EReference getMT_Par2MTD_Mt();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getPar <em>Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Par</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getPar()
	 * @see #getMT_Par2MTD()
	 * @generated
	 */
	EReference getMT_Par2MTD_Par();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getData()
	 * @see #getMT_Par2MTD()
	 * @generated
	 */
	EReference getMT_Par2MTD_Data();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData <em>sc Attribute2sf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Attribute2sf Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData
	 * @generated
	 */
	EClass getscAttribute2sfData();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getScAttribute <em>Sc Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Attribute</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getScAttribute()
	 * @see #getscAttribute2sfData()
	 * @generated
	 */
	EReference getscAttribute2sfData_ScAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getSfData <em>Sf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getSfData()
	 * @see #getscAttribute2sfData()
	 * @generated
	 */
	EReference getscAttribute2sfData_SfData();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getScType <em>Sc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Type</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getScType()
	 * @see #getscAttribute2sfData()
	 * @generated
	 */
	EReference getscAttribute2sfData_ScType();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getScAttrType <em>Sc Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Attr Type</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData#getScAttrType()
	 * @see #getscAttribute2sfData()
	 * @generated
	 */
	EReference getscAttribute2sfData_ScAttrType();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction <em>sc Send Async2sf Trans Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Send Async2sf Trans Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction
	 * @generated
	 */
	EClass getscSendAsync2sfTransAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getSfSendAsync <em>Sf Send Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Send Async</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getSfSendAsync()
	 * @see #getscSendAsync2sfTransAction()
	 * @generated
	 */
	EReference getscSendAsync2sfTransAction_SfSendAsync();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asynchronous Message Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getAsynchronousMessageEvent()
	 * @see #getscSendAsync2sfTransAction()
	 * @generated
	 */
	EReference getscSendAsync2sfTransAction_AsynchronousMessageEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getMessage()
	 * @see #getscSendAsync2sfTransAction()
	 * @generated
	 */
	EReference getscSendAsync2sfTransAction_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getActionValue <em>Action Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Value</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getActionValue()
	 * @see #getscSendAsync2sfTransAction()
	 * @generated
	 */
	EAttribute getscSendAsync2sfTransAction_ActionValue();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getScPara <em>Sc Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Para</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getScPara()
	 * @see #getscSendAsync2sfTransAction()
	 * @generated
	 */
	EReference getscSendAsync2sfTransAction_ScPara();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getParBind <em>Par Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Par Bind</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendAsync2sfTransAction#getParBind()
	 * @see #getscSendAsync2sfTransAction()
	 * @generated
	 */
	EReference getscSendAsync2sfTransAction_ParBind();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction <em>sc Send Para Bind2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Send Para Bind2sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction
	 * @generated
	 */
	EClass getscSendParaBind2sfAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getSfParaBAction <em>Sf Para BAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Para BAction</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getSfParaBAction()
	 * @see #getscSendParaBind2sfAction()
	 * @generated
	 */
	EReference getscSendParaBind2sfAction_SfParaBAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScAnnotation <em>Sc Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Annotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScAnnotation()
	 * @see #getscSendParaBind2sfAction()
	 * @generated
	 */
	EReference getscSendParaBind2sfAction_ScAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScDetails <em>Sc Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Details</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScDetails()
	 * @see #getscSendParaBind2sfAction()
	 * @generated
	 */
	EReference getscSendParaBind2sfAction_ScDetails();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction <em>sc Async Send2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Async Send2sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction
	 * @generated
	 */
	EClass getscAsyncSend2sfAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getSfEnqAction <em>Sf Enq Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Enq Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getSfEnqAction()
	 * @see #getscAsyncSend2sfAction()
	 * @generated
	 */
	EReference getscAsyncSend2sfAction_SfEnqAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asynchronous Message Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getAsynchronousMessageEvent()
	 * @see #getscAsyncSend2sfAction()
	 * @generated
	 */
	EReference getscAsyncSend2sfAction_AsynchronousMessageEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAnnotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEAnnotation()
	 * @see #getscAsyncSend2sfAction()
	 * @generated
	 */
	EReference getscAsyncSend2sfAction_EAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEStringToStringMapEntry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EString To String Map Entry</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncSend2sfAction#getEStringToStringMapEntry()
	 * @see #getscAsyncSend2sfAction()
	 * @generated
	 */
	EReference getscAsyncSend2sfAction_EStringToStringMapEntry();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard <em>sc Async Rec2sf Async Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Async Rec2sf Async Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard
	 * @generated
	 */
	EClass getscAsyncRec2sfAsyncGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getGuardAnnotation <em>Guard Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard Annotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getGuardAnnotation()
	 * @see #getscAsyncRec2sfAsyncGuard()
	 * @generated
	 */
	EReference getscAsyncRec2sfAsyncGuard_GuardAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getEAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAnnotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getEAnnotation()
	 * @see #getscAsyncRec2sfAsyncGuard()
	 * @generated
	 */
	EReference getscAsyncRec2sfAsyncGuard_EAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asynchronous Message Event</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getAsynchronousMessageEvent()
	 * @see #getscAsyncRec2sfAsyncGuard()
	 * @generated
	 */
	EReference getscAsyncRec2sfAsyncGuard_AsynchronousMessageEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getAsyncRecGuard <em>Async Rec Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Async Rec Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard#getAsyncRecGuard()
	 * @see #getscAsyncRec2sfAsyncGuard()
	 * @generated
	 */
	EReference getscAsyncRec2sfAsyncGuard_AsyncRecGuard();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData <em>sc Clock2sf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Clock2sf Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData
	 * @generated
	 */
	EClass getscClock2sfData();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getScClock <em>Sc Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getScClock()
	 * @see #getscClock2sfData()
	 * @generated
	 */
	EReference getscClock2sfData_ScClock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getSfClockVariable <em>Sf Clock Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Clock Variable</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getSfClockVariable()
	 * @see #getscClock2sfData()
	 * @generated
	 */
	EReference getscClock2sfData_SfClockVariable();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard <em>sc Clock Constr2sf Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Clock Constr2sf Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard
	 * @generated
	 */
	EClass getscClockConstr2sfGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClockConstr <em>Sc Clock Constr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock Constr</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClockConstr()
	 * @see #getscClockConstr2sfGuard()
	 * @generated
	 */
	EReference getscClockConstr2sfGuard_ScClockConstr();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScBound <em>Sc Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Bound</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScBound()
	 * @see #getscClockConstr2sfGuard()
	 * @generated
	 */
	EReference getscClockConstr2sfGuard_ScBound();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClock <em>Sc Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getScClock()
	 * @see #getscClockConstr2sfGuard()
	 * @generated
	 */
	EReference getscClockConstr2sfGuard_ScClock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getSfClockGuard <em>Sf Clock Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Clock Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scClockConstr2sfGuard#getSfClockGuard()
	 * @see #getscClockConstr2sfGuard()
	 * @generated
	 */
	EReference getscClockConstr2sfGuard_SfClockGuard();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset <em>clock2 Clock Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>clock2 Clock Reset</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset
	 * @generated
	 */
	EClass getclock2ClockReset();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset#getScClock <em>Sc Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset#getScClock()
	 * @see #getclock2ClockReset()
	 * @generated
	 */
	EReference getclock2ClockReset_ScClock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset#getSfClockReset <em>Sf Clock Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Clock Reset</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.clock2ClockReset#getSfClockReset()
	 * @see #getclock2ClockReset()
	 * @generated
	 */
	EReference getclock2ClockReset_SfClockReset();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError <em>sc Invariant2sf Inv Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Invariant2sf Inv Error</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError
	 * @generated
	 */
	EClass getscInvariant2sfInvError();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScInvariant <em>Sc Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Invariant</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScInvariant()
	 * @see #getscInvariant2sfInvError()
	 * @generated
	 */
	EReference getscInvariant2sfInvError_ScInvariant();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScBound <em>Sc Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Bound</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScBound()
	 * @see #getscInvariant2sfInvError()
	 * @generated
	 */
	EReference getscInvariant2sfInvError_ScBound();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScClock <em>Sc Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Clock</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getScClock()
	 * @see #getscInvariant2sfInvError()
	 * @generated
	 */
	EReference getscInvariant2sfInvError_ScClock();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvTrans <em>Sf Inv Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Inv Trans</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvTrans()
	 * @see #getscInvariant2sfInvError()
	 * @generated
	 */
	EReference getscInvariant2sfInvError_SfInvTrans();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvGuard <em>Sf Inv Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Inv Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvGuard()
	 * @see #getscInvariant2sfInvError()
	 * @generated
	 */
	EReference getscInvariant2sfInvError_SfInvGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvNode <em>Sf Inv Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Inv Node</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError#getSfInvNode()
	 * @see #getscInvariant2sfInvError()
	 * @generated
	 */
	EReference getscInvariant2sfInvError_SfInvNode();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard <em>sc Guard2sf Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Guard2sf Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard
	 * @generated
	 */
	EClass getscGuard2sfGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getSfGuard <em>Sf Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Guard</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getSfGuard()
	 * @see #getscGuard2sfGuard()
	 * @generated
	 */
	EReference getscGuard2sfGuard_SfGuard();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScAnnotation <em>Sc Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Annotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScAnnotation()
	 * @see #getscGuard2sfGuard()
	 * @generated
	 */
	EReference getscGuard2sfGuard_ScAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScDetails <em>Sc Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Details</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScDetails()
	 * @see #getscGuard2sfGuard()
	 * @generated
	 */
	EReference getscGuard2sfGuard_ScDetails();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction <em>sc Action2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Action2sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction
	 * @generated
	 */
	EClass getscAction2sfAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScAction <em>Sc Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScAction()
	 * @see #getscAction2sfAction()
	 * @generated
	 */
	EReference getscAction2sfAction_ScAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getSfAction <em>Sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getSfAction()
	 * @see #getscAction2sfAction()
	 * @generated
	 */
	EReference getscAction2sfAction_SfAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScActionExpr <em>Sc Action Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Action Expr</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAction2sfAction#getScActionExpr()
	 * @see #getscAction2sfAction()
	 * @generated
	 */
	EReference getscAction2sfAction_ScActionExpr();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc <em>sc Op2sf Emb Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Op2sf Emb Func</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc
	 * @generated
	 */
	EClass getscOp2sfEmbFunc();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScOperation <em>Sc Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Operation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScOperation()
	 * @see #getscOp2sfEmbFunc()
	 * @generated
	 */
	EReference getscOp2sfEmbFunc_ScOperation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getSfEmbFunc <em>Sf Emb Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Emb Func</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getSfEmbFunc()
	 * @see #getscOp2sfEmbFunc()
	 * @generated
	 */
	EReference getscOp2sfEmbFunc_SfEmbFunc();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScAnnotation <em>Sc Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Annotation</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScAnnotation()
	 * @see #getscOp2sfEmbFunc()
	 * @generated
	 */
	EReference getscOp2sfEmbFunc_ScAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScDetails <em>Sc Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Details</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScDetails()
	 * @see #getscOp2sfEmbFunc()
	 * @generated
	 */
	EReference getscOp2sfEmbFunc_ScDetails();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData <em>sc Op Data2sf Emb Func Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Op Data2sf Emb Func Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData
	 * @generated
	 */
	EClass getscOpData2sfEmbFuncData();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParameter <em>Sc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Parameter</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParameter()
	 * @see #getscOpData2sfEmbFuncData()
	 * @generated
	 */
	EReference getscOpData2sfEmbFuncData_ScParameter();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getSfData <em>Sf Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Data</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getSfData()
	 * @see #getscOpData2sfEmbFuncData()
	 * @generated
	 */
	EReference getscOpData2sfEmbFuncData_SfData();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParaType <em>Sc Para Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Para Type</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParaType()
	 * @see #getscOpData2sfEmbFuncData()
	 * @generated
	 */
	EReference getscOpData2sfEmbFuncData_ScParaType();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue <em>sc Async Rec2sf Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Async Rec2sf Dequeue</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue
	 * @generated
	 */
	EClass getscAsyncRec2sfDequeue();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScDetailsDequeue <em>Sc Details Dequeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Details Dequeue</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScDetailsDequeue()
	 * @see #getscAsyncRec2sfDequeue()
	 * @generated
	 */
	EReference getscAsyncRec2sfDequeue_ScDetailsDequeue();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScAction <em>Sc Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScAction()
	 * @see #getscAsyncRec2sfDequeue()
	 * @generated
	 */
	EReference getscAsyncRec2sfDequeue_ScAction();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction <em>sc Action Self Trans2sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sc Action Self Trans2sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction
	 * @generated
	 */
	EClass getscActionSelfTrans2sfAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction#getScAction <em>Sc Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction#getScAction()
	 * @see #getscActionSelfTrans2sfAction()
	 * @generated
	 */
	EReference getscActionSelfTrans2sfAction_ScAction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction#getSfAction <em>Sf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sf Action</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.scActionSelfTrans2sfAction#getSfAction()
	 * @see #getscActionSelfTrans2sfAction()
	 * @generated
	 */
	EReference getscActionSelfTrans2sfAction_SfAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Behavior_modelFactory getBehavior_modelFactory();

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
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.RtScCat2SfMImpl <em>Rt Sc Cat2 Sf M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.RtScCat2SfMImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getRtScCat2SfM()
		 * @generated
		 */
		EClass RT_SC_CAT2_SF_M = eINSTANCE.getRtScCat2SfM();

		/**
		 * The meta object literal for the '<em><b>Sf M</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_SC_CAT2_SF_M__SF_M = eINSTANCE.getRtScCat2SfM_SfM();

		/**
		 * The meta object literal for the '<em><b>Rt Sc Cat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_SC_CAT2_SF_M__RT_SC_CAT = eINSTANCE.getRtScCat2SfM_RtScCat();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl <em>FRt Sc2 Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getFRtSc2Chart()
		 * @generated
		 */
		EClass FRT_SC2_CHART = eINSTANCE.getFRtSc2Chart();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__CHART = eINSTANCE.getFRtSc2Chart_Chart();

		/**
		 * The meta object literal for the '<em><b>FRt Sc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__FRT_SC = eINSTANCE.getFRtSc2Chart_FRtSc();

		/**
		 * The meta object literal for the '<em><b>Mt par</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__MT_PAR = eINSTANCE.getFRtSc2Chart_Mt_par();

		/**
		 * The meta object literal for the '<em><b>Sf Chart State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__SF_CHART_STATE = eINSTANCE.getFRtSc2Chart_SfChartState();

		/**
		 * The meta object literal for the '<em><b>Sf Chart Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__SF_CHART_REGION = eINSTANCE.getFRtSc2Chart_SfChartRegion();

		/**
		 * The meta object literal for the '<em><b>Sf Queue Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__SF_QUEUE_REGION = eINSTANCE.getFRtSc2Chart_SfQueueRegion();

		/**
		 * The meta object literal for the '<em><b>Sf Self Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRT_SC2_CHART__SF_SELF_TRANS = eINSTANCE.getFRtSc2Chart_SfSelfTrans();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScState2SfStateImpl <em>Sc State2 Sf State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScState2SfStateImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScState2SfState()
		 * @generated
		 */
		EClass SC_STATE2_SF_STATE = eINSTANCE.getScState2SfState();

		/**
		 * The meta object literal for the '<em><b>Sc State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_STATE2_SF_STATE__SC_STATE = eINSTANCE.getScState2SfState_ScState();

		/**
		 * The meta object literal for the '<em><b>Sf State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_STATE2_SF_STATE__SF_STATE = eINSTANCE.getScState2SfState_SfState();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScTrans2SfTransImpl <em>Sc Trans2 Sf Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScTrans2SfTransImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScTrans2SfTrans()
		 * @generated
		 */
		EClass SC_TRANS2_SF_TRANS = eINSTANCE.getScTrans2SfTrans();

		/**
		 * The meta object literal for the '<em><b>Sc Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_TRANS2_SF_TRANS__SC_TRANS = eINSTANCE.getScTrans2SfTrans_ScTrans();

		/**
		 * The meta object literal for the '<em><b>Sf Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_TRANS2_SF_TRANS__SF_TRANS = eINSTANCE.getScTrans2SfTrans_SfTrans();

		/**
		 * The meta object literal for the '<em><b>Sc Reg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_TRANS2_SF_TRANS__SC_REG = eINSTANCE.getScTrans2SfTrans_ScReg();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScRegion2sfParallelImpl <em>Sc Region2sf Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScRegion2sfParallelImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScRegion2sfParallel()
		 * @generated
		 */
		EClass SC_REGION2SF_PARALLEL = eINSTANCE.getScRegion2sfParallel();

		/**
		 * The meta object literal for the '<em><b>Sc Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_REGION2SF_PARALLEL__SC_REGION = eINSTANCE.getScRegion2sfParallel_ScRegion();

		/**
		 * The meta object literal for the '<em><b>Sf Parallel State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_REGION2SF_PARALLEL__SF_PARALLEL_STATE = eINSTANCE.getScRegion2sfParallel_SfParallelState();

		/**
		 * The meta object literal for the '<em><b>Sc Reg Rtsc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_REGION2SF_PARALLEL__SC_REG_RTSC = eINSTANCE.getScRegion2sfParallel_ScRegRtsc();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl <em>Sc Entry2sf Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScEntry2sfEntry()
		 * @generated
		 */
		EClass SC_ENTRY2SF_ENTRY = eINSTANCE.getScEntry2sfEntry();

		/**
		 * The meta object literal for the '<em><b>Sc Entry Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT = eINSTANCE.getScEntry2sfEntry_ScEntryEvent();

		/**
		 * The meta object literal for the '<em><b>Sf Entry Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION = eINSTANCE.getScEntry2sfEntry_SfEntryAction();

		/**
		 * The meta object literal for the '<em><b>Sc Entry Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION = eINSTANCE.getScEntry2sfEntry_ScEntryAction();

		/**
		 * The meta object literal for the '<em><b>Sc Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ENTRY2SF_ENTRY__SC_EXPR = eINSTANCE.getScEntry2sfEntry_ScExpr();

		/**
		 * The meta object literal for the '<em><b>Sc Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ENTRY2SF_ENTRY__SC_CLOCK = eINSTANCE.getScEntry2sfEntry_ScClock();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl <em>Sc Exit2sf Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScExit2sfExit()
		 * @generated
		 */
		EClass SC_EXIT2SF_EXIT = eINSTANCE.getScExit2sfExit();

		/**
		 * The meta object literal for the '<em><b>Sc Exit Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_EXIT2SF_EXIT__SC_EXIT_EVENT = eINSTANCE.getScExit2sfExit_ScExitEvent();

		/**
		 * The meta object literal for the '<em><b>Sc Exit Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_EXIT2SF_EXIT__SC_EXIT_ACTION = eINSTANCE.getScExit2sfExit_ScExitAction();

		/**
		 * The meta object literal for the '<em><b>Sc Exit Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_EXIT2SF_EXIT__SC_EXIT_EXPR = eINSTANCE.getScExit2sfExit_ScExitExpr();

		/**
		 * The meta object literal for the '<em><b>Sf Exit Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_EXIT2SF_EXIT__SF_EXIT_ACTION = eINSTANCE.getScExit2sfExit_SfExitAction();

		/**
		 * The meta object literal for the '<em><b>Sc Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_EXIT2SF_EXIT__SC_CLOCK = eINSTANCE.getScExit2sfExit_ScClock();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl <em>Sc St En Point2sf Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScStEnPoint2sfTrans()
		 * @generated
		 */
		EClass SC_ST_EN_POINT2SF_TRANS = eINSTANCE.getScStEnPoint2sfTrans();

		/**
		 * The meta object literal for the '<em><b>Sf Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EN_POINT2SF_TRANS__SF_TRANS = eINSTANCE.getScStEnPoint2sfTrans_SfTrans();

		/**
		 * The meta object literal for the '<em><b>Sc In Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS = eINSTANCE.getScStEnPoint2sfTrans_ScInTrans();

		/**
		 * The meta object literal for the '<em><b>Sc Out Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS = eINSTANCE.getScStEnPoint2sfTrans_ScOutTrans();

		/**
		 * The meta object literal for the '<em><b>Sc State Entry P</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P = eINSTANCE.getScStEnPoint2sfTrans_ScStateEntryP();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStExPoint2sfTransImpl <em>Sc St Ex Point2sf Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScStExPoint2sfTransImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScStExPoint2sfTrans()
		 * @generated
		 */
		EClass SC_ST_EX_POINT2SF_TRANS = eINSTANCE.getScStExPoint2sfTrans();

		/**
		 * The meta object literal for the '<em><b>Sf Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EX_POINT2SF_TRANS__SF_TRANS = eINSTANCE.getScStExPoint2sfTrans_SfTrans();

		/**
		 * The meta object literal for the '<em><b>Sc Out Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EX_POINT2SF_TRANS__SC_OUT_TRANS = eINSTANCE.getScStExPoint2sfTrans_ScOutTrans();

		/**
		 * The meta object literal for the '<em><b>Sc In Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EX_POINT2SF_TRANS__SC_IN_TRANS = eINSTANCE.getScStExPoint2sfTrans_ScInTrans();

		/**
		 * The meta object literal for the '<em><b>Sc St Ex Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ST_EX_POINT2SF_TRANS__SC_ST_EX_POINT = eINSTANCE.getScStExPoint2sfTrans_ScStExPoint();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncChannel2sfSignalImpl <em>Sc Sync Channel2sf Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncChannel2sfSignalImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncChannel2sfSignal()
		 * @generated
		 */
		EClass SC_SYNC_CHANNEL2SF_SIGNAL = eINSTANCE.getScSyncChannel2sfSignal();

		/**
		 * The meta object literal for the '<em><b>Sc Sync Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_CHANNEL2SF_SIGNAL__SC_SYNC_CHANNEL = eINSTANCE.getScSyncChannel2sfSignal_ScSyncChannel();

		/**
		 * The meta object literal for the '<em><b>Sf Sync Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_CHANNEL2SF_SIGNAL__SF_SYNC_EVENT = eINSTANCE.getScSyncChannel2sfSignal_SfSyncEvent();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl <em>Sc Sync Receive Action2sf Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncReceiveAction2sfAction()
		 * @generated
		 */
		EClass SC_SYNC_RECEIVE_ACTION2SF_ACTION = eINSTANCE.getScSyncReceiveAction2sfAction();

		/**
		 * The meta object literal for the '<em><b>Sc Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION = eINSTANCE.getScSyncReceiveAction2sfAction_ScAction();

		/**
		 * The meta object literal for the '<em><b>Sc Action Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR = eINSTANCE.getScSyncReceiveAction2sfAction_ScActionExpr();

		/**
		 * The meta object literal for the '<em><b>Sf Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION = eINSTANCE.getScSyncReceiveAction2sfAction_SfAction();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl <em>Sc Sync Receive2sf Sync Receive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceive2sfSyncReceiveImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncReceive2sfSyncReceive()
		 * @generated
		 */
		EClass SC_SYNC_RECEIVE2SF_SYNC_RECEIVE = eINSTANCE.getScSyncReceive2sfSyncReceive();

		/**
		 * The meta object literal for the '<em><b>Sc Sync Receive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SC_SYNC_RECEIVE = eINSTANCE.getScSyncReceive2sfSyncReceive_ScSyncReceive();

		/**
		 * The meta object literal for the '<em><b>Sf Entry Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_ENTRY_ACTION = eINSTANCE.getScSyncReceive2sfSyncReceive_SfEntryAction();

		/**
		 * The meta object literal for the '<em><b>Sf Exit Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_EXIT_ACTION = eINSTANCE.getScSyncReceive2sfSyncReceive_SfExitAction();

		/**
		 * The meta object literal for the '<em><b>Sf Trans Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_RECEIVE2SF_SYNC_RECEIVE__SF_TRANS_EVENT = eINSTANCE.getScSyncReceive2sfSyncReceive_SfTransEvent();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl <em>sc Sync Send2sf Sync Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscSyncSend2sfSyncSend()
		 * @generated
		 */
		EClass SC_SYNC_SEND2SF_SYNC_SEND = eINSTANCE.getscSyncSend2sfSyncSend();

		/**
		 * The meta object literal for the '<em><b>Sf Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD = eINSTANCE.getscSyncSend2sfSyncSend_SfGuard();

		/**
		 * The meta object literal for the '<em><b>Sf Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT = eINSTANCE.getscSyncSend2sfSyncSend_SfAssignment();

		/**
		 * The meta object literal for the '<em><b>Sc Trans Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION = eINSTANCE.getscSyncSend2sfSyncSend_ScTransAnnotation();

		/**
		 * The meta object literal for the '<em><b>Sc Ann Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS = eINSTANCE.getscSyncSend2sfSyncSend_ScAnnDetails();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncPara2sfSyncParaDataImpl <em>Sc Sync Para2sf Sync Para Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncPara2sfSyncParaDataImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getScSyncPara2sfSyncParaData()
		 * @generated
		 */
		EClass SC_SYNC_PARA2SF_SYNC_PARA_DATA = eINSTANCE.getScSyncPara2sfSyncParaData();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.MT_Par2MTDImpl <em>MT Par2 MTD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.MT_Par2MTDImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getMT_Par2MTD()
		 * @generated
		 */
		EClass MT_PAR2_MTD = eINSTANCE.getMT_Par2MTD();

		/**
		 * The meta object literal for the '<em><b>Mt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_PAR2_MTD__MT = eINSTANCE.getMT_Par2MTD_Mt();

		/**
		 * The meta object literal for the '<em><b>Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_PAR2_MTD__PAR = eINSTANCE.getMT_Par2MTD_Par();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_PAR2_MTD__DATA = eINSTANCE.getMT_Par2MTD_Data();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl <em>sc Attribute2sf Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAttribute2sfData()
		 * @generated
		 */
		EClass SC_ATTRIBUTE2SF_DATA = eINSTANCE.getscAttribute2sfData();

		/**
		 * The meta object literal for the '<em><b>Sc Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE = eINSTANCE.getscAttribute2sfData_ScAttribute();

		/**
		 * The meta object literal for the '<em><b>Sf Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ATTRIBUTE2SF_DATA__SF_DATA = eINSTANCE.getscAttribute2sfData_SfData();

		/**
		 * The meta object literal for the '<em><b>Sc Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ATTRIBUTE2SF_DATA__SC_TYPE = eINSTANCE.getscAttribute2sfData_ScType();

		/**
		 * The meta object literal for the '<em><b>Sc Attr Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE = eINSTANCE.getscAttribute2sfData_ScAttrType();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendAsync2sfTransActionImpl <em>sc Send Async2sf Trans Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scSendAsync2sfTransActionImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscSendAsync2sfTransAction()
		 * @generated
		 */
		EClass SC_SEND_ASYNC2SF_TRANS_ACTION = eINSTANCE.getscSendAsync2sfTransAction();

		/**
		 * The meta object literal for the '<em><b>Sf Send Async</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC = eINSTANCE.getscSendAsync2sfTransAction_SfSendAsync();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Message Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT = eINSTANCE.getscSendAsync2sfTransAction_AsynchronousMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE = eINSTANCE.getscSendAsync2sfTransAction_Message();

		/**
		 * The meta object literal for the '<em><b>Action Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE = eINSTANCE.getscSendAsync2sfTransAction_ActionValue();

		/**
		 * The meta object literal for the '<em><b>Sc Para</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA = eINSTANCE.getscSendAsync2sfTransAction_ScPara();

		/**
		 * The meta object literal for the '<em><b>Par Bind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND = eINSTANCE.getscSendAsync2sfTransAction_ParBind();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl <em>sc Send Para Bind2sf Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscSendParaBind2sfAction()
		 * @generated
		 */
		EClass SC_SEND_PARA_BIND2SF_ACTION = eINSTANCE.getscSendParaBind2sfAction();

		/**
		 * The meta object literal for the '<em><b>Sf Para BAction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION = eINSTANCE.getscSendParaBind2sfAction_SfParaBAction();

		/**
		 * The meta object literal for the '<em><b>Sc Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION = eINSTANCE.getscSendParaBind2sfAction_ScAnnotation();

		/**
		 * The meta object literal for the '<em><b>Sc Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS = eINSTANCE.getscSendParaBind2sfAction_ScDetails();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncSend2sfActionImpl <em>sc Async Send2sf Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncSend2sfActionImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAsyncSend2sfAction()
		 * @generated
		 */
		EClass SC_ASYNC_SEND2SF_ACTION = eINSTANCE.getscAsyncSend2sfAction();

		/**
		 * The meta object literal for the '<em><b>Sf Enq Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION = eINSTANCE.getscAsyncSend2sfAction_SfEnqAction();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Message Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT = eINSTANCE.getscAsyncSend2sfAction_AsynchronousMessageEvent();

		/**
		 * The meta object literal for the '<em><b>EAnnotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_SEND2SF_ACTION__EANNOTATION = eINSTANCE.getscAsyncSend2sfAction_EAnnotation();

		/**
		 * The meta object literal for the '<em><b>EString To String Map Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getscAsyncSend2sfAction_EStringToStringMapEntry();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl <em>sc Async Rec2sf Async Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAsyncRec2sfAsyncGuard()
		 * @generated
		 */
		EClass SC_ASYNC_REC2SF_ASYNC_GUARD = eINSTANCE.getscAsyncRec2sfAsyncGuard();

		/**
		 * The meta object literal for the '<em><b>Guard Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION = eINSTANCE.getscAsyncRec2sfAsyncGuard_GuardAnnotation();

		/**
		 * The meta object literal for the '<em><b>EAnnotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION = eINSTANCE.getscAsyncRec2sfAsyncGuard_EAnnotation();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Message Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT = eINSTANCE.getscAsyncRec2sfAsyncGuard_AsynchronousMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Async Rec Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD = eINSTANCE.getscAsyncRec2sfAsyncGuard_AsyncRecGuard();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scClock2sfDataImpl <em>sc Clock2sf Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scClock2sfDataImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscClock2sfData()
		 * @generated
		 */
		EClass SC_CLOCK2SF_DATA = eINSTANCE.getscClock2sfData();

		/**
		 * The meta object literal for the '<em><b>Sc Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CLOCK2SF_DATA__SC_CLOCK = eINSTANCE.getscClock2sfData_ScClock();

		/**
		 * The meta object literal for the '<em><b>Sf Clock Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE = eINSTANCE.getscClock2sfData_SfClockVariable();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scClockConstr2sfGuardImpl <em>sc Clock Constr2sf Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scClockConstr2sfGuardImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscClockConstr2sfGuard()
		 * @generated
		 */
		EClass SC_CLOCK_CONSTR2SF_GUARD = eINSTANCE.getscClockConstr2sfGuard();

		/**
		 * The meta object literal for the '<em><b>Sc Clock Constr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK_CONSTR = eINSTANCE.getscClockConstr2sfGuard_ScClockConstr();

		/**
		 * The meta object literal for the '<em><b>Sc Bound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CLOCK_CONSTR2SF_GUARD__SC_BOUND = eINSTANCE.getscClockConstr2sfGuard_ScBound();

		/**
		 * The meta object literal for the '<em><b>Sc Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CLOCK_CONSTR2SF_GUARD__SC_CLOCK = eINSTANCE.getscClockConstr2sfGuard_ScClock();

		/**
		 * The meta object literal for the '<em><b>Sf Clock Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CLOCK_CONSTR2SF_GUARD__SF_CLOCK_GUARD = eINSTANCE.getscClockConstr2sfGuard_SfClockGuard();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.clock2ClockResetImpl <em>clock2 Clock Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.clock2ClockResetImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getclock2ClockReset()
		 * @generated
		 */
		EClass CLOCK2_CLOCK_RESET = eINSTANCE.getclock2ClockReset();

		/**
		 * The meta object literal for the '<em><b>Sc Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK2_CLOCK_RESET__SC_CLOCK = eINSTANCE.getclock2ClockReset_ScClock();

		/**
		 * The meta object literal for the '<em><b>Sf Clock Reset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK2_CLOCK_RESET__SF_CLOCK_RESET = eINSTANCE.getclock2ClockReset_SfClockReset();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl <em>sc Invariant2sf Inv Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscInvariant2sfInvError()
		 * @generated
		 */
		EClass SC_INVARIANT2SF_INV_ERROR = eINSTANCE.getscInvariant2sfInvError();

		/**
		 * The meta object literal for the '<em><b>Sc Invariant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT = eINSTANCE.getscInvariant2sfInvError_ScInvariant();

		/**
		 * The meta object literal for the '<em><b>Sc Bound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_INVARIANT2SF_INV_ERROR__SC_BOUND = eINSTANCE.getscInvariant2sfInvError_ScBound();

		/**
		 * The meta object literal for the '<em><b>Sc Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_INVARIANT2SF_INV_ERROR__SC_CLOCK = eINSTANCE.getscInvariant2sfInvError_ScClock();

		/**
		 * The meta object literal for the '<em><b>Sf Inv Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS = eINSTANCE.getscInvariant2sfInvError_SfInvTrans();

		/**
		 * The meta object literal for the '<em><b>Sf Inv Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD = eINSTANCE.getscInvariant2sfInvError_SfInvGuard();

		/**
		 * The meta object literal for the '<em><b>Sf Inv Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE = eINSTANCE.getscInvariant2sfInvError_SfInvNode();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scGuard2sfGuardImpl <em>sc Guard2sf Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scGuard2sfGuardImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscGuard2sfGuard()
		 * @generated
		 */
		EClass SC_GUARD2SF_GUARD = eINSTANCE.getscGuard2sfGuard();

		/**
		 * The meta object literal for the '<em><b>Sf Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_GUARD2SF_GUARD__SF_GUARD = eINSTANCE.getscGuard2sfGuard_SfGuard();

		/**
		 * The meta object literal for the '<em><b>Sc Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_GUARD2SF_GUARD__SC_ANNOTATION = eINSTANCE.getscGuard2sfGuard_ScAnnotation();

		/**
		 * The meta object literal for the '<em><b>Sc Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_GUARD2SF_GUARD__SC_DETAILS = eINSTANCE.getscGuard2sfGuard_ScDetails();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAction2sfActionImpl <em>sc Action2sf Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAction2sfActionImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAction2sfAction()
		 * @generated
		 */
		EClass SC_ACTION2SF_ACTION = eINSTANCE.getscAction2sfAction();

		/**
		 * The meta object literal for the '<em><b>Sc Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ACTION2SF_ACTION__SC_ACTION = eINSTANCE.getscAction2sfAction_ScAction();

		/**
		 * The meta object literal for the '<em><b>Sf Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ACTION2SF_ACTION__SF_ACTION = eINSTANCE.getscAction2sfAction_SfAction();

		/**
		 * The meta object literal for the '<em><b>Sc Action Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ACTION2SF_ACTION__SC_ACTION_EXPR = eINSTANCE.getscAction2sfAction_ScActionExpr();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl <em>sc Op2sf Emb Func</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscOp2sfEmbFunc()
		 * @generated
		 */
		EClass SC_OP2SF_EMB_FUNC = eINSTANCE.getscOp2sfEmbFunc();

		/**
		 * The meta object literal for the '<em><b>Sc Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP2SF_EMB_FUNC__SC_OPERATION = eINSTANCE.getscOp2sfEmbFunc_ScOperation();

		/**
		 * The meta object literal for the '<em><b>Sf Emb Func</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP2SF_EMB_FUNC__SF_EMB_FUNC = eINSTANCE.getscOp2sfEmbFunc_SfEmbFunc();

		/**
		 * The meta object literal for the '<em><b>Sc Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP2SF_EMB_FUNC__SC_ANNOTATION = eINSTANCE.getscOp2sfEmbFunc_ScAnnotation();

		/**
		 * The meta object literal for the '<em><b>Sc Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP2SF_EMB_FUNC__SC_DETAILS = eINSTANCE.getscOp2sfEmbFunc_ScDetails();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOpData2sfEmbFuncDataImpl <em>sc Op Data2sf Emb Func Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scOpData2sfEmbFuncDataImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscOpData2sfEmbFuncData()
		 * @generated
		 */
		EClass SC_OP_DATA2SF_EMB_FUNC_DATA = eINSTANCE.getscOpData2sfEmbFuncData();

		/**
		 * The meta object literal for the '<em><b>Sc Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER = eINSTANCE.getscOpData2sfEmbFuncData_ScParameter();

		/**
		 * The meta object literal for the '<em><b>Sf Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA = eINSTANCE.getscOpData2sfEmbFuncData_SfData();

		/**
		 * The meta object literal for the '<em><b>Sc Para Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE = eINSTANCE.getscOpData2sfEmbFuncData_ScParaType();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfDequeueImpl <em>sc Async Rec2sf Dequeue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfDequeueImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscAsyncRec2sfDequeue()
		 * @generated
		 */
		EClass SC_ASYNC_REC2SF_DEQUEUE = eINSTANCE.getscAsyncRec2sfDequeue();

		/**
		 * The meta object literal for the '<em><b>Sc Details Dequeue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE = eINSTANCE.getscAsyncRec2sfDequeue_ScDetailsDequeue();

		/**
		 * The meta object literal for the '<em><b>Sc Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION = eINSTANCE.getscAsyncRec2sfDequeue_ScAction();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scActionSelfTrans2sfActionImpl <em>sc Action Self Trans2sf Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.scActionSelfTrans2sfActionImpl
		 * @see org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl#getscActionSelfTrans2sfAction()
		 * @generated
		 */
		EClass SC_ACTION_SELF_TRANS2SF_ACTION = eINSTANCE.getscActionSelfTrans2sfAction();

		/**
		 * The meta object literal for the '<em><b>Sc Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ACTION_SELF_TRANS2SF_ACTION__SC_ACTION = eINSTANCE.getscActionSelfTrans2sfAction_ScAction();

		/**
		 * The meta object literal for the '<em><b>Sf Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_ACTION_SELF_TRANS2SF_ACTION__SF_ACTION = eINSTANCE.getscActionSelfTrans2sfAction_SfAction();

	}

} //Behavior_modelPackage

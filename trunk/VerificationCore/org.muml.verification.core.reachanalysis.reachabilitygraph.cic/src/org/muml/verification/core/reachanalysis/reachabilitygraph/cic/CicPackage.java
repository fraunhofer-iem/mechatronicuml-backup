package org.muml.verification.core.reachanalysis.reachabilitygraph.cic;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;

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
 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicFactory
 * @model kind="package"
 * @generated
 */
public interface CicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/verification/core/reachanalysis/reachabilitygraph/cic/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reachabilitygraphcic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CicPackage eINSTANCE = org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CICZoneGraphStateImpl <em>CIC Zone Graph State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CICZoneGraphStateImpl
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CicPackageImpl#getCICZoneGraphState()
	 * @generated
	 */
	int CIC_ZONE_GRAPH_STATE = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__EXTENSIONS = RtscPackage.ZONE_GRAPH_STATE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__HASH = RtscPackage.ZONE_GRAPH_STATE__HASH;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__INCOMING_TRANSITIONS = RtscPackage.ZONE_GRAPH_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__OUTGOING_TRANSITIONS = RtscPackage.ZONE_GRAPH_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__REACHABILITY_GRAPH = RtscPackage.ZONE_GRAPH_STATE__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Path Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__PATH_DEPTH = RtscPackage.ZONE_GRAPH_STATE__PATH_DEPTH;

	/**
	 * The feature id for the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__FEDERATION = RtscPackage.ZONE_GRAPH_STATE__FEDERATION;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__LOCATIONS = RtscPackage.ZONE_GRAPH_STATE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Contained Toplevel Statechart Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES = RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES;

	/**
	 * The feature id for the '<em><b>Cic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE__CIC = RtscPackage.ZONE_GRAPH_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CIC Zone Graph State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_ZONE_GRAPH_STATE_FEATURE_COUNT = RtscPackage.ZONE_GRAPH_STATE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState <em>CIC Zone Graph State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIC Zone Graph State</em>'.
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState
	 * @generated
	 */
	EClass getCICZoneGraphState();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState#getCic <em>Cic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cic</em>'.
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState#getCic()
	 * @see #getCICZoneGraphState()
	 * @generated
	 */
	EReference getCICZoneGraphState_Cic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CicFactory getCicFactory();

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
		 * The meta object literal for the '{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CICZoneGraphStateImpl <em>CIC Zone Graph State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CICZoneGraphStateImpl
		 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CicPackageImpl#getCICZoneGraphState()
		 * @generated
		 */
		EClass CIC_ZONE_GRAPH_STATE = eINSTANCE.getCICZoneGraphState();

		/**
		 * The meta object literal for the '<em><b>Cic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIC_ZONE_GRAPH_STATE__CIC = eINSTANCE.getCICZoneGraphState_Cic();

	}

} //CicPackage
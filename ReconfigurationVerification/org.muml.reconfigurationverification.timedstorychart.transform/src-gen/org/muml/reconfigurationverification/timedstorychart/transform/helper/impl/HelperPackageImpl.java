/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperFactory;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.PreTransformationHelper;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelperPackageImpl extends EPackageImpl implements HelperPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tscTransformationInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tscTransformationOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preTransformationHelperEClass = null;

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
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HelperPackageImpl() {
		super(eNS_URI, HelperFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HelperPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HelperPackage init() {
		if (isInited) return (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);

		// Obtain or create and register package
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HelperPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHelperPackage.createPackageContents();

		// Initialize created meta-data
		theHelperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHelperPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HelperPackage.eNS_URI, theHelperPackage);
		return theHelperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSCTransformationInput() {
		return tscTransformationInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSCTransformationInput_Connector() {
		return (EReference)tscTransformationInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSCTransformationInput_SyncTransitionTuples() {
		return (EReference)tscTransformationInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSCTransformationInput_NoSyncTransitions() {
		return (EReference)tscTransformationInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSCTransformationOutput() {
		return tscTransformationOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSCTransformationOutput_Tgts() {
		return (EReference)tscTransformationOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionTuple() {
		return transitionTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionTuple_Sending() {
		return (EReference)transitionTupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionTuple_Receiving() {
		return (EReference)transitionTupleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreTransformationHelper() {
		return preTransformationHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreTransformationHelper_Rtscs() {
		return (EReference)preTransformationHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperFactory getHelperFactory() {
		return (HelperFactory)getEFactoryInstance();
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
		tscTransformationInputEClass = createEClass(TSC_TRANSFORMATION_INPUT);
		createEReference(tscTransformationInputEClass, TSC_TRANSFORMATION_INPUT__CONNECTOR);
		createEReference(tscTransformationInputEClass, TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES);
		createEReference(tscTransformationInputEClass, TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS);

		tscTransformationOutputEClass = createEClass(TSC_TRANSFORMATION_OUTPUT);
		createEReference(tscTransformationOutputEClass, TSC_TRANSFORMATION_OUTPUT__TGTS);

		transitionTupleEClass = createEClass(TRANSITION_TUPLE);
		createEReference(transitionTupleEClass, TRANSITION_TUPLE__SENDING);
		createEReference(transitionTupleEClass, TRANSITION_TUPLE__RECEIVING);

		preTransformationHelperEClass = createEClass(PRE_TRANSFORMATION_HELPER);
		createEReference(preTransformationHelperEClass, PRE_TRANSFORMATION_HELPER__RTSCS);
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
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		TimedstorydiagramPackage theTimedstorydiagramPackage = (TimedstorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(TimedstorydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(tscTransformationInputEClass, TSCTransformationInput.class, "TSCTransformationInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSCTransformationInput_Connector(), theConnectorPackage.getConnector(), null, "connector", null, 0, 1, TSCTransformationInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSCTransformationInput_SyncTransitionTuples(), this.getTransitionTuple(), null, "syncTransitionTuples", null, 0, -1, TSCTransformationInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSCTransformationInput_NoSyncTransitions(), theRealtimestatechartPackage.getTransition(), null, "noSyncTransitions", null, 0, -1, TSCTransformationInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tscTransformationOutputEClass, TSCTransformationOutput.class, "TSCTransformationOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSCTransformationOutput_Tgts(), theTimedstorydiagramPackage.getTimedGraphTransformationSystem(), null, "tgts", null, 0, 1, TSCTransformationOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTupleEClass, TransitionTuple.class, "TransitionTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionTuple_Sending(), theRealtimestatechartPackage.getTransition(), null, "sending", null, 0, 1, TransitionTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionTuple_Receiving(), theRealtimestatechartPackage.getTransition(), null, "receiving", null, 0, 1, TransitionTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preTransformationHelperEClass, PreTransformationHelper.class, "PreTransformationHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreTransformationHelper_Rtscs(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "rtscs", null, 0, -1, PreTransformationHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HelperPackageImpl

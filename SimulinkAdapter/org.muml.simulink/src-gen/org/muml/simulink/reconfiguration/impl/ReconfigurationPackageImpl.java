/**
 */
package org.muml.simulink.reconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.impl.SimulinkPackageImpl;
import org.muml.simulink.msglib.MsglibPackage;
import org.muml.simulink.msglib.buffer.BufferPackage;
import org.muml.simulink.msglib.buffer.impl.BufferPackageImpl;
import org.muml.simulink.msglib.impl.MsglibPackageImpl;
import org.muml.simulink.reconfiguration.FadingComponent;
import org.muml.simulink.reconfiguration.MultiSourceControl;
import org.muml.simulink.reconfiguration.MultiTargetControl;
import org.muml.simulink.reconfiguration.ReconfigurationFactory;
import org.muml.simulink.reconfiguration.ReconfigurationPackage;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.impl.StateflowPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurationPackageImpl extends EPackageImpl implements ReconfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiTargetControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSourceControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadingComponentEClass = null;

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
	 * @see org.muml.simulink.reconfiguration.ReconfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReconfigurationPackageImpl() {
		super(eNS_URI, ReconfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReconfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReconfigurationPackage init() {
		if (isInited) return (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReconfigurationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SimulinkPackageImpl theSimulinkPackage = (SimulinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI) instanceof SimulinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI) : SimulinkPackage.eINSTANCE);
		StateflowPackageImpl theStateflowPackage = (StateflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) instanceof StateflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) : StateflowPackage.eINSTANCE);
		MsglibPackageImpl theMsglibPackage = (MsglibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI) instanceof MsglibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI) : MsglibPackage.eINSTANCE);
		BufferPackageImpl theBufferPackage = (BufferPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI) instanceof BufferPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI) : BufferPackage.eINSTANCE);

		// Create package meta-data objects
		theReconfigurationPackage.createPackageContents();
		theSimulinkPackage.createPackageContents();
		theStateflowPackage.createPackageContents();
		theMsglibPackage.createPackageContents();
		theBufferPackage.createPackageContents();

		// Initialize created meta-data
		theReconfigurationPackage.initializePackageContents();
		theSimulinkPackage.initializePackageContents();
		theStateflowPackage.initializePackageContents();
		theMsglibPackage.initializePackageContents();
		theBufferPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReconfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReconfigurationPackage.eNS_URI, theReconfigurationPackage);
		return theReconfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiTargetControl() {
		return multiTargetControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSourceControl() {
		return multiSourceControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadingComponent() {
		return fadingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFadingComponent_Time() {
		return (EAttribute)fadingComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationFactory getReconfigurationFactory() {
		return (ReconfigurationFactory)getEFactoryInstance();
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
		multiTargetControlEClass = createEClass(MULTI_TARGET_CONTROL);

		multiSourceControlEClass = createEClass(MULTI_SOURCE_CONTROL);

		fadingComponentEClass = createEClass(FADING_COMPONENT);
		createEAttribute(fadingComponentEClass, FADING_COMPONENT__TIME);
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
		SimulinkPackage theSimulinkPackage = (SimulinkPackage)EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiTargetControlEClass.getESuperTypes().add(theSimulinkPackage.getBlock());
		multiSourceControlEClass.getESuperTypes().add(theSimulinkPackage.getBlock());
		fadingComponentEClass.getESuperTypes().add(theSimulinkPackage.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(multiTargetControlEClass, MultiTargetControl.class, "MultiTargetControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiSourceControlEClass, MultiSourceControl.class, "MultiSourceControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadingComponentEClass, FadingComponent.class, "FadingComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFadingComponent_Time(), ecorePackage.getEInt(), "time", null, 1, -1, FadingComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ReconfigurationPackageImpl

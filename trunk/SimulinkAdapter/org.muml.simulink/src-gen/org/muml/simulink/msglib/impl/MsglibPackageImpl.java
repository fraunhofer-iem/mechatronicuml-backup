/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.impl.SimulinkPackageImpl;
import org.muml.simulink.msglib.CommunicationSwitch;
import org.muml.simulink.msglib.LinkLayer;
import org.muml.simulink.msglib.MsglibFactory;
import org.muml.simulink.msglib.MsglibPackage;
import org.muml.simulink.msglib.buffer.BufferPackage;
import org.muml.simulink.msglib.buffer.impl.BufferPackageImpl;
import org.muml.simulink.reconfiguration.ReconfigurationPackage;
import org.muml.simulink.reconfiguration.impl.ReconfigurationPackageImpl;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.impl.StateflowPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsglibPackageImpl extends EPackageImpl implements MsglibPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkLayerEClass = null;

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
	 * @see org.muml.simulink.msglib.MsglibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MsglibPackageImpl() {
		super(eNS_URI, MsglibFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MsglibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MsglibPackage init() {
		if (isInited) return (MsglibPackage)EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI);

		// Obtain or create and register package
		MsglibPackageImpl theMsglibPackage = (MsglibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MsglibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MsglibPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SimulinkPackageImpl theSimulinkPackage = (SimulinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI) instanceof SimulinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI) : SimulinkPackage.eINSTANCE);
		StateflowPackageImpl theStateflowPackage = (StateflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) instanceof StateflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) : StateflowPackage.eINSTANCE);
		BufferPackageImpl theBufferPackage = (BufferPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI) instanceof BufferPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI) : BufferPackage.eINSTANCE);
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) : ReconfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theMsglibPackage.createPackageContents();
		theSimulinkPackage.createPackageContents();
		theStateflowPackage.createPackageContents();
		theBufferPackage.createPackageContents();
		theReconfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theMsglibPackage.initializePackageContents();
		theSimulinkPackage.initializePackageContents();
		theStateflowPackage.initializePackageContents();
		theBufferPackage.initializePackageContents();
		theReconfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMsglibPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MsglibPackage.eNS_URI, theMsglibPackage);
		return theMsglibPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationSwitch() {
		return communicationSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationSwitch_Debug() {
		return (EAttribute)communicationSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkLayer() {
		return linkLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_DelayMin() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_DelayMax() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_MessageLossProbability() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_MessageRetransmission() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_BufferOverflowPossible() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_BufferSize() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_SourceBufferSize() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkLayer_MessageMapping() {
		return (EAttribute)linkLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsglibFactory getMsglibFactory() {
		return (MsglibFactory)getEFactoryInstance();
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
		communicationSwitchEClass = createEClass(COMMUNICATION_SWITCH);
		createEAttribute(communicationSwitchEClass, COMMUNICATION_SWITCH__DEBUG);

		linkLayerEClass = createEClass(LINK_LAYER);
		createEAttribute(linkLayerEClass, LINK_LAYER__DELAY_MIN);
		createEAttribute(linkLayerEClass, LINK_LAYER__DELAY_MAX);
		createEAttribute(linkLayerEClass, LINK_LAYER__MESSAGE_LOSS_PROBABILITY);
		createEAttribute(linkLayerEClass, LINK_LAYER__MESSAGE_RETRANSMISSION);
		createEAttribute(linkLayerEClass, LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE);
		createEAttribute(linkLayerEClass, LINK_LAYER__BUFFER_SIZE);
		createEAttribute(linkLayerEClass, LINK_LAYER__SOURCE_BUFFER_SIZE);
		createEAttribute(linkLayerEClass, LINK_LAYER__MESSAGE_MAPPING);
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
		BufferPackage theBufferPackage = (BufferPackage)EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI);
		SimulinkPackage theSimulinkPackage = (SimulinkPackage)EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBufferPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationSwitchEClass.getESuperTypes().add(theSimulinkPackage.getBlock());
		linkLayerEClass.getESuperTypes().add(theSimulinkPackage.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(communicationSwitchEClass, CommunicationSwitch.class, "CommunicationSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationSwitch_Debug(), ecorePackage.getEInt(), "debug", "0", 1, 1, CommunicationSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkLayerEClass, LinkLayer.class, "LinkLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkLayer_DelayMin(), ecorePackage.getEString(), "delayMin", "2", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_DelayMax(), ecorePackage.getEString(), "delayMax", "100", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_MessageLossProbability(), ecorePackage.getEInt(), "messageLossProbability", "0", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_MessageRetransmission(), ecorePackage.getEBoolean(), "messageRetransmission", "false", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_BufferOverflowPossible(), ecorePackage.getEBoolean(), "bufferOverflowPossible", "true", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_BufferSize(), ecorePackage.getEInt(), "bufferSize", "10", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_SourceBufferSize(), ecorePackage.getEInt(), "sourceBufferSize", "10", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLayer_MessageMapping(), ecorePackage.getEString(), "messageMapping", "[1 1; 2 1]", 1, 1, LinkLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MsglibPackageImpl

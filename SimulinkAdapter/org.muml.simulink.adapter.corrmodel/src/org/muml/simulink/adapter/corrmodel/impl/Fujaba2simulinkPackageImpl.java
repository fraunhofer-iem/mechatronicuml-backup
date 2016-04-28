/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.mumlcore.modelinstance.ModelinstancePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.adapter.corrmodel.AssemblyInst2Line;
import org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys;
import org.muml.simulink.adapter.corrmodel.CompInst2LibRef;
import org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys;
import org.muml.simulink.adapter.corrmodel.Del2Line;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkFactory;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.InstConfig2SimMod;
import org.muml.simulink.adapter.corrmodel.ModElCat2SimLib;
import org.muml.simulink.adapter.corrmodel.Port2Ports;
import org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer;
import org.muml.simulink.adapter.corrmodel.StructComp2SubSys;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.impl.BehaviorPackageImpl;
import org.muml.simulink.adapter.corrmodel.behavior.impl.Behavior_modelPackageImpl;
import org.muml.simulink.msglib.MsglibPackage;
import org.muml.simulink.stateflow.StateflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fujaba2simulinkPackageImpl extends EPackageImpl implements Fujaba2simulinkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContainerCorrespondenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootNode2SimulinkContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modElCat2SimLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compInstConfig2SubSysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instConfig2SimModEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomComp2AtomSysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structComp2SubSysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compInst2LibRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port2PortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyInst2LineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass del2LineEClass = null;

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
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fujaba2simulinkPackageImpl() {
		super(eNS_URI, Fujaba2simulinkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Fujaba2simulinkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fujaba2simulinkPackage init() {
		if (isInited) return (Fujaba2simulinkPackage)EPackage.Registry.INSTANCE.getEPackage(Fujaba2simulinkPackage.eNS_URI);

		// Obtain or create and register package
		Fujaba2simulinkPackageImpl theFujaba2simulinkPackage = (Fujaba2simulinkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Fujaba2simulinkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Fujaba2simulinkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		PimPackage.eINSTANCE.eClass();
		SimulinkPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage.eNS_URI) : org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theFujaba2simulinkPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theFujaba2simulinkPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFujaba2simulinkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fujaba2simulinkPackage.eNS_URI, theFujaba2simulinkPackage);
		return theFujaba2simulinkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContainerCorrespondenceNode() {
		return abstractContainerCorrespondenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContainerCorrespondenceNode_ChildCorresp() {
		return (EReference)abstractContainerCorrespondenceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootNode2SimulinkContainer() {
		return rootNode2SimulinkContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode2SimulinkContainer_RootNode() {
		return (EReference)rootNode2SimulinkContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode2SimulinkContainer_SimulinkContainer() {
		return (EReference)rootNode2SimulinkContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode2SimulinkContainer_PacketBus() {
		return (EReference)rootNode2SimulinkContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode2SimulinkContainer_BusOfBusses() {
		return (EReference)rootNode2SimulinkContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode2SimulinkContainer_Cic2ss() {
		return (EReference)rootNode2SimulinkContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootNode2SimulinkContainer_AtomCompLib() {
		return (EReference)rootNode2SimulinkContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModElCat2SimLib() {
		return modElCat2SimLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModElCat2SimLib_ModElCat() {
		return (EReference)modElCat2SimLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModElCat2SimLib_SimLib() {
		return (EReference)modElCat2SimLibEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompInstConfig2SubSys() {
		return compInstConfig2SubSysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_InstConfig() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_SubSys() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_CommunicationSwitch() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_BusCreator() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_BusSelector() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_BusCreatorOutPort() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_BusSelectorInPort() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_BusOfBusses() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_CS_inPort() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInstConfig2SubSys_CS_outPort() {
		return (EReference)compInstConfig2SubSysEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompInstConfig2SubSys_CompInstName() {
		return (EAttribute)compInstConfig2SubSysEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstConfig2SimMod() {
		return instConfig2SimModEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstConfig2SimMod_ModelElementCategory() {
		return (EReference)instConfig2SimModEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomComp2AtomSys() {
		return atomComp2AtomSysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomComp2AtomSys_ClockSignal() {
		return (EReference)atomComp2AtomSysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomComp2AtomSys_Chart() {
		return (EReference)atomComp2AtomSysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomComp2AtomSys_Comp() {
		return (EReference)atomComp2AtomSysEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomComp2AtomSys_Sys() {
		return (EReference)atomComp2AtomSysEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructComp2SubSys() {
		return structComp2SubSysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructComp2SubSys_ComponentInstance() {
		return (EReference)structComp2SubSysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructComp2SubSys_LibraryReference() {
		return (EReference)structComp2SubSysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructComp2SubSys_Comp() {
		return (EReference)structComp2SubSysEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompInst2LibRef() {
		return compInst2LibRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInst2LibRef_CompInst() {
		return (EReference)compInst2LibRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompInst2LibRef_LibRef() {
		return (EReference)compInst2LibRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort2Ports() {
		return port2PortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_InPort() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_OutPort() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Port() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Help_inPort() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Help_outPort() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_PortInst() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_MultiPortInst() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_CompInst() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_ReadIn() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_ReadOut() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_WriteIn() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_WriteOut() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_help_ReadIn() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_help_ReadOut() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_help_WriteIn() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Sc_help_WriteOut() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Mi() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Net_address_inPort() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Receiver_net_address_inPort() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_Constant() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_PortType() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_LineFromReadOut() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_LineToReadIn() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort2Ports_LinkLayer() {
		return (EReference)port2PortsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyInst2Line() {
		return assemblyInst2LineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyInst2Line_AssemblyInst() {
		return (EReference)assemblyInst2LineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyInst2Line_Line() {
		return (EReference)assemblyInst2LineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDel2Line() {
		return del2LineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDel2Line_DelegationInstance() {
		return (EReference)del2LineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDel2Line_Line() {
		return (EReference)del2LineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fujaba2simulinkFactory getFujaba2simulinkFactory() {
		return (Fujaba2simulinkFactory)getEFactoryInstance();
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
		abstractContainerCorrespondenceNodeEClass = createEClass(ABSTRACT_CONTAINER_CORRESPONDENCE_NODE);
		createEReference(abstractContainerCorrespondenceNodeEClass, ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP);

		rootNode2SimulinkContainerEClass = createEClass(ROOT_NODE2_SIMULINK_CONTAINER);
		createEReference(rootNode2SimulinkContainerEClass, ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE);
		createEReference(rootNode2SimulinkContainerEClass, ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER);
		createEReference(rootNode2SimulinkContainerEClass, ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS);
		createEReference(rootNode2SimulinkContainerEClass, ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES);
		createEReference(rootNode2SimulinkContainerEClass, ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS);
		createEReference(rootNode2SimulinkContainerEClass, ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB);

		modElCat2SimLibEClass = createEClass(MOD_EL_CAT2_SIM_LIB);
		createEReference(modElCat2SimLibEClass, MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT);
		createEReference(modElCat2SimLibEClass, MOD_EL_CAT2_SIM_LIB__SIM_LIB);

		compInstConfig2SubSysEClass = createEClass(COMP_INST_CONFIG2_SUB_SYS);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__SUB_SYS);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT);
		createEReference(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT);
		createEAttribute(compInstConfig2SubSysEClass, COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME);

		instConfig2SimModEClass = createEClass(INST_CONFIG2_SIM_MOD);
		createEReference(instConfig2SimModEClass, INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY);

		atomComp2AtomSysEClass = createEClass(ATOM_COMP2_ATOM_SYS);
		createEReference(atomComp2AtomSysEClass, ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL);
		createEReference(atomComp2AtomSysEClass, ATOM_COMP2_ATOM_SYS__CHART);
		createEReference(atomComp2AtomSysEClass, ATOM_COMP2_ATOM_SYS__COMP);
		createEReference(atomComp2AtomSysEClass, ATOM_COMP2_ATOM_SYS__SYS);

		structComp2SubSysEClass = createEClass(STRUCT_COMP2_SUB_SYS);
		createEReference(structComp2SubSysEClass, STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE);
		createEReference(structComp2SubSysEClass, STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE);
		createEReference(structComp2SubSysEClass, STRUCT_COMP2_SUB_SYS__COMP);

		compInst2LibRefEClass = createEClass(COMP_INST2_LIB_REF);
		createEReference(compInst2LibRefEClass, COMP_INST2_LIB_REF__COMP_INST);
		createEReference(compInst2LibRefEClass, COMP_INST2_LIB_REF__LIB_REF);

		port2PortsEClass = createEClass(PORT2_PORTS);
		createEReference(port2PortsEClass, PORT2_PORTS__IN_PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__OUT_PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__HELP_IN_PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__HELP_OUT_PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__PORT_INST);
		createEReference(port2PortsEClass, PORT2_PORTS__MULTI_PORT_INST);
		createEReference(port2PortsEClass, PORT2_PORTS__COMP_INST);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_READ_IN);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_READ_OUT);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_WRITE_IN);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_WRITE_OUT);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_HELP_READ_IN);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_HELP_READ_OUT);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_HELP_WRITE_IN);
		createEReference(port2PortsEClass, PORT2_PORTS__SC_HELP_WRITE_OUT);
		createEReference(port2PortsEClass, PORT2_PORTS__MI);
		createEReference(port2PortsEClass, PORT2_PORTS__NET_ADDRESS_IN_PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT);
		createEReference(port2PortsEClass, PORT2_PORTS__CONSTANT);
		createEReference(port2PortsEClass, PORT2_PORTS__PORT_TYPE);
		createEReference(port2PortsEClass, PORT2_PORTS__LINE_FROM_READ_OUT);
		createEReference(port2PortsEClass, PORT2_PORTS__LINE_TO_READ_IN);
		createEReference(port2PortsEClass, PORT2_PORTS__LINK_LAYER);

		assemblyInst2LineEClass = createEClass(ASSEMBLY_INST2_LINE);
		createEReference(assemblyInst2LineEClass, ASSEMBLY_INST2_LINE__ASSEMBLY_INST);
		createEReference(assemblyInst2LineEClass, ASSEMBLY_INST2_LINE__LINE);

		del2LineEClass = createEClass(DEL2_LINE);
		createEReference(del2LineEClass, DEL2_LINE__DELEGATION_INSTANCE);
		createEReference(del2LineEClass, DEL2_LINE__LINE);
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
		org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage theBehaviorPackage = (org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage.eNS_URI);
		ModelinstancePackage theModelinstancePackage = (ModelinstancePackage)EPackage.Registry.INSTANCE.getEPackage(ModelinstancePackage.eNS_URI);
		SimulinkPackage theSimulinkPackage = (SimulinkPackage)EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		StateflowPackage theStateflowPackage = (StateflowPackage)EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		MsglibPackage theMsglibPackage = (MsglibPackage)EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theBehaviorPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootNode2SimulinkContainerEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		modElCat2SimLibEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		compInstConfig2SubSysEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		instConfig2SimModEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		instConfig2SimModEClass.getESuperTypes().add(this.getCompInstConfig2SubSys());
		atomComp2AtomSysEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		structComp2SubSysEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		structComp2SubSysEClass.getESuperTypes().add(this.getCompInstConfig2SubSys());
		compInst2LibRefEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		port2PortsEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		assemblyInst2LineEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());
		del2LineEClass.getESuperTypes().add(this.getAbstractContainerCorrespondenceNode());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractContainerCorrespondenceNodeEClass, AbstractContainerCorrespondenceNode.class, "AbstractContainerCorrespondenceNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractContainerCorrespondenceNode_ChildCorresp(), this.getAbstractContainerCorrespondenceNode(), null, "childCorresp", null, 0, -1, AbstractContainerCorrespondenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootNode2SimulinkContainerEClass, RootNode2SimulinkContainer.class, "RootNode2SimulinkContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootNode2SimulinkContainer_RootNode(), theModelinstancePackage.getRootNode(), null, "RootNode", null, 0, 1, RootNode2SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootNode2SimulinkContainer_SimulinkContainer(), theSimulinkPackage.getSimulinkContainer(), null, "SimulinkContainer", null, 0, 1, RootNode2SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootNode2SimulinkContainer_PacketBus(), theSimulinkPackage.getBus(), null, "packetBus", null, 0, 1, RootNode2SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootNode2SimulinkContainer_BusOfBusses(), theSimulinkPackage.getBus(), null, "busOfBusses", null, 0, 1, RootNode2SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootNode2SimulinkContainer_Cic2ss(), this.getCompInstConfig2SubSys(), null, "cic2ss", null, 0, -1, RootNode2SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootNode2SimulinkContainer_AtomCompLib(), theSimulinkPackage.getSimulinkLibrary(), null, "atomCompLib", null, 0, 1, RootNode2SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modElCat2SimLibEClass, ModElCat2SimLib.class, "ModElCat2SimLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModElCat2SimLib_ModElCat(), theModelinstancePackage.getModelElementCategory(), null, "modElCat", null, 0, 1, ModElCat2SimLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModElCat2SimLib_SimLib(), theSimulinkPackage.getSimulinkLibrary(), null, "simLib", null, 0, -1, ModElCat2SimLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compInstConfig2SubSysEClass, CompInstConfig2SubSys.class, "CompInstConfig2SubSys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompInstConfig2SubSys_InstConfig(), theInstancePackage.getComponentInstanceConfiguration(), null, "instConfig", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_SubSys(), theSimulinkPackage.getSubSystem(), null, "subSys", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_CommunicationSwitch(), theSimulinkPackage.getSubSystem(), null, "communicationSwitch", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_BusCreator(), theSimulinkPackage.getBusCreator(), null, "busCreator", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_BusSelector(), theSimulinkPackage.getBusSelector(), null, "busSelector", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_BusCreatorOutPort(), theSimulinkPackage.getOutPortBlock(), null, "busCreatorOutPort", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_BusSelectorInPort(), theSimulinkPackage.getInPortBlock(), null, "busSelectorInPort", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_BusOfBusses(), theSimulinkPackage.getLine(), null, "busOfBusses", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_CS_inPort(), theSimulinkPackage.getInPortBlock(), null, "CS_inPort", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInstConfig2SubSys_CS_outPort(), theSimulinkPackage.getOutPortBlock(), null, "CS_outPort", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompInstConfig2SubSys_CompInstName(), theEcorePackage.getEString(), "compInstName", null, 0, 1, CompInstConfig2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instConfig2SimModEClass, InstConfig2SimMod.class, "InstConfig2SimMod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstConfig2SimMod_ModelElementCategory(), theModelinstancePackage.getModelElementCategory(), null, "ModelElementCategory", null, 0, 1, InstConfig2SimMod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomComp2AtomSysEClass, AtomComp2AtomSys.class, "AtomComp2AtomSys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomComp2AtomSys_ClockSignal(), theSimulinkPackage.getInPortBlock(), null, "clockSignal", null, 0, 1, AtomComp2AtomSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomComp2AtomSys_Chart(), theStateflowPackage.getChart(), null, "chart", null, 0, 1, AtomComp2AtomSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomComp2AtomSys_Comp(), theComponentPackage.getComponent(), null, "comp", null, 0, 1, AtomComp2AtomSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomComp2AtomSys_Sys(), theSimulinkPackage.getSubSystem(), null, "sys", null, 0, 1, AtomComp2AtomSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structComp2SubSysEClass, StructComp2SubSys.class, "StructComp2SubSys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructComp2SubSys_ComponentInstance(), theInstancePackage.getComponentInstance(), null, "ComponentInstance", null, 0, 1, StructComp2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructComp2SubSys_LibraryReference(), theSimulinkPackage.getLibraryReference(), null, "LibraryReference", null, 0, 1, StructComp2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructComp2SubSys_Comp(), theComponentPackage.getComponent(), null, "comp", null, 0, 1, StructComp2SubSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compInst2LibRefEClass, CompInst2LibRef.class, "CompInst2LibRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompInst2LibRef_CompInst(), theInstancePackage.getComponentInstance(), null, "compInst", null, 0, 1, CompInst2LibRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompInst2LibRef_LibRef(), theSimulinkPackage.getLibraryReference(), null, "libRef", null, 0, 1, CompInst2LibRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port2PortsEClass, Port2Ports.class, "Port2Ports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort2Ports_InPort(), theSimulinkPackage.getInPortBlock(), null, "inPort", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_OutPort(), theSimulinkPackage.getOutPortBlock(), null, "outPort", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Port(), theComponentPackage.getPort(), null, "port", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Help_inPort(), theSimulinkPackage.getInPortBlock(), null, "help_inPort", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Help_outPort(), theSimulinkPackage.getOutPortBlock(), null, "help_outPort", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_PortInst(), theInstancePackage.getPortInstance(), null, "portInst", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_MultiPortInst(), theInstancePackage.getDiscreteMultiPortInstance(), null, "multiPortInst", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_CompInst(), theInstancePackage.getComponentInstance(), null, "compInst", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_ReadIn(), theSimulinkPackage.getInPortBlock(), null, "sc_ReadIn", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_ReadOut(), theSimulinkPackage.getOutPortBlock(), null, "sc_ReadOut", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_WriteIn(), theSimulinkPackage.getInPortBlock(), null, "sc_WriteIn", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_WriteOut(), theSimulinkPackage.getOutPortBlock(), null, "sc_WriteOut", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_help_ReadIn(), theSimulinkPackage.getOutPortBlock(), null, "sc_help_ReadIn", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_help_ReadOut(), theSimulinkPackage.getInPortBlock(), null, "sc_help_ReadOut", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_help_WriteIn(), theSimulinkPackage.getOutPortBlock(), null, "sc_help_WriteIn", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Sc_help_WriteOut(), theSimulinkPackage.getInPortBlock(), null, "sc_help_WriteOut", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Mi(), theMsgtypePackage.getMessageTypeRepository(), null, "mi", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Net_address_inPort(), theSimulinkPackage.getInPortBlock(), null, "net_address_inPort", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Receiver_net_address_inPort(), theSimulinkPackage.getInPortBlock(), null, "receiver_net_address_inPort", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_Constant(), theSimulinkPackage.getConstant(), null, "constant", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_PortType(), theTypesPackage.getDataType(), null, "portType", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_LineFromReadOut(), theSimulinkPackage.getLine(), null, "lineFromReadOut", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_LineToReadIn(), theSimulinkPackage.getLine(), null, "lineToReadIn", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort2Ports_LinkLayer(), theMsglibPackage.getLinkLayer(), null, "linkLayer", null, 0, 1, Port2Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyInst2LineEClass, AssemblyInst2Line.class, "AssemblyInst2Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyInst2Line_AssemblyInst(), theInstancePackage.getAssemblyConnectorInstance(), null, "assemblyInst", null, 0, 1, AssemblyInst2Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyInst2Line_Line(), theSimulinkPackage.getLine(), null, "line", null, 0, -1, AssemblyInst2Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(del2LineEClass, Del2Line.class, "Del2Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDel2Line_DelegationInstance(), theInstancePackage.getDelegationConnectorInstance(), null, "DelegationInstance", null, 0, 1, Del2Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDel2Line_Line(), theSimulinkPackage.getLine(), null, "Line", null, 0, -1, Del2Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Fujaba2simulinkPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusElement;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.Constant;
import org.muml.simulink.DataType;
import org.muml.simulink.DigitalClock;
import org.muml.simulink.Element;
import org.muml.simulink.EmbeddedMatlabFunction;
import org.muml.simulink.EnablePort;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.Line;
import org.muml.simulink.MiscBlock;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.Parameter;
import org.muml.simulink.PortBlock;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.SubSystem;
import org.muml.simulink.TriggerEvent;
import org.muml.simulink.TriggerPort;
import org.muml.simulink.UnitDelay;
import org.muml.simulink.ZeroOrderHold;
import org.muml.simulink.msglib.MsglibPackage;
import org.muml.simulink.msglib.buffer.BufferPackage;
import org.muml.simulink.msglib.buffer.impl.BufferPackageImpl;
import org.muml.simulink.msglib.impl.MsglibPackageImpl;
import org.muml.simulink.reconfiguration.ReconfigurationPackage;
import org.muml.simulink.reconfiguration.impl.ReconfigurationPackageImpl;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.impl.StateflowPackageImpl;
import org.muml.simulink.util.SimulinkValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulinkPackageImpl extends EPackageImpl implements SimulinkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulinkModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPortBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedMatlabFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miscBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulinkContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulinkLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulinkFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPortBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeroOrderHoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterTypeEDataType = null;

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
	 * @see org.muml.simulink.SimulinkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulinkPackageImpl() {
		super(eNS_URI, SimulinkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimulinkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulinkPackage init() {
		if (isInited) return (SimulinkPackage)EPackage.Registry.INSTANCE.getEPackage(SimulinkPackage.eNS_URI);

		// Obtain or create and register package
		SimulinkPackageImpl theSimulinkPackage = (SimulinkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulinkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulinkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StateflowPackageImpl theStateflowPackage = (StateflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) instanceof StateflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI) : StateflowPackage.eINSTANCE);
		MsglibPackageImpl theMsglibPackage = (MsglibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI) instanceof MsglibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI) : MsglibPackage.eINSTANCE);
		BufferPackageImpl theBufferPackage = (BufferPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI) instanceof BufferPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BufferPackage.eNS_URI) : BufferPackage.eINSTANCE);
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) : ReconfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theSimulinkPackage.createPackageContents();
		theStateflowPackage.createPackageContents();
		theMsglibPackage.createPackageContents();
		theBufferPackage.createPackageContents();
		theReconfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theSimulinkPackage.initializePackageContents();
		theStateflowPackage.initializePackageContents();
		theMsglibPackage.initializePackageContents();
		theBufferPackage.initializePackageContents();
		theReconfigurationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimulinkPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimulinkValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimulinkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulinkPackage.eNS_URI, theSimulinkPackage);
		return theSimulinkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Parent() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Name() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OutPorts() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_InPorts() {
		return (EReference)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_IncomingLines() {
		return (EReference)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OutgoingLines() {
		return (EReference)blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__GetFullyQualifiedName() {
		return blockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulinkModel() {
		return simulinkModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulinkModel_Root() {
		return (EReference)simulinkModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Parameters() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetParameter__String() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_SourcePort() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_TargetPort() {
		return (EReference)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_SourceBlock() {
		return (EReference)lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_TargetBlock() {
		return (EReference)lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Bus() {
		return (EReference)lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSystem() {
		return subSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_Lines() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_Blocks() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_SubSystems() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSystem_AllBlocks() {
		return (EReference)subSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubSystem__GetBlockByName__String() {
		return subSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPortBlock() {
		return inPortBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPortBlock_Block() {
		return (EReference)inPortBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedMatlabFunction() {
		return embeddedMatlabFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedMatlabFunction_Code() {
		return (EAttribute)embeddedMatlabFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiscBlock() {
		return miscBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiscBlock_Type() {
		return (EAttribute)miscBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulinkContainer() {
		return simulinkContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulinkContainer_Models() {
		return (EReference)simulinkContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulinkContainer_Libraries() {
		return (EReference)simulinkContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulinkLibrary() {
		return simulinkLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryReference() {
		return libraryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryReference_SourceBlock() {
		return (EReference)libraryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulinkFile() {
		return simulinkFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulinkFile_StateflowMachine() {
		return (EReference)simulinkFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulinkFile_Buses() {
		return (EReference)simulinkFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPortBlock() {
		return outPortBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPortBlock_Block() {
		return (EReference)outPortBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChartBlock() {
		return chartBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartBlock_Chart() {
		return (EReference)chartBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Name() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Elements() {
		return (EReference)busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusCreator() {
		return busCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusCreator_Bus() {
		return (EReference)busCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusSelector() {
		return busSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSelector_Bus() {
		return (EReference)busSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortBlock() {
		return portBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortBlock_Dimensions() {
		return (EAttribute)portBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortBlock_Type() {
		return (EAttribute)portBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortBlock_InitialCondition() {
		return (EAttribute)portBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitDelay() {
		return unitDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalClock() {
		return digitalClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalClock_SampleTime() {
		return (EAttribute)digitalClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Type() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerPort() {
		return triggerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerPort_TriggerInput() {
		return (EAttribute)triggerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnablePort() {
		return enablePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusElement() {
		return busElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusElement_Name() {
		return (EAttribute)busElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusElement_Dimensions() {
		return (EAttribute)busElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusElement_Type() {
		return (EAttribute)busElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusElement_Bus() {
		return (EReference)busElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZeroOrderHold() {
		return zeroOrderHoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZeroOrderHold_SampleTime() {
		return (EAttribute)zeroOrderHoldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerEvent() {
		return triggerEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParameterType() {
		return parameterTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkFactory getSimulinkFactory() {
		return (SimulinkFactory)getEFactoryInstance();
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
		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__PARENT);
		createEAttribute(blockEClass, BLOCK__NAME);
		createEReference(blockEClass, BLOCK__OUT_PORTS);
		createEReference(blockEClass, BLOCK__IN_PORTS);
		createEReference(blockEClass, BLOCK__INCOMING_LINES);
		createEReference(blockEClass, BLOCK__OUTGOING_LINES);
		createEOperation(blockEClass, BLOCK___GET_FULLY_QUALIFIED_NAME);

		simulinkModelEClass = createEClass(SIMULINK_MODEL);
		createEReference(simulinkModelEClass, SIMULINK_MODEL__ROOT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__PARAMETERS);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEOperation(elementEClass, ELEMENT___GET_PARAMETER__STRING);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__SOURCE_PORT);
		createEReference(lineEClass, LINE__TARGET_PORT);
		createEReference(lineEClass, LINE__SOURCE_BLOCK);
		createEReference(lineEClass, LINE__TARGET_BLOCK);
		createEReference(lineEClass, LINE__BUS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		subSystemEClass = createEClass(SUB_SYSTEM);
		createEReference(subSystemEClass, SUB_SYSTEM__LINES);
		createEReference(subSystemEClass, SUB_SYSTEM__BLOCKS);
		createEReference(subSystemEClass, SUB_SYSTEM__SUB_SYSTEMS);
		createEReference(subSystemEClass, SUB_SYSTEM__ALL_BLOCKS);
		createEOperation(subSystemEClass, SUB_SYSTEM___GET_BLOCK_BY_NAME__STRING);

		inPortBlockEClass = createEClass(IN_PORT_BLOCK);
		createEReference(inPortBlockEClass, IN_PORT_BLOCK__BLOCK);

		embeddedMatlabFunctionEClass = createEClass(EMBEDDED_MATLAB_FUNCTION);
		createEAttribute(embeddedMatlabFunctionEClass, EMBEDDED_MATLAB_FUNCTION__CODE);

		miscBlockEClass = createEClass(MISC_BLOCK);
		createEAttribute(miscBlockEClass, MISC_BLOCK__TYPE);

		simulinkContainerEClass = createEClass(SIMULINK_CONTAINER);
		createEReference(simulinkContainerEClass, SIMULINK_CONTAINER__MODELS);
		createEReference(simulinkContainerEClass, SIMULINK_CONTAINER__LIBRARIES);

		simulinkLibraryEClass = createEClass(SIMULINK_LIBRARY);

		libraryReferenceEClass = createEClass(LIBRARY_REFERENCE);
		createEReference(libraryReferenceEClass, LIBRARY_REFERENCE__SOURCE_BLOCK);

		simulinkFileEClass = createEClass(SIMULINK_FILE);
		createEReference(simulinkFileEClass, SIMULINK_FILE__STATEFLOW_MACHINE);
		createEReference(simulinkFileEClass, SIMULINK_FILE__BUSES);

		outPortBlockEClass = createEClass(OUT_PORT_BLOCK);
		createEReference(outPortBlockEClass, OUT_PORT_BLOCK__BLOCK);

		chartBlockEClass = createEClass(CHART_BLOCK);
		createEReference(chartBlockEClass, CHART_BLOCK__CHART);

		busEClass = createEClass(BUS);
		createEAttribute(busEClass, BUS__NAME);
		createEReference(busEClass, BUS__ELEMENTS);

		busCreatorEClass = createEClass(BUS_CREATOR);
		createEReference(busCreatorEClass, BUS_CREATOR__BUS);

		busSelectorEClass = createEClass(BUS_SELECTOR);
		createEReference(busSelectorEClass, BUS_SELECTOR__BUS);

		portBlockEClass = createEClass(PORT_BLOCK);
		createEAttribute(portBlockEClass, PORT_BLOCK__DIMENSIONS);
		createEAttribute(portBlockEClass, PORT_BLOCK__TYPE);
		createEAttribute(portBlockEClass, PORT_BLOCK__INITIAL_CONDITION);

		unitDelayEClass = createEClass(UNIT_DELAY);

		digitalClockEClass = createEClass(DIGITAL_CLOCK);
		createEAttribute(digitalClockEClass, DIGITAL_CLOCK__SAMPLE_TIME);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__VALUE);
		createEAttribute(constantEClass, CONSTANT__TYPE);

		triggerPortEClass = createEClass(TRIGGER_PORT);
		createEAttribute(triggerPortEClass, TRIGGER_PORT__TRIGGER_INPUT);

		enablePortEClass = createEClass(ENABLE_PORT);

		busElementEClass = createEClass(BUS_ELEMENT);
		createEAttribute(busElementEClass, BUS_ELEMENT__NAME);
		createEAttribute(busElementEClass, BUS_ELEMENT__DIMENSIONS);
		createEAttribute(busElementEClass, BUS_ELEMENT__TYPE);
		createEReference(busElementEClass, BUS_ELEMENT__BUS);

		zeroOrderHoldEClass = createEClass(ZERO_ORDER_HOLD);
		createEAttribute(zeroOrderHoldEClass, ZERO_ORDER_HOLD__SAMPLE_TIME);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		triggerEventEEnum = createEEnum(TRIGGER_EVENT);

		// Create data types
		parameterTypeEDataType = createEDataType(PARAMETER_TYPE);
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
		StateflowPackage theStateflowPackage = (StateflowPackage)EPackage.Registry.INSTANCE.getEPackage(StateflowPackage.eNS_URI);
		MsglibPackage theMsglibPackage = (MsglibPackage)EPackage.Registry.INSTANCE.getEPackage(MsglibPackage.eNS_URI);
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStateflowPackage);
		getESubpackages().add(theMsglibPackage);
		getESubpackages().add(theReconfigurationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockEClass.getESuperTypes().add(this.getElement());
		simulinkModelEClass.getESuperTypes().add(this.getSimulinkFile());
		lineEClass.getESuperTypes().add(this.getElement());
		subSystemEClass.getESuperTypes().add(this.getBlock());
		inPortBlockEClass.getESuperTypes().add(this.getPortBlock());
		embeddedMatlabFunctionEClass.getESuperTypes().add(this.getBlock());
		miscBlockEClass.getESuperTypes().add(this.getBlock());
		simulinkContainerEClass.getESuperTypes().add(this.getElement());
		simulinkLibraryEClass.getESuperTypes().add(this.getSimulinkFile());
		libraryReferenceEClass.getESuperTypes().add(this.getBlock());
		simulinkFileEClass.getESuperTypes().add(this.getSubSystem());
		outPortBlockEClass.getESuperTypes().add(this.getPortBlock());
		chartBlockEClass.getESuperTypes().add(this.getBlock());
		busEClass.getESuperTypes().add(this.getElement());
		busCreatorEClass.getESuperTypes().add(this.getBlock());
		busSelectorEClass.getESuperTypes().add(this.getBlock());
		portBlockEClass.getESuperTypes().add(this.getBlock());
		unitDelayEClass.getESuperTypes().add(this.getBlock());
		digitalClockEClass.getESuperTypes().add(this.getBlock());
		constantEClass.getESuperTypes().add(this.getBlock());
		triggerPortEClass.getESuperTypes().add(this.getInPortBlock());
		enablePortEClass.getESuperTypes().add(this.getInPortBlock());
		zeroOrderHoldEClass.getESuperTypes().add(this.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Parent(), this.getSubSystem(), this.getSubSystem_Blocks(), "parent", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OutPorts(), this.getOutPortBlock(), this.getOutPortBlock_Block(), "outPorts", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_InPorts(), this.getInPortBlock(), this.getInPortBlock_Block(), "inPorts", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_IncomingLines(), this.getLine(), this.getLine_TargetBlock(), "incomingLines", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OutgoingLines(), this.getLine(), this.getLine_SourceBlock(), "outgoingLines", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBlock__GetFullyQualifiedName(), ecorePackage.getEString(), "getFullyQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simulinkModelEClass, SimulinkModel.class, "SimulinkModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulinkModel_Root(), this.getSimulinkContainer(), this.getSimulinkContainer_Models(), "root", null, 0, 1, SimulinkModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", "", 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getElement__GetParameter__String(), ecorePackage.getEString(), "getParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_SourcePort(), this.getOutPortBlock(), null, "sourcePort", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_TargetPort(), this.getInPortBlock(), null, "targetPort", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_SourceBlock(), this.getBlock(), this.getBlock_OutgoingLines(), "sourceBlock", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_TargetBlock(), this.getBlock(), this.getBlock_IncomingLines(), "targetBlock", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Bus(), this.getBus(), null, "bus", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getParameterType(), "type", "", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSystemEClass, SubSystem.class, "SubSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubSystem_Lines(), this.getLine(), null, "lines", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubSystem_Blocks(), this.getBlock(), this.getBlock_Parent(), "blocks", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_SubSystems(), this.getSubSystem(), null, "subSystems", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubSystem_AllBlocks(), this.getBlock(), null, "allBlocks", null, 0, -1, SubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSubSystem__GetBlockByName__String(), this.getBlock(), "getBlockByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inPortBlockEClass, InPortBlock.class, "InPortBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInPortBlock_Block(), this.getBlock(), this.getBlock_InPorts(), "block", null, 1, 1, InPortBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedMatlabFunctionEClass, EmbeddedMatlabFunction.class, "EmbeddedMatlabFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedMatlabFunction_Code(), ecorePackage.getEString(), "code", null, 0, 1, EmbeddedMatlabFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miscBlockEClass, MiscBlock.class, "MiscBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiscBlock_Type(), ecorePackage.getEString(), "type", null, 0, 1, MiscBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulinkContainerEClass, SimulinkContainer.class, "SimulinkContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulinkContainer_Models(), this.getSimulinkModel(), this.getSimulinkModel_Root(), "models", null, 0, -1, SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulinkContainer_Libraries(), this.getSimulinkLibrary(), null, "libraries", null, 0, -1, SimulinkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulinkLibraryEClass, SimulinkLibrary.class, "SimulinkLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryReferenceEClass, LibraryReference.class, "LibraryReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryReference_SourceBlock(), this.getBlock(), null, "sourceBlock", null, 1, 1, LibraryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulinkFileEClass, SimulinkFile.class, "SimulinkFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulinkFile_StateflowMachine(), theStateflowPackage.getStateflowMachine(), theStateflowPackage.getStateflowMachine_Model(), "stateflowMachine", null, 0, 1, SimulinkFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulinkFile_Buses(), this.getBus(), null, "buses", null, 0, -1, SimulinkFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outPortBlockEClass, OutPortBlock.class, "OutPortBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutPortBlock_Block(), this.getBlock(), this.getBlock_OutPorts(), "block", null, 1, 1, OutPortBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartBlockEClass, ChartBlock.class, "ChartBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChartBlock_Chart(), theStateflowPackage.getChart(), theStateflowPackage.getChart_Block(), "chart", null, 1, 1, ChartBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBus_Name(), ecorePackage.getEString(), "name", null, 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_Elements(), this.getBusElement(), null, "elements", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busCreatorEClass, BusCreator.class, "BusCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusCreator_Bus(), this.getBus(), null, "bus", null, 0, 1, BusCreator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(busSelectorEClass, BusSelector.class, "BusSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusSelector_Bus(), this.getBus(), null, "bus", null, 0, 1, BusSelector.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portBlockEClass, PortBlock.class, "PortBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortBlock_Dimensions(), ecorePackage.getEString(), "dimensions", null, 0, 1, PortBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBlock_Type(), this.getDataType(), "type", null, 0, 1, PortBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortBlock_InitialCondition(), ecorePackage.getEString(), "initialCondition", null, 0, 1, PortBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitDelayEClass, UnitDelay.class, "UnitDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalClockEClass, DigitalClock.class, "DigitalClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalClock_SampleTime(), ecorePackage.getEDouble(), "sampleTime", "1.0", 1, 1, DigitalClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", "1", 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Type(), this.getDataType(), "type", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerPortEClass, TriggerPort.class, "TriggerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerPort_TriggerInput(), this.getTriggerEvent(), "triggerInput", "rising", 1, 1, TriggerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enablePortEClass, EnablePort.class, "EnablePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busElementEClass, BusElement.class, "BusElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, BusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusElement_Dimensions(), ecorePackage.getEString(), "dimensions", null, 0, 1, BusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusElement_Type(), this.getDataType(), "type", null, 0, 1, BusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusElement_Bus(), this.getBus(), null, "bus", null, 0, 1, BusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeroOrderHoldEClass, ZeroOrderHold.class, "ZeroOrderHold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZeroOrderHold_SampleTime(), ecorePackage.getEString(), "sampleTime", null, 1, 1, ZeroOrderHold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INHERIT);
		addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);
		addEEnumLiteral(dataTypeEEnum, DataType.SINGLE);
		addEEnumLiteral(dataTypeEEnum, DataType.INT32);
		addEEnumLiteral(dataTypeEEnum, DataType.INT16);
		addEEnumLiteral(dataTypeEEnum, DataType.INT8);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT32);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT16);
		addEEnumLiteral(dataTypeEEnum, DataType.UINT8);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.BUS);

		initEEnum(triggerEventEEnum, TriggerEvent.class, "TriggerEvent");
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.RISING);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.FALLING);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.EITHER);

		// Initialize data types
		initEDataType(parameterTypeEDataType, Object.class, "ParameterType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (subSystemEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoPortsInBlocks InPortInSubSystemNeedsOutPort OutPortInSubSystemNeedsInPort onlySingleTriggerPort onlySingleEnablePort"
		   });	
		addAnnotation
		  (embeddedMatlabFunctionEClass, 
		   source, 
		   new String[] {
			 "constraints", ""
		   });	
		addAnnotation
		  (miscBlockEClass, 
		   source, 
		   new String[] {
			 "constraints", "mustHaveType"
		   });	
		addAnnotation
		  (libraryReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "noReferenceToAnEmptySubBlock referenceNeedsName"
		   });	
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "constraints", "busNeedsName"
		   });	
		addAnnotation
		  (busCreatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneOutPort"
		   });	
		addAnnotation
		  (busSelectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneInPort"
		   });	
		addAnnotation
		  (unitDelayEClass, 
		   source, 
		   new String[] {
			 "constraints", "unitDelayNeedsExactlyOneInportAndOneOutport"
		   });	
		addAnnotation
		  (digitalClockEClass, 
		   source, 
		   new String[] {
			 "constraints", "digitalClockNeedsExactlyOneOutport"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (getBlock__GetFullyQualifiedName(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif self.parent.oclIsUndefined() then\n\t\t\t\t\tself.name\n\t\t\t\telse\n\t\t\t\t\tself.parent.getFullyQualifiedName().concat(\'/\').concat(self.name)\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getElement__GetParameter__String(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t\tif self.parameters->select(p| p.name = name)->size() > 0 then\n\t\t\t\t\tself.parameters->select(p| p.name = name)->first().value\n\t\t\t\telse \n\t\t\t\t\tnull\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (subSystemEClass, 
		   source, 
		   new String[] {
			 "NoPortsInBlocks", "\n\t\t\tself.blocks->forAll(p| not p.oclIsTypeOf(InPortBlock) and not p.oclIsTypeOf(OutPortBlock))",
			 "InPortInSubSystemNeedsOutPort", "self.inPorts->select(p| p.oclIsTypeOf(InPortBlock))->forAll(p| p.outPorts->size() = 1)",
			 "OutPortInSubSystemNeedsInPort", "\n\t\t\tself.outPorts->forAll(p| p.inPorts->size() = 1)",
			 "onlySingleTriggerPort", "self.inPorts->select(p|p.oclIsTypeOf(TriggerPort))->size() <= 1",
			 "onlySingleEnablePort", "self.inPorts->select(p|p.oclIsTypeOf(EnablePort))->size() <= 1"
		   });	
		addAnnotation
		  (getSubSystem_SubSystems(), 
		   source, 
		   new String[] {
			 "derivation", "self.blocks->select(b | b.oclIsTypeOf(SubSystem))->collect(b | b.oclAsType(SubSystem))->asOrderedSet()"
		   });	
		addAnnotation
		  (getSubSystem_AllBlocks(), 
		   source, 
		   new String[] {
			 "derivation", "self.blocks->union(self.inPorts)->union(self.outPorts)->asOrderedSet()"
		   });	
		addAnnotation
		  (embeddedMatlabFunctionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (miscBlockEClass, 
		   source, 
		   new String[] {
			 "mustHaveType", "not self.type.oclIsUndefined()"
		   });	
		addAnnotation
		  (libraryReferenceEClass, 
		   source, 
		   new String[] {
			 "noReferenceToAnEmptySubBlock", "\n\t\t\tself.sourceBlock.oclIsTypeOf(SubSystem) implies self.sourceBlock.oclAsType(SubSystem).allBlocks->size() > 0",
			 "referenceNeedsName", "self.sourceBlock.name <> null and self.sourceBlock.name.size() > 0"
		   });	
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "busNeedsName", "not self.name.oclIsUndefined() and self.name.size() > 0"
		   });	
		addAnnotation
		  (busCreatorEClass, 
		   source, 
		   new String[] {
			 "oneOutPort", "self.outPorts->size() = 1"
		   });	
		addAnnotation
		  (getBusCreator_Bus(), 
		   source, 
		   new String[] {
			 "derivation", "self.outgoingLines->first().bus"
		   });	
		addAnnotation
		  (busSelectorEClass, 
		   source, 
		   new String[] {
			 "oneInPort", "self.inPorts->size() = 1"
		   });	
		addAnnotation
		  (getBusSelector_Bus(), 
		   source, 
		   new String[] {
			 "derivation", "self.incomingLines->first().bus"
		   });	
		addAnnotation
		  (unitDelayEClass, 
		   source, 
		   new String[] {
			 "unitDelayNeedsExactlyOneInportAndOneOutport", "self.inPorts->size() = 1 and self.outPorts->size() = 1"
		   });	
		addAnnotation
		  (digitalClockEClass, 
		   source, 
		   new String[] {
			 "digitalClockNeedsExactlyOneOutport", "self.outPorts->size() = 1"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getSubSystem_SubSystems(), 
		   source, 
		   new String[] {
			 "namespace", ""
		   });
	}

} //SimulinkPackageImpl

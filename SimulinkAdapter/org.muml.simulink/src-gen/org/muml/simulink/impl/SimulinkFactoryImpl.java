/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusElement;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.Constant;
import org.muml.simulink.DataType;
import org.muml.simulink.DigitalClock;
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
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.SubSystem;
import org.muml.simulink.TriggerEvent;
import org.muml.simulink.TriggerPort;
import org.muml.simulink.UnitDelay;
import org.muml.simulink.ZeroOrderHold;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulinkFactoryImpl extends EFactoryImpl implements SimulinkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimulinkFactory init() {
		try {
			SimulinkFactory theSimulinkFactory = (SimulinkFactory)EPackage.Registry.INSTANCE.getEFactory(SimulinkPackage.eNS_URI);
			if (theSimulinkFactory != null) {
				return theSimulinkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimulinkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimulinkPackage.SIMULINK_MODEL: return (EObject)createSimulinkModel();
			case SimulinkPackage.LINE: return (EObject)createLine();
			case SimulinkPackage.PARAMETER: return (EObject)createParameter();
			case SimulinkPackage.SUB_SYSTEM: return (EObject)createSubSystem();
			case SimulinkPackage.IN_PORT_BLOCK: return (EObject)createInPortBlock();
			case SimulinkPackage.EMBEDDED_MATLAB_FUNCTION: return (EObject)createEmbeddedMatlabFunction();
			case SimulinkPackage.MISC_BLOCK: return (EObject)createMiscBlock();
			case SimulinkPackage.SIMULINK_CONTAINER: return (EObject)createSimulinkContainer();
			case SimulinkPackage.SIMULINK_LIBRARY: return (EObject)createSimulinkLibrary();
			case SimulinkPackage.LIBRARY_REFERENCE: return (EObject)createLibraryReference();
			case SimulinkPackage.OUT_PORT_BLOCK: return (EObject)createOutPortBlock();
			case SimulinkPackage.CHART_BLOCK: return (EObject)createChartBlock();
			case SimulinkPackage.BUS: return (EObject)createBus();
			case SimulinkPackage.BUS_CREATOR: return (EObject)createBusCreator();
			case SimulinkPackage.BUS_SELECTOR: return (EObject)createBusSelector();
			case SimulinkPackage.PORT_BLOCK: return (EObject)createPortBlock();
			case SimulinkPackage.UNIT_DELAY: return (EObject)createUnitDelay();
			case SimulinkPackage.DIGITAL_CLOCK: return (EObject)createDigitalClock();
			case SimulinkPackage.CONSTANT: return (EObject)createConstant();
			case SimulinkPackage.TRIGGER_PORT: return (EObject)createTriggerPort();
			case SimulinkPackage.ENABLE_PORT: return (EObject)createEnablePort();
			case SimulinkPackage.BUS_ELEMENT: return (EObject)createBusElement();
			case SimulinkPackage.ZERO_ORDER_HOLD: return (EObject)createZeroOrderHold();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimulinkPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case SimulinkPackage.TRIGGER_EVENT:
				return createTriggerEventFromString(eDataType, initialValue);
			case SimulinkPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimulinkPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case SimulinkPackage.TRIGGER_EVENT:
				return convertTriggerEventToString(eDataType, instanceValue);
			case SimulinkPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkModel createSimulinkModel() {
		SimulinkModelImpl simulinkModel = new SimulinkModelImpl();
		return simulinkModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock createInPortBlock() {
		InPortBlockImpl inPortBlock = new InPortBlockImpl();
		return inPortBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedMatlabFunction createEmbeddedMatlabFunction() {
		EmbeddedMatlabFunctionImpl embeddedMatlabFunction = new EmbeddedMatlabFunctionImpl();
		return embeddedMatlabFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiscBlock createMiscBlock() {
		MiscBlockImpl miscBlock = new MiscBlockImpl();
		return miscBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkContainer createSimulinkContainer() {
		SimulinkContainerImpl simulinkContainer = new SimulinkContainerImpl();
		return simulinkContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkLibrary createSimulinkLibrary() {
		SimulinkLibraryImpl simulinkLibrary = new SimulinkLibraryImpl();
		return simulinkLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryReference createLibraryReference() {
		LibraryReferenceImpl libraryReference = new LibraryReferenceImpl();
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock createOutPortBlock() {
		OutPortBlockImpl outPortBlock = new OutPortBlockImpl();
		return outPortBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartBlock createChartBlock() {
		ChartBlockImpl chartBlock = new ChartBlockImpl();
		return chartBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCreator createBusCreator() {
		BusCreatorImpl busCreator = new BusCreatorImpl();
		return busCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSelector createBusSelector() {
		BusSelectorImpl busSelector = new BusSelectorImpl();
		return busSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortBlock createPortBlock() {
		PortBlockImpl portBlock = new PortBlockImpl();
		return portBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDelay createUnitDelay() {
		UnitDelayImpl unitDelay = new UnitDelayImpl();
		return unitDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalClock createDigitalClock() {
		DigitalClockImpl digitalClock = new DigitalClockImpl();
		return digitalClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPort createTriggerPort() {
		TriggerPortImpl triggerPort = new TriggerPortImpl();
		return triggerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnablePort createEnablePort() {
		EnablePortImpl enablePort = new EnablePortImpl();
		return enablePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusElement createBusElement() {
		BusElementImpl busElement = new BusElementImpl();
		return busElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZeroOrderHold createZeroOrderHold() {
		ZeroOrderHoldImpl zeroOrderHold = new ZeroOrderHoldImpl();
		return zeroOrderHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEventFromString(EDataType eDataType, String initialValue) {
		TriggerEvent result = TriggerEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createParameterTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkPackage getSimulinkPackage() {
		return (SimulinkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimulinkPackage getPackage() {
		return SimulinkPackage.eINSTANCE;
	}

} //SimulinkFactoryImpl

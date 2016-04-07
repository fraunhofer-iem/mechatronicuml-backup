/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusElement;
import org.muml.simulink.BusSelector;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.Constant;
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
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.SubSystem;
import org.muml.simulink.TriggerPort;
import org.muml.simulink.UnitDelay;
import org.muml.simulink.ZeroOrderHold;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.SimulinkPackage
 * @generated
 */
public class SimulinkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulinkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkSwitch() {
		if (modelPackage == null) {
			modelPackage = SimulinkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimulinkPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SIMULINK_MODEL: {
				SimulinkModel simulinkModel = (SimulinkModel)theEObject;
				T result = caseSimulinkModel(simulinkModel);
				if (result == null) result = caseSimulinkFile(simulinkModel);
				if (result == null) result = caseSubSystem(simulinkModel);
				if (result == null) result = caseBlock(simulinkModel);
				if (result == null) result = caseElement(simulinkModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseElement(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SUB_SYSTEM: {
				SubSystem subSystem = (SubSystem)theEObject;
				T result = caseSubSystem(subSystem);
				if (result == null) result = caseBlock(subSystem);
				if (result == null) result = caseElement(subSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.IN_PORT_BLOCK: {
				InPortBlock inPortBlock = (InPortBlock)theEObject;
				T result = caseInPortBlock(inPortBlock);
				if (result == null) result = casePortBlock(inPortBlock);
				if (result == null) result = caseBlock(inPortBlock);
				if (result == null) result = caseElement(inPortBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.EMBEDDED_MATLAB_FUNCTION: {
				EmbeddedMatlabFunction embeddedMatlabFunction = (EmbeddedMatlabFunction)theEObject;
				T result = caseEmbeddedMatlabFunction(embeddedMatlabFunction);
				if (result == null) result = caseBlock(embeddedMatlabFunction);
				if (result == null) result = caseElement(embeddedMatlabFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.MISC_BLOCK: {
				MiscBlock miscBlock = (MiscBlock)theEObject;
				T result = caseMiscBlock(miscBlock);
				if (result == null) result = caseBlock(miscBlock);
				if (result == null) result = caseElement(miscBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SIMULINK_CONTAINER: {
				SimulinkContainer simulinkContainer = (SimulinkContainer)theEObject;
				T result = caseSimulinkContainer(simulinkContainer);
				if (result == null) result = caseElement(simulinkContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SIMULINK_LIBRARY: {
				SimulinkLibrary simulinkLibrary = (SimulinkLibrary)theEObject;
				T result = caseSimulinkLibrary(simulinkLibrary);
				if (result == null) result = caseSimulinkFile(simulinkLibrary);
				if (result == null) result = caseSubSystem(simulinkLibrary);
				if (result == null) result = caseBlock(simulinkLibrary);
				if (result == null) result = caseElement(simulinkLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.LIBRARY_REFERENCE: {
				LibraryReference libraryReference = (LibraryReference)theEObject;
				T result = caseLibraryReference(libraryReference);
				if (result == null) result = caseBlock(libraryReference);
				if (result == null) result = caseElement(libraryReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SIMULINK_FILE: {
				SimulinkFile simulinkFile = (SimulinkFile)theEObject;
				T result = caseSimulinkFile(simulinkFile);
				if (result == null) result = caseSubSystem(simulinkFile);
				if (result == null) result = caseBlock(simulinkFile);
				if (result == null) result = caseElement(simulinkFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.OUT_PORT_BLOCK: {
				OutPortBlock outPortBlock = (OutPortBlock)theEObject;
				T result = caseOutPortBlock(outPortBlock);
				if (result == null) result = casePortBlock(outPortBlock);
				if (result == null) result = caseBlock(outPortBlock);
				if (result == null) result = caseElement(outPortBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CHART_BLOCK: {
				ChartBlock chartBlock = (ChartBlock)theEObject;
				T result = caseChartBlock(chartBlock);
				if (result == null) result = caseBlock(chartBlock);
				if (result == null) result = caseElement(chartBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseElement(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.BUS_CREATOR: {
				BusCreator busCreator = (BusCreator)theEObject;
				T result = caseBusCreator(busCreator);
				if (result == null) result = caseBlock(busCreator);
				if (result == null) result = caseElement(busCreator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.BUS_SELECTOR: {
				BusSelector busSelector = (BusSelector)theEObject;
				T result = caseBusSelector(busSelector);
				if (result == null) result = caseBlock(busSelector);
				if (result == null) result = caseElement(busSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.PORT_BLOCK: {
				PortBlock portBlock = (PortBlock)theEObject;
				T result = casePortBlock(portBlock);
				if (result == null) result = caseBlock(portBlock);
				if (result == null) result = caseElement(portBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.UNIT_DELAY: {
				UnitDelay unitDelay = (UnitDelay)theEObject;
				T result = caseUnitDelay(unitDelay);
				if (result == null) result = caseBlock(unitDelay);
				if (result == null) result = caseElement(unitDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.DIGITAL_CLOCK: {
				DigitalClock digitalClock = (DigitalClock)theEObject;
				T result = caseDigitalClock(digitalClock);
				if (result == null) result = caseBlock(digitalClock);
				if (result == null) result = caseElement(digitalClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseBlock(constant);
				if (result == null) result = caseElement(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.TRIGGER_PORT: {
				TriggerPort triggerPort = (TriggerPort)theEObject;
				T result = caseTriggerPort(triggerPort);
				if (result == null) result = caseInPortBlock(triggerPort);
				if (result == null) result = casePortBlock(triggerPort);
				if (result == null) result = caseBlock(triggerPort);
				if (result == null) result = caseElement(triggerPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.ENABLE_PORT: {
				EnablePort enablePort = (EnablePort)theEObject;
				T result = caseEnablePort(enablePort);
				if (result == null) result = caseInPortBlock(enablePort);
				if (result == null) result = casePortBlock(enablePort);
				if (result == null) result = caseBlock(enablePort);
				if (result == null) result = caseElement(enablePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.BUS_ELEMENT: {
				BusElement busElement = (BusElement)theEObject;
				T result = caseBusElement(busElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.ZERO_ORDER_HOLD: {
				ZeroOrderHold zeroOrderHold = (ZeroOrderHold)theEObject;
				T result = caseZeroOrderHold(zeroOrderHold);
				if (result == null) result = caseBlock(zeroOrderHold);
				if (result == null) result = caseElement(zeroOrderHold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulinkModel(SimulinkModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystem(SubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPortBlock(InPortBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Matlab Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Matlab Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedMatlabFunction(EmbeddedMatlabFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Misc Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Misc Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiscBlock(MiscBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulinkContainer(SimulinkContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulinkLibrary(SimulinkLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryReference(LibraryReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulinkFile(SimulinkFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPortBlock(OutPortBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChartBlock(ChartBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Creator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Creator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusCreator(BusCreator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusSelector(BusSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBlock(PortBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitDelay(UnitDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalClock(DigitalClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerPort(TriggerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnablePort(EnablePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusElement(BusElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zero Order Hold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zero Order Hold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeroOrderHold(ZeroOrderHold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimulinkSwitch

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
import org.muml.simulink.SimulinkFile;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.SimulinkPackage
 * @generated
 */
public class SimulinkValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimulinkValidator INSTANCE = new SimulinkValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.simulink";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimulinkPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimulinkPackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case SimulinkPackage.SIMULINK_MODEL:
				return validateSimulinkModel((SimulinkModel)value, diagnostics, context);
			case SimulinkPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case SimulinkPackage.LINE:
				return validateLine((Line)value, diagnostics, context);
			case SimulinkPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case SimulinkPackage.SUB_SYSTEM:
				return validateSubSystem((SubSystem)value, diagnostics, context);
			case SimulinkPackage.IN_PORT_BLOCK:
				return validateInPortBlock((InPortBlock)value, diagnostics, context);
			case SimulinkPackage.EMBEDDED_MATLAB_FUNCTION:
				return validateEmbeddedMatlabFunction((EmbeddedMatlabFunction)value, diagnostics, context);
			case SimulinkPackage.MISC_BLOCK:
				return validateMiscBlock((MiscBlock)value, diagnostics, context);
			case SimulinkPackage.SIMULINK_CONTAINER:
				return validateSimulinkContainer((SimulinkContainer)value, diagnostics, context);
			case SimulinkPackage.SIMULINK_LIBRARY:
				return validateSimulinkLibrary((SimulinkLibrary)value, diagnostics, context);
			case SimulinkPackage.LIBRARY_REFERENCE:
				return validateLibraryReference((LibraryReference)value, diagnostics, context);
			case SimulinkPackage.SIMULINK_FILE:
				return validateSimulinkFile((SimulinkFile)value, diagnostics, context);
			case SimulinkPackage.OUT_PORT_BLOCK:
				return validateOutPortBlock((OutPortBlock)value, diagnostics, context);
			case SimulinkPackage.CHART_BLOCK:
				return validateChartBlock((ChartBlock)value, diagnostics, context);
			case SimulinkPackage.BUS:
				return validateBus((Bus)value, diagnostics, context);
			case SimulinkPackage.BUS_CREATOR:
				return validateBusCreator((BusCreator)value, diagnostics, context);
			case SimulinkPackage.BUS_SELECTOR:
				return validateBusSelector((BusSelector)value, diagnostics, context);
			case SimulinkPackage.PORT_BLOCK:
				return validatePortBlock((PortBlock)value, diagnostics, context);
			case SimulinkPackage.UNIT_DELAY:
				return validateUnitDelay((UnitDelay)value, diagnostics, context);
			case SimulinkPackage.DIGITAL_CLOCK:
				return validateDigitalClock((DigitalClock)value, diagnostics, context);
			case SimulinkPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case SimulinkPackage.TRIGGER_PORT:
				return validateTriggerPort((TriggerPort)value, diagnostics, context);
			case SimulinkPackage.ENABLE_PORT:
				return validateEnablePort((EnablePort)value, diagnostics, context);
			case SimulinkPackage.BUS_ELEMENT:
				return validateBusElement((BusElement)value, diagnostics, context);
			case SimulinkPackage.ZERO_ORDER_HOLD:
				return validateZeroOrderHold((ZeroOrderHold)value, diagnostics, context);
			case SimulinkPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case SimulinkPackage.TRIGGER_EVENT:
				return validateTriggerEvent((TriggerEvent)value, diagnostics, context);
			case SimulinkPackage.PARAMETER_TYPE:
				return validateParameterType(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulinkModel(SimulinkModel simulinkModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)simulinkModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_NoPortsInBlocks(simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_InPortInSubSystemNeedsOutPort(simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_OutPortInSubSystemNeedsInPort(simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleTriggerPort(simulinkModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleEnablePort(simulinkModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)line, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)subSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_NoPortsInBlocks(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_InPortInSubSystemNeedsOutPort(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_OutPortInSubSystemNeedsInPort(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleTriggerPort(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleEnablePort(subSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoPortsInBlocks constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_SYSTEM__NO_PORTS_IN_BLOCKS__EEXPRESSION = "\n" +
		"\t\t\tself.blocks->forAll(p| not p.oclIsTypeOf(InPortBlock) and not p.oclIsTypeOf(OutPortBlock))";

	/**
	 * Validates the NoPortsInBlocks constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem_NoPortsInBlocks(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.SUB_SYSTEM,
				 subSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoPortsInBlocks",
				 SUB_SYSTEM__NO_PORTS_IN_BLOCKS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InPortInSubSystemNeedsOutPort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_SYSTEM__IN_PORT_IN_SUB_SYSTEM_NEEDS_OUT_PORT__EEXPRESSION = "self.inPorts->select(p| p.oclIsTypeOf(InPortBlock))->forAll(p| p.outPorts->size() = 1)";

	/**
	 * Validates the InPortInSubSystemNeedsOutPort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem_InPortInSubSystemNeedsOutPort(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.SUB_SYSTEM,
				 subSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "InPortInSubSystemNeedsOutPort",
				 SUB_SYSTEM__IN_PORT_IN_SUB_SYSTEM_NEEDS_OUT_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutPortInSubSystemNeedsInPort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_SYSTEM__OUT_PORT_IN_SUB_SYSTEM_NEEDS_IN_PORT__EEXPRESSION = "\n" +
		"\t\t\tself.outPorts->forAll(p| p.inPorts->size() = 1)";

	/**
	 * Validates the OutPortInSubSystemNeedsInPort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem_OutPortInSubSystemNeedsInPort(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.SUB_SYSTEM,
				 subSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OutPortInSubSystemNeedsInPort",
				 SUB_SYSTEM__OUT_PORT_IN_SUB_SYSTEM_NEEDS_IN_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlySingleTriggerPort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_SYSTEM__ONLY_SINGLE_TRIGGER_PORT__EEXPRESSION = "self.inPorts->select(p|p.oclIsTypeOf(TriggerPort))->size() <= 1";

	/**
	 * Validates the onlySingleTriggerPort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem_onlySingleTriggerPort(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.SUB_SYSTEM,
				 subSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlySingleTriggerPort",
				 SUB_SYSTEM__ONLY_SINGLE_TRIGGER_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlySingleEnablePort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_SYSTEM__ONLY_SINGLE_ENABLE_PORT__EEXPRESSION = "self.inPorts->select(p|p.oclIsTypeOf(EnablePort))->size() <= 1";

	/**
	 * Validates the onlySingleEnablePort constraint of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem_onlySingleEnablePort(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.SUB_SYSTEM,
				 subSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlySingleEnablePort",
				 SUB_SYSTEM__ONLY_SINGLE_ENABLE_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInPortBlock(InPortBlock inPortBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)inPortBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddedMatlabFunction(EmbeddedMatlabFunction embeddedMatlabFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)embeddedMatlabFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiscBlock(MiscBlock miscBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)miscBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)miscBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateMiscBlock_mustHaveType(miscBlock, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveType constraint of '<em>Misc Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MISC_BLOCK__MUST_HAVE_TYPE__EEXPRESSION = "not self.type.oclIsUndefined()";

	/**
	 * Validates the mustHaveType constraint of '<em>Misc Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiscBlock_mustHaveType(MiscBlock miscBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.MISC_BLOCK,
				 miscBlock,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "mustHaveType",
				 MISC_BLOCK__MUST_HAVE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulinkContainer(SimulinkContainer simulinkContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)simulinkContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulinkLibrary(SimulinkLibrary simulinkLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)simulinkLibrary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_NoPortsInBlocks(simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_InPortInSubSystemNeedsOutPort(simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_OutPortInSubSystemNeedsInPort(simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleTriggerPort(simulinkLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleEnablePort(simulinkLibrary, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryReference(LibraryReference libraryReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)libraryReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateLibraryReference_noReferenceToAnEmptySubBlock(libraryReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateLibraryReference_referenceNeedsName(libraryReference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noReferenceToAnEmptySubBlock constraint of '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIBRARY_REFERENCE__NO_REFERENCE_TO_AN_EMPTY_SUB_BLOCK__EEXPRESSION = "\n" +
		"\t\t\tself.sourceBlock.oclIsTypeOf(SubSystem) implies self.sourceBlock.oclAsType(SubSystem).allBlocks->size() > 0";

	/**
	 * Validates the noReferenceToAnEmptySubBlock constraint of '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryReference_noReferenceToAnEmptySubBlock(LibraryReference libraryReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.LIBRARY_REFERENCE,
				 libraryReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noReferenceToAnEmptySubBlock",
				 LIBRARY_REFERENCE__NO_REFERENCE_TO_AN_EMPTY_SUB_BLOCK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the referenceNeedsName constraint of '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIBRARY_REFERENCE__REFERENCE_NEEDS_NAME__EEXPRESSION = "self.sourceBlock.name <> null and self.sourceBlock.name.size() > 0";

	/**
	 * Validates the referenceNeedsName constraint of '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryReference_referenceNeedsName(LibraryReference libraryReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.LIBRARY_REFERENCE,
				 libraryReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "referenceNeedsName",
				 LIBRARY_REFERENCE__REFERENCE_NEEDS_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulinkFile(SimulinkFile simulinkFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)simulinkFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_NoPortsInBlocks(simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_InPortInSubSystemNeedsOutPort(simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_OutPortInSubSystemNeedsInPort(simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleTriggerPort(simulinkFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSystem_onlySingleEnablePort(simulinkFile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutPortBlock(OutPortBlock outPortBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)outPortBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChartBlock(ChartBlock chartBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)chartBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)bus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateBus_busNeedsName(bus, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the busNeedsName constraint of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUS__BUS_NEEDS_NAME__EEXPRESSION = "not self.name.oclIsUndefined() and self.name.size() > 0";

	/**
	 * Validates the busNeedsName constraint of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus_busNeedsName(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.BUS,
				 bus,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "busNeedsName",
				 BUS__BUS_NEEDS_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusCreator(BusCreator busCreator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)busCreator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)busCreator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBusCreator_oneOutPort(busCreator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneOutPort constraint of '<em>Bus Creator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUS_CREATOR__ONE_OUT_PORT__EEXPRESSION = "self.outPorts->size() = 1";

	/**
	 * Validates the oneOutPort constraint of '<em>Bus Creator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusCreator_oneOutPort(BusCreator busCreator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.BUS_CREATOR,
				 busCreator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneOutPort",
				 BUS_CREATOR__ONE_OUT_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusSelector(BusSelector busSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)busSelector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)busSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validateBusSelector_oneInPort(busSelector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneInPort constraint of '<em>Bus Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUS_SELECTOR__ONE_IN_PORT__EEXPRESSION = "self.inPorts->size() = 1";

	/**
	 * Validates the oneInPort constraint of '<em>Bus Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusSelector_oneInPort(BusSelector busSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.BUS_SELECTOR,
				 busSelector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneInPort",
				 BUS_SELECTOR__ONE_IN_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortBlock(PortBlock portBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)portBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDelay(UnitDelay unitDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)unitDelay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)unitDelay, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitDelay_unitDelayNeedsExactlyOneInportAndOneOutport(unitDelay, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the unitDelayNeedsExactlyOneInportAndOneOutport constraint of '<em>Unit Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_DELAY__UNIT_DELAY_NEEDS_EXACTLY_ONE_INPORT_AND_ONE_OUTPORT__EEXPRESSION = "self.inPorts->size() = 1 and self.outPorts->size() = 1";

	/**
	 * Validates the unitDelayNeedsExactlyOneInportAndOneOutport constraint of '<em>Unit Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDelay_unitDelayNeedsExactlyOneInportAndOneOutport(UnitDelay unitDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.UNIT_DELAY,
				 unitDelay,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "unitDelayNeedsExactlyOneInportAndOneOutport",
				 UNIT_DELAY__UNIT_DELAY_NEEDS_EXACTLY_ONE_INPORT_AND_ONE_OUTPORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalClock(DigitalClock digitalClock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)digitalClock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)digitalClock, diagnostics, context);
		if (result || diagnostics != null) result &= validateDigitalClock_digitalClockNeedsExactlyOneOutport(digitalClock, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the digitalClockNeedsExactlyOneOutport constraint of '<em>Digital Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DIGITAL_CLOCK__DIGITAL_CLOCK_NEEDS_EXACTLY_ONE_OUTPORT__EEXPRESSION = "self.outPorts->size() = 1";

	/**
	 * Validates the digitalClockNeedsExactlyOneOutport constraint of '<em>Digital Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalClock_digitalClockNeedsExactlyOneOutport(DigitalClock digitalClock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimulinkPackage.Literals.DIGITAL_CLOCK,
				 digitalClock,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "digitalClockNeedsExactlyOneOutport",
				 DIGITAL_CLOCK__DIGITAL_CLOCK_NEEDS_EXACTLY_ONE_OUTPORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)constant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerPort(TriggerPort triggerPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)triggerPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnablePort(EnablePort enablePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)enablePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusElement(BusElement busElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)busElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeroOrderHold(ZeroOrderHold zeroOrderHold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)zeroOrderHold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEvent(TriggerEvent triggerEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(Object parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimulinkValidator

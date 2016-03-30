/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.simulink.adapter.model.Block;
import org.muml.simulink.adapter.model.Bus;
import org.muml.simulink.adapter.model.BusCreator;
import org.muml.simulink.adapter.model.BusElement;
import org.muml.simulink.adapter.model.BusSelector;
import org.muml.simulink.adapter.model.ChartBlock;
import org.muml.simulink.adapter.model.Constant;
import org.muml.simulink.adapter.model.DigitalClock;
import org.muml.simulink.adapter.model.Element;
import org.muml.simulink.adapter.model.EmbeddedMatlabFunction;
import org.muml.simulink.adapter.model.EnablePort;
import org.muml.simulink.adapter.model.InPortBlock;
import org.muml.simulink.adapter.model.LibraryReference;
import org.muml.simulink.adapter.model.Line;
import org.muml.simulink.adapter.model.MiscBlock;
import org.muml.simulink.adapter.model.OutPortBlock;
import org.muml.simulink.adapter.model.Parameter;
import org.muml.simulink.adapter.model.PortBlock;
import org.muml.simulink.adapter.model.SimulinkContainer;
import org.muml.simulink.adapter.model.SimulinkFile;
import org.muml.simulink.adapter.model.SimulinkLibrary;
import org.muml.simulink.adapter.model.SimulinkModel;
import org.muml.simulink.adapter.model.SimulinkPackage;
import org.muml.simulink.adapter.model.SubSystem;
import org.muml.simulink.adapter.model.TriggerPort;
import org.muml.simulink.adapter.model.UnitDelay;
import org.muml.simulink.adapter.model.ZeroOrderHold;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.adapter.model.SimulinkPackage
 * @generated
 */
public class SimulinkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulinkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimulinkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulinkSwitch<Adapter> modelSwitch =
		new SimulinkSwitch<Adapter>() {
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseSimulinkModel(SimulinkModel object) {
				return createSimulinkModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseSubSystem(SubSystem object) {
				return createSubSystemAdapter();
			}
			@Override
			public Adapter caseInPortBlock(InPortBlock object) {
				return createInPortBlockAdapter();
			}
			@Override
			public Adapter caseEmbeddedMatlabFunction(EmbeddedMatlabFunction object) {
				return createEmbeddedMatlabFunctionAdapter();
			}
			@Override
			public Adapter caseMiscBlock(MiscBlock object) {
				return createMiscBlockAdapter();
			}
			@Override
			public Adapter caseSimulinkContainer(SimulinkContainer object) {
				return createSimulinkContainerAdapter();
			}
			@Override
			public Adapter caseSimulinkLibrary(SimulinkLibrary object) {
				return createSimulinkLibraryAdapter();
			}
			@Override
			public Adapter caseLibraryReference(LibraryReference object) {
				return createLibraryReferenceAdapter();
			}
			@Override
			public Adapter caseSimulinkFile(SimulinkFile object) {
				return createSimulinkFileAdapter();
			}
			@Override
			public Adapter caseOutPortBlock(OutPortBlock object) {
				return createOutPortBlockAdapter();
			}
			@Override
			public Adapter caseChartBlock(ChartBlock object) {
				return createChartBlockAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseBusCreator(BusCreator object) {
				return createBusCreatorAdapter();
			}
			@Override
			public Adapter caseBusSelector(BusSelector object) {
				return createBusSelectorAdapter();
			}
			@Override
			public Adapter casePortBlock(PortBlock object) {
				return createPortBlockAdapter();
			}
			@Override
			public Adapter caseUnitDelay(UnitDelay object) {
				return createUnitDelayAdapter();
			}
			@Override
			public Adapter caseDigitalClock(DigitalClock object) {
				return createDigitalClockAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseTriggerPort(TriggerPort object) {
				return createTriggerPortAdapter();
			}
			@Override
			public Adapter caseEnablePort(EnablePort object) {
				return createEnablePortAdapter();
			}
			@Override
			public Adapter caseBusElement(BusElement object) {
				return createBusElementAdapter();
			}
			@Override
			public Adapter caseZeroOrderHold(ZeroOrderHold object) {
				return createZeroOrderHoldAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.SimulinkModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.SimulinkModel
	 * @generated
	 */
	public Adapter createSimulinkModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.InPortBlock <em>In Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.InPortBlock
	 * @generated
	 */
	public Adapter createInPortBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.EmbeddedMatlabFunction <em>Embedded Matlab Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.EmbeddedMatlabFunction
	 * @generated
	 */
	public Adapter createEmbeddedMatlabFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.MiscBlock <em>Misc Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.MiscBlock
	 * @generated
	 */
	public Adapter createMiscBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.SimulinkContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.SimulinkContainer
	 * @generated
	 */
	public Adapter createSimulinkContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.SimulinkLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.SimulinkLibrary
	 * @generated
	 */
	public Adapter createSimulinkLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.LibraryReference
	 * @generated
	 */
	public Adapter createLibraryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.SimulinkFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.SimulinkFile
	 * @generated
	 */
	public Adapter createSimulinkFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.OutPortBlock <em>Out Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.OutPortBlock
	 * @generated
	 */
	public Adapter createOutPortBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.ChartBlock <em>Chart Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.ChartBlock
	 * @generated
	 */
	public Adapter createChartBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.BusCreator <em>Bus Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.BusCreator
	 * @generated
	 */
	public Adapter createBusCreatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.BusSelector <em>Bus Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.BusSelector
	 * @generated
	 */
	public Adapter createBusSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.PortBlock <em>Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.PortBlock
	 * @generated
	 */
	public Adapter createPortBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.UnitDelay <em>Unit Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.UnitDelay
	 * @generated
	 */
	public Adapter createUnitDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.DigitalClock <em>Digital Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.DigitalClock
	 * @generated
	 */
	public Adapter createDigitalClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.TriggerPort <em>Trigger Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.TriggerPort
	 * @generated
	 */
	public Adapter createTriggerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.EnablePort <em>Enable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.EnablePort
	 * @generated
	 */
	public Adapter createEnablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.BusElement <em>Bus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.BusElement
	 * @generated
	 */
	public Adapter createBusElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.simulink.adapter.model.ZeroOrderHold <em>Zero Order Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.simulink.adapter.model.ZeroOrderHold
	 * @generated
	 */
	public Adapter createZeroOrderHoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimulinkAdapterFactory

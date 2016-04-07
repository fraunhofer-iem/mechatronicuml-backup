/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.SimulinkPackage
 * @generated
 */
public interface SimulinkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulinkFactory eINSTANCE = org.muml.simulink.impl.SimulinkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SimulinkModel createSimulinkModel();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub System</em>'.
	 * @generated
	 */
	SubSystem createSubSystem();

	/**
	 * Returns a new object of class '<em>In Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Port Block</em>'.
	 * @generated
	 */
	InPortBlock createInPortBlock();

	/**
	 * Returns a new object of class '<em>Embedded Matlab Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Matlab Function</em>'.
	 * @generated
	 */
	EmbeddedMatlabFunction createEmbeddedMatlabFunction();

	/**
	 * Returns a new object of class '<em>Misc Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Misc Block</em>'.
	 * @generated
	 */
	MiscBlock createMiscBlock();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	SimulinkContainer createSimulinkContainer();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	SimulinkLibrary createSimulinkLibrary();

	/**
	 * Returns a new object of class '<em>Library Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Reference</em>'.
	 * @generated
	 */
	LibraryReference createLibraryReference();

	/**
	 * Returns a new object of class '<em>Out Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Port Block</em>'.
	 * @generated
	 */
	OutPortBlock createOutPortBlock();

	/**
	 * Returns a new object of class '<em>Chart Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart Block</em>'.
	 * @generated
	 */
	ChartBlock createChartBlock();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Bus Creator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Creator</em>'.
	 * @generated
	 */
	BusCreator createBusCreator();

	/**
	 * Returns a new object of class '<em>Bus Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Selector</em>'.
	 * @generated
	 */
	BusSelector createBusSelector();

	/**
	 * Returns a new object of class '<em>Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Block</em>'.
	 * @generated
	 */
	PortBlock createPortBlock();

	/**
	 * Returns a new object of class '<em>Unit Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Delay</em>'.
	 * @generated
	 */
	UnitDelay createUnitDelay();

	/**
	 * Returns a new object of class '<em>Digital Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Clock</em>'.
	 * @generated
	 */
	DigitalClock createDigitalClock();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Trigger Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Port</em>'.
	 * @generated
	 */
	TriggerPort createTriggerPort();

	/**
	 * Returns a new object of class '<em>Enable Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Port</em>'.
	 * @generated
	 */
	EnablePort createEnablePort();

	/**
	 * Returns a new object of class '<em>Bus Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Element</em>'.
	 * @generated
	 */
	BusElement createBusElement();

	/**
	 * Returns a new object of class '<em>Zero Order Hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zero Order Hold</em>'.
	 * @generated
	 */
	ZeroOrderHold createZeroOrderHold();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimulinkPackage getSimulinkPackage();

} //SimulinkFactory

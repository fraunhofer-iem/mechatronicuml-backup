/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage
 * @generated
 */
public interface PlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformFactory eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HW Platform Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Configuration</em>'.
	 * @generated
	 */
	HWPlatformConfiguration createHWPlatformConfiguration();

	/**
	 * Returns a new object of class '<em>Storage Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Memory Instance</em>'.
	 * @generated
	 */
	StorageMemoryInstance createStorageMemoryInstance();

	/**
	 * Returns a new object of class '<em>Processing Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Memory Instance</em>'.
	 * @generated
	 */
	ProcessingMemoryInstance createProcessingMemoryInstance();

	/**
	 * Returns a new object of class '<em>Cache Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Instance</em>'.
	 * @generated
	 */
	CacheInstance createCacheInstance();

	/**
	 * Returns a new object of class '<em>Programmable Logic Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programmable Logic Device Instance</em>'.
	 * @generated
	 */
	ProgrammableLogicDeviceInstance createProgrammableLogicDeviceInstance();

	/**
	 * Returns a new object of class '<em>Processor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Instance</em>'.
	 * @generated
	 */
	ProcessorInstance createProcessorInstance();

	/**
	 * Returns a new object of class '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Resource Instance</em>'.
	 * @generated
	 */
	StructuredResourceInstance createStructuredResourceInstance();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>HW Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform</em>'.
	 * @generated
	 */
	HWPlatform createHWPlatform();

	/**
	 * Returns a new object of class '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Part</em>'.
	 * @generated
	 */
	HWPlatformPart createHWPlatformPart();

	/**
	 * Returns a new object of class '<em>Sensor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Instance</em>'.
	 * @generated
	 */
	SensorInstance createSensorInstance();

	/**
	 * Returns a new object of class '<em>Actuator Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Instance</em>'.
	 * @generated
	 */
	ActuatorInstance createActuatorInstance();

	/**
	 * Returns a new object of class '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bridge</em>'.
	 * @generated
	 */
	Bridge createBridge();

	/**
	 * Returns a new object of class '<em>Bus Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Port Instance</em>'.
	 * @generated
	 */
	BusPortInstance createBusPortInstance();

	/**
	 * Returns a new object of class '<em>Link Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Port Instance</em>'.
	 * @generated
	 */
	LinkPortInstance createLinkPortInstance();

	/**
	 * Returns a new object of class '<em>Resource Instance Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance Repository</em>'.
	 * @generated
	 */
	ResourceInstanceRepository createResourceInstanceRepository();

	/**
	 * Returns a new object of class '<em>Resource Instance Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance Part</em>'.
	 * @generated
	 */
	ResourceInstancePart createResourceInstancePart();

	/**
	 * Returns a new object of class '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation</em>'.
	 * @generated
	 */
	Delegation createDelegation();

	/**
	 * Returns a new object of class '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Port Part</em>'.
	 * @generated
	 */
	HWPortPart createHWPortPart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatformPackage getPlatformPackage();

} //PlatformFactory

/**
 */
package org.muml.pm.hardware.hwresourceinstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage
 * @generated
 */
public interface HwresourceinstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwresourceinstanceFactory eINSTANCE = org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstanceFactoryImpl.init();

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
	 * Returns a new object of class '<em>Resource Instance Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance Repository</em>'.
	 * @generated
	 */
	ResourceInstanceRepository createResourceInstanceRepository();

	/**
	 * Returns a new object of class '<em>HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Port</em>'.
	 * @generated
	 */
	HWPort createHWPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwresourceinstancePackage getHwresourceinstancePackage();

} //HwresourceinstanceFactory

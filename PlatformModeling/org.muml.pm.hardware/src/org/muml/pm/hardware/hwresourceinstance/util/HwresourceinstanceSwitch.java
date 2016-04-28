/**
 */
package org.muml.pm.hardware.hwresourceinstance.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.NamedElement;
import org.muml.pm.hardware.hwresourceinstance.*;

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
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage
 * @generated
 */
public class HwresourceinstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwresourceinstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceinstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = HwresourceinstancePackage.eINSTANCE;
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T result = caseResourceInstance(resourceInstance);
				if (result == null) result = caseNamedElement(resourceInstance);
				if (result == null) result = caseExtendableElement(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.COMPUTING_RESOURCE_INSTANCE: {
				ComputingResourceInstance computingResourceInstance = (ComputingResourceInstance)theEObject;
				T result = caseComputingResourceInstance(computingResourceInstance);
				if (result == null) result = caseAtomicResourceInstance(computingResourceInstance);
				if (result == null) result = caseResourceInstance(computingResourceInstance);
				if (result == null) result = caseNamedElement(computingResourceInstance);
				if (result == null) result = caseExtendableElement(computingResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE: {
				MemoryResourceInstance memoryResourceInstance = (MemoryResourceInstance)theEObject;
				T result = caseMemoryResourceInstance(memoryResourceInstance);
				if (result == null) result = caseAtomicResourceInstance(memoryResourceInstance);
				if (result == null) result = caseResourceInstance(memoryResourceInstance);
				if (result == null) result = caseNamedElement(memoryResourceInstance);
				if (result == null) result = caseExtendableElement(memoryResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.DEVICE_INSTANCE: {
				DeviceInstance deviceInstance = (DeviceInstance)theEObject;
				T result = caseDeviceInstance(deviceInstance);
				if (result == null) result = caseResourceInstance(deviceInstance);
				if (result == null) result = caseNamedElement(deviceInstance);
				if (result == null) result = caseExtendableElement(deviceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.STORAGE_MEMORY_INSTANCE: {
				StorageMemoryInstance storageMemoryInstance = (StorageMemoryInstance)theEObject;
				T result = caseStorageMemoryInstance(storageMemoryInstance);
				if (result == null) result = caseMemoryResourceInstance(storageMemoryInstance);
				if (result == null) result = caseAtomicResourceInstance(storageMemoryInstance);
				if (result == null) result = caseResourceInstance(storageMemoryInstance);
				if (result == null) result = caseNamedElement(storageMemoryInstance);
				if (result == null) result = caseExtendableElement(storageMemoryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.PROCESSING_MEMORY_INSTANCE: {
				ProcessingMemoryInstance processingMemoryInstance = (ProcessingMemoryInstance)theEObject;
				T result = caseProcessingMemoryInstance(processingMemoryInstance);
				if (result == null) result = caseMemoryResourceInstance(processingMemoryInstance);
				if (result == null) result = caseAtomicResourceInstance(processingMemoryInstance);
				if (result == null) result = caseResourceInstance(processingMemoryInstance);
				if (result == null) result = caseNamedElement(processingMemoryInstance);
				if (result == null) result = caseExtendableElement(processingMemoryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.CACHE_INSTANCE: {
				CacheInstance cacheInstance = (CacheInstance)theEObject;
				T result = caseCacheInstance(cacheInstance);
				if (result == null) result = caseMemoryResourceInstance(cacheInstance);
				if (result == null) result = caseAtomicResourceInstance(cacheInstance);
				if (result == null) result = caseResourceInstance(cacheInstance);
				if (result == null) result = caseNamedElement(cacheInstance);
				if (result == null) result = caseExtendableElement(cacheInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE: {
				ProgrammableLogicDeviceInstance programmableLogicDeviceInstance = (ProgrammableLogicDeviceInstance)theEObject;
				T result = caseProgrammableLogicDeviceInstance(programmableLogicDeviceInstance);
				if (result == null) result = caseComputingResourceInstance(programmableLogicDeviceInstance);
				if (result == null) result = caseAtomicResourceInstance(programmableLogicDeviceInstance);
				if (result == null) result = caseResourceInstance(programmableLogicDeviceInstance);
				if (result == null) result = caseNamedElement(programmableLogicDeviceInstance);
				if (result == null) result = caseExtendableElement(programmableLogicDeviceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.PROCESSOR_INSTANCE: {
				ProcessorInstance processorInstance = (ProcessorInstance)theEObject;
				T result = caseProcessorInstance(processorInstance);
				if (result == null) result = caseComputingResourceInstance(processorInstance);
				if (result == null) result = caseAtomicResourceInstance(processorInstance);
				if (result == null) result = caseResourceInstance(processorInstance);
				if (result == null) result = caseNamedElement(processorInstance);
				if (result == null) result = caseExtendableElement(processorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.ATOMIC_RESOURCE_INSTANCE: {
				AtomicResourceInstance atomicResourceInstance = (AtomicResourceInstance)theEObject;
				T result = caseAtomicResourceInstance(atomicResourceInstance);
				if (result == null) result = caseResourceInstance(atomicResourceInstance);
				if (result == null) result = caseNamedElement(atomicResourceInstance);
				if (result == null) result = caseExtendableElement(atomicResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE: {
				StructuredResourceInstance structuredResourceInstance = (StructuredResourceInstance)theEObject;
				T result = caseStructuredResourceInstance(structuredResourceInstance);
				if (result == null) result = caseResourceInstance(structuredResourceInstance);
				if (result == null) result = caseNamedElement(structuredResourceInstance);
				if (result == null) result = caseExtendableElement(structuredResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.SENSOR_INSTANCE: {
				SensorInstance sensorInstance = (SensorInstance)theEObject;
				T result = caseSensorInstance(sensorInstance);
				if (result == null) result = caseDeviceInstance(sensorInstance);
				if (result == null) result = caseResourceInstance(sensorInstance);
				if (result == null) result = caseNamedElement(sensorInstance);
				if (result == null) result = caseExtendableElement(sensorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.ACTUATOR_INSTANCE: {
				ActuatorInstance actuatorInstance = (ActuatorInstance)theEObject;
				T result = caseActuatorInstance(actuatorInstance);
				if (result == null) result = caseDeviceInstance(actuatorInstance);
				if (result == null) result = caseResourceInstance(actuatorInstance);
				if (result == null) result = caseNamedElement(actuatorInstance);
				if (result == null) result = caseExtendableElement(actuatorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY: {
				ResourceInstanceRepository resourceInstanceRepository = (ResourceInstanceRepository)theEObject;
				T result = caseResourceInstanceRepository(resourceInstanceRepository);
				if (result == null) result = caseCommentableElement(resourceInstanceRepository);
				if (result == null) result = caseExtendableElement(resourceInstanceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourceinstancePackage.HW_PORT: {
				HWPort hwPort = (HWPort)theEObject;
				T result = caseHWPort(hwPort);
				if (result == null) result = caseNamedElement(hwPort);
				if (result == null) result = caseExtendableElement(hwPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstance(ResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingResourceInstance(ComputingResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryResourceInstance(MemoryResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInstance(DeviceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Memory Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageMemoryInstance(StorageMemoryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Memory Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingMemoryInstance(ProcessingMemoryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheInstance(CacheInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programmable Logic Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programmable Logic Device Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgrammableLogicDeviceInstance(ProgrammableLogicDeviceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorInstance(ProcessorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicResourceInstance(AtomicResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredResourceInstance(StructuredResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorInstance(SensorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorInstance(ActuatorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstanceRepository(ResourceInstanceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPort(HWPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
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

} //HwresourceinstanceSwitch

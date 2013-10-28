/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.util;

import de.uni_paderborn.fujaba.muml.hardware.platform.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;

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
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage
 * @generated
 */
public class PlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case PlatformPackage.HW_PLATFORM_CONFIGURATION: {
				HWPlatformConfiguration hwPlatformConfiguration = (HWPlatformConfiguration)theEObject;
				T result = caseHWPlatformConfiguration(hwPlatformConfiguration);
				if (result == null) result = caseExtendableElement(hwPlatformConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T result = caseResourceInstance(resourceInstance);
				if (result == null) result = caseNamedElement(resourceInstance);
				if (result == null) result = caseExtendableElement(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPUTING_RESOURCE_INSTANCE: {
				ComputingResourceInstance computingResourceInstance = (ComputingResourceInstance)theEObject;
				T result = caseComputingResourceInstance(computingResourceInstance);
				if (result == null) result = caseAtomicResourceInstance(computingResourceInstance);
				if (result == null) result = caseResourceInstance(computingResourceInstance);
				if (result == null) result = caseNamedElement(computingResourceInstance);
				if (result == null) result = caseExtendableElement(computingResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.MEMORY_RESOURCE_INSTANCE: {
				MemoryResourceInstance memoryResourceInstance = (MemoryResourceInstance)theEObject;
				T result = caseMemoryResourceInstance(memoryResourceInstance);
				if (result == null) result = caseAtomicResourceInstance(memoryResourceInstance);
				if (result == null) result = caseResourceInstance(memoryResourceInstance);
				if (result == null) result = caseNamedElement(memoryResourceInstance);
				if (result == null) result = caseExtendableElement(memoryResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DEVICE_INSTANCE: {
				DeviceInstance deviceInstance = (DeviceInstance)theEObject;
				T result = caseDeviceInstance(deviceInstance);
				if (result == null) result = caseResourceInstance(deviceInstance);
				if (result == null) result = caseNamedElement(deviceInstance);
				if (result == null) result = caseExtendableElement(deviceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STORAGE_MEMORY_INSTANCE: {
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
			case PlatformPackage.PROCESSING_MEMORY_INSTANCE: {
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
			case PlatformPackage.CACHE_INSTANCE: {
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
			case PlatformPackage.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE: {
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
			case PlatformPackage.PROCESSOR_INSTANCE: {
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE: {
				AtomicResourceInstance atomicResourceInstance = (AtomicResourceInstance)theEObject;
				T result = caseAtomicResourceInstance(atomicResourceInstance);
				if (result == null) result = caseResourceInstance(atomicResourceInstance);
				if (result == null) result = caseNamedElement(atomicResourceInstance);
				if (result == null) result = caseExtendableElement(atomicResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRUCTURED_RESOURCE_INSTANCE: {
				StructuredResourceInstance structuredResourceInstance = (StructuredResourceInstance)theEObject;
				T result = caseStructuredResourceInstance(structuredResourceInstance);
				if (result == null) result = caseResourceInstance(structuredResourceInstance);
				if (result == null) result = caseNamedElement(structuredResourceInstance);
				if (result == null) result = caseExtendableElement(structuredResourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMMUNICATION_RESOURCE: {
				CommunicationResource communicationResource = (CommunicationResource)theEObject;
				T result = caseCommunicationResource(communicationResource);
				if (result == null) result = caseCommentableElement(communicationResource);
				if (result == null) result = caseExtendableElement(communicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseCommunicationMedia(bus);
				if (result == null) result = caseCommunicationResource(bus);
				if (result == null) result = caseCommentableElement(bus);
				if (result == null) result = caseExtendableElement(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseCommunicationMedia(link);
				if (result == null) result = caseCommunicationResource(link);
				if (result == null) result = caseCommentableElement(link);
				if (result == null) result = caseExtendableElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMMUNICATION_MEDIA: {
				CommunicationMedia communicationMedia = (CommunicationMedia)theEObject;
				T result = caseCommunicationMedia(communicationMedia);
				if (result == null) result = caseCommunicationResource(communicationMedia);
				if (result == null) result = caseCommentableElement(communicationMedia);
				if (result == null) result = caseExtendableElement(communicationMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.HW_PLATFORM: {
				HWPlatform hwPlatform = (HWPlatform)theEObject;
				T result = caseHWPlatform(hwPlatform);
				if (result == null) result = caseNamedElement(hwPlatform);
				if (result == null) result = caseExtendableElement(hwPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLATFORM_PART: {
				PlatformPart platformPart = (PlatformPart)theEObject;
				T result = casePlatformPart(platformPart);
				if (result == null) result = caseNamedElement(platformPart);
				if (result == null) result = caseExtendableElement(platformPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.HW_PLATFORM_PART: {
				HWPlatformPart hwPlatformPart = (HWPlatformPart)theEObject;
				T result = caseHWPlatformPart(hwPlatformPart);
				if (result == null) result = casePlatformPart(hwPlatformPart);
				if (result == null) result = caseNamedElement(hwPlatformPart);
				if (result == null) result = caseExtendableElement(hwPlatformPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SENSOR_INSTANCE: {
				SensorInstance sensorInstance = (SensorInstance)theEObject;
				T result = caseSensorInstance(sensorInstance);
				if (result == null) result = caseDeviceInstance(sensorInstance);
				if (result == null) result = caseResourceInstance(sensorInstance);
				if (result == null) result = caseNamedElement(sensorInstance);
				if (result == null) result = caseExtendableElement(sensorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ACTUATOR_INSTANCE: {
				ActuatorInstance actuatorInstance = (ActuatorInstance)theEObject;
				T result = caseActuatorInstance(actuatorInstance);
				if (result == null) result = caseDeviceInstance(actuatorInstance);
				if (result == null) result = caseResourceInstance(actuatorInstance);
				if (result == null) result = caseNamedElement(actuatorInstance);
				if (result == null) result = caseExtendableElement(actuatorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BRIDGE: {
				Bridge bridge = (Bridge)theEObject;
				T result = caseBridge(bridge);
				if (result == null) result = caseCommunicationResource(bridge);
				if (result == null) result = caseCommentableElement(bridge);
				if (result == null) result = caseExtendableElement(bridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.HW_PORT_INSTANCE: {
				HWPortInstance hwPortInstance = (HWPortInstance)theEObject;
				T result = caseHWPortInstance(hwPortInstance);
				if (result == null) result = caseNamedElement(hwPortInstance);
				if (result == null) result = caseExtendableElement(hwPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BUS_PORT_INSTANCE: {
				BusPortInstance busPortInstance = (BusPortInstance)theEObject;
				T result = caseBusPortInstance(busPortInstance);
				if (result == null) result = caseHWPortInstance(busPortInstance);
				if (result == null) result = caseNamedElement(busPortInstance);
				if (result == null) result = caseExtendableElement(busPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.LINK_PORT_INSTANCE: {
				LinkPortInstance linkPortInstance = (LinkPortInstance)theEObject;
				T result = caseLinkPortInstance(linkPortInstance);
				if (result == null) result = caseHWPortInstance(linkPortInstance);
				if (result == null) result = caseNamedElement(linkPortInstance);
				if (result == null) result = caseExtendableElement(linkPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY: {
				ResourceInstanceRepository resourceInstanceRepository = (ResourceInstanceRepository)theEObject;
				T result = caseResourceInstanceRepository(resourceInstanceRepository);
				if (result == null) result = caseNamedElement(resourceInstanceRepository);
				if (result == null) result = caseExtendableElement(resourceInstanceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.RESOURCE_INSTANCE_PART: {
				ResourceInstancePart resourceInstancePart = (ResourceInstancePart)theEObject;
				T result = caseResourceInstancePart(resourceInstancePart);
				if (result == null) result = casePlatformPart(resourceInstancePart);
				if (result == null) result = caseNamedElement(resourceInstancePart);
				if (result == null) result = caseExtendableElement(resourceInstancePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.DELEGATION: {
				Delegation delegation = (Delegation)theEObject;
				T result = caseDelegation(delegation);
				if (result == null) result = caseCommentableElement(delegation);
				if (result == null) result = caseExtendableElement(delegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.HW_PORT_PART: {
				HWPortPart hwPortPart = (HWPortPart)theEObject;
				T result = caseHWPortPart(hwPortPart);
				if (result == null) result = caseNamedElement(hwPortPart);
				if (result == null) result = caseExtendableElement(hwPortPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Platform Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Platform Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPlatformConfiguration(HWPlatformConfiguration object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationResource(CommunicationResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationMedia(CommunicationMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPlatform(HWPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformPart(PlatformPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Platform Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPlatformPart(HWPlatformPart object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridge(Bridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPortInstance(HWPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusPortInstance(BusPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkPortInstance(LinkPortInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstancePart(ResourceInstancePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegation(Delegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Port Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPortPart(HWPortPart object) {
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

} //PlatformSwitch

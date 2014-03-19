/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.util;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ComputingResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProgrammableLogicDevice;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource;

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
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage
 * @generated
 */
public class ResourcetypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcetypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypeSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourcetypePackage.eINSTANCE;
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
			case ResourcetypePackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = caseNamedElement(resourceType);
				if (result == null) result = caseExtendableElement(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.COMPUTING_RESOURCE: {
				ComputingResource computingResource = (ComputingResource)theEObject;
				T result = caseComputingResource(computingResource);
				if (result == null) result = caseAtomicResource(computingResource);
				if (result == null) result = caseResourceType(computingResource);
				if (result == null) result = caseNamedElement(computingResource);
				if (result == null) result = caseExtendableElement(computingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.MEMORY_RESOURCE: {
				MemoryResource memoryResource = (MemoryResource)theEObject;
				T result = caseMemoryResource(memoryResource);
				if (result == null) result = caseAtomicResource(memoryResource);
				if (result == null) result = caseResourceType(memoryResource);
				if (result == null) result = caseNamedElement(memoryResource);
				if (result == null) result = caseExtendableElement(memoryResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseResourceType(device);
				if (result == null) result = caseNamedElement(device);
				if (result == null) result = caseExtendableElement(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.CACHE: {
				Cache cache = (Cache)theEObject;
				T result = caseCache(cache);
				if (result == null) result = caseMemoryResource(cache);
				if (result == null) result = caseAtomicResource(cache);
				if (result == null) result = caseResourceType(cache);
				if (result == null) result = caseNamedElement(cache);
				if (result == null) result = caseExtendableElement(cache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.PROGRAMMABLE_LOGIC_DEVICE: {
				ProgrammableLogicDevice programmableLogicDevice = (ProgrammableLogicDevice)theEObject;
				T result = caseProgrammableLogicDevice(programmableLogicDevice);
				if (result == null) result = caseComputingResource(programmableLogicDevice);
				if (result == null) result = caseAtomicResource(programmableLogicDevice);
				if (result == null) result = caseResourceType(programmableLogicDevice);
				if (result == null) result = caseNamedElement(programmableLogicDevice);
				if (result == null) result = caseExtendableElement(programmableLogicDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseComputingResource(processor);
				if (result == null) result = caseAtomicResource(processor);
				if (result == null) result = caseResourceType(processor);
				if (result == null) result = caseNamedElement(processor);
				if (result == null) result = caseExtendableElement(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.ATOMIC_RESOURCE: {
				AtomicResource atomicResource = (AtomicResource)theEObject;
				T result = caseAtomicResource(atomicResource);
				if (result == null) result = caseResourceType(atomicResource);
				if (result == null) result = caseNamedElement(atomicResource);
				if (result == null) result = caseExtendableElement(atomicResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.STRUCTURED_RESOURCE: {
				StructuredResource structuredResource = (StructuredResource)theEObject;
				T result = caseStructuredResource(structuredResource);
				if (result == null) result = caseResourceType(structuredResource);
				if (result == null) result = caseNamedElement(structuredResource);
				if (result == null) result = caseExtendableElement(structuredResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.HW_PORT: {
				HWPort hwPort = (HWPort)theEObject;
				T result = caseHWPort(hwPort);
				if (result == null) result = caseNamedElement(hwPort);
				if (result == null) result = caseExtendableElement(hwPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.RESOURCE_TYPE_REPOSITORY: {
				ResourceTypeRepository resourceTypeRepository = (ResourceTypeRepository)theEObject;
				T result = caseResourceTypeRepository(resourceTypeRepository);
				if (result == null) result = caseCommentableElement(resourceTypeRepository);
				if (result == null) result = caseExtendableElement(resourceTypeRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.COMMUNICATION_PROTOCOL: {
				CommunicationProtocol communicationProtocol = (CommunicationProtocol)theEObject;
				T result = caseCommunicationProtocol(communicationProtocol);
				if (result == null) result = caseNamedElement(communicationProtocol);
				if (result == null) result = caseExtendableElement(communicationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.BUS_PROTOCOL: {
				BusProtocol busProtocol = (BusProtocol)theEObject;
				T result = caseBusProtocol(busProtocol);
				if (result == null) result = caseCommunicationProtocol(busProtocol);
				if (result == null) result = caseNamedElement(busProtocol);
				if (result == null) result = caseExtendableElement(busProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcetypePackage.LINK_PROTOCOL: {
				LinkProtocol linkProtocol = (LinkProtocol)theEObject;
				T result = caseLinkProtocol(linkProtocol);
				if (result == null) result = caseCommunicationProtocol(linkProtocol);
				if (result == null) result = caseNamedElement(linkProtocol);
				if (result == null) result = caseExtendableElement(linkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingResource(ComputingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryResource(MemoryResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programmable Logic Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programmable Logic Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgrammableLogicDevice(ProgrammableLogicDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicResource(AtomicResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredResource(StructuredResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTypeRepository(ResourceTypeRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationProtocol(CommunicationProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusProtocol(BusProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkProtocol(LinkProtocol object) {
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

} //ResourcetypeSwitch

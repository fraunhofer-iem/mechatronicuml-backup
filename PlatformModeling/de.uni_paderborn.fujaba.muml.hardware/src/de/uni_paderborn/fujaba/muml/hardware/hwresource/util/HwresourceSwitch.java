/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.util;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

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
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage
 * @generated
 */
public class HwresourceSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwresourcePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceSwitch() {
		if (modelPackage == null) {
			modelPackage = HwresourcePackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HwresourcePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T1 result = caseResource(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = caseExtendableElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.COMPUTING_RESOURCE: {
				ComputingResource computingResource = (ComputingResource)theEObject;
				T1 result = caseComputingResource(computingResource);
				if (result == null) result = caseAtomicResource(computingResource);
				if (result == null) result = caseResource(computingResource);
				if (result == null) result = caseNamedElement(computingResource);
				if (result == null) result = caseExtendableElement(computingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.MEMORY_RESOURCE: {
				MemoryResource memoryResource = (MemoryResource)theEObject;
				T1 result = caseMemoryResource(memoryResource);
				if (result == null) result = caseAtomicResource(memoryResource);
				if (result == null) result = caseResource(memoryResource);
				if (result == null) result = caseNamedElement(memoryResource);
				if (result == null) result = caseExtendableElement(memoryResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.DEVICE: {
				Device device = (Device)theEObject;
				T1 result = caseDevice(device);
				if (result == null) result = caseResource(device);
				if (result == null) result = caseNamedElement(device);
				if (result == null) result = caseExtendableElement(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.CACHE: {
				Cache cache = (Cache)theEObject;
				T1 result = caseCache(cache);
				if (result == null) result = caseMemoryResource(cache);
				if (result == null) result = caseAtomicResource(cache);
				if (result == null) result = caseResource(cache);
				if (result == null) result = caseNamedElement(cache);
				if (result == null) result = caseExtendableElement(cache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.PROGRAMMABLE_LOGIC_DEVICE: {
				ProgrammableLogicDevice programmableLogicDevice = (ProgrammableLogicDevice)theEObject;
				T1 result = caseProgrammableLogicDevice(programmableLogicDevice);
				if (result == null) result = caseComputingResource(programmableLogicDevice);
				if (result == null) result = caseAtomicResource(programmableLogicDevice);
				if (result == null) result = caseResource(programmableLogicDevice);
				if (result == null) result = caseNamedElement(programmableLogicDevice);
				if (result == null) result = caseExtendableElement(programmableLogicDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T1 result = caseProcessor(processor);
				if (result == null) result = caseComputingResource(processor);
				if (result == null) result = caseAtomicResource(processor);
				if (result == null) result = caseResource(processor);
				if (result == null) result = caseNamedElement(processor);
				if (result == null) result = caseExtendableElement(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.ATOMIC_RESOURCE: {
				AtomicResource atomicResource = (AtomicResource)theEObject;
				T1 result = caseAtomicResource(atomicResource);
				if (result == null) result = caseResource(atomicResource);
				if (result == null) result = caseNamedElement(atomicResource);
				if (result == null) result = caseExtendableElement(atomicResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.STRUCTURED_RESOURCE: {
				StructuredResource structuredResource = (StructuredResource)theEObject;
				T1 result = caseStructuredResource(structuredResource);
				if (result == null) result = caseResource(structuredResource);
				if (result == null) result = caseNamedElement(structuredResource);
				if (result == null) result = caseExtendableElement(structuredResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.RESOURCE_REPOSITORY: {
				ResourceRepository resourceRepository = (ResourceRepository)theEObject;
				T1 result = caseResourceRepository(resourceRepository);
				if (result == null) result = caseCommentableElement(resourceRepository);
				if (result == null) result = caseExtendableElement(resourceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY: {
				CommunicationProtocolRepository communicationProtocolRepository = (CommunicationProtocolRepository)theEObject;
				T1 result = caseCommunicationProtocolRepository(communicationProtocolRepository);
				if (result == null) result = caseNamedElement(communicationProtocolRepository);
				if (result == null) result = caseExtendableElement(communicationProtocolRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.COMMUNICATION_PROTOCOL: {
				CommunicationProtocol communicationProtocol = (CommunicationProtocol)theEObject;
				T1 result = caseCommunicationProtocol(communicationProtocol);
				if (result == null) result = caseNamedElement(communicationProtocol);
				if (result == null) result = caseExtendableElement(communicationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.BUS_PROTOCOL: {
				BusProtocol busProtocol = (BusProtocol)theEObject;
				T1 result = caseBusProtocol(busProtocol);
				if (result == null) result = caseCommunicationProtocol(busProtocol);
				if (result == null) result = caseNamedElement(busProtocol);
				if (result == null) result = caseExtendableElement(busProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.LINK_PROTOCOL: {
				LinkProtocol linkProtocol = (LinkProtocol)theEObject;
				T1 result = caseLinkProtocol(linkProtocol);
				if (result == null) result = caseCommunicationProtocol(linkProtocol);
				if (result == null) result = caseNamedElement(linkProtocol);
				if (result == null) result = caseExtendableElement(linkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.COMMUNICATION_RESOURCE: {
				CommunicationResource<?> communicationResource = (CommunicationResource<?>)theEObject;
				T1 result = caseCommunicationResource(communicationResource);
				if (result == null) result = caseHWPort(communicationResource);
				if (result == null) result = caseNamedElement(communicationResource);
				if (result == null) result = caseExtendableElement(communicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwresourcePackage.HW_PORT: {
				HWPort<?> hwPort = (HWPort<?>)theEObject;
				T1 result = caseHWPort(hwPort);
				if (result == null) result = caseNamedElement(hwPort);
				if (result == null) result = caseExtendableElement(hwPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResource(Resource object) {
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
	public T1 caseComputingResource(ComputingResource object) {
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
	public T1 caseMemoryResource(MemoryResource object) {
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
	public T1 caseDevice(Device object) {
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
	public T1 caseCache(Cache object) {
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
	public T1 caseProgrammableLogicDevice(ProgrammableLogicDevice object) {
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
	public T1 caseProcessor(Processor object) {
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
	public T1 caseAtomicResource(AtomicResource object) {
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
	public T1 caseStructuredResource(StructuredResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceRepository(ResourceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Protocol Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Protocol Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommunicationProtocolRepository(CommunicationProtocolRepository object) {
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
	public T1 caseCommunicationProtocol(CommunicationProtocol object) {
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
	public T1 caseBusProtocol(BusProtocol object) {
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
	public T1 caseLinkProtocol(LinkProtocol object) {
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
	public <T> T1 caseCommunicationResource(CommunicationResource<T> object) {
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
	public <T> T1 caseHWPort(HWPort<T> object) {
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
	public T1 caseExtendableElement(ExtendableElement object) {
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
	public T1 caseNamedElement(NamedElement object) {
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
	public T1 caseCommentableElement(CommentableElement object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //HwresourceSwitch

/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.util;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.*;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
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
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage
 * @generated
 */
public class HwplatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwplatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatformSwitch() {
		if (modelPackage == null) {
			modelPackage = HwplatformPackage.eINSTANCE;
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
			case HwplatformPackage.HW_PLATFORM_CONFIGURATION: {
				HWPlatformConfiguration hwPlatformConfiguration = (HWPlatformConfiguration)theEObject;
				T result = caseHWPlatformConfiguration(hwPlatformConfiguration);
				if (result == null) result = caseExtendableElement(hwPlatformConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.HW_PLATFORM: {
				HWPlatform hwPlatform = (HWPlatform)theEObject;
				T result = caseHWPlatform(hwPlatform);
				if (result == null) result = caseNamedElement(hwPlatform);
				if (result == null) result = caseExtendableElement(hwPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.PLATFORM_PART: {
				PlatformPart platformPart = (PlatformPart)theEObject;
				T result = casePlatformPart(platformPart);
				if (result == null) result = caseNamedElement(platformPart);
				if (result == null) result = caseExtendableElement(platformPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.HW_PLATFORM_PART: {
				HWPlatformPart hwPlatformPart = (HWPlatformPart)theEObject;
				T result = caseHWPlatformPart(hwPlatformPart);
				if (result == null) result = casePlatformPart(hwPlatformPart);
				if (result == null) result = caseNamedElement(hwPlatformPart);
				if (result == null) result = caseExtendableElement(hwPlatformPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.RESOURCE_PART: {
				ResourcePart resourcePart = (ResourcePart)theEObject;
				T result = caseResourcePart(resourcePart);
				if (result == null) result = casePlatformPart(resourcePart);
				if (result == null) result = caseNamedElement(resourcePart);
				if (result == null) result = caseExtendableElement(resourcePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.DELEGATION: {
				Delegation delegation = (Delegation)theEObject;
				T result = caseDelegation(delegation);
				if (result == null) result = caseNetworkingHardwarePart(delegation);
				if (result == null) result = caseConnector(delegation);
				if (result == null) result = caseCommentableElement(delegation);
				if (result == null) result = caseExtendableElement(delegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.DELEGATION_HW_PORT: {
				DelegationHWPort delegationHWPort = (DelegationHWPort)theEObject;
				T result = caseDelegationHWPort(delegationHWPort);
				if (result == null) result = caseConnectorEndpoint(delegationHWPort);
				if (result == null) result = caseCommunicationResource(delegationHWPort);
				if (result == null) result = caseCommentableElement(delegationHWPort);
				if (result == null) result = caseHWPort(delegationHWPort);
				if (result == null) result = caseNamedElement(delegationHWPort);
				if (result == null) result = caseExtendableElement(delegationHWPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.HW_PORT_PART: {
				HWPortPart hwPortPart = (HWPortPart)theEObject;
				T result = caseHWPortPart(hwPortPart);
				if (result == null) result = caseConnectorEndpoint(hwPortPart);
				if (result == null) result = caseCommentableElement(hwPortPart);
				if (result == null) result = caseExtendableElement(hwPortPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.BUS_CONNECTOR: {
				BusConnector busConnector = (BusConnector)theEObject;
				T result = caseBusConnector(busConnector);
				if (result == null) result = caseConnector(busConnector);
				if (result == null) result = caseNetworkingHardwarePart(busConnector);
				if (result == null) result = caseCommentableElement(busConnector);
				if (result == null) result = caseExtendableElement(busConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.BUS_PART: {
				BusPart busPart = (BusPart)theEObject;
				T result = caseBusPart(busPart);
				if (result == null) result = caseCommunicationMediaPart(busPart);
				if (result == null) result = caseConnectorEndpoint(busPart);
				if (result == null) result = caseNetworkingHardwarePart(busPart);
				if (result == null) result = caseCommentableElement(busPart);
				if (result == null) result = caseExtendableElement(busPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.LINK_PART: {
				LinkPart linkPart = (LinkPart)theEObject;
				T result = caseLinkPart(linkPart);
				if (result == null) result = caseCommunicationMediaPart(linkPart);
				if (result == null) result = caseConnector(linkPart);
				if (result == null) result = caseNetworkingHardwarePart(linkPart);
				if (result == null) result = caseCommentableElement(linkPart);
				if (result == null) result = caseExtendableElement(linkPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.COMMUNICATION_MEDIA_PART: {
				CommunicationMediaPart communicationMediaPart = (CommunicationMediaPart)theEObject;
				T result = caseCommunicationMediaPart(communicationMediaPart);
				if (result == null) result = caseNetworkingHardwarePart(communicationMediaPart);
				if (result == null) result = caseExtendableElement(communicationMediaPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.BRIDGE_PART: {
				BridgePart bridgePart = (BridgePart)theEObject;
				T result = caseBridgePart(bridgePart);
				if (result == null) result = caseNetworkingHardwarePart(bridgePart);
				if (result == null) result = caseConnectorEndpoint(bridgePart);
				if (result == null) result = caseCommentableElement(bridgePart);
				if (result == null) result = caseExtendableElement(bridgePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatformPackage.NETWORKING_HARDWARE_PART: {
				NetworkingHardwarePart networkingHardwarePart = (NetworkingHardwarePart)theEObject;
				T result = caseNetworkingHardwarePart(networkingHardwarePart);
				if (result == null) result = caseExtendableElement(networkingHardwarePart);
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
	 * Returns the result of interpreting the object as an instance of '<em>Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Part</em>'.
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePart(ResourcePart object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Delegation HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation HW Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationHWPort(DelegationHWPort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bus Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusConnector(BusConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusPart(BusPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkPart(LinkPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Media Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Media Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationMediaPart(CommunicationMediaPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgePart(BridgePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networking Hardware Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networking Hardware Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkingHardwarePart(NetworkingHardwarePart object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpoint(ConnectorEndpoint object) {
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

} //HwplatformSwitch

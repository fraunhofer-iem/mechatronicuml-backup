/**
 */
package org.muml.pm.hardware.hwplatforminstance.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.*;
import org.muml.pm.hardware.hwresourceinstance.HWPort;

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
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage
 * @generated
 */
public class HwplatforminstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwplatforminstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatforminstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = HwplatforminstancePackage.eINSTANCE;
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE: {
				HWPlatformInstance hwPlatformInstance = (HWPlatformInstance)theEObject;
				T result = caseHWPlatformInstance(hwPlatformInstance);
				if (result == null) result = caseNamedElement(hwPlatformInstance);
				if (result == null) result = caseExtendableElement(hwPlatformInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION: {
				HWPlatformInstanceConfiguration hwPlatformInstanceConfiguration = (HWPlatformInstanceConfiguration)theEObject;
				T result = caseHWPlatformInstanceConfiguration(hwPlatformInstanceConfiguration);
				if (result == null) result = caseCommentableElement(hwPlatformInstanceConfiguration);
				if (result == null) result = caseExtendableElement(hwPlatformInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.HW_PORT_INSTANCE: {
				HWPortInstance hwPortInstance = (HWPortInstance)theEObject;
				T result = caseHWPortInstance(hwPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(hwPortInstance);
				if (result == null) result = caseHWPort(hwPortInstance);
				if (result == null) result = caseNamedElement(hwPortInstance);
				if (result == null) result = caseCommentableElement(hwPortInstance);
				if (result == null) result = caseExtendableElement(hwPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.BUS_INSTANCE: {
				BusInstance busInstance = (BusInstance)theEObject;
				T result = caseBusInstance(busInstance);
				if (result == null) result = caseConnectorEndpointInstance(busInstance);
				if (result == null) result = caseNetworkingHardwareInstance(busInstance);
				if (result == null) result = caseNamedElement(busInstance);
				if (result == null) result = caseCommentableElement(busInstance);
				if (result == null) result = caseExtendableElement(busInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.NETWORK_BRIDGE_INSTANCE: {
				NetworkBridgeInstance networkBridgeInstance = (NetworkBridgeInstance)theEObject;
				T result = caseNetworkBridgeInstance(networkBridgeInstance);
				if (result == null) result = caseNetworkingHardwareInstance(networkBridgeInstance);
				if (result == null) result = caseConnectorEndpointInstance(networkBridgeInstance);
				if (result == null) result = caseNamedElement(networkBridgeInstance);
				if (result == null) result = caseCommentableElement(networkBridgeInstance);
				if (result == null) result = caseExtendableElement(networkBridgeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.NETWORKING_HARDWARE_INSTANCE: {
				NetworkingHardwareInstance networkingHardwareInstance = (NetworkingHardwareInstance)theEObject;
				T result = caseNetworkingHardwareInstance(networkingHardwareInstance);
				if (result == null) result = caseExtendableElement(networkingHardwareInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE: {
				DelegationHWPortInstance delegationHWPortInstance = (DelegationHWPortInstance)theEObject;
				T result = caseDelegationHWPortInstance(delegationHWPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(delegationHWPortInstance);
				if (result == null) result = caseNamedElement(delegationHWPortInstance);
				if (result == null) result = caseCommentableElement(delegationHWPortInstance);
				if (result == null) result = caseExtendableElement(delegationHWPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE: {
				NetworkConnectorInstance networkConnectorInstance = (NetworkConnectorInstance)theEObject;
				T result = caseNetworkConnectorInstance(networkConnectorInstance);
				if (result == null) result = caseConnectorInstance(networkConnectorInstance);
				if (result == null) result = caseCommentableElement(networkConnectorInstance);
				if (result == null) result = caseExtendableElement(networkConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Platform Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPlatformInstance(HWPlatformInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Platform Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Platform Instance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPlatformInstanceConfiguration(HWPlatformInstanceConfiguration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bus Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusInstance(BusInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Bridge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Bridge Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkBridgeInstance(NetworkBridgeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networking Hardware Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networking Hardware Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkingHardwareInstance(NetworkingHardwareInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation HW Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation HW Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationHWPortInstance(DelegationHWPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkConnectorInstance(NetworkConnectorInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpointInstance(ConnectorEndpointInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorInstance(ConnectorInstance object) {
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

} //HwplatforminstanceSwitch

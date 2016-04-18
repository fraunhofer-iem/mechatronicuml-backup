/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscretePortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.types.DataType;
import org.muml.verification.core.runtime.*;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.MultiRoleInstance;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RoleInstance;
import org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeComponentInstance;
import org.muml.verification.core.runtime.RuntimeConnectorInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance;
import org.muml.verification.core.runtime.RuntimeDiscretePortInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimePackage;
import org.muml.verification.core.runtime.RuntimeParameter;
import org.muml.verification.core.runtime.RuntimeRoleConnectorInstance;
import org.muml.verification.core.runtime.SingleRoleInstance;
import org.muml.verification.core.runtime.VariableBinding;

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
 * @see org.muml.verification.core.runtime.RuntimePackage
 * @generated
 */
public class RuntimeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
			case RuntimePackage.RUNTIME_COMPONENT_INSTANCE: {
				RuntimeComponentInstance runtimeComponentInstance = (RuntimeComponentInstance)theEObject;
				T result = caseRuntimeComponentInstance(runtimeComponentInstance);
				if (result == null) result = caseComponentInstance(runtimeComponentInstance);
				if (result == null) result = caseRuntimeBehavioralElement(runtimeComponentInstance);
				if (result == null) result = caseNamedElement(runtimeComponentInstance);
				if (result == null) result = caseExtendableElement(runtimeComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE: {
				RuntimeDiscretePortInstance runtimeDiscretePortInstance = (RuntimeDiscretePortInstance)theEObject;
				T result = caseRuntimeDiscretePortInstance(runtimeDiscretePortInstance);
				if (result == null) result = caseDiscretePortInstance(runtimeDiscretePortInstance);
				if (result == null) result = caseRuntimeDiscreteInteractionEndpointInstance(runtimeDiscretePortInstance);
				if (result == null) result = casePortInstance(runtimeDiscretePortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(runtimeDiscretePortInstance);
				if (result == null) result = caseRuntimeBehavioralElement(runtimeDiscretePortInstance);
				if (result == null) result = caseDataType(runtimeDiscretePortInstance);
				if (result == null) result = caseConnectorEndpointInstance(runtimeDiscretePortInstance);
				if (result == null) result = caseNamedElement(runtimeDiscretePortInstance);
				if (result == null) result = caseCommentableElement(runtimeDiscretePortInstance);
				if (result == null) result = caseExtendableElement(runtimeDiscretePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.ROLE_INSTANCE: {
				RoleInstance roleInstance = (RoleInstance)theEObject;
				T result = caseRoleInstance(roleInstance);
				if (result == null) result = caseRuntimeDiscreteInteractionEndpointInstance(roleInstance);
				if (result == null) result = caseRuntimeBehavioralElement(roleInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(roleInstance);
				if (result == null) result = caseDataType(roleInstance);
				if (result == null) result = caseConnectorEndpointInstance(roleInstance);
				if (result == null) result = caseNamedElement(roleInstance);
				if (result == null) result = caseCommentableElement(roleInstance);
				if (result == null) result = caseExtendableElement(roleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER: {
				RuntimeMessageBuffer runtimeMessageBuffer = (RuntimeMessageBuffer)theEObject;
				T result = caseRuntimeMessageBuffer(runtimeMessageBuffer);
				if (result == null) result = caseExtendableElement(runtimeMessageBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.REALTIME_STATECHART_INSTANCE: {
				RealtimeStatechartInstance realtimeStatechartInstance = (RealtimeStatechartInstance)theEObject;
				T result = caseRealtimeStatechartInstance(realtimeStatechartInstance);
				if (result == null) result = caseExtendableElement(realtimeStatechartInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_MESSAGE: {
				RuntimeMessage runtimeMessage = (RuntimeMessage)theEObject;
				T result = caseRuntimeMessage(runtimeMessage);
				if (result == null) result = caseNamedElement(runtimeMessage);
				if (result == null) result = caseExtendableElement(runtimeMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_PARAMETER: {
				RuntimeParameter runtimeParameter = (RuntimeParameter)theEObject;
				T result = caseRuntimeParameter(runtimeParameter);
				if (result == null) result = caseNamedElement(runtimeParameter);
				if (result == null) result = caseExtendableElement(runtimeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.VARIABLE_BINDING: {
				VariableBinding variableBinding = (VariableBinding)theEObject;
				T result = caseVariableBinding(variableBinding);
				if (result == null) result = caseExtendableElement(variableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT: {
				RuntimeBehavioralElement runtimeBehavioralElement = (RuntimeBehavioralElement)theEObject;
				T result = caseRuntimeBehavioralElement(runtimeBehavioralElement);
				if (result == null) result = caseNamedElement(runtimeBehavioralElement);
				if (result == null) result = caseExtendableElement(runtimeBehavioralElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.SINGLE_ROLE_INSTANCE: {
				SingleRoleInstance singleRoleInstance = (SingleRoleInstance)theEObject;
				T result = caseSingleRoleInstance(singleRoleInstance);
				if (result == null) result = caseRoleInstance(singleRoleInstance);
				if (result == null) result = caseDiscreteSingleInteractionEndpointInstance(singleRoleInstance);
				if (result == null) result = caseRuntimeDiscreteInteractionEndpointInstance(singleRoleInstance);
				if (result == null) result = caseRuntimeBehavioralElement(singleRoleInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(singleRoleInstance);
				if (result == null) result = caseDataType(singleRoleInstance);
				if (result == null) result = caseConnectorEndpointInstance(singleRoleInstance);
				if (result == null) result = caseNamedElement(singleRoleInstance);
				if (result == null) result = caseCommentableElement(singleRoleInstance);
				if (result == null) result = caseExtendableElement(singleRoleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.MULTI_ROLE_INSTANCE: {
				MultiRoleInstance multiRoleInstance = (MultiRoleInstance)theEObject;
				T result = caseMultiRoleInstance(multiRoleInstance);
				if (result == null) result = caseRoleInstance(multiRoleInstance);
				if (result == null) result = caseDiscreteMultiInteractionEndpointInstance(multiRoleInstance);
				if (result == null) result = caseRuntimeDiscreteInteractionEndpointInstance(multiRoleInstance);
				if (result == null) result = caseRuntimeBehavioralElement(multiRoleInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(multiRoleInstance);
				if (result == null) result = caseDataType(multiRoleInstance);
				if (result == null) result = caseConnectorEndpointInstance(multiRoleInstance);
				if (result == null) result = caseNamedElement(multiRoleInstance);
				if (result == null) result = caseCommentableElement(multiRoleInstance);
				if (result == null) result = caseExtendableElement(multiRoleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_ROLE_CONNECTOR_INSTANCE: {
				RuntimeRoleConnectorInstance runtimeRoleConnectorInstance = (RuntimeRoleConnectorInstance)theEObject;
				T result = caseRuntimeRoleConnectorInstance(runtimeRoleConnectorInstance);
				if (result == null) result = caseRuntimeConnectorInstance(runtimeRoleConnectorInstance);
				if (result == null) result = caseConnectorInstance(runtimeRoleConnectorInstance);
				if (result == null) result = caseCommentableElement(runtimeRoleConnectorInstance);
				if (result == null) result = caseExtendableElement(runtimeRoleConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_CONNECTOR_INSTANCE: {
				RuntimeConnectorInstance runtimeConnectorInstance = (RuntimeConnectorInstance)theEObject;
				T result = caseRuntimeConnectorInstance(runtimeConnectorInstance);
				if (result == null) result = caseConnectorInstance(runtimeConnectorInstance);
				if (result == null) result = caseCommentableElement(runtimeConnectorInstance);
				if (result == null) result = caseExtendableElement(runtimeConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE: {
				RuntimeAssemblyConnectorInstance runtimeAssemblyConnectorInstance = (RuntimeAssemblyConnectorInstance)theEObject;
				T result = caseRuntimeAssemblyConnectorInstance(runtimeAssemblyConnectorInstance);
				if (result == null) result = caseAssemblyConnectorInstance(runtimeAssemblyConnectorInstance);
				if (result == null) result = caseRuntimeConnectorInstance(runtimeAssemblyConnectorInstance);
				if (result == null) result = casePortConnectorInstance(runtimeAssemblyConnectorInstance);
				if (result == null) result = caseConnectorInstance(runtimeAssemblyConnectorInstance);
				if (result == null) result = caseCommentableElement(runtimeAssemblyConnectorInstance);
				if (result == null) result = caseExtendableElement(runtimeAssemblyConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.MESSAGE_ON_CONNECTOR: {
				MessageOnConnector messageOnConnector = (MessageOnConnector)theEObject;
				T result = caseMessageOnConnector(messageOnConnector);
				if (result == null) result = caseExtendableElement(messageOnConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE: {
				RuntimeDiscreteInteractionEndpointInstance runtimeDiscreteInteractionEndpointInstance = (RuntimeDiscreteInteractionEndpointInstance)theEObject;
				T result = caseRuntimeDiscreteInteractionEndpointInstance(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseRuntimeBehavioralElement(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseDataType(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseConnectorEndpointInstance(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseNamedElement(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseCommentableElement(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = caseExtendableElement(runtimeDiscreteInteractionEndpointInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE: {
				RuntimeDiscreteSinglePortInstance runtimeDiscreteSinglePortInstance = (RuntimeDiscreteSinglePortInstance)theEObject;
				T result = caseRuntimeDiscreteSinglePortInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseRuntimeDiscretePortInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseDiscreteSinglePortInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseDiscretePortInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseRuntimeDiscreteInteractionEndpointInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseDiscreteSingleInteractionEndpointInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = casePortInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseRuntimeBehavioralElement(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseDataType(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseConnectorEndpointInstance(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseNamedElement(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseCommentableElement(runtimeDiscreteSinglePortInstance);
				if (result == null) result = caseExtendableElement(runtimeDiscreteSinglePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_DISCRETE_MULTI_PORT_INSTANCE: {
				RuntimeDiscreteMultiPortInstance runtimeDiscreteMultiPortInstance = (RuntimeDiscreteMultiPortInstance)theEObject;
				T result = caseRuntimeDiscreteMultiPortInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseDiscreteMultiPortInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseRuntimeDiscretePortInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseDiscretePortInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseDiscreteMultiInteractionEndpointInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseRuntimeDiscreteInteractionEndpointInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = casePortInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseRuntimeBehavioralElement(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseDataType(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseNamedElement(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseCommentableElement(runtimeDiscreteMultiPortInstance);
				if (result == null) result = caseExtendableElement(runtimeDiscreteMultiPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeComponentInstance(RuntimeComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeDiscretePortInstance(RuntimeDiscretePortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleInstance(RoleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeMessageBuffer(RuntimeMessageBuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realtime Statechart Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realtime Statechart Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealtimeStatechartInstance(RealtimeStatechartInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeMessage(RuntimeMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeParameter(RuntimeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableBinding(VariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeBehavioralElement(RuntimeBehavioralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Role Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleRoleInstance(SingleRoleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Role Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiRoleInstance(MultiRoleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeRoleConnectorInstance(RuntimeRoleConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeConnectorInstance(RuntimeConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeAssemblyConnectorInstance(RuntimeAssemblyConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message On Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message On Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOnConnector(MessageOnConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeDiscreteInteractionEndpointInstance(RuntimeDiscreteInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Single Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeDiscreteSinglePortInstance(RuntimeDiscreteSinglePortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Multi Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Multi Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeDiscreteMultiPortInstance(RuntimeDiscreteMultiPortInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstance(PortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpointInstance(DiscreteInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscretePortInstance(DiscretePortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteSingleInteractionEndpointInstance(DiscreteSingleInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Port Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnectorInstance(PortConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyConnectorInstance(AssemblyConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Single Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteSinglePortInstance(DiscreteSinglePortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Multi Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Multi Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteMultiPortInstance(DiscreteMultiPortInstance object) {
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

} //RuntimeSwitch

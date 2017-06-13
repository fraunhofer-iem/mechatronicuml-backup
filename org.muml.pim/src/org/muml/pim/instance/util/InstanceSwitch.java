/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.util;

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
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.pim.instance.CoordinationProtocolInstance;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscretePortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.HybridPortInstance;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;

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
 * @see org.muml.pim.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = InstancePackage.eINSTANCE;
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
			case InstancePackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseNamedElement(componentInstance);
				if (result == null) result = caseExtendableElement(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PORT_CONNECTOR_INSTANCE: {
				PortConnectorInstance portConnectorInstance = (PortConnectorInstance)theEObject;
				T result = casePortConnectorInstance(portConnectorInstance);
				if (result == null) result = caseConnectorInstance(portConnectorInstance);
				if (result == null) result = caseCommentableElement(portConnectorInstance);
				if (result == null) result = caseExtendableElement(portConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PORT_INSTANCE: {
				PortInstance portInstance = (PortInstance)theEObject;
				T result = casePortInstance(portInstance);
				if (result == null) result = caseConnectorEndpointInstance(portInstance);
				if (result == null) result = caseNamedElement(portInstance);
				if (result == null) result = caseCommentableElement(portInstance);
				if (result == null) result = caseExtendableElement(portInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE: {
				AssemblyConnectorInstance assemblyConnectorInstance = (AssemblyConnectorInstance)theEObject;
				T result = caseAssemblyConnectorInstance(assemblyConnectorInstance);
				if (result == null) result = casePortConnectorInstance(assemblyConnectorInstance);
				if (result == null) result = caseConnectorInstance(assemblyConnectorInstance);
				if (result == null) result = caseCommentableElement(assemblyConnectorInstance);
				if (result == null) result = caseExtendableElement(assemblyConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DELEGATION_CONNECTOR_INSTANCE: {
				DelegationConnectorInstance delegationConnectorInstance = (DelegationConnectorInstance)theEObject;
				T result = caseDelegationConnectorInstance(delegationConnectorInstance);
				if (result == null) result = casePortConnectorInstance(delegationConnectorInstance);
				if (result == null) result = caseConnectorInstance(delegationConnectorInstance);
				if (result == null) result = caseCommentableElement(delegationConnectorInstance);
				if (result == null) result = caseExtendableElement(delegationConnectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION: {
				ComponentInstanceConfiguration componentInstanceConfiguration = (ComponentInstanceConfiguration)theEObject;
				T result = caseComponentInstanceConfiguration(componentInstanceConfiguration);
				if (result == null) result = caseNamedElement(componentInstanceConfiguration);
				if (result == null) result = caseCommentableElement(componentInstanceConfiguration);
				if (result == null) result = caseVerifiableElement(componentInstanceConfiguration);
				if (result == null) result = caseExtendableElement(componentInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.CONTINUOUS_PORT_INSTANCE: {
				ContinuousPortInstance continuousPortInstance = (ContinuousPortInstance)theEObject;
				T result = caseContinuousPortInstance(continuousPortInstance);
				if (result == null) result = casePortInstance(continuousPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(continuousPortInstance);
				if (result == null) result = caseNamedElement(continuousPortInstance);
				if (result == null) result = caseCommentableElement(continuousPortInstance);
				if (result == null) result = caseExtendableElement(continuousPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.HYBRID_PORT_INSTANCE: {
				HybridPortInstance hybridPortInstance = (HybridPortInstance)theEObject;
				T result = caseHybridPortInstance(hybridPortInstance);
				if (result == null) result = casePortInstance(hybridPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(hybridPortInstance);
				if (result == null) result = caseNamedElement(hybridPortInstance);
				if (result == null) result = caseCommentableElement(hybridPortInstance);
				if (result == null) result = caseExtendableElement(hybridPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DISCRETE_PORT_INSTANCE: {
				DiscretePortInstance discretePortInstance = (DiscretePortInstance)theEObject;
				T result = caseDiscretePortInstance(discretePortInstance);
				if (result == null) result = casePortInstance(discretePortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(discretePortInstance);
				if (result == null) result = caseConnectorEndpointInstance(discretePortInstance);
				if (result == null) result = caseNamedElement(discretePortInstance);
				if (result == null) result = caseCommentableElement(discretePortInstance);
				if (result == null) result = caseExtendableElement(discretePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE: {
				DiscreteSinglePortInstance discreteSinglePortInstance = (DiscreteSinglePortInstance)theEObject;
				T result = caseDiscreteSinglePortInstance(discreteSinglePortInstance);
				if (result == null) result = caseDiscretePortInstance(discreteSinglePortInstance);
				if (result == null) result = caseDiscreteSingleInteractionEndpointInstance(discreteSinglePortInstance);
				if (result == null) result = casePortInstance(discreteSinglePortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(discreteSinglePortInstance);
				if (result == null) result = caseConnectorEndpointInstance(discreteSinglePortInstance);
				if (result == null) result = caseNamedElement(discreteSinglePortInstance);
				if (result == null) result = caseCommentableElement(discreteSinglePortInstance);
				if (result == null) result = caseExtendableElement(discreteSinglePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE: {
				DiscreteMultiPortInstance discreteMultiPortInstance = (DiscreteMultiPortInstance)theEObject;
				T result = caseDiscreteMultiPortInstance(discreteMultiPortInstance);
				if (result == null) result = caseDiscretePortInstance(discreteMultiPortInstance);
				if (result == null) result = caseDiscreteMultiInteractionEndpointInstance(discreteMultiPortInstance);
				if (result == null) result = casePortInstance(discreteMultiPortInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(discreteMultiPortInstance);
				if (result == null) result = caseConnectorEndpointInstance(discreteMultiPortInstance);
				if (result == null) result = caseNamedElement(discreteMultiPortInstance);
				if (result == null) result = caseCommentableElement(discreteMultiPortInstance);
				if (result == null) result = caseExtendableElement(discreteMultiPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE: {
				CoordinationProtocolInstance coordinationProtocolInstance = (CoordinationProtocolInstance)theEObject;
				T result = caseCoordinationProtocolInstance(coordinationProtocolInstance);
				if (result == null) result = caseNamedElement(coordinationProtocolInstance);
				if (result == null) result = caseExtendableElement(coordinationProtocolInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE: {
				StructuredComponentInstance structuredComponentInstance = (StructuredComponentInstance)theEObject;
				T result = caseStructuredComponentInstance(structuredComponentInstance);
				if (result == null) result = caseComponentInstance(structuredComponentInstance);
				if (result == null) result = caseNamedElement(structuredComponentInstance);
				if (result == null) result = caseExtendableElement(structuredComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ATOMIC_COMPONENT_INSTANCE: {
				AtomicComponentInstance atomicComponentInstance = (AtomicComponentInstance)theEObject;
				T result = caseAtomicComponentInstance(atomicComponentInstance);
				if (result == null) result = caseComponentInstance(atomicComponentInstance);
				if (result == null) result = caseNamedElement(atomicComponentInstance);
				if (result == null) result = caseExtendableElement(atomicComponentInstance);
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
	public T caseComponentInstance(ComponentInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiableElement(VerifiableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Connector Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationConnectorInstance(DelegationConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstanceConfiguration(ComponentInstanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousPortInstance(ContinuousPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridPortInstance(HybridPortInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Protocol Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Protocol Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationProtocolInstance(CoordinationProtocolInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredComponentInstance(StructuredComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicComponentInstance(AtomicComponentInstance object) {
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

} //InstanceSwitch

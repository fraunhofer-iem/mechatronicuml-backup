/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.ContinuousPort;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.HybridPort;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortConnector;
import org.muml.pim.component.PortPart;
import org.muml.pim.component.StaticAtomicComponent;
import org.muml.pim.component.StaticComponent;
import org.muml.pim.component.StaticStructuredComponent;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.types.DataType;

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
 * @see org.muml.pim.component.ComponentPackage
 * @generated
 */
public class ComponentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentPackage.eINSTANCE;
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
			case ComponentPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseDataType(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseExtendableElement(component);
				if (result == null) result = caseCommentableElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseConnectorEndpoint(port);
				if (result == null) result = caseDataType(port);
				if (result == null) result = caseCommentableElement(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseExtendableElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.CONTINUOUS_PORT: {
				ContinuousPort continuousPort = (ContinuousPort)theEObject;
				T result = caseContinuousPort(continuousPort);
				if (result == null) result = caseDirectedTypedPort(continuousPort);
				if (result == null) result = casePort(continuousPort);
				if (result == null) result = caseTypedNamedElement(continuousPort);
				if (result == null) result = caseConnectorEndpoint(continuousPort);
				if (result == null) result = caseDataType(continuousPort);
				if (result == null) result = caseCommentableElement(continuousPort);
				if (result == null) result = caseNamedElement(continuousPort);
				if (result == null) result = caseExtendableElement(continuousPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.DISCRETE_PORT: {
				DiscretePort discretePort = (DiscretePort)theEObject;
				T result = caseDiscretePort(discretePort);
				if (result == null) result = casePort(discretePort);
				if (result == null) result = caseDiscreteInteractionEndpoint(discretePort);
				if (result == null) result = caseConnectorEndpoint(discretePort);
				if (result == null) result = caseDataType(discretePort);
				if (result == null) result = caseBehavioralElement(discretePort);
				if (result == null) result = caseCommentableElement(discretePort);
				if (result == null) result = caseNamedElement(discretePort);
				if (result == null) result = caseExtendableElement(discretePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.COMPONENT_PART: {
				ComponentPart componentPart = (ComponentPart)theEObject;
				T result = caseComponentPart(componentPart);
				if (result == null) result = caseDataType(componentPart);
				if (result == null) result = caseNamedElement(componentPart);
				if (result == null) result = caseExtendableElement(componentPart);
				if (result == null) result = caseCommentableElement(componentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.STATIC_STRUCTURED_COMPONENT: {
				StaticStructuredComponent staticStructuredComponent = (StaticStructuredComponent)theEObject;
				T result = caseStaticStructuredComponent(staticStructuredComponent);
				if (result == null) result = caseStructuredComponent(staticStructuredComponent);
				if (result == null) result = caseStaticComponent(staticStructuredComponent);
				if (result == null) result = caseComponent(staticStructuredComponent);
				if (result == null) result = caseDataType(staticStructuredComponent);
				if (result == null) result = caseNamedElement(staticStructuredComponent);
				if (result == null) result = caseExtendableElement(staticStructuredComponent);
				if (result == null) result = caseCommentableElement(staticStructuredComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.ATOMIC_COMPONENT: {
				AtomicComponent atomicComponent = (AtomicComponent)theEObject;
				T result = caseAtomicComponent(atomicComponent);
				if (result == null) result = caseComponent(atomicComponent);
				if (result == null) result = caseBehavioralElement(atomicComponent);
				if (result == null) result = caseVerifiableElement(atomicComponent);
				if (result == null) result = caseDataType(atomicComponent);
				if (result == null) result = caseNamedElement(atomicComponent);
				if (result == null) result = caseExtendableElement(atomicComponent);
				if (result == null) result = caseCommentableElement(atomicComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.ASSEMBLY_CONNECTOR: {
				AssemblyConnector assemblyConnector = (AssemblyConnector)theEObject;
				T result = caseAssemblyConnector(assemblyConnector);
				if (result == null) result = casePortConnector(assemblyConnector);
				if (result == null) result = caseConnector(assemblyConnector);
				if (result == null) result = caseCommentableElement(assemblyConnector);
				if (result == null) result = caseExtendableElement(assemblyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.DELEGATION_CONNECTOR: {
				DelegationConnector delegationConnector = (DelegationConnector)theEObject;
				T result = caseDelegationConnector(delegationConnector);
				if (result == null) result = casePortConnector(delegationConnector);
				if (result == null) result = caseConnector(delegationConnector);
				if (result == null) result = caseCommentableElement(delegationConnector);
				if (result == null) result = caseExtendableElement(delegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.PORT_CONNECTOR: {
				PortConnector portConnector = (PortConnector)theEObject;
				T result = casePortConnector(portConnector);
				if (result == null) result = caseConnector(portConnector);
				if (result == null) result = caseCommentableElement(portConnector);
				if (result == null) result = caseExtendableElement(portConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.HYBRID_PORT: {
				HybridPort hybridPort = (HybridPort)theEObject;
				T result = caseHybridPort(hybridPort);
				if (result == null) result = caseDirectedTypedPort(hybridPort);
				if (result == null) result = casePort(hybridPort);
				if (result == null) result = caseTypedNamedElement(hybridPort);
				if (result == null) result = caseConnectorEndpoint(hybridPort);
				if (result == null) result = caseDataType(hybridPort);
				if (result == null) result = caseCommentableElement(hybridPort);
				if (result == null) result = caseNamedElement(hybridPort);
				if (result == null) result = caseExtendableElement(hybridPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.STRUCTURED_COMPONENT: {
				StructuredComponent structuredComponent = (StructuredComponent)theEObject;
				T result = caseStructuredComponent(structuredComponent);
				if (result == null) result = caseComponent(structuredComponent);
				if (result == null) result = caseDataType(structuredComponent);
				if (result == null) result = caseNamedElement(structuredComponent);
				if (result == null) result = caseExtendableElement(structuredComponent);
				if (result == null) result = caseCommentableElement(structuredComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.COORDINATION_PROTOCOL_PART: {
				CoordinationProtocolPart coordinationProtocolPart = (CoordinationProtocolPart)theEObject;
				T result = caseCoordinationProtocolPart(coordinationProtocolPart);
				if (result == null) result = caseCommentableElement(coordinationProtocolPart);
				if (result == null) result = caseExtendableElement(coordinationProtocolPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.DIRECTED_TYPED_PORT: {
				DirectedTypedPort directedTypedPort = (DirectedTypedPort)theEObject;
				T result = caseDirectedTypedPort(directedTypedPort);
				if (result == null) result = casePort(directedTypedPort);
				if (result == null) result = caseTypedNamedElement(directedTypedPort);
				if (result == null) result = caseConnectorEndpoint(directedTypedPort);
				if (result == null) result = caseDataType(directedTypedPort);
				if (result == null) result = caseCommentableElement(directedTypedPort);
				if (result == null) result = caseNamedElement(directedTypedPort);
				if (result == null) result = caseExtendableElement(directedTypedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.PORT_PART: {
				PortPart portPart = (PortPart)theEObject;
				T result = casePortPart(portPart);
				if (result == null) result = caseConnectorEndpoint(portPart);
				if (result == null) result = caseCommentableElement(portPart);
				if (result == null) result = caseExtendableElement(portPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.STATIC_ATOMIC_COMPONENT: {
				StaticAtomicComponent staticAtomicComponent = (StaticAtomicComponent)theEObject;
				T result = caseStaticAtomicComponent(staticAtomicComponent);
				if (result == null) result = caseAtomicComponent(staticAtomicComponent);
				if (result == null) result = caseStaticComponent(staticAtomicComponent);
				if (result == null) result = caseComponent(staticAtomicComponent);
				if (result == null) result = caseBehavioralElement(staticAtomicComponent);
				if (result == null) result = caseVerifiableElement(staticAtomicComponent);
				if (result == null) result = caseDataType(staticAtomicComponent);
				if (result == null) result = caseNamedElement(staticAtomicComponent);
				if (result == null) result = caseExtendableElement(staticAtomicComponent);
				if (result == null) result = caseCommentableElement(staticAtomicComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentPackage.STATIC_COMPONENT: {
				StaticComponent staticComponent = (StaticComponent)theEObject;
				T result = caseStaticComponent(staticComponent);
				if (result == null) result = caseComponent(staticComponent);
				if (result == null) result = caseDataType(staticComponent);
				if (result == null) result = caseNamedElement(staticComponent);
				if (result == null) result = caseExtendableElement(staticComponent);
				if (result == null) result = caseCommentableElement(staticComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousPort(ContinuousPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscretePort(DiscretePort object) {
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
	public T caseComponentPart(ComponentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Structured Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticStructuredComponent(StaticStructuredComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredComponent(StructuredComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Typed Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Typed Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedTypedPort(DirectedTypedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortPart(PortPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Atomic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticAtomicComponent(StaticAtomicComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticComponent(StaticComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicComponent(AtomicComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnector(PortConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyConnector(AssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationConnector(DelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridPort(HybridPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Protocol Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Protocol Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationProtocolPart(CoordinationProtocolPart object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Typed Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedNamedElement(TypedNamedElement object) {
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
	public T caseBehavioralElement(BehavioralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpoint(DiscreteInteractionEndpoint object) {
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

} //ComponentSwitch

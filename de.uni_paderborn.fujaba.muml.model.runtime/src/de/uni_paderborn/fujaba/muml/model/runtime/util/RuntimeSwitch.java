/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstanceAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance;

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
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage
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
				if (result == null) result = caseRuntimeBehavioralElement(runtimeDiscretePortInstance);
				if (result == null) result = casePortInstance(runtimeDiscretePortInstance);
				if (result == null) result = caseNamedElement(runtimeDiscretePortInstance);
				if (result == null) result = caseCommentableElement(runtimeDiscretePortInstance);
				if (result == null) result = caseExtendableElement(runtimeDiscretePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.ROLE_INSTANCE: {
				RoleInstance roleInstance = (RoleInstance)theEObject;
				T result = caseRoleInstance(roleInstance);
				if (result == null) result = caseRuntimeBehavioralElement(roleInstance);
				if (result == null) result = caseNamedElement(roleInstance);
				if (result == null) result = caseExtendableElement(roleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.MESSAGE_BUFFER: {
				MessageBuffer messageBuffer = (MessageBuffer)theEObject;
				T result = caseMessageBuffer(messageBuffer);
				if (result == null) result = caseExtendableElement(messageBuffer);
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
			case RuntimePackage.ATTRIBUTE_BINDING: {
				AttributeBinding attributeBinding = (AttributeBinding)theEObject;
				T result = caseAttributeBinding(attributeBinding);
				if (result == null) result = caseExtendableElement(attributeBinding);
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
				if (result == null) result = caseRuntimeBehavioralElement(singleRoleInstance);
				if (result == null) result = caseNamedElement(singleRoleInstance);
				if (result == null) result = caseExtendableElement(singleRoleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.MULTI_ROLE_INSTANCE: {
				MultiRoleInstance multiRoleInstance = (MultiRoleInstance)theEObject;
				T result = caseMultiRoleInstance(multiRoleInstance);
				if (result == null) result = caseRoleInstance(multiRoleInstance);
				if (result == null) result = caseRuntimeBehavioralElement(multiRoleInstance);
				if (result == null) result = caseNamedElement(multiRoleInstance);
				if (result == null) result = caseExtendableElement(multiRoleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY: {
				RuntimeRoleAssembly runtimeRoleAssembly = (RuntimeRoleAssembly)theEObject;
				T result = caseRuntimeRoleAssembly(runtimeRoleAssembly);
				if (result == null) result = caseRoleConnector(runtimeRoleAssembly);
				if (result == null) result = caseRuntimeAssemblyInstance(runtimeRoleAssembly);
				if (result == null) result = caseBehavioralElement(runtimeRoleAssembly);
				if (result == null) result = caseExtendableElement(runtimeRoleAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE: {
				RuntimeAssemblyInstance runtimeAssemblyInstance = (RuntimeAssemblyInstance)theEObject;
				T result = caseRuntimeAssemblyInstance(runtimeAssemblyInstance);
				if (result == null) result = caseExtendableElement(runtimeAssemblyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME_PORT_INSTANCE_ASSEMBLY: {
				RuntimePortInstanceAssembly runtimePortInstanceAssembly = (RuntimePortInstanceAssembly)theEObject;
				T result = caseRuntimePortInstanceAssembly(runtimePortInstanceAssembly);
				if (result == null) result = caseAssemblyInstance(runtimePortInstanceAssembly);
				if (result == null) result = caseRuntimeAssemblyInstance(runtimePortInstanceAssembly);
				if (result == null) result = caseConnectorInstance(runtimePortInstanceAssembly);
				if (result == null) result = caseExtendableElement(runtimePortInstanceAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.MESSAGE_ON_ASSEMBLY: {
				MessageOnAssembly messageOnAssembly = (MessageOnAssembly)theEObject;
				T result = caseMessageOnAssembly(messageOnAssembly);
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
	public T caseMessageBuffer(MessageBuffer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeBinding(AttributeBinding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Role Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeRoleAssembly(RuntimeRoleAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeAssemblyInstance(RuntimeAssemblyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimePortInstanceAssembly(RuntimePortInstanceAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message On Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message On Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOnAssembly(MessageOnAssembly object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnector(RoleConnector object) {
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
	public T caseConnectorInstance(ConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyInstance(AssemblyInstance object) {
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

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.util;

import de.uni_paderborn.fujaba.muml.model.instance.*;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HardwarePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

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
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstancePackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseNamedElement(componentInstance);
				if (result == null) result = caseBehavioralElementInstance(componentInstance);
				if (result == null) result = caseExtendableElement(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.CONNECTOR_INSTANCE: {
				ConnectorInstance connectorInstance = (ConnectorInstance)theEObject;
				T result = caseConnectorInstance(connectorInstance);
				if (result == null) result = caseExtendableElement(connectorInstance);
				if (result == null) result = caseBehavioralElementInstance(connectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.PORT_INSTANCE: {
				PortInstance portInstance = (PortInstance)theEObject;
				T result = casePortInstance(portInstance);
				if (result == null) result = caseNamedElement(portInstance);
				if (result == null) result = caseCommentableElement(portInstance);
				if (result == null) result = caseBehavioralElementInstance(portInstance);
				if (result == null) result = caseExtendableElement(portInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ASSEMBLY_INSTANCE: {
				AssemblyInstance assemblyInstance = (AssemblyInstance)theEObject;
				T result = caseAssemblyInstance(assemblyInstance);
				if (result == null) result = caseConnectorInstance(assemblyInstance);
				if (result == null) result = caseExtendableElement(assemblyInstance);
				if (result == null) result = caseBehavioralElementInstance(assemblyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DELEGATION_INSTANCE: {
				DelegationInstance delegationInstance = (DelegationInstance)theEObject;
				T result = caseDelegationInstance(delegationInstance);
				if (result == null) result = caseConnectorInstance(delegationInstance);
				if (result == null) result = caseExtendableElement(delegationInstance);
				if (result == null) result = caseBehavioralElementInstance(delegationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION: {
				ComponentInstanceConfiguration componentInstanceConfiguration = (ComponentInstanceConfiguration)theEObject;
				T result = caseComponentInstanceConfiguration(componentInstanceConfiguration);
				if (result == null) result = caseExtendableElement(componentInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.HARDWARE_PORT_INSTANCE: {
				HardwarePortInstance hardwarePortInstance = (HardwarePortInstance)theEObject;
				T result = caseHardwarePortInstance(hardwarePortInstance);
				if (result == null) result = casePortInstance(hardwarePortInstance);
				if (result == null) result = caseNamedElement(hardwarePortInstance);
				if (result == null) result = caseCommentableElement(hardwarePortInstance);
				if (result == null) result = caseBehavioralElementInstance(hardwarePortInstance);
				if (result == null) result = caseExtendableElement(hardwarePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.CONTINUOUS_PORT_INSTANCE: {
				ContinuousPortInstance continuousPortInstance = (ContinuousPortInstance)theEObject;
				T result = caseContinuousPortInstance(continuousPortInstance);
				if (result == null) result = casePortInstance(continuousPortInstance);
				if (result == null) result = caseNamedElement(continuousPortInstance);
				if (result == null) result = caseCommentableElement(continuousPortInstance);
				if (result == null) result = caseBehavioralElementInstance(continuousPortInstance);
				if (result == null) result = caseExtendableElement(continuousPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.HYBRID_PORT_INSTANCE: {
				HybridPortInstance hybridPortInstance = (HybridPortInstance)theEObject;
				T result = caseHybridPortInstance(hybridPortInstance);
				if (result == null) result = caseDiscretePortInstance(hybridPortInstance);
				if (result == null) result = caseContinuousPortInstance(hybridPortInstance);
				if (result == null) result = casePortInstance(hybridPortInstance);
				if (result == null) result = caseNamedElement(hybridPortInstance);
				if (result == null) result = caseCommentableElement(hybridPortInstance);
				if (result == null) result = caseBehavioralElementInstance(hybridPortInstance);
				if (result == null) result = caseExtendableElement(hybridPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DISCRETE_PORT_INSTANCE: {
				DiscretePortInstance discretePortInstance = (DiscretePortInstance)theEObject;
				T result = caseDiscretePortInstance(discretePortInstance);
				if (result == null) result = casePortInstance(discretePortInstance);
				if (result == null) result = caseNamedElement(discretePortInstance);
				if (result == null) result = caseCommentableElement(discretePortInstance);
				if (result == null) result = caseBehavioralElementInstance(discretePortInstance);
				if (result == null) result = caseExtendableElement(discretePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE: {
				DiscreteSinglePortInstance discreteSinglePortInstance = (DiscreteSinglePortInstance)theEObject;
				T result = caseDiscreteSinglePortInstance(discreteSinglePortInstance);
				if (result == null) result = caseDiscretePortInstance(discreteSinglePortInstance);
				if (result == null) result = casePortInstance(discreteSinglePortInstance);
				if (result == null) result = caseNamedElement(discreteSinglePortInstance);
				if (result == null) result = caseCommentableElement(discreteSinglePortInstance);
				if (result == null) result = caseBehavioralElementInstance(discreteSinglePortInstance);
				if (result == null) result = caseExtendableElement(discreteSinglePortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE: {
				DiscreteMultiPortInstance discreteMultiPortInstance = (DiscreteMultiPortInstance)theEObject;
				T result = caseDiscreteMultiPortInstance(discreteMultiPortInstance);
				if (result == null) result = caseDiscretePortInstance(discreteMultiPortInstance);
				if (result == null) result = casePortInstance(discreteMultiPortInstance);
				if (result == null) result = caseNamedElement(discreteMultiPortInstance);
				if (result == null) result = caseCommentableElement(discreteMultiPortInstance);
				if (result == null) result = caseBehavioralElementInstance(discreteMultiPortInstance);
				if (result == null) result = caseExtendableElement(discreteMultiPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.BEHAVIOR_INSTANCE: {
				BehaviorInstance behaviorInstance = (BehaviorInstance)theEObject;
				T result = caseBehaviorInstance(behaviorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE: {
				FujabaRealtimeStatechartInstance fujabaRealtimeStatechartInstance = (FujabaRealtimeStatechartInstance)theEObject;
				T result = caseFujabaRealtimeStatechartInstance(fujabaRealtimeStatechartInstance);
				if (result == null) result = caseBehaviorInstance(fujabaRealtimeStatechartInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE: {
				BehavioralElementInstance behavioralElementInstance = (BehavioralElementInstance)theEObject;
				T result = caseBehavioralElementInstance(behavioralElementInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstancePackage.ATTRIBUTE_BINDING: {
				AttributeBinding attributeBinding = (AttributeBinding)theEObject;
				T result = caseAttributeBinding(attributeBinding);
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
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationInstance(DelegationInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePortInstance(HardwarePortInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorInstance(BehaviorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fujaba Realtime Statechart Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fujaba Realtime Statechart Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFujabaRealtimeStatechartInstance(FujabaRealtimeStatechartInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralElementInstance(BehavioralElementInstance object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //InstanceSwitch

/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refined Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a StructuredResourceInstance which knows all it's ComponentInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance#getAllUsedMessageTypes <em>All Used Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedStructuredResourceInstance()
 * @model
 * @generated
 */
public interface RefinedStructuredResourceInstance extends StructuredResourceInstance {
	/**
	 * Returns the value of the '<em><b>Allocated Atomic Component Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ComponentInstances which are allocated to this StructuredResourceInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated Atomic Component Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedStructuredResourceInstance_AllocatedAtomicComponentInstances()
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance
	 * @model opposite="allocatedResourceInstance"
	 * @generated
	 */
	EList<RefinedAtomicComponentInstance> getAllocatedAtomicComponentInstances();

	/**
	 * Returns the value of the '<em><b>All Used Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All MessageTypes which are used locally on this StructuredResourceInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Used Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedStructuredResourceInstance_AllUsedMessageTypes()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let discretePortInstance : Set(instance::DiscretePortInstance) = self.allocatedAtomicComponentInstances.portInstances->select(p | p.oclIsKindOf(instance::DiscretePortInstance)).oclAsType(instance::DiscretePortInstance)->asOrderedSet() in\ndiscretePortInstance.receiverMessageTypes->asOrderedSet()->union(discretePortInstance.senderMessageTypes->asOrderedSet())->asOrderedSet()\n\n\n\n'"
	 * @generated
	 */
	EList<MessageType> getAllUsedMessageTypes();

} // RefinedStructuredResourceInstance

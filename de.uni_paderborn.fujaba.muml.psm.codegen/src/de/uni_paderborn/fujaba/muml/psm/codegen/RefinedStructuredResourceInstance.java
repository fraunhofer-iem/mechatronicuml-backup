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
	 * <p>
	 * If the meaning of the '<em>Allocated Atomic Component Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * <p>
	 * If the meaning of the '<em>All Used Message Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Used Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedStructuredResourceInstance_AllUsedMessageTypes()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let discretePortInstance : Set(muml::instance::DiscretePortInstance) = self.allocatedAtomicComponentInstances.portInstances->select(p | p.oclIsKindOf(muml::instance::DiscretePortInstance)).oclAsType(muml::instance::DiscretePortInstance)->asOrderedSet() in\ndiscretePortInstance.receiverMessageTypes->asOrderedSet()->union(discretePortInstance.senderMessageTypes->asOrderedSet())->asOrderedSet()'"
	 * @generated
	 */
	EList<MessageType> getAllUsedMessageTypes();

} // RefinedStructuredResourceInstance

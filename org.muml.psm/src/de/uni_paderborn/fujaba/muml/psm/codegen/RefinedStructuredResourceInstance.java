/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;
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
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}</li>
 * </ul>
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

} // RefinedStructuredResourceInstance

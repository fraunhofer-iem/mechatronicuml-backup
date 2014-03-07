/**
 */
package de.uni_paderbor.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinded Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderbor.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderbor.fujaba.muml.psm.codegen.CodegenPackage#getRefindedStructuredResourceInstance()
 * @model
 * @generated
 */
public interface RefindedStructuredResourceInstance extends StructuredResourceInstance {
	/**
	 * Returns the value of the '<em><b>Allocated Atomic Component Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderbor.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Atomic Component Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Atomic Component Instances</em>' reference list.
	 * @see de.uni_paderbor.fujaba.muml.psm.codegen.CodegenPackage#getRefindedStructuredResourceInstance_AllocatedAtomicComponentInstances()
	 * @model
	 * @generated
	 */
	EList<RefinedAtomicComponentInstance> getAllocatedAtomicComponentInstances();

} // RefindedStructuredResourceInstance

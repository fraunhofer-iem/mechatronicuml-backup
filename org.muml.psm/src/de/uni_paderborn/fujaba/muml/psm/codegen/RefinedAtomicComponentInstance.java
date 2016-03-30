/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import org.muml.pim.instance.AtomicComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refined Atomic Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an AtomicComponentInstance on PSM level, which references the ECU to which is allocated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedAtomicComponentInstance()
 * @model
 * @generated
 */
public interface RefinedAtomicComponentInstance extends AtomicComponentInstance, GenComponentInstance {
	/**
	 * Returns the value of the '<em><b>Allocated Resource Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredComponentInstance to which this AtomicComponentInstance is allocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated Resource Instance</em>' reference.
	 * @see #setAllocatedResourceInstance(RefinedStructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedAtomicComponentInstance_AllocatedResourceInstance()
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance#getAllocatedAtomicComponentInstances
	 * @model opposite="allocatedAtomicComponentInstances" required="true"
	 * @generated
	 */
	RefinedStructuredResourceInstance getAllocatedResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Resource Instance</em>' reference.
	 * @see #getAllocatedResourceInstance()
	 * @generated
	 */
	void setAllocatedResourceInstance(RefinedStructuredResourceInstance value);

} // RefinedAtomicComponentInstance

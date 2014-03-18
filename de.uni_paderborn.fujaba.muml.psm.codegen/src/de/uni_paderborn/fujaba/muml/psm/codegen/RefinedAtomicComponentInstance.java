/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refined Atomic Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedAtomicComponentInstance()
 * @model
 * @generated
 */
public interface RefinedAtomicComponentInstance extends AtomicComponentInstance {
	/**
	 * Returns the value of the '<em><b>Allocated Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Resource Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Resource Instance</em>' reference.
	 * @see #setAllocatedResourceInstance(RefindedStructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getRefinedAtomicComponentInstance_AllocatedResourceInstance()
	 * @model required="true"
	 * @generated
	 */
	RefindedStructuredResourceInstance getAllocatedResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Resource Instance</em>' reference.
	 * @see #getAllocatedResourceInstance()
	 * @generated
	 */
	void setAllocatedResourceInstance(RefindedStructuredResourceInstance value);

} // RefinedAtomicComponentInstance

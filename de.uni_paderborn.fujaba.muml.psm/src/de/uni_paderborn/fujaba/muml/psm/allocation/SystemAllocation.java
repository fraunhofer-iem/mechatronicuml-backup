/**
 */
package de.uni_paderborn.fujaba.muml.psm.allocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation#getAllocations <em>Allocations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getSystemAllocation()
 * @model
 * @generated
 */
public interface SystemAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.allocation.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getSystemAllocation_Allocations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Allocation> getAllocations();

} // SystemAllocation

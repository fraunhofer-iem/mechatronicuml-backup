/**
 */
package de.uni_paderborn.fujaba.muml.psm.allocation;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an allocation of a Component Instance Configuration to a Hardware Platform Instance Configuration.
 * <!-- end-model-doc -->
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
public interface SystemAllocation extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.allocation.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The different allocations that have been defined for this System Allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getSystemAllocation_Allocations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Allocation> getAllocations();

} // SystemAllocation

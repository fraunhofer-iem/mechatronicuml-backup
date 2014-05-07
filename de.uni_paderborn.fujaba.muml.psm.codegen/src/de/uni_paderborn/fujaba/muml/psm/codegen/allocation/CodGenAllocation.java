/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.allocation;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cod Gen Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.allocation.CodGenAllocation#getAllResourceInstances <em>All Resource Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.allocation.CodGenAllocation#getCic <em>Cic</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.allocation.AllocationPackage#getCodGenAllocation()
 * @model
 * @generated
 */
public interface CodGenAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>All Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.codegen.allocation.RefindedStructuredResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Resource Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Resource Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.allocation.AllocationPackage#getCodGenAllocation_AllResourceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefindedStructuredResourceInstance> getAllResourceInstances();

	/**
	 * Returns the value of the '<em><b>Cic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cic</em>' containment reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.allocation.AllocationPackage#getCodGenAllocation_Cic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.allocation.CodGenAllocation#getCic <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' containment reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstanceConfiguration value);

} // CodGenAllocation

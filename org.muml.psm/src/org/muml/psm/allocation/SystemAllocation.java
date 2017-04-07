/**
 */
package org.muml.psm.allocation;

import org.eclipse.emf.common.util.EList;
import org.muml.core.ExtendableElement;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.SystemAllocation#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.muml.psm.allocation.SystemAllocation#getCic <em>Cic</em>}</li>
 *   <li>{@link org.muml.psm.allocation.SystemAllocation#getHpic <em>Hpic</em>}</li>
 *   <li>{@link org.muml.psm.allocation.SystemAllocation#getAssemblyConnectorInstanceAllocations <em>Assembly Connector Instance Allocations</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.AllocationPackage#getSystemAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllComponentInstancesAllocated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AllComponentInstancesAllocated='-- All component instances must be allocated\nlet componentInstances : Bag(pim::instance::ComponentInstance)\n=\nself.cic->asSet()->union(\n\t-- XXX: is the union really needed (pivot ocl)?\n\tself.cic->closure(\n\t\tcomponentInstances->select(\n\t\t\toclIsKindOf(pim::instance::StructuredComponentInstance)\n\t\t)->collect(\n\t\t\toclAsType(pim::instance::StructuredComponentInstance).embeddedCIC\n\t\t)\n\t)->asSet()\n)->collect(\n\tcomponentInstances\n)->asBag()\nin\ncomponentInstances = self.allocations->collect(componentInstance)->asBag()'"
 * @generated
 */
public interface SystemAllocation extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.Allocation}.
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
	 * @see org.muml.psm.allocation.AllocationPackage#getSystemAllocation_Allocations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Allocation> getAllocations();

	/**
	 * Returns the value of the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The allocated ComponentInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cic</em>' reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see org.muml.psm.allocation.AllocationPackage#getSystemAllocation_Cic()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.SystemAllocation#getCic <em>Cic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Hpic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The allocated HardwarePlatformInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hpic</em>' reference.
	 * @see #setHpic(HWPlatformInstanceConfiguration)
	 * @see org.muml.psm.allocation.AllocationPackage#getSystemAllocation_Hpic()
	 * @model required="true"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHpic();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.SystemAllocation#getHpic <em>Hpic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hpic</em>' reference.
	 * @see #getHpic()
	 * @generated
	 */
	void setHpic(HWPlatformInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Assembly Connector Instance Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assembly connector instance allocations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Connector Instance Allocations</em>' containment reference list.
	 * @see org.muml.psm.allocation.AllocationPackage#getSystemAllocation_AssemblyConnectorInstanceAllocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyConnectorInstanceAllocation> getAssemblyConnectorInstanceAllocations();

} // SystemAllocation

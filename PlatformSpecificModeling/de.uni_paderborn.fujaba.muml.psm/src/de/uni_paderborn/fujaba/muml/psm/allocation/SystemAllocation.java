/**
 */
package de.uni_paderborn.fujaba.muml.psm.allocation;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
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
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation#getCic <em>Cic</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation#getHpic <em>Hpic</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getSystemAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllComponentInstancesAllocated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AllComponentInstancesAllocated='-- All component instances must be allocated\r\nlet cics : Set(muml::instance::ComponentInstanceConfiguration) = self.cic->asOrderedSet()->union(self.cic->closure(c | c.componentInstances->select(oclIsKindOf(muml::instance::StructuredComponentInstance)).oclAsType(muml::instance::StructuredComponentInstance).embeddedCIC))->asOrderedSet() in\r\ncics.componentInstances->includesAll(self.allocations.componentInstance)'"
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

	/**
	 * Returns the value of the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The allocated ComponentInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cic</em>' reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getSystemAllocation_Cic()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation#getCic <em>Cic</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getSystemAllocation_Hpic()
	 * @model required="true"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHpic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation#getHpic <em>Hpic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hpic</em>' reference.
	 * @see #getHpic()
	 * @generated
	 */
	void setHpic(HWPlatformInstanceConfiguration value);

} // SystemAllocation

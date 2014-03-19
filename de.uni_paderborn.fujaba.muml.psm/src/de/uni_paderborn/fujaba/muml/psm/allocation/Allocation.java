/**
 */
package de.uni_paderborn.fujaba.muml.psm.allocation;

import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.allocation.Allocation#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.allocation.Allocation#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getAllocation_ComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.allocation.Allocation#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Instance</em>' reference.
	 * @see #setResourceInstance(StructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage#getAllocation_ResourceInstance()
	 * @model required="true"
	 * @generated
	 */
	StructuredResourceInstance getResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.allocation.Allocation#getResourceInstance <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance</em>' reference.
	 * @see #getResourceInstance()
	 * @generated
	 */
	void setResourceInstance(StructuredResourceInstance value);

} // Allocation

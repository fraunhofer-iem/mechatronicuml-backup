/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.component.AtomicComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfigurable Atomic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfigurable atomic component may change its internal structure at run-time. 
 * Therefore, it may instantiate or remove port instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableAtomicComponent#getExecutionEntries <em>Execution Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableAtomicComponent#getManagementEntries <em>Management Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableAtomicComponent#getHybridPortMappings <em>Hybrid Port Mappings</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableAtomicComponent()
 * @model
 * @generated
 */
public interface ReconfigurableAtomicComponent extends AtomicComponent, ReconfigurableComponent {

	/**
	 * Returns the value of the '<em><b>Execution Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableAtomicComponent_ExecutionEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationExecutionSpecificationEntry> getExecutionEntries();

	/**
	 * Returns the value of the '<em><b>Management Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationManagementSpecificationEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableAtomicComponent_ManagementEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationManagementSpecificationEntry> getManagementEntries();

	/**
	 * Returns the value of the '<em><b>Hybrid Port Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.HybridPortMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid Port Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid Port Mappings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableAtomicComponent_HybridPortMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<HybridPortMapping> getHybridPortMappings();
} // ReconfigurableAtomicComponent

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutor()
 * @model
 * @generated
 */
public interface Executor extends ReconfigurationController {

	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutor_SpecificationEntries()
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getExecutor
	 * @model opposite="executor" containment="true"
	 * @generated
	 */
	EList<ExecutorSpecificationEntry> getSpecificationEntries();
} // Executor

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
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends ReconfigurationController {

	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManager_SpecificationEntries()
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<ManagerSpecificationEntry> getSpecificationEntries();
} // Manager

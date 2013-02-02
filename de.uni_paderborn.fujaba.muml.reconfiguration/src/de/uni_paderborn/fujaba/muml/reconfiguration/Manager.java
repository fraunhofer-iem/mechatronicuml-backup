/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends CommentableElement {

	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_SpecificationEntries()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<ManagerSpecificationEntry> getSpecificationEntries();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Controller</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller</em>' container reference.
	 * @see #setReconfigurationController(RuleBasedReconfigurationController)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_ReconfigurationController()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager
	 * @model opposite="manager" required="true" transient="false"
	 * @generated
	 */
	RuleBasedReconfigurationController getReconfigurationController();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Controller</em>' container reference.
	 * @see #getReconfigurationController()
	 * @generated
	 */
	void setReconfigurationController(RuleBasedReconfigurationController value);
} // Manager

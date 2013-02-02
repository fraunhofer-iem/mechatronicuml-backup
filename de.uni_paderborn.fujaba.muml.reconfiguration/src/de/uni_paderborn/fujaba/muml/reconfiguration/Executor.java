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
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutor()
 * @model
 * @generated
 */
public interface Executor extends CommentableElement {

	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutor_SpecificationEntries()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor
	 * @model opposite="executor" containment="true" required="true"
	 * @generated
	 */
	EList<ExecutorSpecificationEntry> getSpecificationEntries();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Controller</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller</em>' container reference.
	 * @see #setReconfigurationController(RuleBasedReconfigurationController)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutor_ReconfigurationController()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor
	 * @model opposite="executor" required="true" transient="false"
	 * @generated
	 */
	RuleBasedReconfigurationController getReconfigurationController();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Controller</em>' container reference.
	 * @see #getReconfigurationController()
	 * @generated
	 */
	void setReconfigurationController(RuleBasedReconfigurationController value);
} // Executor

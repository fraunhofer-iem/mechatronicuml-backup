/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Executor is responsible for executing reconfigurations in a reconfigurable 
 * component. It is part of a RuleBasedReconfigurationController and defines a 
 * set of ReconfigurationRules that it can execute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationExecutionPorts <em>Reconfiguration Execution Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutor()
 * @model
 * @generated
 */
public interface Executor extends CommentableElement, BehavioralElement {

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
	 * <!-- begin-model-doc -->
	 * These are the specification entries that form the declarative specification of
	 * the executor. Each of the entries defines a reconfiguration rule that the executor
	 * can execute on the component.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * The reconfiguration controller that contains this executor.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of the executor. At present, the executor has one port implementing
	 * the reconfiguration execution port of the parent, one multi-port for sending 
	 * messages to the children, and one port for interacting with the manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutor_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Execution Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Execution Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derives the set of reconfiguration execution ports from the ports reference. 
	 * This reference will return the port connected to the parent and the multi-port
	 * that sends reconfiguration messages to the embedded components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Execution Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutor_ReconfigurationExecutionPorts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='(self.ports -> select(p | p.oclIsTypeOf(ReconfigurationExecutionPort))).oclAsType(ReconfigurationExecutionPort)'"
	 * @generated
	 */
	EList<ReconfigurationExecutionPort> getReconfigurationExecutionPorts();
} // Executor

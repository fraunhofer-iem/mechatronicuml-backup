/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration;

import org.muml.core.ExtendableElement;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExecutorSpecificationEntry defines a ReconfigurationRule and an ID for the
 * reconfiguration rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getWcet <em>Wcet</em>}</li>
 *   <li>{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueIDofSpecificationEntryInExecutor='-- The ID of an ExecutorSpecificationEntry must be unique inside the executor\'s specification.\r\nself.executor.specificationEntries -> select(entry : ExecutorSpecificationEntry | entry.id = self.id) -> size() = 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueIDofSpecificationEntryInExecutor'"
 * @generated
 */
public interface ExecutorSpecificationEntry extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executor that contains this specification entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor</em>' container reference.
	 * @see #setExecutor(Executor)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_Executor()
	 * @see org.muml.reconfiguration.Executor#getSpecificationEntries
	 * @model opposite="specificationEntries" required="true" transient="false"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' container reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reconfiguration rule specified by this entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #setReconfigurationRule(ReconfigurationRule)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_ReconfigurationRule()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationRule getReconfigurationRule();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	void setReconfigurationRule(ReconfigurationRule value);

	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worst-case execution time of the reconfiguration rule that is associated
	 * to this specification entry. The worst-case 
	 * execution time defines an upper bound on how long the execution of this
	 * reconfiguration rule may take.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wcet</em>' containment reference.
	 * @see #setWcet(TimeValue)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_Wcet()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getWcet();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getWcet <em>Wcet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' containment reference.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID of this entry. In one executor specification, the IDs of the entries must
	 * be uniquely identifying. Specification entries of different executors, however, 
	 * may use the same IDs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_Id()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // ExecutorSpecificationEntry

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPort()
 * @model
 * @generated
 */
public interface ReconfigurationExecutionPort extends ReconfigurationPort {
	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationExecutionPort_SpecificationEntries()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='((((self.component.oclAsType(ReconfigurableStructuredComponent)).controllers -> select(m | m.oclIsKindOf(Executor))) -> any(true)).oclAsType(Executor)).specificationEntries -> select(externallyVisible)'"
	 * @generated
	 */
	ExecutorSpecificationEntry getSpecificationEntries();

} // ReconfigurationExecutionPort

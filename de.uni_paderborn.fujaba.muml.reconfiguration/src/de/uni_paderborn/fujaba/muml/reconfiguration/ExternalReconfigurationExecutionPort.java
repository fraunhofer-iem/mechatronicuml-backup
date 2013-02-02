/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reconfiguration Execution Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExternalReconfigurationExecutionPort#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExternalReconfigurationExecutionPort()
 * @model
 * @generated
 */
public interface ExternalReconfigurationExecutionPort extends ReconfigurationExecutionPort {
	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExternalReconfigurationExecutionPort_SpecificationEntries()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='((((self.component.oclAsType(ReconfigurableStructuredComponent)).controllers -> select(m | m.oclIsKindOf(RuleBasedReconfigurationController))) -> any(true)).oclAsType(RuleBasedReconfigurationController)).executor.specificationEntries -> select(externallyVisible)'"
	 * @generated
	 */
	EList<ExecutorSpecificationEntry> getSpecificationEntries();

} // ExternalReconfigurationExecutionPort

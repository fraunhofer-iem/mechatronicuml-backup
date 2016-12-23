/**
 */
package org.muml.reconfiguration.reconfInstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage
 * @generated
 */
public interface ReconfInstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReconfInstanceFactory eINSTANCE = org.muml.reconfiguration.reconfInstance.impl.ReconfInstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reconfiguration Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Port Instance</em>'.
	 * @generated
	 */
	ReconfigurationPortInstance createReconfigurationPortInstance();

	/**
	 * Returns a new object of class '<em>Reconfiguration Message Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Message Port Instance</em>'.
	 * @generated
	 */
	ReconfigurationMessagePortInstance createReconfigurationMessagePortInstance();

	/**
	 * Returns a new object of class '<em>Reconfiguration Execution Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Execution Port Instance</em>'.
	 * @generated
	 */
	ReconfigurationExecutionPortInstance createReconfigurationExecutionPortInstance();

	/**
	 * Returns a new object of class '<em>Internal Reconfiguration Communication Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reconfiguration Communication Port Instance</em>'.
	 * @generated
	 */
	InternalReconfigurationCommunicationPortInstance createInternalReconfigurationCommunicationPortInstance();

	/**
	 * Returns a new object of class '<em>Rule Based Reconfiguration Controller Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Based Reconfiguration Controller Instance</em>'.
	 * @generated
	 */
	RuleBasedReconfigurationControllerInstance createRuleBasedReconfigurationControllerInstance();

	/**
	 * Returns a new object of class '<em>Manager Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager Instance</em>'.
	 * @generated
	 */
	ManagerInstance createManagerInstance();

	/**
	 * Returns a new object of class '<em>Executor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executor Instance</em>'.
	 * @generated
	 */
	ExecutorInstance createExecutorInstance();

	/**
	 * Returns a new object of class '<em>Reconfigurable Atomic Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfigurable Atomic Component Instance</em>'.
	 * @generated
	 */
	ReconfigurableAtomicComponentInstance createReconfigurableAtomicComponentInstance();

	/**
	 * Returns a new object of class '<em>Reconfigurable Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfigurable Structured Component Instance</em>'.
	 * @generated
	 */
	ReconfigurableStructuredComponentInstance createReconfigurableStructuredComponentInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReconfInstancePackage getReconfInstancePackage();

} //ReconfInstanceFactory

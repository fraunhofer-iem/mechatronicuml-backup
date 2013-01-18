/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage
 * @generated
 */
public interface ReconfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReconfigurationFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reconfigurable Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfigurable Structured Component</em>'.
	 * @generated
	 */
	ReconfigurableStructuredComponent createReconfigurableStructuredComponent();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns a new object of class '<em>Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executor</em>'.
	 * @generated
	 */
	Executor createExecutor();

	/**
	 * Returns a new object of class '<em>Part Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Data Type</em>'.
	 * @generated
	 */
	PartDataType createPartDataType();

	/**
	 * Returns a new object of class '<em>Port Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Data Type</em>'.
	 * @generated
	 */
	PortDataType createPortDataType();

	/**
	 * Returns a new object of class '<em>Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Port</em>'.
	 * @generated
	 */
	ReconfigurationMessagePort createReconfigurationMessagePort();

	/**
	 * Returns a new object of class '<em>Executor Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executor Specification Entry</em>'.
	 * @generated
	 */
	ExecutorSpecificationEntry createExecutorSpecificationEntry();

	/**
	 * Returns a new object of class '<em>Manager Specification Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager Specification Entry</em>'.
	 * @generated
	 */
	ManagerSpecificationEntry createManagerSpecificationEntry();

	/**
	 * Returns a new object of class '<em>Rule Based Reconfiguration Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Based Reconfiguration Controller</em>'.
	 * @generated
	 */
	RuleBasedReconfigurationController createRuleBasedReconfigurationController();

	/**
	 * Returns a new object of class '<em>External Reconfiguration Execution Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reconfiguration Execution Port</em>'.
	 * @generated
	 */
	ExternalReconfigurationExecutionPort createExternalReconfigurationExecutionPort();

	/**
	 * Returns a new object of class '<em>Internal Reconfiguration Execution Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reconfiguration Execution Port</em>'.
	 * @generated
	 */
	InternalReconfigurationExecutionPort createInternalReconfigurationExecutionPort();

	/**
	 * Returns a new object of class '<em>Rule Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Call Expression</em>'.
	 * @generated
	 */
	ReconfigurationRuleCallExpression createReconfigurationRuleCallExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReconfigurationPackage getReconfigurationPackage();

} //ReconfigurationFactory

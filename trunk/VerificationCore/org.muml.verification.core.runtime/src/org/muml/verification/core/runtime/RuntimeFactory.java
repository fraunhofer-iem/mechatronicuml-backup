/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.verification.core.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = org.muml.verification.core.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	RuntimeComponentInstance createRuntimeComponentInstance();

	/**
	 * Returns a new object of class '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Buffer</em>'.
	 * @generated
	 */
	RuntimeMessageBuffer createRuntimeMessageBuffer();

	/**
	 * Returns a new object of class '<em>Realtime Statechart Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realtime Statechart Instance</em>'.
	 * @generated
	 */
	RealtimeStatechartInstance createRealtimeStatechartInstance();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	RuntimeMessage createRuntimeMessage();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	RuntimeParameter createRuntimeParameter();

	/**
	 * Returns a new object of class '<em>Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Binding</em>'.
	 * @generated
	 */
	VariableBinding createVariableBinding();

	/**
	 * Returns a new object of class '<em>Single Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Role Instance</em>'.
	 * @generated
	 */
	SingleRoleInstance createSingleRoleInstance();

	/**
	 * Returns a new object of class '<em>Multi Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Role Instance</em>'.
	 * @generated
	 */
	MultiRoleInstance createMultiRoleInstance();

	/**
	 * Returns a new object of class '<em>Role Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connector Instance</em>'.
	 * @generated
	 */
	RuntimeRoleConnectorInstance createRuntimeRoleConnectorInstance();

	/**
	 * Returns a new object of class '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Connector Instance</em>'.
	 * @generated
	 */
	RuntimeAssemblyConnectorInstance createRuntimeAssemblyConnectorInstance();

	/**
	 * Returns a new object of class '<em>Message On Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message On Connector</em>'.
	 * @generated
	 */
	MessageOnConnector createMessageOnConnector();

	/**
	 * Returns a new object of class '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Single Port Instance</em>'.
	 * @generated
	 */
	RuntimeDiscreteSinglePortInstance createRuntimeDiscreteSinglePortInstance();

	/**
	 * Returns a new object of class '<em>Discrete Multi Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Multi Port Instance</em>'.
	 * @generated
	 */
	RuntimeDiscreteMultiPortInstance createRuntimeDiscreteMultiPortInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory

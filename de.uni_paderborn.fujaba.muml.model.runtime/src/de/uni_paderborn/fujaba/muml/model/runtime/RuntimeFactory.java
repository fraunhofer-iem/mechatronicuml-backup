/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	RuntimeComponentInstance createRuntimeComponentInstance();

	/**
	 * Returns a new object of class '<em>Discrete Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Port Instance</em>'.
	 * @generated
	 */
	RuntimeDiscretePortInstance createRuntimeDiscretePortInstance();

	/**
	 * Returns a new object of class '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Buffer</em>'.
	 * @generated
	 */
	MessageBuffer createMessageBuffer();

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
	 * Returns a new object of class '<em>Role Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Assembly</em>'.
	 * @generated
	 */
	RuntimeRoleAssembly createRuntimeRoleAssembly();

	/**
	 * Returns a new object of class '<em>Port Instance Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance Assembly</em>'.
	 * @generated
	 */
	RuntimePortInstanceAssembly createRuntimePortInstanceAssembly();

	/**
	 * Returns a new object of class '<em>Message On Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message On Assembly</em>'.
	 * @generated
	 */
	MessageOnAssembly createMessageOnAssembly();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstanceFactory eINSTANCE = org.muml.pim.instance.impl.InstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assembly Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Connector Instance</em>'.
	 * @generated
	 */
	AssemblyConnectorInstance createAssemblyConnectorInstance();

	/**
	 * Returns a new object of class '<em>Delegation Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Connector Instance</em>'.
	 * @generated
	 */
	DelegationConnectorInstance createDelegationConnectorInstance();

	/**
	 * Returns a new object of class '<em>Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Configuration</em>'.
	 * @generated
	 */
	ComponentInstanceConfiguration createComponentInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>Continuous Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Port Instance</em>'.
	 * @generated
	 */
	ContinuousPortInstance createContinuousPortInstance();

	/**
	 * Returns a new object of class '<em>Hybrid Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Port Instance</em>'.
	 * @generated
	 */
	HybridPortInstance createHybridPortInstance();

	/**
	 * Returns a new object of class '<em>Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Single Port Instance</em>'.
	 * @generated
	 */
	DiscreteSinglePortInstance createDiscreteSinglePortInstance();

	/**
	 * Returns a new object of class '<em>Discrete Multi Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Multi Port Instance</em>'.
	 * @generated
	 */
	DiscreteMultiPortInstance createDiscreteMultiPortInstance();

	/**
	 * Returns a new object of class '<em>Coordination Protocol Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Protocol Instance</em>'.
	 * @generated
	 */
	CoordinationProtocolInstance createCoordinationProtocolInstance();

	/**
	 * Returns a new object of class '<em>Structured Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Component Instance</em>'.
	 * @generated
	 */
	StructuredComponentInstance createStructuredComponentInstance();

	/**
	 * Returns a new object of class '<em>Atomic Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Component Instance</em>'.
	 * @generated
	 */
	AtomicComponentInstance createAtomicComponentInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancePackage getInstancePackage();

} //InstanceFactory

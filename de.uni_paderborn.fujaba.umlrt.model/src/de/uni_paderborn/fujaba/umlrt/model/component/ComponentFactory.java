/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage
 * @generated
 */
public interface ComponentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.component.impl.ComponentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Continuous Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Component</em>'.
	 * @generated
	 */
	ContinuousComponent createContinuousComponent();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Continuous Port Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Port Specification</em>'.
	 * @generated
	 */
	ContinuousPortSpecification createContinuousPortSpecification();

	/**
	 * Returns a new object of class '<em>Discrete Port Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Port Specification</em>'.
	 * @generated
	 */
	DiscretePortSpecification createDiscretePortSpecification();

	/**
	 * Returns a new object of class '<em>Hardware Port Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port Specification</em>'.
	 * @generated
	 */
	HardwarePortSpecification createHardwarePortSpecification();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	ComponentPart createComponentPart();

	/**
	 * Returns a new object of class '<em>Structured Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Component</em>'.
	 * @generated
	 */
	StructuredComponent createStructuredComponent();

	/**
	 * Returns a new object of class '<em>Atomic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Component</em>'.
	 * @generated
	 */
	AtomicComponent createAtomicComponent();

	/**
	 * Returns a new object of class '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly</em>'.
	 * @generated
	 */
	Assembly createAssembly();

	/**
	 * Returns a new object of class '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation</em>'.
	 * @generated
	 */
	Delegation createDelegation();

	/**
	 * Returns a new object of class '<em>Behavioral Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavioral Connector</em>'.
	 * @generated
	 */
	BehavioralConnector createBehavioralConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentPackage getComponentPackage();

} //ComponentFactory

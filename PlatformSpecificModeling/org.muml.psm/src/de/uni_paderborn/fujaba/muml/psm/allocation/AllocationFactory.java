/**
 */
package de.uni_paderborn.fujaba.muml.psm.allocation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage
 * @generated
 */
public interface AllocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationFactory eINSTANCE = de.uni_paderborn.fujaba.muml.psm.allocation.impl.AllocationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Allocation</em>'.
	 * @generated
	 */
	SystemAllocation createSystemAllocation();

	/**
	 * Returns a new object of class '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation</em>'.
	 * @generated
	 */
	Allocation createAllocation();

	/**
	 * Returns a new object of class '<em>Assembly Connector Instance Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Connector Instance Allocation</em>'.
	 * @generated
	 */
	AssemblyConnectorInstanceAllocation createAssemblyConnectorInstanceAllocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AllocationPackage getAllocationPackage();

} //AllocationFactory

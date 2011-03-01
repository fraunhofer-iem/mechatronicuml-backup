/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage
 * @generated
 */
public interface ReconfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReconfFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assembly Reconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Reconf</em>'.
	 * @generated
	 */
	AssemblyReconf createAssemblyReconf();

	/**
	 * Returns a new object of class '<em>Component Instance Reconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Reconf</em>'.
	 * @generated
	 */
	ComponentInstanceReconf createComponentInstanceReconf();

	/**
	 * Returns a new object of class '<em>Delegation Reconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Reconf</em>'.
	 * @generated
	 */
	DelegationReconf createDelegationReconf();

	/**
	 * Returns a new object of class '<em>Port Instance Reconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance Reconf</em>'.
	 * @generated
	 */
	PortInstanceReconf createPortInstanceReconf();

	/**
	 * Returns a new object of class '<em>Port Reconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Reconf</em>'.
	 * @generated
	 */
	PortReconf createPortReconf();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	ReconfDiagram createReconfDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReconfPackage getReconfPackage();

} //ReconfFactory

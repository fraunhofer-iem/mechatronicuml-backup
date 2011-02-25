/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.componentInstanceConfigurationPackage
 * @generated
 */
public interface componentInstanceConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	componentInstanceConfigurationFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.impl.componentInstanceConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Configuration</em>'.
	 * @generated
	 */
	ComponentInstanceConfiguration createComponentInstanceConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	componentInstanceConfigurationPackage getcomponentInstanceConfigurationPackage();

} //componentInstanceConfigurationFactory

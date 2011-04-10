/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentinstanceconfigurationPackage
 * @generated
 */
public interface ComponentinstanceconfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentinstanceconfigurationFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentinstanceconfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance Configuration Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Configuration Diagram</em>'.
	 * @generated
	 */
	ComponentInstanceConfigurationDiagram createComponentInstanceConfigurationDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentinstanceconfigurationPackage getComponentinstanceconfigurationPackage();

} //ComponentinstanceconfigurationFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage
 * @generated
 */
public interface MessageinterfaceeditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageinterfaceeditorFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.impl.MessageinterfaceeditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Message Interface Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Interface Diagram</em>'.
	 * @generated
	 */
	MessageInterfaceDiagram createMessageInterfaceDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MessageinterfaceeditorPackage getMessageinterfaceeditorPackage();

} //MessageinterfaceeditorFactory

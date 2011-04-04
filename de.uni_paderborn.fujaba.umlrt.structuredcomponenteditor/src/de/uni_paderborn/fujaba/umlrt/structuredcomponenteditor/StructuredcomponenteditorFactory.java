/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorPackage
 * @generated
 */
public interface StructuredcomponenteditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredcomponenteditorFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.impl.StructuredcomponenteditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Structured Component Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Component Diagram</em>'.
	 * @generated
	 */
	StructuredComponentDiagram createStructuredComponentDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructuredcomponenteditorPackage getStructuredcomponenteditorPackage();

} //StructuredcomponenteditorFactory

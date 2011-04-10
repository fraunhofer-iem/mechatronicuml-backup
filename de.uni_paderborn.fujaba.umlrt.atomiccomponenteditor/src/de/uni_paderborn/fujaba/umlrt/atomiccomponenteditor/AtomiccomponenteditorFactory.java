/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorPackage
 * @generated
 */
public interface AtomiccomponenteditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomiccomponenteditorFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomiccomponenteditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic Component Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Component Diagram</em>'.
	 * @generated
	 */
	AtomicComponentDiagram createAtomicComponentDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtomiccomponenteditorPackage getAtomiccomponenteditorPackage();

} //AtomiccomponenteditorFactory

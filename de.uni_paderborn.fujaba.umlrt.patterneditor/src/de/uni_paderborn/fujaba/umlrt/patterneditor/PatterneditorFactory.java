/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.patterneditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage
 * @generated
 */
public interface PatterneditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatterneditorFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.patterneditor.impl.PatterneditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Diagram</em>'.
	 * @generated
	 */
	PatternDiagram createPatternDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatterneditorPackage getPatterneditorPackage();

} //PatterneditorFactory

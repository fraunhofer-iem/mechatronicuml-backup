/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package structuredcomponenteditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structuredcomponenteditor.ComponenteditorPackage
 * @generated
 */
public interface ComponenteditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponenteditorFactory eINSTANCE = structuredcomponenteditor.impl.ComponenteditorFactoryImpl.init();

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
	ComponenteditorPackage getComponenteditorPackage();

} //ComponenteditorFactory

/**
 */
package org.muml.graphviz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.graphviz.GraphvizPackage
 * @generated
 */
public interface GraphvizFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphvizFactory eINSTANCE = org.muml.graphviz.impl.GraphvizFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy Class For Acceleo Will Be Deleted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy Class For Acceleo Will Be Deleted</em>'.
	 * @generated
	 */
	DummyClassForAcceleoWillBeDeleted createDummyClassForAcceleoWillBeDeleted();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphvizPackage getGraphvizPackage();

} //GraphvizFactory

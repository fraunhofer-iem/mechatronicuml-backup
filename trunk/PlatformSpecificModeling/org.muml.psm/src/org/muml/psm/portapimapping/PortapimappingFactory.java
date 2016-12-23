/**
 */
package org.muml.psm.portapimapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.portapimapping.PortapimappingPackage
 * @generated
 */
public interface PortapimappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortapimappingFactory eINSTANCE = org.muml.psm.portapimapping.impl.PortapimappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Port Api Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Api Mapping</em>'.
	 * @generated
	 */
	PortApiMapping createPortApiMapping();

	/**
	 * Returns a new object of class '<em>Mapping Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Repository</em>'.
	 * @generated
	 */
	MappingRepository createMappingRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PortapimappingPackage getPortapimappingPackage();

} //PortapimappingFactory

/**
 */
package de.uni_paderborn.fujaba.muml.psm.api.portapimapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.api.portapimapping.PortapimappingPackage
 * @generated
 */
public interface PortapimappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortapimappingFactory eINSTANCE = de.uni_paderborn.fujaba.muml.psm.api.portapimapping.impl.PortapimappingFactoryImpl.init();

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

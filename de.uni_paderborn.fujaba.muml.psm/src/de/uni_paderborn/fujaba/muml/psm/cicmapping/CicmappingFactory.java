/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage
 * @generated
 */
public interface CicmappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CicmappingFactory eINSTANCE = de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CicmappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIC System Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIC System Mapping</em>'.
	 * @generated
	 */
	CICSystemMapping createCICSystemMapping();

	/**
	 * Returns a new object of class '<em>CIC Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIC Mapping</em>'.
	 * @generated
	 */
	CICMapping createCICMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CicmappingPackage getCicmappingPackage();

} //CicmappingFactory

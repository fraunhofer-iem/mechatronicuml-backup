/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = de.uni_paderborn.fujaba.muml.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Array Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Data Type</em>'.
	 * @generated
	 */
	ArrayDataType createArrayDataType();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory

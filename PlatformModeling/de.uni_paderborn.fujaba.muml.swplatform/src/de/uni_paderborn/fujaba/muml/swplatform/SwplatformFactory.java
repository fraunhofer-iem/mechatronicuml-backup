/**
 */
package de.uni_paderborn.fujaba.muml.swplatform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage
 * @generated
 */
public interface SwplatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwplatformFactory eINSTANCE = de.uni_paderborn.fujaba.muml.swplatform.impl.SwplatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>API Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Repository</em>'.
	 * @generated
	 */
	APIRepository createAPIRepository();

	/**
	 * Returns a new object of class '<em>API Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Command</em>'.
	 * @generated
	 */
	APICommand createAPICommand();

	/**
	 * Returns a new object of class '<em>Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Value</em>'.
	 * @generated
	 */
	EnumerationValue createEnumerationValue();

	/**
	 * Returns a new object of class '<em>Enumeration Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Data Type</em>'.
	 * @generated
	 */
	EnumerationDataType createEnumerationDataType();

	/**
	 * Returns a new object of class '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Constraint</em>'.
	 * @generated
	 */
	TimeConstraint createTimeConstraint();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SwplatformPackage getSwplatformPackage();

} //SwplatformFactory

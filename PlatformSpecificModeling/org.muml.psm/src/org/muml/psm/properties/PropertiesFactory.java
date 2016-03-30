/**
 */
package org.muml.psm.properties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.properties.PropertiesPackage
 * @generated
 */
public interface PropertiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesFactory eINSTANCE = org.muml.psm.properties.impl.PropertiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WCET</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WCET</em>'.
	 * @generated
	 */
	WCET createWCET();

	/**
	 * Returns a new object of class '<em>Required Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Memory</em>'.
	 * @generated
	 */
	RequiredMemory createRequiredMemory();

	/**
	 * Returns a new object of class '<em>Scheduling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling</em>'.
	 * @generated
	 */
	Scheduling createScheduling();

	/**
	 * Returns a new object of class '<em>Message Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Frame</em>'.
	 * @generated
	 */
	MessageFrame createMessageFrame();

	/**
	 * Returns a new object of class '<em>CAN Message Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAN Message Frame</em>'.
	 * @generated
	 */
	CANMessageFrame createCANMessageFrame();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertiesPackage getPropertiesPackage();

} //PropertiesFactory

/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage
 * @generated
 */
public interface PlatforminstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatforminstanceFactory eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HW Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Instance</em>'.
	 * @generated
	 */
	HWPlatformInstance createHWPlatformInstance();

	/**
	 * Returns a new object of class '<em>HW Platform Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Instance Configuration</em>'.
	 * @generated
	 */
	HWPlatformInstanceConfiguration createHWPlatformInstanceConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatforminstancePackage getPlatforminstancePackage();

} //PlatforminstanceFactory

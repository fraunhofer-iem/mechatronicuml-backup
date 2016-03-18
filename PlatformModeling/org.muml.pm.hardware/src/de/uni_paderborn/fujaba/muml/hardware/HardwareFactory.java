/**
 */
package de.uni_paderborn.fujaba.muml.hardware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.HardwarePackage
 * @generated
 */
public interface HardwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HardwareFactory eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.impl.HardwareFactoryImpl.init();

	

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HardwarePackage getHardwarePackage();

} //HardwareFactory

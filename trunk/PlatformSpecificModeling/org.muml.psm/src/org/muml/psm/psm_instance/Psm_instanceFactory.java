/**
 */
package org.muml.psm.psm_instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.psm_instance.Psm_instancePackage
 * @generated
 */
public interface Psm_instanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Psm_instanceFactory eINSTANCE = org.muml.psm.psm_instance.impl.Psm_instanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameterisable Discrete Single Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterisable Discrete Single Port Instance</em>'.
	 * @generated
	 */
	ParameterisableDiscreteSinglePortInstance createParameterisableDiscreteSinglePortInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Psm_instancePackage getPsm_instancePackage();

} //Psm_instanceFactory

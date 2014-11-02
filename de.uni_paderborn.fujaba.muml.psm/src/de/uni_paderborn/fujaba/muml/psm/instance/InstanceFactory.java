/**
 */
package de.uni_paderborn.fujaba.muml.psm.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstanceFactory eINSTANCE = de.uni_paderborn.fujaba.muml.psm.instance.impl.InstanceFactoryImpl.init();

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
	InstancePackage getInstancePackage();

} //InstanceFactory

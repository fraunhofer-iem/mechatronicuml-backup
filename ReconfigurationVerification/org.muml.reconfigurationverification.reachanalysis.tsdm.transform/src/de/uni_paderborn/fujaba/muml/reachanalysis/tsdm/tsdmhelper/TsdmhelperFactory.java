/**
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.TsdmhelperPackage
 * @generated
 */
public interface TsdmhelperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TsdmhelperFactory eINSTANCE = de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.impl.TsdmhelperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bound Clock Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Clock Instances</em>'.
	 * @generated
	 */
	BoundClockInstances createBoundClockInstances();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TsdmhelperPackage getTsdmhelperPackage();

} //TsdmhelperFactory

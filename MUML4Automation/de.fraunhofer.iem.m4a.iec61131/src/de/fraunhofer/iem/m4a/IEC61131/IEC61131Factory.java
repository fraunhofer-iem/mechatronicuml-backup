/**
 */
package de.fraunhofer.iem.m4a.IEC61131;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131Package
 * @generated
 */
public interface IEC61131Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEC61131Factory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IEC61131</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC61131</em>'.
	 * @generated
	 */
	IEC61131 createIEC61131();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IEC61131Package getIEC61131Package();

} //IEC61131Factory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package railcab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see railcab.RailcabPackage
 * @generated
 */
public interface RailcabFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailcabFactory eINSTANCE = railcab.impl.RailcabFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rail Cab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rail Cab</em>'.
	 * @generated
	 */
	RailCab createRailCab();

	/**
	 * Returns a new object of class '<em>Section Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Control</em>'.
	 * @generated
	 */
	SectionControl createSectionControl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RailcabPackage getRailcabPackage();

} //RailcabFactory

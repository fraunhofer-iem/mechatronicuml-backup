/**
 */
package mtctl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mtctl.MtctlPackage
 * @generated
 */
public interface MtctlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtctlFactory eINSTANCE = mtctl.impl.MtctlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Repository</em>'.
	 * @generated
	 */
	PropertyRepository createPropertyRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MtctlPackage getMtctlPackage();

} //MtctlFactory

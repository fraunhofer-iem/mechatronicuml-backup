/**
 */
package gmfext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gmfext.GmfextPackage
 * @generated
 */
public interface GmfextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GmfextFactory eINSTANCE = gmfext.impl.GmfextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Muml GMF Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Muml GMF Extension</em>'.
	 * @generated
	 */
	MumlGMFExtension createMumlGMFExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GmfextPackage getGmfextPackage();

} //GmfextFactory

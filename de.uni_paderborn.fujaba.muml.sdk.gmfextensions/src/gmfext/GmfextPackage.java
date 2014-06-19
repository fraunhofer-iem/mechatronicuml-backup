/**
 */
package gmfext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gmfext.GmfextFactory
 * @model kind="package"
 * @generated
 */
public interface GmfextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gmfext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gmfext/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmfext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GmfextPackage eINSTANCE = gmfext.impl.GmfextPackageImpl.init();

	/**
	 * The meta object id for the '{@link gmfext.impl.MumlGMFExtensionImpl <em>Muml GMF Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gmfext.impl.MumlGMFExtensionImpl
	 * @see gmfext.impl.GmfextPackageImpl#getMumlGMFExtension()
	 * @generated
	 */
	int MUML_GMF_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Property Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_GMF_EXTENSION__PROPERTY_GENERATOR = 0;

	/**
	 * The number of structural features of the '<em>Muml GMF Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_GMF_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Muml GMF Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUML_GMF_EXTENSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gmfext.MumlGMFExtension <em>Muml GMF Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muml GMF Extension</em>'.
	 * @see gmfext.MumlGMFExtension
	 * @generated
	 */
	EClass getMumlGMFExtension();

	/**
	 * Returns the meta object for the reference '{@link gmfext.MumlGMFExtension#getPropertyGenerator <em>Property Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Generator</em>'.
	 * @see gmfext.MumlGMFExtension#getPropertyGenerator()
	 * @see #getMumlGMFExtension()
	 * @generated
	 */
	EReference getMumlGMFExtension_PropertyGenerator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GmfextFactory getGmfextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gmfext.impl.MumlGMFExtensionImpl <em>Muml GMF Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gmfext.impl.MumlGMFExtensionImpl
		 * @see gmfext.impl.GmfextPackageImpl#getMumlGMFExtension()
		 * @generated
		 */
		EClass MUML_GMF_EXTENSION = eINSTANCE.getMumlGMFExtension();

		/**
		 * The meta object literal for the '<em><b>Property Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUML_GMF_EXTENSION__PROPERTY_GENERATOR = eINSTANCE.getMumlGMFExtension_PropertyGenerator();

	}

} //GmfextPackage

/**
 */
package de.uni_paderborn.fujaba.muml.psm.api;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * <!-- begin-model-doc -->
 * The software package contains the meta-model for specification a software platform. It can be used to describe the API of a concrete target platform.
 * This package itself does not contain any class. Instead it contains more subpackages for different viewpoints.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.api.ApiFactory
 * @model kind="package"
 * @generated
 */
public interface ApiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "api";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/psm/api/0.4.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "api";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApiPackage eINSTANCE = de.uni_paderborn.fujaba.muml.psm.api.impl.ApiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.api.impl.CoolClasImpl <em>Cool Clas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.api.impl.CoolClasImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.api.impl.ApiPackageImpl#getCoolClas()
	 * @generated
	 */
	int COOL_CLAS = 0;

	/**
	 * The number of structural features of the '<em>Cool Clas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOL_CLAS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cool Clas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOL_CLAS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.api.CoolClas <em>Cool Clas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cool Clas</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.api.CoolClas
	 * @generated
	 */
	EClass getCoolClas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApiFactory getApiFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.api.impl.CoolClasImpl <em>Cool Clas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.api.impl.CoolClasImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.api.impl.ApiPackageImpl#getCoolClas()
		 * @generated
		 */
		EClass COOL_CLAS = eINSTANCE.getCoolClas();

	}

} //ApiPackage

/**
 */
package org.muml.graphviz;

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
 * @see org.muml.graphviz.GraphvizFactory
 * @model kind="package"
 * @generated
 */
public interface GraphvizPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphviz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/graphviz/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphviz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphvizPackage eINSTANCE = org.muml.graphviz.impl.GraphvizPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.graphviz.impl.DummyClassForAcceleoWillBeDeletedImpl <em>Dummy Class For Acceleo Will Be Deleted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.impl.DummyClassForAcceleoWillBeDeletedImpl
	 * @see org.muml.graphviz.impl.GraphvizPackageImpl#getDummyClassForAcceleoWillBeDeleted()
	 * @generated
	 */
	int DUMMY_CLASS_FOR_ACCELEO_WILL_BE_DELETED = 0;

	/**
	 * The number of structural features of the '<em>Dummy Class For Acceleo Will Be Deleted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_FOR_ACCELEO_WILL_BE_DELETED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dummy Class For Acceleo Will Be Deleted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_FOR_ACCELEO_WILL_BE_DELETED_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.DummyClassForAcceleoWillBeDeleted <em>Dummy Class For Acceleo Will Be Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Class For Acceleo Will Be Deleted</em>'.
	 * @see org.muml.graphviz.DummyClassForAcceleoWillBeDeleted
	 * @generated
	 */
	EClass getDummyClassForAcceleoWillBeDeleted();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphvizFactory getGraphvizFactory();

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
		 * The meta object literal for the '{@link org.muml.graphviz.impl.DummyClassForAcceleoWillBeDeletedImpl <em>Dummy Class For Acceleo Will Be Deleted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.impl.DummyClassForAcceleoWillBeDeletedImpl
		 * @see org.muml.graphviz.impl.GraphvizPackageImpl#getDummyClassForAcceleoWillBeDeleted()
		 * @generated
		 */
		EClass DUMMY_CLASS_FOR_ACCELEO_WILL_BE_DELETED = eINSTANCE.getDummyClassForAcceleoWillBeDeleted();

	}

} //GraphvizPackage

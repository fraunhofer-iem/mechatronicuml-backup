/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;

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
 * this package contains all common elements of iec 61131's languages
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementImpl <em>Library Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl#getLibraryElement()
	 * @generated
	 */
	int LIBRARY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementReferenceImpl <em>Library Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl#getLibraryElementReference()
	 * @generated
	 */
	int LIBRARY_ELEMENT_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Library Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Library Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_REFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement <em>Library Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement
	 * @generated
	 */
	EClass getLibraryElement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference <em>Library Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Element Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference
	 * @generated
	 */
	EClass getLibraryElementReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementImpl <em>Library Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl#getLibraryElement()
		 * @generated
		 */
		EClass LIBRARY_ELEMENT = eINSTANCE.getLibraryElement();
		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementReferenceImpl <em>Library Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl#getLibraryElementReference()
		 * @generated
		 */
		EClass LIBRARY_ELEMENT_REFERENCE = eINSTANCE.getLibraryElementReference();

	}

} //CorePackage

/**
 */
package de.fraunhofer.iem.m4a.IEC61131;

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
 * <!-- begin-model-doc -->
 * main package for iec 61131 meta model divided in three main packages: common elements between all defined languages (core), language extensions (languages) and extensions for already compiled program fragments
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131Factory
 * @model kind="package"
 * @generated
 */
public interface IEC61131Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IEC61131";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IEC61131";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEC61131Package eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131PackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131Impl <em>IEC61131</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131Impl
	 * @see de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131PackageImpl#getIEC61131()
	 * @generated
	 */
	int IEC61131 = 0;

	/**
	 * The feature id for the '<em><b>Library Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61131__LIBRARY_DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Library References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61131__LIBRARY_REFERENCES = 1;

	/**
	 * The number of structural features of the '<em>IEC61131</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61131_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IEC61131</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61131_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.IEC61131 <em>IEC61131</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC61131</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131
	 * @generated
	 */
	EClass getIEC61131();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.IEC61131#getLibraryDeclarations <em>Library Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131#getLibraryDeclarations()
	 * @see #getIEC61131()
	 * @generated
	 */
	EReference getIEC61131_LibraryDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.IEC61131#getLibraryReferences <em>Library References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library References</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131#getLibraryReferences()
	 * @see #getIEC61131()
	 * @generated
	 */
	EReference getIEC61131_LibraryReferences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IEC61131Factory getIEC61131Factory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131Impl <em>IEC61131</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131Impl
		 * @see de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131PackageImpl#getIEC61131()
		 * @generated
		 */
		EClass IEC61131 = eINSTANCE.getIEC61131();

		/**
		 * The meta object literal for the '<em><b>Library Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC61131__LIBRARY_DECLARATIONS = eINSTANCE.getIEC61131_LibraryDeclarations();

		/**
		 * The meta object literal for the '<em><b>Library References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC61131__LIBRARY_REFERENCES = eINSTANCE.getIEC61131_LibraryReferences();

	}

} //IEC61131Package

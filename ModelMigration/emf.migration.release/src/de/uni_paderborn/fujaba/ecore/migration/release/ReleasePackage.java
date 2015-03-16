/**
 */
package de.uni_paderborn.fujaba.ecore.migration.release;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see de.uni_paderborn.fujaba.ecore.migration.release.ReleaseFactory
 * @model kind="package"
 * @generated
 */
public interface ReleasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "release";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://migration/release/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "release";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReleasePackage eINSTANCE = de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseSetImpl
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleasePackageImpl#getReleaseSet()
	 * @generated
	 */
	int RELEASE_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SET__RELEASES = 1;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseImpl
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleasePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Release Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RELEASE_SET = 1;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.ecore.migration.release.ReleaseSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.ReleaseSet
	 * @generated
	 */
	EClass getReleaseSet();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.ecore.migration.release.ReleaseSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.ReleaseSet#getName()
	 * @see #getReleaseSet()
	 * @generated
	 */
	EAttribute getReleaseSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.ecore.migration.release.ReleaseSet#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.ReleaseSet#getReleases()
	 * @see #getReleaseSet()
	 * @generated
	 */
	EReference getReleaseSet_Releases();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.ecore.migration.release.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.ecore.migration.release.Release#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.Release#getName()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.ecore.migration.release.Release#getReleaseSet <em>Release Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Release Set</em>'.
	 * @see de.uni_paderborn.fujaba.ecore.migration.release.Release#getReleaseSet()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_ReleaseSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReleaseFactory getReleaseFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseSetImpl
		 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleasePackageImpl#getReleaseSet()
		 * @generated
		 */
		EClass RELEASE_SET = eINSTANCE.getReleaseSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_SET__NAME = eINSTANCE.getReleaseSet_Name();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_SET__RELEASES = eINSTANCE.getReleaseSet_Releases();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleaseImpl
		 * @see de.uni_paderborn.fujaba.ecore.migration.release.impl.ReleasePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__NAME = eINSTANCE.getRelease_Name();

		/**
		 * The meta object literal for the '<em><b>Release Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__RELEASE_SET = eINSTANCE.getRelease_ReleaseSet();

	}

} //ReleasePackage

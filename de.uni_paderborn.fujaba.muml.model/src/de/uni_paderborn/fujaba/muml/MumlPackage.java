/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package is the base package for all MechatronicUML models, editors 
 * and algorithms. Plugins contributing to MechatronicUML should use 
 * de.uni_paderborn.fujaba.muml as a base package.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.MumlFactory
 * @model kind="package"
 * @generated
 */
public interface MumlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "muml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/0.2.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "muml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MumlPackage eINSTANCE = de.uni_paderborn.fujaba.muml.impl.MumlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.impl.TestImpl
	 * @see de.uni_paderborn.fujaba.muml.impl.MumlPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see de.uni_paderborn.fujaba.muml.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MumlFactory getMumlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.impl.TestImpl
		 * @see de.uni_paderborn.fujaba.muml.impl.MumlPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

	}

} //MumlPackage

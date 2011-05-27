/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper;

import org.eclipse.emf.ecore.EDataType;
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
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.HelperFactory
 * @model kind="package"
 * @generated
 */
public interface HelperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "helper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart/helper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "helper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelperPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl.init();

	/**
	 * The meta object id for the '<em>My Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyMap()
	 * @generated
	 */
	int MY_MAP = 0;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 1;

	/**
	 * The meta object id for the '<em>Vector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Vector
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 2;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getSet()
	 * @generated
	 */
	int SET = 3;

	/**
	 * The meta object id for the '<em>Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 4;

	/**
	 * The meta object id for the '<em>My List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyList()
	 * @generated
	 */
	int MY_LIST = 5;


	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>My Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>My Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap" typeParameters="key value"
	 * @generated
	 */
	EDataType getMyMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector</em>'.
	 * @see java.util.Vector
	 * @model instanceClass="java.util.Vector"
	 * @generated
	 */
	EDataType getVector();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="UMLClock"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the meta object for data type '{@link java.util.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator"
	 * @generated
	 */
	EDataType getIterator();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>My List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>My List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="elements"
	 * @generated
	 */
	EDataType getMyList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelperFactory getHelperFactory();

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
		 * The meta object literal for the '<em>My Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyMap()
		 * @generated
		 */
		EDataType MY_MAP = eINSTANCE.getMyMap();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Vector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Vector
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getVector()
		 * @generated
		 */
		EDataType VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getIterator()
		 * @generated
		 */
		EDataType ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '<em>My List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyList()
		 * @generated
		 */
		EDataType MY_LIST = eINSTANCE.getMyList();

	}

} //HelperPackage

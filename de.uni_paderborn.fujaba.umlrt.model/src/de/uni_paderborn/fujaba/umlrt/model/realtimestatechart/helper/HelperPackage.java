/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.HelperFactory
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
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/emf/model/realtimestatechart/helper";

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
	HelperPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.StringToEClassImpl <em>String To EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.StringToEClassImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getStringToEClass()
	 * @generated
	 */
	int STRING_TO_ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ECLASS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ECLASS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ECLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ECLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>My Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyMap()
	 * @generated
	 */
	int MY_MAP = 1;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;

	/**
	 * The meta object id for the '<em>Vector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Vector
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 3;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getSet()
	 * @generated
	 */
	int SET = 4;

	/**
	 * The meta object id for the '<em>Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 5;


	/**
	 * The meta object id for the '<em>My List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyList()
	 * @generated
	 */
	int MY_LIST = 6;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To EClass</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.ecore.EClass"
	 * @generated
	 */
	EClass getStringToEClass();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToEClass()
	 * @generated
	 */
	EAttribute getStringToEClass_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToEClass()
	 * @generated
	 */
	EReference getStringToEClass_Value();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.StringToEClassImpl <em>String To EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.StringToEClassImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getStringToEClass()
		 * @generated
		 */
		EClass STRING_TO_ECLASS = eINSTANCE.getStringToEClass();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_ECLASS__KEY = eINSTANCE.getStringToEClass_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_ECLASS__VALUE = eINSTANCE.getStringToEClass_Value();

		/**
		 * The meta object literal for the '<em>My Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyMap()
		 * @generated
		 */
		EDataType MY_MAP = eINSTANCE.getMyMap();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Vector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Vector
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getVector()
		 * @generated
		 */
		EDataType VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getIterator()
		 * @generated
		 */
		EDataType ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '<em>My List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.impl.HelperPackageImpl#getMyList()
		 * @generated
		 */
		EDataType MY_LIST = eINSTANCE.getMyList();

	}

} //HelperPackage

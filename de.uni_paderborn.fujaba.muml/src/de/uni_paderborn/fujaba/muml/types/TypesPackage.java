/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/types/0.3.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.types.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.types.impl.DataTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.types.impl.ArrayDataTypeImpl <em>Array Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.types.impl.ArrayDataTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getArrayDataType()
	 * @generated
	 */
	int ARRAY_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__ANNOTATION = DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__CARDINALITY = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.types.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.types.impl.PrimitiveDataTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__ANNOTATION = DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.types.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.types.PrimitiveTypes
	 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 3;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.types.ArrayDataType <em>Array Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Data Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.ArrayDataType
	 * @generated
	 */
	EClass getArrayDataType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.types.ArrayDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.ArrayDataType#getType()
	 * @see #getArrayDataType()
	 * @generated
	 */
	EReference getArrayDataType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.types.ArrayDataType#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.ArrayDataType#getCardinality()
	 * @see #getArrayDataType()
	 * @generated
	 */
	EReference getArrayDataType_Cardinality();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.types.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.types.PrimitiveDataType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.PrimitiveDataType#getPrimitiveType()
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	EAttribute getPrimitiveDataType_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.types.PrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.types.PrimitiveTypes
	 * @generated
	 */
	EEnum getPrimitiveTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.types.impl.ArrayDataTypeImpl <em>Array Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.types.impl.ArrayDataTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getArrayDataType()
		 * @generated
		 */
		EClass ARRAY_DATA_TYPE = eINSTANCE.getArrayDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DATA_TYPE__TYPE = eINSTANCE.getArrayDataType_Type();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DATA_TYPE__CARDINALITY = eINSTANCE.getArrayDataType_Cardinality();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.types.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.types.impl.PrimitiveDataTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveDataType_PrimitiveType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.types.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.types.impl.DataTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.types.PrimitiveTypes <em>Primitive Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.types.PrimitiveTypes
		 * @see de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl#getPrimitiveTypes()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes();

	}

} //TypesPackage

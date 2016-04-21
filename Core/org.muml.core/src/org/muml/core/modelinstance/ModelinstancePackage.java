/**
 */
package org.muml.core.modelinstance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * The package modelinstance defines the base classes for the FUJABA xmi format.
 * In detail, it defines a root node and model element categories in order to serialize
 * the model elements that may be contained in a FUJABA model.
 * <!-- end-model-doc -->
 * @see org.muml.core.modelinstance.ModelinstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ModelinstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelinstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/modelinstance/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelinstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelinstancePackage eINSTANCE = org.muml.core.modelinstance.impl.ModelinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.core.modelinstance.impl.RootNodeImpl <em>Root Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.modelinstance.impl.RootNodeImpl
	 * @see org.muml.core.modelinstance.impl.ModelinstancePackageImpl#getRootNode()
	 * @generated
	 */
	int ROOT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE__CATEGORIES = 0;

	/**
	 * The number of structural features of the '<em>Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.core.modelinstance.impl.ModelElementCategoryImpl <em>Model Element Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.modelinstance.impl.ModelElementCategoryImpl
	 * @see org.muml.core.modelinstance.impl.ModelinstancePackageImpl#getModelElementCategory()
	 * @generated
	 */
	int MODEL_ELEMENT_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY__KEY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model Element Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Valid Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY___IS_VALID_ELEMENT__EXTENDABLEELEMENT = 0;

	/**
	 * The operation id for the '<em>Is Valid EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY___IS_VALID_ECLASS__ECLASS = 1;

	/**
	 * The number of operations of the '<em>Model Element Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CATEGORY_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.muml.core.modelinstance.RootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Node</em>'.
	 * @see org.muml.core.modelinstance.RootNode
	 * @generated
	 */
	EClass getRootNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.core.modelinstance.RootNode#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.muml.core.modelinstance.RootNode#getCategories()
	 * @see #getRootNode()
	 * @generated
	 */
	EReference getRootNode_Categories();

	/**
	 * Returns the meta object for class '{@link org.muml.core.modelinstance.ModelElementCategory <em>Model Element Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Category</em>'.
	 * @see org.muml.core.modelinstance.ModelElementCategory
	 * @generated
	 */
	EClass getModelElementCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.core.modelinstance.ModelElementCategory#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see org.muml.core.modelinstance.ModelElementCategory#getModelElements()
	 * @see #getModelElementCategory()
	 * @generated
	 */
	EReference getModelElementCategory_ModelElements();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.modelinstance.ModelElementCategory#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.muml.core.modelinstance.ModelElementCategory#getKey()
	 * @see #getModelElementCategory()
	 * @generated
	 */
	EAttribute getModelElementCategory_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.modelinstance.ModelElementCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.core.modelinstance.ModelElementCategory#getName()
	 * @see #getModelElementCategory()
	 * @generated
	 */
	EAttribute getModelElementCategory_Name();

	/**
	 * Returns the meta object for the '{@link org.muml.core.modelinstance.ModelElementCategory#isValidElement(org.muml.core.ExtendableElement) <em>Is Valid Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Element</em>' operation.
	 * @see org.muml.core.modelinstance.ModelElementCategory#isValidElement(org.muml.core.ExtendableElement)
	 * @generated
	 */
	EOperation getModelElementCategory__IsValidElement__ExtendableElement();

	/**
	 * Returns the meta object for the '{@link org.muml.core.modelinstance.ModelElementCategory#isValidEClass(org.eclipse.emf.ecore.EClass) <em>Is Valid EClass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid EClass</em>' operation.
	 * @see org.muml.core.modelinstance.ModelElementCategory#isValidEClass(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getModelElementCategory__IsValidEClass__EClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelinstanceFactory getModelinstanceFactory();

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
		 * The meta object literal for the '{@link org.muml.core.modelinstance.impl.RootNodeImpl <em>Root Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.modelinstance.impl.RootNodeImpl
		 * @see org.muml.core.modelinstance.impl.ModelinstancePackageImpl#getRootNode()
		 * @generated
		 */
		EClass ROOT_NODE = eINSTANCE.getRootNode();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE__CATEGORIES = eINSTANCE.getRootNode_Categories();

		/**
		 * The meta object literal for the '{@link org.muml.core.modelinstance.impl.ModelElementCategoryImpl <em>Model Element Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.modelinstance.impl.ModelElementCategoryImpl
		 * @see org.muml.core.modelinstance.impl.ModelinstancePackageImpl#getModelElementCategory()
		 * @generated
		 */
		EClass MODEL_ELEMENT_CATEGORY = eINSTANCE.getModelElementCategory();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_CATEGORY__MODEL_ELEMENTS = eINSTANCE.getModelElementCategory_ModelElements();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CATEGORY__KEY = eINSTANCE.getModelElementCategory_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CATEGORY__NAME = eINSTANCE.getModelElementCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Is Valid Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT_CATEGORY___IS_VALID_ELEMENT__EXTENDABLEELEMENT = eINSTANCE.getModelElementCategory__IsValidElement__ExtendableElement();

		/**
		 * The meta object literal for the '<em><b>Is Valid EClass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT_CATEGORY___IS_VALID_ECLASS__ECLASS = eINSTANCE.getModelElementCategory__IsValidEClass__EClass();

	}

} //ModelinstancePackage

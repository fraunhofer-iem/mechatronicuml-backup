/**
 */
package org.muml.testlanguage.specification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.muml.testlanguage.specification.SpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface SpecificationPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "specification";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/testlanguage/specification/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "testlanguagespec";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	SpecificationPackage eINSTANCE = org.muml.testlanguage.specification.impl.SpecificationPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.NodeSpecificationImpl
	 * <em>Node Specification</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.NodeSpecificationImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getNodeSpecification()
	 * @generated
	 */
	int NODE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION__PORT_SPECIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Node Specification</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION___INITIALIZE = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION___EXECUTE__MAP_MAP = 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT = 2;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = 4;

	/**
	 * The number of operations of the '<em>Node Specification</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_SPECIFICATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.PortSpecificationImpl
	 * <em>Port Specification</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.PortSpecificationImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getPortSpecification()
	 * @generated
	 */
	int PORT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_SPECIFICATION__OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_SPECIFICATION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_SPECIFICATION__DATA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Port Specification</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Specification</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.DefaultImpl
	 * <em>Default</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.DefaultImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The number of structural features of the '<em>Default</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.LoadModelImpl
	 * <em>Load Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.LoadModelImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getLoadModel()
	 * @generated
	 */
	int LOAD_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL__URI = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.CompareModelsImpl
	 * <em>Compare Models</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.CompareModelsImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getCompareModels()
	 * @generated
	 */
	int COMPARE_MODELS = 4;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The number of structural features of the '<em>Compare Models</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compare Models</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPARE_MODELS_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.ValidateModelImpl
	 * <em>Validate Model</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.ValidateModelImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getValidateModel()
	 * @generated
	 */
	int VALIDATE_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The number of structural features of the '<em>Validate Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Validate Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATE_MODEL_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.SaveModelImpl
	 * <em>Save Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.SaveModelImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getSaveModel()
	 * @generated
	 */
	int SAVE_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL__URI = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Save Model</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Save Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SAVE_MODEL_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.TransformationImpl
	 * <em>Transformation</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.TransformationImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__URI = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Order</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PARAMETER_ORDER = NODE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Properties</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CONFIG_PROPERTIES = NODE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transformation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.ExecuteUPPAALImpl
	 * <em>Execute UPPAAL</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.ExecuteUPPAALImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getExecuteUPPAAL()
	 * @generated
	 */
	int EXECUTE_UPPAAL = 8;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The number of structural features of the '<em>Execute UPPAAL</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execute UPPAAL</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTE_UPPAAL_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.PrimitiveStringImpl
	 * <em>Primitive String</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.PrimitiveStringImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getPrimitiveString()
	 * @generated
	 */
	int PRIMITIVE_STRING = 9;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__VALUE = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive String</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive String</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.AssertBoolImpl
	 * <em>Assert Bool</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.AssertBoolImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getAssertBool()
	 * @generated
	 */
	int ASSERT_BOOL = 10;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL__ASSERTION = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Bool</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assert Bool</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_BOOL_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.AssertDiagnosticTraceImpl
	 * <em>Assert Diagnostic Trace</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.AssertDiagnosticTraceImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getAssertDiagnosticTrace()
	 * @generated
	 */
	int ASSERT_DIAGNOSTIC_TRACE = 11;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE__PORT_SPECIFICATIONS = ASSERT_BOOL__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE__LABEL = ASSERT_BOOL__LABEL;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE__ASSERTION = ASSERT_BOOL__ASSERTION;

	/**
	 * The number of structural features of the '
	 * <em>Assert Diagnostic Trace</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE_FEATURE_COUNT = ASSERT_BOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE___NOTIFY_CHANGED__OBJECT = ASSERT_BOOL___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = ASSERT_BOOL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = ASSERT_BOOL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE___INITIALIZE = ASSERT_BOOL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE___EXECUTE__MAP_MAP = ASSERT_BOOL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assert Diagnostic Trace</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_DIAGNOSTIC_TRACE_OPERATION_COUNT = ASSERT_BOOL_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.AssertResultImpl
	 * <em>Assert Result</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.AssertResultImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getAssertResult()
	 * @generated
	 */
	int ASSERT_RESULT = 12;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT__PORT_SPECIFICATIONS = ASSERT_BOOL__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT__LABEL = ASSERT_BOOL__LABEL;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT__ASSERTION = ASSERT_BOOL__ASSERTION;

	/**
	 * The number of structural features of the '<em>Assert Result</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT_FEATURE_COUNT = ASSERT_BOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT___NOTIFY_CHANGED__OBJECT = ASSERT_BOOL___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = ASSERT_BOOL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = ASSERT_BOOL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT___INITIALIZE = ASSERT_BOOL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT___EXECUTE__MAP_MAP = ASSERT_BOOL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assert Result</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSERT_RESULT_OPERATION_COUNT = ASSERT_BOOL_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.impl.CheckMTCTLImpl
	 * <em>Check MTCTL</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.muml.testlanguage.specification.impl.CheckMTCTLImpl
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getCheckMTCTL()
	 * @generated
	 */
	int CHECK_MTCTL = 13;

	/**
	 * The feature id for the '<em><b>Port Specifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL__PORT_SPECIFICATIONS = NODE_SPECIFICATION__PORT_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL__LABEL = NODE_SPECIFICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL__PROPERTIES = NODE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check MTCTL</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL_FEATURE_COUNT = NODE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Changed</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL___NOTIFY_CHANGED__OBJECT = NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Port Specification</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS;

	/**
	 * The operation id for the '<em>Initialize</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL___INITIALIZE = NODE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL___EXECUTE__MAP_MAP = NODE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check MTCTL</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHECK_MTCTL_OPERATION_COUNT = NODE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.muml.testlanguage.specification.PortType <em>Port Type</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.PortType
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 14;

	/**
	 * The meta object id for the '<em>Execution Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.muml.testlanguage.specification.custom.ExecutionException
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getExecutionException()
	 * @generated
	 */
	int EXECUTION_EXCEPTION = 15;

	/**
	 * The meta object id for the '<em>Default Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.Exception
	 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getDefaultException()
	 * @generated
	 */
	int DEFAULT_EXCEPTION = 16;

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.NodeSpecification
	 * <em>Node Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Node Specification</em>'.
	 * @see org.muml.testlanguage.specification.NodeSpecification
	 * @generated
	 */
	EClass getNodeSpecification();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#getPortSpecifications
	 * <em>Port Specifications</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Port Specifications</em>'.
	 * @see org.muml.testlanguage.specification.NodeSpecification#getPortSpecifications()
	 * @see #getNodeSpecification()
	 * @generated
	 */
	EReference getNodeSpecification_PortSpecifications();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#getLabel
	 * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.muml.testlanguage.specification.NodeSpecification#getLabel()
	 * @see #getNodeSpecification()
	 * @generated
	 */
	EAttribute getNodeSpecification_Label();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.NodeSpecification#initialize()
	 * @generated
	 */
	EOperation getNodeSpecification__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.NodeSpecification#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getNodeSpecification__Execute__Map_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#notifyChanged(java.lang.Object)
	 * <em>Notify Changed</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Notify Changed</em>' operation.
	 * @see org.muml.testlanguage.specification.NodeSpecification#notifyChanged(java.lang.Object)
	 * @generated
	 */
	EOperation getNodeSpecification__NotifyChanged__Object();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#addPortSpecification(org.muml.testlanguage.specification.PortType, java.lang.String, boolean)
	 * <em>Add Port Specification</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Add Port Specification</em>'
	 *         operation.
	 * @see org.muml.testlanguage.specification.NodeSpecification#addPortSpecification(org.muml.testlanguage.specification.PortType,
	 *      java.lang.String, boolean)
	 * @generated
	 */
	EOperation getNodeSpecification__AddPortSpecification__PortType_String_boolean();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.NodeSpecification#addPortSpecification(org.muml.testlanguage.specification.PortType, java.lang.String, boolean, java.lang.Class)
	 * <em>Add Port Specification</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Add Port Specification</em>'
	 *         operation.
	 * @see org.muml.testlanguage.specification.NodeSpecification#addPortSpecification(org.muml.testlanguage.specification.PortType,
	 *      java.lang.String, boolean, java.lang.Class)
	 * @generated
	 */
	EOperation getNodeSpecification__AddPortSpecification__PortType_String_boolean_Class();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.PortSpecification
	 * <em>Port Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Port Specification</em>'.
	 * @see org.muml.testlanguage.specification.PortSpecification
	 * @generated
	 */
	EClass getPortSpecification();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.PortSpecification#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.testlanguage.specification.PortSpecification#getName()
	 * @see #getPortSpecification()
	 * @generated
	 */
	EAttribute getPortSpecification_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.PortSpecification#isOptional
	 * <em>Optional</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.muml.testlanguage.specification.PortSpecification#isOptional()
	 * @see #getPortSpecification()
	 * @generated
	 */
	EAttribute getPortSpecification_Optional();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.PortSpecification#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.testlanguage.specification.PortSpecification#getType()
	 * @see #getPortSpecification()
	 * @generated
	 */
	EAttribute getPortSpecification_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.PortSpecification#getDataType
	 * <em>Data Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.muml.testlanguage.specification.PortSpecification#getDataType()
	 * @see #getPortSpecification()
	 * @generated
	 */
	EAttribute getPortSpecification_DataType();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.Default <em>Default</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Default</em>'.
	 * @see org.muml.testlanguage.specification.Default
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.Default#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.Default#initialize()
	 * @generated
	 */
	EOperation getDefault__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.Default#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.Default#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getDefault__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.LoadModel <em>Load Model</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Load Model</em>'.
	 * @see org.muml.testlanguage.specification.LoadModel
	 * @generated
	 */
	EClass getLoadModel();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.LoadModel#getUri <em>Uri</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.muml.testlanguage.specification.LoadModel#getUri()
	 * @see #getLoadModel()
	 * @generated
	 */
	EAttribute getLoadModel_Uri();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.LoadModel#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.LoadModel#initialize()
	 * @generated
	 */
	EOperation getLoadModel__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.LoadModel#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.LoadModel#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getLoadModel__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.CompareModels
	 * <em>Compare Models</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Compare Models</em>'.
	 * @see org.muml.testlanguage.specification.CompareModels
	 * @generated
	 */
	EClass getCompareModels();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.CompareModels#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.CompareModels#initialize()
	 * @generated
	 */
	EOperation getCompareModels__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.CompareModels#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.CompareModels#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getCompareModels__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.ValidateModel
	 * <em>Validate Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Validate Model</em>'.
	 * @see org.muml.testlanguage.specification.ValidateModel
	 * @generated
	 */
	EClass getValidateModel();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.ValidateModel#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.ValidateModel#initialize()
	 * @generated
	 */
	EOperation getValidateModel__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.ValidateModel#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.ValidateModel#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getValidateModel__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.SaveModel <em>Save Model</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Save Model</em>'.
	 * @see org.muml.testlanguage.specification.SaveModel
	 * @generated
	 */
	EClass getSaveModel();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.SaveModel#getUri <em>Uri</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.muml.testlanguage.specification.SaveModel#getUri()
	 * @see #getSaveModel()
	 * @generated
	 */
	EAttribute getSaveModel_Uri();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.SaveModel#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.SaveModel#initialize()
	 * @generated
	 */
	EOperation getSaveModel__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.SaveModel#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.SaveModel#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getSaveModel__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.Transformation
	 * <em>Transformation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.muml.testlanguage.specification.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.Transformation#getUri
	 * <em>Uri</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.muml.testlanguage.specification.Transformation#getUri()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Uri();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.muml.testlanguage.specification.Transformation#getParameterOrder
	 * <em>Parameter Order</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Parameter Order</em>
	 *         '.
	 * @see org.muml.testlanguage.specification.Transformation#getParameterOrder()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ParameterOrder();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.muml.testlanguage.specification.Transformation#getConfigProperties
	 * <em>Config Properties</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute list '
	 *         <em>Config Properties</em>'.
	 * @see org.muml.testlanguage.specification.Transformation#getConfigProperties()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_ConfigProperties();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.Transformation#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.Transformation#initialize()
	 * @generated
	 */
	EOperation getTransformation__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.Transformation#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.Transformation#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getTransformation__Execute__Map_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.Transformation#notifyChanged(java.lang.Object)
	 * <em>Notify Changed</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Notify Changed</em>' operation.
	 * @see org.muml.testlanguage.specification.Transformation#notifyChanged(java.lang.Object)
	 * @generated
	 */
	EOperation getTransformation__NotifyChanged__Object();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.ExecuteUPPAAL
	 * <em>Execute UPPAAL</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Execute UPPAAL</em>'.
	 * @see org.muml.testlanguage.specification.ExecuteUPPAAL
	 * @generated
	 */
	EClass getExecuteUPPAAL();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.ExecuteUPPAAL#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.ExecuteUPPAAL#initialize()
	 * @generated
	 */
	EOperation getExecuteUPPAAL__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.ExecuteUPPAAL#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.ExecuteUPPAAL#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getExecuteUPPAAL__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.PrimitiveString
	 * <em>Primitive String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Primitive String</em>'.
	 * @see org.muml.testlanguage.specification.PrimitiveString
	 * @generated
	 */
	EClass getPrimitiveString();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.PrimitiveString#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.testlanguage.specification.PrimitiveString#getValue()
	 * @see #getPrimitiveString()
	 * @generated
	 */
	EAttribute getPrimitiveString_Value();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.PrimitiveString#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.PrimitiveString#initialize()
	 * @generated
	 */
	EOperation getPrimitiveString__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.PrimitiveString#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.PrimitiveString#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getPrimitiveString__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.AssertBool
	 * <em>Assert Bool</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Assert Bool</em>'.
	 * @see org.muml.testlanguage.specification.AssertBool
	 * @generated
	 */
	EClass getAssertBool();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.AssertBool#isAssertion
	 * <em>Assertion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Assertion</em>'.
	 * @see org.muml.testlanguage.specification.AssertBool#isAssertion()
	 * @see #getAssertBool()
	 * @generated
	 */
	EAttribute getAssertBool_Assertion();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.AssertBool#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.AssertBool#initialize()
	 * @generated
	 */
	EOperation getAssertBool__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.AssertBool#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.AssertBool#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getAssertBool__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.AssertDiagnosticTrace
	 * <em>Assert Diagnostic Trace</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Assert Diagnostic Trace</em>'.
	 * @see org.muml.testlanguage.specification.AssertDiagnosticTrace
	 * @generated
	 */
	EClass getAssertDiagnosticTrace();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.AssertDiagnosticTrace#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.AssertDiagnosticTrace#initialize()
	 * @generated
	 */
	EOperation getAssertDiagnosticTrace__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.AssertDiagnosticTrace#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.AssertDiagnosticTrace#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getAssertDiagnosticTrace__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.AssertResult
	 * <em>Assert Result</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Assert Result</em>'.
	 * @see org.muml.testlanguage.specification.AssertResult
	 * @generated
	 */
	EClass getAssertResult();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.AssertResult#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.AssertResult#initialize()
	 * @generated
	 */
	EOperation getAssertResult__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.AssertResult#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.AssertResult#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getAssertResult__Execute__Map_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.muml.testlanguage.specification.CheckMTCTL
	 * <em>Check MTCTL</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Check MTCTL</em>'.
	 * @see org.muml.testlanguage.specification.CheckMTCTL
	 * @generated
	 */
	EClass getCheckMTCTL();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.muml.testlanguage.specification.CheckMTCTL#getProperties
	 * <em>Properties</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.muml.testlanguage.specification.CheckMTCTL#getProperties()
	 * @see #getCheckMTCTL()
	 * @generated
	 */
	EAttribute getCheckMTCTL_Properties();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.CheckMTCTL#initialize()
	 * <em>Initialize</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.muml.testlanguage.specification.CheckMTCTL#initialize()
	 * @generated
	 */
	EOperation getCheckMTCTL__Initialize();

	/**
	 * Returns the meta object for the '
	 * {@link org.muml.testlanguage.specification.CheckMTCTL#execute(java.util.Map, java.util.Map)
	 * <em>Execute</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see org.muml.testlanguage.specification.CheckMTCTL#execute(java.util.Map,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getCheckMTCTL__Execute__Map_Map();

	/**
	 * Returns the meta object for enum '
	 * {@link org.muml.testlanguage.specification.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see org.muml.testlanguage.specification.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for data type '
	 * {@link org.muml.testlanguage.specification.custom.ExecutionException
	 * <em>Execution Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Execution Exception</em>'.
	 * @see org.muml.testlanguage.specification.custom.ExecutionException
	 * @model instanceClass=
	 *        "de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException"
	 *        serializeable="false"
	 * @generated
	 */
	EDataType getExecutionException();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception
	 * <em>Default Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Default Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception" serializeable="false"
	 * @generated
	 */
	EDataType getDefaultException();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecificationFactory getSpecificationFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.NodeSpecificationImpl
		 * <em>Node Specification</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.NodeSpecificationImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getNodeSpecification()
		 * @generated
		 */
		EClass NODE_SPECIFICATION = eINSTANCE.getNodeSpecification();

		/**
		 * The meta object literal for the '<em><b>Port Specifications</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NODE_SPECIFICATION__PORT_SPECIFICATIONS = eINSTANCE.getNodeSpecification_PortSpecifications();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE_SPECIFICATION__LABEL = eINSTANCE.getNodeSpecification_Label();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE_SPECIFICATION___INITIALIZE = eINSTANCE.getNodeSpecification__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE_SPECIFICATION___EXECUTE__MAP_MAP = eINSTANCE.getNodeSpecification__Execute__Map_Map();

		/**
		 * The meta object literal for the '<em><b>Notify Changed</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT = eINSTANCE
				.getNodeSpecification__NotifyChanged__Object();

		/**
		 * The meta object literal for the '
		 * <em><b>Add Port Specification</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN = eINSTANCE
				.getNodeSpecification__AddPortSpecification__PortType_String_boolean();

		/**
		 * The meta object literal for the '
		 * <em><b>Add Port Specification</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS = eINSTANCE
				.getNodeSpecification__AddPortSpecification__PortType_String_boolean_Class();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.PortSpecificationImpl
		 * <em>Port Specification</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.PortSpecificationImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getPortSpecification()
		 * @generated
		 */
		EClass PORT_SPECIFICATION = eINSTANCE.getPortSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT_SPECIFICATION__NAME = eINSTANCE.getPortSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT_SPECIFICATION__OPTIONAL = eINSTANCE.getPortSpecification_Optional();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT_SPECIFICATION__TYPE = eINSTANCE.getPortSpecification_Type();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT_SPECIFICATION__DATA_TYPE = eINSTANCE.getPortSpecification_DataType();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.DefaultImpl
		 * <em>Default</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.DefaultImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation DEFAULT___INITIALIZE = eINSTANCE.getDefault__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation DEFAULT___EXECUTE__MAP_MAP = eINSTANCE.getDefault__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.LoadModelImpl
		 * <em>Load Model</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.LoadModelImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getLoadModel()
		 * @generated
		 */
		EClass LOAD_MODEL = eINSTANCE.getLoadModel();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LOAD_MODEL__URI = eINSTANCE.getLoadModel_Uri();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation LOAD_MODEL___INITIALIZE = eINSTANCE.getLoadModel__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation LOAD_MODEL___EXECUTE__MAP_MAP = eINSTANCE.getLoadModel__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.CompareModelsImpl
		 * <em>Compare Models</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.CompareModelsImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getCompareModels()
		 * @generated
		 */
		EClass COMPARE_MODELS = eINSTANCE.getCompareModels();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation COMPARE_MODELS___INITIALIZE = eINSTANCE.getCompareModels__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation COMPARE_MODELS___EXECUTE__MAP_MAP = eINSTANCE.getCompareModels__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.ValidateModelImpl
		 * <em>Validate Model</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.ValidateModelImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getValidateModel()
		 * @generated
		 */
		EClass VALIDATE_MODEL = eINSTANCE.getValidateModel();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation VALIDATE_MODEL___INITIALIZE = eINSTANCE.getValidateModel__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation VALIDATE_MODEL___EXECUTE__MAP_MAP = eINSTANCE.getValidateModel__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.SaveModelImpl
		 * <em>Save Model</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.SaveModelImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getSaveModel()
		 * @generated
		 */
		EClass SAVE_MODEL = eINSTANCE.getSaveModel();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SAVE_MODEL__URI = eINSTANCE.getSaveModel_Uri();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation SAVE_MODEL___INITIALIZE = eINSTANCE.getSaveModel__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation SAVE_MODEL___EXECUTE__MAP_MAP = eINSTANCE.getSaveModel__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.TransformationImpl
		 * <em>Transformation</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.TransformationImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRANSFORMATION__URI = eINSTANCE.getTransformation_Uri();

		/**
		 * The meta object literal for the '<em><b>Parameter Order</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TRANSFORMATION__PARAMETER_ORDER = eINSTANCE.getTransformation_ParameterOrder();

		/**
		 * The meta object literal for the '<em><b>Config Properties</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRANSFORMATION__CONFIG_PROPERTIES = eINSTANCE.getTransformation_ConfigProperties();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TRANSFORMATION___INITIALIZE = eINSTANCE.getTransformation__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TRANSFORMATION___EXECUTE__MAP_MAP = eINSTANCE.getTransformation__Execute__Map_Map();

		/**
		 * The meta object literal for the '<em><b>Notify Changed</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TRANSFORMATION___NOTIFY_CHANGED__OBJECT = eINSTANCE.getTransformation__NotifyChanged__Object();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.ExecuteUPPAALImpl
		 * <em>Execute UPPAAL</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.ExecuteUPPAALImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getExecuteUPPAAL()
		 * @generated
		 */
		EClass EXECUTE_UPPAAL = eINSTANCE.getExecuteUPPAAL();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation EXECUTE_UPPAAL___INITIALIZE = eINSTANCE.getExecuteUPPAAL__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation EXECUTE_UPPAAL___EXECUTE__MAP_MAP = eINSTANCE.getExecuteUPPAAL__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.PrimitiveStringImpl
		 * <em>Primitive String</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.PrimitiveStringImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getPrimitiveString()
		 * @generated
		 */
		EClass PRIMITIVE_STRING = eINSTANCE.getPrimitiveString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PRIMITIVE_STRING__VALUE = eINSTANCE.getPrimitiveString_Value();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PRIMITIVE_STRING___INITIALIZE = eINSTANCE.getPrimitiveString__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PRIMITIVE_STRING___EXECUTE__MAP_MAP = eINSTANCE.getPrimitiveString__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.AssertBoolImpl
		 * <em>Assert Bool</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.AssertBoolImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getAssertBool()
		 * @generated
		 */
		EClass ASSERT_BOOL = eINSTANCE.getAssertBool();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSERT_BOOL__ASSERTION = eINSTANCE.getAssertBool_Assertion();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ASSERT_BOOL___INITIALIZE = eINSTANCE.getAssertBool__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ASSERT_BOOL___EXECUTE__MAP_MAP = eINSTANCE.getAssertBool__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.AssertDiagnosticTraceImpl
		 * <em>Assert Diagnostic Trace</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.
		 *      AssertDiagnosticTraceImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getAssertDiagnosticTrace()
		 * @generated
		 */
		EClass ASSERT_DIAGNOSTIC_TRACE = eINSTANCE.getAssertDiagnosticTrace();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ASSERT_DIAGNOSTIC_TRACE___INITIALIZE = eINSTANCE.getAssertDiagnosticTrace__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ASSERT_DIAGNOSTIC_TRACE___EXECUTE__MAP_MAP = eINSTANCE.getAssertDiagnosticTrace__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.AssertResultImpl
		 * <em>Assert Result</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.AssertResultImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getAssertResult()
		 * @generated
		 */
		EClass ASSERT_RESULT = eINSTANCE.getAssertResult();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ASSERT_RESULT___INITIALIZE = eINSTANCE.getAssertResult__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation ASSERT_RESULT___EXECUTE__MAP_MAP = eINSTANCE.getAssertResult__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.impl.CheckMTCTLImpl
		 * <em>Check MTCTL</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.muml.testlanguage.specification.impl.CheckMTCTLImpl
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getCheckMTCTL()
		 * @generated
		 */
		EClass CHECK_MTCTL = eINSTANCE.getCheckMTCTL();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHECK_MTCTL__PROPERTIES = eINSTANCE.getCheckMTCTL_Properties();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation CHECK_MTCTL___INITIALIZE = eINSTANCE.getCheckMTCTL__Initialize();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation CHECK_MTCTL___EXECUTE__MAP_MAP = eINSTANCE.getCheckMTCTL__Execute__Map_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.muml.testlanguage.specification.PortType
		 * <em>Port Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.muml.testlanguage.specification.PortType
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em>Execution Exception</em>' data
		 * type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.
		 *      ExecutionException
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getExecutionException()
		 * @generated
		 */
		EDataType EXECUTION_EXCEPTION = eINSTANCE.getExecutionException();

		/**
		 * The meta object literal for the '<em>Default Exception</em>' data
		 * type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.Exception
		 * @see org.muml.testlanguage.specification.impl.SpecificationPackageImpl#getDefaultException()
		 * @generated
		 */
		EDataType DEFAULT_EXCEPTION = eINSTANCE.getDefaultException();

	}

} // SpecificationPackage

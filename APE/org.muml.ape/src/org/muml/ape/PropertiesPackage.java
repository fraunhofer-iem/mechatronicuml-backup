/**
 */
package org.muml.ape;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.muml.ape.PropertiesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ape";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.muml.ape/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.muml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesPackage eINSTANCE = org.muml.ape.impl.PropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PropertyGeneratorImpl <em>Property Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PropertyGeneratorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyGenerator()
	 * @generated
	 */
	int PROPERTY_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Reconciler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__RECONCILER = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__GEN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Referenced Generators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__REFERENCED_GENERATORS = 2;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__PLUGIN = 3;

	/**
	 * The feature id for the '<em><b>Default Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__DEFAULT_TAB = 4;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__TABS = 5;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__PACKAGES = 6;

	/**
	 * The feature id for the '<em><b>Contributor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__CONTRIBUTOR_ID = 7;

	/**
	 * The feature id for the '<em><b>Source Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__SOURCE_FOLDER = 8;

	/**
	 * The number of structural features of the '<em>Property Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.ReconcilerImpl <em>Reconciler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.ReconcilerImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getReconciler()
	 * @generated
	 */
	int RECONCILER = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONCILER__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Reconcile Packages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONCILER__RECONCILE_PACKAGES = 1;

	/**
	 * The feature id for the '<em><b>Reconcile Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONCILER__RECONCILE_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Reconcile Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONCILER__RECONCILE_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Custom Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONCILER__CUSTOM_TRANSFORMATIONS = 4;

	/**
	 * The number of structural features of the '<em>Reconciler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONCILER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.CustomTransformationImpl <em>Custom Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.CustomTransformationImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getCustomTransformation()
	 * @generated
	 */
	int CUSTOM_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__URI = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__ENABLED = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Custom Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PluginImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VENDOR = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Required Bundles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__REQUIRED_BUNDLES = 4;

	/**
	 * The feature id for the '<em><b>Required Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT = 5;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PropertyTabImpl <em>Property Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PropertyTabImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyTab()
	 * @generated
	 */
	int PROPERTY_TAB = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__NAME = 1;

	/**
	 * The feature id for the '<em><b>After Tab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB__AFTER_TAB = 2;

	/**
	 * The number of structural features of the '<em>Property Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TAB_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PackageImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GEN_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GENERATOR = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.ClassImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 6;

	/**
	 * The feature id for the '<em><b>Gen Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GEN_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Ordered Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ORDERED_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASSES = 3;

	/**
	 * The feature id for the '<em><b>All Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ALL_SUPER_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Base Insert Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BASE_INSERT_POINTS = 6;

	/**
	 * The feature id for the '<em><b>Property Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTY_CATEGORIES = 7;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.OrderedElementImpl <em>Ordered Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.OrderedElementImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getOrderedElement()
	 * @generated
	 */
	int ORDERED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_ELEMENT__CLAZZ = 0;

	/**
	 * The number of structural features of the '<em>Ordered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.BaseInsertPointImpl <em>Base Insert Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.BaseInsertPointImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getBaseInsertPoint()
	 * @generated
	 */
	int BASE_INSERT_POINT = 8;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_INSERT_POINT__CLAZZ = ORDERED_ELEMENT__CLAZZ;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_INSERT_POINT__BASE_CLASS = ORDERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Insert Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_INSERT_POINT_FEATURE_COUNT = ORDERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PropertyCategoryImpl <em>Property Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PropertyCategoryImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyCategory()
	 * @generated
	 */
	int PROPERTY_CATEGORY = 21;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PropertyImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLAZZ = ORDERED_ELEMENT__CLAZZ;

	/**
	 * The feature id for the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GEN_FEATURE = ORDERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY_FILTERS = ORDERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Only Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__READ_ONLY_FILTERS = ORDERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TAB = ORDERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EDITOR = ORDERED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TOOLTIP = ORDERED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reconcile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RECONCILE = ORDERED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CREATION_CONSTRAINT = ORDERED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Creation Opposite Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CREATION_OPPOSITE_CONSTRAINT = ORDERED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Initialize OCL Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INITIALIZE_OCL_EXPRESSION = ORDERED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ORDERED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.PropertyEditorImpl <em>Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.PropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyEditor()
	 * @generated
	 */
	int PROPERTY_EDITOR = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDITOR__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDITOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.TextPropertyEditorImpl <em>Text Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.TextPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getTextPropertyEditor()
	 * @generated
	 */
	int TEXT_PROPERTY_EDITOR = 11;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.SpinnerPropertyEditorImpl <em>Spinner Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.SpinnerPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getSpinnerPropertyEditor()
	 * @generated
	 */
	int SPINNER_PROPERTY_EDITOR = 12;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.ComboBoxPropertyEditorImpl <em>Combo Box Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.ComboBoxPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getComboBoxPropertyEditor()
	 * @generated
	 */
	int COMBO_BOX_PROPERTY_EDITOR = 13;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.CheckboxPropertyEditorImpl <em>Checkbox Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.CheckboxPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getCheckboxPropertyEditor()
	 * @generated
	 */
	int CHECKBOX_PROPERTY_EDITOR = 14;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.RadioPropertyEditorImpl <em>Radio Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.RadioPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getRadioPropertyEditor()
	 * @generated
	 */
	int RADIO_PROPERTY_EDITOR = 15;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.ListPropertyEditorImpl <em>List Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.ListPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getListPropertyEditor()
	 * @generated
	 */
	int LIST_PROPERTY_EDITOR = 16;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.ObjectPropertyEditorImpl <em>Object Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.ObjectPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getObjectPropertyEditor()
	 * @generated
	 */
	int OBJECT_PROPERTY_EDITOR = 18;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROPERTY_EDITOR__MULTI_LINE = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_PROPERTY_EDITOR__DIGITS = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spinner Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>Combo Box Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>Checkbox Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>Radio Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>List Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.FlattenedListPropertyEditorImpl <em>Flattened List Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.FlattenedListPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getFlattenedListPropertyEditor()
	 * @generated
	 */
	int FLATTENED_LIST_PROPERTY_EDITOR = 17;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENED_LIST_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>Flattened List Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENED_LIST_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>Object Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.OCLPropertyEditorImpl <em>OCL Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.OCLPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getOCLPropertyEditor()
	 * @generated
	 */
	int OCL_PROPERTY_EDITOR = 19;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The number of structural features of the '<em>OCL Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.CustomPropertyEditorImpl <em>Custom Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.CustomPropertyEditorImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getCustomPropertyEditor()
	 * @generated
	 */
	int CUSTOM_PROPERTY_EDITOR = 20;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_EDITOR__PROPERTY = PROPERTY_EDITOR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__CLAZZ = ORDERED_ELEMENT__CLAZZ;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__TITLE = ORDERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__VERTICAL = ORDERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__OPEN = ORDERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__PROPERTIES = ORDERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_FEATURE_COUNT = ORDERED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.FilterImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 22;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.OCLFilterImpl <em>OCL Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.OCLFilterImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getOCLFilter()
	 * @generated
	 */
	int OCL_FILTER = 23;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER__EXPRESSION = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.ape.impl.CreationConstraintImpl <em>Creation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.impl.CreationConstraintImpl
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getCreationConstraint()
	 * @generated
	 */
	int CREATION_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CONSTRAINT__FILTERS = 0;

	/**
	 * The number of structural features of the '<em>Creation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.ape.TransformationPosition <em>Transformation Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.ape.TransformationPosition
	 * @see org.muml.ape.impl.PropertiesPackageImpl#getTransformationPosition()
	 * @generated
	 */
	int TRANSFORMATION_POSITION = 25;


	/**
	 * Returns the meta object for class '{@link org.muml.ape.PropertyGenerator <em>Property Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Generator</em>'.
	 * @see org.muml.ape.PropertyGenerator
	 * @generated
	 */
	EClass getPropertyGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.ape.PropertyGenerator#getReconciler <em>Reconciler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reconciler</em>'.
	 * @see org.muml.ape.PropertyGenerator#getReconciler()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Reconciler();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.PropertyGenerator#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Model</em>'.
	 * @see org.muml.ape.PropertyGenerator#getGenModel()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_GenModel();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.PropertyGenerator#getReferencedGenerators <em>Referenced Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Generators</em>'.
	 * @see org.muml.ape.PropertyGenerator#getReferencedGenerators()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_ReferencedGenerators();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.ape.PropertyGenerator#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin</em>'.
	 * @see org.muml.ape.PropertyGenerator#getPlugin()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Plugin();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.PropertyGenerator#getDefaultTab <em>Default Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Tab</em>'.
	 * @see org.muml.ape.PropertyGenerator#getDefaultTab()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_DefaultTab();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.PropertyGenerator#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.muml.ape.PropertyGenerator#getTabs()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Tabs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.PropertyGenerator#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.muml.ape.PropertyGenerator#getPackages()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Packages();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyGenerator#getContributorId <em>Contributor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributor Id</em>'.
	 * @see org.muml.ape.PropertyGenerator#getContributorId()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EAttribute getPropertyGenerator_ContributorId();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyGenerator#getSourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Folder</em>'.
	 * @see org.muml.ape.PropertyGenerator#getSourceFolder()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EAttribute getPropertyGenerator_SourceFolder();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.Reconciler <em>Reconciler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconciler</em>'.
	 * @see org.muml.ape.Reconciler
	 * @generated
	 */
	EClass getReconciler();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Reconciler#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.muml.ape.Reconciler#isEnabled()
	 * @see #getReconciler()
	 * @generated
	 */
	EAttribute getReconciler_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Reconciler#isReconcilePackages <em>Reconcile Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile Packages</em>'.
	 * @see org.muml.ape.Reconciler#isReconcilePackages()
	 * @see #getReconciler()
	 * @generated
	 */
	EAttribute getReconciler_ReconcilePackages();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Reconciler#isReconcileClasses <em>Reconcile Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile Classes</em>'.
	 * @see org.muml.ape.Reconciler#isReconcileClasses()
	 * @see #getReconciler()
	 * @generated
	 */
	EAttribute getReconciler_ReconcileClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Reconciler#isReconcileProperties <em>Reconcile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile Properties</em>'.
	 * @see org.muml.ape.Reconciler#isReconcileProperties()
	 * @see #getReconciler()
	 * @generated
	 */
	EAttribute getReconciler_ReconcileProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.Reconciler#getCustomTransformations <em>Custom Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Transformations</em>'.
	 * @see org.muml.ape.Reconciler#getCustomTransformations()
	 * @see #getReconciler()
	 * @generated
	 */
	EReference getReconciler_CustomTransformations();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.CustomTransformation <em>Custom Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Transformation</em>'.
	 * @see org.muml.ape.CustomTransformation
	 * @generated
	 */
	EClass getCustomTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.CustomTransformation#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.muml.ape.CustomTransformation#getUri()
	 * @see #getCustomTransformation()
	 * @generated
	 */
	EAttribute getCustomTransformation_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.CustomTransformation#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.muml.ape.CustomTransformation#isEnabled()
	 * @see #getCustomTransformation()
	 * @generated
	 */
	EAttribute getCustomTransformation_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.CustomTransformation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.muml.ape.CustomTransformation#getPosition()
	 * @see #getCustomTransformation()
	 * @generated
	 */
	EAttribute getCustomTransformation_Position();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.muml.ape.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Plugin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.muml.ape.Plugin#getId()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Plugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.ape.Plugin#getName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Plugin#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.muml.ape.Plugin#getVendor()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Plugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.muml.ape.Plugin#getVersion()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.muml.ape.Plugin#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Bundles</em>'.
	 * @see org.muml.ape.Plugin#getRequiredBundles()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_RequiredBundles();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Plugin#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Execution Environment</em>'.
	 * @see org.muml.ape.Plugin#getRequiredExecutionEnvironment()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_RequiredExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.PropertyTab <em>Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Tab</em>'.
	 * @see org.muml.ape.PropertyTab
	 * @generated
	 */
	EClass getPropertyTab();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyTab#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.muml.ape.PropertyTab#getId()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EAttribute getPropertyTab_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyTab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.ape.PropertyTab#getName()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EAttribute getPropertyTab_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyTab#getAfterTab <em>After Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Tab</em>'.
	 * @see org.muml.ape.PropertyTab#getAfterTab()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EAttribute getPropertyTab_AfterTab();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.muml.ape.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.Package#getGenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Package</em>'.
	 * @see org.muml.ape.Package#getGenPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_GenPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.muml.ape.Package#getClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Classes();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.ape.Package#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generator</em>'.
	 * @see org.muml.ape.Package#getGenerator()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Generator();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.muml.ape.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.Class#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Class</em>'.
	 * @see org.muml.ape.Class#getGenClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GenClass();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.ape.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.muml.ape.Class#getPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.Class#getOrderedElements <em>Ordered Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordered Elements</em>'.
	 * @see org.muml.ape.Class#getOrderedElements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OrderedElements();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.Class#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see org.muml.ape.Class#getSuperClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.Class#getAllSuperClasses <em>All Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Classes</em>'.
	 * @see org.muml.ape.Class#getAllSuperClasses()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_AllSuperClasses();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.muml.ape.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.Class#getBaseInsertPoints <em>Base Insert Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Insert Points</em>'.
	 * @see org.muml.ape.Class#getBaseInsertPoints()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_BaseInsertPoints();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.Class#getPropertyCategories <em>Property Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Categories</em>'.
	 * @see org.muml.ape.Class#getPropertyCategories()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_PropertyCategories();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.OrderedElement <em>Ordered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Element</em>'.
	 * @see org.muml.ape.OrderedElement
	 * @generated
	 */
	EClass getOrderedElement();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.ape.OrderedElement#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Clazz</em>'.
	 * @see org.muml.ape.OrderedElement#getClazz()
	 * @see #getOrderedElement()
	 * @generated
	 */
	EReference getOrderedElement_Clazz();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.BaseInsertPoint <em>Base Insert Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Insert Point</em>'.
	 * @see org.muml.ape.BaseInsertPoint
	 * @generated
	 */
	EClass getBaseInsertPoint();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.BaseInsertPoint#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.muml.ape.BaseInsertPoint#getBaseClass()
	 * @see #getBaseInsertPoint()
	 * @generated
	 */
	EReference getBaseInsertPoint_BaseClass();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.PropertyCategory <em>Property Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Category</em>'.
	 * @see org.muml.ape.PropertyCategory
	 * @generated
	 */
	EClass getPropertyCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyCategory#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.muml.ape.PropertyCategory#getTitle()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EAttribute getPropertyCategory_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyCategory#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see org.muml.ape.PropertyCategory#isVertical()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EAttribute getPropertyCategory_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.PropertyCategory#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see org.muml.ape.PropertyCategory#isOpen()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EAttribute getPropertyCategory_Open();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.ape.PropertyCategory#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.muml.ape.PropertyCategory#getProperties()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EReference getPropertyCategory_Properties();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.muml.ape.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.Property#getGenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Feature</em>'.
	 * @see org.muml.ape.Property#getGenFeature()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_GenFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.Property#getVisibilityFilters <em>Visibility Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visibility Filters</em>'.
	 * @see org.muml.ape.Property#getVisibilityFilters()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_VisibilityFilters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.Property#getReadOnlyFilters <em>Read Only Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Read Only Filters</em>'.
	 * @see org.muml.ape.Property#getReadOnlyFilters()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ReadOnlyFilters();

	/**
	 * Returns the meta object for the reference '{@link org.muml.ape.Property#getTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tab</em>'.
	 * @see org.muml.ape.Property#getTab()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Tab();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.ape.Property#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editor</em>'.
	 * @see org.muml.ape.Property#getEditor()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Editor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Property#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.muml.ape.Property#getTooltip()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Property#isReconcile <em>Reconcile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconcile</em>'.
	 * @see org.muml.ape.Property#isReconcile()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Reconcile();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.ape.Property#getCreationConstraint <em>Creation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Constraint</em>'.
	 * @see org.muml.ape.Property#getCreationConstraint()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_CreationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.ape.Property#getCreationOppositeConstraint <em>Creation Opposite Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation Opposite Constraint</em>'.
	 * @see org.muml.ape.Property#getCreationOppositeConstraint()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_CreationOppositeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.Property#getInitializeOCLExpression <em>Initialize OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialize OCL Expression</em>'.
	 * @see org.muml.ape.Property#getInitializeOCLExpression()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_InitializeOCLExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Editor</em>'.
	 * @see org.muml.ape.PropertyEditor
	 * @generated
	 */
	EClass getPropertyEditor();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.ape.PropertyEditor#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Property</em>'.
	 * @see org.muml.ape.PropertyEditor#getProperty()
	 * @see #getPropertyEditor()
	 * @generated
	 */
	EReference getPropertyEditor_Property();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.TextPropertyEditor <em>Text Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Property Editor</em>'.
	 * @see org.muml.ape.TextPropertyEditor
	 * @generated
	 */
	EClass getTextPropertyEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.TextPropertyEditor#isMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see org.muml.ape.TextPropertyEditor#isMultiLine()
	 * @see #getTextPropertyEditor()
	 * @generated
	 */
	EAttribute getTextPropertyEditor_MultiLine();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.SpinnerPropertyEditor <em>Spinner Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner Property Editor</em>'.
	 * @see org.muml.ape.SpinnerPropertyEditor
	 * @generated
	 */
	EClass getSpinnerPropertyEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.SpinnerPropertyEditor#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see org.muml.ape.SpinnerPropertyEditor#getDigits()
	 * @see #getSpinnerPropertyEditor()
	 * @generated
	 */
	EAttribute getSpinnerPropertyEditor_Digits();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.ComboBoxPropertyEditor <em>Combo Box Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box Property Editor</em>'.
	 * @see org.muml.ape.ComboBoxPropertyEditor
	 * @generated
	 */
	EClass getComboBoxPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.CheckboxPropertyEditor <em>Checkbox Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox Property Editor</em>'.
	 * @see org.muml.ape.CheckboxPropertyEditor
	 * @generated
	 */
	EClass getCheckboxPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.RadioPropertyEditor <em>Radio Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Property Editor</em>'.
	 * @see org.muml.ape.RadioPropertyEditor
	 * @generated
	 */
	EClass getRadioPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.ListPropertyEditor <em>List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property Editor</em>'.
	 * @see org.muml.ape.ListPropertyEditor
	 * @generated
	 */
	EClass getListPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.FlattenedListPropertyEditor <em>Flattened List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flattened List Property Editor</em>'.
	 * @see org.muml.ape.FlattenedListPropertyEditor
	 * @generated
	 */
	EClass getFlattenedListPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.ObjectPropertyEditor <em>Object Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Editor</em>'.
	 * @see org.muml.ape.ObjectPropertyEditor
	 * @generated
	 */
	EClass getObjectPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.OCLPropertyEditor <em>OCL Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Property Editor</em>'.
	 * @see org.muml.ape.OCLPropertyEditor
	 * @generated
	 */
	EClass getOCLPropertyEditor();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.CustomPropertyEditor <em>Custom Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property Editor</em>'.
	 * @see org.muml.ape.CustomPropertyEditor
	 * @generated
	 */
	EClass getCustomPropertyEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.CustomPropertyEditor#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see org.muml.ape.CustomPropertyEditor#getFullyQualifiedClassName()
	 * @see #getCustomPropertyEditor()
	 * @generated
	 */
	EAttribute getCustomPropertyEditor_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.muml.ape.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.OCLFilter <em>OCL Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Filter</em>'.
	 * @see org.muml.ape.OCLFilter
	 * @generated
	 */
	EClass getOCLFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.ape.OCLFilter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.muml.ape.OCLFilter#getExpression()
	 * @see #getOCLFilter()
	 * @generated
	 */
	EAttribute getOCLFilter_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.ape.CreationConstraint <em>Creation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Constraint</em>'.
	 * @see org.muml.ape.CreationConstraint
	 * @generated
	 */
	EClass getCreationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.ape.CreationConstraint#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see org.muml.ape.CreationConstraint#getFilters()
	 * @see #getCreationConstraint()
	 * @generated
	 */
	EReference getCreationConstraint_Filters();

	/**
	 * Returns the meta object for enum '{@link org.muml.ape.TransformationPosition <em>Transformation Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformation Position</em>'.
	 * @see org.muml.ape.TransformationPosition
	 * @generated
	 */
	EEnum getTransformationPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesFactory getPropertiesFactory();

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
		 * The meta object literal for the '{@link org.muml.ape.impl.PropertyGeneratorImpl <em>Property Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PropertyGeneratorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyGenerator()
		 * @generated
		 */
		EClass PROPERTY_GENERATOR = eINSTANCE.getPropertyGenerator();

		/**
		 * The meta object literal for the '<em><b>Reconciler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__RECONCILER = eINSTANCE.getPropertyGenerator_Reconciler();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__GEN_MODEL = eINSTANCE.getPropertyGenerator_GenModel();

		/**
		 * The meta object literal for the '<em><b>Referenced Generators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__REFERENCED_GENERATORS = eINSTANCE.getPropertyGenerator_ReferencedGenerators();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__PLUGIN = eINSTANCE.getPropertyGenerator_Plugin();

		/**
		 * The meta object literal for the '<em><b>Default Tab</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__DEFAULT_TAB = eINSTANCE.getPropertyGenerator_DefaultTab();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__TABS = eINSTANCE.getPropertyGenerator_Tabs();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__PACKAGES = eINSTANCE.getPropertyGenerator_Packages();

		/**
		 * The meta object literal for the '<em><b>Contributor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GENERATOR__CONTRIBUTOR_ID = eINSTANCE.getPropertyGenerator_ContributorId();

		/**
		 * The meta object literal for the '<em><b>Source Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GENERATOR__SOURCE_FOLDER = eINSTANCE.getPropertyGenerator_SourceFolder();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.ReconcilerImpl <em>Reconciler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.ReconcilerImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getReconciler()
		 * @generated
		 */
		EClass RECONCILER = eINSTANCE.getReconciler();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONCILER__ENABLED = eINSTANCE.getReconciler_Enabled();

		/**
		 * The meta object literal for the '<em><b>Reconcile Packages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONCILER__RECONCILE_PACKAGES = eINSTANCE.getReconciler_ReconcilePackages();

		/**
		 * The meta object literal for the '<em><b>Reconcile Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONCILER__RECONCILE_CLASSES = eINSTANCE.getReconciler_ReconcileClasses();

		/**
		 * The meta object literal for the '<em><b>Reconcile Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONCILER__RECONCILE_PROPERTIES = eINSTANCE.getReconciler_ReconcileProperties();

		/**
		 * The meta object literal for the '<em><b>Custom Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONCILER__CUSTOM_TRANSFORMATIONS = eINSTANCE.getReconciler_CustomTransformations();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.CustomTransformationImpl <em>Custom Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.CustomTransformationImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getCustomTransformation()
		 * @generated
		 */
		EClass CUSTOM_TRANSFORMATION = eINSTANCE.getCustomTransformation();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TRANSFORMATION__URI = eINSTANCE.getCustomTransformation_Uri();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TRANSFORMATION__ENABLED = eINSTANCE.getCustomTransformation_Enabled();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TRANSFORMATION__POSITION = eINSTANCE.getCustomTransformation_Position();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PluginImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__ID = eINSTANCE.getPlugin_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__NAME = eINSTANCE.getPlugin_Name();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__VENDOR = eINSTANCE.getPlugin_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__VERSION = eINSTANCE.getPlugin_Version();

		/**
		 * The meta object literal for the '<em><b>Required Bundles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__REQUIRED_BUNDLES = eINSTANCE.getPlugin_RequiredBundles();

		/**
		 * The meta object literal for the '<em><b>Required Execution Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT = eINSTANCE.getPlugin_RequiredExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.PropertyTabImpl <em>Property Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PropertyTabImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyTab()
		 * @generated
		 */
		EClass PROPERTY_TAB = eINSTANCE.getPropertyTab();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TAB__ID = eINSTANCE.getPropertyTab_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TAB__NAME = eINSTANCE.getPropertyTab_Name();

		/**
		 * The meta object literal for the '<em><b>After Tab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TAB__AFTER_TAB = eINSTANCE.getPropertyTab_AfterTab();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PackageImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Gen Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__GEN_PACKAGE = eINSTANCE.getPackage_GenPackage();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASSES = eINSTANCE.getPackage_Classes();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__GENERATOR = eINSTANCE.getPackage_Generator();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.ClassImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Gen Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GEN_CLASS = eINSTANCE.getClass_GenClass();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PACKAGE = eINSTANCE.getClass_Package();

		/**
		 * The meta object literal for the '<em><b>Ordered Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ORDERED_ELEMENTS = eINSTANCE.getClass_OrderedElements();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASSES = eINSTANCE.getClass_SuperClasses();

		/**
		 * The meta object literal for the '<em><b>All Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ALL_SUPER_CLASSES = eINSTANCE.getClass_AllSuperClasses();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

		/**
		 * The meta object literal for the '<em><b>Base Insert Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__BASE_INSERT_POINTS = eINSTANCE.getClass_BaseInsertPoints();

		/**
		 * The meta object literal for the '<em><b>Property Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTY_CATEGORIES = eINSTANCE.getClass_PropertyCategories();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.OrderedElementImpl <em>Ordered Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.OrderedElementImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getOrderedElement()
		 * @generated
		 */
		EClass ORDERED_ELEMENT = eINSTANCE.getOrderedElement();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_ELEMENT__CLAZZ = eINSTANCE.getOrderedElement_Clazz();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.BaseInsertPointImpl <em>Base Insert Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.BaseInsertPointImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getBaseInsertPoint()
		 * @generated
		 */
		EClass BASE_INSERT_POINT = eINSTANCE.getBaseInsertPoint();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_INSERT_POINT__BASE_CLASS = eINSTANCE.getBaseInsertPoint_BaseClass();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.PropertyCategoryImpl <em>Property Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PropertyCategoryImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyCategory()
		 * @generated
		 */
		EClass PROPERTY_CATEGORY = eINSTANCE.getPropertyCategory();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CATEGORY__TITLE = eINSTANCE.getPropertyCategory_Title();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CATEGORY__VERTICAL = eINSTANCE.getPropertyCategory_Vertical();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CATEGORY__OPEN = eINSTANCE.getPropertyCategory_Open();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CATEGORY__PROPERTIES = eINSTANCE.getPropertyCategory_Properties();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PropertyImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Gen Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__GEN_FEATURE = eINSTANCE.getProperty_GenFeature();

		/**
		 * The meta object literal for the '<em><b>Visibility Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VISIBILITY_FILTERS = eINSTANCE.getProperty_VisibilityFilters();

		/**
		 * The meta object literal for the '<em><b>Read Only Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__READ_ONLY_FILTERS = eINSTANCE.getProperty_ReadOnlyFilters();

		/**
		 * The meta object literal for the '<em><b>Tab</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TAB = eINSTANCE.getProperty_Tab();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__EDITOR = eINSTANCE.getProperty_Editor();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TOOLTIP = eINSTANCE.getProperty_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Reconcile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__RECONCILE = eINSTANCE.getProperty_Reconcile();

		/**
		 * The meta object literal for the '<em><b>Creation Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CREATION_CONSTRAINT = eINSTANCE.getProperty_CreationConstraint();

		/**
		 * The meta object literal for the '<em><b>Creation Opposite Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CREATION_OPPOSITE_CONSTRAINT = eINSTANCE.getProperty_CreationOppositeConstraint();

		/**
		 * The meta object literal for the '<em><b>Initialize OCL Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__INITIALIZE_OCL_EXPRESSION = eINSTANCE.getProperty_InitializeOCLExpression();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.PropertyEditorImpl <em>Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.PropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getPropertyEditor()
		 * @generated
		 */
		EClass PROPERTY_EDITOR = eINSTANCE.getPropertyEditor();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_EDITOR__PROPERTY = eINSTANCE.getPropertyEditor_Property();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.TextPropertyEditorImpl <em>Text Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.TextPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getTextPropertyEditor()
		 * @generated
		 */
		EClass TEXT_PROPERTY_EDITOR = eINSTANCE.getTextPropertyEditor();

		/**
		 * The meta object literal for the '<em><b>Multi Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PROPERTY_EDITOR__MULTI_LINE = eINSTANCE.getTextPropertyEditor_MultiLine();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.SpinnerPropertyEditorImpl <em>Spinner Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.SpinnerPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getSpinnerPropertyEditor()
		 * @generated
		 */
		EClass SPINNER_PROPERTY_EDITOR = eINSTANCE.getSpinnerPropertyEditor();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPINNER_PROPERTY_EDITOR__DIGITS = eINSTANCE.getSpinnerPropertyEditor_Digits();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.ComboBoxPropertyEditorImpl <em>Combo Box Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.ComboBoxPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getComboBoxPropertyEditor()
		 * @generated
		 */
		EClass COMBO_BOX_PROPERTY_EDITOR = eINSTANCE.getComboBoxPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.CheckboxPropertyEditorImpl <em>Checkbox Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.CheckboxPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getCheckboxPropertyEditor()
		 * @generated
		 */
		EClass CHECKBOX_PROPERTY_EDITOR = eINSTANCE.getCheckboxPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.RadioPropertyEditorImpl <em>Radio Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.RadioPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getRadioPropertyEditor()
		 * @generated
		 */
		EClass RADIO_PROPERTY_EDITOR = eINSTANCE.getRadioPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.ListPropertyEditorImpl <em>List Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.ListPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getListPropertyEditor()
		 * @generated
		 */
		EClass LIST_PROPERTY_EDITOR = eINSTANCE.getListPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.FlattenedListPropertyEditorImpl <em>Flattened List Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.FlattenedListPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getFlattenedListPropertyEditor()
		 * @generated
		 */
		EClass FLATTENED_LIST_PROPERTY_EDITOR = eINSTANCE.getFlattenedListPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.ObjectPropertyEditorImpl <em>Object Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.ObjectPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getObjectPropertyEditor()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_EDITOR = eINSTANCE.getObjectPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.OCLPropertyEditorImpl <em>OCL Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.OCLPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getOCLPropertyEditor()
		 * @generated
		 */
		EClass OCL_PROPERTY_EDITOR = eINSTANCE.getOCLPropertyEditor();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.CustomPropertyEditorImpl <em>Custom Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.CustomPropertyEditorImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getCustomPropertyEditor()
		 * @generated
		 */
		EClass CUSTOM_PROPERTY_EDITOR = eINSTANCE.getCustomPropertyEditor();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE.getCustomPropertyEditor_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.FilterImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.OCLFilterImpl <em>OCL Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.OCLFilterImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getOCLFilter()
		 * @generated
		 */
		EClass OCL_FILTER = eINSTANCE.getOCLFilter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_FILTER__EXPRESSION = eINSTANCE.getOCLFilter_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.ape.impl.CreationConstraintImpl <em>Creation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.impl.CreationConstraintImpl
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getCreationConstraint()
		 * @generated
		 */
		EClass CREATION_CONSTRAINT = eINSTANCE.getCreationConstraint();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION_CONSTRAINT__FILTERS = eINSTANCE.getCreationConstraint_Filters();

		/**
		 * The meta object literal for the '{@link org.muml.ape.TransformationPosition <em>Transformation Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.ape.TransformationPosition
		 * @see org.muml.ape.impl.PropertiesPackageImpl#getTransformationPosition()
		 * @generated
		 */
		EEnum TRANSFORMATION_POSITION = eINSTANCE.getTransformationPosition();

	}

} //PropertiesPackage

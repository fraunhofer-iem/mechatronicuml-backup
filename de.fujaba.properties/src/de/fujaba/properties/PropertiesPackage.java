/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fujaba.properties.PropertiesFactory
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
	String eNAME = "properties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.fujaba.properties/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fujaba";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesPackage eINSTANCE = de.fujaba.properties.impl.PropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyGeneratorImpl <em>Property Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyGeneratorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyGenerator()
	 * @generated
	 */
	int PROPERTY_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__PLUGIN = 1;

	/**
	 * The feature id for the '<em><b>Default Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__DEFAULT_TAB = 2;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__TABS = 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__PACKAGES = 4;

	/**
	 * The feature id for the '<em><b>Contributor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__CONTRIBUTOR_ID = 5;

	/**
	 * The feature id for the '<em><b>Source Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__SOURCE_FOLDER = 6;

	/**
	 * The feature id for the '<em><b>Prereconcile Qvto Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__PRERECONCILE_QVTO_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Postreconcile Qvto Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR__POSTRECONCILE_QVTO_TRANSFORMATION = 8;

	/**
	 * The number of structural features of the '<em>Property Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PluginImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Required Bundles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__REQUIRED_BUNDLES = 2;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyTabImpl <em>Property Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyTabImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyTab()
	 * @generated
	 */
	int PROPERTY_TAB = 2;

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
	 * The meta object id for the '{@link de.fujaba.properties.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PackageImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

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
	 * The meta object id for the '{@link de.fujaba.properties.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.ClassImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GEN_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FILTERS = 1;

	/**
	 * The feature id for the '<em><b>Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TAB = 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SECTION = 3;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TOOLTIP = 4;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLAZZ = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertySectionImpl <em>Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertySection()
	 * @generated
	 */
	int PROPERTY_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SECTION__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.TextPropertySectionImpl <em>Text Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.TextPropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getTextPropertySection()
	 * @generated
	 */
	int TEXT_PROPERTY_SECTION = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROPERTY_SECTION__PROPERTY = PROPERTY_SECTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROPERTY_SECTION__MULTI_LINE = PROPERTY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PROPERTY_SECTION_FEATURE_COUNT = PROPERTY_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.ComboBoxPropertySectionImpl <em>Combo Box Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.ComboBoxPropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getComboBoxPropertySection()
	 * @generated
	 */
	int COMBO_BOX_PROPERTY_SECTION = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_PROPERTY_SECTION__PROPERTY = PROPERTY_SECTION__PROPERTY;

	/**
	 * The number of structural features of the '<em>Combo Box Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_PROPERTY_SECTION_FEATURE_COUNT = PROPERTY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.RadioPropertySectionImpl <em>Radio Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.RadioPropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getRadioPropertySection()
	 * @generated
	 */
	int RADIO_PROPERTY_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_PROPERTY_SECTION__PROPERTY = PROPERTY_SECTION__PROPERTY;

	/**
	 * The number of structural features of the '<em>Radio Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_PROPERTY_SECTION_FEATURE_COUNT = PROPERTY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.ListPropertySectionImpl <em>List Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.ListPropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getListPropertySection()
	 * @generated
	 */
	int LIST_PROPERTY_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_SECTION__PROPERTY = PROPERTY_SECTION__PROPERTY;

	/**
	 * The number of structural features of the '<em>List Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_SECTION_FEATURE_COUNT = PROPERTY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.GroupPropertySectionImpl <em>Group Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.GroupPropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getGroupPropertySection()
	 * @generated
	 */
	int GROUP_PROPERTY_SECTION = 11;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPERTY_SECTION__PROPERTY = PROPERTY_SECTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Referenced Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES = PROPERTY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPERTY_SECTION_FEATURE_COUNT = PROPERTY_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.CustomPropertySectionImpl <em>Custom Property Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.CustomPropertySectionImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getCustomPropertySection()
	 * @generated
	 */
	int CUSTOM_PROPERTY_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_SECTION__PROPERTY = PROPERTY_SECTION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_SECTION__FULLY_QUALIFIED_CLASS_NAME = PROPERTY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Property Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_SECTION_FEATURE_COUNT = PROPERTY_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyFilterImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyFilter()
	 * @generated
	 */
	int PROPERTY_FILTER = 13;

	/**
	 * The number of structural features of the '<em>Property Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.OCLPropertyFilterImpl <em>OCL Property Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.OCLPropertyFilterImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getOCLPropertyFilter()
	 * @generated
	 */
	int OCL_PROPERTY_FILTER = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_FILTER__EXPRESSION = PROPERTY_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Property Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_FILTER_FEATURE_COUNT = PROPERTY_FILTER_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyReferenceImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyReference()
	 * @generated
	 */
	int PROPERTY_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.PropertyGenerator <em>Property Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Generator</em>'.
	 * @see de.fujaba.properties.PropertyGenerator
	 * @generated
	 */
	EClass getPropertyGenerator();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.PropertyGenerator#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Model</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getGenModel()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_GenModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.fujaba.properties.PropertyGenerator#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getPlugin()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Plugin();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.PropertyGenerator#getDefaultTab <em>Default Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Tab</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getDefaultTab()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_DefaultTab();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fujaba.properties.PropertyGenerator#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getTabs()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Tabs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fujaba.properties.PropertyGenerator#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getPackages()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EReference getPropertyGenerator_Packages();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyGenerator#getContributorId <em>Contributor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributor Id</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getContributorId()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EAttribute getPropertyGenerator_ContributorId();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyGenerator#getSourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Folder</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getSourceFolder()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EAttribute getPropertyGenerator_SourceFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyGenerator#getPrereconcileQvtoTransformation <em>Prereconcile Qvto Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prereconcile Qvto Transformation</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getPrereconcileQvtoTransformation()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EAttribute getPropertyGenerator_PrereconcileQvtoTransformation();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyGenerator#getPostreconcileQvtoTransformation <em>Postreconcile Qvto Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postreconcile Qvto Transformation</em>'.
	 * @see de.fujaba.properties.PropertyGenerator#getPostreconcileQvtoTransformation()
	 * @see #getPropertyGenerator()
	 * @generated
	 */
	EAttribute getPropertyGenerator_PostreconcileQvtoTransformation();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see de.fujaba.properties.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.Plugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fujaba.properties.Plugin#getName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.Plugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.fujaba.properties.Plugin#getVersion()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Version();

	/**
	 * Returns the meta object for the attribute list '{@link de.fujaba.properties.Plugin#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Bundles</em>'.
	 * @see de.fujaba.properties.Plugin#getRequiredBundles()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_RequiredBundles();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.PropertyTab <em>Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Tab</em>'.
	 * @see de.fujaba.properties.PropertyTab
	 * @generated
	 */
	EClass getPropertyTab();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyTab#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.fujaba.properties.PropertyTab#getId()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EAttribute getPropertyTab_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyTab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fujaba.properties.PropertyTab#getName()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EAttribute getPropertyTab_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyTab#getAfterTab <em>After Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Tab</em>'.
	 * @see de.fujaba.properties.PropertyTab#getAfterTab()
	 * @see #getPropertyTab()
	 * @generated
	 */
	EAttribute getPropertyTab_AfterTab();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.fujaba.properties.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.Package#getGenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Package</em>'.
	 * @see de.fujaba.properties.Package#getGenPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_GenPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fujaba.properties.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see de.fujaba.properties.Package#getClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Classes();

	/**
	 * Returns the meta object for the container reference '{@link de.fujaba.properties.Package#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generator</em>'.
	 * @see de.fujaba.properties.Package#getGenerator()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Generator();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see de.fujaba.properties.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.Class#getGenClass <em>Gen Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Class</em>'.
	 * @see de.fujaba.properties.Class#getGenClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GenClass();

	/**
	 * Returns the meta object for the container reference '{@link de.fujaba.properties.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see de.fujaba.properties.Class#getPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fujaba.properties.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see de.fujaba.properties.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.fujaba.properties.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.Property#getGenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Feature</em>'.
	 * @see de.fujaba.properties.Property#getGenFeature()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_GenFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fujaba.properties.Property#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see de.fujaba.properties.Property#getFilters()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Filters();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.Property#getTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tab</em>'.
	 * @see de.fujaba.properties.Property#getTab()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Tab();

	/**
	 * Returns the meta object for the containment reference '{@link de.fujaba.properties.Property#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section</em>'.
	 * @see de.fujaba.properties.Property#getSection()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Section();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.Property#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see de.fujaba.properties.Property#getTooltip()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Tooltip();

	/**
	 * Returns the meta object for the container reference '{@link de.fujaba.properties.Property#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Clazz</em>'.
	 * @see de.fujaba.properties.Property#getClazz()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Clazz();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.PropertySection <em>Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Section</em>'.
	 * @see de.fujaba.properties.PropertySection
	 * @generated
	 */
	EClass getPropertySection();

	/**
	 * Returns the meta object for the container reference '{@link de.fujaba.properties.PropertySection#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Property</em>'.
	 * @see de.fujaba.properties.PropertySection#getProperty()
	 * @see #getPropertySection()
	 * @generated
	 */
	EReference getPropertySection_Property();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.TextPropertySection <em>Text Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Property Section</em>'.
	 * @see de.fujaba.properties.TextPropertySection
	 * @generated
	 */
	EClass getTextPropertySection();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.TextPropertySection#isMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see de.fujaba.properties.TextPropertySection#isMultiLine()
	 * @see #getTextPropertySection()
	 * @generated
	 */
	EAttribute getTextPropertySection_MultiLine();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.ComboBoxPropertySection <em>Combo Box Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box Property Section</em>'.
	 * @see de.fujaba.properties.ComboBoxPropertySection
	 * @generated
	 */
	EClass getComboBoxPropertySection();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.RadioPropertySection <em>Radio Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Property Section</em>'.
	 * @see de.fujaba.properties.RadioPropertySection
	 * @generated
	 */
	EClass getRadioPropertySection();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.ListPropertySection <em>List Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property Section</em>'.
	 * @see de.fujaba.properties.ListPropertySection
	 * @generated
	 */
	EClass getListPropertySection();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.GroupPropertySection <em>Group Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Property Section</em>'.
	 * @see de.fujaba.properties.GroupPropertySection
	 * @generated
	 */
	EClass getGroupPropertySection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fujaba.properties.GroupPropertySection#getReferencedProperties <em>Referenced Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Properties</em>'.
	 * @see de.fujaba.properties.GroupPropertySection#getReferencedProperties()
	 * @see #getGroupPropertySection()
	 * @generated
	 */
	EReference getGroupPropertySection_ReferencedProperties();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.CustomPropertySection <em>Custom Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property Section</em>'.
	 * @see de.fujaba.properties.CustomPropertySection
	 * @generated
	 */
	EClass getCustomPropertySection();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.CustomPropertySection#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Class Name</em>'.
	 * @see de.fujaba.properties.CustomPropertySection#getFullyQualifiedClassName()
	 * @see #getCustomPropertySection()
	 * @generated
	 */
	EAttribute getCustomPropertySection_FullyQualifiedClassName();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.PropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Filter</em>'.
	 * @see de.fujaba.properties.PropertyFilter
	 * @generated
	 */
	EClass getPropertyFilter();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.OCLPropertyFilter <em>OCL Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Property Filter</em>'.
	 * @see de.fujaba.properties.OCLPropertyFilter
	 * @generated
	 */
	EClass getOCLPropertyFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.OCLPropertyFilter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.fujaba.properties.OCLPropertyFilter#getExpression()
	 * @see #getOCLPropertyFilter()
	 * @generated
	 */
	EAttribute getOCLPropertyFilter_Expression();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Reference</em>'.
	 * @see de.fujaba.properties.PropertyReference
	 * @generated
	 */
	EClass getPropertyReference();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.PropertyReference#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see de.fujaba.properties.PropertyReference#isActive()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EAttribute getPropertyReference_Active();

	/**
	 * Returns the meta object for the reference '{@link de.fujaba.properties.PropertyReference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see de.fujaba.properties.PropertyReference#getProperty()
	 * @see #getPropertyReference()
	 * @generated
	 */
	EReference getPropertyReference_Property();

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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertyGeneratorImpl <em>Property Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertyGeneratorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyGenerator()
		 * @generated
		 */
		EClass PROPERTY_GENERATOR = eINSTANCE.getPropertyGenerator();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_GENERATOR__GEN_MODEL = eINSTANCE.getPropertyGenerator_GenModel();

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
		 * The meta object literal for the '<em><b>Prereconcile Qvto Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GENERATOR__PRERECONCILE_QVTO_TRANSFORMATION = eINSTANCE.getPropertyGenerator_PrereconcileQvtoTransformation();

		/**
		 * The meta object literal for the '<em><b>Postreconcile Qvto Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GENERATOR__POSTRECONCILE_QVTO_TRANSFORMATION = eINSTANCE.getPropertyGenerator_PostreconcileQvtoTransformation();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PluginImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__NAME = eINSTANCE.getPlugin_Name();

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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertyTabImpl <em>Property Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertyTabImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyTab()
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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PackageImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPackage()
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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.ClassImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getClass_()
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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertyImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getProperty()
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
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__FILTERS = eINSTANCE.getProperty_Filters();

		/**
		 * The meta object literal for the '<em><b>Tab</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TAB = eINSTANCE.getProperty_Tab();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SECTION = eINSTANCE.getProperty_Section();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TOOLTIP = eINSTANCE.getProperty_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CLAZZ = eINSTANCE.getProperty_Clazz();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertySectionImpl <em>Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertySection()
		 * @generated
		 */
		EClass PROPERTY_SECTION = eINSTANCE.getPropertySection();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SECTION__PROPERTY = eINSTANCE.getPropertySection_Property();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.TextPropertySectionImpl <em>Text Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.TextPropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getTextPropertySection()
		 * @generated
		 */
		EClass TEXT_PROPERTY_SECTION = eINSTANCE.getTextPropertySection();

		/**
		 * The meta object literal for the '<em><b>Multi Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PROPERTY_SECTION__MULTI_LINE = eINSTANCE.getTextPropertySection_MultiLine();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.ComboBoxPropertySectionImpl <em>Combo Box Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.ComboBoxPropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getComboBoxPropertySection()
		 * @generated
		 */
		EClass COMBO_BOX_PROPERTY_SECTION = eINSTANCE.getComboBoxPropertySection();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.RadioPropertySectionImpl <em>Radio Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.RadioPropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getRadioPropertySection()
		 * @generated
		 */
		EClass RADIO_PROPERTY_SECTION = eINSTANCE.getRadioPropertySection();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.ListPropertySectionImpl <em>List Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.ListPropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getListPropertySection()
		 * @generated
		 */
		EClass LIST_PROPERTY_SECTION = eINSTANCE.getListPropertySection();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.GroupPropertySectionImpl <em>Group Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.GroupPropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getGroupPropertySection()
		 * @generated
		 */
		EClass GROUP_PROPERTY_SECTION = eINSTANCE.getGroupPropertySection();

		/**
		 * The meta object literal for the '<em><b>Referenced Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES = eINSTANCE.getGroupPropertySection_ReferencedProperties();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.CustomPropertySectionImpl <em>Custom Property Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.CustomPropertySectionImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getCustomPropertySection()
		 * @generated
		 */
		EClass CUSTOM_PROPERTY_SECTION = eINSTANCE.getCustomPropertySection();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROPERTY_SECTION__FULLY_QUALIFIED_CLASS_NAME = eINSTANCE.getCustomPropertySection_FullyQualifiedClassName();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertyFilterImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyFilter()
		 * @generated
		 */
		EClass PROPERTY_FILTER = eINSTANCE.getPropertyFilter();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.OCLPropertyFilterImpl <em>OCL Property Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.OCLPropertyFilterImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getOCLPropertyFilter()
		 * @generated
		 */
		EClass OCL_PROPERTY_FILTER = eINSTANCE.getOCLPropertyFilter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_PROPERTY_FILTER__EXPRESSION = eINSTANCE.getOCLPropertyFilter_Expression();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertyReferenceImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyReference()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REFERENCE__ACTIVE = eINSTANCE.getPropertyReference_Active();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REFERENCE__PROPERTY = eINSTANCE.getPropertyReference_Property();

	}

} //PropertiesPackage

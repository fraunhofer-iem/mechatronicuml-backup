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
	 * The number of structural features of the '<em>Property Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GENERATOR_FEATURE_COUNT = 6;

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
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Editor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EDITOR = 3;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TOOLTIP = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyEditorImpl <em>Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyEditorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyEditor()
	 * @generated
	 */
	int PROPERTY_EDITOR = 6;

	/**
	 * The number of structural features of the '<em>Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.TextPropertyEditorImpl <em>Text Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.TextPropertyEditorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getTextPropertyEditor()
	 * @generated
	 */
	int TEXT_PROPERTY_EDITOR = 7;

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
	 * The meta object id for the '{@link de.fujaba.properties.impl.ComboBoxPropertyEditorImpl <em>Combo Box Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.ComboBoxPropertyEditorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getComboBoxPropertyEditor()
	 * @generated
	 */
	int COMBO_BOX_PROPERTY_EDITOR = 8;

	/**
	 * The number of structural features of the '<em>Combo Box Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.RadioPropertyEditorImpl <em>Radio Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.RadioPropertyEditorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getRadioPropertyEditor()
	 * @generated
	 */
	int RADIO_PROPERTY_EDITOR = 9;

	/**
	 * The number of structural features of the '<em>Radio Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.ListPropertyEditorImpl <em>List Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.ListPropertyEditorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getListPropertyEditor()
	 * @generated
	 */
	int LIST_PROPERTY_EDITOR = 10;

	/**
	 * The number of structural features of the '<em>List Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.fujaba.properties.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.PropertyFilterImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyFilter()
	 * @generated
	 */
	int PROPERTY_FILTER = 11;

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
	int OCL_PROPERTY_FILTER = 12;

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
	 * The meta object id for the '{@link de.fujaba.properties.impl.GroupPropertyEditorImpl <em>Group Property Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fujaba.properties.impl.GroupPropertyEditorImpl
	 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getGroupPropertyEditor()
	 * @generated
	 */
	int GROUP_PROPERTY_EDITOR = 13;

	/**
	 * The feature id for the '<em><b>Navigated Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES = PROPERTY_EDITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Property Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PROPERTY_EDITOR_FEATURE_COUNT = PROPERTY_EDITOR_FEATURE_COUNT + 1;


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
	 * Returns the meta object for the containment reference '{@link de.fujaba.properties.Property#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editor</em>'.
	 * @see de.fujaba.properties.Property#getEditor()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Editor();

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
	 * Returns the meta object for class '{@link de.fujaba.properties.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Editor</em>'.
	 * @see de.fujaba.properties.PropertyEditor
	 * @generated
	 */
	EClass getPropertyEditor();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.TextPropertyEditor <em>Text Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Property Editor</em>'.
	 * @see de.fujaba.properties.TextPropertyEditor
	 * @generated
	 */
	EClass getTextPropertyEditor();

	/**
	 * Returns the meta object for the attribute '{@link de.fujaba.properties.TextPropertyEditor#isMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see de.fujaba.properties.TextPropertyEditor#isMultiLine()
	 * @see #getTextPropertyEditor()
	 * @generated
	 */
	EAttribute getTextPropertyEditor_MultiLine();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.ComboBoxPropertyEditor <em>Combo Box Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box Property Editor</em>'.
	 * @see de.fujaba.properties.ComboBoxPropertyEditor
	 * @generated
	 */
	EClass getComboBoxPropertyEditor();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.RadioPropertyEditor <em>Radio Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Property Editor</em>'.
	 * @see de.fujaba.properties.RadioPropertyEditor
	 * @generated
	 */
	EClass getRadioPropertyEditor();

	/**
	 * Returns the meta object for class '{@link de.fujaba.properties.ListPropertyEditor <em>List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property Editor</em>'.
	 * @see de.fujaba.properties.ListPropertyEditor
	 * @generated
	 */
	EClass getListPropertyEditor();

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
	 * Returns the meta object for class '{@link de.fujaba.properties.GroupPropertyEditor <em>Group Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Property Editor</em>'.
	 * @see de.fujaba.properties.GroupPropertyEditor
	 * @generated
	 */
	EClass getGroupPropertyEditor();

	/**
	 * Returns the meta object for the reference list '{@link de.fujaba.properties.GroupPropertyEditor#getNavigatedProperties <em>Navigated Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Navigated Properties</em>'.
	 * @see de.fujaba.properties.GroupPropertyEditor#getNavigatedProperties()
	 * @see #getGroupPropertyEditor()
	 * @generated
	 */
	EReference getGroupPropertyEditor_NavigatedProperties();

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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.PropertyEditorImpl <em>Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.PropertyEditorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getPropertyEditor()
		 * @generated
		 */
		EClass PROPERTY_EDITOR = eINSTANCE.getPropertyEditor();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.TextPropertyEditorImpl <em>Text Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.TextPropertyEditorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getTextPropertyEditor()
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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.ComboBoxPropertyEditorImpl <em>Combo Box Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.ComboBoxPropertyEditorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getComboBoxPropertyEditor()
		 * @generated
		 */
		EClass COMBO_BOX_PROPERTY_EDITOR = eINSTANCE.getComboBoxPropertyEditor();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.RadioPropertyEditorImpl <em>Radio Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.RadioPropertyEditorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getRadioPropertyEditor()
		 * @generated
		 */
		EClass RADIO_PROPERTY_EDITOR = eINSTANCE.getRadioPropertyEditor();

		/**
		 * The meta object literal for the '{@link de.fujaba.properties.impl.ListPropertyEditorImpl <em>List Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.ListPropertyEditorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getListPropertyEditor()
		 * @generated
		 */
		EClass LIST_PROPERTY_EDITOR = eINSTANCE.getListPropertyEditor();

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
		 * The meta object literal for the '{@link de.fujaba.properties.impl.GroupPropertyEditorImpl <em>Group Property Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fujaba.properties.impl.GroupPropertyEditorImpl
		 * @see de.fujaba.properties.impl.PropertiesPackageImpl#getGroupPropertyEditor()
		 * @generated
		 */
		EClass GROUP_PROPERTY_EDITOR = eINSTANCE.getGroupPropertyEditor();

		/**
		 * The meta object literal for the '<em><b>Navigated Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_PROPERTY_EDITOR__NAVIGATED_PROPERTIES = eINSTANCE.getGroupPropertyEditor_NavigatedProperties();

	}

} //PropertiesPackage

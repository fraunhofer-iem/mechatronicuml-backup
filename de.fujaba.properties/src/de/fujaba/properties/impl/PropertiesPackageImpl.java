/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.impl;

import de.fujaba.properties.CheckboxPropertySection;
import static de.fujaba.properties.PropertiesPackage.CLASS;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.fujaba.properties.ComboBoxPropertySection;
import de.fujaba.properties.CustomPropertySection;
import de.fujaba.properties.GroupPropertySection;
import de.fujaba.properties.ListPropertySection;
import de.fujaba.properties.OCLPropertyFilter;
import de.fujaba.properties.Plugin;
import de.fujaba.properties.PropertiesFactory;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyCategory;
import de.fujaba.properties.PropertyFilter;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.PropertyReference;
import de.fujaba.properties.PropertySection;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertySection;
import de.fujaba.properties.TextPropertySection;
import de.fujaba.properties.util.PropertiesValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesPackageImpl extends EPackageImpl implements PropertiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPropertySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPropertyFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.fujaba.properties.PropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertiesPackageImpl() {
		super(eNS_URI, PropertiesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertiesPackage init() {
		if (isInited) return (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

		// Obtain or create and register package
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePropertiesPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePropertiesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PropertiesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertiesPackage.eNS_URI, thePropertiesPackage);
		return thePropertiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyGenerator() {
		return propertyGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_GenModel() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_ReferencedGenerators() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Plugin() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_DefaultTab() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Tabs() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Packages() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGenerator_ContributorId() {
		return (EAttribute)propertyGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGenerator_SourceFolder() {
		return (EAttribute)propertyGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGenerator_PrereconcileQvtoTransformation() {
		return (EAttribute)propertyGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGenerator_PostreconcileQvtoTransformation() {
		return (EAttribute)propertyGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Name() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Version() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_RequiredBundles() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyTab() {
		return propertyTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTab_Id() {
		return (EAttribute)propertyTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTab_Name() {
		return (EAttribute)propertyTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTab_AfterTab() {
		return (EAttribute)propertyTabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_GenPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Classes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Generator() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GenClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Package() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Properties() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_PropertyCategories() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCategory() {
		return propertyCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCategory_Title() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCategory_Vertical() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCategory_Properties() {
		return (EReference)propertyCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_GenFeature() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Filters() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Tab() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Section() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Tooltip() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Clazz() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Category() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertySection() {
		return propertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertySection_Property() {
		return (EReference)propertySectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPropertySection() {
		return textPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPropertySection_MultiLine() {
		return (EAttribute)textPropertySectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBoxPropertySection() {
		return comboBoxPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckboxPropertySection() {
		return checkboxPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioPropertySection() {
		return radioPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListPropertySection() {
		return listPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupPropertySection() {
		return groupPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPropertySection_ReferencedProperties() {
		return (EReference)groupPropertySectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomPropertySection() {
		return customPropertySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomPropertySection_FullyQualifiedClassName() {
		return (EAttribute)customPropertySectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFilter() {
		return propertyFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPropertyFilter() {
		return oclPropertyFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLPropertyFilter_Expression() {
		return (EAttribute)oclPropertyFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyReference() {
		return propertyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyReference_Active() {
		return (EAttribute)propertyReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyReference_Property() {
		return (EReference)propertyReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactory getPropertiesFactory() {
		return (PropertiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		propertyGeneratorEClass = createEClass(PROPERTY_GENERATOR);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__GEN_MODEL);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__REFERENCED_GENERATORS);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__PLUGIN);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__DEFAULT_TAB);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__TABS);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__PACKAGES);
		createEAttribute(propertyGeneratorEClass, PROPERTY_GENERATOR__CONTRIBUTOR_ID);
		createEAttribute(propertyGeneratorEClass, PROPERTY_GENERATOR__SOURCE_FOLDER);
		createEAttribute(propertyGeneratorEClass, PROPERTY_GENERATOR__PRERECONCILE_QVTO_TRANSFORMATION);
		createEAttribute(propertyGeneratorEClass, PROPERTY_GENERATOR__POSTRECONCILE_QVTO_TRANSFORMATION);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__NAME);
		createEAttribute(pluginEClass, PLUGIN__VERSION);
		createEAttribute(pluginEClass, PLUGIN__REQUIRED_BUNDLES);

		propertyTabEClass = createEClass(PROPERTY_TAB);
		createEAttribute(propertyTabEClass, PROPERTY_TAB__ID);
		createEAttribute(propertyTabEClass, PROPERTY_TAB__NAME);
		createEAttribute(propertyTabEClass, PROPERTY_TAB__AFTER_TAB);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__GEN_PACKAGE);
		createEReference(packageEClass, PACKAGE__CLASSES);
		createEReference(packageEClass, PACKAGE__GENERATOR);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__GEN_CLASS);
		createEReference(classEClass, CLASS__PACKAGE);
		createEReference(classEClass, CLASS__PROPERTIES);
		createEReference(classEClass, CLASS__PROPERTY_CATEGORIES);

		propertyCategoryEClass = createEClass(PROPERTY_CATEGORY);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__TITLE);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__VERTICAL);
		createEReference(propertyCategoryEClass, PROPERTY_CATEGORY__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__GEN_FEATURE);
		createEReference(propertyEClass, PROPERTY__FILTERS);
		createEReference(propertyEClass, PROPERTY__TAB);
		createEReference(propertyEClass, PROPERTY__SECTION);
		createEAttribute(propertyEClass, PROPERTY__TOOLTIP);
		createEReference(propertyEClass, PROPERTY__CLAZZ);
		createEReference(propertyEClass, PROPERTY__CATEGORY);

		propertySectionEClass = createEClass(PROPERTY_SECTION);
		createEReference(propertySectionEClass, PROPERTY_SECTION__PROPERTY);

		textPropertySectionEClass = createEClass(TEXT_PROPERTY_SECTION);
		createEAttribute(textPropertySectionEClass, TEXT_PROPERTY_SECTION__MULTI_LINE);

		comboBoxPropertySectionEClass = createEClass(COMBO_BOX_PROPERTY_SECTION);

		checkboxPropertySectionEClass = createEClass(CHECKBOX_PROPERTY_SECTION);

		radioPropertySectionEClass = createEClass(RADIO_PROPERTY_SECTION);

		listPropertySectionEClass = createEClass(LIST_PROPERTY_SECTION);

		groupPropertySectionEClass = createEClass(GROUP_PROPERTY_SECTION);
		createEReference(groupPropertySectionEClass, GROUP_PROPERTY_SECTION__REFERENCED_PROPERTIES);

		customPropertySectionEClass = createEClass(CUSTOM_PROPERTY_SECTION);
		createEAttribute(customPropertySectionEClass, CUSTOM_PROPERTY_SECTION__FULLY_QUALIFIED_CLASS_NAME);

		propertyFilterEClass = createEClass(PROPERTY_FILTER);

		oclPropertyFilterEClass = createEClass(OCL_PROPERTY_FILTER);
		createEAttribute(oclPropertyFilterEClass, OCL_PROPERTY_FILTER__EXPRESSION);

		propertyReferenceEClass = createEClass(PROPERTY_REFERENCE);
		createEAttribute(propertyReferenceEClass, PROPERTY_REFERENCE__ACTIVE);
		createEReference(propertyReferenceEClass, PROPERTY_REFERENCE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		comboBoxPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		checkboxPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		radioPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		listPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		groupPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		customPropertySectionEClass.getESuperTypes().add(this.getPropertySection());
		oclPropertyFilterEClass.getESuperTypes().add(this.getPropertyFilter());

		// Initialize classes and features; add operations and parameters
		initEClass(propertyGeneratorEClass, PropertyGenerator.class, "PropertyGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyGenerator_GenModel(), theGenModelPackage.getGenModel(), null, "genModel", null, 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_ReferencedGenerators(), this.getPropertyGenerator(), null, "referencedGenerators", null, 0, -1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_Plugin(), this.getPlugin(), null, "plugin", null, 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_DefaultTab(), this.getPropertyTab(), null, "defaultTab", null, 0, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_Tabs(), this.getPropertyTab(), null, "tabs", null, 0, -1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_Packages(), this.getPackage(), this.getPackage_Generator(), "packages", null, 0, -1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGenerator_ContributorId(), ecorePackage.getEString(), "contributorId", null, 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGenerator_SourceFolder(), ecorePackage.getEString(), "sourceFolder", "src-gen", 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGenerator_PrereconcileQvtoTransformation(), ecorePackage.getEString(), "prereconcileQvtoTransformation", null, 0, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGenerator_PostreconcileQvtoTransformation(), ecorePackage.getEString(), "postreconcileQvtoTransformation", null, 0, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Version(), theEcorePackage.getEString(), "version", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_RequiredBundles(), theEcorePackage.getEString(), "requiredBundles", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTabEClass, PropertyTab.class, "PropertyTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyTab_Id(), theEcorePackage.getEString(), "id", null, 1, 1, PropertyTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyTab_Name(), theEcorePackage.getEString(), "name", null, 1, 1, PropertyTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyTab_AfterTab(), theEcorePackage.getEString(), "afterTab", null, 0, 1, PropertyTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(propertyTabEClass, theEcorePackage.getEString(), "getQualifiedId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageEClass, de.fujaba.properties.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_GenPackage(), theGenModelPackage.getGenPackage(), null, "genPackage", null, 1, 1, de.fujaba.properties.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Classes(), this.getClass_(), this.getClass_Package(), "classes", null, 0, -1, de.fujaba.properties.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Generator(), this.getPropertyGenerator(), this.getPropertyGenerator_Packages(), "generator", null, 1, 1, de.fujaba.properties.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, de.fujaba.properties.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_GenClass(), theGenModelPackage.getGenClass(), null, "genClass", null, 1, 1, de.fujaba.properties.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Package(), this.getPackage(), this.getPackage_Classes(), "package", null, 1, 1, de.fujaba.properties.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Properties(), this.getProperty(), this.getProperty_Clazz(), "properties", null, 0, -1, de.fujaba.properties.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_PropertyCategories(), this.getPropertyCategory(), null, "propertyCategories", null, 0, -1, de.fujaba.properties.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCategoryEClass, PropertyCategory.class, "PropertyCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyCategory_Title(), theEcorePackage.getEString(), "title", null, 0, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyCategory_Vertical(), theEcorePackage.getEBoolean(), "vertical", "true", 1, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCategory_Properties(), this.getProperty(), this.getProperty_Category(), "properties", null, 0, -1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_GenFeature(), theGenModelPackage.getGenFeature(), null, "genFeature", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Filters(), this.getPropertyFilter(), null, "filters", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Tab(), this.getPropertyTab(), null, "tab", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Section(), this.getPropertySection(), this.getPropertySection_Property(), "section", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Clazz(), this.getClass_(), this.getClass_Properties(), "clazz", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Category(), this.getPropertyCategory(), this.getPropertyCategory_Properties(), "category", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertySectionEClass, PropertySection.class, "PropertySection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertySection_Property(), this.getProperty(), this.getProperty_Section(), "property", null, 1, 1, PropertySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPropertySectionEClass, TextPropertySection.class, "TextPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextPropertySection_MultiLine(), theEcorePackage.getEBoolean(), "multiLine", null, 1, 1, TextPropertySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboBoxPropertySectionEClass, ComboBoxPropertySection.class, "ComboBoxPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkboxPropertySectionEClass, CheckboxPropertySection.class, "CheckboxPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioPropertySectionEClass, RadioPropertySection.class, "RadioPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listPropertySectionEClass, ListPropertySection.class, "ListPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupPropertySectionEClass, GroupPropertySection.class, "GroupPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupPropertySection_ReferencedProperties(), this.getPropertyReference(), null, "referencedProperties", null, 0, -1, GroupPropertySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customPropertySectionEClass, CustomPropertySection.class, "CustomPropertySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomPropertySection_FullyQualifiedClassName(), ecorePackage.getEString(), "fullyQualifiedClassName", null, 1, 1, CustomPropertySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFilterEClass, PropertyFilter.class, "PropertyFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(propertyFilterEClass, ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclPropertyFilterEClass, OCLPropertyFilter.class, "OCLPropertyFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLPropertyFilter_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, OCLPropertyFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyReferenceEClass, PropertyReference.class, "PropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyReference_Active(), ecorePackage.getEBoolean(), "active", null, 1, 1, PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyReference_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });		
		addAnnotation
		  (propertyGeneratorEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniquePackages"
		   });				
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueClasses"
		   });			
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueFeatures"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";				
		addAnnotation
		  (propertyGeneratorEClass, 
		   source, 
		   new String[] {
			 "UniquePackages", "packages->isUnique(genPackage)"
		   });		
		addAnnotation
		  (propertyTabEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derivation", "generator.genModel.modelPluginId.concat(\'.\').concat(id)"
		   });			
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "UniqueClasses", "classes->isUnique(genClass)"
		   });			
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "UniqueFeatures", "properties->isUnique(genFeature)"
		   });
	}

} //PropertiesPackageImpl

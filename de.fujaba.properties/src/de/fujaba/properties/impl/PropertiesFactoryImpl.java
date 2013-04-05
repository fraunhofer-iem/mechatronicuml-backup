/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.fujaba.properties.ComboBoxPropertySection;
import de.fujaba.properties.CustomPropertySection;
import de.fujaba.properties.GroupPropertySection;
import de.fujaba.properties.ListPropertySection;
import de.fujaba.properties.OCLPropertyFilter;
import de.fujaba.properties.Plugin;
import de.fujaba.properties.PropertiesFactory;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertySection;
import de.fujaba.properties.TextPropertySection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesFactoryImpl extends EFactoryImpl implements PropertiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertiesFactory init() {
		try {
			PropertiesFactory thePropertiesFactory = (PropertiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.fujaba.properties/0.1"); 
			if (thePropertiesFactory != null) {
				return thePropertiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PropertiesPackage.PROPERTY_GENERATOR: return createPropertyGenerator();
			case PropertiesPackage.PLUGIN: return createPlugin();
			case PropertiesPackage.PROPERTY_TAB: return createPropertyTab();
			case PropertiesPackage.PACKAGE: return createPackage();
			case PropertiesPackage.CLASS: return createClass();
			case PropertiesPackage.PROPERTY: return createProperty();
			case PropertiesPackage.TEXT_PROPERTY_SECTION: return createTextPropertySection();
			case PropertiesPackage.COMBO_BOX_PROPERTY_SECTION: return createComboBoxPropertySection();
			case PropertiesPackage.RADIO_PROPERTY_SECTION: return createRadioPropertySection();
			case PropertiesPackage.LIST_PROPERTY_SECTION: return createListPropertySection();
			case PropertiesPackage.GROUP_PROPERTY_SECTION: return createGroupPropertySection();
			case PropertiesPackage.CUSTOM_PROPERTY_SECTION: return createCustomPropertySection();
			case PropertiesPackage.OCL_PROPERTY_FILTER: return createOCLPropertyFilter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyGenerator createPropertyGenerator() {
		PropertyGeneratorImpl propertyGenerator = new PropertyGeneratorImpl();
		return propertyGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab createPropertyTab() {
		PropertyTabImpl propertyTab = new PropertyTabImpl();
		return propertyTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.fujaba.properties.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.fujaba.properties.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPropertySection createTextPropertySection() {
		TextPropertySectionImpl textPropertySection = new TextPropertySectionImpl();
		return textPropertySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBoxPropertySection createComboBoxPropertySection() {
		ComboBoxPropertySectionImpl comboBoxPropertySection = new ComboBoxPropertySectionImpl();
		return comboBoxPropertySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioPropertySection createRadioPropertySection() {
		RadioPropertySectionImpl radioPropertySection = new RadioPropertySectionImpl();
		return radioPropertySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListPropertySection createListPropertySection() {
		ListPropertySectionImpl listPropertySection = new ListPropertySectionImpl();
		return listPropertySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupPropertySection createGroupPropertySection() {
		GroupPropertySectionImpl groupPropertySection = new GroupPropertySectionImpl();
		return groupPropertySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPropertySection createCustomPropertySection() {
		CustomPropertySectionImpl customPropertySection = new CustomPropertySectionImpl();
		return customPropertySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLPropertyFilter createOCLPropertyFilter() {
		OCLPropertyFilterImpl oclPropertyFilter = new OCLPropertyFilterImpl();
		return oclPropertyFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesPackage getPropertiesPackage() {
		return (PropertiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertiesPackage getPackage() {
		return PropertiesPackage.eINSTANCE;
	}

} //PropertiesFactoryImpl

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

import de.fujaba.properties.ComboBoxPropertyEditor;
import de.fujaba.properties.GroupPropertyEditor;
import de.fujaba.properties.ListPropertyEditor;
import de.fujaba.properties.OCLPropertyFilter;
import de.fujaba.properties.Plugin;
import de.fujaba.properties.PropertiesFactory;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertyEditor;
import de.fujaba.properties.TextPropertyEditor;

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
			case PropertiesPackage.TEXT_PROPERTY_EDITOR: return createTextPropertyEditor();
			case PropertiesPackage.COMBO_BOX_PROPERTY_EDITOR: return createComboBoxPropertyEditor();
			case PropertiesPackage.RADIO_PROPERTY_EDITOR: return createRadioPropertyEditor();
			case PropertiesPackage.LIST_PROPERTY_EDITOR: return createListPropertyEditor();
			case PropertiesPackage.OCL_PROPERTY_FILTER: return createOCLPropertyFilter();
			case PropertiesPackage.GROUP_PROPERTY_EDITOR: return createGroupPropertyEditor();
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
	public TextPropertyEditor createTextPropertyEditor() {
		TextPropertyEditorImpl textPropertyEditor = new TextPropertyEditorImpl();
		return textPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBoxPropertyEditor createComboBoxPropertyEditor() {
		ComboBoxPropertyEditorImpl comboBoxPropertyEditor = new ComboBoxPropertyEditorImpl();
		return comboBoxPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioPropertyEditor createRadioPropertyEditor() {
		RadioPropertyEditorImpl radioPropertyEditor = new RadioPropertyEditorImpl();
		return radioPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListPropertyEditor createListPropertyEditor() {
		ListPropertyEditorImpl listPropertyEditor = new ListPropertyEditorImpl();
		return listPropertyEditor;
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
	public GroupPropertyEditor createGroupPropertyEditor() {
		GroupPropertyEditorImpl groupPropertyEditor = new GroupPropertyEditorImpl();
		return groupPropertyEditor;
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

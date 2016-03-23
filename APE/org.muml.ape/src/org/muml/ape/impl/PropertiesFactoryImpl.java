/**
 */
package org.muml.ape.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.ape.BaseInsertPoint;
import org.muml.ape.CheckboxPropertyEditor;
import org.muml.ape.ComboBoxPropertyEditor;
import org.muml.ape.CreationConstraint;
import org.muml.ape.CustomPropertyEditor;
import org.muml.ape.CustomTransformation;
import org.muml.ape.FlattenedListPropertyEditor;
import org.muml.ape.ListPropertyEditor;
import org.muml.ape.OCLFilter;
import org.muml.ape.OCLPropertyEditor;
import org.muml.ape.ObjectPropertyEditor;
import org.muml.ape.Plugin;
import org.muml.ape.PropertiesFactory;
import org.muml.ape.PropertiesPackage;
import org.muml.ape.Property;
import org.muml.ape.PropertyCategory;
import org.muml.ape.PropertyGenerator;
import org.muml.ape.PropertyTab;
import org.muml.ape.RadioPropertyEditor;
import org.muml.ape.Reconciler;
import org.muml.ape.SpinnerPropertyEditor;
import org.muml.ape.TextPropertyEditor;
import org.muml.ape.TransformationPosition;

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
			PropertiesFactory thePropertiesFactory = (PropertiesFactory)EPackage.Registry.INSTANCE.getEFactory(PropertiesPackage.eNS_URI);
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
			case PropertiesPackage.RECONCILER: return createReconciler();
			case PropertiesPackage.CUSTOM_TRANSFORMATION: return createCustomTransformation();
			case PropertiesPackage.PLUGIN: return createPlugin();
			case PropertiesPackage.PROPERTY_TAB: return createPropertyTab();
			case PropertiesPackage.PACKAGE: return createPackage();
			case PropertiesPackage.CLASS: return createClass();
			case PropertiesPackage.BASE_INSERT_POINT: return createBaseInsertPoint();
			case PropertiesPackage.PROPERTY: return createProperty();
			case PropertiesPackage.TEXT_PROPERTY_EDITOR: return createTextPropertyEditor();
			case PropertiesPackage.SPINNER_PROPERTY_EDITOR: return createSpinnerPropertyEditor();
			case PropertiesPackage.COMBO_BOX_PROPERTY_EDITOR: return createComboBoxPropertyEditor();
			case PropertiesPackage.CHECKBOX_PROPERTY_EDITOR: return createCheckboxPropertyEditor();
			case PropertiesPackage.RADIO_PROPERTY_EDITOR: return createRadioPropertyEditor();
			case PropertiesPackage.LIST_PROPERTY_EDITOR: return createListPropertyEditor();
			case PropertiesPackage.FLATTENED_LIST_PROPERTY_EDITOR: return createFlattenedListPropertyEditor();
			case PropertiesPackage.OBJECT_PROPERTY_EDITOR: return createObjectPropertyEditor();
			case PropertiesPackage.OCL_PROPERTY_EDITOR: return createOCLPropertyEditor();
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR: return createCustomPropertyEditor();
			case PropertiesPackage.PROPERTY_CATEGORY: return createPropertyCategory();
			case PropertiesPackage.OCL_FILTER: return createOCLFilter();
			case PropertiesPackage.CREATION_CONSTRAINT: return createCreationConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PropertiesPackage.TRANSFORMATION_POSITION:
				return createTransformationPositionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PropertiesPackage.TRANSFORMATION_POSITION:
				return convertTransformationPositionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Reconciler createReconciler() {
		ReconcilerImpl reconciler = new ReconcilerImpl();
		return reconciler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransformation createCustomTransformation() {
		CustomTransformationImpl customTransformation = new CustomTransformationImpl();
		return customTransformation;
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
	public org.muml.ape.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.ape.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseInsertPoint createBaseInsertPoint() {
		BaseInsertPointImpl baseInsertPoint = new BaseInsertPointImpl();
		return baseInsertPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCategory createPropertyCategory() {
		PropertyCategoryImpl propertyCategory = new PropertyCategoryImpl();
		return propertyCategory;
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
	public SpinnerPropertyEditor createSpinnerPropertyEditor() {
		SpinnerPropertyEditorImpl spinnerPropertyEditor = new SpinnerPropertyEditorImpl();
		return spinnerPropertyEditor;
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
	public CheckboxPropertyEditor createCheckboxPropertyEditor() {
		CheckboxPropertyEditorImpl checkboxPropertyEditor = new CheckboxPropertyEditorImpl();
		return checkboxPropertyEditor;
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
	public FlattenedListPropertyEditor createFlattenedListPropertyEditor() {
		FlattenedListPropertyEditorImpl flattenedListPropertyEditor = new FlattenedListPropertyEditorImpl();
		return flattenedListPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyEditor createObjectPropertyEditor() {
		ObjectPropertyEditorImpl objectPropertyEditor = new ObjectPropertyEditorImpl();
		return objectPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLPropertyEditor createOCLPropertyEditor() {
		OCLPropertyEditorImpl oclPropertyEditor = new OCLPropertyEditorImpl();
		return oclPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPropertyEditor createCustomPropertyEditor() {
		CustomPropertyEditorImpl customPropertyEditor = new CustomPropertyEditorImpl();
		return customPropertyEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLFilter createOCLFilter() {
		OCLFilterImpl oclFilter = new OCLFilterImpl();
		return oclFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationConstraint createCreationConstraint() {
		CreationConstraintImpl creationConstraint = new CreationConstraintImpl();
		return creationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationPosition createTransformationPositionFromString(EDataType eDataType, String initialValue) {
		TransformationPosition result = TransformationPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformationPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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

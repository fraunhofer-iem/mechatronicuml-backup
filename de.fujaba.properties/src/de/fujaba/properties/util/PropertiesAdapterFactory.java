/**
 */
package de.fujaba.properties.util;

import de.fujaba.properties.CheckboxPropertyEditor;
import de.fujaba.properties.ComboBoxPropertyEditor;
import de.fujaba.properties.CustomPropertyEditor;
import de.fujaba.properties.ListPropertyEditor;
import de.fujaba.properties.OCLPropertyFilter;
import de.fujaba.properties.ObjectPropertyEditor;
import de.fujaba.properties.Plugin;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyCategory;
import de.fujaba.properties.PropertyEditor;
import de.fujaba.properties.PropertyFilter;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertyEditor;
import de.fujaba.properties.SpinnerPropertyEditor;
import de.fujaba.properties.TextPropertyEditor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fujaba.properties.PropertiesPackage
 * @generated
 */
public class PropertiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PropertiesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesSwitch<Adapter> modelSwitch =
		new PropertiesSwitch<Adapter>() {
			@Override
			public Adapter casePropertyGenerator(PropertyGenerator object) {
				return createPropertyGeneratorAdapter();
			}
			@Override
			public Adapter casePlugin(Plugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter casePropertyTab(PropertyTab object) {
				return createPropertyTabAdapter();
			}
			@Override
			public Adapter casePackage(de.fujaba.properties.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseClass(de.fujaba.properties.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter casePropertyCategory(PropertyCategory object) {
				return createPropertyCategoryAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertyEditor(PropertyEditor object) {
				return createPropertyEditorAdapter();
			}
			@Override
			public Adapter caseTextPropertyEditor(TextPropertyEditor object) {
				return createTextPropertyEditorAdapter();
			}
			@Override
			public Adapter caseSpinnerPropertyEditor(SpinnerPropertyEditor object) {
				return createSpinnerPropertyEditorAdapter();
			}
			@Override
			public Adapter caseComboBoxPropertyEditor(ComboBoxPropertyEditor object) {
				return createComboBoxPropertyEditorAdapter();
			}
			@Override
			public Adapter caseCheckboxPropertyEditor(CheckboxPropertyEditor object) {
				return createCheckboxPropertyEditorAdapter();
			}
			@Override
			public Adapter caseRadioPropertyEditor(RadioPropertyEditor object) {
				return createRadioPropertyEditorAdapter();
			}
			@Override
			public Adapter caseListPropertyEditor(ListPropertyEditor object) {
				return createListPropertyEditorAdapter();
			}
			@Override
			public Adapter caseObjectPropertyEditor(ObjectPropertyEditor object) {
				return createObjectPropertyEditorAdapter();
			}
			@Override
			public Adapter caseCustomPropertyEditor(CustomPropertyEditor object) {
				return createCustomPropertyEditorAdapter();
			}
			@Override
			public Adapter casePropertyFilter(PropertyFilter object) {
				return createPropertyFilterAdapter();
			}
			@Override
			public Adapter caseOCLPropertyFilter(OCLPropertyFilter object) {
				return createOCLPropertyFilterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.PropertyGenerator <em>Property Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.PropertyGenerator
	 * @generated
	 */
	public Adapter createPropertyGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.PropertyTab <em>Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.PropertyTab
	 * @generated
	 */
	public Adapter createPropertyTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.PropertyCategory <em>Property Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.PropertyCategory
	 * @generated
	 */
	public Adapter createPropertyCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.PropertyEditor
	 * @generated
	 */
	public Adapter createPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.TextPropertyEditor <em>Text Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.TextPropertyEditor
	 * @generated
	 */
	public Adapter createTextPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.SpinnerPropertyEditor <em>Spinner Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.SpinnerPropertyEditor
	 * @generated
	 */
	public Adapter createSpinnerPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.ComboBoxPropertyEditor <em>Combo Box Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.ComboBoxPropertyEditor
	 * @generated
	 */
	public Adapter createComboBoxPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.CheckboxPropertyEditor <em>Checkbox Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.CheckboxPropertyEditor
	 * @generated
	 */
	public Adapter createCheckboxPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.RadioPropertyEditor <em>Radio Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.RadioPropertyEditor
	 * @generated
	 */
	public Adapter createRadioPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.ListPropertyEditor <em>List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.ListPropertyEditor
	 * @generated
	 */
	public Adapter createListPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.ObjectPropertyEditor <em>Object Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.ObjectPropertyEditor
	 * @generated
	 */
	public Adapter createObjectPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.CustomPropertyEditor <em>Custom Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.CustomPropertyEditor
	 * @generated
	 */
	public Adapter createCustomPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.PropertyFilter <em>Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.PropertyFilter
	 * @generated
	 */
	public Adapter createPropertyFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.OCLPropertyFilter <em>OCL Property Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.OCLPropertyFilter
	 * @generated
	 */
	public Adapter createOCLPropertyFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PropertiesAdapterFactory

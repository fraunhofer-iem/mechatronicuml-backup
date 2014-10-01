/**
 */
package de.uni_paderborn.fujaba.properties.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.properties.CheckboxPropertyEditor;
import de.uni_paderborn.fujaba.properties.ComboBoxPropertyEditor;
import de.uni_paderborn.fujaba.properties.CreationConstraint;
import de.uni_paderborn.fujaba.properties.CustomPropertyEditor;
import de.uni_paderborn.fujaba.properties.CustomTransformation;
import de.uni_paderborn.fujaba.properties.Filter;
import de.uni_paderborn.fujaba.properties.FlattenedListPropertyEditor;
import de.uni_paderborn.fujaba.properties.ListPropertyEditor;
import de.uni_paderborn.fujaba.properties.OCLFilter;
import de.uni_paderborn.fujaba.properties.OCLPropertyEditor;
import de.uni_paderborn.fujaba.properties.OCLPropertyFilter;
import de.uni_paderborn.fujaba.properties.ObjectPropertyEditor;
import de.uni_paderborn.fujaba.properties.Plugin;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Property;
import de.uni_paderborn.fujaba.properties.PropertyCategory;
import de.uni_paderborn.fujaba.properties.PropertyEditor;
import de.uni_paderborn.fujaba.properties.PropertyFilter;
import de.uni_paderborn.fujaba.properties.PropertyGenerator;
import de.uni_paderborn.fujaba.properties.PropertyTab;
import de.uni_paderborn.fujaba.properties.RadioPropertyEditor;
import de.uni_paderborn.fujaba.properties.Reconciler;
import de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor;
import de.uni_paderborn.fujaba.properties.TextPropertyEditor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage
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
			public Adapter caseReconciler(Reconciler object) {
				return createReconcilerAdapter();
			}
			@Override
			public Adapter caseCustomTransformation(CustomTransformation object) {
				return createCustomTransformationAdapter();
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
			public Adapter casePackage(de.uni_paderborn.fujaba.properties.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseClass(de.uni_paderborn.fujaba.properties.Class object) {
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
			public Adapter caseFlattenedListPropertyEditor(FlattenedListPropertyEditor object) {
				return createFlattenedListPropertyEditorAdapter();
			}
			@Override
			public Adapter caseObjectPropertyEditor(ObjectPropertyEditor object) {
				return createObjectPropertyEditorAdapter();
			}
			@Override
			public Adapter caseOCLPropertyEditor(OCLPropertyEditor object) {
				return createOCLPropertyEditorAdapter();
			}
			@Override
			public Adapter caseCustomPropertyEditor(CustomPropertyEditor object) {
				return createCustomPropertyEditorAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseOCLFilter(OCLFilter object) {
				return createOCLFilterAdapter();
			}
			@Override
			public Adapter caseCreationConstraint(CreationConstraint object) {
				return createCreationConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.PropertyGenerator <em>Property Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.PropertyGenerator
	 * @generated
	 */
	public Adapter createPropertyGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.Reconciler <em>Reconciler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.Reconciler
	 * @generated
	 */
	public Adapter createReconcilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.CustomTransformation <em>Custom Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.CustomTransformation
	 * @generated
	 */
	public Adapter createCustomTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.PropertyTab <em>Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.PropertyTab
	 * @generated
	 */
	public Adapter createPropertyTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.PropertyCategory <em>Property Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.PropertyCategory
	 * @generated
	 */
	public Adapter createPropertyCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.PropertyEditor
	 * @generated
	 */
	public Adapter createPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.TextPropertyEditor <em>Text Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.TextPropertyEditor
	 * @generated
	 */
	public Adapter createTextPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor <em>Spinner Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor
	 * @generated
	 */
	public Adapter createSpinnerPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.ComboBoxPropertyEditor <em>Combo Box Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.ComboBoxPropertyEditor
	 * @generated
	 */
	public Adapter createComboBoxPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.CheckboxPropertyEditor <em>Checkbox Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.CheckboxPropertyEditor
	 * @generated
	 */
	public Adapter createCheckboxPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.RadioPropertyEditor <em>Radio Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.RadioPropertyEditor
	 * @generated
	 */
	public Adapter createRadioPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.ListPropertyEditor <em>List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.ListPropertyEditor
	 * @generated
	 */
	public Adapter createListPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.FlattenedListPropertyEditor <em>Flattened List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.FlattenedListPropertyEditor
	 * @generated
	 */
	public Adapter createFlattenedListPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.ObjectPropertyEditor <em>Object Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.ObjectPropertyEditor
	 * @generated
	 */
	public Adapter createObjectPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.OCLPropertyEditor <em>OCL Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.OCLPropertyEditor
	 * @generated
	 */
	public Adapter createOCLPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.CustomPropertyEditor <em>Custom Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.CustomPropertyEditor
	 * @generated
	 */
	public Adapter createCustomPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.OCLFilter <em>OCL Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.OCLFilter
	 * @generated
	 */
	public Adapter createOCLFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.properties.CreationConstraint <em>Creation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.properties.CreationConstraint
	 * @generated
	 */
	public Adapter createCreationConstraintAdapter() {
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

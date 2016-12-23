/**
 */
package org.muml.ape.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.ape.BaseInsertPoint;
import org.muml.ape.CheckboxPropertyEditor;
import org.muml.ape.ComboBoxPropertyEditor;
import org.muml.ape.CreationConstraint;
import org.muml.ape.CustomPropertyEditor;
import org.muml.ape.CustomTransformation;
import org.muml.ape.Filter;
import org.muml.ape.FlattenedListPropertyEditor;
import org.muml.ape.ListPropertyEditor;
import org.muml.ape.OCLFilter;
import org.muml.ape.OCLPropertyEditor;
import org.muml.ape.ObjectPropertyEditor;
import org.muml.ape.OrderedElement;
import org.muml.ape.Plugin;
import org.muml.ape.PropertiesPackage;
import org.muml.ape.Property;
import org.muml.ape.PropertyCategory;
import org.muml.ape.PropertyEditor;
import org.muml.ape.PropertyGenerator;
import org.muml.ape.PropertyTab;
import org.muml.ape.RadioPropertyEditor;
import org.muml.ape.Reconciler;
import org.muml.ape.SpinnerPropertyEditor;
import org.muml.ape.TextPropertyEditor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.ape.PropertiesPackage
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
			public Adapter casePackage(org.muml.ape.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseClass(org.muml.ape.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseOrderedElement(OrderedElement object) {
				return createOrderedElementAdapter();
			}
			@Override
			public Adapter caseBaseInsertPoint(BaseInsertPoint object) {
				return createBaseInsertPointAdapter();
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
			public Adapter casePropertyCategory(PropertyCategory object) {
				return createPropertyCategoryAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.ape.PropertyGenerator <em>Property Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.PropertyGenerator
	 * @generated
	 */
	public Adapter createPropertyGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.Reconciler <em>Reconciler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.Reconciler
	 * @generated
	 */
	public Adapter createReconcilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.CustomTransformation <em>Custom Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.CustomTransformation
	 * @generated
	 */
	public Adapter createCustomTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.PropertyTab <em>Property Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.PropertyTab
	 * @generated
	 */
	public Adapter createPropertyTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.OrderedElement <em>Ordered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.OrderedElement
	 * @generated
	 */
	public Adapter createOrderedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.BaseInsertPoint <em>Base Insert Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.BaseInsertPoint
	 * @generated
	 */
	public Adapter createBaseInsertPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.PropertyCategory <em>Property Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.PropertyCategory
	 * @generated
	 */
	public Adapter createPropertyCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.PropertyEditor <em>Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.PropertyEditor
	 * @generated
	 */
	public Adapter createPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.TextPropertyEditor <em>Text Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.TextPropertyEditor
	 * @generated
	 */
	public Adapter createTextPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.SpinnerPropertyEditor <em>Spinner Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.SpinnerPropertyEditor
	 * @generated
	 */
	public Adapter createSpinnerPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.ComboBoxPropertyEditor <em>Combo Box Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.ComboBoxPropertyEditor
	 * @generated
	 */
	public Adapter createComboBoxPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.CheckboxPropertyEditor <em>Checkbox Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.CheckboxPropertyEditor
	 * @generated
	 */
	public Adapter createCheckboxPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.RadioPropertyEditor <em>Radio Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.RadioPropertyEditor
	 * @generated
	 */
	public Adapter createRadioPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.ListPropertyEditor <em>List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.ListPropertyEditor
	 * @generated
	 */
	public Adapter createListPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.FlattenedListPropertyEditor <em>Flattened List Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.FlattenedListPropertyEditor
	 * @generated
	 */
	public Adapter createFlattenedListPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.ObjectPropertyEditor <em>Object Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.ObjectPropertyEditor
	 * @generated
	 */
	public Adapter createObjectPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.OCLPropertyEditor <em>OCL Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.OCLPropertyEditor
	 * @generated
	 */
	public Adapter createOCLPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.CustomPropertyEditor <em>Custom Property Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.CustomPropertyEditor
	 * @generated
	 */
	public Adapter createCustomPropertyEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.OCLFilter <em>OCL Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.OCLFilter
	 * @generated
	 */
	public Adapter createOCLFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.ape.CreationConstraint <em>Creation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.ape.CreationConstraint
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

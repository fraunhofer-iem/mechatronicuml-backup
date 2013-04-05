/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.fujaba.properties.ComboBoxPropertySection;
import de.fujaba.properties.CustomPropertySection;
import de.fujaba.properties.GroupPropertySection;
import de.fujaba.properties.ListPropertySection;
import de.fujaba.properties.OCLPropertyFilter;
import de.fujaba.properties.Plugin;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.Property;
import de.fujaba.properties.PropertyFilter;
import de.fujaba.properties.PropertyGenerator;
import de.fujaba.properties.PropertySection;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertySection;
import de.fujaba.properties.TextPropertySection;

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
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertySection(PropertySection object) {
				return createPropertySectionAdapter();
			}
			@Override
			public Adapter caseTextPropertySection(TextPropertySection object) {
				return createTextPropertySectionAdapter();
			}
			@Override
			public Adapter caseComboBoxPropertySection(ComboBoxPropertySection object) {
				return createComboBoxPropertySectionAdapter();
			}
			@Override
			public Adapter caseRadioPropertySection(RadioPropertySection object) {
				return createRadioPropertySectionAdapter();
			}
			@Override
			public Adapter caseListPropertySection(ListPropertySection object) {
				return createListPropertySectionAdapter();
			}
			@Override
			public Adapter caseGroupPropertySection(GroupPropertySection object) {
				return createGroupPropertySectionAdapter();
			}
			@Override
			public Adapter caseCustomPropertySection(CustomPropertySection object) {
				return createCustomPropertySectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.PropertySection <em>Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.PropertySection
	 * @generated
	 */
	public Adapter createPropertySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.TextPropertySection <em>Text Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.TextPropertySection
	 * @generated
	 */
	public Adapter createTextPropertySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.ComboBoxPropertySection <em>Combo Box Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.ComboBoxPropertySection
	 * @generated
	 */
	public Adapter createComboBoxPropertySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.RadioPropertySection <em>Radio Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.RadioPropertySection
	 * @generated
	 */
	public Adapter createRadioPropertySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.ListPropertySection <em>List Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.ListPropertySection
	 * @generated
	 */
	public Adapter createListPropertySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.GroupPropertySection <em>Group Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.GroupPropertySection
	 * @generated
	 */
	public Adapter createGroupPropertySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fujaba.properties.CustomPropertySection <em>Custom Property Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fujaba.properties.CustomPropertySection
	 * @generated
	 */
	public Adapter createCustomPropertySectionAdapter() {
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

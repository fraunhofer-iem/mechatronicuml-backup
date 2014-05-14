/**
 */
package de.uni_paderborn.fujaba.properties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage
 * @generated
 */
public interface PropertiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesFactory eINSTANCE = de.uni_paderborn.fujaba.properties.impl.PropertiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Generator</em>'.
	 * @generated
	 */
	PropertyGenerator createPropertyGenerator();

	/**
	 * Returns a new object of class '<em>Reconciler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconciler</em>'.
	 * @generated
	 */
	Reconciler createReconciler();

	/**
	 * Returns a new object of class '<em>Custom Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Transformation</em>'.
	 * @generated
	 */
	CustomTransformation createCustomTransformation();

	/**
	 * Returns a new object of class '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin</em>'.
	 * @generated
	 */
	Plugin createPlugin();

	/**
	 * Returns a new object of class '<em>Property Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Tab</em>'.
	 * @generated
	 */
	PropertyTab createPropertyTab();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Property Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Category</em>'.
	 * @generated
	 */
	PropertyCategory createPropertyCategory();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Text Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Property Editor</em>'.
	 * @generated
	 */
	TextPropertyEditor createTextPropertyEditor();

	/**
	 * Returns a new object of class '<em>Spinner Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spinner Property Editor</em>'.
	 * @generated
	 */
	SpinnerPropertyEditor createSpinnerPropertyEditor();

	/**
	 * Returns a new object of class '<em>Combo Box Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Box Property Editor</em>'.
	 * @generated
	 */
	ComboBoxPropertyEditor createComboBoxPropertyEditor();

	/**
	 * Returns a new object of class '<em>Checkbox Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkbox Property Editor</em>'.
	 * @generated
	 */
	CheckboxPropertyEditor createCheckboxPropertyEditor();

	/**
	 * Returns a new object of class '<em>Radio Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Property Editor</em>'.
	 * @generated
	 */
	RadioPropertyEditor createRadioPropertyEditor();

	/**
	 * Returns a new object of class '<em>List Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Property Editor</em>'.
	 * @generated
	 */
	ListPropertyEditor createListPropertyEditor();

	/**
	 * Returns a new object of class '<em>Flattened List Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flattened List Property Editor</em>'.
	 * @generated
	 */
	FlattenedListPropertyEditor createFlattenedListPropertyEditor();

	/**
	 * Returns a new object of class '<em>Object Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property Editor</em>'.
	 * @generated
	 */
	ObjectPropertyEditor createObjectPropertyEditor();

	/**
	 * Returns a new object of class '<em>OCL Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Property Editor</em>'.
	 * @generated
	 */
	OCLPropertyEditor createOCLPropertyEditor();

	/**
	 * Returns a new object of class '<em>Custom Property Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Property Editor</em>'.
	 * @generated
	 */
	CustomPropertyEditor createCustomPropertyEditor();

	/**
	 * Returns a new object of class '<em>OCL Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Filter</em>'.
	 * @generated
	 */
	OCLFilter createOCLFilter();

	/**
	 * Returns a new object of class '<em>Creation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Constraint</em>'.
	 * @generated
	 */
	CreationConstraint createCreationConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertiesPackage getPropertiesPackage();

} //PropertiesFactory

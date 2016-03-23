/**
 */
package org.muml.ape.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreValidator;
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
import org.muml.ape.TransformationPosition;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.ape.PropertiesPackage
 * @generated
 */
public class PropertiesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PropertiesValidator INSTANCE = new PropertiesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.properties";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PropertiesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PropertiesPackage.PROPERTY_GENERATOR:
				return validatePropertyGenerator((PropertyGenerator)value, diagnostics, context);
			case PropertiesPackage.RECONCILER:
				return validateReconciler((Reconciler)value, diagnostics, context);
			case PropertiesPackage.CUSTOM_TRANSFORMATION:
				return validateCustomTransformation((CustomTransformation)value, diagnostics, context);
			case PropertiesPackage.PLUGIN:
				return validatePlugin((Plugin)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_TAB:
				return validatePropertyTab((PropertyTab)value, diagnostics, context);
			case PropertiesPackage.PACKAGE:
				return validatePackage((org.muml.ape.Package)value, diagnostics, context);
			case PropertiesPackage.CLASS:
				return validateClass((org.muml.ape.Class)value, diagnostics, context);
			case PropertiesPackage.ORDERED_ELEMENT:
				return validateOrderedElement((OrderedElement)value, diagnostics, context);
			case PropertiesPackage.BASE_INSERT_POINT:
				return validateBaseInsertPoint((BaseInsertPoint)value, diagnostics, context);
			case PropertiesPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_EDITOR:
				return validatePropertyEditor((PropertyEditor)value, diagnostics, context);
			case PropertiesPackage.TEXT_PROPERTY_EDITOR:
				return validateTextPropertyEditor((TextPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.SPINNER_PROPERTY_EDITOR:
				return validateSpinnerPropertyEditor((SpinnerPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.COMBO_BOX_PROPERTY_EDITOR:
				return validateComboBoxPropertyEditor((ComboBoxPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.CHECKBOX_PROPERTY_EDITOR:
				return validateCheckboxPropertyEditor((CheckboxPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.RADIO_PROPERTY_EDITOR:
				return validateRadioPropertyEditor((RadioPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.LIST_PROPERTY_EDITOR:
				return validateListPropertyEditor((ListPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.FLATTENED_LIST_PROPERTY_EDITOR:
				return validateFlattenedListPropertyEditor((FlattenedListPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.OBJECT_PROPERTY_EDITOR:
				return validateObjectPropertyEditor((ObjectPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.OCL_PROPERTY_EDITOR:
				return validateOCLPropertyEditor((OCLPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR:
				return validateCustomPropertyEditor((CustomPropertyEditor)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_CATEGORY:
				return validatePropertyCategory((PropertyCategory)value, diagnostics, context);
			case PropertiesPackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case PropertiesPackage.OCL_FILTER:
				return validateOCLFilter((OCLFilter)value, diagnostics, context);
			case PropertiesPackage.CREATION_CONSTRAINT:
				return validateCreationConstraint((CreationConstraint)value, diagnostics, context);
			case PropertiesPackage.TRANSFORMATION_POSITION:
				return validateTransformationPosition((TransformationPosition)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyGenerator(PropertyGenerator propertyGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyGenerator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyGenerator_UniquePackages(propertyGenerator, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyGenerator_NoSelfReference(propertyGenerator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniquePackages constraint of '<em>Property Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY_GENERATOR__UNIQUE_PACKAGES__EEXPRESSION = "packages->isUnique(genPackage)";

	/**
	 * Validates the UniquePackages constraint of '<em>Property Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyGenerator_UniquePackages(PropertyGenerator propertyGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.PROPERTY_GENERATOR,
				 propertyGenerator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniquePackages",
				 PROPERTY_GENERATOR__UNIQUE_PACKAGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoSelfReference constraint of '<em>Property Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY_GENERATOR__NO_SELF_REFERENCE__EEXPRESSION = "not referencedGenerators->includes(self)";

	/**
	 * Validates the NoSelfReference constraint of '<em>Property Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyGenerator_NoSelfReference(PropertyGenerator propertyGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.PROPERTY_GENERATOR,
				 propertyGenerator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoSelfReference",
				 PROPERTY_GENERATOR__NO_SELF_REFERENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReconciler(Reconciler reconciler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reconciler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomTransformation(CustomTransformation customTransformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customTransformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlugin(Plugin plugin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plugin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTab(PropertyTab propertyTab, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyTab, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(org.muml.ape.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_UniqueClasses(package_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueClasses constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PACKAGE__UNIQUE_CLASSES__EEXPRESSION = "classes->isUnique(genClass)";

	/**
	 * Validates the UniqueClasses constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_UniqueClasses(org.muml.ape.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.PACKAGE,
				 package_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueClasses",
				 PACKAGE__UNIQUE_CLASSES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(org.muml.ape.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_UniqueFeatures(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_UniqueCategoryTitles(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_PropertiesFromSelfOrSuperclasses(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueFeatures constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__UNIQUE_FEATURES__EEXPRESSION = "true -- properties->isUnique(genFeature)";

	/**
	 * Validates the UniqueFeatures constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_UniqueFeatures(org.muml.ape.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueFeatures",
				 CLASS__UNIQUE_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueCategoryTitles constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__UNIQUE_CATEGORY_TITLES__EEXPRESSION = "propertyCategories->isUnique(title)";

	/**
	 * Validates the UniqueCategoryTitles constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_UniqueCategoryTitles(org.muml.ape.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueCategoryTitles",
				 CLASS__UNIQUE_CATEGORY_TITLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PropertiesFromSelfOrSuperclasses constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__PROPERTIES_FROM_SELF_OR_SUPERCLASSES__EEXPRESSION = "properties->forAll(p | Set { self }->union(allSuperClasses).genClass.ecoreClass->includes(p.genFeature.ecoreFeature.eContainingClass))";

	/**
	 * Validates the PropertiesFromSelfOrSuperclasses constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_PropertiesFromSelfOrSuperclasses(org.muml.ape.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PropertiesFromSelfOrSuperclasses",
				 CLASS__PROPERTIES_FROM_SELF_OR_SUPERCLASSES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderedElement(OrderedElement orderedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseInsertPoint(BaseInsertPoint baseInsertPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseInsertPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCategory(PropertyCategory propertyCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_CreationConstraintForContainments(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_CreationOppositeConstraintForContainers(property, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CreationConstraintForContainments constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__CREATION_CONSTRAINT_FOR_CONTAINMENTS__EEXPRESSION = "-- Creation Constraint must only be defined for Properties of containment references.\n" +
		"(not creationConstraint.oclIsUndefined()) implies (genFeature.ecoreFeature.oclIsKindOf(ecore::EReference) and genFeature.ecoreFeature.oclAsType(ecore::EReference).containment)";

	/**
	 * Validates the CreationConstraintForContainments constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_CreationConstraintForContainments(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CreationConstraintForContainments",
				 PROPERTY__CREATION_CONSTRAINT_FOR_CONTAINMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CreationOppositeConstraintForContainers constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__CREATION_OPPOSITE_CONSTRAINT_FOR_CONTAINERS__EEXPRESSION = "-- Creation Opposite Constraint must only be defined for Properties with an EOpposite of type containment reference.\n" +
		"(not creationOppositeConstraint.oclIsUndefined()) implies (genFeature.ecoreFeature.oclIsKindOf(ecore::EReference) and genFeature.ecoreFeature.oclAsType(ecore::EReference).container)";

	/**
	 * Validates the CreationOppositeConstraintForContainers constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_CreationOppositeConstraintForContainers(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PropertiesPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CreationOppositeConstraintForContainers",
				 PROPERTY__CREATION_OPPOSITE_CONSTRAINT_FOR_CONTAINERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyEditor(PropertyEditor propertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPropertyEditor(TextPropertyEditor textPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpinnerPropertyEditor(SpinnerPropertyEditor spinnerPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spinnerPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComboBoxPropertyEditor(ComboBoxPropertyEditor comboBoxPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comboBoxPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckboxPropertyEditor(CheckboxPropertyEditor checkboxPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkboxPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioPropertyEditor(RadioPropertyEditor radioPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radioPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListPropertyEditor(ListPropertyEditor listPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlattenedListPropertyEditor(FlattenedListPropertyEditor flattenedListPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flattenedListPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPropertyEditor(ObjectPropertyEditor objectPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLPropertyEditor(OCLPropertyEditor oclPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomPropertyEditor(CustomPropertyEditor customPropertyEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customPropertyEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLFilter(OCLFilter oclFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationConstraint(CreationConstraint creationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationPosition(TransformationPosition transformationPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}
	
	

} //PropertiesValidator

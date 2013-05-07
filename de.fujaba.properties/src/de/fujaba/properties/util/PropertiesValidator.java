/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.util;

import de.fujaba.properties.CheckboxPropertySection;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
import de.fujaba.properties.PropertyReference;
import de.fujaba.properties.PropertySection;
import de.fujaba.properties.PropertyTab;
import de.fujaba.properties.RadioPropertySection;
import de.fujaba.properties.TextPropertySection;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.fujaba.properties.PropertiesPackage
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
	public static final String DIAGNOSTIC_SOURCE = "de.fujaba.properties";

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
			case PropertiesPackage.PLUGIN:
				return validatePlugin((Plugin)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_TAB:
				return validatePropertyTab((PropertyTab)value, diagnostics, context);
			case PropertiesPackage.PACKAGE:
				return validatePackage((de.fujaba.properties.Package)value, diagnostics, context);
			case PropertiesPackage.CLASS:
				return validateClass((de.fujaba.properties.Class)value, diagnostics, context);
			case PropertiesPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_SECTION:
				return validatePropertySection((PropertySection)value, diagnostics, context);
			case PropertiesPackage.TEXT_PROPERTY_SECTION:
				return validateTextPropertySection((TextPropertySection)value, diagnostics, context);
			case PropertiesPackage.COMBO_BOX_PROPERTY_SECTION:
				return validateComboBoxPropertySection((ComboBoxPropertySection)value, diagnostics, context);
			case PropertiesPackage.CHECKBOX_PROPERTY_SECTION:
				return validateCheckboxPropertySection((CheckboxPropertySection)value, diagnostics, context);
			case PropertiesPackage.RADIO_PROPERTY_SECTION:
				return validateRadioPropertySection((RadioPropertySection)value, diagnostics, context);
			case PropertiesPackage.LIST_PROPERTY_SECTION:
				return validateListPropertySection((ListPropertySection)value, diagnostics, context);
			case PropertiesPackage.GROUP_PROPERTY_SECTION:
				return validateGroupPropertySection((GroupPropertySection)value, diagnostics, context);
			case PropertiesPackage.CUSTOM_PROPERTY_SECTION:
				return validateCustomPropertySection((CustomPropertySection)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_FILTER:
				return validatePropertyFilter((PropertyFilter)value, diagnostics, context);
			case PropertiesPackage.OCL_PROPERTY_FILTER:
				return validateOCLPropertyFilter((OCLPropertyFilter)value, diagnostics, context);
			case PropertiesPackage.PROPERTY_REFERENCE:
				return validatePropertyReference((PropertyReference)value, diagnostics, context);
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
	public boolean validatePackage(de.fujaba.properties.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validatePackage_UniqueClasses(de.fujaba.properties.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateClass(de.fujaba.properties.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return result;
	}

	/**
	 * The cached validation expression for the UniqueFeatures constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__UNIQUE_FEATURES__EEXPRESSION = "properties->isUnique(genFeature)";

	/**
	 * Validates the UniqueFeatures constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_UniqueFeatures(de.fujaba.properties.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertySection(PropertySection propertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPropertySection(TextPropertySection textPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComboBoxPropertySection(ComboBoxPropertySection comboBoxPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comboBoxPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckboxPropertySection(CheckboxPropertySection checkboxPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkboxPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioPropertySection(RadioPropertySection radioPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radioPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListPropertySection(ListPropertySection listPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupPropertySection(GroupPropertySection groupPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomPropertySection(CustomPropertySection customPropertySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customPropertySection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyFilter(PropertyFilter propertyFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLPropertyFilter(OCLPropertyFilter oclPropertyFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclPropertyFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyReference(PropertyReference propertyReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyReference, diagnostics, context);
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

/**
 */
package org.muml.emm.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.emm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.emm.MigrationPackage
 * @generated
 */
public class MigrationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MigrationValidator INSTANCE = new MigrationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.emm";

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
	public MigrationValidator() {
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
	  return MigrationPackage.eINSTANCE;
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
			case MigrationPackage.MIGRATOR:
				return validateMigrator((Migrator)value, diagnostics, context);
			case MigrationPackage.OCL_EXPRESSION:
				return validateOclExpression((OclExpression)value, diagnostics, context);
			case MigrationPackage.CREATE_CLASS:
				return validateCreateClass((CreateClass)value, diagnostics, context);
			case MigrationPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case MigrationPackage.FEATURE_INITIALIZER:
				return validateFeatureInitializer((FeatureInitializer)value, diagnostics, context);
			case MigrationPackage.IDENTITY_FEATURE_INITIALIZER:
				return validateIdentityFeatureInitializer((IdentityFeatureInitializer)value, diagnostics, context);
			case MigrationPackage.SET_FEATURE_INITIALIZER:
				return validateSetFeatureInitializer((SetFeatureInitializer)value, diagnostics, context);
			case MigrationPackage.CREATE_INITIALIZER:
				return validateCreateInitializer((CreateInitializer)value, diagnostics, context);
			case MigrationPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMigrator(Migrator migrator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(migrator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOclExpression(OclExpression oclExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateClass(CreateClass createClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateClass_NoAbstractTarget(createClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoAbstractTarget constraint of '<em>Create Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_CLASS__NO_ABSTRACT_TARGET__EEXPRESSION = "not targetClass.oclIsUndefined() implies not targetClass.abstract";

	/**
	 * Validates the NoAbstractTarget constraint of '<em>Create Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateClass_NoAbstractTarget(CreateClass createClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MigrationPackage.Literals.CREATE_CLASS,
				 createClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoAbstractTarget",
				 CREATE_CLASS__NO_ABSTRACT_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateClass_NoAbstractTarget(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateMapping_NoTargetForAbstractSourceAllowed(mapping, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoTargetForAbstractSourceAllowed constraint of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAPPING__NO_TARGET_FOR_ABSTRACT_SOURCE_ALLOWED__EEXPRESSION = "(not sourceClass.oclIsUndefined()) implies \n" +
		"(sourceClass.abstract implies targetClass.oclIsUndefined())";

	/**
	 * Validates the NoTargetForAbstractSourceAllowed constraint of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_NoTargetForAbstractSourceAllowed(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MigrationPackage.Literals.MAPPING,
				 mapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoTargetForAbstractSourceAllowed",
				 MAPPING__NO_TARGET_FOR_ABSTRACT_SOURCE_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureInitializer(FeatureInitializer featureInitializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureInitializer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityFeatureInitializer(IdentityFeatureInitializer identityFeatureInitializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityFeatureInitializer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetFeatureInitializer(SetFeatureInitializer setFeatureInitializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setFeatureInitializer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateInitializer(CreateInitializer createInitializer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createInitializer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createInitializer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateClass_NoAbstractTarget(createInitializer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
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

} //MigrationValidator

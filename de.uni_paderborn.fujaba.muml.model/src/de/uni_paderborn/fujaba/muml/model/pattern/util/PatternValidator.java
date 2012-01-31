/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.util;

import de.uni_paderborn.fujaba.muml.model.pattern.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage
 * @generated
 */
public class PatternValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PatternValidator INSTANCE = new PatternValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.pattern";

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
	public PatternValidator() {
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
	  return PatternPackage.eINSTANCE;
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
			case PatternPackage.ROLE_CONNECTOR:
				return validateRoleConnector((RoleConnector)value, diagnostics, context);
			case PatternPackage.COORDINATION_PATTERN:
				return validateCoordinationPattern((CoordinationPattern)value, diagnostics, context);
			case PatternPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleConnector(RoleConnector roleConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleConnector_OnlyRolesOfSameCoordinationPattern(roleConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyRolesOfSameCoordinationPattern constraint of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PATTERN__EEXPRESSION = "(not source.oclIsUndefined() and not target.oclIsUndefined()) implies source.coordinationPattern = target.coordinationPattern";

	/**
	 * Validates the OnlyRolesOfSameCoordinationPattern constraint of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleConnector_OnlyRolesOfSameCoordinationPattern(RoleConnector roleConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE_CONNECTOR,
				 roleConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyRolesOfSameCoordinationPattern",
				 ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPattern(CoordinationPattern coordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinationPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_OrderOnlyForMultiPort(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_OrderedRequiresIntegerOrderVariable(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleHasConnector(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleRequiresBehavior(role, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OrderOnlyForMultiPort constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ORDER_ONLY_FOR_MULTI_PORT__EEXPRESSION = "self.ordered implies (self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity)";

	/**
	 * Validates the OrderOnlyForMultiPort constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_OrderOnlyForMultiPort(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OrderOnlyForMultiPort",
				 ROLE__ORDER_ONLY_FOR_MULTI_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OrderedRequiresIntegerOrderVariable constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ORDERED_REQUIRES_INTEGER_ORDER_VARIABLE__EEXPRESSION = "self.ordered implies (self.orderVariable->notEmpty() implies self.orderVariable.eAttributeType ='EInt')";

	/**
	 * Validates the OrderedRequiresIntegerOrderVariable constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_OrderedRequiresIntegerOrderVariable(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OrderedRequiresIntegerOrderVariable",
				 ROLE__ORDERED_REQUIRES_INTEGER_ORDER_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleHasConnector constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_HAS_CONNECTOR__EEXPRESSION = "self.incomingRoleConnector->notEmpty() or self.outgoingRoleConnector->notEmpty()";

	/**
	 * Validates the RoleHasConnector constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_RoleHasConnector(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleHasConnector",
				 ROLE__ROLE_HAS_CONNECTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleRequiresBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_REQUIRES_BEHAVIOR__EEXPRESSION = "not self.behavior.oclIsUndefined()";

	/**
	 * Validates the RoleRequiresBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_RoleRequiresBehavior(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleRequiresBehavior",
				 ROLE__ROLE_REQUIRES_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //PatternValidator

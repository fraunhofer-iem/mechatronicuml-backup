/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.util;

import de.uni_paderborn.fujaba.muml.protocol.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import de.uni_paderborn.fujaba.common.validator.MumlValidator;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.MessageBuffer;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage
 */
public class ProtocolValidator extends MumlValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProtocolValidator INSTANCE = new ProtocolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.protocol";

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
	public ProtocolValidator() {
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
	  return ProtocolPackage.eINSTANCE;
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
			case ProtocolPackage.ROLE_CONNECTOR:
				return validateRoleConnector((RoleConnector)value, diagnostics, context);
			case ProtocolPackage.COORDINATION_PROTOCOL:
				return validateCoordinationProtocol((CoordinationProtocol)value, diagnostics, context);
			case ProtocolPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case ProtocolPackage.MESSAGE_BUFFER:
				return validateMessageBuffer((MessageBuffer)value, diagnostics, context);
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return validateConnectorQualityOfServiceAssumptions((ConnectorQualityOfServiceAssumptions)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRoleConnector_OnlyRolesOfSameCoordinationProtocol(roleConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyRolesOfSameCoordinationProtocol constraint of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PROTOCOL__EEXPRESSION = "self.coordinationProtocol.roles = self.roles";

	/**
	 * Validates the OnlyRolesOfSameCoordinationProtocol constraint of '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleConnector_OnlyRolesOfSameCoordinationProtocol(RoleConnector roleConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.ROLE_CONNECTOR,
				 roleConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyRolesOfSameCoordinationProtocol",
				 ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocol(CoordinationProtocol coordinationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinationProtocol, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationProtocol_UniqueRoleNames(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationProtocol_CoordinationProtocolNamesMustBeUnique(coordinationProtocol, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueRoleNames constraint of '<em>Coordination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PROTOCOL__UNIQUE_ROLE_NAMES__EEXPRESSION = "self.roles->isUnique(name)";

	/**
	 * Validates the UniqueRoleNames constraint of '<em>Coordination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocol_UniqueRoleNames(CoordinationProtocol coordinationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.COORDINATION_PROTOCOL,
				 coordinationProtocol,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueRoleNames",
				 COORDINATION_PROTOCOL__UNIQUE_ROLE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CoordinationProtocolNamesMustBeUnique constraint of '<em>Coordination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PROTOCOL__COORDINATION_PROTOCOL_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "CoordinationProtocol.allInstances()->isUnique(name)";

	/**
	 * Validates the CoordinationProtocolNamesMustBeUnique constraint of '<em>Coordination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationProtocol_CoordinationProtocolNamesMustBeUnique(CoordinationProtocol coordinationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.COORDINATION_PROTOCOL,
				 coordinationProtocol,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CoordinationProtocolNamesMustBeUnique",
				 COORDINATION_PROTOCOL__COORDINATION_PROTOCOL_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateRole_RoleRequiresBehavior(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleRequiresMessageTypes(role, diagnostics, context);
		return result;
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
				(ProtocolPackage.Literals.ROLE,
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
	 * The cached validation expression for the RoleRequiresMessageTypes constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_REQUIRES_MESSAGE_TYPES__EEXPRESSION = "self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()";

	/**
	 * Validates the RoleRequiresMessageTypes constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_RoleRequiresMessageTypes(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleRequiresMessageTypes",
				 ROLE__ROLE_REQUIRES_MESSAGE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageBuffer(MessageBuffer messageBuffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageBuffer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions connectorQualityOfServiceAssumptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorQualityOfServiceAssumptions, diagnostics, context);
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

} //ProtocolValidator

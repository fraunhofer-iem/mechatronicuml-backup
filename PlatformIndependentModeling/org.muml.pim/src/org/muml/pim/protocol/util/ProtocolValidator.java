/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.common.validator.MumlValidator;
import org.muml.pim.connector.util.ConnectorValidator;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.protocol.ProtocolPackage
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
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.protocol";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorValidator connectorValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolValidator() {
		super();
		connectorValidator = ConnectorValidator.INSTANCE;
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION:
				return validateAbstractCoordinationSpecification((AbstractCoordinationSpecification)value, diagnostics, context);
			case ProtocolPackage.COORDINATION_PROTOCOL:
				return validateCoordinationProtocol((CoordinationProtocol)value, diagnostics, context);
			case ProtocolPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case ProtocolPackage.ROLE_CONNECTOR:
				return validateRoleConnector((RoleConnector)value, diagnostics, context);
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
	public boolean validateAbstractCoordinationSpecification(AbstractCoordinationSpecification abstractCoordinationSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractCoordinationSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationSpecification_UniqueRoleNames(abstractCoordinationSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationSpecification_RoleMessageTypesMustBeCompatible(abstractCoordinationSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueRoleNames constraint of '<em>Abstract Coordination Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_COORDINATION_SPECIFICATION__UNIQUE_ROLE_NAMES__EEXPRESSION = "-- Names of roles must be unique\r\n" +
		"self.roles->isUnique(name)";

	/**
	 * Validates the UniqueRoleNames constraint of '<em>Abstract Coordination Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinationSpecification_UniqueRoleNames(AbstractCoordinationSpecification abstractCoordinationSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION,
				 abstractCoordinationSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueRoleNames",
				 ABSTRACT_COORDINATION_SPECIFICATION__UNIQUE_ROLE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleMessageTypesMustBeCompatible constraint of '<em>Abstract Coordination Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_COORDINATION_SPECIFICATION__ROLE_MESSAGE_TYPES_MUST_BE_COMPATIBLE__EEXPRESSION = "-- Every Role must have the senderMessageTypes of all other Roles set as receiverMessageTypes\r\n" +
		"self.roles->forAll(role1 : Role, role2 : Role |\r\n" +
		"   role1 <> role2\r\n" +
		"   implies\r\n" +
		"   role1.senderMessageTypes->asSet() = role2.receiverMessageTypes->asSet()\r\n" +
		")";

	/**
	 * Validates the RoleMessageTypesMustBeCompatible constraint of '<em>Abstract Coordination Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinationSpecification_RoleMessageTypesMustBeCompatible(AbstractCoordinationSpecification abstractCoordinationSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION,
				 abstractCoordinationSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RoleMessageTypesMustBeCompatible",
				 ABSTRACT_COORDINATION_SPECIFICATION__ROLE_MESSAGE_TYPES_MUST_BE_COMPATIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	protected static final String ROLE_CONNECTOR__ONLY_ROLES_OF_SAME_COORDINATION_PROTOCOL__EEXPRESSION = "-- Role connector must not connect roles at different coordination protocols\r\n" +
		"if self.coordinationProtocol.roles->oclIsUndefined() then \r\n" +
		"true\r\n" +
		"else\r\n" +
		"self.coordinationProtocol.roles = self.roles\r\n" +
		"endif";

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
		if (result || diagnostics != null) result &= validateAbstractCoordinationSpecification_UniqueRoleNames(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationSpecification_RoleMessageTypesMustBeCompatible(coordinationProtocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationProtocol_CoordinationProtocolNamesMustBeUnique(coordinationProtocol, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CoordinationProtocolNamesMustBeUnique constraint of '<em>Coordination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION_PROTOCOL__COORDINATION_PROTOCOL_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "-- Coordination Protocols must have unique names\r\n" +
		"CoordinationProtocol.allInstances()->isUnique(name)";

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
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(role, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(role, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteInteractionEndpoint_SetEitherSubRoleAndCoordinatorBehaviorOrNone(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleRequiresBehavior(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_RoleRequiresMessageTypes(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior(role, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RoleRequiresBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__ROLE_REQUIRES_BEHAVIOR__EEXPRESSION = "-- Role requires behavior\n" +
		"not self.behavior.oclIsUndefined()";

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
	protected static final String ROLE__ROLE_REQUIRES_MESSAGE_TYPES__EEXPRESSION = "-- Role requires message types to be set\n" +
		"self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()";

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
	 * The cached validation expression for the MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__MULTI_ROLE_REQUIRES_SUBROLE_BEHAVIOR_AND_COORDINATOR_BEHAVIOR__EEXPRESSION = "-- A multiport requires that either all messages in the RTSCs use one-to-many communication schemata or that the references coordinatorBehavior and subroleBehavior are set.\r\n" +
		"(not self.behavior.oclAsType(realtimestatechart::RealtimeStatechart).usesOneToManyCommunicationSchemata implies self.multiRole = not self.coordinatorBehavior.oclIsUndefined())\r\n" +
		"and self.coordinatorBehavior.oclIsUndefined() = self.subroleBehavior.oclIsUndefined()";

	/**
	 * Validates the MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.ROLE,
				 role,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior",
				 ROLE__MULTI_ROLE_REQUIRES_SUBROLE_BEHAVIOR_AND_COORDINATOR_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions connectorQualityOfServiceAssumptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectorQualityOfServiceAssumptions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectorQualityOfServiceAssumptions, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorQualityOfServiceAssumptions_PreserveMessageOrderIsTrueWhenConnectorIsReliable(connectorQualityOfServiceAssumptions, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PreserveMessageOrderIsTrueWhenConnectorIsReliable constraint of '<em>Connector Quality Of Service Assumptions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER_IS_TRUE_WHEN_CONNECTOR_IS_RELIABLE__EEXPRESSION = "-- Attribute preserveMessageOrder must be true of the connector is reliable (i.e., if no message may be lost).\r\n" +
		"self.messageLossPossible implies self.preserveMessageOrder";

	/**
	 * Validates the PreserveMessageOrderIsTrueWhenConnectorIsReliable constraint of '<em>Connector Quality Of Service Assumptions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorQualityOfServiceAssumptions_PreserveMessageOrderIsTrueWhenConnectorIsReliable(ConnectorQualityOfServiceAssumptions connectorQualityOfServiceAssumptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS,
				 connectorQualityOfServiceAssumptions,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PreserveMessageOrderIsTrueWhenConnectorIsReliable",
				 CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER_IS_TRUE_WHEN_CONNECTOR_IS_RELIABLE__EEXPRESSION,
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

} //ProtocolValidator

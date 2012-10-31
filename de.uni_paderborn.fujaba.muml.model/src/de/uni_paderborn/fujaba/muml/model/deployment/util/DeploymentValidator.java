/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentValidator INSTANCE = new DeploymentValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.deployment";

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
	public DeploymentValidator() {
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
	  return DeploymentPackage.eINSTANCE;
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
			case DeploymentPackage.DEPLOYMENT:
				return validateDeployment((Deployment)value, diagnostics, context);
			case DeploymentPackage.HARDWARE_NODE:
				return validateHardwareNode((HardwareNode)value, diagnostics, context);
			case DeploymentPackage.HARDWARE_PORT:
				return validateHardwarePort((HardwarePort)value, diagnostics, context);
			case DeploymentPackage.COMMUNICATION_LINK:
				return validateCommunicationLink((CommunicationLink)value, diagnostics, context);
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE:
				return validateQualityOfLinkService((QualityOfLinkService)value, diagnostics, context);
			case DeploymentPackage.HARDWARE_NODE_KIND:
				return validateHardwareNodeKind((HardwareNodeKind)value, diagnostics, context);
			case DeploymentPackage.HARDWARE_PORT_DIRECTION_KIND:
				return validateHardwarePortDirectionKind((HardwarePortDirectionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareNode(HardwareNode hardwareNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hardwareNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hardwareNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateHardwareNode_NoDeploymentOnActorOrSensor(hardwareNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoDeploymentOnActorOrSensor constraint of '<em>Hardware Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HARDWARE_NODE__NO_DEPLOYMENT_ON_ACTOR_OR_SENSOR__EEXPRESSION = "(self.hardwareNodeKind <> deployment::HardwareNodeKind::COMPUTATIONAL_RESOURCE) implies self.deployedInstances->isEmpty()";

	/**
	 * Validates the NoDeploymentOnActorOrSensor constraint of '<em>Hardware Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareNode_NoDeploymentOnActorOrSensor(HardwareNode hardwareNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentPackage.Literals.HARDWARE_NODE,
				 hardwareNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoDeploymentOnActorOrSensor",
				 HARDWARE_NODE__NO_DEPLOYMENT_ON_ACTOR_OR_SENSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePort(HardwarePort hardwarePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwarePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationLink(CommunicationLink communicationLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityOfLinkService(QualityOfLinkService qualityOfLinkService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualityOfLinkService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareNodeKind(HardwareNodeKind hardwareNodeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePortDirectionKind(HardwarePortDirectionKind hardwarePortDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //DeploymentValidator

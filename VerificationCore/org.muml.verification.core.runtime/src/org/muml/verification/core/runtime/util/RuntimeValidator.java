/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.verification.core.runtime.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pim.connector.util.ConnectorValidator;
import org.muml.pim.instance.util.InstanceValidator;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.MultiRoleInstance;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RoleInstance;
import org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeComponentInstance;
import org.muml.verification.core.runtime.RuntimeConnectorInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance;
import org.muml.verification.core.runtime.RuntimeDiscretePortInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimePackage;
import org.muml.verification.core.runtime.RuntimeParameter;
import org.muml.verification.core.runtime.RuntimeRoleConnectorInstance;
import org.muml.verification.core.runtime.SingleRoleInstance;
import org.muml.verification.core.runtime.VariableBinding;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.verification.core.runtime.RuntimePackage
 * @generated
 */
public class RuntimeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimeValidator INSTANCE = new RuntimeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.verification.core.runtime";

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
	protected InstanceValidator instanceValidator;

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
	public RuntimeValidator() {
		super();
		instanceValidator = InstanceValidator.INSTANCE;
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
	  return RuntimePackage.eINSTANCE;
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
			case RuntimePackage.RUNTIME_COMPONENT_INSTANCE:
				return validateRuntimeComponentInstance((RuntimeComponentInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE:
				return validateRuntimeDiscretePortInstance((RuntimeDiscretePortInstance)value, diagnostics, context);
			case RuntimePackage.ROLE_INSTANCE:
				return validateRoleInstance((RoleInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER:
				return validateRuntimeMessageBuffer((RuntimeMessageBuffer)value, diagnostics, context);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE:
				return validateRealtimeStatechartInstance((RealtimeStatechartInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_MESSAGE:
				return validateRuntimeMessage((RuntimeMessage)value, diagnostics, context);
			case RuntimePackage.RUNTIME_PARAMETER:
				return validateRuntimeParameter((RuntimeParameter)value, diagnostics, context);
			case RuntimePackage.VARIABLE_BINDING:
				return validateVariableBinding((VariableBinding)value, diagnostics, context);
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT:
				return validateRuntimeBehavioralElement((RuntimeBehavioralElement)value, diagnostics, context);
			case RuntimePackage.SINGLE_ROLE_INSTANCE:
				return validateSingleRoleInstance((SingleRoleInstance)value, diagnostics, context);
			case RuntimePackage.MULTI_ROLE_INSTANCE:
				return validateMultiRoleInstance((MultiRoleInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_ROLE_CONNECTOR_INSTANCE:
				return validateRuntimeRoleConnectorInstance((RuntimeRoleConnectorInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_CONNECTOR_INSTANCE:
				return validateRuntimeConnectorInstance((RuntimeConnectorInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE:
				return validateRuntimeAssemblyConnectorInstance((RuntimeAssemblyConnectorInstance)value, diagnostics, context);
			case RuntimePackage.MESSAGE_ON_CONNECTOR:
				return validateMessageOnConnector((MessageOnConnector)value, diagnostics, context);
			case RuntimePackage.RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE:
				return validateRuntimeDiscreteInteractionEndpointInstance((RuntimeDiscreteInteractionEndpointInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE:
				return validateRuntimeDiscreteSinglePortInstance((RuntimeDiscreteSinglePortInstance)value, diagnostics, context);
			case RuntimePackage.RUNTIME_DISCRETE_MULTI_PORT_INSTANCE:
				return validateRuntimeDiscreteMultiPortInstance((RuntimeDiscreteMultiPortInstance)value, diagnostics, context);
			case RuntimePackage.JAVA_OBJECT:
				return validateJavaObject(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeComponentInstance(RuntimeComponentInstance runtimeComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateComponentInstance_AllPortsAreInitialized(runtimeComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(runtimeComponentInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeDiscretePortInstance(RuntimeDiscretePortInstance runtimeDiscretePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeDiscretePortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortInstance_PortInstanceMustReferencePortType(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(runtimeDiscretePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(runtimeDiscretePortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleInstance(RoleInstance roleInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(roleInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeMessageBuffer(RuntimeMessageBuffer runtimeMessageBuffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeMessageBuffer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealtimeStatechartInstance(RealtimeStatechartInstance realtimeStatechartInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realtimeStatechartInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeMessage(RuntimeMessage runtimeMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeParameter(RuntimeParameter runtimeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableBinding(VariableBinding variableBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeBehavioralElement(RuntimeBehavioralElement runtimeBehavioralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeBehavioralElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeBehavioralElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(runtimeBehavioralElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ElementMustNotContainMessageBuffers constraint of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RUNTIME_BEHAVIORAL_ELEMENT__ELEMENT_MUST_NOT_CONTAIN_MESSAGE_BUFFERS__EEXPRESSION = "if(self.oclIsTypeOf(RuntimeComponentInstance) or self.oclIsTypeOf(MultiRoleInstance) or self.oclIsTypeOf(RuntimeDiscreteMultiPortInstance))\r\n" +
		"then messageBuffer->size() = 0\r\n" +
		"else true\r\n" +
		"endif";

	/**
	 * Validates the ElementMustNotContainMessageBuffers constraint of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(RuntimeBehavioralElement runtimeBehavioralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RuntimePackage.Literals.RUNTIME_BEHAVIORAL_ELEMENT,
				 runtimeBehavioralElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ElementMustNotContainMessageBuffers",
				 RUNTIME_BEHAVIORAL_ELEMENT__ELEMENT_MUST_NOT_CONTAIN_MESSAGE_BUFFERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleRoleInstance(SingleRoleInstance singleRoleInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleRoleInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(singleRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteSingleInteractionEndpointInstance_StandaloneSingleEndpointInstanceRequiresSingleEndpointType(singleRoleInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiRoleInstance(MultiRoleInstance multiRoleInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiRoleInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_TypeIsMultiDiscreteInteractionEndpoint(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToLowerBound(multiRoleInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToUpperBound(multiRoleInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeRoleConnectorInstance(RuntimeRoleConnectorInstance runtimeRoleConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeRoleConnectorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeConnectorInstance(RuntimeConnectorInstance runtimeConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeConnectorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeAssemblyConnectorInstance(RuntimeAssemblyConnectorInstance runtimeAssemblyConnectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeAssemblyConnectorInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortConnectorInstance_ValidPortConnectorInstance(runtimeAssemblyConnectorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateAssemblyConnectorInstance_AssemblyConnectorInstanceNeedsTypeIfNotTopLevel(runtimeAssemblyConnectorInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageOnConnector(MessageOnConnector messageOnConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageOnConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeDiscreteInteractionEndpointInstance(RuntimeDiscreteInteractionEndpointInstance runtimeDiscreteInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeDiscreteInteractionEndpointInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(runtimeDiscreteInteractionEndpointInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeDiscreteSinglePortInstance(RuntimeDiscreteSinglePortInstance runtimeDiscreteSinglePortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeDiscreteSinglePortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortInstance_PortInstanceMustReferencePortType(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteSingleInteractionEndpointInstance_StandaloneSingleEndpointInstanceRequiresSingleEndpointType(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateDiscreteSinglePortInstance_PortInstanceNotMultipleAssemblyConnectorInstances(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateDiscreteSinglePortInstance_PortInstanceNotMultipleDelegationConnectorInstances(runtimeDiscreteSinglePortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateDiscreteSinglePortInstance_PortInstanceNeedsDelegationToParentOrAssembly(runtimeDiscreteSinglePortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeDiscreteMultiPortInstance(RuntimeDiscreteMultiPortInstance runtimeDiscreteMultiPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runtimeDiscreteMultiPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortInstance_PortInstanceMustReferencePortType(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validatePortInstance_PortInstanceMustDelegateToEmbeddedCIC(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= instanceValidator.validateDiscretePortInstance_PortTypeIsKindOfDiscretePort(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_TypeIsMultiDiscreteInteractionEndpoint(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToLowerBound(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= connectorValidator.validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToUpperBound(runtimeDiscreteMultiPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuntimeBehavioralElement_ElementMustNotContainMessageBuffers(runtimeDiscreteMultiPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaObject(Object javaObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //RuntimeValidator

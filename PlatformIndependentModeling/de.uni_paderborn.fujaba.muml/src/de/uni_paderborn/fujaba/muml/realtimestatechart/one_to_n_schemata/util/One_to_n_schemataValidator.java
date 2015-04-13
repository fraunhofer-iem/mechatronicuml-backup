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
package de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.util;

import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage
 * @generated
 */
public class One_to_n_schemataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final One_to_n_schemataValidator INSTANCE = new One_to_n_schemataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata";

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
	public One_to_n_schemataValidator() {
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
	  return One_to_n_schemataPackage.eINSTANCE;
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return validateOneToManyCommunicationSchema((OneToManyCommunicationSchema)value, diagnostics, context);
			case One_to_n_schemataPackage.MULTICAST:
				return validateMulticast((Multicast)value, diagnostics, context);
			case One_to_n_schemataPackage.UNICAST:
				return validateUnicast((Unicast)value, diagnostics, context);
			case One_to_n_schemataPackage.ITERATE:
				return validateIterate((Iterate)value, diagnostics, context);
			case One_to_n_schemataPackage.LOAD_BALANCING:
				return validateLoadBalancing((LoadBalancing)value, diagnostics, context);
			case One_to_n_schemataPackage.SINGLE_RECEIVE:
				return validateSingleReceive((SingleReceive)value, diagnostics, context);
			case One_to_n_schemataPackage.CONVERGECAST:
				return validateConvergecast((Convergecast)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneToManyCommunicationSchema(OneToManyCommunicationSchema oneToManyCommunicationSchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oneToManyCommunicationSchema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticast(Multicast multicast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multicast, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnicast(Unicast unicast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unicast, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterate(Iterate iterate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iterate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadBalancing, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_ResponseMessageOrWcetOfCommunication(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_SchemaLoadbalancingMustBeSet(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_ResponseMessageOfCommunication(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_SchemaLoadbalancingMustBeTriggerMessage(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_LoadbalancingEitherHasResponseMessageOrWcet(loadBalancing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResponseMessageOrWcetOfCommunication constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_ResponseMessageOrWcetOfCommunication(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ResponseMessageOrWcetOfCommunication", getObjectLabel(loadBalancing, context) },
						 new Object[] { loadBalancing },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SchemaLoadbalancingMustBeSet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_SchemaLoadbalancingMustBeSet(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SchemaLoadbalancingMustBeSet", getObjectLabel(loadBalancing, context) },
						 new Object[] { loadBalancing },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ResponseMessageOfCommunication constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_ResponseMessageOfCommunication(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ResponseMessageOfCommunication", getObjectLabel(loadBalancing, context) },
						 new Object[] { loadBalancing },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SchemaLoadbalancingMustBeTriggerMessage constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_SchemaLoadbalancingMustBeTriggerMessage(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SchemaLoadbalancingMustBeTriggerMessage", getObjectLabel(loadBalancing, context) },
						 new Object[] { loadBalancing },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the LoadbalancingEitherHasResponseMessageOrWcet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOAD_BALANCING__LOADBALANCING_EITHER_HAS_RESPONSE_MESSAGE_OR_WCET__EEXPRESSION = "-- responseMessage and maxWorkingTime exclude each other\r\n" +
		"if not self.responseMessage.oclIsUndefined() and not self.maxWorkingTime.oclIsUndefined() then\r\n" +
		"\tfalse\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the LoadbalancingEitherHasResponseMessageOrWcet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_LoadbalancingEitherHasResponseMessageOrWcet(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(One_to_n_schemataPackage.Literals.LOAD_BALANCING,
				 loadBalancing,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LoadbalancingEitherHasResponseMessageOrWcet",
				 LOAD_BALANCING__LOADBALANCING_EITHER_HAS_RESPONSE_MESSAGE_OR_WCET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleReceive(SingleReceive singleReceive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleReceive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConvergecast(Convergecast convergecast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(convergecast, diagnostics, context);
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

} //One_to_n_schemataValidator

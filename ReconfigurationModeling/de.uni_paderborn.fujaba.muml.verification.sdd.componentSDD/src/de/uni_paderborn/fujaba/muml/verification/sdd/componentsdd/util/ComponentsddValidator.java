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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.util;

import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.*;

import de.uni_paderborn.fujaba.muml.verification.sdd.util.SDDValidator;

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
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage
 * @generated
 */
public class ComponentsddValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentsddValidator INSTANCE = new ComponentsddValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd";

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
	protected SDDValidator sddValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsddValidator() {
		super();
		sddValidator = SDDValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ComponentsddPackage.eINSTANCE;
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
			case ComponentsddPackage.COMPONENT_STORY_DECISION_DIAGRAM:
				return validateComponentStoryDecisionDiagram((ComponentStoryDecisionDiagram)value, diagnostics, context);
			case ComponentsddPackage.COMPONENT_STORY_PATTERN_NODE:
				return validateComponentStoryPatternNode((ComponentStoryPatternNode)value, diagnostics, context);
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION:
				return validateEvaluateComponentSDDExpression((EvaluateComponentSDDExpression)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryDecisionDiagram(ComponentStoryDecisionDiagram componentStoryDecisionDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentStoryDecisionDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentStoryDecisionDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= sddValidator.validateAbstractStoryDecisionDiagram_oneRootNode(componentStoryDecisionDiagram, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryPatternNode(ComponentStoryPatternNode componentStoryPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentStoryPatternNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentStoryPatternNode_noNegativeVariables(componentStoryPatternNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentStoryPatternNode_noVariableModifications(componentStoryPatternNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noNegativeVariables constraint of '<em>Component Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_STORY_PATTERN_NODE__NO_NEGATIVE_VARIABLES__EEXPRESSION = "let\r\n" +
		"\tpartVariables : OrderedSet(componentstorypattern::PartVariable) = pattern.thisVariable.partVariables,\r\n" +
		"\tconnectorVariables : OrderedSet(componentstorypattern::ConnectorVariable) = pattern.thisVariable.connectorVariables,\r\n" +
		"\tportVariable : OrderedSet(componentstorypattern::ComponentStoryPatternVariable) = partVariables->collect(portVariables)->asOrderedSet()\r\n" +
		"in\r\n" +
		"\tportVariable->union(partVariables)->union(connectorVariables)->forAll(cV | cV.bindingSemantics = storydiagrams::patterns::BindingSemantics::MANDATORY)";

	/**
	 * Validates the noNegativeVariables constraint of '<em>Component Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryPatternNode_noNegativeVariables(ComponentStoryPatternNode componentStoryPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentsddPackage.Literals.COMPONENT_STORY_PATTERN_NODE,
				 componentStoryPatternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noNegativeVariables",
				 COMPONENT_STORY_PATTERN_NODE__NO_NEGATIVE_VARIABLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noVariableModifications constraint of '<em>Component Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_STORY_PATTERN_NODE__NO_VARIABLE_MODIFICATIONS__EEXPRESSION = "let\r\n" +
		"\tpartVariables : OrderedSet(componentstorypattern::PartVariable) = pattern.thisVariable.partVariables,\r\n" +
		"\tconnectorVariables : OrderedSet(componentstorypattern::ConnectorVariable) = pattern.thisVariable.connectorVariables,\r\n" +
		"\tportVariable : OrderedSet(componentstorypattern::ComponentStoryPatternVariable) = partVariables->collect(portVariables)->asOrderedSet()\r\n" +
		"in\r\n" +
		"\tportVariable->union(partVariables)->union(connectorVariables)->forAll(cV | cV.bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)";

	/**
	 * Validates the noVariableModifications constraint of '<em>Component Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentStoryPatternNode_noVariableModifications(ComponentStoryPatternNode componentStoryPatternNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentsddPackage.Literals.COMPONENT_STORY_PATTERN_NODE,
				 componentStoryPatternNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noVariableModifications",
				 COMPONENT_STORY_PATTERN_NODE__NO_VARIABLE_MODIFICATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluateComponentSDDExpression(EvaluateComponentSDDExpression evaluateComponentSDDExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluateComponentSDDExpression, diagnostics, context);
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

} //ComponentsddValidator

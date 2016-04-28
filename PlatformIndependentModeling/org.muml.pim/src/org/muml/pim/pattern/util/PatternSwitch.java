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
package org.muml.pim.pattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.pattern.*;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.VerifiedConfiguration;
import org.muml.pim.protocol.AbstractCoordinationSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.pim.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN: {
				AbstractCoordinationPattern abstractCoordinationPattern = (AbstractCoordinationPattern)theEObject;
				T result = caseAbstractCoordinationPattern(abstractCoordinationPattern);
				if (result == null) result = caseAbstractCoordinationSpecification(abstractCoordinationPattern);
				if (result == null) result = caseNamedElement(abstractCoordinationPattern);
				if (result == null) result = caseCommentableElement(abstractCoordinationPattern);
				if (result == null) result = caseVerifiableElement(abstractCoordinationPattern);
				if (result == null) result = caseExtendableElement(abstractCoordinationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.DESCRIPTION_ASPECTS: {
				DescriptionAspects descriptionAspects = (DescriptionAspects)theEObject;
				T result = caseDescriptionAspects(descriptionAspects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.VERIFIED_CONFIGURATION: {
				VerifiedConfiguration verifiedConfiguration = (VerifiedConfiguration)theEObject;
				T result = caseVerifiedConfiguration(verifiedConfiguration);
				if (result == null) result = caseNamedElement(verifiedConfiguration);
				if (result == null) result = caseCommentableElement(verifiedConfiguration);
				if (result == null) result = caseExtendableElement(verifiedConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.COORDINATION_PATTERN_VARIANT: {
				CoordinationPatternVariant coordinationPatternVariant = (CoordinationPatternVariant)theEObject;
				T result = caseCoordinationPatternVariant(coordinationPatternVariant);
				if (result == null) result = caseAbstractCoordinationPattern(coordinationPatternVariant);
				if (result == null) result = caseAbstractCoordinationSpecification(coordinationPatternVariant);
				if (result == null) result = caseNamedElement(coordinationPatternVariant);
				if (result == null) result = caseCommentableElement(coordinationPatternVariant);
				if (result == null) result = caseVerifiableElement(coordinationPatternVariant);
				if (result == null) result = caseExtendableElement(coordinationPatternVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternPackage.COORDINATION_PATTERN: {
				CoordinationPattern coordinationPattern = (CoordinationPattern)theEObject;
				T result = caseCoordinationPattern(coordinationPattern);
				if (result == null) result = caseAbstractCoordinationPattern(coordinationPattern);
				if (result == null) result = caseAbstractCoordinationSpecification(coordinationPattern);
				if (result == null) result = caseNamedElement(coordinationPattern);
				if (result == null) result = caseCommentableElement(coordinationPattern);
				if (result == null) result = caseVerifiableElement(coordinationPattern);
				if (result == null) result = caseExtendableElement(coordinationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coordination Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoordinationPattern(AbstractCoordinationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationPattern(CoordinationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Aspects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Aspects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionAspects(DescriptionAspects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verified Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verified Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiedConfiguration(VerifiedConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Pattern Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Pattern Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationPatternVariant(CoordinationPatternVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiableElement(VerifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coordination Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coordination Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoordinationSpecification(AbstractCoordinationSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PatternSwitch

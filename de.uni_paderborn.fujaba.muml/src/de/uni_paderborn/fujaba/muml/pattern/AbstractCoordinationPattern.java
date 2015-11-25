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
package de.uni_paderborn.fujaba.muml.pattern;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * \todosd{document!}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getVerifiedConfigurations <em>Verified Configurations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getAbstractCoordinationPattern()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePatternNames PatternWithParametersNeedsVerifiedConfiguration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PatternWithParametersNeedsVerifiedConfiguration='-- @warning\r\n--When a CoordinationPattern defines Parameters, it is advised to define a verified configuration for these Parameters\r\nself.patternParameters->size() > 0 implies self.verifiedConfigurations->size() > 0' UniquePatternNames='-- A name of a CoordinationPattern must be unique.\r\nAbstractCoordinationPattern.allInstances()->isUnique(name)'"
 * @generated
 */
public interface AbstractCoordinationPattern extends AbstractCoordinationSpecification {
	/**
	 * Returns the value of the '<em><b>Verified Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified Configurations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getAbstractCoordinationPattern_VerifiedConfigurations()
	 * @see de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getCoordinationPattern
	 * @model opposite="coordinationPattern" containment="true"
	 * @generated
	 */
	EList<VerifiedConfiguration> getVerifiedConfigurations();

	/**
	 * Returns the value of the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getAbstractCoordinationPattern_PatternParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getPatternParameters();

} // AbstractCoordinationPattern

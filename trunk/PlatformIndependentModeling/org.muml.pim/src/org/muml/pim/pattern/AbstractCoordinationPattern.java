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
package org.muml.pim.pattern;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.protocol.AbstractCoordinationSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class that contains all referencs and attributes of a Real-Time Coordination Pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.AbstractCoordinationPattern#getVerifiedConfigurations <em>Verified Configurations</em>}</li>
 *   <li>{@link org.muml.pim.pattern.AbstractCoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.pattern.PatternPackage#getAbstractCoordinationPattern()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePatternNames PatternWithParametersNeedsVerifiedConfiguration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PatternWithParametersNeedsVerifiedConfiguration='-- @warning\r\n--When a CoordinationPattern defines Parameters, it is advised to define a verified configuration for these Parameters\r\nself.patternParameters->size() > 0 implies self.verifiedConfigurations->size() > 0' UniquePatternNames='-- A name of a CoordinationPattern must be unique.\r\nAbstractCoordinationPattern.allInstances()->isUnique(name)'"
 * @generated
 */
public interface AbstractCoordinationPattern extends AbstractCoordinationSpecification {
	/**
	 * Returns the value of the '<em><b>Verified Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.pattern.VerifiedConfiguration}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.pattern.VerifiedConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The verified configurations of this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified Configurations</em>' containment reference list.
	 * @see org.muml.pim.pattern.PatternPackage#getAbstractCoordinationPattern_VerifiedConfigurations()
	 * @see org.muml.pim.pattern.VerifiedConfiguration#getCoordinationPattern
	 * @model opposite="coordinationPattern" containment="true"
	 * @generated
	 */
	EList<VerifiedConfiguration> getVerifiedConfigurations();

	/**
	 * Returns the value of the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters that this pattern defines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Parameters</em>' containment reference list.
	 * @see org.muml.pim.pattern.PatternPackage#getAbstractCoordinationPattern_PatternParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getPatternParameters();

} // AbstractCoordinationPattern

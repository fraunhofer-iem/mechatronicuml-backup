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

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verified Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Real-Time Coordination Pattern may define one or more verified configurations. It has a name and may be commented. In particular, it defines a concrete value for each parameter of the pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getVerifiedConfiguration()
 * @model
 * @generated
 */
public interface VerifiedConfiguration extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter bindings of this verified configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getVerifiedConfiguration_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getVerifiedConfigurations <em>Verified Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reverse reference to coordination pattern is required because it is easier for developing the dialogs and wizards. However, deriving it by finding out the parent is also a valid solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #setCoordinationPattern(AbstractCoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getVerifiedConfiguration_CoordinationPattern()
	 * @see de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern#getVerifiedConfigurations
	 * @model opposite="verifiedConfigurations" required="true" transient="false"
	 * @generated
	 */
	AbstractCoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.pattern.VerifiedConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(AbstractCoordinationPattern value);

} // VerifiedConfiguration

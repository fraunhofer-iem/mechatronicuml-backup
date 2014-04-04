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
package de.uni_paderborn.fujaba.muml.constraint;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Constraint Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a verifiable constraint the system has to fulfill. A verifiable constraint may be an TCTL expression. Thus, the constraint may be the input for a model checker.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository#getVerificationConstraint <em>Verification Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getVerificationConstraintRepository()
 * @model abstract="true"
 * @generated
 */
public interface VerificationConstraintRepository extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Verification Constraint</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.constraint.VerificationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The non-empty list of verification constraints this repository contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Constraint</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getVerificationConstraintRepository_VerificationConstraint()
	 * @model required="true"
	 * @generated
	 */
	EList<VerificationConstraint> getVerificationConstraint();

} // VerificationConstraintRepository

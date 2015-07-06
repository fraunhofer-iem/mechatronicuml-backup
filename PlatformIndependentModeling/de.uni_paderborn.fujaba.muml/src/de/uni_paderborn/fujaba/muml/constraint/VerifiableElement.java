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
 * A representation of the model object '<em><b>Verifiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an element that may be verified by formal verification, e.g., model checking. Therefore, this class provides a repository to store verification constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.VerifiableElement#getVerificationConstraintRepositories <em>Verification Constraint Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getVerifiableElement()
 * @model abstract="true"
 * @generated
 */
public interface VerifiableElement extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced repository that contains verifiable constraints for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Constraint Repositories</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getVerifiableElement_VerificationConstraintRepositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationConstraintRepository> getVerificationConstraintRepositories();

} // VerifiableElement

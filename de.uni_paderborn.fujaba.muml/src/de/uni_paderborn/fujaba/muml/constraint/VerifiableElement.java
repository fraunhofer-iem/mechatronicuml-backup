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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verifiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A verifiable is an element that may be verified by formal verification, e.g., model checking. Therefore, this class defines a set of temporal logic constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.VerifiableElement#getTemporalLogicConstraints <em>Temporal Logic Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getVerifiableElement()
 * @model abstract="true"
 * @generated
 */
public interface VerifiableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Temporal Logic Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of temporal logic constraints for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Logic Constraints</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage#getVerifiableElement_TemporalLogicConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalLogicConstraint> getTemporalLogicConstraints();

} // VerifiableElement

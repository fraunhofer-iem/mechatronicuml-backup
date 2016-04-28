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
package org.muml.pim.behavior;

import org.eclipse.emf.common.util.EList;
import org.muml.core.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OperationRepository groups a set of reusable Operations. Operations are not required to have an implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.behavior.OperationRepository#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.behavior.BehaviorPackage#getOperationRepository()
 * @model
 * @generated
 */
public interface OperationRepository extends Repository {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operations of this repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.muml.pim.behavior.BehaviorPackage#getOperationRepository_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // OperationRepository

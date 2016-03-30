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
package org.muml.pim.realtimestatechart.one_to_n_schemata;

import org.muml.pim.realtimestatechart.Action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Receive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The communication schema MultiReceive allows for receiving a message by each subrole.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive#getFailureAction <em>Failure Action</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getMultiReceive()
 * @model
 * @generated
 */
public interface MultiReceive extends ReceivingOneToManyCommunicationSchema {

	/**
	 * Returns the value of the '<em><b>Failure Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines which action should be executed if the multireceive fails.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Action</em>' containment reference.
	 * @see #setFailureAction(Action)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getMultiReceive_FailureAction()
	 * @model containment="true"
	 * @generated
	 */
	Action getFailureAction();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive#getFailureAction <em>Failure Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Action</em>' containment reference.
	 * @see #getFailureAction()
	 * @generated
	 */
	void setFailureAction(Action value);
} // MultiReceive

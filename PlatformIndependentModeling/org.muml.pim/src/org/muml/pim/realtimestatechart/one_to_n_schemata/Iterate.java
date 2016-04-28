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

import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The communication schema iterate allows for an iterative sending of a message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getTerminationCondition <em>Termination Condition</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#isStartFromFirst <em>Start From First</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getIterate()
 * @model
 * @generated
 */
public interface Iterate extends SendingOneToManyCommunicationSchema {
	/**
	 * Returns the value of the '<em><b>Termination Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition under which the iteration terminates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termination Condition</em>' containment reference.
	 * @see #setTerminationCondition(Expression)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getIterate_TerminationCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTerminationCondition();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getTerminationCondition <em>Termination Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Condition</em>' containment reference.
	 * @see #getTerminationCondition()
	 * @generated
	 */
	void setTerminationCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delay between two iterations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(TimeValue)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getIterate_Delay()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getDelay();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Start From First</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the iteration starts from the first subrole, otherwise it starts from the last subrole.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start From First</em>' attribute.
	 * @see #setStartFromFirst(boolean)
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getIterate_StartFromFirst()
	 * @model default="true"
	 * @generated
	 */
	boolean isStartFromFirst();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate#isStartFromFirst <em>Start From First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start From First</em>' attribute.
	 * @see #isStartFromFirst()
	 * @generated
	 */
	void setStartFromFirst(boolean value);

} // Iterate

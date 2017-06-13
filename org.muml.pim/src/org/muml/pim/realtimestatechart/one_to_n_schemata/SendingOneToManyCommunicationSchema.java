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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sending One To Many Communication Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class that all communication schemata have to inherit from if they shall send messages.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getSendingOneToManyCommunicationSchema()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConditionAttributeRequiresRetryAfterAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ConditionAttributeRequiresRetryAfterAttribute='-- If and only if you define the attribute condition for this communication schemata, then you also have to state the attribute retryAfter.\r\n(not self.condition.oclIsUndefined() implies not self.retryAfter.oclIsUndefined()) and (self.condition.oclIsUndefined() implies self.retryAfter.oclIsUndefined())'"
 * @generated
 */
public interface SendingOneToManyCommunicationSchema extends OneToManyCommunicationSchema {
} // SendingOneToManyCommunicationSchema

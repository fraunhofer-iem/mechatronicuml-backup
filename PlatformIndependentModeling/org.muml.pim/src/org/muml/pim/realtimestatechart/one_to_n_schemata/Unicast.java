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
 * A representation of the model object '<em><b>Unicast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Using this communication schema, only one subrole is allowed to send a message.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getUnicast()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UnicastRequiresConditionAndRetryAfterAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UnicastRequiresConditionAndRetryAfterAttribute='-- When you use the communication schemata unicast, then you have to define the attributes condition and retryAfter.\r\nnot self.condition.oclIsUndefined() and not self.retryAfter.oclIsUndefined()'"
 * @generated
 */
public interface Unicast extends SendingOneToManyCommunicationSchema {
} // Unicast

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
package de.uni_paderborn.fujaba.muml.runtime;

import de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Discrete Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeSingleDiscreteInteractionEndpointInstance#getRuntimeMessageBuffer <em>Runtime Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeSingleDiscreteInteractionEndpointInstance()
 * @model
 * @generated
 */
public interface RuntimeSingleDiscreteInteractionEndpointInstance extends RuntimeDiscreteInteractionEndpointInstance, DiscreteSingleInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Runtime Message Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Message Buffer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Message Buffer</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeSingleDiscreteInteractionEndpointInstance_RuntimeMessageBuffer()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeMessageBuffer> getRuntimeMessageBuffer();

} // RuntimeSingleDiscreteInteractionEndpointInstance

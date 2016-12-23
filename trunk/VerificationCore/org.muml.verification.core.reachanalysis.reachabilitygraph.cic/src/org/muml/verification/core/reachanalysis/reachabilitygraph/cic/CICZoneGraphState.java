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
package org.muml.verification.core.reachanalysis.reachabilitygraph.cic;

import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIC Zone Graph State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState#getCic <em>Cic</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage#getCICZoneGraphState()
 * @model
 * @generated
 */
public interface CICZoneGraphState extends ZoneGraphState {
	/**
	 * Returns the value of the '<em><b>Cic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cic</em>' containment reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage#getCICZoneGraphState_Cic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState#getCic <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' containment reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstanceConfiguration value);

} // CICZoneGraphState

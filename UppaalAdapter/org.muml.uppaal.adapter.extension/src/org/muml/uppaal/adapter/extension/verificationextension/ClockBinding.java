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
package org.muml.uppaal.adapter.extension.verificationextension;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.realtimestatechart.Clock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getClock <em>Clock</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage#getClockBinding()
 * @model
 * @generated
 */
public interface ClockBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage#getClockBinding_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage#getClockBinding_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ClockBinding

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

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Bindings Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension#getClockBindings <em>Clock Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage#getClockBindingsExtension()
 * @model
 * @generated
 */
public interface ClockBindingsExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>Clock Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.adapter.extension.verificationextension.ClockBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Bindings</em>' containment reference list.
	 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage#getClockBindingsExtension_ClockBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockBinding> getClockBindings();

} // ClockBindingsExtension

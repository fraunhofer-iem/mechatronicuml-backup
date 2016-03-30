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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage
 * @generated
 */
public interface VerificationExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerificationExtensionFactory eINSTANCE = org.muml.uppaal.adapter.extension.verificationextension.impl.VerificationExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Committed Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Committed Extension</em>'.
	 * @generated
	 */
	CommittedExtension createCommittedExtension();

	/**
	 * Returns a new object of class '<em>Clock Bindings Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Bindings Extension</em>'.
	 * @generated
	 */
	ClockBindingsExtension createClockBindingsExtension();

	/**
	 * Returns a new object of class '<em>Clock Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Binding</em>'.
	 * @generated
	 */
	ClockBinding createClockBinding();

	/**
	 * Returns a new object of class '<em>Element To Verify Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element To Verify Extension</em>'.
	 * @generated
	 */
	ElementToVerifyExtension createElementToVerifyExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VerificationExtensionPackage getVerificationExtensionPackage();

} //VerificationExtensionFactory

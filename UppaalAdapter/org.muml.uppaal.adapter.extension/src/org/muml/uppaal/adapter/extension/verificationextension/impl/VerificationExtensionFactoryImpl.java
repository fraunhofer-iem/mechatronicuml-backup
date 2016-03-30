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
package org.muml.uppaal.adapter.extension.verificationextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.adapter.extension.verificationextension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerificationExtensionFactoryImpl extends EFactoryImpl implements VerificationExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerificationExtensionFactory init() {
		try {
			VerificationExtensionFactory theVerificationExtensionFactory = (VerificationExtensionFactory)EPackage.Registry.INSTANCE.getEFactory(VerificationExtensionPackage.eNS_URI);
			if (theVerificationExtensionFactory != null) {
				return theVerificationExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VerificationExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationExtensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VerificationExtensionPackage.COMMITTED_EXTENSION: return createCommittedExtension();
			case VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION: return createClockBindingsExtension();
			case VerificationExtensionPackage.CLOCK_BINDING: return createClockBinding();
			case VerificationExtensionPackage.ELEMENT_TO_VERIFY_EXTENSION: return createElementToVerifyExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommittedExtension createCommittedExtension() {
		CommittedExtensionImpl committedExtension = new CommittedExtensionImpl();
		return committedExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockBindingsExtension createClockBindingsExtension() {
		ClockBindingsExtensionImpl clockBindingsExtension = new ClockBindingsExtensionImpl();
		return clockBindingsExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockBinding createClockBinding() {
		ClockBindingImpl clockBinding = new ClockBindingImpl();
		return clockBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementToVerifyExtension createElementToVerifyExtension() {
		ElementToVerifyExtensionImpl elementToVerifyExtension = new ElementToVerifyExtensionImpl();
		return elementToVerifyExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationExtensionPackage getVerificationExtensionPackage() {
		return (VerificationExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VerificationExtensionPackage getPackage() {
		return VerificationExtensionPackage.eINSTANCE;
	}

} //VerificationExtensionFactoryImpl

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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtensionImpl;
import org.muml.uppaal.adapter.extension.verificationextension.ClockBinding;
import org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Bindings Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.extension.verificationextension.impl.ClockBindingsExtensionImpl#getClockBindings <em>Clock Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockBindingsExtensionImpl extends ExtensionImpl implements ClockBindingsExtension {
	/**
	 * The cached value of the '{@link #getClockBindings() <em>Clock Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockBinding> clockBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockBindingsExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationExtensionPackage.Literals.CLOCK_BINDINGS_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockBinding> getClockBindings() {
		if (clockBindings == null) {
			clockBindings = new EObjectContainmentEList<ClockBinding>(ClockBinding.class, this, VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS);
		}
		return clockBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS:
				return ((InternalEList<?>)getClockBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS:
				return getClockBindings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS:
				getClockBindings().clear();
				getClockBindings().addAll((Collection<? extends ClockBinding>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS:
				getClockBindings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VerificationExtensionPackage.CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS:
				return clockBindings != null && !clockBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClockBindingsExtensionImpl

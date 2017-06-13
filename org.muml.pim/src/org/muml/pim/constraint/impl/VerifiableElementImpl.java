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
package org.muml.pim.constraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verifiable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.constraint.impl.VerifiableElementImpl#getVerificationConstraintRepositories <em>Verification Constraint Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VerifiableElementImpl extends ExtendableElementImpl implements VerifiableElement {
	/**
	 * The cached value of the '{@link #getVerificationConstraintRepositories() <em>Verification Constraint Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationConstraintRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationConstraintRepository> verificationConstraintRepositories;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifiableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.VERIFIABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationConstraintRepository> getVerificationConstraintRepositories() {
		if (verificationConstraintRepositories == null) {
			verificationConstraintRepositories = new EObjectContainmentEList<VerificationConstraintRepository>(VerificationConstraintRepository.class, this, ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES);
		}
		return verificationConstraintRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return ((InternalEList<?>)getVerificationConstraintRepositories()).basicRemove(otherEnd, msgs);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return getVerificationConstraintRepositories();
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				getVerificationConstraintRepositories().clear();
				getVerificationConstraintRepositories().addAll((Collection<? extends VerificationConstraintRepository>)newValue);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				getVerificationConstraintRepositories().clear();
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return verificationConstraintRepositories != null && !verificationConstraintRepositories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerifiableElementImpl

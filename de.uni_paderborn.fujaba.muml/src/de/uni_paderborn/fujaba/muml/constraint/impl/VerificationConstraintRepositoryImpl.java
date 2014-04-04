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
package de.uni_paderborn.fujaba.muml.constraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraint;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Constraint Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintRepositoryImpl#getVerificationConstraint <em>Verification Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VerificationConstraintRepositoryImpl extends ExtendableElementImpl implements VerificationConstraintRepository {
	/**
	 * The cached value of the '{@link #getVerificationConstraint() <em>Verification Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationConstraint> verificationConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationConstraintRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.VERIFICATION_CONSTRAINT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationConstraint> getVerificationConstraint() {
		if (verificationConstraint == null) {
			verificationConstraint = new EObjectResolvingEList<VerificationConstraint>(VerificationConstraint.class, this, ConstraintPackage.VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT);
		}
		return verificationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintPackage.VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT:
				return getVerificationConstraint();
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
			case ConstraintPackage.VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT:
				getVerificationConstraint().clear();
				getVerificationConstraint().addAll((Collection<? extends VerificationConstraint>)newValue);
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
			case ConstraintPackage.VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT:
				getVerificationConstraint().clear();
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
			case ConstraintPackage.VERIFICATION_CONSTRAINT_REPOSITORY__VERIFICATION_CONSTRAINT:
				return verificationConstraint != null && !verificationConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationConstraintRepositoryImpl

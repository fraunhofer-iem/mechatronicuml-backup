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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verifiable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerifiableElementImpl#getVerificationConstraintRepository <em>Verification Constraint Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VerifiableElementImpl extends EObjectImpl implements VerifiableElement {
	/**
	 * The cached value of the '{@link #getVerificationConstraintRepository() <em>Verification Constraint Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationConstraintRepository()
	 * @generated
	 * @ordered
	 */
	protected VerificationConstraintRepository verificationConstraintRepository;
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
	public VerificationConstraintRepository getVerificationConstraintRepository() {
		return verificationConstraintRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationConstraintRepository(VerificationConstraintRepository newVerificationConstraintRepository, NotificationChain msgs) {
		VerificationConstraintRepository oldVerificationConstraintRepository = verificationConstraintRepository;
		verificationConstraintRepository = newVerificationConstraintRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY, oldVerificationConstraintRepository, newVerificationConstraintRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationConstraintRepository(VerificationConstraintRepository newVerificationConstraintRepository) {
		if (newVerificationConstraintRepository != verificationConstraintRepository) {
			NotificationChain msgs = null;
			if (verificationConstraintRepository != null)
				msgs = ((InternalEObject)verificationConstraintRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY, null, msgs);
			if (newVerificationConstraintRepository != null)
				msgs = ((InternalEObject)newVerificationConstraintRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY, null, msgs);
			msgs = basicSetVerificationConstraintRepository(newVerificationConstraintRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY, newVerificationConstraintRepository, newVerificationConstraintRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY:
				return basicSetVerificationConstraintRepository(null, msgs);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY:
				return getVerificationConstraintRepository();
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY:
				setVerificationConstraintRepository((VerificationConstraintRepository)newValue);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY:
				setVerificationConstraintRepository((VerificationConstraintRepository)null);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORY:
				return verificationConstraintRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //VerifiableElementImpl

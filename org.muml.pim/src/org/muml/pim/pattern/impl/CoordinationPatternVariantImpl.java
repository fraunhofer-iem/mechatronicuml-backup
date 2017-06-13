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
package org.muml.pim.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Pattern Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.impl.CoordinationPatternVariantImpl#getOriginalPattern <em>Original Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationPatternVariantImpl extends AbstractCoordinationPatternImpl implements CoordinationPatternVariant {
	/**
	 * The cached value of the '{@link #getOriginalPattern() <em>Original Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPattern()
	 * @generated
	 * @ordered
	 */
	protected CoordinationPattern originalPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationPatternVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.COORDINATION_PATTERN_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getOriginalPattern() {
		if (originalPattern != null && originalPattern.eIsProxy()) {
			InternalEObject oldOriginalPattern = (InternalEObject)originalPattern;
			originalPattern = (CoordinationPattern)eResolveProxy(oldOriginalPattern);
			if (originalPattern != oldOriginalPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN, oldOriginalPattern, originalPattern));
			}
		}
		return originalPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern basicGetOriginalPattern() {
		return originalPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPattern(CoordinationPattern newOriginalPattern, NotificationChain msgs) {
		CoordinationPattern oldOriginalPattern = originalPattern;
		originalPattern = newOriginalPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN, oldOriginalPattern, newOriginalPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPattern(CoordinationPattern newOriginalPattern) {
		if (newOriginalPattern != originalPattern) {
			NotificationChain msgs = null;
			if (originalPattern != null)
				msgs = ((InternalEObject)originalPattern).eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS, CoordinationPattern.class, msgs);
			if (newOriginalPattern != null)
				msgs = ((InternalEObject)newOriginalPattern).eInverseAdd(this, PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS, CoordinationPattern.class, msgs);
			msgs = basicSetOriginalPattern(newOriginalPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN, newOriginalPattern, newOriginalPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN:
				if (originalPattern != null)
					msgs = ((InternalEObject)originalPattern).eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS, CoordinationPattern.class, msgs);
				return basicSetOriginalPattern((CoordinationPattern)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN:
				return basicSetOriginalPattern(null, msgs);
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
			case PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN:
				if (resolve) return getOriginalPattern();
				return basicGetOriginalPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN:
				setOriginalPattern((CoordinationPattern)newValue);
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
			case PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN:
				setOriginalPattern((CoordinationPattern)null);
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
			case PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN:
				return originalPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationPatternVariantImpl

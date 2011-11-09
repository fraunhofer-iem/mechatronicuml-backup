/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.impl;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternEllipse;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternEllipseImpl#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternEllipseImpl extends EObjectImpl implements PatternEllipse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternEllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PATTERN_ELLIPSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getCoordinationPattern() {
		if (eContainerFeatureID() != PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN) return null;
		return (CoordinationPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationPattern(CoordinationPattern newCoordinationPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoordinationPattern, PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationPattern(CoordinationPattern newCoordinationPattern) {
		if (newCoordinationPattern != eInternalContainer() || (eContainerFeatureID() != PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN && newCoordinationPattern != null)) {
			if (EcoreUtil.isAncestor(this, newCoordinationPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoordinationPattern != null)
				msgs = ((InternalEObject)newCoordinationPattern).eInverseAdd(this, PatternPackage.COORDINATION_PATTERN__PATTERN_ELLIPSE, CoordinationPattern.class, msgs);
			msgs = basicSetCoordinationPattern(newCoordinationPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN, newCoordinationPattern, newCoordinationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationPattern((CoordinationPattern)otherEnd, msgs);
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
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				return basicSetCoordinationPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__PATTERN_ELLIPSE, CoordinationPattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				return getCoordinationPattern();
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
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)newValue);
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
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)null);
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
			case PatternPackage.PATTERN_ELLIPSE__COORDINATION_PATTERN:
				return getCoordinationPattern() != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternEllipseImpl

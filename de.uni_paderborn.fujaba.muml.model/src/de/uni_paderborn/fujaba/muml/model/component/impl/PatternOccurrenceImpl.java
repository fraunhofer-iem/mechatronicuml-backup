/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PatternOccurrenceImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.PatternOccurrenceImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternOccurrenceImpl extends ExtendableElementImpl implements PatternOccurrence {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected CoordinationPattern pattern;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.PATTERN_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getPattern() {
		if (pattern != null && pattern.eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject)pattern;
			pattern = (CoordinationPattern)eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PATTERN_OCCURRENCE__PATTERN, oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(CoordinationPattern newPattern) {
		CoordinationPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PATTERN_OCCURRENCE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectResolvingEList<Port>(Port.class, this, ComponentPackage.PATTERN_OCCURRENCE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.PATTERN_OCCURRENCE__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
			case ComponentPackage.PATTERN_OCCURRENCE__PORTS:
				return getPorts();
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
			case ComponentPackage.PATTERN_OCCURRENCE__PATTERN:
				setPattern((CoordinationPattern)newValue);
				return;
			case ComponentPackage.PATTERN_OCCURRENCE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
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
			case ComponentPackage.PATTERN_OCCURRENCE__PATTERN:
				setPattern((CoordinationPattern)null);
				return;
			case ComponentPackage.PATTERN_OCCURRENCE__PORTS:
				getPorts().clear();
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
			case ComponentPackage.PATTERN_OCCURRENCE__PATTERN:
				return pattern != null;
			case ComponentPackage.PATTERN_OCCURRENCE__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternOccurrenceImpl

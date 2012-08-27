/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.CoordinationPatternImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationPatternImpl extends NamedElementImpl implements CoordinationPattern {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector connector;

	/**
	 * The cached setting delegate for the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PATTERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternPackage.Literals.COORDINATION_PATTERN__PATTERN).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.COORDINATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, PatternPackage.COORDINATION_PATTERN__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, PatternPackage.COORDINATION_PATTERN__ROLES, PatternPackage.ROLE__COORDINATION_PATTERN);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(RoleConnector newConnector, NotificationChain msgs) {
		RoleConnector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.COORDINATION_PATTERN__CONNECTOR, oldConnector, newConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(RoleConnector newConnector) {
		if (newConnector != connector) {
			NotificationChain msgs = null;
			if (connector != null)
				msgs = ((InternalEObject)connector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__COORDINATION_PATTERN, RoleConnector.class, msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, PatternPackage.ROLE_CONNECTOR__COORDINATION_PATTERN, RoleConnector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.COORDINATION_PATTERN__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getPattern() {
		return (CoordinationPattern)PATTERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(CoordinationPattern newPattern, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Pattern' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(CoordinationPattern newPattern) {
		PATTERN__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternPackage.COORDINATION_PATTERN__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case PatternPackage.COORDINATION_PATTERN__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case PatternPackage.COORDINATION_PATTERN__CONNECTOR:
				if (connector != null)
					msgs = ((InternalEObject)connector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.COORDINATION_PATTERN__CONNECTOR, null, msgs);
				return basicSetConnector((RoleConnector)otherEnd, msgs);
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
			case PatternPackage.COORDINATION_PATTERN__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case PatternPackage.COORDINATION_PATTERN__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case PatternPackage.COORDINATION_PATTERN__CONNECTOR:
				return basicSetConnector(null, msgs);
			case PatternPackage.COORDINATION_PATTERN__PATTERN:
				return basicSetPattern(null, msgs);
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
			case PatternPackage.COORDINATION_PATTERN__CONSTRAINT:
				return getConstraint();
			case PatternPackage.COORDINATION_PATTERN__ROLES:
				return getRoles();
			case PatternPackage.COORDINATION_PATTERN__CONNECTOR:
				return getConnector();
			case PatternPackage.COORDINATION_PATTERN__PATTERN:
				return getPattern();
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
			case PatternPackage.COORDINATION_PATTERN__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__CONNECTOR:
				setConnector((RoleConnector)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__PATTERN:
				setPattern((CoordinationPattern)newValue);
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
			case PatternPackage.COORDINATION_PATTERN__CONSTRAINT:
				getConstraint().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__ROLES:
				getRoles().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__CONNECTOR:
				setConnector((RoleConnector)null);
				return;
			case PatternPackage.COORDINATION_PATTERN__PATTERN:
				setPattern((CoordinationPattern)null);
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
			case PatternPackage.COORDINATION_PATTERN__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__ROLES:
				return roles != null && !roles.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__CONNECTOR:
				return connector != null;
			case PatternPackage.COORDINATION_PATTERN__PATTERN:
				return PATTERN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case PatternPackage.COORDINATION_PATTERN__CONSTRAINT: return CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return PatternPackage.COORDINATION_PATTERN__CONSTRAINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CoordinationPatternImpl

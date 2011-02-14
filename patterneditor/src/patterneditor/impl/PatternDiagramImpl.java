/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patterneditor.impl;

import de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint;

import de.uni_paderborn.fujaba.umlrt.model.modelstructure.impl.DiagramImpl;

import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import patterneditor.PatternDiagram;
import patterneditor.PatterneditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link patterneditor.impl.PatternDiagramImpl#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link patterneditor.impl.PatternDiagramImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link patterneditor.impl.PatternDiagramImpl#getRoleConnectors <em>Role Connectors</em>}</li>
 *   <li>{@link patterneditor.impl.PatternDiagramImpl#getTextualConstraints <em>Textual Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternDiagramImpl extends DiagramImpl implements PatternDiagram {
	/**
	 * The cached value of the '{@link #getCoordinationPattern() <em>Coordination Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationPattern()
	 * @generated
	 * @ordered
	 */
	protected CoordinationPattern coordinationPattern;

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
	 * The cached value of the '{@link #getRoleConnectors() <em>Role Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleConnector> roleConnectors;

	/**
	 * The cached value of the '{@link #getTextualConstraints() <em>Textual Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextualConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TextualConstraint> textualConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatterneditorPackage.Literals.PATTERN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getCoordinationPattern() {
		return coordinationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationPattern(CoordinationPattern newCoordinationPattern, NotificationChain msgs) {
		CoordinationPattern oldCoordinationPattern = coordinationPattern;
		coordinationPattern = newCoordinationPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN, oldCoordinationPattern, newCoordinationPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationPattern(CoordinationPattern newCoordinationPattern) {
		if (newCoordinationPattern != coordinationPattern) {
			NotificationChain msgs = null;
			if (coordinationPattern != null)
				msgs = ((InternalEObject)coordinationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN, null, msgs);
			if (newCoordinationPattern != null)
				msgs = ((InternalEObject)newCoordinationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN, null, msgs);
			msgs = basicSetCoordinationPattern(newCoordinationPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN, newCoordinationPattern, newCoordinationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, PatterneditorPackage.PATTERN_DIAGRAM__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleConnector> getRoleConnectors() {
		if (roleConnectors == null) {
			roleConnectors = new EObjectContainmentEList<RoleConnector>(RoleConnector.class, this, PatterneditorPackage.PATTERN_DIAGRAM__ROLE_CONNECTORS);
		}
		return roleConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextualConstraint> getTextualConstraints() {
		if (textualConstraints == null) {
			textualConstraints = new EObjectContainmentEList<TextualConstraint>(TextualConstraint.class, this, PatterneditorPackage.PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS);
		}
		return textualConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN:
				return basicSetCoordinationPattern(null, msgs);
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLE_CONNECTORS:
				return ((InternalEList<?>)getRoleConnectors()).basicRemove(otherEnd, msgs);
			case PatterneditorPackage.PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS:
				return ((InternalEList<?>)getTextualConstraints()).basicRemove(otherEnd, msgs);
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
			case PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN:
				return getCoordinationPattern();
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLES:
				return getRoles();
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLE_CONNECTORS:
				return getRoleConnectors();
			case PatterneditorPackage.PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS:
				return getTextualConstraints();
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
			case PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)newValue);
				return;
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLE_CONNECTORS:
				getRoleConnectors().clear();
				getRoleConnectors().addAll((Collection<? extends RoleConnector>)newValue);
				return;
			case PatterneditorPackage.PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS:
				getTextualConstraints().clear();
				getTextualConstraints().addAll((Collection<? extends TextualConstraint>)newValue);
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
			case PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)null);
				return;
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLES:
				getRoles().clear();
				return;
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLE_CONNECTORS:
				getRoleConnectors().clear();
				return;
			case PatterneditorPackage.PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS:
				getTextualConstraints().clear();
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
			case PatterneditorPackage.PATTERN_DIAGRAM__COORDINATION_PATTERN:
				return coordinationPattern != null;
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLES:
				return roles != null && !roles.isEmpty();
			case PatterneditorPackage.PATTERN_DIAGRAM__ROLE_CONNECTORS:
				return roleConnectors != null && !roleConnectors.isEmpty();
			case PatterneditorPackage.PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS:
				return textualConstraints != null && !textualConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternDiagramImpl

/**
 */
package de.uni_paderborn.fujaba.muml.protocol.impl;

import de.uni_paderborn.fujaba.muml.constraint.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.protocol.RoleConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Coordination Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.AbstractCoordinationSpecificationImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.AbstractCoordinationSpecificationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.AbstractCoordinationSpecificationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.impl.AbstractCoordinationSpecificationImpl#getRoleConnector <em>Role Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCoordinationSpecificationImpl extends NamedElementImpl implements AbstractCoordinationSpecification {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getRoleConnector() <em>Role Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleConnector()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector roleConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCoordinationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES, ProtocolPackage.ROLE__COORDINATION_PROTOCOL);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getRoleConnector() {
		return roleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleConnector(RoleConnector newRoleConnector, NotificationChain msgs) {
		RoleConnector oldRoleConnector = roleConnector;
		roleConnector = newRoleConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR, oldRoleConnector, newRoleConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleConnector(RoleConnector newRoleConnector) {
		if (newRoleConnector != roleConnector) {
			NotificationChain msgs = null;
			if (roleConnector != null)
				msgs = ((InternalEObject)roleConnector).eInverseRemove(this, ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL, RoleConnector.class, msgs);
			if (newRoleConnector != null)
				msgs = ((InternalEObject)newRoleConnector).eInverseAdd(this, ProtocolPackage.ROLE_CONNECTOR__COORDINATION_PROTOCOL, RoleConnector.class, msgs);
			msgs = basicSetRoleConnector(newRoleConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR, newRoleConnector, newRoleConnector));
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				if (roleConnector != null)
					msgs = ((InternalEObject)roleConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR, null, msgs);
				return basicSetRoleConnector((RoleConnector)otherEnd, msgs);
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				return basicSetRoleConnector(null, msgs);
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT:
				return getConstraint();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				return getComment();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return getRoles();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				return getRoleConnector();
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				setComment((String)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				setRoleConnector((RoleConnector)newValue);
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT:
				getConstraint().clear();
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				getRoles().clear();
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				setRoleConnector((RoleConnector)null);
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return roles != null && !roles.isEmpty();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				return roleConnector != null;
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
				case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT: return ConstraintPackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case ConstraintPackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__CONSTRAINT;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //AbstractCoordinationSpecificationImpl

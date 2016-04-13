/**
 */
package org.muml.pim.protocol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Coordination Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getVerificationConstraintRepositories <em>Verification Constraint Repositories</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getGmfAbstractCoordinationSpecification <em>Gmf Abstract Coordination Specification</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getGmfMessageBuffers <em>Gmf Message Buffers</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getGmfConnectorQualityOfServiceAssumptions <em>Gmf Connector Quality Of Service Assumptions</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl#getAdaptedFromPattern <em>Adapted From Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCoordinationSpecificationImpl extends NamedElementImpl implements AbstractCoordinationSpecification {
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
	 * The cached value of the '{@link #getVerificationConstraintRepositories() <em>Verification Constraint Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationConstraintRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationConstraintRepository> verificationConstraintRepositories;

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
	 * The cached setting delegate for the '{@link #getGmfAbstractCoordinationSpecification() <em>Gmf Abstract Coordination Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfAbstractCoordinationSpecification()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_ABSTRACT_COORDINATION_SPECIFICATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGmfMessageBuffers() <em>Gmf Message Buffers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfMessageBuffers()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_MESSAGE_BUFFERS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGmfConnectorQualityOfServiceAssumptions() <em>Gmf Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfConnectorQualityOfServiceAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ProtocolPackage.Literals.ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAdaptedFromPattern() <em>Adapted From Pattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptedFromPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCoordinationPattern> adaptedFromPattern;

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
	public EList<VerificationConstraintRepository> getVerificationConstraintRepositories() {
		if (verificationConstraintRepositories == null) {
			verificationConstraintRepositories = new EObjectContainmentEList<VerificationConstraintRepository>(VerificationConstraintRepository.class, this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES);
		}
		return verificationConstraintRepositories;
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
	public AbstractCoordinationSpecification getGmfAbstractCoordinationSpecification() {
		return (AbstractCoordinationSpecification)GMF_ABSTRACT_COORDINATION_SPECIFICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmfAbstractCoordinationSpecification(AbstractCoordinationSpecification newGmfAbstractCoordinationSpecification, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Gmf Abstract Coordination Specification' containment reference
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
	@SuppressWarnings("unchecked")
	public EList<MessageBuffer> getGmfMessageBuffers() {
		return (EList<MessageBuffer>)GMF_MESSAGE_BUFFERS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptions getGmfConnectorQualityOfServiceAssumptions() {
		return (ConnectorQualityOfServiceAssumptions)GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmfConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions newGmfConnectorQualityOfServiceAssumptions, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Gmf Connector Quality Of Service Assumptions' containment reference
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
	public EList<AbstractCoordinationPattern> getAdaptedFromPattern() {
		if (adaptedFromPattern == null) {
			adaptedFromPattern = new EObjectResolvingEList<AbstractCoordinationPattern>(AbstractCoordinationPattern.class, this, ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN);
		}
		return adaptedFromPattern;
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return ((InternalEList<?>)getVerificationConstraintRepositories()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				return basicSetRoleConnector(null, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION:
				return basicSetGmfAbstractCoordinationSpecification(null, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS:
				return ((InternalEList<?>)getGmfMessageBuffers()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return basicSetGmfConnectorQualityOfServiceAssumptions(null, msgs);
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				return getComment();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return getVerificationConstraintRepositories();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return getRoles();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				return getRoleConnector();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION:
				return getGmfAbstractCoordinationSpecification();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS:
				return getGmfMessageBuffers();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return getGmfConnectorQualityOfServiceAssumptions();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN:
				return getAdaptedFromPattern();
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				setComment((String)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES:
				getVerificationConstraintRepositories().clear();
				getVerificationConstraintRepositories().addAll((Collection<? extends VerificationConstraintRepository>)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				setRoleConnector((RoleConnector)newValue);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN:
				getAdaptedFromPattern().clear();
				getAdaptedFromPattern().addAll((Collection<? extends AbstractCoordinationPattern>)newValue);
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES:
				getVerificationConstraintRepositories().clear();
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				getRoles().clear();
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				setRoleConnector((RoleConnector)null);
				return;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN:
				getAdaptedFromPattern().clear();
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
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return verificationConstraintRepositories != null && !verificationConstraintRepositories.isEmpty();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLES:
				return roles != null && !roles.isEmpty();
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR:
				return roleConnector != null;
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION:
				return GMF_ABSTRACT_COORDINATION_SPECIFICATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS:
				return GMF_MESSAGE_BUFFERS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN:
				return adaptedFromPattern != null && !adaptedFromPattern.isEmpty();
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
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES: return ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES;
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
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES: return ProtocolPackage.ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES;
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

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import de.uni_paderborn.fujaba.muml.model.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getIncomingRoleConnector <em>Incoming Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#isIsMultiRole <em>Is Multi Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends DiscreteInteractionPointImpl implements Role {
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
	 * The cached value of the '{@link #getIncomingRoleConnector() <em>Incoming Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRoleConnector()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector incomingRoleConnector;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscretePort> port;

	/**
	 * The cached value of the '{@link #getOutgoingRoleConnector() <em>Outgoing Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRoleConnector()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector outgoingRoleConnector;

	/**
	 * The cached setting delegate for the '{@link #getRoleConnector() <em>Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleConnector()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROLE_CONNECTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternPackage.Literals.ROLE__ROLE_CONNECTOR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsMultiRole() <em>Is Multi Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiRole()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_MULTI_ROLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternPackage.Literals.ROLE__IS_MULTI_ROLE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getReceiverMessageBuffer() <em>Receiver Message Buffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBuffer> receiverMessageBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getIncomingRoleConnector() {
		if (incomingRoleConnector != null && incomingRoleConnector.eIsProxy()) {
			InternalEObject oldIncomingRoleConnector = (InternalEObject)incomingRoleConnector;
			incomingRoleConnector = (RoleConnector)eResolveProxy(oldIncomingRoleConnector);
			if (incomingRoleConnector != oldIncomingRoleConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR, oldIncomingRoleConnector, incomingRoleConnector));
			}
		}
		return incomingRoleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetIncomingRoleConnector() {
		return incomingRoleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingRoleConnector(RoleConnector newIncomingRoleConnector, NotificationChain msgs) {
		RoleConnector oldIncomingRoleConnector = incomingRoleConnector;
		incomingRoleConnector = newIncomingRoleConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR, oldIncomingRoleConnector, newIncomingRoleConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingRoleConnector(RoleConnector newIncomingRoleConnector) {
		if (newIncomingRoleConnector != incomingRoleConnector) {
			NotificationChain msgs = null;
			if (incomingRoleConnector != null)
				msgs = ((InternalEObject)incomingRoleConnector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__TARGET, RoleConnector.class, msgs);
			if (newIncomingRoleConnector != null)
				msgs = ((InternalEObject)newIncomingRoleConnector).eInverseAdd(this, PatternPackage.ROLE_CONNECTOR__TARGET, RoleConnector.class, msgs);
			msgs = basicSetIncomingRoleConnector(newIncomingRoleConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR, newIncomingRoleConnector, newIncomingRoleConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getRoleConnector() {
		return (RoleConnector)ROLE_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetRoleConnector() {
		return (RoleConnector)ROLE_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiRole() {
		return (Boolean)IS_MULTI_ROLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		if (receiverMessageBuffer == null) {
			receiverMessageBuffer = new EObjectContainmentWithInverseEList<MessageBuffer>(MessageBuffer.class, this, PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER, PatternPackage.MESSAGE_BUFFER__ROLE);
		}
		return receiverMessageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getCoordinationPattern() {
		if (eContainerFeatureID() != PatternPackage.ROLE__COORDINATION_PATTERN) return null;
		return (CoordinationPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationPattern(CoordinationPattern newCoordinationPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoordinationPattern, PatternPackage.ROLE__COORDINATION_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationPattern(CoordinationPattern newCoordinationPattern) {
		if (newCoordinationPattern != eInternalContainer() || (eContainerFeatureID() != PatternPackage.ROLE__COORDINATION_PATTERN && newCoordinationPattern != null)) {
			if (EcoreUtil.isAncestor(this, newCoordinationPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoordinationPattern != null)
				msgs = ((InternalEObject)newCoordinationPattern).eInverseAdd(this, PatternPackage.COORDINATION_PATTERN__ROLES, CoordinationPattern.class, msgs);
			msgs = basicSetCoordinationPattern(newCoordinationPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__COORDINATION_PATTERN, newCoordinationPattern, newCoordinationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ROLE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ROLE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscretePort> getPort() {
		if (port == null) {
			port = new EObjectWithInverseResolvingEList<DiscretePort>(DiscretePort.class, this, PatternPackage.ROLE__PORT, ComponentPackage.DISCRETE_PORT__REFINES);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getOutgoingRoleConnector() {
		if (outgoingRoleConnector != null && outgoingRoleConnector.eIsProxy()) {
			InternalEObject oldOutgoingRoleConnector = (InternalEObject)outgoingRoleConnector;
			outgoingRoleConnector = (RoleConnector)eResolveProxy(oldOutgoingRoleConnector);
			if (outgoingRoleConnector != oldOutgoingRoleConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR, oldOutgoingRoleConnector, outgoingRoleConnector));
			}
		}
		return outgoingRoleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetOutgoingRoleConnector() {
		return outgoingRoleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingRoleConnector(RoleConnector newOutgoingRoleConnector, NotificationChain msgs) {
		RoleConnector oldOutgoingRoleConnector = outgoingRoleConnector;
		outgoingRoleConnector = newOutgoingRoleConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR, oldOutgoingRoleConnector, newOutgoingRoleConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingRoleConnector(RoleConnector newOutgoingRoleConnector) {
		if (newOutgoingRoleConnector != outgoingRoleConnector) {
			NotificationChain msgs = null;
			if (outgoingRoleConnector != null)
				msgs = ((InternalEObject)outgoingRoleConnector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
			if (newOutgoingRoleConnector != null)
				msgs = ((InternalEObject)newOutgoingRoleConnector).eInverseAdd(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
			msgs = basicSetOutgoingRoleConnector(newOutgoingRoleConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR, newOutgoingRoleConnector, newOutgoingRoleConnector));
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
			case PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR:
				if (incomingRoleConnector != null)
					msgs = ((InternalEObject)incomingRoleConnector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__TARGET, RoleConnector.class, msgs);
				return basicSetIncomingRoleConnector((RoleConnector)otherEnd, msgs);
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationPattern((CoordinationPattern)otherEnd, msgs);
			case PatternPackage.ROLE__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
			case PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR:
				if (outgoingRoleConnector != null)
					msgs = ((InternalEObject)outgoingRoleConnector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
				return basicSetOutgoingRoleConnector((RoleConnector)otherEnd, msgs);
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiverMessageBuffer()).basicAdd(otherEnd, msgs);
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
			case PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR:
				return basicSetIncomingRoleConnector(null, msgs);
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return basicSetCoordinationPattern(null, msgs);
			case PatternPackage.ROLE__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case PatternPackage.ROLE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR:
				return basicSetOutgoingRoleConnector(null, msgs);
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<?>)getReceiverMessageBuffer()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__ROLES, CoordinationPattern.class, msgs);
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
			case PatternPackage.ROLE__COMMENT:
				return getComment();
			case PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR:
				if (resolve) return getIncomingRoleConnector();
				return basicGetIncomingRoleConnector();
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return getCoordinationPattern();
			case PatternPackage.ROLE__CARDINALITY:
				return getCardinality();
			case PatternPackage.ROLE__PORT:
				return getPort();
			case PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR:
				if (resolve) return getOutgoingRoleConnector();
				return basicGetOutgoingRoleConnector();
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				if (resolve) return getRoleConnector();
				return basicGetRoleConnector();
			case PatternPackage.ROLE__IS_MULTI_ROLE:
				return isIsMultiRole();
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
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
			case PatternPackage.ROLE__COMMENT:
				setComment((String)newValue);
				return;
			case PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR:
				setIncomingRoleConnector((RoleConnector)newValue);
				return;
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)newValue);
				return;
			case PatternPackage.ROLE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case PatternPackage.ROLE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends DiscretePort>)newValue);
				return;
			case PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR:
				setOutgoingRoleConnector((RoleConnector)newValue);
				return;
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				getReceiverMessageBuffer().addAll((Collection<? extends MessageBuffer>)newValue);
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
			case PatternPackage.ROLE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR:
				setIncomingRoleConnector((RoleConnector)null);
				return;
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)null);
				return;
			case PatternPackage.ROLE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case PatternPackage.ROLE__PORT:
				getPort().clear();
				return;
			case PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR:
				setOutgoingRoleConnector((RoleConnector)null);
				return;
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
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
			case PatternPackage.ROLE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PatternPackage.ROLE__INCOMING_ROLE_CONNECTOR:
				return incomingRoleConnector != null;
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return getCoordinationPattern() != null;
			case PatternPackage.ROLE__CARDINALITY:
				return cardinality != null;
			case PatternPackage.ROLE__PORT:
				return port != null && !port.isEmpty();
			case PatternPackage.ROLE__OUTGOING_ROLE_CONNECTOR:
				return outgoingRoleConnector != null;
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				return ROLE_CONNECTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternPackage.ROLE__IS_MULTI_ROLE:
				return IS_MULTI_ROLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternPackage.ROLE__RECEIVER_MESSAGE_BUFFER:
				return receiverMessageBuffer != null && !receiverMessageBuffer.isEmpty();
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
				case PatternPackage.ROLE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return PatternPackage.ROLE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
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

} //RoleImpl

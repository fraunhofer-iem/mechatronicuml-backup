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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleImpl#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
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
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behavior;

	/**
	 * The cached value of the '{@link #getRoleConnector() <em>Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleConnector()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector roleConnector;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getSenderMessageInterface() <em>Sender Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface senderMessageInterface;

	/**
	 * The cached value of the '{@link #getReceiverMessageInterface() <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface receiverMessageInterface;

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
	 * The cached value of the '{@link #getAdaptationBehavior() <em>Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior adaptationBehavior;

	/**
	 * The cached value of the '{@link #getRoleAndAdaptationBehavior() <em>Role And Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAndAdaptationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior roleAndAdaptationBehavior;

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
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, PatternPackage.ROLE__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, PatternPackage.ROLE__BEHAVIOR, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getRoleConnector() {
		if (roleConnector != null && roleConnector.eIsProxy()) {
			InternalEObject oldRoleConnector = (InternalEObject)roleConnector;
			roleConnector = (RoleConnector)eResolveProxy(oldRoleConnector);
			if (roleConnector != oldRoleConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__ROLE_CONNECTOR, oldRoleConnector, roleConnector));
			}
		}
		return roleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetRoleConnector() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ROLE_CONNECTOR, oldRoleConnector, newRoleConnector);
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
				msgs = ((InternalEObject)roleConnector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
			if (newRoleConnector != null)
				msgs = ((InternalEObject)newRoleConnector).eInverseAdd(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
			msgs = basicSetRoleConnector(newRoleConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ROLE_CONNECTOR, newRoleConnector, newRoleConnector));
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
	public EClass getEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClass(EClass newEClass, NotificationChain msgs) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ECLASS, oldEClass, newEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		if (newEClass != eClass) {
			NotificationChain msgs = null;
			if (eClass != null)
				msgs = ((InternalEObject)eClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ROLE__ECLASS, null, msgs);
			if (newEClass != null)
				msgs = ((InternalEObject)newEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.ROLE__ECLASS, null, msgs);
			msgs = basicSetEClass(newEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ECLASS, newEClass, newEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getSenderMessageInterface() {
		if (senderMessageInterface != null && senderMessageInterface.eIsProxy()) {
			InternalEObject oldSenderMessageInterface = (InternalEObject)senderMessageInterface;
			senderMessageInterface = (MessageInterface)eResolveProxy(oldSenderMessageInterface);
			if (senderMessageInterface != oldSenderMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__SENDER_MESSAGE_INTERFACE, oldSenderMessageInterface, senderMessageInterface));
			}
		}
		return senderMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetSenderMessageInterface() {
		return senderMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderMessageInterface(MessageInterface newSenderMessageInterface) {
		MessageInterface oldSenderMessageInterface = senderMessageInterface;
		senderMessageInterface = newSenderMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__SENDER_MESSAGE_INTERFACE, oldSenderMessageInterface, senderMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getReceiverMessageInterface() {
		if (receiverMessageInterface != null && receiverMessageInterface.eIsProxy()) {
			InternalEObject oldReceiverMessageInterface = (InternalEObject)receiverMessageInterface;
			receiverMessageInterface = (MessageInterface)eResolveProxy(oldReceiverMessageInterface);
			if (receiverMessageInterface != oldReceiverMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__RECEIVER_MESSAGE_INTERFACE, oldReceiverMessageInterface, receiverMessageInterface));
			}
		}
		return receiverMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetReceiverMessageInterface() {
		return receiverMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverMessageInterface(MessageInterface newReceiverMessageInterface) {
		MessageInterface oldReceiverMessageInterface = receiverMessageInterface;
		receiverMessageInterface = newReceiverMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__RECEIVER_MESSAGE_INTERFACE, oldReceiverMessageInterface, receiverMessageInterface));
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
	public Behavior getAdaptationBehavior() {
		if (adaptationBehavior != null && adaptationBehavior.eIsProxy()) {
			InternalEObject oldAdaptationBehavior = (InternalEObject)adaptationBehavior;
			adaptationBehavior = (Behavior)eResolveProxy(oldAdaptationBehavior);
			if (adaptationBehavior != oldAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
			}
		}
		return adaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetAdaptationBehavior() {
		return adaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationBehavior(Behavior newAdaptationBehavior) {
		Behavior oldAdaptationBehavior = adaptationBehavior;
		adaptationBehavior = newAdaptationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getRoleAndAdaptationBehavior() {
		if (roleAndAdaptationBehavior != null && roleAndAdaptationBehavior.eIsProxy()) {
			InternalEObject oldRoleAndAdaptationBehavior = (InternalEObject)roleAndAdaptationBehavior;
			roleAndAdaptationBehavior = (Behavior)eResolveProxy(oldRoleAndAdaptationBehavior);
			if (roleAndAdaptationBehavior != oldRoleAndAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
			}
		}
		return roleAndAdaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetRoleAndAdaptationBehavior() {
		return roleAndAdaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleAndAdaptationBehavior(Behavior newRoleAndAdaptationBehavior) {
		Behavior oldRoleAndAdaptationBehavior = roleAndAdaptationBehavior;
		roleAndAdaptationBehavior = newRoleAndAdaptationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
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
			case PatternPackage.ROLE__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case PatternPackage.ROLE__BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehavior()).basicAdd(otherEnd, msgs);
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				if (roleConnector != null)
					msgs = ((InternalEObject)roleConnector).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
				return basicSetRoleConnector((RoleConnector)otherEnd, msgs);
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoordinationPattern((CoordinationPattern)otherEnd, msgs);
			case PatternPackage.ROLE__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
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
			case PatternPackage.ROLE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case PatternPackage.ROLE__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				return basicSetRoleConnector(null, msgs);
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return basicSetCoordinationPattern(null, msgs);
			case PatternPackage.ROLE__ECLASS:
				return basicSetEClass(null, msgs);
			case PatternPackage.ROLE__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case PatternPackage.ROLE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.ROLE__CONSTRAINT:
				return getConstraint();
			case PatternPackage.ROLE__BEHAVIOR:
				return getBehavior();
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				if (resolve) return getRoleConnector();
				return basicGetRoleConnector();
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return getCoordinationPattern();
			case PatternPackage.ROLE__ECLASS:
				return getEClass();
			case PatternPackage.ROLE__SENDER_MESSAGE_INTERFACE:
				if (resolve) return getSenderMessageInterface();
				return basicGetSenderMessageInterface();
			case PatternPackage.ROLE__RECEIVER_MESSAGE_INTERFACE:
				if (resolve) return getReceiverMessageInterface();
				return basicGetReceiverMessageInterface();
			case PatternPackage.ROLE__CARDINALITY:
				return getCardinality();
			case PatternPackage.ROLE__PORT:
				return getPort();
			case PatternPackage.ROLE__ADAPTATION_BEHAVIOR:
				if (resolve) return getAdaptationBehavior();
				return basicGetAdaptationBehavior();
			case PatternPackage.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR:
				if (resolve) return getRoleAndAdaptationBehavior();
				return basicGetRoleAndAdaptationBehavior();
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
			case PatternPackage.ROLE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PatternPackage.ROLE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				setRoleConnector((RoleConnector)newValue);
				return;
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)newValue);
				return;
			case PatternPackage.ROLE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case PatternPackage.ROLE__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)newValue);
				return;
			case PatternPackage.ROLE__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)newValue);
				return;
			case PatternPackage.ROLE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case PatternPackage.ROLE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends DiscretePort>)newValue);
				return;
			case PatternPackage.ROLE__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)newValue);
				return;
			case PatternPackage.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)newValue);
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
			case PatternPackage.ROLE__CONSTRAINT:
				getConstraint().clear();
				return;
			case PatternPackage.ROLE__BEHAVIOR:
				getBehavior().clear();
				return;
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				setRoleConnector((RoleConnector)null);
				return;
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)null);
				return;
			case PatternPackage.ROLE__ECLASS:
				setEClass((EClass)null);
				return;
			case PatternPackage.ROLE__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)null);
				return;
			case PatternPackage.ROLE__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)null);
				return;
			case PatternPackage.ROLE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case PatternPackage.ROLE__PORT:
				getPort().clear();
				return;
			case PatternPackage.ROLE__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)null);
				return;
			case PatternPackage.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)null);
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
			case PatternPackage.ROLE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case PatternPackage.ROLE__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case PatternPackage.ROLE__ROLE_CONNECTOR:
				return roleConnector != null;
			case PatternPackage.ROLE__COORDINATION_PATTERN:
				return getCoordinationPattern() != null;
			case PatternPackage.ROLE__ECLASS:
				return eClass != null;
			case PatternPackage.ROLE__SENDER_MESSAGE_INTERFACE:
				return senderMessageInterface != null;
			case PatternPackage.ROLE__RECEIVER_MESSAGE_INTERFACE:
				return receiverMessageInterface != null;
			case PatternPackage.ROLE__CARDINALITY:
				return cardinality != null;
			case PatternPackage.ROLE__PORT:
				return port != null && !port.isEmpty();
			case PatternPackage.ROLE__ADAPTATION_BEHAVIOR:
				return adaptationBehavior != null;
			case PatternPackage.ROLE__ROLE_AND_ADAPTATION_BEHAVIOR:
				return roleAndAdaptationBehavior != null;
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
				case PatternPackage.ROLE__CONSTRAINT: return CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
				default: return -1;
			}
		}
		if (baseClass == BehavioralElement.class) {
			switch (derivedFeatureID) {
				case PatternPackage.ROLE__BEHAVIOR: return CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
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
				case CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return PatternPackage.ROLE__CONSTRAINT;
				default: return -1;
			}
		}
		if (baseClass == BehavioralElement.class) {
			switch (baseFeatureID) {
				case CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return PatternPackage.ROLE__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleImpl

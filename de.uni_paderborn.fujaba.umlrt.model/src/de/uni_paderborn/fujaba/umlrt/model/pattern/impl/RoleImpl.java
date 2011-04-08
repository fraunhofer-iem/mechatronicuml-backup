/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.pattern.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint;
import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.impl.RoleImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector channel;

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
	 * The cached value of the '{@link #getUMLRealtimeStatechart() <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected Statechart uMLRealtimeStatechart;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface required;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface provided;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' reference.
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
	protected EList<Port> port;

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
			constraint = new EObjectWithInverseResolvingEList<Constraint>(Constraint.class, this, PatternPackage.ROLE__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getChannel() {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject)channel;
			channel = (RoleConnector)eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel(RoleConnector newChannel, NotificationChain msgs) {
		RoleConnector oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__CHANNEL, oldChannel, newChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(RoleConnector newChannel) {
		if (newChannel != channel) {
			NotificationChain msgs = null;
			if (channel != null)
				msgs = ((InternalEObject)channel).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
			if (newChannel != null)
				msgs = ((InternalEObject)newChannel).eInverseAdd(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
			msgs = basicSetChannel(newChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__CHANNEL, newChannel, newChannel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__PATTERN, oldPattern, pattern));
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
	public NotificationChain basicSetPattern(CoordinationPattern newPattern, NotificationChain msgs) {
		CoordinationPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(CoordinationPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__ROLES, CoordinationPattern.class, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternPackage.COORDINATION_PATTERN__ROLES, CoordinationPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart getUMLRealtimeStatechart() {
		if (uMLRealtimeStatechart != null && uMLRealtimeStatechart.eIsProxy()) {
			InternalEObject oldUMLRealtimeStatechart = (InternalEObject)uMLRealtimeStatechart;
			uMLRealtimeStatechart = (Statechart)eResolveProxy(oldUMLRealtimeStatechart);
			if (uMLRealtimeStatechart != oldUMLRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
			}
		}
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart basicGetUMLRealtimeStatechart() {
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStatechart(Statechart newUMLRealtimeStatechart) {
		Statechart oldUMLRealtimeStatechart = uMLRealtimeStatechart;
		uMLRealtimeStatechart = newUMLRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (MessageInterface)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(MessageInterface newRequired) {
		MessageInterface oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getProvided() {
		if (provided != null && provided.eIsProxy()) {
			InternalEObject oldProvided = (InternalEObject)provided;
			provided = (MessageInterface)eResolveProxy(oldProvided);
			if (provided != oldProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__PROVIDED, oldProvided, provided));
			}
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(MessageInterface newProvided) {
		MessageInterface oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__PROVIDED, oldProvided, provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		if (cardinality != null && cardinality.eIsProxy()) {
			InternalEObject oldCardinality = (InternalEObject)cardinality;
			cardinality = (Cardinality)eResolveProxy(oldCardinality);
			if (cardinality != oldCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.ROLE__CARDINALITY, oldCardinality, cardinality));
			}
		}
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality basicGetCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.ROLE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectWithInverseResolvingEList<Port>(Port.class, this, PatternPackage.ROLE__PORT, ComponentPackage.PORT__REFINES);
		}
		return port;
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
			case PatternPackage.ROLE__CHANNEL:
				if (channel != null)
					msgs = ((InternalEObject)channel).eInverseRemove(this, PatternPackage.ROLE_CONNECTOR__SOURCE, RoleConnector.class, msgs);
				return basicSetChannel((RoleConnector)otherEnd, msgs);
			case PatternPackage.ROLE__PATTERN:
				if (pattern != null)
					msgs = ((InternalEObject)pattern).eInverseRemove(this, PatternPackage.COORDINATION_PATTERN__ROLES, CoordinationPattern.class, msgs);
				return basicSetPattern((CoordinationPattern)otherEnd, msgs);
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
			case PatternPackage.ROLE__CHANNEL:
				return basicSetChannel(null, msgs);
			case PatternPackage.ROLE__PATTERN:
				return basicSetPattern(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.ROLE__CONSTRAINT:
				return getConstraint();
			case PatternPackage.ROLE__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
			case PatternPackage.ROLE__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
			case PatternPackage.ROLE__UML_REALTIME_STATECHART:
				if (resolve) return getUMLRealtimeStatechart();
				return basicGetUMLRealtimeStatechart();
			case PatternPackage.ROLE__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case PatternPackage.ROLE__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case PatternPackage.ROLE__PROVIDED:
				if (resolve) return getProvided();
				return basicGetProvided();
			case PatternPackage.ROLE__CARDINALITY:
				if (resolve) return getCardinality();
				return basicGetCardinality();
			case PatternPackage.ROLE__PORT:
				return getPort();
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
			case PatternPackage.ROLE__CHANNEL:
				setChannel((RoleConnector)newValue);
				return;
			case PatternPackage.ROLE__PATTERN:
				setPattern((CoordinationPattern)newValue);
				return;
			case PatternPackage.ROLE__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((Statechart)newValue);
				return;
			case PatternPackage.ROLE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case PatternPackage.ROLE__REQUIRED:
				setRequired((MessageInterface)newValue);
				return;
			case PatternPackage.ROLE__PROVIDED:
				setProvided((MessageInterface)newValue);
				return;
			case PatternPackage.ROLE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case PatternPackage.ROLE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
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
			case PatternPackage.ROLE__CHANNEL:
				setChannel((RoleConnector)null);
				return;
			case PatternPackage.ROLE__PATTERN:
				setPattern((CoordinationPattern)null);
				return;
			case PatternPackage.ROLE__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((Statechart)null);
				return;
			case PatternPackage.ROLE__ECLASS:
				setEClass((EClass)null);
				return;
			case PatternPackage.ROLE__REQUIRED:
				setRequired((MessageInterface)null);
				return;
			case PatternPackage.ROLE__PROVIDED:
				setProvided((MessageInterface)null);
				return;
			case PatternPackage.ROLE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case PatternPackage.ROLE__PORT:
				getPort().clear();
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
			case PatternPackage.ROLE__CHANNEL:
				return channel != null;
			case PatternPackage.ROLE__PATTERN:
				return pattern != null;
			case PatternPackage.ROLE__UML_REALTIME_STATECHART:
				return uMLRealtimeStatechart != null;
			case PatternPackage.ROLE__ECLASS:
				return eClass != null;
			case PatternPackage.ROLE__REQUIRED:
				return required != null;
			case PatternPackage.ROLE__PROVIDED:
				return provided != null;
			case PatternPackage.ROLE__CARDINALITY:
				return cardinality != null;
			case PatternPackage.ROLE__PORT:
				return port != null && !port.isEmpty();
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
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleImpl

/**
 */
package org.muml.cbs.dependencylanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.Event;
import org.muml.cbs.dependencylanguage.Synchronization;
import org.muml.core.expressions.Expression;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl#getSendingEvents <em>Sending Events</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl#getReceivingEvents <em>Receiving Events</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl#getChannelName <em>Channel Name</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl#getSelectorType <em>Selector Type</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl#getGeneralSelectorExpression <em>General Selector Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizationImpl extends DependencyImpl implements Synchronization {
	/**
	 * The cached value of the '{@link #getSendingEvents() <em>Sending Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> sendingEvents;

	/**
	 * The cached value of the '{@link #getReceivingEvents() <em>Receiving Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> receivingEvents;

	/**
	 * The default value of the '{@link #getChannelName() <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelName() <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelName()
	 * @generated
	 * @ordered
	 */
	protected String channelName = CHANNEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectorType() <em>Selector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorType()
	 * @generated
	 * @ordered
	 */
	protected DataType selectorType;

	/**
	 * The cached value of the '{@link #getGeneralSelectorExpression() <em>General Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralSelectorExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression generalSelectorExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.SYNCHRONIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getSendingEvents() {
		if (sendingEvents == null) {
			sendingEvents = new EObjectContainmentEList<Event>(Event.class, this, DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS);
		}
		return sendingEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getReceivingEvents() {
		if (receivingEvents == null) {
			receivingEvents = new EObjectContainmentEList<Event>(Event.class, this, DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS);
		}
		return receivingEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelName(String newChannelName) {
		String oldChannelName = channelName;
		channelName = newChannelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION__CHANNEL_NAME, oldChannelName, channelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSelectorType() {
		if (selectorType != null && selectorType.eIsProxy()) {
			InternalEObject oldSelectorType = (InternalEObject)selectorType;
			selectorType = (DataType)eResolveProxy(oldSelectorType);
			if (selectorType != oldSelectorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencylanguagePackage.SYNCHRONIZATION__SELECTOR_TYPE, oldSelectorType, selectorType));
			}
		}
		return selectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSelectorType() {
		return selectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectorType(DataType newSelectorType) {
		DataType oldSelectorType = selectorType;
		selectorType = newSelectorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION__SELECTOR_TYPE, oldSelectorType, selectorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getGeneralSelectorExpression() {
		return generalSelectorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralSelectorExpression(Expression newGeneralSelectorExpression, NotificationChain msgs) {
		Expression oldGeneralSelectorExpression = generalSelectorExpression;
		generalSelectorExpression = newGeneralSelectorExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION, oldGeneralSelectorExpression, newGeneralSelectorExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralSelectorExpression(Expression newGeneralSelectorExpression) {
		if (newGeneralSelectorExpression != generalSelectorExpression) {
			NotificationChain msgs = null;
			if (generalSelectorExpression != null)
				msgs = ((InternalEObject)generalSelectorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION, null, msgs);
			if (newGeneralSelectorExpression != null)
				msgs = ((InternalEObject)newGeneralSelectorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION, null, msgs);
			msgs = basicSetGeneralSelectorExpression(newGeneralSelectorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION, newGeneralSelectorExpression, newGeneralSelectorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS:
				return ((InternalEList<?>)getSendingEvents()).basicRemove(otherEnd, msgs);
			case DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS:
				return ((InternalEList<?>)getReceivingEvents()).basicRemove(otherEnd, msgs);
			case DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION:
				return basicSetGeneralSelectorExpression(null, msgs);
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
			case DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS:
				return getSendingEvents();
			case DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS:
				return getReceivingEvents();
			case DependencylanguagePackage.SYNCHRONIZATION__CHANNEL_NAME:
				return getChannelName();
			case DependencylanguagePackage.SYNCHRONIZATION__SELECTOR_TYPE:
				if (resolve) return getSelectorType();
				return basicGetSelectorType();
			case DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION:
				return getGeneralSelectorExpression();
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
			case DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS:
				getSendingEvents().clear();
				getSendingEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS:
				getReceivingEvents().clear();
				getReceivingEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__CHANNEL_NAME:
				setChannelName((String)newValue);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__SELECTOR_TYPE:
				setSelectorType((DataType)newValue);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION:
				setGeneralSelectorExpression((Expression)newValue);
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
			case DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS:
				getSendingEvents().clear();
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS:
				getReceivingEvents().clear();
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__CHANNEL_NAME:
				setChannelName(CHANNEL_NAME_EDEFAULT);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__SELECTOR_TYPE:
				setSelectorType((DataType)null);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION:
				setGeneralSelectorExpression((Expression)null);
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
			case DependencylanguagePackage.SYNCHRONIZATION__SENDING_EVENTS:
				return sendingEvents != null && !sendingEvents.isEmpty();
			case DependencylanguagePackage.SYNCHRONIZATION__RECEIVING_EVENTS:
				return receivingEvents != null && !receivingEvents.isEmpty();
			case DependencylanguagePackage.SYNCHRONIZATION__CHANNEL_NAME:
				return CHANNEL_NAME_EDEFAULT == null ? channelName != null : !CHANNEL_NAME_EDEFAULT.equals(channelName);
			case DependencylanguagePackage.SYNCHRONIZATION__SELECTOR_TYPE:
				return selectorType != null;
			case DependencylanguagePackage.SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION:
				return generalSelectorExpression != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (channelName: ");
		result.append(channelName);
		result.append(')');
		return result.toString();
	}

} //SynchronizationImpl

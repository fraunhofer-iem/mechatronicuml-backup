/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.cbs.dependencylanguage.CompositionEvent;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.Event;
import org.muml.core.expressions.common.LogicOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.CompositionEventImpl#getLeftEvent <em>Left Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.CompositionEventImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.CompositionEventImpl#getRightEvent <em>Right Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionEventImpl extends EventImpl implements CompositionEvent {
	/**
	 * The cached value of the '{@link #getLeftEvent() <em>Left Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftEvent()
	 * @generated
	 * @ordered
	 */
	protected Event leftEvent;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final LogicOperator KIND_EDEFAULT = LogicOperator.AND;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LogicOperator kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightEvent() <em>Right Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightEvent()
	 * @generated
	 * @ordered
	 */
	protected Event rightEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.COMPOSITION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getLeftEvent() {
		return leftEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftEvent(Event newLeftEvent, NotificationChain msgs) {
		Event oldLeftEvent = leftEvent;
		leftEvent = newLeftEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT, oldLeftEvent, newLeftEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftEvent(Event newLeftEvent) {
		if (newLeftEvent != leftEvent) {
			NotificationChain msgs = null;
			if (leftEvent != null)
				msgs = ((InternalEObject)leftEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT, null, msgs);
			if (newLeftEvent != null)
				msgs = ((InternalEObject)newLeftEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT, null, msgs);
			msgs = basicSetLeftEvent(newLeftEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT, newLeftEvent, newLeftEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOperator getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(LogicOperator newKind) {
		LogicOperator oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_EVENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getRightEvent() {
		return rightEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightEvent(Event newRightEvent, NotificationChain msgs) {
		Event oldRightEvent = rightEvent;
		rightEvent = newRightEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT, oldRightEvent, newRightEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightEvent(Event newRightEvent) {
		if (newRightEvent != rightEvent) {
			NotificationChain msgs = null;
			if (rightEvent != null)
				msgs = ((InternalEObject)rightEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT, null, msgs);
			if (newRightEvent != null)
				msgs = ((InternalEObject)newRightEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT, null, msgs);
			msgs = basicSetRightEvent(newRightEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT, newRightEvent, newRightEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT:
				return basicSetLeftEvent(null, msgs);
			case DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT:
				return basicSetRightEvent(null, msgs);
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
			case DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT:
				return getLeftEvent();
			case DependencylanguagePackage.COMPOSITION_EVENT__KIND:
				return getKind();
			case DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT:
				return getRightEvent();
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
			case DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT:
				setLeftEvent((Event)newValue);
				return;
			case DependencylanguagePackage.COMPOSITION_EVENT__KIND:
				setKind((LogicOperator)newValue);
				return;
			case DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT:
				setRightEvent((Event)newValue);
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
			case DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT:
				setLeftEvent((Event)null);
				return;
			case DependencylanguagePackage.COMPOSITION_EVENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT:
				setRightEvent((Event)null);
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
			case DependencylanguagePackage.COMPOSITION_EVENT__LEFT_EVENT:
				return leftEvent != null;
			case DependencylanguagePackage.COMPOSITION_EVENT__KIND:
				return kind != KIND_EDEFAULT;
			case DependencylanguagePackage.COMPOSITION_EVENT__RIGHT_EVENT:
				return rightEvent != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //CompositionEventImpl

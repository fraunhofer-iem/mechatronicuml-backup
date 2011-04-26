/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.modeling.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl#getBlocking <em>Blocking</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl#isWCETSpecifiedByUser <em>WCET Specified By User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends ExpressionImpl implements Action {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected static final Long WCET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected Long wcet = WCET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocking() <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final long BLOCKING_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBlocking() <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocking()
	 * @generated
	 * @ordered
	 */
	protected long blocking = BLOCKING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> resets;

	/**
	 * The default value of the '{@link #isWCETSpecifiedByUser() <em>WCET Specified By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWCETSpecifiedByUser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WCET_SPECIFIED_BY_USER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWCETSpecifiedByUser() <em>WCET Specified By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWCETSpecifiedByUser()
	 * @generated
	 * @ordered
	 */
	protected boolean wCETSpecifiedByUser = WCET_SPECIFIED_BY_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getWcet() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcet(Long newWcet) {
		Long oldWcet = wcet;
		wcet = newWcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ACTION__WCET, oldWcet, wcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBlocking() {
		return blocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocking(long newBlocking) {
		long oldBlocking = blocking;
		blocking = newBlocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ACTION__BLOCKING, oldBlocking, blocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ACTION__TRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransition, RealtimestatechartPackage.ACTION__TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ACTION__TRANSITION && newTransition != null)) {
			if (EcoreUtil.isAncestor(this, newTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__SIDE_EFFECT, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ACTION__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getResets() {
		if (resets == null) {
			resets = new EObjectResolvingEList<Clock>(Clock.class, this, RealtimestatechartPackage.ACTION__RESETS);
		}
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWCETSpecifiedByUser() {
		return wCETSpecifiedByUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWCETSpecifiedByUser(boolean newWCETSpecifiedByUser) {
		boolean oldWCETSpecifiedByUser = wCETSpecifiedByUser;
		wCETSpecifiedByUser = newWCETSpecifiedByUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ACTION__WCET_SPECIFIED_BY_USER, oldWCETSpecifiedByUser, wCETSpecifiedByUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ACTION__TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.ACTION__TRANSITION:
				return basicSetTransition(null, msgs);
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
			case RealtimestatechartPackage.ACTION__TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__SIDE_EFFECT, Transition.class, msgs);
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
			case RealtimestatechartPackage.ACTION__ID:
				return getId();
			case RealtimestatechartPackage.ACTION__WCET:
				return getWcet();
			case RealtimestatechartPackage.ACTION__BLOCKING:
				return getBlocking();
			case RealtimestatechartPackage.ACTION__TRANSITION:
				return getTransition();
			case RealtimestatechartPackage.ACTION__RESETS:
				return getResets();
			case RealtimestatechartPackage.ACTION__WCET_SPECIFIED_BY_USER:
				return isWCETSpecifiedByUser();
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
			case RealtimestatechartPackage.ACTION__ID:
				setId((String)newValue);
				return;
			case RealtimestatechartPackage.ACTION__WCET:
				setWcet((Long)newValue);
				return;
			case RealtimestatechartPackage.ACTION__BLOCKING:
				setBlocking((Long)newValue);
				return;
			case RealtimestatechartPackage.ACTION__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.ACTION__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.ACTION__WCET_SPECIFIED_BY_USER:
				setWCETSpecifiedByUser((Boolean)newValue);
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
			case RealtimestatechartPackage.ACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimestatechartPackage.ACTION__WCET:
				setWcet(WCET_EDEFAULT);
				return;
			case RealtimestatechartPackage.ACTION__BLOCKING:
				setBlocking(BLOCKING_EDEFAULT);
				return;
			case RealtimestatechartPackage.ACTION__TRANSITION:
				setTransition((Transition)null);
				return;
			case RealtimestatechartPackage.ACTION__RESETS:
				getResets().clear();
				return;
			case RealtimestatechartPackage.ACTION__WCET_SPECIFIED_BY_USER:
				setWCETSpecifiedByUser(WCET_SPECIFIED_BY_USER_EDEFAULT);
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
			case RealtimestatechartPackage.ACTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimestatechartPackage.ACTION__WCET:
				return WCET_EDEFAULT == null ? wcet != null : !WCET_EDEFAULT.equals(wcet);
			case RealtimestatechartPackage.ACTION__BLOCKING:
				return blocking != BLOCKING_EDEFAULT;
			case RealtimestatechartPackage.ACTION__TRANSITION:
				return getTransition() != null;
			case RealtimestatechartPackage.ACTION__RESETS:
				return resets != null && !resets.isEmpty();
			case RealtimestatechartPackage.ACTION__WCET_SPECIFIED_BY_USER:
				return wCETSpecifiedByUser != WCET_SPECIFIED_BY_USER_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", wcet: ");
		result.append(wcet);
		result.append(", blocking: ");
		result.append(blocking);
		result.append(", wCETSpecifiedByUser: ");
		result.append(wCETSpecifiedByUser);
		result.append(')');
		return result.toString();
	}

} //ActionImpl

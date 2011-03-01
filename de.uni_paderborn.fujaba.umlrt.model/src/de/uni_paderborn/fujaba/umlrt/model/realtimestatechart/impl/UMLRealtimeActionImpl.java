/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Realtime Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl#getBlocking <em>Blocking</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl#getUMLRealtimeTransition <em>UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl#isWCETSpecifiedByUser <em>WCET Specified By User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLRealtimeActionImpl extends ExpressionImpl implements UMLRealtimeAction {
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
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLClock> resets;

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
	protected UMLRealtimeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_REALTIME_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_ACTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_ACTION__WCET, oldWcet, wcet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_ACTION__BLOCKING, oldBlocking, blocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition getUMLRealtimeTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION) return null;
		return (UMLRealtimeTransition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeTransition(UMLRealtimeTransition newUMLRealtimeTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUMLRealtimeTransition, RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeTransition(UMLRealtimeTransition newUMLRealtimeTransition) {
		if (newUMLRealtimeTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION && newUMLRealtimeTransition != null)) {
			if (EcoreUtil.isAncestor(this, newUMLRealtimeTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUMLRealtimeTransition != null)
				msgs = ((InternalEObject)newUMLRealtimeTransition).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT, UMLRealtimeTransition.class, msgs);
			msgs = basicSetUMLRealtimeTransition(newUMLRealtimeTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION, newUMLRealtimeTransition, newUMLRealtimeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLClock> getResets() {
		if (resets == null) {
			resets = new EObjectContainmentEList<UMLClock>(UMLClock.class, this, RealtimestatechartPackage.UML_REALTIME_ACTION__RESETS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER, oldWCETSpecifiedByUser, wCETSpecifiedByUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeAction newAction) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUMLRealtimeTransition((UMLRealtimeTransition)otherEnd, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				return basicSetUMLRealtimeTransition(null, msgs);
			case RealtimestatechartPackage.UML_REALTIME_ACTION__RESETS:
				return ((InternalEList<?>)getResets()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT, UMLRealtimeTransition.class, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_ACTION__ID:
				return getId();
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET:
				return getWcet();
			case RealtimestatechartPackage.UML_REALTIME_ACTION__BLOCKING:
				return getBlocking();
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				return getUMLRealtimeTransition();
			case RealtimestatechartPackage.UML_REALTIME_ACTION__RESETS:
				return getResets();
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER:
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
			case RealtimestatechartPackage.UML_REALTIME_ACTION__ID:
				setId((String)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET:
				setWcet((Long)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__BLOCKING:
				setBlocking((Long)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				setUMLRealtimeTransition((UMLRealtimeTransition)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends UMLClock>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER:
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
			case RealtimestatechartPackage.UML_REALTIME_ACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET:
				setWcet(WCET_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__BLOCKING:
				setBlocking(BLOCKING_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				setUMLRealtimeTransition((UMLRealtimeTransition)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__RESETS:
				getResets().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER:
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
			case RealtimestatechartPackage.UML_REALTIME_ACTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET:
				return WCET_EDEFAULT == null ? wcet != null : !WCET_EDEFAULT.equals(wcet);
			case RealtimestatechartPackage.UML_REALTIME_ACTION__BLOCKING:
				return blocking != BLOCKING_EDEFAULT;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION:
				return getUMLRealtimeTransition() != null;
			case RealtimestatechartPackage.UML_REALTIME_ACTION__RESETS:
				return resets != null && !resets.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.UML_REALTIME_ACTION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEACTION:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLRealtimeAction)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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

} //UMLRealtimeActionImpl

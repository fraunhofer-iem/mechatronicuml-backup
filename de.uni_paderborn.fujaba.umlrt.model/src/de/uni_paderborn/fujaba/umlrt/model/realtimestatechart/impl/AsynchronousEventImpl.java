/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl;
import org.storydriven.modeling.expressions.LiteralExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AsynchronousEventImpl#getTriggeredtransition <em>Triggeredtransition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AsynchronousEventImpl#getRaisedtransition <em>Raisedtransition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AsynchronousEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AsynchronousEventImpl#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsynchronousEventImpl extends MethodCallExpressionImpl implements AsynchronousEvent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullEventName() <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullEventName() <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullEventName()
	 * @generated
	 * @ordered
	 */
	protected String fullEventName = FULL_EVENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchronousEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ASYNCHRONOUS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTriggeredtransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggeredtransition(Transition newTriggeredtransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTriggeredtransition, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredtransition(Transition newTriggeredtransition) {
		if (newTriggeredtransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION && newTriggeredtransition != null)) {
			if (EcoreUtil.isAncestor(this, newTriggeredtransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTriggeredtransition != null)
				msgs = ((InternalEObject)newTriggeredtransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, Transition.class, msgs);
			msgs = basicSetTriggeredtransition(newTriggeredtransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION, newTriggeredtransition, newTriggeredtransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRaisedtransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaisedtransition(Transition newRaisedtransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRaisedtransition, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedtransition(Transition newRaisedtransition) {
		if (newRaisedtransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION && newRaisedtransition != null)) {
			if (EcoreUtil.isAncestor(this, newRaisedtransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRaisedtransition != null)
				msgs = ((InternalEObject)newRaisedtransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, Transition.class, msgs);
			msgs = basicSetRaisedtransition(newRaisedtransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION, newRaisedtransition, newRaisedtransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullEventName() {
		return fullEventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullEventName(String newFullEventName) {
		String oldFullEventName = fullEventName;
		fullEventName = newFullEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME, oldFullEventName, fullEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toMyString() {
		String returnString = "";
		
		returnString = ((de.uni_paderborn.fujaba.umlrt.model.msgiface.
				MessageType)this.getCallee()).getName() + "(";
									
			java.util.Iterator<ParameterBinding> iter = this.getOwnedParameterBindings().iterator();
			boolean firstTime = true;
			while(iter.hasNext()){
				ParameterBinding tmp = iter.next();
				String value = ((LiteralExpression)tmp.getValueExpression()).getValue();
				EDataType type = ((LiteralExpression)tmp.getValueExpression()).getValueType();
				if(firstTime){
					firstTime = false;
					returnString = returnString + value + ":" + type.getName();
				}else{
					returnString = returnString + ", " + value + ":" + type.getName();
				}
			}
		
		return returnString + ")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTriggeredtransition((Transition)otherEnd, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRaisedtransition((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				return basicSetTriggeredtransition(null, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				return basicSetRaisedtransition(null, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, Transition.class, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, Transition.class, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				return getTriggeredtransition();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				return getRaisedtransition();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				return getName();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
				return getFullEventName();
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				setTriggeredtransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				setRaisedtransition((Transition)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
				setFullEventName((String)newValue);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				setTriggeredtransition((Transition)null);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				setRaisedtransition((Transition)null);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
				setFullEventName(FULL_EVENT_NAME_EDEFAULT);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION:
				return getTriggeredtransition() != null;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION:
				return getRaisedtransition() != null;
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT__FULL_EVENT_NAME:
				return FULL_EVENT_NAME_EDEFAULT == null ? fullEventName != null : !FULL_EVENT_NAME_EDEFAULT.equals(fullEventName);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT___TO_MY_STRING:
				return toMyString();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fullEventName: ");
		result.append(fullEventName);
		result.append(')');
		return result.toString();
	}

} //AsynchronousEventImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Realtime Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLRealtimeEventImpl extends MethodCallExpressionImpl implements UMLRealtimeEvent {
	/**
	 * The cached value of the '{@link #getTriggeredUMLRealtimeTransition() <em>Triggered UML Realtime Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredUMLRealtimeTransition()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeTransition triggeredUMLRealtimeTransition;

	/**
	 * The cached value of the '{@link #getRaisedUMLRealtimeTransition() <em>Raised UML Realtime Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedUMLRealtimeTransition()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeTransition raisedUMLRealtimeTransition;

	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected String instance = INSTANCE_EDEFAULT;

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
	protected UMLRealtimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_REALTIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition getTriggeredUMLRealtimeTransition() {
		if (triggeredUMLRealtimeTransition != null && triggeredUMLRealtimeTransition.eIsProxy()) {
			InternalEObject oldTriggeredUMLRealtimeTransition = (InternalEObject)triggeredUMLRealtimeTransition;
			triggeredUMLRealtimeTransition = (UMLRealtimeTransition)eResolveProxy(oldTriggeredUMLRealtimeTransition);
			if (triggeredUMLRealtimeTransition != oldTriggeredUMLRealtimeTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION, oldTriggeredUMLRealtimeTransition, triggeredUMLRealtimeTransition));
			}
		}
		return triggeredUMLRealtimeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition basicGetTriggeredUMLRealtimeTransition() {
		return triggeredUMLRealtimeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredUMLRealtimeTransition(UMLRealtimeTransition newTriggeredUMLRealtimeTransition) {
		UMLRealtimeTransition oldTriggeredUMLRealtimeTransition = triggeredUMLRealtimeTransition;
		triggeredUMLRealtimeTransition = newTriggeredUMLRealtimeTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION, oldTriggeredUMLRealtimeTransition, triggeredUMLRealtimeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition getRaisedUMLRealtimeTransition() {
		if (raisedUMLRealtimeTransition != null && raisedUMLRealtimeTransition.eIsProxy()) {
			InternalEObject oldRaisedUMLRealtimeTransition = (InternalEObject)raisedUMLRealtimeTransition;
			raisedUMLRealtimeTransition = (UMLRealtimeTransition)eResolveProxy(oldRaisedUMLRealtimeTransition);
			if (raisedUMLRealtimeTransition != oldRaisedUMLRealtimeTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION, oldRaisedUMLRealtimeTransition, raisedUMLRealtimeTransition));
			}
		}
		return raisedUMLRealtimeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition basicGetRaisedUMLRealtimeTransition() {
		return raisedUMLRealtimeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaisedUMLRealtimeTransition(UMLRealtimeTransition newRaisedUMLRealtimeTransition) {
		UMLRealtimeTransition oldRaisedUMLRealtimeTransition = raisedUMLRealtimeTransition;
		raisedUMLRealtimeTransition = newRaisedUMLRealtimeTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION, oldRaisedUMLRealtimeTransition, raisedUMLRealtimeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(String newInstance) {
		String oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_EVENT__INSTANCE, oldInstance, instance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_EVENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_EVENT__FULL_EVENT_NAME, oldFullEventName, fullEventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeEvent newEvent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				if (resolve) return getTriggeredUMLRealtimeTransition();
				return basicGetTriggeredUMLRealtimeTransition();
			case RealtimestatechartPackage.UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				if (resolve) return getRaisedUMLRealtimeTransition();
				return basicGetRaisedUMLRealtimeTransition();
			case RealtimestatechartPackage.UML_REALTIME_EVENT__INSTANCE:
				return getInstance();
			case RealtimestatechartPackage.UML_REALTIME_EVENT__NAME:
				return getName();
			case RealtimestatechartPackage.UML_REALTIME_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				setTriggeredUMLRealtimeTransition((UMLRealtimeTransition)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				setRaisedUMLRealtimeTransition((UMLRealtimeTransition)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__INSTANCE:
				setInstance((String)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__NAME:
				setName((String)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				setTriggeredUMLRealtimeTransition((UMLRealtimeTransition)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				setRaisedUMLRealtimeTransition((UMLRealtimeTransition)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__INSTANCE:
				setInstance(INSTANCE_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION:
				return triggeredUMLRealtimeTransition != null;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION:
				return raisedUMLRealtimeTransition != null;
			case RealtimestatechartPackage.UML_REALTIME_EVENT__INSTANCE:
				return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
			case RealtimestatechartPackage.UML_REALTIME_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RealtimestatechartPackage.UML_REALTIME_EVENT__FULL_EVENT_NAME:
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
			case RealtimestatechartPackage.UML_REALTIME_EVENT___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEEVENT:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLRealtimeEvent)arguments.get(1));
			case RealtimestatechartPackage.UML_REALTIME_EVENT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UMLRealtimeEventImpl

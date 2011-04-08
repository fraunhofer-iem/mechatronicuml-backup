/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fading Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getMinDuration <em>Min Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getSpline1 <em>Spline1</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getSpline2 <em>Spline2</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getPolynomDegree <em>Polynom Degree</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getPortsByComponentInstance <em>Ports By Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FadingFunctionImpl extends EObjectImpl implements FadingFunction {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDuration() <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinDuration() <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDuration()
	 * @generated
	 * @ordered
	 */
	protected float minDuration = MIN_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDuration() <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxDuration() <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDuration()
	 * @generated
	 * @ordered
	 */
	protected float maxDuration = MAX_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpline1() <em>Spline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpline1()
	 * @generated
	 * @ordered
	 */
	protected static final String SPLINE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpline1() <em>Spline1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpline1()
	 * @generated
	 * @ordered
	 */
	protected String spline1 = SPLINE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpline2() <em>Spline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpline2()
	 * @generated
	 * @ordered
	 */
	protected static final String SPLINE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpline2() <em>Spline2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpline2()
	 * @generated
	 * @ordered
	 */
	protected String spline2 = SPLINE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolynomDegree() <em>Polynom Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomDegree()
	 * @generated
	 * @ordered
	 */
	protected static final int POLYNOM_DEGREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPolynomDegree() <em>Polynom Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomDegree()
	 * @generated
	 * @ordered
	 */
	protected int polynomDegree = POLYNOM_DEGREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortsByComponentInstance() <em>Ports By Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsByComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<ComponentInstance, EList<Port>> portsByComponentInstance;

	/**
	 * The cached value of the '{@link #getPortInstToPortInstMapEntry() <em>Port Inst To Port Inst Map Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstToPortInstMapEntry()
	 * @generated
	 * @ordered
	 */
	protected HashMap<?, ?> portInstToPortInstMapEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadingFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.FADING_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getUMLRealtimeTransitions() {
		if (eContainerFeatureID() != RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeTransitions(Transition newUMLRealtimeTransitions, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUMLRealtimeTransitions, RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeTransitions(Transition newUMLRealtimeTransitions) {
		if (newUMLRealtimeTransitions != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS && newUMLRealtimeTransitions != null)) {
			if (EcoreUtil.isAncestor(this, newUMLRealtimeTransitions))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUMLRealtimeTransitions != null)
				msgs = ((InternalEObject)newUMLRealtimeTransitions).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION, Transition.class, msgs);
			msgs = basicSetUMLRealtimeTransitions(newUMLRealtimeTransitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS, newUMLRealtimeTransitions, newUMLRealtimeTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinDuration() {
		return minDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDuration(float newMinDuration) {
		float oldMinDuration = minDuration;
		minDuration = newMinDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__MIN_DURATION, oldMinDuration, minDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxDuration() {
		return maxDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDuration(float newMaxDuration) {
		float oldMaxDuration = maxDuration;
		maxDuration = newMaxDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__MAX_DURATION, oldMaxDuration, maxDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpline1() {
		return spline1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpline1(String newSpline1) {
		String oldSpline1 = spline1;
		spline1 = newSpline1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__SPLINE1, oldSpline1, spline1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpline2() {
		return spline2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpline2(String newSpline2) {
		String oldSpline2 = spline2;
		spline2 = newSpline2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__SPLINE2, oldSpline2, spline2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPolynomDegree() {
		return polynomDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolynomDegree(int newPolynomDegree) {
		int oldPolynomDegree = polynomDegree;
		polynomDegree = newPolynomDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__POLYNOM_DEGREE, oldPolynomDegree, polynomDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<ComponentInstance, EList<Port>> getPortsByComponentInstance() {
		if (portsByComponentInstance != null && ((EObject)portsByComponentInstance).eIsProxy()) {
			InternalEObject oldPortsByComponentInstance = (InternalEObject)portsByComponentInstance;
			portsByComponentInstance = (Map.Entry<ComponentInstance, EList<Port>>)eResolveProxy(oldPortsByComponentInstance);
			if (portsByComponentInstance != oldPortsByComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE, oldPortsByComponentInstance, portsByComponentInstance));
			}
		}
		return portsByComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ComponentInstance, EList<Port>> basicGetPortsByComponentInstance() {
		return portsByComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsByComponentInstance(Map.Entry<ComponentInstance, EList<Port>> newPortsByComponentInstance) {
		Map.Entry<ComponentInstance, EList<Port>> oldPortsByComponentInstance = portsByComponentInstance;
		portsByComponentInstance = newPortsByComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE, oldPortsByComponentInstance, portsByComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<?, ?> getPortInstToPortInstMapEntry() {
		return portInstToPortInstMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInstToPortInstMapEntry(HashMap<?, ?> newPortInstToPortInstMapEntry) {
		HashMap<?, ?> oldPortInstToPortInstMapEntry = portInstToPortInstMapEntry;
		portInstToPortInstMapEntry = newPortInstToPortInstMapEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY, oldPortInstToPortInstMapEntry, portInstToPortInstMapEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getBreakpoint() {
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
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUMLRealtimeTransitions((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				return basicSetUMLRealtimeTransitions(null, msgs);
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
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION, Transition.class, msgs);
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
			case RealtimestatechartPackage.FADING_FUNCTION__FUNCTION:
				return getFunction();
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				return getUMLRealtimeTransitions();
			case RealtimestatechartPackage.FADING_FUNCTION__MIN_DURATION:
				return getMinDuration();
			case RealtimestatechartPackage.FADING_FUNCTION__MAX_DURATION:
				return getMaxDuration();
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE1:
				return getSpline1();
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE2:
				return getSpline2();
			case RealtimestatechartPackage.FADING_FUNCTION__POLYNOM_DEGREE:
				return getPolynomDegree();
			case RealtimestatechartPackage.FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE:
				if (resolve) return getPortsByComponentInstance();
				return basicGetPortsByComponentInstance();
			case RealtimestatechartPackage.FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY:
				return getPortInstToPortInstMapEntry();
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
			case RealtimestatechartPackage.FADING_FUNCTION__FUNCTION:
				setFunction((String)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				setUMLRealtimeTransitions((Transition)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__MIN_DURATION:
				setMinDuration((Float)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__MAX_DURATION:
				setMaxDuration((Float)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE1:
				setSpline1((String)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE2:
				setSpline2((String)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__POLYNOM_DEGREE:
				setPolynomDegree((Integer)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE:
				setPortsByComponentInstance((Map.Entry<ComponentInstance, EList<Port>>)newValue);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY:
				setPortInstToPortInstMapEntry((HashMap<?, ?>)newValue);
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
			case RealtimestatechartPackage.FADING_FUNCTION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				setUMLRealtimeTransitions((Transition)null);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__MIN_DURATION:
				setMinDuration(MIN_DURATION_EDEFAULT);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__MAX_DURATION:
				setMaxDuration(MAX_DURATION_EDEFAULT);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE1:
				setSpline1(SPLINE1_EDEFAULT);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE2:
				setSpline2(SPLINE2_EDEFAULT);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__POLYNOM_DEGREE:
				setPolynomDegree(POLYNOM_DEGREE_EDEFAULT);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE:
				setPortsByComponentInstance((Map.Entry<ComponentInstance, EList<Port>>)null);
				return;
			case RealtimestatechartPackage.FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY:
				setPortInstToPortInstMapEntry((HashMap<?, ?>)null);
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
			case RealtimestatechartPackage.FADING_FUNCTION__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS:
				return getUMLRealtimeTransitions() != null;
			case RealtimestatechartPackage.FADING_FUNCTION__MIN_DURATION:
				return minDuration != MIN_DURATION_EDEFAULT;
			case RealtimestatechartPackage.FADING_FUNCTION__MAX_DURATION:
				return maxDuration != MAX_DURATION_EDEFAULT;
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE1:
				return SPLINE1_EDEFAULT == null ? spline1 != null : !SPLINE1_EDEFAULT.equals(spline1);
			case RealtimestatechartPackage.FADING_FUNCTION__SPLINE2:
				return SPLINE2_EDEFAULT == null ? spline2 != null : !SPLINE2_EDEFAULT.equals(spline2);
			case RealtimestatechartPackage.FADING_FUNCTION__POLYNOM_DEGREE:
				return polynomDegree != POLYNOM_DEGREE_EDEFAULT;
			case RealtimestatechartPackage.FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE:
				return portsByComponentInstance != null;
			case RealtimestatechartPackage.FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY:
				return portInstToPortInstMapEntry != null;
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
			case RealtimestatechartPackage.FADING_FUNCTION___GET_BREAKPOINT:
				return getBreakpoint();
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
		result.append(" (function: ");
		result.append(function);
		result.append(", minDuration: ");
		result.append(minDuration);
		result.append(", maxDuration: ");
		result.append(maxDuration);
		result.append(", spline1: ");
		result.append(spline1);
		result.append(", spline2: ");
		result.append(spline2);
		result.append(", polynomDegree: ");
		result.append(polynomDegree);
		result.append(", portInstToPortInstMapEntry: ");
		result.append(portInstToPortInstMapEntry);
		result.append(')');
		return result.toString();
	}

} //FadingFunctionImpl

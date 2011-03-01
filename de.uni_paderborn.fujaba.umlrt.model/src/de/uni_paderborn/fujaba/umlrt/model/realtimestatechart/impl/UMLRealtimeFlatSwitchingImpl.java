/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Realtime Flat Switching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getMinDuration <em>Min Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getSpline1 <em>Spline1</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getSpline2 <em>Spline2</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getPolynomDegree <em>Polynom Degree</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLRealtimeFlatSwitchingImpl extends EObjectImpl implements UMLRealtimeFlatSwitching {
	/**
	 * The cached value of the '{@link #getUMLRealtimeTransitions() <em>UML Realtime Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRealtimeTransition> uMLRealtimeTransitions;

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
	protected UMLRealtimeFlatSwitchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLRealtimeTransition> getUMLRealtimeTransitions() {
		if (uMLRealtimeTransitions == null) {
			uMLRealtimeTransitions = new EObjectResolvingEList<UMLRealtimeTransition>(UMLRealtimeTransition.class, this, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS);
		}
		return uMLRealtimeTransitions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION, oldMinDuration, minDuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION, oldMaxDuration, maxDuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE1, oldSpline1, spline1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE2, oldSpline2, spline2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE, oldPolynomDegree, polynomDegree));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY, oldPortInstToPortInstMapEntry, portInstToPortInstMapEntry));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS:
				return getUMLRealtimeTransitions();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION:
				return getMinDuration();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION:
				return getMaxDuration();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE1:
				return getSpline1();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE2:
				return getSpline2();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE:
				return getPolynomDegree();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY:
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
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS:
				getUMLRealtimeTransitions().clear();
				getUMLRealtimeTransitions().addAll((Collection<? extends UMLRealtimeTransition>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION:
				setMinDuration((Float)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION:
				setMaxDuration((Float)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE1:
				setSpline1((String)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE2:
				setSpline2((String)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE:
				setPolynomDegree((Integer)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY:
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
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS:
				getUMLRealtimeTransitions().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION:
				setMinDuration(MIN_DURATION_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION:
				setMaxDuration(MAX_DURATION_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE1:
				setSpline1(SPLINE1_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE2:
				setSpline2(SPLINE2_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE:
				setPolynomDegree(POLYNOM_DEGREE_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY:
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
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS:
				return uMLRealtimeTransitions != null && !uMLRealtimeTransitions.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION:
				return minDuration != MIN_DURATION_EDEFAULT;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION:
				return maxDuration != MAX_DURATION_EDEFAULT;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE1:
				return SPLINE1_EDEFAULT == null ? spline1 != null : !SPLINE1_EDEFAULT.equals(spline1);
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE2:
				return SPLINE2_EDEFAULT == null ? spline2 != null : !SPLINE2_EDEFAULT.equals(spline2);
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE:
				return polynomDegree != POLYNOM_DEGREE_EDEFAULT;
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY:
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
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING___GET_BREAKPOINT:
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
		result.append(" (minDuration: ");
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

} //UMLRealtimeFlatSwitchingImpl

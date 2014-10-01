/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.GlobalResponseTimeList;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.TimingResult;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getBestGlobalResponseTimes <em>Best Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getJitters <em>Jitters</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getBestLocalResponseTime <em>Best Local Response Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getNumOfSuspensions <em>Num Of Suspensions</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getWorstBlockingTime <em>Worst Blocking Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.TimingResultImpl#getWorstLocalResponseTime <em>Worst Local Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingResultImpl extends MinimalEObjectImpl.Container implements TimingResult {
	/**
	 * The cached value of the '{@link #getWorstGlobalResponseTimes() <em>Worst Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstGlobalResponseTimes()
	 * @generated
	 * @ordered
	 */
	protected GlobalResponseTimeList worstGlobalResponseTimes;

	/**
	 * The cached value of the '{@link #getBestGlobalResponseTimes() <em>Best Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestGlobalResponseTimes()
	 * @generated
	 * @ordered
	 */
	protected GlobalResponseTimeList bestGlobalResponseTimes;

	/**
	 * The cached value of the '{@link #getJitters() <em>Jitters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitters()
	 * @generated
	 * @ordered
	 */
	protected GlobalResponseTimeList jitters;

	/**
	 * The default value of the '{@link #getBestLocalResponseTime() <em>Best Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestLocalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final float BEST_LOCAL_RESPONSE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBestLocalResponseTime() <em>Best Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestLocalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected float bestLocalResponseTime = BEST_LOCAL_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Best Local Response Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestLocalResponseTimeESet;

	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfSuspensions() <em>Num Of Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSuspensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_OF_SUSPENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumOfSuspensions() <em>Num Of Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSuspensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numOfSuspensions = NUM_OF_SUSPENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorstBlockingTime() <em>Worst Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_BLOCKING_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstBlockingTime() <em>Worst Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected float worstBlockingTime = WORST_BLOCKING_TIME_EDEFAULT;

	/**
	 * This is true if the Worst Blocking Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstBlockingTimeESet;

	/**
	 * The default value of the '{@link #getWorstLocalResponseTime() <em>Worst Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstLocalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_LOCAL_RESPONSE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstLocalResponseTime() <em>Worst Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstLocalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected float worstLocalResponseTime = WORST_LOCAL_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Worst Local Response Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstLocalResponseTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.TIMING_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalResponseTimeList getWorstGlobalResponseTimes() {
		return worstGlobalResponseTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorstGlobalResponseTimes(GlobalResponseTimeList newWorstGlobalResponseTimes, NotificationChain msgs) {
		GlobalResponseTimeList oldWorstGlobalResponseTimes = worstGlobalResponseTimes;
		worstGlobalResponseTimes = newWorstGlobalResponseTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, oldWorstGlobalResponseTimes, newWorstGlobalResponseTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstGlobalResponseTimes(GlobalResponseTimeList newWorstGlobalResponseTimes) {
		if (newWorstGlobalResponseTimes != worstGlobalResponseTimes) {
			NotificationChain msgs = null;
			if (worstGlobalResponseTimes != null)
				msgs = ((InternalEObject)worstGlobalResponseTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, null, msgs);
			if (newWorstGlobalResponseTimes != null)
				msgs = ((InternalEObject)newWorstGlobalResponseTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, null, msgs);
			msgs = basicSetWorstGlobalResponseTimes(newWorstGlobalResponseTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, newWorstGlobalResponseTimes, newWorstGlobalResponseTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalResponseTimeList getBestGlobalResponseTimes() {
		return bestGlobalResponseTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestGlobalResponseTimes(GlobalResponseTimeList newBestGlobalResponseTimes, NotificationChain msgs) {
		GlobalResponseTimeList oldBestGlobalResponseTimes = bestGlobalResponseTimes;
		bestGlobalResponseTimes = newBestGlobalResponseTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, oldBestGlobalResponseTimes, newBestGlobalResponseTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestGlobalResponseTimes(GlobalResponseTimeList newBestGlobalResponseTimes) {
		if (newBestGlobalResponseTimes != bestGlobalResponseTimes) {
			NotificationChain msgs = null;
			if (bestGlobalResponseTimes != null)
				msgs = ((InternalEObject)bestGlobalResponseTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, null, msgs);
			if (newBestGlobalResponseTimes != null)
				msgs = ((InternalEObject)newBestGlobalResponseTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, null, msgs);
			msgs = basicSetBestGlobalResponseTimes(newBestGlobalResponseTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, newBestGlobalResponseTimes, newBestGlobalResponseTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalResponseTimeList getJitters() {
		return jitters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitters(GlobalResponseTimeList newJitters, NotificationChain msgs) {
		GlobalResponseTimeList oldJitters = jitters;
		jitters = newJitters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__JITTERS, oldJitters, newJitters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitters(GlobalResponseTimeList newJitters) {
		if (newJitters != jitters) {
			NotificationChain msgs = null;
			if (jitters != null)
				msgs = ((InternalEObject)jitters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.TIMING_RESULT__JITTERS, null, msgs);
			if (newJitters != null)
				msgs = ((InternalEObject)newJitters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.TIMING_RESULT__JITTERS, null, msgs);
			msgs = basicSetJitters(newJitters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__JITTERS, newJitters, newJitters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBestLocalResponseTime() {
		return bestLocalResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestLocalResponseTime(float newBestLocalResponseTime) {
		float oldBestLocalResponseTime = bestLocalResponseTime;
		bestLocalResponseTime = newBestLocalResponseTime;
		boolean oldBestLocalResponseTimeESet = bestLocalResponseTimeESet;
		bestLocalResponseTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME, oldBestLocalResponseTime, bestLocalResponseTime, !oldBestLocalResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBestLocalResponseTime() {
		float oldBestLocalResponseTime = bestLocalResponseTime;
		boolean oldBestLocalResponseTimeESet = bestLocalResponseTimeESet;
		bestLocalResponseTime = BEST_LOCAL_RESPONSE_TIME_EDEFAULT;
		bestLocalResponseTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME, oldBestLocalResponseTime, BEST_LOCAL_RESPONSE_TIME_EDEFAULT, oldBestLocalResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBestLocalResponseTime() {
		return bestLocalResponseTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumOfSuspensions() {
		return numOfSuspensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfSuspensions(BigInteger newNumOfSuspensions) {
		BigInteger oldNumOfSuspensions = numOfSuspensions;
		numOfSuspensions = newNumOfSuspensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__NUM_OF_SUSPENSIONS, oldNumOfSuspensions, numOfSuspensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstBlockingTime() {
		return worstBlockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstBlockingTime(float newWorstBlockingTime) {
		float oldWorstBlockingTime = worstBlockingTime;
		worstBlockingTime = newWorstBlockingTime;
		boolean oldWorstBlockingTimeESet = worstBlockingTimeESet;
		worstBlockingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__WORST_BLOCKING_TIME, oldWorstBlockingTime, worstBlockingTime, !oldWorstBlockingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstBlockingTime() {
		float oldWorstBlockingTime = worstBlockingTime;
		boolean oldWorstBlockingTimeESet = worstBlockingTimeESet;
		worstBlockingTime = WORST_BLOCKING_TIME_EDEFAULT;
		worstBlockingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.TIMING_RESULT__WORST_BLOCKING_TIME, oldWorstBlockingTime, WORST_BLOCKING_TIME_EDEFAULT, oldWorstBlockingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstBlockingTime() {
		return worstBlockingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstLocalResponseTime() {
		return worstLocalResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstLocalResponseTime(float newWorstLocalResponseTime) {
		float oldWorstLocalResponseTime = worstLocalResponseTime;
		worstLocalResponseTime = newWorstLocalResponseTime;
		boolean oldWorstLocalResponseTimeESet = worstLocalResponseTimeESet;
		worstLocalResponseTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME, oldWorstLocalResponseTime, worstLocalResponseTime, !oldWorstLocalResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstLocalResponseTime() {
		float oldWorstLocalResponseTime = worstLocalResponseTime;
		boolean oldWorstLocalResponseTimeESet = worstLocalResponseTimeESet;
		worstLocalResponseTime = WORST_LOCAL_RESPONSE_TIME_EDEFAULT;
		worstLocalResponseTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME, oldWorstLocalResponseTime, WORST_LOCAL_RESPONSE_TIME_EDEFAULT, oldWorstLocalResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstLocalResponseTime() {
		return worstLocalResponseTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				return basicSetWorstGlobalResponseTimes(null, msgs);
			case ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				return basicSetBestGlobalResponseTimes(null, msgs);
			case ResultPackage.TIMING_RESULT__JITTERS:
				return basicSetJitters(null, msgs);
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
			case ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				return getWorstGlobalResponseTimes();
			case ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				return getBestGlobalResponseTimes();
			case ResultPackage.TIMING_RESULT__JITTERS:
				return getJitters();
			case ResultPackage.TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				return getBestLocalResponseTime();
			case ResultPackage.TIMING_RESULT__EVENT_NAME:
				return getEventName();
			case ResultPackage.TIMING_RESULT__NUM_OF_SUSPENSIONS:
				return getNumOfSuspensions();
			case ResultPackage.TIMING_RESULT__WORST_BLOCKING_TIME:
				return getWorstBlockingTime();
			case ResultPackage.TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
				return getWorstLocalResponseTime();
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
			case ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				setWorstGlobalResponseTimes((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				setBestGlobalResponseTimes((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.TIMING_RESULT__JITTERS:
				setJitters((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				setBestLocalResponseTime((Float)newValue);
				return;
			case ResultPackage.TIMING_RESULT__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case ResultPackage.TIMING_RESULT__NUM_OF_SUSPENSIONS:
				setNumOfSuspensions((BigInteger)newValue);
				return;
			case ResultPackage.TIMING_RESULT__WORST_BLOCKING_TIME:
				setWorstBlockingTime((Float)newValue);
				return;
			case ResultPackage.TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
				setWorstLocalResponseTime((Float)newValue);
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
			case ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				setWorstGlobalResponseTimes((GlobalResponseTimeList)null);
				return;
			case ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				setBestGlobalResponseTimes((GlobalResponseTimeList)null);
				return;
			case ResultPackage.TIMING_RESULT__JITTERS:
				setJitters((GlobalResponseTimeList)null);
				return;
			case ResultPackage.TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				unsetBestLocalResponseTime();
				return;
			case ResultPackage.TIMING_RESULT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case ResultPackage.TIMING_RESULT__NUM_OF_SUSPENSIONS:
				setNumOfSuspensions(NUM_OF_SUSPENSIONS_EDEFAULT);
				return;
			case ResultPackage.TIMING_RESULT__WORST_BLOCKING_TIME:
				unsetWorstBlockingTime();
				return;
			case ResultPackage.TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
				unsetWorstLocalResponseTime();
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
			case ResultPackage.TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				return worstGlobalResponseTimes != null;
			case ResultPackage.TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				return bestGlobalResponseTimes != null;
			case ResultPackage.TIMING_RESULT__JITTERS:
				return jitters != null;
			case ResultPackage.TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				return isSetBestLocalResponseTime();
			case ResultPackage.TIMING_RESULT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case ResultPackage.TIMING_RESULT__NUM_OF_SUSPENSIONS:
				return NUM_OF_SUSPENSIONS_EDEFAULT == null ? numOfSuspensions != null : !NUM_OF_SUSPENSIONS_EDEFAULT.equals(numOfSuspensions);
			case ResultPackage.TIMING_RESULT__WORST_BLOCKING_TIME:
				return isSetWorstBlockingTime();
			case ResultPackage.TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
				return isSetWorstLocalResponseTime();
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
		result.append(" (bestLocalResponseTime: ");
		if (bestLocalResponseTimeESet) result.append(bestLocalResponseTime); else result.append("<unset>");
		result.append(", eventName: ");
		result.append(eventName);
		result.append(", numOfSuspensions: ");
		result.append(numOfSuspensions);
		result.append(", worstBlockingTime: ");
		if (worstBlockingTimeESet) result.append(worstBlockingTime); else result.append("<unset>");
		result.append(", worstLocalResponseTime: ");
		if (worstLocalResponseTimeESet) result.append(worstLocalResponseTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimingResultImpl

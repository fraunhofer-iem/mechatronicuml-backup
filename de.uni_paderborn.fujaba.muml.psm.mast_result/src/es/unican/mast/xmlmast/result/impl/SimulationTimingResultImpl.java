/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.GlobalMissRatioList;
import es.unican.mast.xmlmast.result.GlobalResponseTimeList;
import es.unican.mast.xmlmast.result.MissRatioList;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.SimulationTimingResult;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Timing Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getAvgGlobalResponseTimes <em>Avg Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getBestGlobalResponseTimes <em>Best Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getJitters <em>Jitters</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getLocalMissRatios <em>Local Miss Ratios</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getGlobalMissRatios <em>Global Miss Ratios</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getAvgBlockingTime <em>Avg Blocking Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getAvgLocalResponseTime <em>Avg Local Response Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getBestLocalResponseTime <em>Best Local Response Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getMaxPreemptionTime <em>Max Preemption Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getNumOfQueuedActivations <em>Num Of Queued Activations</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getNumOfSuspensions <em>Num Of Suspensions</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getSuspensionTime <em>Suspension Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getWorstBlockingTime <em>Worst Blocking Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SimulationTimingResultImpl#getWorstLocalResponseTime <em>Worst Local Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulationTimingResultImpl extends MinimalEObjectImpl.Container implements SimulationTimingResult {
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
	 * The cached value of the '{@link #getAvgGlobalResponseTimes() <em>Avg Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgGlobalResponseTimes()
	 * @generated
	 * @ordered
	 */
	protected GlobalResponseTimeList avgGlobalResponseTimes;

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
	 * The cached value of the '{@link #getLocalMissRatios() <em>Local Miss Ratios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMissRatios()
	 * @generated
	 * @ordered
	 */
	protected MissRatioList localMissRatios;

	/**
	 * The cached value of the '{@link #getGlobalMissRatios() <em>Global Miss Ratios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalMissRatios()
	 * @generated
	 * @ordered
	 */
	protected GlobalMissRatioList globalMissRatios;

	/**
	 * The default value of the '{@link #getAvgBlockingTime() <em>Avg Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_BLOCKING_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgBlockingTime() <em>Avg Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected float avgBlockingTime = AVG_BLOCKING_TIME_EDEFAULT;

	/**
	 * This is true if the Avg Blocking Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgBlockingTimeESet;

	/**
	 * The default value of the '{@link #getAvgLocalResponseTime() <em>Avg Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgLocalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_LOCAL_RESPONSE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgLocalResponseTime() <em>Avg Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgLocalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected float avgLocalResponseTime = AVG_LOCAL_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Avg Local Response Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgLocalResponseTimeESet;

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
	 * The default value of the '{@link #getMaxPreemptionTime() <em>Max Preemption Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPreemptionTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_PREEMPTION_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxPreemptionTime() <em>Max Preemption Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPreemptionTime()
	 * @generated
	 * @ordered
	 */
	protected float maxPreemptionTime = MAX_PREEMPTION_TIME_EDEFAULT;

	/**
	 * This is true if the Max Preemption Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxPreemptionTimeESet;

	/**
	 * The default value of the '{@link #getNumOfQueuedActivations() <em>Num Of Queued Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfQueuedActivations()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_OF_QUEUED_ACTIVATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumOfQueuedActivations() <em>Num Of Queued Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfQueuedActivations()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numOfQueuedActivations = NUM_OF_QUEUED_ACTIVATIONS_EDEFAULT;

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
	 * The default value of the '{@link #getSuspensionTime() <em>Suspension Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspensionTime()
	 * @generated
	 * @ordered
	 */
	protected static final float SUSPENSION_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuspensionTime() <em>Suspension Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspensionTime()
	 * @generated
	 * @ordered
	 */
	protected float suspensionTime = SUSPENSION_TIME_EDEFAULT;

	/**
	 * This is true if the Suspension Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suspensionTimeESet;

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
	protected SimulationTimingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.SIMULATION_TIMING_RESULT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, oldWorstGlobalResponseTimes, newWorstGlobalResponseTimes);
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
				msgs = ((InternalEObject)worstGlobalResponseTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, null, msgs);
			if (newWorstGlobalResponseTimes != null)
				msgs = ((InternalEObject)newWorstGlobalResponseTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, null, msgs);
			msgs = basicSetWorstGlobalResponseTimes(newWorstGlobalResponseTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES, newWorstGlobalResponseTimes, newWorstGlobalResponseTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalResponseTimeList getAvgGlobalResponseTimes() {
		return avgGlobalResponseTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvgGlobalResponseTimes(GlobalResponseTimeList newAvgGlobalResponseTimes, NotificationChain msgs) {
		GlobalResponseTimeList oldAvgGlobalResponseTimes = avgGlobalResponseTimes;
		avgGlobalResponseTimes = newAvgGlobalResponseTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES, oldAvgGlobalResponseTimes, newAvgGlobalResponseTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgGlobalResponseTimes(GlobalResponseTimeList newAvgGlobalResponseTimes) {
		if (newAvgGlobalResponseTimes != avgGlobalResponseTimes) {
			NotificationChain msgs = null;
			if (avgGlobalResponseTimes != null)
				msgs = ((InternalEObject)avgGlobalResponseTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES, null, msgs);
			if (newAvgGlobalResponseTimes != null)
				msgs = ((InternalEObject)newAvgGlobalResponseTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES, null, msgs);
			msgs = basicSetAvgGlobalResponseTimes(newAvgGlobalResponseTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES, newAvgGlobalResponseTimes, newAvgGlobalResponseTimes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, oldBestGlobalResponseTimes, newBestGlobalResponseTimes);
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
				msgs = ((InternalEObject)bestGlobalResponseTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, null, msgs);
			if (newBestGlobalResponseTimes != null)
				msgs = ((InternalEObject)newBestGlobalResponseTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, null, msgs);
			msgs = basicSetBestGlobalResponseTimes(newBestGlobalResponseTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES, newBestGlobalResponseTimes, newBestGlobalResponseTimes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__JITTERS, oldJitters, newJitters);
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
				msgs = ((InternalEObject)jitters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__JITTERS, null, msgs);
			if (newJitters != null)
				msgs = ((InternalEObject)newJitters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__JITTERS, null, msgs);
			msgs = basicSetJitters(newJitters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__JITTERS, newJitters, newJitters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissRatioList getLocalMissRatios() {
		return localMissRatios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalMissRatios(MissRatioList newLocalMissRatios, NotificationChain msgs) {
		MissRatioList oldLocalMissRatios = localMissRatios;
		localMissRatios = newLocalMissRatios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS, oldLocalMissRatios, newLocalMissRatios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalMissRatios(MissRatioList newLocalMissRatios) {
		if (newLocalMissRatios != localMissRatios) {
			NotificationChain msgs = null;
			if (localMissRatios != null)
				msgs = ((InternalEObject)localMissRatios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS, null, msgs);
			if (newLocalMissRatios != null)
				msgs = ((InternalEObject)newLocalMissRatios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS, null, msgs);
			msgs = basicSetLocalMissRatios(newLocalMissRatios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS, newLocalMissRatios, newLocalMissRatios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMissRatioList getGlobalMissRatios() {
		return globalMissRatios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalMissRatios(GlobalMissRatioList newGlobalMissRatios, NotificationChain msgs) {
		GlobalMissRatioList oldGlobalMissRatios = globalMissRatios;
		globalMissRatios = newGlobalMissRatios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS, oldGlobalMissRatios, newGlobalMissRatios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalMissRatios(GlobalMissRatioList newGlobalMissRatios) {
		if (newGlobalMissRatios != globalMissRatios) {
			NotificationChain msgs = null;
			if (globalMissRatios != null)
				msgs = ((InternalEObject)globalMissRatios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS, null, msgs);
			if (newGlobalMissRatios != null)
				msgs = ((InternalEObject)newGlobalMissRatios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS, null, msgs);
			msgs = basicSetGlobalMissRatios(newGlobalMissRatios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS, newGlobalMissRatios, newGlobalMissRatios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgBlockingTime() {
		return avgBlockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgBlockingTime(float newAvgBlockingTime) {
		float oldAvgBlockingTime = avgBlockingTime;
		avgBlockingTime = newAvgBlockingTime;
		boolean oldAvgBlockingTimeESet = avgBlockingTimeESet;
		avgBlockingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME, oldAvgBlockingTime, avgBlockingTime, !oldAvgBlockingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgBlockingTime() {
		float oldAvgBlockingTime = avgBlockingTime;
		boolean oldAvgBlockingTimeESet = avgBlockingTimeESet;
		avgBlockingTime = AVG_BLOCKING_TIME_EDEFAULT;
		avgBlockingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME, oldAvgBlockingTime, AVG_BLOCKING_TIME_EDEFAULT, oldAvgBlockingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgBlockingTime() {
		return avgBlockingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgLocalResponseTime() {
		return avgLocalResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgLocalResponseTime(float newAvgLocalResponseTime) {
		float oldAvgLocalResponseTime = avgLocalResponseTime;
		avgLocalResponseTime = newAvgLocalResponseTime;
		boolean oldAvgLocalResponseTimeESet = avgLocalResponseTimeESet;
		avgLocalResponseTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME, oldAvgLocalResponseTime, avgLocalResponseTime, !oldAvgLocalResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgLocalResponseTime() {
		float oldAvgLocalResponseTime = avgLocalResponseTime;
		boolean oldAvgLocalResponseTimeESet = avgLocalResponseTimeESet;
		avgLocalResponseTime = AVG_LOCAL_RESPONSE_TIME_EDEFAULT;
		avgLocalResponseTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME, oldAvgLocalResponseTime, AVG_LOCAL_RESPONSE_TIME_EDEFAULT, oldAvgLocalResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgLocalResponseTime() {
		return avgLocalResponseTimeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME, oldBestLocalResponseTime, bestLocalResponseTime, !oldBestLocalResponseTimeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME, oldBestLocalResponseTime, BEST_LOCAL_RESPONSE_TIME_EDEFAULT, oldBestLocalResponseTimeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxPreemptionTime() {
		return maxPreemptionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPreemptionTime(float newMaxPreemptionTime) {
		float oldMaxPreemptionTime = maxPreemptionTime;
		maxPreemptionTime = newMaxPreemptionTime;
		boolean oldMaxPreemptionTimeESet = maxPreemptionTimeESet;
		maxPreemptionTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME, oldMaxPreemptionTime, maxPreemptionTime, !oldMaxPreemptionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxPreemptionTime() {
		float oldMaxPreemptionTime = maxPreemptionTime;
		boolean oldMaxPreemptionTimeESet = maxPreemptionTimeESet;
		maxPreemptionTime = MAX_PREEMPTION_TIME_EDEFAULT;
		maxPreemptionTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME, oldMaxPreemptionTime, MAX_PREEMPTION_TIME_EDEFAULT, oldMaxPreemptionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxPreemptionTime() {
		return maxPreemptionTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumOfQueuedActivations() {
		return numOfQueuedActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfQueuedActivations(BigInteger newNumOfQueuedActivations) {
		BigInteger oldNumOfQueuedActivations = numOfQueuedActivations;
		numOfQueuedActivations = newNumOfQueuedActivations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS, oldNumOfQueuedActivations, numOfQueuedActivations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS, oldNumOfSuspensions, numOfSuspensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSuspensionTime() {
		return suspensionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspensionTime(float newSuspensionTime) {
		float oldSuspensionTime = suspensionTime;
		suspensionTime = newSuspensionTime;
		boolean oldSuspensionTimeESet = suspensionTimeESet;
		suspensionTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__SUSPENSION_TIME, oldSuspensionTime, suspensionTime, !oldSuspensionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuspensionTime() {
		float oldSuspensionTime = suspensionTime;
		boolean oldSuspensionTimeESet = suspensionTimeESet;
		suspensionTime = SUSPENSION_TIME_EDEFAULT;
		suspensionTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__SUSPENSION_TIME, oldSuspensionTime, SUSPENSION_TIME_EDEFAULT, oldSuspensionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuspensionTime() {
		return suspensionTimeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME, oldWorstBlockingTime, worstBlockingTime, !oldWorstBlockingTimeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME, oldWorstBlockingTime, WORST_BLOCKING_TIME_EDEFAULT, oldWorstBlockingTimeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME, oldWorstLocalResponseTime, worstLocalResponseTime, !oldWorstLocalResponseTimeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME, oldWorstLocalResponseTime, WORST_LOCAL_RESPONSE_TIME_EDEFAULT, oldWorstLocalResponseTimeESet));
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
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				return basicSetWorstGlobalResponseTimes(null, msgs);
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES:
				return basicSetAvgGlobalResponseTimes(null, msgs);
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				return basicSetBestGlobalResponseTimes(null, msgs);
			case ResultPackage.SIMULATION_TIMING_RESULT__JITTERS:
				return basicSetJitters(null, msgs);
			case ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS:
				return basicSetLocalMissRatios(null, msgs);
			case ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS:
				return basicSetGlobalMissRatios(null, msgs);
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
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				return getWorstGlobalResponseTimes();
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES:
				return getAvgGlobalResponseTimes();
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				return getBestGlobalResponseTimes();
			case ResultPackage.SIMULATION_TIMING_RESULT__JITTERS:
				return getJitters();
			case ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS:
				return getLocalMissRatios();
			case ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS:
				return getGlobalMissRatios();
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME:
				return getAvgBlockingTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME:
				return getAvgLocalResponseTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				return getBestLocalResponseTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__EVENT_NAME:
				return getEventName();
			case ResultPackage.SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME:
				return getMaxPreemptionTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS:
				return getNumOfQueuedActivations();
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS:
				return getNumOfSuspensions();
			case ResultPackage.SIMULATION_TIMING_RESULT__SUSPENSION_TIME:
				return getSuspensionTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME:
				return getWorstBlockingTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
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
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				setWorstGlobalResponseTimes((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES:
				setAvgGlobalResponseTimes((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				setBestGlobalResponseTimes((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__JITTERS:
				setJitters((GlobalResponseTimeList)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS:
				setLocalMissRatios((MissRatioList)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS:
				setGlobalMissRatios((GlobalMissRatioList)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME:
				setAvgBlockingTime((Float)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME:
				setAvgLocalResponseTime((Float)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				setBestLocalResponseTime((Float)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME:
				setMaxPreemptionTime((Float)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS:
				setNumOfQueuedActivations((BigInteger)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS:
				setNumOfSuspensions((BigInteger)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__SUSPENSION_TIME:
				setSuspensionTime((Float)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME:
				setWorstBlockingTime((Float)newValue);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
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
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				setWorstGlobalResponseTimes((GlobalResponseTimeList)null);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES:
				setAvgGlobalResponseTimes((GlobalResponseTimeList)null);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				setBestGlobalResponseTimes((GlobalResponseTimeList)null);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__JITTERS:
				setJitters((GlobalResponseTimeList)null);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS:
				setLocalMissRatios((MissRatioList)null);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS:
				setGlobalMissRatios((GlobalMissRatioList)null);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME:
				unsetAvgBlockingTime();
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME:
				unsetAvgLocalResponseTime();
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				unsetBestLocalResponseTime();
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME:
				unsetMaxPreemptionTime();
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS:
				setNumOfQueuedActivations(NUM_OF_QUEUED_ACTIVATIONS_EDEFAULT);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS:
				setNumOfSuspensions(NUM_OF_SUSPENSIONS_EDEFAULT);
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__SUSPENSION_TIME:
				unsetSuspensionTime();
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME:
				unsetWorstBlockingTime();
				return;
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
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
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_GLOBAL_RESPONSE_TIMES:
				return worstGlobalResponseTimes != null;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_GLOBAL_RESPONSE_TIMES:
				return avgGlobalResponseTimes != null;
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_GLOBAL_RESPONSE_TIMES:
				return bestGlobalResponseTimes != null;
			case ResultPackage.SIMULATION_TIMING_RESULT__JITTERS:
				return jitters != null;
			case ResultPackage.SIMULATION_TIMING_RESULT__LOCAL_MISS_RATIOS:
				return localMissRatios != null;
			case ResultPackage.SIMULATION_TIMING_RESULT__GLOBAL_MISS_RATIOS:
				return globalMissRatios != null;
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_BLOCKING_TIME:
				return isSetAvgBlockingTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__AVG_LOCAL_RESPONSE_TIME:
				return isSetAvgLocalResponseTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__BEST_LOCAL_RESPONSE_TIME:
				return isSetBestLocalResponseTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case ResultPackage.SIMULATION_TIMING_RESULT__MAX_PREEMPTION_TIME:
				return isSetMaxPreemptionTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_QUEUED_ACTIVATIONS:
				return NUM_OF_QUEUED_ACTIVATIONS_EDEFAULT == null ? numOfQueuedActivations != null : !NUM_OF_QUEUED_ACTIVATIONS_EDEFAULT.equals(numOfQueuedActivations);
			case ResultPackage.SIMULATION_TIMING_RESULT__NUM_OF_SUSPENSIONS:
				return NUM_OF_SUSPENSIONS_EDEFAULT == null ? numOfSuspensions != null : !NUM_OF_SUSPENSIONS_EDEFAULT.equals(numOfSuspensions);
			case ResultPackage.SIMULATION_TIMING_RESULT__SUSPENSION_TIME:
				return isSetSuspensionTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_BLOCKING_TIME:
				return isSetWorstBlockingTime();
			case ResultPackage.SIMULATION_TIMING_RESULT__WORST_LOCAL_RESPONSE_TIME:
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
		result.append(" (avgBlockingTime: ");
		if (avgBlockingTimeESet) result.append(avgBlockingTime); else result.append("<unset>");
		result.append(", avgLocalResponseTime: ");
		if (avgLocalResponseTimeESet) result.append(avgLocalResponseTime); else result.append("<unset>");
		result.append(", bestLocalResponseTime: ");
		if (bestLocalResponseTimeESet) result.append(bestLocalResponseTime); else result.append("<unset>");
		result.append(", eventName: ");
		result.append(eventName);
		result.append(", maxPreemptionTime: ");
		if (maxPreemptionTimeESet) result.append(maxPreemptionTime); else result.append("<unset>");
		result.append(", numOfQueuedActivations: ");
		result.append(numOfQueuedActivations);
		result.append(", numOfSuspensions: ");
		result.append(numOfSuspensions);
		result.append(", suspensionTime: ");
		if (suspensionTimeESet) result.append(suspensionTime); else result.append("<unset>");
		result.append(", worstBlockingTime: ");
		if (worstBlockingTimeESet) result.append(worstBlockingTime); else result.append("<unset>");
		result.append(", worstLocalResponseTime: ");
		if (worstLocalResponseTimeESet) result.append(worstLocalResponseTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimulationTimingResultImpl

/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.AlarmClockSystemTimer;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.RegularProcessor;
import es.unican.mast.xmlmast.model.TickerSystemTimer;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getTickerSystemTimer <em>Ticker System Timer</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getAlarmClockSystemTimer <em>Alarm Clock System Timer</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getAvgISRSwitch <em>Avg ISR Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getBestISRSwitch <em>Best ISR Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getMaxInterruptPriority <em>Max Interrupt Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getMinInterruptPriority <em>Min Interrupt Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularProcessorImpl#getWorstISRSwitch <em>Worst ISR Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularProcessorImpl extends MinimalEObjectImpl.Container implements RegularProcessor {
	/**
	 * The cached value of the '{@link #getTickerSystemTimer() <em>Ticker System Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickerSystemTimer()
	 * @generated
	 * @ordered
	 */
	protected TickerSystemTimer tickerSystemTimer;

	/**
	 * The cached value of the '{@link #getAlarmClockSystemTimer() <em>Alarm Clock System Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmClockSystemTimer()
	 * @generated
	 * @ordered
	 */
	protected AlarmClockSystemTimer alarmClockSystemTimer;

	/**
	 * The default value of the '{@link #getAvgISRSwitch() <em>Avg ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgISRSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_ISR_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgISRSwitch() <em>Avg ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgISRSwitch()
	 * @generated
	 * @ordered
	 */
	protected float avgISRSwitch = AVG_ISR_SWITCH_EDEFAULT;

	/**
	 * This is true if the Avg ISR Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgISRSwitchESet;

	/**
	 * The default value of the '{@link #getBestISRSwitch() <em>Best ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestISRSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float BEST_ISR_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBestISRSwitch() <em>Best ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestISRSwitch()
	 * @generated
	 * @ordered
	 */
	protected float bestISRSwitch = BEST_ISR_SWITCH_EDEFAULT;

	/**
	 * This is true if the Best ISR Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestISRSwitchESet;

	/**
	 * The default value of the '{@link #getMaxInterruptPriority() <em>Max Interrupt Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterruptPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_INTERRUPT_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxInterruptPriority() <em>Max Interrupt Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterruptPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxInterruptPriority = MAX_INTERRUPT_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInterruptPriority() <em>Min Interrupt Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterruptPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_INTERRUPT_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinInterruptPriority() <em>Min Interrupt Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterruptPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minInterruptPriority = MIN_INTERRUPT_PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected float speedFactor = SPEED_FACTOR_EDEFAULT;

	/**
	 * This is true if the Speed Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedFactorESet;

	/**
	 * The default value of the '{@link #getWorstISRSwitch() <em>Worst ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstISRSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_ISR_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstISRSwitch() <em>Worst ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstISRSwitch()
	 * @generated
	 * @ordered
	 */
	protected float worstISRSwitch = WORST_ISR_SWITCH_EDEFAULT;

	/**
	 * This is true if the Worst ISR Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstISRSwitchESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REGULAR_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TickerSystemTimer getTickerSystemTimer() {
		return tickerSystemTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTickerSystemTimer(TickerSystemTimer newTickerSystemTimer, NotificationChain msgs) {
		TickerSystemTimer oldTickerSystemTimer = tickerSystemTimer;
		tickerSystemTimer = newTickerSystemTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER, oldTickerSystemTimer, newTickerSystemTimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickerSystemTimer(TickerSystemTimer newTickerSystemTimer) {
		if (newTickerSystemTimer != tickerSystemTimer) {
			NotificationChain msgs = null;
			if (tickerSystemTimer != null)
				msgs = ((InternalEObject)tickerSystemTimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER, null, msgs);
			if (newTickerSystemTimer != null)
				msgs = ((InternalEObject)newTickerSystemTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER, null, msgs);
			msgs = basicSetTickerSystemTimer(newTickerSystemTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER, newTickerSystemTimer, newTickerSystemTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmClockSystemTimer getAlarmClockSystemTimer() {
		return alarmClockSystemTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlarmClockSystemTimer(AlarmClockSystemTimer newAlarmClockSystemTimer, NotificationChain msgs) {
		AlarmClockSystemTimer oldAlarmClockSystemTimer = alarmClockSystemTimer;
		alarmClockSystemTimer = newAlarmClockSystemTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER, oldAlarmClockSystemTimer, newAlarmClockSystemTimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmClockSystemTimer(AlarmClockSystemTimer newAlarmClockSystemTimer) {
		if (newAlarmClockSystemTimer != alarmClockSystemTimer) {
			NotificationChain msgs = null;
			if (alarmClockSystemTimer != null)
				msgs = ((InternalEObject)alarmClockSystemTimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER, null, msgs);
			if (newAlarmClockSystemTimer != null)
				msgs = ((InternalEObject)newAlarmClockSystemTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER, null, msgs);
			msgs = basicSetAlarmClockSystemTimer(newAlarmClockSystemTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER, newAlarmClockSystemTimer, newAlarmClockSystemTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgISRSwitch() {
		return avgISRSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgISRSwitch(float newAvgISRSwitch) {
		float oldAvgISRSwitch = avgISRSwitch;
		avgISRSwitch = newAvgISRSwitch;
		boolean oldAvgISRSwitchESet = avgISRSwitchESet;
		avgISRSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__AVG_ISR_SWITCH, oldAvgISRSwitch, avgISRSwitch, !oldAvgISRSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgISRSwitch() {
		float oldAvgISRSwitch = avgISRSwitch;
		boolean oldAvgISRSwitchESet = avgISRSwitchESet;
		avgISRSwitch = AVG_ISR_SWITCH_EDEFAULT;
		avgISRSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REGULAR_PROCESSOR__AVG_ISR_SWITCH, oldAvgISRSwitch, AVG_ISR_SWITCH_EDEFAULT, oldAvgISRSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgISRSwitch() {
		return avgISRSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBestISRSwitch() {
		return bestISRSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestISRSwitch(float newBestISRSwitch) {
		float oldBestISRSwitch = bestISRSwitch;
		bestISRSwitch = newBestISRSwitch;
		boolean oldBestISRSwitchESet = bestISRSwitchESet;
		bestISRSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__BEST_ISR_SWITCH, oldBestISRSwitch, bestISRSwitch, !oldBestISRSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBestISRSwitch() {
		float oldBestISRSwitch = bestISRSwitch;
		boolean oldBestISRSwitchESet = bestISRSwitchESet;
		bestISRSwitch = BEST_ISR_SWITCH_EDEFAULT;
		bestISRSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REGULAR_PROCESSOR__BEST_ISR_SWITCH, oldBestISRSwitch, BEST_ISR_SWITCH_EDEFAULT, oldBestISRSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBestISRSwitch() {
		return bestISRSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxInterruptPriority() {
		return maxInterruptPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterruptPriority(BigInteger newMaxInterruptPriority) {
		BigInteger oldMaxInterruptPriority = maxInterruptPriority;
		maxInterruptPriority = newMaxInterruptPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY, oldMaxInterruptPriority, maxInterruptPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinInterruptPriority() {
		return minInterruptPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterruptPriority(BigInteger newMinInterruptPriority) {
		BigInteger oldMinInterruptPriority = minInterruptPriority;
		minInterruptPriority = newMinInterruptPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY, oldMinInterruptPriority, minInterruptPriority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(float newSpeedFactor) {
		float oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__SPEED_FACTOR, oldSpeedFactor, speedFactor, !oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpeedFactor() {
		float oldSpeedFactor = speedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactor = SPEED_FACTOR_EDEFAULT;
		speedFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REGULAR_PROCESSOR__SPEED_FACTOR, oldSpeedFactor, SPEED_FACTOR_EDEFAULT, oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpeedFactor() {
		return speedFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstISRSwitch() {
		return worstISRSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstISRSwitch(float newWorstISRSwitch) {
		float oldWorstISRSwitch = worstISRSwitch;
		worstISRSwitch = newWorstISRSwitch;
		boolean oldWorstISRSwitchESet = worstISRSwitchESet;
		worstISRSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_PROCESSOR__WORST_ISR_SWITCH, oldWorstISRSwitch, worstISRSwitch, !oldWorstISRSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstISRSwitch() {
		float oldWorstISRSwitch = worstISRSwitch;
		boolean oldWorstISRSwitchESet = worstISRSwitchESet;
		worstISRSwitch = WORST_ISR_SWITCH_EDEFAULT;
		worstISRSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REGULAR_PROCESSOR__WORST_ISR_SWITCH, oldWorstISRSwitch, WORST_ISR_SWITCH_EDEFAULT, oldWorstISRSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstISRSwitch() {
		return worstISRSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER:
				return basicSetTickerSystemTimer(null, msgs);
			case ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER:
				return basicSetAlarmClockSystemTimer(null, msgs);
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
			case ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER:
				return getTickerSystemTimer();
			case ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER:
				return getAlarmClockSystemTimer();
			case ModelPackage.REGULAR_PROCESSOR__AVG_ISR_SWITCH:
				return getAvgISRSwitch();
			case ModelPackage.REGULAR_PROCESSOR__BEST_ISR_SWITCH:
				return getBestISRSwitch();
			case ModelPackage.REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY:
				return getMaxInterruptPriority();
			case ModelPackage.REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY:
				return getMinInterruptPriority();
			case ModelPackage.REGULAR_PROCESSOR__NAME:
				return getName();
			case ModelPackage.REGULAR_PROCESSOR__SPEED_FACTOR:
				return getSpeedFactor();
			case ModelPackage.REGULAR_PROCESSOR__WORST_ISR_SWITCH:
				return getWorstISRSwitch();
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
			case ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER:
				setTickerSystemTimer((TickerSystemTimer)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER:
				setAlarmClockSystemTimer((AlarmClockSystemTimer)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__AVG_ISR_SWITCH:
				setAvgISRSwitch((Float)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__BEST_ISR_SWITCH:
				setBestISRSwitch((Float)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY:
				setMaxInterruptPriority((BigInteger)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY:
				setMinInterruptPriority((BigInteger)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__SPEED_FACTOR:
				setSpeedFactor((Float)newValue);
				return;
			case ModelPackage.REGULAR_PROCESSOR__WORST_ISR_SWITCH:
				setWorstISRSwitch((Float)newValue);
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
			case ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER:
				setTickerSystemTimer((TickerSystemTimer)null);
				return;
			case ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER:
				setAlarmClockSystemTimer((AlarmClockSystemTimer)null);
				return;
			case ModelPackage.REGULAR_PROCESSOR__AVG_ISR_SWITCH:
				unsetAvgISRSwitch();
				return;
			case ModelPackage.REGULAR_PROCESSOR__BEST_ISR_SWITCH:
				unsetBestISRSwitch();
				return;
			case ModelPackage.REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY:
				setMaxInterruptPriority(MAX_INTERRUPT_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY:
				setMinInterruptPriority(MIN_INTERRUPT_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.REGULAR_PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.REGULAR_PROCESSOR__SPEED_FACTOR:
				unsetSpeedFactor();
				return;
			case ModelPackage.REGULAR_PROCESSOR__WORST_ISR_SWITCH:
				unsetWorstISRSwitch();
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
			case ModelPackage.REGULAR_PROCESSOR__TICKER_SYSTEM_TIMER:
				return tickerSystemTimer != null;
			case ModelPackage.REGULAR_PROCESSOR__ALARM_CLOCK_SYSTEM_TIMER:
				return alarmClockSystemTimer != null;
			case ModelPackage.REGULAR_PROCESSOR__AVG_ISR_SWITCH:
				return isSetAvgISRSwitch();
			case ModelPackage.REGULAR_PROCESSOR__BEST_ISR_SWITCH:
				return isSetBestISRSwitch();
			case ModelPackage.REGULAR_PROCESSOR__MAX_INTERRUPT_PRIORITY:
				return MAX_INTERRUPT_PRIORITY_EDEFAULT == null ? maxInterruptPriority != null : !MAX_INTERRUPT_PRIORITY_EDEFAULT.equals(maxInterruptPriority);
			case ModelPackage.REGULAR_PROCESSOR__MIN_INTERRUPT_PRIORITY:
				return MIN_INTERRUPT_PRIORITY_EDEFAULT == null ? minInterruptPriority != null : !MIN_INTERRUPT_PRIORITY_EDEFAULT.equals(minInterruptPriority);
			case ModelPackage.REGULAR_PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.REGULAR_PROCESSOR__SPEED_FACTOR:
				return isSetSpeedFactor();
			case ModelPackage.REGULAR_PROCESSOR__WORST_ISR_SWITCH:
				return isSetWorstISRSwitch();
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
		result.append(" (avgISRSwitch: ");
		if (avgISRSwitchESet) result.append(avgISRSwitch); else result.append("<unset>");
		result.append(", bestISRSwitch: ");
		if (bestISRSwitchESet) result.append(bestISRSwitch); else result.append("<unset>");
		result.append(", maxInterruptPriority: ");
		result.append(maxInterruptPriority);
		result.append(", minInterruptPriority: ");
		result.append(minInterruptPriority);
		result.append(", name: ");
		result.append(name);
		result.append(", speedFactor: ");
		if (speedFactorESet) result.append(speedFactor); else result.append("<unset>");
		result.append(", worstISRSwitch: ");
		if (worstISRSwitchESet) result.append(worstISRSwitch); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegularProcessorImpl

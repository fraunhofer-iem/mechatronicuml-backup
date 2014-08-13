/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.DetailedUtilization;
import es.unican.mast.xmlmast.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detailed Utilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl#getContextSwitch <em>Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.DetailedUtilizationImpl#getTotal <em>Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DetailedUtilizationImpl extends MinimalEObjectImpl.Container implements DetailedUtilization {
	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final float APPLICATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected float application = APPLICATION_EDEFAULT;

	/**
	 * This is true if the Application attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicationESet;

	/**
	 * The default value of the '{@link #getContextSwitch() <em>Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTEXT_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getContextSwitch() <em>Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected float contextSwitch = CONTEXT_SWITCH_EDEFAULT;

	/**
	 * This is true if the Context Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextSwitchESet;

	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final float DRIVER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected float driver = DRIVER_EDEFAULT;

	/**
	 * This is true if the Driver attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean driverESet;

	/**
	 * The default value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected static final float TIMER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected float timer = TIMER_EDEFAULT;

	/**
	 * This is true if the Timer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timerESet;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected float total = TOTAL_EDEFAULT;

	/**
	 * This is true if the Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailedUtilizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.DETAILED_UTILIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(float newApplication) {
		float oldApplication = application;
		application = newApplication;
		boolean oldApplicationESet = applicationESet;
		applicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.DETAILED_UTILIZATION__APPLICATION, oldApplication, application, !oldApplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplication() {
		float oldApplication = application;
		boolean oldApplicationESet = applicationESet;
		application = APPLICATION_EDEFAULT;
		applicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.DETAILED_UTILIZATION__APPLICATION, oldApplication, APPLICATION_EDEFAULT, oldApplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplication() {
		return applicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getContextSwitch() {
		return contextSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextSwitch(float newContextSwitch) {
		float oldContextSwitch = contextSwitch;
		contextSwitch = newContextSwitch;
		boolean oldContextSwitchESet = contextSwitchESet;
		contextSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.DETAILED_UTILIZATION__CONTEXT_SWITCH, oldContextSwitch, contextSwitch, !oldContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextSwitch() {
		float oldContextSwitch = contextSwitch;
		boolean oldContextSwitchESet = contextSwitchESet;
		contextSwitch = CONTEXT_SWITCH_EDEFAULT;
		contextSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.DETAILED_UTILIZATION__CONTEXT_SWITCH, oldContextSwitch, CONTEXT_SWITCH_EDEFAULT, oldContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextSwitch() {
		return contextSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(float newDriver) {
		float oldDriver = driver;
		driver = newDriver;
		boolean oldDriverESet = driverESet;
		driverESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.DETAILED_UTILIZATION__DRIVER, oldDriver, driver, !oldDriverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDriver() {
		float oldDriver = driver;
		boolean oldDriverESet = driverESet;
		driver = DRIVER_EDEFAULT;
		driverESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.DETAILED_UTILIZATION__DRIVER, oldDriver, DRIVER_EDEFAULT, oldDriverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDriver() {
		return driverESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(float newTimer) {
		float oldTimer = timer;
		timer = newTimer;
		boolean oldTimerESet = timerESet;
		timerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.DETAILED_UTILIZATION__TIMER, oldTimer, timer, !oldTimerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimer() {
		float oldTimer = timer;
		boolean oldTimerESet = timerESet;
		timer = TIMER_EDEFAULT;
		timerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.DETAILED_UTILIZATION__TIMER, oldTimer, TIMER_EDEFAULT, oldTimerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimer() {
		return timerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(float newTotal) {
		float oldTotal = total;
		total = newTotal;
		boolean oldTotalESet = totalESet;
		totalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.DETAILED_UTILIZATION__TOTAL, oldTotal, total, !oldTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotal() {
		float oldTotal = total;
		boolean oldTotalESet = totalESet;
		total = TOTAL_EDEFAULT;
		totalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.DETAILED_UTILIZATION__TOTAL, oldTotal, TOTAL_EDEFAULT, oldTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotal() {
		return totalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.DETAILED_UTILIZATION__APPLICATION:
				return getApplication();
			case ResultPackage.DETAILED_UTILIZATION__CONTEXT_SWITCH:
				return getContextSwitch();
			case ResultPackage.DETAILED_UTILIZATION__DRIVER:
				return getDriver();
			case ResultPackage.DETAILED_UTILIZATION__TIMER:
				return getTimer();
			case ResultPackage.DETAILED_UTILIZATION__TOTAL:
				return getTotal();
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
			case ResultPackage.DETAILED_UTILIZATION__APPLICATION:
				setApplication((Float)newValue);
				return;
			case ResultPackage.DETAILED_UTILIZATION__CONTEXT_SWITCH:
				setContextSwitch((Float)newValue);
				return;
			case ResultPackage.DETAILED_UTILIZATION__DRIVER:
				setDriver((Float)newValue);
				return;
			case ResultPackage.DETAILED_UTILIZATION__TIMER:
				setTimer((Float)newValue);
				return;
			case ResultPackage.DETAILED_UTILIZATION__TOTAL:
				setTotal((Float)newValue);
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
			case ResultPackage.DETAILED_UTILIZATION__APPLICATION:
				unsetApplication();
				return;
			case ResultPackage.DETAILED_UTILIZATION__CONTEXT_SWITCH:
				unsetContextSwitch();
				return;
			case ResultPackage.DETAILED_UTILIZATION__DRIVER:
				unsetDriver();
				return;
			case ResultPackage.DETAILED_UTILIZATION__TIMER:
				unsetTimer();
				return;
			case ResultPackage.DETAILED_UTILIZATION__TOTAL:
				unsetTotal();
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
			case ResultPackage.DETAILED_UTILIZATION__APPLICATION:
				return isSetApplication();
			case ResultPackage.DETAILED_UTILIZATION__CONTEXT_SWITCH:
				return isSetContextSwitch();
			case ResultPackage.DETAILED_UTILIZATION__DRIVER:
				return isSetDriver();
			case ResultPackage.DETAILED_UTILIZATION__TIMER:
				return isSetTimer();
			case ResultPackage.DETAILED_UTILIZATION__TOTAL:
				return isSetTotal();
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
		result.append(" (application: ");
		if (applicationESet) result.append(application); else result.append("<unset>");
		result.append(", contextSwitch: ");
		if (contextSwitchESet) result.append(contextSwitch); else result.append("<unset>");
		result.append(", driver: ");
		if (driverESet) result.append(driver); else result.append("<unset>");
		result.append(", timer: ");
		if (timerESet) result.append(timer); else result.append("<unset>");
		result.append(", total: ");
		if (totalESet) result.append(total); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DetailedUtilizationImpl

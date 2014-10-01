/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.TickerSystemTimer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticker System Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl#getAvgOverhead <em>Avg Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl#getBestOverhead <em>Best Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.TickerSystemTimerImpl#getWorstOverhead <em>Worst Overhead</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TickerSystemTimerImpl extends MinimalEObjectImpl.Container implements TickerSystemTimer {
	/**
	 * The default value of the '{@link #getAvgOverhead() <em>Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgOverhead() <em>Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgOverhead()
	 * @generated
	 * @ordered
	 */
	protected float avgOverhead = AVG_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Avg Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgOverheadESet;

	/**
	 * The default value of the '{@link #getBestOverhead() <em>Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float BEST_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBestOverhead() <em>Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOverhead()
	 * @generated
	 * @ordered
	 */
	protected float bestOverhead = BEST_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Best Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestOverheadESet;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected float period = PERIOD_EDEFAULT;

	/**
	 * This is true if the Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean periodESet;

	/**
	 * The default value of the '{@link #getWorstOverhead() <em>Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstOverhead() <em>Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstOverhead()
	 * @generated
	 * @ordered
	 */
	protected float worstOverhead = WORST_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Worst Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstOverheadESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TickerSystemTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TICKER_SYSTEM_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgOverhead() {
		return avgOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgOverhead(float newAvgOverhead) {
		float oldAvgOverhead = avgOverhead;
		avgOverhead = newAvgOverhead;
		boolean oldAvgOverheadESet = avgOverheadESet;
		avgOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TICKER_SYSTEM_TIMER__AVG_OVERHEAD, oldAvgOverhead, avgOverhead, !oldAvgOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgOverhead() {
		float oldAvgOverhead = avgOverhead;
		boolean oldAvgOverheadESet = avgOverheadESet;
		avgOverhead = AVG_OVERHEAD_EDEFAULT;
		avgOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TICKER_SYSTEM_TIMER__AVG_OVERHEAD, oldAvgOverhead, AVG_OVERHEAD_EDEFAULT, oldAvgOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgOverhead() {
		return avgOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBestOverhead() {
		return bestOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestOverhead(float newBestOverhead) {
		float oldBestOverhead = bestOverhead;
		bestOverhead = newBestOverhead;
		boolean oldBestOverheadESet = bestOverheadESet;
		bestOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TICKER_SYSTEM_TIMER__BEST_OVERHEAD, oldBestOverhead, bestOverhead, !oldBestOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBestOverhead() {
		float oldBestOverhead = bestOverhead;
		boolean oldBestOverheadESet = bestOverheadESet;
		bestOverhead = BEST_OVERHEAD_EDEFAULT;
		bestOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TICKER_SYSTEM_TIMER__BEST_OVERHEAD, oldBestOverhead, BEST_OVERHEAD_EDEFAULT, oldBestOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBestOverhead() {
		return bestOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(float newPeriod) {
		float oldPeriod = period;
		period = newPeriod;
		boolean oldPeriodESet = periodESet;
		periodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TICKER_SYSTEM_TIMER__PERIOD, oldPeriod, period, !oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod() {
		float oldPeriod = period;
		boolean oldPeriodESet = periodESet;
		period = PERIOD_EDEFAULT;
		periodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TICKER_SYSTEM_TIMER__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod() {
		return periodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstOverhead() {
		return worstOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstOverhead(float newWorstOverhead) {
		float oldWorstOverhead = worstOverhead;
		worstOverhead = newWorstOverhead;
		boolean oldWorstOverheadESet = worstOverheadESet;
		worstOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TICKER_SYSTEM_TIMER__WORST_OVERHEAD, oldWorstOverhead, worstOverhead, !oldWorstOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstOverhead() {
		float oldWorstOverhead = worstOverhead;
		boolean oldWorstOverheadESet = worstOverheadESet;
		worstOverhead = WORST_OVERHEAD_EDEFAULT;
		worstOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TICKER_SYSTEM_TIMER__WORST_OVERHEAD, oldWorstOverhead, WORST_OVERHEAD_EDEFAULT, oldWorstOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstOverhead() {
		return worstOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TICKER_SYSTEM_TIMER__AVG_OVERHEAD:
				return getAvgOverhead();
			case ModelPackage.TICKER_SYSTEM_TIMER__BEST_OVERHEAD:
				return getBestOverhead();
			case ModelPackage.TICKER_SYSTEM_TIMER__PERIOD:
				return getPeriod();
			case ModelPackage.TICKER_SYSTEM_TIMER__WORST_OVERHEAD:
				return getWorstOverhead();
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
			case ModelPackage.TICKER_SYSTEM_TIMER__AVG_OVERHEAD:
				setAvgOverhead((Float)newValue);
				return;
			case ModelPackage.TICKER_SYSTEM_TIMER__BEST_OVERHEAD:
				setBestOverhead((Float)newValue);
				return;
			case ModelPackage.TICKER_SYSTEM_TIMER__PERIOD:
				setPeriod((Float)newValue);
				return;
			case ModelPackage.TICKER_SYSTEM_TIMER__WORST_OVERHEAD:
				setWorstOverhead((Float)newValue);
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
			case ModelPackage.TICKER_SYSTEM_TIMER__AVG_OVERHEAD:
				unsetAvgOverhead();
				return;
			case ModelPackage.TICKER_SYSTEM_TIMER__BEST_OVERHEAD:
				unsetBestOverhead();
				return;
			case ModelPackage.TICKER_SYSTEM_TIMER__PERIOD:
				unsetPeriod();
				return;
			case ModelPackage.TICKER_SYSTEM_TIMER__WORST_OVERHEAD:
				unsetWorstOverhead();
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
			case ModelPackage.TICKER_SYSTEM_TIMER__AVG_OVERHEAD:
				return isSetAvgOverhead();
			case ModelPackage.TICKER_SYSTEM_TIMER__BEST_OVERHEAD:
				return isSetBestOverhead();
			case ModelPackage.TICKER_SYSTEM_TIMER__PERIOD:
				return isSetPeriod();
			case ModelPackage.TICKER_SYSTEM_TIMER__WORST_OVERHEAD:
				return isSetWorstOverhead();
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
		result.append(" (avgOverhead: ");
		if (avgOverheadESet) result.append(avgOverhead); else result.append("<unset>");
		result.append(", bestOverhead: ");
		if (bestOverheadESet) result.append(bestOverhead); else result.append("<unset>");
		result.append(", period: ");
		if (periodESet) result.append(period); else result.append("<unset>");
		result.append(", worstOverhead: ");
		if (worstOverheadESet) result.append(worstOverhead); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TickerSystemTimerImpl

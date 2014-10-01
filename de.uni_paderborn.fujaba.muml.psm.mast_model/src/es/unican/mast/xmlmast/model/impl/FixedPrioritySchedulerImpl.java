/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.FixedPriorityScheduler;
import es.unican.mast.xmlmast.model.ModelPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Priority Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl#getAvgContextSwitch <em>Avg Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl#getBestContextSwitch <em>Best Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl#getMaxPriority <em>Max Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl#getMinPriority <em>Min Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FixedPrioritySchedulerImpl#getWorstContextSwitch <em>Worst Context Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedPrioritySchedulerImpl extends MinimalEObjectImpl.Container implements FixedPriorityScheduler {
	/**
	 * The default value of the '{@link #getAvgContextSwitch() <em>Avg Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_CONTEXT_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgContextSwitch() <em>Avg Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected float avgContextSwitch = AVG_CONTEXT_SWITCH_EDEFAULT;

	/**
	 * This is true if the Avg Context Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgContextSwitchESet;

	/**
	 * The default value of the '{@link #getBestContextSwitch() <em>Best Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float BEST_CONTEXT_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBestContextSwitch() <em>Best Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected float bestContextSwitch = BEST_CONTEXT_SWITCH_EDEFAULT;

	/**
	 * This is true if the Best Context Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestContextSwitchESet;

	/**
	 * The default value of the '{@link #getMaxPriority() <em>Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPriority() <em>Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxPriority = MAX_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinPriority() <em>Min Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinPriority() <em>Min Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minPriority = MIN_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorstContextSwitch() <em>Worst Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_CONTEXT_SWITCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstContextSwitch() <em>Worst Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstContextSwitch()
	 * @generated
	 * @ordered
	 */
	protected float worstContextSwitch = WORST_CONTEXT_SWITCH_EDEFAULT;

	/**
	 * This is true if the Worst Context Switch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstContextSwitchESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPrioritySchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIXED_PRIORITY_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgContextSwitch() {
		return avgContextSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgContextSwitch(float newAvgContextSwitch) {
		float oldAvgContextSwitch = avgContextSwitch;
		avgContextSwitch = newAvgContextSwitch;
		boolean oldAvgContextSwitchESet = avgContextSwitchESet;
		avgContextSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH, oldAvgContextSwitch, avgContextSwitch, !oldAvgContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgContextSwitch() {
		float oldAvgContextSwitch = avgContextSwitch;
		boolean oldAvgContextSwitchESet = avgContextSwitchESet;
		avgContextSwitch = AVG_CONTEXT_SWITCH_EDEFAULT;
		avgContextSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH, oldAvgContextSwitch, AVG_CONTEXT_SWITCH_EDEFAULT, oldAvgContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgContextSwitch() {
		return avgContextSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBestContextSwitch() {
		return bestContextSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestContextSwitch(float newBestContextSwitch) {
		float oldBestContextSwitch = bestContextSwitch;
		bestContextSwitch = newBestContextSwitch;
		boolean oldBestContextSwitchESet = bestContextSwitchESet;
		bestContextSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH, oldBestContextSwitch, bestContextSwitch, !oldBestContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBestContextSwitch() {
		float oldBestContextSwitch = bestContextSwitch;
		boolean oldBestContextSwitchESet = bestContextSwitchESet;
		bestContextSwitch = BEST_CONTEXT_SWITCH_EDEFAULT;
		bestContextSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH, oldBestContextSwitch, BEST_CONTEXT_SWITCH_EDEFAULT, oldBestContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBestContextSwitch() {
		return bestContextSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxPriority() {
		return maxPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPriority(BigInteger newMaxPriority) {
		BigInteger oldMaxPriority = maxPriority;
		maxPriority = newMaxPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY, oldMaxPriority, maxPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinPriority() {
		return minPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPriority(BigInteger newMinPriority) {
		BigInteger oldMinPriority = minPriority;
		minPriority = newMinPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY, oldMinPriority, minPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstContextSwitch() {
		return worstContextSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstContextSwitch(float newWorstContextSwitch) {
		float oldWorstContextSwitch = worstContextSwitch;
		worstContextSwitch = newWorstContextSwitch;
		boolean oldWorstContextSwitchESet = worstContextSwitchESet;
		worstContextSwitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH, oldWorstContextSwitch, worstContextSwitch, !oldWorstContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstContextSwitch() {
		float oldWorstContextSwitch = worstContextSwitch;
		boolean oldWorstContextSwitchESet = worstContextSwitchESet;
		worstContextSwitch = WORST_CONTEXT_SWITCH_EDEFAULT;
		worstContextSwitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH, oldWorstContextSwitch, WORST_CONTEXT_SWITCH_EDEFAULT, oldWorstContextSwitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstContextSwitch() {
		return worstContextSwitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH:
				return getAvgContextSwitch();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH:
				return getBestContextSwitch();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY:
				return getMaxPriority();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY:
				return getMinPriority();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH:
				return getWorstContextSwitch();
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
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH:
				setAvgContextSwitch((Float)newValue);
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH:
				setBestContextSwitch((Float)newValue);
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY:
				setMaxPriority((BigInteger)newValue);
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY:
				setMinPriority((BigInteger)newValue);
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH:
				setWorstContextSwitch((Float)newValue);
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
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH:
				unsetAvgContextSwitch();
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH:
				unsetBestContextSwitch();
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY:
				setMaxPriority(MAX_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY:
				setMinPriority(MIN_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH:
				unsetWorstContextSwitch();
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
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__AVG_CONTEXT_SWITCH:
				return isSetAvgContextSwitch();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__BEST_CONTEXT_SWITCH:
				return isSetBestContextSwitch();
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MAX_PRIORITY:
				return MAX_PRIORITY_EDEFAULT == null ? maxPriority != null : !MAX_PRIORITY_EDEFAULT.equals(maxPriority);
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__MIN_PRIORITY:
				return MIN_PRIORITY_EDEFAULT == null ? minPriority != null : !MIN_PRIORITY_EDEFAULT.equals(minPriority);
			case ModelPackage.FIXED_PRIORITY_SCHEDULER__WORST_CONTEXT_SWITCH:
				return isSetWorstContextSwitch();
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
		result.append(" (avgContextSwitch: ");
		if (avgContextSwitchESet) result.append(avgContextSwitch); else result.append("<unset>");
		result.append(", bestContextSwitch: ");
		if (bestContextSwitchESet) result.append(bestContextSwitch); else result.append("<unset>");
		result.append(", maxPriority: ");
		result.append(maxPriority);
		result.append(", minPriority: ");
		result.append(minPriority);
		result.append(", worstContextSwitch: ");
		if (worstContextSwitchESet) result.append(worstContextSwitch); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FixedPrioritySchedulerImpl

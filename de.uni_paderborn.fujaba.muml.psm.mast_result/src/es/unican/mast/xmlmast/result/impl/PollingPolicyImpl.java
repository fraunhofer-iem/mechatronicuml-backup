/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.Assertion;
import es.unican.mast.xmlmast.result.PollingPolicy;
import es.unican.mast.xmlmast.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl#getPollingAvgOverhead <em>Polling Avg Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl#getPollingBestOverhead <em>Polling Best Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl#getPollingPeriod <em>Polling Period</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl#getPollingWorstOverhead <em>Polling Worst Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.PollingPolicyImpl#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollingPolicyImpl extends MinimalEObjectImpl.Container implements PollingPolicy {
	/**
	 * The default value of the '{@link #getPollingAvgOverhead() <em>Polling Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingAvgOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float POLLING_AVG_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPollingAvgOverhead() <em>Polling Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingAvgOverhead()
	 * @generated
	 * @ordered
	 */
	protected float pollingAvgOverhead = POLLING_AVG_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Polling Avg Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pollingAvgOverheadESet;

	/**
	 * The default value of the '{@link #getPollingBestOverhead() <em>Polling Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingBestOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float POLLING_BEST_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPollingBestOverhead() <em>Polling Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingBestOverhead()
	 * @generated
	 * @ordered
	 */
	protected float pollingBestOverhead = POLLING_BEST_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Polling Best Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pollingBestOverheadESet;

	/**
	 * The default value of the '{@link #getPollingPeriod() <em>Polling Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float POLLING_PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPollingPeriod() <em>Polling Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingPeriod()
	 * @generated
	 * @ordered
	 */
	protected float pollingPeriod = POLLING_PERIOD_EDEFAULT;

	/**
	 * This is true if the Polling Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pollingPeriodESet;

	/**
	 * The default value of the '{@link #getPollingWorstOverhead() <em>Polling Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingWorstOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float POLLING_WORST_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPollingWorstOverhead() <em>Polling Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingWorstOverhead()
	 * @generated
	 * @ordered
	 */
	protected float pollingWorstOverhead = POLLING_WORST_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Polling Worst Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pollingWorstOverheadESet;

	/**
	 * The default value of the '{@link #getPreassigned() <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreassigned()
	 * @generated
	 * @ordered
	 */
	protected static final Assertion PREASSIGNED_EDEFAULT = Assertion.YES;

	/**
	 * The cached value of the '{@link #getPreassigned() <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreassigned()
	 * @generated
	 * @ordered
	 */
	protected Assertion preassigned = PREASSIGNED_EDEFAULT;

	/**
	 * This is true if the Preassigned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preassignedESet;

	/**
	 * The default value of the '{@link #getThePriority() <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int THE_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThePriority() <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePriority()
	 * @generated
	 * @ordered
	 */
	protected int thePriority = THE_PRIORITY_EDEFAULT;

	/**
	 * This is true if the The Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thePriorityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.POLLING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPollingAvgOverhead() {
		return pollingAvgOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingAvgOverhead(float newPollingAvgOverhead) {
		float oldPollingAvgOverhead = pollingAvgOverhead;
		pollingAvgOverhead = newPollingAvgOverhead;
		boolean oldPollingAvgOverheadESet = pollingAvgOverheadESet;
		pollingAvgOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD, oldPollingAvgOverhead, pollingAvgOverhead, !oldPollingAvgOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPollingAvgOverhead() {
		float oldPollingAvgOverhead = pollingAvgOverhead;
		boolean oldPollingAvgOverheadESet = pollingAvgOverheadESet;
		pollingAvgOverhead = POLLING_AVG_OVERHEAD_EDEFAULT;
		pollingAvgOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD, oldPollingAvgOverhead, POLLING_AVG_OVERHEAD_EDEFAULT, oldPollingAvgOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPollingAvgOverhead() {
		return pollingAvgOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPollingBestOverhead() {
		return pollingBestOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingBestOverhead(float newPollingBestOverhead) {
		float oldPollingBestOverhead = pollingBestOverhead;
		pollingBestOverhead = newPollingBestOverhead;
		boolean oldPollingBestOverheadESet = pollingBestOverheadESet;
		pollingBestOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD, oldPollingBestOverhead, pollingBestOverhead, !oldPollingBestOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPollingBestOverhead() {
		float oldPollingBestOverhead = pollingBestOverhead;
		boolean oldPollingBestOverheadESet = pollingBestOverheadESet;
		pollingBestOverhead = POLLING_BEST_OVERHEAD_EDEFAULT;
		pollingBestOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD, oldPollingBestOverhead, POLLING_BEST_OVERHEAD_EDEFAULT, oldPollingBestOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPollingBestOverhead() {
		return pollingBestOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPollingPeriod() {
		return pollingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingPeriod(float newPollingPeriod) {
		float oldPollingPeriod = pollingPeriod;
		pollingPeriod = newPollingPeriod;
		boolean oldPollingPeriodESet = pollingPeriodESet;
		pollingPeriodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.POLLING_POLICY__POLLING_PERIOD, oldPollingPeriod, pollingPeriod, !oldPollingPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPollingPeriod() {
		float oldPollingPeriod = pollingPeriod;
		boolean oldPollingPeriodESet = pollingPeriodESet;
		pollingPeriod = POLLING_PERIOD_EDEFAULT;
		pollingPeriodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.POLLING_POLICY__POLLING_PERIOD, oldPollingPeriod, POLLING_PERIOD_EDEFAULT, oldPollingPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPollingPeriod() {
		return pollingPeriodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPollingWorstOverhead() {
		return pollingWorstOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingWorstOverhead(float newPollingWorstOverhead) {
		float oldPollingWorstOverhead = pollingWorstOverhead;
		pollingWorstOverhead = newPollingWorstOverhead;
		boolean oldPollingWorstOverheadESet = pollingWorstOverheadESet;
		pollingWorstOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD, oldPollingWorstOverhead, pollingWorstOverhead, !oldPollingWorstOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPollingWorstOverhead() {
		float oldPollingWorstOverhead = pollingWorstOverhead;
		boolean oldPollingWorstOverheadESet = pollingWorstOverheadESet;
		pollingWorstOverhead = POLLING_WORST_OVERHEAD_EDEFAULT;
		pollingWorstOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD, oldPollingWorstOverhead, POLLING_WORST_OVERHEAD_EDEFAULT, oldPollingWorstOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPollingWorstOverhead() {
		return pollingWorstOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion getPreassigned() {
		return preassigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreassigned(Assertion newPreassigned) {
		Assertion oldPreassigned = preassigned;
		preassigned = newPreassigned == null ? PREASSIGNED_EDEFAULT : newPreassigned;
		boolean oldPreassignedESet = preassignedESet;
		preassignedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.POLLING_POLICY__PREASSIGNED, oldPreassigned, preassigned, !oldPreassignedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreassigned() {
		Assertion oldPreassigned = preassigned;
		boolean oldPreassignedESet = preassignedESet;
		preassigned = PREASSIGNED_EDEFAULT;
		preassignedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.POLLING_POLICY__PREASSIGNED, oldPreassigned, PREASSIGNED_EDEFAULT, oldPreassignedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreassigned() {
		return preassignedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThePriority() {
		return thePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePriority(int newThePriority) {
		int oldThePriority = thePriority;
		thePriority = newThePriority;
		boolean oldThePriorityESet = thePriorityESet;
		thePriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.POLLING_POLICY__THE_PRIORITY, oldThePriority, thePriority, !oldThePriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThePriority() {
		int oldThePriority = thePriority;
		boolean oldThePriorityESet = thePriorityESet;
		thePriority = THE_PRIORITY_EDEFAULT;
		thePriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.POLLING_POLICY__THE_PRIORITY, oldThePriority, THE_PRIORITY_EDEFAULT, oldThePriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThePriority() {
		return thePriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				return getPollingAvgOverhead();
			case ResultPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				return getPollingBestOverhead();
			case ResultPackage.POLLING_POLICY__POLLING_PERIOD:
				return getPollingPeriod();
			case ResultPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				return getPollingWorstOverhead();
			case ResultPackage.POLLING_POLICY__PREASSIGNED:
				return getPreassigned();
			case ResultPackage.POLLING_POLICY__THE_PRIORITY:
				return getThePriority();
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
			case ResultPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				setPollingAvgOverhead((Float)newValue);
				return;
			case ResultPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				setPollingBestOverhead((Float)newValue);
				return;
			case ResultPackage.POLLING_POLICY__POLLING_PERIOD:
				setPollingPeriod((Float)newValue);
				return;
			case ResultPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				setPollingWorstOverhead((Float)newValue);
				return;
			case ResultPackage.POLLING_POLICY__PREASSIGNED:
				setPreassigned((Assertion)newValue);
				return;
			case ResultPackage.POLLING_POLICY__THE_PRIORITY:
				setThePriority((Integer)newValue);
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
			case ResultPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				unsetPollingAvgOverhead();
				return;
			case ResultPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				unsetPollingBestOverhead();
				return;
			case ResultPackage.POLLING_POLICY__POLLING_PERIOD:
				unsetPollingPeriod();
				return;
			case ResultPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				unsetPollingWorstOverhead();
				return;
			case ResultPackage.POLLING_POLICY__PREASSIGNED:
				unsetPreassigned();
				return;
			case ResultPackage.POLLING_POLICY__THE_PRIORITY:
				unsetThePriority();
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
			case ResultPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				return isSetPollingAvgOverhead();
			case ResultPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				return isSetPollingBestOverhead();
			case ResultPackage.POLLING_POLICY__POLLING_PERIOD:
				return isSetPollingPeriod();
			case ResultPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				return isSetPollingWorstOverhead();
			case ResultPackage.POLLING_POLICY__PREASSIGNED:
				return isSetPreassigned();
			case ResultPackage.POLLING_POLICY__THE_PRIORITY:
				return isSetThePriority();
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
		result.append(" (pollingAvgOverhead: ");
		if (pollingAvgOverheadESet) result.append(pollingAvgOverhead); else result.append("<unset>");
		result.append(", pollingBestOverhead: ");
		if (pollingBestOverheadESet) result.append(pollingBestOverhead); else result.append("<unset>");
		result.append(", pollingPeriod: ");
		if (pollingPeriodESet) result.append(pollingPeriod); else result.append("<unset>");
		result.append(", pollingWorstOverhead: ");
		if (pollingWorstOverheadESet) result.append(pollingWorstOverhead); else result.append("<unset>");
		result.append(", preassigned: ");
		if (preassignedESet) result.append(preassigned); else result.append("<unset>");
		result.append(", thePriority: ");
		if (thePriorityESet) result.append(thePriority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PollingPolicyImpl

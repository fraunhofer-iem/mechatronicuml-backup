/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.Assertion;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.PollingPolicy;

import java.math.BigInteger;

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
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl#getPollingAvgOverhead <em>Polling Avg Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl#getPollingBestOverhead <em>Polling Best Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl#getPollingPeriod <em>Polling Period</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl#getPollingWorstOverhead <em>Polling Worst Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PollingPolicyImpl#getThePriority <em>The Priority</em>}</li>
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
	protected static final BigInteger THE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThePriority() <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger thePriority = THE_PRIORITY_EDEFAULT;

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
		return ModelPackage.Literals.POLLING_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD, oldPollingAvgOverhead, pollingAvgOverhead, !oldPollingAvgOverheadESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD, oldPollingAvgOverhead, POLLING_AVG_OVERHEAD_EDEFAULT, oldPollingAvgOverheadESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD, oldPollingBestOverhead, pollingBestOverhead, !oldPollingBestOverheadESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD, oldPollingBestOverhead, POLLING_BEST_OVERHEAD_EDEFAULT, oldPollingBestOverheadESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLLING_POLICY__POLLING_PERIOD, oldPollingPeriod, pollingPeriod, !oldPollingPeriodESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.POLLING_POLICY__POLLING_PERIOD, oldPollingPeriod, POLLING_PERIOD_EDEFAULT, oldPollingPeriodESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD, oldPollingWorstOverhead, pollingWorstOverhead, !oldPollingWorstOverheadESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD, oldPollingWorstOverhead, POLLING_WORST_OVERHEAD_EDEFAULT, oldPollingWorstOverheadESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLLING_POLICY__PREASSIGNED, oldPreassigned, preassigned, !oldPreassignedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.POLLING_POLICY__PREASSIGNED, oldPreassigned, PREASSIGNED_EDEFAULT, oldPreassignedESet));
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
	public BigInteger getThePriority() {
		return thePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePriority(BigInteger newThePriority) {
		BigInteger oldThePriority = thePriority;
		thePriority = newThePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLLING_POLICY__THE_PRIORITY, oldThePriority, thePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				return getPollingAvgOverhead();
			case ModelPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				return getPollingBestOverhead();
			case ModelPackage.POLLING_POLICY__POLLING_PERIOD:
				return getPollingPeriod();
			case ModelPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				return getPollingWorstOverhead();
			case ModelPackage.POLLING_POLICY__PREASSIGNED:
				return getPreassigned();
			case ModelPackage.POLLING_POLICY__THE_PRIORITY:
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
			case ModelPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				setPollingAvgOverhead((Float)newValue);
				return;
			case ModelPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				setPollingBestOverhead((Float)newValue);
				return;
			case ModelPackage.POLLING_POLICY__POLLING_PERIOD:
				setPollingPeriod((Float)newValue);
				return;
			case ModelPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				setPollingWorstOverhead((Float)newValue);
				return;
			case ModelPackage.POLLING_POLICY__PREASSIGNED:
				setPreassigned((Assertion)newValue);
				return;
			case ModelPackage.POLLING_POLICY__THE_PRIORITY:
				setThePriority((BigInteger)newValue);
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
			case ModelPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				unsetPollingAvgOverhead();
				return;
			case ModelPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				unsetPollingBestOverhead();
				return;
			case ModelPackage.POLLING_POLICY__POLLING_PERIOD:
				unsetPollingPeriod();
				return;
			case ModelPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				unsetPollingWorstOverhead();
				return;
			case ModelPackage.POLLING_POLICY__PREASSIGNED:
				unsetPreassigned();
				return;
			case ModelPackage.POLLING_POLICY__THE_PRIORITY:
				setThePriority(THE_PRIORITY_EDEFAULT);
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
			case ModelPackage.POLLING_POLICY__POLLING_AVG_OVERHEAD:
				return isSetPollingAvgOverhead();
			case ModelPackage.POLLING_POLICY__POLLING_BEST_OVERHEAD:
				return isSetPollingBestOverhead();
			case ModelPackage.POLLING_POLICY__POLLING_PERIOD:
				return isSetPollingPeriod();
			case ModelPackage.POLLING_POLICY__POLLING_WORST_OVERHEAD:
				return isSetPollingWorstOverhead();
			case ModelPackage.POLLING_POLICY__PREASSIGNED:
				return isSetPreassigned();
			case ModelPackage.POLLING_POLICY__THE_PRIORITY:
				return THE_PRIORITY_EDEFAULT == null ? thePriority != null : !THE_PRIORITY_EDEFAULT.equals(thePriority);
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
		result.append(thePriority);
		result.append(')');
		return result.toString();
	}

} //PollingPolicyImpl

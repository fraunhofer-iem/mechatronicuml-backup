/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.Assertion;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.SporadicServerPolicy;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Server Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl#getInitialCapacity <em>Initial Capacity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl#getMaxPendingReplenishments <em>Max Pending Replenishments</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl#getNormalPriority <em>Normal Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SporadicServerPolicyImpl#getReplenishmentPeriod <em>Replenishment Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SporadicServerPolicyImpl extends MinimalEObjectImpl.Container implements SporadicServerPolicy {
	/**
	 * The default value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKGROUND_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected int backgroundPriority = BACKGROUND_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Background Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundPriorityESet;

	/**
	 * The default value of the '{@link #getInitialCapacity() <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialCapacity() <em>Initial Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCapacity()
	 * @generated
	 * @ordered
	 */
	protected float initialCapacity = INITIAL_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Initial Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialCapacityESet;

	/**
	 * The default value of the '{@link #getMaxPendingReplenishments() <em>Max Pending Replenishments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingReplenishments()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_PENDING_REPLENISHMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPendingReplenishments() <em>Max Pending Replenishments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingReplenishments()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxPendingReplenishments = MAX_PENDING_REPLENISHMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalPriority() <em>Normal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalPriority() <em>Normal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPriority()
	 * @generated
	 * @ordered
	 */
	protected int normalPriority = NORMAL_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Normal Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalPriorityESet;

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
	 * The default value of the '{@link #getReplenishmentPeriod() <em>Replenishment Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishmentPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float REPLENISHMENT_PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReplenishmentPeriod() <em>Replenishment Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishmentPeriod()
	 * @generated
	 * @ordered
	 */
	protected float replenishmentPeriod = REPLENISHMENT_PERIOD_EDEFAULT;

	/**
	 * This is true if the Replenishment Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replenishmentPeriodESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicServerPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.SPORADIC_SERVER_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBackgroundPriority() {
		return backgroundPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundPriority(int newBackgroundPriority) {
		int oldBackgroundPriority = backgroundPriority;
		backgroundPriority = newBackgroundPriority;
		boolean oldBackgroundPriorityESet = backgroundPriorityESet;
		backgroundPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY, oldBackgroundPriority, backgroundPriority, !oldBackgroundPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundPriority() {
		int oldBackgroundPriority = backgroundPriority;
		boolean oldBackgroundPriorityESet = backgroundPriorityESet;
		backgroundPriority = BACKGROUND_PRIORITY_EDEFAULT;
		backgroundPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY, oldBackgroundPriority, BACKGROUND_PRIORITY_EDEFAULT, oldBackgroundPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundPriority() {
		return backgroundPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInitialCapacity() {
		return initialCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCapacity(float newInitialCapacity) {
		float oldInitialCapacity = initialCapacity;
		initialCapacity = newInitialCapacity;
		boolean oldInitialCapacityESet = initialCapacityESet;
		initialCapacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY, oldInitialCapacity, initialCapacity, !oldInitialCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialCapacity() {
		float oldInitialCapacity = initialCapacity;
		boolean oldInitialCapacityESet = initialCapacityESet;
		initialCapacity = INITIAL_CAPACITY_EDEFAULT;
		initialCapacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY, oldInitialCapacity, INITIAL_CAPACITY_EDEFAULT, oldInitialCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialCapacity() {
		return initialCapacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxPendingReplenishments() {
		return maxPendingReplenishments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPendingReplenishments(BigInteger newMaxPendingReplenishments) {
		BigInteger oldMaxPendingReplenishments = maxPendingReplenishments;
		maxPendingReplenishments = newMaxPendingReplenishments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS, oldMaxPendingReplenishments, maxPendingReplenishments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormalPriority() {
		return normalPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalPriority(int newNormalPriority) {
		int oldNormalPriority = normalPriority;
		normalPriority = newNormalPriority;
		boolean oldNormalPriorityESet = normalPriorityESet;
		normalPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY, oldNormalPriority, normalPriority, !oldNormalPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNormalPriority() {
		int oldNormalPriority = normalPriority;
		boolean oldNormalPriorityESet = normalPriorityESet;
		normalPriority = NORMAL_PRIORITY_EDEFAULT;
		normalPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY, oldNormalPriority, NORMAL_PRIORITY_EDEFAULT, oldNormalPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNormalPriority() {
		return normalPriorityESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SPORADIC_SERVER_POLICY__PREASSIGNED, oldPreassigned, preassigned, !oldPreassignedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SPORADIC_SERVER_POLICY__PREASSIGNED, oldPreassigned, PREASSIGNED_EDEFAULT, oldPreassignedESet));
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
	public float getReplenishmentPeriod() {
		return replenishmentPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplenishmentPeriod(float newReplenishmentPeriod) {
		float oldReplenishmentPeriod = replenishmentPeriod;
		replenishmentPeriod = newReplenishmentPeriod;
		boolean oldReplenishmentPeriodESet = replenishmentPeriodESet;
		replenishmentPeriodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD, oldReplenishmentPeriod, replenishmentPeriod, !oldReplenishmentPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplenishmentPeriod() {
		float oldReplenishmentPeriod = replenishmentPeriod;
		boolean oldReplenishmentPeriodESet = replenishmentPeriodESet;
		replenishmentPeriod = REPLENISHMENT_PERIOD_EDEFAULT;
		replenishmentPeriodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD, oldReplenishmentPeriod, REPLENISHMENT_PERIOD_EDEFAULT, oldReplenishmentPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplenishmentPeriod() {
		return replenishmentPeriodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				return getBackgroundPriority();
			case ResultPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				return getInitialCapacity();
			case ResultPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				return getMaxPendingReplenishments();
			case ResultPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				return getNormalPriority();
			case ResultPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				return getPreassigned();
			case ResultPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
				return getReplenishmentPeriod();
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
			case ResultPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				setBackgroundPriority((Integer)newValue);
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				setInitialCapacity((Float)newValue);
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				setMaxPendingReplenishments((BigInteger)newValue);
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				setNormalPriority((Integer)newValue);
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				setPreassigned((Assertion)newValue);
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
				setReplenishmentPeriod((Float)newValue);
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
			case ResultPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				unsetBackgroundPriority();
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				unsetInitialCapacity();
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				setMaxPendingReplenishments(MAX_PENDING_REPLENISHMENTS_EDEFAULT);
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				unsetNormalPriority();
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				unsetPreassigned();
				return;
			case ResultPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
				unsetReplenishmentPeriod();
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
			case ResultPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				return isSetBackgroundPriority();
			case ResultPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				return isSetInitialCapacity();
			case ResultPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				return MAX_PENDING_REPLENISHMENTS_EDEFAULT == null ? maxPendingReplenishments != null : !MAX_PENDING_REPLENISHMENTS_EDEFAULT.equals(maxPendingReplenishments);
			case ResultPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				return isSetNormalPriority();
			case ResultPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				return isSetPreassigned();
			case ResultPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
				return isSetReplenishmentPeriod();
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
		result.append(" (backgroundPriority: ");
		if (backgroundPriorityESet) result.append(backgroundPriority); else result.append("<unset>");
		result.append(", initialCapacity: ");
		if (initialCapacityESet) result.append(initialCapacity); else result.append("<unset>");
		result.append(", maxPendingReplenishments: ");
		result.append(maxPendingReplenishments);
		result.append(", normalPriority: ");
		if (normalPriorityESet) result.append(normalPriority); else result.append("<unset>");
		result.append(", preassigned: ");
		if (preassignedESet) result.append(preassigned); else result.append("<unset>");
		result.append(", replenishmentPeriod: ");
		if (replenishmentPeriodESet) result.append(replenishmentPeriod); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SporadicServerPolicyImpl

/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.Assertion;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.SporadicServerPolicy;

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
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl#getInitialCapacity <em>Initial Capacity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl#getMaxPendingReplenishments <em>Max Pending Replenishments</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl#getNormalPriority <em>Normal Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicServerPolicyImpl#getReplenishmentPeriod <em>Replenishment Period</em>}</li>
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
	protected static final BigInteger BACKGROUND_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger backgroundPriority = BACKGROUND_PRIORITY_EDEFAULT;

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
	protected static final BigInteger NORMAL_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalPriority() <em>Normal Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger normalPriority = NORMAL_PRIORITY_EDEFAULT;

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
		return ModelPackage.Literals.SPORADIC_SERVER_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBackgroundPriority() {
		return backgroundPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundPriority(BigInteger newBackgroundPriority) {
		BigInteger oldBackgroundPriority = backgroundPriority;
		backgroundPriority = newBackgroundPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY, oldBackgroundPriority, backgroundPriority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY, oldInitialCapacity, initialCapacity, !oldInitialCapacityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY, oldInitialCapacity, INITIAL_CAPACITY_EDEFAULT, oldInitialCapacityESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS, oldMaxPendingReplenishments, maxPendingReplenishments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNormalPriority() {
		return normalPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalPriority(BigInteger newNormalPriority) {
		BigInteger oldNormalPriority = normalPriority;
		normalPriority = newNormalPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY, oldNormalPriority, normalPriority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_SERVER_POLICY__PREASSIGNED, oldPreassigned, preassigned, !oldPreassignedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPORADIC_SERVER_POLICY__PREASSIGNED, oldPreassigned, PREASSIGNED_EDEFAULT, oldPreassignedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD, oldReplenishmentPeriod, replenishmentPeriod, !oldReplenishmentPeriodESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD, oldReplenishmentPeriod, REPLENISHMENT_PERIOD_EDEFAULT, oldReplenishmentPeriodESet));
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
			case ModelPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				return getBackgroundPriority();
			case ModelPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				return getInitialCapacity();
			case ModelPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				return getMaxPendingReplenishments();
			case ModelPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				return getNormalPriority();
			case ModelPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				return getPreassigned();
			case ModelPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
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
			case ModelPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				setBackgroundPriority((BigInteger)newValue);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				setInitialCapacity((Float)newValue);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				setMaxPendingReplenishments((BigInteger)newValue);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				setNormalPriority((BigInteger)newValue);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				setPreassigned((Assertion)newValue);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
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
			case ModelPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				setBackgroundPriority(BACKGROUND_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				unsetInitialCapacity();
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				setMaxPendingReplenishments(MAX_PENDING_REPLENISHMENTS_EDEFAULT);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				setNormalPriority(NORMAL_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				unsetPreassigned();
				return;
			case ModelPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
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
			case ModelPackage.SPORADIC_SERVER_POLICY__BACKGROUND_PRIORITY:
				return BACKGROUND_PRIORITY_EDEFAULT == null ? backgroundPriority != null : !BACKGROUND_PRIORITY_EDEFAULT.equals(backgroundPriority);
			case ModelPackage.SPORADIC_SERVER_POLICY__INITIAL_CAPACITY:
				return isSetInitialCapacity();
			case ModelPackage.SPORADIC_SERVER_POLICY__MAX_PENDING_REPLENISHMENTS:
				return MAX_PENDING_REPLENISHMENTS_EDEFAULT == null ? maxPendingReplenishments != null : !MAX_PENDING_REPLENISHMENTS_EDEFAULT.equals(maxPendingReplenishments);
			case ModelPackage.SPORADIC_SERVER_POLICY__NORMAL_PRIORITY:
				return NORMAL_PRIORITY_EDEFAULT == null ? normalPriority != null : !NORMAL_PRIORITY_EDEFAULT.equals(normalPriority);
			case ModelPackage.SPORADIC_SERVER_POLICY__PREASSIGNED:
				return isSetPreassigned();
			case ModelPackage.SPORADIC_SERVER_POLICY__REPLENISHMENT_PERIOD:
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
		result.append(backgroundPriority);
		result.append(", initialCapacity: ");
		if (initialCapacityESet) result.append(initialCapacity); else result.append("<unset>");
		result.append(", maxPendingReplenishments: ");
		result.append(maxPendingReplenishments);
		result.append(", normalPriority: ");
		result.append(normalPriority);
		result.append(", preassigned: ");
		if (preassignedESet) result.append(preassigned); else result.append("<unset>");
		result.append(", replenishmentPeriod: ");
		if (replenishmentPeriodESet) result.append(replenishmentPeriod); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SporadicServerPolicyImpl

/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.PeriodicExternalEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic External Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl#getMaxJitter <em>Max Jitter</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PeriodicExternalEventImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicExternalEventImpl extends MinimalEObjectImpl.Container implements PeriodicExternalEvent {
	/**
	 * The default value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_JITTER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected float maxJitter = MAX_JITTER_EDEFAULT;

	/**
	 * This is true if the Max Jitter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxJitterESet;

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
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected float phase = PHASE_EDEFAULT;

	/**
	 * This is true if the Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicExternalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERIODIC_EXTERNAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxJitter() {
		return maxJitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxJitter(float newMaxJitter) {
		float oldMaxJitter = maxJitter;
		maxJitter = newMaxJitter;
		boolean oldMaxJitterESet = maxJitterESet;
		maxJitterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODIC_EXTERNAL_EVENT__MAX_JITTER, oldMaxJitter, maxJitter, !oldMaxJitterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxJitter() {
		float oldMaxJitter = maxJitter;
		boolean oldMaxJitterESet = maxJitterESet;
		maxJitter = MAX_JITTER_EDEFAULT;
		maxJitterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PERIODIC_EXTERNAL_EVENT__MAX_JITTER, oldMaxJitter, MAX_JITTER_EDEFAULT, oldMaxJitterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxJitter() {
		return maxJitterESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODIC_EXTERNAL_EVENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODIC_EXTERNAL_EVENT__PERIOD, oldPeriod, period, !oldPeriodESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PERIODIC_EXTERNAL_EVENT__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
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
	public float getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(float newPhase) {
		float oldPhase = phase;
		phase = newPhase;
		boolean oldPhaseESet = phaseESet;
		phaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODIC_EXTERNAL_EVENT__PHASE, oldPhase, phase, !oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhase() {
		float oldPhase = phase;
		boolean oldPhaseESet = phaseESet;
		phase = PHASE_EDEFAULT;
		phaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PERIODIC_EXTERNAL_EVENT__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhase() {
		return phaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__MAX_JITTER:
				return getMaxJitter();
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__NAME:
				return getName();
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PERIOD:
				return getPeriod();
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PHASE:
				return getPhase();
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
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__MAX_JITTER:
				setMaxJitter((Float)newValue);
				return;
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PERIOD:
				setPeriod((Float)newValue);
				return;
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PHASE:
				setPhase((Float)newValue);
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
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__MAX_JITTER:
				unsetMaxJitter();
				return;
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PERIOD:
				unsetPeriod();
				return;
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PHASE:
				unsetPhase();
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
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__MAX_JITTER:
				return isSetMaxJitter();
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PERIOD:
				return isSetPeriod();
			case ModelPackage.PERIODIC_EXTERNAL_EVENT__PHASE:
				return isSetPhase();
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
		result.append(" (maxJitter: ");
		if (maxJitterESet) result.append(maxJitter); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", period: ");
		if (periodESet) result.append(period); else result.append("<unset>");
		result.append(", phase: ");
		if (phaseESet) result.append(phase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PeriodicExternalEventImpl

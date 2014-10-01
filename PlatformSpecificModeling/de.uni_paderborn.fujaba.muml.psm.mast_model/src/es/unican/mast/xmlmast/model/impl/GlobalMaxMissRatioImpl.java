/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.GlobalMaxMissRatio;
import es.unican.mast.xmlmast.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Max Miss Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.GlobalMaxMissRatioImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalMaxMissRatioImpl extends MinimalEObjectImpl.Container implements GlobalMaxMissRatio {
	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final float DEADLINE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected float deadline = DEADLINE_EDEFAULT;

	/**
	 * This is true if the Deadline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadlineESet;

	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected float ratio = RATIO_EDEFAULT;

	/**
	 * This is true if the Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratioESet;

	/**
	 * The default value of the '{@link #getReferencedEvent() <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedEvent() <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEvent()
	 * @generated
	 * @ordered
	 */
	protected String referencedEvent = REFERENCED_EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalMaxMissRatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GLOBAL_MAX_MISS_RATIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(float newDeadline) {
		float oldDeadline = deadline;
		deadline = newDeadline;
		boolean oldDeadlineESet = deadlineESet;
		deadlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_MAX_MISS_RATIO__DEADLINE, oldDeadline, deadline, !oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadline() {
		float oldDeadline = deadline;
		boolean oldDeadlineESet = deadlineESet;
		deadline = DEADLINE_EDEFAULT;
		deadlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GLOBAL_MAX_MISS_RATIO__DEADLINE, oldDeadline, DEADLINE_EDEFAULT, oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadline() {
		return deadlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatio(float newRatio) {
		float oldRatio = ratio;
		ratio = newRatio;
		boolean oldRatioESet = ratioESet;
		ratioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_MAX_MISS_RATIO__RATIO, oldRatio, ratio, !oldRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRatio() {
		float oldRatio = ratio;
		boolean oldRatioESet = ratioESet;
		ratio = RATIO_EDEFAULT;
		ratioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GLOBAL_MAX_MISS_RATIO__RATIO, oldRatio, RATIO_EDEFAULT, oldRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRatio() {
		return ratioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedEvent() {
		return referencedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedEvent(String newReferencedEvent) {
		String oldReferencedEvent = referencedEvent;
		referencedEvent = newReferencedEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__DEADLINE:
				return getDeadline();
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__RATIO:
				return getRatio();
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT:
				return getReferencedEvent();
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
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__DEADLINE:
				setDeadline((Float)newValue);
				return;
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__RATIO:
				setRatio((Float)newValue);
				return;
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT:
				setReferencedEvent((String)newValue);
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
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__DEADLINE:
				unsetDeadline();
				return;
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__RATIO:
				unsetRatio();
				return;
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT:
				setReferencedEvent(REFERENCED_EVENT_EDEFAULT);
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
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__DEADLINE:
				return isSetDeadline();
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__RATIO:
				return isSetRatio();
			case ModelPackage.GLOBAL_MAX_MISS_RATIO__REFERENCED_EVENT:
				return REFERENCED_EVENT_EDEFAULT == null ? referencedEvent != null : !REFERENCED_EVENT_EDEFAULT.equals(referencedEvent);
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
		result.append(" (deadline: ");
		if (deadlineESet) result.append(deadline); else result.append("<unset>");
		result.append(", ratio: ");
		if (ratioESet) result.append(ratio); else result.append("<unset>");
		result.append(", referencedEvent: ");
		result.append(referencedEvent);
		result.append(')');
		return result.toString();
	}

} //GlobalMaxMissRatioImpl

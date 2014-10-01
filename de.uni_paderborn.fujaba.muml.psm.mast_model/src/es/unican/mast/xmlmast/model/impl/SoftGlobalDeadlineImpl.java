/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.SoftGlobalDeadline;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Global Deadline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SoftGlobalDeadlineImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SoftGlobalDeadlineImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftGlobalDeadlineImpl extends MinimalEObjectImpl.Container implements SoftGlobalDeadline {
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
	protected SoftGlobalDeadlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOFT_GLOBAL_DEADLINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOFT_GLOBAL_DEADLINE__DEADLINE, oldDeadline, deadline, !oldDeadlineESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SOFT_GLOBAL_DEADLINE__DEADLINE, oldDeadline, DEADLINE_EDEFAULT, oldDeadlineESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SOFT_GLOBAL_DEADLINE__DEADLINE:
				return getDeadline();
			case ModelPackage.SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT:
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
			case ModelPackage.SOFT_GLOBAL_DEADLINE__DEADLINE:
				setDeadline((Float)newValue);
				return;
			case ModelPackage.SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT:
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
			case ModelPackage.SOFT_GLOBAL_DEADLINE__DEADLINE:
				unsetDeadline();
				return;
			case ModelPackage.SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT:
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
			case ModelPackage.SOFT_GLOBAL_DEADLINE__DEADLINE:
				return isSetDeadline();
			case ModelPackage.SOFT_GLOBAL_DEADLINE__REFERENCED_EVENT:
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
		result.append(", referencedEvent: ");
		result.append(referencedEvent);
		result.append(')');
		return result.toString();
	}

} //SoftGlobalDeadlineImpl

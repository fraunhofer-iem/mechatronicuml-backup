/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.MaxOutputJitterReq;
import es.unican.mast.xmlmast.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Output Jitter Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MaxOutputJitterReqImpl#getMaxOutputJitter <em>Max Output Jitter</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MaxOutputJitterReqImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaxOutputJitterReqImpl extends MinimalEObjectImpl.Container implements MaxOutputJitterReq {
	/**
	 * The default value of the '{@link #getMaxOutputJitter() <em>Max Output Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutputJitter()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_OUTPUT_JITTER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxOutputJitter() <em>Max Output Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutputJitter()
	 * @generated
	 * @ordered
	 */
	protected float maxOutputJitter = MAX_OUTPUT_JITTER_EDEFAULT;

	/**
	 * This is true if the Max Output Jitter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxOutputJitterESet;

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
	protected MaxOutputJitterReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MAX_OUTPUT_JITTER_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxOutputJitter() {
		return maxOutputJitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOutputJitter(float newMaxOutputJitter) {
		float oldMaxOutputJitter = maxOutputJitter;
		maxOutputJitter = newMaxOutputJitter;
		boolean oldMaxOutputJitterESet = maxOutputJitterESet;
		maxOutputJitterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER, oldMaxOutputJitter, maxOutputJitter, !oldMaxOutputJitterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxOutputJitter() {
		float oldMaxOutputJitter = maxOutputJitter;
		boolean oldMaxOutputJitterESet = maxOutputJitterESet;
		maxOutputJitter = MAX_OUTPUT_JITTER_EDEFAULT;
		maxOutputJitterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER, oldMaxOutputJitter, MAX_OUTPUT_JITTER_EDEFAULT, oldMaxOutputJitterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxOutputJitter() {
		return maxOutputJitterESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER:
				return getMaxOutputJitter();
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT:
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
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER:
				setMaxOutputJitter((Float)newValue);
				return;
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT:
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
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER:
				unsetMaxOutputJitter();
				return;
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT:
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
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__MAX_OUTPUT_JITTER:
				return isSetMaxOutputJitter();
			case ModelPackage.MAX_OUTPUT_JITTER_REQ__REFERENCED_EVENT:
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
		result.append(" (maxOutputJitter: ");
		if (maxOutputJitterESet) result.append(maxOutputJitter); else result.append("<unset>");
		result.append(", referencedEvent: ");
		result.append(referencedEvent);
		result.append(')');
		return result.toString();
	}

} //MaxOutputJitterReqImpl

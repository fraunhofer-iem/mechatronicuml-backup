/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.GlobalMissRatio;
import es.unican.mast.xmlmast.result.MissRatio;
import es.unican.mast.xmlmast.result.ResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Miss Ratio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioImpl#getMissRatio <em>Miss Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalMissRatioImpl extends MinimalEObjectImpl.Container implements GlobalMissRatio {
	/**
	 * The cached value of the '{@link #getMissRatio() <em>Miss Ratio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissRatio()
	 * @generated
	 * @ordered
	 */
	protected EList<MissRatio> missRatio;

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
	protected GlobalMissRatioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.GLOBAL_MISS_RATIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MissRatio> getMissRatio() {
		if (missRatio == null) {
			missRatio = new EObjectContainmentEList<MissRatio>(MissRatio.class, this, ResultPackage.GLOBAL_MISS_RATIO__MISS_RATIO);
		}
		return missRatio;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.GLOBAL_MISS_RATIO__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.GLOBAL_MISS_RATIO__MISS_RATIO:
				return ((InternalEList<?>)getMissRatio()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.GLOBAL_MISS_RATIO__MISS_RATIO:
				return getMissRatio();
			case ResultPackage.GLOBAL_MISS_RATIO__REFERENCED_EVENT:
				return getReferencedEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultPackage.GLOBAL_MISS_RATIO__MISS_RATIO:
				getMissRatio().clear();
				getMissRatio().addAll((Collection<? extends MissRatio>)newValue);
				return;
			case ResultPackage.GLOBAL_MISS_RATIO__REFERENCED_EVENT:
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
			case ResultPackage.GLOBAL_MISS_RATIO__MISS_RATIO:
				getMissRatio().clear();
				return;
			case ResultPackage.GLOBAL_MISS_RATIO__REFERENCED_EVENT:
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
			case ResultPackage.GLOBAL_MISS_RATIO__MISS_RATIO:
				return missRatio != null && !missRatio.isEmpty();
			case ResultPackage.GLOBAL_MISS_RATIO__REFERENCED_EVENT:
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
		result.append(" (referencedEvent: ");
		result.append(referencedEvent);
		result.append(')');
		return result.toString();
	}

} //GlobalMissRatioImpl

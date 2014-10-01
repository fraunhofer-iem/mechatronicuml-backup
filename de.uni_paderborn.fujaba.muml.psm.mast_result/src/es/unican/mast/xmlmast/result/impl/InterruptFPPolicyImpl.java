/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.AffirmativeAssertion;
import es.unican.mast.xmlmast.result.InterruptFPPolicy;
import es.unican.mast.xmlmast.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt FP Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.InterruptFPPolicyImpl#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.InterruptFPPolicyImpl#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptFPPolicyImpl extends MinimalEObjectImpl.Container implements InterruptFPPolicy {
	/**
	 * The default value of the '{@link #getPreassigned() <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreassigned()
	 * @generated
	 * @ordered
	 */
	protected static final AffirmativeAssertion PREASSIGNED_EDEFAULT = AffirmativeAssertion.YES;

	/**
	 * The cached value of the '{@link #getPreassigned() <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreassigned()
	 * @generated
	 * @ordered
	 */
	protected AffirmativeAssertion preassigned = PREASSIGNED_EDEFAULT;

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
	protected InterruptFPPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.INTERRUPT_FP_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffirmativeAssertion getPreassigned() {
		return preassigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreassigned(AffirmativeAssertion newPreassigned) {
		AffirmativeAssertion oldPreassigned = preassigned;
		preassigned = newPreassigned == null ? PREASSIGNED_EDEFAULT : newPreassigned;
		boolean oldPreassignedESet = preassignedESet;
		preassignedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.INTERRUPT_FP_POLICY__PREASSIGNED, oldPreassigned, preassigned, !oldPreassignedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreassigned() {
		AffirmativeAssertion oldPreassigned = preassigned;
		boolean oldPreassignedESet = preassignedESet;
		preassigned = PREASSIGNED_EDEFAULT;
		preassignedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.INTERRUPT_FP_POLICY__PREASSIGNED, oldPreassigned, PREASSIGNED_EDEFAULT, oldPreassignedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.INTERRUPT_FP_POLICY__THE_PRIORITY, oldThePriority, thePriority, !oldThePriorityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.INTERRUPT_FP_POLICY__THE_PRIORITY, oldThePriority, THE_PRIORITY_EDEFAULT, oldThePriorityESet));
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
			case ResultPackage.INTERRUPT_FP_POLICY__PREASSIGNED:
				return getPreassigned();
			case ResultPackage.INTERRUPT_FP_POLICY__THE_PRIORITY:
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
			case ResultPackage.INTERRUPT_FP_POLICY__PREASSIGNED:
				setPreassigned((AffirmativeAssertion)newValue);
				return;
			case ResultPackage.INTERRUPT_FP_POLICY__THE_PRIORITY:
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
			case ResultPackage.INTERRUPT_FP_POLICY__PREASSIGNED:
				unsetPreassigned();
				return;
			case ResultPackage.INTERRUPT_FP_POLICY__THE_PRIORITY:
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
			case ResultPackage.INTERRUPT_FP_POLICY__PREASSIGNED:
				return isSetPreassigned();
			case ResultPackage.INTERRUPT_FP_POLICY__THE_PRIORITY:
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
		result.append(" (preassigned: ");
		if (preassignedESet) result.append(preassigned); else result.append("<unset>");
		result.append(", thePriority: ");
		if (thePriorityESet) result.append(thePriority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InterruptFPPolicyImpl

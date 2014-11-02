/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.Assertion;
import es.unican.mast.xmlmast.result.EDFPolicy;
import es.unican.mast.xmlmast.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDF Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.EDFPolicyImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.EDFPolicyImpl#getPreassigned <em>Preassigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDFPolicyImpl extends MinimalEObjectImpl.Container implements EDFPolicy {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.EDF_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.EDF_POLICY__DEADLINE, oldDeadline, deadline, !oldDeadlineESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.EDF_POLICY__DEADLINE, oldDeadline, DEADLINE_EDEFAULT, oldDeadlineESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.EDF_POLICY__PREASSIGNED, oldPreassigned, preassigned, !oldPreassignedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.EDF_POLICY__PREASSIGNED, oldPreassigned, PREASSIGNED_EDEFAULT, oldPreassignedESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.EDF_POLICY__DEADLINE:
				return getDeadline();
			case ResultPackage.EDF_POLICY__PREASSIGNED:
				return getPreassigned();
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
			case ResultPackage.EDF_POLICY__DEADLINE:
				setDeadline((Float)newValue);
				return;
			case ResultPackage.EDF_POLICY__PREASSIGNED:
				setPreassigned((Assertion)newValue);
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
			case ResultPackage.EDF_POLICY__DEADLINE:
				unsetDeadline();
				return;
			case ResultPackage.EDF_POLICY__PREASSIGNED:
				unsetPreassigned();
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
			case ResultPackage.EDF_POLICY__DEADLINE:
				return isSetDeadline();
			case ResultPackage.EDF_POLICY__PREASSIGNED:
				return isSetPreassigned();
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
		result.append(", preassigned: ");
		if (preassignedESet) result.append(preassigned); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EDFPolicyImpl

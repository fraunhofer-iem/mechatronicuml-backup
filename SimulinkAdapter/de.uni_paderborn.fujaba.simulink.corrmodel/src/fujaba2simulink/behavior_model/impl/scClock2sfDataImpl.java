/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scClock2sfData;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Clock2sf Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scClock2sfDataImpl#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scClock2sfDataImpl#getSfClockVariable <em>Sf Clock Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scClock2sfDataImpl extends AbstractContainerCorrespondenceNodeImpl implements scClock2sfData {
	/**
	 * The cached value of the '{@link #getScClock() <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScClock()
	 * @generated
	 * @ordered
	 */
	protected Clock scClock;

	/**
	 * The cached value of the '{@link #getSfClockVariable() <em>Sf Clock Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfClockVariable()
	 * @generated
	 * @ordered
	 */
	protected Data sfClockVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scClock2sfDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_CLOCK2SF_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getScClock() {
		if (scClock != null && scClock.eIsProxy()) {
			InternalEObject oldScClock = (InternalEObject)scClock;
			scClock = (Clock)eResolveProxy(oldScClock);
			if (scClock != oldScClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_CLOCK2SF_DATA__SC_CLOCK, oldScClock, scClock));
			}
		}
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetScClock() {
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScClock(Clock newScClock) {
		Clock oldScClock = scClock;
		scClock = newScClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_CLOCK2SF_DATA__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getSfClockVariable() {
		if (sfClockVariable != null && ((EObject)sfClockVariable).eIsProxy()) {
			InternalEObject oldSfClockVariable = (InternalEObject)sfClockVariable;
			sfClockVariable = (Data)eResolveProxy(oldSfClockVariable);
			if (sfClockVariable != oldSfClockVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE, oldSfClockVariable, sfClockVariable));
			}
		}
		return sfClockVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetSfClockVariable() {
		return sfClockVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfClockVariable(Data newSfClockVariable) {
		Data oldSfClockVariable = sfClockVariable;
		sfClockVariable = newSfClockVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE, oldSfClockVariable, sfClockVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SC_CLOCK:
				if (resolve) return getScClock();
				return basicGetScClock();
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE:
				if (resolve) return getSfClockVariable();
				return basicGetSfClockVariable();
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
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SC_CLOCK:
				setScClock((Clock)newValue);
				return;
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE:
				setSfClockVariable((Data)newValue);
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
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SC_CLOCK:
				setScClock((Clock)null);
				return;
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE:
				setSfClockVariable((Data)null);
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
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SC_CLOCK:
				return scClock != null;
			case Behavior_modelPackage.SC_CLOCK2SF_DATA__SF_CLOCK_VARIABLE:
				return sfClockVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //scClock2sfDataImpl

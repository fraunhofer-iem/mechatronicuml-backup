/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.valuetype.TimeValue;

import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Timing Specification Single Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutionTimingSpecificationSinglePhaseImpl#getTimeForExecution <em>Time For Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionTimingSpecificationSinglePhaseImpl extends ExecutionTimingSpecificationImpl implements ExecutionTimingSpecificationSinglePhase {
	/**
	 * The cached value of the '{@link #getTimeForExecution() <em>Time For Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForExecution()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeForExecution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionTimingSpecificationSinglePhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeForExecution() {
		return timeForExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForExecution(TimeValue newTimeForExecution, NotificationChain msgs) {
		TimeValue oldTimeForExecution = timeForExecution;
		timeForExecution = newTimeForExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION, oldTimeForExecution, newTimeForExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForExecution(TimeValue newTimeForExecution) {
		if (newTimeForExecution != timeForExecution) {
			NotificationChain msgs = null;
			if (timeForExecution != null)
				msgs = ((InternalEObject)timeForExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION, null, msgs);
			if (newTimeForExecution != null)
				msgs = ((InternalEObject)newTimeForExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION, null, msgs);
			msgs = basicSetTimeForExecution(newTimeForExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION, newTimeForExecution, newTimeForExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION:
				return basicSetTimeForExecution(null, msgs);
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION:
				return getTimeForExecution();
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION:
				setTimeForExecution((TimeValue)newValue);
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION:
				setTimeForExecution((TimeValue)null);
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION:
				return timeForExecution != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionTimingSpecificationSinglePhaseImpl

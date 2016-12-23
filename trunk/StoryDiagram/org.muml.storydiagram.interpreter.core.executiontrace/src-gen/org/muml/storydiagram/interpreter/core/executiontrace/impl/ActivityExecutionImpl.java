/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl#getInParameterValues <em>In Parameter Values</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityExecutionImpl#getOutParameterValues <em>Out Parameter Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityExecutionImpl<ActivityType> extends ExecutionImpl implements ActivityExecution<ActivityType>
{
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected ActivityType			activity;

	/**
	 * The cached value of the '{@link #getInParameterValues() <em>In Parameter Values</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String>	inParameterValues;

	/**
	 * The cached value of the '{@link #getOutParameterValues() <em>Out Parameter Values</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String>	outParameterValues;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExecutionImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutiontracePackage.Literals.ACTIVITY_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ActivityType getActivity()
	{
		if (activity != null && ((EObject)activity).eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (ActivityType)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType basicGetActivity()
	{
		return activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(ActivityType newActivity)
	{
		ActivityType oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getInParameterValues()
	{
		if (inParameterValues == null) {
			inParameterValues = new EcoreEMap<String,String>(ExecutiontracePackage.Literals.MAP_ENTRY, MapEntryImpl.class, this, ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES);
		}
		return inParameterValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getOutParameterValues()
	{
		if (outParameterValues == null) {
			outParameterValues = new EcoreEMap<String,String>(ExecutiontracePackage.Literals.MAP_ENTRY, MapEntryImpl.class, this, ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES);
		}
		return outParameterValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				return ((InternalEList<?>)getInParameterValues()).basicRemove(otherEnd, msgs);
			case ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				return ((InternalEList<?>)getOutParameterValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				if (coreType) return getInParameterValues();
				else return getInParameterValues().map();
			case ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				if (coreType) return getOutParameterValues();
				else return getOutParameterValues().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				setActivity((ActivityType)newValue);
				return;
			case ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				((EStructuralFeature.Setting)getInParameterValues()).set(newValue);
				return;
			case ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				((EStructuralFeature.Setting)getOutParameterValues()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				setActivity((ActivityType)null);
				return;
			case ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				getInParameterValues().clear();
				return;
			case ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				getOutParameterValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				return activity != null;
			case ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
				return inParameterValues != null && !inParameterValues.isEmpty();
			case ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				return outParameterValues != null && !outParameterValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ActivityExecutionImpl

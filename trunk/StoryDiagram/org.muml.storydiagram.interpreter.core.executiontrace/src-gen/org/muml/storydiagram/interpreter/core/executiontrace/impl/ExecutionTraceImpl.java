/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.storydiagram.interpreter.core.executiontrace.Execution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Execution Trace</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl#getTotalExecutionTime <em>Total Execution Time</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionTraceImpl#getTotalExecutionTimeMsec <em>Total Execution Time Msec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionTraceImpl extends MinimalEObjectImpl.Container implements ExecutionTrace
{
	/**
	 * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution>		executions;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String	DESCRIPTION_EDEFAULT				= null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String				description							= DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalExecutionTime() <em>Total Execution Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTotalExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long		TOTAL_EXECUTION_TIME_EDEFAULT		= 0L;

	/**
	 * The default value of the '{@link #getTotalExecutionTimeMsec() <em>Total Execution Time Msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalExecutionTimeMsec()
	 * @generated
	 * @ordered
	 */
	protected static final long		TOTAL_EXECUTION_TIME_MSEC_EDEFAULT	= 0L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionTraceImpl()
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
		return ExecutiontracePackage.Literals.EXECUTION_TRACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Execution> getExecutions()
	{
		if (executions == null) {
			executions = new EObjectContainmentEList<Execution>(Execution.class, this, ExecutiontracePackage.EXECUTION_TRACE__EXECUTIONS);
		}
		return executions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.EXECUTION_TRACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getTotalExecutionTime()
	{
		long sum = 0;

		for (final Execution execution : this.getExecutions())
		{
			sum += execution.getExecutionTime();
		}

		return sum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getTotalExecutionTimeMsec()
	{
		return TimeUnit.NANOSECONDS.toMillis(this.getTotalExecutionTime());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case ExecutiontracePackage.EXECUTION_TRACE__EXECUTIONS:
				return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
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
			case ExecutiontracePackage.EXECUTION_TRACE__EXECUTIONS:
				return getExecutions();
			case ExecutiontracePackage.EXECUTION_TRACE__DESCRIPTION:
				return getDescription();
			case ExecutiontracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME:
				return getTotalExecutionTime();
			case ExecutiontracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC:
				return getTotalExecutionTimeMsec();
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
			case ExecutiontracePackage.EXECUTION_TRACE__EXECUTIONS:
				getExecutions().clear();
				getExecutions().addAll((Collection<? extends Execution>)newValue);
				return;
			case ExecutiontracePackage.EXECUTION_TRACE__DESCRIPTION:
				setDescription((String)newValue);
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
			case ExecutiontracePackage.EXECUTION_TRACE__EXECUTIONS:
				getExecutions().clear();
				return;
			case ExecutiontracePackage.EXECUTION_TRACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ExecutiontracePackage.EXECUTION_TRACE__EXECUTIONS:
				return executions != null && !executions.isEmpty();
			case ExecutiontracePackage.EXECUTION_TRACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExecutiontracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME:
				return getTotalExecutionTime() != TOTAL_EXECUTION_TIME_EDEFAULT;
			case ExecutiontracePackage.EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC:
				return getTotalExecutionTimeMsec() != TOTAL_EXECUTION_TIME_MSEC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // ExecutionTraceImpl

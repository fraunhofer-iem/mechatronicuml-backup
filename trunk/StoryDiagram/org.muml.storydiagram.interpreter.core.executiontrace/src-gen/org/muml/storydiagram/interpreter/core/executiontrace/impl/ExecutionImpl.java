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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.storydiagram.interpreter.core.executiontrace.Execution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl#getExecutionStartedTimeStamp <em>Execution Started Time Stamp</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl#getExecutionFinishedTimeStamp <em>Execution Finished Time Stamp</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl#getExecutionTimeMsec <em>Execution Time Msec</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ExecutionImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutionImpl extends MinimalEObjectImpl.Container implements Execution
{
	/**
	 * The default value of the '{@link #getExecutionStartedTimeStamp() <em>Execution Started Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getExecutionStartedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_STARTED_TIME_STAMP_EDEFAULT	= 0L;

	/**
	 * The cached value of the '{@link #getExecutionStartedTimeStamp() <em>Execution Started Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getExecutionStartedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected long				executionStartedTimeStamp				= EXECUTION_STARTED_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionFinishedTimeStamp() <em>Execution Finished Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getExecutionFinishedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_FINISHED_TIME_STAMP_EDEFAULT	= 0L;

	/**
	 * The cached value of the '{@link #getExecutionFinishedTimeStamp() <em>Execution Finished Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getExecutionFinishedTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected long				executionFinishedTimeStamp				= EXECUTION_FINISHED_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_TIME_EDEFAULT					= 0L;

	/**
	 * The default value of the '{@link #getExecutionTimeMsec() <em>Execution Time Msec</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getExecutionTimeMsec()
	 * @generated
	 * @ordered
	 */
	protected static final long	EXECUTION_TIME_MSEC_EDEFAULT			= 0L;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution>	elements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionImpl()
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
		return ExecutiontracePackage.Literals.EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExecutionStartedTimeStamp()
	{
		return executionStartedTimeStamp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionStartedTimeStamp(long newExecutionStartedTimeStamp)
	{
		long oldExecutionStartedTimeStamp = executionStartedTimeStamp;
		executionStartedTimeStamp = newExecutionStartedTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP, oldExecutionStartedTimeStamp, executionStartedTimeStamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExecutionFinishedTimeStamp()
	{
		return executionFinishedTimeStamp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionFinishedTimeStamp(long newExecutionFinishedTimeStamp)
	{
		long oldExecutionFinishedTimeStamp = executionFinishedTimeStamp;
		executionFinishedTimeStamp = newExecutionFinishedTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP, oldExecutionFinishedTimeStamp, executionFinishedTimeStamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getExecutionTime()
	{
		return this.getExecutionFinishedTimeStamp() - this.getExecutionStartedTimeStamp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public long getExecutionTimeMsec()
	{
		return TimeUnit.NANOSECONDS.toMillis(this.getExecutionTime());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Execution> getElements()
	{
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Execution>(Execution.class, this, ExecutiontracePackage.EXECUTION__ELEMENTS, ExecutiontracePackage.EXECUTION__CONTAINER);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Execution getContainer()
	{
		if (eContainerFeatureID() != ExecutiontracePackage.EXECUTION__CONTAINER) return null;
		return (Execution)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Execution newContainer, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newContainer, ExecutiontracePackage.EXECUTION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(Execution newContainer)
	{
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != ExecutiontracePackage.EXECUTION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, ExecutiontracePackage.EXECUTION__ELEMENTS, Execution.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.EXECUTION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Execution)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID()) {
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, ExecutiontracePackage.EXECUTION__ELEMENTS, Execution.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				return getExecutionStartedTimeStamp();
			case ExecutiontracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				return getExecutionFinishedTimeStamp();
			case ExecutiontracePackage.EXECUTION__EXECUTION_TIME:
				return getExecutionTime();
			case ExecutiontracePackage.EXECUTION__EXECUTION_TIME_MSEC:
				return getExecutionTimeMsec();
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
				return getElements();
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				return getContainer();
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
			case ExecutiontracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				setExecutionStartedTimeStamp((Long)newValue);
				return;
			case ExecutiontracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				setExecutionFinishedTimeStamp((Long)newValue);
				return;
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Execution>)newValue);
				return;
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				setContainer((Execution)newValue);
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
			case ExecutiontracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				setExecutionStartedTimeStamp(EXECUTION_STARTED_TIME_STAMP_EDEFAULT);
				return;
			case ExecutiontracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				setExecutionFinishedTimeStamp(EXECUTION_FINISHED_TIME_STAMP_EDEFAULT);
				return;
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
				getElements().clear();
				return;
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				setContainer((Execution)null);
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
			case ExecutiontracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
				return executionStartedTimeStamp != EXECUTION_STARTED_TIME_STAMP_EDEFAULT;
			case ExecutiontracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
				return executionFinishedTimeStamp != EXECUTION_FINISHED_TIME_STAMP_EDEFAULT;
			case ExecutiontracePackage.EXECUTION__EXECUTION_TIME:
				return getExecutionTime() != EXECUTION_TIME_EDEFAULT;
			case ExecutiontracePackage.EXECUTION__EXECUTION_TIME_MSEC:
				return getExecutionTimeMsec() != EXECUTION_TIME_MSEC_EDEFAULT;
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				return getContainer() != null;
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
		result.append(" (executionStartedTimeStamp: ");
		result.append(executionStartedTimeStamp);
		result.append(", executionFinishedTimeStamp: ");
		result.append(executionFinishedTimeStamp);
		result.append(')');
		return result.toString();
	}

} // ExecutionImpl

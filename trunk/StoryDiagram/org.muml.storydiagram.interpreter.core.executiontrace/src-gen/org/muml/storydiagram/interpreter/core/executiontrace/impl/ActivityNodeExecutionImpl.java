/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Node Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityNodeExecutionImpl#getActivityNode <em>Activity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeExecutionImpl<ActivityNodeType> extends ExecutionImpl implements ActivityNodeExecution<ActivityNodeType>
{
	/**
	 * The cached value of the '{@link #getActivityNode() <em>Activity Node</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActivityNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNodeType	activityNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeExecutionImpl()
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
		return ExecutiontracePackage.Literals.ACTIVITY_NODE_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ActivityNodeType getActivityNode()
	{
		if (activityNode != null && ((EObject)activityNode).eIsProxy()) {
			InternalEObject oldActivityNode = (InternalEObject)activityNode;
			activityNode = (ActivityNodeType)eResolveProxy(oldActivityNode);
			if (activityNode != oldActivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE, oldActivityNode, activityNode));
			}
		}
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeType basicGetActivityNode()
	{
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityNode(ActivityNodeType newActivityNode)
	{
		ActivityNodeType oldActivityNode = activityNode;
		activityNode = newActivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE, oldActivityNode, activityNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				if (resolve) return getActivityNode();
				return basicGetActivityNode();
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
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				setActivityNode((ActivityNodeType)newValue);
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
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				setActivityNode((ActivityNodeType)null);
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
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				return activityNode != null;
		}
		return super.eIsSet(featureID);
	}

} // ActivityNodeExecutionImpl

/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Edge Traversal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.ActivityEdgeTraversalImpl#getActivityEdge <em>Activity Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdgeTraversalImpl<ActivityEdgeType> extends ExecutionImpl implements ActivityEdgeTraversal<ActivityEdgeType>
{
	/**
	 * The cached value of the '{@link #getActivityEdge() <em>Activity Edge</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActivityEdge()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdgeType	activityEdge;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeTraversalImpl()
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
		return ExecutiontracePackage.Literals.ACTIVITY_EDGE_TRAVERSAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ActivityEdgeType getActivityEdge()
	{
		if (activityEdge != null && ((EObject)activityEdge).eIsProxy()) {
			InternalEObject oldActivityEdge = (InternalEObject)activityEdge;
			activityEdge = (ActivityEdgeType)eResolveProxy(oldActivityEdge);
			if (activityEdge != oldActivityEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE, oldActivityEdge, activityEdge));
			}
		}
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeType basicGetActivityEdge()
	{
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityEdge(ActivityEdgeType newActivityEdge)
	{
		ActivityEdgeType oldActivityEdge = activityEdge;
		activityEdge = newActivityEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE, oldActivityEdge, activityEdge));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				if (resolve) return getActivityEdge();
				return basicGetActivityEdge();
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
			case ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				setActivityEdge((ActivityEdgeType)newValue);
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
			case ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				setActivityEdge((ActivityEdgeType)null);
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
			case ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE:
				return activityEdge != null;
		}
		return super.eIsSet(featureID);
	}

} // ActivityEdgeTraversalImpl

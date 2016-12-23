/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternObjectExecutionImpl#getStoryPatternObject <em>Story Pattern Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StoryPatternObjectExecutionImpl<StoryPatternObjectType> extends ExecutionImpl implements
		StoryPatternObjectExecution<StoryPatternObjectType>
{
	/**
	 * The cached value of the '{@link #getStoryPatternObject() <em>Story Pattern Object</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStoryPatternObject()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternObjectType	storyPatternObject;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternObjectExecutionImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_OBJECT_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternObjectType getStoryPatternObject()
	{
		if (storyPatternObject != null && ((EObject)storyPatternObject).eIsProxy()) {
			InternalEObject oldStoryPatternObject = (InternalEObject)storyPatternObject;
			storyPatternObject = (StoryPatternObjectType)eResolveProxy(oldStoryPatternObject);
			if (storyPatternObject != oldStoryPatternObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT, oldStoryPatternObject, storyPatternObject));
			}
		}
		return storyPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternObjectType basicGetStoryPatternObject()
	{
		return storyPatternObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoryPatternObject(StoryPatternObjectType newStoryPatternObject)
	{
		StoryPatternObjectType oldStoryPatternObject = storyPatternObject;
		storyPatternObject = newStoryPatternObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT, oldStoryPatternObject, storyPatternObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				if (resolve) return getStoryPatternObject();
				return basicGetStoryPatternObject();
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
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				setStoryPatternObject((StoryPatternObjectType)newValue);
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
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				setStoryPatternObject((StoryPatternObjectType)null);
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
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT:
				return storyPatternObject != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryPatternObjectExecutionImpl

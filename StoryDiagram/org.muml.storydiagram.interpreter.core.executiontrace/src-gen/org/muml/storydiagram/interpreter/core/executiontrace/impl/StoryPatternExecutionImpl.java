/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Execution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.StoryPatternExecutionImpl#getStoryPattern <em>Story Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StoryPatternExecutionImpl<StoryPatternType> extends ExecutionImpl implements StoryPatternExecution<StoryPatternType>
{
	/**
	 * The cached value of the '{@link #getStoryPattern() <em>Story Pattern</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected StoryPatternType	storyPattern;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternExecutionImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public StoryPatternType getStoryPattern()
	{
		if (storyPattern != null && ((EObject)storyPattern).eIsProxy()) {
			InternalEObject oldStoryPattern = (InternalEObject)storyPattern;
			storyPattern = (StoryPatternType)eResolveProxy(oldStoryPattern);
			if (storyPattern != oldStoryPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN, oldStoryPattern, storyPattern));
			}
		}
		return storyPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternType basicGetStoryPattern()
	{
		return storyPattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoryPattern(StoryPatternType newStoryPattern)
	{
		StoryPatternType oldStoryPattern = storyPattern;
		storyPattern = newStoryPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN, oldStoryPattern, storyPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				if (resolve) return getStoryPattern();
				return basicGetStoryPattern();
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
			case ExecutiontracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				setStoryPattern((StoryPatternType)newValue);
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
			case ExecutiontracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				setStoryPattern((StoryPatternType)null);
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
			case ExecutiontracePackage.STORY_PATTERN_EXECUTION__STORY_PATTERN:
				return storyPattern != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryPatternExecutionImpl

/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Not Bound</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StoryPatternObjectNotBoundImpl<StoryPatternObjectType> extends StoryPatternObjectExecutionImpl<StoryPatternObjectType>
		implements StoryPatternObjectNotBound<StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternObjectNotBoundImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_OBJECT_NOT_BOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStoryPatternObject(StoryPatternObjectType newStoryPatternObject) {
		super.setStoryPatternObject(newStoryPatternObject);
	}

} // StoryPatternObjectNotBoundImpl

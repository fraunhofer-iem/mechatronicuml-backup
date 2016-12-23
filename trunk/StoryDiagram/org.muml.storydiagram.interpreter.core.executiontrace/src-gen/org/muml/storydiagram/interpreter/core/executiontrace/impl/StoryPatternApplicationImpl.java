/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Application</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StoryPatternApplicationImpl<StoryPatternType> extends StoryPatternExecutionImpl<StoryPatternType> implements
		StoryPatternApplication<StoryPatternType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternApplicationImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStoryPattern(StoryPatternType newStoryPattern) {
		super.setStoryPattern(newStoryPattern);
	}

} // StoryPatternApplicationImpl

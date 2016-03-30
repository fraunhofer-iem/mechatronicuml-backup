/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Constraint Violated</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType> extends
		StoryPatternConstraintEvaluationImpl<StoryPatternType, ExpressionType> implements
		StoryPatternConstraintViolated<StoryPatternType, ExpressionType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StoryPatternConstraintViolatedImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutionTracePackage.Literals.STORY_PATTERN_CONSTRAINT_VIOLATED;
	}

} // StoryPatternConstraintViolatedImpl

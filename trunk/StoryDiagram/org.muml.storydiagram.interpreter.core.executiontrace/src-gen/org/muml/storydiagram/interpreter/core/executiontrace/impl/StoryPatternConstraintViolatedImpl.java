/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Constraint Violated</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType> extends
		StoryPatternConstraintEvaluationImpl<StoryPatternType, ExpressionType> implements
		StoryPatternConstraintViolated<StoryPatternType, ExpressionType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternConstraintViolatedImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_CONSTRAINT_VIOLATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setConstraint(ExpressionType newConstraint) {
		super.setConstraint(newConstraint);
	}

} // StoryPatternConstraintViolatedImpl

/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Constraint Violated</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class StoryPatternObjectConstraintViolatedImpl<StoryPatternObjectType, ExpressionType> extends
		StoryPatternObjectConstraintEvaluationImpl<StoryPatternObjectType, ExpressionType> implements
		StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternObjectConstraintViolatedImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED;
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

} // StoryPatternObjectConstraintViolatedImpl

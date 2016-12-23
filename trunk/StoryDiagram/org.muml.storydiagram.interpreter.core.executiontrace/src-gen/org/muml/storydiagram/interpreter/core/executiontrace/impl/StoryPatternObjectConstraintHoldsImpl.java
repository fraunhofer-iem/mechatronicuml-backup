/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Story Pattern Object Constraint Holds</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StoryPatternObjectConstraintHoldsImpl<StoryPatternObjectType, ExpressionType> extends
		StoryPatternObjectConstraintEvaluationImpl<StoryPatternObjectType, ExpressionType> implements
		StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternObjectConstraintHoldsImpl()
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
		return ExecutiontracePackage.Literals.STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS;
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

} // StoryPatternObjectConstraintHoldsImpl

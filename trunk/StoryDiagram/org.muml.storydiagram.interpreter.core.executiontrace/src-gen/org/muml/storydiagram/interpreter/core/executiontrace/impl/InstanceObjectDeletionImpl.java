/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Object Deletion</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class InstanceObjectDeletionImpl<StoryPatternObjectType> extends InstanceObjectModificationImpl<StoryPatternObjectType> implements
		InstanceObjectDeletion<StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceObjectDeletionImpl()
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
		return ExecutiontracePackage.Literals.INSTANCE_OBJECT_DELETION;
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

} // InstanceObjectDeletionImpl

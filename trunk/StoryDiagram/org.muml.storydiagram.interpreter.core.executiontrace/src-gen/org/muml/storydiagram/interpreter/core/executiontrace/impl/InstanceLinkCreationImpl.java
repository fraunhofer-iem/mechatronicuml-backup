/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Link Creation</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		InstanceLinkModificationImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceLinkCreationImpl()
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
		return ExecutiontracePackage.Literals.INSTANCE_LINK_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStoryPatternLink(StoryPatternLinkType newStoryPatternLink) {
		super.setStoryPatternLink(newStoryPatternLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSourceStoryPatternObject(StoryPatternObjectType newSourceStoryPatternObject) {
		super.setSourceStoryPatternObject(newSourceStoryPatternObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTargetStoryPatternObject(StoryPatternObjectType newTargetStoryPatternObject) {
		super.setTargetStoryPatternObject(newTargetStoryPatternObject);
	}

} // InstanceLinkCreationImpl

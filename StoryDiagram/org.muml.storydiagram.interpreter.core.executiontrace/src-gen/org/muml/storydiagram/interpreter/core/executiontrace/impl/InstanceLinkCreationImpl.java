/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Link Creation</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		InstanceLinkModificationImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceLinkCreationImpl()
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
		return ExecutionTracePackage.Literals.INSTANCE_LINK_CREATION;
	}

} // InstanceLinkCreationImpl

/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Link Deletion</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstanceLinkDeletionImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		InstanceLinkModificationImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceLinkDeletionImpl()
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
		return ExecutionTracePackage.Literals.INSTANCE_LINK_DELETION;
	}

} // InstanceLinkDeletionImpl

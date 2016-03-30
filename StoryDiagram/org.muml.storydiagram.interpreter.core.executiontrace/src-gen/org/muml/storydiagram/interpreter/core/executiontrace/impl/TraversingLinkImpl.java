/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Traversing Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class TraversingLinkImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		StoryPatternLinkExecutionImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		TraversingLink<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TraversingLinkImpl()
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
		return ExecutionTracePackage.Literals.TRAVERSING_LINK;
	}

} // TraversingLinkImpl

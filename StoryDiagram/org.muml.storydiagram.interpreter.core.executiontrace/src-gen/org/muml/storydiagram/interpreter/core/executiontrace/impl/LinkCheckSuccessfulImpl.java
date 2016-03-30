/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Link Check Successful</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class LinkCheckSuccessfulImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		LinkCheckImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LinkCheckSuccessfulImpl()
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
		return ExecutionTracePackage.Literals.LINK_CHECK_SUCCESSFUL;
	}

} // LinkCheckSuccessfulImpl

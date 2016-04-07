/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Link Check Failed</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class LinkCheckFailedImpl<StoryPatternLinkType, StoryPatternObjectType> extends
		LinkCheckImpl<StoryPatternLinkType, StoryPatternObjectType> implements
		LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkCheckFailedImpl()
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
		return ExecutiontracePackage.Literals.LINK_CHECK_FAILED;
	}

} // LinkCheckFailedImpl

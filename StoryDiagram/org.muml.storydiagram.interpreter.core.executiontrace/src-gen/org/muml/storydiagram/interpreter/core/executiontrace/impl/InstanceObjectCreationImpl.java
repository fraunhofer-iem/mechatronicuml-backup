/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Object Creation</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstanceObjectCreationImpl<StoryPatternObjectType> extends InstanceObjectModificationImpl<StoryPatternObjectType> implements
		InstanceObjectCreation<StoryPatternObjectType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceObjectCreationImpl()
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
		return ExecutionTracePackage.Literals.INSTANCE_OBJECT_CREATION;
	}

} // InstanceObjectCreationImpl

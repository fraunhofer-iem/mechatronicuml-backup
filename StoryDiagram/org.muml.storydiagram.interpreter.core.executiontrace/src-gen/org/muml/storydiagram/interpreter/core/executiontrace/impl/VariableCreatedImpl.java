/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Created</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class VariableCreatedImpl<ClassifierType> extends VariableModificationImpl<ClassifierType> implements
		VariableCreated<ClassifierType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableCreatedImpl()
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
		return ExecutionTracePackage.Literals.VARIABLE_CREATED;
	}

} // VariableCreatedImpl

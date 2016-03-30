/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Deleted</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class VariableDeletedImpl<ClassifierType> extends VariableModificationImpl<ClassifierType> implements
		VariableDeleted<ClassifierType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableDeletedImpl()
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
		return ExecutionTracePackage.Literals.VARIABLE_DELETED;
	}

} // VariableDeletedImpl

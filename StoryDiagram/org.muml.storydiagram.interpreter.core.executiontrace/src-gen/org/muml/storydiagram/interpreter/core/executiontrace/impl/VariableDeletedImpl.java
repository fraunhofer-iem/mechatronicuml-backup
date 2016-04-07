/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Deleted</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class VariableDeletedImpl<ClassifierType> extends VariableModificationImpl<ClassifierType> implements
		VariableDeleted<ClassifierType>
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeletedImpl()
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
		return ExecutiontracePackage.Literals.VARIABLE_DELETED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setClassifier(ClassifierType newClassifier) {
		super.setClassifier(newClassifier);
	}

} // VariableDeletedImpl

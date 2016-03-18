/**
 */
package de.uni_paderborn.uppaal.requirements.impl;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.uppaal.expressions.impl.ExpressionImpl;
import de.uni_paderborn.uppaal.requirements.DeadlockExpression;
import de.uni_paderborn.uppaal.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deadlock Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeadlockExpressionImpl extends ExpressionImpl implements DeadlockExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlockExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.DEADLOCK_EXPRESSION;
	}

} //DeadlockExpressionImpl

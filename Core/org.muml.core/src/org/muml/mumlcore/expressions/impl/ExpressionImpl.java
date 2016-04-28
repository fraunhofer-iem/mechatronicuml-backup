/**
 */
package org.muml.mumlcore.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.ExpressionsPackage;
import org.muml.mumlcore.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends CommentableElementImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSION;
	}

} //ExpressionImpl

/**
 */
package de.uni_paderborn.uppaal.types.impl;

import de.uni_paderborn.uppaal.expressions.impl.ExpressionImpl;

import de.uni_paderborn.uppaal.types.TypeExpression;
import de.uni_paderborn.uppaal.types.TypesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TypeExpressionImpl extends ExpressionImpl implements TypeExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_EXPRESSION;
	}

} //TypeExpressionImpl

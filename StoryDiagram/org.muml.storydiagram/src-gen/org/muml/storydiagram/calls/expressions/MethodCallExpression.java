/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.expressions;

import org.muml.core.expressions.Expression;
import org.muml.storydiagram.calls.Invocation;
import org.muml.storydiagram.calls.OpaqueCallable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MethodCallEpression represents the direct invocation of a method. This can either be a method which is explicitly modeled as an EOperation in a class diagram (referenced by the OperationExtension) or an unmodeled method in an external library (referenced by an OpaqueCallable). Therefore, a MethodCallExpression references either an OperationExtension (indirectly via the callee role between Invocation and Callable) or an OpaqueCallable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.expressions.MethodCallExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.expressions.MethodCallExpression#getOpaqueCallable <em>Opaque Callable</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.calls.expressions.ExpressionsPackage#getMethodCallExpression()
 * @model
 * @generated
 */
public interface MethodCallExpression extends Expression, Invocation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MethodCallExpression references an expression instead of a target object to allow the determination of the call target by an expression. This can be handy when a method should be called e.g. on the return value of another method (as in a.b().c() ). Then the method call of c() would be modeled by a MethodCallExpression with the callExpression a.b(), which again is a MethodCallExpression itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.muml.storydiagram.calls.expressions.ExpressionsPackage#getMethodCallExpression_Target()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.expressions.MethodCallExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Opaque Callable</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.calls.OpaqueCallable#getCallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This containment reference is a helper construct because the OpaqueCallable has to be contained somewhere. A MethodCallExpression (being an Invocation) could also reference an OpaqueCallable (being a Callable) via the callee reference but then the OpaqueCallable would not be contained anywhere in the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opaque Callable</em>' containment reference.
	 * @see #setOpaqueCallable(OpaqueCallable)
	 * @see org.muml.storydiagram.calls.expressions.ExpressionsPackage#getMethodCallExpression_OpaqueCallable()
	 * @see org.muml.storydiagram.calls.OpaqueCallable#getCallExpression
	 * @model opposite="callExpression" containment="true" ordered="false"
	 * @generated
	 */
	OpaqueCallable getOpaqueCallable();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.expressions.MethodCallExpression#getOpaqueCallable <em>Opaque Callable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque Callable</em>' containment reference.
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	void setOpaqueCallable(OpaqueCallable value);

} // MethodCallExpression

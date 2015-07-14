/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.expression;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.reconfiguration.StructuralCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate Structural Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EvaluateStructuralCondition Expression can be used for triggering the evaluation of a StructuralCondition from an expression specified by the MechatronicUML action language. 
 * In particular, it may be used for evaluating a StructuralCondition in the action of a transition of a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.EvaluateStructuralConditionExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.EvaluateStructuralConditionExpression#getStructuralCondition <em>Structural Condition</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage#getEvaluateStructuralConditionExpression()
 * @model
 * @generated
 */
public interface EvaluateStructuralConditionExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter bindings assign a value to each of the parameters of the 
	 * structural condition that is called by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage#getEvaluateStructuralConditionExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

	/**
	 * Returns the value of the '<em><b>Structural Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Condition</em>' reference.
	 * @see #setStructuralCondition(StructuralCondition)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage#getEvaluateStructuralConditionExpression_StructuralCondition()
	 * @model required="true"
	 * @generated
	 */
	StructuralCondition getStructuralCondition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.EvaluateStructuralConditionExpression#getStructuralCondition <em>Structural Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Condition</em>' reference.
	 * @see #getStructuralCondition()
	 * @generated
	 */
	void setStructuralCondition(StructuralCondition value);

} // EvaluateStructuralConditionExpression

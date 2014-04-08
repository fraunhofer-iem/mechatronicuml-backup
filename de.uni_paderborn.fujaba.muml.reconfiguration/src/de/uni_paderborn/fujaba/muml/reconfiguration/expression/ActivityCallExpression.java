/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.expression;

import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.calls.Invocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActivityCallExpression can be used for calling a story diagram from an expression specified by the MechatronicUML action language. 
 * In particular, it may be used for calling a story diagram in the action of a transition of a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage#getActivityCallExpression()
 * @model
 * @generated
 */
public interface ActivityCallExpression extends Expression, Invocation {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The story diagram that is called by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage#getActivityCallExpression_Activity()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.callee.oclAsType(storydiagrams::activities::Activity)'"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ActivityCallExpression

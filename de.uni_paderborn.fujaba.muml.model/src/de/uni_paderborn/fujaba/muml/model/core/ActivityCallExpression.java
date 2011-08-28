/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ExceptionVariable;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Expression that represents an activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.ActivityCallExpression#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getActivityCallExpression()
 * @model
 * @generated
 */
public interface ActivityCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the exception variable that this expression refers to. If you have an activity edge that catches an exception e, then this expression can represent the reference e.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getActivityCallExpression_Activity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.ActivityCallExpression#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ActivityCallExpression

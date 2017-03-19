/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.actionlanguage;

import org.muml.core.expressions.Expression;

import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Message Delay Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to reference a TimeValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.MaxMessageDelayReferenceExpression#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getMaxMessageDelayReferenceExpression()
 * @model
 * @generated
 */
public interface MaxMessageDelayReferenceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TimeValue which is referenced by the TimeValueExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Value</em>' reference.
	 * @see #setTimeValue(TimeValue)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getMaxMessageDelayReferenceExpression_TimeValue()
	 * @model required="true"
	 * @generated
	 */
	TimeValue getTimeValue();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.MaxMessageDelayReferenceExpression#getTimeValue <em>Time Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' reference.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(TimeValue value);

} // MaxMessageDelayReferenceExpression

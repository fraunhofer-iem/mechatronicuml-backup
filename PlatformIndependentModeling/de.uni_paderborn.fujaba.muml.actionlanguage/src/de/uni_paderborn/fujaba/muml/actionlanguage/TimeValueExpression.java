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
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value Expression</b></em>'.
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.TimeValueExpression#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getTimeValueExpression()
 * @model
 * @generated
 */
public interface TimeValueExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TimeValue which is referenced by the TimeValueExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Value</em>' reference.
	 * @see #setTimeValue(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getTimeValueExpression_TimeValue()
	 * @model required="true"
	 * @generated
	 */
	TimeValue getTimeValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.TimeValueExpression#getTimeValue <em>Time Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' reference.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(TimeValue value);

} // TimeValueExpression

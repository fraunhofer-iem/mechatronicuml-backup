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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.ArrayIndexExpression#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getArrayIndexExpression()
 * @model
 * @generated
 */
public interface ArrayIndexExpression extends ElementAccessorExpression {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indices which refer to an concrete index of an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Expression)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getArrayIndexExpression_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIndex();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.ArrayIndexExpression#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Expression value);

} // ArrayIndexExpression

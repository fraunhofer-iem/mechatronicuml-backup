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
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TypeCastExpression enables to perform an explicit type cast of the value of the enclosedExpression to the data type given in the eponymous reference. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.TypeCastExpression#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.TypeCastExpression#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getTypeCastExpression()
 * @model
 * @generated
 */
public interface TypeCastExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the DataType to which the value of the enclosedExpression is converted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getTypeCastExpression_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.TypeCastExpression#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Enclosed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosed Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the expression that should be converted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosed Expression</em>' containment reference.
	 * @see #setEnclosedExpression(Expression)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getTypeCastExpression_EnclosedExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getEnclosedExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.TypeCastExpression#getEnclosedExpression <em>Enclosed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosed Expression</em>' containment reference.
	 * @see #getEnclosedExpression()
	 * @generated
	 */
	void setEnclosedExpression(Expression value);

} // TypeCastExpression

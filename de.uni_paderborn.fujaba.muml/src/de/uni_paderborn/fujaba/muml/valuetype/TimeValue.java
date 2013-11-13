/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.valuetype;

import java.util.concurrent.TimeUnit;

import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a composite state of a realtime statechart. Composite states may again contain realtime statecharts hence enabling the creation of hierarchical statecharts. Further more composite states have do, entry and exit actions. Also composite states define which synchronization channels are allowed to be used by embedded statecharts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage#getTimeValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LiteralExpressionMustBeANaturalNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LiteralExpressionMustBeANaturalNumber='-- If a TimeValue has as value a LiteralExpression, it must be a natural number.\r\n-- 1. Check if the LiteralExpression can be cast to an Integer\r\n-- 2. Check if this Integer is greater or equal to zero.\r\n\r\n(\r\nnot self.value.oclIsUndefined()\r\nand \r\nself.value.oclIsTypeOf(core::expressions::common::LiteralExpression)\r\n)\r\nimplies\r\n(\r\nnot self.value.oclAsType(core::expressions::common::LiteralExpression).value.toInteger().oclIsUndefined()\r\nand \r\nself.value.oclAsType(core::expressions::common::LiteralExpression).value.toInteger()>=0\r\n)\r\n-- author: xell\r\n-- ticket: 770'"
 * @generated
 */
public interface TimeValue extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage#getTimeValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(TimeUnit)
	 * @see de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage#getTimeValue_Unit()
	 * @model unsettable="true" dataType="de.uni_paderborn.fujaba.muml.valuetype.TimeUnit"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeUnit)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Return value concatenated with abbreviated unit.\r\nStringBuffer sb = new StringBuffer();\r\nif (value == null) {\r\n\tsb.append(\"null\");\r\n} else {\r\n\tif (value instanceof LiteralExpression) {\r\n\t\tsb.append(((LiteralExpression) value).getValue());\r\n\t} else {\r\n\t\tsb.append(value.eClass().getName());\r\n\t}\r\n}\r\nif (unit != null) {\r\n\tsb.append(\' \');\r\n\tsb.append(TimeValueImpl.getUnitRepresentation(unit));\r\n}\r\nreturn sb.toString();'"
	 * @generated
	 */
	String toString();

} // TimeValue

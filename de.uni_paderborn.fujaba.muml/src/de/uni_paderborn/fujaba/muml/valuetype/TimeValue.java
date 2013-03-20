/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.valuetype;

import java.util.concurrent.TimeUnit;

import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value</b></em>'.
 * <!-- end-user-doc -->
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
 * @model
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
	 * @see #setValue(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage#getTimeValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.valuetype.TimeValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NaturalNumber value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Return value concatenated with abbreviated unit.\r\nStringBuffer sb = new StringBuffer();\r\nif (value == null) {\r\n\tsb.append(\"null\");\r\n} else {\r\n\tsb.append(value.toString());\r\n}\r\nif (unit != null) {\r\n\tsb.append(\' \');\r\n\tswitch (unit) {\r\n\tcase DAYS:\r\n\t\tsb.append(\'d\');\r\n\t\tbreak;\r\n\tcase HOURS:\r\n\t\tsb.append(\'h\');\r\n\t\tbreak;\r\n\tcase MINUTES:\r\n\t\tsb.append(\'m\');\r\n\t\tbreak;\r\n\tcase SECONDS:\r\n\t\tsb.append(\'s\');\r\n\t\tbreak;\r\n\tcase MILLISECONDS:\r\n\t\tsb.append(\"ms\");\r\n\t\tbreak;\r\n\tcase MICROSECONDS:\r\n\t\tsb.append(\"\u03bcs\");\r\n\t\tbreak;\r\n\tcase NANOSECONDS:\r\n\t\tsb.append(\"ns\");\r\n\t\tbreak;\r\n\t}\r\n}\r\nreturn sb.toString();'"
	 * @generated
	 */
	String toString();

} // TimeValue

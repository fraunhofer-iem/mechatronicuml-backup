/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.valuetype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents either a natural number or infinity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber#isInfinity <em>Infinity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage#getNaturalNumber()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValueGreaterOrEqualZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValueGreaterOrEqualZero='self.value >= 0'"
 * @generated
 */
public interface NaturalNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this natural number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage#getNaturalNumber_Value()
	 * @model default="1"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Infinity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determins whether this natural number represents infinity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infinity</em>' attribute.
	 * @see #setInfinity(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage#getNaturalNumber_Infinity()
	 * @model default="false"
	 * @generated
	 */
	boolean isInfinity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber#isInfinity <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinity</em>' attribute.
	 * @see #isInfinity()
	 * @generated
	 */
	void setInfinity(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the value to the value of the given parameter.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (value == null || value.equals(\"*\")) {\n\tsetInfinity(true);\n\treturn;\n}\n\n// Convert to long, if string cannot be parsed, set infinity.\nlong longValue;\ntry {\n\tlongValue = Long.parseLong(value);\n} catch (NumberFormatException e) {\n\tsetInfinity(true);\n\treturn;\n}\n\n// Call setValue(long) outsite of catch block, so that the NumberFormatException\n// indicating negative numbers is not catched.\nsetValue(longValue);'"
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation yields the value of this natural number in a string representation.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isInfinity()) {\n\treturn \"*\";\n}\nreturn Long.toString(value);'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (o instanceof NaturalNumber) {\r\n\tNaturalNumber naturalNumber = (NaturalNumber) o;\r\n\t// Value of infinity must be equal\r\n\tif (isInfinity() != naturalNumber.isInfinity()) {\r\n\t\treturn false;\r\n\t}\r\n\t// If both are not infinite, make sure their value is identical.\r\n\tif (!isInfinity() && (naturalNumber.getValue() != getValue())) {\r\n\t\treturn false;\r\n\t}\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean equals(EObject o);

} // NaturalNumber

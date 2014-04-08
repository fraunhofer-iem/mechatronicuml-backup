/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype;

import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute is a field of a StructType. An attribute specifies a name and a primitive or array data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute#getStructType <em>Struct Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Struct Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the containing struct type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Struct Type</em>' container reference.
	 * @see #setStructType(StructType)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getAttribute_StructType()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructType#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	StructType getStructType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute#getStructType <em>Struct Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Type</em>' container reference.
	 * @see #getStructType()
	 * @generated
	 */
	void setStructType(StructType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of this attribute. The data type needs to be a primitive data type
	 * or an array data type, where the array only contains primitives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Attribute

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
package de.uni_paderborn.fujaba.muml.types;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute is a field of a StructType. An attribute specifies a name and a data type. Eligable data types are primitive data types, array data types, and structure data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.types.Attribute#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.types.TypesPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidAttributeDataType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidAttributeDataType='-- An attribute may only use a Primtive Data Type, a Ranged Primitive Data Type, an Array Data Type, or a Structure Data Type\r\nself.dataType.oclIsTypeOf(PrimitiveDataType) or self.dataType.oclIsTypeOf(RangedPrimitiveDataType) or self.dataType.oclIsTypeOf(ArrayDataType) or self.dataType.oclIsTypeOf(StructureDataType)\r\n-- author: chris227'"
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see de.uni_paderborn.fujaba.muml.types.TypesPackage#getAttribute_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.types.Attribute#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // Attribute

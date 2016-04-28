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
package org.muml.pim.types;

import org.muml.core.CommentableElement;
import org.muml.pim.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute is a field of a StructType. An attribute specifies a name and a data type. Eligable data types are primitive data types, array data types, and structure data types.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.types.TypesPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidAttributeDataType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidAttributeDataType='-- An attribute may only use a Primtive Data Type, a Ranged Primitive Data Type, an Array Data Type, or a Structure Data Type\r\nself.dataType.oclIsTypeOf(PrimitiveDataType) or self.dataType.oclIsTypeOf(RangedPrimitiveDataType) or self.dataType.oclIsTypeOf(ArrayDataType) or self.dataType.oclIsTypeOf(StructureDataType)\r\n-- author: chris227'"
 * @generated
 */
public interface Attribute extends TypedNamedElement, CommentableElement {

} // Attribute

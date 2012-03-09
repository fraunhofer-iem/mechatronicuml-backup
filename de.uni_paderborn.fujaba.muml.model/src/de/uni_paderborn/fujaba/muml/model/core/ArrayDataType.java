/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This data type represents an array data type and specifies the maximum cardinality of inner data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.ArrayDataType#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getArrayDataType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ArrayIndexOutOfBounce='self.innerDeclaration->size() <= self.cardinality'"
 * @generated
 */
public interface ArrayDataType extends CompositeDataType {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the maximum number of composite elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute list.
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getArrayDataType_Cardinality()
	 * @model default="1" required="true"
	 * @generated
	 */
	EList<Integer> getCardinality();

} // ArrayDataType

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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ArrayIndexOutOfBounce='self.innerDeclaration->size() <= self.cardinality' InnerDeclarationEqualTypeViolation='self.innerDeclaration.type->asSet()->select(not oclIsUndefined())->size() = 1'"
 * @generated
 */
public interface ArrayDataType extends CompositeDataType {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the maximum number of composite elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getArrayDataType_Cardinality()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.ArrayDataType#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

} // ArrayDataType

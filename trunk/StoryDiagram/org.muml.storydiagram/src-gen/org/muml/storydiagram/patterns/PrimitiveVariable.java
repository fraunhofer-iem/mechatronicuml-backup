/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns;

import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a variable that holds a value of a primitive type, e.g. integer, boolean, String.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.PrimitiveVariable#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.patterns.PatternsPackage#getPrimitiveVariable()
 * @model
 * @generated
 */
public interface PrimitiveVariable extends AbstractVariable {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the primitive variable which must be an EDataType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(EDataType)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getPrimitiveVariable_DataType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (classifier <> null and classifier.oclIsKindOf(ecore::EDataType)) then classifier.oclAsType(ecore::EDataType) else null endif'"
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.PrimitiveVariable#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EDataType value);

} // PrimitiveVariable

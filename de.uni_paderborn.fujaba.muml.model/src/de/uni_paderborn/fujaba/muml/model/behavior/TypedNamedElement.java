/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.behavior;

import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.behavior.TypedNamedElement#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage#getTypedNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedNamedElement extends NamedElement {
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
	 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage#getTypedNamedElement_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.behavior.TypedNamedElement#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // TypedNamedElement

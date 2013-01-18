/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.model.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getAttributeBinding()
 * @model
 * @generated
 */
public interface AttributeBinding extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getAttributeBinding_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getAttributeBinding_Value()
	 * @model dataType="de.uni_paderborn.fujaba.muml.model.runtime.JavaObject" transient="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // AttributeBinding

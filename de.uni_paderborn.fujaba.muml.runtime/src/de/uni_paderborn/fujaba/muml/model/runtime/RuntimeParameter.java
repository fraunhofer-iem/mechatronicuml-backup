/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getMessage <em>Message</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeParameter()
 * @model
 * @generated
 */
public interface RuntimeParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' container reference.
	 * @see #setMessage(RuntimeMessage)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeParameter_Message()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	RuntimeMessage getMessage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getMessage <em>Message</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' container reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(RuntimeMessage value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeParameter_Value()
	 * @model dataType="de.uni_paderborn.fujaba.muml.model.runtime.JavaObject" transient="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // RuntimeParameter

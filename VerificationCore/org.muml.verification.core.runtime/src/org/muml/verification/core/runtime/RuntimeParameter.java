/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.muml.mumlcore.NamedElement;
import org.muml.pim.behavior.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeParameter#getMessage <em>Message</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeParameter#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeParameter()
 * @model
 * @generated
 */
public interface RuntimeParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.RuntimeMessage#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' container reference.
	 * @see #setMessage(RuntimeMessage)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeParameter_Message()
	 * @see org.muml.verification.core.runtime.RuntimeMessage#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	RuntimeMessage getMessage();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeParameter#getMessage <em>Message</em>}' container reference.
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
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeParameter_Value()
	 * @model dataType="org.muml.verification.core.runtime.JavaObject" transient="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeParameter_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeParameter#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // RuntimeParameter

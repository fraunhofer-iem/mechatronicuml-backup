/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Address String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getLocalAddressString()
 * @model
 * @generated
 */
public interface LocalAddressString extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getLocalAddressString_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LocalAddressString

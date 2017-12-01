/**
 */
package org.muml.security.extension;

import org.muml.core.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.security.extension.SecurityExtension#getSensitivityFlag <em>Sensitivity Flag</em>}</li>
 * </ul>
 *
 * @see org.muml.security.extension.ExtensionPackage#getSecurityExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CardinalityUpperBoundSet='-- Upper bound of cardinality must be set\r\nif self.cardinality.upperBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.upperBound-&gt;notEmpty()\r\nendif'"
 * @generated
 */
public interface SecurityExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>Sensitivity Flag</b></em>' attribute.
	 * The default value is <code>"Neutral"</code>.
	 * The literals are from the enumeration {@link org.muml.security.extension.sensitivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity Flag</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity Flag</em>' attribute.
	 * @see org.muml.security.extension.sensitivity
	 * @see #setSensitivityFlag(sensitivity)
	 * @see org.muml.security.extension.ExtensionPackage#getSecurityExtension_SensitivityFlag()
	 * @model default="Neutral"
	 * @generated
	 */
	sensitivity getSensitivityFlag();

	/**
	 * Sets the value of the '{@link org.muml.security.extension.SecurityExtension#getSensitivityFlag <em>Sensitivity Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity Flag</em>' attribute.
	 * @see org.muml.security.extension.sensitivity
	 * @see #getSensitivityFlag()
	 * @generated
	 */
	void setSensitivityFlag(sensitivity value);

} // SecurityExtension

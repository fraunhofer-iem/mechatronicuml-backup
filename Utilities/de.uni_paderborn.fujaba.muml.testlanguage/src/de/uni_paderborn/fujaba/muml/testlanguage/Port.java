/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Port</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.uni_paderborn.fujaba.muml.testlanguage.Port#getName <em>Name
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage#getPort()
 * @model abstract="true" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore documentation='Abstract class for ports.'"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. The default
	 * value is <code>"port"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage#getPort_Name()
	 * @model default="port" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link de.uni_paderborn.fujaba.muml.testlanguage.Port#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Port

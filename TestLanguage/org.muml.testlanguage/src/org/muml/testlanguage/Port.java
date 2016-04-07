/**
 */
package org.muml.testlanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Port</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.Port#getName <em>Name</em>}</li>
 * <li>{@link org.muml.testlanguage.Port#isInOut <em>In Out</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.TestLanguagePackage#getPort()
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
	 * @see org.muml.testlanguage.TestLanguagePackage#getPort_Name()
	 * @model default="port" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.testlanguage.Port#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Out</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Out</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>In Out</em>' attribute.
	 * @see #setInOut(boolean)
	 * @see org.muml.testlanguage.TestLanguagePackage#getPort_InOut()
	 * @model
	 * @generated
	 */
	boolean isInOut();

	/**
	 * Sets the value of the ' {@link org.muml.testlanguage.Port#isInOut
	 * <em>In Out</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>In Out</em>' attribute.
	 * @see #isInOut()
	 * @generated
	 */
	void setInOut(boolean value);

} // Port

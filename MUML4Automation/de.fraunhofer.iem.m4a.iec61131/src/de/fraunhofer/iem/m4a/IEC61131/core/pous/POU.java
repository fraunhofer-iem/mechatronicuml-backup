/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getPOU()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface POU extends LibraryElement, CommentableElement {

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"st"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getPOU_Language()
	 * @model default="st" volatile="true" derived="true"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);
} // POU

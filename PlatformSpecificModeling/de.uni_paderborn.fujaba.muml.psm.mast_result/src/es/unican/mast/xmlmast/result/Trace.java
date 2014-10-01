/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.Trace#getPathname <em>Pathname</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getTrace()
 * @model extendedMetaData="name='Trace' kind='empty'"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathname</em>' attribute.
	 * @see #setPathname(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTrace_Pathname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Pathname'"
	 * @generated
	 */
	String getPathname();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.Trace#getPathname <em>Pathname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathname</em>' attribute.
	 * @see #getPathname()
	 * @generated
	 */
	void setPathname(String value);

} // Trace

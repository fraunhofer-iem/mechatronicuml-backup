/**
 */
package org.muml.graphviz.dot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.dot.Setting#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.Setting#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.graphviz.dot.DotPackage#getSetting()
 * @model
 * @generated
 */
public interface Setting extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.muml.graphviz.dot.DotPackage#getSetting_Attribute()
	 * @model required="true"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.dot.Setting#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.muml.graphviz.dot.DotPackage#getSetting_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.dot.Setting#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Setting

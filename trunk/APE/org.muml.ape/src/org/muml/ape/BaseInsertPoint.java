/**
 */
package org.muml.ape;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Insert Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.BaseInsertPoint#getBaseClass <em>Base Class</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getBaseInsertPoint()
 * @model
 * @generated
 */
public interface BaseInsertPoint extends OrderedElement {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBaseClass(org.muml.ape.Class)
	 * @see org.muml.ape.PropertiesPackage#getBaseInsertPoint_BaseClass()
	 * @model required="true"
	 * @generated
	 */
	org.muml.ape.Class getBaseClass();

	/**
	 * Sets the value of the '{@link org.muml.ape.BaseInsertPoint#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(org.muml.ape.Class value);

} // BaseInsertPoint

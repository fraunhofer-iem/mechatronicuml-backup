/**
 */
package de.uni_paderborn.fujaba.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Insert Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.BaseInsertPoint#getBaseClass <em>Base Class</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getBaseInsertPoint()
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
	 * @see #setBaseClass(de.uni_paderborn.fujaba.properties.Class)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getBaseInsertPoint_BaseClass()
	 * @model required="true"
	 * @generated
	 */
	de.uni_paderborn.fujaba.properties.Class getBaseClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.BaseInsertPoint#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(de.uni_paderborn.fujaba.properties.Class value);

} // BaseInsertPoint

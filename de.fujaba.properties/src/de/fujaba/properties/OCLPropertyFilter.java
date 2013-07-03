/**
 */
package de.fujaba.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Property Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.OCLPropertyFilter#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getOCLPropertyFilter()
 * @model
 * @generated
 */
public interface OCLPropertyFilter extends PropertyFilter {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.fujaba.properties.PropertiesPackage#getOCLPropertyFilter_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.OCLPropertyFilter#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // OCLPropertyFilter

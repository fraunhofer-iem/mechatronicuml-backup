/**
 */
package org.muml.ape;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.OCLFilter#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getOCLFilter()
 * @model
 * @generated
 */
public interface OCLFilter extends Filter {
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
	 * @see org.muml.ape.PropertiesPackage#getOCLFilter_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.muml.ape.OCLFilter#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // OCLFilter

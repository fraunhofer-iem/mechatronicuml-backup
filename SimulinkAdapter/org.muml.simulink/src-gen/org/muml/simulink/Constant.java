/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.Constant#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.simulink.Constant#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Block {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.muml.simulink.SimulinkPackage#getConstant_Value()
	 * @model default="1" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Constant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.simulink.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.simulink.DataType
	 * @see #setType(DataType)
	 * @see org.muml.simulink.SimulinkPackage#getConstant_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Constant#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.simulink.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Constant

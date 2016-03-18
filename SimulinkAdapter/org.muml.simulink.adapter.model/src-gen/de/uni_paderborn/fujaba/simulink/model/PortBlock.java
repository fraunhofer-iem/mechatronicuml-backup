/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.PortBlock#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.PortBlock#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.PortBlock#getInitialCondition <em>Initial Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getPortBlock()
 * @model
 * @generated
 */
public interface PortBlock extends Block {

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(String)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getPortBlock_Dimensions()
	 * @model
	 * @generated
	 */
	String getDimensions();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.PortBlock#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.simulink.model.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.simulink.model.DataType
	 * @see #setType(DataType)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getPortBlock_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.PortBlock#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.simulink.model.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Condition</em>' attribute.
	 * @see #setInitialCondition(String)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getPortBlock_InitialCondition()
	 * @model
	 * @generated
	 */
	String getInitialCondition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.PortBlock#getInitialCondition <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Condition</em>' attribute.
	 * @see #getInitialCondition()
	 * @generated
	 */
	void setInitialCondition(String value);

} // PortBlock

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.behavior.Parameter;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Op Data2sf Emb Func Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParameter <em>Sc Parameter</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getSfData <em>Sf Data</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParaType <em>Sc Para Type</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOpData2sfEmbFuncData()
 * @model
 * @generated
 */
public interface scOpData2sfEmbFuncData extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Parameter</em>' reference.
	 * @see #setScParameter(Parameter)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOpData2sfEmbFuncData_ScParameter()
	 * @model
	 * @generated
	 */
	Parameter getScParameter();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParameter <em>Sc Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Parameter</em>' reference.
	 * @see #getScParameter()
	 * @generated
	 */
	void setScParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Sf Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Data</em>' reference.
	 * @see #setSfData(Data)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOpData2sfEmbFuncData_SfData()
	 * @model
	 * @generated
	 */
	Data getSfData();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getSfData <em>Sf Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Data</em>' reference.
	 * @see #getSfData()
	 * @generated
	 */
	void setSfData(Data value);

	/**
	 * Returns the value of the '<em><b>Sc Para Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Para Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Para Type</em>' reference.
	 * @see #setScParaType(PrimitiveDataType)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOpData2sfEmbFuncData_ScParaType()
	 * @model
	 * @generated
	 */
	PrimitiveDataType getScParaType();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOpData2sfEmbFuncData#getScParaType <em>Sc Para Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Para Type</em>' reference.
	 * @see #getScParaType()
	 * @generated
	 */
	void setScParaType(PrimitiveDataType value);

} // scOpData2sfEmbFuncData

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Op Data2sf Emb Func Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scOpData2sfEmbFuncData#getScParameter <em>Sc Parameter</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scOpData2sfEmbFuncData#getSfData <em>Sf Data</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scOpData2sfEmbFuncData#getScParaType <em>Sc Para Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscOpData2sfEmbFuncData()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscOpData2sfEmbFuncData_ScParameter()
	 * @model
	 * @generated
	 */
	Parameter getScParameter();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scOpData2sfEmbFuncData#getScParameter <em>Sc Parameter</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscOpData2sfEmbFuncData_SfData()
	 * @model
	 * @generated
	 */
	Data getSfData();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scOpData2sfEmbFuncData#getSfData <em>Sf Data</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscOpData2sfEmbFuncData_ScParaType()
	 * @model
	 * @generated
	 */
	PrimitiveDataType getScParaType();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scOpData2sfEmbFuncData#getScParaType <em>Sc Para Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Para Type</em>' reference.
	 * @see #getScParaType()
	 * @generated
	 */
	void setScParaType(PrimitiveDataType value);

} // scOpData2sfEmbFuncData

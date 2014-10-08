/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Par2 MTD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.MT_Par2MTD#getMt <em>Mt</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.MT_Par2MTD#getPar <em>Par</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.MT_Par2MTD#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getMT_Par2MTD()
 * @model
 * @generated
 */
public interface MT_Par2MTD extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Mt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mt</em>' reference.
	 * @see #setMt(MessageType)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getMT_Par2MTD_Mt()
	 * @model
	 * @generated
	 */
	MessageType getMt();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.MT_Par2MTD#getMt <em>Mt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mt</em>' reference.
	 * @see #getMt()
	 * @generated
	 */
	void setMt(MessageType value);

	/**
	 * Returns the value of the '<em><b>Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par</em>' reference.
	 * @see #setPar(Parameter)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getMT_Par2MTD_Par()
	 * @model
	 * @generated
	 */
	Parameter getPar();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.MT_Par2MTD#getPar <em>Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par</em>' reference.
	 * @see #getPar()
	 * @generated
	 */
	void setPar(Parameter value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getMT_Par2MTD_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.MT_Par2MTD#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // MT_Par2MTD

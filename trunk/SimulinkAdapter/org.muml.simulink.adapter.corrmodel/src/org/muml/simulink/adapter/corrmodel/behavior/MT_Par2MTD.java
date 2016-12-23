/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.behavior.Parameter;
import org.muml.pim.msgtype.MessageType;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Par2 MTD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getMt <em>Mt</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getPar <em>Par</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getMT_Par2MTD()
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getMT_Par2MTD_Mt()
	 * @model
	 * @generated
	 */
	MessageType getMt();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getMt <em>Mt</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getMT_Par2MTD_Par()
	 * @model
	 * @generated
	 */
	Parameter getPar();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getPar <em>Par</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getMT_Par2MTD_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // MT_Par2MTD

/**
 */
package org.muml.psm.codegen;

import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.GenPortInstance#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.psm.codegen.GenPortInstance#getSamplingTime <em>Sampling Time</em>}</li>
 *   <li>{@link org.muml.psm.codegen.GenPortInstance#getExecCommand <em>Exec Command</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.codegen.CodegenPackage#getGenPortInstance()
 * @model
 * @generated
 */
public interface GenPortInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance</em>' reference.
	 * @see #setPortInstance(PortInstance)
	 * @see org.muml.psm.codegen.CodegenPackage#getGenPortInstance_PortInstance()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getPortInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.codegen.GenPortInstance#getPortInstance <em>Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Instance</em>' reference.
	 * @see #getPortInstance()
	 * @generated
	 */
	void setPortInstance(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Sampling Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Time</em>' reference.
	 * @see #setSamplingTime(TimeValue)
	 * @see org.muml.psm.codegen.CodegenPackage#getGenPortInstance_SamplingTime()
	 * @model
	 * @generated
	 */
	TimeValue getSamplingTime();

	/**
	 * Sets the value of the '{@link org.muml.psm.codegen.GenPortInstance#getSamplingTime <em>Sampling Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Time</em>' reference.
	 * @see #getSamplingTime()
	 * @generated
	 */
	void setSamplingTime(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Exec Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Command</em>' reference.
	 * @see #setExecCommand(Expression)
	 * @see org.muml.psm.codegen.CodegenPackage#getGenPortInstance_ExecCommand()
	 * @model
	 * @generated
	 */
	Expression getExecCommand();

	/**
	 * Sets the value of the '{@link org.muml.psm.codegen.GenPortInstance#getExecCommand <em>Exec Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec Command</em>' reference.
	 * @see #getExecCommand()
	 * @generated
	 */
	void setExecCommand(Expression value);

} // GenPortInstance

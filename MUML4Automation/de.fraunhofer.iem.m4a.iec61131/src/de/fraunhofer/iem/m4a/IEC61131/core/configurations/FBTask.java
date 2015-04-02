/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getWith <em>With</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getFunctionBlock <em>Function Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getFBTask()
 * @model
 * @generated
 */
public interface FBTask extends ProgConfElement {
	/**
	 * Returns the value of the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' reference.
	 * @see #setWith(TaskConfiguration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getFBTask_With()
	 * @model required="true"
	 * @generated
	 */
	TaskConfiguration getWith();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getWith <em>With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(TaskConfiguration value);

	/**
	 * Returns the value of the '<em><b>Function Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block</em>' reference.
	 * @see #setFunctionBlock(FunctionBlockDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getFBTask_FunctionBlock()
	 * @model required="true"
	 * @generated
	 */
	FunctionBlockDeclaration getFunctionBlock();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getFunctionBlock <em>Function Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Block</em>' reference.
	 * @see #getFunctionBlock()
	 * @generated
	 */
	void setFunctionBlock(FunctionBlockDeclaration value);

} // FBTask

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.simulink.Line;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Inst2 Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getAssemblyInst <em>Assembly Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAssemblyInst2Line()
 * @model
 * @generated
 */
public interface AssemblyInst2Line extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Assembly Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Inst</em>' reference.
	 * @see #setAssemblyInst(AssemblyConnectorInstance)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAssemblyInst2Line_AssemblyInst()
	 * @model
	 * @generated
	 */
	AssemblyConnectorInstance getAssemblyInst();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getAssemblyInst <em>Assembly Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Inst</em>' reference.
	 * @see #getAssemblyInst()
	 * @generated
	 */
	void setAssemblyInst(AssemblyConnectorInstance value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAssemblyInst2Line_Line()
	 * @model
	 * @generated
	 */
	EList<Line> getLine();

} // AssemblyInst2Line

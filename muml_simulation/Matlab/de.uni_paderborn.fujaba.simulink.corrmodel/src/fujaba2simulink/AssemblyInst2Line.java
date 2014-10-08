/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance;

import de.uni_paderborn.fujaba.simulink.model.Line;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Inst2 Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.AssemblyInst2Line#getAssemblyInst <em>Assembly Inst</em>}</li>
 *   <li>{@link fujaba2simulink.AssemblyInst2Line#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getAssemblyInst2Line()
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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAssemblyInst2Line_AssemblyInst()
	 * @model
	 * @generated
	 */
	AssemblyConnectorInstance getAssemblyInst();

	/**
	 * Sets the value of the '{@link fujaba2simulink.AssemblyInst2Line#getAssemblyInst <em>Assembly Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Inst</em>' reference.
	 * @see #getAssemblyInst()
	 * @generated
	 */
	void setAssemblyInst(AssemblyConnectorInstance value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAssemblyInst2Line_Line()
	 * @model
	 * @generated
	 */
	EList<Line> getLine();

} // AssemblyInst2Line

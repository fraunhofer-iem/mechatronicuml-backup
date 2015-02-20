/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance;
import de.uni_paderborn.fujaba.simulink.model.Line;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Del2 Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.Del2Line#getDelegationInstance <em>Delegation Instance</em>}</li>
 *   <li>{@link fujaba2simulink.Del2Line#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getDel2Line()
 * @model
 * @generated
 */
public interface Del2Line extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Delegation Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Instance</em>' reference.
	 * @see #setDelegationInstance(DelegationConnectorInstance)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getDel2Line_DelegationInstance()
	 * @model
	 * @generated
	 */
	DelegationConnectorInstance getDelegationInstance();

	/**
	 * Sets the value of the '{@link fujaba2simulink.Del2Line#getDelegationInstance <em>Delegation Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Instance</em>' reference.
	 * @see #getDelegationInstance()
	 * @generated
	 */
	void setDelegationInstance(DelegationConnectorInstance value);

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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getDel2Line_Line()
	 * @model
	 * @generated
	 */
	EList<Line> getLine();

} // Del2Line

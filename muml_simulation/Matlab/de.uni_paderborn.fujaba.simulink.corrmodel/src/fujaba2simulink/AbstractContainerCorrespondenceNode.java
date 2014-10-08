/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Container Correspondence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.AbstractContainerCorrespondenceNode#getChildCorresp <em>Child Corresp</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getAbstractContainerCorrespondenceNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractContainerCorrespondenceNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Corresp</b></em>' containment reference list.
	 * The list contents are of type {@link fujaba2simulink.AbstractContainerCorrespondenceNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Corresp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Corresp</em>' containment reference list.
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAbstractContainerCorrespondenceNode_ChildCorresp()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractContainerCorrespondenceNode> getChildCorresp();

} // AbstractContainerCorrespondenceNode

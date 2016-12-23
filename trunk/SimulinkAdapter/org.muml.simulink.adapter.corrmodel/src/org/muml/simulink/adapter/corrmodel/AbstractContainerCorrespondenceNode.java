/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Container Correspondence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode#getChildCorresp <em>Child Corresp</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAbstractContainerCorrespondenceNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractContainerCorrespondenceNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Corresp</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Corresp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Corresp</em>' containment reference list.
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAbstractContainerCorrespondenceNode_ChildCorresp()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractContainerCorrespondenceNode> getChildCorresp();

} // AbstractContainerCorrespondenceNode

/**
 */
package org.muml.mumlcore.modelinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RootNode is the single root element of the XMI file which is generated for
 * the FUJABA model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.mumlcore.modelinstance.RootNode#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see org.muml.mumlcore.modelinstance.ModelinstancePackage#getRootNode()
 * @model
 * @generated
 */
public interface RootNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.mumlcore.modelinstance.ModelElementCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element categories which are contained in this RootNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.muml.mumlcore.modelinstance.ModelinstancePackage#getRootNode_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElementCategory> getCategories();

} // RootNode

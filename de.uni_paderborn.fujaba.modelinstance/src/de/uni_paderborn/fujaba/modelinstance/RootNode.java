/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.modelinstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.modelinstance.RootNode#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.modelinstance.RootNode#getEcoreDataTypes <em>Ecore Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage#getRootNode()
 * @model
 * @generated
 */
public interface RootNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage#getRootNode_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Ecore Data Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Data Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage#getRootNode_EcoreDataTypes()
	 * @model
	 * @generated
	 */
	EList<EDataType> getEcoreDataTypes();

} // RootNode

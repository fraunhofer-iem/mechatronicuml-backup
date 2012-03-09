/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for composite types like Arrays that may be used for attributes, parameters, and operations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.CompositeDataType#getInnerDeclaration <em>Inner Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getCompositeDataType()
 * @model abstract="true"
 * @generated
 */
public interface CompositeDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Inner Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.InnerDeclaration}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.core.InnerDeclaration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Declaration</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getCompositeDataType_InnerDeclaration()
	 * @see de.uni_paderborn.fujaba.muml.model.core.InnerDeclaration#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<InnerDeclaration> getInnerDeclaration();

} // CompositeDataType

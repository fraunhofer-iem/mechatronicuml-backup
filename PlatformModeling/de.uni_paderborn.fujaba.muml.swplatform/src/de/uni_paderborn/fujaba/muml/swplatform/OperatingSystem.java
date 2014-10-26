/**
 */
package de.uni_paderborn.fujaba.muml.swplatform;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a software plattform. It is the root element for describing a software plattform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.OperatingSystem#getApirepositories <em>Apirepositories</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.OperatingSystem#getEnumerationDataTypes <em>Enumeration Data Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.OperatingSystem#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Apirepositories</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.swplatform.APIRepository}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.swplatform.APIRepository#getSwPlatform <em>Sw Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SWPlatform has an APIRepository. In this repository all api-commands of that platform are stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apirepositories</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getOperatingSystem_Apirepositories()
	 * @see de.uni_paderborn.fujaba.muml.swplatform.APIRepository#getSwPlatform
	 * @model opposite="swPlatform" containment="true"
	 * @generated
	 */
	EList<APIRepository> getApirepositories();

	/**
	 * Returns the value of the '<em><b>Enumeration Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SWPlatform can have several Enumerations. In this repository all api-commands of that platform are stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Data Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getOperatingSystem_EnumerationDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationDataType> getEnumerationDataTypes();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.swplatform.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getOperatingSystem_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // OperatingSystem

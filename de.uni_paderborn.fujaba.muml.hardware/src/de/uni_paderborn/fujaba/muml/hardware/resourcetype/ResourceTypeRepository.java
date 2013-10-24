/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a repository containing several resource types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository#getProtocols <em>Protocols</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getResourceTypeRepository()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueProtocolName='self.protocols->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueProtocolName'"
 * @generated
 */
public interface ResourceTypeRepository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceTypes that are contained in this ResourceTypeRepository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getResourceTypeRepository_ResourceTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceType> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationProtocols that belong to this ResourceTypeRepository.
	 * CommunicationProtocols are used to specify the protocol used by HWPort and CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getResourceTypeRepository_Protocols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CommunicationProtocol> getProtocols();

} // ResourceTypeRepository

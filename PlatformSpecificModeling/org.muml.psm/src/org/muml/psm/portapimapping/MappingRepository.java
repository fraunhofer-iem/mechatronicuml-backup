/**
 */
package org.muml.psm.portapimapping;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.NamedElement;
import org.muml.psm.Import;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class orders the mappings of a port. It is used to declare port mappings that assign api-commands to a conutinous port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.portapimapping.MappingRepository#getPortApiMappings <em>Port Api Mappings</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.MappingRepository#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.portapimapping.PortapimappingPackage#getMappingRepository()
 * @model
 * @generated
 */
public interface MappingRepository extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Port Api Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.portapimapping.PortApiMapping}.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.portapimapping.PortApiMapping#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mapping of a port, that assigns a api-command to a continuous port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Api Mappings</em>' containment reference list.
	 * @see org.muml.psm.portapimapping.PortapimappingPackage#getMappingRepository_PortApiMappings()
	 * @see org.muml.psm.portapimapping.PortApiMapping#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<PortApiMapping> getPortApiMappings();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.muml.psm.portapimapping.PortapimappingPackage#getMappingRepository_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // MappingRepository

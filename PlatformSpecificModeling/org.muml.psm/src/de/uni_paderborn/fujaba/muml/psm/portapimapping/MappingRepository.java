/**
 */
package de.uni_paderborn.fujaba.muml.psm.portapimapping;

import de.uni_paderborn.fujaba.muml.psm.Import;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.portapimapping.MappingRepository#getPortApiMappings <em>Port Api Mappings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.portapimapping.MappingRepository#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingPackage#getMappingRepository()
 * @model
 * @generated
 */
public interface MappingRepository extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Port Api Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.portapimapping.PortApiMapping}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.portapimapping.PortApiMapping#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mapping of a port, that assigns a api-command to a continuous port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Api Mappings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingPackage#getMappingRepository_PortApiMappings()
	 * @see de.uni_paderborn.fujaba.muml.psm.portapimapping.PortApiMapping#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<PortApiMapping> getPortApiMappings();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingPackage#getMappingRepository_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // MappingRepository
